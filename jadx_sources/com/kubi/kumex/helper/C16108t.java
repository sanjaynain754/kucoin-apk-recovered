package com.kubi.kumex.helper;

import android.annotation.SuppressLint;
import androidx.credentials.provider.CredentialEntry;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$string;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.ToastCompat;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: com.kubi.kumex.helper.t */
/* JADX INFO: compiled from: ContractHelper.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u001a(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r\u001a*\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\rH\u0007\u001a(\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\rH\u0007\u001a&\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0007\u001a*\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\rH\u0007¨\u0006\u0014"}, m90084d2 = {"isSafeTrade", "", "isBuy", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", C33556b3.f69046g2, "ask", "updateFavouriteForLogout", "", "symbol", "", "favourite", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "updateFavourite", "symbols", "", "updateStick", "stick", "updateFavouriteForMarket", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C16108t {
    /* JADX INFO: renamed from: n */
    public static final boolean m34069n(boolean z11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        BigDecimal bigDecimalMultiply = C41014a.m89922G(bigDecimal2, null, 1, null).multiply(new BigDecimal("0.97"));
        BigDecimal bigDecimalMultiply2 = C41014a.m89922G(bigDecimal3, null, 1, null).multiply(new BigDecimal("1.03"));
        if (z11) {
            return C41014a.m89922G(bigDecimal, null, 1, null).compareTo(C41014a.m89922G(bigDecimalMultiply2, null, 1, null)) >= 0;
        }
        return C41014a.m89922G(bigDecimal, null, 1, null).compareTo(C41014a.m89922G(bigDecimalMultiply, null, 1, null)) <= 0;
    }

    /* JADX INFO: renamed from: A */
    public static final void m34048A(boolean z11, Function0 function0, Object obj) {
        if (z11) {
            ToastCompat.m66437C(R$string.add_favorites_ok);
        } else {
            ToastCompat.m66437C(R$string.cancel_favor_ok);
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: D */
    public static final void m34051D(@NotNull final String symbol, final boolean z11, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Flowable<Object> flowableObserveOn = FlowableCompat.f54248a.m66386c(new Function0() { // from class: com.kubi.kumex.helper.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C16108t.m34053F(symbol, z11);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        Consumer<? super Object> consumer = new Consumer() { // from class: com.kubi.kumex.helper.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C16108t.m34054G(callback, z11, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.helper.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C16108t.m34055H((Throwable) obj);
            }
        };
        flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.helper.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C16108t.m34052E(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m34053F(String str, boolean z11) throws Throwable {
        RepositoryServiceLocator.f19236a.m20288g().mo24999a(MapsKt.toMap(MapsKt.mutableMapOf(new Pair("symbol", str), new Pair(ViewProps.TOP, String.valueOf(z11)))));
        return Unit.INSTANCE;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: o */
    public static final void m34070o(@NotNull final String symbol, final boolean z11, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Flowable<Object> flowableObserveOn = FlowableCompat.f54248a.m66386c(new Function0() { // from class: com.kubi.kumex.helper.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C16108t.m34074s(symbol, z11);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        Consumer<? super Object> consumer = new Consumer() { // from class: com.kubi.kumex.helper.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C16108t.m34075t(z11, function0, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.helper.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C16108t.m34076u((Throwable) obj);
            }
        };
        flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.helper.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C16108t.m34077v(function1, obj);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: p */
    public static final void m34071p(@NotNull List<String> symbols, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        m34070o(CollectionsKt.joinToString$default(symbols, ",", null, null, 0, null, null, 62, null), true, null);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m34072q(String str, boolean z11, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function0 = null;
        }
        m34070o(str, z11, function0);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m34073r(List list, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        m34071p(list, function0);
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m34074s(String str, boolean z11) throws Throwable {
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("symbol", str);
        linkedHashMap.put("favourite", String.valueOf(z11));
        interfaceC44980dM20288g.mo24999a(MapsKt.toMap(linkedHashMap));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final void m34075t(boolean z11, Function0 function0, Object obj) {
        if (z11) {
            ToastCompat.m66437C(R$string.add_favorites_ok);
        } else {
            ToastCompat.m66437C(R$string.cancel_favor_ok);
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m34078w(@NotNull final String symbol, final boolean z11, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        KuMexDepend.f30378a.m35903e().mo50705h(symbol, new Function1() { // from class: com.kubi.kumex.helper.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C16108t.m34079x(z11, symbol, ((Boolean) obj).booleanValue());
            }
        });
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m34079x(boolean z11, String str, boolean z12) {
        if (z12) {
            InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("symbol", str);
            linkedHashMap.put("favourite", String.valueOf(z11));
            interfaceC44980dM20288g.mo24990R(MapsKt.toMap(linkedHashMap));
            if (z11) {
                ToastCompat.m66437C(R$string.add_favorites_ok);
            } else {
                ToastCompat.m66437C(R$string.cancel_favor_ok);
            }
        }
        return Unit.INSTANCE;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: y */
    public static final void m34080y(@NotNull final String symbol, final boolean z11, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Flowable<Object> flowableObserveOn = FlowableCompat.f54248a.m66386c(new Function0() { // from class: com.kubi.kumex.helper.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C16108t.m34081z(symbol, z11);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        Consumer<? super Object> consumer = new Consumer() { // from class: com.kubi.kumex.helper.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C16108t.m34048A(z11, function0, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.helper.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C16108t.m34049B((Throwable) obj);
            }
        };
        flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.helper.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C16108t.m34050C(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m34081z(String str, boolean z11) throws Throwable {
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("symbol", str);
        linkedHashMap.put("favourite", String.valueOf(z11));
        linkedHashMap.put("isNetwork", CredentialEntry.FALSE_STRING);
        interfaceC44980dM20288g.mo24999a(MapsKt.toMap(linkedHashMap));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m34049B(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final void m34050C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E */
    public static final void m34052E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static final void m34054G(Function0 function0, boolean z11, Object obj) {
        function0.invoke();
        if (z11) {
            ToastCompat.m66437C(R$string.add_top_ok);
        } else {
            ToastCompat.m66437C(R$string.cancel_top_ok);
        }
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m34055H(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m34076u(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final void m34077v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
