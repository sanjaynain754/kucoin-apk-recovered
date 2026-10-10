package io.chad.library.adapter.base.loadmore;

import io.chad.library.R$id;
import io.chad.library.R$layout;

/* JADX INFO: loaded from: classes60.dex */
public final class SimpleLoadMoreView extends LoadMoreView {
    @Override // io.chad.library.adapter.base.loadmore.LoadMoreView
    public int getLayoutId() {
        return R$layout.brvah_quick_view_load_more;
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
