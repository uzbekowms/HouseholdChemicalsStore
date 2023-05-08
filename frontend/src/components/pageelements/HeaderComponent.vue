<template>
<div class="top-0 left-1/2 -translate-x-1/2 fixed bg-white items-center bg-opacity-70 py-8 justify-evenly flex w-2/3 m-auto rounded-b-3xl backdrop-filter backdrop-blur-sm">
        <div class="gap-4 flex flex-row text-lg">
            <router-link class="link" :to="{name: 'Home'}">Магазин</router-link>
            <router-link class="link" :to="{name: 'Home'}">Замовлення</router-link>
        </div>
        <div class="flex">
            LOGO
        </div>
        <div class="flex">
            <router-link class="routerlink" :to="{name: 'Home'}">Власний аккаунт</router-link>
        </div>
</div>
</template>
