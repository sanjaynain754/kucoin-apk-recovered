package com.sumsub.sns.internal.features.presentation.prooface.session;

import android.graphics.Bitmap;
import android.util.Size;
import com.sumsub.sns.internal.features.data.model.prooface.C29798A;
import com.sumsub.sns.internal.features.data.model.prooface.C29818c;
import java.io.IOException;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.X0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32189X0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65557a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32202c1 f65558b;

    public C32189X0(InterfaceC41635f interfaceC41635f, C32202c1 c32202c1) {
        this.f65557a = interfaceC41635f;
        this.f65558b = c32202c1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        if (r1.emit(r12, r6) == r0) goto L30;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) throws IOException {
        C32187W0 c32187w0;
        C32160I0 c32160i0;
        C29818c c29818c;
        InterfaceC41635f interfaceC41635f;
        if (continuation instanceof C32187W0) {
            c32187w0 = (C32187W0) continuation;
            int i11 = c32187w0.f65550b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32187w0.f65550b = i11 - Integer.MIN_VALUE;
            } else {
                c32187w0 = new C32187W0(this, continuation);
            }
        } else {
            c32187w0 = new C32187W0(this, continuation);
        }
        C32187W0 c32187w1 = c32187w0;
        Object obj2 = c32187w1.f65549a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32187w1.f65550b;
        if (i12 != 0) {
            if (i12 == 1) {
                c32160i0 = c32187w1.f65553e;
                interfaceC41635f = c32187w1.f65551c;
                ResultKt.throwOnFailure(obj2);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj2);
        InterfaceC41635f interfaceC41635f2 = this.f65557a;
        c32160i0 = (C32160I0) obj;
        C32202c1 c32202c1 = this.f65558b;
        if (c32202c1.f65588k) {
            c29818c = null;
        } else {
            C29818c c29818c2 = c32202c1.f65582e;
            if (c29818c2.f59897a != null) {
                c32202c1.f65588k = true;
                c29818c = c29818c2;
            } else {
                c29818c = null;
            }
        }
        C32156G0 c32156g0 = c32202c1.f65581d;
        Bitmap bitmap = c32160i0.f65477a;
        Size size = c32160i0.f65478b;
        String str = c32160i0.f65479c;
        c32187w1.f65551c = interfaceC41635f2;
        c32187w1.f65553e = c32160i0;
        c32187w1.f65550b = 1;
        Object objM71047a = c32156g0.m71047a(bitmap, size, str, c29818c, c32187w1);
        if (objM71047a != coroutine_suspended) {
            interfaceC41635f = interfaceC41635f2;
            obj2 = objM71047a;
        }
        return coroutine_suspended;
        Pair pairM90091to = TuplesKt.m90091to((C29798A) obj2, Boxing.boxBoolean(c32160i0.f65480d));
        c32187w1.f65551c = null;
        c32187w1.f65553e = null;
        c32187w1.f65550b = 2;
    }
}
