package com.kubi.futures.entry;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5270g;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.kubi.broker.FuturesFacedFragment;
import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.futures.FuturesRemote;
import com.kubi.futures.view.KycLeadHelper;
import com.kubi.futures.view.KycLeadView;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.ResourcePositionEntity;
import com.kubi.kumex.data.platform.model.RobotSiteConfigEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36772h2;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37214b;
import p836zl.C46894j;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: FuturesContainerFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010,\u001a\u00020*H\u0002J\u0012\u0010-\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010&H\u0002J\b\u0010/\u001a\u00020*H\u0016J\u0012\u00100\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010&H\u0016J\u0010\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020\u0019H\u0016J\b\u00103\u001a\u00020*H\u0016J\b\u00104\u001a\u00020*H\u0016J\b\u00105\u001a\u00020*H\u0002J\b\u00106\u001a\u00020*H\u0002J\b\u00107\u001a\u00020*H\u0002J\u0012\u00108\u001a\u00020*2\b\u00109\u001a\u0004\u0018\u00010:H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b\u001e\u0010\u001f¨\u0006<"}, m90084d2 = {"Lcom/kubi/futures/entry/FuturesContainerFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/futures/entry/IFuturesFragmentController;", "<init>", "()V", "futuresFragment", "Lcom/kubi/broker/FuturesFacedFragment;", "getFuturesFragment", "()Lcom/kubi/broker/FuturesFacedFragment;", "futuresFragment$delegate", "Lkotlin/Lazy;", "optionsFragment", "Lcom/kubi/futures/entry/FuturesOptionRnFragment;", "getOptionsFragment", "()Lcom/kubi/futures/entry/FuturesOptionRnFragment;", "optionsFragment$delegate", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentFuturesContainerBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentFuturesContainerBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "lastCheckedTabId", "", "isTradingCompetitionVisible", "", "tradingCompetitionUrl", "", "viewModel", "Lcom/kubi/futures/entry/FuturesContainerViewModel;", "getViewModel", "()Lcom/kubi/futures/entry/FuturesContainerViewModel;", "viewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "ensureCheckedTabVisible", "dealRouterArguments", "bundle", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onArguments", "handleKlineInMaintenance", TIMPushProvider.f75062n, "refresh", "releaseRnEngine", "enableTradingCompetitionMarquee", "refreshTopTabVisibility", "observeViewModel", "updateTradingCompetitionView", InterfaceC33617e1.f69660i, "Lcom/kubi/kumex/data/platform/model/ResourcePositionEntity;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesContainerFragment.kt\ncom/kubi/futures/entry/FuturesContainerFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,331:1\n147#2,16:332\n256#3,2:348\n256#3,2:350\n256#3,2:352\n256#3,2:354\n256#3,2:359\n256#3,2:361\n256#3,2:363\n153#4,2:356\n178#5:358\n*S KotlinDebug\n*F\n+ 1 FuturesContainerFragment.kt\ncom/kubi/futures/entry/FuturesContainerFragment\n*L\n87#1:332,16\n107#1:348,2\n108#1:350,2\n109#1:352,2\n110#1:354,2\n111#1:359,2\n297#1:361,2\n298#1:363,2\n112#1:356,2\n112#1:358\n*E\n"})
public final class FuturesContainerFragment extends BaseFragment implements IFuturesFragmentController {

    /* JADX INFO: renamed from: Y */
    public boolean f23006Y;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f23001c0 = {Reflection.property1(new PropertyReference1Impl(FuturesContainerFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentFuturesContainerBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f23000b0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f23002U = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.entry.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesContainerFragment.m25494F3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f23003V = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.entry.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesContainerFragment.m25501Q3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f23004W = C45681e.m100799e(this, new Function1<FuturesContainerFragment, C36772h2>() { // from class: com.kubi.futures.entry.FuturesContainerFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36772h2 invoke(@NotNull FuturesContainerFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36772h2.m82401a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36772h2, Unit>() { // from class: com.kubi.futures.entry.FuturesContainerFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36772h2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36772h2 c36772h2) {
            invoke(c36772h2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    public int f23005X = R$id.futuresRb;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public String f23007Z = "";

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f23008a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.entry.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesContainerFragment.m25502T3(this.f23020b);
        }
    });

    /* JADX INFO: compiled from: FuturesContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/futures/entry/FuturesContainerFragment$Companion;", "", "<init>", "()V", "EXTRA_SUB_PAGE_NAME", "", "TRADING_COMPETITION_POSITION_CODE", "TRADING_COMPETITION_IMAGE_KEY", "TRADING_COMPETITION_TEXT_KEY", "newInstance", "Lcom/kubi/futures/entry/FuturesContainerFragment;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FuturesContainerFragment newInstance() {
            return new FuturesContainerFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.entry.FuturesContainerFragment$a */
    /* JADX INFO: compiled from: FuturesContainerFragment.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/entry/FuturesContainerFragment$onViewCreated$1", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13177a implements RadioGroupPlus.InterfaceC22946c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Typeface f23010b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Typeface f23011c;

        public C13177a(Typeface typeface, Typeface typeface2) {
            this.f23010b = typeface;
            this.f23011c = typeface2;
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(final RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            RadioButton radioButton;
            RadioButton radioButton2;
            RadioButton radioButton3;
            if (z11) {
                int i12 = R$id.cpTradingRb;
                if (i11 == i12) {
                    CopyTradingConfig.f19710a.m20588B("copyHome");
                    if (radioGroupPlus != null) {
                        final FuturesContainerFragment futuresContainerFragment = FuturesContainerFragment.this;
                        C22912t.m54416n(radioGroupPlus, new Runnable() { // from class: com.kubi.futures.entry.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                FuturesContainerFragment.C13177a.m25530c(radioGroupPlus, futuresContainerFragment);
                            }
                        });
                        return;
                    }
                    return;
                }
                FuturesContainerFragment.this.f23005X = i11;
                C36772h2 c36772h2M25523I3 = FuturesContainerFragment.this.m25523I3();
                if (c36772h2M25523I3 != null && (radioButton3 = c36772h2M25523I3.f80188e) != null) {
                    radioButton3.setTypeface(i11 == R$id.futuresRb ? this.f23010b : this.f23011c);
                }
                C36772h2 c36772h2M25523I4 = FuturesContainerFragment.this.m25523I3();
                if (c36772h2M25523I4 != null && (radioButton2 = c36772h2M25523I4.f80187d) != null) {
                    radioButton2.setTypeface(i11 == i12 ? this.f23010b : this.f23011c);
                }
                C36772h2 c36772h2M25523I5 = FuturesContainerFragment.this.m25523I3();
                if (c36772h2M25523I5 != null && (radioButton = c36772h2M25523I5.f80192i) != null) {
                    radioButton.setTypeface(i11 == R$id.optionsRb ? this.f23010b : this.f23011c);
                }
                Fragment fragmentM25521G3 = i11 == R$id.futuresRb ? FuturesContainerFragment.this.m25521G3() : i11 == R$id.optionsRb ? FuturesContainerFragment.this.m25522H3() : null;
                if (fragmentM25521G3 != null) {
                    FuturesContainerFragment futuresContainerFragment2 = FuturesContainerFragment.this;
                    try {
                        FragmentTransaction fragmentTransactionBeginTransaction = futuresContainerFragment2.getChildFragmentManager().beginTransaction();
                        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
                        if (!fragmentM25521G3.isAdded()) {
                            fragmentTransactionBeginTransaction.add(R$id.contentFl, fragmentM25521G3);
                        }
                        for (Fragment fragment : futuresContainerFragment2.getChildFragmentManager().getFragments()) {
                            if (!Intrinsics.areEqual(fragment, fragmentM25521G3)) {
                                fragmentTransactionBeginTransaction.hide(fragment);
                            }
                        }
                        fragmentTransactionBeginTransaction.show(fragmentM25521G3);
                        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                    } catch (Exception e11) {
                        C37214b.m83255a(e11, "FuturesContainerFragment change fragment exception");
                    }
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public static final void m25530c(RadioGroupPlus radioGroupPlus, FuturesContainerFragment futuresContainerFragment) {
            radioGroupPlus.m54743f(futuresContainerFragment.f23005X);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.entry.FuturesContainerFragment$b */
    /* JADX INFO: compiled from: FuturesContainerFragment.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13178b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23012b;

        public C13178b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23012b = function;
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
            return this.f23012b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23012b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static final void m25492C3(TextView textView) {
        textView.setSelected(true);
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m25491A3(Bundle bundle) {
        KuMexDepend.f30378a.m35900b().mo20626g(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final FuturesFacedFragment m25494F3() {
        FuturesFacedFragment futuresFacedFragment = new FuturesFacedFragment();
        futuresFacedFragment.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("set_root_top_padding", Boolean.FALSE)));
        return futuresFacedFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public static final Unit m25499O3() {
        KuMexDepend.f30378a.m35899a().mo63683h();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m25500P3(FuturesContainerFragment futuresContainerFragment) {
        if (!StringsKt.isBlank(futuresContainerFragment.f23007Z)) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, futuresContainerFragment.f23007Z, null, null, null, null, null, null, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final FuturesOptionRnFragment m25501Q3() {
        if (C24129b.m58030b(SiteVisibleConfigKey.Option) && FuturesRemote.f23108a.m25648n()) {
            return FuturesOptionRnFragment.f23016W.instance(BundleKt.bundleOf(new Pair(Constants.BIZ, "options"), new Pair("entry", "main"), new Pair(Constants.COMPONENT, "kucoin_options_rn"), new Pair("ignoreHandleBackPressed", Boolean.TRUE), new Pair("isHybrid", 1)));
        }
        return null;
    }

    /* JADX INFO: renamed from: T3 */
    public static final FuturesContainerViewModel m25502T3(FuturesContainerFragment futuresContainerFragment) {
        return (FuturesContainerViewModel) new ViewModelProvider(futuresContainerFragment).get(FuturesContainerViewModel.class);
    }

    /* JADX INFO: renamed from: G3 */
    public final FuturesFacedFragment m25521G3() {
        return (FuturesFacedFragment) this.f23002U.getValue();
    }

    /* JADX INFO: renamed from: H3 */
    public final FuturesOptionRnFragment m25522H3() {
        return (FuturesOptionRnFragment) this.f23003V.getValue();
    }

    /* JADX INFO: renamed from: I3 */
    public final C36772h2 m25523I3() {
        return (C36772h2) this.f23004W.getValue(this, f23001c0[0]);
    }

    /* JADX INFO: renamed from: J3 */
    public final FuturesContainerViewModel m25524J3() {
        return (FuturesContainerViewModel) this.f23008a0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: S3 */
    public final void m25526S3(ResourcePositionEntity resourcePositionEntity) {
        Map<String, String> nightSrcImgMap;
        String str;
        C36772h2 c36772h2M25523I3;
        ImageView imageView;
        C36772h2 c36772h2M25523I4;
        TextView textView;
        View view;
        ConstraintLayout constraintLayout;
        Map<String, String> srcTextMap;
        Map<String, String> daySrcImgMap;
        if (DayNightThemeManager.f28592a.m33187l()) {
            if (resourcePositionEntity == null || (daySrcImgMap = resourcePositionEntity.getDaySrcImgMap()) == null) {
                str = null;
            } else {
                str = daySrcImgMap.get("kumex_trade_competition_img");
            }
        } else if (resourcePositionEntity == null || (nightSrcImgMap = resourcePositionEntity.getNightSrcImgMap()) == null) {
            str = null;
        } else {
            str = nightSrcImgMap.get("kumex_trade_competition_img");
        }
        String strM66668h = C27041f.m66668h(str);
        String strM66668h2 = C27041f.m66668h((resourcePositionEntity == null || (srcTextMap = resourcePositionEntity.getSrcTextMap()) == null) ? null : srcTextMap.get("kumex_trade_competition_text"));
        boolean z11 = (resourcePositionEntity == null || StringsKt.isBlank(strM66668h) || StringsKt.isBlank(strM66668h2)) ? false : true;
        this.f23006Y = z11;
        C36772h2 c36772h2M25523I5 = m25523I3();
        if (c36772h2M25523I5 != null && (constraintLayout = c36772h2M25523I5.f80200q) != null) {
            constraintLayout.setVisibility(z11 ? 0 : 8);
        }
        C36772h2 c36772h2M25523I6 = m25523I3();
        if (c36772h2M25523I6 != null && (view = c36772h2M25523I6.f80197n) != null) {
            view.setVisibility(z11 ? 0 : 8);
        }
        m25525R3();
        if (z11) {
            this.f23007Z = C27041f.m66668h(resourcePositionEntity != null ? resourcePositionEntity.getUrl() : null);
            if (!StringsKt.isBlank(strM66668h2) && (c36772h2M25523I4 = m25523I3()) != null && (textView = c36772h2M25523I4.f80195l) != null) {
                textView.setText(strM66668h2);
            }
            if (StringsKt.isBlank(strM66668h) || (c36772h2M25523I3 = m25523I3()) == null || (imageView = c36772h2M25523I3.f80198o) == null) {
                return;
            }
            ComponentCallbacks2C5309c.m6557u(imageView).mo6634v(strM66668h).m6594E0(imageView);
        }
    }

    @Override // com.kubi.futures.entry.IFuturesFragmentController
    /* JADX INFO: renamed from: Y0 */
    public void mo25527Y0() {
        FuturesOptionRnFragment futuresOptionRnFragmentM25522H3;
        if (!FuturesRemote.f23108a.m25647m() || (futuresOptionRnFragmentM25522H3 = m25522H3()) == null) {
            return;
        }
        futuresOptionRnFragmentM25522H3.m25544p3();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_futures_container, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX INFO: renamed from: z3 */
    public final void m25528z3(final Bundle bundle) {
        C36772h2 c36772h2M25523I3;
        RadioGroupPlus radioGroupPlus;
        RadioGroupPlus radioGroupPlus2;
        RadioGroupPlus radioGroupPlus3;
        TextView textView;
        String strM56284y = bundle != null ? RouteExKt.m56284y(bundle, "subPageName") : null;
        if (strM56284y == null) {
            c36772h2M25523I3 = m25523I3();
            if (c36772h2M25523I3 != null && (radioGroupPlus = c36772h2M25523I3.f80193j) != null) {
                radioGroupPlus.m54743f(R$id.futuresRb);
            }
            m25521G3().performArguments(bundle);
        } else {
            int iHashCode = strM56284y.hashCode();
            if (iHashCode != -1690185748) {
                if (iHashCode != -1249474914) {
                    if (iHashCode == 108685930 && strM56284y.equals("robot")) {
                        C36772h2 c36772h2M25523I4 = m25523I3();
                        if (c36772h2M25523I4 != null && (textView = c36772h2M25523I4.f80185b) != null) {
                            textView.performClick();
                        }
                    } else {
                        c36772h2M25523I3 = m25523I3();
                        if (c36772h2M25523I3 != null) {
                            radioGroupPlus.m54743f(R$id.futuresRb);
                        }
                        m25521G3().performArguments(bundle);
                    }
                } else if (strM56284y.equals("options")) {
                    C36772h2 c36772h2M25523I5 = m25523I3();
                    if (c36772h2M25523I5 != null && (radioGroupPlus3 = c36772h2M25523I5.f80193j) != null) {
                        radioGroupPlus3.m54743f(R$id.optionsRb);
                    }
                } else {
                    c36772h2M25523I3 = m25523I3();
                    if (c36772h2M25523I3 != null) {
                        radioGroupPlus.m54743f(R$id.futuresRb);
                    }
                    m25521G3().performArguments(bundle);
                }
            } else if (strM56284y.equals("copyTrading")) {
                C36772h2 c36772h2M25523I6 = m25523I3();
                if (c36772h2M25523I6 != null && (radioGroupPlus2 = c36772h2M25523I6.f80193j) != null) {
                    radioGroupPlus2.m54743f(R$id.cpTradingRb);
                }
            } else {
                c36772h2M25523I3 = m25523I3();
                if (c36772h2M25523I3 != null) {
                    radioGroupPlus.m54743f(R$id.futuresRb);
                }
                m25521G3().performArguments(bundle);
            }
        }
        C24129b.m58033e(SiteVisibleConfigKey.CopyTrading, new Function0() { // from class: com.kubi.futures.entry.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesContainerFragment.m25491A3(bundle);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m25493E3(FuturesContainerFragment futuresContainerFragment) {
        futuresContainerFragment.m25520D3();
    }

    /* JADX INFO: renamed from: K3 */
    private final void m25495K3() {
        m25524J3().m25536r().observe(getViewLifecycleOwner(), new C13178b(new Function1() { // from class: com.kubi.futures.entry.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesContainerFragment.m25496L3(this.f23025b, (ResourcePositionEntity) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m25496L3(final FuturesContainerFragment futuresContainerFragment, ResourcePositionEntity resourcePositionEntity) {
        HorizontalScrollView horizontalScrollView;
        futuresContainerFragment.m25526S3(resourcePositionEntity);
        C36772h2 c36772h2M25523I3 = futuresContainerFragment.m25523I3();
        if (c36772h2M25523I3 != null && (horizontalScrollView = c36772h2M25523I3.f80190g) != null) {
            horizontalScrollView.post(new Runnable() { // from class: com.kubi.futures.entry.b
                @Override // java.lang.Runnable
                public final void run() {
                    FuturesContainerFragment.m25497M3(this.f23019b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m25497M3(FuturesContainerFragment futuresContainerFragment) {
        futuresContainerFragment.m25520D3();
    }

    /* JADX INFO: renamed from: N3 */
    public static final void m25498N3(FuturesContainerFragment futuresContainerFragment) {
        futuresContainerFragment.m25520D3();
    }

    @Override // com.kubi.futures.entry.IFuturesFragmentController
    /* JADX INFO: renamed from: B0 */
    public void mo20214B0() {
        m25521G3().mo20214B0();
    }

    /* JADX INFO: renamed from: B3 */
    public final void m25519B3() {
        final TextView textView;
        C36772h2 c36772h2M25523I3 = m25523I3();
        if (c36772h2M25523I3 != null && (textView = c36772h2M25523I3.f80195l) != null) {
            textView.setSingleLine(true);
            textView.setHorizontallyScrolling(true);
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setMarqueeRepeatLimit(-1);
            textView.setFocusable(false);
            textView.setFocusableInTouchMode(false);
            textView.post(new Runnable() { // from class: com.kubi.futures.entry.h
                @Override // java.lang.Runnable
                public final void run() {
                    FuturesContainerFragment.m25492C3(textView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final void m25520D3() {
        C36772h2 c36772h2M25523I3;
        View futuresRb;
        int width;
        if (getView() != null && isAdded() && (c36772h2M25523I3 = m25523I3()) != null) {
            HorizontalScrollView hsl = c36772h2M25523I3.f80190g;
            Intrinsics.checkNotNullExpressionValue(hsl, "hsl");
            int i11 = this.f23005X;
            if (i11 == R$id.futuresRb) {
                futuresRb = c36772h2M25523I3.f80188e;
                Intrinsics.checkNotNullExpressionValue(futuresRb, "futuresRb");
            } else if (i11 == R$id.cpTradingRb) {
                futuresRb = c36772h2M25523I3.f80187d;
                Intrinsics.checkNotNullExpressionValue(futuresRb, "cpTradingRb");
            } else if (i11 == R$id.optionsRb) {
                futuresRb = c36772h2M25523I3.f80192i;
                Intrinsics.checkNotNullExpressionValue(futuresRb, "optionsRb");
            } else if (i11 == R$id.botTv) {
                futuresRb = c36772h2M25523I3.f80185b;
                Intrinsics.checkNotNullExpressionValue(futuresRb, "botTv");
            } else {
                futuresRb = c36772h2M25523I3.f80188e;
                Intrinsics.checkNotNullExpressionValue(futuresRb, "futuresRb");
            }
            if (futuresRb.getWidth() != 0 && hsl.getWidth() != 0) {
                int left = ((futuresRb.getLeft() + futuresRb.getRight()) / 2) - (hsl.getWidth() / 2);
                View childAt = hsl.getChildAt(0);
                if (childAt != null) {
                    width = childAt.getWidth();
                } else {
                    width = 0;
                }
                hsl.scrollTo(RangesKt.coerceIn(left, 0, RangesKt.coerceAtLeast(width - hsl.getWidth(), 0)), 0);
                return;
            }
            hsl.post(new Runnable() { // from class: com.kubi.futures.entry.k
                @Override // java.lang.Runnable
                public final void run() {
                    FuturesContainerFragment.m25493E3(this.f23026b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m25525R3() {
        HorizontalScrollView horizontalScrollView;
        HorizontalScrollView horizontalScrollView2;
        if (m25522H3() == null && !C24129b.m58030b(SiteVisibleConfigKey.CopyTrading) && !C24129b.m58030b(SiteVisibleConfigKey.TradingBot)) {
            C36772h2 c36772h2M25523I3 = m25523I3();
            if (c36772h2M25523I3 != null && (horizontalScrollView2 = c36772h2M25523I3.f80190g) != null) {
                C27046k.m66700o(horizontalScrollView2);
                return;
            }
            return;
        }
        C36772h2 c36772h2M25523I4 = m25523I3();
        if (c36772h2M25523I4 != null && (horizontalScrollView = c36772h2M25523I4.f80190g) != null) {
            C27046k.m66685H(horizontalScrollView);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onArguments(@Nullable Bundle bundle) {
        super.onArguments(bundle);
        m25528z3(bundle);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        KycLeadView kycLeadView;
        super.onShow();
        m25519B3();
        KycLeadHelper kycLeadHelper = KycLeadHelper.f25001a;
        C36772h2 c36772h2M25523I3 = m25523I3();
        if (c36772h2M25523I3 != null) {
            kycLeadView = c36772h2M25523I3.f80191h;
        } else {
            kycLeadView = null;
        }
        kycLeadHelper.m28852a(kycLeadView, LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ConstraintLayout constraintLayout;
        TextView textView;
        HorizontalScrollView horizontalScrollView;
        RadioGroupPlus radioGroupPlus;
        TextView textView2;
        View view2;
        ConstraintLayout constraintLayout2;
        RadioButton radioButton;
        int i11;
        RadioButton radioButton2;
        boolean z11;
        int i12;
        ConstraintLayout constraintLayout3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36772h2 c36772h2M25523I3 = m25523I3();
        int i13 = 0;
        if (c36772h2M25523I3 != null && (constraintLayout3 = c36772h2M25523I3.f80194k) != null) {
            constraintLayout3.setPadding(0, C5270g.m6194h(), 0, 0);
        }
        C36772h2 c36772h2M25523I4 = m25523I3();
        boolean z12 = true;
        if (c36772h2M25523I4 != null && (radioButton2 = c36772h2M25523I4.f80192i) != null) {
            if (m25522H3() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            radioButton2.setVisibility(i12);
        }
        C36772h2 c36772h2M25523I5 = m25523I3();
        if (c36772h2M25523I5 != null && (radioButton = c36772h2M25523I5.f80187d) != null) {
            if (C24129b.m58030b(SiteVisibleConfigKey.CopyTrading)) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            radioButton.setVisibility(i11);
        }
        C36772h2 c36772h2M25523I6 = m25523I3();
        if (c36772h2M25523I6 != null && (constraintLayout2 = c36772h2M25523I6.f80200q) != null) {
            constraintLayout2.setVisibility(8);
        }
        C36772h2 c36772h2M25523I7 = m25523I3();
        if (c36772h2M25523I7 != null && (view2 = c36772h2M25523I7.f80197n) != null) {
            view2.setVisibility(8);
        }
        C36772h2 c36772h2M25523I8 = m25523I3();
        if (c36772h2M25523I8 != null && (textView2 = c36772h2M25523I8.f80185b) != null) {
            if (C24129b.m58030b(SiteVisibleConfigKey.TradingBot)) {
                Boolean boolIsSupportFutures = null;
                RobotSiteConfigEntity robotSiteConfigEntity = (RobotSiteConfigEntity) C46392a.f104043a.m102336j(C46894j.f104736a.m103252Q(), RobotSiteConfigEntity.class, null);
                if (robotSiteConfigEntity != null) {
                    boolIsSupportFutures = robotSiteConfigEntity.isSupportFutures();
                }
                if (!C27025c.m66566d(boolIsSupportFutures)) {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            if (!z12) {
                i13 = 8;
            }
            textView2.setVisibility(i13);
        }
        m25525R3();
        m25519B3();
        Typeface font = ResourcesCompat.getFont(view.getContext(), R$font.regular);
        Typeface font2 = ResourcesCompat.getFont(view.getContext(), R$font.medium);
        C36772h2 c36772h2M25523I9 = m25523I3();
        if (c36772h2M25523I9 != null && (radioGroupPlus = c36772h2M25523I9.f80193j) != null) {
            radioGroupPlus.setOnCheckedChangeListener(new C13177a(font2, font));
        }
        m25528z3(getArguments());
        C36772h2 c36772h2M25523I10 = m25523I3();
        if (c36772h2M25523I10 != null && (horizontalScrollView = c36772h2M25523I10.f80190g) != null) {
            horizontalScrollView.post(new Runnable() { // from class: com.kubi.futures.entry.e
                @Override // java.lang.Runnable
                public final void run() {
                    FuturesContainerFragment.m25498N3(this.f23021b);
                }
            });
        }
        C36772h2 c36772h2M25523I11 = m25523I3();
        if (c36772h2M25523I11 != null && (textView = c36772h2M25523I11.f80185b) != null) {
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.futures.entry.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesContainerFragment.m25499O3();
                }
            }, 1, null);
        }
        C36772h2 c36772h2M25523I12 = m25523I3();
        if (c36772h2M25523I12 != null && (constraintLayout = c36772h2M25523I12.f80200q) != null) {
            C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.futures.entry.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesContainerFragment.m25500P3(this.f23022b);
                }
            }, 1, null);
        }
        m25495K3();
        m25524J3().m25537s("topPerpAds");
    }

    @Override // com.kubi.futures.entry.IFuturesFragmentController
    /* JADX INFO: renamed from: q1 */
    public void mo20216q1(boolean z11) {
        m25521G3().mo20216q1(z11);
    }
}
