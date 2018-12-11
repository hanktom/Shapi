package com.fju.shapi.data;

import java.util.Arrays;
import java.util.List;

public class DummyData {
    public static List<Product> getProducts() {
        return Arrays.asList(new Product(1, "大傘面自動四人雨傘 140cm",
                "超大傘面 可輕鬆容納3-4人  兩折縮骨傘 攜帶方便  自動開手動合", 499, 200),
                new Product(2, "aaa", "blablabla", 30, 10),
                new Product(3, "bbb", "aaaaaaaaaaa", 380, 6));
    }
}
