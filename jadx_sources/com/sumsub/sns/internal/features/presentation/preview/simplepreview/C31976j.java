package com.sumsub.sns.internal.features.presentation.preview.simplepreview;

import android.graphics.Bitmap;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.simplepreview.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31976j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65013a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65014b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28075O f65015c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31977k f65016d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31976j(C28075O c28075o, C31977k c31977k, Continuation continuation) {
        super(2, continuation);
        this.f65015c = c28075o;
        this.f65016d = c31977k;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31976j c31976j = new C31976j(this.f65015c, this.f65016d, continuation);
        c31976j.f65014b = obj;
        return c31976j;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31976j) create((InterfaceC41635f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r1.emit(r3, r8) == r0) goto L23;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41635f interfaceC41635f;
        String strM70061a;
        String strM70061a2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65013a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                interfaceC41635f = (InterfaceC41635f) this.f65014b;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        interfaceC41635f = (InterfaceC41635f) this.f65014b;
        AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
        C31975i c31975i = new C31975i(this.f65016d, null);
        this.f65014b = interfaceC41635f;
        this.f65013a = 1;
        obj = C41686h.m91049g(abstractC41697j0M91392b, c31975i, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        Bitmap bitmap = (Bitmap) obj;
        C29983l c29983l = this.f65015c.f57271c;
        if (c29983l != null) {
            strM70061a = c29983l.m70061a("sns_preview_general_action_confirm");
        } else {
            strM70061a = null;
        }
        C29983l c29983l2 = this.f65015c.f57271c;
        if (c29983l2 != null) {
            strM70061a2 = c29983l2.m70061a("sns_preview_general_action_retake");
        } else {
            strM70061a2 = null;
        }
        C31973g c31973g = new C31973g(bitmap, strM70061a, strM70061a2);
        this.f65014b = null;
        this.f65013a = 2;
    }
}
