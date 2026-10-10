package com.sumsub.sns.internal.features.presentation.prooface;

import android.graphics.Bitmap;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.Z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32056Z extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f65216a;

    /* JADX INFO: renamed from: b */
    public Bitmap f65217b;

    /* JADX INFO: renamed from: c */
    public int f65218c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32109k0 f65219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32056Z(C32109k0 c32109k0, Continuation continuation) {
        super(2, continuation);
        this.f65219d = c32109k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32056Z(this.f65219d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32056Z(this.f65219d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41669n interfaceC41669n;
        Bitmap bitmap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65218c;
        if (i11 != 0) {
            if (i11 == 1) {
                bitmap = this.f65217b;
                interfaceC41669n = this.f65216a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32109k0 c32109k0 = this.f65219d;
            interfaceC41669n = c32109k0.f65352I;
            Bitmap bitmap2 = c32109k0.f65348E;
            this.f65216a = interfaceC41669n;
            this.f65217b = bitmap2;
            this.f65218c = 1;
            obj = c32109k0.getString("sns_facescan_hint_processing", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            bitmap = bitmap2;
        }
        interfaceC41669n.setValue(new C31991D(bitmap, (CharSequence) obj));
        return Unit.INSTANCE;
    }
}
