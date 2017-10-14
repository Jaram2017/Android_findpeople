package com.example.hak.android_hak;

import java.util.ArrayList;

/**
 * Created by Hak on 2017-10-11.
 */

public class ChildList {

    private String groupname;
    private ArrayList<String> list;

    public ChildList(String groupname, ArrayList<String> list) {
        this.groupname = groupname;
        this.list = list;
    }

    public String getGroupname() {
        return groupname;
    }

    public String getChild(int childposition) {
        return list.get(childposition);
    }

    public int size() {
      return list.size();
    }

    public void add(String groupname, ArrayList<String> array) {
        this.groupname = groupname;
        this.list = array;
        return;
    }

}
