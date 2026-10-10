package com.kubi.sdk.web.proxy;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.ProxyConfig;
import b10.C4454b;
import b10.InterfaceC4453a;
import com.google.common.net.HttpHeaders;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.match.C24322a;
import com.kubi.sdk.web.util.C24331d;
import com.kubi.sdk.web.util.C24332e;
import java.io.InputStream;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: LocalFileWebProxy.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/web/proxy/LocalFileWebProxy;", "Lb10/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/webkit/WebResourceRequest;", "webRequest", "Lb10/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/webkit/WebResourceRequest;)Lb10/b;", "Landroid/content/Context;", "b", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class LocalFileWebProxy implements InterfaceC4453a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: compiled from: LocalFileWebProxy.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/web/proxy/LocalFileWebProxy$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "Lcom/kubi/sdk/web/proxy/ProxyType;", "proxyType", "Lb10/b;", "makeLocalResponse", "(Landroid/content/Context;Landroid/net/Uri;Lcom/kubi/sdk/web/proxy/ProxyType;)Lb10/b;", "", "TAG", "Ljava/lang/String;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ C4454b makeLocalResponse$default(Companion companion, Context context, Uri uri, ProxyType proxyType, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                proxyType = ProxyType.LocalFile;
            }
            return companion.makeLocalResponse(context, uri, proxyType);
        }

        @Nullable
        public final C4454b makeLocalResponse(@NotNull Context context, @NotNull Uri uri, @NotNull ProxyType proxyType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(proxyType, "proxyType");
            C24331d c24331d = C24331d.f48560a;
            String strM58868a = c24331d.m58868a(uri);
            String strM58877a = C24332e.f48564a.m58877a(strM58868a);
            if (strM58877a.length() == 0 || strM58868a.length() == 0) {
                C44128b.m97259c("LocalWebProxy", "getResource [" + uri + "] mime miss");
                return null;
            }
            String strM58871d = c24331d.m58871d(strM58868a, 0);
            if (strM58871d == null || strM58871d.length() == 0) {
                C44128b.m97259c("LocalWebProxy", "packageName is null: [" + uri + ']');
                return null;
            }
            if (!C24322a.f48515a.m58819d(strM58871d)) {
                C44128b.m97259c("LocalWebProxy", "not match v2 cache package: [" + uri + ']');
                return null;
            }
            InputStream inputStreamM58869b = c24331d.m58869b(c24331d.m58870c(context) + strM58868a);
            if (inputStreamM58869b == null) {
                return null;
            }
            HashMap map = new HashMap(3);
            map.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, ProxyConfig.MATCH_ALL_SCHEMES);
            map.put(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, "Content-Type");
            if (WebConfig.f48355a.m58592c()) {
                map.put("x-cache-path", strM58868a);
            }
            C4454b c4454b = new C4454b(proxyType, strM58877a, "UTF-8", inputStreamM58869b);
            c4454b.setStatusCodeAndReasonPhrase(200, "ok");
            c4454b.setResponseHeaders(map);
            C44128b.m97259c("LocalWebProxy", "WebResource [" + uri + "] from [" + proxyType + "] [filepath:" + strM58868a + ']');
            return c4454b;
        }
    }

    public LocalFileWebProxy(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // b10.InterfaceC4453a
    @Nullable
    /* JADX INFO: renamed from: a */
    public C4454b mo4249a(@NotNull WebResourceRequest webRequest) {
        Intrinsics.checkNotNullParameter(webRequest, "webRequest");
        Companion companion = INSTANCE;
        Context context = this.context;
        Uri url = webRequest.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "webRequest.url");
        return Companion.makeLocalResponse$default(companion, context, url, null, 4, null);
    }
}
