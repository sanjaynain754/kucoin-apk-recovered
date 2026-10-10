package com.kubi.widget.web.cookie;

import android.webkit.CookieManager;
import androidx.annotation.Keep;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.host.HostManager;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.widget.web.exception.KWebWidgetException;
import com.tencent.bugly.proguard.C33978va;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: CookieHelper.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u000223B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0014\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\f\u0010\u0018\u001a\u00020\u0011*\u00020\u0012H\u0002J\u001a\u0010\u0019\u001a\u00020\u0011*\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\tH\u0002J\u001b\u0010\u001b\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\tH\u0000¢\u0006\u0002\b\u001cJ)\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 H\u0000¢\u0006\u0002\b!J\u0016\u0010\"\u001a\u00020\u001e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\tH\u0002J\f\u0010#\u001a\u00020\u0011*\u00020\u0012H\u0002J\u0006\u0010$\u001a\u00020\u0011J\u0018\u0010%\u001a\u0004\u0018\u00010\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0005J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0005H\u0002J\u000e\u0010*\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0005J(\u0010+\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020-H\u0086@¢\u0006\u0002\u0010/J\u001a\u00100\u001a\u0004\u0018\u00010\u00052\u0006\u00101\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u00064"}, m90084d2 = {"Lcom/kubi/widget/web/cookie/CookieHelper;", "", "<init>", "()V", "TAG", "", "KEY_SESSION", "KEY_CSRF", "defaultKeys", "", "userCookieLock", "userKeys", "getUserKeys", "()Ljava/util/List;", "userKeys$delegate", "Lkotlin/Lazy;", "remove", "", "Landroid/webkit/CookieManager;", "domain", "name", "changeDomain", "Lokhttp3/Cookie;", "newDomain", "flushSync", "injectCookies", "cookies", "injectAllCookie", "injectAllCookie$LWebWidget_googleRelease", "injectAllCookieIf", "", "canInject", "Lkotlin/Function0;", "injectAllCookieIf$LWebWidget_googleRelease", "injectAllCookieLocked", "removeUserCookie", "clearUserCookie", "findValue", "url", "key", "hasSession", "hasCsrf", "hasSessionCookies", "waitUntilSessionCookiesVisible", "timeoutMs", "", "intervalMs", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findValueIn", "cookie", "Result", "CookieConfig", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCookieHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieHelper.kt\ncom/kubi/widget/web/cookie/CookieHelper\n+ 2 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,237:1\n46#2,6:238\n46#2,6:250\n46#2,6:256\n46#2,6:266\n46#2,6:272\n46#2,6:278\n46#2,6:284\n46#2,6:290\n1869#3,2:244\n1869#3:246\n1869#3,2:247\n1870#3:249\n1869#3:262\n1869#3,2:263\n1870#3:265\n35#4,4:296\n39#4:302\n44#5,2:300\n*S KotlinDebug\n*F\n+ 1 CookieHelper.kt\ncom/kubi/widget/web/cookie/CookieHelper\n*L\n80#1:238,6\n114#1:250,6\n134#1:256,6\n168#1:266,6\n173#1:272,6\n179#1:278,6\n188#1:284,6\n229#1:290,6\n85#1:244,2\n93#1:246\n94#1:247,2\n93#1:249\n149#1:262\n150#1:263,2\n149#1:265\n27#1:296,4\n27#1:302\n27#1:300,2\n*E\n"})
public final class CookieHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CookieHelper f55058a = new CookieHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<String> f55059b = CollectionsKt.listOf((Object[]) new String[]{"SESSION", "X-CSRF-TOKEN", "X-TRACE"});

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Object f55060c = new Object();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f55061d = LazyKt.lazy(new Function0() { // from class: com.kubi.widget.web.cookie.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CookieHelper.m67084q();
        }
    });

    /* JADX INFO: compiled from: CookieHelper.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/widget/web/cookie/CookieHelper$CookieConfig;", "", "userKeys", "", "", "<init>", "(Ljava/util/List;)V", "getUserKeys", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CookieConfig {

        @NotNull
        private final List<String> userKeys;

        /* JADX WARN: Multi-variable type inference failed */
        public CookieConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CookieConfig) && Intrinsics.areEqual(this.userKeys, ((CookieConfig) other).userKeys);
        }

        public CookieConfig(@NotNull List<String> userKeys) {
            Intrinsics.checkNotNullParameter(userKeys, "userKeys");
            this.userKeys = userKeys;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CookieConfig copy$default(CookieConfig cookieConfig, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = cookieConfig.userKeys;
            }
            return cookieConfig.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.userKeys;
        }

        @NotNull
        public final List<String> getUserKeys() {
            return this.userKeys;
        }

        public int hashCode() {
            return this.userKeys.hashCode();
        }

        @NotNull
        public String toString() {
            return "CookieConfig(userKeys=" + this.userKeys + ')';
        }

        @NotNull
        public final CookieConfig copy(@NotNull List<String> userKeys) {
            Intrinsics.checkNotNullParameter(userKeys, "userKeys");
            return new CookieConfig(userKeys);
        }

        public /* synthetic */ CookieConfig(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.cookie.CookieHelper$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C27130a extends TypeToken<CookieConfig> {
    }

    /* JADX INFO: renamed from: e */
    public final String m67089e(String str, String str2) {
        try {
            MatchResult matchResultFind$default = Regex.find$default(new Regex(str2 + "=([^;]+)"), str, 0, 2, null);
            if (matchResultFind$default == null) {
                return null;
            }
            return (String) CollectionsKt.getOrNull(matchResultFind$default.getGroupValues(), 1);
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                C44128b.m97264h(e11);
            } else {
                C43846g.m96568c(new KWebWidgetException(e11, "getWebGrayValue", false, null, 8, null), null, 2, null);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static final List m67084q() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C27130a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("cookies_config", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        CookieConfig cookieConfig = (CookieConfig) objM20457a;
        List<String> userKeys = cookieConfig != null ? cookieConfig.getUserKeys() : null;
        if (userKeys == null) {
            userKeys = CollectionsKt.emptyList();
        }
        return CollectionsKt.distinct(CollectionsKt.plus((Collection) f55059b, (Iterable) userKeys));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Object m67085s(CookieHelper cookieHelper, String str, long j11, long j12, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j12 = 50;
        }
        return cookieHelper.m67101r(str, j11, j12, continuation);
    }

    /* JADX INFO: renamed from: b */
    public final Cookie m67086b(Cookie cookie, String str) {
        Cookie.Builder builderPath = new Cookie.Builder().name(cookie.name()).value(cookie.value()).domain(str).expiresAt(cookie.expiresAt()).path(cookie.path());
        if (cookie.httpOnly()) {
            builderPath.httpOnly();
        }
        if (cookie.secure()) {
            builderPath.secure();
        }
        return builderPath.build();
    }

    /* JADX INFO: renamed from: c */
    public final void m67087c() {
        synchronized (f55060c) {
            try {
                XTraceCookieHelper.f55074a.m67141b();
            } catch (Exception e11) {
                if (C42899b.m94075e(e11)) {
                    C44128b.m97264h(e11);
                } else {
                    C43846g.m96568c(new KWebWidgetException(e11, "CookieHelper", false, null, 8, null), null, 2, null);
                }
            }
            try {
                CookieHelper cookieHelper = f55058a;
                CookieManager cookieManager = CookieManager.getInstance();
                Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
                cookieHelper.m67100p(cookieManager);
            } catch (Exception e12) {
                if (C42899b.m94075e(e12)) {
                    C44128b.m97264h(e12);
                } else {
                    C43846g.m96568c(new KWebWidgetException(e12, "CookieHelper", false, null, 8, null), null, 2, null);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        try {
            C24329b.f48558a.m58864d("cookieRemove", "clearUserCookie");
        } catch (Exception e13) {
            if (C42899b.m94075e(e13)) {
                C44128b.m97264h(e13);
            } else {
                C43846g.m96568c(new KWebWidgetException(e13, "CookieHelper", false, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final List<String> m67091g() {
        return (List) f55061d.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m67092h(String str) {
        String strM67088d = m67088d(str, "X-CSRF-TOKEN");
        return !(strM67088d == null || strM67088d.length() == 0);
    }

    /* JADX INFO: renamed from: k */
    public final void m67095k(@NotNull List<Cookie> cookies) {
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        synchronized (f55060c) {
            f55058a.m67097m(cookies);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m67096l(@NotNull List<Cookie> cookies, @NotNull Function0<Boolean> canInject) {
        boolean zM67097m;
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Intrinsics.checkNotNullParameter(canInject, "canInject");
        synchronized (f55060c) {
            zM67097m = false;
            try {
                zBooleanValue = canInject.invoke().booleanValue();
            } catch (Exception e11) {
                if (C42899b.m94075e(e11)) {
                    C44128b.m97264h(e11);
                } else {
                    C43846g.m96568c(new KWebWidgetException(e11, "CookieHelper", false, null, 8, null), null, 2, null);
                }
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                zM67097m = f55058a.m67097m(cookies);
            }
        }
        return zM67097m;
    }

    /* JADX INFO: renamed from: o */
    public final void m67099o(CookieManager cookieManager, String str, String str2) {
        String strRemovePrefix = StringsKt.removePrefix(str, (CharSequence) C33978va.f72339h);
        String str3 = str2 + "=; Path=/; Max-Age=0; expires=Sat, 1 Jan 2000 00:00:01 UTC;";
        cookieManager.setCookie("https://" + strRemovePrefix, str3);
        cookieManager.setCookie("https://" + strRemovePrefix, str3 + " Domain=." + strRemovePrefix + ';');
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:24:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: r */
    public final java.lang.Object m67101r(@org.jetbrains.annotations.NotNull java.lang.String r17, long r18, long r20, @org.jetbrains.annotations.NotNull p852kotlin.coroutines.Continuation<? super java.lang.Boolean> r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r22
            boolean r2 = r1 instanceof com.kubi.widget.web.cookie.CookieHelper$waitUntilSessionCookiesVisible$1
            if (r2 == 0) goto L17
            r2 = r1
            com.kubi.widget.web.cookie.CookieHelper$waitUntilSessionCookiesVisible$1 r2 = (com.kubi.widget.web.cookie.CookieHelper$waitUntilSessionCookiesVisible$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.kubi.widget.web.cookie.CookieHelper$waitUntilSessionCookiesVisible$1 r2 = new com.kubi.widget.web.cookie.CookieHelper$waitUntilSessionCookiesVisible$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L43
            if (r4 != r5) goto L3b
            long r6 = r2.J$2
            long r8 = r2.J$1
            long r10 = r2.J$0
            java.lang.Object r4 = r2.L$0
            java.lang.String r4 = (java.lang.String) r4
            p852kotlin.ResultKt.throwOnFailure(r1)
            r14 = r10
            r10 = r6
            r6 = r14
            r1 = r4
            goto L77
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L43:
            p852kotlin.ResultKt.throwOnFailure(r1)
            boolean r1 = r16.m67094j(r17)
            if (r1 == 0) goto L51
            java.lang.Boolean r1 = p852kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r1
        L51:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 + r18
            r1 = r17
            r8 = r20
            r10 = r6
            r6 = r18
        L5e:
            long r12 = java.lang.System.currentTimeMillis()
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 >= 0) goto L82
            r2.L$0 = r1
            r2.J$0 = r6
            r2.J$1 = r8
            r2.J$2 = r10
            r2.label = r5
            java.lang.Object r4 = kotlinx.coroutines.DelayKt.m90350b(r8, r2)
            if (r4 != r3) goto L77
            return r3
        L77:
            boolean r4 = r0.m67094j(r1)
            if (r4 == 0) goto L5e
            java.lang.Boolean r1 = p852kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r1
        L82:
            boolean r1 = r0.m67094j(r1)
            java.lang.Boolean r1 = p852kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.widget.web.cookie.CookieHelper.m67101r(java.lang.String, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m67088d(@NotNull String url, @NotNull String key) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            String cookie = CookieManager.getInstance().getCookie(url);
            if (cookie == null) {
                return null;
            }
            return m67089e(cookie, key);
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                C43846g.m96568c(new KWebWidgetException(e11, "getWebGrayValue", false, null, 8, null), null, 2, null);
            } else {
                C44128b.m97264h(e11);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m67090f(CookieManager cookieManager) {
        try {
            cookieManager.flush();
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                C43846g.m96568c(new KWebWidgetException(e11, "CookieHelper", false, null, 8, null), null, 2, null);
            } else {
                C44128b.m97264h(e11);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m67093i(@NotNull String url) {
        boolean z11;
        Intrinsics.checkNotNullParameter(url, "url");
        String strM67088d = m67088d(url, "SESSION");
        if (strM67088d != null && strM67088d.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m67094j(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (m67093i(url) && m67092h(url)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m67097m(List<Cookie> list) {
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            try {
                Intrinsics.checkNotNull(cookieManager);
                m67098n(cookieManager, list);
                return true;
            } finally {
                Intrinsics.checkNotNull(cookieManager);
                m67090f(cookieManager);
            }
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                C43846g.m96568c(new KWebWidgetException(e11, "CookieHelper", false, null, 8, null), null, 2, null);
                return false;
            }
            C44128b.m97264h(e11);
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m67098n(CookieManager cookieManager, List<Cookie> list) {
        for (Cookie cookie : list) {
            cookieManager.setCookie("https://" + cookie.domain(), cookie.toString());
        }
        ArrayList<String> arrayList = new ArrayList();
        HostManager hostManager = HostManager.a;
        arrayList.addAll(hostManager.h());
        arrayList.addAll(hostManager.s());
        for (String str : arrayList) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                cookieManager.setCookie("https://" + str, f55058a.m67086b((Cookie) it.next(), str).toString());
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m67100p(CookieManager cookieManager) {
        try {
            List<String> listM67091g = m67091g();
            HashSet<String> hashSet = new HashSet();
            HostManager hostManager = HostManager.a;
            hashSet.addAll(hostManager.h());
            hashSet.addAll(hostManager.s());
            for (String str : hashSet) {
                Iterator<T> it = listM67091g.iterator();
                while (it.hasNext()) {
                    f55058a.m67099o(cookieManager, str, (String) it.next());
                }
            }
            m67090f(cookieManager);
        } catch (Throwable th2) {
            m67090f(cookieManager);
            throw th2;
        }
    }
}
