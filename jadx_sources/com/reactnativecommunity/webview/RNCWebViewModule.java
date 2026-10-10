package com.reactnativecommunity.webview;

import android.app.DownloadManager;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

/* JADX INFO: loaded from: classes59.dex */
@ReactModule(name = "RNCWebViewModule")
public class RNCWebViewModule extends NativeRNCWebViewModuleSpec {
    private final RNCWebViewModuleImpl mRNCWebViewModuleImpl;

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        this.mRNCWebViewModuleImpl.startPhotoPickerIntent(str, valueCallback);
    }

    public void downloadFile(String str) {
        this.mRNCWebViewModuleImpl.downloadFile(str);
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNCWebViewModule";
    }

    public boolean grantFileDownloaderPermissions(String str, String str2) {
        return this.mRNCWebViewModuleImpl.grantFileDownloaderPermissions(str, str2);
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec
    public void isFileUploadSupported(Promise promise) {
        promise.resolve(Boolean.valueOf(this.mRNCWebViewModuleImpl.isFileUploadSupported()));
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.mRNCWebViewModuleImpl.setDownloadRequest(request);
    }

    @Override // com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec
    public void shouldStartLoadWithLockIdentifier(boolean z11, double d11) {
        this.mRNCWebViewModuleImpl.shouldStartLoadWithLockIdentifier(z11, d11);
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z11, boolean z12) {
        return this.mRNCWebViewModuleImpl.startPhotoPickerIntent(strArr, z11, valueCallback, z12);
    }

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRNCWebViewModuleImpl = new RNCWebViewModuleImpl(reactApplicationContext);
    }
}
