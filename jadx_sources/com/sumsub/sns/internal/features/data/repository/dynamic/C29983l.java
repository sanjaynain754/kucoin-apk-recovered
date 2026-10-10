package com.sumsub.sns.internal.features.data.repository.dynamic;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.p125ff.core.C33050a;
import java.util.List;
import java.util.Map;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29983l {

    /* JADX INFO: renamed from: a */
    public final Map f60248a;

    /* JADX INFO: renamed from: b */
    public final List f60249b;

    public C29983l(List list, Map map) {
        this.f60248a = map;
        this.f60249b = list;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0015 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x0012 A[RETURN] */
    /* JADX INFO: renamed from: a */
    public final String m70062a(String... strArr) {
        String strM70061a;
        for (String str : strArr) {
            strM70061a = m70061a(str);
            if (strM70061a != null) {
                if (strM70061a == null) {
                    return "";
                }
                return strM70061a;
            }
        }
        strM70061a = null;
        if (strM70061a == null) {
            return "";
        }
        return strM70061a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29983l)) {
            return false;
        }
        C29983l c29983l = (C29983l) obj;
        return Intrinsics.areEqual(this.f60248a, c29983l.f60248a) && Intrinsics.areEqual(this.f60249b, c29983l.f60249b);
    }

    /* JADX INFO: renamed from: a */
    public final String m70061a(String str) {
        C33050a c33050a = C33048a.f67482o;
        if (!c33050a.m71434a() || !StringsKt.contentEquals(c33050a.m71435b().f67504b, "keys", true)) {
            String str2 = (String) this.f60248a.get(str);
            if (str2 != null) {
                return str2;
            }
            Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "DataRepository: " + str + " is not found", null, 4, null);
            if (!c33050a.m71434a()) {
                return null;
            }
        }
        return str;
    }

    public final int hashCode() {
        int iHashCode = this.f60248a.hashCode() * 31;
        List list = this.f60249b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Strings(strings=" + this.f60248a + ", agreements=" + this.f60249b + ")";
    }

    public C29983l() {
        this.f60248a = MapsKt.emptyMap();
        this.f60249b = null;
    }
}
