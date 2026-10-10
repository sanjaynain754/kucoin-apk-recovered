package fr.greweb.reactnativeviewshot;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.UIManagerHelper;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes60.dex */
public class RNViewShotModule extends NativeRNViewShotSpec {
    private static final String TEMP_FILE_PREFIX = "ReactNative-snapshot-image";
    private final Executor executor;
    private final ReactApplicationContext reactContext;

    /* JADX INFO: renamed from: fr.greweb.reactnativeviewshot.RNViewShotModule$a */
    public static class AsyncTaskC37587a extends GuardedAsyncTask<Void, Void> implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        public final File f83550a;

        /* JADX INFO: renamed from: b */
        public final File f83551b;

        public AsyncTaskC37587a(ReactContext reactContext) {
            super(reactContext);
            this.f83550a = reactContext.getCacheDir();
            this.f83551b = reactContext.getExternalCacheDir();
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(RNViewShotModule.TEMP_FILE_PREFIX);
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            File file = this.f83550a;
            if (file != null) {
                m84726a(file);
            }
            File file2 = this.f83551b;
            if (file2 != null) {
                m84726a(file2);
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m84726a(@NonNull File file) {
            File[] fileArrListFiles = file.listFiles(this);
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.delete()) {
                        Log.d(NativeRNViewShotSpec.NAME, "deleted file: " + file2.getAbsolutePath());
                    }
                }
            }
        }
    }

    @Override // fr.greweb.reactnativeviewshot.NativeRNViewShotSpec
    @ReactMethod
    public void captureRef(Double d11, ReadableMap readableMap, Promise promise) {
        int i11 = -1;
        int iIntValue = d11 == null ? -1 : d11.intValue();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.getResources().getDisplayMetrics();
        String string = readableMap.getString(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT);
        if ("jpg".equals(string)) {
            i11 = 0;
        } else if ("webm".equals(string)) {
            i11 = 2;
        } else if (!"raw".equals(string)) {
            i11 = 1;
        }
        double d12 = readableMap.getDouble(C33757kf.f70665k);
        Integer numValueOf = readableMap.hasKey("width") ? Integer.valueOf(readableMap.getInt("width")) : null;
        Integer numValueOf2 = readableMap.hasKey("height") ? Integer.valueOf(readableMap.getInt("height")) : null;
        String string2 = readableMap.getString(DbParams.KEY_CHANNEL_RESULT);
        String string3 = readableMap.hasKey("fileName") ? readableMap.getString("fileName") : null;
        try {
            ((FabricUIManager) UIManagerHelper.getUIManager(reactApplicationContext, 2)).addUIBlock(new C37588a(iIntValue, string, i11, d12, numValueOf, numValueOf2, "tmpfile".equals(string2) ? createTempFile(getReactApplicationContext(), string, string3) : null, string2, Boolean.valueOf(readableMap.getBoolean("snapshotContentContainer")), this.reactContext, getCurrentActivity(), readableMap.hasKey("handleGLSurfaceViewOnAndroid") && readableMap.getBoolean("handleGLSurfaceViewOnAndroid"), promise, this.executor));
        } catch (Throwable th2) {
            Log.e(NativeRNViewShotSpec.NAME, "Failed to snapshot view tag " + iIntValue, th2);
            promise.reject("E_UNABLE_TO_SNAPSHOT", "Failed to snapshot view tag " + iIntValue);
        }
    }

    @Override // fr.greweb.reactnativeviewshot.NativeRNViewShotSpec
    @ReactMethod
    public void captureScreen(ReadableMap readableMap, Promise promise) {
        captureRef(Double.valueOf(-1.0d), readableMap, promise);
    }

    public RNViewShotModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.executor = Executors.newCachedThreadPool();
        this.reactContext = reactApplicationContext;
    }

    @NonNull
    private File createTempFile(@NonNull Context context, @NonNull String str, String str2) throws IOException {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        String str3 = C33978va.f72339h + str;
        if (str2 != null) {
            return File.createTempFile(str2, str3, externalCacheDir);
        }
        return File.createTempFile(TEMP_FILE_PREFIX, str3, externalCacheDir);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        new AsyncTaskC37587a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // fr.greweb.reactnativeviewshot.NativeRNViewShotSpec
    @ReactMethod
    public void releaseCapture(String str) {
        String path = Uri.parse(str).getPath();
        if (path != null) {
            File file = new File(path);
            if (file.exists()) {
                File parentFile = file.getParentFile();
                if (!parentFile.equals(this.reactContext.getExternalCacheDir()) && !parentFile.equals(this.reactContext.getCacheDir())) {
                    return;
                }
                file.delete();
            }
        }
    }
}
