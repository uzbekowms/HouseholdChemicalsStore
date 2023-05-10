<template>
<div class="top-0 left-1/2 -translate-x-1/2 fixed bg-white items-center bg-opacity-70 py-8 justify-evenly flex w-2/3 m-auto rounded-b-3xl backdrop-filter backdrop-blur-lg">
        <div class="gap-4 flex flex-row text-lg">
            <router-link class="link" :to="{name: 'Home'}">Головна</router-link>
            <router-link class="link" :to="{name: 'Products'}">Магазин</router-link>
            <router-link class="link" :to="{name: 'Admin'}">ADMIN</router-link>
        </div>
        <div class="flex">
            LOGO
        </div>
        <div class="flex flex-row gap-4">
            <div class="group cursor-pointer flex items-center gap-4 routerlink">
                <router-link class="" :to="{name: 'Login'}">Власний аккаунт</router-link>
                <img class="w-10 h-10 group-hover:bg-neutral-700 p-2 rounded-lg transition duration-300" :src="userIcon" alt="">
            </div>
        </div>
</div>
</template>
<style>
</style>
<script>
import userIcon from "@/assets/icons/userprofile.png";

export default {
    data(){
        return{
            userIcon,
        }
    },
  props: {
  },

};
</script>
