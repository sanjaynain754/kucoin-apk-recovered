package io.chad.library.adapter.base.provider;

import android.content.Context;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;

/* JADX INFO: loaded from: classes60.dex */
public abstract class BaseItemProvider<T, V extends BaseViewHolder> {
    public Context mContext;
    public List<T> mData;

    public abstract void convert(V v11, T t11, int i11);

    public abstract int layout();

    public boolean onLongClick(V v11, T t11, int i11) {
        return false;
    }

    public abstract int viewType();

    public void onClick(V v11, T t11, int i11) {
    }
}
