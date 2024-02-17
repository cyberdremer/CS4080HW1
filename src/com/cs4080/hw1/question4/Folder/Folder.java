package com.cs4080.hw1.question4.Folder;

import com.cs4080.hw1.question4.File.File;

import java.util.ArrayList;

public class Folder {
    private String nameOfFolder;
    ArrayList<File> fileArrayList;
    ArrayList<Folder> folderArrayList;

    public Folder(){
        fileArrayList = new ArrayList<>();
        folderArrayList = new ArrayList<>();


    }

    public void addFolder(Folder folder){
        folderArrayList.add(folder);

    }

    public void addFile(File file){
        fileArrayList.add(file);
    }

    public String getNameOfFolder() {
        return nameOfFolder;
    }

    public void setNameOfFolder(String nameOfFolder) {
        this.nameOfFolder = nameOfFolder;
    }

    public ArrayList<File> getFileArrayList() {
        return fileArrayList;
    }

    public ArrayList<Folder> getFolderArrayList() {
        return folderArrayList;
    }

    public void printFolderInfo(){
        System.out.println(this.nameOfFolder);

    }


    public void printFileStructure(Folder folder, int indentLevel){
        StringBuilder indentation = new StringBuilder();
        for(int i = 0; i < indentLevel; i++){
            indentation.append(" ");
        }
        System.out.println(indentation + folder.getNameOfFolder());

        for (Folder subFolders: folder.folderArrayList ){
            printFileStructure(subFolders, indentLevel + 1);
        }

        for(File files: folder.getFileArrayList()){
            System.out.println(indentation + files.getNameOfFile());
        }

    }

    public void print(){
        printFileStructure(this, 0);
    }
}
