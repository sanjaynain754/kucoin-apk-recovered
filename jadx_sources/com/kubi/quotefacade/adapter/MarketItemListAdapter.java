package com.kubi.quotefacade.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.R$attr;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.FutureTradeItemBean;
import com.kubi.quotefacade.helper.PriceAlertVisibilityHelper;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.quotefacade.market.sort.SymbolsSortType;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.UpDownColorTextView;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.extensions.C27039d;
import com.tencent.bugly.proguard.C33820nf;
import gf.C37885i;
import gf.C37886j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38183a;
import p402kf.C41014a;
import p402kf.C41015b;
import p429lf.C42180b;
import p809yu.C46566a0;
import p809yu.C46588u;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;
import rs.C44172b;

/* JADX INFO: compiled from: MarketItemListAdapter.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u001e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0007J\u001c\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010!\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010\"\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0016\u0010#\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0016J\b\u0010&\u001a\u00020\u0005H\u0002J\u0010\u0010'\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u001c\u0010(\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020%2\u0006\u0010)\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/TradeItemBean;", "Lio/chad/library/adapter/base/BaseViewHolder;", "isTrade", "", "symbolType", "", "<init>", "(ZLjava/lang/Integer;)V", "Ljava/lang/Integer;", "isFavor", "filterKey", "", "longClickPosition", "isShowFee", "isNotBindRecyclerView", "setIsFavor", "", "setIsShowFee", "isShow", "customRightSymbolSortType", "Lcom/kubi/quotefacade/market/sort/SymbolsSortType;", "updateRightCustomSymbolSortType", "curSymbolSortType", "setLongClickPosition", ViewProps.POSITION, "convert", "helper", "item", "setRootView", "setCommonView", "getFundingRateMarketCapInfo", "setETFView", "setPriceView", "replaceData", "data", "", "isSpotType", "showVolumeText", "filterData", "quote", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketItemListAdapter extends BaseQuickAdapter<TradeItemBean, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final boolean f41057i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final Integer f41058j;

    /* JADX INFO: renamed from: k */
    public boolean f41059k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public String f41060l;

    /* JADX INFO: renamed from: m */
    public int f41061m;

    /* JADX INFO: renamed from: n */
    public boolean f41062n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public SymbolsSortType f41063o;

    public MarketItemListAdapter(boolean z11, @Nullable Integer num) {
        super(R$layout.item_list_favorite);
        this.f41057i = z11;
        this.f41058j = num;
        this.f41061m = -1;
        setHasStableIds(true);
        this.f41063o = SymbolsSortType.CHANGE_RATE;
    }

    /* JADX INFO: renamed from: k */
    private final boolean m50215k() {
        Integer num = this.f41058j;
        if (num != null && num.intValue() == 0) {
            return true;
        }
        Integer num2 = this.f41058j;
        return num2 != null && num2.intValue() == 2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ad  */
    /* JADX INFO: renamed from: l */
    private final void m50216l(BaseViewHolder baseViewHolder, TradeItemBean tradeItemBean) {
        boolean z11;
        CharSequence charSequenceM89960g;
        String strM93915p;
        String strM92647l;
        Drawable drawableM54286k;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        boolean z15 = tradeItemBean.getSymbolInfoEntity().isPreviewEnableShow() && this.f41057i;
        C46566a0.m102719a(tradeItemBean, m50215k(), baseViewHolder);
        int i11 = R$id.iv_fav;
        if (this.f41059k) {
            z11 = false;
        } else {
            if (m50215k() ? C46588u.m102743b(tradeItemBean) : C46588u.m102744c(tradeItemBean)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        BaseViewHolder visible = baseViewHolder.setGone(i11, z11).setVisible(R$id.iv_warning_tag, PriceAlertVisibilityHelper.f42102a.m52117d(!m50215k(), tradeItemBean.isAlarm(), this.f41057i));
        int i12 = R$id.tv_lever;
        BaseViewHolder gone = visible.setGone(i12, tradeItemBean.getMaxLeverage() > 0 && C38183a.m86145a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tradeItemBean.getMaxLeverage());
        sb2.append('x');
        BaseViewHolder text = gone.setText(i12, sb2.toString());
        int i13 = R$id.tv_money_price;
        String strM50219q = C33820nf.f71144W;
        if (z15) {
            charSequenceM89960g = C33820nf.f71144W;
        } else {
            double lastDealPrice = tradeItemBean.getLastDealPrice();
            SymbolInfoEntity symbolInfoEntity = tradeItemBean.getSymbolInfoEntity();
            charSequenceM89960g = C41015b.m89960g(new BigDecimal(String.valueOf(C41014a.m89939m(lastDealPrice, symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null))), null, null, 0, 7, null);
        }
        BaseViewHolder text2 = text.setText(i13, charSequenceM89960g);
        int i14 = R$id.tv_change_rate;
        BaseViewHolder visible2 = text2.setVisible(i14, this.f41063o == SymbolsSortType.CHANGE_RATE);
        if (z15) {
            strM92647l = C33820nf.f71144W;
        } else {
            Double changeRate = tradeItemBean.getChangeRate();
            if (changeRate != null) {
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(changeRate.doubleValue()));
                strM93915p = C42828b.m93915p(C42828b.m93911l(C42180b.m92642g(bigDecimal, null, null, C41014a.m89951y(bigDecimal), true, false, false, 19, null)));
            } else {
                strM93915p = null;
            }
            strM92647l = C42180b.m92647l(strM93915p);
        }
        BaseViewHolder text3 = visible2.setText(i14, strM92647l);
        int i15 = R$id.tv_value;
        BaseViewHolder gone2 = text3.setGone(i15, this.f41057i).setGone(R$id.tv_etf_label, m50215k() && tradeItemBean.getSymbolInfoEntity().isEtfSymbol()).setGone(R$id.tv_label_st, m50215k() && tradeItemBean.getMark() == 1);
        Intrinsics.checkNotNullExpressionValue(gone2, "setGone(...)");
        if (z15) {
            Context context = baseViewHolder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            drawableM54286k = C22890g.m54288m(C22890g.m54277b(context, R$attr.upColor), 0.0f, 2, null);
        } else {
            double dM66646f = C27039d.m66646f(tradeItemBean.getChangeRate());
            Context context2 = baseViewHolder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            drawableM54286k = C22890g.m54286k(dM66646f, context2);
        }
        BaseViewHolder gone3 = C22890g.m54293r(gone2, i14, drawableM54286k).setGone(R$id.tv_ready, m50215k() && z15);
        if (!z15) {
            strM50219q = m50219q(tradeItemBean);
        }
        BaseViewHolder text4 = gone3.setText(i15, strM50219q);
        int i16 = R$id.tv_label_new;
        if (m50215k()) {
            z12 = false;
        } else {
            FutureTradeItemBean futureTradeItemBean = tradeItemBean instanceof FutureTradeItemBean ? (FutureTradeItemBean) tradeItemBean : null;
            if (futureTradeItemBean != null && C46566a0.m102722d(futureTradeItemBean)) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        BaseViewHolder gone4 = text4.setGone(i16, z12).setGone(R$id.tv_label_rwa, m50215k() && tradeItemBean.isRWA());
        int i17 = R$id.iv_hot_tag;
        if (m50215k()) {
            z13 = false;
        } else {
            FutureTradeItemBean futureTradeItemBean2 = tradeItemBean instanceof FutureTradeItemBean ? (FutureTradeItemBean) tradeItemBean : null;
            if (futureTradeItemBean2 != null && C46566a0.m102721c(futureTradeItemBean2)) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        BaseViewHolder gone5 = gone4.setGone(i17, z13);
        int i18 = R$id.fundingRateMarketCapInfoTv;
        SymbolsSortType symbolsSortType = this.f41063o;
        gone5.setGone(i18, symbolsSortType == SymbolsSortType.FUNDING_RATE || symbolsSortType == SymbolsSortType.MARKET_CAP).setText(i18, m50222i(tradeItemBean));
        String coinLabel = tradeItemBean.getCoinLabel();
        if (coinLabel == null) {
            coinLabel = "";
        }
        if (coinLabel.length() > 10) {
            StringBuilder sb3 = new StringBuilder();
            String strSubstring = coinLabel.substring(0, 7);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb3.append(strSubstring);
            sb3.append("...");
            coinLabel = sb3.toString();
        }
        int i19 = R$id.tv_fee;
        BaseViewHolder text5 = baseViewHolder.setText(i19, coinLabel);
        if (m50215k() && this.f41062n) {
            if (coinLabel.length() > 0) {
                z14 = true;
            }
        }
        text5.setGone(i19, z14);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable TradeItemBean tradeItemBean) {
        if (baseViewHolder == null || tradeItemBean == null) {
            return;
        }
        C44128b.m97266j(BaseQuickAdapter.TAG, "symbolType=" + this.f41058j + ", isTrade=" + this.f41057i + ",item=" + tradeItemBean.getSymbol());
        m50225p(baseViewHolder, tradeItemBean);
        m50216l(baseViewHolder, tradeItemBean);
        C46588u.m102742a(tradeItemBean, false).mo102718a(baseViewHolder, tradeItemBean);
        m50217m(baseViewHolder, tradeItemBean);
        m50218o(baseViewHolder, tradeItemBean);
    }

    /* JADX INFO: renamed from: h */
    public final void m50221h(@NotNull Collection<? extends TradeItemBean> data, @NotNull String quote) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(quote, "quote");
        this.f41060l = quote;
        if (TextUtils.isEmpty(quote)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (TradeItemBean tradeItemBean : data) {
            if (Intrinsics.areEqual(tradeItemBean.getSymbolInfoEntity().getQuoteCurrency(), quote)) {
                arrayList.add(tradeItemBean);
            }
        }
        super.replaceData(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public final String m50222i(TradeItemBean tradeItemBean) {
        SymbolsSortType symbolsSortType = this.f41063o;
        if (symbolsSortType == SymbolsSortType.FUNDING_RATE) {
            BigDecimal bigDecimal = tradeItemBean.fundingRate;
            return C42180b.m92649n(bigDecimal != null ? C42180b.m92642g(bigDecimal, null, null, 4, true, false, true, 19, null) : null);
        }
        if (symbolsSortType != SymbolsSortType.MARKET_CAP) {
            return "--";
        }
        BigDecimal bigDecimal2 = tradeItemBean.marketCap;
        return C41014a.m89929c(bigDecimal2 != null ? new BigDecimal(String.valueOf(C41014a.m89939m(bigDecimal2.doubleValue(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency()))) : null, false, true, 1, null);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: n */
    public final void m50224n(int i11) {
        this.f41061m = i11;
    }

    /* JADX INFO: renamed from: p */
    public final void m50225p(BaseViewHolder baseViewHolder, TradeItemBean tradeItemBean) {
        View view = baseViewHolder.getView(R$id.root_view);
        if (baseViewHolder.getAdapterPosition() == this.f41061m) {
            view.setBackgroundResource(R$color.c_cover2);
        } else {
            view.setBackgroundResource(R$drawable.selector_darkoverlay_click);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m50226r(@NotNull SymbolsSortType curSymbolSortType) {
        Intrinsics.checkNotNullParameter(curSymbolSortType, "curSymbolSortType");
        this.f41063o = curSymbolSortType;
        notifyDataSetChanged();
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public void replaceData(@NotNull Collection<? extends TradeItemBean> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (TextUtils.isEmpty(this.f41060l)) {
            super.replaceData(data);
            return;
        }
        String str = this.f41060l;
        Intrinsics.checkNotNull(str);
        m50221h(data, str);
    }

    /* JADX INFO: renamed from: m */
    private final void m50217m(BaseViewHolder baseViewHolder, TradeItemBean tradeItemBean) {
        int i11;
        if (m50215k() && tradeItemBean.getSymbolInfoEntity().isEtfSymbol()) {
            C37890n c37890n = C37890n.f85269a;
            String baseCurrency = tradeItemBean.getSymbolInfoEntity().getBaseCurrency();
            Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
            EtfCoinEntity etfCoinEntityM85615w = c37890n.m85615w(baseCurrency);
            if (etfCoinEntityM85615w != null) {
                int i12 = R$id.tv_etf_label;
                Context context = this.mContext;
                if (Intrinsics.areEqual(etfCoinEntityM85615w.getBuyType(), "L")) {
                    i11 = R$string.etf_label_times_long;
                } else {
                    i11 = R$string.etf_label_times_short;
                }
                baseViewHolder.setText(i12, context.getString(i11, etfCoinEntityM85615w.getMultiple()));
                TextView textView = (TextView) baseViewHolder.getView(i12);
                boolean zAreEqual = Intrinsics.areEqual(etfCoinEntityM85615w.getBuyType(), "L");
                Context mContext = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                textView.setTextColor(C22890g.m54281f(mContext, zAreEqual));
                Context mContext2 = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                textView.setBackgroundDrawable(C22890g.m54290o(zAreEqual, mContext2));
                return;
            }
            baseViewHolder.setGone(R$id.tv_etf_label, false);
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m50218o(BaseViewHolder baseViewHolder, TradeItemBean tradeItemBean) {
        boolean z11;
        String strM51857h;
        if (tradeItemBean.getSymbolInfoEntity().isPreviewEnableShow() && this.f41057i) {
            z11 = true;
        } else {
            z11 = false;
        }
        View view = baseViewHolder.getView(R$id.tv_value);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, null, false, 3, null);
        UpDownColorTextView upDownColorTextView = (UpDownColorTextView) baseViewHolder.getView(R$id.tv_price);
        Intrinsics.checkNotNull(upDownColorTextView);
        C44172b.m97383c(upDownColorTextView, null, false, 3, null);
        upDownColorTextView.setVisibleToUser(false);
        if (z11) {
            strM51857h = C33820nf.f71144W;
        } else {
            strM51857h = QuoteExKt.m51857h(C37886j.m85579c(new BigDecimal(String.valueOf(tradeItemBean.getLastDealPrice())), tradeItemBean.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null));
        }
        upDownColorTextView.setText(strM51857h);
    }

    /* JADX INFO: renamed from: q */
    private final String m50219q(TradeItemBean tradeItemBean) {
        return C37885i.m85566e(tradeItemBean.getValue(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency());
    }

    /* JADX INFO: renamed from: j */
    public final boolean m50223j() {
        if (getRecyclerView() == null) {
            return true;
        }
        return false;
    }
}
