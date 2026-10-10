package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.File;

/* JADX INFO: loaded from: classes34.dex */
class BenchmarkOperation {

    @RequiresApi(api = 21)
    public static class Api21ContextHelper {
        private Api21ContextHelper() {
        }

        public static File getCodeCacheDir(Context context) {
            return context.getCodeCacheDir();
        }
    }

    @RequiresApi(api = 24)
    public static class Api24ContextHelper {
        private Api24ContextHelper() {
        }

        public static Context createDeviceProtectedStorageContext(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    public static void dropShaderCache(@NonNull Context context, @NonNull ProfileInstallReceiver.ResultDiagnostics resultDiagnostics) {
        if (deleteFilesRecursively(Build.VERSION.SDK_INT >= 34 ? Api24ContextHelper.createDeviceProtectedStorageContext(context).getCacheDir() : Api21ContextHelper.getCodeCacheDir(Api24ContextHelper.createDeviceProtectedStorageContext(context)))) {
            resultDiagnostics.onResultReceived(14, null);
        } else {
            resultDiagnostics.onResultReceived(15, null);
        }
    }

    private BenchmarkOperation() {
    }

    public static boolean deleteFilesRecursively(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return false;
            }
            boolean z11 = true;
            for (File file2 : fileArrListFiles) {
                if (deleteFilesRecursively(file2) && z11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            return z11;
        }
        file.delete();
        return true;
    }
}
