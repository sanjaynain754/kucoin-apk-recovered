package com.kubi.widget.web.cookie.cookiejar;

import com.kubi.user.config.UserInfo;
import com.kubi.widget.web.cookie.CookieHelper;
import com.kubi.widget.web.cookie.XTraceCookieHelper;
import java.util.List;
import java.util.ListIterator;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import p764xk.InterfaceC46258f;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: XTraceCookieJar.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/widget/web/cookie/cookiejar/XTraceCookieJar;", "Lokhttp3/CookieJar;", "Lcom/kubi/kucoin/callback/IRetrofitCookieJarReceiver;", "<init>", "()V", "saveFromResponse", "", "url", "Lokhttp3/HttpUrl;", "cookies", "", "Lokhttp3/Cookie;", "loadForRequest", "Companion", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nXTraceCookieJar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XTraceCookieJar.kt\ncom/kubi/widget/web/cookie/cookiejar/XTraceCookieJar\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
public final class XTraceCookieJar implements CookieJar, InterfaceC46258f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f55073a = new Companion(null);

    /* JADX INFO: compiled from: XTraceCookieJar.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/widget/web/cookie/cookiejar/XTraceCookieJar$Companion;", "", "<init>", "()V", "TAG", "", "key", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // okhttp3.CookieJar
    @NotNull
    public List<Cookie> loadForRequest(@NotNull HttpUrl url) {
        Cookie cookieM67144e;
        Intrinsics.checkNotNullParameter(url, "url");
        if (!StringsKt.isBlank(UserInfo.a.i()) && (cookieM67144e = XTraceCookieHelper.f55074a.m67144e()) != null) {
            return CollectionsKt.listOf(cookieM67144e);
        }
        return CollectionsKt.emptyList();
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(@NotNull HttpUrl url, @NotNull List<Cookie> cookies) {
        Cookie cookie;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        if (!cookies.isEmpty() && !StringsKt.isBlank(UserInfo.a.i())) {
            ListIterator<Cookie> listIterator = cookies.listIterator(cookies.size());
            while (true) {
                cookie = null;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Cookie cookiePrevious = listIterator.previous();
                if (StringsKt.contains$default((CharSequence) cookiePrevious.name(), (CharSequence) "X-TRACE", false, 2, (Object) null)) {
                    cookie = cookiePrevious;
                    break;
                }
            }
            Cookie cookie2 = cookie;
            if (cookie2 != null && XTraceCookieHelper.f55074a.m67145f(cookie2)) {
                CookieHelper.f55058a.m67095k(CollectionsKt.listOf(cookie2));
            }
        }
    }
}
