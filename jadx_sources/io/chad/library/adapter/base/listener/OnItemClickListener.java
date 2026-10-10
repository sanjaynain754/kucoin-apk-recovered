package io.chad.library.adapter.base.listener;

import android.view.View;
import io.chad.library.adapter.base.BaseQuickAdapter;

/* JADX INFO: loaded from: classes60.dex */
public abstract class OnItemClickListener extends SimpleClickListener {
    public abstract void onSimpleItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11);

    @Override // io.chad.library.adapter.base.listener.SimpleClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        onSimpleItemClick(baseQuickAdapter, view, i11);
    }

    @Override // io.chad.library.adapter.base.listener.SimpleClickListener
    public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
    }

    @Override // io.chad.library.adapter.base.listener.SimpleClickListener
    public void onItemChildLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
    }

    @Override // io.chad.library.adapter.base.listener.SimpleClickListener
    public void onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
    }
}
