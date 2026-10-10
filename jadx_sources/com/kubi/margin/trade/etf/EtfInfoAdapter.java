package com.kubi.margin.trade.etf;

import com.kubi.data.entity.EtfRebalanceRecord;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.utils.extensions.C27039d;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42179a;
import p429lf.C42180b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: EtfInfoAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/margin/trade/etf/EtfInfoAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/EtfRebalanceRecord;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EtfInfoAdapter extends BaseQuickAdapter<EtfRebalanceRecord, BaseViewHolder> {
    public EtfInfoAdapter() {
        super(R$layout.bmargin_item_etf_info);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable EtfRebalanceRecord etfRebalanceRecord) {
        String strM92640e;
        if (baseViewHolder == null || etfRebalanceRecord == null) {
            return;
        }
        BaseViewHolder text = baseViewHolder.setText(R$id.tv_time, C42179a.m92633f(C27039d.m66652l(etfRebalanceRecord.getRebalanceTime()), null, false, true, null, 11, null));
        int i11 = R$id.tv_basket_before;
        StringBuilder sb2 = new StringBuilder();
        String strM92640e2 = null;
        BigDecimal bigDecimalM89922G = C41014a.m89922G(etfRebalanceRecord.getRebalanceBeforeAssetSize(), null, 1, null);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalM89922G.compareTo(bigDecimal) > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('+');
            BigDecimal rebalanceBeforeAssetSize = etfRebalanceRecord.getRebalanceBeforeAssetSize();
            sb3.append(rebalanceBeforeAssetSize != null ? C42180b.m92640e(rebalanceBeforeAssetSize, null, 20, false, false, false, 0, null, 125, null) : null);
            strM92640e = sb3.toString();
        } else {
            BigDecimal rebalanceBeforeAssetSize2 = etfRebalanceRecord.getRebalanceBeforeAssetSize();
            strM92640e = rebalanceBeforeAssetSize2 != null ? C42180b.m92640e(rebalanceBeforeAssetSize2, null, 20, false, false, false, 0, null, 125, null) : null;
        }
        sb2.append(strM92640e);
        sb2.append(' ');
        sb2.append(etfRebalanceRecord.getAssetName());
        BaseViewHolder text2 = text.setText(i11, sb2.toString());
        int i12 = R$id.tv_basket_after;
        StringBuilder sb4 = new StringBuilder();
        if (C41014a.m89922G(etfRebalanceRecord.getRebalanceAfterAssetSize(), null, 1, null).compareTo(bigDecimal) > 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append('+');
            BigDecimal rebalanceAfterAssetSize = etfRebalanceRecord.getRebalanceAfterAssetSize();
            sb5.append(rebalanceAfterAssetSize != null ? C42180b.m92640e(rebalanceAfterAssetSize, null, 20, false, false, false, 0, null, 125, null) : null);
            strM92640e2 = sb5.toString();
        } else {
            BigDecimal rebalanceAfterAssetSize2 = etfRebalanceRecord.getRebalanceAfterAssetSize();
            if (rebalanceAfterAssetSize2 != null) {
                strM92640e2 = C42180b.m92640e(rebalanceAfterAssetSize2, null, 20, false, false, false, 0, null, 125, null);
            }
        }
        sb4.append(strM92640e2);
        sb4.append(' ');
        sb4.append(etfRebalanceRecord.getAssetName());
        text2.setText(i12, sb4.toString()).setText(R$id.tv_lever_before, etfRebalanceRecord.getRebalanceBeforeLeverageRatio() + " x").setText(R$id.tv_lever_after, etfRebalanceRecord.getRebalanceAfterLeverageRatio() + " x");
    }
}
