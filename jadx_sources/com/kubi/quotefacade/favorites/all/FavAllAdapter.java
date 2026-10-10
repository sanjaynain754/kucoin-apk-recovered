package com.kubi.quotefacade.favorites.all;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.C5275i0;
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
import com.kubi.quotefacade.entity.AllTradeItemBean;
import com.kubi.quotefacade.helper.C22212u1;
import com.kubi.quotefacade.helper.PriceAlertVisibilityHelper;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.TradePairFlexboxView;
import com.kubi.resources.widget.UpDownColorTextView;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
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
import p809yu.C46591x;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import rs.C44172b;

/* JADX INFO: compiled from: FavAllAdapter.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bH\u0007J\u001c\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u0016\u0010\u001f\u001a\u00020\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0016J\f\u0010\"\u001a\u00020\u0005*\u00020\u001bH\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u001e\u0010%\u001a\u00020\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!2\u0006\u0010&\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/TradeItemBean;", "Lio/chad/library/adapter/base/BaseViewHolder;", "isTrade", "", "isHomeRank", "symbolType", "", "<init>", "(ZZLjava/lang/Integer;)V", "Ljava/lang/Integer;", "filterKey", "", "longClickPosition", "isShowFee", "isNotBindRecyclerView", "setIsShowFee", "", "isShow", "setLongClickPosition", ViewProps.POSITION, "convert", "helper", "item", "setRootView", "setAlphaItemView", "Lcom/kubi/quotefacade/entity/AllTradeItemBean;", "setCommonView", "setETFView", "setPriceView", "replaceData", "data", "", "isSpotType", "isPreview", "showVolumeText", "filterData", "quote", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FavAllAdapter extends BaseQuickAdapter<TradeItemBean, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final boolean f41699i;

    /* JADX INFO: renamed from: j */
    public final boolean f41700j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final Integer f41701k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public String f41702l;

    /* JADX INFO: renamed from: m */
    public int f41703m;

    /* JADX INFO: renamed from: n */
    public boolean f41704n;

    public FavAllAdapter(boolean z11, boolean z12, @Nullable Integer num) {
        super(R$layout.item_list_favorite);
        this.f41699i = z11;
        this.f41700j = z12;
        this.f41701k = num;
        this.f41703m = -1;
        this.f41704n = true;
        setHasStableIds(true);
    }

    /* JADX INFO: renamed from: i */
    private final void m51385i(Collection<? extends TradeItemBean> collection, String str) {
        this.f41702l = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (TradeItemBean tradeItemBean : collection) {
            if (Intrinsics.areEqual(tradeItemBean.getSymbolInfoEntity().getQuoteCurrency(), str)) {
                arrayList.add(tradeItemBean);
            }
        }
        super.replaceData(arrayList);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m51386n(BaseViewHolder baseViewHolder, AllTradeItemBean allTradeItemBean) {
        BaseTextView tradePairView;
        TradePairFlexboxView tradePairFlexboxView = (TradePairFlexboxView) baseViewHolder.getView(R$id.tv_trade_pair_box);
        if (tradePairFlexboxView != null && (tradePairView = tradePairFlexboxView.getTradePairView()) != null) {
            tradePairView.setText(C27041f.m66669i(allTradeItemBean.getShowSymbol(), "--"));
        }
        boolean z11 = false;
        baseViewHolder.setGone(R$id.tv_lever, false);
        baseViewHolder.setGone(R$id.tv_quote, false);
        baseViewHolder.setGone(R$id.label_prep_group, false);
        baseViewHolder.setGone(R$id.tv_label_st, false);
        baseViewHolder.setGone(R$id.tv_ready, false);
        baseViewHolder.setGone(R$id.tv_fee, false);
        baseViewHolder.setGone(R$id.tv_etf_label, false);
        baseViewHolder.setGone(R$id.tv_label_new, false);
        baseViewHolder.setGone(R$id.tv_label_rwa, false);
        baseViewHolder.setGone(R$id.tv_label_stock_token, false);
        baseViewHolder.setGone(R$id.iv_warning_tag, false);
        baseViewHolder.setGone(R$id.tv_money_price, false);
        baseViewHolder.setText(R$id.tv_value, C22212u1.m52120b(String.valueOf(allTradeItemBean.getValue())));
        UpDownColorTextView upDownColorTextView = (UpDownColorTextView) baseViewHolder.getView(R$id.tv_price);
        Intrinsics.checkNotNull(upDownColorTextView);
        String strM93915p = null;
        C44172b.m97383c(upDownColorTextView, null, false, 3, null);
        if (upDownColorTextView.getTag() != null && upDownColorTextView.getTag().equals(allTradeItemBean.getShowSymbol())) {
            z11 = true;
        }
        upDownColorTextView.setSameSymbol(Boolean.valueOf(z11));
        upDownColorTextView.setTag(allTradeItemBean.getShowSymbol());
        upDownColorTextView.setText(C22212u1.m52119a(new BigDecimal(String.valueOf(allTradeItemBean.getLastDealPrice()))));
        int i11 = R$id.tv_change_rate;
        Double changeRate = allTradeItemBean.getChangeRate();
        if (changeRate != null) {
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(changeRate.doubleValue()));
            strM93915p = C42828b.m93915p(C42828b.m93911l(C42180b.m92642g(bigDecimal, null, null, C41014a.m89951y(bigDecimal), true, false, false, 19, null)));
        }
        BaseViewHolder text = baseViewHolder.setText(i11, C42180b.m92647l(strM93915p));
        Intrinsics.checkNotNullExpressionValue(text, "setText(...)");
        double dM66646f = C27039d.m66646f(allTradeItemBean.getChangeRate());
        Context context = baseViewHolder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C22890g.m54293r(text, i11, C22890g.m54286k(dM66646f, context));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    private final void m51387s(BaseViewHolder baseViewHolder) {
        View view = baseViewHolder.getView(R$id.root_view);
        if (baseViewHolder.getAdapterPosition() == this.f41703m) {
            view.setBackgroundResource(R$color.c_cover2);
        } else {
            view.setBackgroundResource(R$drawable.selector_darkoverlay_click);
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable TradeItemBean tradeItemBean) {
        if (baseViewHolder == null || tradeItemBean == null || !(tradeItemBean instanceof AllTradeItemBean)) {
            return;
        }
        m51387s(baseViewHolder);
        AllTradeItemBean allTradeItemBean = (AllTradeItemBean) tradeItemBean;
        if (allTradeItemBean.getCollectType() == 5) {
            m51392m(baseViewHolder, allTradeItemBean);
            if (this.f41700j) {
                new C46591x().mo102718a(baseViewHolder, tradeItemBean);
                return;
            }
            return;
        }
        m51393o(baseViewHolder, allTradeItemBean);
        C46588u.m102742a(tradeItemBean, this.f41700j).mo102718a(baseViewHolder, tradeItemBean);
        m51394p(baseViewHolder, allTradeItemBean);
        m51396r(baseViewHolder, allTradeItemBean);
    }

    /* JADX INFO: renamed from: m */
    public final void m51392m(final BaseViewHolder baseViewHolder, final AllTradeItemBean allTradeItemBean) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.favorites.all.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FavAllAdapter.m51386n(baseViewHolder, allTradeItemBean);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m51393o(BaseViewHolder baseViewHolder, AllTradeItemBean allTradeItemBean) {
        CharSequence charSequenceM89960g;
        String strM93915p;
        String strM92647l;
        Drawable drawableM54286k;
        boolean zM51390k = m51390k(allTradeItemBean);
        C46566a0.m102719a(allTradeItemBean, m51391l(allTradeItemBean), baseViewHolder);
        BaseViewHolder visible = baseViewHolder.setVisible(R$id.iv_warning_tag, PriceAlertVisibilityHelper.f42102a.m52117d(allTradeItemBean.getCollectType() == 2, allTradeItemBean.isAlarm(), this.f41699i));
        int i11 = R$id.tv_lever;
        BaseViewHolder gone = visible.setGone(i11, !allTradeItemBean.getSymbolInfoEntity().isEtfSymbol() && allTradeItemBean.getMaxLeverage() > 0 && C38183a.m86145a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(allTradeItemBean.getMaxLeverage());
        sb2.append('x');
        BaseViewHolder text = gone.setText(i11, sb2.toString());
        int i12 = R$id.tv_money_price;
        String strM51397t = C33820nf.f71144W;
        if (zM51390k) {
            charSequenceM89960g = C33820nf.f71144W;
        } else {
            allTradeItemBean.getLastDealPrice();
            double lastDealPrice = allTradeItemBean.getLastDealPrice();
            SymbolInfoEntity symbolInfoEntity = allTradeItemBean.getSymbolInfoEntity();
            charSequenceM89960g = C41015b.m89960g(new BigDecimal(String.valueOf(C41014a.m89939m(lastDealPrice, symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null))), null, null, 0, 7, null);
        }
        BaseViewHolder text2 = text.setText(i12, charSequenceM89960g);
        int i13 = R$id.tv_change_rate;
        if (zM51390k) {
            strM92647l = C33820nf.f71144W;
        } else {
            Double changeRate = allTradeItemBean.getChangeRate();
            if (changeRate != null) {
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(changeRate.doubleValue()));
                strM93915p = C42828b.m93915p(C42828b.m93911l(C42180b.m92642g(bigDecimal, null, null, C41014a.m89951y(bigDecimal), true, false, false, 19, null)));
            } else {
                strM93915p = null;
            }
            strM92647l = C42180b.m92647l(strM93915p);
        }
        BaseViewHolder text3 = text2.setText(i13, strM92647l);
        int i14 = R$id.tv_value;
        BaseViewHolder gone2 = text3.setGone(i14, this.f41699i).setGone(R$id.tv_etf_label, m51391l(allTradeItemBean) && allTradeItemBean.getSymbolInfoEntity().isEtfSymbol()).setGone(R$id.tv_label_st, m51391l(allTradeItemBean) && !this.f41700j && allTradeItemBean.getMark() == 1);
        Intrinsics.checkNotNullExpressionValue(gone2, "setGone(...)");
        if (zM51390k) {
            Context context = baseViewHolder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            drawableM54286k = C22890g.m54288m(C22890g.m54277b(context, R$attr.upColor), 0.0f, 2, null);
        } else {
            double dM66646f = C27039d.m66646f(allTradeItemBean.getChangeRate());
            Context context2 = baseViewHolder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            drawableM54286k = C22890g.m54286k(dM66646f, context2);
        }
        BaseViewHolder gone3 = C22890g.m54293r(gone2, i13, drawableM54286k).setGone(R$id.tv_ready, m51391l(allTradeItemBean) && !this.f41700j && zM51390k);
        if (!zM51390k) {
            strM51397t = m51397t(allTradeItemBean);
        }
        gone3.setText(i14, strM51397t).setGone(R$id.tv_label_new, false).setGone(R$id.tv_label_rwa, false).setGone(R$id.tv_label_stock_token, false);
        String coinLabel = allTradeItemBean.getCoinLabel();
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
        int i15 = R$id.tv_fee;
        baseViewHolder.setText(i15, coinLabel).setGone(i15, m51391l(allTradeItemBean) && !this.f41700j && this.f41704n && coinLabel.length() > 0);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: q */
    public final void m51395q(int i11) {
        this.f41703m = i11;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public void replaceData(@NotNull Collection<? extends TradeItemBean> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (TextUtils.isEmpty(this.f41702l)) {
            super.replaceData(data);
            return;
        }
        String str = this.f41702l;
        Intrinsics.checkNotNull(str);
        m51385i(data, str);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m51389j() {
        if (getRecyclerView() == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m51390k(AllTradeItemBean allTradeItemBean) {
        if (allTradeItemBean.getSymbolInfoEntity().isPreviewEnableShow() && this.f41699i && allTradeItemBean.getLastDealPrice() <= 0.0d) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m51391l(AllTradeItemBean allTradeItemBean) {
        if (allTradeItemBean.getCollectType() == 1 || allTradeItemBean.getCollectType() == 3) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m51394p(BaseViewHolder baseViewHolder, AllTradeItemBean allTradeItemBean) {
        int i11;
        if (m51391l(allTradeItemBean) && allTradeItemBean.getSymbolInfoEntity().isEtfSymbol()) {
            C37890n c37890n = C37890n.f85269a;
            String baseCurrency = allTradeItemBean.getSymbolInfoEntity().getBaseCurrency();
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

    /* JADX INFO: renamed from: r */
    public final void m51396r(BaseViewHolder baseViewHolder, AllTradeItemBean allTradeItemBean) {
        int iM6236a;
        String strM51857h;
        boolean zM51390k = m51390k(allTradeItemBean);
        View view = baseViewHolder.getView(R$id.tv_value);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        TextView textViewM97383c = C44172b.m97383c((TextView) view, null, false, 3, null);
        ViewGroup.LayoutParams layoutParams = textViewM97383c.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (allTradeItemBean.getSymbolInfoEntity().isEtfSymbol()) {
            iM6236a = C5275i0.m6236a(4.0f);
        } else {
            iM6236a = 0;
        }
        layoutParams2.setMarginStart(iM6236a);
        textViewM97383c.setLayoutParams(layoutParams2);
        UpDownColorTextView upDownColorTextView = (UpDownColorTextView) baseViewHolder.getView(R$id.tv_price);
        Intrinsics.checkNotNull(upDownColorTextView);
        C44172b.m97383c(upDownColorTextView, null, false, 3, null);
        upDownColorTextView.setVisibleToUser(false);
        if (zM51390k) {
            strM51857h = C33820nf.f71144W;
        } else {
            strM51857h = QuoteExKt.m51857h(C37886j.m85579c(new BigDecimal(String.valueOf(allTradeItemBean.getLastDealPrice())), allTradeItemBean.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null));
        }
        upDownColorTextView.setText(strM51857h);
    }

    /* JADX INFO: renamed from: t */
    public final String m51397t(AllTradeItemBean allTradeItemBean) {
        return C37885i.m85566e(allTradeItemBean.getValue(), allTradeItemBean.getSymbolInfoEntity().getQuoteCurrency());
    }
}
