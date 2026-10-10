package com.sumsub.sns.internal.core.domain.facedetector;

import android.graphics.Bitmap;
import com.sumsub.sns.internal.p126ml.core.AbstractC33335n;
import com.sumsub.sns.internal.p126ml.facedetector.C33355a;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.facedetector.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28570p extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f58132a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28572r f58133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bitmap f58134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28570p(C28572r c28572r, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f58133b = c28572r;
        this.f58134c = bitmap;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28570p(this.f58133b, this.f58134c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28570p(this.f58133b, this.f58134c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58132a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C33355a c33355a = this.f58133b.f58138b;
            if (c33355a != null) {
                Bitmap bitmap = this.f58134c;
                this.f58132a = 1;
                obj = c33355a.m71657a(new Function0() { // from class: com.sumsub.sns.internal.ml.core.q
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC33329h.m71646a(c33355a, bitmap);
                    }
                }, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return null;
            }
        }
        return (AbstractC33335n) obj;
    }
}
