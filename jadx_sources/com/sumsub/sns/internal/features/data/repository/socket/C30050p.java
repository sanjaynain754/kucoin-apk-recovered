package com.sumsub.sns.internal.features.data.repository.socket;

import com.sumsub.sns.internal.core.common.AbstractC28400J;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.domain.C28598r;
import com.sumsub.sns.internal.core.domain.InterfaceC28584k;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29960C;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29973b;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.appdata.C30098e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41673r;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import okhttp3.OkHttpClient;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.time.Duration;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.socket.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30050p implements InterfaceC30035a {

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f60371a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29984m f60372b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41709m0 f60373c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC28584k f60374d;

    /* JADX INFO: renamed from: e */
    public final String f60375e;

    /* JADX INFO: renamed from: f */
    public final AbstractC46162a f60376f = AbstractC28400J.m69286a(C28468k0.f57988f);

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f60377g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f60378h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    public final InterfaceC41669n f60379i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC41678w f60380j;

    /* JADX INFO: renamed from: k */
    public final Lazy f60381k;

    /* JADX INFO: renamed from: a */
    public static final InterfaceC41673r m70076a(C30050p c30050p) {
        c30050p.getClass();
        return FlowKt__ShareKt.m90802g(C41636g.m90895S(C41636g.m90917h(C41636g.m90897U(C41636g.m90896T(C41636g.m90935r(new C30038d(C41636g.m90913f(new C30046l(c30050p, null)), c30050p)), new C30039e(c30050p, null)), new C30040f(c30050p, null)), new C30041g(null)), new C30042h(c30050p, null)), c30050p.f60373c, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, C29973b.f60208f.m70053a().f60213e, 0L, 2, null), 0, 4, null);
    }

    public C30050p(OkHttpClient okHttpClient, String str, InterfaceC29984m interfaceC29984m, InterfaceC41709m0 interfaceC41709m0, C28598r c28598r) {
        this.f60371a = okHttpClient;
        this.f60372b = interfaceC29984m;
        this.f60373c = interfaceC41709m0;
        this.f60374d = c28598r;
        this.f60375e = str + "ws/iframe?token=";
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(WebSocketRepository$ConnectionState.DISCONNECTED);
        this.f60379i = interfaceC41669nM91009a;
        this.f60380j = C41636g.m90907c(interfaceC41669nM91009a);
        this.f60381k = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.data.repository.socket.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30050p.m70076a(this.f60382b);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70077a(String str, C30098e c30098e, ContinuationImpl continuationImpl) {
        C30047m c30047m;
        String str2;
        C29973b c29973b;
        Object objInvoke;
        if (continuationImpl instanceof C30047m) {
            c30047m = (C30047m) continuationImpl;
            int i11 = c30047m.f60367f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30047m.f60367f = i11 - Integer.MIN_VALUE;
            } else {
                c30047m = new C30047m(this, continuationImpl);
            }
        } else {
            c30047m = new C30047m(this, continuationImpl);
        }
        Object obj = c30047m.f60365d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30047m.f60367f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f60377g.get() == 0) {
                C33272c.f67816e.f67810a.mo68956e("WebSocketRepository", "withLiveIfPossible(" + str + "): no active subscribers, the socket cannot connect", null);
            }
            C29973b c29973bM70053a = C29973b.f60208f.m70053a();
            if (c29973bM70053a.f60211c && this.f60380j.getValue() != WebSocketRepository$ConnectionState.CONNECTED) {
                C33272c.f67816e.f67810a.mo68955d("WebSocketRepository", "withLiveIfPossible(" + str + "): socket is down, waiting up to " + c29973bM70053a.f60212d + "ms", null);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(c29973bM70053a.f60212d, DurationUnit.MILLISECONDS);
                C30049o c30049o = new C30049o(this, null);
                c30047m.f60362a = str;
                c30047m.f60363b = c30098e;
                c30047m.f60364c = c29973bM70053a;
                c30047m.f60367f = 1;
                Object objM90470e = TimeoutKt.m90470e(duration, c30049o, c30047m);
                if (objM90470e != coroutine_suspended) {
                    str2 = str;
                    c29973b = c29973bM70053a;
                    obj = objM90470e;
                }
            } else {
                c30047m.f60362a = null;
                c30047m.f60363b = null;
                c30047m.f60364c = null;
                c30047m.f60367f = 2;
                objInvoke = c30098e.invoke(c30047m);
                if (objInvoke != coroutine_suspended) {
                    return objInvoke;
                }
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        c29973b = c30047m.f60364c;
        c30098e = c30047m.f60363b;
        str2 = c30047m.f60362a;
        ResultKt.throwOnFailure(obj);
        if (obj != null) {
            C33272c.f67816e.f67810a.mo68955d("WebSocketRepository", "withLiveIfPossible(" + str2 + "): socket came up", null);
        } else if (c29973b.f60210b) {
            this.f60378h.set(true);
            C33272c.f67816e.f67810a.mo68955d("WebSocketRepository", "withLiveIfPossible(" + str2 + "): wait timed out, arming refresh on connect", null);
            if (this.f60380j.getValue() == WebSocketRepository$ConnectionState.CONNECTED) {
                m70079a("connected while arming");
            }
        } else {
            C33272c.f67816e.f67810a.mo68955d("WebSocketRepository", "withLiveIfPossible(" + str2 + "): wait timed out", null);
        }
        c30047m.f60362a = null;
        c30047m.f60363b = null;
        c30047m.f60364c = null;
        c30047m.f60367f = 2;
        objInvoke = c30098e.invoke(c30047m);
        if (objInvoke != coroutine_suspended) {
            return coroutine_suspended;
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: a */
    public final void m70079a(String str) {
        if (this.f60378h.compareAndSet(true, false)) {
            C33272c.f67816e.f67810a.mo68955d("WebSocketRepository", "armed data refresh triggered (" + str + ")", null);
            C29967J c29967j = (C29967J) this.f60372b;
            C41696j.m91104d(c29967j.f60194b, c29967j.f60195c, null, new C29960C(c29967j, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70078a(WebSocketRepository$ConnectionState webSocketRepository$ConnectionState, String str) {
        WebSocketRepository$ConnectionState webSocketRepository$ConnectionState2 = (WebSocketRepository$ConnectionState) this.f60379i.getValue();
        if (webSocketRepository$ConnectionState2 != webSocketRepository$ConnectionState) {
            C33272c.f67816e.f67810a.mo68955d("WebSocketRepository", "connection state: " + webSocketRepository$ConnectionState2 + " -> " + webSocketRepository$ConnectionState + " (" + str + ")", null);
        }
        this.f60379i.setValue(webSocketRepository$ConnectionState);
        if (webSocketRepository$ConnectionState2 == webSocketRepository$ConnectionState || webSocketRepository$ConnectionState != WebSocketRepository$ConnectionState.CONNECTED) {
            return;
        }
        m70079a("socket connected");
    }
}
