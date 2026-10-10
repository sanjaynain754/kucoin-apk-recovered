package com.sumsub.sns.internal.features.presentation.prooface;

import android.graphics.Bitmap;
import android.util.Size;
import com.sumsub.sns.internal.features.data.model.prooface.C29798A;
import java.io.IOException;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32135r implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65418a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32109k0 f65419b;

    public C32135r(InterfaceC41635f interfaceC41635f, C32109k0 c32109k0) {
        this.f65419b = c32109k0;
        this.f65418a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r9.emit(r10, r0) == r1) goto L26;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) throws IOException {
        C32131q c32131q;
        InterfaceC41635f interfaceC41635f;
        if (continuation instanceof C32131q) {
            c32131q = (C32131q) continuation;
            int i11 = c32131q.f65411b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32131q.f65411b = i11 - Integer.MIN_VALUE;
            } else {
                c32131q = new C32131q(this, continuation);
            }
        } else {
            c32131q = new C32131q(this, continuation);
        }
        Object obj2 = c32131q.f65410a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32131q.f65411b;
        if (i12 != 0) {
            if (i12 == 1) {
                interfaceC41635f = c32131q.f65413d;
                ResultKt.throwOnFailure(obj2);
                C29798A c29798a = (C29798A) obj2;
                if (this.f65419b.f65381z != 0) {
                    c32131q.f65413d = null;
                    c32131q.f65411b = 2;
                }
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj2);
        InterfaceC41635f interfaceC41635f2 = this.f65418a;
        Triple triple = (Triple) obj;
        C32109k0 c32109k0 = this.f65419b;
        if (c32109k0.f65381z != 0) {
            Bitmap bitmap = (Bitmap) triple.getFirst();
            Size size = (Size) triple.getSecond();
            String str = (String) triple.getThird();
            c32131q.f65413d = interfaceC41635f2;
            c32131q.f65411b = 1;
            Object objM71026a = C32109k0.m71026a(c32109k0, bitmap, size, str, c32131q);
            if (objM71026a != coroutine_suspended) {
                obj2 = objM71026a;
                interfaceC41635f = interfaceC41635f2;
                C29798A c29798a2 = (C29798A) obj2;
                if (this.f65419b.f65381z != 0) {
                    c32131q.f65413d = null;
                    c32131q.f65411b = 2;
                }
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
