package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30406K extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61177a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30736v0 f61179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30406K(C30736v0 c30736v0, Continuation continuation) {
        super(2, continuation);
        this.f61179c = c30736v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30406K c30406k = new C30406K(this.f61179c, continuation);
        c30406k.f61178b = obj;
        return c30406k;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30406K c30406k = new C30406K(this.f61179c, (Continuation) obj2);
        c30406k.f61178b = (InterfaceC41635f) obj;
        return c30406k.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r10 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r1.emit(r10, r9) == r0) goto L34;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41635f interfaceC41635f;
        Object value;
        C30270n c30270n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61177a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    interfaceC41635f = (InterfaceC41635f) this.f61178b;
                    ResultKt.throwOnFailure(obj);
                    c30270n = (C30270n) obj;
                    this.f61178b = null;
                    this.f61177a = 3;
                }
            } else {
                interfaceC41635f = (InterfaceC41635f) this.f61178b;
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41635f interfaceC41635f2 = (InterfaceC41635f) this.f61178b;
        C30156e c30156e = this.f61179c.f62092e;
        this.f61178b = interfaceC41635f2;
        this.f61177a = 1;
        Object objM70120a = c30156e.m70120a(false, (ContinuationImpl) this);
        if (objM70120a != coroutine_suspended) {
            interfaceC41635f = interfaceC41635f2;
            value = objM70120a;
        }
        return coroutine_suspended;
        if (Result.m103850isFailureimpl(value)) {
            Exception exc = (Exception) Result.m103847exceptionOrNullimpl(value);
            C33272c c33272c = C33272c.f67812a;
            String strM71624a = AbstractC33294e.m71624a(interfaceC41635f);
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            C33272c.f67814c.mo68956e(strM71624a, message, exc);
            C30736v0 c30736v0 = this.f61179c;
            AbstractC28052C.throwError$default(c30736v0, exc, c30736v0.f62088a, null, 4, null);
        } else {
            if (Result.m103850isFailureimpl(value)) {
                value = null;
            }
            C30270n c30270n2 = (C30270n) value;
            if (c30270n2 != null) {
                C30156e c30156e2 = this.f61179c.f62092e;
                this.f61178b = interfaceC41635f;
                this.f61177a = 2;
                obj = c30156e2.m70119a(c30270n2, this);
            } else {
                c30270n = null;
                this.f61178b = null;
                this.f61177a = 3;
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
