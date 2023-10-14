const numbers = [1,2,3,4,5,6,7,8,9,0];

// Sort the array in descending order
numbers.sort(function(a, b) {
  return b - a;
});

console.log(numbers);