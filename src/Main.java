
public class Main {
    public static void main(String[] args) {
        MyOwnList<String> list = new MyOwnList<>();
        list.add("Boqiyev");
        list.add("Shukurjon");
        list.add("Kumar");
        list.add("Umar");
        list.show();
        list.remove(2);
        list.addFirst("AAAAA");
        System.out.println(list.size());
        list.insert(2, "BBBBB");
        list.show();
        System.out.println(list.get(2));
    }
}