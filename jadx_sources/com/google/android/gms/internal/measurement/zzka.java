package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzka {
    public static final /* synthetic */ int zza = 0;

    @GuardedBy("PhenotypeConstants.class")
    private static final ArrayMap zzb = new ArrayMap();

    public static synchronized Uri zza(String str) {
        ArrayMap arrayMap = zzb;
        Uri uri = (Uri) arrayMap.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        arrayMap.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
