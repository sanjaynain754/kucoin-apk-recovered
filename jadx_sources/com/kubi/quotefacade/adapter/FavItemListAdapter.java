package com.kubi.quotefacade.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.R$attr;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$dimen;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.adapter.FavItemListAdapter;
import com.kubi.quotefacade.chain.C21781i;
import com.kubi.quotefacade.entity.AlphaFavEntity;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.entity.FutureTradeItemBean;
import com.kubi.quotefacade.helper.C22212u1;
import com.kubi.quotefacade.helper.PriceAlertVisibilityHelper;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ChainCoinLogoView;
import com.kubi.resources.widget.TradePairFlexboxView;
import com.kubi.resources.widget.UpDownColorTextView;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27034h;
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
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import rs.C44172b;

/* JADX INFO: compiled from: FavItemListAdapter.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\bH\u0007J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0003H\u0002J\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010!\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0016\u0010#\u001a\u00020\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0016J\b\u0010&\u001a\u00020\u0005H\u0002J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0010\u0010(\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u001e\u0010)\u001a\u00020\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020%2\u0006\u0010*\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/FavItemListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/TradeItemBean;", "Lio/chad/library/adapter/base/BaseViewHolder;", "isTrade", "", "isHomeRank", "symbolType", "", "<init>", "(ZZLjava/lang/Integer;)V", "Ljava/lang/Integer;", "filterKey", "", "firstVisiblePosition", "lastVisiblePosition", "longClickPosition", "isShowFee", "isNotBindRecyclerView", "setIsShowFee", "", "isShow", "setLongClickPosition", ViewProps.POSITION, "bindToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "convert", "helper", "item", "setRootView", "bindAlphaItemView", "setCommonView", "setETFView", "setPriceView", "replaceData", "data", "", "isSpotType", "isPreview", "showVolumeText", "filterData", "quote", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FavItemListAdapter extends BaseQuickAdapter<TradeItemBean, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final boolean f41043i;

    /* JADX INFO: renamed from: j */
    public final boolean f41044j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final Integer f41045k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public String f41046l;

    /* JADX INFO: renamed from: m */
    public int f41047m;

    /* JADX INFO: renamed from: n */
    public int f41048n;

    /* JADX INFO: renamed from: o */
    public int f41049o;

    /* JADX INFO: renamed from: p */
    public boolean f41050p;

    /* JADX INFO: renamed from: com.kubi.quotefacade.adapter.FavItemListAdapter$a */
    /* JADX INFO: compiled from: FavItemListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/adapter/FavItemListAdapter$bindToRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21569a extends RecyclerView.OnScrollListener {
        public C21569a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            FavItemListAdapter favItemListAdapter = FavItemListAdapter.this;
            favItemListAdapter.f41047m = linearLayoutManager.findFirstVisibleItemPosition();
            favItemListAdapter.f41048n = linearLayoutManager.findLastVisibleItemPosition();
        }
    }

    public FavItemListAdapter(boolean z11, boolean z12, @Nullable Integer num) {
        super(((num != null && num.intValue() == 6) || (num != null && num.intValue() == 7)) ? R$layout.item_list_alpha_coin_rank : R$layout.item_list_favorite);
        this.f41043i = z11;
        this.f41044j = z12;
        this.f41045k = num;
        this.f41048n = 15;
        this.f41049o = -1;
        this.f41050p = true;
        setHasStableIds(true);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m50191k(TradeItemBean tradeItemBean, BaseViewHolder baseViewHolder, FavItemListAdapter favItemListAdapter) {
        AlphaItemEntity itemEntity;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        AlphaFavEntity alphaFavEntity = tradeItemBean instanceof AlphaFavEntity ? (AlphaFavEntity) tradeItemBean : null;
        if (alphaFavEntity == null || (itemEntity = alphaFavEntity.getItemEntity()) == null) {
            return Unit.INSTANCE;
        }
        ChainCoinLogoView chainCoinLogoView = (ChainCoinLogoView) baseViewHolder.getView(R$id.logoView);
        if (chainCoinLogoView != null) {
            ChainCoinLogoView.m54460h(chainCoinLogoView, C27041f.m66668h(itemEntity.getTokenIcon()), C27041f.m66668h(itemEntity.getChainIcon()), C27041f.m66668h(itemEntity.getDisplayToken()), null, null, null, 56, null);
        }
        TradePairFlexboxView tradePairFlexboxView = (TradePairFlexboxView) baseViewHolder.getView(R$id.tradePairFlexboxView);
        if (tradePairFlexboxView != null) {
            BaseTextView tradePairView = tradePairFlexboxView.getTradePairView();
            if (tradePairView != null) {
                tradePairView.setText(C27041f.m66668h(itemEntity.getDisplayToken()));
            }
            ImageView labelViewHot = tradePairFlexboxView.getLabelViewHot();
            if (labelViewHot != null) {
                labelViewHot.setVisibility(Intrinsics.areEqual(itemEntity.getHot(), Boolean.TRUE) ? 0 : 8);
            }
        }
        baseViewHolder.setText(R$id.tvVol, C22212u1.m52120b(String.valueOf(itemEntity.getTradingVolume())));
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        boolean z11 = RangesKt.coerceAtLeast(favItemListAdapter.f41047m, bindingAdapterPosition) == RangesKt.coerceAtMost(favItemListAdapter.f41048n, bindingAdapterPosition);
        UpDownColorTextView upDownColorTextView = (UpDownColorTextView) baseViewHolder.getView(R$id.tvPrice);
        Intrinsics.checkNotNull(upDownColorTextView);
        C44172b.m97383c(upDownColorTextView, null, false, 3, null);
        upDownColorTextView.setSameSymbol(Boolean.valueOf(upDownColorTextView.getTag() != null && upDownColorTextView.getTag().equals(itemEntity.getToken())));
        upDownColorTextView.setTag(itemEntity.getToken());
        upDownColorTextView.setVisibleToUser(z11);
        upDownColorTextView.setText(C22212u1.m52119a(itemEntity.getPrice()));
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvRate);
        if (textView != null) {
            C27046k.m66685H(textView);
            textView.setText(C21781i.m50835a(itemEntity.getPriceRate(), false));
            double dDoubleValue = C27039d.m66654n(C41014a.m89922G(itemEntity.getPriceRate(), null, 1, null)).doubleValue();
            Context mContext = favItemListAdapter.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            textView.setBackground(C22890g.m54286k(dDoubleValue, mContext));
        }
        if (favItemListAdapter.f41044j && (viewGroup = (ViewGroup) baseViewHolder.getView(R$id.root_view)) != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            layoutParams.height = C27034h.m66633d(context, R$dimen.trade_cell_height);
            viewGroup.setLayoutParams(layoutParams);
            viewGroup.setPaddingRelative(C27040e.m66658b(12), 0, C27040e.m66658b(12), 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    private final void m50192m(Collection<? extends TradeItemBean> collection, String str) {
        this.f41046l = str;
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

    /* JADX INFO: renamed from: j */
    public final void m50193j(final BaseViewHolder baseViewHolder, final TradeItemBean tradeItemBean) {
        C27100x0.m66923d(new Function0() { // from class: yu.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FavItemListAdapter.m50191k(tradeItemBean, baseViewHolder, this);
            }
        });
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable TradeItemBean tradeItemBean) {
        Integer num;
        if (baseViewHolder == null || tradeItemBean == null) {
            return;
        }
        m50202u(baseViewHolder);
        Integer num2 = this.f41045k;
        if ((num2 != null && num2.intValue() == 6) || ((num = this.f41045k) != null && num.intValue() == 7)) {
            m50193j(baseViewHolder, tradeItemBean);
            return;
        }
        m50198q(baseViewHolder, tradeItemBean);
        C46588u.m102742a(tradeItemBean, this.f41044j).mo102718a(baseViewHolder, tradeItemBean);
        m50199r(baseViewHolder, tradeItemBean);
        m50201t(baseViewHolder, tradeItemBean);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m50197p() {
        Integer num;
        Integer num2 = this.f41045k;
        return (num2 != null && num2.intValue() == 1) || ((num = this.f41045k) != null && num.intValue() == 3);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0182  */
    /* JADX WARN: Code duplicated, block: B:75:0x019f  */
    /* JADX INFO: renamed from: q */
    public final void m50198q(BaseViewHolder baseViewHolder, TradeItemBean tradeItemBean) {
        SpannableStringBuilder spannableStringBuilderM89960g;
        String strM93915p;
        String strM92647l;
        Drawable drawableM54286k;
        boolean z11;
        boolean z12;
        boolean zM50196o = m50196o(tradeItemBean);
        C46566a0.m102719a(tradeItemBean, m50197p(), baseViewHolder);
        BaseViewHolder visible = baseViewHolder.setVisible(R$id.iv_warning_tag, PriceAlertVisibilityHelper.f42102a.m52117d(!m50197p(), tradeItemBean.isAlarm(), this.f41043i));
        int i11 = R$id.tv_lever;
        BaseViewHolder gone = visible.setGone(i11, !tradeItemBean.getSymbolInfoEntity().isEtfSymbol() && tradeItemBean.getMaxLeverage() > 0 && C38183a.m86145a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tradeItemBean.getMaxLeverage());
        sb2.append('x');
        BaseViewHolder text = gone.setText(i11, sb2.toString());
        int i12 = R$id.tv_money_price;
        String strM50203v = C33820nf.f71144W;
        if (zM50196o) {
            spannableStringBuilderM89960g = C33820nf.f71144W;
        } else {
            double lastDealPrice = tradeItemBean.getLastDealPrice();
            SymbolInfoEntity symbolInfoEntity = tradeItemBean.getSymbolInfoEntity();
            spannableStringBuilderM89960g = C41015b.m89960g(new BigDecimal(String.valueOf(C41014a.m89939m(lastDealPrice, symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null))), null, null, 0, 7, null);
        }
        BaseViewHolder text2 = text.setText(i12, spannableStringBuilderM89960g);
        int i13 = R$id.tv_change_rate;
        if (zM50196o) {
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
        BaseViewHolder text3 = text2.setText(i13, strM92647l);
        int i14 = R$id.tv_value;
        BaseViewHolder gone2 = text3.setGone(i14, this.f41043i).setGone(R$id.tv_etf_label, m50197p() && tradeItemBean.getSymbolInfoEntity().isEtfSymbol()).setGone(R$id.tv_label_st, m50197p() && !this.f41044j && tradeItemBean.getMark() == 1);
        Intrinsics.checkNotNullExpressionValue(gone2, "setGone(...)");
        if (zM50196o) {
            Context context = baseViewHolder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            drawableM54286k = C22890g.m54288m(C22890g.m54277b(context, R$attr.upColor), 0.0f, 2, null);
        } else {
            double dM66646f = C27039d.m66646f(tradeItemBean.getChangeRate());
            Context context2 = baseViewHolder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            drawableM54286k = C22890g.m54286k(dM66646f, context2);
        }
        BaseViewHolder gone3 = C22890g.m54293r(gone2, i13, drawableM54286k).setGone(R$id.tv_ready, m50197p() && !this.f41044j && zM50196o);
        if (!zM50196o) {
            strM50203v = m50203v(tradeItemBean);
        }
        BaseViewHolder text4 = gone3.setText(i14, strM50203v);
        int i15 = R$id.tv_label_new;
        if (m50197p()) {
            z11 = false;
        } else {
            FutureTradeItemBean futureTradeItemBean = tradeItemBean instanceof FutureTradeItemBean ? (FutureTradeItemBean) tradeItemBean : null;
            if (futureTradeItemBean == null || !C46566a0.m102722d(futureTradeItemBean)) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        BaseViewHolder gone4 = text4.setGone(i15, z11);
        int i16 = R$id.iv_hot_tag;
        if (!m50197p()) {
            FutureTradeItemBean futureTradeItemBean2 = tradeItemBean instanceof FutureTradeItemBean ? (FutureTradeItemBean) tradeItemBean : null;
            z12 = futureTradeItemBean2 != null && C46566a0.m102721c(futureTradeItemBean2);
        }
        gone4.setGone(i16, z12);
        String coinLabel = tradeItemBean.getCoinLabel();
        if (coinLabel == null) {
            coinLabel = "";
        }
        if (coinLabel.length() > 10) {
            Intrinsics.checkNotNullExpressionValue(coinLabel.substring(0, 7), "substring(...)");
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public void replaceData(@NotNull Collection<? extends TradeItemBean> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (TextUtils.isEmpty(this.f41046l)) {
            super.replaceData(data);
            return;
        }
        String str = this.f41046l;
        Intrinsics.checkNotNull(str);
        m50192m(data, str);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: s */
    public final void m50200s(int i11) {
        this.f41049o = i11;
    }

    /* JADX INFO: renamed from: u */
    public final void m50202u(BaseViewHolder baseViewHolder) {
        View view = baseViewHolder.getView(R$id.root_view);
        if (baseViewHolder.getAdapterPosition() == this.f41049o) {
            view.setBackgroundResource(R$color.c_cover2);
        } else {
            view.setBackgroundResource(R$drawable.selector_darkoverlay_click);
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public void bindToRecyclerView(@Nullable RecyclerView recyclerView) {
        super.bindToRecyclerView(recyclerView);
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new C21569a());
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m50195n() {
        if (getRecyclerView() == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m50196o(TradeItemBean tradeItemBean) {
        if (tradeItemBean.getSymbolInfoEntity().isPreviewEnableShow() && this.f41043i && tradeItemBean.getLastDealPrice() <= 0.0d) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m50199r(BaseViewHolder baseViewHolder, TradeItemBean tradeItemBean) {
        int i11;
        if (m50197p() && tradeItemBean.getSymbolInfoEntity().isEtfSymbol()) {
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

    /* JADX INFO: renamed from: t */
    public final void m50201t(BaseViewHolder baseViewHolder, TradeItemBean tradeItemBean) {
        String strM51857h;
        boolean zM50196o = m50196o(tradeItemBean);
        View view = baseViewHolder.getView(R$id.tv_value);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, null, false, 3, null);
        UpDownColorTextView upDownColorTextView = (UpDownColorTextView) baseViewHolder.getView(R$id.tv_price);
        Intrinsics.checkNotNull(upDownColorTextView);
        C44172b.m97383c(upDownColorTextView, null, false, 3, null);
        upDownColorTextView.setVisibleToUser(false);
        if (zM50196o) {
            strM51857h = C33820nf.f71144W;
        } else {
            strM51857h = QuoteExKt.m51857h(C37886j.m85579c(new BigDecimal(String.valueOf(tradeItemBean.getLastDealPrice())), tradeItemBean.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null));
        }
        upDownColorTextView.setText(strM51857h);
    }

    /* JADX INFO: renamed from: v */
    public final String m50203v(TradeItemBean tradeItemBean) {
        return C37885i.m85566e(tradeItemBean.getValue(), tradeItemBean.getSymbolInfoEntity().getQuoteCurrency());
    }
}
