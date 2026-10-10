package com.sumsub.sns.internal.features.presentation.poa;

import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.C29046Q2;
import com.sumsub.sns.internal.features.domain.C30073G;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31469u extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63822a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63823b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31472x f63824c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32635M f63825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31469u(C31472x c31472x, C32635M c32635m, Continuation continuation) {
        super(2, continuation);
        this.f63824c = c31472x;
        this.f63825d = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31469u c31469u = new C31469u(this.f63824c, this.f63825d, continuation);
        c31469u.f63823b = obj;
        return c31469u;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31469u) create((InterfaceC41635f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L22;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41635f interfaceC41635f;
        Object objM70100a;
        boolean zAreEqual;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63822a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                interfaceC41635f = (InterfaceC41635f) this.f63823b;
                ResultKt.throwOnFailure(obj);
                objM70100a = ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        interfaceC41635f = (InterfaceC41635f) this.f63823b;
        C30073G c30073g = this.f63824c.f63839g;
        this.f63823b = interfaceC41635f;
        this.f63822a = 1;
        objM70100a = c30073g.m70100a(this);
        if (objM70100a != coroutine_suspended) {
        }
        return coroutine_suspended;
        if (Result.m103850isFailureimpl(objM70100a)) {
            objM70100a = null;
        }
        C29046Q2 c29046q2 = (C29046Q2) objM70100a;
        C31472x c31472x = this.f63824c;
        if (c29046q2 != null) {
            zAreEqual = Intrinsics.areEqual(c29046q2.f58984c, Boxing.boxBoolean(true));
        } else {
            zAreEqual = false;
        }
        c31472x.f63844l = zAreEqual;
        C32635M c32635m = this.f63825d;
        boolean z11 = this.f63824c.f63844l;
        C28936t c28936t = c32635m.f66623o;
        KProperty kProperty = C32635M.f66607x[1];
        c28936t.f58834a.set(c28936t.f58835b, Boolean.valueOf(z11));
        this.f63823b = null;
        this.f63822a = 2;
    }
}
