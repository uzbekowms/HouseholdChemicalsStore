import $ from 'jquery';

$(document).on('mousemove', function (event) {
    // Отримання позиції курсора
    const mouseX = event.pageX;
    const mouseY = event.pageY;

    // Розрахунок значення паралаксу для фонового зображення
    const offsetX = -(mouseX / $(window).width() - 0.5) * 30;
    let offsetY = -(mouseY / $(window).height() - 0.5) * 30;

    // Застосування паралаксу до фонового зображення
    $('body').css('background-position', `${offsetX}px ${offsetY}px`);
});
