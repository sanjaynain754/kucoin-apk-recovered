package com.kubi.search.searchinitial.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.WsFutureSnapshotEntity;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.TradePairNameTextView;
import com.kubi.search.R$id;
import com.kubi.search.R$layout;
import com.kubi.search.entity.ContractEntity;
import com.kubi.search.entity.ContractTradeItemBean;
import com.kubi.search.searchinitial.adapter.InitialFutureAdapter;
import com.kubi.search.utils.SearchExKt;
import com.kubi.search.utils.SearchTrack;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33954u6;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k00.C40837a;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rs.C44172b;

/* JADX INFO: compiled from: InitialFutureAdapter.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u001c\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014J\u0014\u0010\u000e\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0003H\u0016R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/search/searchinitial/adapter/InitialFutureAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/search/entity/ContractTradeItemBean;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "updateWSData", "", "list", "", "Lcom/kubi/data/entity/WsFutureSnapshotEntity;", "convert", "helper", "item", "renderItem", "onItemClick", "exposeList", "", "", "onViewAttachedToWindow", C33954u6.f72238i, "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nInitialFutureAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitialFutureAdapter.kt\ncom/kubi/search/searchinitial/adapter/InitialFutureAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n2767#2:117\n1878#2,2:119\n295#2,2:121\n1880#2:123\n1#3:118\n*S KotlinDebug\n*F\n+ 1 InitialFutureAdapter.kt\ncom/kubi/search/searchinitial/adapter/InitialFutureAdapter\n*L\n43#1:117\n43#1:119,2\n44#1:121,2\n43#1:123\n43#1:118\n*E\n"})
public final class InitialFutureAdapter extends BaseQuickAdapter<ContractTradeItemBean, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<String> f48891i;

    public InitialFutureAdapter() {
        super(R$layout.search_item_initial_futures);
        this.f48891i = new ArrayList();
        setHasStableIds(true);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable ContractTradeItemBean contractTradeItemBean) {
        if (contractTradeItemBean == null || baseViewHolder == null) {
            return;
        }
        m59184m(baseViewHolder, contractTradeItemBean);
    }

    /* JADX INFO: renamed from: k */
    public final void m59183k(final ContractTradeItemBean contractTradeItemBean) {
        C27100x0.m66923d(new Function0() { // from class: t10.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InitialFutureAdapter.m59179l(contractTradeItemBean);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m59185o(@NotNull final List<WsFutureSnapshotEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        C27100x0.m66923d(new Function0() { // from class: t10.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InitialFutureAdapter.m59181p(list, this);
            }
        });
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull BaseViewHolder holder) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        ContractTradeItemBean item = getItem(holder.getBindingAdapterPosition());
        if (item == null) {
            return;
        }
        ContractEntity contract = item.getContract();
        String strM66668h = C27041f.m66668h(contract != null ? contract.getSymbol() : null);
        if (this.f48891i.contains(strM66668h)) {
            return;
        }
        SearchTrack searchTrack = SearchTrack.f49158a;
        int bindingAdapterPosition = holder.getBindingAdapterPosition() + 1;
        ContractEntity contract2 = item.getContract();
        searchTrack.m59612h("topFutures", strM66668h, bindingAdapterPosition, contract2 != null ? contract2.getPriceChgPct() : null, C33556b3.f68963J, false);
        this.f48891i.add(strM66668h);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m59179l(ContractTradeItemBean contractTradeItemBean) throws JSONException {
        String symbol;
        ContractEntity contract = contractTradeItemBean.getContract();
        String symbol2 = null;
        if (contract != null) {
            symbol = contract.getSymbol();
        } else {
            symbol = null;
        }
        String strM66668h = C27041f.m66668h(symbol);
        ContractEntity contract2 = contractTradeItemBean.getContract();
        if (contract2 != null) {
            symbol2 = contract2.getSymbol();
        }
        SearchExKt.m59539u(symbol2, C43852m.m96601m("B1SearchOrSearchResultPage", "topSearch", "2"));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("after_click_element_value", strM66668h);
        jSONObject.put("after_page_id", "B6FuturesCandle");
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a("B1SearchOrSearchResultPage", FirebaseAnalytics.Event.SEARCH, "trendingFutures", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m59180n(InitialFutureAdapter initialFutureAdapter, ContractTradeItemBean contractTradeItemBean) {
        initialFutureAdapter.m59183k(contractTradeItemBean);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m59181p(List list, InitialFutureAdapter initialFutureAdapter) {
        Double priceChgPct;
        Object next;
        Double lastPrice;
        ContractEntity contract;
        ContractEntity contract2;
        ContractEntity contract3;
        ContractEntity contract4;
        String symbol;
        String symbol2;
        ContractEntity contract5;
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        int i11 = 0;
        for (Object obj : initialFutureAdapter.getData()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ContractTradeItemBean contractTradeItemBean = (ContractTradeItemBean) obj;
            Iterator it = list.iterator();
            do {
                priceChgPct = null;
                if (it.hasNext()) {
                    next = it.next();
                    symbol = ((WsFutureSnapshotEntity) next).getSymbol();
                    if (contractTradeItemBean != null && (contract5 = contractTradeItemBean.getContract()) != null) {
                        symbol2 = contract5.getSymbol();
                    } else {
                        symbol2 = null;
                    }
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(symbol, symbol2));
            WsFutureSnapshotEntity wsFutureSnapshotEntity = (WsFutureSnapshotEntity) next;
            if (wsFutureSnapshotEntity != null) {
                if (contractTradeItemBean != null && (contract4 = contractTradeItemBean.getContract()) != null) {
                    lastPrice = contract4.getLastPrice();
                } else {
                    lastPrice = null;
                }
                if (!Intrinsics.areEqual(lastPrice, wsFutureSnapshotEntity.getLastPrice())) {
                    if (contractTradeItemBean != null && (contract3 = contractTradeItemBean.getContract()) != null) {
                        priceChgPct = contract3.getPriceChgPct();
                    }
                    if (!Intrinsics.areEqual(priceChgPct, wsFutureSnapshotEntity.getPriceChgPct())) {
                        if (contractTradeItemBean != null && (contract2 = contractTradeItemBean.getContract()) != null) {
                            contract2.setLastPrice(Double.valueOf(wsFutureSnapshotEntity.getLastPrice()));
                        }
                        if (contractTradeItemBean != null && (contract = contractTradeItemBean.getContract()) != null) {
                            contract.setPriceChgPct(Double.valueOf(wsFutureSnapshotEntity.getPriceChgPct()));
                        }
                        initialFutureAdapter.notifyItemChanged(i11);
                    }
                }
            }
            i11 = i12;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public final void m59184m(BaseViewHolder baseViewHolder, final ContractTradeItemBean contractTradeItemBean) {
        int iM66658b;
        int iM66658b2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        if (baseViewHolder.getBindingAdapterPosition() == 0) {
            iM66658b = C27040e.m66658b(16);
        } else {
            iM66658b = 0;
        }
        if (baseViewHolder.getBindingAdapterPosition() == getItemCount() - 1) {
            iM66658b2 = C27040e.m66658b(16);
        } else {
            iM66658b2 = C27040e.m66658b(12);
        }
        int i11 = iM66658b2;
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewExtKt.m66585p(itemView, iM66658b, 0, i11, 0, 10, null);
        ContractEntity contract = contractTradeItemBean.getContract();
        if (contract == null) {
            return;
        }
        TradePairNameTextView tradePairNameTextView = (TradePairNameTextView) baseViewHolder.getView(R$id.tvTradePair);
        BigDecimal bigDecimal = null;
        if (tradePairNameTextView != null) {
            C40837a binding = tradePairNameTextView.getBinding();
            if (binding != null && (baseTextView2 = binding.f90723d) != null) {
                C27046k.m66700o(baseTextView2);
            }
            C40837a binding2 = tradePairNameTextView.getBinding();
            if (binding2 != null && (baseTextView = binding2.f90722c) != null) {
                baseTextView.setText(IKuMexService.m33249T(IKuMexService.f28731a.get(), C27041f.m66668h(contract.getSymbol()), false, 2, null));
            }
        }
        int i12 = R$id.tvPrice;
        View view = baseViewHolder.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, null, false, 3, null);
        baseViewHolder.setText(i12, C42828b.m93915p(contractTradeItemBean.formatPrice()));
        Double priceChgPct = contract.getPriceChgPct();
        if (priceChgPct != null) {
            bigDecimal = new BigDecimal(String.valueOf(priceChgPct.doubleValue()));
        }
        int i13 = R$id.tvRate;
        baseViewHolder.setText(i13, C42828b.m93915p(C42828b.m93911l(contractTradeItemBean.formatChangeRate())));
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        baseViewHolder.setTextColor(i13, C22890g.m54279d(mContext, C27039d.m66647g(bigDecimal), 0, 2, null));
        View itemView2 = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        C27046k.m66710y(itemView2, 1000L, new Function0() { // from class: t10.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InitialFutureAdapter.m59180n(this.f98916b, contractTradeItemBean);
            }
        });
    }
}
