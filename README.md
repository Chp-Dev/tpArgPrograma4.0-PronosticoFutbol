<h1 align="center">TRABAJO INTEGRADOR - ARGENTINA PROGRAMA 4.0</h1>

<h2 align="center">Luna Bazán, Mateo - Rodriguez, Eduardo Nahuel</h2>

<h3> Descripción breve </h3>

<p align="center"> Este un programa desarrolado con las tecnologias de Java, MySQL y Docker. Su finalidad es realizar un pronostico automatizado del resultado de 20 partidos con los equipos del futbol argentino.</p>

<h3> Instrucciones </h3>

Instalar jdk 11

Descarga el paquete de instalación de Oracle JDK 11 desde el sitio web oficial de Oracle utilizando el siguiente comando:

```shell
wget https://download.oracle.com/java/11/latest/jdk-11_linux-x64_bin.deb 
```

Instala el paquete descargado utilizando el siguiente comando:

```shell
sudo apt-get install ./jdk-11_linux-x64_bin.deb
```

Instalar Docker en Windows

https://www.docker.com/

Instalar Docker en Linux

https://docs.docker.com/desktop/install/linux-install/

Levantar arhivo Docker
<p>- En la terminal, posicionarse en la raiz del proyecto </p>

```shell
docker compose up
```

Descargar MySQL

https://www.mysql.com/downloads/

Configuración de la Base de Datos

* Nombre de BD: pronosticoDB
* Puerto: 3306
* Usuario: admin
* Contraseña: admin
* Script Tabla:

```shell
CREATE TABLE partidos (
                          id INT AUTO_INCREMENT,
                          equipo_local VARCHAR(255) NOT NULL,
                          equipo_visitante VARCHAR(255) NOT NULL,
                          goles_local INT NOT NULL,
                          goles_visitante INT NOT NULL,
                          fecha DATE  NULL,
                          PRIMARY KEY (id)
);

```

