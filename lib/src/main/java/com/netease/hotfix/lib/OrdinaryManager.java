package com.netease.hotfix.lib;

public class OrdinaryManager extends Manager {
    public OrdinaryManager() {
        super(Manager.ORIDINARY_MANAGER);
    }

    @Override
    protected void response(Staff staff) {
        System.out.println("员工问普通经理");
        System.out.println(staff.getRequest());
        System.out.println("普通经理的回答是：没问题");
        System.out.println("==========================");
    }
}
