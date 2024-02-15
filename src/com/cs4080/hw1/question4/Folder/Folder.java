package com.cs4080.hw1.question4.Folder;

import com.cs4080.hw1.question4.File.File;

import java.util.ArrayList;

public class Folder {
    private String nameOfFolder;
    ArrayList<File> fileArrayList;
    ArrayList<Folder> folderArrayList;

    public Folder(String name){
        fileArrayList = new ArrayList<>();
        folderArrayList = new ArrayList<>();
        this.nameOfFolder = name;

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
}
