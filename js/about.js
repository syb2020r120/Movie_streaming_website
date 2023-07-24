let text1 = "<span class= 'font-effect-neon'>Welcome To Blume!!</span><br> Here You Can Watch Your favourite Movies and Web Series!"
let text2 = "Blume stands out as a game-changing video streaming OTT platform!"
let text3 = "Extensive content library, personalized recommendations, user-friendly interface, and social engagement features"
let text4 = "We belive in providing best streaming services to our users"
let text5 = "<span class= 'font-effect-fire'>Hope You Will Enjoy!!</span>"

let array = [text1,text2,text3,text4,text5];
let desc= document.getElementById("desc");

let Curr_Index = 0

function updateText()
{
    desc.innerHTML=array[Curr_Index];
}
function fun1()         //next button
{
    Curr_Index = Curr_Index+1;
    if(Curr_Index >= array.length)
    {
        Curr_Index =0;
    }
    updateText()
}
function fun2()         //prev button
{
    Curr_Index--;
    if(Curr_Index<0)
    {
        Curr_Index =array.length-1;
    }
    updateText()
}
updateText();