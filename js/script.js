let signupBtn = document.getElementById("signupBtn");
let signinBtn = document.getElementById("signinBtn");
let title = document.getElementById("title");
let nameField = document.getElementById("nameField");
let mobNo = document.getElementById("mobNo");



signinBtn.onclick = function()
{
    
    location.replace("login_user.html");
}

signupBtn.onclick = function()
{

   location.replace("signup.html");
}
