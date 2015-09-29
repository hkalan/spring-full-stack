package br.com.springIntro.sectionThree;

public class LoggerByName {
    private LogWriter consoleWriter;
    private LogWriter fileWriter;
    
    public void setConsoleWriter(LogWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }
    
    public void setFileWriter(LogWriter fileWriter) {
        this.fileWriter = fileWriter;
    }
    
    public void writeConsole(String text){
	consoleWriter.write(text);
    }
    
    public void writeFile(String text){
	fileWriter.write(text);
    }    
}