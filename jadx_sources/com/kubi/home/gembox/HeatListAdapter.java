package com.kubi.home.gembox;

import android.view.View;
import android.widget.ImageView;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: HeatListAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/home/gembox/HeatListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/home/gembox/HeatEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HeatListAdapter extends BaseQuickAdapter<HeatEntity, BaseViewHolder> {
    public HeatListAdapter() {
        super(R$layout.home_card_gembox_heat_item);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable HeatEntity heatEntity) {
        View view;
        ImageView imageView;
        if (heatEntity == null || heatEntity.getImgRes() == -1 || baseViewHolder == null || (view = baseViewHolder.itemView) == null || (imageView = (ImageView) view.findViewById(R$id.icon)) == null) {
            return;
        }
        imageView.setImageResource(heatEntity.getImgRes());
    }
}
