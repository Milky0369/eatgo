package kr.co.fastcampus.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private final Long id;
    private final String name;
    private final String address;
    private List<MenuItem> menuItems = new ArrayList<>();

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getInfomation() {
        return name + " in " + address;
    }

    public Object getAddress() {
        return address;
    }

    public Long getId() {
        return id;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void setMenuItems(List<MenuItem> menuItems) {

        for(MenuItem menu : menuItems) {
            addMenuItem(menu);
        }

    }
}
