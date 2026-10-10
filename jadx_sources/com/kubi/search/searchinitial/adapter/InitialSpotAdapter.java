package com.kubi.search.searchinitial.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.TradePairNameTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.search.R$color;
import com.kubi.search.R$id;
import com.kubi.search.R$layout;
import com.kubi.search.searchinitial.adapter.InitialSpotAdapter;
import com.kubi.search.utils.SearchExKt;
import com.kubi.search.utils.SearchTrack;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33954u6;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nf.C42828b;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p311hf.C38183a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rs.C44172b;
import s10.InterfaceC44269c;

/* JADX INFO: compiled from: InitialSpotAdapter.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002J\u0014\u0010\f\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002J\u001e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u001c\u0010\u0016\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0010H\u0002J \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001b*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0004H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/search/searchinitial/adapter/InitialSpotAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/kubi/data/entity/TradeItemBean;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "hasOblyOnePage", "", "refreshDataList", "", "dataList", "updateWSData", "list", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "pageWidth", "", "pageHeight", "dp16", "convert", "helper", "item", "renderItem", "baseCount", "onItemClick", ViewProps.POSITION, "getSortNumber", "Lkotlin/Pair;", "", "exposeList", "", "onViewAttachedToWindow", C33954u6.f72238i, "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"NotifyDataSetChanged"})
@SourceDebugExtension({"SMAP\nInitialSpotAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitialSpotAdapter.kt\ncom/kubi/search/searchinitial/adapter/InitialSpotAdapter\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n25#2,3:193\n15#3,2:196\n2756#4:198\n2756#4:200\n295#4,2:202\n1869#4,2:204\n1#5:199\n1#5:201\n*S KotlinDebug\n*F\n+ 1 InitialSpotAdapter.kt\ncom/kubi/search/searchinitial/adapter/InitialSpotAdapter\n*L\n122#1:193,3\n173#1:196,2\n63#1:198\n64#1:200\n65#1:202,2\n175#1:204,2\n63#1:199\n64#1:201\n*E\n"})
public final class InitialSpotAdapter extends BaseQuickAdapter<List<? extends TradeItemBean>, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public boolean f48893i;

    /* JADX INFO: renamed from: j */
    public final int f48894j;

    /* JADX INFO: renamed from: k */
    public final int f48895k;

    /* JADX INFO: renamed from: l */
    public final int f48896l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final List<String> f48897m;

    public InitialSpotAdapter() {
        super(R$layout.search_item_initial_page_spot);
        setHasStableIds(true);
        this.f48894j = C27040e.m66658b(312);
        this.f48895k = C27040e.m66658b(296);
        this.f48896l = C27040e.m66658b(16);
        this.f48897m = new ArrayList();
    }

    /* JADX INFO: renamed from: o */
    private final void m59197o(final TradeItemBean tradeItemBean, int i11) {
        C27100x0.m66923d(new Function0() { // from class: t10.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InitialSpotAdapter.m59198p(tradeItemBean);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m59198p(TradeItemBean tradeItemBean) throws JSONException {
        ISpotService.m59982A(ISpotService.f49646a.get(), tradeItemBean.getSymbol(), null, null, null, 14, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("after_click_element_value", tradeItemBean.getSymbol());
        jSONObject.put("after_page_id", "B5candle");
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a("B1SearchOrSearchResultPage", FirebaseAnalytics.Event.SEARCH, "hotSearch", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m59199q(final InitialSpotAdapter initialSpotAdapter, final BaseViewHolder baseViewHolder) {
        C27100x0.m66923d(new Function0() { // from class: t10.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InitialSpotAdapter.m59200r(this.f98928b, baseViewHolder);
            }
        });
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull List<? extends TradeItemBean> item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        final int bindingAdapterPosition = helper.getBindingAdapterPosition() * 5;
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.recyclerView);
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, C27040e.m66658b(296));
        }
        if (this.f48893i) {
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -2;
            marginLayoutParams.setMarginStart(this.f48896l);
            marginLayoutParams.setMarginEnd(this.f48896l);
        } else {
            boolean z11 = helper.getBindingAdapterPosition() == 0;
            marginLayoutParams.width = this.f48894j;
            marginLayoutParams.height = this.f48895k;
            marginLayoutParams.setMarginStart(z11 ? this.f48896l : 0);
            marginLayoutParams.setMarginEnd(z11 ? C27040e.m66658b(12) : this.f48896l);
        }
        recyclerView.setLayoutParams(marginLayoutParams);
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(new BaseQuickAdapter<TradeItemBean, BaseViewHolder>(item, R$layout.search_item_initial_page_spot_item) { // from class: com.kubi.search.searchinitial.adapter.InitialSpotAdapter.convert.1
                @Override // io.chad.library.adapter.base.BaseQuickAdapter
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public void convert(BaseViewHolder baseViewHolder, TradeItemBean tradeItemBean) {
                    if (tradeItemBean == null || baseViewHolder == null) {
                        return;
                    }
                    this.m59206t(baseViewHolder, bindingAdapterPosition, tradeItemBean);
                }
            });
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull final BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        C42917g.m94137c().execute(new Runnable() { // from class: t10.f
            @Override // java.lang.Runnable
            public final void run() {
                InitialSpotAdapter.m59199q(this.f98923b, holder);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m59205s(@NotNull List<? extends List<? extends TradeItemBean>> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.f48893i = dataList.size() == 1;
        setNewData(dataList);
    }

    /* JADX INFO: renamed from: t */
    public final void m59206t(final BaseViewHolder baseViewHolder, int i11, final TradeItemBean tradeItemBean) {
        String strM92642g;
        Pair<String, Integer> pairM59204n = m59204n(baseViewHolder, i11);
        int i12 = R$id.tvSort;
        baseViewHolder.setText(i12, pairM59204n.getFirst());
        baseViewHolder.setTextColor(i12, pairM59204n.getSecond().intValue());
        TradePairNameTextView tradePairNameTextView = (TradePairNameTextView) baseViewHolder.getView(R$id.tvTradePair);
        if (tradePairNameTextView != null) {
            String baseCurrencyName = tradeItemBean.getSymbolInfoEntity().getBaseCurrencyName();
            Intrinsics.checkNotNullExpressionValue(baseCurrencyName, "getBaseCurrencyName(...)");
            String quoteCurrencyName = tradeItemBean.getSymbolInfoEntity().getQuoteCurrencyName();
            Intrinsics.checkNotNullExpressionValue(quoteCurrencyName, "getQuoteCurrencyName(...)");
            tradePairNameTextView.m54910l(baseCurrencyName, quoteCurrencyName);
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC44269c.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC44269c) objM56186h).m97688a(baseViewHolder);
        } else {
            int i13 = R$id.tv_lever;
            baseViewHolder.setGone(i13, tradeItemBean.getSymbolInfoEntity().isShowMarginLeverLabel() && C38183a.m86145a());
            baseViewHolder.setText(i13, IMarginService.f32724a.get().mo37960t(tradeItemBean));
        }
        int i14 = R$id.tvPrice;
        View view = baseViewHolder.getView(i14);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        String strM93911l = null;
        C44172b.m97383c((TextView) view, null, false, 3, null);
        baseViewHolder.setText(i14, tradeItemBean.getSymbolInfoEntity().isPreviewEnableShow() ? C33820nf.f71144W : SearchExKt.m59535q(Double.valueOf(tradeItemBean.getLastDealPrice()), tradeItemBean.getSymbol()));
        int i15 = R$id.tvRate;
        baseViewHolder.setGone(i15, !tradeItemBean.getSymbolInfoEntity().isPreviewEnableShow());
        Double changeRate = tradeItemBean.getChangeRate();
        BigDecimal bigDecimal = changeRate != null ? new BigDecimal(String.valueOf(changeRate.doubleValue())) : null;
        if (bigDecimal != null && (strM92642g = C42180b.m92642g(bigDecimal, null, null, 0, true, false, false, 55, null)) != null) {
            strM93911l = C42828b.m93911l(strM92642g);
        }
        String strM93915p = C42828b.m93915p(strM93911l);
        if (strM93915p == null) {
            strM93915p = "--";
        }
        baseViewHolder.setText(i15, strM93915p);
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        baseViewHolder.setTextColor(i15, C22890g.m54278c(mContext, C27039d.m66647g(bigDecimal), R$color.c_text40));
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66710y(itemView, 1000L, new Function0() { // from class: t10.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InitialSpotAdapter.m59201u(this.f98925b, tradeItemBean, baseViewHolder);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m59207v(@NotNull final List<WsMarketSnapshotEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        C27100x0.m66924e(new Function0() { // from class: t10.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InitialSpotAdapter.m59202w(list, this);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m59200r(InitialSpotAdapter initialSpotAdapter, BaseViewHolder baseViewHolder) throws JSONException {
        List<? extends TradeItemBean> item = initialSpotAdapter.getItem(baseViewHolder.getBindingAdapterPosition());
        if (item != null) {
            for (TradeItemBean tradeItemBean : item) {
                if (!initialSpotAdapter.f48897m.contains(tradeItemBean.getSymbol())) {
                    SearchTrack searchTrack = SearchTrack.f49158a;
                    String symbol = tradeItemBean.getSymbolInfoEntity().getSymbol();
                    Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                    searchTrack.m59612h("topSearch", symbol, baseViewHolder.getBindingAdapterPosition() + 1, tradeItemBean.getChangeRate(), C33556b3.f68963J, false);
                    List<String> list = initialSpotAdapter.f48897m;
                    String symbol2 = tradeItemBean.getSymbol();
                    Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
                    list.add(symbol2);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m59201u(InitialSpotAdapter initialSpotAdapter, TradeItemBean tradeItemBean, BaseViewHolder baseViewHolder) {
        initialSpotAdapter.m59197o(tradeItemBean, baseViewHolder.getBindingAdapterPosition());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m59202w(List list, InitialSpotAdapter initialSpotAdapter) {
        Object next;
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        Iterator<T> it = initialSpotAdapter.getData().iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            for (TradeItemBean tradeItemBean : (List) it.next()) {
                Iterator it2 = list.iterator();
                do {
                    if (it2.hasNext()) {
                        next = it2.next();
                    } else {
                        next = null;
                        break;
                    }
                } while (!Intrinsics.areEqual(((WsMarketSnapshotEntity) next).getSymbolCode(), tradeItemBean.getSymbol()));
                WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) next;
                if (wsMarketSnapshotEntity != null && tradeItemBean.getLastDealPrice() != wsMarketSnapshotEntity.getLastTradedPrice() && !Intrinsics.areEqual(tradeItemBean.getChangeRate(), wsMarketSnapshotEntity.getChangeRate())) {
                    tradeItemBean.setLastDealPrice(wsMarketSnapshotEntity.getLastTradedPrice());
                    tradeItemBean.setChangeRate(Double.valueOf(wsMarketSnapshotEntity.getChangeRate()));
                    z11 = true;
                }
            }
        }
        if (z11) {
            initialSpotAdapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public final Pair<String, Integer> m59204n(BaseViewHolder baseViewHolder, int i11) {
        int iM66699n;
        int bindingAdapterPosition = i11 + baseViewHolder.getBindingAdapterPosition() + 1;
        String strValueOf = String.valueOf(bindingAdapterPosition);
        if (bindingAdapterPosition != 1) {
            if (bindingAdapterPosition != 2) {
                if (bindingAdapterPosition != 3) {
                    Context mContext = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                    iM66699n = C27046k.m66699n(mContext, R$color.c_text30);
                } else {
                    Context mContext2 = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                    iM66699n = C27046k.m66699n(mContext2, R$color.brandGreen);
                }
            } else {
                Context mContext3 = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext3, "mContext");
                iM66699n = C27046k.m66699n(mContext3, R$color.complementary);
            }
        } else {
            Context mContext4 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext4, "mContext");
            iM66699n = C27046k.m66699n(mContext4, R$color.brandRed);
        }
        return TuplesKt.m90091to(strValueOf, Integer.valueOf(iM66699n));
    }
}
