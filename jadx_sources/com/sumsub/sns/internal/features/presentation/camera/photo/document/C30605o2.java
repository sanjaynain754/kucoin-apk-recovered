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
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.o2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30605o2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61829a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30440B2 f61830b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f61831c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30520a1 f61832d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Rect f61833e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC41565d f61834f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30605o2(C30440B2 c30440b2, Context context, C30520a1 c30520a1, Rect rect, InterfaceC41565d interfaceC41565d, Continuation continuation) {
        super(2, continuation);
        this.f61830b = c30440b2;
        this.f61831c = context;
        this.f61832d = c30520a1;
        this.f61833e = rect;
        this.f61834f = interfaceC41565d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30605o2(this.f61830b, this.f61831c, this.f61832d, this.f61833e, this.f61834f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30605o2) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30605o2 c30605o2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61829a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                c30605o2 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30440B2 c30440b2 = this.f61830b;
            Context context = this.f61831c;
            C30520a1 c30520a1 = this.f61832d;
            Bitmap bitmap = c30520a1.f61633a;
            Rect rect = this.f61833e;
            C30556g1 c30556g1 = c30520a1.f61634b;
            this.f61829a = 1;
            KProperty[] kPropertyArr = C30440B2.f61279U;
            c30605o2 = this;
            if (c30440b2.m70284a(context, bitmap, rect, c30556g1, c30605o2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        c30605o2.f61830b.f61283D = false;
        InterfaceC41565d interfaceC41565d = c30605o2.f61834f;
        Unit unit = Unit.INSTANCE;
        interfaceC41565d.mo90594e(unit);
        return unit;
    }
}
