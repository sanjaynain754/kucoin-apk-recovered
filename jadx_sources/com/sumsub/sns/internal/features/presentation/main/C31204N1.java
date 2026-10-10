package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.N1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31204N1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public CharSequence f63099a;

    /* JADX INFO: renamed from: b */
    public int f63100b;

    /* JADX INFO: renamed from: c */
    public int f63101c;

    /* JADX INFO: renamed from: d */
    public int f63102d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f63103e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C31243a2 f63104f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31204N1(C31243a2 c31243a2, Continuation continuation) {
        super(2, continuation);
        this.f63104f = c31243a2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31204N1 c31204n1 = new C31204N1(this.f63104f, continuation);
        c31204n1.f63103e = obj;
        return c31204n1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31204N1 c31204n1 = new C31204N1(this.f63104f, (Continuation) obj2);
        c31204n1.f63103e = (C31263f2) obj;
        return c31204n1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31263f2 c31263f2;
        int i11;
        int i12;
        CharSequence charSequence;
        int i13;
        C31263f2 c31263f3;
        boolean z11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = this.f63102d;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    i13 = this.f63101c;
                    CharSequence charSequence2 = this.f63099a;
                    C31263f2 c31263f4 = (C31263f2) this.f63103e;
                    ResultKt.throwOnFailure(obj);
                    charSequence = charSequence2;
                    c31263f3 = c31263f4;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                i11 = this.f63101c;
                i12 = this.f63100b;
                c31263f2 = (C31263f2) this.f63103e;
                ResultKt.throwOnFailure(obj);
            }
            if (i13 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            return C31263f2.m70662a(c31263f3, null, z11, charSequence, (CharSequence) obj, 7);
        }
        ResultKt.throwOnFailure(obj);
        C31263f2 c31263f5 = (C31263f2) this.f63103e;
        C31243a2 c31243a2 = this.f63104f;
        this.f63103e = c31263f5;
        this.f63100b = 0;
        this.f63101c = 0;
        this.f63102d = 1;
        Object string = c31243a2.getString("sns_general_progress_text", this);
        if (string != coroutine_suspended) {
            c31263f2 = c31263f5;
            obj = string;
            i11 = 0;
            i12 = 0;
        }
        return coroutine_suspended;
        CharSequence charSequence3 = (CharSequence) obj;
        C31243a2 c31243a3 = this.f63104f;
        this.f63103e = c31263f2;
        this.f63099a = charSequence3;
        this.f63100b = i12;
        this.f63101c = i11;
        this.f63102d = 2;
        Object string2 = c31243a3.getString("sns_general_loadingTakesTooLong", this);
        if (string2 != coroutine_suspended) {
            charSequence = charSequence3;
            i13 = i11;
            obj = string2;
            c31263f3 = c31263f2;
            if (i13 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            return C31263f2.m70662a(c31263f3, null, z11, charSequence, (CharSequence) obj, 7);
        }
        return coroutine_suspended;
    }
}
