package com.kubi.home.common;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import io.chad.library.adapter.base.BaseItemDraggableAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class BaseMultiItemDragQuickAdapter<T extends MultiItemEntity, K extends BaseViewHolder> extends BaseItemDraggableAdapter<T, K> {

    /* JADX INFO: renamed from: i */
    public SparseArray<Integer> f25586i;

    public void addItemType(int i11, @LayoutRes int i12) {
        if (this.f25586i == null) {
            this.f25586i = new SparseArray<>();
        }
        this.f25586i.put(i11, Integer.valueOf(i12));
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int i11) {
        T t11 = this.mData.get(i11);
        if (t11 instanceof MultiItemEntity) {
            return t11.getF38450c();
        }
        return -255;
    }

    public final int getLayoutId(int i11) {
        return this.f25586i.get(i11, -404).intValue();
    }

    public BaseMultiItemDragQuickAdapter(List<T> list) {
        super(list);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public K onCreateDefViewHolder(ViewGroup viewGroup, int i11) {
        return createBaseViewHolder(viewGroup, getLayoutId(i11));
    }

    @Override // io.chad.library.adapter.base.BaseItemDraggableAdapter
    public void onItemDragMoving(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        int viewHolderPosition = getViewHolderPosition(viewHolder);
        int viewHolderPosition2 = getViewHolderPosition(viewHolder2);
        if (viewHolderPosition != -1 && viewHolderPosition2 != -1) {
            super.onItemDragMoving(viewHolder, viewHolder2);
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(K k11, T t11) {
    }
}
