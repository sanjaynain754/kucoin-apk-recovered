package com.kubi.kumex.flutter;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import b00.InterfaceC4429l;
import bi.FlutterCancelTwapOrderEvent;
import bi.FlutterPauseRestartTwapEvent;
import com.blankj.utilcode.util.C5258a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.event.api.C12572a;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.trade.order.modify.BaseModifyOrderDialog;
import com.kubi.futures.trade.order.modify.twap.TwapModifyOrderDialog;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.utils.C27099x;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.List;
import ki.C41050b;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p373jk.C40432e;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: KCFlutterBridgeKumexCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016J6\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000f2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016J.\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016J.\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016J.\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016J6\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000f2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016J>\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, m90084d2 = {"Lcom/kubi/kumex/flutter/KCFlutterBridgeKumexCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKumexCall;", "<init>", "()V", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "mainHandler$delegate", "Lkotlin/Lazy;", "cancelTwapOrder", "", "ctx", "Landroid/content/Context;", "orderId", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "getFormatSymbol", "symbol", "getLeaderUserId", "getMaxLeverage", "getQtyUnit", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "modifyTwapOrder", "orderInfo", "switchTwapOrderStatus", "status", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgeKumexCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeKumexCallImpl.kt\ncom/kubi/kumex/flutter/KCFlutterBridgeKumexCallImpl\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n149#2:140\n1#3:141\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeKumexCallImpl.kt\ncom/kubi/kumex/flutter/KCFlutterBridgeKumexCallImpl\n*L\n104#1:140\n*E\n"})
public final class KCFlutterBridgeKumexCallImpl implements InterfaceC4429l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f29032a = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.flutter.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KCFlutterBridgeKumexCallImpl.m33744l();
        }
    });

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC41775x1 f29033b;

    /* JADX INFO: renamed from: com.kubi.kumex.flutter.KCFlutterBridgeKumexCallImpl$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C15976a extends TypeToken<OrderEntity> {
    }

    /* JADX INFO: renamed from: l */
    public static final Handler m33744l() {
        return new Handler(Looper.getMainLooper());
    }

    @Override // b00.InterfaceC4429l
    /* JADX INFO: renamed from: a */
    public void mo4170a(@NotNull Context ctx, @NotNull String orderInfo, @NotNull final Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            C27099x c27099x = C27099x.f54458a;
            final OrderEntity orderEntity = (OrderEntity) C27099x.m66914d(orderInfo, new C15976a().getType());
            m33747k().post(new Runnable() { // from class: com.kubi.kumex.flutter.r
                @Override // java.lang.Runnable
                public final void run() {
                    KCFlutterBridgeKumexCallImpl.m33745m(orderEntity, this, callback);
                }
            });
        } catch (Throwable th2) {
            callback.invoke(null, new ProtocolException(null, th2, null, false, 13, null));
        }
    }

    @Override // b00.InterfaceC4429l
    /* JADX INFO: renamed from: b */
    public void mo4171b(@NotNull Context ctx, @NotNull String orderId, @NotNull String status, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C12572a.m23695d("event_flutter_twap_order_pause_restart", new FlutterPauseRestartTwapEvent(orderId, status), 0L, 4, null);
        callback.invoke(null, null);
    }

    @Override // b00.InterfaceC4429l
    /* JADX INFO: renamed from: c */
    public void mo4172c(@NotNull Context ctx, @NotNull String orderId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C12572a.m23695d("event_flutter_twap_order_canceled", new FlutterCancelTwapOrderEvent(orderId), 0L, 4, null);
        callback.invoke(null, null);
    }

    @Override // b00.InterfaceC4429l
    /* JADX INFO: renamed from: d */
    public void mo4173d(@NotNull Context ctx, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(KuMexDepend.f30378a.m35900b().mo20628i(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    @Override // b00.InterfaceC4429l
    /* JADX INFO: renamed from: e */
    public void mo4174e(@NotNull Context ctx, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        String strM90022e;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(C40432e.f89748a.m89069i(ctx, "futures-trade:quantity-unit", null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String str = (String) objM103844constructorimpl;
        if (str != null) {
            switch (str) {
                case "QtyUnitOfLot":
                    strM90022e = "lot";
                    break;
                case "QtyUnitOfCurrency":
                    strM90022e = FirebaseAnalytics.Param.CURRENCY;
                    break;
                case "QtyUnitOfCost":
                    strM90022e = "cost";
                    break;
                case "QtyUnitOfValue":
                    strM90022e = "value";
                    break;
                default:
                    strM90022e = C41050b.f91264a.m90022e();
                    break;
            }
        } else {
            strM90022e = C41050b.f91264a.m90022e();
        }
        callback.invoke(strM90022e, null);
    }

    @Override // b00.InterfaceC4429l
    /* JADX INFO: renamed from: f */
    public void mo4175f(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), symbol, false, 2, null);
        callback.invoke(String.valueOf(contractEntityM99529O != null ? FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O) : null), null);
    }

    @Override // b00.InterfaceC4429l
    /* JADX INFO: renamed from: g */
    public void mo4176g(@NotNull Context ctx, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (C24129b.m58030b(SiteVisibleConfigKey.Futures)) {
            callback.invoke(String.valueOf(IKuMexService.f28731a.get().mo33277e()), null);
        } else {
            callback.invoke(C33556b3.f68995S, null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final InterfaceC41775x1 getF29033b() {
        return this.f29033b;
    }

    /* JADX INFO: renamed from: k */
    public final Handler m33747k() {
        return (Handler) this.f29032a.getValue();
    }

    /* JADX INFO: renamed from: m */
    public static final void m33745m(OrderEntity orderEntity, KCFlutterBridgeKumexCallImpl kCFlutterBridgeKumexCallImpl, Function2 function2) {
        Object next;
        ComponentCallbacks2 componentCallbacks2M6125h = C5258a.m6125h();
        if (componentCallbacks2M6125h != null && (componentCallbacks2M6125h instanceof FragmentActivity)) {
            FragmentActivity fragmentActivity = (FragmentActivity) componentCallbacks2M6125h;
            List<Fragment> fragments = fragmentActivity.getSupportFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            Iterator<T> it = fragments.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!(((Fragment) next) instanceof TwapModifyOrderDialog));
            if (((Fragment) next) == null) {
                BaseModifyOrderDialog.Companion companion = BaseModifyOrderDialog.f23879x0;
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                BaseModifyOrderDialog.Companion.show$default(companion, supportFragmentManager, orderEntity, null, null, 12, null);
                InterfaceC41775x1 interfaceC41775x1 = kCFlutterBridgeKumexCallImpl.f29033b;
                if (interfaceC41775x1 != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                }
                kCFlutterBridgeKumexCallImpl.f29033b = C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) componentCallbacks2M6125h), null, null, new KCFlutterBridgeKumexCallImpl$modifyTwapOrder$1$1$1(function2, kCFlutterBridgeKumexCallImpl, null), 3, null);
            }
        }
    }
}
