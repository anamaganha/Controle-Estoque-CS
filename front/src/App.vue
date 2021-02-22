<template>
  <v-app class="body">
    <v-app-bar
      app
      color="primary"
      dark
    >
      <div class="d-flex align-center">
        <h2>Controle de Estoque</h2>
      </div>

      <v-spacer></v-spacer>
    </v-app-bar>
   
        <v-main>
          <Menu />
       </v-main>
  </v-app>
</template>

<script src="https://cdn.jsdelivr.net/npm/vue@2.5.17/dist/vue.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/axios/0.18.0/axios.js"></script>

<script>



import Menu from './components/Menu';

export default {
  name: 'App',

  components: {
    Menu,
  },

  data: () => ({
    //
  }),
};
</script>


