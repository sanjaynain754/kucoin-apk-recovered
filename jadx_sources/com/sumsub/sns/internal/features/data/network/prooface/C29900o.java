package com.sumsub.sns.internal.features.data.network.prooface;

import com.sumsub.sns.internal.core.domain.C28598r;
import com.sumsub.sns.internal.core.domain.InterfaceC28584k;
import com.sumsub.sns.internal.features.data.model.prooface.C29798A;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.network.prooface.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29900o {

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f60004a;

    /* JADX INFO: renamed from: b */
    public final String f60005b;

    /* JADX INFO: renamed from: c */
    public final AbstractC46162a f60006c;

    /* JADX INFO: renamed from: d */
    public final String f60007d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC28584k f60008e;

    /* JADX INFO: renamed from: g */
    public int f60010g;

    /* JADX INFO: renamed from: h */
    public WebSocket f60011h;

    /* JADX INFO: renamed from: i */
    public InterfaceC29887b f60012i;

    /* JADX INFO: renamed from: j */
    public boolean f60013j;

    /* JADX INFO: renamed from: k */
    public boolean f60014k;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41709m0 f60009f = C41713n0.m91125a(C41782z0.m91392b());

    /* JADX INFO: renamed from: l */
    public final C29897l f60015l = new C29897l(this);

    /* JADX INFO: renamed from: a */
    public final void m69944a(C29798A c29798a) {
        AbstractC32267d.m71078a("Liveness3dFaceRepository.send: " + c29798a.f59871a + " isClosed=" + this.f60013j);
        if (this.f60013j) {
            return;
        }
        WebSocket webSocket = this.f60011h;
        if (webSocket != null) {
            AbstractC46162a abstractC46162a = this.f60006c;
            abstractC46162a.getSerializersModule();
            webSocket.send(abstractC46162a.mo99409b(C29798A.Companion.serializer(), c29798a));
        } else {
            InterfaceC29887b interfaceC29887b = this.f60012i;
            if (interfaceC29887b != null) {
                interfaceC29887b.mo69942a(C29888c.f59989a);
            }
        }
    }

    public C29900o(OkHttpClient okHttpClient, String str, AbstractC46162a abstractC46162a, String str2, C28598r c28598r) {
        this.f60004a = okHttpClient;
        this.f60005b = str;
        this.f60006c = abstractC46162a;
        this.f60007d = str2;
        this.f60008e = c28598r;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m69943a(InterfaceC29887b interfaceC29887b, ContinuationImpl continuationImpl) {
        C29898m c29898m;
        C29900o c29900o;
        if (continuationImpl instanceof C29898m) {
            c29898m = (C29898m) continuationImpl;
            int i11 = c29898m.f60002d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29898m.f60002d = i11 - Integer.MIN_VALUE;
            } else {
                c29898m = new C29898m(this, continuationImpl);
            }
        } else {
            c29898m = new C29898m(this, continuationImpl);
        }
        Object objMo69411a = c29898m.f60000b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29898m.f60002d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo69411a);
            this.f60010g = 0;
            this.f60012i = interfaceC29887b;
            InterfaceC28584k interfaceC28584k = this.f60008e;
            c29898m.f59999a = this;
            c29898m.f60002d = 1;
            objMo69411a = interfaceC28584k.mo69411a(c29898m);
            if (objMo69411a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c29900o = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c29900o = c29898m.f59999a;
            ResultKt.throwOnFailure(objMo69411a);
        }
        c29900o.m69945a((String) objMo69411a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m69945a(String str) {
        try {
            AbstractC32267d.m71078a("Liveness3dFaceRepository.newWebSocket");
            WebSocket webSocket = this.f60011h;
            if (webSocket != null) {
                webSocket.close(1000, "reconnect");
            }
            this.f60011h = null;
            this.f60011h = this.f60004a.newWebSocket(new Request.Builder().url(this.f60007d + "ws/liveness?token=" + str).build(), this.f60015l);
        } catch (Exception e11) {
            InterfaceC29887b interfaceC29887b = this.f60012i;
            if (interfaceC29887b != null) {
                interfaceC29887b.mo69942a(new C29890e(e11));
            }
        }
    }
}
