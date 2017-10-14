package com.example.hak.android_hak;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class BaseExpandableAdapter extends BaseExpandableListAdapter{

	private HashMap<Integer, ChildList> groupList;
    private ChildList childList;
	private LayoutInflater inflater;
	private ViewHolder viewHolder;


	public BaseExpandableAdapter(Context c){
		super();
		this.inflater = LayoutInflater.from(c);
	}
	
	// 그룹 포지션을 반환한다.
	@Override
	public ChildList getGroup(int groupPosition) {
		return groupList.get(groupPosition);
	}

	// 그룹 사이즈를 반환한다.
	@Override
	public int getGroupCount() {
		return groupList.size();
	}

	// 그룹 ID를 반환한다.
	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	// 그룹뷰 각각의 ROW 
	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		
		View v = convertView;
		
		if(v == null){
			viewHolder = new ViewHolder();
			v = inflater.inflate(R.layout.list_row, parent, false);
			viewHolder.tv_groupName = (TextView) v.findViewById(R.id.tv_group);
			viewHolder.iv_image = (ImageView) v.findViewById(R.id.iv_image);
			v.setTag(viewHolder);
		}else{
			viewHolder = (ViewHolder)v.getTag();
		}
		
		// 그룹을 펼칠때와 닫을때 아이콘을 변경해 준다.
		if(isExpanded){
			viewHolder.iv_image.setBackgroundColor(Color.GREEN);
		}else{
			viewHolder.iv_image.setBackgroundColor(Color.WHITE);
		}
		
		viewHolder.tv_groupName.setText(getGroup(groupPosition).getGroupname());
		
		return v;
	}
	
	// 차일드뷰를 반환한다.
	@Override
	public String getChild(int groupPosition, int childPosition) {
		return groupList.get(groupPosition).getChild(childPosition);
	}
	
	// 차일드뷰 사이즈를 반환한다.
	@Override
	public int getChildrenCount(int groupPosition) {
		return childList.size();
	}

	// 차일드뷰 ID를 반환한다.
	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	// 차일드뷰 각각의 ROW
	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		
		View v = convertView;
		
		if(v == null){
			viewHolder = new ViewHolder();
			v = inflater.inflate(R.layout.list_row, null);
			viewHolder.tv_childName = (TextView) v.findViewById(R.id.tv_child);
			v.setTag(viewHolder);
		}else{
			viewHolder = (ViewHolder)v.getTag();
		}

		viewHolder.tv_childName.setText(getChild(groupPosition, childPosition));
		
		return v;
	}

	@Override
	public boolean hasStableIds() {	return true; }

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) { return true; }
	
	class ViewHolder {
		public ImageView iv_image;
		public TextView tv_groupName;
		public TextView tv_childName;
	}

	public void addTest(String groupname, ArrayList<String> putchild, Integer indexnum) {

		ChildList testchild = new ChildList(groupname, putchild);
		group.put(indexnum, testchild);

        this.groupList = group;
        this.childList = testchild;

        return;
    }

	HashMap<Integer, ChildList> group = new HashMap<Integer, ChildList>();

}




