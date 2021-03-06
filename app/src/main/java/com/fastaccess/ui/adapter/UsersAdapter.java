package com.fastaccess.ui.adapter;

import android.support.annotation.NonNull;
import android.view.ViewGroup;

import com.fastaccess.data.dao.model.User;
import com.fastaccess.ui.adapter.viewholder.UsersViewHolder;
import com.fastaccess.ui.widgets.recyclerview.BaseRecyclerAdapter;
import com.fastaccess.ui.widgets.recyclerview.BaseViewHolder;

import java.util.ArrayList;

/**
 * Created by Kosh on 11 Nov 2016, 2:07 PM
 */

public class UsersAdapter extends BaseRecyclerAdapter<User, UsersViewHolder, BaseViewHolder.OnItemClickListener<User>> {

    private boolean isContributor;

    public UsersAdapter(@NonNull ArrayList<User> list) {
        this(list, false);
    }

    public UsersAdapter(@NonNull ArrayList<User> list, boolean isContributor) {
        super(list);
        this.isContributor = isContributor;
    }

    @Override protected UsersViewHolder viewHolder(ViewGroup parent, int viewType) {
        return new UsersViewHolder(UsersViewHolder.getView(parent), this);
    }

    @Override protected void onBindView(UsersViewHolder holder, int position) {
        holder.bind(getItem(position), isContributor);
    }
}
