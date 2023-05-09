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

Sample bootstrap
```
<!DOCTYPE html>
<html>
<head>
  <title>My Form</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
  <div class="container mt-5">
    <h1>My Form</h1>
    <form>
      <div class="form-group">
        <label for="name1">Name 1</label>
        <input type="text" class="form-control" id="name1" name="name1">
      </div>
      <div class="form-group">
        <label for="name2">Name 2</label>
        <input type="text" class="form-control" id="name2" name="name2">
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
  </div>

  <!-- Bootstrap JS -->
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>

```
