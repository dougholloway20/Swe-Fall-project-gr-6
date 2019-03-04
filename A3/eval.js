//question input
var question1 = document.getElementById("q1");


//choice input
var q1c1 = document.getElementById("q1choice1");
var q1c2 = document.getElementById("q1choice2");
var q1c3 = document.getElementById("q1choice3");
var q1c4 = document.getElementById("q1choice4");
//displays
var q1Display = document.querySelector("#mcq1");
var q1c1Display = document.querySelector("#displayc1");
var q1c2Display = document.querySelector("#displayc2");
var q1c3Display = document.querySelector("#displayc3");
var q1c4Display = document.querySelector("#displayc4");



var generate = document.querySelector("#generate");

generate.addEventListener("click", function(){
    q1Display.textContent = question1.value;

    q1c1.setAttribute("type", "radio");
    q1c1Display.textContent = q1c1.value

    q1c2.setAttribute("type", "radio");
    q1c2Display.textContent = q1c2.value

    q1c3.setAttribute("type", "radio");
    q1c3Display.textContent = q1c3.value

    q1c4.setAttribute("type", "radio");
    q1c4Display.textContent = q1c4.value




})
