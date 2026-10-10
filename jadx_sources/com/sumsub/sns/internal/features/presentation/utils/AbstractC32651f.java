package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28811E;
import com.sumsub.sns.internal.core.presentation.form.model.C28821O;
import com.sumsub.sns.internal.core.presentation.form.model.C28827V;
import com.sumsub.sns.internal.core.presentation.form.model.C28831Z;
import com.sumsub.sns.internal.core.presentation.form.model.C28859q;
import com.sumsub.sns.internal.core.presentation.form.model.C28861s;
import com.sumsub.sns.internal.core.presentation.intro.AbstractC28892d;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28990D;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C28987C1;
import com.sumsub.sns.internal.features.data.model.common.C28997E1;
import com.sumsub.sns.internal.features.data.model.common.C29005G1;
import com.sumsub.sns.internal.features.data.model.common.C29013I1;
import com.sumsub.sns.internal.features.data.model.common.C29021K1;
import com.sumsub.sns.internal.features.data.model.common.C29029M1;
import com.sumsub.sns.internal.features.data.model.common.C29037O1;
import com.sumsub.sns.internal.features.data.model.common.C29045Q1;
import com.sumsub.sns.internal.features.data.model.common.C29051S0;
import com.sumsub.sns.internal.features.data.model.common.C29052S1;
import com.sumsub.sns.internal.features.data.model.common.C29059U0;
import com.sumsub.sns.internal.features.data.model.common.C29060U1;
import com.sumsub.sns.internal.features.data.model.common.C29067W0;
import com.sumsub.sns.internal.features.data.model.common.C29068W1;
import com.sumsub.sns.internal.features.data.model.common.C29075Y0;
import com.sumsub.sns.internal.features.data.model.common.C29076Y1;
import com.sumsub.sns.internal.features.data.model.common.C29084a1;
import com.sumsub.sns.internal.features.data.model.common.C29085a2;
import com.sumsub.sns.internal.features.data.model.common.C29096c1;
import com.sumsub.sns.internal.features.data.model.common.C29120g1;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29136j;
import com.sumsub.sns.internal.features.data.model.common.C29156m1;
import com.sumsub.sns.internal.features.data.model.common.C29168o1;
import com.sumsub.sns.internal.features.data.model.common.C29179q1;
import com.sumsub.sns.internal.features.data.model.common.C29691s1;
import com.sumsub.sns.internal.features.data.model.common.C29701u1;
import com.sumsub.sns.internal.features.data.model.common.C29719y;
import com.sumsub.sns.internal.features.data.model.common.FieldType;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29494N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.appdata.C30095b;
import com.sumsub.sns.internal.features.domain.appdata.C30100g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC32651f {
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f1 A[PHI: r6
      0x00f1: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v6 java.lang.String) binds: [B:70:0x00dd, B:77:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap m71274a(List list, Map map, String str, C30095b c30095b) {
        String str2;
        C29136j c29136jMo69755f;
        C29136j c29136jMo69755f2;
        String str3;
        C29136j c29136jMo69755f3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        AbstractC29172p abstractC29172p = c30095b.f60490a;
        Map map2 = c30095b.f60493d;
        C29059U0 c29059u0 = C29059U0.f59007b;
        String str4 = (String) linkedHashMap.get("country");
        Object obj = null;
        if (str4 != null) {
            if (!map2.containsKey(str4)) {
                str4 = null;
            }
            if (str4 != null) {
                str = str4;
            } else if (str != null) {
                str = null;
            } else {
                str = null;
            }
        } else if (str != null || !map2.containsKey(str)) {
            str = null;
        }
        linkedHashMap.put("country", str);
        if (m71275a(list, C29021K1.f58964b)) {
            C29067W0 c29067w0 = C29067W0.f59009b;
            if (!m71275a(list, c29067w0)) {
                String strM71281a = (String) linkedHashMap.get("countryOfBirth");
                if (strM71281a == null) {
                    strM71281a = abstractC29172p != null ? AbstractC32659j.m71281a(abstractC29172p, c29067w0) : null;
                }
                linkedHashMap.put("countryOfBirth", strM71281a);
            }
        }
        if (m71275a(list, C29045Q1.f58981b)) {
            String str5 = (String) linkedHashMap.get("taxResidenceCountry");
            if (str5 == null) {
                str5 = (abstractC29172p == null || (c29136jMo69755f3 = abstractC29172p.mo69755f()) == null) ? null : c29136jMo69755f3.f59102b;
            }
            if (str5 == null || !map2.containsKey(str5)) {
                str5 = null;
            }
            linkedHashMap.put("taxResidenceCountry", str5);
            if (m71275a(list, C29052S1.f58989b)) {
                if (str5 == null) {
                    Object obj2 = linkedHashMap.get("country");
                    str5 = (String) (m71275a(list, c29059u0) ? obj2 : null);
                }
                linkedHashMap.put("msdk_local_tin_validation_country", str5);
            }
        } else if (m71275a(list, C29052S1.f58989b)) {
            if (!m71275a(list, c29059u0) || (str2 = (String) linkedHashMap.get("country")) == null || !map2.containsKey(str2)) {
                str2 = null;
            }
            if (abstractC29172p != null && (c29136jMo69755f2 = abstractC29172p.mo69755f()) != null && (str3 = c29136jMo69755f2.f59102b) != null) {
                if (!map2.containsKey(str3)) {
                    str3 = null;
                }
                if (str3 != null) {
                    obj = str3;
                } else if (str2 == null) {
                    obj = str2;
                } else {
                    obj = str2;
                }
            } else if (str2 == null || (abstractC29172p != null && (c29136jMo69755f = abstractC29172p.mo69755f()) != null && (str2 = c29136jMo69755f.f59101a) != null && map2.containsKey(str2))) {
                obj = str2;
            }
            linkedHashMap.put("msdk_local_tin_validation_country", obj);
        }
        return AbstractC28458h.m69336a((Map) linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:169:0x038a  */
    /* JADX WARN: Code duplicated, block: B:190:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX INFO: renamed from: a */
    public static final AbstractC28841e0 m71269a(C29719y c29719y, String str, C29124h c29124h, C30095b c30095b, final C29983l c29983l, Function2 function2, CharSequence charSequence, boolean z11, Boolean bool, Map map, Map map2) {
        boolean z12;
        boolean z13;
        Map mapEmptyMap;
        Function2 function3 = function2 == null ? new Function2() { // from class: com.sumsub.sns.internal.features.presentation.utils.e0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC32651f.m71272a(c29983l, (String) obj, (String) obj2);
            }
        } : function2;
        Map map3 = c30095b.f60493d;
        Map map4 = c30095b.f60494e;
        Map map5 = c30095b.f60495f;
        Map map6 = c30095b.f60492c;
        AbstractC29103d2 abstractC29103d2 = c29719y.f59781b;
        List listArrayListOf = null;
        String strMo69715b = abstractC29103d2 != null ? abstractC29103d2.mo69715b() : null;
        String str2 = strMo69715b != null ? (String) map.get(strMo69715b) : null;
        if (bool != null) {
            if (bool.booleanValue()) {
                z12 = false;
            } else {
                z12 = true;
            }
        } else {
            if (Intrinsics.areEqual(c29719y.f59788i, Boolean.TRUE)) {
                String str3 = strMo69715b != null ? (String) map2.get(strMo69715b) : null;
                if (str3 != null && str3.length() != 0) {
                    z12 = false;
                }
            }
            z12 = true;
        }
        if (Intrinsics.areEqual(c29719y.f59781b, C29059U0.f59007b)) {
            return new C28859q("appdata", m71270a(c29719y, c29983l, (String) null, function3), map3, str2, z12, charSequence, 64);
        }
        if (Intrinsics.areEqual(c29719y.f59781b, C29045Q1.f58981b)) {
            return new C28859q("appdata", m71270a(c29719y, c29983l, (String) null, function3), map3, str2, z12, charSequence, 64);
        }
        AbstractC29103d2 abstractC29103d3 = c29719y.f59781b;
        if (abstractC29103d3 instanceof C29068W1) {
            return new C28811E(m71270a(c29719y, c29983l, (String) null, function3), "appdata");
        }
        if (abstractC29103d3 instanceof C29060U1) {
            String strMo69727c = c29719y.mo69727c();
            String strM70061a = c29983l.m70061a("sns_data_tax_information_country");
            String strM70061a2 = c29719y.f59787h;
            if (strM70061a2 == null) {
                if (c29719y.f59782c) {
                    strM70061a2 = c29983l.m70061a("sns_data_placeholder_required");
                } else {
                    strM70061a2 = c29983l.m70061a("sns_data_placeholder_optional");
                }
            }
            return new C28859q("appdata", new C29470F(strMo69727c, strM70061a, (String) null, (String) null, Boolean.valueOf(c29719y.f59782c), (String) null, strM70061a2, (String) null, (List) null, 940), map3, str2, z12, charSequence, 64);
        }
        if (abstractC29103d3 instanceof C29076Y1) {
            String str4 = (String) map.get(new C29060U1(((C29076Y1) abstractC29103d3).f59018b).f59051a);
            C30100g c30100gM71278a = AbstractC32657i.m71278a(str4 != null ? str4 : "", c29124h, c29983l);
            String str5 = ((C29076Y1) c29719y.f59781b).f59051a;
            CharSequence charSequence2 = c30100gM71278a.f60512a;
            C29470F c29470f = new C29470F(str5, charSequence2 != null ? charSequence2.toString() : null, c30100gM71278a.f60515d, (String) null, Boolean.valueOf(c29719y.f59782c), "android_tetxt_cap_words", c30100gM71278a.f60514c, (String) null, (List) null, 904);
            List list = c29719y.f59785f;
            if (list != null && (!list.isEmpty())) {
                listArrayListOf = c29719y.f59785f;
            } else {
                String str6 = c29719y.f59784e;
                if (str6 != null) {
                    listArrayListOf = CollectionsKt.arrayListOf(str6);
                }
            }
            return new C28831Z(c29470f, "appdata", str2, z12, charSequence, listArrayListOf, str4, 64);
        }
        if (Intrinsics.areEqual(abstractC29103d3, C29120g1.f59067b)) {
            return new C28827V(m71271a(c29719y, c29983l, m71273a(map6), function3, null), "appdata", str2, z12, charSequence, 32);
        }
        if (Intrinsics.areEqual(c29719y.f59781b, C29084a1.f59035b)) {
            return new C28831Z(m71270a(c29719y, c29983l, "email", function3), "appdata", str2, z12, charSequence, (List) null, (String) null, 224);
        }
        if (Intrinsics.areEqual(c29719y.f59781b, C28987C1.f58906b)) {
            C29470F c29470fM71270a = m71270a(c29719y, c29983l, (String) null, function3);
            C29124h c29124h2 = c30095b.f60491b;
            if (c29124h2 == null || (mapEmptyMap = c29124h2.f59074g) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            return new C28821O("appdata", c29470fM71270a, map4, mapEmptyMap, str, true, str2, charSequence, z12);
        }
        C29051S0 c29051s0 = AbstractC29103d2.Companion;
        AbstractC29103d2 abstractC29103d4 = c29719y.f59781b;
        c29051s0.getClass();
        C29075Y0 c29075y0 = C29075Y0.f59017b;
        if (!Intrinsics.areEqual(abstractC29103d4, c29075y0) && !Intrinsics.areEqual(abstractC29103d4, C29156m1.f59149b) && c29719y.f59783d != FieldType.date) {
            if (Intrinsics.areEqual(c29719y.f59781b, C29701u1.f59766b)) {
                return new C28859q("appdata", m71270a(c29719y, c29983l, (String) null, function3), map4, str2, z12, charSequence, 64);
            }
            if (!Intrinsics.areEqual(c29719y.f59781b, C29096c1.f59049b) && !Intrinsics.areEqual(c29719y.f59781b, C29168o1.f59172b) && !Intrinsics.areEqual(c29719y.f59781b, C29691s1.f59738b)) {
                if (!Intrinsics.areEqual(c29719y.f59781b, C29029M1.f58972b) && !Intrinsics.areEqual(c29719y.f59781b, C29037O1.f58977b) && !Intrinsics.areEqual(c29719y.f59781b, C29085a2.f59036b) && !Intrinsics.areEqual(c29719y.f59781b, C28997E1.f58922b) && !Intrinsics.areEqual(c29719y.f59781b, C29005G1.f58950b)) {
                    if (Intrinsics.areEqual(c29719y.f59781b, C29179q1.f59175b)) {
                        return new C28831Z(m71270a(c29719y, c29983l, "android_tetxt_cap_words", function3), "appdata", str2, z12, charSequence, (List) null, (String) null, 224);
                    }
                    if (Intrinsics.areEqual(c29719y.f59781b, C29052S1.f58989b)) {
                        String str7 = (String) map.get("msdk_local_tin_validation_country");
                        C30100g c30100gM71278a2 = AbstractC32657i.m71278a(str7 != null ? str7 : "", c29124h, c29983l);
                        String strMo69715b2 = c29719y.f59781b.mo69715b();
                        CharSequence charSequence3 = c30100gM71278a2.f60512a;
                        C29470F c29470f2 = new C29470F(strMo69715b2, charSequence3 != null ? charSequence3.toString() : null, c30100gM71278a2.f60515d, (String) null, Boolean.valueOf(c29719y.f59782c), "android_tetxt_cap_words", c30100gM71278a2.f60514c, (String) null, (List) null, 904);
                        List list2 = c29719y.f59785f;
                        if (list2 != null && (!list2.isEmpty())) {
                            listArrayListOf = c29719y.f59785f;
                        } else {
                            String str8 = c29719y.f59784e;
                            if (str8 != null) {
                                listArrayListOf = CollectionsKt.arrayListOf(str8);
                            }
                        }
                        return new C28831Z(c29470f2, "appdata", str2, z12, charSequence, listArrayListOf, str7, 64);
                    }
                    if (Intrinsics.areEqual(c29719y.f59781b, C29067W0.f59009b)) {
                        return new C28859q("appdata", m71270a(c29719y, c29983l, (String) null, function3), map4, str2, z12, charSequence, 64);
                    }
                    if (Intrinsics.areEqual(c29719y.f59781b, C29021K1.f58964b)) {
                        String str9 = (String) map.get("countryOfBirth");
                        Map mapEmptyMap2 = (Map) map5.get(str9);
                        if (mapEmptyMap2 == null) {
                            mapEmptyMap2 = MapsKt.emptyMap();
                        }
                        if (mapEmptyMap2.isEmpty()) {
                            return new C28831Z(m71270a(c29719y, c29983l, (String) null, function3), "appdata", str2, z12, charSequence, (List) null, (String) null, 224);
                        }
                        ArrayList arrayListM71273a = m71273a(mapEmptyMap2);
                        if (!c29719y.f59782c && (!z11 || mapEmptyMap2.isEmpty())) {
                            z13 = str9 != null ? StringsKt.equals(str9, "USA", true) : false;
                        }
                        return new C28827V(m71271a(c29719y, c29983l, arrayListM71273a, function3, Boolean.valueOf(z13)), "appdata", str2, z12, charSequence, 32);
                    }
                    if (Intrinsics.areEqual(c29719y.f59781b, C29013I1.f58955b)) {
                        String str10 = (String) map.get("country");
                        Map mapEmptyMap3 = (Map) map5.get(str10);
                        if (mapEmptyMap3 == null) {
                            mapEmptyMap3 = MapsKt.emptyMap();
                        }
                        if (mapEmptyMap3.isEmpty()) {
                            return new C28831Z(m71270a(c29719y, c29983l, (String) null, function3), "appdata", str2, z12, charSequence, (List) null, (String) null, 224);
                        }
                        ArrayList arrayListM71273a2 = m71273a(mapEmptyMap3);
                        if (!c29719y.f59782c && (!z11 || mapEmptyMap3.isEmpty())) {
                            z13 = str10 != null ? StringsKt.equals(str10, "USA", true) : false;
                        }
                        return new C28827V(m71271a(c29719y, c29983l, arrayListM71273a2, function3, Boolean.valueOf(z13)), "appdata", str2, z12, charSequence, 32);
                    }
                    C29470F c29470fM71270a2 = m71270a(c29719y, c29983l, (String) null, function3);
                    List list3 = c29719y.f59785f;
                    if (list3 != null && (!list3.isEmpty())) {
                        listArrayListOf = c29719y.f59785f;
                    } else {
                        String str11 = c29719y.f59784e;
                        if (str11 != null) {
                            listArrayListOf = CollectionsKt.arrayListOf(str11);
                        }
                    }
                    return new C28831Z(c29470fM71270a2, "appdata", str2, z12, charSequence, listArrayListOf, (String) null, 192);
                }
                return new C28831Z(m71270a(c29719y, c29983l, "android_tetxt_cap_words", function3), "appdata", str2, z12, charSequence, (List) null, (String) null, 224);
            }
            return new C28831Z(m71270a(c29719y, c29983l, "android_tetxt_cap_words", function3), "appdata", str2, z12, charSequence, (List) null, (String) null, 224);
        }
        C29470F c29470fM71270a3 = m71270a(c29719y, c29983l, (String) null, function3);
        AbstractC29103d2 abstractC29103d5 = c29719y.f59781b;
        return new C28861s(c29470fM71270a3, "appdata", Intrinsics.areEqual(abstractC29103d5, c29075y0) || Intrinsics.areEqual(abstractC29103d5, C29156m1.f59149b), str2, charSequence, z12);
    }

    /* JADX INFO: renamed from: a */
    public static final String m71272a(C29983l c29983l, String str, String str2) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return AbstractC28892d.m69671a(new Object[]{str, str2}, 2, "sns_data_%s_%s", c29983l);
    }

    /* JADX INFO: renamed from: a */
    public static final C29470F m71271a(C29719y c29719y, C29983l c29983l, ArrayList arrayList, Function2 function2, Boolean bool) {
        boolean zBooleanValue;
        AbstractC29103d2 abstractC29103d2 = c29719y.f59781b;
        String strMo69715b = abstractC29103d2 != null ? abstractC29103d2.mo69715b() : null;
        AbstractC29103d2 abstractC29103d3 = c29719y.f59781b;
        String str = (String) function2.invoke("field", abstractC29103d3 != null ? abstractC29103d3.mo69715b() : null);
        AbstractC29103d2 abstractC29103d4 = c29719y.f59781b;
        String str2 = (String) function2.invoke("hint", abstractC29103d4 != null ? abstractC29103d4.mo69715b() : null);
        String strM70061a = c29719y.f59787h;
        if (strM70061a == null) {
            if (c29719y.f59782c) {
                strM70061a = c29983l.m70061a("sns_data_placeholder_required");
            } else {
                strM70061a = c29983l.m70061a("sns_data_placeholder_optional");
            }
        }
        String str3 = strM70061a;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = c29719y.f59782c;
        }
        return new C29470F(strMo69715b, str, str2, (String) null, Boolean.valueOf(zBooleanValue), (String) null, str3, (String) null, arrayList, 680);
    }

    /* JADX INFO: renamed from: a */
    public static final C29470F m71270a(C29719y c29719y, C29983l c29983l, String str, Function2 function2) {
        String strMo69727c = c29719y.mo69727c();
        AbstractC29103d2 abstractC29103d2 = c29719y.f59781b;
        String str2 = (String) function2.invoke("field", abstractC29103d2 != null ? abstractC29103d2.mo69715b() : null);
        AbstractC29103d2 abstractC29103d3 = c29719y.f59781b;
        String str3 = (String) function2.invoke("hint", abstractC29103d3 != null ? abstractC29103d3.mo69715b() : null);
        String strM70061a = c29719y.f59787h;
        if (strM70061a == null) {
            if (c29719y.f59782c) {
                strM70061a = c29983l.m70061a("sns_data_placeholder_required");
            } else {
                strM70061a = c29983l.m70061a("sns_data_placeholder_optional");
            }
        }
        return new C29470F(strMo69727c, str2, str3, (String) null, Boolean.valueOf(c29719y.f59782c), str, strM70061a, (String) null, (List) null, 904);
    }

    /* JADX INFO: renamed from: a */
    public static final ArrayList m71273a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new C29494N((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m71275a(List list, AbstractC29103d2 abstractC29103d2) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC28990D abstractC28990D = (AbstractC28990D) it.next();
            C29719y c29719y = abstractC28990D instanceof C29719y ? (C29719y) abstractC28990D : null;
            if (Intrinsics.areEqual(c29719y != null ? c29719y.f59781b : null, abstractC29103d2)) {
                return true;
            }
        }
        return false;
    }
}
