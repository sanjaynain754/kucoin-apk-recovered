package com.kubi.widget.web.cookie;

import android.webkit.CookieManager;
import com.kubi.host.HostManager;
import com.kubi.user.config.UserInfo;
import com.kubi.widget.web.exception.KWebWidgetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Cookie;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.widget.web.cookie.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: XTraceCookieHelper.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tJ\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/widget/web/cookie/XTraceCookieHelper;", "", "<init>", "()V", "TAG", "", "key", "cacheCookie", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/Cookie;", "savedCookie", "getSavedCookie", "()Lokhttp3/Cookie;", "savedCookie$delegate", "Lkotlin/Lazy;", "saveCache", "", "xTrace", "getTraceCookieString", "clearXTrace", "", "loadCache", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nXTraceCookieHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XTraceCookieHelper.kt\ncom/kubi/widget/web/cookie/XTraceCookieHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n*L\n1#1,66:1\n1617#2,9:67\n1869#2:76\n1870#2:78\n1626#2:79\n295#2,2:80\n1#3:77\n46#4,6:82\n*S KotlinDebug\n*F\n+ 1 XTraceCookieHelper.kt\ncom/kubi/widget/web/cookie/XTraceCookieHelper\n*L\n33#1:67,9\n33#1:76\n33#1:78\n33#1:79\n35#1:80,2\n33#1:77\n39#1:82,6\n*E\n"})
public final class XTraceCookieHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final XTraceCookieHelper f55074a = new XTraceCookieHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final AtomicReference<Cookie> f55075b = new AtomicReference<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f55076c = LazyKt.lazy(new Function0() { // from class: com.kubi.widget.web.cookie.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return XTraceCookieHelper.m67140g();
        }
    });

    /* JADX INFO: renamed from: g */
    public static final Cookie m67140g() {
        Object next;
        try {
            if (StringsKt.isBlank(UserInfo.a.i())) {
                return null;
            }
            HostManager hostManager = HostManager.a;
            HttpUrl httpUrl = HttpUrl.INSTANCE.get(hostManager.f());
            String cookie = CookieManager.getInstance().getCookie(hostManager.f());
            if (cookie == null) {
                return null;
            }
            List listSplit$default = StringsKt.split$default((CharSequence) cookie, new String[]{";"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                Cookie cookie2 = Cookie.INSTANCE.parse(httpUrl, (String) it.next());
                if (cookie2 != null) {
                    arrayList.add(cookie2);
                }
            }
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((Cookie) next).name(), "X-TRACE"));
            Cookie cookie3 = (Cookie) next;
            if (cookie3 == null) {
                return null;
            }
            f55075b.set(cookie3);
            return cookie3;
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                C44128b.m97264h(e11);
            } else {
                C43846g.m96568c(new KWebWidgetException(e11, "XTraceCookieHelper", false, null, 8, null), null, 2, null);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m67141b() {
        f55075b.set(null);
    }

    /* JADX INFO: renamed from: c */
    public final Cookie m67142c() {
        return (Cookie) f55076c.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m67143d() {
        Cookie cookie = f55075b.get();
        if (cookie != null) {
            return cookie.toString();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Cookie m67144e() {
        Cookie cookie = f55075b.get();
        return cookie == null ? m67142c() : cookie;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m67145f(@NotNull Cookie xTrace) {
        Intrinsics.checkNotNullParameter(xTrace, "xTrace");
        AtomicReference<Cookie> atomicReference = f55075b;
        Cookie cookie = atomicReference.get();
        if (cookie != null && Intrinsics.areEqual(cookie, xTrace)) {
            return false;
        }
        C44128b.m97266j("XTraceCookieHelper", "save x-trace:" + xTrace);
        atomicReference.set(xTrace);
        return true;
    }
}
