
var numberOfRating;
var numberOfShortAnswer;
var rdivArr = [];
var sadivArr = [];
var qDisplay = [];
var saInput = document.getElementById("saInput1");
var totalScore;



function generateForm(){
  for(i = 0; i < numberOfRating; i++){
    qDisplay[i] = document.getElementById("q"+i+"");
    qDisplay[i].textContent = document.getElementById("qValue"+i).value;
  }
  for(i = 0; i < numberOfShortAnswer; i++){
    qDisplay[i] = document.getElementById("saq"+i+"");
    qDisplay[i].textContent = document.getElementById("saqValue"+i).value;
  }
  alert(saInput);
}

function createRatingQuestions(numberOfRating) {
  for(i = 0; i < numberOfRating; i++){

    rdivArr[i] = document.createElement('div');
    rdivArr[i].id = "ratingQuestion" + (i+1);
    document.getElementById("ratingInput").appendChild(rdivArr[i]);
    document.getElementById(rdivArr[i].id).innerHTML =
    "<span id='q"+i+"'><input size='100' type='text' placeholder='Enter Question "+(i+1)+" Here' id='qValue"+i+"'></span> <br>" + "Score: <select id='rInput"+(i+1)+"'>"
    + "<option value='1'>1</option>" + "<option value='2'>2</option>" + "<option value='3'>3</option>" + "<option value='4'>4</option>" + "<option value='5'>5</option> </select> <br> <br>";
  }

}

function createSAQuestions(numberOfShortAnswer) {
  for(i=0; i < numberOfShortAnswer; i++){
    sadivArr[i] = document.createElement('div');
    sadivArr[i].id = "SAQuestion" + (i+1);
    document.getElementById("shortAnswerInput").appendChild(sadivArr[i]);
    document.getElementById(sadivArr[i].id).innerHTML =
    "<span id='saq"+i+"'><input size='100' type='text' placeholder='Enter Question "+(i+1)+" Here' id='saqValue"+i+"'></span> <br>"
    + "<textarea id='saInput"+(i+1)+"' rows='8' cols='80'></textarea> <br> <br>";
  }
}

function numberOfQuestions() {
  numberOfRating = document.getElementById("rating-style-select").value;
  numberOfShortAnswer = document.getElementById("shortAnswer-style-select").value;

  document.getElementById("form1").innerHTML =
  "<form action='' id='form2'> <h3>Rating Questions: (1-Terrible 5-Excellent)<br></h3>" +
  "<div id='ratingInput'></div> <br> <br>" +
  "<h3>Short Answer Questions: <br></h3>" +
  "<div id='shortAnswerInput'></div> </form>"
  + "<button onclick='generateForm()' type='button' id='generate'>Generate Form</button>"
  + "<button type='button' id='save'>Save Form</button>";

  createRatingQuestions(numberOfRating);
  createSAQuestions(numberOfShortAnswer);
}
