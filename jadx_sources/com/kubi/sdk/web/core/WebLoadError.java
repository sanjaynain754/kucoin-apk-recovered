package com.kubi.sdk.web.core;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.WebResourceError;
import android.webkit.WebResourceResponse;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.kubi.sdk.web.util.C24335h;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WebLoadError.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u0010\u0010\u000f¨\u0006 "}, m90084d2 = {"Lcom/kubi/sdk/web/core/WebLoadError;", "", "", "mainErrType", "currentUrl", "Landroid/net/Uri;", "requestUri", "", "isError", "", "errorCode", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;ZILjava/lang/String;)V", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "c", "b", "getCurrentUrl", "Landroid/net/Uri;", "d", "()Landroid/net/Uri;", "Z", "e", "()Z", "I", "()I", "f", "g", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class WebLoadError {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String mainErrType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String currentUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Uri requestUri;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean isError;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int errorCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: compiled from: WebLoadError.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eJ%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u000eJ-\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/web/core/WebLoadError$Companion;", "", "()V", "create", "Lcom/kubi/sdk/web/core/WebLoadError;", "mainErrType", "", "currentUrl", "requestUri", "Landroid/net/Uri;", "isMainFragment", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Landroid/webkit/WebResourceError;", "create$KWebView_release", "uri", "Landroid/net/http/SslError;", "createHttpError", "resp", "Landroid/webkit/WebResourceResponse;", "createHttpError$KWebView_release", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final WebLoadError create$KWebView_release(@NotNull String mainErrType, @NotNull String currentUrl, @NotNull Uri requestUri, boolean isMainFragment, @NotNull WebResourceError error) {
            Intrinsics.checkNotNullParameter(mainErrType, "mainErrType");
            Intrinsics.checkNotNullParameter(currentUrl, "currentUrl");
            Intrinsics.checkNotNullParameter(requestUri, "requestUri");
            Intrinsics.checkNotNullParameter(error, "error");
            return new WebLoadError(mainErrType, currentUrl, requestUri, isMainFragment, error.getErrorCode(), error.getDescription().toString(), null);
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final WebLoadError create$KWebView_release(@NotNull String mainErrType, @NotNull String uri, @NotNull SslError error) {
            Intrinsics.checkNotNullParameter(mainErrType, "mainErrType");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(error, "error");
            boolean zAreEqual = Intrinsics.areEqual(uri, error.getUrl());
            C24335h c24335h = C24335h.f48569a;
            String url = error.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "error.url");
            Uri uriM58889h = c24335h.m58889h(url);
            if (uriM58889h == null) {
                uriM58889h = Uri.EMPTY;
            }
            Uri uri2 = uriM58889h;
            Intrinsics.checkNotNullExpressionValue(uri2, "error.url.toUri() ?: Uri.EMPTY");
            return new WebLoadError(mainErrType, uri, uri2, zAreEqual, -16, "SSL primaryError:" + error.getPrimaryError(), null);
        }

        @JvmStatic
        @NotNull
        public final WebLoadError createHttpError$KWebView_release(@NotNull String mainErrType, @NotNull String uri, @NotNull Uri requestUri, @NotNull WebResourceResponse resp) {
            Intrinsics.checkNotNullParameter(mainErrType, "mainErrType");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(requestUri, "requestUri");
            Intrinsics.checkNotNullParameter(resp, "resp");
            int statusCode = resp.getStatusCode();
            String reasonPhrase = resp.getReasonPhrase();
            Intrinsics.checkNotNullExpressionValue(reasonPhrase, "resp.reasonPhrase");
            return new WebLoadError(mainErrType, uri, requestUri, false, statusCode, reasonPhrase, null);
        }
    }

    public /* synthetic */ WebLoadError(String str, String str2, Uri uri, boolean z11, int i11, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, uri, z11, i11, str3);
    }

    public WebLoadError(String str, String str2, Uri uri, boolean z11, int i11, String str3) {
        this.mainErrType = str;
        this.currentUrl = str2;
        this.requestUri = uri;
        this.isError = z11;
        this.errorCode = i11;
        this.description = str3;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMainErrType() {
        return this.mainErrType;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Uri getRequestUri() {
        return this.requestUri;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    @NotNull
    public String toString() {
        return this.currentUrl + " loadErr[mainErrType:" + this.mainErrType + ", f:" + this.requestUri + " code:" + this.errorCode + " desc:" + this.description + "，isError:" + this.isError + ']';
    }
}
