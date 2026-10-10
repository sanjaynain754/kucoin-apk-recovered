package io.chad.library.adapter.base;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.entity.IExpandable;
import io.chad.library.adapter.base.entity.SectionMultiEntity;
import java.util.List;

/* JADX INFO: loaded from: classes60.dex */
public abstract class BaseSectionMultiItemQuickAdapter<T extends SectionMultiEntity, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {
    private static final int DEFAULT_VIEW_TYPE = -255;
    protected static final int SECTION_HEADER_VIEW = 1092;
    public static final int TYPE_NOT_FOUND = -404;
    private SparseIntArray layouts;
    protected int mSectionHeadResId;

    public abstract void convertHead(K k11, T t11);

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
        if (t11 != null) {
            return t11.isHeader ? SECTION_HEADER_VIEW : t11.getF38450c();
        }
        return DEFAULT_VIEW_TYPE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(K k11, int i11) {
        if (k11.getItemViewType() != SECTION_HEADER_VIEW) {
            super.onBindViewHolder((BaseViewHolder) k11, i11);
        } else {
            setFullSpan(k11);
            convertHead(k11, getItem(i11 - getHeaderLayoutCount()));
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public K onCreateDefViewHolder(ViewGroup viewGroup, int i11) {
        return i11 == SECTION_HEADER_VIEW ? createBaseViewHolder(getItemView(this.mSectionHeadResId, viewGroup)) : createBaseViewHolder(viewGroup, getLayoutId(i11));
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

    public BaseSectionMultiItemQuickAdapter(int i11, List<T> list) {
        super(list);
        this.mSectionHeadResId = i11;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public boolean isFixedViewType(int i11) {
        if (!super.isFixedViewType(i11) && i11 != SECTION_HEADER_VIEW) {
            return false;
        }
        return true;
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
