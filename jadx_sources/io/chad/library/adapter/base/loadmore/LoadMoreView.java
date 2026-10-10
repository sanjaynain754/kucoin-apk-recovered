package io.chad.library.adapter.base.loadmore;

import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import io.chad.library.adapter.base.BaseViewHolder;

/* JADX INFO: loaded from: classes60.dex */
public abstract class LoadMoreView {
    public static final int STATUS_DEFAULT = 1;
    public static final int STATUS_END = 4;
    public static final int STATUS_FAIL = 3;
    public static final int STATUS_LOADING = 2;
    private int mLoadMoreStatus = 1;
    private boolean mLoadMoreEndGone = false;

    @LayoutRes
    public abstract int getLayoutId();

    @IdRes
    public abstract int getLoadEndViewId();

    @IdRes
    public abstract int getLoadFailViewId();

    @IdRes
    public abstract int getLoadingViewId();

    public void convert(BaseViewHolder baseViewHolder) {
        int i11 = this.mLoadMoreStatus;
        if (i11 == 1) {
            visibleLoading(baseViewHolder, false);
            visibleLoadFail(baseViewHolder, false);
            visibleLoadEnd(baseViewHolder, false);
            return;
        }
        if (i11 == 2) {
            visibleLoading(baseViewHolder, true);
            visibleLoadFail(baseViewHolder, false);
            visibleLoadEnd(baseViewHolder, false);
        } else if (i11 == 3) {
            visibleLoading(baseViewHolder, false);
            visibleLoadFail(baseViewHolder, true);
            visibleLoadEnd(baseViewHolder, false);
        } else {
            if (i11 != 4) {
                return;
            }
            visibleLoading(baseViewHolder, false);
            visibleLoadFail(baseViewHolder, false);
            visibleLoadEnd(baseViewHolder, true);
        }
    }

    public int getLoadMoreStatus() {
        return this.mLoadMoreStatus;
    }

    @Deprecated
    public boolean isLoadEndGone() {
        return this.mLoadMoreEndGone;
    }

    public final void setLoadMoreEndGone(boolean z11) {
        this.mLoadMoreEndGone = z11;
    }

    public void setLoadMoreStatus(int i11) {
        this.mLoadMoreStatus = i11;
    }

    private void visibleLoadEnd(BaseViewHolder baseViewHolder, boolean z11) {
        int loadEndViewId = getLoadEndViewId();
        if (loadEndViewId != 0) {
            baseViewHolder.setGone(loadEndViewId, z11);
        }
    }

    private void visibleLoadFail(BaseViewHolder baseViewHolder, boolean z11) {
        baseViewHolder.setGone(getLoadFailViewId(), z11);
    }

    private void visibleLoading(BaseViewHolder baseViewHolder, boolean z11) {
        baseViewHolder.setGone(getLoadingViewId(), z11);
    }

    public final boolean isLoadEndMoreGone() {
        if (getLoadEndViewId() == 0) {
            return true;
        }
        return this.mLoadMoreEndGone;
    }
}
