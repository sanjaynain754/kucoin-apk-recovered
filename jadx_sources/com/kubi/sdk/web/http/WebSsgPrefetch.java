package com.kubi.sdk.web.http;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.helper.C24308d;
import java.util.List;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import rg0.C44091j;
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: WebSsgPrefetch.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u00020\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013J7\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010 \u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b \u0010!R\u001b\u0010&\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00050'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, m90084d2 = {"Lcom/kubi/sdk/web/http/WebSsgPrefetch;", "", "<init>", "()V", "Lcom/kubi/sdk/web/http/RequestCache$a;", "Lcom/kubi/sdk/web/http/WebSsgPrefetch$a;", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/kubi/sdk/web/http/RequestCache$a;)Ljava/lang/String;", "Landroid/content/Context;", "context", "", "urlList", "", "i", "(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "url", "ua", "n", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "type", CmcdData.Factory.STREAM_TYPE_LIVE, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "g", "(Ljava/lang/String;)Z", "", "code", "", TypedValues.TransitionType.S_DURATION, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "j", "(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;)V", "b", "Lkotlin/Lazy;", "f", "()Ljava/lang/String;", "defaultUA", "Lcom/kubi/sdk/web/http/RequestCache;", "Lcom/kubi/sdk/web/http/WebSsgPrefetch$b;", "c", "Lcom/kubi/sdk/web/http/RequestCache;", "requestCache", "Lrg0/g;", "d", "Lrg0/g;", "prefetchSemaphore", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebSsgPrefetch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSsgPrefetch.kt\ncom/kubi/sdk/web/http/WebSsgPrefetch\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,199:1\n71#2,2:200\n73#2,2:203\n1#3:202\n86#4,3:205\n*S KotlinDebug\n*F\n+ 1 WebSsgPrefetch.kt\ncom/kubi/sdk/web/http/WebSsgPrefetch\n*L\n174#1:200,2\n174#1:203,2\n195#1:205,3\n*E\n"})
public final class WebSsgPrefetch {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WebSsgPrefetch f48451a = new WebSsgPrefetch();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy defaultUA = LazyKt.lazy(new Function0<String>() { // from class: com.kubi.sdk.web.http.WebSsgPrefetch$defaultUA$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Mozilla/5.0 (Linux; Android 7.0; SM-G930V Build/NRD90M) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.125 Mobile Safari/537.36 " + WebConfig.f48355a.m58590a();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final RequestCache<Key, FetchData> requestCache = new RequestCache<>(0, 0, 0, 7, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC44088g prefetchSemaphore = C44091j.m97148b(3, 0, 2, null);

    /* JADX INFO: renamed from: com.kubi.sdk.web.http.WebSsgPrefetch$a, reason: from toString */
    /* JADX INFO: compiled from: WebSsgPrefetch.kt */
    /* JADX INFO: loaded from: classes43.dex */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/web/http/WebSsgPrefetch$a;", "", "", "html", "", "isSSG", "isRemote", "<init>", "(Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "Z", "c", "()Z", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class FetchData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String html;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean isSSG;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        public final boolean isRemote;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchData)) {
                return false;
            }
            FetchData fetchData = (FetchData) other;
            return Intrinsics.areEqual(this.html, fetchData.html) && this.isSSG == fetchData.isSSG && this.isRemote == fetchData.isRemote;
        }

        public FetchData(@NotNull String html, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(html, "html");
            this.html = html;
            this.isSSG = z11;
            this.isRemote = z12;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getHtml() {
            return this.html;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsRemote() {
            return this.isRemote;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsSSG() {
            return this.isSSG;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            int iHashCode = this.html.hashCode() * 31;
            boolean z11 = this.isSSG;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            int i11 = (iHashCode + r11) * 31;
            boolean z12 = this.isRemote;
            return i11 + (z12 ? 1 : z12);
        }

        @NotNull
        public String toString() {
            return "FetchData(html=" + this.html + ", isSSG=" + this.isSSG + ", isRemote=" + this.isRemote + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.web.http.WebSsgPrefetch$b, reason: from toString */
    /* JADX INFO: compiled from: WebSsgPrefetch.kt */
    /* JADX INFO: loaded from: classes43.dex */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/web/http/WebSsgPrefetch$b;", "", "", "url", BaseActivity.THEME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getUrl", "b", "getTheme", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @VisibleForTesting(otherwise = 2)
    public static final /* data */ class Key {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String url;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String theme;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.url, key.url) && Intrinsics.areEqual(this.theme, key.theme);
        }

        public Key(@NotNull String url, @NotNull String theme) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.url = url;
            this.theme = theme;
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.theme.hashCode();
        }

        @NotNull
        public String toString() {
            return "Key(url=" + this.url + ", theme=" + this.theme + ')';
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m58732g(String str) {
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "<!--[SSG]", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m58730k(WebSsgPrefetch webSsgPrefetch, String str, String str2, int i11, long j11, String str3, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            j11 = 0;
        }
        long j12 = j11;
        if ((i12 & 16) != 0) {
            str3 = null;
        }
        webSsgPrefetch.m58735j(str, str2, i11, j12, str3);
    }

    /* JADX INFO: renamed from: f */
    public final String m58731f() {
        return (String) defaultUA.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m58733h(@NotNull RequestCache.C24310a<FetchData> c24310a) {
        Intrinsics.checkNotNullParameter(c24310a, "<this>");
        if (!c24310a.m58720a().getIsSSG()) {
            return "no-ssg";
        }
        if (c24310a.getIsCached()) {
            return "ssg-cache";
        }
        return c24310a.m58720a().getIsRemote() ? "ssg-remote" : "ssg-local";
    }

    /* JADX INFO: renamed from: j */
    public final void m58735j(String type, String url, int code, long duration, String error) {
        boolean z11 = code == 200 || code == 201 || code == 304;
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42394e("success", z11);
        eventParametersBuilderAcquire.m42393d("url", url);
        TechnologyEvent.C19216a.m42397b(eventParametersBuilderAcquire);
        eventParametersBuilderAcquire.m42391b("code", code);
        eventParametersBuilderAcquire.m42393d("type", type);
        if (z11) {
            eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, duration);
        }
        if (error != null) {
            eventParametersBuilderAcquire.m42393d("error_message", error);
        }
        TechnologyEvent.m42388d("download_ssg", eventParametersBuilderAcquire);
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m58737m(@NotNull Context context, @NotNull String str, @Nullable String str2, @NotNull Continuation<? super RequestCache.C24310a<FetchData>> continuation) {
        return requestCache.m58717g(new Key(C24308d.m58706e(str), WebConfig.f48355a.m58599j()), new WebSsgPrefetch$requestWithCache$2(context, str, str2, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m58734i(@NotNull Context context, @NotNull List<String> list, @NotNull Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new WebSsgPrefetch$prefetchAll$2(list, context, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public final Object m58736l(Context context, String str, String str2, String str3, Continuation<? super FetchData> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new WebSsgPrefetch$request$2(str2, context, str3, str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final Object m58738n(@NotNull Context context, @NotNull String str, @Nullable String str2, @NotNull Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new WebSsgPrefetch$update$2(str, context, str2, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }
}
