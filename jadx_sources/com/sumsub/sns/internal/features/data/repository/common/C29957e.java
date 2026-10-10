package com.sumsub.sns.internal.features.data.repository.common;

import android.content.Context;
import com.sumsub.sentry.android.C27913a;
import com.sumsub.sentry.android.C27919g;
import com.sumsub.sns.core.data.listener.SNSStateChangedHandler;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.internal.core.common.AbstractC28393F0;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.util.root.C33410a;
import com.sumsub.sns.internal.util.root.C33412c;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41783z1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.common.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29957e implements InterfaceC29953a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29954b f60155a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n f60156b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41678w f60157c;

    /* JADX INFO: renamed from: d */
    public Map f60158d;

    /* JADX INFO: renamed from: e */
    public final C27913a f60159e;

    /* JADX INFO: renamed from: f */
    public final C33410a f60160f;

    /* JADX INFO: renamed from: g */
    public final C27919g f60161g;

    /* JADX INFO: renamed from: h */
    public final C33412c f60162h;

    /* JADX INFO: renamed from: a */
    public final void m70036a(SNSSDKState sNSSDKState) {
        Exception exception;
        SNSException network;
        SNSSDKState sNSSDKState2 = (SNSSDKState) this.f60156b.getValue();
        if (Intrinsics.areEqual(sNSSDKState2, sNSSDKState)) {
            return;
        }
        C33272c.f67816e.f67810a.mo68955d(AbstractC33294e.m71624a(this), "The SDK state was changed: " + sNSSDKState2 + " -> " + sNSSDKState, null);
        if (sNSSDKState2 != null) {
            try {
                SNSStateChangedHandler stateChangedHandler = C28468k0.f57983a.getStateChangedHandler();
                if (stateChangedHandler != null) {
                    stateChangedHandler.onStateChanged(sNSSDKState2, sNSSDKState);
                }
            } catch (Exception e11) {
                C33272c c33272c = C33272c.f67812a;
                String strM71624a = AbstractC33294e.m71624a(this);
                String message = e11.getMessage();
                if (message == null) {
                    message = "";
                }
                C33272c.f67814c.mo68956e(strM71624a, message, e11);
            }
        }
        C28468k0.f57989g = sNSSDKState;
        this.f60156b.setValue(sNSSDKState);
        if (!(sNSSDKState instanceof SNSSDKState.Failed) || (exception = ((SNSSDKState.Failed) sNSSDKState).getException()) == null) {
            return;
        }
        Exception exc = exception instanceof CancellationException ? null : exception;
        if (exc != null) {
            Map map = AbstractC28393F0.f57880a;
            if (exc instanceof SNSException) {
                network = (SNSException) exc;
            } else {
                network = exc instanceof IOException ? new SNSException.Network(exc) : new SNSException.Internal(exc);
            }
            AbstractC28393F0.m69278a(network);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70037b(ContinuationImpl continuationImpl) {
        C29956d c29956d;
        if (continuationImpl instanceof C29956d) {
            c29956d = (C29956d) continuationImpl;
            int i11 = c29956d.f60154c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29956d.f60154c = i11 - Integer.MIN_VALUE;
            } else {
                c29956d = new C29956d(this, continuationImpl);
            }
        } else {
            c29956d = new C29956d(this, continuationImpl);
        }
        Object objM70031b = c29956d.f60152a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29956d.f60154c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70031b);
                InterfaceC29954b interfaceC29954b = this.f60155a;
                c29956d.f60154c = 1;
                objM70031b = interfaceC29954b.m70031b(c29956d);
                if (objM70031b == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70031b);
            }
            Response response = (Response) objM70031b;
            int iCode = response.code();
            if (iCode == 200) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m103844constructorimpl(response.body());
            }
            if (iCode == 204) {
                return Result.m103844constructorimpl(null);
            }
            String str = "Unexpected response code: " + response.code();
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(new IllegalStateException(str)));
        } catch (Exception e11) {
            C41783z1.m91406l(c29956d.getContext());
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(e11));
        }
    }

    public C29957e(Context context, InterfaceC29954b interfaceC29954b) {
        this.f60155a = interfaceC29954b;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(null);
        this.f60156b = interfaceC41669nM91009a;
        this.f60157c = C41636g.m90907c(interfaceC41669nM91009a);
        C27913a c27913a = new C27913a();
        this.f60159e = c27913a;
        this.f60160f = new C33410a(context);
        this.f60161g = new C27919g(context, c27913a, 28);
        this.f60162h = new C33412c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70035a(ContinuationImpl continuationImpl) {
        C29955c c29955c;
        C29957e c29957e;
        if (continuationImpl instanceof C29955c) {
            c29955c = (C29955c) continuationImpl;
            int i11 = c29955c.f60151d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29955c.f60151d = i11 - Integer.MIN_VALUE;
            } else {
                c29955c = new C29955c(this, continuationImpl);
            }
        } else {
            c29955c = new C29955c(this, continuationImpl);
        }
        Object objM70033d = c29955c.f60149b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29955c.f60151d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70033d);
            if (this.f60158d == null) {
                InterfaceC29954b interfaceC29954b = this.f60155a;
                c29955c.f60148a = this;
                c29955c.f60151d = 1;
                objM70033d = interfaceC29954b.m70033d(c29955c);
                if (objM70033d == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c29957e = this;
            }
            return this.f60158d;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c29957e = c29955c.f60148a;
        ResultKt.throwOnFailure(objM70033d);
        c29957e.f60158d = (Map) objM70033d;
        return this.f60158d;
    }
}
