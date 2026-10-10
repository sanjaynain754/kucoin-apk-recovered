package com.kubi.margin.trade.position;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.margin.config.MarginConfig;
import com.kubi.margin.entity.MarginDebtPositions;
import com.kubi.margin.entity.WsBalance;
import com.kubi.margin.entity.WsIsolatedPosition;
import com.kubi.margin.trade.BaseMarginFragment;
import com.kubi.margin.trade.IMarginChildBehavior;
import com.kubi.margin.trade.MarginConfigManager;
import com.kubi.margin.trade.MarginIsolateTradeFragment;
import com.kubi.margin.trade.dialog.MarginClosePositionDialog;
import com.kubi.margin.trade.submit.MarginSubmitFragment;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.network.websocket.model.Message;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.utils.C27099x;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import g10.C37787r;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mp.C42579a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36912f0;
import p569qq.C43841b;
import p569qq.C43846g;
import p768xo.InterfaceC46305f;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: MarginIsolatedPositionFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00105\u001a\u000203H\u0002J\b\u00106\u001a\u000203H\u0016J\b\u00107\u001a\u000203H\u0016J\b\u00108\u001a\u000203H\u0002J\b\u00109\u001a\u000203H\u0002J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020;H\u0002J\b\u0010@\u001a\u000203H\u0002J\u0010\u0010A\u001a\u0002032\u0006\u0010B\u001a\u00020\"H\u0002J\u0006\u0010C\u001a\u000203J\u000e\u0010D\u001a\u0002032\u0006\u0010<\u001a\u00020\"J\u000e\u0010E\u001a\u0002032\u0006\u0010<\u001a\u00020\"J\u0006\u0010F\u001a\u00020GR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, m90084d2 = {"Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "bmarginFragmentPositionIsolatedBinding", "Lcom/kubi/margin/databinding/BmarginFragmentPositionIsolatedBinding;", "getBmarginFragmentPositionIsolatedBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentPositionIsolatedBinding;", "bmarginFragmentPositionIsolatedBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mApi", "Lcom/kubi/margin/api/MarginApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/margin/api/MarginApi;", "mApi$delegate", "Lkotlin/Lazy;", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "getWsDataHelper", "()Lcom/kubi/sdk/websocket/WsDataHelper;", "wsDataHelper$delegate", "mParentFragment", "Lcom/kubi/margin/trade/BaseMarginFragment;", "getMParentFragment", "()Lcom/kubi/margin/trade/BaseMarginFragment;", "mParentFragment$delegate", "mAdapter", "Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;", "getMAdapter", "()Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;", "mAdapter$delegate", "mList", "Ljava/util/ArrayList;", "Lcom/kubi/margin/api/entity/MarginPosition;", "Lkotlin/collections/ArrayList;", "mApiDisposable", "Lio/reactivex/disposables/Disposable;", "mNativeDisposable", "mWsDisposable", "mPolling", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initData", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "checkSymbol", "startLoop", "calculateValidPositionCount", "", ViewProps.POSITION, "Lcom/kubi/margin/entity/MarginDebtPositions;", "updatePositionCount", "count", "registerWs", "updateCurrentPosition", "newPosition", "onPositionGet", "cancelClosePosition", "closePosition", "currentSymbol", "Lcom/kubi/data/entity/SymbolInfoEntity;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginIsolatedPositionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginIsolatedPositionFragment.kt\ncom/kubi/margin/trade/position/MarginIsolatedPositionFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,389:1\n147#2,16:390\n35#3,4:406\n39#3:412\n44#4,2:410\n76#5,7:413\n808#6,11:420\n1869#6,2:431\n1878#6,3:434\n774#6:437\n865#6,2:438\n808#6,11:444\n1869#6,2:455\n1#7:433\n160#8,4:440\n*S KotlinDebug\n*F\n+ 1 MarginIsolatedPositionFragment.kt\ncom/kubi/margin/trade/position/MarginIsolatedPositionFragment\n*L\n57#1:390,16\n85#1:406,4\n85#1:412\n85#1:410,2\n112#1:413,7\n162#1:420,11\n163#1:431,2\n315#1:434,3\n105#1:437\n105#1:438,2\n304#1:444,11\n305#1:455,2\n271#1:440,4\n*E\n"})
public final class MarginIsolatedPositionFragment extends BaseFragment {

    /* JADX INFO: renamed from: e0 */
    public static final /* synthetic */ KProperty<Object>[] f33989e0 = {Reflection.property1(new PropertyReference1Impl(MarginIsolatedPositionFragment.class, "bmarginFragmentPositionIsolatedBinding", "getBmarginFragmentPositionIsolatedBinding()Lcom/kubi/margin/databinding/BmarginFragmentPositionIsolatedBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public Disposable f33996a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public Disposable f33997b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public Disposable f33998c0;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f33990U = C45681e.m100799e(this, new Function1<MarginIsolatedPositionFragment, C36912f0>() { // from class: com.kubi.margin.trade.position.MarginIsolatedPositionFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36912f0 invoke(@NotNull MarginIsolatedPositionFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36912f0.m82693a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36912f0, Unit>() { // from class: com.kubi.margin.trade.position.MarginIsolatedPositionFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36912f0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36912f0 c36912f0) {
            invoke(c36912f0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f33991V = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.position.z1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginIsolatedPositionFragment.m40418D4();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f33992W = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.position.a2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginIsolatedPositionFragment.m40470g5(this.f34015b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f33993X = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.position.m0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginIsolatedPositionFragment.m40420E4(this.f34109b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f33994Y = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.position.n0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginIsolatedPositionFragment.m40416C4(this.f34114b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final ArrayList<MarginPosition> f33995Z = new ArrayList<>();

    /* JADX INFO: renamed from: d0 */
    public long f33999d0 = 15;

    /* JADX INFO: renamed from: com.kubi.margin.trade.position.MarginIsolatedPositionFragment$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C18412a extends TypeToken<MarginConfig> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.position.MarginIsolatedPositionFragment$b */
    /* JADX INFO: compiled from: MarginIsolatedPositionFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMarginIsolatedPositionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginIsolatedPositionFragment.kt\ncom/kubi/margin/trade/position/MarginIsolatedPositionFragment$onViewCreated$3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,389:1\n1869#2,2:390\n*S KotlinDebug\n*F\n+ 1 MarginIsolatedPositionFragment.kt\ncom/kubi/margin/trade/position/MarginIsolatedPositionFragment$onViewCreated$3$1\n*L\n115#1:390,2\n*E\n"})
    public static final class C18413b implements Function0<Unit> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Pair<String, BigDecimal> f34001c;

        /* JADX WARN: Multi-variable type inference failed */
        public C18413b(Pair<String, ? extends BigDecimal> pair) {
            this.f34001c = pair;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0050  */
        /* JADX WARN: Code duplicated, block: B:24:0x0056  */
        /* JADX INFO: renamed from: a */
        public final void m40513a() {
            BigDecimal markPrice;
            CurrencyBalance baseAsset;
            BigDecimal markPrice2;
            ArrayList<MarginPosition> arrayList = MarginIsolatedPositionFragment.this.f33995Z;
            Pair<String, BigDecimal> pair = this.f34001c;
            boolean z11 = false;
            for (MarginPosition marginPosition : arrayList) {
                CurrencyBalance baseAsset2 = marginPosition.getBaseAsset();
                if (Intrinsics.areEqual(baseAsset2 != null ? baseAsset2.getCurrency() : null, pair.getFirst())) {
                    CurrencyBalance baseAsset3 = marginPosition.getBaseAsset();
                    if (baseAsset3 == null || (markPrice2 = baseAsset3.getMarkPrice()) == null) {
                        baseAsset = marginPosition.getBaseAsset();
                        if (baseAsset != null) {
                            baseAsset.setMarkPrice(pair.getSecond());
                        }
                        z11 = true;
                    } else {
                        BigDecimal second = pair.getSecond();
                        if (markPrice2.compareTo(second instanceof BigDecimal ? second : null) != 0) {
                            baseAsset = marginPosition.getBaseAsset();
                            if (baseAsset != null) {
                                baseAsset.setMarkPrice(pair.getSecond());
                            }
                            z11 = true;
                        }
                    }
                }
                CurrencyBalance quoteAsset = marginPosition.getQuoteAsset();
                if (Intrinsics.areEqual(quoteAsset != null ? quoteAsset.getCurrency() : null, pair.getFirst())) {
                    CurrencyBalance quoteAsset2 = marginPosition.getQuoteAsset();
                    if (quoteAsset2 != null && (markPrice = quoteAsset2.getMarkPrice()) != null) {
                        BigDecimal second2 = pair.getSecond();
                        if (markPrice.compareTo(second2 instanceof BigDecimal ? second2 : null) == 0) {
                        }
                    }
                    CurrencyBalance quoteAsset3 = marginPosition.getQuoteAsset();
                    if (quoteAsset3 != null) {
                        quoteAsset3.setMarkPrice(pair.getSecond());
                    }
                    z11 = true;
                }
            }
            if (z11) {
                MarginIsolatedPositionFragment.this.m40510x4().replaceData(MarginIsolatedPositionFragment.this.f33995Z);
            }
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m40513a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.position.MarginIsolatedPositionFragment$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C18414c extends TypeToken<WsIsolatedPosition> {
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m40450U4(Throwable th2) {
        C43841b.m96555b("margin_position_tab", null, 2, null);
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z4 */
    public static final Unit m40460Z4(MarginIsolatedPositionFragment marginIsolatedPositionFragment, Throwable th2) {
        C43841b.m96555b("margin_position_tab", null, 2, null);
        marginIsolatedPositionFragment.m40505f5(0);
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m40478m4(final MarginIsolatedPositionFragment marginIsolatedPositionFragment, final MarginPosition marginPosition, MarginPosition marginPosition2) {
        BaseFragment.hideLoadingDialog$default(marginIsolatedPositionFragment, false, 1, null);
        Intrinsics.checkNotNull(marginPosition2);
        marginIsolatedPositionFragment.m40504e5(marginPosition2);
        if (marginPosition2.isCloseEnable()) {
            MarginClosePositionDialog marginClosePositionDialog = new MarginClosePositionDialog(marginPosition, C37890n.f85269a.m85601B(marginPosition.getTag()), new Action() { // from class: com.kubi.margin.trade.position.g1
                @Override // io.reactivex.functions.Action
                public final void run() {
                    MarginIsolatedPositionFragment.m40480n4(this.f34043b, marginPosition);
                }
            });
            FragmentManager childFragmentManager = marginIsolatedPositionFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            marginClosePositionDialog.show(childFragmentManager, "close_position");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A4 */
    private final C37787r m40412A4() {
        return (C37787r) this.f33992W.getValue();
    }

    /* JADX INFO: renamed from: B4 */
    private final void m40414B4() {
        this.f33995Z.clear();
        C42579a c42579a = C42579a.f94275a;
        if (c42579a.m93347g().c() && c42579a.m93347g().d0().isHasOpenLever()) {
            BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
            return;
        }
        ArrayList<MarginPosition> arrayList = this.f33995Z;
        MarginPosition marginPosition = new MarginPosition();
        marginPosition.setTag(m40508v4().getCode());
        marginPosition.setSymbol(m40508v4().getSymbol());
        arrayList.add(marginPosition);
        m40510x4().replaceData(this.f33995Z);
    }

    /* JADX INFO: renamed from: C4 */
    public static final MarginIsolatedPositionAdapter m40416C4(MarginIsolatedPositionFragment marginIsolatedPositionFragment) {
        return new MarginIsolatedPositionAdapter(marginIsolatedPositionFragment.m40508v4(), marginIsolatedPositionFragment);
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m40423G4(MarginIsolatedPositionFragment marginIsolatedPositionFragment, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        marginIsolatedPositionFragment.m40444R4();
        if (z11) {
            ArrayList<MarginPosition> arrayList = marginIsolatedPositionFragment.f33995Z;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (Intrinsics.areEqual(((MarginPosition) obj).getTag(), marginIsolatedPositionFragment.m40508v4().getCode())) {
                    arrayList2.add(obj);
                }
            }
            marginIsolatedPositionFragment.f33995Z.clear();
            marginIsolatedPositionFragment.f33995Z.addAll(arrayList2);
            marginIsolatedPositionFragment.m40510x4().replaceData(marginIsolatedPositionFragment.f33995Z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final void m40426I4(final MarginIsolatedPositionFragment marginIsolatedPositionFragment) {
        Disposable disposable = marginIsolatedPositionFragment.f33998c0;
        if (disposable != null) {
            marginIsolatedPositionFragment.getVisibleDisposable().remove(disposable);
        }
        C37787r c37787rM40412A4 = marginIsolatedPositionFragment.m40412A4();
        String code = marginIsolatedPositionFragment.m40508v4().getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        PublishSubject<Message> publishSubjectM85233f = c37787rM40412A4.m85233f("/margin/isolatedPosition:%s", code);
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.position.i1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarginIsolatedPositionFragment.m40428J4(this.f34052b, (Message) obj));
            }
        };
        Observable<Message> observableFilter = publishSubjectM85233f.filter(new Predicate() { // from class: com.kubi.margin.trade.position.j1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarginIsolatedPositionFragment.m40430K4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.position.k1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginIsolatedPositionFragment.m40432L4((Message) obj);
            }
        };
        Observable observableObserveOn = observableFilter.map(new Function() { // from class: com.kubi.margin.trade.position.l1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarginIsolatedPositionFragment.m40434M4(function2, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.trade.position.m1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginIsolatedPositionFragment.m40436N4(this.f34110b, (WsIsolatedPosition) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.position.n1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginIsolatedPositionFragment.m40438O4(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.margin.trade.position.o1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginIsolatedPositionFragment.m40440P4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.position.p1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginIsolatedPositionFragment.m40442Q4(function4, obj);
            }
        });
        marginIsolatedPositionFragment.f33998c0 = disposableSubscribe;
        if (disposableSubscribe != null) {
            marginIsolatedPositionFragment.getVisibleDisposable().add(disposableSubscribe);
        }
    }

    /* JADX INFO: renamed from: J4 */
    public static final boolean m40428J4(MarginIsolatedPositionFragment marginIsolatedPositionFragment, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getTopic(), DowngradeExKt.m66551u("/margin/isolatedPosition:%s", new Object[]{marginIsolatedPositionFragment.m40508v4().getCode()}, null, 2, null)) && Intrinsics.areEqual(it.getSubject(), "positionChange");
    }

    /* JADX INFO: renamed from: K4 */
    public static final boolean m40430K4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: L4 */
    public static final WsIsolatedPosition m40432L4(Message it) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(it, "it");
        String strM66668h = C27041f.m66668h(it.getData());
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM66668h, new C18414c().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        return (WsIsolatedPosition) objM66914d;
    }

    /* JADX INFO: renamed from: M4 */
    public static final WsIsolatedPosition m40434M4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (WsIsolatedPosition) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m40436N4(MarginIsolatedPositionFragment marginIsolatedPositionFragment, WsIsolatedPosition wsIsolatedPosition) {
        MarginSubmitFragment marginSubmitFragmentM39713F5;
        FragmentManager childFragmentManager;
        List<Fragment> fragments;
        BaseMarginFragment baseMarginFragmentM40512z4;
        BaseMarginFragment baseMarginFragmentM40512z5;
        if (wsIsolatedPosition == null) {
            return Unit.INSTANCE;
        }
        MarginConfigManager marginConfigManager = MarginConfigManager.f33681a;
        String tag = wsIsolatedPosition.getTag();
        if (tag == null) {
            tag = "";
        }
        MarginPosition marginPositionM39874T0 = marginConfigManager.m39874T0(tag);
        if (marginPositionM39874T0 != null) {
            if (C27039d.m66652l(marginPositionM39874T0.getTimestamp()) > C27039d.m66652l(wsIsolatedPosition.getTimestamp())) {
                return Unit.INSTANCE;
            }
            BaseMarginFragment baseMarginFragmentM40512z6 = marginIsolatedPositionFragment.m40512z4();
            if (baseMarginFragmentM40512z6 != null) {
                baseMarginFragmentM40512z6.m39748w6(System.currentTimeMillis());
            }
            marginPositionM39874T0.setAccumulatedPrincipal(wsIsolatedPosition.getAccumulatedPrincipal());
            marginPositionM39874T0.setStatus(wsIsolatedPosition.getStatus());
            marginPositionM39874T0.setStatusBizType(wsIsolatedPosition.getStatusBizType());
            marginPositionM39874T0.setTimestamp(wsIsolatedPosition.getTimestamp());
            WsBalance wsBalance = wsIsolatedPosition.getChangeAssets().get(marginIsolatedPositionFragment.m40508v4().getBaseCurrency());
            if (wsBalance != null) {
                CurrencyBalance baseAsset = marginPositionM39874T0.getBaseAsset();
                if (baseAsset != null) {
                    baseAsset.setHoldBalance(wsBalance.getHold());
                }
                CurrencyBalance baseAsset2 = marginPositionM39874T0.getBaseAsset();
                if (baseAsset2 != null) {
                    baseAsset2.setLiabilityInterest(wsBalance.getLiabilityInterest());
                }
                CurrencyBalance baseAsset3 = marginPositionM39874T0.getBaseAsset();
                if (baseAsset3 != null) {
                    baseAsset3.setLiabilityPrincipal(wsBalance.getLiabilityPrincipal());
                }
                CurrencyBalance baseAsset4 = marginPositionM39874T0.getBaseAsset();
                if (baseAsset4 != null) {
                    baseAsset4.setTotalBalance(wsBalance.getTotal());
                }
            }
            WsBalance wsBalance2 = wsIsolatedPosition.getChangeAssets().get(marginIsolatedPositionFragment.m40508v4().getQuoteCurrency());
            if (wsBalance2 != null) {
                CurrencyBalance quoteAsset = marginPositionM39874T0.getQuoteAsset();
                if (quoteAsset != null) {
                    quoteAsset.setHoldBalance(wsBalance2.getHold());
                }
                CurrencyBalance quoteAsset2 = marginPositionM39874T0.getQuoteAsset();
                if (quoteAsset2 != null) {
                    quoteAsset2.setLiabilityInterest(wsBalance2.getLiabilityInterest());
                }
                CurrencyBalance quoteAsset3 = marginPositionM39874T0.getQuoteAsset();
                if (quoteAsset3 != null) {
                    quoteAsset3.setLiabilityPrincipal(wsBalance2.getLiabilityPrincipal());
                }
                CurrencyBalance quoteAsset4 = marginPositionM39874T0.getQuoteAsset();
                if (quoteAsset4 != null) {
                    quoteAsset4.setTotalBalance(wsBalance2.getTotal());
                }
            }
            marginPositionM39874T0.updateByWs();
            marginIsolatedPositionFragment.m40504e5(marginPositionM39874T0);
            CurrencyBalance baseAsset5 = marginPositionM39874T0.getBaseAsset();
            if (baseAsset5 != null && (baseMarginFragmentM40512z5 = marginIsolatedPositionFragment.m40512z4()) != null) {
                baseMarginFragmentM40512z5.m39746u6(baseAsset5);
            }
            CurrencyBalance quoteAsset5 = marginPositionM39874T0.getQuoteAsset();
            if (quoteAsset5 != null && (baseMarginFragmentM40512z4 = marginIsolatedPositionFragment.m40512z4()) != null) {
                baseMarginFragmentM40512z4.m39750x6(quoteAsset5);
            }
            BaseMarginFragment baseMarginFragmentM40512z7 = marginIsolatedPositionFragment.m40512z4();
            if (baseMarginFragmentM40512z7 != null && (marginSubmitFragmentM39713F5 = baseMarginFragmentM40512z7.m39713F5()) != null && (childFragmentManager = marginSubmitFragmentM39713F5.getChildFragmentManager()) != null && (fragments = childFragmentManager.getFragments()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : fragments) {
                    if (obj instanceof IMarginChildBehavior) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((IMarginChildBehavior) it.next()).m40005S();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R4 */
    private final void m40444R4() {
        KuCheckBox kuCheckBox;
        Disposable disposable = this.f33996a0;
        if (disposable != null) {
            getVisibleDisposable().remove(disposable);
        }
        Disposable disposable2 = this.f33997b0;
        if (disposable2 != null) {
            getVisibleDisposable().remove(disposable2);
        }
        C42579a c42579a = C42579a.f94275a;
        Boolean boolValueOf = null;
        if (!c42579a.m93347g().c() || !c42579a.m93347g().d0().isHasOpenLever()) {
            C43841b.m96555b("margin_position_tab", null, 2, null);
            return;
        }
        C36912f0 c36912f0M40509w4 = m40509w4();
        if (c36912f0M40509w4 != null && (kuCheckBox = c36912f0M40509w4.f81692d) != null) {
            boolValueOf = Boolean.valueOf(kuCheckBox.isChecked());
        }
        if (C27025c.m66566d(boolValueOf)) {
            Observable<Long> observableObserveOn = Observable.interval(1L, 5L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread());
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.position.l0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginIsolatedPositionFragment.m40446S4(this.f34063b, (Long) obj);
                }
            };
            Consumer<? super Long> consumer = new Consumer() { // from class: com.kubi.margin.trade.position.w0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginIsolatedPositionFragment.m40448T4(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.position.h1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginIsolatedPositionFragment.m40450U4((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.position.s1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginIsolatedPositionFragment.m40452V4(function2, obj);
                }
            });
            this.f33997b0 = disposableSubscribe;
            if (disposableSubscribe != null) {
                getVisibleDisposable().add(disposableSubscribe);
                return;
            }
            return;
        }
        Observable<Long> observableObserveOn2 = Observable.interval(1L, this.f33999d0, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.trade.position.v1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginIsolatedPositionFragment.m40454W4(this.f34144b, (Long) obj);
            }
        };
        Consumer<? super Long> consumer2 = new Consumer() { // from class: com.kubi.margin.trade.position.w1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginIsolatedPositionFragment.m40463b5(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.margin.trade.position.x1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginIsolatedPositionFragment.m40464c5((Throwable) obj);
            }
        };
        Disposable disposableSubscribe2 = observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.margin.trade.position.y1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginIsolatedPositionFragment.m40466d5(function4, obj);
            }
        });
        this.f33996a0 = disposableSubscribe2;
        if (disposableSubscribe2 != null) {
            getVisibleDisposable().add(disposableSubscribe2);
        }
    }

    /* JADX INFO: renamed from: X4 */
    public static final Unit m40456X4(MarginIsolatedPositionFragment marginIsolatedPositionFragment, MarginDebtPositions marginDebtPositions) {
        ArrayList arrayList = new ArrayList();
        ArrayList<MarginPosition> debtPositionRespList = marginDebtPositions.getDebtPositionRespList();
        if (debtPositionRespList != null && !debtPositionRespList.isEmpty()) {
            arrayList.addAll(marginDebtPositions.getDebtPositionRespList());
        }
        if (marginDebtPositions.getCurrentPositionResp() != null) {
            arrayList.add(0, marginDebtPositions.getCurrentPositionResp());
        }
        marginIsolatedPositionFragment.f33995Z.clear();
        marginIsolatedPositionFragment.f33995Z.addAll(arrayList);
        marginIsolatedPositionFragment.m40510x4().replaceData(marginIsolatedPositionFragment.f33995Z);
        Intrinsics.checkNotNull(marginDebtPositions);
        marginIsolatedPositionFragment.m40505f5(marginIsolatedPositionFragment.m40502b4(marginDebtPositions));
        marginIsolatedPositionFragment.showContentView();
        C43841b.m96557d("margin_position_tab", "data_load_finish", null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m40468f4(MarginIsolatedPositionFragment marginIsolatedPositionFragment, Object obj) {
        ToastCompat.m66437C(R$string.margin_one_key_close_cancel_ok_tips);
        BaseFragment.hideLoadingDialog$default(marginIsolatedPositionFragment, false, 1, null);
    }

    /* JADX INFO: renamed from: g5 */
    public static final C37787r m40470g5(MarginIsolatedPositionFragment marginIsolatedPositionFragment) {
        return new C37787r(marginIsolatedPositionFragment);
    }

    /* JADX INFO: renamed from: F4 */
    public final void m40500F4() {
        MarginConfigManager marginConfigManager = MarginConfigManager.f33681a;
        String code = m40508v4().getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        MarginPosition marginPositionM39874T0 = marginConfigManager.m39874T0(code);
        if (marginPositionM39874T0 != null) {
            showContentView();
            if (!this.f33995Z.isEmpty()) {
                m40504e5(marginPositionM39874T0);
            } else {
                this.f33995Z.add(marginPositionM39874T0);
                m40510x4().replaceData(this.f33995Z);
            }
        }
    }

    /* JADX INFO: renamed from: H4 */
    public final void m40501H4() throws Exception {
        C42579a c42579a = C42579a.f94275a;
        if (c42579a.m93347g().c() && c42579a.m93347g().d0().isHasOpenLever()) {
            m40412A4().m85234g(new Action() { // from class: com.kubi.margin.trade.position.u0
                @Override // io.reactivex.functions.Action
                public final void run() {
                    MarginIsolatedPositionFragment.m40426I4(this.f34139b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final void m40503c4(@NotNull MarginPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        InterfaceC46305f interfaceC46305fM40511y4 = m40511y4();
        String tag = position.getTag();
        if (tag == null) {
            tag = "";
        }
        Observable<R> observableCompose = interfaceC46305fM40511y4.m102077M(tag).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.position.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginIsolatedPositionFragment.m40465d4(this.f34018b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.margin.trade.position.c1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginIsolatedPositionFragment.m40467e4(function1, obj);
            }
        });
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.position.d1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginIsolatedPositionFragment.m40468f4(this.f34027b, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.position.e1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginIsolatedPositionFragment.m40469g4(this.f34033b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.position.f1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginIsolatedPositionFragment.m40471h4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: e5 */
    public final void m40504e5(MarginPosition marginPosition) {
        int i11 = 0;
        for (Object obj : this.f33995Z) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(((MarginPosition) obj).getTag(), marginPosition.getTag())) {
                this.f33995Z.set(i11, marginPosition);
                m40510x4().replaceData(this.f33995Z);
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m40507j4(@NotNull final MarginPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        if (Intrinsics.areEqual(position.getTag(), m40508v4().getCode())) {
            MarginClosePositionDialog marginClosePositionDialog = new MarginClosePositionDialog(position, m40508v4(), null, 4, null);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            marginClosePositionDialog.show(childFragmentManager, "close_position");
            return;
        }
        Observable observableCompose = InterfaceC46305f.m102064H(m40511y4(), position.getTag(), null, 2, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.position.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginIsolatedPositionFragment.m40474k4(this.f34118b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.margin.trade.position.p0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginIsolatedPositionFragment.m40476l4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.position.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginIsolatedPositionFragment.m40478m4(this.f34124b, position, (MarginPosition) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.position.r0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginIsolatedPositionFragment.m40490s4(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.trade.position.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginIsolatedPositionFragment.m40492t4(this.f34132b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.position.t0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginIsolatedPositionFragment.m40494u4(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bmargin_fragment_position_isolated, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        long jM66650j;
        Object objM20457a;
        KuCheckBox kuCheckBox;
        KuCheckBox kuCheckBox2;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        try {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C18412a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("margin_config", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            MarginConfig marginConfig = (MarginConfig) objM20457a;
            jM66650j = C27039d.m66650j(marginConfig != null ? marginConfig.getIsolatedPolling() : null);
            if (jM66650j <= 5) {
                jM66650j = 5;
            }
        } catch (Throwable unused) {
            jM66650j = 15;
        }
        this.f33999d0 = jM66650j;
        C36912f0 c36912f0M40509w4 = m40509w4();
        if (c36912f0M40509w4 != null && (recyclerView = c36912f0M40509w4.f81691c) != null) {
            recyclerView.setAdapter(m40510x4());
            recyclerView.setItemAnimator(null);
        }
        C36912f0 c36912f0M40509w5 = m40509w4();
        if (c36912f0M40509w5 != null && (kuCheckBox2 = c36912f0M40509w5.f81692d) != null) {
            kuCheckBox2.setText(getString(R$string.kc_tb_grid_only_current_pair));
        }
        C36912f0 c36912f0M40509w6 = m40509w4();
        if (c36912f0M40509w6 != null && (kuCheckBox = c36912f0M40509w6.f81692d) != null) {
            C27046k.m66708w(kuCheckBox, new Function2() { // from class: com.kubi.margin.trade.position.v0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginIsolatedPositionFragment.m40423G4(this.f34143b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        if (C12573b.f21598a.m23696a()) {
            "/indicator/markPrice:%s".length();
        }
        C12572a.m23692a(this, false, new C18415x344bb400("/indicator/markPrice:%s", null, this));
        m40414B4();
    }

    /* JADX INFO: renamed from: w4 */
    public final C36912f0 m40509w4() {
        return (C36912f0) this.f33990U.getValue(this, f33989e0[0]);
    }

    /* JADX INFO: renamed from: x4 */
    public final MarginIsolatedPositionAdapter m40510x4() {
        return (MarginIsolatedPositionAdapter) this.f33994Y.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    public final InterfaceC46305f m40511y4() {
        return (InterfaceC46305f) this.f33991V.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: z4 */
    public final BaseMarginFragment m40512z4() {
        return (BaseMarginFragment) this.f33993X.getValue();
    }

    /* JADX INFO: renamed from: D4 */
    public static final InterfaceC46305f m40418D4() {
        return (InterfaceC46305f) C42597a.m93386b().create(InterfaceC46305f.class);
    }

    /* JADX INFO: renamed from: E4 */
    public static final BaseMarginFragment m40420E4(MarginIsolatedPositionFragment marginIsolatedPositionFragment) {
        Fragment parentFragment = marginIsolatedPositionFragment.getParentFragment();
        if (parentFragment instanceof BaseMarginFragment) {
            return (BaseMarginFragment) parentFragment;
        }
        return null;
    }

    /* JADX INFO: renamed from: O4 */
    public static final void m40438O4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m40440P4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final void m40442Q4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m40446S4(MarginIsolatedPositionFragment marginIsolatedPositionFragment, Long l11) {
        KuCheckBox kuCheckBox;
        if (marginIsolatedPositionFragment.getView() == null) {
            return Unit.INSTANCE;
        }
        Boolean boolValueOf = null;
        C43841b.m96557d("margin_position_tab", "data_load_finish", null, 4, null);
        C36912f0 c36912f0M40509w4 = marginIsolatedPositionFragment.m40509w4();
        if (c36912f0M40509w4 != null && (kuCheckBox = c36912f0M40509w4.f81692d) != null) {
            boolValueOf = Boolean.valueOf(kuCheckBox.isChecked());
        }
        if (C27025c.m66566d(boolValueOf)) {
            MarginConfigManager marginConfigManager = MarginConfigManager.f33681a;
            String code = marginIsolatedPositionFragment.m40508v4().getCode();
            Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
            MarginPosition marginPositionM39874T0 = marginConfigManager.m39874T0(code);
            if (marginPositionM39874T0 != null) {
                marginIsolatedPositionFragment.m40504e5(marginPositionM39874T0);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T4 */
    public static final void m40448T4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V4 */
    public static final void m40452V4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m40454W4(final MarginIsolatedPositionFragment marginIsolatedPositionFragment, Long l11) {
        InterfaceC46305f interfaceC46305fM40511y4 = marginIsolatedPositionFragment.m40511y4();
        String code = marginIsolatedPositionFragment.m40508v4().getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        Observable observableCompose = InterfaceC46305f.m102065n(interfaceC46305fM40511y4, code, false, false, 6, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.position.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginIsolatedPositionFragment.m40456X4(this.f34152b, (MarginDebtPositions) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.position.y0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginIsolatedPositionFragment.m40458Y4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.position.z0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginIsolatedPositionFragment.m40460Z4(this.f34159b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.position.a1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginIsolatedPositionFragment.m40462a5(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, marginIsolatedPositionFragment.getDestroyDisposable());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y4 */
    public static final void m40458Y4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a5 */
    public static final void m40462a5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b5 */
    public static final void m40463b5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m40464c5(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m40465d4(MarginIsolatedPositionFragment marginIsolatedPositionFragment, Disposable disposable) {
        marginIsolatedPositionFragment.showLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    public static final void m40466d5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m40467e4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m40469g4(MarginIsolatedPositionFragment marginIsolatedPositionFragment, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        BaseFragment.hideLoadingDialog$default(marginIsolatedPositionFragment, false, 1, null);
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m40471h4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m40474k4(MarginIsolatedPositionFragment marginIsolatedPositionFragment, Disposable disposable) {
        marginIsolatedPositionFragment.showLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final void m40476l4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m40480n4(final MarginIsolatedPositionFragment marginIsolatedPositionFragment, MarginPosition marginPosition) {
        Observable observableCompose = InterfaceC46305f.m102064H(marginIsolatedPositionFragment.m40511y4(), marginPosition.getTag(), null, 2, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.position.q1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginIsolatedPositionFragment.m40482o4(this.f34126b, (MarginPosition) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.position.r1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginIsolatedPositionFragment.m40484p4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.position.t1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginIsolatedPositionFragment.m40486q4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.position.u1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginIsolatedPositionFragment.m40488r4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, marginIsolatedPositionFragment.getDestroyDisposable());
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m40482o4(MarginIsolatedPositionFragment marginIsolatedPositionFragment, MarginPosition marginPosition) {
        Intrinsics.checkNotNull(marginPosition);
        marginIsolatedPositionFragment.m40504e5(marginPosition);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m40484p4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m40486q4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m40488r4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m40490s4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m40492t4(MarginIsolatedPositionFragment marginIsolatedPositionFragment, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        BaseFragment.hideLoadingDialog$default(marginIsolatedPositionFragment, false, 1, null);
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m40494u4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b4 */
    public final int m40502b4(MarginDebtPositions marginDebtPositions) {
        Boolean boolValueOf;
        MarginPosition currentPositionResp = marginDebtPositions.getCurrentPositionResp();
        Integer numValueOf = null;
        if (currentPositionResp != null) {
            boolValueOf = Boolean.valueOf(currentPositionResp.isOpenStatus());
        } else {
            boolValueOf = null;
        }
        boolean zM66566d = C27025c.m66566d(boolValueOf);
        ArrayList<MarginPosition> debtPositionRespList = marginDebtPositions.getDebtPositionRespList();
        if (debtPositionRespList != null) {
            numValueOf = Integer.valueOf(debtPositionRespList.size());
        }
        return (zM66566d ? 1 : 0) + C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: renamed from: f5 */
    public final void m40505f5(int i11) {
        MarginIsolateTradeFragment marginIsolateTradeFragment;
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof MarginIsolateTradeFragment) {
            marginIsolateTradeFragment = (MarginIsolateTradeFragment) parentFragment;
        } else {
            marginIsolateTradeFragment = null;
        }
        if (marginIsolateTradeFragment == null) {
            return;
        }
        marginIsolateTradeFragment.m39908v7(i11);
    }

    /* JADX INFO: renamed from: i4 */
    public final void m40506i4() {
        KuCheckBox kuCheckBox;
        if (Intrinsics.areEqual(m40510x4().getF33987i().getCode(), m40508v4().getCode())) {
            return;
        }
        m40510x4().m40405Z(m40508v4());
        C36912f0 c36912f0M40509w4 = m40509w4();
        if (c36912f0M40509w4 != null && (kuCheckBox = c36912f0M40509w4.f81692d) != null) {
            kuCheckBox.setText(getString(R$string.show_current_symbol, m40508v4().getShowSymbol()));
        }
        m40414B4();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        if (isAdded()) {
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
        m40412A4().m85236i(false);
        C43841b.m96555b("margin_position_tab", null, 2, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() throws Exception {
        m40506i4();
        m40444R4();
        m40501H4();
    }

    @NotNull
    /* JADX INFO: renamed from: v4 */
    public final SymbolInfoEntity m40508v4() {
        SymbolInfoEntity symbolInfoEntityMo39722N;
        BaseMarginFragment baseMarginFragmentM40512z4 = m40512z4();
        if (baseMarginFragmentM40512z4 != null && (symbolInfoEntityMo39722N = baseMarginFragmentM40512z4.mo39722N()) != null) {
            return symbolInfoEntityMo39722N;
        }
        return new SymbolInfoEntity();
    }
}
