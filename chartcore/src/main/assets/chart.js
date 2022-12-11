function draw(coreModel) {
   new Chart(
     document.getElementById('chart_container'),
     JSON.parse(coreModel)
   );
 }