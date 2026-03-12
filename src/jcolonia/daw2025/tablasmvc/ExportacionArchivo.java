package jcolonia.daw2025.tablasmvc;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ExportacionArchivo {
    private Path refArchivo;
    public ExportacionArchivo(String rutaArchivo) {
        this.refArchivo = Paths.get(rutaArchivo);
    }
    public void guardar(List<String> contenidos) {
        try {
            Files.write(this.refArchivo, contenidos);
        } catch (Exception e) {
            System.out.println("Error al guardar.");
        }
    }
}