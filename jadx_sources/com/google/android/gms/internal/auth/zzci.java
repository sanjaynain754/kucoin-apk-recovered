package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzci {
    private final SimpleArrayMap zza;

    public final String zza(Uri uri, String str, String str2, String str3) {
        SimpleArrayMap simpleArrayMap;
        if (uri != null) {
            simpleArrayMap = (SimpleArrayMap) this.zza.get(uri.toString());
        } else {
            simpleArrayMap = null;
        }
        if (simpleArrayMap == null) {
            return null;
        }
        return (String) simpleArrayMap.get("".concat(str3));
    }

    public zzci(SimpleArrayMap simpleArrayMap) {
        this.zza = simpleArrayMap;
    }
}
