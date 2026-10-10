package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.util.Pair;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.tencent.bugly.proguard.C33978va;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes59.dex */
public class RNCWebViewModuleImpl implements ActivityEventListener {
    public static final int FILE_DOWNLOAD_PERMISSION_REQUEST = 1;
    public static final String NAME = "RNCWebViewModule";
    public static final int PICKER = 1;
    public static final int PICKER_LEGACY = 3;
    protected static final ShouldOverrideUrlLoadingLock shouldOverrideUrlLoadingLock = new ShouldOverrideUrlLoadingLock();
    private final ReactApplicationContext mContext;
    private DownloadManager.Request mDownloadRequest;
    private ValueCallback<Uri[]> mFilePathCallback;
    private ValueCallback<Uri> mFilePathCallbackLegacy;
    private File mOutputImage;
    private File mOutputVideo;

    public enum MimeType {
        DEFAULT("*/*"),
        IMAGE("image"),
        VIDEO("video");

        private final String value;

        MimeType(String str) {
            this.value = str;
        }
    }

    public static class ShouldOverrideUrlLoadingLock {
        private double nextLockIdentifier = 1.0d;
        private final HashMap<Double, AtomicReference<ShouldOverrideCallbackState>> shouldOverrideLocks = new HashMap<>();

        public enum ShouldOverrideCallbackState {
            UNDECIDED,
            SHOULD_OVERRIDE,
            DO_NOT_OVERRIDE
        }

        @Nullable
        public synchronized AtomicReference<ShouldOverrideCallbackState> getLock(Double d11) {
            return this.shouldOverrideLocks.get(d11);
        }

        public synchronized Pair<Double, AtomicReference<ShouldOverrideCallbackState>> getNewLock() {
            double d11;
            AtomicReference<ShouldOverrideCallbackState> atomicReference;
            d11 = this.nextLockIdentifier;
            this.nextLockIdentifier = 1.0d + d11;
            atomicReference = new AtomicReference<>(ShouldOverrideCallbackState.UNDECIDED);
            this.shouldOverrideLocks.put(Double.valueOf(d11), atomicReference);
            return new Pair<>(Double.valueOf(d11), atomicReference);
        }

        public synchronized void removeLock(Double d11) {
            this.shouldOverrideLocks.remove(d11);
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.webview.RNCWebViewModuleImpl$a */
    public class C27506a implements PermissionListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f55883b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f55884c;

        @Override // com.facebook.react.modules.core.PermissionListener
        public boolean onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
            if (i11 != 1) {
                return false;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(RNCWebViewModuleImpl.this.mContext, this.f55884c, 1).show();
            } else if (RNCWebViewModuleImpl.this.mDownloadRequest != null) {
                RNCWebViewModuleImpl.this.downloadFile(this.f55883b);
            }
            return true;
        }

        public C27506a(String str, String str2) {
            this.f55883b = str;
            this.f55884c = str2;
        }
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(C33978va.f72339h, ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(MimeType.IMAGE.value));
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(C33978va.f72339h, ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(MimeType.VIDEO.value));
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private Intent getFileChooserIntent(String str) {
        String mimeTypeFromExtension = str.isEmpty() ? MimeType.DEFAULT.value : str;
        if (str.matches("\\.\\w+")) {
            mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(C33978va.f72339h, ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(mimeTypeFromExtension);
        return intent;
    }

    private Boolean noAcceptTypesSet(String[] strArr) {
        String str;
        boolean z11 = true;
        if (strArr.length != 0 && (strArr.length != 1 || (str = strArr[0]) == null || str.length() != 0)) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    public Intent getPhotoIntent() {
        Intent intent;
        Throwable e11;
        try {
            File capturedFile = getCapturedFile(MimeType.IMAGE);
            this.mOutputImage = capturedFile;
            Uri outputUri = getOutputUri(capturedFile);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            try {
                intent.putExtra("output", outputUri);
                return intent;
            } catch (IOException e12) {
                e11 = e12;
                Log.e("CREATE FILE", "Error occurred while creating the File", e11);
                e11.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e13) {
                e11 = e13;
                Log.e("CREATE FILE", "Error occurred while creating the File", e11);
                e11.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e14) {
            intent = null;
            e11 = e14;
        }
    }

    public Uri[] getSelectedFiles(Intent intent, int i11) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() == null) {
            if (intent.getData() == null || i11 != -1) {
                return null;
            }
            return WebChromeClient.FileChooserParams.parseResult(i11, intent);
        }
        int itemCount = intent.getClipData().getItemCount();
        Uri[] uriArr = new Uri[itemCount];
        for (int i12 = 0; i12 < itemCount; i12++) {
            uriArr[i12] = intent.getClipData().getItemAt(i12).getUri();
        }
        return uriArr;
    }

    public Intent getVideoIntent() {
        Intent intent;
        Throwable e11;
        try {
            File capturedFile = getCapturedFile(MimeType.VIDEO);
            this.mOutputVideo = capturedFile;
            Uri outputUri = getOutputUri(capturedFile);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            try {
                intent.putExtra("output", outputUri);
                return intent;
            } catch (IOException e12) {
                e11 = e12;
                Log.e("CREATE FILE", "Error occurred while creating the File", e11);
                e11.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e13) {
                e11 = e13;
                Log.e("CREATE FILE", "Error occurred while creating the File", e11);
                e11.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e14) {
            intent = null;
            e11 = e14;
        }
    }

    public boolean isFileUploadSupported() {
        return true;
    }

    public void startPhotoPickerIntent(String str, ValueCallback<Uri> valueCallback) {
        Intent videoIntent;
        Intent photoIntent;
        this.mFilePathCallbackLegacy = valueCallback;
        Activity currentActivity = this.mContext.getCurrentActivity();
        Intent intentCreateChooser = Intent.createChooser(getFileChooserIntent(str), "");
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(str).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
            arrayList.add(photoIntent);
        }
        if (acceptsVideo(str).booleanValue() && (videoIntent = getVideoIntent()) != null) {
            arrayList.add(videoIntent);
        }
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intentCreateChooser.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(intentCreateChooser, 3);
        } else {
            Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.webview.RNCWebViewModuleImpl$b */
    public static /* synthetic */ class C27507b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55886a;

        static {
            int[] iArr = new int[MimeType.values().length];
            f55886a = iArr;
            try {
                iArr[MimeType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55886a[MimeType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private PermissionAwareActivity getPermissionAwareActivity() {
        ComponentCallbacks2 currentActivity = this.mContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof PermissionAwareActivity) {
            return (PermissionAwareActivity) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    private PermissionListener getWebviewFileDownloaderPermissionListener(String str, String str2) {
        return new C27506a(str, str2);
    }

    public void downloadFile(String str) {
        try {
            ((DownloadManager) this.mContext.getSystemService("download")).enqueue(this.mDownloadRequest);
            Toast.makeText(this.mContext, str, 1).show();
        } catch (IllegalArgumentException | SecurityException e11) {
            Log.w("RNCWebViewModule", "Unsupported URI, aborting download", e11);
        }
    }

    public File getCapturedFile(MimeType mimeType) throws IOException {
        String str;
        String str2;
        int i11 = C27507b.f55886a[mimeType.ordinal()];
        if (i11 == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (i11 != 2) {
            str = "";
            str2 = "";
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(String.valueOf(System.currentTimeMillis()));
        sb2.append(str2);
        return File.createTempFile(str, str2, this.mContext.getExternalFilesDir(null));
    }

    public Uri getOutputUri(File file) {
        String packageName = this.mContext.getPackageName();
        return FileProvider.getUriForFile(this.mContext, packageName + ".fileprovider", file);
    }

    public boolean grantFileDownloaderPermissions(String str, String str2) {
        Activity currentActivity = this.mContext.getCurrentActivity();
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        boolean z11 = ContextCompat.checkSelfPermission(currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z11) {
            getPermissionAwareActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, getWebviewFileDownloaderPermissionListener(str, str2));
        }
        return z11;
    }

    public boolean needsCameraPermission() {
        Activity currentActivity = this.mContext.getCurrentActivity();
        try {
            return Arrays.asList(currentActivity.getPackageManager().getPackageInfo(currentActivity.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA") && ContextCompat.checkSelfPermission(currentActivity, "android.permission.CAMERA") != 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        if (this.mFilePathCallback == null && this.mFilePathCallbackLegacy == null) {
            return;
        }
        File file = this.mOutputImage;
        boolean z11 = false;
        boolean z12 = file != null && file.length() > 0;
        File file2 = this.mOutputVideo;
        if (file2 != null && file2.length() > 0) {
            z11 = true;
        }
        if (i11 != 1) {
            if (i11 == 3) {
                if (i12 != -1) {
                    this.mFilePathCallbackLegacy.onReceiveValue(null);
                } else if (z12) {
                    this.mFilePathCallbackLegacy.onReceiveValue(getOutputUri(this.mOutputImage));
                } else if (z11) {
                    this.mFilePathCallbackLegacy.onReceiveValue(getOutputUri(this.mOutputVideo));
                } else {
                    this.mFilePathCallbackLegacy.onReceiveValue(intent.getData());
                }
            }
        } else if (i12 != -1) {
            ValueCallback<Uri[]> valueCallback = this.mFilePathCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else if (z12) {
            this.mFilePathCallback.onReceiveValue(new Uri[]{getOutputUri(this.mOutputImage)});
        } else if (z11) {
            this.mFilePathCallback.onReceiveValue(new Uri[]{getOutputUri(this.mOutputVideo)});
        } else {
            this.mFilePathCallback.onReceiveValue(getSelectedFiles(intent, i12));
        }
        File file3 = this.mOutputImage;
        if (file3 != null && !z12) {
            file3.delete();
        }
        File file4 = this.mOutputVideo;
        if (file4 != null && !z11) {
            file4.delete();
        }
        this.mFilePathCallback = null;
        this.mFilePathCallbackLegacy = null;
        this.mOutputImage = null;
        this.mOutputVideo = null;
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.mDownloadRequest = request;
    }

    public void shouldStartLoadWithLockIdentifier(boolean z11, double d11) {
        AtomicReference<ShouldOverrideUrlLoadingLock.ShouldOverrideCallbackState> lock = shouldOverrideUrlLoadingLock.getLock(Double.valueOf(d11));
        if (lock != null) {
            synchronized (lock) {
                try {
                    lock.set(z11 ? ShouldOverrideUrlLoadingLock.ShouldOverrideCallbackState.DO_NOT_OVERRIDE : ShouldOverrideUrlLoadingLock.ShouldOverrideCallbackState.SHOULD_OVERRIDE);
                    lock.notify();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public RNCWebViewModuleImpl(ReactApplicationContext reactApplicationContext) {
        this.mContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (noAcceptTypesSet(strArr).booleanValue()) {
            return new String[]{MimeType.DEFAULT.value};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str = strArr[i11];
            if (str.matches("\\.\\w+")) {
                String mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(C33978va.f72339h, ""));
                if (mimeTypeFromExtension != null) {
                    strArr2[i11] = mimeTypeFromExtension;
                } else {
                    strArr2[i11] = str;
                }
            } else {
                strArr2[i11] = str;
            }
        }
        return strArr2;
    }

    private Boolean acceptsImages(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, MimeType.DEFAULT.value).booleanValue() || arrayContainsString(acceptedMimeType, MimeType.IMAGE.value).booleanValue());
    }

    private Boolean acceptsVideo(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, MimeType.DEFAULT.value).booleanValue() || arrayContainsString(acceptedMimeType, MimeType.VIDEO.value).booleanValue());
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z11) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(MimeType.DEFAULT.value);
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z11);
        return intent;
    }

    public boolean startPhotoPickerIntent(String[] strArr, boolean z11, ValueCallback<Uri[]> valueCallback, boolean z12) {
        Intent videoIntent;
        this.mFilePathCallback = valueCallback;
        Activity currentActivity = this.mContext.getCurrentActivity();
        ArrayList arrayList = new ArrayList();
        Intent photoIntent = null;
        if (!needsCameraPermission()) {
            if (acceptsImages(strArr).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
                arrayList.add(photoIntent);
            }
            if (acceptsVideo(strArr).booleanValue() && (videoIntent = getVideoIntent()) != null) {
                arrayList.add(videoIntent);
            }
        }
        Intent intent = new Intent("android.intent.action.CHOOSER");
        if (!z12) {
            intent.putExtra("android.intent.extra.INTENT", getFileChooserIntent(strArr, z11));
            intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            photoIntent = intent;
        }
        if (photoIntent == null) {
            Log.w("RNCWebViewModule", "there is no Camera permission");
        } else if (photoIntent.resolveActivity(currentActivity.getPackageManager()) == null) {
            Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
        } else {
            currentActivity.startActivityForResult(photoIntent, 1);
        }
        return true;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }
}
