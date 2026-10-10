package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.kubi.sdk.aspect.ConnectionTrackerAspect;
import dh0.C36686b;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.AbstractC43178a;
import org.aspectj.runtime.internal.C43179b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class ConnectionTracker {
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;
    private static final Object zzb;
    private static volatile ConnectionTracker zzc;

    @NonNull
    @VisibleForTesting
    public final ConcurrentHashMap zza = new ConcurrentHashMap();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    public class AjcClosure1 extends AbstractC43178a {
        @Override // org.aspectj.runtime.internal.AbstractC43178a
        public Object run(Object[] objArr) {
            Object[] objArr2 = this.state;
            return C43179b.m94788a(ConnectionTracker.bindService_aroundBody0((ConnectionTracker) objArr2[0], (Context) objArr2[1], (Intent) objArr2[2], (ServiceConnection) objArr2[3], C43179b.m94791d(objArr2[4]), (InterfaceC43175a) objArr2[5]));
        }

        public AjcClosure1(Object[] objArr) {
            super(objArr);
        }
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("com.google.android.gms:play-services-basement@@18.5.0", ConnectionTracker.class);
        ajc$tjp_0 = c36686b.m82128h("method-execution", c36686b.m82127g("1", "bindService", "com.google.android.gms.common.stats.ConnectionTracker", "android.content.Context:android.content.Intent:android.content.ServiceConnection:int", "context:intent:conn:flags", "", TypedValues.Custom.S_BOOLEAN), 1);
    }

    @NonNull
    @KeepForSdk
    public static ConnectionTracker getInstance() {
        if (zzc == null) {
            synchronized (zzb) {
                try {
                    if (zzc == null) {
                        zzc = new ConnectionTracker();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        ConnectionTracker connectionTracker = zzc;
        Preconditions.checkNotNull(connectionTracker);
        return connectionTracker;
    }

    private static boolean zzd(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof zzt);
    }

    private static final boolean zze(Context context, Intent intent, ServiceConnection serviceConnection, int i11, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!PlatformVersion.isAtLeastQ() || executor == null) ? context.bindService(intent, serviceConnection, i11) : context.bindService(intent, i11, executor, serviceConnection);
    }

    @KeepForSdk
    public boolean bindService(@NonNull Context context, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i11) {
        return C43179b.m94789b(ConnectionTrackerAspect.m56526b().m56527c(new AjcClosure1(new Object[]{this, context, intent, serviceConnection, C43179b.m94790c(i11), C36686b.m82125e(ajc$tjp_0, this, this, new Object[]{context, intent, serviceConnection, C43179b.m94790c(i11)})}).linkClosureAndJoinPoint(69648)));
    }

    public final boolean zza(@NonNull Context context, @NonNull String str, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i11, Executor executor) {
        return zzc(context, str, intent, serviceConnection, 4225, true, executor);
    }

    static {
        ajc$preClinit();
        zzb = new Object();
    }

    private ConnectionTracker() {
    }

    public static final /* synthetic */ boolean bindService_aroundBody0(ConnectionTracker connectionTracker, Context context, Intent intent, ServiceConnection serviceConnection, int i11, InterfaceC43175a interfaceC43175a) {
        return connectionTracker.zzc(context, context.getClass().getName(), intent, serviceConnection, i11, true, null);
    }

    private static void zzb(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean zzc(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i11, boolean z11, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((Wrappers.packageManager(context).getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (zzd(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.zza.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean zZze = zze(context, intent, serviceConnection, i11, executor);
                if (!zZze) {
                    this.zza.remove(serviceConnection, serviceConnection);
                    return false;
                }
                return zZze;
            } catch (Throwable th2) {
                this.zza.remove(serviceConnection, serviceConnection);
                throw th2;
            }
        }
        return zze(context, intent, serviceConnection, i11, executor);
    }

    @KeepForSdk
    public void unbindService(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        if (zzd(serviceConnection) && this.zza.containsKey(serviceConnection)) {
            try {
                zzb(context, (ServiceConnection) this.zza.get(serviceConnection));
                return;
            } finally {
                this.zza.remove(serviceConnection);
            }
        }
        zzb(context, serviceConnection);
    }

    @KeepForSdk
    public void unbindServiceSafe(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }
}
