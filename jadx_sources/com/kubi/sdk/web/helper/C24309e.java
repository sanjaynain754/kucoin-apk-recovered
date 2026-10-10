package com.kubi.sdk.web.helper;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.ProxyConfig;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.core.WebCoreException;
import com.kubi.sdk.web.core.WebCoreMessage;
import com.kubi.sdk.web.match.WhiteListManager;
import com.kubi.sdk.web.util.C24335h;
import e10.InterfaceC37044c;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import x00.C45980e;

/* JADX INFO: renamed from: com.kubi.sdk.web.helper.e */
/* JADX INFO: compiled from: WebUrlLoadingHelper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/web/helper/e;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "url", "", "c", "(Landroid/content/Context;Landroid/net/Uri;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/net/Uri;)Z", "", "Le10/c;", "interceptors", "b", "(Ljava/util/List;Landroid/net/Uri;)Z", "", "", "[Ljava/lang/String;", "disallowedSchemes", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebUrlLoadingHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebUrlLoadingHelper.kt\ncom/kubi/sdk/web/helper/WebUrlLoadingHelper\n+ 2 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n85#2,4:75\n86#2,3:79\n86#2,3:84\n1747#3,2:82\n1749#3:87\n*S KotlinDebug\n*F\n+ 1 WebUrlLoadingHelper.kt\ncom/kubi/sdk/web/helper/WebUrlLoadingHelper\n*L\n33#1:75,4\n40#1:79,3\n68#1:84,3\n63#1:82,2\n63#1:87\n*E\n"})
public final class C24309e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24309e f48436a = new C24309e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String[] disallowedSchemes = {"tel", "mailto", "content", "sms", "smsto", "mms", "mmsto"};

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m58708a(@NotNull Uri url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WhiteListManager whiteListManager = WhiteListManager.f48507a;
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "url.toString()");
        if (whiteListManager.m58801b(string) && !C24335h.f48569a.m58887f(url, "notInterrupt", false)) {
            return m58709b(WebConfig.f48355a.m58601l(), url);
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m58709b(@NotNull List<? extends InterfaceC37044c> interceptors, @NotNull Uri url) {
        boolean zMo65690a;
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(url, "url");
        C45980e c45980e = new C45980e(url);
        if (interceptors != null && interceptors.isEmpty()) {
            return false;
        }
        Iterator<T> it = interceptors.iterator();
        while (it.hasNext()) {
            try {
                zMo65690a = ((InterfaceC37044c) it.next()).mo65690a(c45980e);
            } catch (Exception e11) {
                C43846g.m96568c(new WebCoreException(e11, "WebUrlLoadingHelper", false, "intercept error", 4, null), null, 2, null);
                zMo65690a = false;
            }
            if (zMo65690a) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m58710c(@NotNull Context context, @NotNull Uri url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        if (ArraysKt.contains(disallowedSchemes, url.getScheme())) {
            C43846g.m96568c(new WebCoreMessage("third parties can use such intentions in phishing attacks", "WebUrlLoadingHelper", false, 4, null), null, 2, null);
            return true;
        }
        if (Intrinsics.areEqual(url.getScheme(), "http") || Intrinsics.areEqual(url.getScheme(), ProxyConfig.MATCH_HTTPS)) {
            return false;
        }
        try {
            C43840a.m96550d("WebUrl startActivity " + url, "kweb_load");
            context.startActivity(new Intent("android.intent.action.VIEW", url));
        } catch (Exception e11) {
            C43846g.m96568c(new WebCoreException(e11, "WebUrlLoadingHelper", false, " startActivity " + url + " checkScheme", 4, null), null, 2, null);
        }
        return true;
    }
}
