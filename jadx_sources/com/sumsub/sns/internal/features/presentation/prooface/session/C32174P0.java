package com.sumsub.sns.internal.features.presentation.prooface.session;

import android.graphics.Bitmap;
import android.util.Size;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41668m;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.P0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32174P0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65518a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32202c1 f65519b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bitmap f65520c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Size f65521d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f65522e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f65523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32174P0(C32202c1 c32202c1, Bitmap bitmap, Size size, String str, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f65519b = c32202c1;
        this.f65520c = bitmap;
        this.f65521d = size;
        this.f65522e = str;
        this.f65523f = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32174P0(this.f65519b, this.f65520c, this.f65521d, this.f65522e, this.f65523f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32174P0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65518a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41668m interfaceC41668m = this.f65519b.f65587j;
            C32160I0 c32160i0 = new C32160I0(this.f65520c, this.f65521d, this.f65522e, this.f65523f);
            this.f65518a = 1;
            if (interfaceC41668m.emit(c32160i0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
