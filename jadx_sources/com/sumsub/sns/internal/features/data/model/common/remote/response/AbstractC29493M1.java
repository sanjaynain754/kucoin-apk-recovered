package com.sumsub.sns.internal.features.data.model.common.remote.response;

import com.sumsub.sns.internal.features.data.model.common.C29002F2;
import com.sumsub.sns.internal.features.data.model.common.C29006G2;
import com.sumsub.sns.internal.features.data.model.common.C29010H2;
import com.sumsub.sns.internal.features.data.model.common.C29014I2;
import com.sumsub.sns.internal.features.data.model.common.C29018J2;
import com.sumsub.sns.internal.features.data.model.common.C29022K2;
import com.sumsub.sns.internal.features.data.model.common.C29026L2;
import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29136j;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.C29160n;
import com.sumsub.sns.internal.features.data.model.common.C29164n3;
import com.sumsub.sns.internal.features.data.model.common.PhotosAmount;
import com.sumsub.sns.internal.features.data.model.common.ReviewAnswerType;
import com.sumsub.sns.internal.features.data.model.common.ReviewRejectType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.M1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC29493M1 {
    /* JADX INFO: renamed from: a */
    public static final C29136j m69875a(C29489L0 c29489l0) {
        ArrayList arrayList;
        String str = c29489l0.f59501a;
        String str2 = c29489l0.f59514n;
        String str3 = c29489l0.f59502b;
        String str4 = c29489l0.f59503c;
        String str5 = c29489l0.f59504d;
        String str6 = c29489l0.f59505e;
        String str7 = c29489l0.f59506f;
        String str8 = c29489l0.f59507g;
        String str9 = c29489l0.f59508h;
        String str10 = c29489l0.f59509i;
        String str11 = c29489l0.f59510j;
        String str12 = c29489l0.f59511k;
        List<Map> list = c29489l0.f59512l;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Map map : list) {
                String str13 = str;
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    String str14 = str2;
                    String str15 = (String) entry.getKey();
                    String str16 = str3;
                    Object value = entry.getValue();
                    String str17 = str4;
                    String str18 = value instanceof String ? (String) value : null;
                    Pair pairM90091to = str18 != null ? TuplesKt.m90091to(str15, str18) : null;
                    if (pairM90091to != null) {
                        arrayList3.add(pairM90091to);
                    }
                    str4 = str17;
                    str3 = str16;
                    str2 = str14;
                }
                arrayList2.add(MapsKt.toMap(arrayList3));
                str = str13;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new C29136j(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, arrayList, c29489l0.f59513m, c29489l0.f59515o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX INFO: renamed from: a */
    public static final C29160n m69877a(C29603s1 c29603s1) {
        ?? EmptyList;
        C29018J2 c29018j2;
        C29006G2 c29006g2;
        C29002F2 c29002f2;
        List list = c29603s1.f59658a;
        if (list != null) {
            EmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C29599r1 c29599r1 = (C29599r1) it.next();
                C29062V c29062v = C29070X.Companion;
                String str = c29599r1.f59620a;
                c29062v.getClass();
                C29070X c29070xM69739a = C29062V.m69739a(str);
                List listEmptyList = c29599r1.f59621b;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List list2 = listEmptyList;
                List listEmptyList2 = c29599r1.f59622c;
                if (listEmptyList2 == null) {
                    listEmptyList2 = CollectionsKt.emptyList();
                }
                List list3 = listEmptyList2;
                String str2 = c29599r1.f59623d;
                List list4 = c29599r1.f59624e;
                List list5 = c29599r1.f59625f;
                String str3 = c29599r1.f59626g;
                String str4 = c29599r1.f59627h;
                String str5 = c29599r1.f59628i;
                String str6 = c29599r1.f59629j;
                Boolean bool = c29599r1.f59630k;
                String str7 = c29599r1.f59631l;
                Iterator it2 = it;
                Boolean bool2 = c29599r1.f59632m;
                C29510V0 c29510v0 = c29599r1.f59633n;
                C29022K2 c29022k2 = null;
                String str8 = c29510v0 != null ? c29510v0.f59531a : null;
                C29516Y0 c29516y0 = c29599r1.f59634o;
                Boolean bool3 = c29516y0 != null ? c29516y0.f59537a : null;
                C29504S0 c29504s0 = c29599r1.f59635p;
                Boolean bool4 = c29504s0 != null ? c29504s0.f59524a : null;
                C29595q1 c29595q1 = c29599r1.f59636q;
                if (c29595q1 != null) {
                    C29591p1 c29591p1 = c29595q1.f59618a;
                    if (c29591p1 != null) {
                        C29546f1 c29546f1 = c29591p1.f59613a;
                        if (c29546f1 != null) {
                            boolean zAreEqual = Intrinsics.areEqual(c29546f1.f59565a, Boolean.TRUE);
                            C29026L2 c29026l2 = PhotosAmount.Companion;
                            String str9 = c29546f1.f59566b;
                            c29026l2.getClass();
                            c29006g2 = new C29006G2(zAreEqual, C29026L2.m69731a(str9));
                        } else {
                            c29006g2 = null;
                        }
                        C29531c1 c29531c1 = c29591p1.f59614b;
                        if (c29531c1 != null) {
                            Boolean bool5 = c29531c1.f59548a;
                            Boolean bool6 = Boolean.TRUE;
                            c29002f2 = new C29002F2(Intrinsics.areEqual(bool5, bool6), Intrinsics.areEqual(c29531c1.f59549b, bool6), Intrinsics.areEqual(c29531c1.f59550c, bool6));
                        } else {
                            c29002f2 = null;
                        }
                        C29579m1 c29579m1 = c29591p1.f59615c;
                        C29014I2 c29014i2 = c29579m1 != null ? new C29014I2(Intrinsics.areEqual(c29579m1.f59602a, Boolean.TRUE)) : null;
                        C29566j1 c29566j1 = c29591p1.f59616d;
                        c29018j2 = new C29018J2(c29006g2, c29002f2, c29014i2, c29566j1 != null ? new C29010H2(Intrinsics.areEqual(c29566j1.f59585a, Boolean.TRUE)) : null);
                    } else {
                        str6 = str6;
                        bool = bool;
                        str7 = str7;
                        c29070xM69739a = c29070xM69739a;
                        list2 = list2;
                        c29018j2 = null;
                    }
                    c29022k2 = new C29022K2(c29018j2);
                } else {
                    str6 = str6;
                    bool = bool;
                    str7 = str7;
                    c29070xM69739a = c29070xM69739a;
                    list2 = list2;
                }
                EmptyList.add(new C29154m(c29070xM69739a, list2, list3, str2, list4, list5, str3, str4, str5, str6, bool, bool2, str7, str8, bool3, bool4, c29022k2));
                it = it2;
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        ?? r11 = EmptyList;
        Boolean bool7 = c29603s1.f59659b;
        return new C29160n(r11, bool7 != null ? bool7.booleanValue() : false, c29603s1.f59660c, c29603s1.f59661d, c29603s1.f59662e, c29603s1.f59663f);
    }

    /* JADX INFO: renamed from: a */
    public static final C29164n3 m69876a(C29487K1 c29487k1) {
        String str = c29487k1.f59495a;
        String str2 = c29487k1.f59496b;
        ReviewAnswerType reviewAnswerType = c29487k1.f59497c;
        if (reviewAnswerType == null) {
            reviewAnswerType = ReviewAnswerType.Unknown;
        }
        List listEmptyList = c29487k1.f59498d;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ReviewRejectType reviewRejectType = c29487k1.f59499e;
        if (reviewRejectType == null) {
            reviewRejectType = ReviewRejectType.Unknown;
        }
        return new C29164n3(str, str2, reviewAnswerType, listEmptyList, reviewRejectType);
    }

    /* JADX INFO: renamed from: a */
    public static final C29136j m69874a(C29136j c29136j, C29136j c29136j2) {
        C29136j c29136j3 = c29136j2 == null ? new C29136j(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null) : c29136j2;
        String str = c29136j3.f59101a;
        if (str == null) {
            str = c29136j != null ? c29136j.f59101a : null;
        }
        return new C29136j(str, c29136j3.f59102b, c29136j3.f59103c, c29136j3.f59104d, c29136j3.f59105e, c29136j3.f59106f, c29136j3.f59107g, c29136j3.f59108h, c29136j3.f59109i, c29136j3.f59110j, c29136j3.f59111k, c29136j3.f59112l, c29136j3.f59113m, c29136j3.f59114n, c29136j3.f59115o);
    }
}
