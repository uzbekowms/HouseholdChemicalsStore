<template>
    <div class="">
        <div class=" top-0 my-12 flex items-center justify-center m-auto gap-4">
        <div class="p-4">
            <h1 class="break-word font-bold text-4xl text-neutral-700 [text-shadow:_0_0px_20px_rgb(256_256_256_/_100%)]">
                Інтернет-магазин
                <br><span class="text-6xl font-black text-emerald-700">побутової хімії</span>
                <br>повного циклу замовлення
            </h1>
        </div>
        <div>
            <img class="m-4 h-72 rounded-3xl" src="../../assets/pagesimages/mainimage.jpg" alt="">
        </div>
    </div>


    <div class="w-2/3 gap-4 border-2 border-white bg-white rounded-3xl m-auto flex flex-col mb-32 bg-opacity-70 justify-evenly backdrop-filter backdrop-blur-lg">
        <div class="flex justify-evenly pt-12 flex-row gap-4">

        <div class="relative cursor-pointer flex group">
            <img class="m-4 h-96 rounded-3xl" src="../../assets/pagesimages/finish.jpg" alt="">
            <div class="absolute rounded-3xl backdrop-filter backdrop-blur-md inset-0 bg-neutral-800 m-4 bg-opacity-30 opacity-0 group-hover:opacity-100 transition duration-300 ease-in-out flex items-center justify-center">
                    <p class="text-white font-bold px-4 py-2 max-w-xs sm:max-w-sm md:max-w-md lg:max-w-lg xl:max-w-xl">
                      Короче тут буде просто опис і все
                    </p>
                </div>
        </div>
        <div class="flex flex-col text-neutral-700">
            <div class="backdrop-filter backdrop-blur-xl group cursor-pointer absolute left-0 ml-56 routerlink">
                <p class="group-hover:text-emerald-800 font-bold text-emerald-400 p-2 rounded-xl">
                    Миючі засоби
                </p>
            </div>

            <router-link :to="{name: 'ProductPage'}" class="duration-300 hover:text-neutral-500 break-word font-bold text-4xl text-neutral-700">
                Finish 3 упаковки<br>XL Pack
            </router-link>
            <p class="mt-2 text-xl font-bold">
                399₴
                <span class="text-red-400">
                    замість 510₴
                </span>
            </p>
            <p class="mt-2 text-md">
                Чудовий набір для великої сім'ї
            </p>
            <p class="mt-2 text-md">
                Економія цілих 22% з нашою системою<br>знижок
            </p>

            <div class="flex flex-col w-full m-auto justify-center">
                <div class="py-4 my-4 justify-center gap-4 group routerlink flex flex-row items-center cursor-pointer">
                        <button class="">Додати в кошик</button>
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
    </div>
    <div class="my-12 w-full rounded-3xl m-auto flex justify-evenly flex-row-reverse gap-4">
         <div class="relative cursor-pointer flex group">
            <img class="m-4 h-96 rounded-3xl" src="../../assets/pagesimages/finish.jpg" alt="">
            <div class="absolute rounded-3xl backdrop-filter backdrop-blur-md inset-0 bg-neutral-800 m-4 bg-opacity-30 opacity-0 group-hover:opacity-100 transition duration-300 ease-in-out flex items-center justify-center">
                    <p class="text-white font-bold px-4 py-2 max-w-xs sm:max-w-sm md:max-w-md lg:max-w-lg xl:max-w-xl">
                      Короче тут буде просто опис і все
                    </p>
                </div>
        </div>
        <div class="flex flex-col text-neutral-700">
            <div class="backdrop-filter backdrop-blur-xl group cursor-pointer absolute right-0 mr-56 routerlink">
                <p class="group-hover:text-emerald-800 font-bold text-emerald-400 p-2 rounded-xl">
                    Миючі засоби
                </p>
            </div>
            <h2 class="break-word font-bold text-4xl text-neutral-700">
                Finish 3 упаковки<br>XL Pack
            </h2>
            <p class="mt-2 text-xl font-bold">
                399₴
                <span class="text-red-400">
                    замість 510₴
                </span>
            </p>
            <p class="mt-2 text-md">
                Чудовий набір для великої сім'ї
            </p>
            <p class="mt-2 text-md">
                Економія цілих 22% з нашою системою<br>знижок
            </p>

            <div class="flex flex-col w-full m-auto justify-center">
                <div class="py-4 my-4 justify-center gap-4 group routerlink flex flex-row items-center cursor-pointer">
                        <button class="">Додати в кошик</button>
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
    </div>
    </div>
    </div>
</template>
