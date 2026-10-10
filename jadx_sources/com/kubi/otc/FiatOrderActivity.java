package com.kubi.otc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.otc.otc.order.FastTradeOrderHistoryFragment;
import com.kubi.otc.otc.order.OtcOrderListFragment;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.payment.third.order.ThirdOrderListFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.DropMenuView;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import et.InterfaceC37241c;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37591a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45678b;

/* JADX INFO: compiled from: FiatOrderActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010*\u001a\u00020\u001bH\u0014J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J+\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002¢\u0006\u0002\u00106J(\u00107\u001a\"\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010 08j\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010 `9H\u0002J(\u0010:\u001a\"\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010 08j\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010 `9H\u0002J(\u0010;\u001a\"\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010 08j\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010 `9H\u0002J(\u0010<\u001a\"\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010 08j\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010 `9H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b!\u0010\"R\u001d\u0010$\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'¨\u0006>"}, m90084d2 = {"Lcom/kubi/otc/FiatOrderActivity;", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "<init>", "()V", "otcApi", "Lcom/kubi/otc/api/OtcApi;", "kotlin.jvm.PlatformType", "getOtcApi", "()Lcom/kubi/otc/api/OtcApi;", "otcApi$delegate", "Lkotlin/Lazy;", "mOtcFragment", "Lcom/kubi/otc/otc/order/OtcOrderListFragment;", "getMOtcFragment", "()Lcom/kubi/otc/otc/order/OtcOrderListFragment;", "mOtcFragment$delegate", "mThirdFragment", "Lcom/kubi/payment/third/order/ThirdOrderListFragment;", "getMThirdFragment", "()Lcom/kubi/payment/third/order/ThirdOrderListFragment;", "mThirdFragment$delegate", "mOtcFilter", "Ljava/util/ArrayList;", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "Lkotlin/collections/ArrayList;", "mThirdFilter", "mIndex", "", "getMIndex", "()I", "mIndex$delegate", AppsFlyerProperties.CHANNEL, "", "getChannel", "()Ljava/lang/String;", "channel$delegate", "binding", "Lcom/kubi/otc/databinding/BotcActivityOrderBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcActivityOrderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "switchFilter", ViewProps.POSITION, "filterHelper", "Lcom/kubi/resources/widget/drop/DropMenuHelper;", "channels", "", "Lcom/kubi/resources/widget/drop/FilterType$Filter;", "(ILcom/kubi/resources/widget/drop/DropMenuHelper;[Lcom/kubi/resources/widget/drop/FilterType$Filter;)V", "getOtcSideTypeMap", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getThirdSideTypeMap", "getP2PStatusTypeMap", "getThirdStatusTypeMap", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatOrderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatOrderActivity.kt\ncom/kubi/otc/FiatOrderActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,206:1\n49#2,15:207\n1#3:222\n13472#4,2:223\n*S KotlinDebug\n*F\n+ 1 FiatOrderActivity.kt\ncom/kubi/otc/FiatOrderActivity\n*L\n49#1:207,15\n109#1:223,2\n*E\n"})
public final class FiatOrderActivity extends BaseUiActivity {

    /* JADX INFO: renamed from: y */
    @Nullable
    public ArrayList<C23034a.a> f37074y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public ArrayList<C23034a.a> f37075z;

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ KProperty<Object>[] f37067E = {Reflection.property1(new PropertyReference1Impl(FiatOrderActivity.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcActivityOrderBinding;", 0))};

    /* JADX INFO: renamed from: D */
    @NotNull
    public static final Companion f37066D = new Companion(null);

    /* JADX INFO: renamed from: v */
    @NotNull
    public final Lazy f37071v = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatOrderActivity.m43928P0();
        }
    });

    /* JADX INFO: renamed from: w */
    @NotNull
    public final Lazy f37072w = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatOrderActivity.m43922J0();
        }
    });

    /* JADX INFO: renamed from: x */
    @NotNull
    public final Lazy f37073x = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatOrderActivity.m43923K0();
        }
    });

    /* JADX INFO: renamed from: A */
    @NotNull
    public final Lazy f37068A = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(FiatOrderActivity.m43921I0(this.f37650b));
        }
    });

    /* JADX INFO: renamed from: B */
    @NotNull
    public final Lazy f37069B = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatOrderActivity.m43942w0(this.f37651b);
        }
    });

    /* JADX INFO: renamed from: C */
    @NotNull
    public final InterfaceC24293a f37070C = C45678b.m100788b(this, new Function1<C37591a, Unit>() { // from class: com.kubi.otc.FiatOrderActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C37591a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37591a c37591a) {
            invoke(c37591a);
            return Unit.INSTANCE;
        }
    }, new Function1<FiatOrderActivity, C37591a>() { // from class: com.kubi.otc.FiatOrderActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37591a invoke(@NotNull FiatOrderActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View view = this.this$0.f46504p;
            Intrinsics.checkNotNullExpressionValue(view, "access$getContentView$p$s828584903(...)");
            return C37591a.m84766a(view);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: compiled from: FiatOrderActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/otc/FiatOrderActivity$Companion;", "", "<init>", "()V", "INDEX_FAST", "", "INDEX_C2C", "INDEX_THIRD", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.FiatOrderActivity$a */
    /* JADX INFO: compiled from: FiatOrderActivity.kt */
    /* JADX INFO: loaded from: classes32.dex */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/otc/FiatOrderActivity$onCreate$2$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", ViewProps.POSITION, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19644a implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C23034a f37077c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ FilterType.C23032a[] f37078d;

        public C19644a(C23034a c23034a, FilterType.C23032a[] c23032aArr) {
            this.f37077c = c23034a;
            this.f37078d = c23032aArr;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            FiatOrderActivity.this.m43950Q0(position, this.f37077c, this.f37078d);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        DropMenuView dropMenuView;
        SlidingTabLayout slidingTabLayout;
        SlidingTabLayout slidingTabLayout2;
        SlidingTabLayout slidingTabLayout3;
        RtlViewPager rtlViewPager;
        RtlViewPager rtlViewPager2;
        super.onCreate(savedInstanceState);
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.setMainTitle(getString(R$string.my_order));
        } else {
            getTitleBar().setTitle(getString(R$string.my_order));
        }
        C37591a c37591aM43951x0 = m43951x0();
        if (c37591aM43951x0 != null && (rtlViewPager2 = c37591aM43951x0.f83589e) != null) {
            rtlViewPager2.setOffscreenPageLimit(2);
        }
        C37591a c37591aM43951x1 = m43951x0();
        if (c37591aM43951x1 != null && (rtlViewPager = c37591aM43951x1.f83589e) != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            rtlViewPager.setAdapter(new C27103z(supportFragmentManager, CollectionsKt.arrayListOf(new FastTradeOrderHistoryFragment(), m43944A0(), m43945B0()), CollectionsKt.listOf((Object[]) new String[]{getString(R$string.otc_fast_trade), getString(R$string.otc), getString(R$string.visa_deposit)})));
        }
        C37591a c37591aM43951x2 = m43951x0();
        if (c37591aM43951x2 != null && (slidingTabLayout3 = c37591aM43951x2.f83587c) != null) {
            slidingTabLayout3.setNeedBold(true);
        }
        C37591a c37591aM43951x3 = m43951x0();
        if (c37591aM43951x3 != null && (slidingTabLayout2 = c37591aM43951x3.f83587c) != null) {
            C37591a c37591aM43951x4 = m43951x0();
            slidingTabLayout2.setViewPager(c37591aM43951x4 != null ? c37591aM43951x4.f83589e : null);
        }
        C37591a c37591aM43951x5 = m43951x0();
        if (c37591aM43951x5 != null && (slidingTabLayout = c37591aM43951x5.f83587c) != null) {
            slidingTabLayout.setCurrentTab(C27039d.m66650j(Integer.valueOf(m43943z0())));
        }
        C37591a c37591aM43951x6 = m43951x0();
        if (c37591aM43951x6 != null && (dropMenuView = c37591aM43951x6.f83586b) != null) {
            dropMenuView.setNew(Boolean.TRUE);
        }
        Disposable disposableSubscribe = m43920C0().m83334l().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.otc.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatOrderActivity.m43927O0(this.f37652b, (Map) obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        Observable<R> observableCompose = m43920C0().m83329g("notification.otc").compose(C24217a1.m58389m());
        Consumer consumer = new Consumer() { // from class: com.kubi.otc.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatOrderActivity.m43924L0(obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatOrderActivity.m43925M0((Throwable) obj);
            }
        };
        Disposable disposableSubscribe2 = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.otc.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatOrderActivity.m43926N0(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        CompositeDisposable compositeDisposable2 = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable2, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe2, compositeDisposable2);
        OtcUserManager.m45480l(OtcUserManager.f38144a, null, 1, null);
    }

    /* JADX INFO: renamed from: C0 */
    private final InterfaceC37241c m43920C0() {
        return (InterfaceC37241c) this.f37071v.getValue();
    }

    /* JADX INFO: renamed from: J0 */
    public static final OtcOrderListFragment m43922J0() {
        return new OtcOrderListFragment();
    }

    /* JADX INFO: renamed from: K0 */
    public static final ThirdOrderListFragment m43923K0() {
        return new ThirdOrderListFragment();
    }

    /* JADX INFO: renamed from: O0 */
    public static final void m43927O0(FiatOrderActivity fiatOrderActivity, Map map) {
        FilterType.C23032a c23032a;
        RtlViewPager rtlViewPager;
        FilterType.C23032a[] c23032aArrConvert2Filter = FilterType.f44543a.convert2Filter(map, false);
        C23034a c23034a = new C23034a();
        C37591a c37591aM43951x0 = fiatOrderActivity.m43951x0();
        BaseTextView baseTextView = c37591aM43951x0 != null ? c37591aM43951x0.f83588d : null;
        C37591a c37591aM43951x1 = fiatOrderActivity.m43951x0();
        c23034a.m55160d(baseTextView, c37591aM43951x1 != null ? c37591aM43951x1.f83586b : null);
        C37591a c37591aM43951x2 = fiatOrderActivity.m43951x0();
        if (c37591aM43951x2 != null && (rtlViewPager = c37591aM43951x2.f83589e) != null) {
            rtlViewPager.addOnPageChangeListener(fiatOrderActivity.new C19644a(c23034a, c23032aArrConvert2Filter));
        }
        fiatOrderActivity.m43950Q0(C27039d.m66650j(Integer.valueOf(fiatOrderActivity.m43943z0())), c23034a, c23032aArrConvert2Filter);
        if (fiatOrderActivity.m43952y0().length() > 0) {
            int length = c23032aArrConvert2Filter.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    c23032a = null;
                    break;
                }
                c23032a = c23032aArrConvert2Filter[i11];
                if (Intrinsics.areEqual(c23032a.getF44545b(), fiatOrderActivity.m43952y0())) {
                    break;
                } else {
                    i11++;
                }
            }
            if (c23032a != null) {
                ThirdOrderListFragment.m49605S3(fiatOrderActivity.m43945B0(), fiatOrderActivity.m43952y0(), null, null, 6, null);
                for (FilterType.C23032a c23032a2 : c23032aArrConvert2Filter) {
                    c23032a2.mo55155c(Intrinsics.areEqual(c23032a2.getF44545b(), fiatOrderActivity.m43952y0()));
                }
                return;
            }
        }
        ThirdOrderListFragment thirdOrderListFragmentM43945B0 = fiatOrderActivity.m43945B0();
        FilterType.C23032a c23032a3 = (FilterType.C23032a) ArraysKt.firstOrNull(c23032aArrConvert2Filter);
        ThirdOrderListFragment.m49605S3(thirdOrderListFragmentM43945B0, C27041f.m66668h(c23032a3 != null ? c23032a3.getF44545b() : null), null, null, 6, null);
    }

    /* JADX INFO: renamed from: z0 */
    private final int m43943z0() {
        return ((Number) this.f37068A.getValue()).intValue();
    }

    /* JADX INFO: renamed from: A0 */
    public final OtcOrderListFragment m43944A0() {
        return (OtcOrderListFragment) this.f37072w.getValue();
    }

    /* JADX INFO: renamed from: B0 */
    public final ThirdOrderListFragment m43945B0() {
        return (ThirdOrderListFragment) this.f37073x.getValue();
    }

    /* JADX INFO: renamed from: E0 */
    public final LinkedHashMap<String, String> m43946E0() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("SELL", getString(R$string.otc_buy));
        linkedHashMap.put("BUY", getString(R$string.otc_sell));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: F0 */
    public final LinkedHashMap<String, String> m43947F0() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("PROCESSING", getString(R$string.payment_status_processing));
        linkedHashMap.put("DONE", getString(R$string.completed));
        linkedHashMap.put(OrderDetailInfo.ORDER_STATUS_CANCELED, getString(R$string.canceled));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: G0 */
    public final LinkedHashMap<String, String> m43948G0() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("BUY", getString(R$string.otc_buy));
        linkedHashMap.put("SELL", getString(R$string.otc_sell));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: H0 */
    public final LinkedHashMap<String, String> m43949H0() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("PROCESSING", getString(R$string.payment_status_processing));
        linkedHashMap.put("DONE", getString(R$string.completed));
        linkedHashMap.put(OrderDetailInfo.ORDER_STATUS_CANCELED, getString(R$string.canceled));
        linkedHashMap.put("FAILED", getString(R$string.failed));
        linkedHashMap.put("REFUNDED", getString(R$string.payment_order_refunded));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m43950Q0(int i11, C23034a c23034a, FilterType.C23032a[] c23032aArr) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        if (i11 == 0) {
            C37591a c37591aM43951x0 = m43951x0();
            if (c37591aM43951x0 == null || (baseTextView2 = c37591aM43951x0.f83588d) == null) {
                return;
            }
            C27046k.m66700o(baseTextView2);
            return;
        }
        if (this.f37074y == null) {
            ArrayList<C23034a.a> arrayList = new ArrayList<>();
            this.f37074y = arrayList;
            arrayList.add(new C23034a.a(getString(R$string.type), FilterType.Companion.convert2Filter$default(FilterType.f44543a, m43946E0(), false, 2, null)));
            ArrayList<C23034a.a> arrayList2 = this.f37074y;
            if (arrayList2 != null) {
                arrayList2.add(new C23034a.a(getString(R$string.status), FilterType.Companion.convert2Filter$default(FilterType.f44543a, m43947F0(), false, 2, null)));
            }
        }
        if (this.f37075z == null) {
            ArrayList<C23034a.a> arrayList3 = new ArrayList<>();
            this.f37075z = arrayList3;
            arrayList3.add(new C23034a.a(getString(R$string.channel), c23032aArr));
            ArrayList<C23034a.a> arrayList4 = this.f37075z;
            if (arrayList4 != null) {
                arrayList4.add(new C23034a.a(getString(R$string.type), FilterType.Companion.convert2Filter$default(FilterType.f44543a, m43948G0(), false, 2, null)));
            }
            ArrayList<C23034a.a> arrayList5 = this.f37075z;
            if (arrayList5 != null) {
                arrayList5.add(new C23034a.a(getString(R$string.status), FilterType.Companion.convert2Filter$default(FilterType.f44543a, m43949H0(), false, 2, null)));
            }
        }
        C37591a c37591aM43951x1 = m43951x0();
        if (c37591aM43951x1 != null && (baseTextView = c37591aM43951x1.f83588d) != null) {
            C27046k.m66685H(baseTextView);
        }
        c23034a.m55162f();
        c23034a.m55164h(i11 == 1 ? this.f37074y : this.f37075z, new Consumer() { // from class: com.kubi.otc.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatOrderActivity.m43929R0(this.f37654b, (List) obj);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.botc_activity_order;
    }

    /* JADX INFO: renamed from: x0 */
    public final C37591a m43951x0() {
        return (C37591a) this.f37070C.getValue(this, f37067E[0]);
    }

    /* JADX INFO: renamed from: y0 */
    public final String m43952y0() {
        return (String) this.f37069B.getValue();
    }

    public FiatOrderActivity() {
        setPageId("B7BuyCryptoOrders");
    }

    /* JADX INFO: renamed from: I0 */
    public static final int m43921I0(FiatOrderActivity fiatOrderActivity) {
        Integer numM56264o;
        Intent intent = fiatOrderActivity.getIntent();
        if (intent != null) {
            numM56264o = RouteExKt.m56264o(intent, "index");
        } else {
            numM56264o = null;
        }
        return C27039d.m66650j(numM56264o);
    }

    /* JADX INFO: renamed from: M0 */
    public static final Unit m43925M0(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N0 */
    public static final void m43926N0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P0 */
    public static final InterfaceC37241c m43928P0() {
        return (InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class);
    }

    /* JADX INFO: renamed from: R0 */
    public static final void m43929R0(FiatOrderActivity fiatOrderActivity, List list) {
        Integer numValueOf;
        SlidingTabLayout slidingTabLayout;
        C37591a c37591aM43951x0 = fiatOrderActivity.m43951x0();
        if (c37591aM43951x0 != null && (slidingTabLayout = c37591aM43951x0.f83587c) != null) {
            numValueOf = Integer.valueOf(slidingTabLayout.getCurrentTab());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            fiatOrderActivity.m43944A0().m45003W3(((FilterType.InterfaceC23033b) list.get(0)).getF44545b(), ((FilterType.InterfaceC23033b) list.get(1)).getF44545b());
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            fiatOrderActivity.m43945B0().m49610R3(((FilterType.InterfaceC23033b) list.get(0)).getF44545b(), ((FilterType.InterfaceC23033b) list.get(1)).getF44545b(), ((FilterType.InterfaceC23033b) list.get(2)).getF44545b());
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static final String m43942w0(FiatOrderActivity fiatOrderActivity) {
        String strM56280w;
        Intent intent = fiatOrderActivity.getIntent();
        if (intent != null) {
            strM56280w = RouteExKt.m56280w(intent, AppsFlyerProperties.CHANNEL);
        } else {
            strM56280w = null;
        }
        return C27041f.m66668h(strM56280w);
    }

    /* JADX INFO: renamed from: L0 */
    public static final void m43924L0(Object obj) {
    }
}
