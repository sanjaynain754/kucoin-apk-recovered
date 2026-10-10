package com.fasterxml.jackson.core.util;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes45.dex */
public final class InternCache extends ConcurrentHashMap<String, String> {
    public static final InternCache instance = new InternCache();
    private static final long serialVersionUID = 1;
    private final Object lock;

    private InternCache() {
        super(180, 0.8f, 4);
        this.lock = new Object();
    }

    public String intern(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.lock) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}
