package fileIo;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class myFileReader {

    // properties for this class
    // goal: read in a file and parse through it
    private String directoryName; //i.e 'data', 'src/fileIo
    private String fileName;       //ie 'day18.text', 'jolts.text'
    private String logFileName;   // will hold logging info
    private Path directoryPath;   //Path representation of the parent directory for our files
    private Path filePath;         //Path representation for the actual file itself
    private Path logFilePath;     //Path representation of the log file
    private List<String> fileLines;//Holding spot for the content inside of the data itself
    private List<String> logLines; //Holding spot for the content inside of the log file

//Constructor
//Want to send in a directory path name and a file name, logFile name and generate everything from just those two values


    public myFileReader(String directoryName, String fileName, String logFileName){
        this.directoryName = directoryName;
        this.fileName = fileName;
        this.logFileName = logFileName;
        //Instantiating path value
        this.directoryPath = Paths.get(directoryName);//Paths.get("data")
        this.filePath = Paths.get(directoryName, fileName);
        this.logFilePath = Paths.get(directoryName, logFileName);

        System.out.println(filePath); //display the file path for the passed in arguments

    }
//PSVM (You can think of this being 20 files away from this file- it is Static
    public static void main(String[] args) {
    //instantiate a file reader object
//        myFileReader thisFileReader = new myFileReader()
    }

    //CUSTOM METHOD
    // Getters & Setters


    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    public Path getDirectoryPath() {
        return directoryPath;
    }

    public void setDirectoryPath(Path directoryPath) {
        this.directoryPath = directoryPath;
    }

    public Path getFilePath() {
        return filePath;
    }

    public void setFilePath(Path filePath) {
        this.filePath = filePath;
    }

    public List<String> getFileLines() {
        return fileLines;
    }

    public void setFileLines(List<String> fileLines) {
        this.fileLines = fileLines;
    }

    public List<String> getLogLines() {
        return logLines;
    }

    public void setLogLines(List<String> logLines) {
        this.logLines = logLines;
    }

    public Path getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(Path logFilePath) {
        this.logFilePath = logFilePath;
    }
}








