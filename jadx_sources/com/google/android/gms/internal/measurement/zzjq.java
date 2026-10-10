package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjq implements zzju {
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private volatile Map zzh;

    @GuardedBy("ConfigurationContentLoader.class")
    private static final Map zzb = new ArrayMap();
    public static final String[] zza = {"key", "value"};
    private final Object zzg = new Object();

    @GuardedBy("this")
    private final List zzi = new ArrayList();

    public static zzjq zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzjq zzjqVar;
        synchronized (zzjq.class) {
            Map map = zzb;
            zzjqVar = (zzjq) map.get(uri);
            if (zzjqVar == null) {
                try {
                    zzjq zzjqVar2 = new zzjq(contentResolver, uri, runnable);
                    try {
                        contentResolver.registerContentObserver(uri, false, zzjqVar2.zzf);
                        map.put(uri, zzjqVar2);
                    } catch (SecurityException unused) {
                    }
                    zzjqVar = zzjqVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzjqVar;
    }

    public static synchronized void zzd() {
        try {
            Map map = zzb;
            for (zzjq zzjqVar : map.values()) {
                zzjqVar.zzc.unregisterContentObserver(zzjqVar.zzf);
            }
            map.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Map zzb() {
        Map map;
        Map map2 = this.zzh;
        if (map2 == null) {
            synchronized (this.zzg) {
                map2 = this.zzh;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) zzju.zzg(new zzjt() { // from class: com.google.android.gms.internal.measurement.zzjp
                                @Override // com.google.android.gms.internal.measurement.zzjt
                                public final /* synthetic */ Object zza() {
                                    return this.zza.zzf();
                                }
                            });
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException e11) {
                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e11);
                        map = Collections.EMPTY_MAP;
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    this.zzh = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final void zzc() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.zzi.iterator();
                while (it.hasNext()) {
                    ((zzjr) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ Map zzf() {
        ContentResolver contentResolver = this.zzc;
        Uri uri = this.zzd;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, zza, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        Map map = Collections.EMPTY_MAP;
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        arrayMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return arrayMap;
                    }
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map3 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map3;
                } catch (Throwable th2) {
                    if (cursorQuery == null) {
                        throw th2;
                    }
                    try {
                        cursorQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (RemoteException e11) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e11);
                Map map4 = Collections.EMPTY_MAP;
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th4) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th4;
        }
    }

    private zzjq(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        Preconditions.checkNotNull(contentResolver);
        Preconditions.checkNotNull(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        this.zzf = new zzjo(this, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzju
    public final /* bridge */ /* synthetic */ Object zze(String str) {
        return (String) zzb().get(str);
    }
}
