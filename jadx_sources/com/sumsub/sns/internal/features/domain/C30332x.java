package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.domain.base.AbstractC28541a;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29121g2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29180q2;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30332x extends AbstractC28541a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29984m f60994a;

    public C30332x(C28578h c28578h) {
        this.f60994a = (InterfaceC29984m) c28578h.f58180r.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:86:0x0158  */
    /* JADX WARN: Code duplicated, block: B:88:0x015e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0163  */
    /* JADX WARN: Code duplicated, block: B:92:0x0168  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX INFO: renamed from: a */
    public final Object m70191a(C30314u c30314u, ContinuationImpl continuationImpl) {
        C30330w c30330w;
        C30314u c30314u2;
        Map map;
        String str;
        LinkedHashMap linkedHashMap;
        Map map2;
        Pair pairM90091to;
        String str2;
        Set setEmptySet;
        Object obj;
        Map map3;
        ?? EmptyList;
        Set setKeySet;
        List listM69796b;
        if (continuationImpl instanceof C30330w) {
            c30330w = (C30330w) continuationImpl;
            int i11 = c30330w.f60993f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30330w.f60993f = i11 - Integer.MIN_VALUE;
            } else {
                c30330w = new C30330w(this, continuationImpl);
            }
        } else {
            c30330w = new C30330w(this, continuationImpl);
        }
        Object objM70047c = c30330w.f60991d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30330w.f60993f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70047c);
            InterfaceC29984m interfaceC29984m = this.f60994a;
            c30330w.f60988a = c30314u;
            c30330w.f60993f = 1;
            objM70047c = ((C29967J) interfaceC29984m).m70047c(false, c30330w);
            if (objM70047c != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c30314u = c30330w.f60988a;
            ResultKt.throwOnFailure(objM70047c);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c30330w.f60990c;
            map = c30330w.f60989b;
            c30314u2 = c30330w.f60988a;
            ResultKt.throwOnFailure(objM70047c);
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) objM70047c;
        str2 = c30314u2.f60943b;
        if (str2 != null || (listM69796b = abstractC29172p.m69796b(new C29070X(str2))) == null) {
            setEmptySet = SetsKt.emptySet();
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM69796b, 10));
            Iterator it = listM69796b.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC29180q2) it.next()).f59176a);
            }
            setEmptySet = CollectionsKt.toSet(arrayList);
            if (setEmptySet == null) {
                setEmptySet = SetsKt.emptySet();
            }
        }
        if (map != null) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        map3 = obj instanceof Map ? (Map) obj : null;
        if (map3 != null || (setKeySet = map3.keySet()) == null) {
            EmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : setKeySet) {
                if (obj2 instanceof String) {
                    arrayList2.add(obj2);
                }
            }
            Set setIntersect = CollectionsKt.intersect(arrayList2, setEmptySet);
            if (setIntersect != null) {
                EmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setIntersect, 10));
                Iterator it2 = setIntersect.iterator();
                while (it2.hasNext()) {
                    EmptyList.add(AbstractC29121g2.m69769a((String) it2.next()));
                }
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
        }
        return new C30318v(str, EmptyList);
        C29124h c29124h = (C29124h) objM70047c;
        Map map4 = c29124h.f59072e;
        String str3 = c30314u.f60942a;
        if (str3 == null) {
            str3 = null;
        } else {
            Map map5 = c29124h.f59071d;
            Object obj3 = map5 != null ? map5.get("countries") : null;
            Map map6 = obj3 instanceof Map ? (Map) obj3 : null;
            if (map6 != null) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map6.entrySet()) {
                    if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap == null || !(!linkedHashMap.isEmpty())) {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    if (!(key instanceof String)) {
                        key = null;
                    }
                    String str4 = (String) key;
                    if (str4 == null) {
                        pairM90091to = null;
                    } else {
                        Object value = entry2.getValue();
                        if (!(value instanceof String)) {
                            value = null;
                        }
                        String str5 = (String) value;
                        if (str5 == null) {
                            pairM90091to = null;
                        } else {
                            pairM90091to = TuplesKt.m90091to(str4, str5);
                        }
                    }
                    if (pairM90091to != null) {
                        arrayList3.add(pairM90091to);
                    }
                }
                map2 = MapsKt.toMap(arrayList3);
            } else {
                map2 = null;
            }
            if (!(map2 != null ? map2.containsKey(str3) : false)) {
                str3 = null;
            }
        }
        InterfaceC29984m interfaceC29984m2 = this.f60994a;
        c30330w.f60988a = c30314u;
        c30330w.f60989b = map4;
        c30330w.f60990c = str3;
        c30330w.f60993f = 2;
        objM70047c = ((C29967J) interfaceC29984m2).m70043a(false, (ContinuationImpl) c30330w);
        if (objM70047c != coroutine_suspended) {
            c30314u2 = c30314u;
            map = map4;
            str = str3;
            AbstractC29172p abstractC29172p2 = (AbstractC29172p) objM70047c;
            str2 = c30314u2.f60943b;
            if (str2 != null) {
                setEmptySet = SetsKt.emptySet();
            } else {
                setEmptySet = SetsKt.emptySet();
            }
            if (map != null) {
                obj = map.get(str);
            } else {
                obj = null;
            }
            if (obj instanceof Map) {
            }
            if (map3 != null) {
                EmptyList = CollectionsKt.emptyList();
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
            return new C30318v(str, EmptyList);
        }
        return coroutine_suspended;
    }
}
