package com.sumsub.sns.core.presentation.form.model;

import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.internal.core.presentation.form.C28803j;
import com.sumsub.sns.internal.core.presentation.form.FieldId;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28849i0;
import com.sumsub.sns.internal.core.presentation.form.model.C28809C;
import com.sumsub.sns.internal.core.presentation.form.model.C28811E;
import com.sumsub.sns.internal.core.presentation.form.model.C28813G;
import com.sumsub.sns.internal.core.presentation.form.model.C28815I;
import com.sumsub.sns.internal.core.presentation.form.model.C28817K;
import com.sumsub.sns.internal.core.presentation.form.model.C28819M;
import com.sumsub.sns.internal.core.presentation.form.model.C28821O;
import com.sumsub.sns.internal.core.presentation.form.model.C28823Q;
import com.sumsub.sns.internal.core.presentation.form.model.C28825T;
import com.sumsub.sns.internal.core.presentation.form.model.C28827V;
import com.sumsub.sns.internal.core.presentation.form.model.C28829X;
import com.sumsub.sns.internal.core.presentation.form.model.C28831Z;
import com.sumsub.sns.internal.core.presentation.form.model.C28835b0;
import com.sumsub.sns.internal.core.presentation.form.model.C28839d0;
import com.sumsub.sns.internal.core.presentation.form.model.C28846h;
import com.sumsub.sns.internal.core.presentation.form.model.C28854l;
import com.sumsub.sns.internal.core.presentation.form.model.C28857o;
import com.sumsub.sns.internal.core.presentation.form.model.C28859q;
import com.sumsub.sns.internal.core.presentation.form.model.C28861s;
import com.sumsub.sns.internal.core.presentation.form.model.C28863u;
import com.sumsub.sns.internal.core.presentation.form.model.C28865w;
import com.sumsub.sns.internal.core.presentation.form.model.C28867y;
import com.sumsub.sns.internal.core.presentation.form.model.FieldError;
import com.sumsub.sns.internal.core.presentation.util.AbstractC28967a;
import com.sumsub.sns.internal.core.presentation.widget.autocompletePhone.util.AbstractC28974a;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29028M0;
import com.sumsub.sns.internal.features.data.model.common.C28981B0;
import com.sumsub.sns.internal.features.data.model.common.C29000F0;
import com.sumsub.sns.internal.features.data.model.common.C29695t0;
import com.sumsub.sns.internal.features.data.model.common.C29705v0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29237K;
import com.sumsub.sns.internal.features.data.model.common.remote.C29389j0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29405l0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29494N;
import java.util.Iterator;
import java.util.List;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.model.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28178b {
    /* JADX INFO: renamed from: a */
    public static final boolean m69122a(AbstractC28841e0 abstractC28841e0, C28167d c28167d) {
        List list;
        Object obj;
        if ((abstractC28841e0 instanceof C28831Z) || (abstractC28841e0 instanceof C28835b0) || (abstractC28841e0 instanceof C28854l) || (abstractC28841e0 instanceof C28861s) || (abstractC28841e0 instanceof C28863u) || (abstractC28841e0 instanceof C28859q)) {
            return AbstractC28849i0.m69660a(abstractC28841e0.mo69642c(), c28167d.m69098a(abstractC28841e0)) == null;
        }
        if (abstractC28841e0 instanceof C28857o) {
            List listM69099b = c28167d.m69099b(abstractC28841e0);
            return (Intrinsics.areEqual(((C28857o) abstractC28841e0).f58683d.f59470e, Boolean.TRUE) && (listM69099b == null || listM69099b.isEmpty())) ? false : true;
        }
        FieldError fieldError = null;
        if (abstractC28841e0 instanceof C28827V) {
            C28827V c28827v = (C28827V) abstractC28841e0;
            C29470F c29470f = c28827v.f58631d;
            String strM69098a = c28167d.m69098a(abstractC28841e0);
            List listEmptyList = c28827v.f58631d.f59474i;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (Intrinsics.areEqual(c29470f.f59470e, Boolean.TRUE) && (strM69098a == null || StringsKt.isBlank(strM69098a))) {
                fieldError = FieldError.REQUIRED;
            } else if (!listEmptyList.isEmpty() && strM69098a != null && !StringsKt.isBlank(strM69098a)) {
                if (listEmptyList.isEmpty()) {
                    fieldError = FieldError.NOT_VALID;
                } else {
                    Iterator it = listEmptyList.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((C29494N) it.next()).f59517a, strM69098a)) {
                        }
                    }
                    fieldError = FieldError.NOT_VALID;
                }
            }
            return fieldError == null;
        }
        if (abstractC28841e0 instanceof C28821O) {
            C28821O c28821o = (C28821O) abstractC28841e0;
            String strM69098a2 = c28167d.m69098a(m69119a(c28821o));
            String strM69098a3 = c28167d.m69098a(abstractC28841e0);
            if (strM69098a3 == null) {
                strM69098a3 = "";
            }
            C29405l0.Companion.getClass();
            String strM69854a = C29389j0.m69854a(strM69098a2, strM69098a3);
            FieldError fieldErrorM69660a = AbstractC28849i0.m69660a(c28821o.f58617e, strM69854a);
            if (fieldErrorM69660a != null) {
                obj = fieldErrorM69660a;
            } else if (AbstractC28974a.m69714a(strM69098a3) || StringsKt.isBlank(strM69854a)) {
                obj = abstractC28841e0;
                obj = null;
            }
            obj = abstractC28841e0;
            return !((Intrinsics.areEqual(c28821o.f58617e.f59470e, Boolean.TRUE) && StringsKt.isBlank(strM69854a)) || obj != null);
        }
        if (abstractC28841e0 instanceof C28825T) {
            String strM69098a4 = c28167d.m69098a(abstractC28841e0);
            return (Intrinsics.areEqual(((C28825T) abstractC28841e0).f58627d.f59470e, Boolean.TRUE) && (strM69098a4 == null || strM69098a4.length() == 0)) ? false : true;
        }
        if (abstractC28841e0 instanceof C28819M) {
            List listM69099b2 = c28167d.m69099b(abstractC28841e0);
            return (Intrinsics.areEqual(((C28819M) abstractC28841e0).f58608d.f59470e, Boolean.TRUE) && (listM69099b2 == null || listM69099b2.isEmpty())) ? false : true;
        }
        if (abstractC28841e0 instanceof C28809C) {
            C28809C c28809c = (C28809C) abstractC28841e0;
            return !(Intrinsics.areEqual(c28809c.f58578d.f59470e, Boolean.TRUE) && c28167d.m69098a(c28809c) == null) && c28809c.f58584j == null;
        }
        if (abstractC28841e0 instanceof C28817K) {
            C28817K c28817k = (C28817K) abstractC28841e0;
            return m69121a(c28817k, c28167d) && ((list = c28817k.f58603k) == null || list.isEmpty());
        }
        if ((abstractC28841e0 instanceof C28865w) || (abstractC28841e0 instanceof C28811E) || (abstractC28841e0 instanceof C28823Q) || (abstractC28841e0 instanceof C28829X) || (abstractC28841e0 instanceof C28813G) || (abstractC28841e0 instanceof C28867y) || (abstractC28841e0 instanceof C28839d0) || (abstractC28841e0 instanceof C28846h) || (abstractC28841e0 instanceof C28815I)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final C28811E m69123b(C28821O c28821o) {
        return new C28811E(new C29470F(c28821o.f58617e.f59466a + ".countryPhoneCode", (String) null, (String) null, "text", Boolean.FALSE, (String) null, (String) null, (String) null, (List) null, 992), "internal." + c28821o.f58616d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX INFO: renamed from: a */
    public static final boolean m69121a(C28817K c28817k, C28167d c28167d) {
        boolean z11;
        List listM69099b = c28167d.m69099b(c28817k);
        if (listM69099b == null) {
            listM69099b = CollectionsKt.emptyList();
        }
        boolean zIsEmpty = listM69099b.isEmpty();
        Boolean bool = c28817k.f58596d.f59470e;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool2)) {
            z11 = true;
        } else {
            if (!zIsEmpty) {
                C29470F c29470f = c28817k.f58596d;
                C29705v0 c29705v0 = AbstractC29028M0.Companion;
                String str = c29470f.f59471f;
                c29705v0.getClass();
                AbstractC29028M0 abstractC29028M0M69909a = C29705v0.m69909a(str);
                if (abstractC29028M0M69909a != null) {
                    boolean z12 = (abstractC29028M0M69909a instanceof C29695t0) && ((int) ((C29695t0) abstractC29028M0M69909a).f59741a.f59229a) > 0;
                    boolean z13 = (abstractC29028M0M69909a instanceof C29000F0) && ((C29000F0) abstractC29028M0M69909a).f58945a > 0.0d;
                    if (z12 || z13) {
                        z11 = true;
                    }
                }
            }
            z11 = false;
        }
        String strValueOf = String.valueOf(listM69099b.size());
        C29470F c29470f2 = c28817k.f58596d;
        C29705v0 c29705v1 = AbstractC29028M0.Companion;
        String str2 = c29470f2.f59471f;
        c29705v1.getClass();
        AbstractC29028M0 abstractC29028M0M69909a2 = C29705v0.m69909a(str2);
        if (abstractC29028M0M69909a2 == null) {
            abstractC29028M0M69909a2 = null;
        } else if ((abstractC29028M0M69909a2 instanceof C28981B0) && Intrinsics.areEqual(c28817k.f58596d.f59470e, bool2)) {
            abstractC29028M0M69909a2 = new C29695t0(new C29237K(1.0d, ((C28981B0) abstractC29028M0M69909a2).f58904a));
        }
        return !z11 || AbstractC28967a.m69711a(abstractC29028M0M69909a2, strValueOf);
    }

    /* JADX INFO: renamed from: a */
    public static final String m69120a(FieldError fieldError, C28803j c28803j) {
        int i11 = AbstractC28177a.f57442a[fieldError.ordinal()];
        if (i11 == 1) {
            if (c28803j != null) {
                return c28803j.f58574a;
            }
            return null;
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (c28803j != null) {
            return c28803j.f58575b;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final C28811E m69119a(C28821O c28821o) {
        return new C28811E(new C29470F(c28821o.f58617e.f59466a + ".countryCode", (String) null, (String) null, "text", Boolean.FALSE, (String) null, (String) null, (String) null, (List) null, 992), "internal." + c28821o.f58616d);
    }

    /* JADX INFO: renamed from: a */
    public static final FieldId m69118a(AbstractC28841e0 abstractC28841e0) {
        String strMo69643d = abstractC28841e0.mo69643d();
        if (strMo69643d == null) {
            strMo69643d = "";
        }
        String str = abstractC28841e0.mo69642c().f59466a;
        return new FieldId(strMo69643d, str != null ? str : "");
    }
}
