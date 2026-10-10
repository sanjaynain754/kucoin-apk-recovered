package io.chad.library.adapter.base;

import android.view.ViewGroup;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.entity.SectionEntity;
import java.util.List;

/* JADX INFO: loaded from: classes60.dex */
public abstract class BaseSectionQuickAdapter<T extends SectionEntity, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {
    protected static final int SECTION_HEADER_VIEW = 1092;
    protected int mSectionHeadResId;

    public abstract void convertHead(K k11, T t11);

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int i11) {
        if (this.mData.get(i11).isHeader) {
            return SECTION_HEADER_VIEW;
        }
        return 0;
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
        return i11 == SECTION_HEADER_VIEW ? createBaseViewHolder(getItemView(this.mSectionHeadResId, viewGroup)) : (K) super.onCreateDefViewHolder(viewGroup, i11);
    }

    public BaseSectionQuickAdapter(int i11, int i12, List<T> list) {
        super(i11, list);
        this.mSectionHeadResId = i12;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public boolean isFixedViewType(int i11) {
        if (!super.isFixedViewType(i11) && i11 != SECTION_HEADER_VIEW) {
            return false;
        }
        return true;
    }
}
