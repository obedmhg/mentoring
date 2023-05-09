# software engineering introduction classes material


Sample match code


```
function calculateStringMatch(str) {
  let hash = 0;
  for (let i = 0; i < str.length; i++) {
    hash = (hash << 5) - hash + str.charCodeAt(i);
  }
  let normalizedValue = (hash % 100 + 100) % 100;
  return normalizedValue;
}
```
