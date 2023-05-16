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


# Content

```
Sesión 1: Introducción a la ingeniería de software

Presentación de la ingeniería de software: qué es, para qué sirve y cómo se aplica en la vida diaria.
Presentación de los conceptos básicos de la programación y las herramientas que se utilizan en el proceso de desarrollo de software.
Ejemplos de software en la vida cotidiana y cómo éstos mejoran la calidad de vida.

Sesión 2: Fundamentos de las matemáticas

Presentación de los conceptos básicos de las matemáticas: números, operaciones, álgebra y geometría.
Ejemplos de cómo las matemáticas se aplican en la ingeniería de software, incluyendo la lógica, las funciones, los algoritmos y la optimización.

Sesión 3: Cloud computing

Introducción a los conceptos básicos de cloud computing, como la infraestructura de nube, la virtualización y los servicios de nube.
Explicación de cómo se utiliza cloud computing en el desarrollo de software y cómo se puede beneficiar de él en términos de escalabilidad, seguridad y eficiencia.
Demostración de servicios de nube populares, como Amazon Web Services, Google Cloud Platform y Microsoft Azure.

Sesión 4: Inteligencia artificial

Introducción a los conceptos básicos de la inteligencia artificial, incluyendo el aprendizaje automático, la visión por computadora y el procesamiento de lenguaje natural.
Explicación de cómo se utiliza la inteligencia artificial en el desarrollo de software y cómo se puede beneficiar de ella en términos de automatización y eficiencia.
Demostración de aplicaciones de inteligencia artificial populares, como reconocimiento de imágenes y chatbots.

Sesión 5: Desarrollo de software

Introducción a los procesos de desarrollo de software, incluyendo el análisis de requisitos, el diseño, la implementación y la prueba.
Presentación de las habilidades necesarias para convertirse en un ingeniero de software, como la capacidad de resolución de problemas, la creatividad y la colaboración en equipo.
Demostración de herramientas utilizadas en el desarrollo de software, como editores de código, repositorios de código y sistemas de control de versiones.

Sesión 6: Aplicaciones de la ingeniería de software

Discusión sobre cómo las matemáticas, cloud computing e inteligencia artificial son importantes en la ingeniería de software y cómo se aplican en la vida cotidiana.
Ejemplos de aplicaciones de la ingeniería de software en diferentes campos, como la medicina, la educación y los negocios.
Preguntas y respuestas, y orientación sobre cómo continuar aprendiendo sobre la ingeniería de software, las matemáticas, cloud computing e inteligencia artificial
```
