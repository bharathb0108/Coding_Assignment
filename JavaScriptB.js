/* Perform sorting of an array in descending order.*/
function Sorting(arr) {
    const n = arr.length;
    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                const temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
const myArray = [64, 34, 12, 22, 11, 90]; //Example array taken by Me
Sorting(myArray);
console.log(myArray);