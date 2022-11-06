import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FileNavigator {

    private final Map<String, ArrayList<FileData>> storageOfFiles = new HashMap<>();

    public void add(String pathToFile, FileData savedFile) {

        if (savedFile.puchOfFile().equals(pathToFile)) {
            System.out.println("Path " + pathToFile + " of file '" + savedFile.fileName() +
                    "' does`nt fits of the paths of the list.");
            System.out.println();
        }

        if (!storageOfFiles.containsKey(pathToFile)) {
            storageOfFiles.put(pathToFile, new ArrayList<FileData>());
            storageOfFiles.get(pathToFile).add(savedFile);
        } else {
            storageOfFiles.get(pathToFile).add(savedFile);
        }
    }

    public ArrayList<FileData> find(String pathOfFile) {
        return storageOfFiles.get(pathOfFile);

    }

    public ArrayList<FileData> filterBySize(double maxSizeInBytes) {
        ArrayList<FileData> allFiles = sortBySize();
        ArrayList<FileData> filteredFiles = new ArrayList<>();
        for (int i = 0; i < storageOfFiles.size(); i++) {
            if (allFiles.get(i).sizeInBytes() <= maxSizeInBytes) {
                filteredFiles.add(allFiles.get(i));
            }
        }
        return filteredFiles;
    }

    public ArrayList<FileData> sortBySize() {
        ArrayList<FileData> sortFilesBySize = new ArrayList<>();
        for (Map.Entry<String, ArrayList<FileData>> entry : storageOfFiles.entrySet()) {
            sortFilesBySize.addAll(entry.getValue());
        }
        sortFilesBySize.sort(Comparator.comparing(FileData::sizeInBytes));
        return sortFilesBySize;
    }

    public void remove(String pathToFile) {
        storageOfFiles.remove(pathToFile);
    }
}