package com.google.android.gms.maps.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzca {
    private static final String zza = "zzca";

    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    private static Context zzb;
    private static zzf zzc;

    private static Context zzb(Exception exc, Context context) {
        Log.e(zza, "Failed to load maps module, use pre-Chimera", exc);
        return GooglePlayServicesUtil.getRemoteContext(context);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    @Nullable
    private static Context zzc(Context context, @Nullable MapsInitializer.Renderer renderer) {
        String str;
        Context contextZzb;
        Context context2 = zzb;
        if (context2 != null) {
            return context2;
        }
        context.getApplicationContext();
        if (renderer == null) {
            str = "com.google.android.gms.maps_dynamite";
        } else {
            int iOrdinal = renderer.ordinal();
            if (iOrdinal == 0) {
                str = "com.google.android.gms.maps_legacy_dynamite";
            } else if (iOrdinal != 1) {
                str = "com.google.android.gms.maps_dynamite";
            } else {
                str = "com.google.android.gms.maps_core_dynamite";
            }
        }
        try {
            contextZzb = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, str).getModuleContext();
        } catch (Exception e11) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                contextZzb = zzb(e11, context);
            } else {
                try {
                    Log.d(zza, "Attempting to load maps_dynamite again.");
                    contextZzb = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
                } catch (Exception e12) {
                    contextZzb = zzb(e12, context);
                }
            }
        }
        zzb = contextZzb;
        return contextZzb;
    }

    public static zzf zza(Context context, @Nullable MapsInitializer.Renderer renderer) throws GooglePlayServicesNotAvailableException {
        zzf zzeVar;
        Preconditions.checkNotNull(context);
        String str = zza;
        Log.d(str, "preferredRenderer: ".concat(String.valueOf(renderer)));
        zzf zzfVar = zzc;
        if (zzfVar == null) {
            int iIsGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
            if (iIsGooglePlayServicesAvailable == 0) {
                Log.i(str, "Making Creator dynamically");
                try {
                    IBinder iBinder = (IBinder) zzd(((ClassLoader) Preconditions.checkNotNull(zzc(context, renderer).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
                    if (iBinder == null) {
                        zzeVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        if (iInterfaceQueryLocalInterface instanceof zzf) {
                            zzeVar = (zzf) iInterfaceQueryLocalInterface;
                        } else {
                            zzeVar = new zze(iBinder);
                        }
                    }
                    zzc = zzeVar;
                    try {
                        Context contextZzc = zzc(context, renderer);
                        contextZzc.getClass();
                        zzeVar.zzk(ObjectWrapper.wrap(contextZzc.getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                        return zzc;
                    } catch (RemoteException e11) {
                        throw new RuntimeRemoteException(e11);
                    }
                } catch (ClassNotFoundException unused) {
                    throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
                }
            }
            throw new GooglePlayServicesNotAvailableException(iIsGooglePlayServicesAvailable);
        }
        return zzfVar;
    }

    private static <T> T zzd(Class cls) {
        String str;
        String str2;
        try {
            return (T) cls.newInstance();
        } catch (IllegalAccessException unused) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unable to call the default constructor of ".concat(name);
            } else {
                str2 = new String("Unable to call the default constructor of ");
            }
            throw new IllegalStateException(str2);
        } catch (InstantiationException unused2) {
            String name2 = cls.getName();
            if (name2.length() != 0) {
                str = "Unable to instantiate the dynamic class ".concat(name2);
            } else {
                str = new String("Unable to instantiate the dynamic class ");
            }
            throw new IllegalStateException(str);
        }
    }
}
