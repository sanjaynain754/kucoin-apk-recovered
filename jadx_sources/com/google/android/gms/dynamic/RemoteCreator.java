package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@KeepForSdk
public abstract class RemoteCreator<T> {
    private final String zza;
    private Object zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @KeepForSdk
    public static class RemoteCreatorException extends Exception {
        @KeepForSdk
        public RemoteCreatorException(@NonNull String str) {
            super(str);
        }

        @KeepForSdk
        public RemoteCreatorException(@NonNull String str, @NonNull Throwable th2) {
            super(str, th2);
        }
    }

    @NonNull
    @KeepForSdk
    public abstract T getRemoteCreator(@NonNull IBinder iBinder);

    @NonNull
    @KeepForSdk
    public final T getRemoteCreatorInstance(@NonNull Context context) throws RemoteCreatorException {
        if (this.zzb == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                throw new RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e11) {
                throw new RemoteCreatorException("Could not load creator class.", e11);
            } catch (IllegalAccessException e12) {
                throw new RemoteCreatorException("Could not access creator.", e12);
            } catch (InstantiationException e13) {
                throw new RemoteCreatorException("Could not instantiate creator.", e13);
            }
        }
        return (T) this.zzb;
    }

    @KeepForSdk
    public RemoteCreator(@NonNull String str) {
        this.zza = str;
    }
}
