package com.kubi.sdk.web.core;

import android.view.View;
import android.webkit.WebChromeClient;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.sdk.web.core.b */
/* JADX INFO: compiled from: BridgeWebChromeClient.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/web/core/b;", "", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/webkit/WebChromeClient$CustomViewCallback;", TUIConstants.TUIChat.CALL_BACK, "", "b", "(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC24304b {
    /* JADX INFO: renamed from: a */
    void mo58688a();

    /* JADX INFO: renamed from: b */
    void mo58689b(@NotNull View view, @NotNull WebChromeClient.CustomViewCallback callback);
}
