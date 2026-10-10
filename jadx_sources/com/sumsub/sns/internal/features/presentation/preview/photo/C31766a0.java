package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.tencent.bugly.proguard.C33627eb;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.a0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31766a0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C31916p f64546a;

    /* JADX INFO: renamed from: b */
    public int f64547b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f64548c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC31770c0 f64549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31766a0(AbstractC31770c0 abstractC31770c0, Continuation continuation) {
        super(2, continuation);
        this.f64549d = abstractC31770c0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31766a0 c31766a0 = new C31766a0(this.f64549d, continuation);
        c31766a0.f64548c = obj;
        return c31766a0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31766a0 c31766a0 = new C31766a0(this.f64549d, (Continuation) obj2);
        c31766a0.f64548c = (C31931t) obj;
        return c31766a0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31931t c31931t;
        C31916p c31916p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64547b;
        C31916p c31916pM70946a = null;
        if (i11 != 0) {
            if (i11 == 1) {
                c31916p = this.f64546a;
                c31931t = (C31931t) this.f64548c;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            c31931t = (C31931t) this.f64548c;
            C31916p c31916p2 = c31931t.f64913e;
            if (c31916p2 != null) {
                AbstractC31770c0 abstractC31770c0 = this.f64549d;
                this.f64548c = c31931t;
                this.f64546a = c31916p2;
                this.f64547b = 1;
                Object string = abstractC31770c0.getString("sns_preview_uploading_title", this);
                if (string == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c31916p = c31916p2;
                obj = string;
            }
            return C31931t.m70949a(c31931t, null, null, false, false, c31916pM70946a, 15);
        }
        String str = (String) obj;
        if (str == null) {
            str = C33627eb.f69716f;
        }
        c31916pM70946a = C31916p.m70946a(c31916p, null, new C31915o(0, str), 31);
        return C31931t.m70949a(c31931t, null, null, false, false, c31916pM70946a, 15);
    }
}
