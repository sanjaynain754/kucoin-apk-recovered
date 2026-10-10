package com.chad.library.adapter.base.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes34.dex */
public class DataBindingHolder<DB extends ViewDataBinding> extends RecyclerView.ViewHolder {
    private final DB binding;

    public DataBindingHolder(DB db2) {
        super(db2.getRoot());
        this.binding = db2;
    }

    @NonNull
    public DB getBinding() {
        return this.binding;
    }

    public DataBindingHolder(@NonNull View view) {
        super(view);
        DB db2 = (DB) DataBindingUtil.bind(view);
        this.binding = db2;
        if (db2 == null) {
            throw new NullPointerException("DataBinding is Null. Please check Layout resource or ItemView");
        }
    }

    public DataBindingHolder(@LayoutRes int i11, @NonNull ViewGroup viewGroup) {
        this(LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false));
    }
}
