package com.sumsub.sns.internal.features.domain;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29136j;
import com.sumsub.sns.internal.features.data.model.common.C29148l;
import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30156e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29953a f60597a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29984m f60598b;

    /* JADX WARN: Code duplicated, block: B:100:0x0199 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003d, B:54:0x00d2, B:56:0x00d6, B:57:0x0101, B:59:0x0107, B:61:0x011e, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:70:0x0146, B:80:0x015c, B:73:0x014b, B:78:0x0156, B:81:0x0160, B:84:0x0167, B:91:0x0181, B:98:0x018e, B:100:0x0199, B:101:0x019d, B:103:0x01a6, B:105:0x01aa, B:107:0x01ae, B:111:0x01b6, B:113:0x01bc, B:115:0x01c0, B:117:0x01c4, B:120:0x01cb, B:86:0x016c, B:89:0x017d, B:22:0x0054, B:35:0x008a, B:37:0x0093, B:38:0x0097, B:42:0x00a0, B:44:0x00a6, B:46:0x00aa, B:50:0x00b2, B:25:0x005a, B:31:0x0072, B:28:0x0061), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:126:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0093 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003d, B:54:0x00d2, B:56:0x00d6, B:57:0x0101, B:59:0x0107, B:61:0x011e, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:70:0x0146, B:80:0x015c, B:73:0x014b, B:78:0x0156, B:81:0x0160, B:84:0x0167, B:91:0x0181, B:98:0x018e, B:100:0x0199, B:101:0x019d, B:103:0x01a6, B:105:0x01aa, B:107:0x01ae, B:111:0x01b6, B:113:0x01bc, B:115:0x01c0, B:117:0x01c4, B:120:0x01cb, B:86:0x016c, B:89:0x017d, B:22:0x0054, B:35:0x008a, B:37:0x0093, B:38:0x0097, B:42:0x00a0, B:44:0x00a6, B:46:0x00aa, B:50:0x00b2, B:25:0x005a, B:31:0x0072, B:28:0x0061), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003d, B:54:0x00d2, B:56:0x00d6, B:57:0x0101, B:59:0x0107, B:61:0x011e, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:70:0x0146, B:80:0x015c, B:73:0x014b, B:78:0x0156, B:81:0x0160, B:84:0x0167, B:91:0x0181, B:98:0x018e, B:100:0x0199, B:101:0x019d, B:103:0x01a6, B:105:0x01aa, B:107:0x01ae, B:111:0x01b6, B:113:0x01bc, B:115:0x01c0, B:117:0x01c4, B:120:0x01cb, B:86:0x016c, B:89:0x017d, B:22:0x0054, B:35:0x008a, B:37:0x0093, B:38:0x0097, B:42:0x00a0, B:44:0x00a6, B:46:0x00aa, B:50:0x00b2, B:25:0x005a, B:31:0x0072, B:28:0x0061), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0107 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003d, B:54:0x00d2, B:56:0x00d6, B:57:0x0101, B:59:0x0107, B:61:0x011e, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:70:0x0146, B:80:0x015c, B:73:0x014b, B:78:0x0156, B:81:0x0160, B:84:0x0167, B:91:0x0181, B:98:0x018e, B:100:0x0199, B:101:0x019d, B:103:0x01a6, B:105:0x01aa, B:107:0x01ae, B:111:0x01b6, B:113:0x01bc, B:115:0x01c0, B:117:0x01c4, B:120:0x01cb, B:86:0x016c, B:89:0x017d, B:22:0x0054, B:35:0x008a, B:37:0x0093, B:38:0x0097, B:42:0x00a0, B:44:0x00a6, B:46:0x00aa, B:50:0x00b2, B:25:0x005a, B:31:0x0072, B:28:0x0061), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x011e A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003d, B:54:0x00d2, B:56:0x00d6, B:57:0x0101, B:59:0x0107, B:61:0x011e, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:70:0x0146, B:80:0x015c, B:73:0x014b, B:78:0x0156, B:81:0x0160, B:84:0x0167, B:91:0x0181, B:98:0x018e, B:100:0x0199, B:101:0x019d, B:103:0x01a6, B:105:0x01aa, B:107:0x01ae, B:111:0x01b6, B:113:0x01bc, B:115:0x01c0, B:117:0x01c4, B:120:0x01cb, B:86:0x016c, B:89:0x017d, B:22:0x0054, B:35:0x008a, B:37:0x0093, B:38:0x0097, B:42:0x00a0, B:44:0x00a6, B:46:0x00aa, B:50:0x00b2, B:25:0x005a, B:31:0x0072, B:28:0x0061), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0121  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003d, B:54:0x00d2, B:56:0x00d6, B:57:0x0101, B:59:0x0107, B:61:0x011e, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:70:0x0146, B:80:0x015c, B:73:0x014b, B:78:0x0156, B:81:0x0160, B:84:0x0167, B:91:0x0181, B:98:0x018e, B:100:0x0199, B:101:0x019d, B:103:0x01a6, B:105:0x01aa, B:107:0x01ae, B:111:0x01b6, B:113:0x01bc, B:115:0x01c0, B:117:0x01c4, B:120:0x01cb, B:86:0x016c, B:89:0x017d, B:22:0x0054, B:35:0x008a, B:37:0x0093, B:38:0x0097, B:42:0x00a0, B:44:0x00a6, B:46:0x00aa, B:50:0x00b2, B:25:0x005a, B:31:0x0072, B:28:0x0061), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0137 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003d, B:54:0x00d2, B:56:0x00d6, B:57:0x0101, B:59:0x0107, B:61:0x011e, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:70:0x0146, B:80:0x015c, B:73:0x014b, B:78:0x0156, B:81:0x0160, B:84:0x0167, B:91:0x0181, B:98:0x018e, B:100:0x0199, B:101:0x019d, B:103:0x01a6, B:105:0x01aa, B:107:0x01ae, B:111:0x01b6, B:113:0x01bc, B:115:0x01c0, B:117:0x01c4, B:120:0x01cb, B:86:0x016c, B:89:0x017d, B:22:0x0054, B:35:0x008a, B:37:0x0093, B:38:0x0097, B:42:0x00a0, B:44:0x00a6, B:46:0x00aa, B:50:0x00b2, B:25:0x005a, B:31:0x0072, B:28:0x0061), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0145  */
    /* JADX WARN: Code duplicated, block: B:72:0x014a  */
    /* JADX WARN: Code duplicated, block: B:73:0x014b A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003d, B:54:0x00d2, B:56:0x00d6, B:57:0x0101, B:59:0x0107, B:61:0x011e, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:70:0x0146, B:80:0x015c, B:73:0x014b, B:78:0x0156, B:81:0x0160, B:84:0x0167, B:91:0x0181, B:98:0x018e, B:100:0x0199, B:101:0x019d, B:103:0x01a6, B:105:0x01aa, B:107:0x01ae, B:111:0x01b6, B:113:0x01bc, B:115:0x01c0, B:117:0x01c4, B:120:0x01cb, B:86:0x016c, B:89:0x017d, B:22:0x0054, B:35:0x008a, B:37:0x0093, B:38:0x0097, B:42:0x00a0, B:44:0x00a6, B:46:0x00aa, B:50:0x00b2, B:25:0x005a, B:31:0x0072, B:28:0x0061), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0151  */
    /* JADX WARN: Code duplicated, block: B:78:0x0156 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003d, B:54:0x00d2, B:56:0x00d6, B:57:0x0101, B:59:0x0107, B:61:0x011e, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:70:0x0146, B:80:0x015c, B:73:0x014b, B:78:0x0156, B:81:0x0160, B:84:0x0167, B:91:0x0181, B:98:0x018e, B:100:0x0199, B:101:0x019d, B:103:0x01a6, B:105:0x01aa, B:107:0x01ae, B:111:0x01b6, B:113:0x01bc, B:115:0x01c0, B:117:0x01c4, B:120:0x01cb, B:86:0x016c, B:89:0x017d, B:22:0x0054, B:35:0x008a, B:37:0x0093, B:38:0x0097, B:42:0x00a0, B:44:0x00a6, B:46:0x00aa, B:50:0x00b2, B:25:0x005a, B:31:0x0072, B:28:0x0061), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x0167 A[Catch: Exception -> 0x0045, LOOP:0: B:57:0x0101->B:84:0x0167, LOOP_END, TryCatch #0 {Exception -> 0x0045, blocks: (B:14:0x003d, B:54:0x00d2, B:56:0x00d6, B:57:0x0101, B:59:0x0107, B:61:0x011e, B:64:0x0124, B:65:0x0131, B:67:0x0137, B:70:0x0146, B:80:0x015c, B:73:0x014b, B:78:0x0156, B:81:0x0160, B:84:0x0167, B:91:0x0181, B:98:0x018e, B:100:0x0199, B:101:0x019d, B:103:0x01a6, B:105:0x01aa, B:107:0x01ae, B:111:0x01b6, B:113:0x01bc, B:115:0x01c0, B:117:0x01c4, B:120:0x01cb, B:86:0x016c, B:89:0x017d, B:22:0x0054, B:35:0x008a, B:37:0x0093, B:38:0x0097, B:42:0x00a0, B:44:0x00a6, B:46:0x00aa, B:50:0x00b2, B:25:0x005a, B:31:0x0072, B:28:0x0061), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x017c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0188  */
    /* JADX WARN: Code duplicated, block: B:96:0x018b  */
    /* JADX WARN: Code duplicated, block: B:97:0x018d  */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v21, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final Object m70120a(boolean z11, ContinuationImpl continuationImpl) {
        C30105d c30105d;
        boolean z12;
        AbstractC29172p abstractC29172p;
        C29124h c29124h;
        Map mapM69771a;
        Map mapM69772a;
        Map map;
        C29136j c29136jMo69755f;
        String str;
        Object objM70035a;
        Map map2;
        String str2;
        Map map3;
        AbstractC29172p abstractC29172p2;
        ?? r11;
        String str3;
        String str4;
        Map mapM69783i;
        C29148l c29148lMo69759j;
        String str5;
        C29148l c29148lMo69759j2;
        C29136j c29136j;
        String str6;
        C29136j c29136j2;
        List listSplit$default;
        Ref.ObjectRef objectRef;
        Iterator<Integer> it;
        Object obj;
        Object obj2;
        Map map4;
        ArrayList arrayList;
        ?? map5;
        Object key;
        String str7;
        Object value;
        Pair pairM90091to;
        if (continuationImpl instanceof C30105d) {
            c30105d = (C30105d) continuationImpl;
            int i11 = c30105d.f60537j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30105d.f60537j = i11 - Integer.MIN_VALUE;
            } else {
                c30105d = new C30105d(this, continuationImpl);
            }
        } else {
            c30105d = new C30105d(this, continuationImpl);
        }
        Object objM70043a = c30105d.f60535h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30105d.f60537j;
        String str8 = null;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70043a);
                InterfaceC29984m interfaceC29984m = this.f60598b;
                z12 = z11;
                c30105d.f60528a = z12;
                c30105d.f60537j = 1;
                objM70043a = ((C29967J) interfaceC29984m).m70043a(false, (ContinuationImpl) c30105d);
                if (objM70043a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                z12 = c30105d.f60528a;
                ResultKt.throwOnFailure(objM70043a);
            } else {
                if (i12 == 2) {
                    z12 = c30105d.f60528a;
                    abstractC29172p = c30105d.f60529b;
                    ResultKt.throwOnFailure(objM70043a);
                    c29124h = (C29124h) objM70043a;
                    mapM69771a = AbstractC29130i.m69771a(c29124h);
                    if (mapM69771a == null) {
                        mapM69771a = MapsKt.emptyMap();
                    }
                    mapM69772a = AbstractC29130i.m69772a(mapM69771a, abstractC29172p);
                    if (z12) {
                        map = mapM69772a;
                    } else {
                        map = mapM69771a;
                    }
                    c29136jMo69755f = abstractC29172p.mo69755f();
                    if (c29136jMo69755f != null || (str = c29136jMo69755f.f59101a) == null || !map.containsKey(str)) {
                        str = null;
                    }
                    InterfaceC29953a interfaceC29953a = this.f60597a;
                    c30105d.f60529b = abstractC29172p;
                    c30105d.f60530c = c29124h;
                    c30105d.f60531d = mapM69771a;
                    c30105d.f60532e = mapM69772a;
                    c30105d.f60533f = map;
                    c30105d.f60534g = str;
                    c30105d.f60537j = 3;
                    objM70035a = ((C29957e) interfaceC29953a).m70035a(c30105d);
                    if (objM70035a != coroutine_suspended) {
                        map2 = mapM69772a;
                        str2 = str;
                        map3 = mapM69771a;
                        objM70043a = objM70035a;
                        abstractC29172p2 = abstractC29172p;
                    }
                    return coroutine_suspended;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = c30105d.f60534g;
                map = c30105d.f60533f;
                Map map6 = c30105d.f60532e;
                Map map7 = c30105d.f60531d;
                c29124h = c30105d.f60530c;
                abstractC29172p2 = c30105d.f60529b;
                ResultKt.throwOnFailure(objM70043a);
                map2 = map6;
                map3 = map7;
            }
            Map map8 = map;
            r11 = (Map) objM70043a;
            if (r11 != 0) {
                listSplit$default = StringsKt.split$default((CharSequence) "geoIpCountry", new char[]{(char) 47}, false, 0, 6, (Object) null);
                objectRef = new Ref.ObjectRef();
                objectRef.element = r11;
                it = RangesKt.until(0, listSplit$default.size() - 1).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                        if (!(obj instanceof String)) {
                            obj = null;
                        }
                        str3 = (String) obj;
                        break;
                    }
                    obj2 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) it).nextInt()));
                    if (obj2 instanceof Map) {
                        map4 = (Map) obj2;
                    } else {
                        map4 = null;
                    }
                    if (map4 != null) {
                        arrayList = new ArrayList();
                        for (Map.Entry entry : map4.entrySet()) {
                            key = entry.getKey();
                            if (!(key instanceof String)) {
                                key = null;
                            }
                            str7 = (String) key;
                            if (str7 != null) {
                                value = entry.getValue();
                                if (value == null) {
                                    value = null;
                                }
                                if (value == null) {
                                    pairM90091to = TuplesKt.m90091to(str7, value);
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
                        map5 = MapsKt.toMap(arrayList);
                        if (map5 == 0) {
                            objectRef.element = map5;
                        }
                    }
                    str3 = null;
                    break;
                }
                if (str3 != null || !map8.containsKey(str3)) {
                    str3 = null;
                }
            } else {
                str3 = null;
            }
            if (str2 == null) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Result.Companion companion = Result.INSTANCE;
            mapM69783i = AbstractC29130i.m69783i(c29124h);
            if (mapM69783i == null) {
                mapM69783i = MapsKt.emptyMap();
            }
            Map map9 = mapM69783i;
            c29148lMo69759j = abstractC29172p2.mo69759j();
            if (c29148lMo69759j != null || (c29136j2 = c29148lMo69759j.f59129a) == null || (str5 = c29136j2.f59101a) == null || !map8.containsKey(str5)) {
                str5 = null;
            }
            c29148lMo69759j2 = abstractC29172p2.mo69759j();
            if (c29148lMo69759j2 != null && (c29136j = c29148lMo69759j2.f59130b) != null && (str6 = c29136j.f59101a) != null && map8.containsKey(str6)) {
                str8 = str6;
            }
            return Result.m103844constructorimpl(new C30270n(map3, map9, map8, map2, str4, new C30226m(str5, str8, str3)));
            AbstractC29172p abstractC29172p3 = (AbstractC29172p) objM70043a;
            InterfaceC29984m interfaceC29984m2 = this.f60598b;
            c30105d.f60529b = abstractC29172p3;
            c30105d.f60528a = z12;
            c30105d.f60537j = 2;
            Object objM70047c = ((C29967J) interfaceC29984m2).m70047c(false, c30105d);
            if (objM70047c != coroutine_suspended) {
                abstractC29172p = abstractC29172p3;
                objM70043a = objM70047c;
                c29124h = (C29124h) objM70043a;
                mapM69771a = AbstractC29130i.m69771a(c29124h);
                if (mapM69771a == null) {
                    mapM69771a = MapsKt.emptyMap();
                }
                mapM69772a = AbstractC29130i.m69772a(mapM69771a, abstractC29172p);
                if (z12) {
                    map = mapM69771a;
                } else {
                    map = mapM69772a;
                }
                c29136jMo69755f = abstractC29172p.mo69755f();
                if (c29136jMo69755f != null) {
                    str = null;
                } else {
                    str = null;
                }
                InterfaceC29953a interfaceC29953a2 = this.f60597a;
                c30105d.f60529b = abstractC29172p;
                c30105d.f60530c = c29124h;
                c30105d.f60531d = mapM69771a;
                c30105d.f60532e = mapM69772a;
                c30105d.f60533f = map;
                c30105d.f60534g = str;
                c30105d.f60537j = 3;
                objM70035a = ((C29957e) interfaceC29953a2).m70035a(c30105d);
                if (objM70035a != coroutine_suspended) {
                    map2 = mapM69772a;
                    str2 = str;
                    map3 = mapM69771a;
                    objM70043a = objM70035a;
                    abstractC29172p2 = abstractC29172p;
                    Map map10 = map;
                    r11 = (Map) objM70043a;
                    if (r11 != 0) {
                        listSplit$default = StringsKt.split$default((CharSequence) "geoIpCountry", new char[]{(char) 47}, false, 0, 6, (Object) null);
                        objectRef = new Ref.ObjectRef();
                        objectRef.element = r11;
                        it = RangesKt.until(0, listSplit$default.size() - 1).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                                if (!(obj instanceof String)) {
                                    obj = null;
                                }
                                str3 = (String) obj;
                                break;
                            }
                            obj2 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) it).nextInt()));
                            if (obj2 instanceof Map) {
                                map4 = (Map) obj2;
                            } else {
                                map4 = null;
                            }
                            if (map4 != null) {
                                arrayList = new ArrayList();
                                while (r2.hasNext()) {
                                    key = entry.getKey();
                                    if (!(key instanceof String)) {
                                        key = null;
                                    }
                                    str7 = (String) key;
                                    if (str7 != null) {
                                        value = entry.getValue();
                                        if (value == null) {
                                            value = null;
                                        }
                                        if (value == null) {
                                            pairM90091to = TuplesKt.m90091to(str7, value);
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
                                map5 = MapsKt.toMap(arrayList);
                                if (map5 == 0) {
                                    objectRef.element = map5;
                                }
                            }
                            str3 = null;
                            break;
                        }
                        if (str3 != null) {
                            str3 = null;
                        } else {
                            str3 = null;
                        }
                    } else {
                        str3 = null;
                    }
                    if (str2 == null) {
                        str4 = str3;
                    } else {
                        str4 = str2;
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    mapM69783i = AbstractC29130i.m69783i(c29124h);
                    if (mapM69783i == null) {
                        mapM69783i = MapsKt.emptyMap();
                    }
                    Map map11 = mapM69783i;
                    c29148lMo69759j = abstractC29172p2.mo69759j();
                    if (c29148lMo69759j != null) {
                        str5 = null;
                    } else {
                        str5 = null;
                    }
                    c29148lMo69759j2 = abstractC29172p2.mo69759j();
                    if (c29148lMo69759j2 != null) {
                        str8 = str6;
                    }
                    return Result.m103844constructorimpl(new C30270n(map3, map11, map10, map2, str4, new C30226m(str5, str8, str3)));
                }
            }
            return coroutine_suspended;
        } catch (Exception e11) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(e11));
        }
    }

    public C30156e(InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        this.f60597a = interfaceC29953a;
        this.f60598b = interfaceC29984m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m70119a(C30270n c30270n, ContinuationImpl continuationImpl) {
        C30103c c30103c;
        C30270n c30270n2;
        C30270n c30270n3;
        Object objM103844constructorimpl;
        C30270n c30270n4;
        if (continuationImpl instanceof C30103c) {
            c30103c = (C30103c) continuationImpl;
            int i11 = c30103c.f60525d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30103c.f60525d = i11 - Integer.MIN_VALUE;
            } else {
                c30103c = new C30103c(this, continuationImpl);
            }
        } else {
            c30103c = new C30103c(this, continuationImpl);
        }
        Object objM70047c = c30103c.f60523b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30103c.f60525d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70047c);
            try {
                Result.Companion companion = Result.INSTANCE;
                InterfaceC29984m interfaceC29984m = this.f60598b;
                c30270n2 = c30270n;
                try {
                    c30103c.f60522a = c30270n2;
                    c30103c.f60525d = 1;
                    objM70047c = ((C29967J) interfaceC29984m).m70047c(false, c30103c);
                    if (objM70047c == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c30270n3 = c30270n2;
                } catch (Throwable th2) {
                    th = th2;
                    c30270n3 = c30270n2;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th3) {
                th = th3;
                c30270n2 = c30270n;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c30270n3 = c30103c.f60522a;
            try {
                ResultKt.throwOnFailure(objM70047c);
            } catch (Throwable th4) {
                th = th4;
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
            }
        }
        Map map = ((C29124h) objM70047c).f59072e;
        if (map == null) {
            c30270n4 = null;
        } else {
            if (map.isEmpty()) {
                map = null;
            }
            if (map == null) {
                c30270n4 = null;
            } else {
                Map map2 = c30270n3.f60856c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    boolean zContainsKey = map.containsKey(entry.getKey());
                    if (C28468k0.f57988f && !zContainsKey) {
                        Logger.DefaultImpls.v$default(C33272c.f67812a, "CountriesUseCase", "filtered out " + entry.getValue(), null, 4, null);
                    }
                    if (zContainsKey) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                String str = c30270n3.f60858e;
                c30270n4 = new C30270n(c30270n3.f60854a, c30270n3.f60855b, linkedHashMap, c30270n3.f60857d, (str == null || !linkedHashMap.containsKey(str)) ? null : str, c30270n3.f60859f);
            }
        }
        objM103844constructorimpl = Result.m103844constructorimpl(c30270n4);
        C30270n c30270n5 = (C30270n) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        return c30270n5 == null ? c30270n3 : c30270n5;
    }
}
