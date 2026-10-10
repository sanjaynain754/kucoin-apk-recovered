package com.kubi.resources.widget;

import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import io.chad.library.adapter.base.loadmore.LoadMoreView;

/* JADX INFO: renamed from: com.kubi.resources.widget.g1 */
/* JADX INFO: compiled from: KuCoinLoadMoreView.java */
/* JADX INFO: loaded from: classes13.dex */
public class C23057g1 extends LoadMoreView {
    @Override // io.chad.library.adapter.base.loadmore.LoadMoreView
    public int getLayoutId() {
        return R$layout.kucoin_loadmore_view;
    }

    @Override // io.chad.library.adapter.base.loadmore.LoadMoreView
    public int getLoadEndViewId() {
        return R$id.load_more_load_end_view;
    }

    @Override // io.chad.library.adapter.base.loadmore.LoadMoreView
    public int getLoadFailViewId() {
        return R$id.load_more_load_fail_view;
    }

    @Override // io.chad.library.adapter.base.loadmore.LoadMoreView
    public int getLoadingViewId() {
        return R$id.load_more_loading_view;
    }
}
