package com.kubi.sdk.web.proxy;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import androidx.media3.exoplayer.upstream.CmcdData;
import b10.C4454b;
import b10.InterfaceC4453a;
import com.kubi.sdk.pkg.hybird.HybridPackageManager;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.match.C24322a;
import com.kubi.sdk.web.util.C24331d;
import d10.InterfaceC36593a;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import x00.C45976a;

/* JADX INFO: compiled from: RedirectIndexLocalProxy.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/web/proxy/RedirectIndexLocalProxy;", "Lb10/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/webkit/WebResourceRequest;", "webRequest", "Lb10/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/webkit/WebResourceRequest;)Lb10/b;", "Landroid/content/Context;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isFirstTimeLoader", "c", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class RedirectIndexLocalProxy implements InterfaceC4453a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isFirstTimeLoader;

    /* JADX INFO: compiled from: RedirectIndexLocalProxy.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/web/proxy/RedirectIndexLocalProxy$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "requestUri", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Landroid/net/Uri;)Landroid/net/Uri;", "", "TAG", "Ljava/lang/String;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final Uri m58827a(Context context, Uri requestUri) {
            String str;
            String strMo81880a;
            C45976a c45976aM58818c = C24322a.f48515a.m58818c(requestUri);
            if (c45976aM58818c == null || !c45976aM58818c.getIndexEnable() || (str = c45976aM58818c.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME java.lang.String()) == null) {
                return null;
            }
            HybridPackageManager hybridPackageManager = HybridPackageManager.f47391a;
            if (hybridPackageManager.m57718i(str)) {
                return null;
            }
            String strM57715f = hybridPackageManager.m57715f(context, str);
            if (strM57715f.length() == 0) {
                return null;
            }
            InterfaceC36593a interfaceC36593aM58597h = WebConfig.f48355a.m58597h();
            if (interfaceC36593aM58597h == null || (strMo81880a = interfaceC36593aM58597h.mo81880a()) == null) {
                strMo81880a = "";
            }
            C44128b.m97259c("RedirectIndexLocalProxy", "indexHtmlName:>>> " + strMo81880a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(HybridPackageManager.m57711e(context));
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append(str);
            sb2.append(str2);
            sb2.append(strM57715f);
            sb2.append(str2);
            sb2.append(strMo81880a);
            String string = sb2.toString();
            if (!C24331d.f48560a.m58874g(string)) {
                return null;
            }
            C43840a.m96550d("redirectIndexPage " + requestUri + ' ' + string, "RedirectIndexLocalProxy");
            return new Uri.Builder().appendPath(str).appendPath(strM57715f).appendPath(strMo81880a).build();
        }
    }

    public RedirectIndexLocalProxy(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.isFirstTimeLoader = new AtomicBoolean(true);
    }

    @Override // b10.InterfaceC4453a
    @Nullable
    /* JADX INFO: renamed from: a */
    public C4454b mo4249a(@NotNull WebResourceRequest webRequest) {
        String str;
        Intrinsics.checkNotNullParameter(webRequest, "webRequest");
        if (!this.isFirstTimeLoader.getAndSet(false) || (str = webRequest.getRequestHeaders().get("Accept")) == null || !StringsKt.startsWith$default(str, "text/html", false, 2, (Object) null)) {
            return null;
        }
        Companion companion = INSTANCE;
        Context context = this.context;
        Uri url = webRequest.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "webRequest.url");
        Uri uriM58827a = companion.m58827a(context, url);
        if (uriM58827a != null) {
            return LocalFileWebProxy.INSTANCE.makeLocalResponse(this.context, uriM58827a, ProxyType.RedirectIndexLocal);
        }
        C44128b.m97259c("RedirectIndexLocalProxy", "WebResource [" + webRequest.getUrl() + "] not found");
        return null;
    }
}
