package com.netease.hotfix.lib;

import java.util.ArrayList;
import java.util.Random;

public class EventTest {

    public static void main(String[] args) {

        //随机创建几个员工
        Random random = new Random();

        ArrayList<Staff> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(new Staff(random.nextInt(4), "我要加薪"));
        }

        Manager boss = new Boss();
        Manager generalManager = new GeneralManager();
        Manager ordinaryManager = new OrdinaryManager();

        //设置下一级责任人
        ordinaryManager.setNextManager(generalManager);
        generalManager.setNextManager(boss);

        for (Staff staff : arrayList) {
            ordinaryManager.request(staff);
        }

    }

}
