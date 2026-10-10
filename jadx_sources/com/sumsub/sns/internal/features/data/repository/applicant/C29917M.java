package com.sumsub.sns.internal.features.data.repository.applicant;

import com.sumsub.sns.internal.features.data.model.common.C29038O2;
import com.sumsub.sns.internal.features.data.model.common.C29046Q2;
import com.sumsub.sns.internal.features.data.model.common.remote.response.AbstractC29517Z;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29509V;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29515Y;
import java.util.LinkedHashMap;
import java.util.Map;
import p852kotlin.ResultKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29917M {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29918a f60057a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m69997a(String str, ContinuationImpl continuationImpl) {
        C29916L c29916l;
        if (continuationImpl instanceof C29916L) {
            c29916l = (C29916L) continuationImpl;
            int i11 = c29916l.f60056c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29916l.f60056c = i11 - Integer.MIN_VALUE;
            } else {
                c29916l = new C29916L(this, continuationImpl);
            }
        } else {
            c29916l = new C29916L(this, continuationImpl);
        }
        Object objM69991d = c29916l.f60054a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29916l.f60056c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM69991d);
            InterfaceC29918a interfaceC29918a = this.f60057a;
            c29916l.f60056c = 1;
            objM69991d = ((C29914J) interfaceC29918a).f60051a.m69991d(str, c29916l);
            if (objM69991d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM69991d);
        }
        C29515Y c29515y = (C29515Y) objM69991d;
        C29509V c29509v = c29515y.f59535a;
        LinkedHashMap linkedHashMap = null;
        C29046Q2 c29046q2M69881a = c29509v != null ? AbstractC29517Z.m69881a(c29509v) : null;
        Map map = c29515y.f59536b;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), AbstractC29517Z.m69881a((C29509V) entry.getValue()));
            }
        }
        return new C29038O2(c29046q2M69881a, linkedHashMap);
    }

    public C29917M(InterfaceC29918a interfaceC29918a) {
        this.f60057a = interfaceC29918a;
    }
}
