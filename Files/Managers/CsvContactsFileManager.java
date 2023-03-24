package Files.Managers;

import Files.Base.FileManager;
import Files.Exporters.CsvFileExporter;
import Files.Importers.CsvFileImporter;

public class CsvContactsFileManager extends FileManager {
    public CsvContactsFileManager(String fileName) {
        super(new CsvFileExporter(), new CsvFileImporter(), fileName);
    }

}