package com.kubi.spot.kline.flutter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.blankj.utilcode.util.C5286o;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.MarketTicker;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.flutter.proto.kline.AlertClickType;
import com.kubi.flutter.proto.kline.ChangeToolBarModeEvent;
import com.kubi.flutter.proto.kline.ConfirmAlerEvent;
import com.kubi.flutter.proto.kline.PaintFromType;
import com.kubi.flutter.proto.kline.PaintGuideEvent;
import com.kubi.flutter.proto.kline.ToastEvent;
import com.kubi.flutter.proto.kline.ToolBarClick;
import com.kubi.network.websocket.model.Message;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.UpDownTextView;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$array;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.kline.KuCoinKlineFragment;
import com.kubi.tradebase.business.klineSettings.KLineSettingConfig;
import com.kubi.tradebase.view.kline.KLineIndicatorView;
import com.kubi.tradebase.view.kline.KLineToolBarView;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import e20.InterfaceC37053d;
import g10.C37787r;
import g10.InterfaceC37770a;
import gf.C37878b0;
import gf.C37886j;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.PublishSubject;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import mr.C42597a;
import n30.C42727c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38190h;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
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
import q30.C43604d;
import ro.C44128b;
import w00.C45678b;
import w20.C45700a;

/* JADX INFO: compiled from: SpotFlutterKlineLandscapeActivity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001GB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010#\u001a\u00020$H\u0014J\n\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0012\u0010:\u001a\u00020\u00132\b\u0010;\u001a\u0004\u0018\u00010<H\u0014J\b\u0010=\u001a\u00020\u0013H\u0014J\u000f\u0010>\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0002\u0010?J\u000f\u0010@\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0002\u0010?J\b\u0010A\u001a\u00020\u0013H\u0002J\b\u0010B\u001a\u00020\u0013H\u0002J\b\u0010C\u001a\u00020\u0013H\u0002J\b\u0010D\u001a\u00020\u0013H\u0002J\b\u0010E\u001a\u00020)H\u0016J\b\u0010F\u001a\u00020$H\u0016R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010(\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0011\u001a\u0004\b*\u0010+R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0011\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0011\u001a\u0004\b2\u00103R\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0011\u001a\u0004\b7\u00108¨\u0006H"}, m90084d2 = {"Lcom/kubi/spot/kline/flutter/SpotFlutterKlineLandscapeActivity;", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "Lcom/kubi/sdk/websocket/IWsDataGetter;", "Lcom/kubi/spot/kline/KuCoinKlineFragment$IKlineFragmentProvider;", "<init>", "()V", "binding", "Lcom/kubi/tradebase/databinding/BtradebaseActivityKlineLanBinding;", "getBinding", "()Lcom/kubi/tradebase/databinding/BtradebaseActivityKlineLanBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "helper", "Lcom/kubi/tradebase/helper/KLineHelper;", "getHelper", "()Lcom/kubi/tradebase/helper/KLineHelper;", "helper$delegate", "Lkotlin/Lazy;", "getRestfulData", "", "resetWs", "", "subscribe", "Lio/reactivex/disposables/Disposable;", "registerWsData", "onViewHideOrShow", TIMPushProvider.f75062n, "tradeApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getTradeApi", "()Lcom/kubi/spot/api/MarketApi;", "tradeApi$delegate", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "getLayout", "", "initNavigationBar", "", "lastPosition", "mTradeBean", "Lcom/kubi/data/entity/TradeItemBean;", "getMTradeBean", "()Lcom/kubi/data/entity/TradeItemBean;", "mTradeBean$delegate", "klineSettingConfig", "Lcom/kubi/tradebase/business/klineSettings/KLineSettingConfig;", "getKlineSettingConfig", "()Lcom/kubi/tradebase/business/klineSettings/KLineSettingConfig;", "klineSettingConfig$delegate", "isFrom", "()Z", "isFrom$delegate", "klineChatFragment", "Lcom/kubi/spot/kline/flutter/SpotFlutterKlineFragment;", "getKlineChatFragment", "()Lcom/kubi/spot/kline/flutter/SpotFlutterKlineFragment;", "klineChatFragment$delegate", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "getMainIdByPosition", "()Ljava/lang/Integer;", "getNoMainIdByPosition", "initData", "initListener", "bindEvent", "enterDrawEditState", "getTradeBean", "getPrecision", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotFlutterKlineLandscapeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotFlutterKlineLandscapeActivity.kt\ncom/kubi/spot/kline/flutter/SpotFlutterKlineLandscapeActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n+ 6 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 7 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,339:1\n49#2,15:340\n1#3:355\n81#4,2:356\n81#4,2:358\n81#4,2:360\n81#4,2:362\n43#5,7:364\n43#5,7:380\n58#6,6:371\n64#6,2:378\n126#7:377\n*S KotlinDebug\n*F\n+ 1 SpotFlutterKlineLandscapeActivity.kt\ncom/kubi/spot/kline/flutter/SpotFlutterKlineLandscapeActivity\n*L\n64#1:340,15\n297#1:356,2\n302#1:358,2\n311#1:360,2\n321#1:362,2\n82#1:364,7\n98#1:380,7\n92#1:371,6\n92#1:378,2\n92#1:377\n*E\n"})
public final class SpotFlutterKlineLandscapeActivity extends BaseUiActivity implements InterfaceC37770a, KuCoinKlineFragment.InterfaceC25353a {

    /* JADX INFO: renamed from: A */
    public int f50668A;

    /* JADX INFO: renamed from: x */
    @Nullable
    public Disposable f50675x;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ KProperty<Object>[] f50667G = {Reflection.property1(new PropertyReference1Impl(SpotFlutterKlineLandscapeActivity.class, "binding", "getBinding()Lcom/kubi/tradebase/databinding/BtradebaseActivityKlineLanBinding;", 0))};

    /* JADX INFO: renamed from: F */
    @NotNull
    public static final Companion f50666F = new Companion(null);

    /* JADX INFO: renamed from: v */
    @NotNull
    public final InterfaceC24293a f50673v = C45678b.m100788b(this, new Function1<C42727c, Unit>() { // from class: com.kubi.spot.kline.flutter.SpotFlutterKlineLandscapeActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C42727c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42727c c42727c) {
            invoke(c42727c);
            return Unit.INSTANCE;
        }
    }, new Function1<SpotFlutterKlineLandscapeActivity, C42727c>() { // from class: com.kubi.spot.kline.flutter.SpotFlutterKlineLandscapeActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42727c invoke(@NotNull SpotFlutterKlineLandscapeActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View view = this.this$0.f46504p;
            Intrinsics.checkNotNullExpressionValue(view, "access$getContentView$p$s2102717189(...)");
            return C42727c.m93625a(view);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: renamed from: w */
    @NotNull
    public final Lazy f50674w = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.flutter.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotFlutterKlineLandscapeActivity.m62065e1();
        }
    });

    /* JADX INFO: renamed from: y */
    @NotNull
    public final Lazy f50676y = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.flutter.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotFlutterKlineLandscapeActivity.m62040E1();
        }
    });

    /* JADX INFO: renamed from: z */
    @NotNull
    public final C37787r f50677z = new C37787r(this);

    /* JADX INFO: renamed from: B */
    @NotNull
    public final Lazy f50669B = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.flutter.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotFlutterKlineLandscapeActivity.m62085r1(this.f50695b);
        }
    });

    /* JADX INFO: renamed from: C */
    @NotNull
    public final Lazy f50670C = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.flutter.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotFlutterKlineLandscapeActivity.m62083q1(this.f50696b);
        }
    });

    /* JADX INFO: renamed from: D */
    @NotNull
    public final Lazy f50671D = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.flutter.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SpotFlutterKlineLandscapeActivity.m62079o1(this.f50697b));
        }
    });

    /* JADX INFO: renamed from: E */
    @NotNull
    public final Lazy f50672E = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.flutter.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotFlutterKlineLandscapeActivity.m62081p1(this.f50698b);
        }
    });

    /* JADX INFO: compiled from: SpotFlutterKlineLandscapeActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/spot/kline/flutter/SpotFlutterKlineLandscapeActivity$Companion;", "", "<init>", "()V", "KLINE_CATEGORY", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.flutter.SpotFlutterKlineLandscapeActivity$a */
    /* JADX INFO: compiled from: SpotFlutterKlineLandscapeActivity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25379a implements Function0<Unit> {
        public C25379a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m62103a() {
            SpotFlutterKlineLandscapeActivity.this.m62100U0().m62029w3(AlertClickType.CONFIRM);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m62103a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.flutter.SpotFlutterKlineLandscapeActivity$b */
    /* JADX INFO: compiled from: SpotFlutterKlineLandscapeActivity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25380b implements Function0<Unit> {
        public C25380b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m62104a() {
            SpotFlutterKlineLandscapeActivity.this.m62100U0().m62029w3(AlertClickType.CANCEL);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m62104a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.flutter.SpotFlutterKlineLandscapeActivity$c */
    /* JADX INFO: compiled from: SpotFlutterKlineLandscapeActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/spot/kline/flutter/SpotFlutterKlineLandscapeActivity$initListener$1", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "onTabUnselected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabReselected", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25385c implements TabLayout.OnTabSelectedListener {
        public C25385c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            if (SpotFlutterKlineLandscapeActivity.this.f50668A == tab.getPosition()) {
                return;
            }
            SpotFlutterKlineLandscapeActivity.this.f50668A = tab.getPosition();
            C37878b0.f85252a.m85538s(SpotFlutterKlineLandscapeActivity.this.f50668A);
            SpotFlutterKlineLandscapeActivity.this.m62100U0().m62028v3(SpotFlutterKlineLandscapeActivity.this.f50668A);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.flutter.SpotFlutterKlineLandscapeActivity$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25386d extends TypeToken<WsMarketSnapshotEntity> {
    }

    @Nullable
    /* JADX INFO: renamed from: m1 */
    public Void m62101m1() {
        return null;
    }

    /* JADX INFO: renamed from: A1 */
    public static final boolean m62033A1(SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TradeItemBean tradeItemBeanM62057W0 = spotFlutterKlineLandscapeActivity.m62057W0();
        String str = String.format("/market/snapshot_app:%s", Arrays.copyOf(new Object[]{C27041f.m66668h(tradeItemBeanM62057W0 != null ? tradeItemBeanM62057W0.getSymbol() : null)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return Intrinsics.areEqual(str, it.getTopic());
    }

    /* JADX INFO: renamed from: B1 */
    public static final boolean m62035B1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: C1 */
    public static final WsMarketSnapshotEntity m62037C1(Message s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        Object objM66914d = null;
        if (s11.getData() != null && !TextUtils.isEmpty(s11.getData())) {
            try {
                String data = s11.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data, new C25386d().getType());
            } catch (Throwable unused) {
            }
        }
        return (WsMarketSnapshotEntity) objM66914d;
    }

    /* JADX INFO: renamed from: D1 */
    public static final WsMarketSnapshotEntity m62038D1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (WsMarketSnapshotEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m62052Q0() {
        String name = ChangeToolBarModeEvent.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            name.length();
        }
        C12572a.m23692a(this, true, new C25381xbb224125(name, null, this));
        String name2 = ConfirmAlerEvent.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        if (c12573b.m23696a()) {
            name2.length();
        }
        C12572a.m23692a(this, true, new C25382xbb224126(name2, null, this));
        String name3 = PaintGuideEvent.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
        if (c12573b.m23696a()) {
            name3.length();
        }
        C12572a.m23692a(this, true, new C25383xbb224127(name3, null, this));
        String name4 = ToastEvent.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
        if (c12573b.m23696a()) {
            name4.length();
        }
        C12572a.m23692a(this, true, new C25384xbb224128(name4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public final C42727c m62054S0() {
        return (C42727c) this.f50673v.getValue(this, f50667G[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public final C43604d m62055T0() {
        return (C43604d) this.f50674w.getValue();
    }

    /* JADX INFO: renamed from: V0 */
    private final KLineSettingConfig m62056V0() {
        return (KLineSettingConfig) this.f50670C.getValue();
    }

    /* JADX INFO: renamed from: W0 */
    private final TradeItemBean m62057W0() {
        return (TradeItemBean) this.f50669B.getValue();
    }

    /* JADX INFO: renamed from: X0 */
    private final Integer m62058X0() {
        int iM85525f = C37878b0.f85252a.m85525f();
        if (iM85525f == 0) {
            return Integer.valueOf(R$id.tv_kline_ma);
        }
        if (iM85525f == 1) {
            return Integer.valueOf(R$id.tv_kline_ema);
        }
        if (iM85525f != 2) {
            return null;
        }
        return Integer.valueOf(R$id.tv_kline_boll);
    }

    /* JADX INFO: renamed from: Y0 */
    private final Integer m62059Y0() {
        int iM85526g = C37878b0.f85252a.m85526g();
        if (iM85526g == 0) {
            return Integer.valueOf(R$id.tv_kline_macd);
        }
        if (iM85526g == 1) {
            return Integer.valueOf(R$id.tv_kline_kdj);
        }
        if (iM85526g != 2) {
            return null;
        }
        return Integer.valueOf(R$id.tv_kline_rsi);
    }

    /* JADX INFO: renamed from: d1 */
    private final InterfaceC37053d m62064d1() {
        return (InterfaceC37053d) this.f50676y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final C43604d m62065e1() {
        return new C43604d();
    }

    /* JADX INFO: renamed from: f1 */
    private final void m62066f1() {
        ShowHideTextView showHideTextView;
        MarketTicker marketTicker;
        Double low;
        ShowHideTextView showHideTextView2;
        String strM85579c;
        MarketTicker marketTicker2;
        Double high;
        ShowHideTextView showHideTextView3;
        String strM85579c2;
        MarketTicker marketTicker3;
        Double value;
        UpDownTextView upDownTextView;
        MarketTicker marketTicker4;
        MarketTicker marketTicker5;
        ShowHideTextView showHideTextView4;
        String strM89950x;
        MarketTicker marketTicker6;
        Double lastDealPrice;
        SymbolInfoEntity symbolInfoEntity;
        UpDownTextView upDownTextView2;
        String strM85579c3;
        MarketTicker marketTicker7;
        MarketTicker marketTicker8;
        MarketTicker marketTicker9;
        Double lastDealPrice2;
        BaseTextView baseTextView;
        SymbolInfoEntity symbolInfoEntity2;
        BaseTextView baseTextView2;
        C42727c c42727cM62054S0 = m62054S0();
        String strM85579c4 = null;
        if (c42727cM62054S0 != null && (baseTextView2 = c42727cM62054S0.f94592t) != null) {
            TradeItemBean tradeItemBeanM62057W0 = m62057W0();
            baseTextView2.setText(tradeItemBeanM62057W0 != null ? tradeItemBeanM62057W0.getShowSymbol() : null);
        }
        C42727c c42727cM62054S1 = m62054S0();
        if (c42727cM62054S1 != null && (baseTextView = c42727cM62054S1.f94582j) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(R$string.deal_vol_24h));
            sb2.append('(');
            TradeItemBean tradeItemBeanM62057W1 = m62057W0();
            sb2.append(C27041f.m66668h((tradeItemBeanM62057W1 == null || (symbolInfoEntity2 = tradeItemBeanM62057W1.getSymbolInfoEntity()) == null) ? null : symbolInfoEntity2.getQuoteCurrency()));
            sb2.append(')');
            baseTextView.setText(sb2.toString());
        }
        C42727c c42727cM62054S2 = m62054S0();
        if (c42727cM62054S2 != null && (upDownTextView2 = c42727cM62054S2.f94591s) != null) {
            TradeItemBean tradeItemBeanM62057W2 = m62057W0();
            if (tradeItemBeanM62057W2 == null || (marketTicker9 = tradeItemBeanM62057W2.marketTicker) == null || (lastDealPrice2 = marketTicker9.getLastDealPrice()) == null) {
                strM85579c3 = null;
            } else {
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(lastDealPrice2.doubleValue()));
                TradeItemBean tradeItemBeanM62057W3 = m62057W0();
                strM85579c3 = C37886j.m85579c(bigDecimal, tradeItemBeanM62057W3 != null ? tradeItemBeanM62057W3.getSymbol() : null, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            }
            String strM66669i = C27041f.m66669i(strM85579c3, "--");
            TradeItemBean tradeItemBeanM62057W4 = m62057W0();
            Double lastDealPrice3 = (tradeItemBeanM62057W4 == null || (marketTicker8 = tradeItemBeanM62057W4.marketTicker) == null) ? null : marketTicker8.getLastDealPrice();
            Context mContext = this.f46505q;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            TradeItemBean tradeItemBeanM62057W5 = m62057W0();
            upDownTextView2.m54918f(strM66669i, lastDealPrice3, C22890g.m54279d(mContext, C27039d.m66646f((tradeItemBeanM62057W5 == null || (marketTicker7 = tradeItemBeanM62057W5.marketTicker) == null) ? null : marketTicker7.getChangeRate()), 0, 2, null));
        }
        C42727c c42727cM62054S3 = m62054S0();
        if (c42727cM62054S3 != null && (showHideTextView4 = c42727cM62054S3.f94583k) != null) {
            TradeItemBean tradeItemBeanM62057W6 = m62057W0();
            if (tradeItemBeanM62057W6 == null || (marketTicker6 = tradeItemBeanM62057W6.marketTicker) == null || (lastDealPrice = marketTicker6.getLastDealPrice()) == null) {
                strM89950x = null;
            } else {
                double dDoubleValue = lastDealPrice.doubleValue();
                TradeItemBean tradeItemBeanM62057W7 = m62057W0();
                strM89950x = C41014a.m89950x(C41014a.m89939m(dDoubleValue, (tradeItemBeanM62057W7 == null || (symbolInfoEntity = tradeItemBeanM62057W7.getSymbolInfoEntity()) == null) ? null : symbolInfoEntity.getQuoteCurrency()), null, null, 0, false, true, true, false, 79, null);
            }
            showHideTextView4.setText(C27041f.m66669i(strM89950x, "--"));
        }
        C42727c c42727cM62054S4 = m62054S0();
        if (c42727cM62054S4 != null && (upDownTextView = c42727cM62054S4.f94585m) != null) {
            TradeItemBean tradeItemBeanM62057W8 = m62057W0();
            Double changeRate = (tradeItemBeanM62057W8 == null || (marketTicker5 = tradeItemBeanM62057W8.marketTicker) == null) ? null : marketTicker5.getChangeRate();
            Context mContext2 = this.f46505q;
            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
            TradeItemBean tradeItemBeanM62057W9 = m62057W0();
            upDownTextView.m54919g(changeRate, C22890g.m54279d(mContext2, C27039d.m66646f((tradeItemBeanM62057W9 == null || (marketTicker4 = tradeItemBeanM62057W9.marketTicker) == null) ? null : marketTicker4.getChangeRate()), 0, 2, null));
        }
        C42727c c42727cM62054S5 = m62054S0();
        if (c42727cM62054S5 != null && (showHideTextView3 = c42727cM62054S5.f94584l) != null) {
            TradeItemBean tradeItemBeanM62057W10 = m62057W0();
            if (tradeItemBeanM62057W10 == null || (marketTicker3 = tradeItemBeanM62057W10.marketTicker) == null || (value = marketTicker3.getValue()) == null) {
                strM85579c2 = null;
            } else {
                BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(value.doubleValue()));
                TradeItemBean tradeItemBeanM62057W11 = m62057W0();
                strM85579c2 = C37886j.m85579c(bigDecimal2, tradeItemBeanM62057W11 != null ? tradeItemBeanM62057W11.getSymbol() : null, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            }
            showHideTextView3.setText(C27041f.m66669i(strM85579c2, "--"));
        }
        C42727c c42727cM62054S6 = m62054S0();
        if (c42727cM62054S6 != null && (showHideTextView2 = c42727cM62054S6.f94587o) != null) {
            TradeItemBean tradeItemBeanM62057W12 = m62057W0();
            if (tradeItemBeanM62057W12 == null || (marketTicker2 = tradeItemBeanM62057W12.marketTicker) == null || (high = marketTicker2.getHigh()) == null) {
                strM85579c = null;
            } else {
                BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(high.doubleValue()));
                TradeItemBean tradeItemBeanM62057W13 = m62057W0();
                strM85579c = C37886j.m85579c(bigDecimal3, tradeItemBeanM62057W13 != null ? tradeItemBeanM62057W13.getSymbol() : null, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            }
            showHideTextView2.setText(C27041f.m66669i(strM85579c, "--"));
        }
        C42727c c42727cM62054S7 = m62054S0();
        if (c42727cM62054S7 == null || (showHideTextView = c42727cM62054S7.f94589q) == null) {
            return;
        }
        TradeItemBean tradeItemBeanM62057W14 = m62057W0();
        if (tradeItemBeanM62057W14 != null && (marketTicker = tradeItemBeanM62057W14.marketTicker) != null && (low = marketTicker.getLow()) != null) {
            BigDecimal bigDecimal4 = new BigDecimal(String.valueOf(low.doubleValue()));
            TradeItemBean tradeItemBeanM62057W15 = m62057W0();
            strM85579c4 = C37886j.m85579c(bigDecimal4, tradeItemBeanM62057W15 != null ? tradeItemBeanM62057W15.getSymbol() : null, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
        }
        showHideTextView.setText(C27041f.m66669i(strM85579c4, "--"));
    }

    /* JADX INFO: renamed from: k1 */
    public static final void m62072k1(SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity, ToolBarClick.ToolBarItemType toolBarItemType) {
        KLineToolBarView kLineToolBarView;
        KLineIndicatorView kLineIndicatorView;
        if (toolBarItemType == ToolBarClick.ToolBarItemType.BAR_ITEM_Exit) {
            if (spotFlutterKlineLandscapeActivity.m62077n1()) {
                spotFlutterKlineLandscapeActivity.preformBackPressed();
            } else {
                C42727c c42727cM62054S0 = spotFlutterKlineLandscapeActivity.m62054S0();
                if (c42727cM62054S0 != null && (kLineIndicatorView = c42727cM62054S0.f94578f) != null) {
                    ViewExtKt.m66594y(kLineIndicatorView);
                }
                C42727c c42727cM62054S1 = spotFlutterKlineLandscapeActivity.m62054S0();
                if (c42727cM62054S1 != null && (kLineToolBarView = c42727cM62054S1.f94581i) != null) {
                    ViewExtKt.m66577h(kLineToolBarView);
                }
            }
        }
        SpotFlutterKlineFragment spotFlutterKlineFragmentM62100U0 = spotFlutterKlineLandscapeActivity.m62100U0();
        Intrinsics.checkNotNull(toolBarItemType);
        spotFlutterKlineFragmentM62100U0.m62024r3(toolBarItemType);
    }

    /* JADX INFO: renamed from: n1 */
    private final boolean m62077n1() {
        return ((Boolean) this.f50671D.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: p1 */
    public static final SpotFlutterKlineFragment m62081p1(SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity) {
        SymbolInfoEntity symbolInfoEntity;
        SpotFlutterKlineFragment.Companion companion = SpotFlutterKlineFragment.f50664Y;
        TradeItemBean tradeItemBeanM62057W0 = spotFlutterKlineLandscapeActivity.m62057W0();
        Integer numValueOf = null;
        String strM66668h = C27041f.m66668h(tradeItemBeanM62057W0 != null ? tradeItemBeanM62057W0.getSymbol() : null);
        int iM85523d = C37878b0.f85252a.m85523d();
        TradeItemBean tradeItemBeanM62057W1 = spotFlutterKlineLandscapeActivity.m62057W0();
        if (tradeItemBeanM62057W1 != null && (symbolInfoEntity = tradeItemBeanM62057W1.getSymbolInfoEntity()) != null) {
            numValueOf = Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision());
        }
        return companion.newInstance(strM66668h, iM85523d, C27039d.m66651k(numValueOf, 8));
    }

    /* JADX INFO: renamed from: u1 */
    public static final void m62090u1(final SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity) {
        Disposable disposable = spotFlutterKlineLandscapeActivity.f50675x;
        if (disposable != null) {
            disposable.dispose();
        }
        C37787r c37787r = spotFlutterKlineLandscapeActivity.f50677z;
        TradeItemBean tradeItemBeanM62057W0 = spotFlutterKlineLandscapeActivity.m62057W0();
        PublishSubject<Message> publishSubjectM85233f = c37787r.m85233f("/market/snapshot_app:%s", C27041f.m66668h(tradeItemBeanM62057W0 != null ? tradeItemBeanM62057W0.getSymbol() : null));
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.kline.flutter.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SpotFlutterKlineLandscapeActivity.m62033A1(this.f50689b, (Message) obj));
            }
        };
        Observable<Message> observableFilter = publishSubjectM85233f.filter(new Predicate() { // from class: com.kubi.spot.kline.flutter.j
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return SpotFlutterKlineLandscapeActivity.m62035B1(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.kline.flutter.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotFlutterKlineLandscapeActivity.m62037C1((Message) obj);
            }
        };
        Observable observableObserveOn = observableFilter.map(new Function() { // from class: com.kubi.spot.kline.flutter.m
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SpotFlutterKlineLandscapeActivity.m62038D1(function2, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.kline.flutter.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotFlutterKlineLandscapeActivity.m62092v1(this.f50692b, (WsMarketSnapshotEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.kline.flutter.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SpotFlutterKlineLandscapeActivity.m62094w1(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.spot.kline.flutter.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotFlutterKlineLandscapeActivity.m62096x1((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.kline.flutter.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SpotFlutterKlineLandscapeActivity.m62098y1(function4, obj);
            }
        });
        spotFlutterKlineLandscapeActivity.f50675x = disposableSubscribe;
        spotFlutterKlineLandscapeActivity.m56593T(disposableSubscribe);
    }

    /* JADX INFO: renamed from: U0 */
    public final SpotFlutterKlineFragment m62100U0() {
        return (SpotFlutterKlineFragment) this.f50672E.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.btradebase_activity_kline_lan;
    }

    /* JADX INFO: renamed from: t1 */
    public void m62102t1() throws Exception {
        this.f50677z.m85234g(new Action() { // from class: com.kubi.spot.kline.flutter.h
            @Override // io.reactivex.functions.Action
            public final void run() {
                SpotFlutterKlineLandscapeActivity.m62090u1(this.f50688b);
            }
        });
    }

    /* JADX INFO: renamed from: E1 */
    public static final InterfaceC37053d m62040E1() {
        return (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
    }

    /* JADX INFO: renamed from: R0 */
    private final void m62053R0() {
        KLineToolBarView kLineToolBarView;
        KLineIndicatorView kLineIndicatorView;
        C42727c c42727cM62054S0 = m62054S0();
        if (c42727cM62054S0 != null && (kLineIndicatorView = c42727cM62054S0.f94578f) != null) {
            ViewExtKt.m66577h(kLineIndicatorView);
        }
        C42727c c42727cM62054S1 = m62054S0();
        if (c42727cM62054S1 != null && (kLineToolBarView = c42727cM62054S1.f94581i) != null) {
            ViewExtKt.m66594y(kLineToolBarView);
        }
        m62100U0().m62024r3(ToolBarClick.ToolBarItemType.BAR_ITEM_Enter);
    }

    /* JADX INFO: renamed from: Z0 */
    public static final Unit m62060Z0(SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity, MarketTicker marketTicker) {
        TradeItemBean tradeItemBeanM62057W0 = spotFlutterKlineLandscapeActivity.m62057W0();
        if (tradeItemBeanM62057W0 != null) {
            tradeItemBeanM62057W0.marketTicker = marketTicker;
        }
        spotFlutterKlineLandscapeActivity.m62066f1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a1 */
    public static final void m62061a1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b1 */
    public static final Unit m62062b1(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C45700a.m100877c(th2, "kline");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final void m62063c1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g1 */
    private final void m62067g1() {
        KLineToolBarView kLineToolBarView;
        KLineToolBarView kLineToolBarView2;
        KLineIndicatorView kLineIndicatorView;
        KLineIndicatorView kLineIndicatorView2;
        KLineIndicatorView kLineIndicatorView3;
        TabLayout tabLayout;
        C42727c c42727cM62054S0 = m62054S0();
        if (c42727cM62054S0 != null && (tabLayout = c42727cM62054S0.f94580h) != null) {
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C25385c());
        }
        C42727c c42727cM62054S1 = m62054S0();
        if (c42727cM62054S1 != null && (kLineIndicatorView3 = c42727cM62054S1.f94578f) != null) {
            kLineIndicatorView3.m63421l(new Consumer() { // from class: com.kubi.spot.kline.flutter.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpotFlutterKlineLandscapeActivity.m62068h1(this.f50683b, (Integer) obj);
                }
            });
        }
        C42727c c42727cM62054S2 = m62054S0();
        if (c42727cM62054S2 != null && (kLineIndicatorView2 = c42727cM62054S2.f94578f) != null) {
            kLineIndicatorView2.m63422p(new Consumer() { // from class: com.kubi.spot.kline.flutter.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpotFlutterKlineLandscapeActivity.m62069i1(this.f50684b, (Integer) obj);
                }
            });
        }
        C42727c c42727cM62054S3 = m62054S0();
        if (c42727cM62054S3 != null && (kLineIndicatorView = c42727cM62054S3.f94578f) != null) {
            kLineIndicatorView.m63418h(new Action() { // from class: com.kubi.spot.kline.flutter.e
                @Override // io.reactivex.functions.Action
                public final void run() {
                    SpotFlutterKlineLandscapeActivity.m62070j1(this.f50685b);
                }
            });
        }
        C42727c c42727cM62054S4 = m62054S0();
        if (c42727cM62054S4 != null && (kLineToolBarView2 = c42727cM62054S4.f94581i) != null) {
            kLineToolBarView2.m63439k(new Consumer() { // from class: com.kubi.spot.kline.flutter.f
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpotFlutterKlineLandscapeActivity.m62072k1(this.f50686b, (ToolBarClick.ToolBarItemType) obj);
                }
            });
        }
        C42727c c42727cM62054S5 = m62054S0();
        if (c42727cM62054S5 != null && (kLineToolBarView = c42727cM62054S5.f94581i) != null) {
            kLineToolBarView.m63438i(new Consumer() { // from class: com.kubi.spot.kline.flutter.g
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpotFlutterKlineLandscapeActivity.m62074l1(this.f50687b, (ToolBarClick.ToolBarItemType) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h1 */
    public static final void m62068h1(SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity, Integer num) {
        SpotFlutterKlineFragment spotFlutterKlineFragmentM62100U0 = spotFlutterKlineLandscapeActivity.m62100U0();
        Intrinsics.checkNotNull(num);
        spotFlutterKlineFragmentM62100U0.m62026t3(num.intValue());
    }

    /* JADX INFO: renamed from: i1 */
    public static final void m62069i1(SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity, Integer num) {
        SpotFlutterKlineFragment spotFlutterKlineFragmentM62100U0 = spotFlutterKlineLandscapeActivity.m62100U0();
        Intrinsics.checkNotNull(num);
        spotFlutterKlineFragmentM62100U0.m62027u3(num.intValue());
    }

    /* JADX INFO: renamed from: j1 */
    public static final void m62070j1(SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity) {
        spotFlutterKlineLandscapeActivity.m62053R0();
    }

    /* JADX INFO: renamed from: l1 */
    public static final void m62074l1(SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity, ToolBarClick.ToolBarItemType toolBarItemType) {
        KLineToolBarView kLineToolBarView;
        KLineIndicatorView kLineIndicatorView;
        if (spotFlutterKlineLandscapeActivity.m62077n1()) {
            spotFlutterKlineLandscapeActivity.preformBackPressed();
            return;
        }
        C42727c c42727cM62054S0 = spotFlutterKlineLandscapeActivity.m62054S0();
        if (c42727cM62054S0 != null && (kLineIndicatorView = c42727cM62054S0.f94578f) != null) {
            ViewExtKt.m66594y(kLineIndicatorView);
        }
        C42727c c42727cM62054S1 = spotFlutterKlineLandscapeActivity.m62054S0();
        if (c42727cM62054S1 != null && (kLineToolBarView = c42727cM62054S1.f94581i) != null) {
            ViewExtKt.m66577h(kLineToolBarView);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public static final boolean m62079o1(SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity) {
        return spotFlutterKlineLandscapeActivity.getIntent().getBooleanExtra("isFrom", false);
    }

    /* JADX INFO: renamed from: q1 */
    public static final KLineSettingConfig m62083q1(SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity) {
        KLineSettingConfig kLineSettingConfig = (KLineSettingConfig) spotFlutterKlineLandscapeActivity.getIntent().getParcelableExtra("data_4");
        if (kLineSettingConfig == null) {
            return new KLineSettingConfig(false, false, 3, null);
        }
        return kLineSettingConfig;
    }

    /* JADX INFO: renamed from: r1 */
    public static final TradeItemBean m62085r1(SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity) {
        return (TradeItemBean) spotFlutterKlineLandscapeActivity.getIntent().getParcelableExtra("data");
    }

    /* JADX INFO: renamed from: s1 */
    public static final Unit m62087s1(SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity) {
        spotFlutterKlineLandscapeActivity.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v1 */
    public static final Unit m62092v1(SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity, WsMarketSnapshotEntity wsMarketSnapshotEntity) {
        TradeItemBean tradeItemBeanM62057W0 = spotFlutterKlineLandscapeActivity.m62057W0();
        if (tradeItemBeanM62057W0 != null) {
            MarketTicker marketTickerConvertToMarketTicker = null;
            if (wsMarketSnapshotEntity != null) {
                TradeItemBean tradeItemBeanM62057W1 = spotFlutterKlineLandscapeActivity.m62057W0();
                if (tradeItemBeanM62057W1 != null) {
                    marketTickerConvertToMarketTicker = tradeItemBeanM62057W1.marketTicker;
                }
                marketTickerConvertToMarketTicker = wsMarketSnapshotEntity.convertToMarketTicker(marketTickerConvertToMarketTicker);
            }
            tradeItemBeanM62057W0.marketTicker = marketTickerConvertToMarketTicker;
        }
        spotFlutterKlineLandscapeActivity.m62066f1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w1 */
    public static final void m62094w1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x1 */
    public static final Unit m62096x1(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C45700a.m100877c(th2, "kline");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y1 */
    public static final void m62098y1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // com.kubi.spot.kline.KuCoinKlineFragment.InterfaceC25353a
    @NotNull
    /* JADX INFO: renamed from: D0 */
    public TradeItemBean getF49727V() {
        TradeItemBean tradeItemBeanM62057W0 = m62057W0();
        if (tradeItemBeanM62057W0 == null) {
            return new TradeItemBean();
        }
        return tradeItemBeanM62057W0;
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ /* synthetic */ View mo32393c0() {
        return (View) m62101m1();
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: f0 */
    public void mo38439f0(boolean z11) throws Exception {
        super.mo38439f0(z11);
        if (z11) {
            mo22379g(true);
        } else {
            this.f50677z.m85236i(z11);
        }
    }

    @Override // g10.InterfaceC37770a
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: g */
    public void mo22379g(boolean z11) throws Exception {
        String symbol;
        if (isFinishing()) {
            return;
        }
        if (z11) {
            m62102t1();
        }
        InterfaceC37053d interfaceC37053dM62064d1 = m62064d1();
        TradeItemBean tradeItemBeanM62057W0 = m62057W0();
        if (tradeItemBeanM62057W0 != null) {
            symbol = tradeItemBeanM62057W0.getSymbol();
        } else {
            symbol = null;
        }
        Observable<R> observableCompose = interfaceC37053dM62064d1.m82952t(C27041f.m66668h(symbol)).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.kline.flutter.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotFlutterKlineLandscapeActivity.m62060Z0(this.f50699b, (MarketTicker) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.kline.flutter.w
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SpotFlutterKlineLandscapeActivity.m62061a1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.kline.flutter.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotFlutterKlineLandscapeActivity.m62062b1((Throwable) obj);
            }
        };
        observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.kline.flutter.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SpotFlutterKlineLandscapeActivity.m62063c1(function2, obj);
            }
        });
    }

    @Override // com.kubi.spot.kline.KuCoinKlineFragment.InterfaceC25353a
    public int getPrecision() {
        Integer numValueOf;
        SymbolInfoEntity symbolInfoEntity;
        TradeItemBean tradeItemBeanM62057W0 = m62057W0();
        if (tradeItemBeanM62057W0 != null && (symbolInfoEntity = tradeItemBeanM62057W0.getSymbolInfoEntity()) != null) {
            numValueOf = Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision());
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        ImageView imageView;
        TabLayout tabLayout;
        TabLayout.Tab tabAt;
        TabLayout tabLayout2;
        TabLayout.Tab tabNewTab;
        TabLayout.Tab text;
        C42727c c42727cM62054S0;
        TabLayout tabLayout3;
        super.onCreate(savedInstanceState);
        EdgeToEdgeCompat.f48106a.m58273k(this);
        setPageId("B5candleLandscape");
        C42727c c42727cM62054S1 = m62054S0();
        if (c42727cM62054S1 != null && (imageView = c42727cM62054S1.f94579g) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.spot.kline.flutter.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotFlutterKlineLandscapeActivity.m62087s1(this.f50682b);
                }
            }, 1, null);
            if (m62057W0() == null) {
                finish();
                return;
            }
            String[] stringArray = getResources().getStringArray(R$array.kucoin_kline_all_titles);
            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
            List mutableList = ArraysKt.toMutableList(stringArray);
            if (!C38190h.f85888a.m86167l()) {
                CollectionsKt.removeLastOrNull(mutableList);
            }
            int size = mutableList.size();
            for (int i11 = 0; i11 < size; i11++) {
                C42727c c42727cM62054S2 = m62054S0();
                if (c42727cM62054S2 != null && (tabLayout2 = c42727cM62054S2.f94580h) != null && (tabNewTab = tabLayout2.newTab()) != null && (text = tabNewTab.setText((CharSequence) mutableList.get(i11))) != null && (c42727cM62054S0 = m62054S0()) != null && (tabLayout3 = c42727cM62054S0.f94580h) != null) {
                    tabLayout3.addTab(text);
                }
            }
            C5286o.m6317a(getSupportFragmentManager(), m62100U0(), R$id.fl_container);
            m62067g1();
            m62066f1();
            m62052Q0();
            C42727c c42727cM62054S3 = m62054S0();
            if (c42727cM62054S3 != null && (tabLayout = c42727cM62054S3.f94580h) != null && (tabAt = tabLayout.getTabAt(C37878b0.f85252a.m85523d())) != null) {
                tabAt.select();
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        KLineToolBarView kLineToolBarView;
        KLineIndicatorView kLineIndicatorView;
        super.onResume();
        Integer numM62058X0 = m62058X0();
        if (numM62058X0 != null) {
            ((TextView) findViewById(numM62058X0.intValue())).performClick();
        }
        Integer numM62059Y0 = m62059Y0();
        if (numM62059Y0 != null) {
            ((TextView) findViewById(numM62059Y0.intValue())).performClick();
        }
        m62100U0().m62025s3(m62056V0().getShowHistoryOrder());
        m62100U0().m62023q3(m62056V0().getShowActiveOrder());
        C44128b.m97266j("SpotFlutterKlineLandscapeActivity", "changeActiveShow klineSettingConfig:" + m62056V0());
        String symbol = null;
        if (m62077n1() && C38190h.f85888a.m86164i()) {
            m62100U0().m62031y3(PaintFromType.VerticalPaint);
            C42727c c42727cM62054S0 = m62054S0();
            if (c42727cM62054S0 != null && (kLineIndicatorView = c42727cM62054S0.f94578f) != null) {
                ViewExtKt.m66577h(kLineIndicatorView);
            }
            C42727c c42727cM62054S1 = m62054S0();
            if (c42727cM62054S1 != null && (kLineToolBarView = c42727cM62054S1.f94581i) != null) {
                ViewExtKt.m66594y(kLineToolBarView);
            }
        } else {
            SpotFlutterKlineFragment.m62021z3(m62100U0(), null, 1, null);
        }
        TradeItemBean tradeItemBeanM62057W0 = m62057W0();
        if (tradeItemBeanM62057W0 != null) {
            symbol = tradeItemBeanM62057W0.getSymbol();
        }
        C43852m.m96594f("B5candleLandscape", "klineZone", "1", TuplesKt.m90091to("symbol", C27041f.m66668h(symbol)), TuplesKt.m90091to("yesOrNo", Boolean.TRUE));
    }
}
