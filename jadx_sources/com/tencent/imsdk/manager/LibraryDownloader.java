package com.tencent.imsdk.manager;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.facebook.soloader.MinElf;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.sensorsdata.abtest.entity.AppConstants;
import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.common.SystemUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes59.dex */
public class LibraryDownloader {
    private static final int ERROR_CHECK_LIBRARY_MD5_FAILED = 103;
    private static final int ERROR_DOWNLOAD_LIBRARY_FAILED = 101;
    private static final int ERROR_LOAD_LIBRARY_FAILED = 104;
    private static final int ERROR_SUCCESS = 0;
    private static final int ERROR_UNCOMPRESS_LIBRARY_FAILED = 102;
    private static final String LIBRARY_DIR_NAME = "imsdk-plus-";
    private static final String LIBRARY_MD5_ARM32 = "2282bfd055eac280d54f9c791ee1d63f";
    private static final String LIBRARY_MD5_ARM64 = "956300f2a524c0965d115c75cac5d4ab";
    private static final String LIBRARY_NAME = "libImSDK.so";
    private static final String LIBRARY_VERSION = "9.0.7667";
    private static final String TAG = "LibraryDownloader";
    private boolean mIsLoading = false;
    private CopyOnWriteArrayList<IMCallback> mCallbackList = new CopyOnWriteArrayList<>();
    private String mLibraryPath = "";
    private HandlerThread mWorkerThread = null;
    private Handler mMainHandler = null;
    private Handler mWorkerHandler = null;

    public static class LibraryLoaderHolder {
        private static final LibraryDownloader IM_LIBRARY_LOADER = new LibraryDownloader();

        private LibraryLoaderHolder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fetchLibrary(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("https://im.sdk.qcloud.com/download/plus/9.0.7667/" + str);
        arrayList.add("https://sdk-im-1252463788.cos.accelerate.myqcloud.com/download/plus/9.0.7667/" + str);
        arrayList.add("https://sdk-im-1252463788.file.myqcloud.com/download/plus/9.0.7667/" + str);
        arrayList.add("https://sdk-im-1252463788.cos.ap-hongkong.myqcloud.com/download/plus/9.0.7667/" + str);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL((String) arrayList.get(i11)).openConnection()));
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    Log.w(TAG, "fetch library failed|url:" + ((String) arrayList.get(i11)));
                } else {
                    File file = new File(this.mLibraryPath, str);
                    InputStream inputStream = httpURLConnection.getInputStream();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i12 = inputStream.read(bArr);
                        if (i12 == -1) {
                            inputStream.close();
                            fileOutputStream.close();
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i12);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int loadLibrary() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mLibraryPath);
        sb2.append("jni");
        String str = File.separator;
        sb2.append(str);
        sb2.append(MinElf.ISA.AARCH64);
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append(str);
        sb3.append(LIBRARY_NAME);
        int i11 = (SystemUtil.getFileMD5(sb3.toString()).equalsIgnoreCase(LIBRARY_MD5_ARM64) && BaseManager.getInstance().setLibraryPath(string)) ? 0 : 103;
        if (i11 == 0) {
            return i11;
        }
        String str2 = this.mLibraryPath + "jni" + str + MinElf.ISA.ARM;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append(str);
        sb4.append(LIBRARY_NAME);
        return (SystemUtil.getFileMD5(sb4.toString()).equalsIgnoreCase(LIBRARY_MD5_ARM32) && BaseManager.getInstance().setLibraryPath(str2)) ? 0 : 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyResult(final int i11, final String str) {
        if (i11 != 0) {
            SystemUtil.deleteDirectory(this.mLibraryPath);
        }
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        Iterator<IMCallback> it = this.mCallbackList.iterator();
        while (it.hasNext()) {
            copyOnWriteArrayList.add(it.next());
        }
        this.mIsLoading = false;
        this.mCallbackList.clear();
        this.mMainHandler.post(new Runnable() { // from class: com.tencent.imsdk.manager.LibraryDownloader.2
            @Override // java.lang.Runnable
            public void run() {
                for (IMCallback iMCallback : copyOnWriteArrayList) {
                    int i12 = i11;
                    if (i12 == 0) {
                        iMCallback.success("OK");
                    } else {
                        iMCallback.fail(i12, str);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uncompressLibrary(String str) {
        String str2 = this.mLibraryPath + str;
        if (new File(str2).exists()) {
            return SystemUtil.uncompressFile(str2, this.mLibraryPath);
        }
        return false;
    }

    public void downloadLibrary(Context context, final IMCallback iMCallback) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir().toString());
        String str = File.separator;
        sb2.append(str);
        sb2.append(LIBRARY_DIR_NAME);
        sb2.append("9.0.7667");
        sb2.append(str);
        this.mLibraryPath = sb2.toString();
        if (this.mWorkerThread == null) {
            HandlerThread handlerThread = new HandlerThread("libraryLoader");
            this.mWorkerThread = handlerThread;
            handlerThread.start();
        }
        if (this.mMainHandler == null) {
            this.mMainHandler = new Handler(context.getMainLooper());
        }
        if (this.mWorkerHandler == null) {
            this.mWorkerHandler = new Handler(this.mWorkerThread.getLooper());
        }
        this.mWorkerHandler.post(new Runnable() { // from class: com.tencent.imsdk.manager.LibraryDownloader.1
            @Override // java.lang.Runnable
            public void run() {
                LibraryDownloader.this.mCallbackList.add(iMCallback);
                if (LibraryDownloader.this.mIsLoading) {
                    return;
                }
                LibraryDownloader.this.mIsLoading = true;
                if (LibraryDownloader.this.loadLibrary() == 0) {
                    Log.i(LibraryDownloader.TAG, "check library md5 success and load library success");
                    LibraryDownloader.this.notifyResult(0, AppConstants.AB_TEST_SUCCESS);
                    return;
                }
                SystemUtil.deleteDirectory(LibraryDownloader.this.mLibraryPath);
                SystemUtil.createDirectory(LibraryDownloader.this.mLibraryPath);
                Log.i(LibraryDownloader.TAG, "start download library");
                if (!LibraryDownloader.this.fetchLibrary("imsdk-plus-9.0.7667.aar")) {
                    Log.e(LibraryDownloader.TAG, "download library failed");
                    LibraryDownloader.this.notifyResult(101, "download library failed");
                    return;
                }
                Log.i(LibraryDownloader.TAG, "download library success");
                if (!LibraryDownloader.this.uncompressLibrary("imsdk-plus-9.0.7667.aar")) {
                    Log.e(LibraryDownloader.TAG, "uncompress library failed");
                    LibraryDownloader.this.notifyResult(102, "uncompress library failed");
                    return;
                }
                Log.i(LibraryDownloader.TAG, "uncompress library success");
                int iLoadLibrary = LibraryDownloader.this.loadLibrary();
                if (iLoadLibrary == 0) {
                    Log.i(LibraryDownloader.TAG, "load library success");
                    LibraryDownloader.this.notifyResult(0, AppConstants.AB_TEST_SUCCESS);
                } else {
                    String str2 = iLoadLibrary == 103 ? "check library md5 failed" : "load library failed";
                    Log.e(LibraryDownloader.TAG, str2);
                    LibraryDownloader.this.notifyResult(iLoadLibrary, str2);
                }
            }
        });
    }

    public static LibraryDownloader getInstance() {
        return LibraryLoaderHolder.IM_LIBRARY_LOADER;
    }
}
