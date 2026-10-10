package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.internal.features.domain.C30318v;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.n0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30684n0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f62006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30736v0 f62007b;

    public C30684n0(InterfaceC41635f interfaceC41635f, C30736v0 c30736v0) {
        this.f62006a = interfaceC41635f;
        this.f62007b = c30736v0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r9.emit(r10, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        return r1;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C30682m0 c30682m0;
        Object objM70439a;
        InterfaceC41635f interfaceC41635f;
        if (continuation instanceof C30682m0) {
            c30682m0 = (C30682m0) continuation;
            int i11 = c30682m0.f62002b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30682m0.f62002b = i11 - Integer.MIN_VALUE;
            } else {
                c30682m0 = new C30682m0(this, continuation);
            }
        } else {
            c30682m0 = new C30682m0(this, continuation);
        }
        Object obj2 = c30682m0.f62001a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30682m0.f62002b;
        if (i12 != 0) {
            if (i12 == 1) {
                interfaceC41635f = c30682m0.f62003c;
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
        InterfaceC41635f interfaceC41635f2 = this.f62006a;
        C30318v c30318v = (C30318v) obj;
        if (c30318v == null) {
            interfaceC41635f = interfaceC41635f2;
            obj2 = null;
        } else {
            String str = c30318v.f60949a;
            if (str == null) {
                objM70439a = CollectionsKt.emptyList();
            } else {
                C30736v0 c30736v0 = this.f62007b;
                c30682m0.f62003c = interfaceC41635f2;
                c30682m0.f62002b = 1;
                int i13 = C30736v0.f62087V;
                objM70439a = c30736v0.m70439a(c30318v, str, c30682m0);
            }
            obj2 = objM70439a;
            interfaceC41635f = interfaceC41635f2;
        }
        c30682m0.f62003c = null;
        c30682m0.f62002b = 2;
    }
}
