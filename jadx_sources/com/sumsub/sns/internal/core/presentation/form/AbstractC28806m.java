package com.sumsub.sns.internal.core.presentation.form;

import android.os.Parcelable;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28843f0;
import com.sumsub.sns.internal.core.presentation.form.model.C28807A;
import com.sumsub.sns.internal.core.presentation.form.model.C28809C;
import com.sumsub.sns.internal.core.presentation.form.model.C28817K;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem$ItemState;
import com.tencent.bugly.proguard.C33556b3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28806m {
    /* JADX WARN: Code duplicated, block: B:26:0x009c A[PHI: r10
      0x009c: PHI (r10v5 android.os.Parcelable) = 
      (r10v8 android.os.Parcelable)
      (r10v9 android.os.Parcelable)
      (r10v10 android.os.Parcelable)
      (r10v11 android.os.Parcelable)
     binds: [B:41:0x00c9, B:43:0x00d1, B:22:0x0091, B:24:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public static final List m69635a(ArrayList arrayList, ArrayList arrayList2) {
        C28817K c28817k;
        Parcelable parcelable;
        C28809C c28809c;
        if (!arrayList2.isEmpty()) {
            final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
            int size = arrayList2.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                linkedHashMap.put(((C28807A) obj).f58576a, obj);
            }
            List list = CollectionsKt.toList(linkedHashMap.keySet());
            Function1 function1 = new Function1() { // from class: com.sumsub.sns.internal.core.presentation.form.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AbstractC28806m.m69630a(linkedHashMap, (C28809C) obj2);
                }
            };
            Function1 function2 = new Function1() { // from class: com.sumsub.sns.internal.core.presentation.form.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AbstractC28806m.m69634a(linkedHashMap, (C28817K) obj2);
                }
            };
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                int size2 = arrayList.size();
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    C28801h c28801h = (C28801h) obj2;
                    List<Parcelable> list2 = c28801h.f58573d;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (Parcelable parcelable2 : list2) {
                        Parcelable parcelable3 = null;
                        parcelable3 = null;
                        parcelable3 = null;
                        if (parcelable2 instanceof C28809C) {
                            c28809c = (C28809C) parcelable2;
                            Parcelable parcelable4 = CollectionsKt.contains(list, c28809c.f58580f) ? parcelable2 : null;
                            parcelable = c28809c;
                            if (((C28809C) parcelable4) == null || (parcelable2 = (C28809C) function1.invoke(parcelable2)) == null) {
                                parcelable = c28817k;
                                parcelable = c28809c;
                                parcelable2 = parcelable;
                            } else {
                                parcelable = c28809c;
                            }
                        } else if (parcelable2 instanceof C28817K) {
                            c28817k = (C28817K) parcelable2;
                            List list3 = c28817k.f58598f;
                            if (list3 != null && !list3.isEmpty()) {
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    if (list.contains((String) it.next())) {
                                        parcelable3 = parcelable2;
                                        break;
                                    }
                                }
                            }
                            parcelable = c28817k;
                            if (((C28817K) parcelable3) == null || (parcelable2 = (C28817K) function2.invoke(parcelable2)) == null) {
                                parcelable = c28817k;
                                parcelable = c28809c;
                                parcelable2 = parcelable;
                            } else {
                                parcelable = c28817k;
                            }
                        }
                        arrayList4.add(parcelable2);
                    }
                    arrayList3.add(new C28801h(c28801h.f58570a, c28801h.f58571b, c28801h.f58572c, arrayList4));
                }
                return arrayList3;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final List m69636a(List list, FieldId fieldId, final String str) {
        return m69639a(list, CollectionsKt.listOf(fieldId), new Function1() { // from class: com.sumsub.sns.internal.core.presentation.form.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC28806m.m69627a((C28809C) obj);
            }
        }, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.form.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC28806m.m69632a(str, (C28817K) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final C28809C m69627a(C28809C c28809c) {
        C28809C c28809cM69640a = C28809C.m69640a(c28809c, null, null, null, null, null, null, 959);
        c28809cM69640a.f58668b = c28809c.f58668b;
        return c28809cM69640a;
    }

    /* JADX INFO: renamed from: a */
    public static final List m69638a(List list, FieldId fieldId, final List list2, final List list3) {
        return (list3 == null || list3.isEmpty()) ? list : m69639a(list, CollectionsKt.listOf(fieldId), new Function1() { // from class: com.sumsub.sns.internal.core.presentation.form.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC28806m.m69629a(list2, list3, (C28809C) obj);
            }
        }, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.form.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC28806m.m69633a(list2, list3, (C28817K) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final C28809C m69629a(List list, List list2, C28809C c28809c) {
        C28809C c28809cM69640a = C28809C.m69640a(c28809c, list != null ? (String) CollectionsKt.firstOrNull(list) : null, null, FormItem$ItemState.DEFAULT, null, null, (String) CollectionsKt.firstOrNull(list2), C33556b3.f69059k);
        c28809cM69640a.f58668b = c28809c.f58668b;
        return c28809cM69640a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX INFO: renamed from: a */
    public static final C28817K m69633a(List list, List list2, C28817K c28817k) {
        ?? EmptyList;
        Set<String> setKeySet;
        List<Pair> listZip;
        Map map = null;
        if (list != null && (listZip = CollectionsKt.zip(list, list2)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Pair pair : listZip) {
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                Pair pairM90091to = str2 != null ? TuplesKt.m90091to(str, str2) : null;
                if (pairM90091to != null) {
                    arrayList.add(pairM90091to);
                }
            }
            map = MapsKt.toMap(arrayList);
        }
        Map map2 = map;
        if (map2 != null && (setKeySet = map2.keySet()) != null) {
            EmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
            for (String str3 : setKeySet) {
                EmptyList.add(FormItem$ItemState.DEFAULT);
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        C28817K c28817kM69645a = C28817K.m69645a(c28817k, list, null, EmptyList, null, null, map2, 1467);
        c28817kM69645a.f58668b = c28817k.f58668b;
        return c28817kM69645a;
    }

    /* JADX INFO: renamed from: a */
    public static final List m69637a(List list, FieldId fieldId, final String str, final FormItem$ItemState formItem$ItemState) {
        return m69639a(list, CollectionsKt.listOf(fieldId), new Function1() { // from class: com.sumsub.sns.internal.core.presentation.form.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC28806m.m69628a(str, formItem$ItemState, (C28809C) obj);
            }
        }, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.form.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC28806m.m69631a(str, formItem$ItemState, (C28817K) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final C28809C m69628a(String str, FormItem$ItemState formItem$ItemState, C28809C c28809c) {
        C28809C c28809c2;
        C28809C c28809cM69640a;
        if (str != null) {
            c28809c2 = c28809c;
            c28809cM69640a = C28809C.m69640a(c28809c2, null, null, formItem$ItemState, null, null, null, 991);
        } else {
            c28809c2 = c28809c;
            c28809cM69640a = C28809C.m69640a(c28809c2, null, null, null, null, formItem$ItemState, null, 895);
        }
        c28809cM69640a.f58668b = c28809c2.f58668b;
        return c28809cM69640a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d A[PHI: r6
      0x005d: PHI (r6v5 com.sumsub.sns.internal.core.presentation.form.model.e0) = 
      (r6v4 com.sumsub.sns.internal.core.presentation.form.model.e0)
      (r6v4 com.sumsub.sns.internal.core.presentation.form.model.e0)
      (r6v7 com.sumsub.sns.internal.core.presentation.form.model.e0)
      (r6v7 com.sumsub.sns.internal.core.presentation.form.model.e0)
     binds: [B:28:0x0073, B:30:0x007b, B:17:0x0052, B:19:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public static final List m69639a(List list, List list2, Function1 function1, Function1 function2) {
        AbstractC28841e0 abstractC28841e0;
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C28801h c28801h = (C28801h) it.next();
            List<AbstractC28841e0> list3 = c28801h.f58573d;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (AbstractC28841e0 abstractC28841e1 : list3) {
                if (abstractC28841e1 instanceof C28809C) {
                    abstractC28841e0 = (C28809C) abstractC28841e1;
                    if (((C28809C) (list2.contains(AbstractC28843f0.m69656a(abstractC28841e0)) ? abstractC28841e1 : null)) == null || (abstractC28841e1 = (C28809C) function1.invoke(abstractC28841e1)) == null) {
                        abstractC28841e1 = abstractC28841e0;
                    }
                } else if (abstractC28841e1 instanceof C28817K) {
                    abstractC28841e0 = (C28817K) abstractC28841e1;
                    if (((C28817K) (list2.contains(AbstractC28843f0.m69656a(abstractC28841e0)) ? abstractC28841e1 : null)) == null || (abstractC28841e1 = (C28817K) function2.invoke(abstractC28841e1)) == null) {
                        abstractC28841e1 = abstractC28841e0;
                    }
                }
                arrayList2.add(abstractC28841e1);
            }
            arrayList.add(new C28801h(c28801h.f58570a, c28801h.f58571b, c28801h.f58572c, arrayList2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final C28809C m69630a(Map map, C28809C c28809c) {
        C28809C c28809cM69640a = C28809C.m69640a(c28809c, null, null, null, (C28807A) map.get(c28809c.f58580f), null, null, 959);
        c28809cM69640a.f58668b = c28809c.f58668b;
        return c28809cM69640a;
    }

    /* JADX INFO: renamed from: a */
    public static final C28817K m69634a(Map map, C28817K c28817k) {
        ArrayList arrayList;
        List list = c28817k.f58598f;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C28807A c28807a = (C28807A) map.get((String) it.next());
                if (c28807a != null) {
                    arrayList.add(c28807a);
                }
            }
        } else {
            arrayList = null;
        }
        C28817K c28817kM69645a = C28817K.m69645a(c28817k, null, null, null, arrayList, null, null, 1919);
        c28817kM69645a.f58668b = c28817k.f58668b;
        return c28817kM69645a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX INFO: renamed from: a */
    public static final C28817K m69631a(String str, FormItem$ItemState formItem$ItemState, C28817K c28817k) {
        C28817K c28817k2;
        C28817K c28817kM69645a;
        if (str != null) {
            List list = c28817k.f58598f;
            if (list != null) {
                int iIndexOf = list.indexOf(str);
                Integer numValueOf = Integer.valueOf(iIndexOf);
                if (iIndexOf < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    List list2 = c28817k.f58602j;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    int i11 = 0;
                    for (Object obj : list2) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        FormItem$ItemState formItem$ItemState2 = (FormItem$ItemState) obj;
                        if (iIntValue == i11) {
                            formItem$ItemState2 = formItem$ItemState;
                        }
                        arrayList.add(formItem$ItemState2);
                        i11 = i12;
                    }
                    c28817kM69645a = C28817K.m69645a(c28817k, null, null, arrayList, null, null, null, 1983);
                    c28817k2 = c28817k;
                } else {
                    c28817k2 = c28817k;
                    c28817kM69645a = c28817k2;
                }
            } else {
                c28817k2 = c28817k;
                c28817kM69645a = c28817k2;
            }
        } else {
            c28817k2 = c28817k;
            c28817kM69645a = C28817K.m69645a(c28817k2, null, null, null, null, formItem$ItemState, null, 1791);
        }
        c28817kM69645a.f58668b = c28817k2.f58668b;
        return c28817kM69645a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX INFO: renamed from: a */
    public static final C28817K m69632a(String str, C28817K c28817k) {
        ArrayList arrayList;
        if (str != null) {
            List list = c28817k.f58603k;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!Intrinsics.areEqual(((C28807A) obj).f58576a, str)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
            } else {
                arrayList = null;
            }
            C28817K c28817kM69645a = C28817K.m69645a(c28817k, null, null, null, arrayList, null, null, 1919);
            c28817kM69645a.f58668b = c28817k.f58668b;
            return c28817kM69645a;
        }
        C28817K c28817kM69645a2 = C28817K.m69645a(c28817k, null, null, null, null, null, null, 1919);
        c28817kM69645a2.f58668b = c28817k.f58668b;
        return c28817kM69645a2;
    }
}
