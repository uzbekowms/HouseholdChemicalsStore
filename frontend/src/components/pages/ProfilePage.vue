<template>
    <div class="flex flex-col w-2/3 m-auto">
        <div class="flex flex-row justify-between bg-white p-6
        bg-opacity-70  backdrop-filter backdrop-blur-lg rounded-3xl mb-12 ">
            <div class="m-auto w-2/3 flex flex-col gap-2 ">
            <p class="text-6xl font-bold text-neutral-700">
                Привіт, { { user.name } }
            </p>
            <p class="text-3xl font-medium text-neutral-700">
                Ваш кошик виглядає наступним чином:
            </p>
        </div>
        <div class="flex flex-col items-center justify-around gap-4 m-4 border-l-4 pl-4 border-neutral-700">
            <router-link :to="{name: 'UserEdit'}" class="routerlink cursor-pointer bg-emerald-500 border-emerald-500 hover:border-emerald-500 hover:text-emerald-500">Редагувати профіль</router-link>
            <router-link :to="{name: 'Login'}" class="routerlink cursor-pointer bg-red-500 border-red-500 hover:border-red-500 hover:text-red-500">Вийти з аккаунту</router-link>
        </div>
        </div>

    <div class="gap-4 w-auto m-auto flex flex-row mb-32 items-start align-top top-0">
        <div class="mx-12 w-auto justify-evenly pt-12 flex-col gap-4 border-emerald-400 border-2 rounded-3xl  bg-white
        bg-opacity-70  backdrop-filter backdrop-blur-lg p-4">

        <div class="flex w-auto flex-row p-4 gap-12 border-b-2 border-emerald-400">
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
        <div class="flex flex-row gap-4 items-center font-bold text-neutral-700 text-6xl">
            <h2 class=""> <span class="text-3xl">x</span>2</h2>
            <div class="flex gap-2 flex-col justify-center items-center text-4xl">
                <p class="text-emerald-500 hover:bg-emerald-500 rounded-full p-2 duration-300 cursor-pointer hover:text-white">+</p>
                <p class="text-red-500 hover:bg-red-500 rounded-full p-2 duration-300 cursor-pointer hover:text-white">-</p>
            </div>
        </div>
        </div>
<div class="flex flex-row p-4 gap-12 border-b-2 border-emerald-400">
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
        <div class="flex flex-row gap-4 items-center font-bold text-neutral-700 text-6xl">
            <h2 class=""> <span class="text-3xl">x</span>2</h2>
            <div class="flex gap-2 flex-col justify-center items-center text-4xl">
                <p class="text-emerald-500 hover:bg-emerald-500 rounded-full p-2 duration-300 cursor-pointer hover:text-white">+</p>
                <p class="text-red-500 hover:bg-red-500 rounded-full p-2 duration-300 cursor-pointer hover:text-white">-</p>
            </div>
        </div>
        </div>
    </div>

    <div class="flex flex-col top-0 w-1/3 justify-start align-top border-emerald-400 p-12 border-2 rounded-3xl  bg-white
        bg-opacity-70  backdrop-filter backdrop-blur-lg">
                <div class="py-4 my-4 justify-center gap-4 group routerlink flex flex-row items-center cursor-pointer">
                        <button class="">ОПЛАТИТИ</button>
                        <img class="w-10 h-10 group-hover:bg-neutral-700 p-2 rounded-lg transition duration-300" src="../../assets/icons/basket.png" alt="">
                    </div>
                <div class="flex flex-row justify-evenly">
                    <img class="h-4" src="../../assets/paysystems/apay.png" alt="">
                    <img class="h-4" src="../../assets/paysystems/gpay.png" alt="">
                    <img class="h-4" src="../../assets/paysystems/mr.png" alt="">
                    <img class="h-4" src="../../assets/paysystems/paypal.png" alt="">
                    <img class="h-4" src="../../assets/paysystems/visa.png" alt="">
                </div>
            </div>
    </div>
    <div><h2 class="font-bold text-2xl text-neutral-700">Історія замовлень</h2></div>
    <div class="flex flex-row gap-24 mb-48">
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
            <div class="flex flex-col gap-4 items-center font-bold text-neutral-700 text-6xl p-4 rounded-xl">
                <p class="text-lg">Кількість</p>
            <h2 class=""> <span class="text-3xl">x</span>2</h2>
        </div>
        </div>
    </div>
</template>
