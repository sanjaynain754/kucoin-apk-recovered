package com.hcaptcha.sdk;

import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.Serializable;
import java.util.Objects;
import lombok.NonNull;

/* JADX INFO: loaded from: classes56.dex */
class HCaptchaJSInterface implements Serializable {
    public static final String JS_INTERFACE_TAG = "JSInterface";

    /* JADX INFO: renamed from: b */
    @NonNull
    public final transient Handler f12871b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final transient InterfaceC9187o f12872c;

    @Nullable
    private final String config;

    @Nullable
    @JavascriptInterface
    public String getConfig() {
        return this.config;
    }

    @JavascriptInterface
    public void onLoaded() {
        Handler handler = this.f12871b;
        final InterfaceC9187o interfaceC9187o = this.f12872c;
        Objects.requireNonNull(interfaceC9187o);
        handler.post(new Runnable() { // from class: com.hcaptcha.sdk.j
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC9187o.mo13938B1();
            }
        });
    }

    @JavascriptInterface
    public void onOpen() {
        Handler handler = this.f12871b;
        final InterfaceC9187o interfaceC9187o = this.f12872c;
        Objects.requireNonNull(interfaceC9187o);
        handler.post(new Runnable() { // from class: com.hcaptcha.sdk.i
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC9187o.mo13944u2();
            }
        });
    }

    @JavascriptInterface
    public void onPass(final String str) {
        this.f12871b.post(new Runnable() { // from class: com.hcaptcha.sdk.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f12889b.f12872c.onSuccess(str);
            }
        });
    }

    public HCaptchaJSInterface(@NonNull Handler handler, @NonNull HCaptchaConfig hCaptchaConfig, @NonNull InterfaceC9187o interfaceC9187o) {
        String strWriteValueAsString;
        if (handler != null) {
            if (hCaptchaConfig != null) {
                if (interfaceC9187o != null) {
                    this.f12871b = handler;
                    this.f12872c = interfaceC9187o;
                    try {
                        strWriteValueAsString = new ObjectMapper().writeValueAsString(hCaptchaConfig);
                    } catch (JsonProcessingException unused) {
                        Log.w(JS_INTERFACE_TAG, "Cannot prepare config for passing to WebView. A fallback config will be used");
                        strWriteValueAsString = null;
                    }
                    this.config = strWriteValueAsString;
                    return;
                }
                throw new NullPointerException("captchaVerifier is marked non-null but is null");
            }
            throw new NullPointerException("config is marked non-null but is null");
        }
        throw new NullPointerException("handler is marked non-null but is null");
    }

    @JavascriptInterface
    public void onError(int i11) {
        final HCaptchaError hCaptchaErrorFromId = HCaptchaError.fromId(i11);
        this.f12871b.post(new Runnable() { // from class: com.hcaptcha.sdk.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f12891b.f12872c.mo13945w(new HCaptchaException(hCaptchaErrorFromId));
            }
        });
    }
}
