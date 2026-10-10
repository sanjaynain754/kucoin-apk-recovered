package com.sumsub.sns.internal.core.presentation.util;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.sumsub.sns.internal.core.common.AbstractC28385B0;
import java.io.File;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.util.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28969c extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f58884a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f58885b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f58886c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f58887d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C28971e f58888e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ImageView f58889f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28969c(File file, int i11, int i12, C28971e c28971e, ImageView imageView, Continuation continuation) {
        super(2, continuation);
        this.f58885b = file;
        this.f58886c = i11;
        this.f58887d = i12;
        this.f58888e = c28971e;
        this.f58889f = imageView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28969c(this.f58885b, this.f58886c, this.f58887d, this.f58888e, this.f58889f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28969c) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58884a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Bitmap bitmapM69274a = AbstractC28385B0.m69274a(this.f58885b, this.f58886c, this.f58887d);
            AbstractC41586e2 abstractC41586e2M91393c = C41782z0.m91393c();
            C28968b c28968b = new C28968b(this.f58889f, bitmapM69274a, this.f58888e, this.f58887d, null);
            this.f58884a = 1;
            if (C41686h.m91049g(abstractC41586e2M91393c, c28968b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.f58888e.f58891b.remove(this.f58889f);
        return Unit.INSTANCE;
    }
}
