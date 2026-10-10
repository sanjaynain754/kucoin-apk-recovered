package com.kubi.widget.web.cookie;

/* JADX INFO: compiled from: CookieHelper.kt */
/* JADX INFO: loaded from: classes23.dex */
@kotlin.Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u000223B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0014\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\f\u0010\u0018\u001a\u00020\u0011*\u00020\u0012H\u0002J\u001a\u0010\u0019\u001a\u00020\u0011*\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\tH\u0002J\u001b\u0010\u001b\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\tH\u0000¢\u0006\u0002\b\u001cJ)\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 H\u0000¢\u0006\u0002\b!J\u0016\u0010\"\u001a\u00020\u001e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\tH\u0002J\f\u0010#\u001a\u00020\u0011*\u00020\u0012H\u0002J\u0006\u0010$\u001a\u00020\u0011J\u0018\u0010%\u001a\u0004\u0018\u00010\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0005J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0005H\u0002J\u000e\u0010*\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0005J(\u0010+\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020-H\u0086@¢\u0006\u0002\u0010/J\u001a\u00100\u001a\u0004\u0018\u00010\u00052\u0006\u00101\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u00064"}, m90084d2 = {"Lcom/kubi/widget/web/cookie/CookieHelper;", "", "<init>", "()V", "TAG", "", "KEY_SESSION", "KEY_CSRF", "defaultKeys", "", "userCookieLock", "userKeys", "getUserKeys", "()Ljava/util/List;", "userKeys$delegate", "Lkotlin/Lazy;", "remove", "", "Landroid/webkit/CookieManager;", "domain", "name", "changeDomain", "Lokhttp3/Cookie;", "newDomain", "flushSync", "injectCookies", "cookies", "injectAllCookie", "injectAllCookie$LWebWidget_googleRelease", "injectAllCookieIf", "", "canInject", "Lkotlin/Function0;", "injectAllCookieIf$LWebWidget_googleRelease", "injectAllCookieLocked", "removeUserCookie", "clearUserCookie", "findValue", "url", "key", "hasSession", "hasCsrf", "hasSessionCookies", "waitUntilSessionCookiesVisible", "timeoutMs", "", "intervalMs", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findValueIn", "cookie", "Result", "CookieConfig", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCookieHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieHelper.kt\ncom/kubi/widget/web/cookie/CookieHelper\n+ 2 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,237:1\n46#2,6:238\n46#2,6:250\n46#2,6:256\n46#2,6:266\n46#2,6:272\n46#2,6:278\n46#2,6:284\n46#2,6:290\n1869#3,2:244\n1869#3:246\n1869#3,2:247\n1870#3:249\n1869#3:262\n1869#3,2:263\n1870#3:265\n35#4,4:296\n39#4:302\n44#5,2:300\n*S KotlinDebug\n*F\n+ 1 CookieHelper.kt\ncom/kubi/widget/web/cookie/CookieHelper\n*L\n80#1:238,6\n114#1:250,6\n134#1:256,6\n168#1:266,6\n173#1:272,6\n179#1:278,6\n188#1:284,6\n229#1:290,6\n85#1:244,2\n93#1:246\n94#1:247,2\n93#1:249\n149#1:262\n150#1:263,2\n149#1:265\n27#1:296,4\n27#1:302\n27#1:300,2\n*E\n"})
public final class CookieHelper {

    /* JADX INFO: renamed from: a */
    @org.jetbrains.annotations.NotNull
    public static final com.kubi.widget.web.cookie.CookieHelper f55058a = null;

    /* JADX INFO: renamed from: b */
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> f55059b = null;

    /* JADX INFO: renamed from: c */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object f55060c = null;

    /* JADX INFO: renamed from: d */
    @org.jetbrains.annotations.NotNull
    public static final kotlin.Lazy f55061d = null;

    /* JADX INFO: compiled from: CookieHelper.kt */
    @androidx.annotation.Keep
    @kotlin.Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/widget/web/cookie/CookieHelper$CookieConfig;", "", "userKeys", "", "", "<init>", "(Ljava/util/List;)V", "getUserKeys", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CookieConfig {

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> userKeys;

        public CookieConfig() {
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r0)
                return
        }

        public CookieConfig(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r2) {
                r1 = this;
                java.lang.String r0 = "userKeys"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.userKeys = r2
                return
        }

        public /* synthetic */ CookieConfig(java.util.List r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L8
                java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ com.kubi.widget.web.cookie.CookieHelper.CookieConfig copy$default(com.kubi.widget.web.cookie.CookieHelper.CookieConfig r0, java.util.List r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L6
                java.util.List<java.lang.String> r1 = r0.userKeys
            L6:
                com.kubi.widget.web.cookie.CookieHelper$CookieConfig r0 = r0.copy(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> component1() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.userKeys
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.kubi.widget.web.cookie.CookieHelper.CookieConfig copy(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r2) {
                r1 = this;
                java.lang.String r0 = "userKeys"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                com.kubi.widget.web.cookie.CookieHelper$CookieConfig r0 = new com.kubi.widget.web.cookie.CookieHelper$CookieConfig
                r0.<init>(r2)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof com.kubi.widget.web.cookie.CookieHelper.CookieConfig
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.kubi.widget.web.cookie.CookieHelper$CookieConfig r4 = (com.kubi.widget.web.cookie.CookieHelper.CookieConfig) r4
                java.util.List<java.lang.String> r1 = r3.userKeys
                java.util.List<java.lang.String> r4 = r4.userKeys
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
                if (r4 != 0) goto L17
                return r2
            L17:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getUserKeys() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.userKeys
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.userKeys
                int r0 = r0.hashCode()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "CookieConfig(userKeys="
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r2.userKeys
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.cookie.CookieHelper$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C27130a extends com.google.gson.reflect.TypeToken<com.kubi.widget.web.cookie.CookieHelper.CookieConfig> {
        public C27130a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            com.kubi.widget.web.cookie.CookieHelper r0 = new com.kubi.widget.web.cookie.CookieHelper
            r0.<init>()
            com.kubi.widget.web.cookie.CookieHelper.f55058a = r0
            java.lang.String r0 = "X-CSRF-TOKEN"
            java.lang.String r1 = "X-TRACE"
            java.lang.String r2 = "SESSION"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            com.kubi.widget.web.cookie.CookieHelper.f55059b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.kubi.widget.web.cookie.CookieHelper.f55060c = r0
            com.kubi.widget.web.cookie.a r0 = new com.kubi.widget.web.cookie.a
            r0.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            com.kubi.widget.web.cookie.CookieHelper.f55061d = r0
            return
    }

    public CookieHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ java.util.List m67083a() {
            java.util.List r0 = m67084q()
            return r0
    }

    /* JADX INFO: renamed from: q */
    public static final java.util.List m67084q() {
            java.lang.String r0 = "cookies_config"
            r1 = 0
            com.kubi.config.RemoteConfig r2 = com.kubi.config.RemoteConfig.f19636a     // Catch: java.lang.Throwable -> L19
            com.kubi.widget.web.cookie.CookieHelper$a r2 = new com.kubi.widget.web.cookie.CookieHelper$a     // Catch: java.lang.Throwable -> L19
            r2.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "object : TypeToken<T>() {}.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = com.kubi.config.RemoteConfig.m20457a(r0, r2)     // Catch: java.lang.Throwable -> L19
            goto L2c
        L19:
            r0 = move-exception
            r3 = r0
            com.kubi.config.exception.KCConfigException r2 = new com.kubi.config.exception.KCConfigException
            r7 = 8
            r8 = 0
            java.lang.String r4 = "RemoteConfig"
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = 2
            p569qq.C43846g.m96568c(r2, r1, r0, r1)
            r0 = r1
        L2c:
            com.kubi.widget.web.cookie.CookieHelper$CookieConfig r0 = (com.kubi.widget.web.cookie.CookieHelper.CookieConfig) r0
            if (r0 == 0) goto L34
            java.util.List r1 = r0.getUserKeys()
        L34:
            if (r1 != 0) goto L3a
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L3a:
            java.util.List<java.lang.String> r0 = com.kubi.widget.web.cookie.CookieHelper.f55059b
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r0, r1)
            java.util.List r0 = kotlin.collections.CollectionsKt.distinct(r0)
            return r0
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ java.lang.Object m67085s(com.kubi.widget.web.cookie.CookieHelper r7, java.lang.String r8, long r9, long r11, kotlin.coroutines.Continuation r13, int r14, java.lang.Object r15) {
            r14 = r14 & 4
            if (r14 == 0) goto L6
            r11 = 50
        L6:
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r6 = r13
            java.lang.Object r7 = r0.m67101r(r1, r2, r4, r6)
            return r7
    }

    /* JADX INFO: renamed from: b */
    public final okhttp3.Cookie m67086b(okhttp3.Cookie r3, java.lang.String r4) {
            r2 = this;
            okhttp3.Cookie$Builder r0 = new okhttp3.Cookie$Builder
            r0.<init>()
            java.lang.String r1 = r3.name()
            okhttp3.Cookie$Builder r0 = r0.name(r1)
            java.lang.String r1 = r3.value()
            okhttp3.Cookie$Builder r0 = r0.value(r1)
            okhttp3.Cookie$Builder r4 = r0.domain(r4)
            long r0 = r3.expiresAt()
            okhttp3.Cookie$Builder r4 = r4.expiresAt(r0)
            java.lang.String r0 = r3.path()
            okhttp3.Cookie$Builder r4 = r4.path(r0)
            boolean r0 = r3.httpOnly()
            if (r0 == 0) goto L32
            r4.httpOnly()
        L32:
            boolean r3 = r3.secure()
            if (r3 == 0) goto L3b
            r4.secure()
        L3b:
            okhttp3.Cookie r3 = r4.build()
            return r3
    }

    /* JADX INFO: renamed from: c */
    public final void m67087c() {
            r11 = this;
            java.lang.Object r1 = com.kubi.widget.web.cookie.CookieHelper.f55060c
            monitor-enter(r1)
            r2 = 2
            r3 = 0
            com.kubi.widget.web.cookie.d r0 = com.kubi.widget.web.cookie.C27136d.f55074a     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Le
            r0.m67141b()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Le
            goto L29
        Lb:
            r0 = move-exception
            goto L7c
        Le:
            r0 = move-exception
            r5 = r0
            java.lang.String r6 = "CookieHelper"
            boolean r0 = p481ny.C42899b.m94075e(r5)     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto L26
            com.kubi.widget.web.exception.KWebWidgetException r4 = new com.kubi.widget.web.exception.KWebWidgetException     // Catch: java.lang.Throwable -> Lb
            r9 = 8
            r10 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb
            p569qq.C43846g.m96568c(r4, r3, r2, r3)     // Catch: java.lang.Throwable -> Lb
            goto L29
        L26:
            ro.C44128b.m97264h(r5)     // Catch: java.lang.Throwable -> Lb
        L29:
            com.kubi.widget.web.cookie.CookieHelper r0 = com.kubi.widget.web.cookie.CookieHelper.f55058a     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L38
            android.webkit.CookieManager r4 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L38
            java.lang.String r5 = "getInstance(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L38
            r0.m67100p(r4)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L38
            goto L53
        L38:
            r0 = move-exception
            r5 = r0
            java.lang.String r6 = "CookieHelper"
            boolean r0 = p481ny.C42899b.m94075e(r5)     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto L50
            com.kubi.widget.web.exception.KWebWidgetException r4 = new com.kubi.widget.web.exception.KWebWidgetException     // Catch: java.lang.Throwable -> Lb
            r9 = 8
            r10 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb
            p569qq.C43846g.m96568c(r4, r3, r2, r3)     // Catch: java.lang.Throwable -> Lb
            goto L53
        L50:
            ro.C44128b.m97264h(r5)     // Catch: java.lang.Throwable -> Lb
        L53:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            com.kubi.sdk.web.util.b r0 = com.kubi.sdk.web.util.C24329b.f48558a     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = "cookieRemove"
            java.lang.String r4 = "clearUserCookie"
            r0.m58864d(r1, r4)     // Catch: java.lang.Exception -> L60
            goto L7b
        L60:
            r0 = move-exception
            r5 = r0
            java.lang.String r6 = "CookieHelper"
            boolean r0 = p481ny.C42899b.m94075e(r5)
            if (r0 != 0) goto L78
            com.kubi.widget.web.exception.KWebWidgetException r4 = new com.kubi.widget.web.exception.KWebWidgetException
            r9 = 8
            r10 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            p569qq.C43846g.m96568c(r4, r3, r2, r3)
            goto L7b
        L78:
            ro.C44128b.m97264h(r5)
        L7b:
            return
        L7c:
            monitor-exit(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: d */
    public final java.lang.String m67088d(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11) {
            r9 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r1 = 0
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Exception -> L1d
            java.lang.String r10 = r0.getCookie(r10)     // Catch: java.lang.Exception -> L1d
            if (r10 != 0) goto L18
            return r1
        L18:
            java.lang.String r10 = r9.m67089e(r10, r11)     // Catch: java.lang.Exception -> L1d
            return r10
        L1d:
            r0 = move-exception
            r10 = r0
            r3 = r10
            boolean r10 = p481ny.C42899b.m94075e(r3)
            if (r10 != 0) goto L37
            com.kubi.widget.web.exception.KWebWidgetException r2 = new com.kubi.widget.web.exception.KWebWidgetException
            r7 = 8
            r8 = 0
            java.lang.String r4 = "getWebGrayValue"
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = 2
            p569qq.C43846g.m96568c(r2, r1, r10, r1)
            goto L3a
        L37:
            ro.C44128b.m97264h(r3)
        L3a:
            return r1
    }

    /* JADX INFO: renamed from: e */
    public final java.lang.String m67089e(java.lang.String r11, java.lang.String r12) {
            r10 = this;
            r1 = 2
            r2 = 0
            kotlin.text.Regex r0 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2c
            r3.<init>()     // Catch: java.lang.Exception -> L2c
            r3.append(r12)     // Catch: java.lang.Exception -> L2c
            java.lang.String r12 = "=([^;]+)"
            r3.append(r12)     // Catch: java.lang.Exception -> L2c
            java.lang.String r12 = r3.toString()     // Catch: java.lang.Exception -> L2c
            r0.<init>(r12)     // Catch: java.lang.Exception -> L2c
            r12 = 0
            kotlin.text.MatchResult r11 = kotlin.text.Regex.find$default(r0, r11, r12, r1, r2)     // Catch: java.lang.Exception -> L2c
            if (r11 != 0) goto L20
            return r2
        L20:
            java.util.List r11 = r11.getGroupValues()     // Catch: java.lang.Exception -> L2c
            r12 = 1
            java.lang.Object r11 = kotlin.collections.CollectionsKt.getOrNull(r11, r12)     // Catch: java.lang.Exception -> L2c
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Exception -> L2c
            return r11
        L2c:
            r0 = move-exception
            r11 = r0
            r4 = r11
            boolean r11 = p481ny.C42899b.m94075e(r4)
            if (r11 != 0) goto L45
            com.kubi.widget.web.exception.KWebWidgetException r3 = new com.kubi.widget.web.exception.KWebWidgetException
            r8 = 8
            r9 = 0
            java.lang.String r5 = "getWebGrayValue"
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            p569qq.C43846g.m96568c(r3, r2, r1, r2)
            goto L48
        L45:
            ro.C44128b.m97264h(r4)
        L48:
            return r2
    }

    /* JADX INFO: renamed from: f */
    public final void m67090f(android.webkit.CookieManager r8) {
            r7 = this;
            r8.flush()     // Catch: java.lang.Exception -> L4
            return
        L4:
            r0 = move-exception
            r1 = r0
            boolean r8 = p481ny.C42899b.m94075e(r1)
            if (r8 != 0) goto L1e
            com.kubi.widget.web.exception.KWebWidgetException r0 = new com.kubi.widget.web.exception.KWebWidgetException
            r5 = 8
            r6 = 0
            java.lang.String r2 = "CookieHelper"
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8 = 2
            r1 = 0
            p569qq.C43846g.m96568c(r0, r1, r8, r1)
            goto L21
        L1e:
            ro.C44128b.m97264h(r1)
        L21:
            return
    }

    /* JADX INFO: renamed from: g */
    public final java.util.List<java.lang.String> m67091g() {
            r1 = this;
            kotlin.Lazy r0 = com.kubi.widget.web.cookie.CookieHelper.f55061d
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    /* JADX INFO: renamed from: h */
    public final boolean m67092h(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "X-CSRF-TOKEN"
            java.lang.String r2 = r1.m67088d(r2, r0)
            r0 = 1
            if (r2 == 0) goto L12
            int r2 = r2.length()
            if (r2 != 0) goto L10
            goto L12
        L10:
            r2 = 0
            goto L13
        L12:
            r2 = r0
        L13:
            r2 = r2 ^ r0
            return r2
    }

    /* JADX INFO: renamed from: i */
    public final boolean m67093i(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "SESSION"
            java.lang.String r2 = r1.m67088d(r2, r0)
            r0 = 1
            if (r2 == 0) goto L18
            int r2 = r2.length()
            if (r2 != 0) goto L16
            goto L18
        L16:
            r2 = 0
            goto L19
        L18:
            r2 = r0
        L19:
            r2 = r2 ^ r0
            return r2
    }

    /* JADX INFO: renamed from: j */
    public final boolean m67094j(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.m67093i(r2)
            if (r0 == 0) goto L14
            boolean r2 = r1.m67092h(r2)
            if (r2 == 0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: k */
    public final void m67095k(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.Cookie> r3) {
            r2 = this;
            java.lang.String r0 = "cookies"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Object r0 = com.kubi.widget.web.cookie.CookieHelper.f55060c
            monitor-enter(r0)
            com.kubi.widget.web.cookie.CookieHelper r1 = com.kubi.widget.web.cookie.CookieHelper.f55058a     // Catch: java.lang.Throwable -> Lf
            r1.m67097m(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return
        Lf:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    /* JADX INFO: renamed from: l */
    public final boolean m67096l(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.Cookie> r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r12) {
            r10 = this;
            java.lang.String r0 = "cookies"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "canInject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.Object r1 = com.kubi.widget.web.cookie.CookieHelper.f55060c
            monitor-enter(r1)
            r2 = 0
            java.lang.Object r12 = r12.invoke()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c
            goto L3b
        L19:
            r0 = move-exception
            r11 = r0
            goto L46
        L1c:
            r0 = move-exception
            r12 = r0
            r4 = r12
            java.lang.String r5 = "CookieHelper"
            boolean r12 = p481ny.C42899b.m94075e(r4)     // Catch: java.lang.Throwable -> L19
            if (r12 != 0) goto L37
            com.kubi.widget.web.exception.KWebWidgetException r3 = new com.kubi.widget.web.exception.KWebWidgetException     // Catch: java.lang.Throwable -> L19
            r8 = 8
            r9 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L19
            r12 = 2
            r0 = 0
            p569qq.C43846g.m96568c(r3, r0, r12, r0)     // Catch: java.lang.Throwable -> L19
            goto L3a
        L37:
            ro.C44128b.m97264h(r4)     // Catch: java.lang.Throwable -> L19
        L3a:
            r12 = r2
        L3b:
            if (r12 != 0) goto L3e
            goto L44
        L3e:
            com.kubi.widget.web.cookie.CookieHelper r12 = com.kubi.widget.web.cookie.CookieHelper.f55058a     // Catch: java.lang.Throwable -> L19
            boolean r2 = r12.m67097m(r11)     // Catch: java.lang.Throwable -> L19
        L44:
            monitor-exit(r1)
            return r2
        L46:
            monitor-exit(r1)
            throw r11
    }

    /* JADX INFO: renamed from: m */
    public final boolean m67097m(java.util.List<okhttp3.Cookie> r8) {
            r7 = this;
            android.webkit.CookieManager r1 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Exception -> Lf
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L13
            r7.m67098n(r1, r8)     // Catch: java.lang.Throwable -> L13
            r8 = 1
            r7.m67090f(r1)     // Catch: java.lang.Exception -> Lf
            return r8
        Lf:
            r0 = move-exception
            r8 = r0
            r1 = r8
            goto L1c
        L13:
            r0 = move-exception
            r8 = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Exception -> Lf
            r7.m67090f(r1)     // Catch: java.lang.Exception -> Lf
            throw r8     // Catch: java.lang.Exception -> Lf
        L1c:
            boolean r8 = p481ny.C42899b.m94075e(r1)
            if (r8 != 0) goto L34
            com.kubi.widget.web.exception.KWebWidgetException r0 = new com.kubi.widget.web.exception.KWebWidgetException
            r5 = 8
            r6 = 0
            java.lang.String r2 = "CookieHelper"
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8 = 2
            r1 = 0
            p569qq.C43846g.m96568c(r0, r1, r8, r1)
            goto L37
        L34:
            ro.C44128b.m97264h(r1)
        L37:
            r8 = 0
            return r8
    }

    /* JADX INFO: renamed from: n */
    public final void m67098n(android.webkit.CookieManager r8, java.util.List<okhttp3.Cookie> r9) {
            r7 = this;
            java.util.Iterator r0 = r9.iterator()
        L4:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "https://"
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            okhttp3.Cookie r1 = (okhttp3.Cookie) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = r1.domain()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r1 = r1.toString()
            r8.setCookie(r2, r1)
            goto L4
        L2d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kubi.host.HostManager r1 = com.kubi.host.HostManager.a
            java.util.List r3 = r1.h()
            r0.addAll(r3)
            java.util.List r1 = r1.s()
            r0.addAll(r1)
            java.util.Iterator r0 = r0.iterator()
        L46:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Iterator r3 = r9.iterator()
        L56:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L46
            java.lang.Object r4 = r3.next()
            okhttp3.Cookie r4 = (okhttp3.Cookie) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.kubi.widget.web.cookie.CookieHelper r6 = com.kubi.widget.web.cookie.CookieHelper.f55058a
            okhttp3.Cookie r4 = r6.m67086b(r4, r1)
            java.lang.String r4 = r4.toString()
            r8.setCookie(r5, r4)
            goto L56
        L7f:
            return
    }

    /* JADX INFO: renamed from: o */
    public final void m67099o(android.webkit.CookieManager r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.lang.String r0 = "."
            java.lang.String r4 = kotlin.text.StringsKt.removePrefix(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "=; Path=/; Max-Age=0; expires=Sat, 1 Jan 2000 00:00:01 UTC;"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "https://"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r3.setCookie(r0, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = " Domain=."
            r1.append(r5)
            r1.append(r4)
            r4 = 59
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.setCookie(r0, r4)
            return
    }

    /* JADX INFO: renamed from: p */
    public final void m67100p(android.webkit.CookieManager r7) {
            r6 = this;
            java.util.List r0 = r6.m67091g()     // Catch: java.lang.Throwable -> L3f
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L3f
            r1.<init>()     // Catch: java.lang.Throwable -> L3f
            com.kubi.host.HostManager r2 = com.kubi.host.HostManager.a     // Catch: java.lang.Throwable -> L3f
            java.util.List r3 = r2.h()     // Catch: java.lang.Throwable -> L3f
            r1.addAll(r3)     // Catch: java.lang.Throwable -> L3f
            java.util.List r2 = r2.s()     // Catch: java.lang.Throwable -> L3f
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3f
        L1d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L3f
        L2d:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L1d
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L3f
            com.kubi.widget.web.cookie.CookieHelper r5 = com.kubi.widget.web.cookie.CookieHelper.f55058a     // Catch: java.lang.Throwable -> L3f
            r5.m67099o(r7, r2, r4)     // Catch: java.lang.Throwable -> L3f
            goto L2d
        L3f:
            r0 = move-exception
            goto L45
        L41:
            r6.m67090f(r7)
            return
        L45:
            r6.m67090f(r7)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: r */
    public final java.lang.Object m67101r(@org.jetbrains.annotations.NotNull java.lang.String r17, long r18, long r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r22) {
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
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L43
            if (r4 != r5) goto L3b
            long r6 = r2.J$2
            long r8 = r2.J$1
            long r10 = r2.J$0
            java.lang.Object r4 = r2.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.ResultKt.throwOnFailure(r1)
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
            kotlin.ResultKt.throwOnFailure(r1)
            boolean r1 = r16.m67094j(r17)
            if (r1 == 0) goto L51
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
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
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r1
        L82:
            boolean r1 = r0.m67094j(r1)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            return r1
    }
}
