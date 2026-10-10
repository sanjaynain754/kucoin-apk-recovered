package com.tencent.liteav.base;

import android.content.Context;
import android.system.Os;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes59.dex */
public abstract class PathUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CACHE_DIRECTORY = 2;
    private static final int DATA_DIRECTORY = 0;
    private static final int LOG_DIRECTORY = 3;
    private static final int NUM_DIRECTORIES = 4;
    private static final String TAG = "PathUtils";
    private static final int THUMBNAIL_DIRECTORY = 1;
    private static final String THUMBNAIL_DIRECTORY_NAME = "textures";
    private static String sCacheSubDirectory;
    private static String sDataDirectorySuffix;
    private static FutureTask<String[]> sDirPathFetchTask;
    private static final AtomicBoolean sInitializationStarted = new AtomicBoolean();

    /* JADX INFO: renamed from: com.tencent.liteav.base.PathUtils$a */
    public static class C34687a {

        /* JADX INFO: renamed from: a */
        private static final String[] f73374a = PathUtils.getOrComputeDirectoryPaths();
    }

    public static String getCacheDirectory() {
        return getDirectoryPath(2);
    }

    public static String getDataDirectory() {
        return getDirectoryPath(0);
    }

    public static String getLogDirectory() {
        return getDirectoryPath(3);
    }

    public static String getThumbnailCacheDirectory() {
        return getDirectoryPath(1);
    }

    public static synchronized void setPrivateDataDirectorySuffix(String str, String str2) {
        if (!sInitializationStarted.getAndSet(true)) {
            sDataDirectorySuffix = str;
            sCacheSubDirectory = str2;
            sDirPathFetchTask = new FutureTask<>(CallableC34688a.m76038a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] setPrivateDataDirectorySuffixInternal() {
        String[] strArr = new String[4];
        Context applicationContext = ContextUtils.getApplicationContext();
        String path = applicationContext.getDir(sDataDirectorySuffix, 0).getPath();
        strArr[0] = path;
        chmod(path, 448);
        strArr[1] = applicationContext.getDir(THUMBNAIL_DIRECTORY_NAME, 0).getPath();
        if (applicationContext.getCacheDir() != null) {
            if (sCacheSubDirectory == null) {
                strArr[2] = applicationContext.getCacheDir().getPath();
            } else {
                strArr[2] = new File(applicationContext.getCacheDir(), sCacheSubDirectory).getPath();
            }
        }
        File externalFilesDir = applicationContext.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            strArr[3] = externalFilesDir.getAbsolutePath() + "/log/liteav";
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] getOrComputeDirectoryPaths() {
        try {
            if (!sDirPathFetchTask.cancel(false)) {
                return sDirPathFetchTask.get();
            }
            C34690b c34690bM76040a = C34690b.m76040a();
            try {
                String[] privateDataDirectorySuffixInternal = setPrivateDataDirectorySuffixInternal();
                c34690bM76040a.close();
                return privateDataDirectorySuffixInternal;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        c34690bM76040a.close();
                    } catch (Throwable unused) {
                    }
                    throw th3;
                }
            }
        } catch (InterruptedException | ExecutionException unused2) {
            return null;
        }
    }

    private PathUtils() {
    }

    private static void chmod(String str, int i11) {
        try {
            Os.chmod(str, i11);
        } catch (Exception unused) {
            Log.m76033e(TAG, "Failed to set permissions for path \"" + str + "\"", new Object[0]);
        }
    }

    private static String getDirectoryPath(int i11) {
        return C34687a.f73374a[i11];
    }

    public static void setPrivateDataDirectorySuffix(String str) {
        setPrivateDataDirectorySuffix(str, null);
    }
}
