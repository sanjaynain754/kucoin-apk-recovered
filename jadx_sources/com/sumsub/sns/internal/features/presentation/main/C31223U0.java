package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.U0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31223U0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public CharSequence f63157a;

    /* JADX INFO: renamed from: b */
    public int f63158b;

    /* JADX INFO: renamed from: c */
    public int f63159c;

    /* JADX INFO: renamed from: d */
    public int f63160d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f63161e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C31251c2 f63162f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31223U0(C31251c2 c31251c2, Continuation continuation) {
        super(2, continuation);
        this.f63162f = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31223U0 c31223u0 = new C31223U0(this.f63162f, continuation);
        c31223u0.f63161e = obj;
        return c31223u0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31223U0 c31223u0 = new C31223U0(this.f63162f, (Continuation) obj2);
        c31223u0.f63161e = (C31263f2) obj;
        return c31223u0.invokeSuspend(Unit.INSTANCE);
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
        int i14 = this.f63160d;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    i13 = this.f63159c;
                    CharSequence charSequence2 = this.f63157a;
                    C31263f2 c31263f4 = (C31263f2) this.f63161e;
                    ResultKt.throwOnFailure(obj);
                    charSequence = charSequence2;
                    c31263f3 = c31263f4;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                i11 = this.f63159c;
                i12 = this.f63158b;
                c31263f2 = (C31263f2) this.f63161e;
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
        C31263f2 c31263f5 = (C31263f2) this.f63161e;
        C31251c2 c31251c2 = this.f63162f;
        this.f63161e = c31263f5;
        this.f63158b = 0;
        this.f63159c = 0;
        this.f63160d = 1;
        Object string = c31251c2.getString("sns_general_progress_text", this);
        if (string != coroutine_suspended) {
            c31263f2 = c31263f5;
            obj = string;
            i11 = 0;
            i12 = 0;
        }
        return coroutine_suspended;
        CharSequence charSequence3 = (CharSequence) obj;
        C31251c2 c31251c3 = this.f63162f;
        this.f63161e = c31263f2;
        this.f63157a = charSequence3;
        this.f63158b = i12;
        this.f63159c = i11;
        this.f63160d = 2;
        Object string2 = c31251c3.getString("sns_general_loadingTakesTooLong", this);
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
