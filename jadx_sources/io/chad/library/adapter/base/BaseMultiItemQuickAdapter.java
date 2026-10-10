package io.chad.library.adapter.base;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.entity.IExpandable;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.util.List;

/* JADX INFO: loaded from: classes60.dex */
public abstract class BaseMultiItemQuickAdapter<T extends MultiItemEntity, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {
    private static final int DEFAULT_VIEW_TYPE = -255;
    public static final int TYPE_NOT_FOUND = -404;
    private SparseIntArray layouts;

    private int getLayoutId(int i11) {
        return this.layouts.get(i11, -404);
    }

    public void addItemType(int i11, @LayoutRes int i12) {
        if (this.layouts == null) {
            this.layouts = new SparseIntArray();
        }
        this.layouts.put(i11, i12);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int i11) {
        T t11 = this.mData.get(i11);
        return t11 != null ? t11.getF42794b() : DEFAULT_VIEW_TYPE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public boolean isExpandable(MultiItemEntity multiItemEntity) {
        return multiItemEntity != null && (multiItemEntity instanceof IExpandable);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public void remove(@IntRange(from = 0) int i11) {
        List<T> list = this.mData;
        if (list == null || i11 < 0 || i11 >= list.size()) {
            return;
        }
        T t11 = this.mData.get(i11);
        if (t11 instanceof IExpandable) {
            removeAllChild((IExpandable) t11, i11);
        }
        removeDataFromParent(t11);
        super.remove(i11);
    }

    public void setDefaultViewTypeLayout(@LayoutRes int i11) {
        addItemType(DEFAULT_VIEW_TYPE, i11);
    }

    public BaseMultiItemQuickAdapter(List<T> list) {
        super(list);
    }

    public int getParentPositionInAll(int i11) {
        List<T> data = getData();
        T item = getItem(i11);
        if (isExpandable((MultiItemEntity) item)) {
            IExpandable iExpandable = (IExpandable) item;
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                T t11 = data.get(i12);
                if (isExpandable((MultiItemEntity) t11) && iExpandable.getLevel() > ((IExpandable) t11).getLevel()) {
                    return i12;
                }
            }
            return -1;
        }
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            if (isExpandable((MultiItemEntity) data.get(i13))) {
                return i13;
            }
        }
        return -1;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public K onCreateDefViewHolder(ViewGroup viewGroup, int i11) {
        return createBaseViewHolder(viewGroup, getLayoutId(i11));
    }

    public void removeAllChild(IExpandable iExpandable, int i11) {
        List subItems;
        if (iExpandable.isExpanded() && (subItems = iExpandable.getSubItems()) != null && subItems.size() != 0) {
            int size = subItems.size();
            for (int i12 = 0; i12 < size; i12++) {
                remove(i11 + 1);
            }
        }
    }

    public void removeDataFromParent(T t11) {
        int parentPosition = getParentPosition(t11);
        if (parentPosition >= 0) {
            ((IExpandable) this.mData.get(parentPosition)).getSubItems().remove(t11);
        }
    }
}
