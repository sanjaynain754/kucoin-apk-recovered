package com.kubi.home.news;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.kubi.home.R$layout;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.cards.BaseCard;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.MarqueeTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import fj.C37530l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
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

/* JADX INFO: compiled from: NewsCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/news/NewsCard;", "Lcom/kubi/kucoin/home/cards/BaseCard;", "<init>", "()V", "kucoinItemHomeMarqueeBinding", "Lcom/kubi/home/databinding/KucoinItemHomeMarqueeBinding;", "getKucoinItemHomeMarqueeBinding", "()Lcom/kubi/home/databinding/KucoinItemHomeMarqueeBinding;", "kucoinItemHomeMarqueeBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindToUI", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "jump", "onMoveStart", "onMoveStop", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewsCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsCard.kt\ncom/kubi/home/news/NewsCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,80:1\n147#2,16:81\n*S KotlinDebug\n*F\n+ 1 NewsCard.kt\ncom/kubi/home/news/NewsCard\n*L\n25#1:81,16\n*E\n"})
public final class NewsCard extends BaseCard {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f25938W = {Reflection.property1(new PropertyReference1Impl(NewsCard.class, "kucoinItemHomeMarqueeBinding", "getKucoinItemHomeMarqueeBinding()Lcom/kubi/home/databinding/KucoinItemHomeMarqueeBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f25939V = C45681e.m100799e(this, new Function1<NewsCard, C37530l0>() { // from class: com.kubi.home.news.NewsCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37530l0 invoke(@NotNull NewsCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37530l0.m84523a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37530l0, Unit>() { // from class: com.kubi.home.news.NewsCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37530l0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37530l0 c37530l0) {
            invoke(c37530l0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: j3 */
    public static final Unit m29742j3() {
        Router.f46192a.m56184f("news").m4038a("spm", C43852m.m96601m(HomeCardViewHolderProxy.PAGE_ID, "news", "1")).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k3 */
    public static final Unit m29743k3(NewsCard newsCard) {
        C43852m.m96591c(HomeCardViewHolderProxy.PAGE_ID, "news", "1", null, 8, null);
        newsCard.m29745i3();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: K1 */
    public void mo28980K1(@NotNull BaseCardData data) {
        NewsData.Data data2;
        FrameLayout frameLayout;
        MarqueeTextView marqueeTextView;
        Intrinsics.checkNotNullParameter(data, "data");
        super.mo28980K1(data);
        NewsData newsData = data instanceof NewsData ? (NewsData) data : null;
        if (newsData == null || (data2 = newsData.getData()) == null) {
            return;
        }
        C37530l0 c37530l0M29744h3 = m29744h3();
        if (c37530l0M29744h3 != null && (marqueeTextView = c37530l0M29744h3.f83367c) != null) {
            marqueeTextView.setContentList(data2.getItems());
        }
        C37530l0 c37530l0M29744h4 = m29744h3();
        if (c37530l0M29744h4 == null || (frameLayout = c37530l0M29744h4.f83366b) == null) {
            return;
        }
        ViewExtKt.m66594y(frameLayout);
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.kucoin_item_home_marquee;
    }

    /* JADX INFO: renamed from: h3 */
    public final C37530l0 m29744h3() {
        return (C37530l0) this.f25939V.getValue(this, f25938W[0]);
    }

    /* JADX INFO: renamed from: i3 */
    public final void m29745i3() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.home.news.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsCard.m29742j3();
            }
        });
    }

    @Override // com.kubi.kucoin.home.cards.BaseCard, com.kubi.kucoin.home.cards.BaseCardFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37530l0 c37530l0M29744h3 = m29744h3();
        if (c37530l0M29744h3 == null || (frameLayout = c37530l0M29744h3.f83366b) == null) {
            return;
        }
        C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.home.news.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsCard.m29743k3(this.f25940b);
            }
        }, 1, null);
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: P */
    public void mo28981P() {
        MarqueeTextView marqueeTextView;
        super.mo28981P();
        C37530l0 c37530l0M29744h3 = m29744h3();
        if (c37530l0M29744h3 != null && (marqueeTextView = c37530l0M29744h3.f83367c) != null) {
            marqueeTextView.m54678o();
        }
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: Q */
    public void mo28982Q() {
        MarqueeTextView marqueeTextView;
        super.mo28982Q();
        C37530l0 c37530l0M29744h3 = m29744h3();
        if (c37530l0M29744h3 != null && (marqueeTextView = c37530l0M29744h3.f83367c) != null) {
            marqueeTextView.m54677n();
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onHide() {
        MarqueeTextView marqueeTextView;
        super.onHide();
        C37530l0 c37530l0M29744h3 = m29744h3();
        if (c37530l0M29744h3 != null && (marqueeTextView = c37530l0M29744h3.f83367c) != null) {
            marqueeTextView.m54677n();
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onShow() {
        MarqueeTextView marqueeTextView;
        super.onShow();
        C37530l0 c37530l0M29744h3 = m29744h3();
        if (c37530l0M29744h3 != null && (marqueeTextView = c37530l0M29744h3.f83367c) != null) {
            marqueeTextView.m54678o();
        }
    }
}
