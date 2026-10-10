package com.kubi.quotefacade.widgets.feed;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import bv.C4664e1;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.config.HomeFeedTab;
import com.kubi.kucoin.home.p090v2.cards.BaseCardV2;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233ej.C37201i;
import p233ej.C37202j;
import p739ww.C45938b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
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

/* JADX INFO: compiled from: HomeFeedRNWidget.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0002*\u0001\u0013\u0018\u0000 >2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020#H\u0002J\b\u0010)\u001a\u00020#H\u0002J\b\u0010*\u001a\u00020#H\u0002J\b\u0010+\u001a\u00020#H\u0002J\b\u0010,\u001a\u00020#H\u0002J\b\u0010-\u001a\u00020#H\u0002J\u001c\u0010.\u001a\u00020#2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020200H\u0002J\u0010\u00103\u001a\u00020#2\u0006\u00104\u001a\u00020\u000bH\u0002J\u0010\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020\u000bH\u0002J\u001a\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u0005H\u0002J\u0010\u0010;\u001a\u00020#2\u0006\u0010<\u001a\u00020=H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010:\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/feed/HomeFeedRNWidget;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;", "<init>", "()V", "useRNHomeFeedTab", "", "getUseRNHomeFeedTab", "()Z", "useRNHomeFeedTab$delegate", "Lkotlin/Lazy;", "getLayout", "", "homeTabs", "Ljava/util/ArrayList;", "Lcom/kubi/home/config/HomeFeedTab;", "Lkotlin/collections/ArrayList;", "fragments", "Landroidx/fragment/app/Fragment;", "tabSelectListener", "com/kubi/quotefacade/widgets/feed/HomeFeedRNWidget$tabSelectListener$2$1", "getTabSelectListener", "()Lcom/kubi/quotefacade/widgets/feed/HomeFeedRNWidget$tabSelectListener$2$1;", "tabSelectListener$delegate", "tabScrollChangeListener", "Landroid/view/View$OnScrollChangeListener;", "getTabScrollChangeListener", "()Landroid/view/View$OnScrollChangeListener;", "tabScrollChangeListener$delegate", "binding", "Lcom/kubi/quotefacade/databinding/WidgetHomeFeedRnBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/WidgetHomeFeedRnBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configTabs", "tryInitFeedFragment", "notifyItemCreate", "postTryJumpFeedTabByRouter", "bindFlowEvent", "notifyFeedInTop", "onFakeTabChange", "map", "", "", "", "onNotifyTabChange", "pos", "onNotifyTabScrollXChange", "scrollX", "sendTabChangeToRN", ViewProps.POSITION, "forceRefresh", "curSelectPos", "onTabOffsetXChange", "offsetX", "", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeFeedRNWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFeedRNWidget.kt\ncom/kubi/quotefacade/widgets/feed/HomeFeedRNWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,279:1\n147#2,16:280\n1878#3,3:296\n1869#3,2:299\n76#4,7:301\n76#4,7:308\n76#4,7:315\n153#4,7:322\n81#4,2:329\n153#4,7:331\n153#4,7:338\n76#4,7:345\n76#4,7:352\n76#4,7:359\n76#4,7:366\n76#4,7:373\n*S KotlinDebug\n*F\n+ 1 HomeFeedRNWidget.kt\ncom/kubi/quotefacade/widgets/feed/HomeFeedRNWidget\n*L\n91#1:280,16\n112#1:296,3\n120#1:299,2\n166#1:301,7\n174#1:308,7\n182#1:315,7\n187#1:322,7\n190#1:329,2\n195#1:331,7\n199#1:338,7\n207#1:345,7\n210#1:352,7\n213#1:359,7\n216#1:366,7\n219#1:373,7\n*E\n"})
public final class HomeFeedRNWidget extends BaseCardV2 {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f42839V = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.widgets.feed.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(HomeFeedRNWidget.m53488U3());
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public ArrayList<HomeFeedTab> f42840W = new ArrayList<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public ArrayList<Fragment> f42841X = new ArrayList<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f42842Y = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.widgets.feed.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeFeedRNWidget.m53487S3(this.f42857b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f42843Z = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.widgets.feed.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeFeedRNWidget.m53485Q3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC24293a f42844a0 = C45681e.m100799e(this, new Function1<HomeFeedRNWidget, C4664e1>() { // from class: com.kubi.quotefacade.widgets.feed.HomeFeedRNWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4664e1 invoke(@NotNull HomeFeedRNWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4664e1.m4640a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4664e1, Unit>() { // from class: com.kubi.quotefacade.widgets.feed.HomeFeedRNWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4664e1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4664e1 c4664e1) {
            invoke(c4664e1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: b0 */
    public int f42845b0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f42838d0 = {Reflection.property1(new PropertyReference1Impl(HomeFeedRNWidget.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/WidgetHomeFeedRnBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f42837c0 = new Companion(null);

    /* JADX INFO: compiled from: HomeFeedRNWidget.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/feed/HomeFeedRNWidget$Companion;", "", "<init>", "()V", "TAG", "", "HOME_FEED_NOTIFY_VISIBLE_HEIGHT_CHANGE", "HOME_FEED_JUMP_TO_FEED_TOP", "HOME_FEED_IS_STICKY_TO_BOTTOM", "HOME_FEED_TAB_CHANGED", "HOME_FEED_TAB_CHANGE", "PARAMS_IS_IN_BOTTOM", "KEY_EVENT_NAME", "HOME_FEED_EDIT_PAGE_ROUTER", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.feed.HomeFeedRNWidget$a */
    /* JADX INFO: compiled from: HomeFeedRNWidget.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/quotefacade/widgets/feed/HomeFeedRNWidget$tabSelectListener$2$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "onTabReselect", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22643a extends C45938b {
        public C22643a() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: a */
        public void mo31156a(int i11) {
            HomeFeedRNWidget.this.m53519P3(i11, true);
            C37201i c37201i = C37201i.f82500a;
            C4664e1 c4664e1M53508A3 = HomeFeedRNWidget.this.m53508A3();
            c37201i.m83214G(i11, c4664e1M53508A3 != null ? c4664e1M53508A3.f4308b : null);
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            C37201i c37201i = C37201i.f82500a;
            c37201i.m83219M(i11);
            HomeFeedRNWidget.this.m53519P3(i11, false);
            C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_flutter_tab_change", Integer.valueOf(i11), 0L, 4, null);
            HomeFeedRNWidget.this.f42845b0 = i11;
            C4664e1 c4664e1M53508A3 = HomeFeedRNWidget.this.m53508A3();
            c37201i.m83214G(i11, c4664e1M53508A3 != null ? c4664e1M53508A3.f4308b : null);
            C44128b.m97259c("HomeFeedRNWidget", "[onTabSelect] pos=" + i11);
        }
    }

    /* JADX INFO: renamed from: G3 */
    public static final void m53481G3() {
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_created", null, 0L, 6, null);
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m53482L3() {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.quotefacade.widgets.feed.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFeedRNWidget.m53483M3();
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M3 */
    public static final Unit m53483M3() {
        C44128b.m97259c("HomeFeedRNWidget", "[onClickHomeFeedEditIcon] jump");
        RouteExKt.m56217H("krn/router?biz=home&entry=main&component=home_rn_app&route=HomeFeedEditPage&needLogin=true&backup=flutter%253Froute=home%252Ffeed%252FtabEdit");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final View.OnScrollChangeListener m53485Q3() {
        return new View.OnScrollChangeListener() { // from class: com.kubi.quotefacade.widgets.feed.f
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i11, int i12, int i13, int i14) {
                HomeFeedRNWidget.m53486R3(view, i11, i12, i13, i14);
            }
        };
    }

    /* JADX INFO: renamed from: S3 */
    public static final C22643a m53487S3(HomeFeedRNWidget homeFeedRNWidget) {
        return homeFeedRNWidget.new C22643a();
    }

    /* JADX INFO: renamed from: U3 */
    public static final boolean m53488U3() {
        return C37201i.f82500a.m83231t();
    }

    private final void bindFlowEvent() {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_update_feed_height".length();
        }
        C12572a.m23692a(this, false, new HomeFeedRNWidget$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.feed.QuoteEvent:home_feed_update_feed_height", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:feed_fake_table_layout_visible_change".length();
        }
        C12572a.m23692a(this, false, new HomeFeedRNWidget$bindFlowEvent$$inlined$bindFlowEvent$default$2("com.kubi.home.event.HomeEvent:feed_fake_table_layout_visible_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_visible_height_change".length();
        }
        C12572a.m23692a(this, false, new HomeFeedRNWidget$bindFlowEvent$$inlined$bindFlowEvent$default$3("com.kubi.home.feed.QuoteEvent:home_feed_visible_height_change", null));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_tab_jump_page_top".length();
        }
        C12572a.m23692a(this, false, new HomeFeedRNWidget$bindFlowEvent$$inlined$bindFlowEvent$default$4("com.kubi.home.feed.QuoteEvent:home_tab_jump_page_top", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_on_top".length();
        }
        C12572a.m23692a(this, true, new HomeFeedRNWidget$bindFlowEvent$$inlined$bindFlowEvent$1("com.kubi.home.feed.QuoteEvent:home_feed_on_top", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:fake_tab_re_click".length();
        }
        C12572a.m23692a(this, false, new HomeFeedRNWidget$bindFlowEvent$$inlined$bindFlowEvent$default$5("com.kubi.home.feed.QuoteEvent:fake_tab_re_click", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_tab_changed".length();
        }
        C12572a.m23692a(this, false, new HomeFeedRNWidget$bindFlowEvent$$inlined$bindFlowEvent$default$6("com.kubi.home.feed.QuoteEvent:home_feed_tab_changed", null, this));
        if (m53511D3()) {
            return;
        }
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_tab_change".length();
        }
        C12572a.m23692a(this, false, new HomeFeedRNWidget$bindFlowEvent$$inlined$bindFlowEvent$default$7("com.kubi.home.feed.QuoteEvent:home_feed_tab_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_flutter_tab_change".length();
        }
        C12572a.m23692a(this, false, new HomeFeedRNWidget$bindFlowEvent$$inlined$bindFlowEvent$default$8("com.kubi.home.feed.QuoteEvent:home_feed_flutter_tab_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:fake_tab_change".length();
        }
        C12572a.m23692a(this, false, new HomeFeedRNWidget$bindFlowEvent$$inlined$bindFlowEvent$default$9("com.kubi.home.feed.QuoteEvent:fake_tab_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_fake_tab_scrollX_change".length();
        }
        C12572a.m23692a(this, false, new HomeFeedRNWidget$bindFlowEvent$$inlined$bindFlowEvent$default$10("com.kubi.home.feed.QuoteEvent:home_feed_fake_tab_scrollX_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_tab_offset_x_change".length();
        }
        C12572a.m23692a(this, false, new HomeFeedRNWidget$bindFlowEvent$$inlined$bindFlowEvent$default$11("com.kubi.home.feed.QuoteEvent:home_feed_tab_offset_x_change", null, this));
    }

    /* JADX INFO: renamed from: A3 */
    public final C4664e1 m53508A3() {
        return (C4664e1) this.f42844a0.getValue(this, f42838d0[0]);
    }

    /* JADX INFO: renamed from: B3 */
    public final View.OnScrollChangeListener m53509B3() {
        return (View.OnScrollChangeListener) this.f42843Z.getValue();
    }

    /* JADX INFO: renamed from: C3 */
    public final C22643a m53510C3() {
        return (C22643a) this.f42842Y.getValue();
    }

    /* JADX INFO: renamed from: D3 */
    public final boolean m53511D3() {
        return ((Boolean) this.f42839V.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: E3 */
    public final void m53512E3() {
        IReactNativeService.INSTANCE.get().nativeNotifyRn("homeFeed.jumpToFeedTop", new HashMap<>());
    }

    /* JADX INFO: renamed from: H3 */
    public final void m53514H3(Map<String, ? extends Object> map) {
        Object obj = map.get("tabPosition");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            m53515I3(num.intValue());
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final void m53519P3(int i11, boolean z11) {
        IReactNativeService.INSTANCE.get().nativeNotifyRn("homeFeed.tabChange", MapsKt.hashMapOf(TuplesKt.m90091to("tabPosition", Integer.valueOf(i11)), TuplesKt.m90091to("forceRefresh", Boolean.valueOf(z11))));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.widget_home_feed_rn;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m53520T3();
        m53513F3();
        if (!m53511D3()) {
            m53521z3();
            C4664e1 c4664e1M53508A3 = m53508A3();
            if (c4664e1M53508A3 != null && (imageView = c4664e1M53508A3.f4310d) != null) {
                C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.quotefacade.widgets.feed.b
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeFeedRNWidget.m53482L3();
                    }
                }, 1, null);
            }
        }
        m53518N3();
        bindFlowEvent();
    }

    /* JADX INFO: renamed from: z3 */
    public final void m53521z3() {
        SlidingTabLayout slidingTabLayout;
        int i11 = 0;
        for (Object obj : this.f42840W) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C4664e1 c4664e1M53508A3 = m53508A3();
            if (c4664e1M53508A3 != null && (slidingTabLayout = c4664e1M53508A3.f4308b) != null) {
                slidingTabLayout.m55290u(i11);
            }
            i11 = i12;
        }
        this.f42840W.clear();
        C37201i c37201i = C37201i.f82500a;
        List<HomeFeedTab> listM83222k = c37201i.m83222k();
        this.f42840W.addAll(listM83222k);
        List<String> listM83223l = c37201i.m83223l();
        this.f42841X.clear();
        for (HomeFeedTab homeFeedTab : this.f42840W) {
            this.f42841X.add(new Fragment());
        }
        C4664e1 c4664e1M53508A4 = m53508A3();
        if (c4664e1M53508A4 == null) {
            return;
        }
        c4664e1M53508A4.f4308b.setNeedBold(true);
        c4664e1M53508A4.f4308b.setPreFixVersion(true);
        ViewPager viewPager = c4664e1M53508A4.f4309c;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        viewPager.setAdapter(new C27103z(childFragmentManager, this.f42841X, listM83223l));
        c4664e1M53508A4.f4308b.setViewPager(c4664e1M53508A4.f4309c);
        c4664e1M53508A4.f4308b.m55292y();
        SlidingTabLayout slidingTabLayout2 = c4664e1M53508A4.f4308b;
        C37201i c37201i2 = C37201i.f82500a;
        slidingTabLayout2.setCurrentTab(c37201i2.m83227p());
        c4664e1M53508A4.f4308b.onPageSelected(c37201i2.m83227p());
        c4664e1M53508A4.f4308b.setOnTabSelectListener(m53510C3());
        c4664e1M53508A4.f4308b.setOnScrollChangeListener(m53509B3());
        c4664e1M53508A4.f4308b.m55284k();
        c37201i2.m83217J(listM83222k, c4664e1M53508A4.f4308b);
        m53518N3();
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m53484O3(HomeFeedRNWidget homeFeedRNWidget) {
        if (!homeFeedRNWidget.isDetached() && homeFeedRNWidget.isAdded()) {
            C37201i.f82500a.m83221j();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public static final void m53486R3(View view, int i11, int i12, int i13, int i14) {
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_card_tab_scrollX_change", Integer.valueOf(i11), 0L, 4, null);
    }

    /* JADX INFO: renamed from: F3 */
    public final void m53513F3() {
        ConstraintLayout constraintLayout;
        C4664e1 c4664e1M53508A3 = m53508A3();
        if (c4664e1M53508A3 != null && (constraintLayout = c4664e1M53508A3.f4311e) != null) {
            constraintLayout.post(new Runnable() { // from class: com.kubi.quotefacade.widgets.feed.h
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFeedRNWidget.m53481G3();
                }
            });
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final void m53515I3(int i11) {
        C4664e1 c4664e1M53508A3 = m53508A3();
        if (c4664e1M53508A3 == null) {
            return;
        }
        c4664e1M53508A3.f4308b.m55292y();
        c4664e1M53508A3.f4308b.setCurrentTab(i11);
        c4664e1M53508A3.f4308b.setOnTabSelectListener(m53510C3());
        C37201i.f82500a.m83214G(i11, c4664e1M53508A3.f4308b);
    }

    /* JADX INFO: renamed from: J3 */
    public final void m53516J3(int i11) {
        C4664e1 c4664e1M53508A3 = m53508A3();
        if (c4664e1M53508A3 == null) {
            return;
        }
        c4664e1M53508A3.f4308b.setOnScrollChangeListener(null);
        c4664e1M53508A3.f4308b.setScrollX(i11);
        c4664e1M53508A3.f4308b.setOnScrollChangeListener(m53509B3());
    }

    /* JADX INFO: renamed from: K3 */
    public final void m53517K3(double d11) {
        SlidingTabLayout slidingTabLayout;
        C4664e1 c4664e1M53508A3 = m53508A3();
        if (c4664e1M53508A3 != null && (slidingTabLayout = c4664e1M53508A3.f4308b) != null) {
            int iFloor = (int) Math.floor(d11);
            float f11 = ((float) (d11 - ((double) iFloor))) % 1.0f;
            slidingTabLayout.onPageScrolled(iFloor, f11, 0);
            int iRoundToInt = MathKt.roundToInt(d11);
            C44128b.m97259c("HomeFeedRNWidget", "[onTabOffsetXChange] offsetX=" + d11 + ", desPos=" + iFloor + ", offset=" + f11 + ", rounded=" + iRoundToInt);
            if (Math.abs(d11 - ((double) iRoundToInt)) < 0.05d && this.f42845b0 != iRoundToInt) {
                this.f42845b0 = iRoundToInt;
                C37201i.f82500a.m83219M(iRoundToInt);
                C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_flutter_tab_change", Integer.valueOf(this.f42845b0), 0L, 4, null);
                slidingTabLayout.onPageSelected(iRoundToInt);
            }
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final void m53518N3() {
        ConstraintLayout constraintLayoutM4641b;
        C4664e1 c4664e1M53508A3 = m53508A3();
        if (c4664e1M53508A3 != null && (constraintLayoutM4641b = c4664e1M53508A3.getRoot()) != null) {
            constraintLayoutM4641b.postDelayed(new Runnable() { // from class: com.kubi.quotefacade.widgets.feed.g
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFeedRNWidget.m53484O3(this.f42858b);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m53520T3() {
        if (m53511D3()) {
            C37202j.f82512a.m83240d(getContext(), getContentView());
        } else {
            C27032f.m66625p(this, R$id.quote_home_feed_container, C37202j.f82512a.m83237a(), null, 4, null);
        }
    }
}
