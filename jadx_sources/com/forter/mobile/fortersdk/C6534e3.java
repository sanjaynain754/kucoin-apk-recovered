package com.forter.mobile.fortersdk;

import androidx.credentials.provider.CredentialEntry;
import java.util.HashMap;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.e3 */
/* JADX INFO: loaded from: classes.dex */
public final class C6534e3 {

    /* JADX INFO: renamed from: a */
    public HashMap<EnumC6509ab, String> f10945a;

    public C6534e3() {
        this.f10945a = new HashMap<>();
    }

    public C6534e3(C6534e3 c6534e3) {
        this.f10945a = new HashMap<>();
        this.f10945a = new HashMap<>(c6534e3.f10945a);
    }

    /* JADX INFO: renamed from: b */
    public static String m12240b(boolean z11) {
        return z11 ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING;
    }

    /* JADX INFO: renamed from: a */
    public final String m12242a(EnumC6509ab enumC6509ab) {
        return this.f10945a.get(enumC6509ab);
    }

    /* JADX INFO: renamed from: c */
    public final void m12243c(EnumC6509ab enumC6509ab, int i11) {
        this.f10945a.put(enumC6509ab, String.valueOf(i11));
    }

    /* JADX INFO: renamed from: d */
    public final void m12244d(EnumC6509ab enumC6509ab, String str) {
        this.f10945a.put(enumC6509ab, str);
    }

    /* JADX INFO: renamed from: e */
    public final void m12245e(EnumC6509ab enumC6509ab, boolean z11) {
        this.f10945a.put(enumC6509ab, m12240b(z11));
    }

    /* JADX INFO: renamed from: g */
    public final int m12246g(EnumC6509ab enumC6509ab) {
        String str = this.f10945a.get(enumC6509ab);
        if (str != null) {
            return Integer.valueOf(str).intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12247h(EnumC6509ab enumC6509ab) {
        String str = this.f10945a.get(enumC6509ab);
        return str != null && m12241f(str) && Boolean.parseBoolean(str);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m12241f(String str) {
        if (!str.equalsIgnoreCase(CredentialEntry.TRUE_STRING) && !str.equalsIgnoreCase(CredentialEntry.FALSE_STRING)) {
            return false;
        }
        return true;
    }
}
