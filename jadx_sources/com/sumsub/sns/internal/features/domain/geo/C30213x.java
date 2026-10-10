package com.sumsub.sns.internal.features.domain.geo;

import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.C29094c;
import com.sumsub.sns.internal.features.data.model.common.remote.C29233J0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29248M0;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30213x {

    /* JADX INFO: renamed from: a */
    public final C29917M f60722a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29953a f60723b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70141a(List list, ContinuationImpl continuationImpl) {
        C30212w c30212w;
        String strMo69715b;
        if (continuationImpl instanceof C30212w) {
            c30212w = (C30212w) continuationImpl;
            int i11 = c30212w.f60721c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30212w.f60721c = i11 - Integer.MIN_VALUE;
            } else {
                c30212w = new C30212w(this, continuationImpl);
            }
        } else {
            c30212w = new C30212w(this, continuationImpl);
        }
        Object obj = c30212w.f60719a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30212w.f60721c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                C29917M c29917m = this.f60722a;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C29094c c29094c = (C29094c) it.next();
                    AbstractC29103d2 abstractC29103d2 = c29094c.f59041a.f59781b;
                    C29233J0 c29233j0 = null;
                    c29233j0 = null;
                    str = null;
                    String str = null;
                    if (abstractC29103d2 != null && (strMo69715b = abstractC29103d2.mo69715b()) != null) {
                        String str2 = c29094c.f59042b;
                        if (str2 != null && !StringsKt.isBlank(str2)) {
                            str = str2;
                        }
                        c29233j0 = new C29233J0(strMo69715b, str);
                    }
                    if (c29233j0 != null) {
                        arrayList.add(c29233j0);
                    }
                }
                c30212w.f60721c = 1;
                if (((C29914J) c29917m.f60057a).f60051a.m69965a(new C29248M0(arrayList), c30212w) == coroutine_suspended) {
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
            return Result.m103844constructorimpl(ResultKt.createFailure(AbstractC28543c.m69413a(this.f60723b, e11)));
        }
    }

    public C30213x(C29917M c29917m, InterfaceC29953a interfaceC29953a) {
        this.f60722a = c29917m;
        this.f60723b = interfaceC29953a;
    }
}
