package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.C29069W2;
import com.sumsub.sns.internal.features.data.model.common.C29110e3;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import java.util.LinkedHashMap;
import java.util.Map;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.e0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30157e0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70121a(InterfaceC29921d interfaceC29921d, C29069W2 c29069w2, ContinuationImpl continuationImpl) {
        C30106d0 c30106d0;
        if (continuationImpl instanceof C30106d0) {
            c30106d0 = (C30106d0) continuationImpl;
            int i11 = c30106d0.f60540c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30106d0.f60540c = i11 - Integer.MIN_VALUE;
            } else {
                c30106d0 = new C30106d0(this, continuationImpl);
            }
        } else {
            c30106d0 = new C30106d0(this, continuationImpl);
        }
        Object obj = c30106d0.f60538a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30106d0.f60540c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                Map map = c29069w2.f59013b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!((C29110e3) entry.getValue()).f59060a.isEmpty()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                C29069W2 c29069w2M69741a = C29069W2.m69741a(c29069w2, MapsKt.toMutableMap(linkedHashMap), 1);
                c30106d0.f60540c = 1;
                if (((C29950z) interfaceC29921d).m70008a(c29069w2M69741a, c30106d0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Exception e11) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(e11));
        }
    }
}
