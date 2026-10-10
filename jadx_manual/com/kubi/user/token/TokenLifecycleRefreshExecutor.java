package com.kubi.user.token;

/* JADX INFO: compiled from: TokenLifecycleRefreshExecutor.kt */
/* JADX INFO: loaded from: classes53.dex */
@kotlin.Metadata(m90083d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0013\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003^_`B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0002\b&J0\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010.J.\u0010/\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010.J \u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\nH\u0002J'\u00103\u001a\u0002042\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\b\b\u0002\u00105\u001a\u00020\nH\u0000¢\u0006\u0002\b6J\r\u00107\u001a\u000204H\u0000¢\u0006\u0002\b8J\r\u00109\u001a\u00020\bH\u0000¢\u0006\u0002\b:J2\u0010;\u001a\u0002H<\"\u0004\b\u0000\u0010<2\u001c\u0010=\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H<0?\u0012\u0006\u0012\u0004\u0018\u00010\u00010>H\u0082@¢\u0006\u0002\u0010@J*\u0010A\u001a\u0004\u0018\u00010B2\u0006\u00101\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u00182\u0006\u0010E\u001a\u00020FH\u0002J\"\u0010G\u001a\u0004\u0018\u00010H2\u0006\u00101\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0018H\u0002J \u0010I\u001a\u0002042\u0006\u00101\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0018H\u0002J(\u0010J\u001a\u0002042\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020F2\u0006\u0010N\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0005H\u0002J\u0018\u0010O\u001a\u0002042\u0006\u0010P\u001a\u00020F2\u0006\u0010Q\u001a\u00020RH\u0002J\b\u0010S\u001a\u000204H\u0002J\b\u0010T\u001a\u000204H\u0002J\u0019\u0010U\u001a\u0004\u0018\u00010V2\b\u0010W\u001a\u0004\u0018\u00010XH\u0000¢\u0006\u0002\bYJ\u0010\u0010Z\u001a\u0002042\u0006\u0010[\u001a\u00020\bH\u0002J\u0010\u0010\\\u001a\u0002042\u0006\u0010]\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001d\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b \u0010!¨\u0006a"}, m90084d2 = {"Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;", "", "<init>", "()V", "FAILED_BY_KICK", "", "PAGE_ID", "MAX_NETWORK_RETRY_COUNT", "", "NOTIFY_REFRESH_TOKEN_TIME_LIMIT", "", "DIALOG_TIME_SPAN", "MAX_REFRESH_RATE_LIMIT_ENTRIES", "RECEIVER_HANDLED_ERROR_CODES", "", "lastDialogTime", "lastNotifyRefreshTokenTime", "refreshRateLimitLock", "lastRefreshElapsedRealtimeBySession", "com/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1", "Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1;", "refreshMutex", "Lkotlinx/coroutines/sync/Mutex;", "needNotifyTokenRefresh", "", "getNeedNotifyTokenRefresh", "()Z", "needNotifyTokenRefresh$delegate", "Lkotlin/Lazy;", "refreshApi", "Lcom/kubi/user/token/TokenLifecycleRefreshApi;", "kotlin.jvm.PlatformType", "getRefreshApi", "()Lcom/kubi/user/token/TokenLifecycleRefreshApi;", "refreshApi$delegate", "createRefreshOkHttpClient", "Lokhttp3/OkHttpClient;", "baseClient", "createRefreshOkHttpClient$UserCenterLib_googleRelease", "refreshToken", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "triggerPath", "context", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshContext;", "source", "refreshTimeLimit", "(Ljava/lang/String;Lcom/kubi/kucoin/token/TokenLifecycleRefreshContext;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshTokenInternal", "shouldSkipRefresh", "accountId", "accessToken", "recordTokenIssued", "", "elapsedRealtime", "recordTokenIssued$UserCenterLib_googleRelease", "resetRefreshTimeForTest", "resetRefreshTimeForTest$UserCenterLib_googleRelease", "refreshRateLimitEntryCountForTest", "refreshRateLimitEntryCountForTest$UserCenterLib_googleRelease", "retryNetworkException", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commitRefreshResult", "Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$RefreshCommitResult;", "attributionToken", "wasCurrentAccount", "refreshedEntity", "Lcom/kubi/user/model/LoginUserEntity;", "locateTargetAccount", "Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$LocatedAccount;", "handleKickOutFailure", "handleBusinessFailure", "exception", "Lcom/kubi/network/retrofit/exception/ApiException;", "targetAccount", "isCurrentAccount", "notifyAlternativeAccount", "target", "type", "Lcom/kubi/user/account/AccountChangeType;", "notifyTokenRefreshedIfNeeded", "showKickOutDialog", "validKickOutDialogHost", "Landroidx/fragment/app/FragmentActivity;", "activity", "Landroid/app/Activity;", "validKickOutDialogHost$UserCenterLib_googleRelease", "trackRefreshTokenEvent", "code", "logLifecycle", "message", "LocatedAccount", "RefreshCommitResult", "RefreshRateLimitKey", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTokenLifecycleRefreshExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenLifecycleRefreshExecutor.kt\ncom/kubi/user/token/TokenLifecycleRefreshExecutor\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n+ 5 KuEmitter.kt\ncom/kubi/router/emitter/KuEmitter\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 8 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 9 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,654:1\n116#2,8:655\n125#2,2:664\n1#3:663\n1#3:684\n57#4,8:666\n57#4,8:674\n16#5:682\n2756#6:683\n19#7,2:685\n35#8,4:687\n39#8:693\n44#9,2:691\n*S KotlinDebug\n*F\n+ 1 TokenLifecycleRefreshExecutor.kt\ncom/kubi/user/token/TokenLifecycleRefreshExecutor\n*L\n155#1:655,8\n155#1:664,2\n556#1:684\n349#1:666,8\n543#1:674,8\n556#1:682\n556#1:683\n575#1:685,2\n116#1:687,4\n116#1:693\n116#1:691,2\n*E\n"})
public final class TokenLifecycleRefreshExecutor {

    /* JADX INFO: renamed from: a */
    @org.jetbrains.annotations.NotNull
    public static final com.kubi.user.token.TokenLifecycleRefreshExecutor f53847a = null;

    /* JADX INFO: renamed from: b */
    @org.jetbrains.annotations.NotNull
    public static final java.util.Set<java.lang.String> f53848b = null;

    /* JADX INFO: renamed from: c */
    public static volatile long f53849c;

    /* JADX INFO: renamed from: d */
    public static volatile long f53850d;

    /* JADX INFO: renamed from: e */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object f53851e = null;

    /* JADX INFO: renamed from: f */
    @org.jetbrains.annotations.NotNull
    public static final com.kubi.user.token.C20161xe289c863 f53852f = null;

    /* JADX INFO: renamed from: g */
    @org.jetbrains.annotations.NotNull
    public static final rg0.InterfaceC34761a f53853g = null;

    /* JADX INFO: renamed from: h */
    @org.jetbrains.annotations.NotNull
    public static final kotlin.Lazy f53854h = null;

    /* JADX INFO: renamed from: i */
    @org.jetbrains.annotations.NotNull
    public static final kotlin.Lazy f53855i = null;

    static {
            com.kubi.user.token.TokenLifecycleRefreshExecutor r0 = new com.kubi.user.token.TokenLifecycleRefreshExecutor
            r0.<init>()
            com.kubi.user.token.TokenLifecycleRefreshExecutor.f53847a = r0
            java.lang.String r0 = "280001"
            java.lang.String r1 = "280010"
            java.lang.String r2 = "280003"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)
            com.kubi.user.token.TokenLifecycleRefreshExecutor.f53848b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.kubi.user.token.TokenLifecycleRefreshExecutor.f53851e = r0
            com.kubi.user.token.TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1 r0 = new com.kubi.user.token.TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1
            r0.<init>()
            com.kubi.user.token.TokenLifecycleRefreshExecutor.f53852f = r0
            r0 = 1
            r1 = 0
            r2 = 0
            rg0.a r0 = rg0.C34766f.m97144b(r2, r0, r1)
            com.kubi.user.token.TokenLifecycleRefreshExecutor.f53853g = r0
            com.kubi.user.token.b r0 = new com.kubi.user.token.b
            r0.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            com.kubi.user.token.TokenLifecycleRefreshExecutor.f53854h = r0
            com.kubi.user.token.c r0 = new com.kubi.user.token.c
            r0.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            com.kubi.user.token.TokenLifecycleRefreshExecutor.f53855i = r0
            return
    }

    public TokenLifecycleRefreshExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: F */
    public static final void m65834F() {
            com.kubi.user.token.TokenLifecycleRefreshExecutor r0 = com.kubi.user.token.TokenLifecycleRefreshExecutor.f53847a
            android.app.Activity r1 = com.blankj.utilcode.util.C3824a.m6125h()
            androidx.fragment.app.FragmentActivity r1 = r0.m65858J(r1)
            if (r1 != 0) goto L17
            java.lang.String r1 = "Kick-out dialog skipped: no lifecycle-safe FragmentActivity"
            r0.m65866s(r1)
            int r0 = com.kubi.user.R$string.login_kickout_notice_dialog_content_one
            com.kubi.utils.ToastCompat.m66465z(r0)
            return
        L17:
            int r0 = com.kubi.user.R$string.login_kickout_notice_dialog_content_one
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r2 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r3 = com.kubi.user.R$string.login_kickout_notice_dialog_content_two
            java.lang.String r3 = r1.getString(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            boolean r2 = r1 instanceof p569qq.InterfaceC34548f
            java.lang.String r4 = "B1login"
            if (r2 == 0) goto L3a
            r2 = r1
            qq.f r2 = (p569qq.InterfaceC34548f) r2
            java.lang.String r2 = r2.getPageId()
            if (r2 != 0) goto L3c
        L3a:
            r5 = r4
            goto L3d
        L3c:
            r5 = r2
        L3d:
            java.lang.String r6 = "loginOutTips"
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            p569qq.C34555m.m96595g(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.IllegalStateException -> L9a
            com.kubi.resources.dialog.AlertDialogFragmentHelper$Companion r2 = com.kubi.resources.dialog.AlertDialogFragmentHelper.f43512a1     // Catch: java.lang.IllegalStateException -> L9a
            com.kubi.resources.dialog.AlertDialogFragmentHelper r2 = r2.newInstanceAlert()     // Catch: java.lang.IllegalStateException -> L9a
            int r4 = com.kubi.user.R$string.login_kickout_notice_dialog_title     // Catch: java.lang.IllegalStateException -> L9a
            com.kubi.resources.dialog.AlertDialogFragmentHelper r2 = r2.m54167X4(r4)     // Catch: java.lang.IllegalStateException -> L9a
            android.text.SpannableString r4 = new android.text.SpannableString     // Catch: java.lang.IllegalStateException -> L9a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L9a
            r6.<init>()     // Catch: java.lang.IllegalStateException -> L9a
            r6.append(r0)     // Catch: java.lang.IllegalStateException -> L9a
            r0 = 10
            r6.append(r0)     // Catch: java.lang.IllegalStateException -> L9a
            r6.append(r3)     // Catch: java.lang.IllegalStateException -> L9a
            java.lang.String r0 = r6.toString()     // Catch: java.lang.IllegalStateException -> L9a
            r4.<init>(r0)     // Catch: java.lang.IllegalStateException -> L9a
            com.kubi.resources.dialog.AlertDialogFragmentHelper r0 = r2.m54154K4(r4)     // Catch: java.lang.IllegalStateException -> L9a
            r2 = 0
            com.kubi.resources.dialog.AlertDialogFragmentHelper r0 = r0.m54161R4(r2)     // Catch: java.lang.IllegalStateException -> L9a
            int r2 = com.kubi.user.R$string.confirm     // Catch: java.lang.IllegalStateException -> L9a
            com.kubi.user.token.g r3 = new com.kubi.user.token.g     // Catch: java.lang.IllegalStateException -> L9a
            r3.<init>(r5)     // Catch: java.lang.IllegalStateException -> L9a
            com.kubi.resources.dialog.AlertDialogFragmentHelper r0 = r0.m54162S4(r2, r3)     // Catch: java.lang.IllegalStateException -> L9a
            int r2 = com.kubi.user.R$string.login_kickout_notice_dialog_login_action     // Catch: java.lang.IllegalStateException -> L9a
            com.kubi.user.token.h r3 = new com.kubi.user.token.h     // Catch: java.lang.IllegalStateException -> L9a
            r3.<init>(r5)     // Catch: java.lang.IllegalStateException -> L9a
            com.kubi.resources.dialog.AlertDialogFragmentHelper r0 = r0.m54159P4(r2, r3)     // Catch: java.lang.IllegalStateException -> L9a
            androidx.fragment.app.FragmentManager r1 = r1.getSupportFragmentManager()     // Catch: java.lang.IllegalStateException -> L9a
            java.lang.String r2 = "getSupportFragmentManager(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.IllegalStateException -> L9a
            java.lang.String r2 = "loginOutTips"
            r0.show(r1, r2)     // Catch: java.lang.IllegalStateException -> L9a
            return
        L9a:
            r0 = move-exception
            java.lang.String r1 = "TokenLifecycle"
            java.lang.String r2 = "Kick-out dialog skipped: Activity state changed before show"
            ro.C34807b.m97262f(r1, r2, r0)
            int r0 = com.kubi.user.R$string.login_kickout_notice_dialog_content_one
            com.kubi.utils.ToastCompat.m66465z(r0)
            return
    }

    /* JADX INFO: renamed from: G */
    public static final void m65835G(java.lang.String r6, android.content.DialogInterface r7, int r8) {
            r7 = 0
            com.kubi.user.token.TokenLifecycleRefreshExecutor.f53849c = r7
            r4 = 8
            r5 = 0
            java.lang.String r1 = "loginOutTips"
            java.lang.String r2 = "1"
            r3 = 0
            r0 = r6
            p569qq.C34555m.m96595g(r0, r1, r2, r3, r4, r5)
            r6 = 3
            r7 = 0
            kotlinx.coroutines.m0 r0 = com.kubi.user.signup.SignupExtKt.m65735h(r7, r7, r6, r7)
            com.kubi.user.token.TokenLifecycleRefreshExecutor$showKickOutDialog$1$1$1 r3 = new com.kubi.user.token.TokenLifecycleRefreshExecutor$showKickOutDialog$1$1$1
            r3.<init>(r7)
            r4 = 3
            r1 = 0
            r2 = 0
            kotlinx.coroutines.C32542h.m91046d(r0, r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: H */
    public static final void m65836H(java.lang.String r20, android.content.DialogInterface r21, int r22) {
            r0 = 0
            com.kubi.user.token.TokenLifecycleRefreshExecutor.f53849c = r0
            r6 = 8
            r7 = 0
            java.lang.String r3 = "loginOutTips"
            java.lang.String r4 = "2"
            r5 = 0
            r2 = r20
            p569qq.C34555m.m96595g(r2, r3, r4, r5, r6, r7)
            f00.a r8 = f00.C28811a.f82764a
            r18 = 511(0x1ff, float:7.16E-43)
            r19 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            g00.p$a.m85181b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m65837a() {
            m65834F()
            return
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m65838b() {
            boolean r0 = m65848t()
            return r0
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m65839c(java.lang.String r0, android.content.DialogInterface r1, int r2) {
            m65836H(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m65840d(java.lang.String r0, com.kubi.user.token.TokenLifecycleRefreshExecutor$c r1) {
            boolean r0 = m65850y(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ com.kubi.user.token.TokenLifecycleRefreshExecutor$b m65841e(java.lang.String r0, java.lang.String r1, com.kubi.user.model.LoginUserEntity r2, boolean r3) {
            com.kubi.user.token.TokenLifecycleRefreshExecutor$b r0 = m65847l(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ com.kubi.user.token.InterfaceC20163a m65842f() {
            com.kubi.user.token.a r0 = m65851z()
            return r0
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m65843g(java.lang.String r0, android.content.DialogInterface r1, int r2) {
            m65835G(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ com.kubi.user.token.InterfaceC20163a m65844h(com.kubi.user.token.TokenLifecycleRefreshExecutor r0) {
            com.kubi.user.token.a r0 = r0.m65862o()
            return r0
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ java.lang.Object m65845i(com.kubi.user.token.TokenLifecycleRefreshExecutor r0, java.lang.String r1, com.kubi.kucoin.token.C11057k r2, java.lang.String r3, long r4, kotlin.coroutines.Continuation r6) {
            java.lang.Object r0 = r0.m65853B(r1, r2, r3, r4, r6)
            return r0
    }

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ java.lang.Object m65846j(com.kubi.user.token.TokenLifecycleRefreshExecutor r0, kotlin.jvm.functions.Function1 r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.m65854C(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: l */
    public static final com.kubi.user.token.TokenLifecycleRefreshExecutor$b m65847l(java.lang.String r8, java.lang.String r9, com.kubi.user.model.LoginUserEntity r10, boolean r11) {
            com.kubi.user.config.LoginInfoConfig r0 = com.kubi.user.config.LoginInfoConfig.a
            com.kubi.user.model.LoginUserEntity r0 = r0.y(r8, r9, r10)
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.String r8 = r0.token
            java.lang.String r8 = com.kubi.utils.extensions.C20318f.m66668h(r8)
            int r9 = r8.length()
            if (r9 <= 0) goto L16
            goto L17
        L16:
            r8 = r1
        L17:
            if (r8 != 0) goto L1a
            return r1
        L1a:
            com.kubi.user.token.TokenLifecycleRefreshExecutor$b r9 = new com.kubi.user.token.TokenLifecycleRefreshExecutor$b
            r10 = 1
            r9.<init>(r8, r10, r0)
            return r9
        L21:
            com.kubi.user.model.LoginUserEntity r0 = com.kubi.user.config.UserInfo.c()
            java.lang.String r0 = r0.id
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
            if (r2 == 0) goto L2e
            return r1
        L2e:
            if (r11 == 0) goto L37
            boolean r11 = kotlin.text.StringsKt.isBlank(r0)
            if (r11 == 0) goto L37
            return r1
        L37:
            a70.b r11 = a70.C0160b.f557a
            com.kubi.user.model.LoginUserEntity r8 = r11.m748n(r8, r9, r10)
            if (r8 == 0) goto L5e
            java.lang.String r8 = r8.token
            if (r8 == 0) goto L5e
            java.lang.String r8 = com.kubi.utils.extensions.C20318f.m66668h(r8)
            if (r8 == 0) goto L5e
            int r9 = r8.length()
            if (r9 <= 0) goto L51
            r3 = r8
            goto L52
        L51:
            r3 = r1
        L52:
            if (r3 == 0) goto L5e
            com.kubi.user.token.TokenLifecycleRefreshExecutor$b r2 = new com.kubi.user.token.TokenLifecycleRefreshExecutor$b
            r6 = 4
            r7 = 0
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L5e:
            return r1
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m65848t() {
            java.lang.String r0 = "platform_uc_notify_token_refresh"
            com.kubi.config.RemoteConfig r1 = com.kubi.config.RemoteConfig.f19636a     // Catch: java.lang.Throwable -> L17
            com.kubi.user.token.TokenLifecycleRefreshExecutor$d r1 = new com.kubi.user.token.TokenLifecycleRefreshExecutor$d     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.reflect.Type r1 = r1.getType()     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "object : TypeToken<T>() {}.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = com.kubi.config.RemoteConfig.m20457a(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L2b
        L17:
            r0 = move-exception
            r2 = r0
            com.kubi.config.exception.KCConfigException r1 = new com.kubi.config.exception.KCConfigException
            r6 = 8
            r7 = 0
            java.lang.String r3 = "RemoteConfig"
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0 = 2
            r2 = 0
            p569qq.C34549g.m96568c(r1, r2, r0, r2)
            r0 = r2
        L2b:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1 = 1
            boolean r0 = com.kubi.utils.extensions.C20302c.m66567e(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m65849x(com.kubi.user.token.TokenLifecycleRefreshExecutor r0, java.lang.String r1, java.lang.String r2, long r3, int r5, java.lang.Object r6) {
            r5 = r5 & 4
            if (r5 == 0) goto L8
            long r3 = android.os.SystemClock.elapsedRealtime()
        L8:
            r0.m65869w(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m65850y(java.lang.String r1, com.kubi.user.token.TokenLifecycleRefreshExecutor$c r2) {
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = r2.m65875a()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
            return r1
    }

    /* JADX INFO: renamed from: z */
    public static final com.kubi.user.token.InterfaceC20163a m65851z() {
            retrofit2.Retrofit r0 = mr.C33439a.m93388d()
            retrofit2.Retrofit$Builder r0 = r0.newBuilder()
            com.kubi.user.token.TokenLifecycleRefreshExecutor r1 = com.kubi.user.token.TokenLifecycleRefreshExecutor.f53847a
            okhttp3.OkHttpClient r2 = mr.C33439a.m93389e()
            okhttp3.OkHttpClient r1 = r1.m65860m(r2)
            retrofit2.Retrofit$Builder r0 = r0.client(r1)
            retrofit2.Retrofit r0 = r0.build()
            java.lang.Class<com.kubi.user.token.a> r1 = com.kubi.user.token.InterfaceC20163a.class
            java.lang.Object r0 = r0.create(r1)
            com.kubi.user.token.a r0 = (com.kubi.user.token.InterfaceC20163a) r0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: A */
    public final java.lang.Object m65852A(@org.jetbrains.annotations.NotNull java.lang.String r25, @org.jetbrains.annotations.NotNull com.kubi.kucoin.token.C11057k r26, @org.jetbrains.annotations.NotNull java.lang.String r27, long r28, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.kubi.kucoin.token.C11058l> r30) {
            r24 = this;
            r0 = r30
            boolean r1 = r0 instanceof com.kubi.user.token.TokenLifecycleRefreshExecutor$refreshToken$1
            if (r1 == 0) goto L18
            r1 = r0
            com.kubi.user.token.TokenLifecycleRefreshExecutor$refreshToken$1 r1 = (com.kubi.user.token.TokenLifecycleRefreshExecutor$refreshToken$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.label = r2
            r2 = r24
        L16:
            r9 = r1
            goto L20
        L18:
            com.kubi.user.token.TokenLifecycleRefreshExecutor$refreshToken$1 r1 = new com.kubi.user.token.TokenLifecycleRefreshExecutor$refreshToken$1
            r2 = r24
            r1.<init>(r2, r0)
            goto L16
        L20:
            java.lang.Object r0 = r9.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r9.label
            r4 = 0
            r5 = 2
            r6 = 1
            r10 = 0
            if (r3 == 0) goto L70
            if (r3 == r6) goto L52
            if (r3 != r5) goto L4a
            java.lang.Object r1 = r9.L$3
            rg0.a r1 = (rg0.InterfaceC34761a) r1
            java.lang.Object r3 = r9.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r9.L$1
            com.kubi.kucoin.token.k r3 = (com.kubi.kucoin.token.C11057k) r3
            java.lang.Object r3 = r9.L$0
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L47
            goto L109
        L47:
            r0 = move-exception
            goto L111
        L4a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L52:
            int r3 = r9.I$0
            long r6 = r9.J$0
            java.lang.Object r8 = r9.L$3
            rg0.a r8 = (rg0.InterfaceC34761a) r8
            java.lang.Object r11 = r9.L$2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r9.L$1
            com.kubi.kucoin.token.k r12 = (com.kubi.kucoin.token.C11057k) r12
            java.lang.Object r13 = r9.L$0
            java.lang.String r13 = (java.lang.String) r13
            kotlin.ResultKt.throwOnFailure(r0)
            r22 = r11
            r11 = r8
            r7 = r6
            r6 = r22
            goto L9c
        L70:
            kotlin.ResultKt.throwOnFailure(r0)
            rg0.a r0 = com.kubi.user.token.TokenLifecycleRefreshExecutor.f53853g
            r3 = r25
            r9.L$0 = r3
            r7 = r26
            r9.L$1 = r7
            r8 = r27
            r9.L$2 = r8
            r9.L$3 = r0
            r11 = r28
            r9.J$0 = r11
            r9.I$0 = r4
            r9.label = r6
            java.lang.Object r6 = r0.mo91344d(r10, r9)
            if (r6 != r1) goto L93
            goto L107
        L93:
            r13 = r3
            r3 = r4
            r6 = r8
            r22 = r11
            r11 = r0
            r12 = r7
            r7 = r22
        L9c:
            com.kubi.utils.k0 r0 = com.kubi.utils.C20335k0.f54342a     // Catch: java.lang.Throwable -> Ldd
            boolean r0 = r0.m66755e()     // Catch: java.lang.Throwable -> Ldd
            if (r0 != 0) goto Le0
            com.kubi.user.token.TokenLifecycleRefreshExecutor r0 = com.kubi.user.token.TokenLifecycleRefreshExecutor.f53847a     // Catch: java.lang.Throwable -> Ldd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd
            r1.<init>()     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r3 = "Refresh skipped: app is not in foreground, source="
            r1.append(r3)     // Catch: java.lang.Throwable -> Ldd
            r1.append(r6)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ldd
            r0.m65866s(r1)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r0 = r12.m33012c()     // Catch: java.lang.Throwable -> Ldd
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Ldd
            if (r1 <= 0) goto Lc6
            r14 = r0
            goto Lc7
        Lc6:
            r14 = r10
        Lc7:
            java.lang.String r16 = r12.m33011b()     // Catch: java.lang.Throwable -> Ldd
            com.kubi.kucoin.token.l r13 = new com.kubi.kucoin.token.l     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r15 = "noop"
            r20 = 56
            r21 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> Ldd
            goto L10d
        Ldd:
            r0 = move-exception
            r1 = r11
            goto L111
        Le0:
            com.kubi.user.token.TokenLifecycleRefreshExecutor r0 = com.kubi.user.token.TokenLifecycleRefreshExecutor.f53847a     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r14 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)     // Catch: java.lang.Throwable -> Ldd
            r9.L$0 = r14     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r14 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)     // Catch: java.lang.Throwable -> Ldd
            r9.L$1 = r14     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r14 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)     // Catch: java.lang.Throwable -> Ldd
            r9.L$2 = r14     // Catch: java.lang.Throwable -> Ldd
            r9.L$3 = r11     // Catch: java.lang.Throwable -> Ldd
            r9.J$0 = r7     // Catch: java.lang.Throwable -> Ldd
            r9.I$0 = r3     // Catch: java.lang.Throwable -> Ldd
            r9.I$1 = r4     // Catch: java.lang.Throwable -> Ldd
            r9.label = r5     // Catch: java.lang.Throwable -> Ldd
            r3 = r0
            r5 = r12
            r4 = r13
            java.lang.Object r0 = r3.m65853B(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> Ldd
            if (r0 != r1) goto L108
        L107:
            return r1
        L108:
            r1 = r11
        L109:
            r13 = r0
            com.kubi.kucoin.token.l r13 = (com.kubi.kucoin.token.C11058l) r13     // Catch: java.lang.Throwable -> L47
            r11 = r1
        L10d:
            r11.mo91345e(r10)
            return r13
        L111:
            r1.mo91345e(r10)
            throw r0
    }

    /* JADX INFO: renamed from: B */
    public final java.lang.Object m65853B(java.lang.String r30, com.kubi.kucoin.token.C11057k r31, java.lang.String r32, long r33, kotlin.coroutines.Continuation<? super com.kubi.kucoin.token.C11058l> r35) {
            r29 = this;
            r1 = r29
            r2 = r30
            r3 = r32
            r4 = r33
            r0 = r35
            boolean r6 = r0 instanceof com.kubi.user.token.TokenLifecycleRefreshExecutor$refreshTokenInternal$1
            if (r6 == 0) goto L1d
            r6 = r0
            com.kubi.user.token.TokenLifecycleRefreshExecutor$refreshTokenInternal$1 r6 = (com.kubi.user.token.TokenLifecycleRefreshExecutor$refreshTokenInternal$1) r6
            int r7 = r6.label
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L1d
            int r7 = r7 - r8
            r6.label = r7
            goto L22
        L1d:
            com.kubi.user.token.TokenLifecycleRefreshExecutor$refreshTokenInternal$1 r6 = new com.kubi.user.token.TokenLifecycleRefreshExecutor$refreshTokenInternal$1
            r6.<init>(r1, r0)
        L22:
            java.lang.Object r0 = r6.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r8 = r6.label
            r9 = 2
            r12 = 1
            if (r8 == 0) goto Lab
            if (r8 == r12) goto L7d
            if (r8 != r9) goto L75
            int r2 = r6.I$0
            boolean r3 = r6.Z$0
            java.lang.Object r4 = r6.L$7
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r4 = r6.L$6
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r6.L$5
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r7 = r6.L$4
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r6.L$3
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r6.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r13 = r6.L$1
            com.kubi.kucoin.token.k r13 = (com.kubi.kucoin.token.C11057k) r13
            java.lang.Object r6 = r6.L$0
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L62 java.util.concurrent.CancellationException -> L67 com.kubi.network.retrofit.exception.ApiException -> L6a
            r12 = r2
            r13 = r3
            r2 = r6
            r3 = r8
            r8 = r7
            r7 = r4
            r4 = r1
            goto L236
        L62:
            r0 = move-exception
            r8 = r4
        L64:
            r4 = 0
            goto L2fb
        L67:
            r0 = move-exception
            goto L343
        L6a:
            r0 = move-exception
            r12 = r2
            r13 = r3
            r14 = r5
            r2 = r6
            r15 = r7
            r3 = r8
            r8 = r4
        L72:
            r4 = 0
            goto L346
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L7d:
            int r2 = r6.I$0
            boolean r3 = r6.Z$0
            java.lang.Object r4 = r6.L$7
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r4 = r6.L$6
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r6.L$5
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r7 = r6.L$4
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r6.L$3
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r6.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r13 = r6.L$1
            com.kubi.kucoin.token.k r13 = (com.kubi.kucoin.token.C11057k) r13
            java.lang.Object r6 = r6.L$0
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L62 java.util.concurrent.CancellationException -> L67 com.kubi.network.retrofit.exception.ApiException -> L6a
            r13 = r3
            r3 = r8
            r11 = r12
            r12 = r2
            r2 = r6
            goto L1ce
        Lab:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.String r8 = r31.m33010a()
            boolean r13 = r31.m33015f()
            java.lang.String r0 = r31.m33013d()
            java.lang.String r14 = r31.m33012c()
            java.lang.String r18 = r31.m33011b()
            java.lang.Long r15 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            long r16 = r15.longValue()
            java.lang.String r11 = "manual"
            boolean r19 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r11)
            r20 = 0
            if (r19 == 0) goto Ld9
            int r16 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r16 <= 0) goto Ld9
            goto Lda
        Ld9:
            r15 = 0
        Lda:
            if (r15 == 0) goto Le2
            long r15 = r15.longValue()
            r9 = r15
            goto Le4
        Le2:
            r9 = r20
        Le4:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r12 = "Refresh executor accepted immutable account context, isCurrentAccount="
            r15.append(r12)
            r15.append(r13)
            java.lang.String r12 = ", source="
            r15.append(r12)
            r15.append(r3)
            java.lang.String r12 = ", refreshTimeLimit="
            r15.append(r12)
            r15.append(r9)
            r22 = r7
            java.lang.String r7 = ", triggerPath="
            r15.append(r7)
            r15.append(r2)
            java.lang.String r7 = r15.toString()
            r1.m65866s(r7)
            boolean r7 = r1.m65855D(r8, r14, r9)
            if (r7 == 0) goto L14f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Refresh skipped: minimum interval has not elapsed, source="
            r0.append(r2)
            r0.append(r3)
            r0.append(r12)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r1.m65866s(r0)
            int r0 = r14.length()
            if (r0 <= 0) goto L13b
            r16 = r14
            goto L13d
        L13b:
            r16 = 0
        L13d:
            com.kubi.kucoin.token.l r15 = new com.kubi.kucoin.token.l
            r22 = 56
            r23 = 0
            java.lang.String r17 = "noop"
            r19 = 0
            r20 = 0
            r21 = 0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            return r15
        L14f:
            boolean r7 = kotlin.text.StringsKt.isBlank(r0)
            if (r7 == 0) goto L16e
            java.lang.String r0 = "Refresh aborted: local refresh token is empty; request not sent"
            r1.m65866s(r0)
            com.kubi.kucoin.token.l r15 = new com.kubi.kucoin.token.l
            r22 = 48
            r23 = 0
            r16 = 0
            java.lang.String r17 = "failed"
            java.lang.String r19 = "280003"
            r20 = 0
            r21 = 0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            return r15
        L16e:
            r7 = r18
            long r23 = r31.m33014e()
            int r12 = (r23 > r20 ? 1 : (r23 == r20 ? 0 : -1))
            if (r12 <= 0) goto L186
            long r20 = r31.m33014e()
            long r23 = java.lang.System.currentTimeMillis()
            int r12 = (r20 > r23 ? 1 : (r20 == r23 ? 0 : -1))
            if (r12 > 0) goto L186
            r12 = 1
            goto L187
        L186:
            r12 = 0
        L187:
            com.kubi.user.utils.d0 r15 = com.kubi.user.utils.d0.a
            r15.e(r3, r2)
            com.kubi.user.token.TokenLifecycleRefreshExecutor$refreshTokenInternal$requestRefreshToken$1 r15 = new com.kubi.user.token.TokenLifecycleRefreshExecutor$refreshTokenInternal$requestRefreshToken$1     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2f9 com.kubi.network.retrofit.exception.ApiException -> L344
            r1 = 0
            r15.<init>(r14, r0, r1)     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r11)     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            if (r1 == 0) goto L201
            r6.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r31)     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            r6.L$1 = r1     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            r6.L$2 = r3     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            r6.L$3 = r8     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            r6.L$4 = r0     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            r6.L$5 = r14     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            r6.L$6 = r7     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            r6.L$7 = r0     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            r6.J$0 = r4     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            r6.Z$0 = r13     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            r6.J$1 = r9     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            r6.I$0 = r12     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1fb com.kubi.network.retrofit.exception.ApiException -> L1fe
            r11 = 1
            r6.label = r11     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1ee com.kubi.network.retrofit.exception.ApiException -> L1f3
            java.lang.Object r0 = r15.invoke(r6)     // Catch: java.util.concurrent.CancellationException -> L1e1 java.lang.Throwable -> L1ee com.kubi.network.retrofit.exception.ApiException -> L1f3
            r1 = r22
            if (r0 != r1) goto L1cb
            r4 = r29
            goto L234
        L1cb:
            r4 = r7
            r7 = r8
            r5 = r14
        L1ce:
            com.kubi.user.model.LoginUserEntity r0 = (com.kubi.user.model.LoginUserEntity) r0     // Catch: java.lang.Throwable -> L1da java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1e6
            r8 = r2
            r23 = r4
            r2 = r7
            r4 = r29
        L1d6:
            r9 = r3
            r10 = r5
            goto L23e
        L1da:
            r0 = move-exception
            r1 = r29
            r8 = r4
        L1de:
            r2 = r12
            goto L64
        L1e1:
            r0 = move-exception
            r1 = r29
            goto L343
        L1e6:
            r0 = move-exception
            r1 = r29
            r8 = r4
            r14 = r5
            r15 = r7
            goto L72
        L1ee:
            r0 = move-exception
        L1ef:
            r1 = r29
            r8 = r7
            goto L1de
        L1f3:
            r0 = move-exception
        L1f4:
            r4 = 0
            r1 = r29
        L1f7:
            r15 = r8
            r8 = r7
            goto L346
        L1fb:
            r0 = move-exception
            r11 = 1
            goto L1ef
        L1fe:
            r0 = move-exception
            r11 = 1
            goto L1f4
        L201:
            r1 = r22
            r11 = 1
            r6.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r31)     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            r6.L$1 = r11     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            r6.L$2 = r3     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            r6.L$3 = r8     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            r6.L$4 = r0     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            r6.L$5 = r14     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            r6.L$6 = r7     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            r6.L$7 = r0     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            r6.J$0 = r4     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            r6.Z$0 = r13     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            r6.J$1 = r9     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            r6.I$0 = r12     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            r4 = 2
            r6.label = r4     // Catch: java.util.concurrent.CancellationException -> L1e1 com.kubi.network.retrofit.exception.ApiException -> L1f3 java.lang.Throwable -> L2f5
            r0 = r15
            r4 = r29
            java.lang.Object r0 = r4.m65854C(r0, r6)     // Catch: java.util.concurrent.CancellationException -> L267 java.lang.Throwable -> L2e4 com.kubi.network.retrofit.exception.ApiException -> L2f0
            if (r0 != r1) goto L235
        L234:
            return r1
        L235:
            r5 = r14
        L236:
            com.kubi.user.model.LoginUserEntity r0 = (com.kubi.user.model.LoginUserEntity) r0     // Catch: java.util.concurrent.CancellationException -> L267 java.lang.Throwable -> L2e4 com.kubi.network.retrofit.exception.ApiException -> L2ea
            r9 = r8
            r8 = r2
            r2 = r9
            r23 = r7
            goto L1d6
        L23e:
            com.kubi.user.token.TokenLifecycleRefreshExecutor$b r0 = r4.m65859k(r2, r10, r13, r0)     // Catch: java.util.concurrent.CancellationException -> L267 java.lang.Throwable -> L2de com.kubi.network.retrofit.exception.ApiException -> L2e1
            if (r0 != 0) goto L275
            java.lang.String r0 = "Refresh result discarded: account or token changed during refresh"
            r4.m65866s(r0)     // Catch: java.lang.Throwable -> L260 java.util.concurrent.CancellationException -> L267 com.kubi.network.retrofit.exception.ApiException -> L26b
            com.kubi.kucoin.token.l r20 = new com.kubi.kucoin.token.l     // Catch: java.lang.Throwable -> L260 java.util.concurrent.CancellationException -> L267 com.kubi.network.retrofit.exception.ApiException -> L26b
            java.lang.String r22 = "failed"
            java.lang.String r24 = "network_error"
            if (r12 == 0) goto L253
            r0 = 1
            goto L254
        L253:
            r0 = 0
        L254:
            java.lang.Boolean r25 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)     // Catch: java.lang.Throwable -> L260 java.util.concurrent.CancellationException -> L267 com.kubi.network.retrofit.exception.ApiException -> L26b
            r26 = 1
            r21 = 0
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> L260 java.util.concurrent.CancellationException -> L267 com.kubi.network.retrofit.exception.ApiException -> L26b
            return r20
        L260:
            r0 = move-exception
            r1 = r4
            r2 = r12
            r8 = r23
            goto L64
        L267:
            r0 = move-exception
            r1 = r4
            goto L343
        L26b:
            r0 = move-exception
            r15 = r2
            r1 = r4
            r2 = r8
            r3 = r9
            r14 = r10
            r8 = r23
            goto L72
        L275:
            com.kubi.user.model.LoginUserEntity r1 = r0.m65873b()     // Catch: java.util.concurrent.CancellationException -> L267 java.lang.Throwable -> L2de com.kubi.network.retrofit.exception.ApiException -> L2e1
            if (r1 == 0) goto L281
            com.kubi.user.config.LoginInfoConfig r3 = com.kubi.user.config.LoginInfoConfig.a     // Catch: java.lang.Throwable -> L260 java.util.concurrent.CancellationException -> L267 com.kubi.network.retrofit.exception.ApiException -> L26b
            r5 = 0
            r3.B(r1, r5)     // Catch: java.lang.Throwable -> L260 java.util.concurrent.CancellationException -> L267 com.kubi.network.retrofit.exception.ApiException -> L26b
        L281:
            java.lang.String r3 = r0.m65872a()     // Catch: java.util.concurrent.CancellationException -> L267 java.lang.Throwable -> L2de com.kubi.network.retrofit.exception.ApiException -> L2e1
            r6 = 4
            r7 = 0
            r4 = 0
            r1 = r29
            m65849x(r1, r2, r3, r4, r6, r7)     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2d8 com.kubi.network.retrofit.exception.ApiException -> L2db
            r4 = 0
            r1.m65857I(r4)     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2ca com.kubi.network.retrofit.exception.ApiException -> L2cf
            r1.m65868v()     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2ca com.kubi.network.retrofit.exception.ApiException -> L2cf
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2ca com.kubi.network.retrofit.exception.ApiException -> L2cf
            r3.<init>()     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2ca com.kubi.network.retrofit.exception.ApiException -> L2cf
            java.lang.String r5 = "Refresh succeeded, isCurrentAccount="
            r3.append(r5)     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2ca com.kubi.network.retrofit.exception.ApiException -> L2cf
            boolean r5 = r0.m65874c()     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2ca com.kubi.network.retrofit.exception.ApiException -> L2cf
            r3.append(r5)     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2ca com.kubi.network.retrofit.exception.ApiException -> L2cf
            java.lang.String r3 = r3.toString()     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2ca com.kubi.network.retrofit.exception.ApiException -> L2cf
            r1.m65866s(r3)     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2ca com.kubi.network.retrofit.exception.ApiException -> L2cf
            java.lang.String r21 = r0.m65872a()     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2ca com.kubi.network.retrofit.exception.ApiException -> L2cf
            com.kubi.kucoin.token.l r20 = new com.kubi.kucoin.token.l     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2ca com.kubi.network.retrofit.exception.ApiException -> L2cf
            java.lang.String r22 = "success"
            if (r12 == 0) goto L2b9
            r5 = 1
            goto L2ba
        L2b9:
            r5 = r4
        L2ba:
            java.lang.Boolean r25 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2ca com.kubi.network.retrofit.exception.ApiException -> L2cf
            r27 = 8
            r28 = 0
            r24 = 0
            r26 = 1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)     // Catch: java.util.concurrent.CancellationException -> L67 java.lang.Throwable -> L2ca com.kubi.network.retrofit.exception.ApiException -> L2cf
            return r20
        L2ca:
            r0 = move-exception
        L2cb:
            r2 = r12
            r8 = r23
            goto L2fb
        L2cf:
            r0 = move-exception
        L2d0:
            r15 = r2
            r2 = r8
            r3 = r9
            r14 = r10
            r8 = r23
            goto L346
        L2d8:
            r0 = move-exception
        L2d9:
            r4 = 0
            goto L2cb
        L2db:
            r0 = move-exception
        L2dc:
            r4 = 0
            goto L2d0
        L2de:
            r0 = move-exception
            r1 = r4
            goto L2d9
        L2e1:
            r0 = move-exception
            r1 = r4
            goto L2dc
        L2e4:
            r0 = move-exception
            r1 = r4
        L2e6:
            r4 = 0
            r8 = r7
            r2 = r12
            goto L2fb
        L2ea:
            r0 = move-exception
            r1 = r4
            r4 = 0
            r14 = r5
            goto L1f7
        L2f0:
            r0 = move-exception
            r1 = r4
        L2f2:
            r4 = 0
            goto L1f7
        L2f5:
            r0 = move-exception
            r1 = r29
            goto L2e6
        L2f9:
            r0 = move-exception
            goto L2e6
        L2fb:
            com.kubi.kucoin.token.l r5 = new com.kubi.kucoin.token.l
            if (r2 == 0) goto L301
            r11 = 1
            goto L302
        L301:
            r11 = r4
        L302:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r11)
            r11 = 1
            r6 = 0
            java.lang.String r7 = "failed"
            java.lang.String r9 = "network_error"
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.String r2 = "TokenLifecycle"
            java.lang.String r3 = "refresh failed"
            ro.C34807b.m97262f(r2, r3, r0)
            boolean r2 = p481ny.C33737b.m94075e(r0)
            if (r2 != 0) goto L3e5
            boolean r2 = d70.C28146a.m81970a(r0)
            java.lang.String r22 = "TokenLifecycle"
            if (r2 == 0) goto L33c
            com.kubi.user.exception.UserCenterException r20 = new com.kubi.user.exception.UserCenterException
            r25 = 8
            r26 = 0
            r23 = 1
            r24 = 0
            r21 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r0 = r20
            r2 = 0
            r15 = 2
            p569qq.C34549g.m96568c(r0, r2, r15, r2)
            goto L3e5
        L33c:
            r2 = r22
            d70.C28146a.m81971b(r0, r2)
            goto L3e5
        L343:
            throw r0
        L344:
            r0 = move-exception
            goto L2f2
        L346:
            java.util.Set<java.lang.String> r5 = com.kubi.user.token.TokenLifecycleRefreshExecutor.f53848b
            java.lang.String r6 = r0.code
            boolean r6 = r5.contains(r6)
            java.lang.String r7 = "500036"
            if (r6 == 0) goto L357
            java.lang.String r6 = "280003"
        L354:
            r9 = r6
            r6 = r5
            goto L365
        L357:
            java.lang.String r6 = r0.code
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 == 0) goto L362
            r6 = r5
            r9 = r7
            goto L365
        L362:
            java.lang.String r6 = "network_error"
            goto L354
        L365:
            com.kubi.kucoin.token.l r5 = new com.kubi.kucoin.token.l
            if (r12 == 0) goto L36b
            r11 = 1
            goto L36c
        L36b:
            r11 = r4
        L36c:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r11)
            r11 = 1
            r4 = r6
            r6 = 0
            r12 = r7
            java.lang.String r7 = "failed"
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.String r6 = r0.code
            boolean r4 = r4.contains(r6)
            java.lang.String r6 = "Refresh failed with business error code="
            if (r4 == 0) goto L39d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r0 = r0.code
            r2.append(r0)
            java.lang.String r0 = "; handled by NetBusinessErrorReceiver"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.m65866s(r0)
            return r5
        L39d:
            java.lang.String r4 = r0.code
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r12)
            if (r4 == 0) goto L3a9
            r1.m65864q(r15, r14, r13)
            goto L3e5
        L3a9:
            java.lang.String r4 = "401"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r4 == 0) goto L3c9
            com.kubi.user.token.TokenLifecycleRefreshExecutor$a r3 = r1.m65865r(r15, r14, r13)
            if (r3 == 0) goto L3c3
            com.kubi.user.model.LoginUserEntity r4 = r3.m65870a()
            boolean r3 = r3.m65871b()
            r1.m65863p(r0, r4, r3, r2)
            goto L3e5
        L3c3:
            java.lang.String r0 = "Refresh error ignored: account or token changed during refresh"
            r1.m65866s(r0)
            goto L3e5
        L3c9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r0 = r0.code
            r2.append(r0)
            java.lang.String r0 = "; business failure side effect skipped for source="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r1.m65866s(r0)
        L3e5:
            return r5
    }

    /* JADX INFO: renamed from: C */
    public final <T> java.lang.Object m65854C(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r12, kotlin.coroutines.Continuation<? super T> r13) {
            r11 = this;
            r0 = 1
            r1 = 2
            boolean r2 = r13 instanceof com.kubi.user.token.TokenLifecycleRefreshExecutor$retryNetworkException$1
            if (r2 == 0) goto L15
            r2 = r13
            com.kubi.user.token.TokenLifecycleRefreshExecutor$retryNetworkException$1 r2 = (com.kubi.user.token.TokenLifecycleRefreshExecutor$retryNetworkException$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.label = r3
            goto L1a
        L15:
            com.kubi.user.token.TokenLifecycleRefreshExecutor$retryNetworkException$1 r2 = new com.kubi.user.token.TokenLifecycleRefreshExecutor$retryNetworkException$1
            r2.<init>(r11, r13)
        L1a:
            java.lang.Object r13 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            if (r4 == 0) goto L50
            if (r4 == r0) goto L40
            if (r4 != r1) goto L38
            int r12 = r2.I$0
            java.lang.Object r4 = r2.L$1
            java.lang.Exception r4 = (java.lang.Exception) r4
            java.lang.Object r4 = r2.L$0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
        L36:
            r12 = r4
            goto L54
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L40:
            int r12 = r2.I$0
            java.lang.Object r4 = r2.L$0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L4c com.kubi.network.retrofit.exception.ApiException -> L4e
            return r13
        L4a:
            r13 = move-exception
            goto L6a
        L4c:
            r12 = move-exception
            goto Lb5
        L4e:
            r12 = move-exception
            goto Lb6
        L50:
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = 0
        L54:
            r2.L$0 = r12     // Catch: java.util.concurrent.CancellationException -> L4c com.kubi.network.retrofit.exception.ApiException -> L4e java.lang.Exception -> L65
            r4 = 0
            r2.L$1 = r4     // Catch: java.util.concurrent.CancellationException -> L4c com.kubi.network.retrofit.exception.ApiException -> L4e java.lang.Exception -> L65
            r2.I$0 = r13     // Catch: java.util.concurrent.CancellationException -> L4c com.kubi.network.retrofit.exception.ApiException -> L4e java.lang.Exception -> L65
            r2.label = r0     // Catch: java.util.concurrent.CancellationException -> L4c com.kubi.network.retrofit.exception.ApiException -> L4e java.lang.Exception -> L65
            java.lang.Object r12 = r12.invoke(r2)     // Catch: java.util.concurrent.CancellationException -> L4c com.kubi.network.retrofit.exception.ApiException -> L4e java.lang.Exception -> L65
            if (r12 != r3) goto L64
            goto Lb1
        L64:
            return r12
        L65:
            r4 = move-exception
            r10 = r4
            r4 = r12
            r12 = r13
            r13 = r10
        L6a:
            r5 = 3
            if (r12 >= r5) goto Lb4
            int r5 = r12 + 1
            int r12 = r12 + r1
            long r6 = (long) r12
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r8 = "Refresh network exception; retry "
            r12.append(r8)
            r12.append(r5)
            java.lang.String r8 = " starts in "
            r12.append(r8)
            r12.append(r6)
            java.lang.String r8 = "ms"
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            r11.m65866s(r12)
            kotlin.time.Duration$Companion r12 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r12 = kotlin.time.DurationUnit.MILLISECONDS
            long r8 = kotlin.time.DurationKt.toDuration(r6, r12)
            r2.L$0 = r4
            java.lang.Object r12 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r2.L$1 = r12
            r2.I$0 = r5
            r2.J$0 = r6
            r2.label = r1
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.m90351c(r8, r2)
            if (r12 != r3) goto Lb2
        Lb1:
            return r3
        Lb2:
            r13 = r5
            goto L36
        Lb4:
            throw r13
        Lb5:
            throw r12
        Lb6:
            throw r12
    }

    /* JADX INFO: renamed from: D */
    public final boolean m65855D(java.lang.String r7, java.lang.String r8, long r9) {
            r6 = this;
            boolean r0 = kotlin.text.StringsKt.isBlank(r7)
            r1 = 0
            if (r0 != 0) goto L3e
            boolean r0 = kotlin.text.StringsKt.isBlank(r8)
            if (r0 != 0) goto L3e
            r2 = 0
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 > 0) goto L14
            goto L3e
        L14:
            java.lang.Object r0 = com.kubi.user.token.TokenLifecycleRefreshExecutor.f53851e
            monitor-enter(r0)
            com.kubi.user.token.TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1 r4 = com.kubi.user.token.TokenLifecycleRefreshExecutor.f53852f     // Catch: java.lang.Throwable -> L3b
            com.kubi.user.token.TokenLifecycleRefreshExecutor$c r5 = new com.kubi.user.token.TokenLifecycleRefreshExecutor$c     // Catch: java.lang.Throwable -> L3b
            r5.<init>(r7, r8)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r7 = r4.get(r5)     // Catch: java.lang.Throwable -> L3b
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)
            if (r7 == 0) goto L3a
            long r7 = r7.longValue()
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r7
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L3a
            int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r7 >= 0) goto L3a
            r7 = 1
            return r7
        L3a:
            return r1
        L3b:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L3e:
            return r1
    }

    /* JADX INFO: renamed from: E */
    public final void m65856E() {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = com.kubi.user.token.TokenLifecycleRefreshExecutor.f53849c
            long r2 = r0 - r2
            r4 = 300000(0x493e0, double:1.482197E-318)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L10
            return
        L10:
            com.kubi.user.token.TokenLifecycleRefreshExecutor.f53849c = r0
            com.kubi.user.token.f r0 = new com.kubi.user.token.f
            r0.<init>()
            java.util.concurrent.Executor r1 = o00.C33755g.m94139e()
            r1.execute(r0)
            return
    }

    /* JADX INFO: renamed from: I */
    public final void m65857I(int r2) {
            r1 = this;
            com.kubi.sdk.constant.monitor.KunlunBusinessEventEnum r0 = com.kubi.sdk.constant.monitor.KunlunBusinessEventEnum.REFRESH_TOKEN_RESULT
            p569qq.C34550h.m96572a(r0, r2)
            return
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: J */
    public final androidx.fragment.app.FragmentActivity m65858J(@org.jetbrains.annotations.Nullable android.app.Activity r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.fragment.app.FragmentActivity
            r1 = 0
            if (r0 == 0) goto L8
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 != 0) goto Lc
            return r1
        Lc:
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L24
            boolean r0 = r3.isDestroyed()
            if (r0 != 0) goto L24
            androidx.fragment.app.FragmentManager r0 = r3.getSupportFragmentManager()
            boolean r0 = r0.isStateSaved()
            if (r0 == 0) goto L23
            goto L24
        L23:
            return r3
        L24:
            return r1
    }

    /* JADX INFO: renamed from: k */
    public final com.kubi.user.token.TokenLifecycleRefreshExecutor$b m65859k(java.lang.String r3, java.lang.String r4, boolean r5, com.kubi.user.model.LoginUserEntity r6) {
            r2 = this;
            a70.b r0 = a70.C0160b.f557a
            com.kubi.user.token.e r1 = new com.kubi.user.token.e
            r1.<init>(r3, r4, r6, r5)
            java.lang.Object r3 = r0.m749o(r1)
            com.kubi.user.token.TokenLifecycleRefreshExecutor$b r3 = (com.kubi.user.token.TokenLifecycleRefreshExecutor$b) r3
            return r3
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: m */
    public final okhttp3.OkHttpClient m65860m(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient r2) {
            r1 = this;
            java.lang.String r0 = "baseClient"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.OkHttpClient$Builder r2 = r2.newBuilder()
            okhttp3.Dispatcher r0 = new okhttp3.Dispatcher
            r0.<init>()
            okhttp3.OkHttpClient$Builder r2 = r2.dispatcher(r0)
            okhttp3.OkHttpClient r2 = r2.build()
            return r2
    }

    /* JADX INFO: renamed from: n */
    public final boolean m65861n() {
            r1 = this;
            kotlin.Lazy r0 = com.kubi.user.token.TokenLifecycleRefreshExecutor.f53854h
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    /* JADX INFO: renamed from: o */
    public final com.kubi.user.token.InterfaceC20163a m65862o() {
            r1 = this;
            kotlin.Lazy r0 = com.kubi.user.token.TokenLifecycleRefreshExecutor.f53855i
            java.lang.Object r0 = r0.getValue()
            com.kubi.user.token.a r0 = (com.kubi.user.token.InterfaceC20163a) r0
            return r0
    }

    /* JADX INFO: renamed from: p */
    public final void m65863p(com.kubi.network.retrofit.exception.ApiException r8, com.kubi.user.model.LoginUserEntity r9, boolean r10, java.lang.String r11) {
            r7 = this;
            if (r10 == 0) goto L9
            com.kubi.user.config.LoginInfoConfig r9 = com.kubi.user.config.LoginInfoConfig.a
            r10 = 0
            r9.O(r10)
            goto Le
        L9:
            com.kubi.user.account.AccountChangeType r10 = com.kubi.user.account.AccountChangeType.TYPE_280003
            r7.m65867u(r9, r10)
        Le:
            java.lang.String r9 = r8.code
            java.lang.String r10 = "code"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            java.lang.Integer r9 = kotlin.text.StringsKt.toIntOrNull(r9)
            if (r9 == 0) goto L20
            int r9 = r9.intValue()
            goto L21
        L20:
            r9 = -1
        L21:
            r7.m65857I(r9)
            com.kubi.user.exception.RefreshTokenException r1 = new com.kubi.user.exception.RefreshTokenException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "续期失败,业务错误码="
            r9.append(r10)
            java.lang.String r10 = r8.code
            r9.append(r10)
            java.lang.String r10 = "，原因="
            r9.append(r10)
            java.lang.String r10 = r8.getMessage()
            r9.append(r10)
            java.lang.String r10 = ",url="
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r10 = 0
            r11 = 2
            r1.<init>(r9, r10, r11, r10)
            boolean r9 = p481ny.C33737b.m94075e(r1)
            if (r9 != 0) goto L71
            boolean r9 = d70.C28146a.m81970a(r1)
            java.lang.String r2 = "refresh_token"
            if (r9 == 0) goto L6e
            com.kubi.user.exception.UserCenterException r0 = new com.kubi.user.exception.UserCenterException
            r5 = 8
            r6 = 0
            r3 = 1
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            p569qq.C34549g.m96568c(r0, r10, r11, r10)
            goto L71
        L6e:
            d70.C28146a.m81971b(r1, r2)
        L71:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Refresh failed with business error code="
            r9.append(r10)
            java.lang.String r8 = r8.code
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.m65866s(r8)
            return
    }

    /* JADX INFO: renamed from: q */
    public final void m65864q(java.lang.String r3, java.lang.String r4, boolean r5) {
            r2 = this;
            com.kubi.user.config.LoginInfoConfig r0 = com.kubi.user.config.LoginInfoConfig.a
            r1 = 0
            boolean r0 = r0.P(r3, r4, r1)
            if (r0 == 0) goto Ld
            r2.m65856E()
            return
        Ld:
            com.kubi.user.token.TokenLifecycleRefreshExecutor$a r3 = r2.m65865r(r3, r4, r5)
            if (r3 == 0) goto L23
            boolean r4 = r3.m65871b()
            if (r4 != 0) goto L23
            com.kubi.user.model.LoginUserEntity r3 = r3.m65870a()
            com.kubi.user.account.AccountChangeType r4 = com.kubi.user.account.AccountChangeType.TYPE_500036
            r2.m65867u(r3, r4)
            return
        L23:
            java.lang.String r3 = "500036 side effect ignored: target session changed before conditional logout"
            r2.m65866s(r3)
            return
    }

    /* JADX INFO: renamed from: r */
    public final com.kubi.user.token.TokenLifecycleRefreshExecutor$a m65865r(java.lang.String r4, java.lang.String r5, boolean r6) {
            r3 = this;
            com.kubi.user.model.LoginUserEntity r0 = com.kubi.user.config.UserInfo.c()
            java.lang.String r1 = r0.id
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r2 = 0
            if (r1 == 0) goto L25
            java.lang.String r4 = r0.token
            java.lang.String r4 = com.kubi.utils.extensions.C20318f.m66668h(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L1a
            goto L1b
        L1a:
            r0 = r2
        L1b:
            if (r0 == 0) goto L24
            com.kubi.user.token.TokenLifecycleRefreshExecutor$a r4 = new com.kubi.user.token.TokenLifecycleRefreshExecutor$a
            r5 = 1
            r4.<init>(r0, r5)
            return r4
        L24:
            return r2
        L25:
            if (r6 == 0) goto L30
            java.lang.String r6 = r0.id
            boolean r6 = kotlin.text.StringsKt.isBlank(r6)
            if (r6 == 0) goto L30
            return r2
        L30:
            a70.b r6 = a70.C0160b.f557a
            com.kubi.user.model.LoginUserEntity r4 = r6.m736b(r4)
            if (r4 == 0) goto L4f
            java.lang.String r6 = r4.token
            java.lang.String r6 = com.kubi.utils.extensions.C20318f.m66668h(r6)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r5)
            if (r5 == 0) goto L45
            goto L46
        L45:
            r4 = r2
        L46:
            if (r4 == 0) goto L4f
            com.kubi.user.token.TokenLifecycleRefreshExecutor$a r5 = new com.kubi.user.token.TokenLifecycleRefreshExecutor$a
            r6 = 0
            r5.<init>(r4, r6)
            return r5
        L4f:
            return r2
    }

    /* JADX INFO: renamed from: s */
    public final void m65866s(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "TokenLifecycle"
            ro.C34807b.m97261e(r0, r2)
            return
    }

    /* JADX INFO: renamed from: u */
    public final void m65867u(com.kubi.user.model.LoginUserEntity r4, com.kubi.user.account.AccountChangeType r5) {
            r3 = this;
            java.lang.String r4 = r4.id
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim(r4)
            java.lang.String r4 = r4.toString()
            int r0 = r4.length()
            if (r0 != 0) goto L11
            return
        L11:
            xx.a r0 = p777xx.C36969a.f103912a
            com.kubi.router.core.Router r0 = com.kubi.router.core.Router.f46192a
            java.lang.Class<a70.a> r1 = a70.InterfaceC0159a.class
            java.util.List r0 = r0.m56190l(r1)
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            a70.a r1 = (a70.InterfaceC0159a) r1
            com.kubi.user.account.AccountChange r2 = new com.kubi.user.account.AccountChange
            r2.<init>(r4, r5)
            r1.invoke(r2)
            goto L1f
        L34:
            return
    }

    /* JADX INFO: renamed from: v */
    public final void m65868v() {
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            boolean r2 = r9.m65861n()
            if (r2 == 0) goto L20
            long r2 = com.kubi.user.token.TokenLifecycleRefreshExecutor.f53850d
            long r2 = r0 - r2
            r4 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L20
            com.kubi.user.token.TokenLifecycleRefreshExecutor.f53850d = r0
            r7 = 6
            r8 = 0
            java.lang.String r3 = "com.kubi.user.event.UserEvent:onTokenRefresh"
            r4 = 0
            r5 = 0
            com.kubi.event.api.C8630a.m23695d(r3, r4, r5, r7, r8)
        L20:
            return
    }

    /* JADX INFO: renamed from: w */
    public final void m65869w(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, long r7) {
            r4 = this;
            java.lang.String r0 = "accountId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "accessToken"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.CharSequence r5 = kotlin.text.StringsKt.trim(r5)
            java.lang.String r5 = r5.toString()
            java.lang.CharSequence r6 = kotlin.text.StringsKt.trim(r6)
            java.lang.String r6 = r6.toString()
            int r0 = r5.length()
            if (r0 != 0) goto L21
            return
        L21:
            int r0 = r6.length()
            if (r0 != 0) goto L28
            return
        L28:
            java.lang.Object r0 = com.kubi.user.token.TokenLifecycleRefreshExecutor.f53851e
            monitor-enter(r0)
            com.kubi.user.token.TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1 r1 = com.kubi.user.token.TokenLifecycleRefreshExecutor.f53852f     // Catch: java.lang.Throwable -> L4e
            java.util.Set r2 = r1.keySet()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = "<get-keys>(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L4e
            com.kubi.user.token.d r3 = new com.kubi.user.token.d     // Catch: java.lang.Throwable -> L4e
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L4e
            kotlin.collections.CollectionsKt.removeAll(r2, r3)     // Catch: java.lang.Throwable -> L4e
            com.kubi.user.token.TokenLifecycleRefreshExecutor$c r2 = new com.kubi.user.token.TokenLifecycleRefreshExecutor$c     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L4e
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L4e
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)
            return
        L4e:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }
}
