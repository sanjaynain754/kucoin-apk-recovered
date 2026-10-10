package com.sumsub.sns.internal.features.presentation.camera.video;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30792y extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C30786s f62213a;

    /* JADX INFO: renamed from: b */
    public CharSequence f62214b;

    /* JADX INFO: renamed from: c */
    public int f62215c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f62216d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30763G f62217e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30792y(C30763G c30763g, Continuation continuation) {
        super(2, continuation);
        this.f62217e = c30763g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30792y c30792y = new C30792y(this.f62217e, continuation);
        c30792y.f62216d = obj;
        return c30792y;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30792y c30792y = new C30792y(this.f62217e, (Continuation) obj2);
        c30792y.f62216d = (C30785r) obj;
        return c30792y.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30786s c30786s;
        C30785r c30785r;
        CharSequence charSequence;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62215c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    charSequence = this.f62214b;
                    c30786s = this.f62213a;
                    c30785r = (C30785r) this.f62216d;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                c30786s = this.f62213a;
                c30785r = (C30785r) this.f62216d;
                ResultKt.throwOnFailure(obj);
            }
            return C30785r.m70456a(c30785r, new C30786s(c30786s.f62196a, charSequence, (CharSequence) obj), null, 2);
        }
        ResultKt.throwOnFailure(obj);
        C30785r c30785r2 = (C30785r) this.f62216d;
        c30786s = c30785r2.f62194a;
        C30763G c30763g = this.f62217e;
        this.f62216d = c30785r2;
        this.f62213a = c30786s;
        this.f62215c = 1;
        Object string = c30763g.getString("sns_step_SELFIE_recording_header", this);
        if (string != coroutine_suspended) {
            c30785r = c30785r2;
            obj = string;
        }
        return coroutine_suspended;
        CharSequence charSequence2 = (CharSequence) obj;
        C30763G c30763g2 = this.f62217e;
        this.f62216d = c30785r;
        this.f62213a = c30786s;
        this.f62214b = charSequence2;
        this.f62215c = 2;
        Object string2 = c30763g2.getString("sns_step_SELFIE_recording_instructions", this);
        if (string2 != coroutine_suspended) {
            charSequence = charSequence2;
            obj = string2;
            return C30785r.m70456a(c30785r, new C30786s(c30786s.f62196a, charSequence, (CharSequence) obj), null, 2);
        }
        return coroutine_suspended;
    }
}
