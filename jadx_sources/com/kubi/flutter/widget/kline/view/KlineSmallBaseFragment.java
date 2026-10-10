package com.kubi.flutter.widget.kline.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.tabs.TabLayout;
import com.kubi.event.api.C12572a;
import com.kubi.flutter.widget.R$array;
import com.kubi.flutter.widget.R$id;
import com.kubi.flutter.widget.R$layout;
import com.kubi.flutter.widget.kline.IKLineContainer;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import com.kubi.flutter.widget.kline.KLineContainer;
import com.kubi.flutter.widget.kline.KLineConverter;
import com.kubi.flutter.widget.kline.KLineLoadingState;
import com.kubi.flutter.widget.kline.KLineType;
import com.kubi.flutter.widget.kline.KLineViewController;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.IKlineFragment;
import com.kubi.sdk.flutter.delegate.FlutterAnrStopgapConfig;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38190h;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KlineSmallBaseFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\f*\u0001(\b&\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0002MNB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH$J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001dH$J\"\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101J\b\u00102\u001a\u00020\u001fH\u0016J\u0018\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u0002052\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u00106\u001a\u00020\u001fH\u0002J\b\u00107\u001a\u00020\u001fH\u0002J\b\u00108\u001a\u00020\u001fH\u0002J\u000e\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020&J\u0010\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u000bH\u0002J\b\u0010=\u001a\u00020\u001fH\u0016J\b\u0010>\u001a\u00020\u001fH\u0016J\b\u0010?\u001a\u00020\u001fH\u0016J\u0010\u0010@\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020&H\u0002J\u0016\u0010B\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020C2\u0006\u0010D\u001a\u00020\u001dJ\u000e\u0010E\u001a\u00020\u001f2\u0006\u0010F\u001a\u00020\u001dJ\u000e\u0010G\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020\u001dJ\b\u0010I\u001a\u00020\u001fH\u0002J\u0017\u0010J\u001a\u00020\u001f2\b\u0010K\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0002\u0010LR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u0015X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0004\n\u0002\u0010)¨\u0006O"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/view/KlineSmallBaseFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/sdk/IKlineFragment;", "<init>", "()V", TtmlNode.TAG_LAYOUT, "Landroid/widget/LinearLayout;", "containerRef", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/kubi/flutter/widget/kline/KLineContainer;", "tabRef", "Lcom/google/android/material/tabs/TabLayout;", "controllerRef", "Lcom/kubi/flutter/widget/kline/KLineViewController;", "getControllerRef", "()Ljava/util/concurrent/atomic/AtomicReference;", "setControllerRef", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "handler", "Landroid/os/Handler;", "initParam", "Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "getInitParam", "()Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "interactor", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "getInteractor", "()Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "getCurrentKline", "", "setCurrentKline", "", "value", "symbol", "Lcom/kubi/flutter/widget/kline/view/KlineSmallBaseFragment$SymbolPair;", "ivContract", "Landroid/widget/ImageView;", "ivContractVisible", "", "stateListener", "com/kubi/flutter/widget/kline/view/KlineSmallBaseFragment$stateListener$1", "Lcom/kubi/flutter/widget/kline/view/KlineSmallBaseFragment$stateListener$1;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "createKlineContent", "ctx", "Landroid/content/Context;", "setDefaultKlineTab", "delayUpdateKlineTab", "onContractClick", "setRightTopIcVisible", ViewProps.VISIBLE, "initTab", "tabLayout", "onDataFirstLoaded", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onDestroyView", "clean", "delayed", "checkSymbol", "", "precision", "checkType", "type", "checkMain", "status", "updateKlineTab", "setKlineTypeFromTab", "pos", "(Ljava/lang/Integer;)V", "Companion", "SymbolPair", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKlineSmallBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KlineSmallBaseFragment.kt\ncom/kubi/flutter/widget/kline/view/KlineSmallBaseFragment\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,311:1\n219#2,5:312\n1#3:317\n1869#4,2:318\n*S KotlinDebug\n*F\n+ 1 KlineSmallBaseFragment.kt\ncom/kubi/flutter/widget/kline/view/KlineSmallBaseFragment\n*L\n152#1:312,5\n224#1:318,2\n*E\n"})
public abstract class KlineSmallBaseFragment extends BaseFragment implements IKlineFragment {

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Companion f22502d0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public LinearLayout f22503U;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public SymbolPair f22508Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public ImageView f22509a0;

    /* JADX INFO: renamed from: V */
    @NotNull
    public AtomicReference<KLineContainer> f22504V = new AtomicReference<>(null);

    /* JADX INFO: renamed from: W */
    @NotNull
    public AtomicReference<TabLayout> f22505W = new AtomicReference<>(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public AtomicReference<KLineViewController> f22506X = new AtomicReference<>(null);

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Handler f22507Y = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b0 */
    public boolean f22510b0 = true;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final C12818c f22511c0 = new C12818c();

    /* JADX INFO: compiled from: KlineSmallBaseFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/view/KlineSmallBaseFragment$Companion;", "", "<init>", "()V", "EXTRA_IV_CONTRACT_VISIBLE", "", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.view.KlineSmallBaseFragment$a, reason: from toString */
    /* JADX INFO: compiled from: KlineSmallBaseFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/view/KlineSmallBaseFragment$SymbolPair;", "", "symbol", "", "precision", "", "<init>", "(Ljava/lang/String;I)V", "getSymbol", "()Ljava/lang/String;", "getPrecision", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @VisibleForTesting
    public static final /* data */ class SymbolPair {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String symbol;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final int precision;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SymbolPair)) {
                return false;
            }
            SymbolPair symbolPair = (SymbolPair) other;
            return Intrinsics.areEqual(this.symbol, symbolPair.symbol) && this.precision == symbolPair.precision;
        }

        public SymbolPair(@NotNull String symbol, int i11) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.symbol = symbol;
            this.precision = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getPrecision() {
            return this.precision;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            return (this.symbol.hashCode() * 31) + Integer.hashCode(this.precision);
        }

        @NotNull
        public String toString() {
            return "SymbolPair(symbol=" + this.symbol + ", precision=" + this.precision + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.view.KlineSmallBaseFragment$b */
    /* JADX INFO: compiled from: KlineSmallBaseFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/flutter/widget/kline/view/KlineSmallBaseFragment$initTab$1$2", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "onTabSelected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabUnselected", "onTabReselected", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12817b implements TabLayout.OnTabSelectedListener {
        public C12817b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            KlineSmallBaseFragment.this.m24415E3(tab != null ? Integer.valueOf(tab.getPosition()) : null);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.view.KlineSmallBaseFragment$c */
    /* JADX INFO: compiled from: KlineSmallBaseFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/flutter/widget/kline/view/KlineSmallBaseFragment$stateListener$1", "Lcom/kubi/flutter/widget/kline/IKLineContainer$StateListener;", "onLoadStateChanged", "", "state", "Lcom/kubi/flutter/widget/kline/KLineLoadingState;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12818c implements IKLineContainer.b {

        /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.view.KlineSmallBaseFragment$c$a */
        /* JADX INFO: compiled from: KlineSmallBaseFragment.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[KLineLoadingState.values().length];
                try {
                    iArr[KLineLoadingState.Loading.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C12818c() {
        }

        @Override // com.kubi.flutter.widget.kline.IKLineContainer.b
        /* JADX INFO: renamed from: a */
        public void mo24269a(KLineLoadingState state) {
            KLineContainer kLineContainer;
            Intrinsics.checkNotNullParameter(state, "state");
            if (a.$EnumSwitchMapping$0[state.ordinal()] == 1) {
                return;
            }
            KlineSmallBaseFragment.this.mo24412B3();
            if (((TabLayout) KlineSmallBaseFragment.this.f22505W.get()) == null || (kLineContainer = (KLineContainer) KlineSmallBaseFragment.this.f22504V.get()) == null) {
                return;
            }
            kLineContainer.m24142C(this);
        }
    }

    /* JADX INFO: renamed from: A3 */
    public final void m24411A3() {
        C12572a.m23695d("handle_click_event", null, 0L, 6, null);
    }

    /* JADX INFO: renamed from: C3 */
    public abstract void mo24413C3(int i11);

    /* JADX INFO: renamed from: w3 */
    public abstract int mo24424w3();

    @NotNull
    /* JADX INFO: renamed from: x3 */
    public abstract KLineViewController.InitParam mo24425x3();

    @NotNull
    /* JADX INFO: renamed from: y3 */
    public abstract IKLineDataInteractor mo24426y3();

    /* JADX INFO: renamed from: E3 */
    public final void m24415E3(Integer num) {
        int iIntValue;
        if (num == null || (iIntValue = num.intValue()) == mo24424w3()) {
            return;
        }
        mo24413C3(iIntValue);
    }

    /* JADX INFO: renamed from: F3 */
    public final void m24416F3(boolean z11) {
        this.f22510b0 = z11;
        ImageView imageView = this.f22509a0;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: G3 */
    public final void m24417G3() {
        TabLayout.Tab tabAt;
        TabLayout tabLayout = this.f22505W.get();
        if (tabLayout == null || (tabAt = tabLayout.getTabAt(mo24424w3())) == null) {
            return;
        }
        tabAt.select();
    }

    /* JADX INFO: renamed from: o3 */
    public final void m24418o3(int i11) {
        KLineViewController kLineViewController = this.f22506X.get();
        if (kLineViewController != null) {
            kLineViewController.m24230u(KLineConverter.f22477a.m24354b(i11));
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        this.f22510b0 = arguments != null ? RouteExKt.m56252i(arguments, "iv_contract_visible", true) : true;
        LinearLayout linearLayout = new LinearLayout(inflater.getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        this.f22503U = linearLayout;
        return linearLayout;
    }

    /* JADX INFO: renamed from: p3 */
    public final void m24419p3(@NotNull String symbol, int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f22508Z = new SymbolPair(symbol, i11);
        KLineViewController kLineViewController = this.f22506X.get();
        if (kLineViewController != null) {
            KLineViewController.m24210y(kLineViewController, symbol, i11, null, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final void m24420q3(int i11) {
        KLineType kLineTypeM24353a = KLineConverter.f22477a.m24353a(i11);
        boolean z11 = i11 == 0;
        KLineViewController kLineViewController = this.f22506X.get();
        if (kLineViewController != null) {
            kLineViewController.m24211A(kLineTypeM24353a, z11);
        }
    }

    /* JADX INFO: renamed from: r3 */
    public final void m24421r3(boolean z11) {
        final KLineContainer andSet;
        final TabLayout andSet2;
        final KLineViewController andSet3 = this.f22506X.getAndSet(null);
        if (andSet3 == null || (andSet = this.f22504V.getAndSet(null)) == null || (andSet2 = this.f22505W.getAndSet(null)) == null) {
            return;
        }
        if (z11) {
            this.f22507Y.postDelayed(new Runnable() { // from class: com.kubi.flutter.widget.kline.view.a
                @Override // java.lang.Runnable
                public final void run() {
                    KlineSmallBaseFragment.m24409s3(andSet3, this, andSet, andSet2);
                }
            }, 200L);
            return;
        }
        andSet3.m24217G();
        LinearLayout linearLayout = this.f22503U;
        if (linearLayout != null) {
            linearLayout.removeView(andSet);
        }
        LinearLayout linearLayout2 = this.f22503U;
        if (linearLayout2 != null) {
            linearLayout2.removeView(andSet2);
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final void m24422t3(Context context, LinearLayout linearLayout) {
        KLineContainer kLineContainer = new KLineContainer(context);
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.kline_time_tab, (ViewGroup) null);
        TabLayout tabLayout = (TabLayout) viewInflate.findViewById(R$id.tab_type);
        this.f22509a0 = (ImageView) viewInflate.findViewById(R$id.iv_contract);
        m24416F3(this.f22510b0);
        ImageView imageView = this.f22509a0;
        if (imageView != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.flutter.widget.kline.view.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KlineSmallBaseFragment.m24410u3(this.f22520b);
                }
            }, 1, null);
        }
        Intrinsics.checkNotNull(tabLayout);
        m24427z3(tabLayout);
        linearLayout.removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iM66603f = C27029c.m66603f(this, 4);
        int iM66603f2 = C27029c.m66603f(this, 0);
        int iM66603f3 = C27029c.m66603f(this, 0);
        int iM66603f4 = C27029c.m66603f(this, 0);
        layoutParams.setMarginStart(iM66603f);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iM66603f2;
        layoutParams.setMarginEnd(iM66603f3);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = iM66603f4;
        Unit unit = Unit.INSTANCE;
        linearLayout.addView(viewInflate, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 1.0f;
        linearLayout.addView(kLineContainer, layoutParams2);
        this.f22505W.set(tabLayout);
        m24414D3();
        kLineContainer.m24152w(getActivity());
        kLineContainer.m24149p(this.f22511c0);
        KLineViewController kLineViewController = new KLineViewController(mo24425x3(), kLineContainer, mo24426y3());
        this.f22504V.set(kLineContainer);
        this.f22506X.set(kLineViewController);
        SymbolPair symbolPair = this.f22508Z;
        if (symbolPair != null) {
            KLineViewController.m24210y(kLineViewController, symbolPair.getSymbol(), symbolPair.getPrecision(), null, null, 12, null);
        }
        kLineViewController.m24219I();
        kLineViewController.m24223M();
    }

    /* JADX INFO: renamed from: s3 */
    public static final void m24409s3(KLineViewController kLineViewController, KlineSmallBaseFragment klineSmallBaseFragment, KLineContainer kLineContainer, TabLayout tabLayout) {
        kLineViewController.m24217G();
        LinearLayout linearLayout = klineSmallBaseFragment.f22503U;
        if (linearLayout != null) {
            linearLayout.removeView(kLineContainer);
        }
        LinearLayout linearLayout2 = klineSmallBaseFragment.f22503U;
        if (linearLayout2 != null) {
            linearLayout2.removeView(tabLayout);
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m24410u3(KlineSmallBaseFragment klineSmallBaseFragment) {
        klineSmallBaseFragment.m24411A3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public final void m24414D3() {
        m24417G3();
        m24423v3();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f22507Y.removeCallbacksAndMessages(null);
        this.f22508Z = null;
        m24421r3(false);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        if (FlutterAnrStopgapConfig.f46661a.m56794d()) {
            KLineContainer kLineContainer = this.f22504V.get();
            if (kLineContainer != null) {
                kLineContainer.m24140A();
            }
            KLineViewController kLineViewController = this.f22506X.get();
            if (kLineViewController != null) {
                kLineViewController.m24218H();
                return;
            }
            return;
        }
        m24421r3(true);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        LinearLayout linearLayout;
        super.onShow();
        Context context = getContext();
        if (context != null && (linearLayout = this.f22503U) != null) {
            if (FlutterAnrStopgapConfig.f46661a.m56794d()) {
                KLineContainer kLineContainer = this.f22504V.get();
                KLineViewController kLineViewController = this.f22506X.get();
                if (kLineContainer != null && kLineViewController != null && this.f22505W.get() != null) {
                    m24416F3(this.f22510b0);
                    m24414D3();
                    kLineContainer.m24141B();
                    kLineViewController.m24223M();
                    return;
                }
                m24422t3(context, linearLayout);
                return;
            }
            if (this.f22504V.get() != null || this.f22505W.get() != null) {
                return;
            }
            m24422t3(context, linearLayout);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final void m24423v3() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new KlineSmallBaseFragment$delayUpdateKlineTab$1(this, null));
    }

    /* JADX INFO: renamed from: z3 */
    public final void m24427z3(TabLayout tabLayout) {
        String[] stringArray = tabLayout.getResources().getStringArray(R$array.kline_tab_titles);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        List<String> mutableList = ArraysKt.toMutableList(stringArray);
        if (!C38190h.f85888a.m86167l()) {
            CollectionsKt.removeLastOrNull(mutableList);
        }
        for (String str : mutableList) {
            View viewInflate = LayoutInflater.from(tabLayout.getContext()).inflate(R$layout.kline_item_kline_tab, (ViewGroup) null);
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewInflate;
            textView.setText(str);
            tabLayout.addTab(tabLayout.newTab().setCustomView(textView));
        }
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C12817b());
    }

    /* JADX INFO: renamed from: B3 */
    public void mo24412B3() {
    }
}
