
public class Main {
    public static void main(String[] args) {
        MyOwnList<String> list = new MyOwnList<>();
        list.add("Boqiyev");
        list.add("Shukurjon");
        list.add("Kumar");
        list.add("Umar");
        list.insert(2, "BBBBB");
        list.show();


        MyOwnList<String> list2 = new MyOwnList<>();
        list2.add("BBBBSH");
        list2.add("Shum");
        list2.add("Bola");
        list2.show();

        list.addAll(list2);
        list.sort();
        list.show();
    }
}