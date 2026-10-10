package com.sumsub.sns.internal.features.presentation.utils;

import android.text.SpannableStringBuilder;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.remote.C29332c;
import com.sumsub.sns.internal.features.data.model.common.remote.C29356f;
import com.sumsub.sns.internal.features.data.model.common.remote.C29380i;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32649e {

    /* JADX INFO: renamed from: b */
    public static final C32641a f66642b = new C32641a();

    /* JADX INFO: renamed from: c */
    public static final List f66643c = CollectionsKt.listOf((Object[]) new String[]{"customPrivacyNote", "customPrivacyLink"});

    /* JADX INFO: renamed from: a */
    public final InterfaceC30000a f66644a;

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f8  */
    /* JADX INFO: renamed from: a */
    public static String m71265a(C29124h c29124h, C29380i c29380i, int i11) {
        String strM69770a;
        String strM69770a2;
        String str;
        String str2;
        String str3;
        String strM69770a3;
        List list;
        String str4;
        C29332c c29332c = c29380i.f59390b;
        String str5 = c29380i.f59391c;
        if (c29124h == null || (strM69770a = AbstractC29130i.m69770a(str5, c29124h.f59088u)) == null) {
            strM69770a = c29124h != null ? AbstractC29130i.m69770a("agreements.privacyPolicy", c29124h.f59088u) : null;
            if (strM69770a == null) {
                return null;
            }
        }
        String str6 = strM69770a;
        C29356f c29356f = c29380i.f59389a;
        if (Intrinsics.areEqual(c29356f != null ? c29356f.f59373a : null, "USA")) {
            if (c29124h != null) {
                strM69770a2 = AbstractC29130i.m69770a("agreements.buttonLabelUSA", c29124h.f59088u);
            } else {
                strM69770a2 = null;
            }
        } else if (c29124h != null) {
            strM69770a2 = AbstractC29130i.m69770a("agreements.buttonLabel", c29124h.f59088u);
        } else {
            strM69770a2 = null;
        }
        String str7 = "";
        if (strM69770a2 == null) {
            strM69770a2 = "";
        }
        if (c29332c == null || (list = c29332c.f59346d) == null || (str4 = (String) CollectionsKt.firstOrNull(list)) == null || !StringsKt.contains$default((CharSequence) str4, (CharSequence) "customPrivacyLink", false, 2, (Object) null)) {
            str = "sumsub://agreement-content/" + i11;
        } else {
            str = c29332c.f59347e;
            if (str == null) {
                str = "";
            }
        }
        if (c29124h != null && (strM69770a3 = AbstractC29130i.m69770a("agreements.privacyPolicyPrivacyLabel", c29124h.f59088u)) != null) {
            str7 = strM69770a3;
        }
        String str8 = c29332c != null ? c29332c.f59349g : null;
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            String str9 = "<a href=\"" + str + "\">" + strM69770a2 + "</a>";
            if (str9 == null) {
                str2 = strM69770a2;
            } else {
                str2 = str9;
            }
        } else {
            str2 = strM69770a2;
        }
        String strReplace$default = StringsKt.replace$default(str6, "{link}", str2, false, 4, (Object) null);
        if (str8 == null) {
            str3 = str7;
        } else {
            String str10 = str8.length() > 0 ? str8 : null;
            if (str10 != null) {
                String str11 = "<a href=\"" + str10 + "\">" + str7 + "</a>";
                if (str11 == null) {
                    str3 = str7;
                } else {
                    str3 = str11;
                }
            } else {
                str3 = str7;
            }
        }
        return StringsKt.replace$default(strReplace$default, "{privacyLink}", str3, false, 4, (Object) null);
    }

    /* JADX INFO: renamed from: b */
    public static String m71266b(C29124h c29124h, C29380i c29380i, int i11) {
        String strM69770a;
        String str = c29380i.f59391c;
        if (c29124h == null || (strM69770a = AbstractC29130i.m69770a(str, c29124h.f59071d)) == null) {
            return null;
        }
        return StringsKt.replace$default(strM69770a, "{link}", "sumsub://agreement-content/" + i11, false, 4, (Object) null);
    }

    public C32649e(InterfaceC30000a interfaceC30000a) {
        this.f66644a = interfaceC30000a;
    }

    /* JADX INFO: renamed from: a */
    public static final CharSequence m71264a(String str) {
        return "- " + str;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC32647d m71263a(String str, List list) {
        C29380i c29380i;
        C29332c c29332c;
        if (!StringsKt.startsWith$default(str, "sumsub://agreement-content/", false, 2, (Object) null)) {
            return new C32643b(str);
        }
        Integer intOrNull = StringsKt.toIntOrNull(StringsKt.removePrefix(str, (CharSequence) "sumsub://agreement-content/"));
        if (intOrNull == null) {
            return new C32643b(str);
        }
        int iIntValue = intOrNull.intValue();
        if (list != null && (c29380i = (C29380i) CollectionsKt.getOrNull(list, iIntValue)) != null && (c29332c = c29380i.f59390b) != null) {
            String str2 = c29332c.f59343a;
            String str3 = c29332c.f59347e;
            if (str2 == null || str2.length() == 0) {
                return (str3 == null || str3.length() == 0) ? new C32643b(str) : new C32643b(str3);
            }
            return new C32645c(str2);
        }
        return new C32643b(str);
    }

    /* JADX INFO: renamed from: a */
    public final SpannableStringBuilder m71267a(C29124h c29124h, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i11 = 0;
        while (true) {
            String strM71265a = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C29380i c29380i = (C29380i) next;
            if (C32641a.m71262a(c29380i)) {
                String strM71266b = m71266b(c29124h, c29380i, i11);
                if (strM71266b != null) {
                    strM71265a = AbstractC28462i0.m69366a(strM71266b);
                }
            } else {
                strM71265a = m71265a(c29124h, c29380i, i11);
            }
            if (strM71265a != null) {
                arrayList.add(strM71265a);
            }
            i11 = i12;
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "\n\n", null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.utils.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32649e.m71264a((String) obj);
            }
        }, 30, null);
        return AbstractC28462i0.m69363a(AbstractC28462i0.m69364a((c29124h != null ? AbstractC29130i.m69770a("agreements.modalSubTitle", c29124h.f59088u) : null) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + strJoinToString$default, ((C28547d) this.f66644a).f58099a.f58163a));
    }
}
