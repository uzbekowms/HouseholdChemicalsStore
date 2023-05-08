<template>
    <div class="relative">
        <HeaderComponent/>
        <div class="mt-32">
            <RouterView/>
        </div>
    </div>
</template>

<script setup>
</script>


<script>
import HeaderComponent from './HeaderComponent.vue'
export default {
  name: 'App',
  components: {
    HeaderComponent
  }
}
</script>
