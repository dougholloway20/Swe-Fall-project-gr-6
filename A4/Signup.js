//check for required fields
function validateForm(){
    var frm = document.forms["Sign-up"];
    var i;
    var req = true;
    for (i=0; i<frm.length; i++){
        if(frm.elements[i].value==""){
            frm.elements[i].style.border="2px solid red";
            req = false;
        }
    }
    if(!req){
        document.getElementById("missing").innerHTML = "Missing Required Fields!";
    }
    return req;
}

//check if email and confirm email match
function matchEmail(){
    var eml = document.getElementById("email");
    var ceml = document.getElementById("cemail");
    if(eml.value!=ceml.value){
        document.getElementById("emlMch").innerHTML = "Emails do not match!";
    }
}

//check for password format
function formatPassword(){
    var password = document.getElementById("password");
    var pwd = /^[A-Z0-9]{6,30}$/i;
    if(!pwd.test(password.value)){
        document.getElementById("pwdFrmt").innerHTML = "Incorrect Password Format!";
    }
}
//check of password and confirm password match
function matchPassword(){
    var pwd = document.getElementById("password");
    var cpwd = document.getElementById("cpassword");
    if(pwd.value!=cpwd.value){
        document.getElementById("pwdMch").innerHTML = "Passwords do not match!";
    }
}