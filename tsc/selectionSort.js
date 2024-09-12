var _a;
var a = [10, 19, 2, 7, 4, 3];
for (var i = 0; i < a.length; i++) {
    for (var j = i + 1; j < a.length; j++) {
        if (a[i] >= a[j]) {
            _a = [a[j], a[i]], a[i] = _a[0], a[j] = _a[1];
        }
    }
}
console.log("the Selection sort are: " + a);
