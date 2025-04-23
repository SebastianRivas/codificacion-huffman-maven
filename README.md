# CODIFICACION HUFFMAN (JAVA & MAVEN)

Este proyecto tiene una implementación en el lenguaje de programación JAVA usando el gestor de paquetes MAVEN del algoritmo de compresión de datos llamado Codificación Huffman.

## ESTRUCTURA DE DIRECCTORIOS 🗂️

```bash
.
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── fada
│   │               └── CodificacionHuffman
│   │                   ├── app
│   │                   │   ├── App.java
│   │                   │   ├── gui
│   │                   │   │   └── Principal.java
│   │                   │   └── logica
│   │                   │       ├── Arbol.java
│   │                   │       ├── Archivo.java
│   │                   │       ├── CodificacionHuffman.java
│   │                   │       ├── Lista.java
│   │                   │       ├── Nodo.java
│   │                   │       └── ProcesarStrings.java
│   │                   ├── input
│   │                   │   └── text
│   │                   │       └── Lorem Ipsum.txt
│   │                   ├── output
│   │                   │   └── text
│   │                   └── resources
│   └── test
│       └── java
│           └── com
│               └── fada
│                   └── CodificacionHuffman
│                       ├── app
│                       │   ├── AppTest.java
│                       │   ├── gui
│                       │   │   └── PrincipalTest.java
│                       │   └── logica
│                       │       ├── ArbolTest.java
│                       │       ├── ArchivoTest.java
│                       │       ├── CodificacionHuffmanTest.java
│                       │       ├── ListaTest.java
│                       │       ├── NodoTest.java
│                       │       └── ProcesarStringsTest.java
│                       └── resources
└── target
```

## EJECUCION DEL PROYECTO ⌨️

⚠️ La compilacion y posterior ejecucion del proyecto se debe hacer desde la raiz del proyecto ⚠️

⚠️ La salida del programa se almacena en ⚠️

```bash
src/main/java/com/fada/CodificacionHuffman/output/text
```

- Compilacion y ejecucion

Compilacion

```bash
    mvn clean install
```

Construccion del JAR

```bash
    mvn package
```

Ejecucion

```bash
    java -cp target/CodificacionHuffman-1.0-SNAPSHOT.jar com.fada.CodificacionHuffman.app.App
```
