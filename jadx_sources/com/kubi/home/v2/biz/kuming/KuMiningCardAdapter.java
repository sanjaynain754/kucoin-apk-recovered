package com.kubi.home.v2.biz.kuming;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import com.kubi.home.R$color;
import com.kubi.home.R$drawable;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$mipmap;
import com.kubi.home.R$string;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.util.C24277v;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p402kf.C41015b;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KuMiningCardAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/home/v2/biz/kuming/KuMiningCardAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/home/v2/biz/kuming/KuMiningItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KuMiningCardAdapter extends BaseQuickAdapter<KuMiningItemEntity, BaseViewHolder> {
    public KuMiningCardAdapter() {
        super(R$layout.kucoin_layout_cards_ku_mining_item);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull KuMiningItemEntity item) {
        CharSequence charSequenceM89960g;
        CharSequence charSequenceM89960g2;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.ku_mining_item_name;
        String coin = item.getCoin();
        if (coin == null) {
            coin = "--";
        }
        helper.setText(i11, coin);
        AppCompatImageView appCompatImageView = (AppCompatImageView) helper.getView(R$id.ku_mining_item_icon);
        if (appCompatImageView != null) {
            C24277v.m58541f(appCompatImageView, item.getCoinIcon(), R$mipmap.kucoin_icon_default_icon);
        }
        BaseTextView baseTextView = (BaseTextView) helper.getView(R$id.ku_mining_item_mining_price);
        BigDecimal miningPrice = item.getMiningPrice();
        if (miningPrice == null || (charSequenceM89960g = C41015b.m89960g(new BigDecimal(String.valueOf(C41014a.m89940n(miningPrice, item.getPriceCurrency()))), null, null, 0, 7, null)) == null) {
            charSequenceM89960g = "--";
        }
        baseTextView.setText(charSequenceM89960g);
        BaseTextView baseTextView2 = (BaseTextView) helper.getView(R$id.ku_mining_item_market_price);
        BigDecimal marketPrice = item.getMarketPrice();
        if (marketPrice == null || (charSequenceM89960g2 = C41015b.m89960g(new BigDecimal(String.valueOf(C41014a.m89940n(marketPrice, item.getPriceCurrency()))), null, null, 0, 7, null)) == null) {
            charSequenceM89960g2 = "--";
        }
        baseTextView2.setText(charSequenceM89960g2);
        if (item.getMiningProfitRate() == null) {
            int i12 = R$id.ku_mining_item_odd;
            helper.setText(i12, "--").setTextColor(i12, this.mContext.getColor(R$color.c_text30)).setGone(R$id.ku_mining_item_odd_icon, false);
            return;
        }
        BigDecimal miningProfitRate = item.getMiningProfitRate();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        if (miningProfitRate.compareTo(bigDecimalValueOf) <= 0) {
            int i13 = R$id.ku_mining_item_odd;
            helper.setText(i13, R$string.home_card_kuming_tab_odds_low).setTextColor(i13, this.mContext.getColor(R$color.c_text30)).setGone(R$id.ku_mining_item_odd_icon, false);
            return;
        }
        int i14 = R$id.ku_mining_item_odd;
        BigDecimal miningProfitRate2 = item.getMiningProfitRate();
        BaseViewHolder text = helper.setText(i14, C42180b.m92647l(C42828b.m93915p(C42828b.m93911l(C42180b.m92642g(miningProfitRate2, null, null, C41014a.m89951y(miningProfitRate2), true, false, false, 19, null)))));
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        BigDecimal miningProfitRate3 = item.getMiningProfitRate();
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        BaseViewHolder textColor = text.setTextColor(i14, C22890g.m54281f(mContext, miningProfitRate3.compareTo(bigDecimalValueOf2) > 0));
        int i15 = R$id.ku_mining_item_odd_icon;
        BaseViewHolder gone = textColor.setGone(i15, true);
        BigDecimal miningProfitRate4 = item.getMiningProfitRate();
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
        gone.setImageResource(i15, miningProfitRate4.compareTo(bigDecimalValueOf3) > 0 ? R$drawable.ic2_market_high_12 : R$drawable.ic2_market_low_12);
    }
}
