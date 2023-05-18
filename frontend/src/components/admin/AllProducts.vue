<template>
    <div class="flex flex-row justify-between bg-white p-6
        bg-opacity-70 backdrop-filter backdrop-blur-lg rounded-3xl mb-12 ">
            <div class="flex w-auto flex-row p-4 gap-24 border-emerald-400">
                <div>
                    <img class="m-4 h-32 rounded-3xl" src="../../assets/pagesimages/finish.jpg" alt="">
                </div>

                <div class="flex flex-col text-neutral-700">
                    <router-link :to="{name: 'ProductPage'}" class="duration-300 hover:text-neutral-500 break-word font-bold text-4xl text-neutral-700">
                        Finish 3 упаковки XL Pack
                    </router-link>

                    <p class="mt-2 text-2xl text-blue-500 font-bold">
                        399₴
                    </p>

                    <div class="group cursor-pointer">
                        <p class="group-hover:text-emerald-800 duration-300 font-bold text-emerald-400 py-4 rounded-xl">
                        Миючі засоби
                        </p>
                    </div>
                </div>
            </div>
            <div class="flex flex-col items-center justify-around gap-4 m-4 border-l-4 pl-4 border-neutral-700">
                <router-link :to="{name: 'EditProduct'}" class="routerlink cursor-pointer bg-emerald-500 hover:border-emerald-500 border-emerald-500 hover:text-emerald-500">Редагувати продукт</router-link>
                <router-link :to="{name: 'Login'}" class="routerlink cursor-pointer bg-red-500 border-red-500 hover:border-red-500 hover:text-red-500">Видалити з бази даних</router-link>
            </div>
        </div>
</template>

<script setup>

import { onMounted } from "vue";

import restProduct from "../../composables/product";

const { getProducts } = restProduct()

onMounted(() => {
    getProducts()
});

</script>
