package com.kubi.widget.web.helper;

import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.web.KWebView;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import e10.InterfaceC37042a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.widget.web.helper.n, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OutFileChooser.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/widget/web/helper/OutFileChooser;", "Landroidx/activity/result/ActivityResultCallback;", "Landroidx/activity/result/ActivityResult;", "Lcom/kubi/sdk/web/spi/IKWebFileChooser;", "activity", "Lcom/kubi/sdk/BaseActivity;", "<init>", "(Lcom/kubi/sdk/BaseActivity;)V", TUIConstants.TUIChat.CALL_BACK, "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onShowFileChooser", "", "webView", "Lcom/kubi/sdk/web/KWebView;", "filePathCallback", "fileChooserParams", "Landroid/webkit/WebChromeClient$FileChooserParams;", "onActivityResult", "", DbParams.KEY_CHANNEL_RESULT, "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OutFileChooser implements ActivityResultCallback<ActivityResult>, InterfaceC37042a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public ValueCallback<Uri[]> f55183a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ActivityResultLauncher<Intent> f55184b;

    public OutFileChooser(@NotNull BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = activity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), this);
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f55184b = activityResultLauncherRegisterForActivityResult;
    }

    @Override // e10.InterfaceC37042a
    /* JADX INFO: renamed from: a */
    public boolean mo67298a(@NotNull KWebView webView, @NotNull ValueCallback<Uri[]> filePathCallback, @Nullable WebChromeClient.FileChooserParams fileChooserParams) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        this.f55183a = filePathCallback;
        this.f55184b.launch(intent);
        return true;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onActivityResult(@NotNull ActivityResult result) {
        Uri data;
        Intrinsics.checkNotNullParameter(result, "result");
        ValueCallback<Uri[]> valueCallback = this.f55183a;
        if (valueCallback == null) {
            return;
        }
        if (result.getResultCode() == -1 && result.getData() != null) {
            Intent data2 = result.getData();
            if (data2 != null) {
                data = data2.getData();
            } else {
                data = null;
            }
            if (data != null) {
                valueCallback.onReceiveValue(new Uri[]{data});
                return;
            }
        }
        valueCallback.onReceiveValue(null);
    }
}
