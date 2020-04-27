package Builder;

public interface Item {
    String name();

    //packing打包返回一个包装类
    Packing packing();

    float price();
}
