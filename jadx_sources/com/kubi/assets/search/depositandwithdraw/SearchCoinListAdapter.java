package com.kubi.assets.search.depositandwithdraw;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.SearchCoinEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SubscriptionInfoEntity;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import e60.C37084b;
import gf.C37885i;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SearchCoinListAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u001e\u001a\u00020\n*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\rH\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\rH\u0002J\u001c\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0014J\u001c\u0010'\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020(2\u0006\u0010&\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010&\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/assets/entity/SearchCoinEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fromType", "", "data", "", "clearHistory", "Lkotlin/Function0;", "", "headerItemClickListener", "Lkotlin/Function2;", "Lcom/kubi/data/entity/CoinInfoEntity;", "", "<init>", "(ILjava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "getFromType", "()I", "mSearchHistoryCoinListAdapter", "Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;", "getMSearchHistoryCoinListAdapter", "()Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;", "mSearchHistoryCoinListAdapter$delegate", "Lkotlin/Lazy;", "mHotCoinListAdapter", "Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;", "getMHotCoinListAdapter", "()Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;", "mHotCoinListAdapter$delegate", "buildCoinListItem", "itemType", "item", "getItemEnabled", "", "getItemEnableSubscribe", "convert", "helper", "filterText", "replaceData", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchCoinListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinListAdapter.kt\ncom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
public final class SearchCoinListAdapter extends BaseMultiItemQuickAdapter<SearchCoinEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final int f18591i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Function0<Unit> f18592j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Function2<CoinInfoEntity, String, Unit> f18593k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final Lazy f18594l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Lazy f18595m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public String f18596n;

    public /* synthetic */ SearchCoinListAdapter(int i11, List list, Function0 function0, Function2 function2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 1 : i11, (i12 & 2) != 0 ? new ArrayList() : list, function0, function2);
    }

    /* JADX INFO: renamed from: o */
    private final boolean m19014o(CoinInfoEntity coinInfoEntity) {
        SubscriptionInfoEntity subscriptionInfo;
        SubscriptionInfoEntity subscriptionInfo2;
        String subscribeRecordId = null;
        if (!C27025c.m66566d((coinInfoEntity == null || (subscriptionInfo2 = coinInfoEntity.getSubscriptionInfo()) == null) ? null : subscriptionInfo2.getEnableSubscribe())) {
            return false;
        }
        if (coinInfoEntity != null && (subscriptionInfo = coinInfoEntity.getSubscriptionInfo()) != null) {
            subscribeRecordId = subscriptionInfo.getSubscribeRecordId();
        }
        return !TextUtils.isEmpty(C27041f.m66668h(subscribeRecordId));
    }

    /* JADX INFO: renamed from: p */
    private final boolean m19015p(CoinInfoEntity coinInfoEntity, int i11) {
        return i11 == 5 ? coinInfoEntity.isDepositEnabled() : coinInfoEntity.isWithdrawEnabled();
    }

    /* JADX INFO: renamed from: l */
    private final void m19012l(BaseViewHolder baseViewHolder, int i11, CoinInfoEntity coinInfoEntity) {
        double dM66646f = C27039d.m66646f(Double.valueOf(coinInfoEntity.getAvailableBalance()));
        int i12 = R$id.tv_coin_name;
        baseViewHolder.setText(i12, AssetExKt.m15123k(coinInfoEntity));
        baseViewHolder.setText(R$id.tv_coin_name_full, coinInfoEntity.getName());
        if (m19015p(coinInfoEntity, i11)) {
            baseViewHolder.setTextColor(i12, C27017c.f54310a.m66512a(R$color.emphasis));
            baseViewHolder.setGone(R$id.tv_pause, false);
            baseViewHolder.setGone(R$id.tv_subscript, false);
        } else {
            if (m19014o(coinInfoEntity)) {
                baseViewHolder.setGone(R$id.tv_subscript, true);
                baseViewHolder.setGone(R$id.tv_pause, false);
            } else {
                baseViewHolder.setGone(R$id.tv_subscript, false);
                baseViewHolder.setGone(R$id.tv_pause, true);
            }
            baseViewHolder.setTextColor(i12, C27017c.f54310a.m66512a(R$color.emphasis60));
        }
        if (i11 == 3) {
            int i13 = R$id.tv_balance;
            baseViewHolder.setGone(i13, !(dM66646f == 0.0d));
            baseViewHolder.setText(i13, C37885i.m85563b(new BigDecimal(String.valueOf(dM66646f)), coinInfoEntity.getCode(), 0, 2, null));
            int i14 = R$id.tv_legal_symbol_price;
            baseViewHolder.setGone(i14, !(dM66646f == 0.0d));
            baseViewHolder.setText(i14, C41014a.m89950x(C41014a.m89939m(dM66646f, coinInfoEntity.getCode()), null, null, 0, false, false, false, false, 127, null));
        } else if (i11 == 5 || i11 == 10) {
            baseViewHolder.setGone(R$id.tv_balance, false);
        }
        C24277v.m58540e(this.mContext, coinInfoEntity.getIconUrl(), (ImageView) baseViewHolder.getView(R$id.iv_icon));
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m19013n(SearchCoinListAdapter searchCoinListAdapter, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        searchCoinListAdapter.f18592j.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final SearchHotCoinListAdapter m19016s(final SearchCoinListAdapter searchCoinListAdapter) {
        final SearchHotCoinListAdapter searchHotCoinListAdapter = new SearchHotCoinListAdapter();
        searchHotCoinListAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.assets.search.depositandwithdraw.g0
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SearchCoinListAdapter.m19017t(searchHotCoinListAdapter, searchCoinListAdapter, baseQuickAdapter, view, i11);
            }
        });
        return searchHotCoinListAdapter;
    }

    /* JADX INFO: renamed from: u */
    public static final SearchHistoryCoinListAdapter m19018u(final SearchCoinListAdapter searchCoinListAdapter) {
        final SearchHistoryCoinListAdapter searchHistoryCoinListAdapter = new SearchHistoryCoinListAdapter();
        searchHistoryCoinListAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.assets.search.depositandwithdraw.f0
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SearchCoinListAdapter.m19019v(searchHistoryCoinListAdapter, searchCoinListAdapter, baseQuickAdapter, view, i11);
            }
        });
        return searchHistoryCoinListAdapter;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable SearchCoinEntity searchCoinEntity) {
        CoinInfoEntity coinEntity;
        View view;
        RecyclerView recyclerView;
        View viewFindViewById;
        View viewFindViewById2;
        View view2;
        View viewFindViewById3;
        View viewFindViewById4;
        Integer numValueOf = searchCoinEntity != null ? Integer.valueOf(searchCoinEntity.getF38450c()) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            if (baseViewHolder == null || (view2 = baseViewHolder.itemView) == null) {
                return;
            }
            RecyclerView recyclerView2 = (RecyclerView) view2.findViewById(R$id.history_list);
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(m19022r());
                List<CoinInfoEntity> coinList = searchCoinEntity.getCoinList();
                if (coinList == null || coinList.isEmpty()) {
                    m19022r().replaceData(CollectionsKt.emptyList());
                    View view3 = baseViewHolder.itemView;
                    if (view3 != null && (viewFindViewById3 = view3.findViewById(R$id.layout_history)) != null) {
                        ViewExtKt.m66577h(viewFindViewById3);
                    }
                } else {
                    List<CoinInfoEntity> coinList2 = searchCoinEntity.getCoinList();
                    if (coinList2 != null) {
                        m19022r().replaceData(coinList2);
                    }
                    View view4 = baseViewHolder.itemView;
                    if (view4 != null && (viewFindViewById4 = view4.findViewById(R$id.layout_history)) != null) {
                        ViewExtKt.m66594y(viewFindViewById4);
                    }
                }
            }
            View viewFindViewById5 = view2.findViewById(R$id.delete_history);
            Intrinsics.checkNotNull(viewFindViewById5);
            ViewExtKt.m66575f(viewFindViewById5, new Function1() { // from class: com.kubi.assets.search.depositandwithdraw.c0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchCoinListAdapter.m19013n(this.f18609b, (View) obj);
                }
            });
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            if (baseViewHolder == null || (view = baseViewHolder.itemView) == null || (recyclerView = (RecyclerView) view.findViewById(R$id.hot_list)) == null) {
                return;
            }
            recyclerView.setAdapter(m19021q());
            List<CoinInfoEntity> coinList3 = searchCoinEntity.getCoinList();
            if (coinList3 == null || coinList3.isEmpty()) {
                m19021q().replaceData(CollectionsKt.emptyList());
                View view5 = baseViewHolder.itemView;
                if (view5 == null || (viewFindViewById = view5.findViewById(R$id.layout_hot)) == null) {
                    return;
                }
                ViewExtKt.m66577h(viewFindViewById);
                return;
            }
            List<CoinInfoEntity> coinList4 = searchCoinEntity.getCoinList();
            if (coinList4 != null) {
                m19021q().replaceData(coinList4);
            }
            View view6 = baseViewHolder.itemView;
            if (view6 == null || (viewFindViewById2 = view6.findViewById(R$id.layout_hot)) == null) {
                return;
            }
            ViewExtKt.m66594y(viewFindViewById2);
            return;
        }
        if ((numValueOf == null || numValueOf.intValue() != 5) && ((numValueOf == null || numValueOf.intValue() != 3) && (numValueOf == null || numValueOf.intValue() != 10))) {
            if (numValueOf == null || numValueOf.intValue() != 6 || baseViewHolder == null) {
                return;
            }
            baseViewHolder.setImageResource(R$id.empty_icon, R$drawable.ic2_common_empty);
            baseViewHolder.setText(R$id.empty_tips, R$string.no_more_data);
            return;
        }
        if (baseViewHolder == null || (coinEntity = searchCoinEntity.getCoinEntity()) == null) {
            return;
        }
        m19012l(baseViewHolder, searchCoinEntity.getF38450c(), coinEntity);
        if (StringsKt.isBlank(this.f18596n)) {
            return;
        }
        View view7 = baseViewHolder.getView(R$id.tv_coin_name);
        Intrinsics.checkNotNullExpressionValue(view7, "getView(...)");
        C37084b.m83008c((TextView) view7, this.f18596n);
        View view8 = baseViewHolder.getView(R$id.tv_coin_name_full);
        Intrinsics.checkNotNullExpressionValue(view8, "getView(...)");
        C37084b.m83008c((TextView) view8, this.f18596n);
    }

    /* JADX INFO: renamed from: q */
    public final SearchHotCoinListAdapter m19021q() {
        return (SearchHotCoinListAdapter) this.f18595m.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final SearchHistoryCoinListAdapter m19022r() {
        return (SearchHistoryCoinListAdapter) this.f18594l.getValue();
    }

    /* JADX INFO: renamed from: w */
    public final void m19023w(@NotNull Collection<SearchCoinEntity> data, @NotNull String filterText) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(filterText, "filterText");
        this.f18596n = filterText;
        super.replaceData(data);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchCoinListAdapter(int i11, @Nullable List<SearchCoinEntity> list, @NotNull Function0<Unit> clearHistory, @NotNull Function2<? super CoinInfoEntity, ? super String, Unit> headerItemClickListener) {
        int i12;
        super(list);
        Intrinsics.checkNotNullParameter(clearHistory, "clearHistory");
        Intrinsics.checkNotNullParameter(headerItemClickListener, "headerItemClickListener");
        this.f18591i = i11;
        this.f18592j = clearHistory;
        this.f18593k = headerItemClickListener;
        if (i11 == 2) {
            i12 = R$layout.kucoin_withdraw_coin_list_history;
        } else {
            i12 = R$layout.kucoin_new_coin_list_history;
        }
        addItemType(1, i12);
        addItemType(2, R$layout.kucoin_new_coin_list_hot);
        int i13 = R$layout.kucoin_new_item_coin_list;
        addItemType(5, i13);
        addItemType(10, i13);
        addItemType(3, R$layout.kucoin_new_item_coin_list_remain);
        addItemType(4, R$layout.kucoin_new_coin_list_remain);
        addItemType(6, com.kubi.sdk.R$layout.view_empty);
        this.f18594l = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchCoinListAdapter.m19018u(this.f18611b);
            }
        });
        this.f18595m = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchCoinListAdapter.m19016s(this.f18613b);
            }
        });
        this.f18596n = "";
    }

    /* JADX INFO: renamed from: t */
    public static final void m19017t(SearchHotCoinListAdapter searchHotCoinListAdapter, SearchCoinListAdapter searchCoinListAdapter, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        CoinInfoEntity item = searchHotCoinListAdapter.getItem(i11);
        if (item != null) {
            searchCoinListAdapter.f18593k.invoke(item, "popCoin");
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m19019v(SearchHistoryCoinListAdapter searchHistoryCoinListAdapter, SearchCoinListAdapter searchCoinListAdapter, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        CoinInfoEntity item = searchHistoryCoinListAdapter.getItem(i11);
        if (item != null) {
            searchCoinListAdapter.f18593k.invoke(item, "historySearch");
        }
    }
}
