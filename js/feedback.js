let rating1 = document.getElementById("rating1");
let rating2 = document.getElementById("rating2");
let rating3 = document.getElementById("rating3");
let rating4 = document.getElementById("rating4");
let rating5 = document.getElementById("rating5");

let icon1 = document.getElementById("icon1");
let icon2 = document.getElementById("icon2");
let icon3 = document.getElementById("icon3");
let icon4 = document.getElementById("icon4");
let icon5 = document.getElementById("icon5");

function iconClicked() {
  if (rating1.checked) 
  {
    icon1.classList.add("icon-clicked");
    icon1.classList.remove("icon");

    icon2.classList.remove("icon-clicked");
    icon3.classList.remove("icon-clicked");
    icon4.classList.remove("icon-clicked");
    icon5.classList.remove("icon-clicked");

    icon2.classList.add("icon");
    icon3.classList.add("icon");
    icon4.classList.add("icon");
    icon5.classList.add("icon");

  } 
  else if (rating2.checked) 
  {
    icon2.classList.add("icon-clicked");
    icon2.classList.remove("icon");

    icon1.classList.remove("icon-clicked");
    icon3.classList.remove("icon-clicked");
    icon4.classList.remove("icon-clicked");
    icon5.classList.remove("icon-clicked");

    icon1.classList.add("icon");
    icon3.classList.add("icon");
    icon4.classList.add("icon");
    icon5.classList.add("icon");

  } 
  else if (rating3.checked) 
  {
    icon3.classList.add("icon-clicked");
    icon3.classList.remove("icon");

    icon2.classList.remove("icon-clicked");
    icon1.classList.remove("icon-clicked");
    icon4.classList.remove("icon-clicked");
    icon5.classList.remove("icon-clicked");

    icon2.classList.add("icon");
    icon1.classList.add("icon");
    icon4.classList.add("icon");
    icon5.classList.add("icon");
  }
   else if (rating4.checked)
  {
    icon4.classList.add("icon-clicked");
    icon4.classList.remove("icon");

    icon2.classList.remove("icon-clicked");
    icon3.classList.remove("icon-clicked");
    icon1.classList.remove("icon-clicked");
    icon5.classList.remove("icon-clicked");

    icon2.classList.add("icon");
    icon3.classList.add("icon");
    icon1.classList.add("icon");
    icon5.classList.add("icon");
  } 
  else if (rating5.checked)
  {
    icon5.classList.add("icon-clicked");
    icon5.classList.remove("icon");

    icon2.classList.remove("icon-clicked");
    icon3.classList.remove("icon-clicked");
    icon4.classList.remove("icon-clicked");
    icon1.classList.remove("icon-clicked");

    icon2.classList.add("icon");
    icon3.classList.add("icon");
    icon4.classList.add("icon");
    icon1.classList.add("icon");
  }
}


rating1.addEventListener("change", iconClicked);
rating2.addEventListener("change", iconClicked);
rating3.addEventListener("change", iconClicked);
rating4.addEventListener("change", iconClicked);
rating5.addEventListener("change", iconClicked);

// //form validation
// let uname= document.getElementById("uname").value;
// let email= document.getElementById("email").value
// let feedback= document.getElementById("feedback").value

// let regName = /^[a-z A-z]*$/ 
// let regfb = /^[a-z A-z 0-9 .,?:;"']{0,100}$/ 
// let regmail= /^([a-zA-Z0-9 . ])+@+([a-z])+([.])+([a-z])+$/

// if(regName.test(uname) && regfb.test(feedback) && regmail.test(email))
// {
//   alert("Thanks for the feed!! hope you had better experience with Blume");
// }
// else if(!regName.test(uname))
//   {
//     alert("Enter proper Username!");
//   }
// else if(!regfb.test(feedback))
//   {
//     alert("feedback should be atleast 10 characters or at max 100 characters");
//   }
// else if(!regmail.test(email))
//   { 
//     alert("Please enter valid Email ID !");
//   }
