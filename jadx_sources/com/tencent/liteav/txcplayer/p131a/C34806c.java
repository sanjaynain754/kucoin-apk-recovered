package com.tencent.liteav.txcplayer.p131a;

import com.tencent.liteav.base.storage.PersistStorage;
import java.util.HashSet;

/* JADX INFO: renamed from: com.tencent.liteav.txcplayer.a.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C34806c {

    /* JADX INFO: renamed from: a */
    public PersistStorage f73728a;

    /* JADX INFO: renamed from: b */
    public PersistStorage f73729b;

    /* JADX INFO: renamed from: a */
    public final void m76226a(String str, String str2) {
        this.f73729b.put(str, str2);
        PersistStorage persistStorage = this.f73728a;
        if (persistStorage != null) {
            persistStorage.clear(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m76227b(String str) {
        String string = this.f73729b.getString(str);
        if (string != null) {
            return string;
        }
        PersistStorage persistStorage = this.f73728a;
        if (persistStorage == null) {
            return null;
        }
        String string2 = persistStorage.getString(str);
        if (string2 != null) {
            this.f73729b.put(str, string2);
            this.f73728a.clear(str);
            this.f73729b.commit();
            this.f73728a.commit();
        }
        return string2;
    }

    public C34806c(String str) {
        this.f73728a = null;
        this.f73729b = null;
        PersistStorage persistStorage = new PersistStorage(str);
        this.f73729b = persistStorage;
        Integer num = persistStorage.getInt("old_data_move_completed");
        if (num == null || num.intValue() == 0) {
            PersistStorage persistStorage2 = new PersistStorage(str, true);
            this.f73728a = persistStorage2;
            if (persistStorage2.getAllKeys() != null && this.f73728a.getAllKeys().length != 0) {
                return;
            }
            this.f73728a = null;
            this.f73729b.put("old_data_move_completed", 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76225a(String str) {
        PersistStorage persistStorage = this.f73728a;
        if (persistStorage != null) {
            persistStorage.clear(str);
        }
        this.f73729b.clear(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m76224a() {
        this.f73729b.commit();
        PersistStorage persistStorage = this.f73728a;
        if (persistStorage != null) {
            persistStorage.commit();
        }
    }

    /* JADX INFO: renamed from: b */
    public final String[] m76228b() {
        String[] allKeys = this.f73729b.getAllKeys();
        PersistStorage persistStorage = this.f73728a;
        String[] allKeys2 = persistStorage == null ? null : persistStorage.getAllKeys();
        HashSet hashSet = new HashSet();
        if (allKeys != null && allKeys.length > 0) {
            for (String str : allKeys) {
                hashSet.add(str);
            }
        }
        if (allKeys2 != null && allKeys2.length > 0) {
            for (String str2 : allKeys2) {
                hashSet.add(str2);
            }
        }
        hashSet.remove("old_data_move_completed");
        if (hashSet.size() == 0) {
            return null;
        }
        String[] strArr = new String[hashSet.size()];
        hashSet.toArray(strArr);
        return strArr;
    }
}
