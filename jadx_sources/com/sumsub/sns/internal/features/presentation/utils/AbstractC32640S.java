package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29140j3;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import java.util.Iterator;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC32640S {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m71259a(InterfaceC29984m interfaceC29984m, Document document, ContinuationImpl continuationImpl) {
        C32639Q c32639q;
        Object next;
        C29140j3 c29140j3Mo69761l;
        if (continuationImpl instanceof C32639Q) {
            c32639q = (C32639Q) continuationImpl;
            int i11 = c32639q.f66636c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32639q.f66636c = i11 - Integer.MIN_VALUE;
            } else {
                c32639q = new C32639Q(continuationImpl);
            }
        } else {
            c32639q = new C32639Q(continuationImpl);
        }
        Object objM70042a = c32639q.f66635b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32639q.f66636c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            c32639q.f66634a = document;
            c32639q.f66636c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c32639q);
            if (objM70042a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            document = c32639q.f66634a;
            ResultKt.throwOnFailure(objM70042a);
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        List list = (abstractC29172p == null || (c29140j3Mo69761l = abstractC29172p.mo69761l()) == null) ? null : c29140j3Mo69761l.f59118b;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((Document) next).getType(), document.getType()));
            Document document2 = (Document) next;
            if (document2 != null && ((document2.isApproved() || document2.isSubmitted() || document2.isReviewing()) && !document2.isRejected())) {
                return new C28494t(true);
            }
        }
        return null;
    }
}
