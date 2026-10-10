package com.kubi.tradefacade;

import a40.C0119b;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c40.C4834l;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5303w0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.host.HostManager;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.margin.api.IMarginService;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.resources.widget.rorbin.badgeview.QBadgeView;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.IKlineFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24271s1;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.spot.api.ISpotService;
import com.kubi.tradefacade.utils.TabScrollHelper;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37758j;
import g00.InterfaceC37766r;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p316hl.C38226a;
import p569qq.C43852m;
import p768xo.InterfaceC46302c;
import p768xo.InterfaceC46303d;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;
import w30.C45715b;
import y70.C46392a;
import z30.C46683a;
import zw.C46932c;
import zw.InterfaceC46930a;

/* JADX INFO: compiled from: TradeFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010$\u001a\u00020\u0014H\u0016J$\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u0004\u0018\u00010\u001bJ\b\u00100\u001a\u00020.H\u0002J\b\u00101\u001a\u00020.H\u0016J\b\u0010G\u001a\u00020.H\u0002J\u001a\u0010H\u001a\u00020.2\u0006\u0010I\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010J\u001a\u00020KH\u0002J\u0010\u0010L\u001a\u00020.2\u0006\u0010M\u001a\u00020\u0014H\u0002J\b\u0010N\u001a\u00020\u001bH\u0002J\b\u0010O\u001a\u00020.H\u0002J\b\u0010P\u001a\u00020.H\u0002J\u0010\u0010Q\u001a\u00020.2\u0006\u0010R\u001a\u00020\u0001H\u0002J\b\u0010S\u001a\u00020\u0001H\u0002J\b\u0010T\u001a\u00020\u0001H\u0002J\b\u0010U\u001a\u00020\u0001H\u0002J\r\u0010V\u001a\u0004\u0018\u00010W¢\u0006\u0002\u0010XJ\b\u0010Z\u001a\u00020.H\u0002J\u0010\u0010[\u001a\u00020.2\u0006\u0010\\\u001a\u00020\u0014H\u0016J\b\u0010]\u001a\u00020.H\u0002J\b\u0010^\u001a\u00020.H\u0002J\u0006\u0010_\u001a\u00020.J\b\u0010`\u001a\u00020.H\u0002J\b\u0010m\u001a\u00020.H\u0016J\u0014\u0010n\u001a\u00020.*\u00020o2\u0006\u0010p\u001a\u00020WH\u0002J\b\u0010q\u001a\u00020.H\u0002J\u000e\u0010r\u001a\u00020.2\u0006\u0010s\u001a\u00020\u0014J\n\u0010t\u001a\u0004\u0018\u00010uH\u0016J\n\u0010v\u001a\u0004\u0018\u00010wH\u0016J\n\u0010x\u001a\u0004\u0018\u00010&H\u0016J\n\u0010y\u001a\u0004\u0018\u00010&H\u0016J\n\u0010z\u001a\u0004\u0018\u00010&H\u0016R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b \u0010\u001dR\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00102\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0011\u001a\u0004\b3\u00104R\u001b\u00106\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u0011\u001a\u0004\b7\u00104R\u001b\u00109\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0011\u001a\u0004\b:\u00104R\u001b\u0010<\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u0011\u001a\u0004\b=\u00104R\u001b\u0010?\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u0011\u001a\u0004\b@\u00104R\u001b\u0010B\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\u0011\u001a\u0004\bC\u00104R\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010a\u001a\u00020WX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u000e\u0010f\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010g\u001a\n i*\u0004\u0018\u00010h0h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010\u0011\u001a\u0004\bj\u0010k¨\u0006{"}, m90084d2 = {"Lcom/kubi/tradefacade/TradeFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/margin/api/IKlineParentFragment;", "Lcom/kubi/margin/api/IMarginTradeTypePageSwitch;", "<init>", "()V", "viewBinding", "Lcom/kubi/tradefacade/databinding/KucoinFragmentTradeBinding;", "getViewBinding", "()Lcom/kubi/tradefacade/databinding/KucoinFragmentTradeBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tabViewOrderController", "Lcom/kubi/tradefacade/tabs/helper/TabViewOrderController;", "getTabViewOrderController", "()Lcom/kubi/tradefacade/tabs/helper/TabViewOrderController;", "tabViewOrderController$delegate", "Lkotlin/Lazy;", "isUnifyAccountFlow", "Lkotlinx/coroutines/flow/Flow;", "", "firstShow", "getFirstShow", "()Z", "setFirstShow", "(Z)V", "crossPageId", "", "getCrossPageId", "()Ljava/lang/String;", "crossPageId$delegate", "isolatedPageId", "getIsolatedPageId", "isolatedPageId$delegate", "markToken", "Lcom/kubi/kucoin/helper/BackButtonHelper$MarkToken;", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", "getTabCheckedId", "initRobotTab", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "unifiedSpotTradeFragment", "getUnifiedSpotTradeFragment", "()Lcom/kubi/sdk/BaseFragment;", "unifiedSpotTradeFragment$delegate", "unifiedMarginTradeFragment", "getUnifiedMarginTradeFragment", "unifiedMarginTradeFragment$delegate", "classicSpotTradeFragment", "getClassicSpotTradeFragment", "classicSpotTradeFragment$delegate", "alphaTradeFragment", "getAlphaTradeFragment", "alphaTradeFragment$delegate", "classicMarginTradeFragment", "getClassicMarginTradeFragment", "classicMarginTradeFragment$delegate", "singleMarginTradeFragment", "getSingleMarginTradeFragment", "singleMarginTradeFragment$delegate", "lastTradeIsIsolated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "bindOtcCountEvent", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "collectTradeAccountModelChange", "Lkotlinx/coroutines/Job;", "resetSpotModelFragment", "isUnifyAccount", "getLeverTabTitle", "toggleCurrentFragment", "adjustScrollIfNeededOld", "updateCurrentFragment", "thisFragment", "getSpotFragment", "getMarginFragment", "getCurrentFragment", "getCurrentTradeType", "", "()Ljava/lang/Integer;", "isMarginChecked", "toggleMarginFragment", "switchMarginTradeType", "switchIsolated", "switchCrossMarginFragment", "switchIsolatedMarginFragment", "refresh", "fetchOtcActivity", "mOtcCount", "getMOtcCount", "()I", "setMOtcCount", "(I)V", "mActivityMsg", "mBadge", "Lcom/kubi/resources/widget/rorbin/badgeview/Badge;", "kotlin.jvm.PlatformType", "getMBadge", "()Lcom/kubi/resources/widget/rorbin/badgeview/Badge;", "mBadge$delegate", "onDestroyView", "updateCheckedButtonStyle", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "handleRedPointShow", "handleKlineInMaintenance", TIMPushProvider.f75062n, "getKlineContainer", "Landroid/widget/FrameLayout;", "getKlineStatusView", "Landroid/widget/TextView;", "getKlineBottomLineView", "getKlineLayout", "getKlineClickView", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCCyclomaticComplexityCheck", "KCLongMethodCheck"})
@SourceDebugExtension({"SMAP\nTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeFragment.kt\ncom/kubi/tradefacade/TradeFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,883:1\n147#2,16:884\n135#3,2:900\n136#3:902\n126#3,2:947\n126#3,2:949\n126#3,2:951\n126#3,2:953\n808#4,11:903\n1869#4,2:914\n1869#4,2:918\n808#4,11:920\n808#4,11:931\n774#4:942\n865#4,2:943\n1869#4,2:945\n81#5,2:916\n1#6:955\n*S KotlinDebug\n*F\n+ 1 TradeFragment.kt\ncom/kubi/tradefacade/TradeFragment\n*L\n98#1:884,16\n348#1:900,2\n291#1:902\n764#1:947,2\n785#1:949,2\n183#1:951,2\n203#1:953,2\n316#1:903,11\n317#1:914,2\n361#1:918,2\n645#1:920,11\n646#1:931,11\n646#1:942\n646#1:943,2\n646#1:945,2\n354#1:916,2\n*E\n"})
public final class TradeFragment extends BaseFragment implements InterfaceC46302c, InterfaceC46303d {

    /* JADX INFO: renamed from: m0 */
    public static final /* synthetic */ KProperty<Object>[] f51854m0 = {Reflection.property1(new PropertyReference1Impl(TradeFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/tradefacade/databinding/KucoinFragmentTradeBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @Nullable
    public InterfaceC41634e<Boolean> f51857W;

    /* JADX INFO: renamed from: X */
    public boolean f51858X;

    /* JADX INFO: renamed from: j0 */
    public int f51870j0;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f51855U = C45681e.m100799e(this, new Function1<TradeFragment, C45715b>() { // from class: com.kubi.tradefacade.TradeFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45715b invoke(@NotNull TradeFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45715b.m100913a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45715b, Unit>() { // from class: com.kubi.tradefacade.TradeFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45715b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45715b c45715b) {
            invoke(c45715b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f51856V = LazyKt.lazy(new Function0() { // from class: com.kubi.tradefacade.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeFragment.m63520j5(this.f51968b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f51859Y = LazyKt.lazy(new Function0() { // from class: com.kubi.tradefacade.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeFragment.m63518i4();
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f51860Z = LazyKt.lazy(new Function0() { // from class: com.kubi.tradefacade.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeFragment.m63472H4();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final C38226a.a f51861a0 = new C38226a.a();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f51862b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradefacade.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeFragment.m63532p5();
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f51863c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradefacade.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeFragment.m63530o5();
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f51864d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradefacade.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeFragment.m63516g4();
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f51865e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradefacade.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeFragment.m63514d4();
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f51866f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradefacade.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeFragment.m63515f4();
        }
    });

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f51867g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradefacade.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeFragment.m63517g5();
        }
    });

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final AtomicBoolean f51868h0 = new AtomicBoolean(C46392a.m102322d(ISpotService.f49646a.get().mo59987D(), false));

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final AtomicBoolean f51869i0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public String f51871k0 = "";

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final Lazy f51872l0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradefacade.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeFragment.m63474I4(this.f51983b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.tradefacade.TradeFragment$a */
    /* JADX INFO: compiled from: TradeFragment.kt */
    /* JADX INFO: loaded from: classes49.dex */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/tradefacade/TradeFragment$onViewCreated$2", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeFragment.kt\ncom/kubi/tradefacade/TradeFragment$onViewCreated$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,883:1\n256#2,2:884\n*S KotlinDebug\n*F\n+ 1 TradeFragment.kt\ncom/kubi/tradefacade/TradeFragment$onViewCreated$2\n*L\n390#1:884,2\n*E\n"})
    public static final class C25953a implements RadioGroupPlus.InterfaceC22946c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Typeface f51874b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Typeface f51875c;

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            ImageView imageView;
            RadioGroupPlus radioGroupPlus2;
            ImageView imageView2;
            RadioButton radioButton;
            RadioButton radioButton2;
            RadioButton radioButton3;
            RadioButton radioButton4;
            if (z11) {
                if (C0119b.f446a.m577d()) {
                    TradeFragment.this.m63543A4().m4947s(i11);
                }
                C45715b c45715bM63547D4 = TradeFragment.this.m63547D4();
                if (c45715bM63547D4 != null && (radioButton4 = c45715bM63547D4.f103074n) != null) {
                    radioButton4.setTypeface(i11 == R$id.rb_coin ? this.f51874b : this.f51875c);
                }
                C45715b c45715bM63547D5 = TradeFragment.this.m63547D4();
                if (c45715bM63547D5 != null && (radioButton3 = c45715bM63547D5.f103077q) != null) {
                    radioButton3.setTypeface(i11 == R$id.rb_lever ? this.f51874b : this.f51875c);
                }
                C45715b c45715bM63547D6 = TradeFragment.this.m63547D4();
                if (c45715bM63547D6 != null && (radioButton2 = c45715bM63547D6.f103078r) != null) {
                    radioButton2.setTypeface(i11 == R$id.rb_robot ? this.f51874b : this.f51875c);
                }
                C45715b c45715bM63547D7 = TradeFragment.this.m63547D4();
                if (c45715bM63547D7 != null && (radioButton = c45715bM63547D7.f103072l) != null) {
                    radioButton.setTypeface(i11 == R$id.rb_alpha ? this.f51874b : this.f51875c);
                }
                if (i11 == R$id.rb_coin) {
                    C46683a c46683a = C46683a.f104520a;
                    C43852m.m96591c(c46683a.m102904c().mo59997j(), "spotButton", null, null, 12, null);
                    boolean zMo37921U = c46683a.m102902a().mo37921U();
                    C45715b c45715bM63547D8 = TradeFragment.this.m63547D4();
                    if (c45715bM63547D8 != null && (imageView2 = c45715bM63547D8.f103067g) != null) {
                        imageView2.setVisibility(zMo37921U ? 0 : 8);
                    }
                    TradeFragment.this.f51869i0.set(false);
                    TradeFragment.this.m63560k5();
                } else if (i11 == R$id.rb_lever) {
                    C45715b c45715bM63547D9 = TradeFragment.this.m63547D4();
                    if (c45715bM63547D9 != null && (imageView = c45715bM63547D9.f103067g) != null) {
                        imageView.setVisibility(8);
                    }
                    TracePageHelper.m42472g("open_lever", "杠杆");
                    TradeFragment.this.m63560k5();
                    if (radioGroupPlus != null) {
                        final TradeFragment tradeFragment = TradeFragment.this;
                        radioGroupPlus.postDelayed(new Runnable() { // from class: com.kubi.tradefacade.q0
                            @Override // java.lang.Runnable
                            public final void run() {
                                TradeFragment.C25953a.m63584c(tradeFragment);
                            }
                        }, 300L);
                    }
                } else if (i11 == R$id.rb_alpha) {
                    TradeFragment.this.m63560k5();
                } else if (i11 == R$id.rb_robot) {
                    C46683a.f104520a.m102905d().mo63679c();
                }
                C45715b c45715bM63547D10 = TradeFragment.this.m63547D4();
                if (c45715bM63547D10 == null || (radioGroupPlus2 = c45715bM63547D10.f103076p) == null) {
                    return;
                }
                TradeFragment.this.m63570q5(radioGroupPlus2, i11);
            }
        }

        public C25953a(Typeface typeface, Typeface typeface2) {
            this.f51874b = typeface;
            this.f51875c = typeface2;
        }

        /* JADX INFO: renamed from: c */
        public static final void m63584c(TradeFragment tradeFragment) {
            tradeFragment.f51869i0.set(true);
        }
    }

    /* JADX INFO: renamed from: H4 */
    public static final String m63472H4() {
        return C46683a.f104520a.m102902a().mo37950o();
    }

    /* JADX INFO: renamed from: I4 */
    public static final InterfaceC46930a m63474I4(TradeFragment tradeFragment) {
        QBadgeView qBadgeViewM103404a = C46932c.m103404a(new QBadgeView(tradeFragment.requireContext()));
        C45715b c45715bM63547D4 = tradeFragment.m63547D4();
        return qBadgeViewM103404a.mo55429f(c45715bM63547D4 != null ? c45715bM63547D4.f103073m : null);
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m63476J4(TradeFragment tradeFragment) {
        IMarginService iMarginServiceM102902a = C46683a.f104520a.m102902a();
        C45715b c45715bM63547D4 = tradeFragment.m63547D4();
        LinearLayout linearLayout = c45715bM63547D4 != null ? c45715bM63547D4.f103071k : null;
        C45715b c45715bM63547D5 = tradeFragment.m63547D4();
        iMarginServiceM102902a.mo37915N(tradeFragment, linearLayout, c45715bM63547D5 != null ? c45715bM63547D5.f103067g : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m63480L4(TradeFragment tradeFragment) {
        ISpotService iSpotServiceM102904c = C46683a.f104520a.m102904c();
        FragmentManager childFragmentManager = tradeFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        iSpotServiceM102904c.mo59986C(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m63488P4() {
        C46683a.f104520a.m102905d().mo63679c();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m63490Q4() {
        C46683a.f104520a.m102905d().mo63679c();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m63492R4(TradeFragment tradeFragment) {
        if (!ISpotService.f49646a.get().mo59988E()) {
            tradeFragment.m63562l5();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m63496T4() {
        InterfaceC37758j.a.m85163l(C37304a.f82764a, null, null, null, null, null, null, null, 127, null);
        C43852m.m96590b("B5trading", "fiat", "1", TuplesKt.m90091to("after_page_id", "B7FastTrade"), TuplesKt.m90091to("norm_version", "1"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m63502W4() {
        C43852m.m96591c(C46683a.f104520a.m102904c().mo59997j(), "Trade_Convert_Button", "1", null, 8, null);
        Router.f46192a.m56184f("krn/router").m4038a(Constants.BIZ, "convert").m4038a("entry", "main").m4038a(Constants.COMPONENT, "kucoin_convert_rn").m4038a("route", Uri.encode("ConvertPage?from=BTC&to=USDT")).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y4 */
    public static final Unit m63506Y4(final TradeFragment tradeFragment) {
        Action action = new Action() { // from class: com.kubi.tradefacade.d0
            @Override // io.reactivex.functions.Action
            public final void run() {
                TradeFragment.m63508Z4(this.f51960b);
            }
        };
        Action action2 = new Action() { // from class: com.kubi.tradefacade.e0
            @Override // io.reactivex.functions.Action
            public final void run() {
                TradeFragment.m63510a5(this.f51962b);
            }
        };
        IMarginService iMarginServiceM102902a = C46683a.f104520a.m102902a();
        C45715b c45715bM63547D4 = tradeFragment.m63547D4();
        iMarginServiceM102902a.mo37914M(c45715bM63547D4 != null ? c45715bM63547D4.f103071k : null, tradeFragment, action, action2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z4 */
    public static final void m63508Z4(TradeFragment tradeFragment) {
        Intent intent;
        String strM63574t4 = tradeFragment.f51868h0.get() ? tradeFragment.m63574t4() : tradeFragment.m63567p4();
        C46683a c46683a = C46683a.f104520a;
        IMarginService iMarginServiceM102902a = c46683a.m102902a();
        C45715b c45715bM63547D4 = tradeFragment.m63547D4();
        String strM56280w = null;
        C43852m.m96591c(strM63574t4, "orderManagement", C27025c.m66566d(iMarginServiceM102902a.mo37908G(c45715bM63547D4 != null ? c45715bM63547D4.f103071k : null)) ? "8" : "6", null, 8, null);
        IMarginService iMarginServiceM102902a2 = c46683a.m102902a();
        C45715b c45715bM63547D5 = tradeFragment.m63547D4();
        if (C27025c.m66566d(iMarginServiceM102902a2.mo37908G(c45715bM63547D5 != null ? c45715bM63547D5.f103071k : null))) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.m() + "/account/vouchers?appNeedLang=true&&needLogin=true", null, 2L, null, C43852m.m96601m(tradeFragment.f51868h0.get() ? tradeFragment.m63574t4() : tradeFragment.m63567p4(), "orderManagement", "8"), null, null, 106, null);
            return;
        }
        String str = tradeFragment.f51868h0.get() ? "1" : "0";
        FragmentActivity activity = tradeFragment.getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            strM56280w = RouteExKt.m56280w(intent, "symbol");
        }
        C24271s1.m58531c(Router.f46192a.m56184f("lever/target/lend").m4038a("marginType", str).m4038a("marginSymbol", strM56280w), C43852m.m96601m(tradeFragment.f51868h0.get() ? tradeFragment.m63574t4() : tradeFragment.m63567p4(), "orderManagement", "6")).m4048k();
    }

    /* JADX INFO: renamed from: b5 */
    public static final void m63511b5(View view, int i11) {
        if (i11 <= 0) {
            if (view != null) {
                view.setFocusable(true);
            }
            if (view != null) {
                view.setFocusableInTouchMode(true);
            }
            if (view != null) {
                view.requestFocus();
            }
        }
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m63513c5() {
        C38226a.f85925a.m86301c();
        C43852m.m96591c("B5trading", "re_act_Button", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final BaseFragment m63514d4() {
        BaseFragment baseFragmentMo59989F = C46683a.f104520a.m102904c().mo59989F();
        baseFragmentMo59989F.setArguments(new Bundle());
        return baseFragmentMo59989F;
    }

    /* JADX INFO: renamed from: f4 */
    public static final BaseFragment m63515f4() {
        BaseFragment baseFragmentMo37926Z = C46683a.f104520a.m102902a().mo37926Z();
        baseFragmentMo37926Z.setArguments(new Bundle());
        return baseFragmentMo37926Z;
    }

    /* JADX INFO: renamed from: g4 */
    public static final BaseFragment m63516g4() {
        BaseFragment baseFragmentMo60005r = C46683a.f104520a.m102904c().mo60005r();
        baseFragmentMo60005r.setArguments(new Bundle());
        return baseFragmentMo60005r;
    }

    /* JADX INFO: renamed from: g5 */
    public static final BaseFragment m63517g5() {
        BaseFragment baseFragmentMo37913L = C46683a.f104520a.m102902a().mo37913L();
        baseFragmentMo37913L.setArguments(new Bundle());
        return baseFragmentMo37913L;
    }

    /* JADX INFO: renamed from: i4 */
    public static final String m63518i4() {
        return C46683a.f104520a.m102902a().mo37949n0();
    }

    /* JADX INFO: renamed from: j5 */
    public static final C4834l m63520j5(TradeFragment tradeFragment) {
        C4834l c4834l = new C4834l();
        c4834l.m4943k(tradeFragment.m63547D4(), C0119b.f446a.m577d());
        return c4834l;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m63522k4(TradeFragment tradeFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradeFragment.f51871k0 = it;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m63524l4(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C44128b.m97264h(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o5 */
    public static final BaseFragment m63530o5() {
        BaseFragment baseFragmentMo65993g = C46683a.f104520a.m102907f().mo65993g();
        baseFragmentMo65993g.setArguments(new Bundle());
        return baseFragmentMo65993g;
    }

    /* JADX INFO: renamed from: p5 */
    public static final BaseFragment m63532p5() {
        BaseFragment baseFragmentMo65991d = C46683a.f104520a.m102907f().mo65991d();
        baseFragmentMo65991d.setArguments(new Bundle());
        return baseFragmentMo65991d;
    }

    /* JADX INFO: renamed from: A4 */
    public final C4834l m63543A4() {
        return (C4834l) this.f51856V.getValue();
    }

    /* JADX INFO: renamed from: B4 */
    public final BaseFragment m63545B4() {
        return (BaseFragment) this.f51863c0.getValue();
    }

    /* JADX INFO: renamed from: C4 */
    public final BaseFragment m63546C4() {
        return (BaseFragment) this.f51862b0.getValue();
    }

    /* JADX INFO: renamed from: D4 */
    public final C45715b m63547D4() {
        return (C45715b) this.f51855U.getValue(this, f51854m0[0]);
    }

    /* JADX INFO: renamed from: d5 */
    public final void m63552d5(boolean z11) {
        C45715b c45715bM63547D4;
        RadioGroupPlus radioGroupPlus;
        RadioGroupPlus radioGroupPlus2;
        RadioGroupPlus radioGroupPlus3;
        if (!z11 || (c45715bM63547D4 = m63547D4()) == null || (radioGroupPlus = c45715bM63547D4.f103076p) == null) {
            return;
        }
        int f44016b = radioGroupPlus.getF44016b();
        int i11 = R$id.rb_coin;
        if (f44016b == i11) {
            C45715b c45715bM63547D5 = m63547D4();
            if (c45715bM63547D5 != null && (radioGroupPlus3 = c45715bM63547D5.f103076p) != null) {
                radioGroupPlus3.m54744g();
            }
            C45715b c45715bM63547D6 = m63547D4();
            if (c45715bM63547D6 == null || (radioGroupPlus2 = c45715bM63547D6.f103076p) == null) {
                return;
            }
            radioGroupPlus2.m54743f(i11);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public final void m63553e4() {
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.notice.event.NoticeEvent:update_notice_count".length();
        }
        C12572a.m23692a(this, false, new TradeFragment$bindOtcCountEvent$$inlined$bindFlowEvent$1("com.kubi.notice.event.NoticeEvent:update_notice_count", null, this));
    }

    /* JADX INFO: renamed from: e5 */
    public final void m63554e5(boolean z11) {
        this.f51858X = z11;
    }

    /* JADX INFO: renamed from: f5 */
    public final void m63555f5(int i11) {
        this.f51870j0 = i11;
    }

    /* JADX INFO: renamed from: h5 */
    public final void m63557h5() {
        Bundle arguments;
        if (this.f51868h0.compareAndSet(true, false)) {
            C46392a.m102328k(ISpotService.f49646a.get().mo59987D(), false);
            TradeItemBean tradeItemBeanMo37965v0 = C46683a.f104520a.m102902a().mo37965v0(m63580x4());
            if (tradeItemBeanMo37965v0.getSymbolInfoEntity().isMarginEnabled() && (arguments = m63578w4().getArguments()) != null) {
                arguments.putString("symbol", tradeItemBeanMo37965v0.getSymbol());
            }
            m63560k5();
        }
        C43852m.m96591c(m63567p4(), "B4tradingCrossButton", null, null, 12, null);
    }

    /* JADX INFO: renamed from: i5 */
    public final void m63558i5() {
        Bundle arguments;
        if (this.f51868h0.compareAndSet(false, true)) {
            C46392a.m102328k(ISpotService.f49646a.get().mo59987D(), true);
            TradeItemBean tradeItemBeanMo37965v0 = C46683a.f104520a.m102902a().mo37965v0(m63578w4());
            if (tradeItemBeanMo37965v0.getSymbolInfoEntity().isIsolatedMarginTradeEnabled() && (arguments = m63580x4().getArguments()) != null) {
                arguments.putString("symbol", tradeItemBeanMo37965v0.getSymbol());
            }
            m63560k5();
        }
        C43852m.m96591c(m63574t4(), "B4tradingIsolatedButton", null, null, 12, null);
    }

    /* JADX INFO: renamed from: j4 */
    public final void m63559j4() {
        DisposableKt.addTo(C46683a.f104520a.m102903b().mo43965m(new Function1() { // from class: com.kubi.tradefacade.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFragment.m63522k4(this.f51877b, (String) obj);
            }
        }, new Function1() { // from class: com.kubi.tradefacade.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFragment.m63524l4((Throwable) obj);
            }
        }), getDestroyDisposable());
    }

    /* JADX INFO: renamed from: l5 */
    public final void m63562l5() {
        C45715b c45715bM63547D4;
        RadioGroupPlus radioGroupPlus;
        RadioButton radioButton;
        if (!this.f51869i0.get() || (c45715bM63547D4 = m63547D4()) == null || (radioGroupPlus = c45715bM63547D4.f103076p) == null || radioGroupPlus.getF44016b() != R$id.rb_lever) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String string = getString(R$string.margin_whole_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(new SelectEntity(null, string, null, null, null, null, null, null, null, false, !this.f51868h0.get(), null, 3069, null));
        String string2 = getString(R$string.margin_single);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new SelectEntity(null, string2, null, null, null, null, null, null, null, false, this.f51868h0.get(), null, 3069, null));
        BaseDialogFragment baseDialogFragmentM54192r3 = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: com.kubi.tradefacade.h0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                TradeFragment.m63526m5(this.f51969b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.tradefacade.i0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TradeFragment.m63528n5(this.f51970b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "toggle_margin_type");
        C45715b c45715bM63547D5 = m63547D4();
        if (c45715bM63547D5 == null || (radioButton = c45715bM63547D5.f103077q) == null) {
            return;
        }
        C27046k.m66694i(radioButton, R$drawable.ic2_triangle_top_12, C5275i0.m6236a(2.0f), 0, 4, null);
    }

    /* JADX INFO: renamed from: m4 */
    public final BaseFragment m63563m4() {
        return (BaseFragment) this.f51865e0.getValue();
    }

    /* JADX INFO: renamed from: n4 */
    public final BaseFragment m63565n4() {
        return (BaseFragment) this.f51866f0.getValue();
    }

    /* JADX INFO: renamed from: o4 */
    public final BaseFragment m63566o4() {
        return (BaseFragment) this.f51864d0.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        if (C38226a.f85925a.m86301c()) {
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_fragment_trade, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull final View view, @Nullable Bundle savedInstanceState) {
        RadioButton radioButton;
        RadioGroupPlus radioGroupPlus;
        RadioButton radioButton2;
        RadioButton radioButton3;
        FrameLayout frameLayout;
        ImageView imageView;
        Window window;
        TextView textView;
        RadioButton radioButton4;
        TextView textView2;
        RadioButton radioButton5;
        RadioButton radioButton6;
        RadioGroupPlus radioGroupPlus2;
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (Fragment fragment : fragments) {
            Intrinsics.checkNotNull(fragment);
            C27032f.m66620k(this, fragment);
        }
        C45715b c45715bM63547D4 = m63547D4();
        if (c45715bM63547D4 != null && (constraintLayout = c45715bM63547D4.f103080t) != null) {
            constraintLayout.setPadding(0, EdgeToEdgeCompat.f48106a.m58272j(), 0, 0);
        }
        Typeface font = ResourcesCompat.getFont(view.getContext(), R$font.regular);
        Typeface font2 = ResourcesCompat.getFont(view.getContext(), R$font.medium);
        C45715b c45715bM63547D5 = m63547D4();
        if (c45715bM63547D5 != null && (radioGroupPlus2 = c45715bM63547D5.f103076p) != null) {
            radioGroupPlus2.setOnCheckedChangeListener(new C25953a(font2, font));
        }
        if (ISpotService.f49646a.get().mo59988E()) {
            C45715b c45715bM63547D6 = m63547D4();
            if (c45715bM63547D6 != null && (radioButton6 = c45715bM63547D6.f103077q) != null) {
                C27046k.m66694i(radioButton6, 0, 0, 0, 6, null);
            }
        } else {
            C45715b c45715bM63547D7 = m63547D4();
            if (c45715bM63547D7 != null && (radioButton = c45715bM63547D7.f103077q) != null) {
                C27046k.m66711z(radioButton, 0L, new Function0() { // from class: com.kubi.tradefacade.g
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TradeFragment.m63492R4(this.f51966b);
                    }
                }, 1, null);
            }
        }
        if (C0119b.f446a.m577d()) {
            m63543A4().m4942j();
        } else {
            C45715b c45715bM63547D8 = m63547D4();
            if (c45715bM63547D8 != null && (radioGroupPlus = c45715bM63547D8.f103076p) != null) {
                radioGroupPlus.m54743f(R$id.rb_coin);
            }
        }
        IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
        if (companion.get().mo50712o()) {
            C45715b c45715bM63547D9 = m63547D4();
            if (c45715bM63547D9 != null && (radioButton5 = c45715bM63547D9.f103072l) != null) {
                ViewExtKt.m66594y(radioButton5);
            }
        } else {
            C45715b c45715bM63547D10 = m63547D4();
            if (c45715bM63547D10 != null && (radioButton2 = c45715bM63547D10.f103072l) != null) {
                ViewExtKt.m66577h(radioButton2);
            }
        }
        SiteVisibleConfigKey siteVisibleConfigKey = SiteVisibleConfigKey.FastTrade;
        C24129b.m58029a(siteVisibleConfigKey, new Function0() { // from class: com.kubi.tradefacade.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFragment.m63494S4(this.f51985b);
            }
        });
        C45715b c45715bM63547D11 = m63547D4();
        if (c45715bM63547D11 != null && (textView2 = c45715bM63547D11.f103073m) != null) {
            C27046k.m66711z(textView2, 0L, new Function0() { // from class: com.kubi.tradefacade.c0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeFragment.m63496T4();
                }
            }, 1, null);
        }
        C24129b.m58029a(SiteVisibleConfigKey.Convert, new Function0() { // from class: com.kubi.tradefacade.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFragment.m63498U4(this.f51978b);
            }
        });
        SiteVisibleConfigKey siteVisibleConfigKey2 = SiteVisibleConfigKey.Margin;
        C24129b.m58029a(siteVisibleConfigKey2, new Function0() { // from class: com.kubi.tradefacade.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFragment.m63500V4(this.f51979b);
            }
        });
        if (companion.get().mo50712o()) {
            C45715b c45715bM63547D12 = m63547D4();
            if (c45715bM63547D12 != null && (radioButton4 = c45715bM63547D12.f103072l) != null) {
                ViewExtKt.m66594y(radioButton4);
            }
        } else {
            C45715b c45715bM63547D13 = m63547D4();
            if (c45715bM63547D13 != null && (radioButton3 = c45715bM63547D13.f103072l) != null) {
                ViewExtKt.m66577h(radioButton3);
            }
        }
        C45715b c45715bM63547D14 = m63547D4();
        if (c45715bM63547D14 != null && (textView = c45715bM63547D14.f103075o) != null) {
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.tradefacade.l0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeFragment.m63502W4();
                }
            }, 1, null);
        }
        C24129b.m58033e(siteVisibleConfigKey, new Function0() { // from class: com.kubi.tradefacade.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFragment.m63504X4(this.f51980b);
            }
        });
        C24129b.m58033e(siteVisibleConfigKey2, new Function0() { // from class: com.kubi.tradefacade.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFragment.m63506Y4(this.f51981b);
            }
        });
        if (C46683a.f104520a.m102905d().mo63686k()) {
            m63549F4();
        } else {
            C45715b c45715bM63547D15 = m63547D4();
            if (c45715bM63547D15 != null && (frameLayout = c45715bM63547D15.f103079s) != null) {
                ViewExtKt.m66577h(frameLayout);
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            KeyboardUtils.m6039k(window, new KeyboardUtils.InterfaceC5235b() { // from class: com.kubi.tradefacade.o0
                @Override // com.blankj.utilcode.util.KeyboardUtils.InterfaceC5235b
                /* JADX INFO: renamed from: a */
                public final void mo6045a(int i11) {
                    TradeFragment.m63511b5(view, i11);
                }
            });
        }
        C45715b c45715bM63547D16 = m63547D4();
        if (c45715bM63547D16 != null && (imageView = c45715bM63547D16.f103066f) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.tradefacade.p0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeFragment.m63513c5();
                }
            }, 1, null);
        }
        m63556h4();
    }

    /* JADX INFO: renamed from: p4 */
    public final String m63567p4() {
        return (String) this.f51859Y.getValue();
    }

    /* JADX INFO: renamed from: s4, reason: from getter */
    public final boolean getF51858X() {
        return this.f51858X;
    }

    /* JADX INFO: renamed from: t4 */
    public final String m63574t4() {
        return (String) this.f51860Z.getValue();
    }

    @Override // p768xo.InterfaceC46303d
    /* JADX INFO: renamed from: u */
    public void mo63575u(boolean z11) {
        if (z11) {
            m63558i5();
        } else {
            m63557h5();
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final String m63576u4() {
        if (ISpotService.f49646a.get().mo59988E()) {
            String string = getString(R$string.lever);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = getString(!this.f51868h0.get() ? R$string.margin_whole_title : R$string.margin_single);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    /* JADX INFO: renamed from: v4 */
    public final InterfaceC46930a m63577v4() {
        return (InterfaceC46930a) this.f51872l0.getValue();
    }

    /* JADX INFO: renamed from: w4 */
    public final BaseFragment m63578w4() {
        return C46683a.f104520a.m102906e().mo64979C() ? m63545B4() : m63565n4();
    }

    /* JADX INFO: renamed from: x4 */
    public final BaseFragment m63580x4() {
        return (BaseFragment) this.f51867g0.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    public final BaseFragment m63581y4() {
        return C46683a.f104520a.m102906e().mo64979C() ? m63546C4() : m63566o4();
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m63470G4(TradeFragment tradeFragment) {
        RadioGroupPlus radioGroupPlus;
        C45715b c45715bM63547D4 = tradeFragment.m63547D4();
        if (c45715bM63547D4 != null && (radioGroupPlus = c45715bM63547D4.f103076p) != null) {
            radioGroupPlus.m54743f(R$id.rb_robot);
        }
        C43852m.m96591c("B5TradingBot", "topTab", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m63478K4(TradeFragment tradeFragment) {
        tradeFragment.m63548E4();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M4 */
    public static final Unit m63482M4(TradeFragment tradeFragment, Ref.ObjectRef objectRef, String str) {
        Bundle arguments;
        Bundle arguments2;
        RadioGroupPlus radioGroupPlus;
        C45715b c45715bM63547D4 = tradeFragment.m63547D4();
        if (c45715bM63547D4 != null && (radioGroupPlus = c45715bM63547D4.f103076p) != null) {
            radioGroupPlus.m54743f(R$id.rb_lever);
        }
        CharSequence charSequence = (CharSequence) objectRef.element;
        if (charSequence != null && charSequence.length() != 0 && (arguments2 = tradeFragment.m63578w4().getArguments()) != null) {
            arguments2.putString("symbol", (String) objectRef.element);
        }
        if (str != null && str.length() != 0 && (arguments = tradeFragment.m63578w4().getArguments()) != null) {
            arguments.putString("isBuy", str);
        }
        if (tradeFragment.f51868h0.compareAndSet(true, false)) {
            C46392a.m102328k(ISpotService.f49646a.get().mo59987D(), false);
            tradeFragment.m63560k5();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N4 */
    public static final Unit m63484N4(TradeFragment tradeFragment, Ref.ObjectRef objectRef, String str) {
        Bundle arguments;
        Bundle arguments2;
        RadioGroupPlus radioGroupPlus;
        C45715b c45715bM63547D4 = tradeFragment.m63547D4();
        if (c45715bM63547D4 != null && (radioGroupPlus = c45715bM63547D4.f103076p) != null) {
            radioGroupPlus.m54743f(R$id.rb_lever);
        }
        CharSequence charSequence = (CharSequence) objectRef.element;
        if (charSequence != null && charSequence.length() != 0 && (arguments2 = tradeFragment.m63580x4().getArguments()) != null) {
            arguments2.putString("symbol", (String) objectRef.element);
        }
        if (str != null && str.length() != 0 && (arguments = tradeFragment.m63580x4().getArguments()) != null) {
            arguments.putString("isBuy", str);
        }
        if (tradeFragment.f51868h0.compareAndSet(false, true)) {
            C46392a.m102328k(ISpotService.f49646a.get().mo59987D(), true);
            tradeFragment.m63560k5();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public static final Unit m63486O4(TradeFragment tradeFragment, Ref.ObjectRef objectRef, String str) {
        Bundle arguments;
        Bundle arguments2;
        RadioGroupPlus radioGroupPlus;
        C45715b c45715bM63547D4 = tradeFragment.m63547D4();
        if (c45715bM63547D4 != null && (radioGroupPlus = c45715bM63547D4.f103076p) != null) {
            radioGroupPlus.m54743f(R$id.rb_lever);
        }
        CharSequence charSequence = (CharSequence) objectRef.element;
        if (charSequence != null && charSequence.length() != 0 && (arguments2 = tradeFragment.m63569q4().getArguments()) != null) {
            arguments2.putString("symbol", (String) objectRef.element);
        }
        if (str != null && str.length() != 0 && (arguments = tradeFragment.m63569q4().getArguments()) != null) {
            arguments.putString("isBuy", str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m63494S4(TradeFragment tradeFragment) {
        FrameLayout frameLayout;
        C45715b c45715bM63547D4 = tradeFragment.m63547D4();
        if (c45715bM63547D4 != null && (frameLayout = c45715bM63547D4.f103062b) != null) {
            ViewExtKt.m66577h(frameLayout);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m63498U4(TradeFragment tradeFragment) {
        TextView textView;
        C45715b c45715bM63547D4 = tradeFragment.m63547D4();
        if (c45715bM63547D4 != null && (textView = c45715bM63547D4.f103075o) != null) {
            ViewExtKt.m66577h(textView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V4 */
    public static final Unit m63500V4(TradeFragment tradeFragment) {
        FrameLayout frameLayout;
        C45715b c45715bM63547D4 = tradeFragment.m63547D4();
        if (c45715bM63547D4 != null && (frameLayout = c45715bM63547D4.f103063c) != null) {
            ViewExtKt.m66577h(frameLayout);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X4 */
    public static final Unit m63504X4(TradeFragment tradeFragment) {
        tradeFragment.m63553e4();
        tradeFragment.m63559j4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a5 */
    public static final void m63510a5(TradeFragment tradeFragment) {
        String strM63567p4;
        LinearLayout linearLayout;
        String str;
        if (tradeFragment.getView() == null) {
            return;
        }
        if (tradeFragment.f51868h0.get()) {
            strM63567p4 = tradeFragment.m63574t4();
        } else {
            strM63567p4 = tradeFragment.m63567p4();
        }
        String str2 = strM63567p4;
        C46683a c46683a = C46683a.f104520a;
        IMarginService iMarginServiceM102902a = c46683a.m102902a();
        C45715b c45715bM63547D4 = tradeFragment.m63547D4();
        LinearLayout linearLayout2 = null;
        if (c45715bM63547D4 != null) {
            linearLayout = c45715bM63547D4.f103071k;
        } else {
            linearLayout = null;
        }
        if (C27025c.m66566d(iMarginServiceM102902a.mo37908G(linearLayout))) {
            str = "9";
        } else {
            str = TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO;
        }
        C43852m.m96591c(str2, "orderManagement", str, null, 8, null);
        IMarginService iMarginServiceM102902a2 = c46683a.m102902a();
        C45715b c45715bM63547D5 = tradeFragment.m63547D4();
        if (c45715bM63547D5 != null) {
            linearLayout2 = c45715bM63547D5.f103071k;
        }
        iMarginServiceM102902a2.mo37948n(tradeFragment, linearLayout2);
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m63512c4(TradeFragment tradeFragment) {
        C45715b c45715bM63547D4;
        HorizontalScrollView horizontalScrollView;
        C45715b c45715bM63547D5;
        RadioGroupPlus radioGroupPlus;
        RadioGroupPlus radioGroupPlus2;
        C45715b c45715bM63547D6;
        RadioGroupPlus radioGroupPlus3;
        int i11;
        if (tradeFragment.getView() != null && (c45715bM63547D4 = tradeFragment.m63547D4()) != null && (horizontalScrollView = c45715bM63547D4.f103065e) != null) {
            int measuredWidth = horizontalScrollView.getChildAt(0).getMeasuredWidth() - horizontalScrollView.getMeasuredWidth();
            int i12 = 17;
            if (horizontalScrollView.getScrollX() == 0 && (c45715bM63547D6 = tradeFragment.m63547D4()) != null && (radioGroupPlus3 = c45715bM63547D6.f103076p) != null && radioGroupPlus3.getF44016b() == R$id.rb_robot) {
                if (!C5303w0.m6511a()) {
                    i11 = 66;
                } else {
                    i11 = 17;
                }
                horizontalScrollView.fullScroll(i11);
            }
            if (horizontalScrollView.getScrollX() + ViewConfiguration.get(horizontalScrollView.getContext()).getScaledTouchSlop() >= measuredWidth) {
                C45715b c45715bM63547D7 = tradeFragment.m63547D4();
                if ((c45715bM63547D7 != null && (radioGroupPlus2 = c45715bM63547D7.f103076p) != null && radioGroupPlus2.getF44016b() == R$id.rb_lever) || ((c45715bM63547D5 = tradeFragment.m63547D4()) != null && (radioGroupPlus = c45715bM63547D5.f103076p) != null && radioGroupPlus.getF44016b() == R$id.rb_coin)) {
                    if (C5303w0.m6511a()) {
                        i12 = 66;
                    }
                    horizontalScrollView.fullScroll(i12);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m5 */
    public static final void m63526m5(TradeFragment tradeFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        if (baseViewHolder.getAdapterPosition() != 0 || tradeFragment.f51868h0.get()) {
            if (baseViewHolder.getAdapterPosition() == 1 && tradeFragment.f51868h0.get()) {
                return;
            }
            if (baseViewHolder.getAdapterPosition() == 0) {
                tradeFragment.m63557h5();
            } else {
                tradeFragment.m63558i5();
            }
        }
    }

    /* JADX INFO: renamed from: n5 */
    public static final void m63528n5(TradeFragment tradeFragment, DialogInterface dialogInterface) {
        C45715b c45715bM63547D4;
        RadioButton radioButton;
        if (tradeFragment.getView() != null && (c45715bM63547D4 = tradeFragment.m63547D4()) != null && (radioButton = c45715bM63547D4.f103077q) != null) {
            C27046k.m66694i(radioButton, R$drawable.ic2_triangle_bottom_12, C5275i0.m6236a(2.0f), 0, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public final void m63544B0() {
        SwipeRefreshLayout.OnRefreshListener onRefreshListener;
        BaseFragment baseFragmentM63569q4 = m63569q4();
        C46683a c46683a = C46683a.f104520a;
        if (c46683a.m102904c().mo59993e(baseFragmentM63569q4)) {
            c46683a.m102904c().mo60002o(baseFragmentM63569q4);
        } else if (c46683a.m102902a().mo37971y0(baseFragmentM63569q4)) {
            c46683a.m102902a().mo37966w(baseFragmentM63569q4);
        }
        if (baseFragmentM63569q4 instanceof SwipeRefreshLayout.OnRefreshListener) {
            onRefreshListener = (SwipeRefreshLayout.OnRefreshListener) baseFragmentM63569q4;
        } else {
            onRefreshListener = null;
        }
        if (onRefreshListener != null) {
            onRefreshListener.onRefresh();
        }
    }

    /* JADX INFO: renamed from: E4 */
    public final void m63548E4() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        InterfaceC46930a interfaceC46930aM63577v4 = m63577v4();
        if (interfaceC46930aM63577v4 != null) {
            interfaceC46930aM63577v4.mo55426c(1.0f, 8.0f, true);
        }
        int i11 = 0;
        if (this.f51871k0.length() == 0 || MultiLanguageManager.m56980j()) {
            C45715b c45715bM63547D4 = m63547D4();
            if (c45715bM63547D4 != null && (textView = c45715bM63547D4.f103059B) != null) {
                ViewExtKt.m66577h(textView);
            }
            InterfaceC46930a interfaceC46930aM63577v5 = m63577v4();
            if (interfaceC46930aM63577v5 != null) {
                if (this.f51870j0 > 0) {
                    i11 = -1;
                }
                interfaceC46930aM63577v5.mo55425b(i11);
                return;
            }
            return;
        }
        C45715b c45715bM63547D5 = m63547D4();
        if (c45715bM63547D5 != null && (textView3 = c45715bM63547D5.f103059B) != null) {
            C27046k.m66685H(textView3);
        }
        C45715b c45715bM63547D6 = m63547D4();
        if (c45715bM63547D6 != null && (textView2 = c45715bM63547D6.f103059B) != null) {
            textView2.setText(C27041f.m66668h(this.f51871k0));
        }
        InterfaceC46930a interfaceC46930aM63577v6 = m63577v4();
        if (interfaceC46930aM63577v6 != null) {
            interfaceC46930aM63577v6.mo55425b(0);
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m63549F4() {
        RadioButton radioButton;
        RadioButton radioButton2;
        FrameLayout frameLayout;
        C45715b c45715bM63547D4 = m63547D4();
        if (c45715bM63547D4 != null && (frameLayout = c45715bM63547D4.f103079s) != null) {
            C27046k.m66685H(frameLayout);
        }
        C45715b c45715bM63547D5 = m63547D4();
        if (c45715bM63547D5 != null && (radioButton2 = c45715bM63547D5.f103078r) != null) {
            radioButton2.setText(getString(R$string.robot));
        }
        C45715b c45715bM63547D6 = m63547D4();
        if (c45715bM63547D6 != null && (radioButton = c45715bM63547D6.f103078r) != null) {
            C27046k.m66711z(radioButton, 0L, new Function0() { // from class: com.kubi.tradefacade.g0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeFragment.m63470G4(this.f51967b);
                }
            }, 1, null);
        }
    }

    @Override // p768xo.InterfaceC46302c
    @Nullable
    /* JADX INFO: renamed from: M2 */
    public View mo63550M2() {
        C45715b c45715bM63547D4 = m63547D4();
        if (c45715bM63547D4 != null) {
            return c45715bM63547D4.f103085y;
        }
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public final void m63551b4() {
        HorizontalScrollView horizontalScrollView;
        C45715b c45715bM63547D4 = m63547D4();
        if (c45715bM63547D4 != null && (horizontalScrollView = c45715bM63547D4.f103065e) != null) {
            horizontalScrollView.post(new Runnable() { // from class: com.kubi.tradefacade.f0
                @Override // java.lang.Runnable
                public final void run() {
                    TradeFragment.m63512c4(this.f51965b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final InterfaceC41775x1 m63556h4() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new TradeFragment$collectTradeAccountModelChange$1(this, null));
    }

    /* JADX INFO: renamed from: k5 */
    public final void m63560k5() {
        HorizontalScrollView horizontalScrollView;
        RadioGroupPlus radioGroupPlus;
        RadioGroupPlus radioGroupPlus2;
        RadioButton radioButton;
        C45715b c45715bM63547D4 = m63547D4();
        if (c45715bM63547D4 != null && (radioButton = c45715bM63547D4.f103077q) != null) {
            radioButton.setText(m63576u4());
        }
        BaseFragment baseFragmentM63569q4 = m63569q4();
        if (!C0119b.f446a.m577d()) {
            m63551b4();
        } else {
            TabScrollHelper tabScrollHelper = TabScrollHelper.f52044a;
            C45715b c45715bM63547D5 = m63547D4();
            Integer numValueOf = null;
            if (c45715bM63547D5 != null) {
                horizontalScrollView = c45715bM63547D5.f103065e;
            } else {
                horizontalScrollView = null;
            }
            C45715b c45715bM63547D6 = m63547D4();
            if (c45715bM63547D6 != null) {
                radioGroupPlus = c45715bM63547D6.f103076p;
            } else {
                radioGroupPlus = null;
            }
            C45715b c45715bM63547D7 = m63547D4();
            if (c45715bM63547D7 != null && (radioGroupPlus2 = c45715bM63547D7.f103076p) != null) {
                numValueOf = Integer.valueOf(radioGroupPlus2.getF44016b());
            }
            tabScrollHelper.m63676b(horizontalScrollView, radioGroupPlus, numValueOf);
        }
        m63572r5(baseFragmentM63569q4);
    }

    @Override // p768xo.InterfaceC46302c
    @Nullable
    /* JADX INFO: renamed from: l1 */
    public FrameLayout mo63561l1() {
        C45715b c45715bM63547D4 = m63547D4();
        if (c45715bM63547D4 != null) {
            return c45715bM63547D4.f103083w;
        }
        return null;
    }

    @Override // p768xo.InterfaceC46302c
    @Nullable
    /* JADX INFO: renamed from: n1 */
    public View mo63564n1() {
        C45715b c45715bM63547D4 = m63547D4();
        if (c45715bM63547D4 != null) {
            return c45715bM63547D4.f103082v;
        }
        return null;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Window window;
        super.onDestroyView();
        C46683a.f104520a.m102902a().mo37945l0();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            KeyboardUtils.m6044p(window);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof DialogFragment) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((DialogFragment) it.next()).dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v33, types: [T, java.lang.String] */
    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        T tM56280w;
        int i11;
        final String strM56280w;
        Integer numValueOf;
        String strM56280w2;
        Bundle arguments;
        Bundle arguments2;
        Intent intent;
        RadioGroupPlus radioGroupPlus;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        String strM56280w3;
        Intent intent6;
        Bundle arguments3;
        Bundle arguments4;
        RadioGroupPlus radioGroupPlus2;
        Intent intent7;
        Intent intent8;
        View view;
        ImageView imageView;
        String strM56280w4;
        String strM56280w5;
        Intent intent9;
        Intent intent10;
        Intent intent11;
        super.onShow();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        FragmentActivity activity = getActivity();
        SpotKycLeadView spotKycLeadView = null;
        if (activity != null && (intent11 = activity.getIntent()) != null) {
            tM56280w = RouteExKt.m56280w(intent11, "symbol");
        } else {
            tM56280w = 0;
        }
        objectRef.element = tM56280w;
        if (tM56280w == 0) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null && (intent10 = activity2.getIntent()) != null) {
                strM56280w4 = RouteExKt.m56280w(intent10, FirebaseAnalytics.Param.CURRENCY);
            } else {
                strM56280w4 = null;
            }
            if (!TextUtils.isEmpty(strM56280w4)) {
                C37890n c37890n = C37890n.f85269a;
                FragmentActivity activity3 = getActivity();
                if (activity3 != null && (intent9 = activity3.getIntent()) != null) {
                    strM56280w5 = RouteExKt.m56280w(intent9, FirebaseAnalytics.Param.CURRENCY);
                } else {
                    strM56280w5 = null;
                }
                objectRef.element = c37890n.m85600A(C27041f.m66668h(strM56280w5));
            }
        }
        boolean zM86299a = C38226a.f85925a.m86299a(this.f51861a0);
        if (zM86299a) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        C45715b c45715bM63547D4 = m63547D4();
        if (c45715bM63547D4 != null && (imageView = c45715bM63547D4.f103066f) != null) {
            imageView.setVisibility(i11);
        }
        C45715b c45715bM63547D5 = m63547D4();
        if (c45715bM63547D5 != null && (view = c45715bM63547D5.f103060C) != null) {
            view.setVisibility(i11);
        }
        if (zM86299a) {
            C43852m.m96595g("B5trading", "re_act_Button", null, null, 12, null);
        }
        FragmentActivity activity4 = getActivity();
        if (activity4 != null && (intent8 = activity4.getIntent()) != null) {
            strM56280w = RouteExKt.m56280w(intent8, "isBuy");
        } else {
            strM56280w = null;
        }
        FragmentActivity activity5 = getActivity();
        if (activity5 != null && (intent7 = activity5.getIntent()) != null) {
            numValueOf = Integer.valueOf(RouteExKt.m56258l(intent7, "type", -1));
        } else {
            numValueOf = null;
        }
        C46683a c46683a = C46683a.f104520a;
        int iMo60004q = c46683a.m102904c().mo60004q();
        if (numValueOf != null && numValueOf.intValue() == iMo60004q) {
            C45715b c45715bM63547D6 = m63547D4();
            if (c45715bM63547D6 != null && (radioGroupPlus2 = c45715bM63547D6.f103076p) != null) {
                radioGroupPlus2.m54743f(R$id.rb_coin);
            }
            CharSequence charSequence = (CharSequence) objectRef.element;
            if (charSequence != null && charSequence.length() != 0 && (arguments4 = m63581y4().getArguments()) != null) {
                arguments4.putString("symbol", (String) objectRef.element);
            }
            if (strM56280w != null && strM56280w.length() != 0 && (arguments3 = m63581y4().getArguments()) != null) {
                arguments3.putString("isBuy", strM56280w);
            }
            Bundle arguments5 = m63581y4().getArguments();
            if (arguments5 != null) {
                FragmentActivity activity6 = getActivity();
                if (activity6 != null && (intent6 = activity6.getIntent()) != null) {
                    strM56280w3 = RouteExKt.m56280w(intent6, "bottomTab");
                } else {
                    strM56280w3 = null;
                }
                if (strM56280w3 == null) {
                    strM56280w3 = "";
                }
                arguments5.putString("bottomTab", strM56280w3);
            }
        } else {
            int iMo37936f0 = c46683a.m102902a().mo37936f0();
            if (numValueOf != null && numValueOf.intValue() == iMo37936f0) {
                C24129b.m58033e(SiteVisibleConfigKey.Margin, new Function0() { // from class: com.kubi.tradefacade.s
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TradeFragment.m63482M4(this.f51986b, objectRef, strM56280w);
                    }
                });
            } else {
                int iMo37932c0 = c46683a.m102902a().mo37932c0();
                if (numValueOf != null && numValueOf.intValue() == iMo37932c0) {
                    C24129b.m58033e(SiteVisibleConfigKey.Margin, new Function0() { // from class: com.kubi.tradefacade.t
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TradeFragment.m63484N4(this.f51992b, objectRef, strM56280w);
                        }
                    });
                } else {
                    int iMo37922V = c46683a.m102902a().mo37922V();
                    if (numValueOf != null && numValueOf.intValue() == iMo37922V) {
                        C24129b.m58033e(SiteVisibleConfigKey.Margin, new Function0() { // from class: com.kubi.tradefacade.u
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TradeFragment.m63486O4(this.f52035b, objectRef, strM56280w);
                            }
                        });
                    } else {
                        int iMo63680d = c46683a.m102905d().mo63680d();
                        if (numValueOf != null && numValueOf.intValue() == iMo63680d) {
                            C24129b.m58033e(SiteVisibleConfigKey.BotSpotGrid, new Function0() { // from class: com.kubi.tradefacade.v
                                @Override // p852kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TradeFragment.m63488P4();
                                }
                            });
                        } else {
                            int iMo63684i = c46683a.m102905d().mo63684i();
                            if (numValueOf != null && numValueOf.intValue() == iMo63684i) {
                                C24129b.m58033e(SiteVisibleConfigKey.BotFuturesContractGrid, new Function0() { // from class: com.kubi.tradefacade.w
                                    @Override // p852kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return TradeFragment.m63490Q4();
                                    }
                                });
                            } else {
                                int iMo60010w = c46683a.m102904c().mo60010w();
                                if (numValueOf != null && numValueOf.intValue() == iMo60010w) {
                                    C45715b c45715bM63547D7 = m63547D4();
                                    if (c45715bM63547D7 != null && (radioGroupPlus = c45715bM63547D7.f103076p) != null) {
                                        radioGroupPlus.m54743f(R$id.rb_alpha);
                                    }
                                    FragmentActivity activity7 = getActivity();
                                    if (activity7 != null && (intent = activity7.getIntent()) != null) {
                                        strM56280w2 = RouteExKt.m56280w(intent, "currencySeq");
                                    } else {
                                        strM56280w2 = null;
                                    }
                                    if (strM56280w2 != null && strM56280w2.length() != 0 && (arguments2 = m63563m4().getArguments()) != null) {
                                        arguments2.putString("currencySeq", strM56280w2);
                                    }
                                    if (strM56280w != null && strM56280w.length() != 0 && (arguments = m63563m4().getArguments()) != null) {
                                        arguments.putString("isBuy", strM56280w);
                                    }
                                    Bundle arguments6 = m63563m4().getArguments();
                                    if (arguments6 != null) {
                                        arguments6.putInt("type", c46683a.m102904c().mo60010w());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (C0119b.f446a.m577d()) {
            m63543A4().m4942j();
        }
        FragmentActivity activity8 = getActivity();
        if (activity8 != null && (intent5 = activity8.getIntent()) != null) {
            intent5.putExtra("type", OtcAd.KYC_NOT_PASS);
        }
        FragmentActivity activity9 = getActivity();
        if (activity9 != null && (intent4 = activity9.getIntent()) != null) {
            intent4.putExtra("symbol", "");
        }
        FragmentActivity activity10 = getActivity();
        if (activity10 != null && (intent3 = activity10.getIntent()) != null) {
            intent3.putExtra("fromMarket", CredentialEntry.FALSE_STRING);
        }
        FragmentActivity activity11 = getActivity();
        if (activity11 != null && (intent2 = activity11.getIntent()) != null) {
            intent2.removeExtra("isBuy");
        }
        C24129b.m58033e(SiteVisibleConfigKey.Margin, new Function0() { // from class: com.kubi.tradefacade.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFragment.m63476J4(this.f52045b);
            }
        });
        C24129b.m58033e(SiteVisibleConfigKey.FastTrade, new Function0() { // from class: com.kubi.tradefacade.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFragment.m63478K4(this.f52046b);
            }
        });
        IKuFacadeService iKuFacadeService = IKuFacadeService.f27711a.get();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        iKuFacadeService.mo31928g(this, viewLifecycleOwner, new Function0() { // from class: com.kubi.tradefacade.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFragment.m63480L4(this.f52047b);
            }
        });
        SpotKycLeadHelper spotKycLeadHelper = SpotKycLeadHelper.f51852a;
        C45715b c45715bM63547D8 = m63547D4();
        if (c45715bM63547D8 != null) {
            spotKycLeadView = c45715bM63547D8.f103070j;
        }
        spotKycLeadHelper.m63456b(spotKycLeadView, LifecycleOwnerKt.getLifecycleScope(this), this);
    }

    /* JADX INFO: renamed from: q1 */
    public final void m63568q1(boolean z11) {
        C45715b c45715bM63547D4;
        LinearLayoutCompat linearLayoutCompat;
        ConstraintLayout.LayoutParams layoutParams;
        int iM6236a;
        if (getView() != null && (c45715bM63547D4 = m63547D4()) != null && (linearLayoutCompat = c45715bM63547D4.f103082v) != null) {
            ViewGroup.LayoutParams layoutParams2 = linearLayoutCompat.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams3 = null;
            if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                layoutParams = (ConstraintLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                if (z11) {
                    iM6236a = C5275i0.m6236a(30.0f);
                } else {
                    iM6236a = 0;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = iM6236a;
                layoutParams3 = layoutParams;
            }
            linearLayoutCompat.setLayoutParams(layoutParams3);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final BaseFragment m63569q4() {
        RadioGroupPlus radioGroupPlus;
        RadioGroupPlus radioGroupPlus2;
        C45715b c45715bM63547D4 = m63547D4();
        if (c45715bM63547D4 != null && (radioGroupPlus2 = c45715bM63547D4.f103076p) != null && radioGroupPlus2.getF44016b() == R$id.rb_coin) {
            return m63581y4();
        }
        C45715b c45715bM63547D5 = m63547D4();
        if (c45715bM63547D5 != null && (radioGroupPlus = c45715bM63547D5.f103076p) != null && radioGroupPlus.getF44016b() == R$id.rb_alpha) {
            return m63563m4();
        }
        if (!this.f51868h0.get()) {
            return m63578w4();
        }
        return m63580x4();
    }

    /* JADX INFO: renamed from: q5 */
    public final void m63570q5(RadioGroupPlus radioGroupPlus, int i11) {
        Typeface font;
        int childCount = radioGroupPlus.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = radioGroupPlus.getChildAt(i12);
            if (childAt instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) childAt;
                if (radioButton.getId() == i11) {
                    font = ResourcesCompat.getFont(radioGroupPlus.getContext(), R$font.medium);
                } else {
                    font = ResourcesCompat.getFont(radioGroupPlus.getContext(), R$font.regular);
                }
                radioButton.setTypeface(font);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: r4 */
    public final Integer m63571r4() {
        int iMo37932c0;
        RadioGroupPlus radioGroupPlus;
        RadioGroupPlus radioGroupPlus2;
        try {
            C45715b c45715bM63547D4 = m63547D4();
            if (c45715bM63547D4 != null && (radioGroupPlus2 = c45715bM63547D4.f103076p) != null && radioGroupPlus2.getF44016b() == R$id.rb_coin) {
                iMo37932c0 = ISpotService.f49646a.get().mo60004q();
            } else {
                C45715b c45715bM63547D5 = m63547D4();
                if (c45715bM63547D5 != null && (radioGroupPlus = c45715bM63547D5.f103076p) != null && radioGroupPlus.getF44016b() == R$id.rb_alpha) {
                    iMo37932c0 = ISpotService.f49646a.get().mo60010w();
                } else if (!this.f51868h0.get()) {
                    iMo37932c0 = IMarginService.f32724a.get().mo37936f0();
                } else {
                    iMo37932c0 = IMarginService.f32724a.get().mo37932c0();
                }
            }
            return Integer.valueOf(iMo37932c0);
        } catch (Exception e11) {
            C44128b.m97264h(e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: r5 */
    public final void m63572r5(BaseFragment baseFragment) {
        if (!baseFragment.isAdded()) {
            getChildFragmentManager().beginTransaction().add(R$id.fl_main_container, baseFragment).commitNowAllowingStateLoss();
        }
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof IKlineFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof BaseFragment) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((BaseFragment) obj3).isAdded()) {
                arrayList3.add(obj3);
            }
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            ExtensionKt.m32185k(this, (BaseFragment) it.next());
        }
        for (Fragment fragment : getChildFragmentManager().getFragments()) {
            if (!Intrinsics.areEqual(fragment, baseFragment)) {
                Intrinsics.checkNotNull(fragment);
                C27032f.m66615f(this, fragment);
            }
        }
        for (Fragment fragment2 : getChildFragmentManager().getFragments()) {
            if (Intrinsics.areEqual(fragment2, baseFragment)) {
                Intrinsics.checkNotNull(fragment2);
                C27032f.m66627r(this, fragment2);
            }
        }
    }

    @Override // p768xo.InterfaceC46302c
    @Nullable
    /* JADX INFO: renamed from: x1 */
    public View mo63579x1() {
        C45715b c45715bM63547D4 = m63547D4();
        if (c45715bM63547D4 != null) {
            return c45715bM63547D4.f103084x;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: z4 */
    public final String m63582z4() {
        Integer numValueOf;
        RadioGroupPlus radioGroupPlus;
        C45715b c45715bM63547D4 = m63547D4();
        if (c45715bM63547D4 != null && (radioGroupPlus = c45715bM63547D4.f103076p) != null) {
            numValueOf = Integer.valueOf(radioGroupPlus.getF44016b());
        } else {
            numValueOf = null;
        }
        int i11 = R$id.rb_coin;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            return "B5trading";
        }
        int i12 = R$id.rb_lever;
        if (numValueOf == null || numValueOf.intValue() != i12) {
            return null;
        }
        if (C46392a.m102322d(ISpotService.f49646a.get().mo59987D(), false)) {
            return "B4tradingIsolated";
        }
        return "B4tradingCross";
    }
}
