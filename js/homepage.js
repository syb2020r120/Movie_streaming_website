// card sliders

// trending section
let cardContainer = document.getElementById("card-container");
let prevBtn = document.getElementById("prev_btn");
let nxtBtn = document.getElementById("nxt_btn");

let containerDimensions = cardContainer.getBoundingClientRect();
let containerWidth = containerDimensions.width;


nxtBtn.addEventListener('click',()=>
{
    cardContainer.scrollLeft += containerWidth-200;    
});

prevBtn.addEventListener('click',()=>
{
    cardContainer.scrollLeft -= containerWidth+200;
});


// recommended section
let card_Container = document.getElementById("card_container");
let prev_Btn = document.getElementById("prev-btn");
let nxt_Btn = document.getElementById("nxt-btn");

let container_Dimensions = card_Container.getBoundingClientRect();
let container_Width = containerDimensions.width;



nxt_Btn.addEventListener('click',()=>
{
    card_Container.scrollLeft += container_Width-200;    
});

prev_Btn.addEventListener('click',()=>
{
    card_Container.scrollLeft -= container_Width+200;
});


// web series section

let card__Container = document.getElementById("card__container");
let prev__Btn = document.getElementById("prevbtn");
let nxt__Btn = document.getElementById("nxtbtn");

let container__Dimensions = card__Container.getBoundingClientRect();
let container__Width = containerDimensions.width;


nxt__Btn.addEventListener('click',()=>
{
    card__Container.scrollLeft += container__Width-200;    
});

prev__Btn.addEventListener('click',()=>
{
    card__Container.scrollLeft -= container__Width+200;
});
