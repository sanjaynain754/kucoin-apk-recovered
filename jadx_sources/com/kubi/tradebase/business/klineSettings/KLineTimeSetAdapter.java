package com.kubi.tradebase.business.klineSettings;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: KLineTimeSetAdapter.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/tradebase/business/klineSettings/KLineTimeSetAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KLineTimeSetAdapter extends BaseQuickAdapter<KLineTimeEntity, BaseViewHolder> {
    public KLineTimeSetAdapter() {
        super(R$layout.btradebase_item_kline_time_cycle_set);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable KLineTimeEntity kLineTimeEntity) {
        int i11;
        int i12;
        String time;
        View view;
        ViewGroup.LayoutParams layoutParams;
        int iM6183e = (C5267e0.m6183e() - C5275i0.m6236a(64.0f)) / 3;
        if (baseViewHolder != null && (view = baseViewHolder.itemView) != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.width = iM6183e;
        }
        if (kLineTimeEntity != null) {
            kLineTimeEntity.setTime(KLineSettingsManager.f51515a.m63120e(Integer.valueOf(kLineTimeEntity.getTag())));
        }
        ShapeTextView shapeTextView = null;
        if (baseViewHolder != null) {
            int i13 = R$id.tv_time_cycle;
            if (kLineTimeEntity != null) {
                time = kLineTimeEntity.getTime();
            } else {
                time = null;
            }
            baseViewHolder.setText(i13, time);
        }
        if (baseViewHolder != null) {
            shapeTextView = (ShapeTextView) baseViewHolder.getView(R$id.tv_time_cycle);
        }
        if (kLineTimeEntity != null && kLineTimeEntity.isSelected()) {
            i11 = R$color.c_text;
        } else {
            i11 = R$color.c_cover8;
        }
        if (kLineTimeEntity != null && kLineTimeEntity.isSelected()) {
            i12 = R$color.c_text;
        } else {
            i12 = R$color.c_text60;
        }
        if (shapeTextView != null) {
            shapeTextView.getShapeDrawableBuilder().m92152n(ContextCompat.getColor(this.mContext, i11));
            shapeTextView.getShapeDrawableBuilder().m92143e();
            shapeTextView.setTextColor(ContextCompat.getColor(this.mContext, i12));
        }
    }
}
