package com.sumsub.sns.internal.core.presentation.util;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.util.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28968b extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ImageView f58880a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bitmap f58881b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28971e f58882c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f58883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28968b(ImageView imageView, Bitmap bitmap, C28971e c28971e, int i11, Continuation continuation) {
        super(2, continuation);
        this.f58880a = imageView;
        this.f58881b = bitmap;
        this.f58882c = c28971e;
        this.f58883d = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28968b(this.f58880a, this.f58881b, this.f58882c, this.f58883d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28968b) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f58880a.setImageBitmap(this.f58881b);
        return this.f58882c.f58893d.put(Boxing.boxInt(this.f58883d), this.f58881b);
    }
}
