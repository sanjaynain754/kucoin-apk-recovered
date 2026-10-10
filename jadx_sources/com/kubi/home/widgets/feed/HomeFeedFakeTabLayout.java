package com.kubi.home.widgets.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.event.api.C12572a;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.config.HomeFeedTab;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233ej.C37201i;
import p739ww.C45938b;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: HomeFeedFakeTabLayout.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u001b\u0018\u0000 02\u00020\u0001:\u00010B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019J\u000e\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0017J\u0010\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&J\b\u0010'\u001a\u00020 H\u0002J\u000e\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0007J\u001a\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u0017H\u0002J\u000e\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020\u0007J\u0006\u0010/\u001a\u00020 R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0011j\b\u0012\u0004\u0012\u00020\u0015`\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tableLayout", "Lcom/kubi/resources/widget/flyco/SlidingTabLayout;", "vp", "Landroidx/viewpager/widget/ViewPager;", "jumpTopBtn", "Landroid/view/View;", "homeTabs", "Ljava/util/ArrayList;", "Lcom/kubi/home/config/HomeFeedTab;", "Lkotlin/collections/ArrayList;", "fragments", "Landroidx/fragment/app/Fragment;", "curVisible", "", "jumpTopListener", "Landroid/view/View$OnClickListener;", "tabSelectListener", "com/kubi/home/widgets/feed/HomeFeedFakeTabLayout$tabSelectListener$1", "Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout$tabSelectListener$1;", "tabScrollChangeListener", "Landroid/view/View$OnScrollChangeListener;", "configJumpTopClick", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "updateVisible", TIMPushProvider.f75062n, "configTabs", "fm", "Landroidx/fragment/app/FragmentManager;", "postTryJumpFeedTabByRouter", "onFlutterSelectTab", "pos", "sendToFlutter", ViewProps.POSITION, "forceRefresh", "onNotifyTabScrollXChange", "scrollX", "jumpToHomeFeedPos", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeFeedFakeTabLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFeedFakeTabLayout.kt\ncom/kubi/home/widgets/feed/HomeFeedFakeTabLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n1878#2,3:186\n1869#2,2:189\n*S KotlinDebug\n*F\n+ 1 HomeFeedFakeTabLayout.kt\ncom/kubi/home/widgets/feed/HomeFeedFakeTabLayout\n*L\n108#1:186,3\n117#1:189,2\n*E\n"})
public final class HomeFeedFakeTabLayout extends FrameLayout {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Companion f26721k = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public SlidingTabLayout f26722b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public ViewPager f26723c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public View f26724d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public ArrayList<HomeFeedTab> f26725e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public ArrayList<Fragment> f26726f;

    /* JADX INFO: renamed from: g */
    public boolean f26727g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public View.OnClickListener f26728h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final C15109a f26729i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final View.OnScrollChangeListener f26730j;

    /* JADX INFO: compiled from: HomeFeedFakeTabLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/home/widgets/feed/HomeFeedFakeTabLayout$Companion;", "", "<init>", "()V", "TAG", "", "HOME_FEED_TAB_CHANGE_RN", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.widgets.feed.HomeFeedFakeTabLayout$a */
    /* JADX INFO: compiled from: HomeFeedFakeTabLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/home/widgets/feed/HomeFeedFakeTabLayout$tabSelectListener$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "onTabReselect", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15109a extends C45938b {
        public C15109a() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            C37201i c37201i = C37201i.f82500a;
            c37201i.m83219M(i11);
            HomeFeedFakeTabLayout.m31147n(HomeFeedFakeTabLayout.this, i11, false, 2, null);
            C12572a.m23695d("com.kubi.home.feed.QuoteEvent:fake_tab_change", null, 0L, 6, null);
            C12572a.m23695d("com.kubi.home.feed.QuoteEvent:fake_tab_re_click", null, 0L, 6, null);
            c37201i.m83214G(i11, HomeFeedFakeTabLayout.this.f26722b);
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: a */
        public void mo31156a(int i11) {
            super.mo31156a(i11);
            HomeFeedFakeTabLayout.this.m31154m(i11, true);
            C12572a.m23695d("com.kubi.home.feed.QuoteEvent:fake_tab_re_click", null, 0L, 6, null);
            C37201i.f82500a.m83214G(i11, HomeFeedFakeTabLayout.this.f26722b);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeFeedFakeTabLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeFeedFakeTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m31143d(HomeFeedFakeTabLayout homeFeedFakeTabLayout, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        View.OnClickListener onClickListener = homeFeedFakeTabLayout.f26728h;
        if (onClickListener != null) {
            onClickListener.onClick(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m31147n(HomeFeedFakeTabLayout homeFeedFakeTabLayout, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        homeFeedFakeTabLayout.m31154m(i11, z11);
    }

    public final void configJumpTopClick(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f26728h = listener;
    }

    /* JADX INFO: renamed from: g */
    public final void m31149g(@Nullable FragmentManager fragmentManager) {
        List<HomeFeedTab> listM83222k = C37201i.f82500a.m83222k();
        C44128b.m97266j("HomeFeedFakeTabLayout", "[configTabs] tabList:" + listM83222k + ", fm:" + fragmentManager);
        if (fragmentManager == null) {
            return;
        }
        int i11 = 0;
        for (Object obj : this.f26725e) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            this.f26722b.m55290u(i11);
            i11 = i12;
        }
        this.f26725e.clear();
        this.f26725e.addAll(listM83222k);
        List<String> listM83223l = C37201i.f82500a.m83223l();
        this.f26726f.clear();
        for (String str : listM83223l) {
            this.f26726f.add(new Fragment());
        }
        this.f26723c.setAdapter(new C27103z(fragmentManager, this.f26726f, listM83223l));
        this.f26722b.setViewPager(this.f26723c);
        m31155p(this.f26727g);
        this.f26722b.m55292y();
        SlidingTabLayout slidingTabLayout = this.f26722b;
        C37201i c37201i = C37201i.f82500a;
        slidingTabLayout.setCurrentTab(c37201i.m83227p());
        this.f26722b.onPageSelected(c37201i.m83227p());
        this.f26722b.setOnTabSelectListener(this.f26729i);
        this.f26722b.m55284k();
        c37201i.m83217J(listM83222k, this.f26722b);
        m31153k();
    }

    /* JADX INFO: renamed from: h */
    public final void m31150h() {
        if (this.f26725e.isEmpty()) {
            return;
        }
        m31153k();
    }

    /* JADX INFO: renamed from: i */
    public final void m31151i(int i11) {
        if (this.f26725e.isEmpty()) {
            return;
        }
        this.f26722b.m55292y();
        this.f26722b.setCurrentTab(i11);
        this.f26722b.setOnTabSelectListener(this.f26729i);
        C37201i.f82500a.m83214G(i11, this.f26722b);
    }

    /* JADX INFO: renamed from: j */
    public final void m31152j(int i11) {
        if (this.f26725e.isEmpty()) {
            return;
        }
        this.f26722b.setOnScrollChangeListener(null);
        this.f26722b.setScrollX(i11);
        this.f26722b.setOnScrollChangeListener(this.f26730j);
    }

    /* JADX INFO: renamed from: k */
    public final void m31153k() {
        postDelayed(new Runnable() { // from class: com.kubi.home.widgets.feed.f
            @Override // java.lang.Runnable
            public final void run() {
                HomeFeedFakeTabLayout.m31146l(this.f26739b);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: p */
    public final void m31155p(boolean z11) {
        this.f26727g = z11;
        setVisibility((!z11 || this.f26725e.isEmpty()) ? 8 : 0);
    }

    public /* synthetic */ HomeFeedFakeTabLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: l */
    public static final void m31146l(HomeFeedFakeTabLayout homeFeedFakeTabLayout) {
        Integer numM83216I;
        if (homeFeedFakeTabLayout.isAttachedToWindow() && (numM83216I = C37201i.f82500a.m83216I()) != null) {
            int iIntValue = numM83216I.intValue();
            homeFeedFakeTabLayout.f26722b.setCurrentTab(iIntValue);
            homeFeedFakeTabLayout.f26729i.mo18273b(iIntValue);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m31148o(View view, int i11, int i12, int i13, int i14) {
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_fake_tab_scrollX_change", Integer.valueOf(i11), 0L, 4, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m31154m(int i11, boolean z11) {
        HashMap<String, Object> mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("tabPosition", Integer.valueOf(i11)), TuplesKt.m90091to("forceRefresh", Boolean.valueOf(z11)));
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_tab_change", mapHashMapOf, 0L, 4, null);
        if (C37201i.f82500a.m83229r()) {
            IReactNativeService.INSTANCE.get().nativeNotifyRn("home_feed_tab_change", mapHashMapOf);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeFeedFakeTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26725e = new ArrayList<>();
        this.f26726f = new ArrayList<>();
        C15109a c15109a = new C15109a();
        this.f26729i = c15109a;
        View.OnScrollChangeListener onScrollChangeListener = new View.OnScrollChangeListener() { // from class: com.kubi.home.widgets.feed.d
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i12, int i13, int i14, int i15) {
                HomeFeedFakeTabLayout.m31148o(view, i12, i13, i14, i15);
            }
        };
        this.f26730j = onScrollChangeListener;
        LayoutInflater.from(context).inflate(R$layout.home_fake_feed_tab_layout, this);
        View viewFindViewById = findViewById(R$id.feed_tab_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) viewFindViewById;
        this.f26722b = slidingTabLayout;
        slidingTabLayout.setNeedBold(true);
        View viewFindViewById2 = findViewById(R$id.feed_tab_vp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f26723c = (ViewPager) viewFindViewById2;
        this.f26722b.setOnTabSelectListener(c15109a);
        this.f26722b.setOnScrollChangeListener(onScrollChangeListener);
        View viewFindViewById3 = findViewById(R$id.feed_jump_top);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f26724d = viewFindViewById3;
        ViewExtKt.m66575f(viewFindViewById3, new Function1() { // from class: com.kubi.home.widgets.feed.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFeedFakeTabLayout.m31143d(this.f26738b, (View) obj);
            }
        });
    }
}
