# Threads

Threads es una aplicacion que contiene un servidor que recibe miles de peticiones concurrentes y las maneja a traves de Threads Pools o Executors

### Conteo de horas

* Horas trabajadas: 8
* Lineas de código: 570
* Loc/h: 71.25

### Prerequisitos
Se recomienda contar con las siguientes versiones instaladas:
```
version de java: 15
version de compilador: 1.8
Apache maven: 3.6.3 
```

### Instalación
Para uso del proyecto requerimos clonar este repositorio. Siga los pasos:

1. Clonamos el repositorio con ayuda de git
```
git clone https://github.com/JohannCepeda16/ARSW-Lab3.git
```

2. Accedemos a la carpeta donde hemos clonado
```
cd ARSW-Lab3
```

3. Compilamos nuestro proyecto para generar el target
```
mvn package
```

4. Abrimos el proyecto con nuestro editor de preferencia
```
code .
```

### Corriendo las pruebas
Si queremos ejecutar las pruebas de nuestro proyecto debemos ubicarnos en la raiz del pryecto y usar el comando
```
mvn test
```
![test](https://github.com/JohannCepeda16/ARSW-Lab4/blob/main/resources/Test.PNG)

## Programa hecho con

* [Maven](https://maven.apache.org/) - Dependency Management

## Actor

* **Johann Cepeda** - [johanncepeda16]("https://github.com/JohannCepeda16")


## Licencia

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.txt) file for details

## Diseño

Para mas información del diseño del proyecto puede ver el siguiente [documento](https://github.com/JohannCepeda16/ARSW-Lab3/blob/main/resources/Networking.pdf)


## JavaDoc

La documentación del proyecto la puede econtrar siguiendo este  [enlace](https://github.com/JohannCepeda16/ARSW-Lab3/tree/main/src/site/apidocs) o lo generamos con el siguiente comando 
```
mvn javadoc:javadooc
```





