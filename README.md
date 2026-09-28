# Patrón Composite - Sistema de Archivos y Carpetas

## Descripción

Este proyecto implementa el patrón de diseño Composite en Java para representar una estructura de archivos y carpetas.

El sistema permite:

- Mostrar recursivamente la estructura de carpetas y archivos.
- Calcular el tamaño total de una carpeta sumando recursivamente el tamaño de todos sus elementos.
- Tratar archivos y carpetas mediante la abstracción común `StorageUnit`.

## Estructura de la implementación

El proyecto está compuesto por las siguientes clases e interfaces:

- `StorageUnit`: interfaz principal que define las operaciones comunes para archivos y carpetas.
- `StorageContainer`: interfaz especializada para los elementos que pueden contener otras unidades.
- `File`: representa un archivo y actúa como hoja del patrón Composite.
- `Folder`: representa una carpeta y actúa como elemento compuesto.
- `Main`: crea una estructura de ejemplo y demuestra el funcionamiento del patrón.

## Decisión de diseño

El método `addStorageUnit()` fue ubicado en la interfaz `StorageContainer` y no directamente en `StorageUnit`.

Esta decisión permite que solamente los objetos capaces de contener otros elementos, como `Folder`, tengan disponible esta operación.

De esta manera, la clase `File` no está obligada a implementar un método que no corresponde con su comportamiento.

Esta solución permite mantener el polimorfismo del patrón Composite y evita problemas relacionados con el principio de Sustitución de Liskov.

## Ejemplo de estructura

El programa crea una estructura similar a:

```text
Raiz
├── foto.jpg
├── video.mp4
└── Documentos
    ├── tarea.pdf
    ├── notas.txt
    └── Universidad
        ├── parcial.pdf
        └── proyecto.docx
