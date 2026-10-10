package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.kubi.kyc.KycKey;
import com.kubi.otc.entity.OtcAd;
import com.sumsub.sns.core.SNSMobileSDK;
import com.sumsub.sns.internal.core.common.AbstractC28423V;
import com.sumsub.sns.internal.core.presentation.intro.AbstractC28892d;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29045Q1;
import com.sumsub.sns.internal.features.data.model.common.C29051S0;
import com.sumsub.sns.internal.features.data.model.common.C29059U0;
import com.sumsub.sns.internal.features.data.model.common.C29067W0;
import com.sumsub.sns.internal.features.data.model.common.C29075Y0;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29156m1;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29860e;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29880u;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29883x;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29884y;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.log.C33272c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32553q {

    /* JADX INFO: renamed from: a */
    public final Map f66402a;

    /* JADX INFO: renamed from: b */
    public final C29983l f66403b;

    /* JADX INFO: renamed from: c */
    public final C29124h f66404c;

    /* JADX INFO: renamed from: d */
    public final Function1 f66405d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f66406e = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m71173a(C29880u c29880u, String str, int i11, ArrayList arrayList) {
        C29860e c29860e;
        Object objM103844constructorimpl;
        Integer num;
        C29883x c29883x = c29880u.f59965d;
        if (c29883x == null) {
            return;
        }
        Map map = c29883x.f59982n;
        String str2 = null;
        if (map != null) {
            Object obj = map.get("formattedAddress");
            c29860e = new C29860e(0, obj instanceof String ? (String) obj : null);
        } else {
            c29860e = null;
        }
        if (c29860e != null) {
            String str3 = c29880u.f59962a;
            C29124h c29124h = this.f66404c;
            arrayList.add(new C32541m(12, str3, str, c29124h != null ? AbstractC29130i.m69770a("sumsubid.reuse.dataAddress.label", c29124h.f59089v) : null, c29860e.f59947b, i11 == 0));
            return;
        }
        String str4 = c29880u.f59965d.f59970b;
        if (str4 != null) {
            Locale locale = (Locale) ((Map) AbstractC28423V.f57934b.getValue()).get(str4);
            String country = locale != null ? locale.getCountry() : null;
            if (country != null) {
                str4 = country;
            }
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        String str5 = "Flag/" + str4.toLowerCase(Locale.ROOT);
        String str6 = c29880u.f59962a;
        List list = c29880u.f59963b;
        String str7 = (list == null || (num = (Integer) CollectionsKt.firstOrNull(list)) == null) ? null : (String) this.f66405d.invoke(String.valueOf(num.intValue()));
        C29983l c29983l = this.f66403b;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM69671a = AbstractC28892d.m69671a(new Object[]{c29880u.f59965d.f59969a}, 1, "sns_iddoc_type_%s", c29983l);
        String str8 = c29880u.f59965d.f59977i;
        if (str8 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(StringsKt.take(str8, 2) + "****" + StringsKt.takeLast(str8, 4));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
                objM103844constructorimpl = c29880u.f59965d.f59977i;
            }
            str2 = (String) objM103844constructorimpl;
        }
        arrayList.add(new C32541m(str6, str, str7, str5, strM69671a, str2, i11 == 0));
    }

    public C32553q(Map map, C29983l c29983l, C29124h c29124h, Function1 function1) {
        this.f66402a = map;
        this.f66403b = c29983l;
        this.f66404c = c29124h;
        this.f66405d = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m71174a(Map map, ArrayList arrayList) {
        ArrayList arrayList2;
        C29860e c29860e;
        AbstractC29103d2 abstractC29103d2M69736a;
        Object objM103844constructorimpl;
        Map map2;
        String str;
        if (map == null) {
            return;
        }
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            Object obj = map.get(str2);
            if (obj == null || Intrinsics.areEqual(obj, "null")) {
                obj = null;
            }
            String str3 = obj instanceof String ? (String) obj : null;
            if (str3 != null) {
                if (str2 != null) {
                    AbstractC29103d2.Companion.getClass();
                    abstractC29103d2M69736a = C29051S0.m69736a(str2);
                } else {
                    abstractC29103d2M69736a = null;
                }
                C29983l c29983l = this.f66403b;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strM69671a = AbstractC28892d.m69671a(new Object[]{"field", str2}, 2, "sns_data_%s_%s", c29983l);
                AbstractC29103d2.Companion.getClass();
                if (!Intrinsics.areEqual(abstractC29103d2M69736a, C29075Y0.f59017b) && !Intrinsics.areEqual(abstractC29103d2M69736a, C29156m1.f59149b)) {
                    if ((Intrinsics.areEqual(abstractC29103d2M69736a, C29059U0.f59007b) || Intrinsics.areEqual(abstractC29103d2M69736a, C29045Q1.f58981b) || Intrinsics.areEqual(abstractC29103d2M69736a, C29067W0.f59009b)) && (map2 = this.f66402a) != null && (str = (String) map2.get(str3)) != null) {
                        str3 = str;
                    }
                } else {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        SNSMobileSDK sNSMobileSDK = SNSMobileSDK.INSTANCE;
                        objM103844constructorimpl = Result.m103844constructorimpl(new SimpleDateFormat("d MMM yyy", sNSMobileSDK.getLocale()).format(new SimpleDateFormat("yyyy-MM-dd", sNSMobileSDK.getLocale()).parse(str3)));
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                    }
                    Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl != null) {
                        C33272c.f67814c.mo68956e("SDK", "Error converting date formats", thM103847exceptionOrNullimpl);
                    }
                    String str4 = (String) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
                    if (str4 != null) {
                        str3 = str4;
                    }
                }
                arrayList.add(new C32529i(str2, null, strM69671a, str3, true));
            }
        }
        Object obj2 = map.get("addresses");
        List list = obj2 instanceof List ? (List) obj2 : null;
        if (list == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList();
            int i11 = 0;
            for (Object obj3 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (obj3 instanceof Map) {
                    Object obj4 = ((Map) obj3).get("formattedAddress");
                    c29860e = new C29860e(i11, obj4 instanceof String ? (String) obj4 : null);
                } else {
                    c29860e = null;
                }
                if (c29860e != null) {
                    arrayList2.add(c29860e);
                }
                i11 = i12;
            }
        }
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i13 = 0;
            int i14 = 0;
            while (i13 < size) {
                Object obj5 = arrayList2.get(i13);
                i13++;
                int i15 = i14 + 1;
                if (i14 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                C29860e c29860e2 = (C29860e) obj5;
                String strValueOf = String.valueOf(c29860e2.f59946a);
                C29124h c29124h = this.f66404c;
                arrayList.add(new C32541m(12, strValueOf, "address", c29124h != null ? AbstractC29130i.m69770a("sumsubid.reuse.dataAddress.label", c29124h.f59089v) : null, c29860e2.f59947b, i14 == 0));
                i14 = i15;
            }
            C29124h c29124h2 = this.f66404c;
            arrayList.add(new C32541m(92, OtcAd.KYC_NOT_PASS, "address", null, c29124h2 != null ? AbstractC29130i.m69770a("sumsubid.reuse.dataAddress.none", c29124h2.f59089v) : null, false));
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0131  */
    /* JADX INFO: renamed from: a */
    public final List m71172a(C29884y c29884y) {
        Object objM103844constructorimpl;
        String strM69770a;
        String strM69770a2;
        Set<String> setKeySet;
        C29880u c29880u;
        Object next;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (c29884y == null) {
                AbstractC32493S.m71164a("processDocs(), docs=null");
                return null;
            }
            AbstractC32493S.m71164a("processDocuments()");
            ArrayList arrayList = new ArrayList();
            Map map = c29884y.f59985b;
            if (map != null && (setKeySet = map.keySet()) != null) {
                for (String str : setKeySet) {
                    arrayList.clear();
                    C29983l c29983l = this.f66403b;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String strM70061a = c29983l.m70061a(String.format("sns_step_%s_title", Arrays.copyOf(new Object[]{str}, 1)));
                    List list = (List) c29884y.f59985b.get(str);
                    if (list != null) {
                        int i11 = 0;
                        for (Object obj : list) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            C29880u c29880u2 = (C29880u) obj;
                            m71174a(c29880u2.f59964c, arrayList);
                            m71173a(c29880u2, str, i11, arrayList);
                            i11 = i12;
                        }
                    }
                    if (list != null) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((C29880u) next).f59965d == null);
                        c29880u = (C29880u) next;
                    } else {
                        c29880u = null;
                    }
                    if (c29880u != null) {
                        C29124h c29124h = this.f66404c;
                        arrayList.add(new C32541m(92, OtcAd.KYC_NOT_PASS, str, null, c29124h != null ? AbstractC29130i.m69770a("sumsubid.reuse.docAddress.none", c29124h.f59089v) : null, false));
                    }
                    if (!arrayList.isEmpty()) {
                        this.f66406e.add(new C32547o(strM70061a, "DocType/" + str));
                        this.f66406e.addAll(arrayList);
                    }
                }
            }
            if (!this.f66406e.isEmpty()) {
                Map map2 = c29884y.f59984a;
                Object obj2 = map2 != null ? map2.get(KycKey.firstName) : null;
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                if (str2 != null && (!StringsKt.isBlank(str2))) {
                    C29124h c29124h2 = this.f66404c;
                    if (c29124h2 == null || (strM69770a2 = AbstractC29130i.m69770a("sumsubid.reuse.title", c29124h2.f59089v)) == null) {
                        strM69770a = null;
                    } else {
                        strM69770a = StringsKt.replace$default(strM69770a2, "{name}", str2, false, 4, (Object) null);
                    }
                } else {
                    C29124h c29124h3 = this.f66404c;
                    if (c29124h3 != null) {
                        strM69770a = AbstractC29130i.m69770a("sumsubid.reuse.titleNoname", c29124h3.f59089v);
                    } else {
                        strM69770a = null;
                    }
                }
                ArrayList arrayList2 = this.f66406e;
                C29124h c29124h4 = this.f66404c;
                arrayList2.add(0, new C32535k(strM69770a, c29124h4 != null ? AbstractC29130i.m69770a("sumsubid.reuse.subtitle", c29124h4.f59089v) : null));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(this.f66406e);
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C33272c.f67816e.f67810a.mo68956e("SnsId", "processDocs error", thM103847exceptionOrNullimpl);
            }
            return (List) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
