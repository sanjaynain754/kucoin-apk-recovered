package com.kubi.tradebase.business.klineSettings;

import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$font;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: KLineTimeAdapter.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/tradebase/business/klineSettings/KLineTimeAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KLineTimeAdapter extends BaseQuickAdapter<KLineTimeEntity, BaseViewHolder> {
    public KLineTimeAdapter() {
        super(R$layout.btradebase_item_kline_time);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable KLineTimeEntity kLineTimeEntity) {
        if (kLineTimeEntity != null) {
            kLineTimeEntity.setTime(KLineSettingsManager.f51515a.m63120e(Integer.valueOf(kLineTimeEntity.getTag())));
        }
        boolean z11 = false;
        if (kLineTimeEntity != null && kLineTimeEntity.isSelected()) {
            z11 = true;
        }
        if (baseViewHolder == null) {
            return;
        }
        int i11 = R$id.tv_time;
        baseViewHolder.setText(i11, kLineTimeEntity != null ? kLineTimeEntity.getTime() : null).setTextColor(i11, z11 ? ContextCompat.getColor(this.mContext, R$color.c_text) : ContextCompat.getColor(this.mContext, R$color.c_text40)).setTypeface(i11, z11 ? ResourcesCompat.getFont(this.mContext, R$font.medium) : ResourcesCompat.getFont(this.mContext, R$font.regular));
    }
}
