package com.kubi.sdk.web.proxy;

import android.content.Context;
import android.webkit.WebResourceRequest;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.ProxyConfig;
import b10.C4454b;
import b10.InterfaceC4453a;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.google.common.net.HttpHeaders;
import com.kubi.sdk.web.core.WebCoreException;
import com.kubi.sdk.web.util.C24332e;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p680v1.AbstractC45352c;
import p817z1.C46628g;
import p817z1.C46631j;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: GlideImageWebProxy.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/web/proxy/GlideImageWebProxy;", "Lb10/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/webkit/WebResourceRequest;", "webRequest", "Lb10/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/webkit/WebResourceRequest;)Lb10/b;", "Landroid/content/Context;", "b", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGlideImageWebProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlideImageWebProxy.kt\ncom/kubi/sdk/web/proxy/GlideImageWebProxy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,62:1\n1855#2,2:63\n86#3,3:65\n*S KotlinDebug\n*F\n+ 1 GlideImageWebProxy.kt\ncom/kubi/sdk/web/proxy/GlideImageWebProxy\n*L\n38#1:63,2\n58#1:65,3\n*E\n"})
public final class GlideImageWebProxy implements InterfaceC4453a {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Set<String> f48522c = SetsKt.setOf((Object[]) new String[]{"image/jpeg", "image/png", "image/webp", "image/svg+xml"});

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final ProxyType f48523d = ProxyType.GlideImage;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public GlideImageWebProxy(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b10.InterfaceC4453a
    @Nullable
    /* JADX INFO: renamed from: a */
    public C4454b mo4249a(@NotNull WebResourceRequest webRequest) {
        Intrinsics.checkNotNullParameter(webRequest, "webRequest");
        String string = webRequest.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "webRequest.url.toString()");
        String strM58877a = C24332e.f48564a.m58877a(string);
        if (!f48522c.contains(strM58877a)) {
            return null;
        }
        try {
            C46631j.a aVar = new C46631j.a();
            Headers.Companion companion = Headers.INSTANCE;
            Map<String, String> requestHeaders = webRequest.getRequestHeaders();
            Intrinsics.checkNotNullExpressionValue(requestHeaders, "webRequest.requestHeaders");
            for (Pair<? extends String, ? extends String> pair : companion.m94724of(requestHeaders)) {
                aVar.m102832a(pair.getFirst(), pair.getSecond());
            }
            File file = (File) ComponentCallbacks2C5309c.m6556t(this.context).mo6623k().mo92200i(AbstractC45352c.f101956c).mo6600K0(new C46628g(string, aVar.m102834c())).m6604O0().get();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            HashMap map = new HashMap(2);
            map.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, ProxyConfig.MATCH_ALL_SCHEMES);
            map.put(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, "Content-Type");
            C4454b c4454b = new C4454b(f48523d, strM58877a, "UTF-8", bufferedInputStream);
            c4454b.setStatusCodeAndReasonPhrase(200, "ok");
            c4454b.setResponseHeaders(map);
            C44128b.m97259c("GlideWebProxy", "WebResource [" + string + "] from glide [" + file.getName() + ']');
            return c4454b;
        } catch (Throwable th2) {
            C44128b.m97262f("GlideWebProxy", "getWebResource: ", th2);
            C43846g.m96568c(new WebCoreException(th2, "GlideWebProxy", false, "getWebResource", 4, null), null, 2, null);
            return null;
        }
    }
}
