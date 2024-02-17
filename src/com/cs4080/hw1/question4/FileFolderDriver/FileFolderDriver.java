package com.cs4080.hw1.question4.FileFolderDriver;

import com.cs4080.hw1.question4.File.File;
import com.cs4080.hw1.question4.Folder.Folder;

import javax.swing.*;
import java.util.ArrayList;

public class FileFolderDriver {
    public static void main(String args[]){
        Folder phpFolder = new Folder();
        phpFolder.setNameOfFolder("php_demo1");
        Folder sourceFiles = new Folder();
        sourceFiles.setNameOfFolder("Source Files");
        Folder phalcon = new Folder();
        phalcon.setNameOfFolder(".phalcon");
        Folder app = new Folder();
        app.setNameOfFolder("app");
        Folder config = new Folder();
        config.setNameOfFolder("config");
        Folder controllers = new Folder();
        controllers.setNameOfFolder("controllers");
        Folder library = new Folder();
        library.setNameOfFolder("library");
        Folder migrations = new Folder();
        migrations.setNameOfFolder("migrations");
        Folder models = new Folder();
        models.setNameOfFolder("models");
        Folder views = new Folder();
        views.setNameOfFolder("views");
        Folder cache = new Folder();
        cache.setNameOfFolder("cache");
        Folder pub = new Folder();
        pub.setNameOfFolder("public");
        File htaccess = new File();
        htaccess.setNameOfFile(".htaccess");
        File htrouter = new File();
        htrouter.setNameOfFile(".htrouter.php");
        File indexHtml = new File();
        indexHtml.setNameOfFile("index.html");
        Folder includePath = new Folder();
        includePath.setNameOfFolder("Include Path");
        Folder remoteFiles = new Folder();
        remoteFiles.setNameOfFolder("Remote Files");



        phpFolder.addFolder(sourceFiles);
        phpFolder.addFolder(includePath);
        phpFolder.addFolder(remoteFiles);

        sourceFiles.addFolder(app);
        sourceFiles.addFolder(phalcon);
        sourceFiles.addFolder(cache);
        sourceFiles.addFolder(pub);
        sourceFiles.addFile(htaccess);
        sourceFiles.addFile(htrouter);
        sourceFiles.addFile(indexHtml);


        app.addFolder(config);
        app.addFolder(controllers);
        app.addFolder(library);
        app.addFolder(migrations);
        app.addFolder(models);
        app.addFolder(views);



        phpFolder.print();









    }



}
