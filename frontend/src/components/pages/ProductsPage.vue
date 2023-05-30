<template>
  <div class="flex flex-col w-2/3 m-auto">
    <p class="text-6xl font-bold text-neutral-700 mb-12">Весь асортимент тут</p>

    <div class="gap-4 m-auto flex flex-row mb-32 items-start align-top top-0">
      <div class="w-full grid grid-cols-2 gap-4 rounded-3x px-12">
        <div
          class="flex mx-12 w-auto items-center align-baseline justify-center flex-col gap-2"
        >
          <div
            class="w-full justify-center relative cursor-pointer flex p-4 group"
          >
            <img
              class="w-full block rounded-2xl"
              src="../../assets/pagesimages/finish.jpg"
              alt=""
            />

            <div
              class="absolute rounded-2xl backdrop-filter backdrop-blur-md inset-0 bg-neutral-800 m-4 bg-opacity-30 opacity-0 group-hover:opacity-100 transition duration-300 ease-in-out flex items-center justify-center"
            >
              <p
                class="text-white font-bold px-4 py-2 max-w-xs sm:max-w-sm md:max-w-md lg:max-w-lg xl:max-w-xl"
              >
                Короче тут буде просто опис і все
              </p>
            </div>
          </div>

          <div class="flex flex-col text-neutral-700">
            <router-link
              :to="{ name: 'ProductPage' }"
              class="duration-300 hover:text-neutral-500 break-word font-bold text-4xl text-neutral-700"
            >
              Finish 3 упаковки XL Pack
            </router-link>
            <p class="mt-2 text-4xl text-blue-500 font-bold">399₴</p>
            <div class="group cursor-pointer">
              <p
                class="group-hover:text-emerald-800 my-2 duration-300 font-bold text-emerald-600 rounded-xl"
              >
                Миючі засоби
              </p>
            </div>
          </div>
          <div class="flex flex-col w-full m-auto justify-center">
            <div
              class="mb-4 justify-center gap-4 group routerlink flex flex-row items-center cursor-pointer"
            >
              <button class="">Додати в кошик</button>
              <img
                class="w-10 h-10 group-hover:bg-neutral-700 p-2 rounded-lg transition duration-300"
                src="../../assets/icons/basket.png"
                alt=""
              />
            </div>
            <div class="flex flex-row justify-evenly">
              <img class="h-4" src="../../assets/paysystems/apay.png" alt="" />
              <img class="h-4" src="../../assets/paysystems/gpay.png" alt="" />
              <img class="h-4" src="../../assets/paysystems/mr.png" alt="" />
              <img
                class="h-4"
                src="../../assets/paysystems/paypal.png"
                alt=""
              />
              <img class="h-4" src="../../assets/paysystems/visa.png" alt="" />
            </div>
          </div>
        </div>
      </div>

      <div
        class="flex flex-col top-0 w-1/3 justify-start align-top border-emerald-400 p-12 border-2 rounded-3xl bg-white bg-opacity-70 backdrop-filter backdrop-blur-lg"
      >
        <label class="text-sm text-gray-400" for=""
          >Знайдіть товар який вам потрібно</label
        >
        <div class="flex flex-row">
          <input
            class="w-full rounded-r-none border-r-0 px-4 py-4 border-2 border-emerald-500 rounded-xl shadow-2xl transition-colors duration-300 ease-in-out focus:outline-none focus:border-transparent"
            type="text"
          />
          <button class="routerlink w-32 rounded-l-none">Пошук</button>
        </div>
        <div class="my-4 w-full justify-center flex flex-col">
          <label class="text-sm text-gray-400" for=""
            >Вибір бажаної категорії</label
          >
          <select
            name=""
            id=""
            class="h-12 rounded-xl font-medium cursor-pointer border-2 border-emerald-500"
          >
            <option value="">Миючі засоби</option>
          </select>
        </div>
        <div class="flex flex-row justify-evenly pt-6">
          <div class="w-full">
            <VueSlider
              v-model="maxprice"
              :min="0"
              :max="15000"
              :tooltip="'always'"
            />
            <div class="text-center font-medium text-lg mb-2">
              Ціна до: {{ maxprice }} грн
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  {{ product }}
</template>

<script>
import VueSlider from "vue-slider-component";
import "vue-slider-component/theme/default.css";

export default {
  data() {
    return {
      maxprice: 1500,
    };
  },
  components: {
    VueSlider,
  },
};
</script>
