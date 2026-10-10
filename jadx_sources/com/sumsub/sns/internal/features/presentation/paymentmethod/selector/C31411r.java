package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.features.presentation.paymentmethod.C31391a;
import com.sumsub.sns.internal.features.presentation.paymentmethod.InterfaceC31392b;
import java.util.Iterator;
import java.util.List;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31411r extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C31413t f63650a;

    /* JADX INFO: renamed from: b */
    public int f63651b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31413t f63652c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f63653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31411r(C31413t c31413t, String str, Continuation continuation) {
        super(2, continuation);
        this.f63652c = c31413t;
        this.f63653d = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31411r(this.f63652c, this.f63653d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31411r(this.f63652c, this.f63653d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31413t c31413t;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63651b;
        if (i11 != 0) {
            if (i11 == 1) {
                c31413t = this.f63650a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31413t c31413t2 = this.f63652c;
            this.f63650a = c31413t2;
            this.f63651b = 1;
            int i12 = C31413t.f63654V;
            Object data = c31413t2.getData(this);
            if (data == coroutine_suspended) {
                return coroutine_suspended;
            }
            c31413t = c31413t2;
            obj = data;
        }
        int i13 = C31413t.f63654V;
        List listM70714a = c31413t.m70714a((C28075O) obj);
        String str = this.f63653d;
        Iterator it = listM70714a.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
                ((InterfaceC31392b) next).getClass();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual("bankCard", str));
        InterfaceC31392b interfaceC31392b = (InterfaceC31392b) next;
        if (interfaceC31392b == null) {
            return Unit.INSTANCE;
        }
        C31413t c31413t3 = this.f63652c;
        if (interfaceC31392b instanceof C31391a) {
            c31413t3.fireEvent(new C31405l(((C31391a) interfaceC31392b).f63617a));
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
