package com.kubi.widget.web.helper;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.web.KWebView;
import com.kubi.utils.ActivityResultLauncherWrapper;
import e10.InterfaceC37042a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.widget.web.helper.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ImageFileChooser.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00100\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/widget/web/helper/ImageFileChooser;", "Lcom/kubi/sdk/web/spi/IKWebFileChooser;", "activity", "Lcom/kubi/sdk/BaseActivity;", "<init>", "(Lcom/kubi/sdk/BaseActivity;)V", "imagePickerLauncher", "Lcom/kubi/utils/ActivityResultLauncherWrapper;", "Landroidx/activity/result/PickVisualMediaRequest;", "Landroid/net/Uri;", "onShowFileChooser", "", "webView", "Lcom/kubi/sdk/web/KWebView;", "filePathCallback", "Landroid/webkit/ValueCallback;", "", "fileChooserParams", "Landroid/webkit/WebChromeClient$FileChooserParams;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ImageFileChooser implements InterfaceC37042a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ActivityResultLauncherWrapper<PickVisualMediaRequest, Uri> f55163a;

    public ImageFileChooser(@NotNull BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f55163a = ActivityResultLauncherWrapper.INSTANCE.registerForActivityResult(activity, new ActivityResultContracts.PickVisualMedia());
    }

    /* JADX INFO: renamed from: c */
    public static final void m67297c(ValueCallback valueCallback, Uri uri) {
        if (uri == null) {
            valueCallback.onReceiveValue(new Uri[0]);
        } else {
            valueCallback.onReceiveValue(new Uri[]{uri});
        }
    }

    @Override // e10.InterfaceC37042a
    /* JADX INFO: renamed from: a */
    public boolean mo67298a(@NotNull KWebView webView, @NotNull final ValueCallback<Uri[]> filePathCallback, @Nullable WebChromeClient.FileChooserParams fileChooserParams) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
        this.f55163a.m66355b(PickVisualMediaRequestKt.PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE), new ActivityResultCallback() { // from class: com.kubi.widget.web.helper.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ImageFileChooser.m67297c(filePathCallback, (Uri) obj);
            }
        });
        return true;
    }
}
