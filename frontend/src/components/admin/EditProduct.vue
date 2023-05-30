<template>
    <h1 class="text-4xl my-12 font-bold text-neutral-600 text-center">Редагування продукту</h1>

    <div class="flex flex-col m-auto justify-center w-2/3">
        <div class="w-2/3 gap-4 border-2 border-white bg-white rounded-3xl
        m-auto flex flex-col bg-opacity-70 justify-evenly backdrop-filter
        backdrop-blur-lg">
        <div class="grow flex flex-col text-center justify-center">
    <div class="text-left">
        <form @submit.prevent="">
        <div class="flex flex-col rounded-2xl">
          <div class="flex flex-col m-4 p-4 gap-2 rounded-2xl">
            <h3 class="text-neutral-700 font-bold text-2xl">
              Назва продукту
            </h3>
            <label class="text-neutral-500 text-sm"
              >Для зручного орієнтування</label
            >
            <input
        class="w-full px-4 py-4 border-2 border-emerald-500 rounded-xl shadow-2xl transition-colors duration-300 ease-in-out focus:outline-none focus:border-transparent"
              type="text"
            />
            <h3 class="text-neutral-700 font-bold text-2xl">Опис</h3>
            <label class="text-neutral-500 text-sm"
              >Короткий лаконічний опис</label
            >

            <input
        class="w-full px-4 py-4 border-2 border-emerald-500 rounded-xl shadow-2xl transition-colors duration-300 ease-in-out focus:outline-none focus:border-transparent"
              type="password"
            />
            <div class="w-full justify-center flex flex-col">
                <h3 class="py-2 text-neutral-700 font-bold text-2xl">Категорія</h3>
        <label class="pb-2 text-sm text-gray-400" for="">Вибір бажаної категорії</label>
            <select name="" id="" class="h-16 rounded-xl font-medium cursor-pointer border-2 shadow-xl border-emerald-500">
                <option value="">Миючі засоби</option>
            </select>
        </div>

        <h3 class="text-neutral-700 font-bold text-2xl">
              Фото
            </h3>
            <label class="text-neutral-500 text-sm"
              >Вдалі фото продукту </label
            >
            <input
        class="w-full px-4 py-4 border-2 border-emerald-500 rounded-xl shadow-2xl transition-colors duration-300 ease-in-out focus:outline-none focus:border-transparent"
              type="file"
            />

            <div class="items-center gap-4 mt-12 flex justify-center">
              <button
                type="submit"
              >
                <router-link :to="{name: 'Profile'}"
                  class="routerlink m-4 p-4 bg-emerald-600 border-emerald-600 hover:border-emerald-600 hover:text-emerald-600 font-bold"
                >
                  Оновити
                </router-link>
              </button>
            </div>
          </div>
        </div>
      </form>
    </div>
        </div>
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
