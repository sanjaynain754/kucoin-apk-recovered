package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.C33978va;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzp zzk;
    private static zzq zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();

    @NonNull
    public static final VersionPolicy zza = new zzl();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @NonNull
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzo zzoVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th2, zzo zzoVar) {
            super(str, th2);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    public interface VersionPolicy {

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
        @KeepForSdk
        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str);

            int zzb(@NonNull Context context, @NonNull String str, boolean z11) throws LoadingException;
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
        @KeepForSdk
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x017e  */
    /* JADX WARN: Code duplicated, block: B:127:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0144: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:325), block:B:93:0x0144 */
    private static int zzb(Context context, String str, boolean z11, boolean z12) throws Throwable {
        Throwable th2;
        Exception exc;
        Cursor cursor;
        MatrixCursor matrixCursor;
        Cursor cursor2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            try {
                boolean z13 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z11 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) zzh.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z14 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i11 = 0; i11 < count; i11++) {
                                    if (!cursorQuery.moveToPosition(i11)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr4 = new Object[columnCount];
                                    for (int i12 = 0; i12 < columnCount; i12++) {
                                        int type = cursorQuery.getType(i12);
                                        if (type == 0) {
                                            objArr4[i12] = null;
                                        } else if (type == 1) {
                                            objArr4[i12] = Long.valueOf(cursorQuery.getLong(i12));
                                        } else if (type == 2) {
                                            objArr4[i12] = Double.valueOf(cursorQuery.getDouble(i12));
                                        } else if (type == 3) {
                                            objArr4[i12] = cursorQuery.getString(i12);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr4[i12] = cursorQuery.getBlob(i12);
                                        }
                                    }
                                    matrixCursor.addRow(objArr4);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th3) {
                                try {
                                    cursorQuery.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th5) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th5;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i13 = matrixCursor.getInt(0);
                            if (i13 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        zzc = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            zze = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (matrixCursor.getInt(columnIndex2) == 0) {
                                                z13 = false;
                                            }
                                            zzd = z13;
                                            z14 = z13;
                                        }
                                    } catch (Throwable th6) {
                                        throw th6;
                                    }
                                }
                                if (zze(matrixCursor)) {
                                    matrixCursor = null;
                                }
                            }
                            if (z12 && z14) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", objArr2 == true ? 1 : 0);
                            }
                            if (matrixCursor != null) {
                                matrixCursor.close();
                            }
                            return i13;
                        }
                    } catch (Exception e11) {
                        exc = e11;
                        if (exc instanceof LoadingException) {
                            throw exc;
                        }
                        throw new LoadingException("V2 version check failed: " + exc.getMessage(), exc, objArr == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
            } catch (Throwable th7) {
                th2 = th7;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th2;
                }
                cursor2.close();
                throw th2;
            }
        } catch (Exception e12) {
            exc = e12;
        } catch (Throwable th8) {
            th2 = th8;
            if (cursor2 != null) {
                throw th2;
            }
            cursor2.close();
            throw th2;
        }
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzq zzqVar;
        zzo zzoVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzqVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
            }
            zzl = zzqVar;
        } catch (ClassNotFoundException e11) {
            e = e11;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzoVar);
        } catch (IllegalAccessException e12) {
            e = e12;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzoVar);
        } catch (InstantiationException e13) {
            e = e13;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzoVar);
        } catch (NoSuchMethodException e14) {
            e = e14;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzoVar);
        } catch (InvocationTargetException e15) {
            e = e15;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzoVar);
        }
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e11) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e11.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0244  */
    /* JADX WARN: Code duplicated, block: B:118:0x024a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0253  */
    /* JADX WARN: Code duplicated, block: B:126:0x0265 A[Catch: all -> 0x007d, TryCatch #7 {all -> 0x007d, blocks: (B:7:0x0040, B:11:0x0077, B:18:0x0083, B:21:0x0089, B:24:0x0091, B:103:0x01f7, B:104:0x0202, B:107:0x0205, B:108:0x0206, B:109:0x020e, B:126:0x0265, B:127:0x027c, B:110:0x020f, B:112:0x022d, B:114:0x023c, B:124:0x025c, B:125:0x0264, B:128:0x027d, B:129:0x02ad), top: B:149:0x0040, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0089 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #7 {all -> 0x007d, blocks: (B:7:0x0040, B:11:0x0077, B:18:0x0083, B:21:0x0089, B:24:0x0091, B:103:0x01f7, B:104:0x0202, B:107:0x0205, B:108:0x0206, B:109:0x020e, B:126:0x0265, B:127:0x027c, B:110:0x020f, B:112:0x022d, B:114:0x023c, B:124:0x025c, B:125:0x0264, B:128:0x027d, B:129:0x02ad), top: B:149:0x0040, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[Catch: all -> 0x01ea, TryCatch #3 {, blocks: (B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4), top: B:145:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1 A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TRY_ENTER, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8 A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TRY_ENTER, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0148 A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0154 A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0178 A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x017f A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0187 A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0196 A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a1 A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01b1 A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c6 A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01cf A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d8 A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01e1 A[Catch: all -> 0x0106, LoadingException -> 0x0109, RemoteException -> 0x010c, TryCatch #8 {RemoteException -> 0x010c, LoadingException -> 0x0109, all -> 0x0106, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c8, B:39:0x00ce, B:41:0x00d6, B:43:0x00da, B:44:0x00e5, B:52:0x00f2, B:60:0x0122, B:62:0x012a, B:64:0x0132, B:65:0x013b, B:59:0x010f, B:68:0x013e, B:69:0x013f, B:70:0x0147, B:71:0x0148, B:72:0x0150, B:75:0x0153, B:76:0x0154, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ec A[Catch: all -> 0x01ea, TRY_ENTER, TryCatch #3 {, blocks: (B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ec, B:100:0x01f4), top: B:145:0x0096 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x0265, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00a8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0154, please report this as an issue */
    @NonNull
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws Throwable {
        long j11;
        DynamiteModule dynamiteModuleZzc;
        int i11;
        Boolean bool;
        zzp zzpVarZzg;
        int iZze;
        IObjectWrapper iObjectWrapperZzh;
        Object objUnwrap;
        DynamiteModule dynamiteModule;
        zzm zzmVar;
        zzq zzqVar;
        zzm zzmVar2;
        boolean z11;
        IObjectWrapper iObjectWrapperZze;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        zzo zzoVar = null;
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = zzg;
        zzm zzmVar3 = (zzm) threadLocal.get();
        zzm zzmVar4 = new zzm(null);
        threadLocal.set(zzmVar4);
        ThreadLocal threadLocal2 = zzh;
        Long l11 = (Long) threadLocal2.get();
        long jLongValue = l11.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzi);
            int i12 = selectionResultSelectModule.localVersion;
            j11 = 0;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + C33844oi.f71346o + i12 + " and remote module " + str + C33844oi.f71346o + selectionResultSelectModule.remoteVersion);
                int i13 = selectionResultSelectModule.selection;
                if (i13 != 0) {
                    if (i13 != -1) {
                        if (i13 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                            if (i13 == -1) {
                                dynamiteModuleZzc = zzc(applicationContext, str);
                            } else {
                                if (i13 == 1) {
                                    throw new LoadingException("VersionPolicy returned invalid code:" + i13, null);
                                }
                                try {
                                    i11 = selectionResultSelectModule.remoteVersion;
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (zzf(context)) {
                                                throw new LoadingException("Remote loading disabled", null);
                                            }
                                            bool = zzb;
                                        }
                                        if (bool != null) {
                                            throw new LoadingException("Failed to determine which loading route to use.", null);
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                            synchronized (DynamiteModule.class) {
                                                zzqVar = zzl;
                                            }
                                            if (zzqVar != null) {
                                                throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                            }
                                            zzmVar2 = (zzm) threadLocal.get();
                                            if (zzmVar2 != null || zzmVar2.zza == null) {
                                                throw new LoadingException("No result cursor", null);
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = zzmVar2.zza;
                                            ObjectWrapper.wrap(null);
                                            synchronized (DynamiteModule.class) {
                                                z11 = zze >= 2;
                                            }
                                            if (z11) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                iObjectWrapperZze = zzqVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i11, ObjectWrapper.wrap(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                iObjectWrapperZze = zzqVar.zze(ObjectWrapper.wrap(applicationContext2), str, i11, ObjectWrapper.wrap(cursor2));
                                            }
                                            Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperZze);
                                            if (context2 == null) {
                                                throw new LoadingException("Failed to get module context", zzoVar);
                                            }
                                            dynamiteModule = new DynamiteModule(context2);
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                            zzpVarZzg = zzg(context);
                                            if (zzpVarZzg != null) {
                                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                            }
                                            iZze = zzpVarZzg.zze();
                                            if (iZze >= 3) {
                                                zzmVar = (zzm) threadLocal.get();
                                                if (zzmVar != null) {
                                                    throw new LoadingException("No cached result cursor holder", null);
                                                }
                                                iObjectWrapperZzh = zzpVarZzg.zzi(ObjectWrapper.wrap(context), str, i11, ObjectWrapper.wrap(zzmVar.zza));
                                            } else if (iZze == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                iObjectWrapperZzh = zzpVarZzg.zzj(ObjectWrapper.wrap(context), str, i11);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                iObjectWrapperZzh = zzpVarZzg.zzh(ObjectWrapper.wrap(context), str, i11);
                                            }
                                            objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                            if (objUnwrap != null) {
                                                throw new LoadingException("Failed to load remote module.", null);
                                            }
                                            dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                        }
                                        dynamiteModuleZzc = dynamiteModule;
                                    } catch (RemoteException e11) {
                                        throw new LoadingException("Failed to load remote module.", e11, null);
                                    } catch (LoadingException e12) {
                                        throw e12;
                                    } catch (Throwable th2) {
                                        CrashUtils.addDynamiteErrorToDropBox(context, th2);
                                        throw new LoadingException("Failed to load remote module.", th2, null);
                                    }
                                } catch (LoadingException e13) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e13.getMessage());
                                    int i14 = selectionResultSelectModule.localVersion;
                                    if (i14 == 0 || versionPolicy.selectModule(context, str, new zzn(i14, 0)).selection != -1) {
                                        throw new LoadingException("Remote load failed. No local fallback found.", e13, null);
                                    }
                                    dynamiteModuleZzc = zzc(applicationContext, str);
                                }
                            }
                            if (jLongValue == 0) {
                                zzh.remove();
                            } else {
                                zzh.set(l11);
                            }
                            cursor = zzmVar4.zza;
                            if (cursor != null) {
                                cursor.close();
                            }
                            zzg.set(zzmVar3);
                            return dynamiteModuleZzc;
                        }
                    } else if (selectionResultSelectModule.localVersion != 0) {
                        i13 = -1;
                        if (i13 == 1) {
                        }
                        if (i13 == -1) {
                            dynamiteModuleZzc = zzc(applicationContext, str);
                        } else {
                            if (i13 == 1) {
                                throw new LoadingException("VersionPolicy returned invalid code:" + i13, null);
                            }
                            i11 = selectionResultSelectModule.remoteVersion;
                            synchronized (DynamiteModule.class) {
                                if (zzf(context)) {
                                    throw new LoadingException("Remote loading disabled", null);
                                }
                                bool = zzb;
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                    synchronized (DynamiteModule.class) {
                                        zzqVar = zzl;
                                        if (zzqVar != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        zzmVar2 = (zzm) threadLocal.get();
                                        if (zzmVar2 != null) {
                                        }
                                        throw new LoadingException("No result cursor", null);
                                    }
                                }
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                zzpVarZzg = zzg(context);
                                if (zzpVarZzg != null) {
                                    throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                }
                                iZze = zzpVarZzg.zze();
                                if (iZze >= 3) {
                                    zzmVar = (zzm) threadLocal.get();
                                    if (zzmVar != null) {
                                        throw new LoadingException("No cached result cursor holder", null);
                                    }
                                    iObjectWrapperZzh = zzpVarZzg.zzi(ObjectWrapper.wrap(context), str, i11, ObjectWrapper.wrap(zzmVar.zza));
                                } else if (iZze == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    iObjectWrapperZzh = zzpVarZzg.zzj(ObjectWrapper.wrap(context), str, i11);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    iObjectWrapperZzh = zzpVarZzg.zzh(ObjectWrapper.wrap(context), str, i11);
                                }
                                objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                if (objUnwrap != null) {
                                    throw new LoadingException("Failed to load remote module.", null);
                                }
                                dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                dynamiteModuleZzc = dynamiteModule;
                            }
                        }
                        if (jLongValue == 0) {
                            zzh.remove();
                        } else {
                            zzh.set(l11);
                        }
                        cursor = zzmVar4.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        zzg.set(zzmVar3);
                        return dynamiteModuleZzc;
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultSelectModule.localVersion + " and remote version is " + selectionResultSelectModule.remoteVersion + C33978va.f72339h, null);
            } catch (Throwable th3) {
                th = th3;
                if (jLongValue == j11) {
                    zzh.remove();
                } else {
                    zzh.set(l11);
                }
                Cursor cursor3 = zzmVar4.zza;
                if (cursor3 != null) {
                    cursor3.close();
                }
                zzg.set(zzmVar3);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            j11 = 0;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:138:0x01cc */
    /* JADX WARN: Code duplicated, block: B:106:0x017d A[Catch: all -> 0x00ec, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00ec, blocks: (B:3:0x0002, B:64:0x00e1, B:66:0x00e7, B:74:0x010d, B:102:0x016f, B:106:0x017d, B:124:0x01d2, B:125:0x01d5, B:119:0x01c9, B:72:0x00f2, B:127:0x01d7, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00de, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00e0, B:61:0x00c2), top: B:134:0x0002, inners: #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0 A[Catch: all -> 0x0036, TryCatch #10 {all -> 0x0036, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b9, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004f, B:27:0x0053, B:31:0x005d, B:33:0x0065, B:36:0x006c, B:43:0x0098, B:44:0x00a0, B:39:0x0073, B:41:0x0079, B:42:0x008a, B:47:0x00a3, B:50:0x00a6, B:51:0x00b0, B:17:0x003e), top: B:141:0x0026, inners: #12 }] */
    public static int zza(@NonNull Context context, @NonNull String str, boolean z11) {
        Throwable th2;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                int iZzf = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        zzd(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!zzf(context)) {
                                        return 0;
                                    }
                                    if (zzd) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iZzb = zzb(context, str, z11, true);
                                                String str2 = zzc;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderZza = zzb.zza();
                                                    if (classLoaderZza == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            C7059b.m12905a();
                                                            String str3 = zzc;
                                                            Preconditions.checkNotNull(str3);
                                                            classLoaderZza = C7058a.m12904a(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = zzc;
                                                            Preconditions.checkNotNull(str4);
                                                            classLoaderZza = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    zzd(classLoaderZza);
                                                    declaredField.set(null, classLoaderZza);
                                                    zzb = bool2;
                                                    return iZzb;
                                                }
                                                return iZzb;
                                            } catch (LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                zzb = bool;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e11.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z11, false);
                    } catch (LoadingException e12) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e12.getMessage());
                        return 0;
                    }
                }
                zzp zzpVarZzg = zzg(context);
                try {
                    if (zzpVarZzg != null) {
                        try {
                            int iZze = zzpVarZzg.zze();
                            if (iZze >= 3) {
                                zzm zzmVar = (zzm) zzg.get();
                                if (zzmVar == null || (cursor = zzmVar.zza) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzpVarZzg.zzk(ObjectWrapper.wrap(context), str, z11, ((Long) zzh.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i11 = cursor3.getInt(0);
                                                cursor2 = (i11 <= 0 || !zze(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzf = i11;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e13) {
                                            remoteException = e13;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th2;
                                            }
                                            cursor2.close();
                                            throw th2;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iZzf = cursor.getInt(0);
                                }
                            } else if (iZze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzpVarZzg.zzg(ObjectWrapper.wrap(context), str, z11);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzpVarZzg.zzf(ObjectWrapper.wrap(context), str, z11);
                            }
                        } catch (RemoteException e14) {
                            remoteException = e14;
                        }
                    }
                    return iZzf;
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
        } catch (Throwable th6) {
            CrashUtils.addDynamiteErrorToDropBox(context, th6);
            throw th6;
        }
    }

    private static boolean zze(Cursor cursor) {
        zzm zzmVar = (zzm) zzg.get();
        if (zzmVar == null || zzmVar.zza != null) {
            return false;
        }
        zzmVar.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z11 = false;
        if (zzf == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != PlatformVersion.isAtLeastQ() ? 0 : 268435456);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, DefaultEncoderProfilesProvider.DEFAULT_VIDEO_BITRATE_FHD) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z11 = true;
            }
            zzf = Boolean.valueOf(z11);
            if (z11 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!z11) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z11;
    }

    private static zzp zzg(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = zzk;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder);
                }
                if (zzpVar != null) {
                    zzk = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e11) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e11.getMessage());
            }
            return null;
        }
    }

    @NonNull
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e11) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e11, null);
        }
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }
}
