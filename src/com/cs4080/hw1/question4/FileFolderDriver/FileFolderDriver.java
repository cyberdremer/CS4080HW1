package com.cs4080.hw1.question4.FileFolderDriver;

import com.cs4080.hw1.question4.File.File;
import com.cs4080.hw1.question4.Folder.Folder;

public class FileFolderDriver {
    public static void main(String args[]){


        Folder php_demo1 = new Folder("php_demo1");


        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        Folder cache = new Folder("cache");
        Folder pub = new Folder("public");

        File htaccess = new File("htaccess");
        File htrouter = new File("htrouter");
        File index = new File("index.html");

        Folder incPath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");


        sourceFiles.addFolder(phalcon);
        sourceFiles.addFolder(app);


        app.addFolder(config);
        app.addFolder(controllers);
        app.addFolder(library);
        app.addFolder(migrations);
        app.addFolder(models);
        app.addFolder(views);


        sourceFiles.addFolder(cache);
        sourceFiles.addFolder(pub);

        pub.addFile(htaccess);
        pub.addFile(htrouter);
        pub.addFile(index);

        php_demo1.addFolder(sourceFiles);
        php_demo1.addFolder(incPath);
        php_demo1.addFolder(remoteFiles);


        php_demo1.printFolderInfo();
        for (Folder php: php_demo1.getFolderArrayList()){
            if(php.getNameOfFolder().equals("Source Files")){
                php.printFolderInfo();
                for (Folder srcFiles : php.getFolderArrayList()){
                    if(srcFiles.getNameOfFolder().equals("app")){
                        srcFiles.printFolderInfo();

                        for (Folder a: srcFiles.getFolderArrayList()){
                            System.out.println("---" + a.getNameOfFolder());
                        }

                    }
                    else if (srcFiles.getNameOfFolder().equals("public")) {
                        srcFiles.printFolderInfo();
                        for (File publ: srcFiles.getFileArrayList()){
                            System.out.println("---" + publ.getNameOfFile());
                        }

                    }
                    else {
                        srcFiles.printFolderInfo();
                    }


                }

            }
            else {
                php.printFolderInfo();
            }

        }












    }
}
