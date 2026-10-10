package com.ishumei.smantifraud.l111l11111lIl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l111l11111Il {
    private static final String l1111l111111Il = "fc_times";
    private static final int l111l11111I1l = 2880;
    private static final String l111l11111Il = "ttl";
    private static final String l111l11111lIl = "l";
    private static final int l111l1111l1Il = 100;
    private static final String l111l1111lI1l = "t";
    private static l111l11111Il l111l1111lIl = null;
    private static final String l111l1111llIl = "cnt";
    private SharedPreferences.Editor l11l1111I11l;
    private List<String> l11l1111I1l = null;
    private SharedPreferences l11l1111lIIl;

    public static synchronized l111l11111Il l1111l111111Il() {
        try {
            if (l111l1111lIl == null) {
                l111l1111lIl = new l111l11111Il();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return l111l1111lIl;
    }

    public final synchronized List<String> l111l11111I1l() {
        ArrayList arrayList = new ArrayList();
        List<String> list = this.l11l1111I1l;
        if (list == null) {
            return arrayList;
        }
        arrayList.addAll(list);
        this.l11l1111I1l = null;
        return arrayList;
    }

    public final synchronized boolean l111l11111lIl() {
        try {
            try {
                SharedPreferences sharedPreferences = this.l11l1111lIIl;
                if (sharedPreferences != null && this.l11l1111I11l != null) {
                    int iMin = Math.min(sharedPreferences.getInt(l111l11111Il, 0), l111l11111I1l);
                    if (iMin == 0) {
                        l111l1111l1Il();
                        return true;
                    }
                    if (((long) iMin) * 60000 < Math.abs(System.currentTimeMillis() - this.l11l1111lIIl.getLong("l", 0L))) {
                        l111l1111l1Il();
                        return true;
                    }
                    if (this.l11l1111lIIl.getStringSet(l111l1111lI1l, new HashSet()).size() >= Math.min(this.l11l1111lIIl.getInt(l111l1111llIl, 0), 100)) {
                        l111l1111l1Il();
                        return true;
                    }
                    HashSet hashSet = new HashSet(this.l11l1111lIIl.getStringSet(l111l1111lI1l, new HashSet()));
                    hashSet.add(String.valueOf(System.currentTimeMillis()));
                    this.l11l1111I11l.putStringSet(l111l1111lI1l, hashSet);
                    this.l11l1111I11l.apply();
                    return false;
                }
                return true;
            } catch (Throwable unused) {
                l111l1111l1Il();
                return true;
            }
        } catch (Throwable unused2) {
            return true;
        }
    }

    private void l111l11111Il() {
        HashSet hashSet = new HashSet(this.l11l1111lIIl.getStringSet(l111l1111lI1l, new HashSet()));
        hashSet.add(String.valueOf(System.currentTimeMillis()));
        this.l11l1111I11l.putStringSet(l111l1111lI1l, hashSet);
        this.l11l1111I11l.apply();
    }

    private void l111l1111l1Il() {
        this.l11l1111I1l = new ArrayList(this.l11l1111lIIl.getStringSet(l111l1111lI1l, new HashSet()));
        this.l11l1111I11l.putLong("l", System.currentTimeMillis());
        this.l11l1111I11l.putStringSet(l111l1111lI1l, new HashSet());
        this.l11l1111I11l.apply();
    }

    public final synchronized void l1111l111111Il(int i11, int i12) {
        try {
            SharedPreferences.Editor editor = this.l11l1111I11l;
            if (editor != null) {
                if (i11 > 0) {
                    editor.putInt(l111l11111Il, i11);
                }
                if (i12 > 0) {
                    this.l11l1111I11l.putInt(l111l1111llIl, i12);
                }
                this.l11l1111I11l.apply();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private l111l11111Il() {
        try {
            Context contextL1111l111111Il = l111l1111l1Il.l1111l111111Il();
            if (contextL1111l111111Il != null) {
                SharedPreferences sharedPreferences = contextL1111l111111Il.getSharedPreferences(l1111l111111Il, 0);
                this.l11l1111lIIl = sharedPreferences;
                this.l11l1111I11l = sharedPreferences.edit();
            }
        } catch (Throwable unused) {
        }
    }
}
