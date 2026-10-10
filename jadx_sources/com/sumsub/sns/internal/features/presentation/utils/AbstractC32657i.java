package com.sumsub.sns.internal.features.presentation.utils;

import android.util.Patterns;
import com.sumsub.sns.internal.core.presentation.intro.AbstractC28892d;
import com.sumsub.sns.internal.core.presentation.util.AbstractC28967a;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28985C;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28990D;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29028M0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.C28987C1;
import com.sumsub.sns.internal.features.data.model.common.C29051S0;
import com.sumsub.sns.internal.features.data.model.common.C29075Y0;
import com.sumsub.sns.internal.features.data.model.common.C29084a1;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29156m1;
import com.sumsub.sns.internal.features.data.model.common.C29699u;
import com.sumsub.sns.internal.features.data.model.common.C29719y;
import com.sumsub.sns.internal.features.data.model.common.FieldType;
import com.sumsub.sns.internal.features.data.model.common.remote.C29285T3;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.appdata.C30100g;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC32657i {
    /* JADX INFO: renamed from: a */
    public static final CharSequence m71279a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static final C30100g m71278a(String str, C29124h c29124h, C29983l c29983l) {
        String strM69671a;
        String string;
        List list;
        String strJoinToString$default;
        List list2;
        String str2;
        Map map;
        Map map2;
        Map map3;
        C29285T3 c29285t3 = (c29124h == null || (map3 = c29124h.f59076i) == null) ? null : (C29285T3) map3.get(str);
        if (c29124h == null || (map = c29124h.f59081n) == null || (map2 = (Map) map.get(str)) == null || (strM69671a = (String) map2.get("tin")) == null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strM69671a = AbstractC28892d.m69671a(new Object[]{"field", "tin"}, 2, "sns_data_%s_%s", c29983l);
        }
        String str3 = "";
        if (c29285t3 == null || (list2 = c29285t3.f59299a) == null || (str2 = (String) CollectionsKt.firstOrNull(list2)) == null || (string = str2.toString()) == null) {
            string = "";
        }
        if (c29285t3 != null && (list = c29285t3.f59299a) != null && (strJoinToString$default = CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.utils.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC32657i.m71279a((String) obj);
            }
        }, 30, null)) != null) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String strM69671a2 = AbstractC28892d.m69671a(new Object[]{"hint", "tin"}, 2, "sns_data_%s_%s", c29983l);
            String strReplace$default = strM69671a2 != null ? StringsKt.replace$default(strM69671a2, "{example}", strJoinToString$default, false, 4, (Object) null) : null;
            if (strReplace$default != null) {
                str3 = strReplace$default;
            }
        }
        return new C30100g(strM69671a, c29285t3, string, str3);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX INFO: renamed from: a */
    public static final String m71280a(AbstractC28990D abstractC28990D, String str, C29983l c29983l, Boolean bool) {
        String str2;
        String str3;
        if (abstractC28990D instanceof C29719y) {
            C29719y c29719y = (C29719y) abstractC28990D;
            AbstractC29028M0 abstractC29028M0 = c29719y.f59786g;
            if (abstractC29028M0 != null) {
                Map map = c29983l.f60248a;
                str2 = "";
                if (!Intrinsics.areEqual(Boolean.FALSE, Boolean.TRUE) || !StringsKt.isBlank(str) ? !(AbstractC28967a.m69711a(abstractC29028M0, str) || (str3 = (String) map.get("sns_quiestionnaire_field_isNotValid")) == null) : (str3 = (String) map.get("sns_quiestionnaire_field_isRequired")) != null) {
                    str2 = str3;
                }
                if (str2.length() <= 0) {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
            if ((c29719y.f59782c && str.length() == 0) || (c29719y.f59782c && Intrinsics.areEqual(c29719y.f59781b, C28987C1.f58906b) && Intrinsics.areEqual(bool, Boolean.FALSE))) {
                return c29983l.m70061a("sns_data_error_fieldIsRequired");
            }
            C29051S0 c29051s0 = AbstractC29103d2.Companion;
            AbstractC29103d2 abstractC29103d2 = c29719y.f59781b;
            c29051s0.getClass();
            C29075Y0 c29075y0 = C29075Y0.f59017b;
            if ((Intrinsics.areEqual(abstractC29103d2, c29075y0) || Intrinsics.areEqual(abstractC29103d2, C29156m1.f59149b) || c29719y.f59783d == FieldType.date) && str.length() > 0) {
                try {
                    Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(str);
                    if (date != null) {
                        AbstractC29103d2 abstractC29103d3 = c29719y.f59781b;
                        if ((!Intrinsics.areEqual(abstractC29103d3, c29075y0) && !Intrinsics.areEqual(abstractC29103d3, C29156m1.f59149b)) || date.compareTo(Calendar.getInstance().getTime()) < 0) {
                            date = null;
                        }
                        if (date != null) {
                            return c29983l.m70061a("sns_data_error_fieldIsMalformed");
                        }
                    }
                    return null;
                } catch (Exception unused) {
                    return c29983l.m70061a("sns_data_error_fieldIsMalformed");
                }
            }
            if (Intrinsics.areEqual(c29719y.f59781b, C29084a1.f59035b) && str.length() > 0) {
                boolean zMatches = Patterns.EMAIL_ADDRESS.matcher(str).matches();
                Boolean boolValueOf = Boolean.valueOf(zMatches);
                if (zMatches) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    return c29983l.m70061a("sns_data_error_fieldIsMalformed");
                }
                return null;
            }
            if (Intrinsics.areEqual(c29719y.f59781b, C28987C1.f58906b) && str.length() > 0 && Intrinsics.areEqual(bool, Boolean.FALSE)) {
                return c29983l.m70061a("sns_data_error_fieldIsMalformed");
            }
            return null;
        }
        if (abstractC28990D instanceof C29699u) {
            C29699u c29699u = (C29699u) abstractC28990D;
            if (StringsKt.isBlank(str) && Intrinsics.areEqual(c29699u.f59763d, Boolean.TRUE)) {
                return c29983l.m70061a("sns_data_error_fieldIsRequired");
            }
            return null;
        }
        if (abstractC28990D instanceof AbstractC28985C) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
