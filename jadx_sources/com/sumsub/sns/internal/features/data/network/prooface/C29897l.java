package com.sumsub.sns.internal.features.data.network.prooface;

import com.sumsub.sns.internal.features.data.model.prooface.C29798A;
import com.sumsub.sns.internal.features.data.model.prooface.C29799B;
import com.sumsub.sns.internal.features.data.model.prooface.C29813P;
import com.sumsub.sns.internal.features.data.model.prooface.LivenessMessageType;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33627eb;
import kotlinx.coroutines.C41696j;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import p852kotlin.jvm.internal.Intrinsics;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.network.prooface.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29897l extends WebSocketListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C29900o f59998a;

    @Override // okhttp3.WebSocketListener
    public final void onMessage(WebSocket webSocket, String str) {
        LivenessMessageType livenessMessageType;
        try {
            AbstractC46162a abstractC46162a = this.f59998a.f60006c;
            abstractC46162a.getSerializersModule();
            C29798A c29798a = (C29798A) abstractC46162a.mo99408a(C29798A.Companion.serializer(), str);
            C29799B c29799b = LivenessMessageType.Companion;
            String str2 = c29798a.f59871a;
            c29799b.getClass();
            LivenessMessageType[] livenessMessageTypeArrValues = LivenessMessageType.values();
            int length = livenessMessageTypeArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    livenessMessageType = null;
                    break;
                }
                livenessMessageType = livenessMessageTypeArrValues[i11];
                if (Intrinsics.areEqual(livenessMessageType.getType(), str2)) {
                    break;
                } else {
                    i11++;
                }
            }
            if (livenessMessageType == null) {
                livenessMessageType = LivenessMessageType.unknown;
            }
            int i12 = AbstractC29896k.f59997a[livenessMessageType.ordinal()];
            if (i12 == 1) {
                C29900o c29900o = this.f59998a;
                c29900o.f60010g = 0;
                InterfaceC29887b interfaceC29887b = c29900o.f60012i;
                if (interfaceC29887b != null) {
                    interfaceC29887b.mo69942a(new C29893h(c29798a.f59875e));
                    return;
                }
                return;
            }
            if (i12 == 2) {
                InterfaceC29887b interfaceC29887b2 = this.f59998a.f60012i;
                if (interfaceC29887b2 != null) {
                    interfaceC29887b2.mo69942a(new C29891f(c29798a.f59875e));
                    return;
                }
                return;
            }
            if (i12 == 3) {
                InterfaceC29887b interfaceC29887b3 = this.f59998a.f60012i;
                if (interfaceC29887b3 != null) {
                    interfaceC29887b3.mo69942a(new C29889d(c29798a.f59875e));
                    return;
                }
                return;
            }
            if (i12 != 4) {
                InterfaceC29887b interfaceC29887b4 = this.f59998a.f60012i;
                if (interfaceC29887b4 != null) {
                    interfaceC29887b4.mo69942a(new C29895j(str));
                    return;
                }
                return;
            }
            InterfaceC29887b interfaceC29887b5 = this.f59998a.f60012i;
            if (interfaceC29887b5 != null) {
                interfaceC29887b5.mo69942a(new C29894i(c29798a.f59875e));
            }
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a("Liveness3dFaceRepository", "Can't parse liveness message=" + str, e11);
            InterfaceC29887b interfaceC29887b6 = this.f59998a.f60012i;
            if (interfaceC29887b6 != null) {
                interfaceC29887b6.mo69942a(new C29890e(e11));
            }
        }
    }

    public C29897l(C29900o c29900o) {
        this.f59998a = c29900o;
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosed(WebSocket webSocket, int i11, String str) {
        AbstractC32267d.m71078a("Liveness3dFaceRepository.onClosed: code=" + i11 + " reason=" + str);
        this.f59998a.f60014k = false;
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosing(WebSocket webSocket, int i11, String str) {
        AbstractC32267d.m71078a("Liveness3dFaceRepository.onClosing: code=" + i11 + " reason=" + str);
        if (i11 != 4001 && i11 != 4002) {
            this.f59998a.f60013j = true;
            return;
        }
        InterfaceC29887b interfaceC29887b = this.f59998a.f60012i;
        if (interfaceC29887b != null) {
            interfaceC29887b.mo69942a(C29892g.f59993a);
        }
        C29900o c29900o = this.f59998a;
        AbstractC32267d.m71078a("Liveness3dFaceRepository.updateToken");
        int i12 = c29900o.f60010g + 1;
        c29900o.f60010g = i12;
        if (i12 <= 3) {
            C41696j.m91104d(c29900o.f60009f, null, null, new C29899n(c29900o, null), 3, null);
            return;
        }
        AbstractC32267d.m71078a("Liveness3dFaceRepository. Max reconnect attempts reached");
        InterfaceC29887b interfaceC29887b2 = c29900o.f60012i;
        if (interfaceC29887b2 != null) {
            interfaceC29887b2.mo69942a(new C29890e(new Exception("Invalid access token")));
        }
    }

    @Override // okhttp3.WebSocketListener
    public final void onFailure(WebSocket webSocket, Throwable th2, Response response) {
        if (!this.f59998a.f60013j) {
            AbstractC32267d.m71078a("Liveness3dFaceRepository.onFailure: e=" + th2 + C33627eb.f69716f);
            InterfaceC29887b interfaceC29887b = this.f59998a.f60012i;
            if (interfaceC29887b != null) {
                interfaceC29887b.mo69942a(new C29890e(th2));
            }
        }
        this.f59998a.f60014k = false;
    }

    @Override // okhttp3.WebSocketListener
    public final void onOpen(WebSocket webSocket, Response response) {
        C29900o c29900o = this.f59998a;
        c29900o.f60013j = false;
        c29900o.f60014k = true;
        c29900o.m69944a(new C29798A(LivenessMessageType.startLivenessSession.getType(), new C29813P(c29900o.f60005b), null, 28));
    }
}
