package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29035O;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29980i;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32260u extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65719a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32109k0 f65720b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32260u(C32109k0 c32109k0, Continuation continuation) {
        super(2, continuation);
        this.f65720b = c32109k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32260u c32260u = new C32260u(this.f65720b, continuation);
        c32260u.f65719a = obj;
        return c32260u;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32260u c32260u = new C32260u(this.f65720b, (Continuation) obj2);
        c32260u.f65719a = (C29980i) obj;
        return c32260u.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC29971N abstractC29971N;
        AbstractC29172p abstractC29172p;
        int i11;
        C29124h c29124h;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C29980i c29980i = (C29980i) this.f65719a;
        if (c29980i != null && (c29124h = (C29124h) c29980i.f60240b.m70051c()) != null && AbstractC29130i.m69785k(c29124h)) {
            return Unit.INSTANCE;
        }
        if (c29980i != null && (abstractC29971N = c29980i.f60239a) != null && (abstractC29172p = (AbstractC29172p) abstractC29971N.m70051c()) != null) {
            List list = abstractC29172p.mo69761l().f59118b;
            int i12 = 0;
            if (list != null && list.isEmpty()) {
                i11 = 0;
            } else {
                Iterator it = list.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (StringsKt.startsWith$default(((Document) it.next()).getType().f59014a, "SELFIE", false, 2, (Object) null) && (i11 = i11 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            List listSortedWith = CollectionsKt.sortedWith(list, new C29035O(abstractC29172p));
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listSortedWith) {
                if (StringsKt.startsWith$default(((Document) obj2).getType().f59014a, "SELFIE", false, 2, (Object) null)) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i13 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    Document document = (Document) obj3;
                    if (document.isSubmitted() && (document.isApproved() || document.isReviewing())) {
                        i13++;
                        if (i13 < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                i12 = i13;
            }
            if (i12 == i11) {
                AbstractC32267d.m71078a("Selfie already submitted, aborting liveness check");
                AbstractC28052C.finish$default(this.f65720b, new C28494t(), null, null, null, 14, null);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
