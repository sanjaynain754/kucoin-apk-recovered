package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import java.io.File;
import kotlinx.coroutines.channels.InterfaceC41565d;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.y0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30655y0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61944a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30444C2 f61945b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ File f61946c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30655y0(C30444C2 c30444c2, File file, Continuation continuation) {
        super(2, continuation);
        this.f61945b = c30444c2;
        this.f61946c = file;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30655y0(this.f61945b, this.f61946c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30655y0(this.f61945b, this.f61946c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61944a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41565d interfaceC41565d = this.f61945b.f61352P;
            this.f61944a = 1;
            if (interfaceC41565d.mo90550D(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        super/*com.sumsub.sns.internal.features.presentation.camera.W*/.mo70248a(this.f61946c);
        return Unit.INSTANCE;
    }
}
