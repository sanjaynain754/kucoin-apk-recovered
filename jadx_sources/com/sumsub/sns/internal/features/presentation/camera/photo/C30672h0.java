package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.h0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30672h0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f61982a;

    public C30672h0(InterfaceC41635f interfaceC41635f) {
        this.f61982a = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C30670g0 c30670g0;
        if (continuation instanceof C30670g0) {
            c30670g0 = (C30670g0) continuation;
            int i11 = c30670g0.f61979b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30670g0.f61979b = i11 - Integer.MIN_VALUE;
            } else {
                c30670g0 = new C30670g0(this, continuation);
            }
        } else {
            c30670g0 = new C30670g0(this, continuation);
        }
        Object obj2 = c30670g0.f61978a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30670g0.f61979b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f61982a;
            C30270n c30270n = (C30270n) obj;
            Map mapEmptyMap = c30270n != null ? c30270n.f60856c : null;
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(new C30877b((String) entry.getKey(), (String) entry.getValue()));
            }
            c30670g0.f61979b = 1;
            if (interfaceC41635f.emit(arrayList, c30670g0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
