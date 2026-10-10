package io.chad.library.adapter.base.util;

import android.util.SparseIntArray;
import androidx.annotation.LayoutRes;
import java.util.List;

/* JADX INFO: loaded from: classes60.dex */
public abstract class MultiTypeDelegate<T> {
    private static final int DEFAULT_VIEW_TYPE = -255;
    private boolean autoMode;
    private SparseIntArray layouts;
    private boolean selfMode;

    public MultiTypeDelegate(SparseIntArray sparseIntArray) {
        this.layouts = sparseIntArray;
    }

    public abstract int getItemType(T t11);

    public MultiTypeDelegate registerItemType(int i11, @LayoutRes int i12) {
        this.selfMode = true;
        checkMode(this.autoMode);
        addItemType(i11, i12);
        return this;
    }

    public MultiTypeDelegate registerItemTypeAutoIncrease(@LayoutRes int... iArr) {
        this.autoMode = true;
        checkMode(this.selfMode);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            addItemType(i11, iArr[i11]);
        }
        return this;
    }

    private void addItemType(int i11, @LayoutRes int i12) {
        if (this.layouts == null) {
            this.layouts = new SparseIntArray();
        }
        this.layouts.put(i11, i12);
    }

    private void checkMode(boolean z11) {
        if (z11) {
            throw new RuntimeException("Don't mess two register mode");
        }
    }

    public final int getLayoutId(int i11) {
        return this.layouts.get(i11, -404);
    }

    public MultiTypeDelegate() {
    }

    public final int getDefItemViewType(List<T> list, int i11) {
        T t11 = list.get(i11);
        if (t11 != null) {
            return getItemType(t11);
        }
        return DEFAULT_VIEW_TYPE;
    }
}
