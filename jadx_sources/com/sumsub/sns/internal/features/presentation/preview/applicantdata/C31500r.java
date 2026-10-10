package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31500r extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public CharSequence f63911a;

    /* JADX INFO: renamed from: b */
    public CharSequence f63912b;

    /* JADX INFO: renamed from: c */
    public int f63913c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f63914d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31476A f63915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31500r(C31476A c31476a, Continuation continuation) {
        super(2, continuation);
        this.f63915e = c31476a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31500r c31500r = new C31500r(this.f63915e, continuation);
        c31500r.f63914d = obj;
        return c31500r;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31500r c31500r = new C31500r(this.f63915e, (Continuation) obj2);
        c31500r.f63914d = (C31494l) obj;
        return c31500r.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31494l c31494l;
        CharSequence charSequence;
        C31494l c31494l2;
        CharSequence charSequence2;
        Object string;
        CharSequence charSequence3;
        C31494l c31494l3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63913c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        CharSequence charSequence4 = this.f63912b;
                        charSequence = this.f63911a;
                        C31494l c31494l4 = (C31494l) this.f63914d;
                        ResultKt.throwOnFailure(obj);
                        charSequence3 = charSequence4;
                        c31494l3 = c31494l4;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    charSequence = this.f63911a;
                    c31494l2 = (C31494l) this.f63914d;
                    ResultKt.throwOnFailure(obj);
                    charSequence2 = (CharSequence) obj;
                    C31476A c31476a = this.f63915e;
                    this.f63914d = c31494l2;
                    this.f63911a = charSequence;
                    this.f63912b = charSequence2;
                    this.f63913c = 3;
                    string = c31476a.getString("sns_data_action_submit", this);
                    if (string != coroutine_suspended) {
                        charSequence3 = charSequence2;
                        obj = string;
                        c31494l3 = c31494l2;
                    }
                    return coroutine_suspended;
                }
            } else {
                c31494l = (C31494l) this.f63914d;
                ResultKt.throwOnFailure(obj);
            }
            return C31494l.m70756a(c31494l3, null, null, charSequence, charSequence3, (CharSequence) obj, false, 35);
        }
        ResultKt.throwOnFailure(obj);
        c31494l = (C31494l) this.f63914d;
        C31476A c31476a2 = this.f63915e;
        this.f63914d = c31494l;
        this.f63913c = 1;
        obj = c31476a2.getString("sns_step_APPLICANT_DATA_title", this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        CharSequence charSequence5 = (CharSequence) obj;
        C31476A c31476a3 = this.f63915e;
        this.f63914d = c31494l;
        this.f63911a = charSequence5;
        this.f63913c = 2;
        Object string2 = c31476a3.getString("sns_step_APPLICANT_DATA_prompt", this);
        if (string2 != coroutine_suspended) {
            C31494l c31494l5 = c31494l;
            charSequence = charSequence5;
            obj = string2;
            c31494l2 = c31494l5;
            charSequence2 = (CharSequence) obj;
            C31476A c31476a4 = this.f63915e;
            this.f63914d = c31494l2;
            this.f63911a = charSequence;
            this.f63912b = charSequence2;
            this.f63913c = 3;
            string = c31476a4.getString("sns_data_action_submit", this);
            if (string != coroutine_suspended) {
                charSequence3 = charSequence2;
                obj = string;
                c31494l3 = c31494l2;
                return C31494l.m70756a(c31494l3, null, null, charSequence, charSequence3, (CharSequence) obj, false, 35);
            }
        }
        return coroutine_suspended;
    }
}
