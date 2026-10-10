package com.kubi.margin.kline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.blankj.utilcode.util.C5286o;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.MarketTicker;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.flutter.proto.kline.AlertClickType;
import com.kubi.flutter.proto.kline.ChangeToolBarModeEvent;
import com.kubi.flutter.proto.kline.ConfirmAlerEvent;
import com.kubi.flutter.proto.kline.PaintFromType;
import com.kubi.flutter.proto.kline.PaintGuideEvent;
import com.kubi.flutter.proto.kline.ToastEvent;
import com.kubi.flutter.proto.kline.ToolBarClick;
import com.kubi.margin.R$array;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.entity.IndexSymbolData;
import com.kubi.margin.entity.WsMarketSnapshotEntity;
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
import com.kubi.tradebase.business.klineSettings.KLineSettingConfig;
import com.kubi.tradebase.view.kline.KLineIndicatorView;
import com.kubi.tradebase.view.kline.KLineToolBarView;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
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
import java.util.ArrayList;
import java.util.List;
import mr.C42597a;
import n30.C42727c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38190h;
import p402kf.C41014a;
import p768xo.InterfaceC46304e;
import p768xo.InterfaceC46307h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import q30.C43604d;
import ro.C44128b;
import w00.C45678b;

/* JADX INFO: compiled from: MarginFlutterKlineLandscapeActivity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010(\u001a\u00020)H\u0014J\n\u0010*\u001a\u0004\u0018\u00010+H\u0014J\u0012\u0010?\u001a\u00020\u00132\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\b\u0010B\u001a\u00020\u0013H\u0014J\u000f\u0010C\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0002\u0010DJ\u000f\u0010E\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0002\u0010DJ\b\u0010F\u001a\u00020\u0013H\u0002J\b\u0010G\u001a\u00020\u0013H\u0002J\b\u0010H\u001a\u00020\u0013H\u0002J\b\u0010I\u001a\u00020\u0013H\u0002J\b\u0010J\u001a\u00020.H\u0016J\b\u0010K\u001a\u00020)H\u0016J\b\u0010L\u001a\u00020\u0015H\u0016J\b\u0010M\u001a\u00020)H\u0016R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b\u001e\u0010\u001fR#\u0010!\u001a\n \u001d*\u0004\u0018\u00010\"0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b#\u0010$R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0011\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0011\u001a\u0004\b4\u00105R\u001b\u00107\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0011\u001a\u0004\b7\u00108R\u001b\u0010:\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u0011\u001a\u0004\b<\u0010=¨\u0006N"}, m90084d2 = {"Lcom/kubi/margin/kline/MarginFlutterKlineLandscapeActivity;", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "Lcom/kubi/sdk/websocket/IWsDataGetter;", "Lcom/kubi/margin/kline/MarginKlineFragment$IKlineFragmentProvider;", "<init>", "()V", "binding", "Lcom/kubi/tradebase/databinding/BtradebaseActivityKlineLanBinding;", "getBinding", "()Lcom/kubi/tradebase/databinding/BtradebaseActivityKlineLanBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "helper", "Lcom/kubi/tradebase/helper/KLineHelper;", "getHelper", "()Lcom/kubi/tradebase/helper/KLineHelper;", "helper$delegate", "Lkotlin/Lazy;", "getRestfulData", "", "resetWs", "", "subscribe", "Lio/reactivex/disposables/Disposable;", "registerWsData", "onViewHideOrShow", TIMPushProvider.f75062n, "tradeApi", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getTradeApi", "()Lcom/kubi/margin/api/MarketApi;", "tradeApi$delegate", "indexApi", "Lcom/kubi/margin/api/IndexApi;", "getIndexApi", "()Lcom/kubi/margin/api/IndexApi;", "indexApi$delegate", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "getLayout", "", "initNavigationBar", "", "lastPosition", "mTradeBean", "Lcom/kubi/data/entity/TradeItemBean;", "getMTradeBean", "()Lcom/kubi/data/entity/TradeItemBean;", "mTradeBean$delegate", "klineSettingConfig", "Lcom/kubi/tradebase/business/klineSettings/KLineSettingConfig;", "getKlineSettingConfig", "()Lcom/kubi/tradebase/business/klineSettings/KLineSettingConfig;", "klineSettingConfig$delegate", "isFrom", "()Z", "isFrom$delegate", "klineChatFragment", "Lcom/kubi/margin/kline/MarginFlutterKlineFragment;", "getKlineChatFragment", "()Lcom/kubi/margin/kline/MarginFlutterKlineFragment;", "klineChatFragment$delegate", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "getMainIdByPosition", "()Ljava/lang/Integer;", "getNoMainIdByPosition", "initData", "initListener", "bindEvent", "enterDrawEditState", "getTradeBean", "getPrecision", "isIndex", "marginTradeType", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginFlutterKlineLandscapeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginFlutterKlineLandscapeActivity.kt\ncom/kubi/margin/kline/MarginFlutterKlineLandscapeActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,381:1\n49#2,15:382\n1#3:397\n81#4,2:398\n81#4,2:400\n81#4,2:402\n81#4,2:404\n160#5,4:406\n160#5,4:410\n*S KotlinDebug\n*F\n+ 1 MarginFlutterKlineLandscapeActivity.kt\ncom/kubi/margin/kline/MarginFlutterKlineLandscapeActivity\n*L\n66#1:382,15\n336#1:398,2\n341#1:400,2\n349#1:402,2\n359#1:404,2\n103#1:406,4\n116#1:410,4\n*E\n"})
public final class MarginFlutterKlineLandscapeActivity extends BaseUiActivity implements InterfaceC37770a, MarginKlineFragment.InterfaceC17697a {

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ KProperty<Object>[] f33088G = {Reflection.property1(new PropertyReference1Impl(MarginFlutterKlineLandscapeActivity.class, "binding", "getBinding()Lcom/kubi/tradebase/databinding/BtradebaseActivityKlineLanBinding;", 0))};

    /* JADX INFO: renamed from: B */
    public int f33090B;

    /* JADX INFO: renamed from: x */
    @Nullable
    public Disposable f33097x;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final InterfaceC24293a f33095v = C45678b.m100788b(this, new Function1<C42727c, Unit>() { // from class: com.kubi.margin.kline.MarginFlutterKlineLandscapeActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C42727c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42727c c42727c) {
            invoke(c42727c);
            return Unit.INSTANCE;
        }
    }, new Function1<MarginFlutterKlineLandscapeActivity, C42727c>() { // from class: com.kubi.margin.kline.MarginFlutterKlineLandscapeActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42727c invoke(@NotNull MarginFlutterKlineLandscapeActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View view = this.this$0.f46504p;
            Intrinsics.checkNotNullExpressionValue(view, "access$getContentView$p$s-2021870119(...)");
            return C42727c.m93625a(view);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: renamed from: w */
    @NotNull
    public final Lazy f33096w = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.kline.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginFlutterKlineLandscapeActivity.m38503B1();
        }
    });

    /* JADX INFO: renamed from: y */
    @NotNull
    public final Lazy f33098y = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.kline.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginFlutterKlineLandscapeActivity.m38567k2();
        }
    });

    /* JADX INFO: renamed from: z */
    @NotNull
    public final Lazy f33099z = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.kline.i0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginFlutterKlineLandscapeActivity.m38505C1();
        }
    });

    /* JADX INFO: renamed from: A */
    @NotNull
    public final C37787r f33089A = new C37787r(this);

    /* JADX INFO: renamed from: C */
    @NotNull
    public final Lazy f33091C = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.kline.j0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginFlutterKlineLandscapeActivity.m38529Q1(this.f33146b);
        }
    });

    /* JADX INFO: renamed from: D */
    @NotNull
    public final Lazy f33092D = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.kline.k0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginFlutterKlineLandscapeActivity.m38527P1(this.f33149b);
        }
    });

    /* JADX INFO: renamed from: E */
    @NotNull
    public final Lazy f33093E = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.kline.l0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(MarginFlutterKlineLandscapeActivity.m38523N1(this.f33152b));
        }
    });

    /* JADX INFO: renamed from: F */
    @NotNull
    public final Lazy f33094F = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.kline.m0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginFlutterKlineLandscapeActivity.m38525O1(this.f33154b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.margin.kline.MarginFlutterKlineLandscapeActivity$a */
    /* JADX INFO: compiled from: MarginFlutterKlineLandscapeActivity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17686a implements Function0<Unit> {
        public C17686a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m38604a() {
            MarginFlutterKlineLandscapeActivity.this.m38602k1().m38498w3(AlertClickType.CONFIRM);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m38604a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.kline.MarginFlutterKlineLandscapeActivity$b */
    /* JADX INFO: compiled from: MarginFlutterKlineLandscapeActivity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17687b implements Function0<Unit> {
        public C17687b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m38605a() {
            MarginFlutterKlineLandscapeActivity.this.m38602k1().m38498w3(AlertClickType.CANCEL);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m38605a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.kline.MarginFlutterKlineLandscapeActivity$c */
    /* JADX INFO: compiled from: MarginFlutterKlineLandscapeActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/margin/kline/MarginFlutterKlineLandscapeActivity$initListener$1", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "onTabUnselected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabReselected", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17692c implements TabLayout.OnTabSelectedListener {
        public C17692c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            if (MarginFlutterKlineLandscapeActivity.this.f33090B == tab.getPosition()) {
                return;
            }
            MarginFlutterKlineLandscapeActivity.this.f33090B = tab.getPosition();
            C37878b0 c37878b0 = C37878b0.f85252a;
            c37878b0.m85538s(MarginFlutterKlineLandscapeActivity.this.f33090B);
            MarginFlutterKlineLandscapeActivity.this.m38602k1().m38497v3(c37878b0.m85523d());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.kline.MarginFlutterKlineLandscapeActivity$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C17693d extends TypeToken<IndexSymbolData> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.kline.MarginFlutterKlineLandscapeActivity$e */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C17694e extends TypeToken<WsMarketSnapshotEntity> {
    }

    /* JADX INFO: renamed from: t1 */
    public static final Unit m38585t1(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity, ArrayList arrayList) {
        IndexSymbolData indexSymbolData = (IndexSymbolData) arrayList.get(0);
        MarketTicker marketTicker = marginFlutterKlineLandscapeActivity.m38571m1().marketTicker;
        Intrinsics.checkNotNullExpressionValue(marketTicker, "marketTicker");
        indexSymbolData.covertToTicker(marketTicker);
        marginFlutterKlineLandscapeActivity.m38506D1();
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: K1 */
    public Void m38598K1() {
        return null;
    }

    /* JADX INFO: renamed from: B1 */
    public static final C43604d m38503B1() {
        return new C43604d();
    }

    /* JADX INFO: renamed from: D1 */
    private final void m38506D1() {
        C42727c c42727cM38601h1 = m38601h1();
        if (c42727cM38601h1 != null) {
            c42727cM38601h1.f94592t.setText(m38571m1().getShowSymbol());
            UpDownTextView upDownTextView = c42727cM38601h1.f94591s;
            Double lastDealPrice = m38571m1().marketTicker.getLastDealPrice();
            String strM66669i = C27041f.m66669i(lastDealPrice != null ? C37886j.m85579c(new BigDecimal(String.valueOf(lastDealPrice.doubleValue())), m38571m1().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--");
            Double lastDealPrice2 = m38571m1().marketTicker.getLastDealPrice();
            Context mContext = this.f46505q;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            upDownTextView.m54918f(strM66669i, lastDealPrice2, C22890g.m54279d(mContext, C27039d.m66646f(m38571m1().marketTicker.getChangeRate()), 0, 2, null));
            BaseTextView baseTextView = c42727cM38601h1.f94582j;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(R$string.deal_vol_24h));
            sb2.append('(');
            SymbolInfoEntity symbolInfoEntity = m38571m1().getSymbolInfoEntity();
            sb2.append(C27041f.m66668h(symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null));
            sb2.append(')');
            baseTextView.setText(sb2.toString());
            ShowHideTextView showHideTextView = c42727cM38601h1.f94583k;
            Double lastDealPrice3 = m38571m1().marketTicker.getLastDealPrice();
            showHideTextView.setText(C27041f.m66669i(lastDealPrice3 != null ? C41014a.m89950x(C41014a.m89939m(lastDealPrice3.doubleValue(), m38571m1().getSymbolInfoEntity().getQuoteCurrency()), null, null, 0, false, true, true, false, 79, null) : null, "--"));
            UpDownTextView upDownTextView2 = c42727cM38601h1.f94585m;
            Double changeRate = m38571m1().marketTicker.getChangeRate();
            Context mContext2 = this.f46505q;
            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
            upDownTextView2.m54919g(changeRate, C22890g.m54279d(mContext2, C27039d.m66646f(m38571m1().marketTicker.getChangeRate()), 0, 2, null));
            ShowHideTextView showHideTextView2 = c42727cM38601h1.f94584l;
            Double value = m38571m1().marketTicker.getValue();
            showHideTextView2.setText(C27041f.m66669i(value != null ? C37886j.m85579c(new BigDecimal(String.valueOf(value.doubleValue())), m38571m1().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
            ShowHideTextView showHideTextView3 = c42727cM38601h1.f94587o;
            Double high = m38571m1().marketTicker.getHigh();
            showHideTextView3.setText(C27041f.m66669i(high != null ? C37886j.m85579c(new BigDecimal(String.valueOf(high.doubleValue())), m38571m1().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
            ShowHideTextView showHideTextView4 = c42727cM38601h1.f94589q;
            Double low = m38571m1().marketTicker.getLow();
            showHideTextView4.setText(C27041f.m66669i(low != null ? C37886j.m85579c(new BigDecimal(String.valueOf(low.doubleValue())), m38571m1().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
        }
    }

    /* JADX INFO: renamed from: I1 */
    public static final void m38516I1(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity, ToolBarClick.ToolBarItemType toolBarItemType) {
        KLineToolBarView kLineToolBarView;
        KLineIndicatorView kLineIndicatorView;
        if (toolBarItemType == ToolBarClick.ToolBarItemType.BAR_ITEM_Exit) {
            if (marginFlutterKlineLandscapeActivity.m38599L1()) {
                marginFlutterKlineLandscapeActivity.preformBackPressed();
            } else {
                C42727c c42727cM38601h1 = marginFlutterKlineLandscapeActivity.m38601h1();
                if (c42727cM38601h1 != null && (kLineIndicatorView = c42727cM38601h1.f94578f) != null) {
                    ViewExtKt.m66594y(kLineIndicatorView);
                }
                C42727c c42727cM38601h2 = marginFlutterKlineLandscapeActivity.m38601h1();
                if (c42727cM38601h2 != null && (kLineToolBarView = c42727cM38601h2.f94581i) != null) {
                    ViewExtKt.m66577h(kLineToolBarView);
                }
            }
        }
        MarginFlutterKlineFragment marginFlutterKlineFragmentM38602k1 = marginFlutterKlineLandscapeActivity.m38602k1();
        Intrinsics.checkNotNull(toolBarItemType);
        marginFlutterKlineFragmentM38602k1.m38493r3(toolBarItemType);
    }

    /* JADX INFO: renamed from: O1 */
    public static final MarginFlutterKlineFragment m38525O1(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity) {
        MarginFlutterKlineFragment.Companion companion = MarginFlutterKlineFragment.f33086Z;
        String symbol = marginFlutterKlineLandscapeActivity.m38571m1().getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        SymbolInfoEntity symbolInfoEntity = marginFlutterKlineLandscapeActivity.m38571m1().getSymbolInfoEntity();
        return companion.newInstance(symbol, C27039d.m66651k(symbolInfoEntity != null ? Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision()) : null, 8), marginFlutterKlineLandscapeActivity.mo38435M1(), marginFlutterKlineLandscapeActivity.mo38603z1());
    }

    /* JADX INFO: renamed from: T1 */
    public static final void m38534T1(final MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity) {
        Disposable disposable = marginFlutterKlineLandscapeActivity.f33097x;
        if (disposable != null) {
            disposable.dispose();
        }
        if (marginFlutterKlineLandscapeActivity.mo38435M1()) {
            PublishSubject<Message> publishSubjectM85233f = marginFlutterKlineLandscapeActivity.f33089A.m85233f("/index/tickers:%s", C27041f.m66668h(marginFlutterKlineLandscapeActivity.m38571m1().getSymbol()));
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.kline.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarginFlutterKlineLandscapeActivity.m38536U1(this.f33168b, (Message) obj));
                }
            };
            Observable<Message> observableFilter = publishSubjectM85233f.filter(new Predicate() { // from class: com.kubi.margin.kline.z
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarginFlutterKlineLandscapeActivity.m38538V1(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.margin.kline.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginFlutterKlineLandscapeActivity.m38540W1((Message) obj);
                }
            };
            Observable observableObserveOn = observableFilter.map(new Function() { // from class: com.kubi.margin.kline.b0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginFlutterKlineLandscapeActivity.m38542X1(function2, obj);
                }
            }).observeOn(AndroidSchedulers.mainThread());
            final Function1 function3 = new Function1() { // from class: com.kubi.margin.kline.c0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginFlutterKlineLandscapeActivity.m38544Y1(this.f33127b, (IndexSymbolData) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.margin.kline.d0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginFlutterKlineLandscapeActivity.m38546Z1(function3, obj);
                }
            };
            final Function1 function4 = new Function1() { // from class: com.kubi.margin.kline.e0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginFlutterKlineLandscapeActivity.m38548a2((Throwable) obj);
                }
            };
            marginFlutterKlineLandscapeActivity.f33097x = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.kline.f0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginFlutterKlineLandscapeActivity.m38550b2(function4, obj);
                }
            });
        } else {
            C37787r c37787r = marginFlutterKlineLandscapeActivity.f33089A;
            String symbol = marginFlutterKlineLandscapeActivity.m38571m1().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            PublishSubject<Message> publishSubjectM85233f2 = c37787r.m85233f("/market/snapshot_app:%s", symbol);
            final Function1 function5 = new Function1() { // from class: com.kubi.margin.kline.g0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarginFlutterKlineLandscapeActivity.m38552c2(this.f33139b, (Message) obj));
                }
            };
            Observable<Message> observableFilter2 = publishSubjectM85233f2.filter(new Predicate() { // from class: com.kubi.margin.kline.h0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarginFlutterKlineLandscapeActivity.m38554d2(function5, obj);
                }
            });
            final Function1 function6 = new Function1() { // from class: com.kubi.margin.kline.s
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginFlutterKlineLandscapeActivity.m38556e2((Message) obj);
                }
            };
            Observable observableObserveOn2 = observableFilter2.map(new Function() { // from class: com.kubi.margin.kline.t
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginFlutterKlineLandscapeActivity.m38558f2(function6, obj);
                }
            }).observeOn(AndroidSchedulers.mainThread());
            final Function1 function7 = new Function1() { // from class: com.kubi.margin.kline.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginFlutterKlineLandscapeActivity.m38560g2(this.f33173b, (WsMarketSnapshotEntity) obj);
                }
            };
            Consumer consumer2 = new Consumer() { // from class: com.kubi.margin.kline.v
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginFlutterKlineLandscapeActivity.m38561h2(function7, obj);
                }
            };
            final Function1 function8 = new Function1() { // from class: com.kubi.margin.kline.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginFlutterKlineLandscapeActivity.m38563i2((Throwable) obj);
                }
            };
            marginFlutterKlineLandscapeActivity.f33097x = observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.margin.kline.y
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginFlutterKlineLandscapeActivity.m38565j2(function8, obj);
                }
            });
        }
        marginFlutterKlineLandscapeActivity.m56593T(marginFlutterKlineLandscapeActivity.f33097x);
    }

    /* JADX INFO: renamed from: U1 */
    public static final boolean m38536U1(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getTopic(), DowngradeExKt.m66551u("/index/tickers:%s", new Object[]{C27041f.m66668h(marginFlutterKlineLandscapeActivity.m38571m1().getSymbol())}, null, 2, null));
    }

    /* JADX INFO: renamed from: V1 */
    public static final boolean m38538V1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: W1 */
    public static final IndexSymbolData m38540W1(Message s11) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(s11, "s");
        String strM66668h = C27041f.m66668h(s11.getData());
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM66668h, new C17693d().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        IndexSymbolData indexSymbolData = (IndexSymbolData) objM66914d;
        return indexSymbolData == null ? new IndexSymbolData(null, null, null, null, null, null, 63, null) : indexSymbolData;
    }

    /* JADX INFO: renamed from: X1 */
    public static final IndexSymbolData m38542X1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (IndexSymbolData) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: c2 */
    public static final boolean m38552c2(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(DowngradeExKt.m66551u("/market/snapshot_app:%s", new Object[]{marginFlutterKlineLandscapeActivity.m38571m1().getSymbol()}, null, 2, null), it.getTopic());
    }

    /* JADX INFO: renamed from: d2 */
    public static final boolean m38554d2(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: e2 */
    public static final WsMarketSnapshotEntity m38556e2(Message s11) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(s11, "s");
        String strM66668h = C27041f.m66668h(s11.getData());
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM66668h, new C17694e().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        return (WsMarketSnapshotEntity) objM66914d;
    }

    /* JADX INFO: renamed from: f1 */
    private final void m38557f1() {
        String name = ChangeToolBarModeEvent.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            name.length();
        }
        C12572a.m23692a(this, true, new C17688x2e70e5d1(name, null, this));
        String name2 = ConfirmAlerEvent.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        if (c12573b.m23696a()) {
            name2.length();
        }
        C12572a.m23692a(this, true, new C17689x2e70e5d2(name2, null, this));
        String name3 = PaintGuideEvent.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
        if (c12573b.m23696a()) {
            name3.length();
        }
        C12572a.m23692a(this, true, new C17690x2e70e5d3(name3, null, this));
        String name4 = ToastEvent.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
        if (c12573b.m23696a()) {
            name4.length();
        }
        C12572a.m23692a(this, true, new C17691x2e70e5d4(name4, null));
    }

    /* JADX INFO: renamed from: f2 */
    public static final WsMarketSnapshotEntity m38558f2(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (WsMarketSnapshotEntity) function1.invoke(p11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public final C43604d m38562i1() {
        return (C43604d) this.f33096w.getValue();
    }

    /* JADX INFO: renamed from: j1 */
    private final InterfaceC46304e m38564j1() {
        return (InterfaceC46304e) this.f33099z.getValue();
    }

    /* JADX INFO: renamed from: l1 */
    private final KLineSettingConfig m38569l1() {
        return (KLineSettingConfig) this.f33092D.getValue();
    }

    /* JADX INFO: renamed from: m1 */
    private final TradeItemBean m38571m1() {
        return (TradeItemBean) this.f33091C.getValue();
    }

    /* JADX INFO: renamed from: n1 */
    private final Integer m38573n1() {
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

    /* JADX INFO: renamed from: o1 */
    private final Integer m38575o1() {
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

    /* JADX INFO: renamed from: r1 */
    public static final boolean m38581r1(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }

    /* JADX INFO: renamed from: s1 */
    public static final boolean m38583s1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: A1 */
    public final InterfaceC46307h m38597A1() {
        return (InterfaceC46307h) this.f33098y.getValue();
    }

    /* JADX INFO: renamed from: L1 */
    public final boolean m38599L1() {
        return ((Boolean) this.f33093E.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: S1 */
    public void m38600S1() throws Exception {
        this.f33089A.m85234g(new Action() { // from class: com.kubi.margin.kline.q
            @Override // io.reactivex.functions.Action
            public final void run() {
                MarginFlutterKlineLandscapeActivity.m38534T1(this.f33164b);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.btradebase_activity_kline_lan;
    }

    /* JADX INFO: renamed from: h1 */
    public final C42727c m38601h1() {
        return (C42727c) this.f33095v.getValue(this, f33088G[0]);
    }

    /* JADX INFO: renamed from: k1 */
    public final MarginFlutterKlineFragment m38602k1() {
        return (MarginFlutterKlineFragment) this.f33094F.getValue();
    }

    /* JADX INFO: renamed from: C1 */
    public static final InterfaceC46304e m38505C1() {
        return (InterfaceC46304e) C42597a.m93386b().create(InterfaceC46304e.class);
    }

    /* JADX INFO: renamed from: E1 */
    private final void m38508E1() {
        KLineToolBarView kLineToolBarView;
        KLineToolBarView kLineToolBarView2;
        KLineIndicatorView kLineIndicatorView;
        KLineIndicatorView kLineIndicatorView2;
        KLineIndicatorView kLineIndicatorView3;
        TabLayout tabLayout;
        C42727c c42727cM38601h1 = m38601h1();
        if (c42727cM38601h1 != null && (tabLayout = c42727cM38601h1.f94580h) != null) {
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C17692c());
        }
        C42727c c42727cM38601h2 = m38601h1();
        if (c42727cM38601h2 != null && (kLineIndicatorView3 = c42727cM38601h2.f94578f) != null) {
            kLineIndicatorView3.m63421l(new Consumer() { // from class: com.kubi.margin.kline.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginFlutterKlineLandscapeActivity.m38510F1(this.f33148b, (Integer) obj);
                }
            });
        }
        C42727c c42727cM38601h3 = m38601h1();
        if (c42727cM38601h3 != null && (kLineIndicatorView2 = c42727cM38601h3.f94578f) != null) {
            kLineIndicatorView2.m63422p(new Consumer() { // from class: com.kubi.margin.kline.l
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginFlutterKlineLandscapeActivity.m38512G1(this.f33151b, (Integer) obj);
                }
            });
        }
        C42727c c42727cM38601h4 = m38601h1();
        if (c42727cM38601h4 != null && (kLineIndicatorView = c42727cM38601h4.f94578f) != null) {
            kLineIndicatorView.m63418h(new Action() { // from class: com.kubi.margin.kline.n
                @Override // io.reactivex.functions.Action
                public final void run() {
                    MarginFlutterKlineLandscapeActivity.m38514H1(this.f33155b);
                }
            });
        }
        C42727c c42727cM38601h5 = m38601h1();
        if (c42727cM38601h5 != null && (kLineToolBarView2 = c42727cM38601h5.f94581i) != null) {
            kLineToolBarView2.m63439k(new Consumer() { // from class: com.kubi.margin.kline.o
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginFlutterKlineLandscapeActivity.m38516I1(this.f33157b, (ToolBarClick.ToolBarItemType) obj);
                }
            });
        }
        C42727c c42727cM38601h6 = m38601h1();
        if (c42727cM38601h6 != null && (kLineToolBarView = c42727cM38601h6.f94581i) != null) {
            kLineToolBarView.m63438i(new Consumer() { // from class: com.kubi.margin.kline.p
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginFlutterKlineLandscapeActivity.m38518J1(this.f33160b, (ToolBarClick.ToolBarItemType) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F1 */
    public static final void m38510F1(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity, Integer num) {
        MarginFlutterKlineFragment marginFlutterKlineFragmentM38602k1 = marginFlutterKlineLandscapeActivity.m38602k1();
        Intrinsics.checkNotNull(num);
        marginFlutterKlineFragmentM38602k1.m38495t3(num.intValue());
    }

    /* JADX INFO: renamed from: G1 */
    public static final void m38512G1(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity, Integer num) {
        MarginFlutterKlineFragment marginFlutterKlineFragmentM38602k1 = marginFlutterKlineLandscapeActivity.m38602k1();
        Intrinsics.checkNotNull(num);
        marginFlutterKlineFragmentM38602k1.m38496u3(num.intValue());
    }

    /* JADX INFO: renamed from: H1 */
    public static final void m38514H1(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity) {
        marginFlutterKlineLandscapeActivity.m38559g1();
    }

    /* JADX INFO: renamed from: J1 */
    public static final void m38518J1(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity, ToolBarClick.ToolBarItemType toolBarItemType) {
        KLineToolBarView kLineToolBarView;
        KLineIndicatorView kLineIndicatorView;
        if (marginFlutterKlineLandscapeActivity.m38599L1()) {
            marginFlutterKlineLandscapeActivity.preformBackPressed();
            return;
        }
        C42727c c42727cM38601h1 = marginFlutterKlineLandscapeActivity.m38601h1();
        if (c42727cM38601h1 != null && (kLineIndicatorView = c42727cM38601h1.f94578f) != null) {
            ViewExtKt.m66594y(kLineIndicatorView);
        }
        C42727c c42727cM38601h2 = marginFlutterKlineLandscapeActivity.m38601h1();
        if (c42727cM38601h2 != null && (kLineToolBarView = c42727cM38601h2.f94581i) != null) {
            ViewExtKt.m66577h(kLineToolBarView);
        }
    }

    /* JADX INFO: renamed from: N1 */
    public static final boolean m38523N1(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity) {
        return marginFlutterKlineLandscapeActivity.getIntent().getBooleanExtra("isFrom", false);
    }

    /* JADX INFO: renamed from: P1 */
    public static final KLineSettingConfig m38527P1(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity) {
        KLineSettingConfig kLineSettingConfig = (KLineSettingConfig) marginFlutterKlineLandscapeActivity.getIntent().getParcelableExtra("data_4");
        if (kLineSettingConfig == null) {
            return new KLineSettingConfig(false, false, 3, null);
        }
        return kLineSettingConfig;
    }

    /* JADX INFO: renamed from: Q1 */
    public static final TradeItemBean m38529Q1(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity) {
        TradeItemBean tradeItemBean;
        Intent intent = marginFlutterKlineLandscapeActivity.getIntent();
        if (intent != null && (tradeItemBean = (TradeItemBean) intent.getParcelableExtra("data")) != null) {
            return tradeItemBean;
        }
        return new TradeItemBean("BTC-USDT");
    }

    /* JADX INFO: renamed from: R1 */
    public static final Unit m38531R1(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity) {
        marginFlutterKlineLandscapeActivity.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y1 */
    public static final Unit m38544Y1(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity, IndexSymbolData indexSymbolData) {
        if (marginFlutterKlineLandscapeActivity.isFinishing()) {
            return Unit.INSTANCE;
        }
        String symbol = indexSymbolData.getSymbol();
        if (symbol != null && symbol.length() != 0) {
            MarketTicker marketTicker = marginFlutterKlineLandscapeActivity.m38571m1().marketTicker;
            Intrinsics.checkNotNullExpressionValue(marketTicker, "marketTicker");
            indexSymbolData.covertToTicker(marketTicker);
            marginFlutterKlineLandscapeActivity.m38506D1();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z1 */
    public static final void m38546Z1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a2 */
    public static final Unit m38548a2(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b2 */
    public static final void m38550b2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g1 */
    private final void m38559g1() {
        KLineToolBarView kLineToolBarView;
        KLineIndicatorView kLineIndicatorView;
        C42727c c42727cM38601h1 = m38601h1();
        if (c42727cM38601h1 != null && (kLineIndicatorView = c42727cM38601h1.f94578f) != null) {
            ViewExtKt.m66577h(kLineIndicatorView);
        }
        C42727c c42727cM38601h2 = m38601h1();
        if (c42727cM38601h2 != null && (kLineToolBarView = c42727cM38601h2.f94581i) != null) {
            ViewExtKt.m66594y(kLineToolBarView);
        }
        m38602k1().m38493r3(ToolBarClick.ToolBarItemType.BAR_ITEM_Enter);
    }

    /* JADX INFO: renamed from: g2 */
    public static final Unit m38560g2(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity, WsMarketSnapshotEntity wsMarketSnapshotEntity) {
        MarketTicker marketTickerConvertToMarketTicker;
        TradeItemBean tradeItemBeanM38571m1 = marginFlutterKlineLandscapeActivity.m38571m1();
        if (wsMarketSnapshotEntity != null) {
            marketTickerConvertToMarketTicker = wsMarketSnapshotEntity.convertToMarketTicker(marginFlutterKlineLandscapeActivity.m38571m1().marketTicker);
        } else {
            marketTickerConvertToMarketTicker = null;
        }
        tradeItemBeanM38571m1.marketTicker = marketTickerConvertToMarketTicker;
        marginFlutterKlineLandscapeActivity.m38506D1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h2 */
    public static final void m38561h2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i2 */
    public static final Unit m38563i2(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j2 */
    public static final void m38565j2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k2 */
    public static final InterfaceC46307h m38567k2() {
        return (InterfaceC46307h) C42597a.m93386b().create(InterfaceC46307h.class);
    }

    /* JADX INFO: renamed from: p1 */
    public static final Unit m38577p1(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q1 */
    public static final void m38579q1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u1 */
    public static final void m38587u1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v1 */
    public static final Unit m38589v1(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w1 */
    public static final void m38591w1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x1 */
    public static final Unit m38593x1(MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity, MarketTicker marketTicker) {
        marginFlutterKlineLandscapeActivity.m38571m1().marketTicker = marketTicker;
        marginFlutterKlineLandscapeActivity.m38506D1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y1 */
    public static final void m38595y1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    @NotNull
    /* JADX INFO: renamed from: D0 */
    public TradeItemBean mo38428D0() {
        return m38571m1();
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    /* JADX INFO: renamed from: M1 */
    public boolean mo38435M1() {
        return getIntent().getBooleanExtra("data_1", false);
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ /* synthetic */ View mo32393c0() {
        return (View) m38598K1();
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: f0 */
    public void mo38439f0(boolean z11) throws Exception {
        super.mo38439f0(z11);
        if (z11) {
            mo22379g(true);
        } else {
            this.f33089A.m85236i(z11);
        }
    }

    @Override // g10.InterfaceC37770a
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: g */
    public void mo22379g(boolean z11) throws Exception {
        if (isFinishing()) {
            return;
        }
        if (z11) {
            m38600S1();
        }
        if (mo38435M1()) {
            Observable<R> observableCompose = m38564j1().m102062c(m38571m1().getSymbol()).compose(C24217a1.m58389m());
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.kline.n0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarginFlutterKlineLandscapeActivity.m38581r1((ArrayList) obj));
                }
            };
            Observable observableFilter = observableCompose.filter(new Predicate() { // from class: com.kubi.margin.kline.o0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarginFlutterKlineLandscapeActivity.m38583s1(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.margin.kline.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginFlutterKlineLandscapeActivity.m38585t1(this.f33126b, (ArrayList) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.margin.kline.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginFlutterKlineLandscapeActivity.m38587u1(function2, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.margin.kline.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginFlutterKlineLandscapeActivity.m38589v1((Throwable) obj);
                }
            };
            observableFilter.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.kline.f
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginFlutterKlineLandscapeActivity.m38591w1(function3, obj);
                }
            });
            return;
        }
        Observable<R> observableCompose2 = m38597A1().m102136t(m38571m1().getSymbol()).compose(C24217a1.m58389m());
        final Function1 function4 = new Function1() { // from class: com.kubi.margin.kline.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginFlutterKlineLandscapeActivity.m38593x1(this.f33138b, (MarketTicker) obj);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: com.kubi.margin.kline.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginFlutterKlineLandscapeActivity.m38595y1(function4, obj);
            }
        };
        final Function1 function5 = new Function1() { // from class: com.kubi.margin.kline.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginFlutterKlineLandscapeActivity.m38577p1((Throwable) obj);
            }
        };
        observableCompose2.subscribe(consumer2, new Consumer() { // from class: com.kubi.margin.kline.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginFlutterKlineLandscapeActivity.m38579q1(function5, obj);
            }
        });
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    public int getPrecision() {
        Integer numValueOf;
        SymbolInfoEntity symbolInfoEntity = m38571m1().getSymbolInfoEntity();
        if (symbolInfoEntity != null) {
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
        ShowHideTextView showHideTextView;
        BaseTextView baseTextView;
        super.onCreate(savedInstanceState);
        EdgeToEdgeCompat.f48106a.m58273k(this);
        C42727c c42727cM38601h1 = m38601h1();
        if (c42727cM38601h1 != null && (imageView = c42727cM38601h1.f94579g) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.margin.kline.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginFlutterKlineLandscapeActivity.m38531R1(this.f33123b);
                }
            }, 1, null);
            if (m38571m1() == null) {
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
                C42727c c42727cM38601h2 = m38601h1();
                if (c42727cM38601h2 != null) {
                    TabLayout tabLayout2 = c42727cM38601h2.f94580h;
                    tabLayout2.addTab(tabLayout2.newTab().setText((CharSequence) mutableList.get(i11)));
                }
            }
            m38508E1();
            m38506D1();
            m38557f1();
            C5286o.m6317a(getSupportFragmentManager(), m38602k1(), R$id.fl_container);
            if (mo38435M1()) {
                C42727c c42727cM38601h3 = m38601h1();
                if (c42727cM38601h3 != null && (baseTextView = c42727cM38601h3.f94582j) != null) {
                    ViewExtKt.m66577h(baseTextView);
                }
                C42727c c42727cM38601h4 = m38601h1();
                if (c42727cM38601h4 != null && (showHideTextView = c42727cM38601h4.f94584l) != null) {
                    ViewExtKt.m66577h(showHideTextView);
                }
            }
            C42727c c42727cM38601h5 = m38601h1();
            if (c42727cM38601h5 != null && (tabLayout = c42727cM38601h5.f94580h) != null && (tabAt = tabLayout.getTabAt(C37878b0.f85252a.m85523d())) != null) {
                tabAt.select();
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        KLineToolBarView kLineToolBarView;
        KLineIndicatorView kLineIndicatorView;
        super.onResume();
        Integer numM38573n1 = m38573n1();
        if (numM38573n1 != null) {
            ((TextView) findViewById(numM38573n1.intValue())).performClick();
        }
        Integer numM38575o1 = m38575o1();
        if (numM38575o1 != null) {
            ((TextView) findViewById(numM38575o1.intValue())).performClick();
        }
        m38602k1().m38494s3(m38569l1().getShowHistoryOrder());
        m38602k1().m38492q3(m38569l1().getShowActiveOrder());
        C44128b.m97266j("MarginFlutterKlineLandscapeActivity", "changeActiveShow klineSettingConfig:" + m38569l1());
        if (m38599L1() && C38190h.f85888a.m86164i()) {
            m38602k1().m38500y3(PaintFromType.VerticalPaint);
            C42727c c42727cM38601h1 = m38601h1();
            if (c42727cM38601h1 != null && (kLineIndicatorView = c42727cM38601h1.f94578f) != null) {
                ViewExtKt.m66577h(kLineIndicatorView);
            }
            C42727c c42727cM38601h2 = m38601h1();
            if (c42727cM38601h2 != null && (kLineToolBarView = c42727cM38601h2.f94581i) != null) {
                ViewExtKt.m66594y(kLineToolBarView);
                return;
            }
            return;
        }
        MarginFlutterKlineFragment.m38491z3(m38602k1(), null, 1, null);
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    /* JADX INFO: renamed from: z1 */
    public int mo38603z1() {
        return getIntent().getIntExtra("tradeType", -1);
    }
}
