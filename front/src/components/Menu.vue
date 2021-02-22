<template>
<div>
   <v-container class="lighten-5">
      <v-row v-for="j in justify"
      :key="j"
      :justify="j">
<v-col cols="3">
  <v-card
    class="mx-auto"
    width="300"
    height="100%"
  >
    <v-list>
      <v-list-group
        :value="true"
      >
      <template v-slot:activator>
          
          </template>

          <v-list-item
            v-for="([title, icon], i) in cruds"
            :key="i"
            link
          >
            <v-list-item-title v-text="title"></v-list-item-title>

            <v-list-item-icon>
              <v-icon v-text="icon"></v-icon>
            </v-list-item-icon>
          </v-list-item>

        <template v-slot:activator>
          <v-list-item-title>Produto</v-list-item-title>
        </template>

      </v-list-group>
    </v-list>
  </v-card>
</v-col>
<v-col cols="6">
  <v-card ref="form">
        <v-card-text>
          <v-text-field
            ref="name"
            v-model="name"
            :rules="[v => !!v || 'Nome do Produto é obrigatório',
        v => (v && v.length <= 30) || 'Nome do Produto tem que ter menos de 30 caracteres']"
            :error-messages="errorMessages"
            label="Nome do Produto"
            required
          ></v-text-field>
          <v-text-field
            ref="address"
            v-model="address"
            :rules="[
              v => !!v || 'Preço é obrigatório',
        v => (v>0.00) || 'Preço tem que ser maior que zero',
            ]"
            label="Preço"
            counter="25"
            required
          ></v-text-field>
          <v-text-field
            ref="city"
            v-model="city"
            :rules="[v => !!v || 'Quantidade é obrigatório',
        v => (v>=0.00) || 'Quantidade tem que ser maior ou igual a zero',]"
            label="Quantidade"
            required
          ></v-text-field>
          <v-text-field
            ref="state"
            v-model="state"
            label="Unidade de Medida"
          ></v-text-field>
          <v-text-field
            ref="zip"
            v-model="zip"
            :rules="[ v => this.city*this.address]"
            label="Valor Total"
            required
          ></v-text-field>
        </v-card-text>
        <v-divider class="mt-12"></v-divider>
        <v-card-actions>
          <v-btn text>
            Cancelar
          </v-btn>
          <v-spacer></v-spacer>
          <v-slide-x-reverse-transition>
            <v-tooltip
              v-if="formHasErrors"
              left
            >
              <template v-slot:activator="{ on, attrs }">
                <v-btn
                  icon
                  class="my-0"
                  v-bind="attrs"
                  @click="resetForm"
                  v-on="on"
                >
                  <v-icon>mdi-refresh</v-icon>
                </v-btn>
              </template>
              <span>Refresh form</span>
            </v-tooltip>
          </v-slide-x-reverse-transition>
          <v-btn
            color="primary"
            text
            @click="addProduto"
          >
            Adicionar
          </v-btn>
        </v-card-actions>
      </v-card>
  </v-col>
      </v-row>
   </v-container>
  </div>
</template>

<script>
import axios from 'axios';

  export default {
    name: 'Menu',

    data: () => ({
      newProduto: '',
      cruds: [
        ['Adicionar', 'mdi-plus-outline'],
        ['Ler', 'mdi-file-outline'],
        ['Editar', 'mdi-update'],
        ['Deletar', 'mdi-delete'],
        ['Movimentação de Entrada', 'mdi-cash-multiple'],
        ['Movimentação de Saída', 'mdi-cash-multiple'],
        ['Reajuste de Preços', 'mdi-account-cash'],
        ['Relatório de Lista de Preços', 'mdi-file-document'],
        ['Relatório de Balanço Físico', 'mdi-file-document'],
        
      ],
      errorMessages: '',
      name: null,
      address: null,
      city: null,
      state: null,
      zip: null,
      country: null,
      formHasErrors: false,
      justify: [
        'center',
        ],
          produtos: [],
          submit: false,
      
    }),
    computed: {
      form () {
        return {
          nomeDoProduto: this.newProduto,
          precoUnitario: this.precoUnitario,
          unidadeDeMedida: this.unidadeDeMedida,
          quantidadeEmEstoque: this.quantidadeEmEstoque,
        }
      },
    },

    watch: {
      name () {
        this.errorMessages = ''
      },
    },
    methods: {
      addProduto(){
        axios.post('http://localhost/api/produto',{
        nomeDoProduto: this.newProduto,
        precoUnitario: this.precoUnitario,
        unidadeDeMedida: this.unidadeDeMedida,
        quantidadeEmEstoque: this.quantidadeEmEstoque,
      })
       .then((response) => {
          const data = response.data;
          this.produtos.push(data);
          this.newProduto = '';
        });
      }
    },
  }
</script>