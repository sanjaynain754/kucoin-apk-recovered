package com.kubi.assets.margin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.C5286o;
import com.kubi.assets.AssetV2Fragment;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.margin.cross.AssetV2CrossFragment;
import com.kubi.assets.margin.isolated.AssetV2IsolatedFragment;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37756h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p569qq.C43852m;
import p637ta.C44882v3;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: AssetV2MarginFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010&\u001a\u00020 J$\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001a2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00101\u001a\u00020/H\u0002J\b\u00102\u001a\u00020/H\u0002J\u0006\u00103\u001a\u00020/J\u0006\u00104\u001a\u00020/J\b\u00105\u001a\u00020/H\u0016J\b\u00106\u001a\u00020/H\u0016J\u0012\u00107\u001a\u00020/2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0012\u0010:\u001a\u00020/2\b\u00108\u001a\u0004\u0018\u000109H\u0002R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020 X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, m90084d2 = {"Lcom/kubi/assets/margin/AssetV2MarginFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/FragmentAssetv2MarginBinding;", "getBinding", "()Lcom/kubi/assets/databinding/FragmentAssetv2MarginBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "crossFragment", "Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;", "getCrossFragment", "()Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;", "crossFragment$delegate", "Lkotlin/Lazy;", "isolatedFragment", "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedFragment;", "getIsolatedFragment", "()Lcom/kubi/assets/margin/isolated/AssetV2IsolatedFragment;", "isolatedFragment$delegate", "openView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getOpenView", "()Landroid/view/View;", "openView$delegate", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "hideCrossTab", "isCrossTabHidden", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initOpenStatus", "loadData", "showCrossFragment", "showIsolatedFragment", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onRefresh", "onAssetsGet", "myAssetEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "applyUnifiedAccountCrossTabVisibility", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2MarginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2MarginFragment.kt\ncom/kubi/assets/margin/AssetV2MarginFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,173:1\n147#2,16:174\n135#3,2:190\n126#3,2:192\n126#3,2:194\n135#3,2:196\n*S KotlinDebug\n*F\n+ 1 AssetV2MarginFragment.kt\ncom/kubi/assets/margin/AssetV2MarginFragment\n*L\n58#1:174,16\n113#1:190,2\n127#1:192,2\n133#1:194,2\n167#1:196,2\n*E\n"})
public final class AssetV2MarginFragment extends BaseFragment implements AssetV2Fragment.InterfaceC9449a, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f17978U = C45681e.m100799e(this, new Function1<AssetV2MarginFragment, C44882v3>() { // from class: com.kubi.assets.margin.AssetV2MarginFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44882v3 invoke(@NotNull AssetV2MarginFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44882v3.m99288a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44882v3, Unit>() { // from class: com.kubi.assets.margin.AssetV2MarginFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44882v3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44882v3 c44882v3) {
            invoke(c44882v3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f17979V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.margin.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetV2MarginFragment.m17791s3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f17980W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.margin.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetV2MarginFragment.m17792z3();
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f17981X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.margin.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetV2MarginFragment.m17781F3(this.f17984b);
        }
    });

    /* JADX INFO: renamed from: Y */
    public boolean f17982Y;

    /* JADX INFO: renamed from: Z */
    public boolean f17983Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f17977b0 = {Reflection.property1(new PropertyReference1Impl(AssetV2MarginFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/FragmentAssetv2MarginBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f17976a0 = new Companion(null);

    /* JADX INFO: compiled from: AssetV2MarginFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J1\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/margin/AssetV2MarginFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/margin/AssetV2MarginFragment;", "shouldHideCrossTab", "", "isUnifiedAccount", "isSharedSite", "crossMarginBalance", "Ljava/math/BigDecimal;", "crossTotalLiability", "shouldHideCrossTab$AssetsCenterLib_googleRelease", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetV2MarginFragment newInstance() {
            return new AssetV2MarginFragment();
        }

        public final boolean shouldHideCrossTab$AssetsCenterLib_googleRelease(boolean isUnifiedAccount, boolean isSharedSite, @Nullable BigDecimal crossMarginBalance, @Nullable BigDecimal crossTotalLiability) {
            return isUnifiedAccount && isSharedSite && C41014a.m89917B(crossMarginBalance) && C41014a.m89917B(crossTotalLiability);
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static final Boolean m17778C3(LoginUserEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(AssetsDepend.f18689a.m19189j().d0().isHasOpenLever());
    }

    /* JADX INFO: renamed from: D3 */
    public static final Boolean m17779D3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Boolean) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m17782G3() {
        C43852m.m96591c("B4crossMarginAccount", "openMarginAgreement", "1", null, 8, null);
        InterfaceC37756h.a.m85147e(C37304a.f82764a, null, "B4crossMarginAccount", "confirmOpenMarginAgreement", "1", null, null, null, 113, null);
        return Unit.INSTANCE;
    }

    private final int getLayout() {
        return R$layout.fragment_assetv2_margin;
    }

    /* JADX INFO: renamed from: s3 */
    public static final AssetV2CrossFragment m17791s3() {
        return AssetV2CrossFragment.f17987Z.newInstance();
    }

    /* JADX INFO: renamed from: z3 */
    public static final AssetV2IsolatedFragment m17792z3() {
        return AssetV2IsolatedFragment.f18036Z.newInstance();
    }

    /* JADX INFO: renamed from: H3 */
    public final void m17793H3() {
        C46392a.m102328k(C42153h.f93593a.m92534x(), false);
        C5286o.m6330n(m17797u3(), m17798v3());
        m17797u3().m17836P3();
    }

    /* JADX INFO: renamed from: I3 */
    public final void m17794I3() {
        C46392a.m102328k(C42153h.f93593a.m92534x(), true);
        C5286o.m6330n(m17798v3(), m17797u3());
        m17798v3().m17939O3();
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF19867U() {
        return this.f17982Y;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(getLayout(), container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Observable observableM = AssetsDepend.f18689a.m19189j().m();
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.margin.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2MarginFragment.m17778C3((LoginUserEntity) obj);
            }
        };
        Observable observableObserveOn = observableM.map(new Function() { // from class: com.kubi.assets.margin.e
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return AssetV2MarginFragment.m17779D3(function1, obj);
            }
        }).distinctUntilChanged().observeOn(AndroidSchedulers.mainThread());
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.margin.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2MarginFragment.m17780E3(this.f18032b, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.assets.margin.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetV2MarginFragment.m17777B3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        m17800x3();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m17795r3(AssetV2OverviewEntity assetV2OverviewEntity) {
        LeverBalance crossMarginAsset;
        LeverBalance crossMarginAsset2;
        Companion companion = f17976a0;
        boolean zMo64979C = IUnifyAccountService.f53155a.get().mo64979C();
        boolean zAreEqual = Intrinsics.areEqual(SiteType.INSTANCE.getCurrentSiteType(), "global");
        BigDecimal totalLiability = null;
        BigDecimal totalBalance = (assetV2OverviewEntity == null || (crossMarginAsset2 = assetV2OverviewEntity.getCrossMarginAsset()) == null) ? null : crossMarginAsset2.getTotalBalance();
        if (assetV2OverviewEntity != null && (crossMarginAsset = assetV2OverviewEntity.getCrossMarginAsset()) != null) {
            totalLiability = crossMarginAsset.getTotalLiability();
        }
        boolean zShouldHideCrossTab$AssetsCenterLib_googleRelease = companion.shouldHideCrossTab$AssetsCenterLib_googleRelease(zMo64979C, zAreEqual, totalBalance, totalLiability);
        this.f17983Z = zShouldHideCrossTab$AssetsCenterLib_googleRelease;
        if (zShouldHideCrossTab$AssetsCenterLib_googleRelease && !C46392a.m102322d(C42153h.f93593a.m92534x(), false)) {
            C5286o.m6330n(m17798v3(), m17797u3());
        }
        m17798v3().m17940Q3(zShouldHideCrossTab$AssetsCenterLib_googleRelease);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f17982Y = z11;
    }

    /* JADX INFO: renamed from: t3 */
    public final C44882v3 m17796t3() {
        return (C44882v3) this.f17978U.getValue(this, f17977b0[0]);
    }

    /* JADX INFO: renamed from: u3 */
    public final AssetV2CrossFragment m17797u3() {
        return (AssetV2CrossFragment) this.f17979V.getValue();
    }

    /* JADX INFO: renamed from: v3 */
    public final AssetV2IsolatedFragment m17798v3() {
        return (AssetV2IsolatedFragment) this.f17980W.getValue();
    }

    /* JADX INFO: renamed from: w3 */
    public final View m17799w3() {
        return (View) this.f17981X.getValue();
    }

    /* JADX INFO: renamed from: y3, reason: from getter */
    public final boolean getF17983Z() {
        return this.f17983Z;
    }

    /* JADX INFO: renamed from: A3 */
    private final void m17776A3() {
        m17797u3().m17836P3();
        m17798v3().m17939O3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public static final void m17777B3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m17780E3(AssetV2MarginFragment assetV2MarginFragment, Boolean bool) {
        assetV2MarginFragment.m17800x3();
        assetV2MarginFragment.m17776A3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final View m17781F3(AssetV2MarginFragment assetV2MarginFragment) {
        View viewInflate = assetV2MarginFragment.getLayoutInflater().inflate(R$layout.view_open_margin, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R$id.tv_open);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.assets.margin.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2MarginFragment.m17782G3();
            }
        }, 1, null);
        ((TextView) viewInflate.findViewById(R$id.inner_empty_tips)).setText(assetV2MarginFragment.getString(R$string.lever_lend_tip_two_new, "10", "BTC", "10"));
        return viewInflate;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        if (!isShowing()) {
            return;
        }
        m17797u3().onRefresh();
        m17798v3().onRefresh();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        m17797u3().onShow();
        m17798v3().onShow();
    }

    @Override // com.kubi.assets.AssetV2Fragment.InterfaceC9449a
    /* JADX INFO: renamed from: r2 */
    public void mo15196r2(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        m17797u3().mo15196r2(assetV2OverviewEntity);
        m17798v3().mo15196r2(assetV2OverviewEntity);
        m17795r3(assetV2OverviewEntity);
    }

    /* JADX INFO: renamed from: x3 */
    public final void m17800x3() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        C44882v3 c44882v3M17796t3 = m17796t3();
        if (c44882v3M17796t3 != null && (frameLayout2 = c44882v3M17796t3.f101000b) != null) {
            frameLayout2.removeView(m17799w3());
        }
        if (AssetsDepend.f18689a.m19189j().d0().isHasOpenLever()) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            AssetV2CrossFragment assetV2CrossFragmentM17797u3 = m17797u3();
            int i11 = R$id.fragmentContainer;
            C5286o.m6317a(childFragmentManager, assetV2CrossFragmentM17797u3, i11);
            C5286o.m6317a(getChildFragmentManager(), m17798v3(), i11);
            if (this.f17983Z) {
                C5286o.m6330n(m17798v3(), m17797u3());
                return;
            } else if (C46392a.m102322d(C42153h.f93593a.m92534x(), false)) {
                m17794I3();
                return;
            } else {
                m17793H3();
                return;
            }
        }
        C44882v3 c44882v3M17796t4 = m17796t3();
        if (c44882v3M17796t4 != null && (frameLayout = c44882v3M17796t4.f101000b) != null) {
            frameLayout.addView(m17799w3());
        }
    }
}
