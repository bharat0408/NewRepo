<!DOCTYPE html>
<html>

<meta charset="ISO-8859-1">
<title>Completed Transaction</title>
<style>
div {
    width: 100px;
    height: 100px;
    margin : 300px;
    background-color: red;
    position: relative;
    -webkit-animation-name: example; /* Safari 

4.0 - 8.0 */
    -webkit-animation-duration: 4s; /* Safari 4.0 - 

8.0 */
    animation-name: example;
    animation-duration: 4s;
}
@-webkit-keyframes example {
    0%   {background-color:red; left:0px; 

top:0px;}
    25%  {background-color:yellow; left:200px; 

top:0px;}
    50%  {background-color:blue; left:200px; 

top:200px;}
    75%  {background-color:green; left:0px; 

top:200px;}
    100% {background-color:red; left:0px; 

top:0px;}
}

/* Standard syntax */
@keyframes example {
    0%   {background-color:red; left:0px; 

top:0px;}
    25%  {background-color:yellow; left:200px; 

top:0px;}
    50%  {background-color:blue; left:200px; 

top:200px;}
    75%  {background-color:green; left:0px; 

top:200px;}
    100% {background-color:red; left:0px; 

top:0px;}
}


</style>
</head>
<body>

<div>
<img src="ATM.jpg" width="350" height="263" 

alt="Atm">
<p><b>Transaction is Completed<b></p>
</div>

</body>
</html>