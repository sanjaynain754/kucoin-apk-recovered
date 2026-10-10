package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.core.presentation.intro.AbstractC28889a;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.documents.DocumentSideness;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30312t {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29984m f60938a;

    /* JADX INFO: renamed from: b */
    public final C30220j f60939b;

    /* JADX WARN: Code duplicated, block: B:101:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x016b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v13, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final Object m70180a(Document document, String str, String str2, ContinuationImpl continuationImpl) {
        C30308r c30308r;
        Object obj;
        ?? r11;
        Pair pairM90091to;
        C29124h c29124hM70039a;
        ?? r12;
        Pair pairM90091to2;
        if (continuationImpl instanceof C30308r) {
            c30308r = (C30308r) continuationImpl;
            int i11 = c30308r.f60926c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30308r.f60926c = i11 - Integer.MIN_VALUE;
            } else {
                c30308r = new C30308r(this, continuationImpl);
            }
        } else {
            c30308r = new C30308r(this, continuationImpl);
        }
        Object objM70181a = c30308r.f60924a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30308r.f60926c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70181a);
            obj = null;
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "resolveDocumentSideness for " + str + " and " + str2, null);
            if (str != null && (c29124hM70039a = ((C29967J) this.f60938a).m70039a()) != null && (r12 = c29124hM70039a.f59072e) != 0) {
                List listListOf = CollectionsKt.listOf(str);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = r12;
                Iterator itM69668a = AbstractC28889a.m69668a(listListOf, 1, 0);
                while (true) {
                    if (!itM69668a.hasNext()) {
                        Object obj2 = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listListOf));
                        if (!(obj2 instanceof Map)) {
                            obj2 = null;
                        }
                        r11 = (Map) obj2;
                        break;
                    }
                    Object obj3 = ((Map) objectRef.element).get(listListOf.get(((IntIterator) itM69668a).nextInt()));
                    Map map = obj3 instanceof Map ? (Map) obj3 : null;
                    if (map != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            if (!(key instanceof String)) {
                                key = null;
                            }
                            String str3 = (String) key;
                            if (str3 != null) {
                                Object value = entry.getValue();
                                if (value == null) {
                                    value = null;
                                }
                                if (value == null) {
                                    pairM90091to2 = null;
                                } else {
                                    pairM90091to2 = TuplesKt.m90091to(str3, value);
                                }
                            } else {
                                pairM90091to2 = null;
                            }
                            if (pairM90091to2 != null) {
                                arrayList.add(pairM90091to2);
                            }
                        }
                        ?? map2 = MapsKt.toMap(arrayList);
                        if (map2 != 0) {
                            objectRef.element = map2;
                        }
                    }
                    r11 = 0;
                    break;
                }
            }
            r11 = 0;
            break;
            if (str2 != null) {
                if (r11 != 0) {
                    List listListOf2 = CollectionsKt.listOf((Object[]) new String[]{str2, "doubleSided"});
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = r11;
                    Iterator itM69668a2 = AbstractC28889a.m69668a(listListOf2, 1, 0);
                    while (true) {
                        if (!itM69668a2.hasNext()) {
                            Object obj4 = ((Map) objectRef2.element).get(CollectionsKt.lastOrNull(listListOf2));
                            obj = (Boolean) (obj4 instanceof Boolean ? obj4 : null);
                            break;
                        }
                        Object obj5 = ((Map) objectRef2.element).get(listListOf2.get(((IntIterator) itM69668a2).nextInt()));
                        Map map3 = obj5 instanceof Map ? (Map) obj5 : null;
                        if (map3 == null) {
                            break;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Map.Entry entry2 : map3.entrySet()) {
                            Object key2 = entry2.getKey();
                            if (!(key2 instanceof String)) {
                                key2 = null;
                            }
                            String str4 = (String) key2;
                            if (str4 != null) {
                                Object value2 = entry2.getValue();
                                if (value2 == null) {
                                    value2 = null;
                                }
                                if (value2 == null) {
                                    pairM90091to = null;
                                } else {
                                    pairM90091to = TuplesKt.m90091to(str4, value2);
                                }
                            } else {
                                pairM90091to = null;
                            }
                            if (pairM90091to != null) {
                                arrayList2.add(pairM90091to);
                            }
                        }
                        ?? map4 = MapsKt.toMap(arrayList2);
                        if (map4 == 0) {
                            break;
                        }
                        objectRef2.element = map4;
                    }
                }
            } else if (str != null) {
                c30308r.f60926c = 1;
                objM70181a = m70181a(document, str, (Map) r11, c30308r);
                if (objM70181a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (Intrinsics.areEqual(obj, Boxing.boxBoolean(true))) {
                return DocumentSideness.DOUBLE;
            }
            return Intrinsics.areEqual(obj, Boxing.boxBoolean(false)) ? DocumentSideness.SINGLE : DocumentSideness.UNKNOWN;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objM70181a);
        obj = (Boolean) objM70181a;
        if (Intrinsics.areEqual(obj, Boxing.boxBoolean(true))) {
            return DocumentSideness.DOUBLE;
        }
        if (Intrinsics.areEqual(obj, Boxing.boxBoolean(false))) {
        }
    }

    public C30312t(InterfaceC29984m interfaceC29984m, C30220j c30220j) {
        this.f60938a = interfaceC29984m;
        this.f60939b = c30220j;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final Object m70181a(Document document, String str, Map map, ContinuationImpl continuationImpl) {
        C30310s c30310s;
        T t11;
        Pair pairM90091to;
        if (continuationImpl instanceof C30310s) {
            c30310s = (C30310s) continuationImpl;
            int i11 = c30310s.f60935d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30310s.f60935d = i11 - Integer.MIN_VALUE;
            } else {
                c30310s = new C30310s(this, continuationImpl);
            }
        } else {
            c30310s = new C30310s(this, continuationImpl);
        }
        Object objM70144a = c30310s.f60933b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30310s.f60935d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70144a);
            C30220j c30220j = this.f60939b;
            c30310s.f60932a = map;
            c30310s.f60935d = 1;
            objM70144a = c30220j.m70144a(document, str, c30310s);
            if (objM70144a == coroutine_suspended) {
                t11 = map;
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map2 = c30310s.f60932a;
            ResultKt.throwOnFailure(objM70144a);
            t11 = map2;
        }
        t11 = map;
        Iterable iterable = (Iterable) objM70144a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (t11 != 0) {
                List listListOf = CollectionsKt.listOf((Object[]) new String[]{str2, "doubleSided"});
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = t11;
                Iterator itM69668a = AbstractC28889a.m69668a(listListOf, 1, 0);
                while (true) {
                    if (itM69668a.hasNext()) {
                        Object obj2 = ((Map) objectRef.element).get(listListOf.get(((IntIterator) itM69668a).nextInt()));
                        Map map3 = obj2 instanceof Map ? (Map) obj2 : null;
                        if (map3 == null) {
                            break;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Map.Entry entry : map3.entrySet()) {
                            Object key = entry.getKey();
                            if (!(key instanceof String)) {
                                key = null;
                            }
                            String str3 = (String) key;
                            if (str3 != null) {
                                Object value = entry.getValue();
                                if (value == null) {
                                    value = null;
                                }
                                if (value == null) {
                                    pairM90091to = null;
                                } else {
                                    pairM90091to = TuplesKt.m90091to(str3, value);
                                }
                            } else {
                                pairM90091to = null;
                            }
                            if (pairM90091to != null) {
                                arrayList2.add(pairM90091to);
                            }
                        }
                        ?? map4 = MapsKt.toMap(arrayList2);
                        if (map4 == 0) {
                            break;
                        }
                        objectRef.element = map4;
                    } else {
                        Object obj3 = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listListOf));
                        obj = (Boolean) (obj3 instanceof Boolean ? obj3 : null);
                        break;
                    }
                }
            }
            arrayList.add(obj);
        }
        Set set = CollectionsKt.toSet(arrayList);
        if (set.size() != 1) {
            set = null;
        }
        if (set != null) {
            return (Boolean) CollectionsKt.first(set);
        }
        return null;
    }
}
