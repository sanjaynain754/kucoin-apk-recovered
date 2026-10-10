package com.kubi.widget.web.cookie.cookiejar;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.user.config.UserInfo;
import com.kubi.widget.web.cookie.CookieHelper;
import com.kubi.widget.web.cookie.cookiejar.SessionCookieJar;
import com.kubi.widget.web.exception.KWebWidgetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p569qq.C43846g;
import p764xk.InterfaceC46258f;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SessionCookieJar.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/widget/web/cookie/cookiejar/SessionCookieJar;", "Lokhttp3/CookieJar;", "Lcom/kubi/kucoin/callback/IRetrofitCookieJarReceiver;", "<init>", "()V", "saveFromResponse", "", "url", "Lokhttp3/HttpUrl;", "cookies", "", "Lokhttp3/Cookie;", "loadForRequest", "Companion", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSessionCookieJar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionCookieJar.kt\ncom/kubi/widget/web/cookie/cookiejar/SessionCookieJar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n*L\n1#1,66:1\n774#2:67\n865#2,2:68\n2746#2,3:70\n46#3,6:73\n*S KotlinDebug\n*F\n+ 1 SessionCookieJar.kt\ncom/kubi/widget/web/cookie/cookiejar/SessionCookieJar\n*L\n37#1:67\n37#1:68,2\n38#1:70,3\n61#1:73,6\n*E\n"})
public final class SessionCookieJar implements CookieJar, InterfaceC46258f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f55072a = new Companion(null);

    /* JADX INFO: compiled from: SessionCookieJar.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/widget/web/cookie/cookiejar/SessionCookieJar$Companion;", "", "<init>", "()V", "TAG", "", "keySession", "keyCSRF", "KEY_WEB_SESSION_REUSE_ENABLED", "webSessionReuseEnabled", "", "getWebSessionReuseEnabled", "()Z", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSessionCookieJar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionCookieJar.kt\ncom/kubi/widget/web/cookie/cookiejar/SessionCookieJar$Companion\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,66:1\n35#2,4:67\n39#2:73\n44#3,2:71\n*S KotlinDebug\n*F\n+ 1 SessionCookieJar.kt\ncom/kubi/widget/web/cookie/cookiejar/SessionCookieJar$Companion\n*L\n31#1:67,4\n31#1:73\n31#1:71,2\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: com.kubi.widget.web.cookie.cookiejar.SessionCookieJar$Companion$a */
        /* JADX INFO: compiled from: RemoteConfig.kt */
        /* JADX INFO: loaded from: classes59.dex */
        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
        public static final class C27135a extends TypeToken<Boolean> {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m67138a() {
            Object objM20457a;
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C27135a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("kc_web_session_reuse_enabled", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            Boolean bool = (Boolean) objM20457a;
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m67137b() {
        return UserInfo.a.n();
    }

    @Override // okhttp3.CookieJar
    @NotNull
    public List<Cookie> loadForRequest(@NotNull HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!Intrinsics.areEqual(url.encodedPath(), "/_api/login-by-token")) {
            return CollectionsKt.emptyList();
        }
        if (!f55072a.m67138a()) {
            return CollectionsKt.emptyList();
        }
        String strM67088d = CookieHelper.f55058a.m67088d(url.getUrl(), "SESSION");
        if (strM67088d != null && strM67088d.length() != 0) {
            try {
                Cookie.Builder builderPath = new Cookie.Builder().name("SESSION").value(strM67088d).hostOnlyDomain(url.host()).path("/");
                if (url.getIsHttps()) {
                    builderPath.secure();
                }
                return CollectionsKt.listOf(builderPath.build());
            } catch (Exception e11) {
                if (!C42899b.m94075e(e11)) {
                    C43846g.m96568c(new KWebWidgetException(e11, "SessionCookieJar", false, null, 8, null), null, 2, null);
                } else {
                    C44128b.m97264h(e11);
                }
                return CollectionsKt.emptyList();
            }
        }
        return CollectionsKt.emptyList();
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(@NotNull HttpUrl url, @NotNull List<Cookie> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        if (!Intrinsics.areEqual(url.encodedPath(), "/_api/login-by-token")) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : cookies) {
            Cookie cookie = (Cookie) obj;
            if (Intrinsics.areEqual(cookie.name(), "SESSION") || Intrinsics.areEqual(cookie.name(), "X-CSRF-TOKEN")) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((Cookie) it.next()).name(), "SESSION")) {
                if (arrayList.isEmpty()) {
                    return;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(((Cookie) it2.next()).name(), "X-CSRF-TOKEN")) {
                        CookieHelper.f55058a.m67096l(arrayList, new Function0() { // from class: q80.b
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(SessionCookieJar.m67137b());
                            }
                        });
                        return;
                    }
                }
                return;
            }
        }
    }
}
