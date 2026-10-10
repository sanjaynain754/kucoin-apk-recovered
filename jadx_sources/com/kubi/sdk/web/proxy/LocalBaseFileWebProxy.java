package com.kubi.sdk.web.proxy;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.ProxyConfig;
import b10.C4454b;
import b10.InterfaceC4453a;
import com.google.common.net.HttpHeaders;
import com.kubi.host.HostManager;
import com.kubi.sdk.pkg.hybird.HybridPackageManager;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.core.WebCoreException;
import com.kubi.sdk.web.util.C24331d;
import com.kubi.sdk.web.util.C24332e;
import com.kubi.sdk.web.util.C24335h;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: LocalBaseFileWebProxy.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/web/proxy/LocalBaseFileWebProxy;", "Lb10/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/webkit/WebResourceRequest;", "webRequest", "Lb10/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/webkit/WebResourceRequest;)Lb10/b;", "Landroid/content/Context;", "b", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLocalBaseFileWebProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalBaseFileWebProxy.kt\ncom/kubi/sdk/web/proxy/LocalBaseFileWebProxy\n+ 2 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,122:1\n86#2,3:123\n*S KotlinDebug\n*F\n+ 1 LocalBaseFileWebProxy.kt\ncom/kubi/sdk/web/proxy/LocalBaseFileWebProxy\n*L\n118#1:123,3\n*E\n"})
public final class LocalBaseFileWebProxy implements InterfaceC4453a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: compiled from: LocalBaseFileWebProxy.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/web/proxy/LocalBaseFileWebProxy$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "Lcom/kubi/sdk/web/proxy/ProxyType;", "proxyType", "Lb10/b;", "makeLocalResponse", "(Landroid/content/Context;Landroid/net/Uri;Lcom/kubi/sdk/web/proxy/ProxyType;)Lb10/b;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/net/Uri;)Z", "", "TAG", "Ljava/lang/String;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m58825a(Uri uri) {
            try {
                String host = uri.getHost();
                Uri uriM58889h = C24335h.f48569a.m58889h(HostManager.a.c());
                return StringsKt.equals$default(uriM58889h != null ? uriM58889h.getHost() : null, host, false, 2, null);
            } catch (Throwable th2) {
                C44128b.m97262f("LocalBaseFileWebProxy", "LocalBaseFileWebProxy inSupportHostList Error: " + uri, th2);
                return false;
            }
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
            if (!m58825a(uri)) {
                C44128b.m97259c("LocalBaseFileWebProxy", "getResource [" + uri + "] not in support host list");
                return null;
            }
            C24331d c24331d = C24331d.f48560a;
            String strM58868a = c24331d.m58868a(uri);
            String strM58877a = C24332e.f48564a.m58877a(strM58868a);
            if (strM58877a.length() == 0 || strM58868a.length() == 0) {
                C44128b.m97259c("LocalBaseFileWebProxy", "getResource [" + uri + "] mime miss");
                return null;
            }
            List<String> listM58872e = c24331d.m58872e(strM58868a);
            String str = !listM58872e.isEmpty() ? listM58872e.get(0) : null;
            String str2 = listM58872e.size() > 1 ? listM58872e.get(1) : null;
            if (str == null || str.length() == 0) {
                C44128b.m97259c("LocalBaseFileWebProxy", "getResource [" + uri + "] packageName miss");
                return null;
            }
            String strM57716g = HybridPackageManager.f47391a.m57716g(str);
            if (strM57716g == null || strM57716g.length() == 0) {
                C44128b.m97259c("LocalBaseFileWebProxy", "getResource [" + uri + "] curVersion miss");
                return null;
            }
            String strM58873f = c24331d.m58873f(strM58868a, str2, strM57716g);
            InputStream inputStreamM58869b = c24331d.m58869b(c24331d.m58870c(context) + strM58873f);
            if (inputStreamM58869b == null) {
                C44128b.m97259c("LocalBaseFileWebProxy", "getResource [" + uri + "] inputStream null");
                return null;
            }
            HashMap map = new HashMap(3);
            map.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, ProxyConfig.MATCH_ALL_SCHEMES);
            map.put(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, "Content-Type");
            if (WebConfig.f48355a.m58592c()) {
                map.put("x-cache-path", strM58873f);
            }
            C4454b c4454b = new C4454b(proxyType, strM58877a, "UTF-8", inputStreamM58869b);
            c4454b.setStatusCodeAndReasonPhrase(200, "ok");
            c4454b.setResponseHeaders(map);
            C44128b.m97259c("LocalBaseFileWebProxy", "curVersion:" + strM57716g + ", pathVersion:" + str2 + ", path:" + str);
            C44128b.m97259c("LocalBaseFileWebProxy", "WebResource [" + uri + "] from [" + proxyType + "] [filepath:" + strM58873f + ']');
            return c4454b;
        }
    }

    public LocalBaseFileWebProxy(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // b10.InterfaceC4453a
    @Nullable
    /* JADX INFO: renamed from: a */
    public C4454b mo4249a(@NotNull WebResourceRequest webRequest) {
        Intrinsics.checkNotNullParameter(webRequest, "webRequest");
        try {
            Companion companion = INSTANCE;
            Context context = this.context;
            Uri url = webRequest.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "webRequest.url");
            return Companion.makeLocalResponse$default(companion, context, url, null, 4, null);
        } catch (Throwable th2) {
            C43846g.m96568c(new WebCoreException(th2, "h5_proxy", false, "LocalBaseFileWebProxy getWebResource Error", 4, null), null, 2, null);
            return null;
        }
    }
}
