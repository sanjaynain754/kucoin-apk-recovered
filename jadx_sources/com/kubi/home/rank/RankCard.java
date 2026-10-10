package com.kubi.home.rank;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$layout;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.rank.impl.RankFragmentContext;
import com.kubi.home.rank.impl.RankRepository;
import com.kubi.home.rank.impl.RankWidget;
import com.kubi.kucoin.home.cards.BaseCard;
import com.kubi.resources.widget.AutoHeightViewPager;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36723h;
import fj.C37522h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p830zf.InterfaceC46822s;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: RankCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m90084d2 = {"Lcom/kubi/home/rank/RankCard;", "Lcom/kubi/kucoin/home/cards/BaseCard;", "<init>", "()V", "kucoinHomeCardRankBinding", "Lcom/kubi/home/databinding/KucoinHomeCardRankBinding;", "getKucoinHomeCardRankBinding", "()Lcom/kubi/home/databinding/KucoinHomeCardRankBinding;", "kucoinHomeCardRankBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "rankWidget", "Lcom/kubi/home/rank/impl/RankWidget;", "getRankWidget", "()Lcom/kubi/home/rank/impl/RankWidget;", "setRankWidget", "(Lcom/kubi/home/rank/impl/RankWidget;)V", "rankCardHelper", "Lcom/kubi/home/rank/RankCardHelper;", "getRankCardHelper", "()Lcom/kubi/home/rank/RankCardHelper;", "rankCardHelper$delegate", "Lkotlin/Lazy;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onMoveStart", "onMoveStop", "handleClickEvent", "getCurrentTabPosition", "handleFlowEvent", "jumpToMorePage", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankCard.kt\ncom/kubi/home/rank/RankCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,150:1\n147#2,16:151\n25#3,2:167\n27#3:171\n25#3,3:174\n158#4,2:169\n158#4,2:172\n*S KotlinDebug\n*F\n+ 1 RankCard.kt\ncom/kubi/home/rank/RankCard\n*L\n35#1:151,16\n124#1:167,2\n124#1:171\n89#1:174,3\n125#1:169,2\n133#1:172,2\n*E\n"})
public final class RankCard extends BaseCard {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f25990Y = {Reflection.property1(new PropertyReference1Impl(RankCard.class, "kucoinHomeCardRankBinding", "getKucoinHomeCardRankBinding()Lcom/kubi/home/databinding/KucoinHomeCardRankBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @Nullable
    public RankWidget f25992W;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f25991V = C45681e.m100799e(this, new Function1<RankCard, C37522h0>() { // from class: com.kubi.home.rank.RankCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37522h0 invoke(@NotNull RankCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37522h0.m84504a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37522h0, Unit>() { // from class: com.kubi.home.rank.RankCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37522h0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37522h0 c37522h0) {
            invoke(c37522h0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f25993X = LazyKt.lazy(new Function0() { // from class: com.kubi.home.rank.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankCard.m29830t3();
        }
    });

    /* JADX INFO: renamed from: o3 */
    public static final Unit m29827o3(RankCard rankCard, View it) throws JSONException {
        C37522h0 c37522h0M29832l3;
        LinearLayout linearLayout;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayout linearLayout2;
        Intrinsics.checkNotNullParameter(it, "it");
        ViewExtKt.m66577h(it);
        C37522h0 c37522h0M29832l4 = rankCard.m29832l3();
        if (c37522h0M29832l4 != null && (linearLayout2 = c37522h0M29832l4.f83321l) != null) {
            ViewExtKt.m66594y(linearLayout2);
        }
        C37522h0 c37522h0M29832l5 = rankCard.m29832l3();
        if (c37522h0M29832l5 != null && (linearLayoutCompat = c37522h0M29832l5.f83315f) != null) {
            ViewExtKt.m66594y(linearLayoutCompat);
        }
        C12572a.m23695d("rank_view_more", null, 0L, 6, null);
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46822s.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC46822s) objM56186h).m103149a(rankCard.m29832l3());
        } else {
            RankWidget rankWidget = rankCard.f25992W;
            if (Intrinsics.areEqual(rankWidget != null ? rankWidget.m30021o() : null, "new_coin") && (c37522h0M29832l3 = rankCard.m29832l3()) != null && (linearLayout = c37522h0M29832l3.f83312c) != null) {
                ViewExtKt.m66594y(linearLayout);
            }
        }
        RankWidget rankWidget2 = rankCard.f25992W;
        if (rankWidget2 != null) {
            rankWidget2.m30014h(true);
        }
        rankCard.m29833m3().m29837a(0, rankCard.m29831k3());
        rankCard.m29833m3().m29838b(1, rankCard.m29831k3());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p3 */
    public static final Unit m29828p3(RankCard rankCard, View it) throws JSONException {
        LinearLayoutCompat linearLayoutCompat;
        LinearLayout linearLayout;
        LinearLayoutCompat linearLayoutCompat2;
        Intrinsics.checkNotNullParameter(it, "it");
        ViewExtKt.m66577h(it);
        C37522h0 c37522h0M29832l3 = rankCard.m29832l3();
        if (c37522h0M29832l3 != null && (linearLayoutCompat2 = c37522h0M29832l3.f83315f) != null) {
            ViewExtKt.m66577h(linearLayoutCompat2);
        }
        C37522h0 c37522h0M29832l4 = rankCard.m29832l3();
        if (c37522h0M29832l4 != null && (linearLayout = c37522h0M29832l4.f83312c) != null) {
            ViewExtKt.m66577h(linearLayout);
        }
        C37522h0 c37522h0M29832l5 = rankCard.m29832l3();
        if (c37522h0M29832l5 != null && (linearLayoutCompat = c37522h0M29832l5.f83322m) != null) {
            ViewExtKt.m66594y(linearLayoutCompat);
        }
        C12572a.m23695d("rank_view_close", null, 0L, 6, null);
        RankWidget rankWidget = rankCard.f25992W;
        if (rankWidget != null) {
            rankWidget.m30014h(false);
        }
        rankCard.m29833m3().m29837a(1, rankCard.m29831k3());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m29829q3(RankCard rankCard, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rankCard.m29836s3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final RankCardHelper m29830t3() {
        return new RankCardHelper();
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.kucoin_home_card_rank;
    }

    /* JADX INFO: renamed from: k3 */
    public final int m29831k3() {
        RankFragmentContext f26077a;
        SlidingTabLayout slidingTabLayoutM29978h;
        RankWidget rankWidget = this.f25992W;
        if (rankWidget == null || (f26077a = rankWidget.getF26077a()) == null || (slidingTabLayoutM29978h = f26077a.m29978h()) == null) {
            return 0;
        }
        return slidingTabLayoutM29978h.getCurrentTab();
    }

    /* JADX INFO: renamed from: l3 */
    public final C37522h0 m29832l3() {
        return (C37522h0) this.f25991V.getValue(this, f25990Y[0]);
    }

    /* JADX INFO: renamed from: m3 */
    public final RankCardHelper m29833m3() {
        return (RankCardHelper) this.f25993X.getValue();
    }

    @Override // com.kubi.kucoin.home.cards.BaseCard, com.kubi.kucoin.home.cards.BaseCardFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37522h0 c37522h0M29832l3 = m29832l3();
        if (c37522h0M29832l3 != null) {
            RankFragmentContext rankFragmentContext = new RankFragmentContext();
            rankFragmentContext.m29983m(this);
            SlidingTabLayout rankTabLayout = c37522h0M29832l3.f83318i;
            Intrinsics.checkNotNullExpressionValue(rankTabLayout, "rankTabLayout");
            rankFragmentContext.m29987q(rankTabLayout);
            FrameLayout layoutHeader = c37522h0M29832l3.f83314e;
            Intrinsics.checkNotNullExpressionValue(layoutHeader, "layoutHeader");
            rankFragmentContext.m29985o(layoutHeader);
            DashTextView coinPair = c37522h0M29832l3.f83311b;
            Intrinsics.checkNotNullExpressionValue(coinPair, "coinPair");
            rankFragmentContext.m29982l(coinPair);
            BaseTextView tvSortPrice = c37522h0M29832l3.f83320k;
            Intrinsics.checkNotNullExpressionValue(tvSortPrice, "tvSortPrice");
            rankFragmentContext.m29986p(tvSortPrice);
            DashTextView tvSortChangeRate = c37522h0M29832l3.f83319j;
            Intrinsics.checkNotNullExpressionValue(tvSortChangeRate, "tvSortChangeRate");
            rankFragmentContext.m29981k(tvSortChangeRate);
            AutoHeightViewPager mViewPager = c37522h0M29832l3.f83316g;
            Intrinsics.checkNotNullExpressionValue(mViewPager, "mViewPager");
            rankFragmentContext.m29988r(mViewPager);
            LinearLayoutCompat layoutExpandMore = c37522h0M29832l3.f83313d;
            Intrinsics.checkNotNullExpressionValue(layoutExpandMore, "layoutExpandMore");
            rankFragmentContext.m29984n(layoutExpandMore);
            rankFragmentContext.m29980j().m55463d();
            this.f25992W = new RankWidget(rankFragmentContext);
        }
        m29835r3();
        m29834n3();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m29835r3() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46822s.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC46822s) objM56186h).m103150b();
        } else {
            if (C12573b.f21598a.m23696a()) {
                "show_new_coin_more".length();
            }
            C12572a.m23692a(this, false, new RankCard$handleFlowEvent$lambda$11$$inlined$bindFlowEvent$1("show_new_coin_more", null, this));
        }
        if (C12573b.f21598a.m23696a()) {
            "hide_new_coin_more".length();
        }
        C12572a.m23692a(this, false, new RankCard$handleFlowEvent$$inlined$bindFlowEvent$1("hide_new_coin_more", null, this));
    }

    /* JADX INFO: renamed from: s3 */
    public final void m29836s3() {
        new RankRepository().m29871h("newCoinMore");
        C36723h.m82297a("newcoin/home", HomeCardViewHolderProxy.PAGE_ID, "eightPlace", "1");
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: P */
    public void mo28981P() {
        super.mo28981P();
        RankWidget rankWidget = this.f25992W;
        if (rankWidget != null) {
            rankWidget.m30026w();
        }
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: Q */
    public void mo28982Q() {
        super.mo28982Q();
        RankWidget rankWidget = this.f25992W;
        if (rankWidget != null) {
            rankWidget.m30027x();
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final void m29834n3() throws JSONException {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayoutCompat linearLayoutCompat;
        m29833m3().m29838b(0, m29831k3());
        C37522h0 c37522h0M29832l3 = m29832l3();
        if (c37522h0M29832l3 != null && (linearLayoutCompat = c37522h0M29832l3.f83322m) != null) {
            ViewExtKt.m66575f(linearLayoutCompat, new Function1() { // from class: com.kubi.home.rank.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RankCard.m29827o3(this.f25995b, (View) obj);
                }
            });
        }
        C37522h0 c37522h0M29832l4 = m29832l3();
        if (c37522h0M29832l4 != null && (linearLayout2 = c37522h0M29832l4.f83321l) != null) {
            ViewExtKt.m66575f(linearLayout2, new Function1() { // from class: com.kubi.home.rank.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RankCard.m29828p3(this.f25996b, (View) obj);
                }
            });
        }
        C37522h0 c37522h0M29832l5 = m29832l3();
        if (c37522h0M29832l5 != null && (linearLayout = c37522h0M29832l5.f83312c) != null) {
            ViewExtKt.m66575f(linearLayout, new Function1() { // from class: com.kubi.home.rank.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RankCard.m29829q3(this.f25997b, (View) obj);
                }
            });
        }
    }
}
