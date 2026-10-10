package com.kubi.spot.quote.coin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5286o;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.timepicker.TimeModel;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.widget.AutoHeightViewPager;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.spot.R$color;
import com.kubi.spot.R$font;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$mipmap;
import com.kubi.spot.R$string;
import com.kubi.spot.kline.KuCoinKlineLiteFragment;
import com.kubi.spot.quote.market.info.CoinWrapEntity;
import com.kubi.spot.quote.market.info.MarketByCurrencyEntity;
import com.kubi.spot.quote.market.info.MarketCoinInfo;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33978va;
import f00.C37304a;
import g00.InterfaceC37754f;
import gf.C37890n;
import i10.Menu;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import t20.C44628a;
import t20.C44656o;
import w00.C45678b;

/* JADX INFO: compiled from: KuCoinCoinActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0003J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/spot/quote/coin/KuCoinCoinActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/BkucoinActivityCoinBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BkucoinActivityCoinBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "coin", "", "getCoin", "()Ljava/lang/String;", "coin$delegate", "Lkotlin/Lazy;", "titleGroup", "Landroid/widget/LinearLayout;", "getTitleGroup", "()Landroid/widget/LinearLayout;", "titleGroup$delegate", "viewModel", "Lcom/kubi/spot/quote/coin/KuCoinCoinViewModel;", "symbol", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initData", "initListener", "initView", "data", "Lcom/kubi/spot/quote/market/info/CoinWrapEntity;", "toggleCurrentFragment", "checkedId", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuCoinCoinActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCoinCoinActivity.kt\ncom/kubi/spot/quote/coin/KuCoinCoinActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n49#2,15:306\n1#3:321\n*S KotlinDebug\n*F\n+ 1 KuCoinCoinActivity.kt\ncom/kubi/spot/quote/coin/KuCoinCoinActivity\n*L\n74#1:306,15\n*E\n"})
public final class KuCoinCoinActivity extends BaseActivity {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ KProperty<Object>[] f50779n = {Reflection.property1(new PropertyReference1Impl(KuCoinCoinActivity.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BkucoinActivityCoinBinding;", 0))};

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC24293a f50780i = C45678b.m100788b(this, new Function1<C44628a, Unit>() { // from class: com.kubi.spot.quote.coin.KuCoinCoinActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C44628a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44628a c44628a) {
            invoke(c44628a);
            return Unit.INSTANCE;
        }
    }, new Function1<KuCoinCoinActivity, C44628a>() { // from class: com.kubi.spot.quote.coin.KuCoinCoinActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44628a invoke(@NotNull KuCoinCoinActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View rootView = this.this$0.getContent().getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
            return C44628a.m98735a(rootView);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Lazy f50781j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Lazy f50782k;

    /* JADX INFO: renamed from: l */
    public KuCoinCoinViewModel f50783l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public String f50784m;

    /* JADX INFO: renamed from: com.kubi.spot.quote.coin.KuCoinCoinActivity$a */
    /* JADX INFO: compiled from: KuCoinCoinActivity.kt */
    /* JADX INFO: loaded from: classes47.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/quote/coin/KuCoinCoinActivity$onCreate$3", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25466a extends ViewPager.SimpleOnPageChangeListener {
        public C25466a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            AutoHeightViewPager autoHeightViewPager;
            C44628a c44628aM62195l0 = KuCoinCoinActivity.this.m62195l0();
            if (c44628aM62195l0 == null || (autoHeightViewPager = c44628aM62195l0.f98941i) == null) {
                return;
            }
            autoHeightViewPager.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.coin.KuCoinCoinActivity$b */
    /* JADX INFO: compiled from: KuCoinCoinActivity.kt */
    /* JADX INFO: loaded from: classes47.dex */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/spot/quote/coin/KuCoinCoinActivity$onCreate$4", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25467b implements RadioGroupPlus.InterfaceC22946c {
        public C25467b() {
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            KuCoinCoinActivity.this.m62194G0(i11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.coin.KuCoinCoinActivity$c */
    /* JADX INFO: compiled from: KuCoinCoinActivity.kt */
    /* JADX INFO: loaded from: classes47.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25468c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f50787b;

        public C25468c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f50787b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f50787b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f50787b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m62159A0(C44628a c44628a, KuCoinCoinActivity kuCoinCoinActivity) {
        c44628a.f98935c.f99270d.f99276b.setText("00");
        c44628a.f98935c.f99270d.f99278d.setText("00");
        c44628a.f98935c.f99270d.f99280f.setText("00");
        kuCoinCoinActivity.m62183o0();
    }

    /* JADX INFO: renamed from: B0 */
    public static final void m62160B0(KuCoinCoinActivity kuCoinCoinActivity, View view) {
        C43852m.m96591c("B5CoinPage", "Share", null, null, 12, null);
        kuCoinCoinActivity.getContent();
        ViewParent parent = kuCoinCoinActivity.getTitleBar().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        IShareService iShareService = IShareService.f49268a.get();
        ImageShareParam imageShareParam = new ImageShareParam("coin_Share", null, false, null, false, null, null, null, null, null, 1022, null);
        imageShareParam.setBitmap(ViewExtKt.m66590u(viewGroup, C27017c.f54310a.m66512a(R$color.c_overlay)));
        IShareService.m59640c(iShareService, imageShareParam, null, 2, null);
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m62161C0(KuCoinCoinActivity kuCoinCoinActivity) {
        C43852m.m96591c("B5CoinPage", "Trade", null, null, 12, null);
        InterfaceC37754f.a.m85140l(C37304a.f82764a, kuCoinCoinActivity.f50784m, Boolean.TRUE, null, null, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E0 */
    public static final Unit m62162E0(KuCoinCoinActivity kuCoinCoinActivity) {
        C43852m.m96591c("B5CoinPage", "Convert", null, null, 12, null);
        Router router = Router.f46192a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("krn/router?biz=convert&entry=main&component=kucoin_convert_rn&route=");
        sb2.append(Uri.encode("ConvertPage?from=" + kuCoinCoinActivity.m62182m0() + "&to=USDT"));
        router.m56184f(sb2.toString()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    private final String m62182m0() {
        return (String) this.f50781j.getValue();
    }

    /* JADX INFO: renamed from: p0 */
    private final void m62184p0() {
        KuCoinCoinViewModel kuCoinCoinViewModel = this.f50783l;
        KuCoinCoinViewModel kuCoinCoinViewModel2 = null;
        if (kuCoinCoinViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            kuCoinCoinViewModel = null;
        }
        kuCoinCoinViewModel.m62202r().observe(this, new C25468c(new Function1() { // from class: com.kubi.spot.quote.coin.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinCoinActivity.m62185q0(this.f50843b, (CoinWrapEntity) obj);
            }
        }));
        KuCoinCoinViewModel kuCoinCoinViewModel3 = this.f50783l;
        if (kuCoinCoinViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            kuCoinCoinViewModel2 = kuCoinCoinViewModel3;
        }
        kuCoinCoinViewModel2.m62203s().observe(this, new C25468c(new Function1() { // from class: com.kubi.spot.quote.coin.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinCoinActivity.m62187s0(this.f50844b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m62185q0(final KuCoinCoinActivity kuCoinCoinActivity, CoinWrapEntity coinWrapEntity) {
        if (coinWrapEntity == null) {
            C27096v0 c27096v0 = new C27096v0();
            String string = kuCoinCoinActivity.getString(R$string.coin_no_data);
            C27017c c27017c = C27017c.f54310a;
            C27096v0 c27096v0M66903c = c27096v0.m66903c(string, new ForegroundColorSpan(c27017c.m66512a(R$color.c_text60)), new AbsoluteSizeSpan(C5275i0.m6241f(14.0f))).append("\n\n").m66903c(kuCoinCoinActivity.getString(R$string.coin_network_error), new ForegroundColorSpan(c27017c.m66512a(R$color.c_text20)), new AbsoluteSizeSpan(C5275i0.m6241f(12.0f)));
            Intrinsics.checkNotNullExpressionValue(c27096v0M66903c, "append(...)");
            BaseActivity.showFailView$default(kuCoinCoinActivity, c27096v0M66903c, 0, new View.OnClickListener() { // from class: com.kubi.spot.quote.coin.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KuCoinCoinActivity.m62186r0(this.f50847b, view);
                }
            }, 2, null);
        } else {
            kuCoinCoinActivity.m62197t0(coinWrapEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m62187s0(KuCoinCoinActivity kuCoinCoinActivity, Boolean bool) {
        C44656o c44656o;
        LinearLayout linearLayout;
        C44656o c44656o2;
        LinearLayout linearLayout2;
        if (bool == null) {
            return Unit.INSTANCE;
        }
        if (bool.booleanValue() && C24129b.m58030b(SiteVisibleConfigKey.Convert)) {
            C44628a c44628aM62195l0 = kuCoinCoinActivity.m62195l0();
            if (c44628aM62195l0 != null && (c44656o2 = c44628aM62195l0.f98935c) != null && (linearLayout2 = c44656o2.f99268b) != null) {
                ViewExtKt.m66594y(linearLayout2);
            }
            C43852m.m96595g("B5CoinPage", "Convert", null, null, 12, null);
        } else {
            C44628a c44628aM62195l1 = kuCoinCoinActivity.m62195l0();
            if (c44628aM62195l1 != null && (c44656o = c44628aM62195l1.f98935c) != null && (linearLayout = c44656o.f99268b) != null) {
                ViewExtKt.m66577h(linearLayout);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u0 */
    public static final Long m62188u0(MarketCoinInfo marketCoinInfo, Long t11) {
        Intrinsics.checkNotNullParameter(t11, "t");
        return Long.valueOf(C27039d.m66652l(marketCoinInfo != null ? marketCoinInfo.getArriveCountdown() : null) - t11.longValue());
    }

    /* JADX INFO: renamed from: v0 */
    public static final Long m62189v0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Long) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m62190w0(C44628a c44628a, long j11, long j12, long j13, Long l11) {
        BaseTextView baseTextView = c44628a.f98935c.f99270d.f99276b;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.ENGLISH;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(l11.longValue() / j11)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        baseTextView.setText(str);
        BaseTextView baseTextView2 = c44628a.f98935c.f99270d.f99278d;
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf((l11.longValue() % j11) / j12)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        baseTextView2.setText(str2);
        BaseTextView baseTextView3 = c44628a.f98935c.f99270d.f99280f;
        String str3 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf((l11.longValue() % j12) / j13)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        baseTextView3.setText(str3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m62192y0(Throwable th2) {
        C44128b.m97263g("KuCoinCoinActivity", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m62194G0(int i11) {
        String str;
        RadioButton radioButton;
        RadioButton radioButton2;
        RadioButton radioButton3;
        AutoHeightViewPager autoHeightViewPager;
        RadioButton radioButton4;
        RadioButton radioButton5;
        RadioButton radioButton6;
        AutoHeightViewPager autoHeightViewPager2;
        RadioButton radioButton7;
        RadioButton radioButton8;
        RadioButton radioButton9;
        AutoHeightViewPager autoHeightViewPager3;
        Typeface font = ResourcesCompat.getFont(this, R$font.semi);
        Typeface font2 = ResourcesCompat.getFont(this, R$font.medium);
        if (i11 == R$id.rb_state) {
            C44628a c44628aM62195l0 = m62195l0();
            if (c44628aM62195l0 != null && (autoHeightViewPager3 = c44628aM62195l0.f98941i) != null) {
                autoHeightViewPager3.setCurrentItem(0);
            }
            C44628a c44628aM62195l1 = m62195l0();
            if (c44628aM62195l1 != null && (radioButton9 = c44628aM62195l1.f98938f) != null) {
                radioButton9.setTypeface(font);
            }
            C44628a c44628aM62195l2 = m62195l0();
            if (c44628aM62195l2 != null && (radioButton8 = c44628aM62195l2.f98937e) != null) {
                radioButton8.setTypeface(font2);
            }
            C44628a c44628aM62195l3 = m62195l0();
            if (c44628aM62195l3 != null && (radioButton7 = c44628aM62195l3.f98939g) != null) {
                radioButton7.setTypeface(font2);
            }
            str = "State";
        } else if (i11 == R$id.rb_overview) {
            C44628a c44628aM62195l4 = m62195l0();
            if (c44628aM62195l4 != null && (autoHeightViewPager2 = c44628aM62195l4.f98941i) != null) {
                autoHeightViewPager2.setCurrentItem(1);
            }
            C44628a c44628aM62195l5 = m62195l0();
            if (c44628aM62195l5 != null && (radioButton6 = c44628aM62195l5.f98938f) != null) {
                radioButton6.setTypeface(font2);
            }
            C44628a c44628aM62195l6 = m62195l0();
            if (c44628aM62195l6 != null && (radioButton5 = c44628aM62195l6.f98937e) != null) {
                radioButton5.setTypeface(font);
            }
            C44628a c44628aM62195l7 = m62195l0();
            if (c44628aM62195l7 != null && (radioButton4 = c44628aM62195l7.f98939g) != null) {
                radioButton4.setTypeface(font2);
            }
            str = "Overview";
        } else if (i11 == R$id.rb_trade) {
            C44628a c44628aM62195l8 = m62195l0();
            if (c44628aM62195l8 != null && (autoHeightViewPager = c44628aM62195l8.f98941i) != null) {
                autoHeightViewPager.setCurrentItem(2);
            }
            C44628a c44628aM62195l9 = m62195l0();
            if (c44628aM62195l9 != null && (radioButton3 = c44628aM62195l9.f98938f) != null) {
                radioButton3.setTypeface(font2);
            }
            C44628a c44628aM62195l10 = m62195l0();
            if (c44628aM62195l10 != null && (radioButton2 = c44628aM62195l10.f98937e) != null) {
                radioButton2.setTypeface(font2);
            }
            C44628a c44628aM62195l11 = m62195l0();
            if (c44628aM62195l11 != null && (radioButton = c44628aM62195l11.f98939g) != null) {
                radioButton.setTypeface(font);
            }
            str = "Paris";
        } else {
            str = "";
        }
        C43852m.m96591c("B5CoinPage", str, null, null, 12, null);
    }

    /* JADX INFO: renamed from: l0 */
    public final C44628a m62195l0() {
        return (C44628a) this.f50780i.getValue(this, f50779n[0]);
    }

    /* JADX INFO: renamed from: n0 */
    public final LinearLayout m62196n0() {
        return (LinearLayout) this.f50782k.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0176  */
    /* JADX WARN: Code duplicated, block: B:76:0x017f  */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: t0 */
    public final void m62197t0(CoinWrapEntity coinWrapEntity) {
        int i11;
        KuCoinCoinViewModel kuCoinCoinViewModel;
        String symbol;
        Object next;
        MarketByCurrencyEntity marketByCurrencyEntity;
        SymbolInfoEntity symbolInfoEntityM85601B;
        Integer numValueOf;
        Object next2;
        MarketByCurrencyEntity marketByCurrencyEntity2;
        int iM66650j = 2;
        final C44628a c44628aM62195l0 = m62195l0();
        if (c44628aM62195l0 != null) {
            final MarketCoinInfo info = coinWrapEntity.getInfo();
            String logo = info != null ? info.getLogo() : null;
            if (logo != null && logo.length() != 0) {
                C24277v.m58540e(this, info != null ? info.getLogo() : null, (ImageView) m62196n0().findViewById(R$id.iv_coin));
            }
            boolean zM66566d = C27025c.m66566d(info != null ? Boolean.valueOf(info.isKuCoin()) : null);
            boolean z11 = C27039d.m66652l(info != null ? info.getArriveCountdown() : null) <= 0;
            if (zM66566d && z11) {
                TextView textView = (TextView) m62196n0().findViewById(R$id.tv_coin);
                CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(m62182m0());
                textView.setText(C27041f.m66669i(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null, m62182m0()));
                List<MarketByCurrencyEntity> symbols = coinWrapEntity.getSymbols();
                if (symbols != null) {
                    Iterator<T> it = symbols.iterator();
                    do {
                        if (!it.hasNext()) {
                            i11 = 1;
                            next2 = null;
                            break;
                        } else {
                            next2 = it.next();
                            marketByCurrencyEntity2 = (MarketByCurrencyEntity) next2;
                            i11 = 1;
                        }
                    } while (!Intrinsics.areEqual(marketByCurrencyEntity2 != null ? marketByCurrencyEntity2.getCategory() : null, "SPOT"));
                    MarketByCurrencyEntity marketByCurrencyEntity3 = (MarketByCurrencyEntity) next2;
                    if (marketByCurrencyEntity3 == null || (symbol = marketByCurrencyEntity3.getSymbol()) == null) {
                    }
                    this.f50784m = symbol;
                    RadioButton rbTrade = c44628aM62195l0.f98939g;
                    Intrinsics.checkNotNullExpressionValue(rbTrade, "rbTrade");
                    ViewExtKt.m66594y(rbTrade);
                    RadioGroupPlus rgp = c44628aM62195l0.f98940h;
                    Intrinsics.checkNotNullExpressionValue(rgp, "rgp");
                    ViewExtKt.m66595z(rgp, C5275i0.m6236a(264.0f));
                    AutoHeightViewPager autoHeightViewPager = c44628aM62195l0.f98941i;
                    FragmentManager supportFragmentManager = getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    MarketStateFragment marketStateFragmentNewInstance = MarketStateFragment.f50803Y.newInstance(m62182m0());
                    MarketOverviewFragment marketOverviewFragmentNewInstance = MarketOverviewFragment.f50791X.newInstance(m62182m0());
                    MarketPairsFragment marketPairsFragment = new MarketPairsFragment();
                    BaseFragment[] baseFragmentArr = new BaseFragment[3];
                    baseFragmentArr[0] = marketStateFragmentNewInstance;
                    baseFragmentArr[i11] = marketOverviewFragmentNewInstance;
                    baseFragmentArr[2] = marketPairsFragment;
                    autoHeightViewPager.setAdapter(new C27103z(supportFragmentManager, CollectionsKt.arrayListOf(baseFragmentArr), CollectionsKt.arrayListOf("", "", "")));
                    symbolInfoEntityM85601B = C37890n.f85269a.m85601B(this.f50784m);
                    if (symbolInfoEntityM85601B != null) {
                        numValueOf = Integer.valueOf(symbolInfoEntityM85601B.getPriceIncrementPrecision());
                    } else {
                        numValueOf = null;
                    }
                    iM66650j = C27039d.m66650j(numValueOf);
                } else {
                    i11 = 1;
                }
                List<MarketByCurrencyEntity> symbols2 = coinWrapEntity.getSymbols();
                if (symbols2 != null) {
                    Iterator<T> it2 = symbols2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            marketByCurrencyEntity = (MarketByCurrencyEntity) next;
                        }
                    } while (!Intrinsics.areEqual(marketByCurrencyEntity != null ? marketByCurrencyEntity.getCategory() : null, "MARGIN"));
                    MarketByCurrencyEntity marketByCurrencyEntity4 = (MarketByCurrencyEntity) next;
                    if (marketByCurrencyEntity4 != null) {
                        symbol = marketByCurrencyEntity4.getSymbol();
                    } else {
                        symbol = null;
                    }
                } else {
                    symbol = null;
                }
                if (symbol == null) {
                    symbol = m62182m0() + "-USDT";
                }
                this.f50784m = symbol;
                RadioButton rbTrade2 = c44628aM62195l0.f98939g;
                Intrinsics.checkNotNullExpressionValue(rbTrade2, "rbTrade");
                ViewExtKt.m66594y(rbTrade2);
                RadioGroupPlus rgp2 = c44628aM62195l0.f98940h;
                Intrinsics.checkNotNullExpressionValue(rgp2, "rgp");
                ViewExtKt.m66595z(rgp2, C5275i0.m6236a(264.0f));
                AutoHeightViewPager autoHeightViewPager2 = c44628aM62195l0.f98941i;
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                MarketStateFragment marketStateFragmentNewInstance2 = MarketStateFragment.f50803Y.newInstance(m62182m0());
                MarketOverviewFragment marketOverviewFragmentNewInstance2 = MarketOverviewFragment.f50791X.newInstance(m62182m0());
                MarketPairsFragment marketPairsFragment2 = new MarketPairsFragment();
                BaseFragment[] baseFragmentArr2 = new BaseFragment[3];
                baseFragmentArr2[0] = marketStateFragmentNewInstance2;
                baseFragmentArr2[i11] = marketOverviewFragmentNewInstance2;
                baseFragmentArr2[2] = marketPairsFragment2;
                autoHeightViewPager2.setAdapter(new C27103z(supportFragmentManager2, CollectionsKt.arrayListOf(baseFragmentArr2), CollectionsKt.arrayListOf("", "", "")));
                symbolInfoEntityM85601B = C37890n.f85269a.m85601B(this.f50784m);
                if (symbolInfoEntityM85601B != null) {
                    numValueOf = Integer.valueOf(symbolInfoEntityM85601B.getPriceIncrementPrecision());
                } else {
                    numValueOf = null;
                }
                iM66650j = C27039d.m66650j(numValueOf);
            } else {
                i11 = 1;
                ((TextView) m62196n0().findViewById(R$id.tv_coin)).setText(m62182m0());
                this.f50784m = m62182m0() + "-USDT";
                RadioButton rbTrade3 = c44628aM62195l0.f98939g;
                Intrinsics.checkNotNullExpressionValue(rbTrade3, "rbTrade");
                ViewExtKt.m66577h(rbTrade3);
                RadioGroupPlus rgp3 = c44628aM62195l0.f98940h;
                Intrinsics.checkNotNullExpressionValue(rgp3, "rgp");
                ViewExtKt.m66595z(rgp3, C5275i0.m6236a(176.0f));
                AutoHeightViewPager autoHeightViewPager3 = c44628aM62195l0.f98941i;
                FragmentManager supportFragmentManager3 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                autoHeightViewPager3.setAdapter(new C27103z(supportFragmentManager3, CollectionsKt.arrayListOf(MarketStateFragment.f50803Y.newInstance(m62182m0()), MarketOverviewFragment.f50791X.newInstance(m62182m0())), CollectionsKt.arrayListOf("", "")));
            }
            KuCoinKlineLiteFragment kuCoinKlineLiteFragmentNewInstance = KuCoinKlineLiteFragment.f50636g0.newInstance(this.f50784m, info != null ? info.getCoinName() : null, zM66566d, Integer.valueOf(iM66650j));
            C5286o.m6317a(getSupportFragmentManager(), kuCoinKlineLiteFragmentNewInstance, R$id.fl_kline);
            C5286o.m6329m(kuCoinKlineLiteFragmentNewInstance);
            c44628aM62195l0.f98940h.m54743f(R$id.rb_state);
            showContentView();
            if (!z11) {
                c44628aM62195l0.f98935c.f99271e.setDisplayedChild(i11);
                C43852m.m96594f("B5CoinPage", "ComingSoon", "1", TuplesKt.m90091to("symbol", C27041f.m66668h(this.f50784m)));
                Observable<Long> observableTake = Observable.interval(0L, 1L, TimeUnit.SECONDS).take(C27039d.m66652l(info != null ? info.getArriveCountdown() : null) + 1);
                final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.coin.n
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KuCoinCoinActivity.m62188u0(info, (Long) obj);
                    }
                };
                Observable observableObserveOn = observableTake.map(new io.reactivex.functions.Function() { // from class: com.kubi.spot.quote.coin.o
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return KuCoinCoinActivity.m62189v0(function1, obj);
                    }
                }).observeOn(AndroidSchedulers.mainThread());
                final long j11 = 86400;
                final long j12 = C33978va.f72340i;
                final long j13 = 60;
                final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.coin.b
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KuCoinCoinActivity.m62190w0(c44628aM62195l0, j11, j12, j13, (Long) obj);
                    }
                };
                Consumer consumer = new Consumer() { // from class: com.kubi.spot.quote.coin.c
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        KuCoinCoinActivity.m62191x0(function2, obj);
                    }
                };
                final Function1 function3 = new Function1() { // from class: com.kubi.spot.quote.coin.d
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KuCoinCoinActivity.m62192y0((Throwable) obj);
                    }
                };
                Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.coin.e
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        KuCoinCoinActivity.m62193z0(function3, obj);
                    }
                }, new Action() { // from class: com.kubi.spot.quote.coin.f
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        KuCoinCoinActivity.m62159A0(c44628aM62195l0, this);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
                return;
            }
            if (!zM66566d) {
                ConstraintLayout root = c44628aM62195l0.f98935c.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                ViewExtKt.m66577h(root);
                NestedScrollView nsv = c44628aM62195l0.f98936d;
                Intrinsics.checkNotNullExpressionValue(nsv, "nsv");
                C27046k.m66691f(nsv, 24);
                return;
            }
            c44628aM62195l0.f98935c.f99271e.setDisplayedChild(0);
            C43852m.m96595g("B5CoinPage", "Trade", null, null, 12, null);
            KuCoinCoinViewModel kuCoinCoinViewModel2 = this.f50783l;
            if (kuCoinCoinViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                kuCoinCoinViewModel = null;
            } else {
                kuCoinCoinViewModel = kuCoinCoinViewModel2;
            }
            kuCoinCoinViewModel.m62204t(m62182m0());
        }
    }

    public KuCoinCoinActivity() {
        setPageId("B5CoinPage");
        this.f50781j = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.coin.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinCoinActivity.m62181k0(this.f50836b);
            }
        });
        this.f50782k = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.coin.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinCoinActivity.m62163F0(this.f50839b);
            }
        });
    }

    /* JADX INFO: renamed from: F0 */
    public static final LinearLayout m62163F0(KuCoinCoinActivity kuCoinCoinActivity) {
        View viewInflate = LayoutInflater.from(kuCoinCoinActivity).inflate(R$layout.bkucoin_layout_coin_header, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        return (LinearLayout) viewInflate;
    }

    /* JADX INFO: renamed from: k0 */
    public static final String m62181k0(KuCoinCoinActivity kuCoinCoinActivity) {
        Intent intent = kuCoinCoinActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return RouteExKt.m56282x(intent, "coin", "BTC");
    }

    /* JADX INFO: renamed from: o0 */
    private final void m62183o0() {
        showLoadingView();
        KuCoinCoinViewModel kuCoinCoinViewModel = this.f50783l;
        if (kuCoinCoinViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            kuCoinCoinViewModel = null;
        }
        kuCoinCoinViewModel.m62205u(m62182m0());
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m62186r0(KuCoinCoinActivity kuCoinCoinActivity, View view) {
        kuCoinCoinActivity.m62183o0();
    }

    /* JADX INFO: renamed from: x0 */
    public static final void m62191x0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z0 */
    public static final void m62193z0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        C44656o c44656o;
        LinearLayout linearLayout;
        C44656o c44656o2;
        Button button;
        RadioGroupPlus radioGroupPlus;
        AutoHeightViewPager autoHeightViewPager;
        AutoHeightViewPager autoHeightViewPager2;
        AutoHeightViewPager autoHeightViewPager3;
        AutoHeightViewPager autoHeightViewPager4;
        super.onCreate(savedInstanceState);
        this.f50783l = (KuCoinCoinViewModel) new ViewModelProvider(this).get(KuCoinCoinViewModel.class);
        View viewInflate = LayoutInflater.from(this).inflate(R$layout.bkucoin_activity_coin, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        setContentView(viewInflate);
        TitleBar titleBar = getTitleBar();
        LinearLayout linearLayoutM62196n0 = m62196n0();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, C27029c.m66599b(this, 44));
        layoutParams.gravity = 17;
        Unit unit = Unit.INSTANCE;
        titleBar.m58940m(linearLayoutM62196n0, layoutParams);
        getTitleBar().setMenu(new Menu(0, Integer.valueOf(R$mipmap.ic_share), Integer.valueOf(R$color.c_icon), 0, null, 0, 0, new View.OnClickListener() { // from class: com.kubi.spot.quote.coin.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KuCoinCoinActivity.m62160B0(this.f50810b, view);
            }
        }, 0, 377, null));
        C44628a c44628aM62195l0 = m62195l0();
        if (c44628aM62195l0 != null && (autoHeightViewPager4 = c44628aM62195l0.f98941i) != null) {
            autoHeightViewPager4.setScanScroll(false);
        }
        C44628a c44628aM62195l1 = m62195l0();
        if (c44628aM62195l1 != null && (autoHeightViewPager3 = c44628aM62195l1.f98941i) != null) {
            autoHeightViewPager3.setUseAnim(false);
        }
        C44628a c44628aM62195l2 = m62195l0();
        if (c44628aM62195l2 != null && (autoHeightViewPager2 = c44628aM62195l2.f98941i) != null) {
            autoHeightViewPager2.setOffscreenPageLimit(2);
        }
        C44628a c44628aM62195l3 = m62195l0();
        if (c44628aM62195l3 != null && (autoHeightViewPager = c44628aM62195l3.f98941i) != null) {
            autoHeightViewPager.addOnPageChangeListener(new C25466a());
        }
        C44628a c44628aM62195l4 = m62195l0();
        if (c44628aM62195l4 != null && (radioGroupPlus = c44628aM62195l4.f98940h) != null) {
            radioGroupPlus.setOnCheckedChangeListener(new C25467b());
        }
        C44628a c44628aM62195l5 = m62195l0();
        if (c44628aM62195l5 != null && (c44656o2 = c44628aM62195l5.f98935c) != null && (button = c44656o2.f99269c) != null) {
            C27046k.m66711z(button, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinCoinActivity.m62161C0(this.f50831b);
                }
            }, 1, null);
        }
        C44628a c44628aM62195l6 = m62195l0();
        if (c44628aM62195l6 != null && (c44656o = c44628aM62195l6.f98935c) != null && (linearLayout = c44656o.f99268b) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinCoinActivity.m62162E0(this.f50834b);
                }
            }, 1, null);
        }
        m62184p0();
        m62183o0();
    }
}
