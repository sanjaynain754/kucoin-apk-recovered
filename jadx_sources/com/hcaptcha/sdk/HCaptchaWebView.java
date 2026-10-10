package com.hcaptcha.sdk;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes56.dex */
public class HCaptchaWebView extends WebView {
    public HCaptchaWebView(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean performClick() {
        return false;
    }

    public HCaptchaWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HCaptchaWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onCheckIsTextEditor() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return super.onCheckIsTextEditor();
        }
        return false;
    }
}
