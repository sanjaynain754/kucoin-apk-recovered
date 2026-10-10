package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.internal.features.domain.C30318v;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.q0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30690q0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f62019a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30736v0 f62020b;

    public C30690q0(InterfaceC41635f interfaceC41635f, C30736v0 c30736v0) {
        this.f62019a = interfaceC41635f;
        this.f62020b = c30736v0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r8.emit(r9, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        return r1;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C30688p0 c30688p0;
        Object objM70440a;
        InterfaceC41635f interfaceC41635f;
        if (continuation instanceof C30688p0) {
            c30688p0 = (C30688p0) continuation;
            int i11 = c30688p0.f62014b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30688p0.f62014b = i11 - Integer.MIN_VALUE;
            } else {
                c30688p0 = new C30688p0(this, continuation);
            }
        } else {
            c30688p0 = new C30688p0(this, continuation);
        }
        Object obj2 = c30688p0.f62013a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30688p0.f62014b;
        if (i12 != 0) {
            if (i12 == 1) {
                interfaceC41635f = c30688p0.f62015c;
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
        InterfaceC41635f interfaceC41635f2 = this.f62019a;
        C30318v c30318v = (C30318v) obj;
        if (c30318v == null) {
            interfaceC41635f = interfaceC41635f2;
            obj2 = null;
        } else {
            String str = c30318v.f60949a;
            if (str == null) {
                objM70440a = CollectionsKt.emptyList();
            } else {
                C30736v0 c30736v0 = this.f62020b;
                c30688p0.f62015c = interfaceC41635f2;
                c30688p0.f62014b = 1;
                int i13 = C30736v0.f62087V;
                objM70440a = c30736v0.m70440a(str, c30688p0);
            }
            obj2 = objM70440a;
            interfaceC41635f = interfaceC41635f2;
        }
        c30688p0.f62015c = null;
        c30688p0.f62014b = 2;
    }
}
