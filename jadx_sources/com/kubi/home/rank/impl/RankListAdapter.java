package com.kubi.home.rank.impl;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.home.api.RankNewCoin;
import com.kubi.home.rank.impl.cache.RankItem;
import com.kubi.mvi.common.C19244f;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.UpDownColorTextView;
import com.kubi.sdk.adapter.KcBaseDifferMultiAdapter;
import com.kubi.sdk.util.C24277v;
import com.tencent.bugly.proguard.C33954u6;
import fj.C37524i0;
import fj.C37526j0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p275fy.C37728a;
import p275fy.C37732e;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import rs.C44172b;

/* JADX INFO: compiled from: RankListAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J&\u0010\u001a\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0016\u0010\u001c\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020#H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006%"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankListAdapter;", "Lcom/kubi/sdk/adapter/KcBaseDifferMultiAdapter;", "Lcom/kubi/home/rank/impl/cache/RankItem;", "diffCallBack", "Lcom/kubi/home/rank/impl/RankItemDiffCallBack;", "type", "", "rankRepository", "Lcom/kubi/home/rank/impl/RankRepository;", "<init>", "(Lcom/kubi/home/rank/impl/RankItemDiffCallBack;ILcom/kubi/home/rank/impl/RankRepository;)V", "firstVisiblePosition", "lastVisiblePosition", "needLimitItemCount", "", "getNeedLimitItemCount", "()Z", "setNeedLimitItemCount", "(Z)V", "bindNewRankVH", "", C33954u6.f72238i, "Lcom/kubi/sdk/adapter/BaseQuickVH;", "Lcom/kubi/home/databinding/KucoinHomeItemNewCoinRankBinding;", ViewProps.POSITION, "item", "bindRankVH", "Lcom/kubi/home/databinding/KucoinHomeItemRankBinding;", "getItemCount", FirebaseAnalytics.Param.ITEMS, "", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onViewAttachedToWindow", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RankListAdapter extends KcBaseDifferMultiAdapter<RankItem> {

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Companion f26005p = new Companion(null);

    /* JADX INFO: renamed from: k */
    public final int f26006k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final RankRepository f26007l;

    /* JADX INFO: renamed from: m */
    public int f26008m;

    /* JADX INFO: renamed from: n */
    public int f26009n;

    /* JADX INFO: renamed from: o */
    public boolean f26010o;

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.RankListAdapter$2 */
    /* JADX INFO: compiled from: RankListAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C147602 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C37526j0> {
        public static final C147602 INSTANCE = new C147602();

        public final C37526j0 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C37526j0.m84514c(p11, viewGroup, z11);
        }

        public C147602() {
            super(3, C37526j0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/home/databinding/KucoinHomeItemRankBinding;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C37526j0 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.RankListAdapter$4 */
    /* JADX INFO: compiled from: RankListAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C147614 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C37524i0> {
        public static final C147614 INSTANCE = new C147614();

        public final C37524i0 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C37524i0.m84509c(p11, viewGroup, z11);
        }

        public C147614() {
            super(3, C37524i0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/home/databinding/KucoinHomeItemNewCoinRankBinding;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C37524i0 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: compiled from: RankListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankListAdapter$Companion;", "", "<init>", "()V", "TYPE_LOAD_MORE", "", "VIEW_ITEM_TYPE_NEW_COIN", "VIEW_ITEM_TYPE_COIN", "MAX_ITEM_COUNT_LIMIT", "ITEM_COUNT_NO_LIMIT", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.RankListAdapter$a */
    /* JADX INFO: compiled from: RankListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/home/rank/impl/RankListAdapter$onAttachedToRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14762a extends RecyclerView.OnScrollListener {
        public C14762a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            RankListAdapter rankListAdapter = RankListAdapter.this;
            rankListAdapter.f26008m = linearLayoutManager.findFirstVisibleItemPosition();
            rankListAdapter.f26009n = linearLayoutManager.findLastVisibleItemPosition();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankListAdapter(@NotNull RankItemDiffCallBack diffCallBack, int i11, @NotNull RankRepository rankRepository) {
        super(diffCallBack);
        Intrinsics.checkNotNullParameter(diffCallBack, "diffCallBack");
        Intrinsics.checkNotNullParameter(rankRepository, "rankRepository");
        this.f26006k = i11;
        this.f26007l = rankRepository;
        this.f26009n = 10;
        this.f26010o = true;
        setHasStableIds(true);
        C37732e.m85036d(this, new Function1() { // from class: com.kubi.home.rank.impl.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(RankListAdapter.m29856q((RankItem) obj));
            }
        });
        C37732e.m85034b(this, 3, C147602.INSTANCE, new Function3() { // from class: com.kubi.home.rank.impl.h
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return RankListAdapter.m29857r(this.f26056b, (C37728a) obj, ((Integer) obj2).intValue(), (RankItem) obj3);
            }
        });
        C37732e.m85034b(this, 2, C147614.INSTANCE, new Function3() { // from class: com.kubi.home.rank.impl.i
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return RankListAdapter.m29858s(this.f26057b, (C37728a) obj, ((Integer) obj2).intValue(), (RankItem) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static final int m29856q(RankItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getF38450c() == 2 ? 2 : 3;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m29857r(RankListAdapter rankListAdapter, C37728a holder, int i11, RankItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        rankListAdapter.m29862w(holder, i11, item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m29858s(RankListAdapter rankListAdapter, C37728a holder, int i11, RankItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        rankListAdapter.m29861v(holder, i11, item);
        return Unit.INSTANCE;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getItemCount(@NotNull List<RankItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        boolean z11 = this.f26010o;
        int size = items.size();
        return z11 ? RangesKt.coerceAtMost(size, 5) : size;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(new C14762a());
    }

    @Override // com.chad.library.adapter.base.BaseMultiItemAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder holder) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        RankRepository rankRepository = this.f26007l;
        int i11 = this.f26006k;
        int adapterPosition = holder.getAdapterPosition();
        RankItem item = getItem(holder.getAdapterPosition());
        rankRepository.m29874k(i11, adapterPosition, item != null ? item.getTradeItemBean() : null);
    }

    /* JADX INFO: renamed from: x */
    public final void m29863x(boolean z11) {
        this.f26010o = z11;
    }

    /* JADX INFO: renamed from: v */
    public final void m29861v(C37728a<C37524i0> c37728a, int i11, RankItem rankItem) {
        String iconUrl;
        C37524i0 c37524i0 = (C37524i0) c37728a.m85032b();
        RankNewCoin rankNewCoin = rankItem.getRankNewCoin();
        if (rankNewCoin != null) {
            CoinAvatarView coinAvatarView = c37524i0.f83334c;
            RankNewCoin rankNewCoin2 = rankItem.getRankNewCoin();
            if (rankNewCoin2 != null) {
                iconUrl = rankNewCoin2.getIconUrl();
            } else {
                iconUrl = null;
            }
            C24277v.m58542g(coinAvatarView, iconUrl);
            c37524i0.f83333b.setText(rankNewCoin.getFullName());
            c37524i0.f83337f.setText(rankItem.getRankNewCoinString());
            ShowHideTextView tv24ChangeRateNew = c37524i0.f83335d;
            Intrinsics.checkNotNullExpressionValue(tv24ChangeRateNew, "tv24ChangeRateNew");
            C14768b.m29929b(tv24ChangeRateNew, rankItem);
            UpDownColorTextView tvPriceNew = c37524i0.f83339h;
            Intrinsics.checkNotNullExpressionValue(tvPriceNew, "tvPriceNew");
            boolean z11 = false;
            C44172b.m97383c(tvPriceNew, null, false, 3, null).setText(rankItem.getPriceString());
            c37524i0.f83338g.setText(rankItem.getMoneyPriceString());
            c37524i0.f83340i.setText(rankItem.getRankNewCoinOpeningTime());
            c37524i0.f83336e.setText(rankItem.getRankNewCoinChangeRateString());
            c37524i0.f83336e.setTextColor(rankItem.getRankNewCoinTextColor());
            if (RangesKt.coerceAtLeast(this.f26008m, i11) == RangesKt.coerceAtMost(this.f26009n, i11)) {
                z11 = true;
            }
            c37524i0.f83339h.setVisibleToUser(z11);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m29862w(C37728a<C37526j0> c37728a, int i11, RankItem rankItem) {
        boolean z11;
        LinearLayoutCompat.LayoutParams layoutParams;
        LinearLayoutCompat.LayoutParams layoutParams2;
        int iM6236a;
        C37526j0 c37526j0 = (C37526j0) c37728a.m85032b();
        c37526j0.f83349g.setText(rankItem.getSymbolString());
        String coinLabel = rankItem.getCoinLabel();
        if (coinLabel == null) {
            coinLabel = "";
        }
        int iM6236a2 = 0;
        if (coinLabel.length() > 10) {
            StringBuilder sb2 = new StringBuilder();
            String strSubstring = coinLabel.substring(0, 7);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            sb2.append("...");
            coinLabel = sb2.toString();
        }
        c37526j0.f83346d.setText(coinLabel);
        BaseTextView tvCoinLabel = c37526j0.f83346d;
        Intrinsics.checkNotNullExpressionValue(tvCoinLabel, "tvCoinLabel");
        boolean z12 = true;
        if (coinLabel.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C19244f.m42542a(tvCoinLabel, z11);
        UpDownColorTextView tvPrice = c37526j0.f83348f;
        Intrinsics.checkNotNullExpressionValue(tvPrice, "tvPrice");
        LinearLayoutCompat.LayoutParams layoutParams3 = null;
        C44172b.m97383c(tvPrice, null, false, 3, null).setText(rankItem.getPriceString());
        c37526j0.f83347e.setText(rankItem.getMoneyPriceString());
        ShowHideTextView tvValue = c37526j0.f83350h;
        Intrinsics.checkNotNullExpressionValue(tvValue, "tvValue");
        C19244f.m42542a(tvValue, rankItem.getValueTvShow());
        c37526j0.f83350h.setText(rankItem.getValueString());
        ShowHideTextView tvChangeRate = c37526j0.f83345c;
        Intrinsics.checkNotNullExpressionValue(tvChangeRate, "tvChangeRate");
        C14768b.m29928a(tvChangeRate, rankItem);
        CoinAvatarView coinIcon = c37526j0.f83344b;
        Intrinsics.checkNotNullExpressionValue(coinIcon, "coinIcon");
        C19244f.m42542a(coinIcon, !rankItem.getValueTvShow());
        if (!rankItem.getValueTvShow()) {
            C24277v.m58542g(c37526j0.f83344b, rankItem.getIconUrl());
        }
        if (RangesKt.coerceAtLeast(this.f26008m, i11) != RangesKt.coerceAtMost(this.f26009n, i11)) {
            z12 = false;
        }
        c37526j0.f83348f.setVisibleToUser(z12);
        BaseTextView baseTextView = c37526j0.f83349g;
        ViewGroup.LayoutParams layoutParams4 = baseTextView.getLayoutParams();
        if (layoutParams4 instanceof LinearLayoutCompat.LayoutParams) {
            layoutParams = (LinearLayoutCompat.LayoutParams) layoutParams4;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            if (!rankItem.getValueTvShow()) {
                iM6236a = C5275i0.m6236a(8.0f);
            } else {
                iM6236a = 0;
            }
            layoutParams.setMarginStart(iM6236a);
        } else {
            layoutParams = null;
        }
        baseTextView.setLayoutParams(layoutParams);
        ShowHideTextView showHideTextView = c37526j0.f83350h;
        ViewGroup.LayoutParams layoutParams5 = showHideTextView.getLayoutParams();
        if (layoutParams5 instanceof LinearLayoutCompat.LayoutParams) {
            layoutParams2 = (LinearLayoutCompat.LayoutParams) layoutParams5;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 != null) {
            if (!rankItem.getValueTvShow()) {
                iM6236a2 = C5275i0.m6236a(8.0f);
            }
            layoutParams2.setMarginStart(iM6236a2);
            layoutParams3 = layoutParams2;
        }
        showHideTextView.setLayoutParams(layoutParams3);
    }
}
