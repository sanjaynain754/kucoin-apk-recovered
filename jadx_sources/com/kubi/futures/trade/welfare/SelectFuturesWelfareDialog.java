package com.kubi.futures.trade.welfare;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.FuturesWelfareSubTitle;
import bm.InterfaceC4633f;
import com.blankj.utilcode.util.C5267e0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.futures.dialog.FutureBonusGetDialog;
import com.kubi.futures.trade.challenge.TradeProTrialState;
import com.kubi.futures.trade.welfare.airdrop.AirDropBonusDialog;
import com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel;
import com.kubi.futures.trade.welfare.vm.SelectFuturesWelfareViewModel;
import com.kubi.host.HostManager;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.FuturesWelfareComposeEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.welfare.AirdropBonusEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.SuffixTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27092t0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36729a1;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: SelectFuturesWelfareDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 M2\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u00020+H\u0016J\u001a\u00106\u001a\u0002072\u0006\u00108\u001a\u00020.2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00109\u001a\u000207H\u0002J\b\u0010:\u001a\u000207H\u0002J\u0010\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020\u0016H\u0002J\u0010\u0010=\u001a\u0002072\u0006\u0010>\u001a\u00020\u0016H\u0002J\u0010\u0010?\u001a\u0002072\u0006\u0010@\u001a\u00020AH\u0002J \u0010B\u001a\u0002072\u0006\u00108\u001a\u00020.2\u0006\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020EH\u0002J\u001e\u0010F\u001a\u0002072\u0014\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010)0GH\u0002J\u001c\u0010H\u001a\u0002072\b\u0010I\u001a\u0004\u0018\u00010)2\b\u0010J\u001a\u0004\u0018\u00010KH\u0002J\u0010\u0010L\u001a\u0002072\u0006\u0010I\u001a\u00020)H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u000f\u001a\u0004\b&\u0010#R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/SelectFuturesWelfareDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogSelectFuturesWelfareBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogSelectFuturesWelfareBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "trialViewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "getTrialViewModel", "()Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "trialViewModel$delegate", "trialChecked", "", "getTrialChecked", "()Z", "trialChecked$delegate", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "kotlin.jvm.PlatformType", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", "currency$delegate", "symbol", "getSymbol", "symbol$delegate", "activeTrial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "activePosition", "", "_trialChecked", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initType", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "bindWelfareTips", "initObserver", "handleReplaceTrial", "isReplace", "handleLoadingState", "isLoading", "bindData", "pair", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeEntity;", "handleItemClick", ViewProps.POSITION, "type", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareType;", "handleActivateTrial", "Lkotlin/Pair;", "handleAirdropActive", "trial", "airdropBonus", "Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;", "showReplaceTrialDialog", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSelectFuturesWelfareDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectFuturesWelfareDialog.kt\ncom/kubi/futures/trade/welfare/SelectFuturesWelfareDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,375:1\n143#2,20:376\n220#3,5:396\n220#3,5:401\n220#3,5:406\n*S KotlinDebug\n*F\n+ 1 SelectFuturesWelfareDialog.kt\ncom/kubi/futures/trade/welfare/SelectFuturesWelfareDialog\n*L\n76#1:376,20\n79#1:396,5\n80#1:401,5\n83#1:406,5\n*E\n"})
public final class SelectFuturesWelfareDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: x0 */
    @Nullable
    public FuturesWelfareTrialItemEntity f24508x0;

    /* JADX INFO: renamed from: z0 */
    public boolean f24510z0;

    /* JADX INFO: renamed from: B0 */
    public static final /* synthetic */ KProperty<Object>[] f24499B0 = {Reflection.property1(new PropertyReference1Impl(SelectFuturesWelfareDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogSelectFuturesWelfareBinding;", 0))};

    /* JADX INFO: renamed from: A0 */
    @NotNull
    public static final Companion f24498A0 = new Companion(null);

    /* JADX INFO: renamed from: C0 */
    @NotNull
    public static String f24500C0 = HostManager.a.m() + "/support/48142946141679?appNeedLang=true";

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f24501q0 = C45681e.m100799e(this, new Function1<SelectFuturesWelfareDialog, C36729a1>() { // from class: com.kubi.futures.trade.welfare.SelectFuturesWelfareDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36729a1 invoke(@NotNull SelectFuturesWelfareDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36729a1.m82307a(fragment.requireView());
        }
    }, new Function1<C36729a1, Unit>() { // from class: com.kubi.futures.trade.welfare.SelectFuturesWelfareDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36729a1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36729a1 c36729a1) {
            invoke(c36729a1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24502r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.c1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SelectFuturesWelfareDialog.m28170i5(this.f24666b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f24503s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.d1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SelectFuturesWelfareDialog.m28169h5(this.f24670b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f24504t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.e1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SelectFuturesWelfareDialog.m28168g5(this.f24785b));
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f24505u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.f1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SelectFuturesWelfareDialog.m28162a5(this.f24822b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f24506v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.g1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SelectFuturesWelfareDialog.m28145E4(this.f24825b);
        }
    });

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f24507w0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.h1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SelectFuturesWelfareDialog.m28167f5(this.f24828b);
        }
    });

    /* JADX INFO: renamed from: y0 */
    public int f24509y0 = -1;

    /* JADX INFO: compiled from: SelectFuturesWelfareDialog.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/SelectFuturesWelfareDialog$Companion;", "", "<init>", "()V", "FUTURES_WELFARE_LEARN_MORE_URL", "", "newInstance", "Lcom/kubi/futures/trade/welfare/SelectFuturesWelfareDialog;", FirebaseAnalytics.Param.CURRENCY, "symbol", "isTrialChecked", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SelectFuturesWelfareDialog newInstance(@NotNull String currency, @NotNull String symbol, boolean isTrialChecked) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Bundle bundle = new Bundle();
            bundle.putString("data", currency);
            bundle.putString("data_1", symbol);
            bundle.putBoolean("data_2", isTrialChecked);
            SelectFuturesWelfareDialog selectFuturesWelfareDialog = new SelectFuturesWelfareDialog();
            selectFuturesWelfareDialog.setArguments(bundle);
            return selectFuturesWelfareDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.SelectFuturesWelfareDialog$a */
    /* JADX INFO: compiled from: SelectFuturesWelfareDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/futures/trade/welfare/SelectFuturesWelfareDialog$bindData$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14179a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<InterfaceC4633f> f24511a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<FuturesWelfareSubTitle> f24512b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C36729a1 f24513c;

        /* JADX WARN: Multi-variable type inference failed */
        public C14179a(List<? extends InterfaceC4633f> list, List<FuturesWelfareSubTitle> list2, C36729a1 c36729a1) {
            this.f24511a = list;
            this.f24512b = list2;
            this.f24513c = c36729a1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView rv2, int dx2, int dy2) {
            int iFindFirstVisibleItemPosition;
            TabLayout.Tab tabAt;
            Intrinsics.checkNotNullParameter(rv2, "rv");
            RecyclerView.LayoutManager layoutManager = rv2.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null && (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) != -1 && iFindFirstVisibleItemPosition >= 0 && iFindFirstVisibleItemPosition < this.f24511a.size()) {
                int iIndexOf = CollectionsKt.indexOf((List<? extends InterfaceC4633f>) this.f24512b, this.f24511a.get(iFindFirstVisibleItemPosition));
                if (iIndexOf < 0 || iIndexOf >= this.f24513c.f79678e.getTabCount() || (tabAt = this.f24513c.f79678e.getTabAt(iIndexOf)) == null) {
                    return;
                }
                tabAt.select();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.SelectFuturesWelfareDialog$b */
    /* JADX INFO: compiled from: SelectFuturesWelfareDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/futures/trade/welfare/SelectFuturesWelfareDialog$bindData$2", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "onTabSelected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabUnselected", "onTabReselected", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSelectFuturesWelfareDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectFuturesWelfareDialog.kt\ncom/kubi/futures/trade/welfare/SelectFuturesWelfareDialog$bindData$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,375:1\n360#2,7:376\n*S KotlinDebug\n*F\n+ 1 SelectFuturesWelfareDialog.kt\ncom/kubi/futures/trade/welfare/SelectFuturesWelfareDialog$bindData$2\n*L\n276#1:376,7\n*E\n"})
    public static final class C14180b implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<InterfaceC4633f> f24514a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C36729a1 f24515b;

        /* JADX WARN: Multi-variable type inference failed */
        public C14180b(List<? extends InterfaceC4633f> list, C36729a1 c36729a1) {
            this.f24514a = list;
            this.f24515b = c36729a1;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            CharSequence text = tab != null ? tab.getText() : null;
            Iterator<InterfaceC4633f> it = this.f24514a.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                InterfaceC4633f next = it.next();
                if ((next instanceof FuturesWelfareSubTitle) && Intrinsics.areEqual(((FuturesWelfareSubTitle) next).getText(), text)) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 >= 0) {
                this.f24515b.f79677d.stopScroll();
                RecyclerView.LayoutManager layoutManager = this.f24515b.f79677d.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i11, 0);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.SelectFuturesWelfareDialog$c */
    /* JADX INFO: compiled from: SelectFuturesWelfareDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14181c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24516b;

        public C14181c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24516b = function;
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
            return this.f24516b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24516b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: D4 */
    public static final void m28144D4(View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, f24500C0, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: F4 */
    private final String m28146F4() {
        return (String) this.f24506v0.getValue();
    }

    /* JADX INFO: renamed from: G4 */
    private final WrapperLoadingView m28147G4() {
        return (WrapperLoadingView) this.f24505u0.getValue();
    }

    /* JADX INFO: renamed from: H4 */
    private final String m28148H4() {
        return (String) this.f24507w0.getValue();
    }

    /* JADX INFO: renamed from: J4 */
    private final FuturesTrialViewModel m28149J4() {
        return (FuturesTrialViewModel) this.f24503s0.getValue();
    }

    /* JADX INFO: renamed from: N4 */
    private final void m28151N4(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity, AirdropBonusEntity airdropBonusEntity) {
        if (futuresWelfareTrialItemEntity != null) {
            m28166e5(futuresWelfareTrialItemEntity);
            return;
        }
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity2 = this.f24508x0;
        AirDropBonusDialog.Companion companion = AirDropBonusDialog.f24540w0;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        companion.show(parentFragmentManager, airdropBonusEntity, futuresWelfareTrialItemEntity2 != null ? futuresWelfareTrialItemEntity2.getCode() : null);
        dismiss();
    }

    /* JADX INFO: renamed from: Q4 */
    private final void m28152Q4(boolean z11) {
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = this.f24508x0;
        if (futuresWelfareTrialItemEntity == null) {
            m28194P4(false);
            return;
        }
        if (!z11) {
            m28194P4(false);
            this.f24508x0 = null;
        } else {
            if (C27092t0.m66897b(futuresWelfareTrialItemEntity.getPrizeType())) {
                m28149J4().m28760h(C27041f.m66668h(futuresWelfareTrialItemEntity.getCode()), true);
                return;
            }
            FuturesTrialViewModel futuresTrialViewModelM28149J4 = m28149J4();
            String code = futuresWelfareTrialItemEntity.getCode();
            if (code == null) {
                code = "";
            }
            futuresTrialViewModelM28149J4.m28759f(code, true);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m28165d5(SelectFuturesWelfareDialog selectFuturesWelfareDialog, View itemView, int i11, InterfaceC4633f futuresWelfareType) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(futuresWelfareType, "futuresWelfareType");
        selectFuturesWelfareDialog.m28193O4(itemView, i11, futuresWelfareType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h5 */
    public static final FuturesTrialViewModel m28169h5(SelectFuturesWelfareDialog selectFuturesWelfareDialog) {
        return (FuturesTrialViewModel) new ViewModelProvider(selectFuturesWelfareDialog).get(FuturesTrialViewModel.class);
    }

    /* JADX INFO: renamed from: I4 */
    public final boolean m28190I4() {
        return ((Boolean) this.f24504t0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: K4 */
    public final C36729a1 m28191K4() {
        return (C36729a1) this.f24501q0.getValue(this, f24499B0[0]);
    }

    /* JADX INFO: renamed from: L4 */
    public final SelectFuturesWelfareViewModel m28192L4() {
        return (SelectFuturesWelfareViewModel) this.f24502r0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_select_futures_welfare, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewExtKt.m66578i(view, (int) (C5267e0.m6182d() * 0.8f));
        C36729a1 c36729a1M28191K4 = m28191K4();
        if (c36729a1M28191K4 == null) {
            return;
        }
        this.f24510z0 = m28190I4();
        c36729a1M28191K4.f79677d.setLayoutManager(new LinearLayoutManager(view.getContext()));
        m28147G4().showLoading();
        AppCompatImageView ivClose = c36729a1M28191K4.f79676c;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectFuturesWelfareDialog.m28163b5(this.f24894b);
            }
        }, 1, null);
        m28189C4();
        KcPrimaryButton tvConfirm = c36729a1M28191K4.f79680g;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.a1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectFuturesWelfareDialog.m28164c5(this.f24538b);
            }
        }, 1, null);
        RecyclerView recyclerView = c36729a1M28191K4.f79677d;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        recyclerView.setAdapter(new FuturesWelfareAdapter(childFragmentManager, true, new Function3() { // from class: com.kubi.futures.trade.welfare.b1
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SelectFuturesWelfareDialog.m28165d5(this.f24661b, (View) obj, ((Integer) obj2).intValue(), (InterfaceC4633f) obj3);
            }
        }, null, 8, null));
        m28153R4();
    }

    /* JADX INFO: renamed from: E4 */
    public static final String m28145E4(SelectFuturesWelfareDialog selectFuturesWelfareDialog) {
        String string;
        Bundle arguments = selectFuturesWelfareDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: M4 */
    private final void m28150M4(Pair<Boolean, FuturesWelfareTrialItemEntity> pair) {
        if (pair.getSecond() != null) {
            FuturesWelfareTrialItemEntity second = pair.getSecond();
            Intrinsics.checkNotNull(second);
            m28166e5(second);
            return;
        }
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = this.f24508x0;
        if (pair.getFirst().booleanValue() && futuresWelfareTrialItemEntity != null) {
            m28192L4().m28786h(m28146F4(), m28148H4());
            com.kubi.futures.trade.vm.g1.a(this).y(m28148H4());
            FutureBonusGetDialog.Companion companion = FutureBonusGetDialog.f22772j;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            companion.show(fragmentActivityRequireActivity, futuresWelfareTrialItemEntity);
        }
    }

    /* JADX INFO: renamed from: R4 */
    private final void m28153R4() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m28192L4().m28799w().observe(viewLifecycleOwner, new C14181c(new Function1() { // from class: com.kubi.futures.trade.welfare.i1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectFuturesWelfareDialog.m28154S4(this.f24865b, (FuturesWelfareComposeEntity) obj);
            }
        }));
        m28192L4().m28798v().observe(viewLifecycleOwner, new C14181c(new Function1() { // from class: com.kubi.futures.trade.welfare.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectFuturesWelfareDialog.m28155T4(this.f24897b, (TradeProTrialState) obj);
            }
        }));
        m28149J4().m28766s().observe(viewLifecycleOwner, new C14181c(new Function1() { // from class: com.kubi.futures.trade.welfare.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectFuturesWelfareDialog.m28156U4(this.f24900b, (Pair) obj);
            }
        }));
        m28149J4().m28772y().observe(viewLifecycleOwner, new C14181c(new Function1() { // from class: com.kubi.futures.trade.welfare.u0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectFuturesWelfareDialog.m28157V4(this.f24905b, (Boolean) obj);
            }
        }));
        m28149J4().m28771x().observe(viewLifecycleOwner, new C14181c(new Function1() { // from class: com.kubi.futures.trade.welfare.v0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectFuturesWelfareDialog.m28158W4(this.f24908b, (Boolean) obj);
            }
        }));
        m28149J4().m28770w().observe(viewLifecycleOwner, new C14181c(new Function1() { // from class: com.kubi.futures.trade.welfare.w0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectFuturesWelfareDialog.m28159X4(this.f24957b, (Boolean) obj);
            }
        }));
        m28149J4().m28765r().observe(viewLifecycleOwner, new C14181c(new Function1() { // from class: com.kubi.futures.trade.welfare.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectFuturesWelfareDialog.m28160Y4(this.f24960b, (Pair) obj);
            }
        }));
        m28149J4().m28755A().observe(viewLifecycleOwner, new C14181c(new Function1() { // from class: com.kubi.futures.trade.welfare.y0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectFuturesWelfareDialog.m28161Z4(this.f24962b, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m28154S4(SelectFuturesWelfareDialog selectFuturesWelfareDialog, FuturesWelfareComposeEntity futuresWelfareComposeEntity) {
        selectFuturesWelfareDialog.m28147G4().showContent();
        Intrinsics.checkNotNull(futuresWelfareComposeEntity);
        selectFuturesWelfareDialog.m28188B4(futuresWelfareComposeEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m28155T4(SelectFuturesWelfareDialog selectFuturesWelfareDialog, TradeProTrialState tradeProTrialState) {
        FuturesWelfareComposeEntity value = selectFuturesWelfareDialog.m28192L4().m28799w().getValue();
        if (value != null) {
            selectFuturesWelfareDialog.m28188B4(value);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m28156U4(SelectFuturesWelfareDialog selectFuturesWelfareDialog, Pair pair) {
        Intrinsics.checkNotNull(pair);
        selectFuturesWelfareDialog.m28150M4(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V4 */
    public static final Unit m28157V4(SelectFuturesWelfareDialog selectFuturesWelfareDialog, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        selectFuturesWelfareDialog.m28152Q4(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m28158W4(SelectFuturesWelfareDialog selectFuturesWelfareDialog, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        selectFuturesWelfareDialog.m28152Q4(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X4 */
    public static final Unit m28159X4(SelectFuturesWelfareDialog selectFuturesWelfareDialog, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        selectFuturesWelfareDialog.m28194P4(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y4 */
    public static final Unit m28160Y4(SelectFuturesWelfareDialog selectFuturesWelfareDialog, Pair pair) {
        selectFuturesWelfareDialog.m28151N4((FuturesWelfareTrialItemEntity) pair.getFirst(), (AirdropBonusEntity) pair.getSecond());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z4 */
    public static final Unit m28161Z4(SelectFuturesWelfareDialog selectFuturesWelfareDialog, Throwable th2) {
        C17058m0.m36550e(selectFuturesWelfareDialog, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a5 */
    public static final WrapperLoadingView m28162a5(SelectFuturesWelfareDialog selectFuturesWelfareDialog) {
        return WrapperLoadingView.injectView(selectFuturesWelfareDialog.getView());
    }

    /* JADX INFO: renamed from: b5 */
    public static final Unit m28163b5(SelectFuturesWelfareDialog selectFuturesWelfareDialog) {
        selectFuturesWelfareDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m28164c5(SelectFuturesWelfareDialog selectFuturesWelfareDialog) {
        String str;
        selectFuturesWelfareDialog.m28192L4().m28797u().setValue(Boolean.valueOf(selectFuturesWelfareDialog.f24510z0));
        String strM36552b = C17060n0.m36552b();
        if (selectFuturesWelfareDialog.f24510z0) {
            str = "1";
        } else {
            str = "2";
        }
        C43852m.m96591c(strM36552b, "bonusCardSelect", str, null, 8, null);
        selectFuturesWelfareDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e5 */
    private final void m28166e5(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        if (futuresWelfareTrialItemEntity.isTradeProTrial()) {
            FuturesTradeProUnavailableDialog futuresTradeProUnavailableDialog = new FuturesTradeProUnavailableDialog();
            futuresTradeProUnavailableDialog.setArguments(BundleKt.bundleOf(new Pair("data", futuresWelfareTrialItemEntity), new Pair("data_1", Boolean.TRUE)));
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            futuresTradeProUnavailableDialog.show(childFragmentManager, "FuturesTradeProUnavailableDialog");
            return;
        }
        if (C27092t0.m66897b(futuresWelfareTrialItemEntity.getPrizeType())) {
            C43852m.m96595g("B6futures", "AirDropPositionReplace", null, null, 12, null);
        }
        FuturesReplaceTrialDialog futuresReplaceTrialDialog = new FuturesReplaceTrialDialog();
        futuresReplaceTrialDialog.setArguments(BundleKt.bundleOf(new Pair("data", futuresWelfareTrialItemEntity), new Pair("data_1", Boolean.TRUE)));
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        futuresReplaceTrialDialog.show(childFragmentManager2, "FuturesReplaceTrialDialog");
    }

    /* JADX INFO: renamed from: f5 */
    public static final String m28167f5(SelectFuturesWelfareDialog selectFuturesWelfareDialog) {
        String string;
        Bundle arguments = selectFuturesWelfareDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("data_1");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: g5 */
    public static final boolean m28168g5(SelectFuturesWelfareDialog selectFuturesWelfareDialog) {
        Boolean boolValueOf;
        Bundle arguments = selectFuturesWelfareDialog.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data_2", false));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: i5 */
    public static final SelectFuturesWelfareViewModel m28170i5(SelectFuturesWelfareDialog selectFuturesWelfareDialog) {
        Fragment parentFragment;
        SelectFuturesWelfareViewModel selectFuturesWelfareViewModel;
        Fragment parentFragment2 = selectFuturesWelfareDialog.getParentFragment();
        if (parentFragment2 != null && (parentFragment = parentFragment2.getParentFragment()) != null && (selectFuturesWelfareViewModel = (SelectFuturesWelfareViewModel) new ViewModelProvider(parentFragment).get(SelectFuturesWelfareViewModel.class)) != null) {
            return selectFuturesWelfareViewModel;
        }
        return (SelectFuturesWelfareViewModel) new ViewModelProvider(selectFuturesWelfareDialog).get(SelectFuturesWelfareViewModel.class);
    }

    /* JADX INFO: renamed from: B4 */
    public final void m28188B4(FuturesWelfareComposeEntity futuresWelfareComposeEntity) {
        TabLayout.Tab tabAt;
        C36729a1 c36729a1M28191K4 = m28191K4();
        if (c36729a1M28191K4 == null) {
            return;
        }
        RecyclerView recyclerView = c36729a1M28191K4.f79677d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        List<InterfaceC4633f> listM28793q = m28192L4().m28793q(futuresWelfareComposeEntity, this.f24510z0);
        ArrayList arrayList = new ArrayList();
        c36729a1M28191K4.f79678e.removeAllTabs();
        int size = listM28793q.size();
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC4633f interfaceC4633f = listM28793q.get(i11);
            if (interfaceC4633f instanceof FuturesWelfareSubTitle) {
                TabLayout tabLayout = c36729a1M28191K4.f79678e;
                tabLayout.addTab(tabLayout.newTab().setText(((FuturesWelfareSubTitle) interfaceC4633f).getText()));
                arrayList.add(interfaceC4633f);
            }
        }
        if (c36729a1M28191K4.f79678e.getTabCount() > 0 && (tabAt = c36729a1M28191K4.f79678e.getTabAt(0)) != null) {
            tabAt.select();
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.futures.trade.welfare.FuturesWelfareAdapter");
        ((FuturesWelfareAdapter) adapter).m28634J(listM28793q);
        recyclerView.clearOnScrollListeners();
        recyclerView.addOnScrollListener(new C14179a(listM28793q, arrayList, c36729a1M28191K4));
        c36729a1M28191K4.f79678e.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C14180b(listM28793q, c36729a1M28191K4));
    }

    /* JADX INFO: renamed from: C4 */
    public final void m28189C4() {
        boolean z11;
        int i11;
        C36729a1 c36729a1M28191K4 = m28191K4();
        if (c36729a1M28191K4 != null) {
            if (BrokerConfig.f19211a.m20201d().mo4515x() == MultiBizType.COPY_TRADING && KuMexDepend.f30378a.m35900b().mo20635p()) {
                z11 = true;
            } else {
                z11 = false;
            }
            SuffixTextView suffixTextView = c36729a1M28191K4.f79681h;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            suffixTextView.setVisibility(i11);
            if (!z11) {
                return;
            }
            c36729a1M28191K4.f79681h.setMovementMethod(LinkMovementMethod.getInstance());
            c36729a1M28191K4.f79681h.setHighlightColor(0);
            c36729a1M28191K4.f79681h.setText(getString(R$string.kuemx_lead_trial_desc));
            c36729a1M28191K4.f79681h.onMoreClick(new View.OnClickListener() { // from class: com.kubi.futures.trade.welfare.z0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectFuturesWelfareDialog.m28144D4(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O4 */
    public final void m28193O4(View view, int i11, InterfaceC4633f interfaceC4633f) {
        if (view.getId() == R$id.checkbox && (view instanceof CheckBox)) {
            this.f24510z0 = ((CheckBox) view).isChecked();
            return;
        }
        if (view.getId() == R$id.action && (view instanceof KcPrimaryButton) && (interfaceC4633f instanceof FuturesWelfareTrialItemEntity)) {
            FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) interfaceC4633f;
            this.f24508x0 = futuresWelfareTrialItemEntity;
            this.f24509y0 = i11;
            if (C27092t0.m66897b(futuresWelfareTrialItemEntity.getPrizeType())) {
                FuturesTrialViewModel.m28752i(m28149J4(), C27041f.m66668h(futuresWelfareTrialItemEntity.getCode()), false, 2, null);
                return;
            }
            FuturesTrialViewModel futuresTrialViewModelM28149J4 = m28149J4();
            String code = futuresWelfareTrialItemEntity.getCode();
            if (code == null) {
                code = "";
            }
            FuturesTrialViewModel.m28751g(futuresTrialViewModelM28149J4, code, false, 2, null);
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final void m28194P4(boolean z11) {
        RecyclerView.Adapter adapter;
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity;
        RecyclerView recyclerView;
        C36729a1 c36729a1M28191K4 = m28191K4();
        FuturesWelfareAdapter futuresWelfareAdapter = null;
        if (c36729a1M28191K4 != null && (recyclerView = c36729a1M28191K4.f79677d) != null) {
            adapter = recyclerView.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter instanceof FuturesWelfareAdapter) {
            futuresWelfareAdapter = (FuturesWelfareAdapter) adapter;
        }
        if (futuresWelfareAdapter != null && (futuresWelfareTrialItemEntity = this.f24508x0) != null) {
            C44128b.m97258b("bieber position= " + this.f24509y0 + "..... " + futuresWelfareTrialItemEntity.isLoading() + "..... " + z11);
            if (this.f24509y0 >= 0 && !Intrinsics.areEqual(futuresWelfareTrialItemEntity.isLoading(), Boolean.valueOf(z11))) {
                futuresWelfareTrialItemEntity.setLoading(Boolean.valueOf(z11));
                futuresWelfareAdapter.notifyItemChanged(this.f24509y0);
            }
            if (!z11) {
                this.f24509y0 = -1;
            }
        }
    }
}
