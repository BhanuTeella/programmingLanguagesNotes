let num1=Math.floor(Math.random() * 10) + 1;//generates random number between 1-10
let num2=Math.floor(Math.random() * 10) + 1;

document.getElementById("number1").innerHTML=num1;
document.getElementById("number2").innerHTML=num2;

let sum=Number(num1)+Number(num2);
let diff=Number(num1)-Number(num2);
let mul=Number(num1)*Number(num2);
let division=Number(num1)/Number(num2);

document.getElementById("result").innerHTML="Sum: "+sum+"<br>Diff: "+diff+"<br>Product: "+mul+"<br>Division: "+division;