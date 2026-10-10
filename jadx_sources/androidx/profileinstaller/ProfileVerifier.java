package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileVerifier {
    private static final String CUR_PROFILES_BASE_DIR = "/data/misc/profiles/cur/0/";
    private static final String PROFILE_FILE_NAME = "primary.prof";
    private static final String PROFILE_INSTALLED_CACHE_FILE_NAME = "profileInstalled";
    private static final String REF_PROFILES_BASE_DIR = "/data/misc/profiles/ref/";
    private static final String TAG = "ProfileVerifier";
    private static final ResolvableFuture<CompilationStatus> sFuture = ResolvableFuture.create();
    private static final Object SYNC_OBJ = new Object();

    @Nullable
    private static CompilationStatus sCompilationStatus = null;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class Cache {
        private static final int SCHEMA = 1;
        final long mInstalledCurrentProfileSize;
        final long mPackageLastUpdateTime;
        final int mResultCode;
        final int mSchema;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof Cache)) {
                Cache cache = (Cache) obj;
                if (this.mResultCode == cache.mResultCode && this.mPackageLastUpdateTime == cache.mPackageLastUpdateTime && this.mSchema == cache.mSchema && this.mInstalledCurrentProfileSize == cache.mInstalledCurrentProfileSize) {
                    return true;
                }
            }
            return false;
        }

        public static Cache readFromFile(@NonNull File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                Cache cache = new Cache(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return cache;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.mResultCode), Long.valueOf(this.mPackageLastUpdateTime), Integer.valueOf(this.mSchema), Long.valueOf(this.mInstalledCurrentProfileSize));
        }

        public Cache(int i11, int i12, long j11, long j12) {
            this.mSchema = i11;
            this.mResultCode = i12;
            this.mPackageLastUpdateTime = j11;
            this.mInstalledCurrentProfileSize = j12;
        }

        public void writeOnFile(@NonNull File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.mSchema);
                dataOutputStream.writeInt(this.mResultCode);
                dataOutputStream.writeLong(this.mPackageLastUpdateTime);
                dataOutputStream.writeLong(this.mInstalledCurrentProfileSize);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static class CompilationStatus {
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE = 1;
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING = 3;
        public static final int RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ = 131072;

        /* JADX INFO: renamed from: RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE */
        public static final int f3592xf2722a21 = 196608;
        private static final int RESULT_CODE_ERROR_CODE_BIT_SHIFT = 16;
        public static final int RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED = 327680;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 65536;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 262144;

        @Deprecated
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_NO_PROFILE_INSTALLED = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;
        private final boolean mHasCurrentProfile;
        private final boolean mHasEmbeddedProfile;
        private final boolean mHasReferenceProfile;
        final int mResultCode;

        /* JADX INFO: loaded from: classes34.dex */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface ResultCode {
        }

        public boolean appApkHasEmbeddedProfile() {
            return this.mHasEmbeddedProfile;
        }

        public int getProfileInstallResultCode() {
            return this.mResultCode;
        }

        public boolean hasProfileEnqueuedForCompilation() {
            return this.mHasCurrentProfile;
        }

        public boolean isCompiledWithProfile() {
            return this.mHasReferenceProfile;
        }

        public CompilationStatus(int i11, boolean z11, boolean z12, boolean z13) {
            this.mResultCode = i11;
            this.mHasCurrentProfile = z12;
            this.mHasReferenceProfile = z11;
            this.mHasEmbeddedProfile = z13;
        }
    }

    @NonNull
    @WorkerThread
    public static CompilationStatus writeProfileVerification(@NonNull Context context) {
        return writeProfileVerification(context, false);
    }

    @RequiresApi(33)
    public static class Api33Impl {
        private Api33Impl() {
        }

        public static PackageInfo getPackageInfo(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    @NonNull
    public static ListenableFuture<CompilationStatus> getCompilationStatusAsync() {
        return sFuture;
    }

    private static CompilationStatus setCompilationStatus(int i11, boolean z11, boolean z12, boolean z13) {
        CompilationStatus compilationStatus = new CompilationStatus(i11, z11, z12, z13);
        sCompilationStatus = compilationStatus;
        sFuture.set(compilationStatus);
        return sCompilationStatus;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @WorkerThread
    public static CompilationStatus writeProfileVerification(@NonNull Context context, boolean z11) {
        int i11;
        boolean z12;
        int i12;
        File file;
        boolean z13;
        File file2;
        long length;
        boolean z14;
        File file3;
        Cache fromFile;
        Cache cache;
        int i13;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        CompilationStatus compilationStatus;
        if (!z11 && (compilationStatus = sCompilationStatus) != null) {
            return compilationStatus;
        }
        synchronized (SYNC_OBJ) {
            if (z11) {
                i11 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                assetFileDescriptorOpenFd.close();
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 28) {
                    file = new File(new File(REF_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
                    long length2 = file.length();
                    if (file.exists()) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    file2 = new File(new File(CUR_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
                    length = file2.length();
                    if (file2.exists()) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    long packageLastUpdateTime = getPackageLastUpdateTime(context);
                    file3 = new File(context.getFilesDir(), PROFILE_INSTALLED_CACHE_FILE_NAME);
                    if (file3.exists()) {
                        fromFile = Cache.readFromFile(file3);
                    } else {
                        fromFile = null;
                    }
                    if (fromFile == null) {
                        if (!z12) {
                            i11 = CompilationStatus.RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED;
                        } else if (z13) {
                            i11 = 1;
                        } else if (z14) {
                            i11 = 2;
                        }
                    } else if (!z12) {
                        i11 = CompilationStatus.RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED;
                    } else if (z13) {
                        i11 = 1;
                    } else if (z14) {
                        i11 = 2;
                    }
                    if (z11) {
                        i11 = 2;
                    }
                    if (fromFile != null) {
                        i11 = 3;
                    }
                    int i14 = i11;
                    cache = new Cache(1, i14, packageLastUpdateTime, length);
                    if (fromFile != null) {
                        cache.writeOnFile(file3);
                    } else {
                        cache.writeOnFile(file3);
                    }
                    return setCompilationStatus(i14, z13, z14, z12);
                }
                return setCompilationStatus(262144, false, false, z12);
            }
            CompilationStatus compilationStatus2 = sCompilationStatus;
            if (compilationStatus2 != null) {
                return compilationStatus2;
            }
            i11 = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th2) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th2;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                z12 = false;
            }
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28 && i12 != 30) {
                file = new File(new File(REF_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                file2 = new File(new File(CUR_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                try {
                    long packageLastUpdateTime2 = getPackageLastUpdateTime(context);
                    file3 = new File(context.getFilesDir(), PROFILE_INSTALLED_CACHE_FILE_NAME);
                    if (file3.exists()) {
                        try {
                            fromFile = Cache.readFromFile(file3);
                        } catch (IOException unused2) {
                            return setCompilationStatus(131072, z13, z14, z12);
                        }
                    } else {
                        fromFile = null;
                    }
                    if (fromFile == null && fromFile.mPackageLastUpdateTime == packageLastUpdateTime2 && (i13 = fromFile.mResultCode) != 2) {
                        i11 = i13;
                    } else if (!z12) {
                        i11 = CompilationStatus.RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED;
                    } else if (z13) {
                        i11 = 1;
                    } else if (z14) {
                        i11 = 2;
                    }
                    if (z11 && z14 && i11 != 1) {
                        i11 = 2;
                    }
                    if (fromFile != null && fromFile.mResultCode == 2 && i11 == 1 && length3 < fromFile.mInstalledCurrentProfileSize) {
                        i11 = 3;
                    }
                    int i15 = i11;
                    cache = new Cache(1, i15, packageLastUpdateTime2, length);
                    if (fromFile != null || !fromFile.equals(cache)) {
                        try {
                            cache.writeOnFile(file3);
                        } catch (IOException unused3) {
                            i15 = CompilationStatus.f3592xf2722a21;
                        }
                    }
                    return setCompilationStatus(i15, z13, z14, z12);
                } catch (PackageManager.NameNotFoundException unused4) {
                    return setCompilationStatus(65536, z13, z14, z12);
                }
            }
            return setCompilationStatus(262144, false, false, z12);
            throw th;
        }
    }

    private ProfileVerifier() {
    }

    private static long getPackageLastUpdateTime(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getPackageInfo(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
