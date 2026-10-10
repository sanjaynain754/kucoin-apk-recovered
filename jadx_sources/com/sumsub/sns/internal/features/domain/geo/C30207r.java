package com.sumsub.sns.internal.features.domain.geo;

import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.model.geo.C29791a;
import com.sumsub.sns.internal.features.data.model.geo.C29794d;
import com.sumsub.sns.internal.features.data.model.geo.C29795e;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30207r {

    /* JADX INFO: renamed from: a */
    public final C29917M f60703a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29953a f60704b;

    /* JADX INFO: renamed from: c */
    public final C30198i f60705c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70137a(String str, C29795e c29795e, ContinuationImpl continuationImpl) {
        C30206q c30206q;
        if (continuationImpl instanceof C30206q) {
            c30206q = (C30206q) continuationImpl;
            int i11 = c30206q.f60702c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30206q.f60702c = i11 - Integer.MIN_VALUE;
            } else {
                c30206q = new C30206q(this, continuationImpl);
            }
        } else {
            c30206q = new C30206q(this, continuationImpl);
        }
        Object objM70136a = c30206q.f60700a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30206q.f60702c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70136a);
                C29791a c29791aM70134a = this.f60705c.m70134a(str, c29795e);
                c30206q.f60702c = 1;
                objM70136a = m70136a(c29791aM70134a, c30206q);
                if (objM70136a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70136a);
            }
            return (InterfaceC30204o) objM70136a;
        } catch (Exception e11) {
            return new C30200k(AbstractC28543c.m69413a(this.f60704b, e11));
        }
    }

    public C30207r(C29917M c29917m, InterfaceC29953a interfaceC29953a, C30198i c30198i) {
        this.f60703a = c29917m;
        this.f60704b = interfaceC29953a;
        this.f60705c = c30198i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70136a(C29791a c29791a, ContinuationImpl continuationImpl) {
        C30205p c30205p;
        if (continuationImpl instanceof C30205p) {
            c30205p = (C30205p) continuationImpl;
            int i11 = c30205p.f60699c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30205p.f60699c = i11 - Integer.MIN_VALUE;
            } else {
                c30205p = new C30205p(this, continuationImpl);
            }
        } else {
            c30205p = new C30205p(this, continuationImpl);
        }
        Object objM69979a = c30205p.f60697a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30205p.f60699c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM69979a);
            C29917M c29917m = this.f60703a;
            c30205p.f60699c = 1;
            objM69979a = ((C29914J) c29917m.f60057a).f60051a.m69979a(RequestBody.Companion.create$default(RequestBody.INSTANCE, c29791a.f59861a, MediaType.INSTANCE.parse("application/json"), 0, 0, 6, (Object) null), c30205p);
            if (objM69979a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM69979a);
        }
        C29794d c29794d = (C29794d) objM69979a;
        List listEmptyList = c29794d.f59864a;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listEmptyList) {
            if (!Intrinsics.areEqual((String) obj, "uncertainGpsLocation")) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return new C30203n(arrayList, c29794d.f59866c);
        }
        if (listEmptyList.contains("uncertainGpsLocation")) {
            return new C30202m(c29794d.f59866c);
        }
        Map mapEmptyMap = c29794d.f59865b;
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return new C30201l(mapEmptyMap, c29794d.f59866c);
    }
}
