<?php
// Datos de conexión
$servername = "localhost";
$username   = "root";
$password   = "";
$dbname     = "encuesta";
// Crear conexión
$conn = new mysqli($servername, $username, $password, $dbname);

// Verificar conexión
if ($conn->connect_error) {
    die("Conexión fallida: " . $conn->connect_error);
}

// Recibir datos del formulario
$sabor        = $_POST['sabor'];
$servicio     = $_POST['servicio'];
$higiene      = $_POST['higiene'];
$empleados    = $_POST['empleados'];
$espera       = $_POST['espera'];
$precio       = $_POST['precio'];
$ambiente     = $_POST['ambiente'];
$domicilio    = $_POST['domicilio'];
$recomendacion= $_POST['recomendacion'];
$mejora       = $_POST['mejora'];
$comentarios  = $_POST['comentarios'];

// Insertar en la base de datos
$sql = "INSERT INTO respuestas 
(CaliSabor, CaliServicioGeneral, CaliHigiene, CaliAtencionEmpleados, CaliTiempoEspera, CaliCalidadPrecio, CaliAmbienteComodidad, CaliServicioDomicilio, CaliRecomendacion, CaliMejora, CaliComentario) 
VALUES 
('$sabor','$servicio','$higiene','$empleados','$espera','$precio','$ambiente','$domicilio','$recomendacion','$mejora','$comentarios')";

if ($conn->query($sql) === TRUE) {
    // Redirigir a la página de agradecimiento
    header("Location: gracias.html");
    exit();
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>