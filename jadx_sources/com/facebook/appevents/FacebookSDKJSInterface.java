package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FacebookSDKJSInterface.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00068GX\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m90084d2 = {"Lcom/facebook/appevents/FacebookSDKJSInterface;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "pixelId", "eventName", "jsonString", "", "sendEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "b", "Ljava/lang/String;", "getProtocol", "()Ljava/lang/String;", "protocol", "c", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FacebookSDKJSInterface {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final String f7662d = FacebookSDKJSInterface.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String protocol = "fbmq-0.1";

    /* JADX INFO: compiled from: FacebookSDKJSInterface.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\t0\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/appevents/FacebookSDKJSInterface$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Landroid/os/Bundle;", "b", "(Lorg/json/JSONObject;)Landroid/os/Bundle;", "", "jsonString", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "PARAMETER_FBSDK_PIXEL_REFERRAL", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final Bundle m7875a(String jsonString) {
            try {
                return m7876b(new JSONObject(jsonString));
            } catch (JSONException unused) {
                return new Bundle();
            }
        }

        /* JADX INFO: renamed from: b */
        public final Bundle m7876b(JSONObject jsonObject) throws JSONException {
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jsonObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                String str = next;
                bundle.putString(str, jsonObject.getString(str));
            }
            return bundle;
        }

        public final String getTAG() {
            return FacebookSDKJSInterface.m7874a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ String m7874a() {
        if (C42757a.m93689d(FacebookSDKJSInterface.class)) {
            return null;
        }
        try {
            return f7662d;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, FacebookSDKJSInterface.class);
            return null;
        }
    }

    public FacebookSDKJSInterface(@Nullable Context context) {
        this.context = context;
    }

    @JavascriptInterface
    @NotNull
    public final String getProtocol() {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            return this.protocol;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    @JavascriptInterface
    public final void sendEvent(@Nullable String pixelId, @Nullable String eventName, @Nullable String jsonString) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            if (pixelId == null) {
                Logger.Companion companion = Logger.INSTANCE;
                LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                String TAG = f7662d;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                companion.log(loggingBehavior, TAG, "Can't bridge an event without a referral Pixel ID. Check your webview Pixel configuration");
                return;
            }
            InternalAppEventsLogger internalAppEventsLoggerCreateInstance$default = InternalAppEventsLogger.Companion.createInstance$default(InternalAppEventsLogger.INSTANCE, this.context, null, 2, null);
            Bundle bundleM7875a = INSTANCE.m7875a(jsonString);
            bundleM7875a.putString("_fb_pixel_referral_id", pixelId);
            internalAppEventsLoggerCreateInstance$default.m7882d(eventName, bundleM7875a);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }
}
