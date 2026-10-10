package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sns.internal.features.data.model.common.remote.C29405l0;
import com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC29130i {
    /* JADX WARN: Code duplicated, block: B:51:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x005b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static final boolean m69773a(C29124h c29124h, String str) {
        Pair pairM90091to;
        try {
            ?? r11 = c29124h.f59073f;
            Object obj = null;
            if (r11 != 0) {
                List listListOf = CollectionsKt.listOf((Object[]) new String[]{"steps", str, "allowManualUpload"});
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = r11;
                Iterator<Integer> it = RangesKt.until(0, listListOf.size() - 1).iterator();
                while (it.hasNext()) {
                    Object obj2 = ((Map) objectRef.element).get(listListOf.get(((IntIterator) it).nextInt()));
                    Map map = obj2 instanceof Map ? (Map) obj2 : null;
                    if (map != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            if (!(key instanceof String)) {
                                key = null;
                            }
                            String str2 = (String) key;
                            if (str2 != null) {
                                Object value = entry.getValue();
                                if (value == null) {
                                    value = null;
                                }
                                if (value != null) {
                                    pairM90091to = TuplesKt.m90091to(str2, value);
                                }
                                if (pairM90091to != null) {
                                    arrayList.add(pairM90091to);
                                }
                            }
                            pairM90091to = null;
                            if (pairM90091to != null) {
                                arrayList.add(pairM90091to);
                            }
                        }
                        ?? map2 = MapsKt.toMap(arrayList);
                        if (map2 != 0) {
                            objectRef.element = map2;
                        }
                    }
                }
                Object obj3 = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listListOf));
                if (obj3 instanceof Boolean) {
                    obj = obj3;
                }
                obj = (Boolean) obj;
            }
            return Intrinsics.areEqual(obj, Boolean.TRUE);
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(c29124h), "Can't parse allowManualUpload " + c29124h.f59073f, e11);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public static final boolean m69775b(C29124h c29124h) {
        Object obj;
        Pair pairM90091to;
        try {
            ?? r11 = c29124h.f59073f;
            if (r11 == 0) {
                return false;
            }
            List listListOf = CollectionsKt.listOf("disableFinalStateStatusScreen");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = r11;
            Iterator<Integer> it = RangesKt.until(0, listListOf.size() - 1).iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    Object obj2 = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listListOf));
                    if (obj2 instanceof Boolean) {
                        obj = obj2;
                    }
                    obj = (Boolean) obj;
                    break;
                }
                Object obj3 = ((Map) objectRef.element).get(listListOf.get(((IntIterator) it).nextInt()));
                Map map = obj3 instanceof Map ? (Map) obj3 : null;
                if (map == null) {
                    break;
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (!(key instanceof String)) {
                        key = null;
                    }
                    String str = (String) key;
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value == null) {
                            value = null;
                        }
                        if (value != null) {
                            pairM90091to = TuplesKt.m90091to(str, value);
                        }
                        if (pairM90091to != null) {
                            arrayList.add(pairM90091to);
                        }
                    }
                    pairM90091to = null;
                    if (pairM90091to != null) {
                        arrayList.add(pairM90091to);
                    }
                }
                ?? map2 = MapsKt.toMap(arrayList);
                if (map2 == 0) {
                    break;
                }
                objectRef.element = map2;
            }
            return Intrinsics.areEqual(obj, Boolean.TRUE);
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(c29124h), "Can't parse disableFinalStateStatusScreen " + c29124h.f59073f, e11);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: c */
    public static final boolean m69777c(C29124h c29124h) {
        Object obj;
        Pair pairM90091to;
        try {
            ?? r11 = c29124h.f59073f;
            if (r11 == 0) {
                return false;
            }
            List listListOf = CollectionsKt.listOf("disablePendingScreen");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = r11;
            Iterator<Integer> it = RangesKt.until(0, listListOf.size() - 1).iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    Object obj2 = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listListOf));
                    if (obj2 instanceof Boolean) {
                        obj = obj2;
                    }
                    obj = (Boolean) obj;
                    break;
                }
                Object obj3 = ((Map) objectRef.element).get(listListOf.get(((IntIterator) it).nextInt()));
                Map map = obj3 instanceof Map ? (Map) obj3 : null;
                if (map == null) {
                    break;
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (!(key instanceof String)) {
                        key = null;
                    }
                    String str = (String) key;
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value == null) {
                            value = null;
                        }
                        if (value != null) {
                            pairM90091to = TuplesKt.m90091to(str, value);
                        }
                        if (pairM90091to != null) {
                            arrayList.add(pairM90091to);
                        }
                    }
                    pairM90091to = null;
                    if (pairM90091to != null) {
                        arrayList.add(pairM90091to);
                    }
                }
                ?? map2 = MapsKt.toMap(arrayList);
                if (map2 == 0) {
                    break;
                }
                objectRef.element = map2;
            }
            return Intrinsics.areEqual(obj, Boolean.TRUE);
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(c29124h), "Can't parse disablePendingScreen " + c29124h.f59073f, e11);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public static final boolean m69778d(C29124h c29124h) {
        Object obj;
        Pair pairM90091to;
        try {
            ?? r11 = c29124h.f59073f;
            if (r11 == 0) {
                return false;
            }
            List listListOf = CollectionsKt.listOf("disableStepsScreen");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = r11;
            Iterator<Integer> it = RangesKt.until(0, listListOf.size() - 1).iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    Object obj2 = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listListOf));
                    if (obj2 instanceof Boolean) {
                        obj = obj2;
                    }
                    obj = (Boolean) obj;
                    break;
                }
                Object obj3 = ((Map) objectRef.element).get(listListOf.get(((IntIterator) it).nextInt()));
                Map map = obj3 instanceof Map ? (Map) obj3 : null;
                if (map == null) {
                    break;
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (!(key instanceof String)) {
                        key = null;
                    }
                    String str = (String) key;
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value == null) {
                            value = null;
                        }
                        if (value != null) {
                            pairM90091to = TuplesKt.m90091to(str, value);
                        }
                        if (pairM90091to != null) {
                            arrayList.add(pairM90091to);
                        }
                    }
                    pairM90091to = null;
                    if (pairM90091to != null) {
                        arrayList.add(pairM90091to);
                    }
                }
                ?? map2 = MapsKt.toMap(arrayList);
                if (map2 == 0) {
                    break;
                }
                objectRef.element = map2;
            }
            return Intrinsics.areEqual(obj, Boolean.TRUE);
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(c29124h), "Can't parse " + c29124h.f59073f, e11);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: e */
    public static final boolean m69779e(C29124h c29124h) {
        Object obj;
        Pair pairM90091to;
        try {
            ?? r11 = c29124h.f59073f;
            if (r11 == 0) {
                return false;
            }
            List listListOf = CollectionsKt.listOf("disableTemporarilyDeclinedStatusScreen");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = r11;
            Iterator<Integer> it = RangesKt.until(0, listListOf.size() - 1).iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    Object obj2 = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listListOf));
                    if (obj2 instanceof Boolean) {
                        obj = obj2;
                    }
                    obj = (Boolean) obj;
                    break;
                }
                Object obj3 = ((Map) objectRef.element).get(listListOf.get(((IntIterator) it).nextInt()));
                Map map = obj3 instanceof Map ? (Map) obj3 : null;
                if (map == null) {
                    break;
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (!(key instanceof String)) {
                        key = null;
                    }
                    String str = (String) key;
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value == null) {
                            value = null;
                        }
                        if (value != null) {
                            pairM90091to = TuplesKt.m90091to(str, value);
                        }
                        if (pairM90091to != null) {
                            arrayList.add(pairM90091to);
                        }
                    }
                    pairM90091to = null;
                    if (pairM90091to != null) {
                        arrayList.add(pairM90091to);
                    }
                }
                ?? map2 = MapsKt.toMap(arrayList);
                if (map2 == 0) {
                    break;
                }
                objectRef.element = map2;
            }
            return Intrinsics.areEqual(obj, Boolean.TRUE);
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(c29124h), "Can't parse disableTemporarilyDeclinedStatusScreen " + c29124h.f59073f, e11);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX INFO: renamed from: f */
    public static final Map m69780f(C29124h c29124h) {
        LinkedHashMap linkedHashMap;
        Pair pairM90091to;
        Map map = c29124h.f59071d;
        Object obj = map != null ? map.get("idDocErrors") : null;
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
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
        if (linkedHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            if (!(key instanceof String)) {
                key = null;
            }
            String str = (String) key;
            if (str == null) {
                pairM90091to = null;
            } else {
                Object value = entry2.getValue();
                if (!(value instanceof String)) {
                    value = null;
                }
                String str2 = (String) value;
                if (str2 == null) {
                    pairM90091to = null;
                } else {
                    pairM90091to = TuplesKt.m90091to(str, str2);
                }
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX INFO: renamed from: g */
    public static final Map m69781g(C29124h c29124h) {
        LinkedHashMap linkedHashMap;
        Pair pairM90091to;
        Map map = c29124h.f59071d;
        Object obj = map != null ? map.get("genders") : null;
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
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
        if (linkedHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            if (!(key instanceof String)) {
                key = null;
            }
            String str = (String) key;
            if (str == null) {
                pairM90091to = null;
            } else {
                Object value = entry2.getValue();
                if (!(value instanceof String)) {
                    value = null;
                }
                String str2 = (String) value;
                if (str2 == null) {
                    pairM90091to = null;
                } else {
                    pairM90091to = TuplesKt.m90091to(str, str2);
                }
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX INFO: renamed from: h */
    public static final Map m69782h(C29124h c29124h) {
        LinkedHashMap linkedHashMap;
        Pair pairM90091to;
        Map map = c29124h.f59071d;
        Object obj = map != null ? map.get(LanguageSelectionViewModel.ARG_LANGS) : null;
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
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
        if (linkedHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            if (!(key instanceof String)) {
                key = null;
            }
            String str = (String) key;
            if (str == null) {
                pairM90091to = null;
            } else {
                Object value = entry2.getValue();
                if (!(value instanceof String)) {
                    value = null;
                }
                String str2 = (String) value;
                if (str2 == null) {
                    pairM90091to = null;
                } else {
                    pairM90091to = TuplesKt.m90091to(str, str2);
                }
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public static final LinkedHashMap m69783i(C29124h c29124h) {
        Map map = c29124h.f59074g;
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C29405l0 c29405l0 = (C29405l0) entry.getValue();
            List list = c29405l0.f59410b;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default((String) it.next(), "[^0-9]", RunnableC33958ua.f72251f, false, 4, (Object) null), "(", C33627eb.f69716f, false, 4, (Object) null), ")", C33627eb.f69716f, false, 4, (Object) null), C33820nf.f71144W, C33627eb.f69716f, false, 4, (Object) null), "+", C33627eb.f69716f, false, 4, (Object) null), "  ", C33627eb.f69716f, false, 4, (Object) null)).toString());
            }
            linkedHashMap.put(key, new C29405l0(c29405l0.f59409a, arrayList));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x005f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v12, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: j */
    public static final Boolean m69784j(C29124h c29124h) {
        Pair pairM90091to;
        if (C33048a.f67452O.m71434a()) {
            return Boolean.FALSE;
        }
        try {
            ?? r11 = c29124h.f59073f;
            if (r11 == 0) {
                return null;
            }
            List listListOf = CollectionsKt.listOf("showWelcomeWithAgreement");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = r11;
            Iterator<Integer> it = RangesKt.until(0, listListOf.size() - 1).iterator();
            while (it.hasNext()) {
                Object obj = ((Map) objectRef.element).get(listListOf.get(((IntIterator) it).nextInt()));
                Map map = obj instanceof Map ? (Map) obj : null;
                if (map != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        if (!(key instanceof String)) {
                            key = null;
                        }
                        String str = (String) key;
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value == null) {
                                value = null;
                            }
                            if (value != null) {
                                pairM90091to = TuplesKt.m90091to(str, value);
                            }
                            if (pairM90091to != null) {
                                arrayList.add(pairM90091to);
                            }
                        }
                        pairM90091to = null;
                        if (pairM90091to != null) {
                            arrayList.add(pairM90091to);
                        }
                    }
                    ?? map2 = MapsKt.toMap(arrayList);
                    if (map2 != 0) {
                        objectRef.element = map2;
                    }
                }
                return null;
            }
            Object obj2 = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listListOf));
            if (!(obj2 instanceof Boolean)) {
                obj2 = null;
            }
            return (Boolean) obj2;
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(c29124h), "Can't parse " + c29124h.f59073f, e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m69785k(C29124h c29124h) {
        C29118g c29118g = c29124h.f59091x;
        return (c29118g != null ? c29118g.f59062a : null) != null;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static final boolean m69774a(C29124h c29124h, String str, boolean z11) {
        String str2;
        Pair pairM90091to;
        try {
            ?? r11 = c29124h.f59073f;
            Object obj = null;
            if (r11 != 0) {
                if (z11) {
                    str2 = "backsideInstructionsScreen";
                } else {
                    str2 = "introScreen";
                }
                List listListOf = CollectionsKt.listOf((Object[]) new String[]{"steps", str, str2});
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = r11;
                Iterator<Integer> it = RangesKt.until(0, listListOf.size() - 1).iterator();
                while (it.hasNext()) {
                    Object obj2 = ((Map) objectRef.element).get(listListOf.get(((IntIterator) it).nextInt()));
                    Map map = obj2 instanceof Map ? (Map) obj2 : null;
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
                                if (value != null) {
                                    pairM90091to = TuplesKt.m90091to(str3, value);
                                }
                                if (pairM90091to != null) {
                                    arrayList.add(pairM90091to);
                                }
                            }
                            pairM90091to = null;
                            if (pairM90091to != null) {
                                arrayList.add(pairM90091to);
                            }
                        }
                        ?? map2 = MapsKt.toMap(arrayList);
                        if (map2 != 0) {
                            objectRef.element = map2;
                        }
                    }
                }
                Object obj3 = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listListOf));
                if (obj3 instanceof Boolean) {
                    obj = obj3;
                }
                obj = (Boolean) obj;
            }
            return Intrinsics.areEqual(obj, Boolean.TRUE);
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(c29124h), "Can't parse showIntroScreen " + c29124h.f59073f, e11);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x005b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v12, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public static final boolean m69776b(C29124h c29124h, String str) {
        Pair pairM90091to;
        try {
            ?? r11 = c29124h.f59073f;
            Object obj = null;
            if (r11 != 0) {
                List listListOf = CollectionsKt.listOf((Object[]) new String[]{"steps", str, "documentSelectorMode"});
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = r11;
                Iterator<Integer> it = RangesKt.until(0, listListOf.size() - 1).iterator();
                while (it.hasNext()) {
                    Object obj2 = ((Map) objectRef.element).get(listListOf.get(((IntIterator) it).nextInt()));
                    Map map = obj2 instanceof Map ? (Map) obj2 : null;
                    if (map != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            if (!(key instanceof String)) {
                                key = null;
                            }
                            String str2 = (String) key;
                            if (str2 != null) {
                                Object value = entry.getValue();
                                if (value == null) {
                                    value = null;
                                }
                                if (value != null) {
                                    pairM90091to = TuplesKt.m90091to(str2, value);
                                }
                                if (pairM90091to != null) {
                                    arrayList.add(pairM90091to);
                                }
                            }
                            pairM90091to = null;
                            if (pairM90091to != null) {
                                arrayList.add(pairM90091to);
                            }
                        }
                        ?? map2 = MapsKt.toMap(arrayList);
                        if (map2 != 0) {
                            objectRef.element = map2;
                        }
                    }
                }
                Object obj3 = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listListOf));
                if (obj3 instanceof String) {
                    obj = obj3;
                }
                obj = (String) obj;
            }
            return Intrinsics.areEqual(obj, "disabled");
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(c29124h), "Can't parse documentSelectorMode " + c29124h.f59073f, e11);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Map m69772a(Map map, AbstractC29172p abstractC29172p) {
        C29160n c29160nMo69760k;
        List list;
        C29160n c29160nMo69760k2;
        List list2;
        if (abstractC29172p != null && (c29160nMo69760k2 = abstractC29172p.mo69760k()) != null && (list2 = c29160nMo69760k2.f59155e) != null) {
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (list2.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap;
            }
        }
        if (abstractC29172p != null && (c29160nMo69760k = abstractC29172p.mo69760k()) != null && (list = c29160nMo69760k.f59156f) != null) {
            List list3 = list.isEmpty() ? null : list;
            if (list3 != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : map.entrySet()) {
                    if (!list3.contains(entry2.getKey())) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                return linkedHashMap2;
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX INFO: renamed from: a */
    public static final Map m69771a(C29124h c29124h) {
        LinkedHashMap linkedHashMap;
        Pair pairM90091to;
        Map map = c29124h.f59071d;
        Object obj = map != null ? map.get("countries") : null;
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
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
        if (linkedHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            if (!(key instanceof String)) {
                key = null;
            }
            String str = (String) key;
            if (str == null) {
                pairM90091to = null;
            } else {
                Object value = entry2.getValue();
                if (!(value instanceof String)) {
                    value = null;
                }
                String str2 = (String) value;
                if (str2 == null) {
                    pairM90091to = null;
                } else {
                    pairM90091to = TuplesKt.m90091to(str, str2);
                }
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: a */
    public static final String m69770a(String str, Map map) {
        if (str == null || map == 0) {
            return null;
        }
        List<String> listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{C33978va.f72339h}, false, 0, 6, (Object) null);
        if (listSplit$default.isEmpty()) {
            return null;
        }
        for (String str2 : listSplit$default) {
            if (map instanceof Map) {
                map = map;
                map = ((Map) map).get(str2);
            }
            map = map;
            if (map instanceof String) {
                return (String) map;
            }
        }
        return null;
    }
}
