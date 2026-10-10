package com.sumsub.sns.internal.features.presentation.prooface;

import android.graphics.Bitmap;
import android.util.Size;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41668m;
import p852kotlin.ResultKt;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32035S extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65143a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32109k0 f65144b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bitmap f65145c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Size f65146d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f65147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32035S(C32109k0 c32109k0, Bitmap bitmap, Size size, String str, Continuation continuation) {
        super(2, continuation);
        this.f65144b = c32109k0;
        this.f65145c = bitmap;
        this.f65146d = size;
        this.f65147e = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32035S(this.f65144b, this.f65145c, this.f65146d, this.f65147e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32035S) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65143a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41668m interfaceC41668m = this.f65144b.f65370o;
            Triple triple = new Triple(this.f65145c, this.f65146d, this.f65147e);
            this.f65143a = 1;
            if (interfaceC41668m.emit(triple, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
