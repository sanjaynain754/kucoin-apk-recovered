package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.InterfaceC41565d;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.W0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30507W0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61594a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30444C2 f61595b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f61596c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30480N f61597d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Rect f61598e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC41565d f61599f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30507W0(C30444C2 c30444c2, Context context, C30480N c30480n, Rect rect, InterfaceC41565d interfaceC41565d, Continuation continuation) {
        super(2, continuation);
        this.f61595b = c30444c2;
        this.f61596c = context;
        this.f61597d = c30480n;
        this.f61598e = rect;
        this.f61599f = interfaceC41565d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30507W0(this.f61595b, this.f61596c, this.f61597d, this.f61598e, this.f61599f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30507W0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30507W0 c30507w0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61594a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                c30507w0 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30444C2 c30444c2 = this.f61595b;
            c30444c2.f61339C = false;
            Context context = this.f61596c;
            C30480N c30480n = this.f61597d;
            Bitmap bitmap = c30480n.f61519a;
            Rect rect = this.f61598e;
            C30497T c30497t = c30480n.f61520b;
            this.f61594a = 1;
            c30507w0 = this;
            if (c30444c2.m70329a(context, bitmap, rect, c30497t, c30507w0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        InterfaceC41565d interfaceC41565d = c30507w0.f61599f;
        Unit unit = Unit.INSTANCE;
        interfaceC41565d.mo90594e(unit);
        return unit;
    }
}
