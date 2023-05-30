<template>
  <!--<img alt="Vue logo" src="./assets/logo.png">-->
  <div class="parallax m-auto justify-center">
    <img src="" data-type="background" v-parallax>
  </div>

  <MainLayout/>
</template>

<script>

import parallax from './parallax.js';
import MainLayout from './components/pageelements/MainLayout.vue'

export default {
  name: 'App',
  components: {
    MainLayout
  },
  directives: {
    'parallax': parallax
  }
}
</script>

<style>
  body {
        background-color: #F4F1ED;/*
        background-size: 30%;
        background-position: center;
        background-image: url("../src/assets/pagesimages/leaves.png");
        background-repeat:repeat;*/
    }
</style>
