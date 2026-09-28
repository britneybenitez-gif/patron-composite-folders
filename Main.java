// Autor: Britney Benitez Ordoñez
// Patrón de diseño: Composite
// Descripción: Sistema de folders y archivos
//Curso: Ingeniería de Software II


public class Main {

    public static void main(String[] args) {

        Folder raiz = new Folder("Raiz");

        File foto = new File("foto.jpg", 100);
        File video = new File("video.mp4", 500);

        Folder documentos = new Folder("Documentos");

        File tarea = new File("tarea.pdf", 200);
        File notas = new File("notas.txt", 50);

        Folder universidad = new Folder("Universidad");

        File parcial = new File("parcial.pdf", 150);
        File proyecto = new File("proyecto.docx", 300);

        universidad.addStorageUnit(parcial);
        universidad.addStorageUnit(proyecto);

        documentos.addStorageUnit(tarea);
        documentos.addStorageUnit(notas);
        documentos.addStorageUnit(universidad);

        raiz.addStorageUnit(foto);
        raiz.addStorageUnit(video);
        raiz.addStorageUnit(documentos);

        System.out.println("ESTRUCTURA DE ARCHIVOS");
        System.out.println("----------------------");

        raiz.display("");

        System.out.println();

        System.out.println(
            "Tamaño total de Raiz: "
            + raiz.getSize()
            + " bytes"
        );
    }
}