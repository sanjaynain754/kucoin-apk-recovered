package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.graphics.Bitmap;
import com.sumsub.sns.internal.p126ml.badphotos.C33316c;
import com.sumsub.sns.internal.p126ml.core.AbstractC33335n;
import com.sumsub.sns.internal.p126ml.core.C33332k;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.x1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30651x1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61937a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30440B2 f61938b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bitmap f61939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30651x1(C30440B2 c30440b2, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f61938b = c30440b2;
        this.f61939c = bitmap;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30651x1(this.f61938b, this.f61939c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30651x1(this.f61938b, this.f61939c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61937a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C33316c c33316c = this.f61938b.f61304e;
            if (c33316c != null) {
                Bitmap bitmap = this.f61939c;
                this.f61937a = 1;
                obj = c33316c.m71657a(new Function0() { // from class: com.sumsub.sns.internal.ml.core.q
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC33329h.m71646a(c33316c, bitmap);
                    }
                }, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new C33332k();
        }
        AbstractC33335n abstractC33335n = (AbstractC33335n) obj;
        if (abstractC33335n != null) {
            return abstractC33335n;
        }
        return new C33332k();
    }
}
