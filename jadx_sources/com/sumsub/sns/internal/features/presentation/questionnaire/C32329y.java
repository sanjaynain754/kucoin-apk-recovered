package com.sumsub.sns.internal.features.presentation.questionnaire;

import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.internal.features.domain.C30084S;
import com.sumsub.sns.internal.features.domain.C30086U;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32329y implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65875a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32300I f65876b;

    public C32329y(InterfaceC41635f interfaceC41635f, C32300I c32300i) {
        this.f65875a = interfaceC41635f;
        this.f65876b = c32300i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r8.emit(r2, r0) == r1) goto L28;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) throws SNSGeneralException {
        C32328x c32328x;
        Object value;
        InterfaceC41635f interfaceC41635f;
        if (continuation instanceof C32328x) {
            c32328x = (C32328x) continuation;
            int i11 = c32328x.f65872b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32328x.f65872b = i11 - Integer.MIN_VALUE;
            } else {
                c32328x = new C32328x(this, continuation);
            }
        } else {
            c32328x = new C32328x(this, continuation);
        }
        Object obj2 = c32328x.f65871a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32328x.f65872b;
        if (i12 != 0) {
            if (i12 == 1) {
                interfaceC41635f = c32328x.f65873c;
                ResultKt.throwOnFailure(obj2);
                value = ((Result) obj2).getValue();
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj2);
        InterfaceC41635f interfaceC41635f2 = this.f65875a;
        C30086U c30086u = this.f65876b.f65801c;
        c32328x.f65873c = interfaceC41635f2;
        c32328x.f65872b = 1;
        Object objM70107a = c30086u.m70107a((String) obj, c32328x);
        if (objM70107a != coroutine_suspended) {
            value = objM70107a;
            interfaceC41635f = interfaceC41635f2;
        }
        return coroutine_suspended;
        C30084S c30084s = (C30084S) (Result.m103850isFailureimpl(value) ? null : value);
        if (c30084s == null) {
            throw new SNSGeneralException("Failed loading questionnaire.", null, Result.m103847exceptionOrNullimpl(value), 2, null);
        }
        c32328x.f65873c = null;
        c32328x.f65872b = 2;
    }
}
