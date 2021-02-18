var apples = [29, 70, 85, 77, 55, 44, 33, 98, 90, 47, 22, 44, 55, 37, 65];

var sm = [];
var med = [];
var bg = [];

function appleSorter(array) {
    for (var i=0; i < array.length; i++) {
        apple = array[i];
        if (apple <= 50) {
            sm.push(apple);
        } else if (apple >= 71) {
            bg.push(apple);
        } else {
            med.push(apple);
        }
    }
}

appleSorter(apples);

console.log('Small apples. Mass is less then 51 grams = ' + sm);
console.log('Medium apples. Mass is between 51 and 70 grams = ' + med);
console.log('Big apples. Mass is greater than 70 grams = ' + bg);