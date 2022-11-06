public class AppFileNavigator {
    public static void main(String[] args) {

        FileData MyReadmeFile1 = new FileData("Readme", 150, "C:\\my folder");
        FileData MyReadmeFile2 = new FileData("Notebook", 20, "C:\\New folder2");
        FileData MyReadmeFile3 = new FileData("Instruction", 25, "C:\\my folder");
        FileData MyBook01 = new FileData("wikipedia", 115, "C:\\New folder2");
        FileData MyBook02 = new FileData("dictionary", 320, "C:\\my folder");


        FileNavigator myFileCollection = new FileNavigator();
        myFileCollection.add("C:\\my folder",MyReadmeFile1);
        myFileCollection.add("C:\\New folder2",MyReadmeFile2);
        myFileCollection.add("C:\\my folder",MyReadmeFile3);
        myFileCollection.add("C:\\New folder2",MyBook01);
        myFileCollection.add("C:\\my folder",MyBook02);
        myFileCollection.add("Dsc:\\",MyReadmeFile1);


        System.out.println(myFileCollection.find("C:\\my folder"));
        System.out.println();
        System.out.println(myFileCollection.filterBySize(100));
        System.out.println();
        System.out.println(myFileCollection.sortBySize());
        System.out.println();
        myFileCollection.remove("C:\\New folder2");
        System.out.println();
        System.out.println(myFileCollection.find("C:\\my folder2"));
    }
}
