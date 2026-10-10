package com.kubi.quotefacade.widgets.feed;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import bv.C4661d1;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.config.HomeFeedTab;
import com.kubi.kucoin.home.p090v2.cards.BaseCardV2;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.feed.HomeFeedFragment;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.flutter.C23767n;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233ej.C37201i;
import p739ww.C45938b;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: HomeFeedWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002*\u0001\u0015\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002J\b\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J\u001c\u0010#\u001a\u00020\u001a2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0002J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u0005H\u0002J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0005H\u0002J\u001a\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020/H\u0002J\u0010\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u000203H\u0002R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u000fj\b\u0012\u0004\u0012\u00020\u0013`\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/feed/HomeFeedWidget;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;", "<init>", "()V", "getLayout", "", "binding", "Lcom/kubi/quotefacade/databinding/WidgetHomeFeedBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/WidgetHomeFeedBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "feedFragment", "Lcom/kubi/quotefacade/feed/HomeFeedFragment;", "homeTabs", "Ljava/util/ArrayList;", "Lcom/kubi/home/config/HomeFeedTab;", "Lkotlin/collections/ArrayList;", "fragments", "Landroidx/fragment/app/Fragment;", "tabSelectListener", "com/kubi/quotefacade/widgets/feed/HomeFeedWidget$tabSelectListener$1", "Lcom/kubi/quotefacade/widgets/feed/HomeFeedWidget$tabSelectListener$1;", "tabScrollChangeListener", "Landroid/view/View$OnScrollChangeListener;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "notifyItemCreate", "configTabs", "postTryJumpFeedTabByRouter", "bindFlowEvent", "onFakeTabChange", "map", "", "", "", "onNotifyTabChange", "pos", "onNotifyTabScrollXChange", "scrollX", "sendToFlutter", ViewProps.POSITION, "forceRefresh", "", "curSelectPos", "onTabOffsetXChange", "offsetX", "", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeFeedWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFeedWidget.kt\ncom/kubi/quotefacade/widgets/feed/HomeFeedWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,208:1\n147#2,16:209\n1878#3,3:225\n1869#3,2:228\n76#4,7:230\n76#4,7:237\n76#4,7:244\n76#4,7:251\n76#4,7:258\n76#4,7:265\n153#4,7:272\n*S KotlinDebug\n*F\n+ 1 HomeFeedWidget.kt\ncom/kubi/quotefacade/widgets/feed/HomeFeedWidget\n*L\n48#1:209,16\n96#1:225,3\n104#1:228,2\n133#1:230,7\n140#1:237,7\n144#1:244,7\n147#1:251,7\n150#1:258,7\n153#1:265,7\n156#1:272,7\n*E\n"})
public final class HomeFeedWidget extends BaseCardV2 {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f42849V = C45681e.m100799e(this, new Function1<HomeFeedWidget, C4661d1>() { // from class: com.kubi.quotefacade.widgets.feed.HomeFeedWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4661d1 invoke(@NotNull HomeFeedWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4661d1.m4634a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4661d1, Unit>() { // from class: com.kubi.quotefacade.widgets.feed.HomeFeedWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4661d1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4661d1 c4661d1) {
            invoke(c4661d1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final HomeFeedFragment f42850W = HomeFeedFragment.f41915V.instance();

    /* JADX INFO: renamed from: X */
    @NotNull
    public ArrayList<HomeFeedTab> f42851X = new ArrayList<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public ArrayList<Fragment> f42852Y = new ArrayList<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final C22644a f42853Z = new C22644a();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final View.OnScrollChangeListener f42854a0 = new View.OnScrollChangeListener() { // from class: com.kubi.quotefacade.widgets.feed.k
        @Override // android.view.View.OnScrollChangeListener
        public final void onScrollChange(View view, int i11, int i12, int i13, int i14) {
            HomeFeedWidget.m53527G3(view, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: b0 */
    public int f42855b0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f42848d0 = {Reflection.property1(new PropertyReference1Impl(HomeFeedWidget.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/WidgetHomeFeedBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f42847c0 = new Companion(null);

    /* JADX INFO: compiled from: HomeFeedWidget.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/feed/HomeFeedWidget$Companion;", "", "<init>", "()V", "TAG", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.feed.HomeFeedWidget$a */
    /* JADX INFO: compiled from: HomeFeedWidget.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/quotefacade/widgets/feed/HomeFeedWidget$tabSelectListener$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "onTabReselect", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22644a extends C45938b {
        public C22644a() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: a */
        public void mo31156a(int i11) {
            HomeFeedWidget.this.m53547F3(i11, true);
            C37201i c37201i = C37201i.f82500a;
            C4661d1 c4661d1M53548u3 = HomeFeedWidget.this.m53548u3();
            c37201i.m83214G(i11, c4661d1M53548u3 != null ? c4661d1M53548u3.f4280b : null);
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            C37201i c37201i = C37201i.f82500a;
            c37201i.m83219M(i11);
            HomeFeedWidget.this.m53547F3(i11, false);
            C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_flutter_tab_change", Integer.valueOf(i11), 0L, 4, null);
            HomeFeedWidget.this.f42855b0 = i11;
            C4661d1 c4661d1M53548u3 = HomeFeedWidget.this.m53548u3();
            c37201i.m83214G(i11, c4661d1M53548u3 != null ? c4661d1M53548u3.f4280b : null);
            C44128b.m97259c("HomeFeedWidget", "[onTabSelect] pos=" + i11);
        }
    }

    /* JADX INFO: renamed from: w3 */
    public static final void m53543w3() {
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_created", null, 0L, 6, null);
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m53523B3() {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.quotefacade.widgets.feed.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFeedWidget.m53524C3();
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m53524C3() {
        C44128b.m97259c("HomeFeedWidget", "[onClickHomeFeedEditIcon] jump");
        C23767n.m56880d();
        return Unit.INSTANCE;
    }

    private final void bindFlowEvent() {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_update_feed_height".length();
        }
        C12572a.m23692a(this, false, new HomeFeedWidget$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.feed.QuoteEvent:home_feed_update_feed_height", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_tab_change".length();
        }
        C12572a.m23692a(this, false, new HomeFeedWidget$bindFlowEvent$$inlined$bindFlowEvent$default$2("com.kubi.home.feed.QuoteEvent:home_feed_tab_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_flutter_tab_change".length();
        }
        C12572a.m23692a(this, false, new HomeFeedWidget$bindFlowEvent$$inlined$bindFlowEvent$default$3("com.kubi.home.feed.QuoteEvent:home_feed_flutter_tab_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:fake_tab_change".length();
        }
        C12572a.m23692a(this, false, new HomeFeedWidget$bindFlowEvent$$inlined$bindFlowEvent$default$4("com.kubi.home.feed.QuoteEvent:fake_tab_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_fake_tab_scrollX_change".length();
        }
        C12572a.m23692a(this, false, new HomeFeedWidget$bindFlowEvent$$inlined$bindFlowEvent$default$5("com.kubi.home.feed.QuoteEvent:home_feed_fake_tab_scrollX_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_tab_offset_x_change".length();
        }
        C12572a.m23692a(this, false, new HomeFeedWidget$bindFlowEvent$$inlined$bindFlowEvent$default$6("com.kubi.home.feed.QuoteEvent:home_feed_tab_offset_x_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_tab_changed".length();
        }
        C12572a.m23692a(this, false, new HomeFeedWidget$bindFlowEvent$$inlined$bindFlowEvent$default$7("com.kubi.home.feed.QuoteEvent:home_feed_tab_changed", null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public final void m53541t3() {
        SlidingTabLayout slidingTabLayout;
        int i11 = 0;
        for (Object obj : this.f42851X) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C4661d1 c4661d1M53548u3 = m53548u3();
            if (c4661d1M53548u3 != null && (slidingTabLayout = c4661d1M53548u3.f4280b) != null) {
                slidingTabLayout.m55290u(i11);
            }
            i11 = i12;
        }
        this.f42851X.clear();
        C37201i c37201i = C37201i.f82500a;
        List<HomeFeedTab> listM83222k = c37201i.m83222k();
        this.f42851X.addAll(listM83222k);
        List<String> listM83223l = c37201i.m83223l();
        this.f42852Y.clear();
        for (HomeFeedTab homeFeedTab : this.f42851X) {
            this.f42852Y.add(new Fragment());
        }
        C4661d1 c4661d1M53548u4 = m53548u3();
        if (c4661d1M53548u4 == null) {
            return;
        }
        c4661d1M53548u4.f4280b.setNeedBold(true);
        c4661d1M53548u4.f4280b.setPreFixVersion(true);
        ViewPager viewPager = c4661d1M53548u4.f4281c;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        viewPager.setAdapter(new C27103z(childFragmentManager, this.f42852Y, listM83223l));
        c4661d1M53548u4.f4280b.setViewPager(c4661d1M53548u4.f4281c);
        c4661d1M53548u4.f4280b.m55292y();
        SlidingTabLayout slidingTabLayout2 = c4661d1M53548u4.f4280b;
        C37201i c37201i2 = C37201i.f82500a;
        slidingTabLayout2.setCurrentTab(c37201i2.m83227p());
        c4661d1M53548u4.f4280b.onPageSelected(c37201i2.m83227p());
        c4661d1M53548u4.f4280b.setOnTabSelectListener(this.f42853Z);
        c4661d1M53548u4.f4280b.setOnScrollChangeListener(this.f42854a0);
        c4661d1M53548u4.f4280b.m55284k();
        c37201i2.m83217J(listM83222k, c4661d1M53548u4.f4280b);
        m53525D3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public final void m53544x3(Map<String, ? extends Object> map) {
        Object obj = map.get("tabPosition");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            m53545y3(num.intValue());
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.widget_home_feed;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44128b.m97266j("HomeFeedWidget", "[onViewCreated]");
        C27032f.m66625p(this, R$id.quote_home_feed_container, this.f42850W, null, 4, null);
        m53542v3();
        m53541t3();
        bindFlowEvent();
        C4661d1 c4661d1M53548u3 = m53548u3();
        if (c4661d1M53548u3 == null || (imageView = c4661d1M53548u3.f4282d) == null) {
            return;
        }
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.quotefacade.widgets.feed.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFeedWidget.m53523B3();
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: u3 */
    public final C4661d1 m53548u3() {
        return (C4661d1) this.f42849V.getValue(this, f42848d0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A3 */
    public final void m53522A3(double d11) {
        SlidingTabLayout slidingTabLayout;
        C4661d1 c4661d1M53548u3 = m53548u3();
        if (c4661d1M53548u3 != null && (slidingTabLayout = c4661d1M53548u3.f4280b) != null) {
            int iFloor = (int) Math.floor(d11);
            slidingTabLayout.onPageScrolled(iFloor, ((float) (d11 - ((double) iFloor))) % 1.0f, 0);
            int iRoundToInt = MathKt.roundToInt(d11);
            if (Math.abs(d11 - ((double) iRoundToInt)) < 0.05d && this.f42855b0 != iRoundToInt) {
                this.f42855b0 = iRoundToInt;
                C37201i.f82500a.m83219M(iRoundToInt);
                C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_flutter_tab_change", Integer.valueOf(this.f42855b0), 0L, 4, null);
                slidingTabLayout.onPageSelected(iRoundToInt);
            }
        }
    }

    /* JADX INFO: renamed from: D3 */
    private final void m53525D3() {
        ConstraintLayout constraintLayoutM4635b;
        C4661d1 c4661d1M53548u3 = m53548u3();
        if (c4661d1M53548u3 != null && (constraintLayoutM4635b = c4661d1M53548u3.getRoot()) != null) {
            constraintLayoutM4635b.postDelayed(new Runnable() { // from class: com.kubi.quotefacade.widgets.feed.m
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFeedWidget.m53526E3(this.f42859b);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m53526E3(HomeFeedWidget homeFeedWidget) {
        if (!homeFeedWidget.isDetached() && homeFeedWidget.isAdded()) {
            C37201i.f82500a.m83221j();
        }
    }

    /* JADX INFO: renamed from: G3 */
    public static final void m53527G3(View view, int i11, int i12, int i13, int i14) {
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_card_tab_scrollX_change", Integer.valueOf(i11), 0L, 4, null);
    }

    /* JADX INFO: renamed from: v3 */
    private final void m53542v3() {
        ConstraintLayout constraintLayout;
        C4661d1 c4661d1M53548u3 = m53548u3();
        if (c4661d1M53548u3 != null && (constraintLayout = c4661d1M53548u3.f4283e) != null) {
            constraintLayout.post(new Runnable() { // from class: com.kubi.quotefacade.widgets.feed.l
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFeedWidget.m53543w3();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public final void m53545y3(int i11) {
        C4661d1 c4661d1M53548u3 = m53548u3();
        if (c4661d1M53548u3 == null) {
            return;
        }
        c4661d1M53548u3.f4280b.m55292y();
        c4661d1M53548u3.f4280b.setCurrentTab(i11);
        c4661d1M53548u3.f4280b.setOnTabSelectListener(this.f42853Z);
        C37201i.f82500a.m83214G(i11, c4661d1M53548u3.f4280b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z3 */
    public final void m53546z3(int i11) {
        C4661d1 c4661d1M53548u3 = m53548u3();
        if (c4661d1M53548u3 == null) {
            return;
        }
        c4661d1M53548u3.f4280b.setOnScrollChangeListener(null);
        c4661d1M53548u3.f4280b.setScrollX(i11);
        c4661d1M53548u3.f4280b.setOnScrollChangeListener(this.f42854a0);
    }

    /* JADX INFO: renamed from: F3 */
    public final void m53547F3(int i11, boolean z11) {
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_tab_change", MapsKt.mapOf(TuplesKt.m90091to("tabPosition", Integer.valueOf(i11)), TuplesKt.m90091to("forceRefresh", Boolean.valueOf(z11))), 0L, 4, null);
    }
}
