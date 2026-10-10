package com.sumsub.sns.internal.features.domain;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29180q2;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p852kotlin.ResultKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30220j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29984m f60746a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70144a(Document document, String str, ContinuationImpl continuationImpl) {
        C30218i c30218i;
        List list;
        Set setKeySet;
        Map map;
        if (continuationImpl instanceof C30218i) {
            c30218i = (C30218i) continuationImpl;
            int i11 = c30218i.f60740e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30218i.f60740e = i11 - Integer.MIN_VALUE;
            } else {
                c30218i = new C30218i(this, continuationImpl);
            }
        } else {
            c30218i = new C30218i(this, continuationImpl);
        }
        Object objM70042a = c30218i.f60738c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30218i.f60740e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = this.f60746a;
            c30218i.f60736a = document;
            c30218i.f60737b = str;
            c30218i.f60740e = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c30218i);
            if (objM70042a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c30218i.f60737b;
            document = c30218i.f60736a;
            ResultKt.throwOnFailure(objM70042a);
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        if (abstractC29172p == null) {
            C33272c c33272c = C33272c.f67812a;
            Logger.DefaultImpls.e$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), AbstractC33294e.m71624a(this), "getIdDocTypesForCountry(), applicant is null", null, 4, null);
            return CollectionsKt.emptyList();
        }
        List listM69796b = abstractC29172p.m69796b(document.getType());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM69796b, 10));
        Iterator it = listM69796b.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC29180q2) it.next()).f59176a);
        }
        List list2 = CollectionsKt.toList(arrayList);
        C29124h c29124hM70039a = ((C29967J) this.f60746a).m70039a();
        Object obj = (c29124hM70039a == null || (map = c29124hM70039a.f59072e) == null) ? null : map.get(str);
        Map map2 = obj instanceof Map ? (Map) obj : null;
        Set setIntersect = (map2 == null || (setKeySet = map2.keySet()) == null) ? null : CollectionsKt.intersect(setKeySet, CollectionsKt.toSet(list2));
        if (setIntersect != null) {
            Set set = setIntersect.isEmpty() ? null : setIntersect;
            if (set != null && (list = CollectionsKt.toList(set)) != null) {
                return list;
            }
        }
        return list2;
    }

    public C30220j(InterfaceC29984m interfaceC29984m) {
        this.f60746a = interfaceC29984m;
    }
}
