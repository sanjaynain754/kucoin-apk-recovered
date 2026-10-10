.class public final Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;
.super Ljava/lang/Object;
.source "TokenLifecycleRefreshExecutor.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$a;,
        Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;,
        Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a7\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0008\u0004\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t*\u0001\u0013\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003^_`B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0000\u00a2\u0006\u0002\u0008&J0\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00052\u0008\u0008\u0002\u0010-\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010.J.\u0010/\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\nH\u0082@\u00a2\u0006\u0002\u0010.J \u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\nH\u0002J\'\u00103\u001a\u0002042\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0008\u0008\u0002\u00105\u001a\u00020\nH\u0000\u00a2\u0006\u0002\u00086J\r\u00107\u001a\u000204H\u0000\u00a2\u0006\u0002\u00088J\r\u00109\u001a\u00020\u0008H\u0000\u00a2\u0006\u0002\u0008:J2\u0010;\u001a\u0002H<\"\u0004\u0008\u0000\u0010<2\u001c\u0010=\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H<0?\u0012\u0006\u0012\u0004\u0018\u00010\u00010>H\u0082@\u00a2\u0006\u0002\u0010@J*\u0010A\u001a\u0004\u0018\u00010B2\u0006\u00101\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u00182\u0006\u0010E\u001a\u00020FH\u0002J\"\u0010G\u001a\u0004\u0018\u00010H2\u0006\u00101\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0018H\u0002J \u0010I\u001a\u0002042\u0006\u00101\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0018H\u0002J(\u0010J\u001a\u0002042\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020F2\u0006\u0010N\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0005H\u0002J\u0018\u0010O\u001a\u0002042\u0006\u0010P\u001a\u00020F2\u0006\u0010Q\u001a\u00020RH\u0002J\u0008\u0010S\u001a\u000204H\u0002J\u0008\u0010T\u001a\u000204H\u0002J\u0019\u0010U\u001a\u0004\u0018\u00010V2\u0008\u0010W\u001a\u0004\u0018\u00010XH\u0000\u00a2\u0006\u0002\u0008YJ\u0010\u0010Z\u001a\u0002042\u0006\u0010[\u001a\u00020\u0008H\u0002J\u0010\u0010\\\u001a\u0002042\u0006\u0010]\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0019\u0010\u001aR#\u0010\u001d\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001c\u001a\u0004\u0008 \u0010!\u00a8\u0006a"
    }
    d2 = {
        "Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;",
        "",
        "<init>",
        "()V",
        "FAILED_BY_KICK",
        "",
        "PAGE_ID",
        "MAX_NETWORK_RETRY_COUNT",
        "",
        "NOTIFY_REFRESH_TOKEN_TIME_LIMIT",
        "",
        "DIALOG_TIME_SPAN",
        "MAX_REFRESH_RATE_LIMIT_ENTRIES",
        "RECEIVER_HANDLED_ERROR_CODES",
        "",
        "lastDialogTime",
        "lastNotifyRefreshTokenTime",
        "refreshRateLimitLock",
        "lastRefreshElapsedRealtimeBySession",
        "com/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1",
        "Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1;",
        "refreshMutex",
        "Lkotlinx/coroutines/sync/Mutex;",
        "needNotifyTokenRefresh",
        "",
        "getNeedNotifyTokenRefresh",
        "()Z",
        "needNotifyTokenRefresh$delegate",
        "Lkotlin/Lazy;",
        "refreshApi",
        "Lcom/kubi/user/token/TokenLifecycleRefreshApi;",
        "kotlin.jvm.PlatformType",
        "getRefreshApi",
        "()Lcom/kubi/user/token/TokenLifecycleRefreshApi;",
        "refreshApi$delegate",
        "createRefreshOkHttpClient",
        "Lokhttp3/OkHttpClient;",
        "baseClient",
        "createRefreshOkHttpClient$UserCenterLib_googleRelease",
        "refreshToken",
        "Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;",
        "triggerPath",
        "context",
        "Lcom/kubi/kucoin/token/TokenLifecycleRefreshContext;",
        "source",
        "refreshTimeLimit",
        "(Ljava/lang/String;Lcom/kubi/kucoin/token/TokenLifecycleRefreshContext;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "refreshTokenInternal",
        "shouldSkipRefresh",
        "accountId",
        "accessToken",
        "recordTokenIssued",
        "",
        "elapsedRealtime",
        "recordTokenIssued$UserCenterLib_googleRelease",
        "resetRefreshTimeForTest",
        "resetRefreshTimeForTest$UserCenterLib_googleRelease",
        "refreshRateLimitEntryCountForTest",
        "refreshRateLimitEntryCountForTest$UserCenterLib_googleRelease",
        "retryNetworkException",
        "T",
        "block",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "commitRefreshResult",
        "Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$RefreshCommitResult;",
        "attributionToken",
        "wasCurrentAccount",
        "refreshedEntity",
        "Lcom/kubi/user/model/LoginUserEntity;",
        "locateTargetAccount",
        "Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$LocatedAccount;",
        "handleKickOutFailure",
        "handleBusinessFailure",
        "exception",
        "Lcom/kubi/network/retrofit/exception/ApiException;",
        "targetAccount",
        "isCurrentAccount",
        "notifyAlternativeAccount",
        "target",
        "type",
        "Lcom/kubi/user/account/AccountChangeType;",
        "notifyTokenRefreshedIfNeeded",
        "showKickOutDialog",
        "validKickOutDialogHost",
        "Landroidx/fragment/app/FragmentActivity;",
        "activity",
        "Landroid/app/Activity;",
        "validKickOutDialogHost$UserCenterLib_googleRelease",
        "trackRefreshTokenEvent",
        "code",
        "logLifecycle",
        "message",
        "LocatedAccount",
        "RefreshCommitResult",
        "RefreshRateLimitKey",
        "UserCenterLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTokenLifecycleRefreshExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenLifecycleRefreshExecutor.kt\ncom/kubi/user/token/TokenLifecycleRefreshExecutor\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n+ 5 KuEmitter.kt\ncom/kubi/router/emitter/KuEmitter\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 8 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 9 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,654:1\n116#2,8:655\n125#2,2:664\n1#3:663\n1#3:684\n57#4,8:666\n57#4,8:674\n16#5:682\n2756#6:683\n19#7,2:685\n35#8,4:687\n39#8:693\n44#9,2:691\n*S KotlinDebug\n*F\n+ 1 TokenLifecycleRefreshExecutor.kt\ncom/kubi/user/token/TokenLifecycleRefreshExecutor\n*L\n155#1:655,8\n155#1:664,2\n556#1:684\n349#1:666,8\n543#1:674,8\n556#1:682\n556#1:683\n575#1:685,2\n116#1:687,4\n116#1:693\n116#1:691,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static volatile c:J

.field public static volatile d:J

.field public static final e:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final g:Lrg0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final h:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final i:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->a:Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;

    .line 8
    .line 9
    const-string v0, "280001"

    .line 10
    .line 11
    const-string v1, "280010"

    .line 12
    .line 13
    const-string v2, "280003"

    .line 14
    .line 15
    .line 16
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    sput-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->b:Ljava/util/Set;

    .line 24
    .line 25
    new-instance v0, Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    sput-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->e:Ljava/lang/Object;

    .line 31
    .line 32
    new-instance v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1;-><init>()V

    .line 36
    .line 37
    sput-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->f:Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1;

    .line 38
    const/4 v0, 0x1

    .line 39
    const/4 v1, 0x0

    .line 40
    const/4 v2, 0x0

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v0, v1}, Lrg0/f;->b(ZILjava/lang/Object;)Lrg0/a;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sput-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->g:Lrg0/a;

    .line 47
    .line 48
    new-instance v0, Lcom/kubi/user/token/b;

    .line 49
    .line 50
    .line 51
    invoke-direct {v0}, Lcom/kubi/user/token/b;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    sput-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->h:Lkotlin/Lazy;

    .line 58
    .line 59
    new-instance v0, Lcom/kubi/user/token/c;

    .line 60
    .line 61
    .line 62
    invoke-direct {v0}, Lcom/kubi/user/token/c;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    sput-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->i:Lkotlin/Lazy;

    .line 69
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static final F()V
    .locals 11

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->a:Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/blankj/utilcode/util/a;->h()Landroid/app/Activity;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->J(Landroid/app/Activity;)Landroidx/fragment/app/FragmentActivity;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const-string v1, "Kick-out dialog skipped: no lifecycle-safe FragmentActivity"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->s(Ljava/lang/String;)V

    .line 18
    .line 19
    sget v0, Lcom/kubi/user/R$string;->login_kickout_notice_dialog_content_one:I

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->z(I)V

    .line 23
    return-void

    .line 24
    .line 25
    :cond_0
    sget v0, Lcom/kubi/user/R$string;->login_kickout_notice_dialog_content_one:I

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    const-string v2, "getString(...)"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    sget v3, Lcom/kubi/user/R$string;->login_kickout_notice_dialog_content_two:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    .line 43
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    instance-of v2, v1, Lqq/f;

    .line 46
    .line 47
    const-string v4, "B1login"

    .line 48
    .line 49
    if-eqz v2, :cond_1

    .line 50
    move-object v2, v1

    .line 51
    .line 52
    check-cast v2, Lqq/f;

    .line 53
    .line 54
    .line 55
    invoke-interface {v2}, Lqq/f;->getPageId()Ljava/lang/String;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    if-nez v2, :cond_2

    .line 59
    :cond_1
    move-object v5, v4

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move-object v5, v2

    .line 62
    .line 63
    :goto_0
    :try_start_0
    const-string v6, "loginOutTips"

    .line 64
    .line 65
    const/16 v9, 0xc

    .line 66
    const/4 v10, 0x0

    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    .line 70
    .line 71
    invoke-static/range {v5 .. v10}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 72
    .line 73
    sget-object v2, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    sget v4, Lcom/kubi/user/R$string;->login_kickout_notice_dialog_title:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    new-instance v4, Landroid/text/SpannableString;

    .line 86
    .line 87
    new-instance v6, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const/16 v0, 0xa

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    .line 108
    invoke-direct {v4, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v4}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->K4(Landroid/text/SpannableString;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 112
    move-result-object v0

    .line 113
    const/4 v2, 0x0

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->R4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    sget v2, Lcom/kubi/user/R$string;->confirm:I

    .line 120
    .line 121
    new-instance v3, Lcom/kubi/user/token/g;

    .line 122
    .line 123
    .line 124
    invoke-direct {v3, v5}, Lcom/kubi/user/token/g;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v2, v3}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 128
    move-result-object v0

    .line 129
    .line 130
    sget v2, Lcom/kubi/user/R$string;->login_kickout_notice_dialog_login_action:I

    .line 131
    .line 132
    new-instance v3, Lcom/kubi/user/token/h;

    .line 133
    .line 134
    .line 135
    invoke-direct {v3, v5}, Lcom/kubi/user/token/h;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v2, v3}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->P4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 143
    move-result-object v1

    .line 144
    .line 145
    const-string v2, "getSupportFragmentManager(...)"

    .line 146
    .line 147
    .line 148
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    const-string v2, "loginOutTips"

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    return-void

    .line 155
    :catch_0
    move-exception v0

    .line 156
    .line 157
    const-string v1, "TokenLifecycle"

    .line 158
    .line 159
    const-string v2, "Kick-out dialog skipped: Activity state changed before show"

    .line 160
    .line 161
    .line 162
    invoke-static {v1, v2, v0}, Lro/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    sget v0, Lcom/kubi/user/R$string;->login_kickout_notice_dialog_content_one:I

    .line 165
    .line 166
    .line 167
    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->z(I)V

    .line 168
    return-void
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
.end method

.method public static final G(Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 6

    .line 1
    .line 2
    const-wide/16 p1, 0x0

    .line 3
    .line 4
    sput-wide p1, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->c:J

    .line 5
    .line 6
    const/16 v4, 0x8

    .line 7
    const/4 v5, 0x0

    .line 8
    .line 9
    const-string v1, "loginOutTips"

    .line 10
    .line 11
    const-string v2, "1"

    .line 12
    const/4 v3, 0x0

    .line 13
    move-object v0, p0

    .line 14
    .line 15
    .line 16
    invoke-static/range {v0 .. v5}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 17
    const/4 p0, 0x3

    .line 18
    const/4 p1, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p1, p0, p1}, Lcom/kubi/user/signup/SignupExtKt;->h(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lkotlinx/coroutines/m0;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    new-instance v3, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$showKickOutDialog$1$1$1;

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, p1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$showKickOutDialog$1$1$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 28
    const/4 v4, 0x3

    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
.end method

.method public static final H(Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 20

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    sput-wide v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->c:J

    .line 5
    .line 6
    const/16 v6, 0x8

    .line 7
    const/4 v7, 0x0

    .line 8
    .line 9
    const-string v3, "loginOutTips"

    .line 10
    .line 11
    const-string v4, "2"

    .line 12
    const/4 v5, 0x0

    .line 13
    .line 14
    move-object/from16 v2, p0

    .line 15
    .line 16
    .line 17
    invoke-static/range {v2 .. v7}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 18
    .line 19
    sget-object v8, Lf00/a;->a:Lf00/a;

    .line 20
    .line 21
    const/16 v18, 0x1ff

    .line 22
    .line 23
    const/16 v19, 0x0

    .line 24
    const/4 v9, 0x0

    .line 25
    const/4 v10, 0x0

    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v12, 0x0

    .line 28
    const/4 v13, 0x0

    .line 29
    const/4 v14, 0x0

    .line 30
    const/4 v15, 0x0

    .line 31
    .line 32
    const/16 v16, 0x0

    .line 33
    .line 34
    const/16 v17, 0x0

    .line 35
    .line 36
    .line 37
    invoke-static/range {v8 .. v19}, Lg00/p$a;->b(Lg00/p;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
.end method

.method public static synthetic a()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->F()V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static synthetic b()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->t()Z

    .line 4
    move-result v0

    .line 5
    return v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static synthetic c(Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->H(Ljava/lang/String;Landroid/content/DialogInterface;I)V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
.end method

.method public static synthetic d(Ljava/lang/String;Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$c;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->y(Ljava/lang/String;Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$c;)Z

    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/user/model/LoginUserEntity;Z)Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->l(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/user/model/LoginUserEntity;Z)Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
.end method

.method public static synthetic f()Lcom/kubi/user/token/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->z()Lcom/kubi/user/token/a;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static synthetic g(Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->G(Ljava/lang/String;Landroid/content/DialogInterface;I)V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
.end method

.method public static final synthetic h(Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;)Lcom/kubi/user/token/a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->o()Lcom/kubi/user/token/a;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public static final synthetic i(Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;Ljava/lang/String;Lcom/kubi/kucoin/token/k;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->B(Ljava/lang/String;Lcom/kubi/kucoin/token/k;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
.end method

.method public static final synthetic j(Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->C(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
.end method

.method public static final l(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/user/model/LoginUserEntity;Z)Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/user/config/LoginInfoConfig;->a:Lcom/kubi/user/config/LoginInfoConfig;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0, p1, p2}, Lcom/kubi/user/config/LoginInfoConfig;->y(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/user/model/LoginUserEntity;)Lcom/kubi/user/model/LoginUserEntity;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-object p0, v0, Lcom/kubi/user/model/LoginUserEntity;->token:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 19
    move-result p1

    .line 20
    .line 21
    if-lez p1, :cond_0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p0, v1

    .line 24
    .line 25
    :goto_0
    if-nez p0, :cond_1

    .line 26
    return-object v1

    .line 27
    .line 28
    :cond_1
    new-instance p1, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;

    .line 29
    const/4 p2, 0x1

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, p0, p2, v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;-><init>(Ljava/lang/String;ZLcom/kubi/user/model/LoginUserEntity;)V

    .line 33
    return-object p1

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-static {}, Lcom/kubi/user/config/UserInfo;->c()Lcom/kubi/user/model/LoginUserEntity;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    iget-object v0, v0, Lcom/kubi/user/model/LoginUserEntity;->id:Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    move-result v2

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    return-object v1

    .line 47
    .line 48
    :cond_3
    if-eqz p3, :cond_4

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 52
    move-result p3

    .line 53
    .line 54
    if-eqz p3, :cond_4

    .line 55
    return-object v1

    .line 56
    .line 57
    :cond_4
    sget-object p3, La70/b;->a:La70/b;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3, p0, p1, p2}, La70/b;->n(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/user/model/LoginUserEntity;)Lcom/kubi/user/model/LoginUserEntity;

    .line 61
    move-result-object p0

    .line 62
    .line 63
    if-eqz p0, :cond_6

    .line 64
    .line 65
    iget-object p0, p0, Lcom/kubi/user/model/LoginUserEntity;->token:Ljava/lang/String;

    .line 66
    .line 67
    if-eqz p0, :cond_6

    .line 68
    .line 69
    .line 70
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    move-result-object p0

    .line 72
    .line 73
    if-eqz p0, :cond_6

    .line 74
    .line 75
    .line 76
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 77
    move-result p1

    .line 78
    .line 79
    if-lez p1, :cond_5

    .line 80
    move-object v3, p0

    .line 81
    goto :goto_1

    .line 82
    :cond_5
    move-object v3, v1

    .line 83
    .line 84
    :goto_1
    if-eqz v3, :cond_6

    .line 85
    .line 86
    new-instance v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;

    .line 87
    const/4 v6, 0x4

    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v4, 0x0

    .line 90
    const/4 v5, 0x0

    .line 91
    .line 92
    .line 93
    invoke-direct/range {v2 .. v7}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;-><init>(Ljava/lang/String;ZLcom/kubi/user/model/LoginUserEntity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 94
    return-object v2

    .line 95
    :cond_6
    return-object v1
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
.end method

.method public static final t()Z
    .locals 8

    .line 1
    .line 2
    const-string v0, "platform_uc_notify_token_refresh"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$d;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$d;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object v2, v0

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 28
    .line 29
    const/16 v6, 0x8

    .line 30
    const/4 v7, 0x0

    .line 31
    .line 32
    const-string v3, "RemoteConfig"

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 43
    move-object v0, v2

    .line 44
    .line 45
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 46
    const/4 v1, 0x1

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 50
    move-result v0

    .line 51
    return v0
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static synthetic x(Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p5, p5, 0x4

    .line 3
    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    move-result-wide p3

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->w(Ljava/lang/String;Ljava/lang/String;J)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
.end method

.method public static final y(Ljava/lang/String;Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$c;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "key"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$c;->a()Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    move-result p0

    .line 14
    return p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
.end method

.method public static final z()Lcom/kubi/user/token/a;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->d()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lretrofit2/Retrofit;->newBuilder()Lretrofit2/Retrofit$Builder;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sget-object v1, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->a:Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lmr/a;->e()Lokhttp3/OkHttpClient;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->m(Lokhttp3/OkHttpClient;)Lokhttp3/OkHttpClient;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit$Builder;->client(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit$Builder;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    const-class v1, Lcom/kubi/user/token/a;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    check-cast v0, Lcom/kubi/user/token/a;

    .line 35
    return-object v0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method


# virtual methods
.method public final A(Ljava/lang/String;Lcom/kubi/kucoin/token/k;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 24
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/kucoin/token/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/kubi/kucoin/token/k;",
            "Ljava/lang/String;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/kucoin/token/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p6

    .line 3
    .line 4
    instance-of v1, v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    move-object v1, v0

    .line 8
    .line 9
    check-cast v1, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;

    .line 10
    .line 11
    iget v2, v1, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->label:I

    .line 12
    .line 13
    const/high16 v3, -0x80000000

    .line 14
    .line 15
    and-int v4, v2, v3

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    sub-int/2addr v2, v3

    .line 19
    .line 20
    iput v2, v1, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->label:I

    .line 21
    .line 22
    move-object/from16 v2, p0

    .line 23
    :goto_0
    move-object v9, v1

    .line 24
    goto :goto_1

    .line 25
    .line 26
    :cond_0
    new-instance v1, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;

    .line 27
    .line 28
    move-object/from16 v2, p0

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2, v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;-><init>(Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;Lkotlin/coroutines/Continuation;)V

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :goto_1
    iget-object v0, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->result:Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    iget v3, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->label:I

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x2

    .line 43
    const/4 v6, 0x1

    .line 44
    const/4 v10, 0x0

    .line 45
    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    if-eq v3, v6, :cond_2

    .line 49
    .line 50
    if-ne v3, v5, :cond_1

    .line 51
    .line 52
    iget-object v1, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$3:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lrg0/a;

    .line 55
    .line 56
    iget-object v3, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$2:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Ljava/lang/String;

    .line 59
    .line 60
    iget-object v3, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v3, Lcom/kubi/kucoin/token/k;

    .line 63
    .line 64
    iget-object v3, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    goto/16 :goto_5

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    .line 74
    goto/16 :goto_7

    .line 75
    .line 76
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    throw v0

    .line 83
    .line 84
    :cond_2
    iget v3, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->I$0:I

    .line 85
    .line 86
    iget-wide v6, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->J$0:J

    .line 87
    .line 88
    iget-object v8, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$3:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v8, Lrg0/a;

    .line 91
    .line 92
    iget-object v11, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$2:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v11, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v12, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v12, Lcom/kubi/kucoin/token/k;

    .line 99
    .line 100
    iget-object v13, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$0:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v13, Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 106
    .line 107
    move-object/from16 v22, v11

    .line 108
    move-object v11, v8

    .line 109
    move-wide v7, v6

    .line 110
    .line 111
    move-object/from16 v6, v22

    .line 112
    goto :goto_2

    .line 113
    .line 114
    .line 115
    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 116
    .line 117
    sget-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->g:Lrg0/a;

    .line 118
    .line 119
    move-object/from16 v3, p1

    .line 120
    .line 121
    iput-object v3, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$0:Ljava/lang/Object;

    .line 122
    .line 123
    move-object/from16 v7, p2

    .line 124
    .line 125
    iput-object v7, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$1:Ljava/lang/Object;

    .line 126
    .line 127
    move-object/from16 v8, p3

    .line 128
    .line 129
    iput-object v8, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$2:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object v0, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$3:Ljava/lang/Object;

    .line 132
    .line 133
    move-wide/from16 v11, p4

    .line 134
    .line 135
    iput-wide v11, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->J$0:J

    .line 136
    .line 137
    iput v4, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->I$0:I

    .line 138
    .line 139
    iput v6, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->label:I

    .line 140
    .line 141
    .line 142
    invoke-interface {v0, v10, v9}, Lrg0/a;->d(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 143
    move-result-object v6

    .line 144
    .line 145
    if-ne v6, v1, :cond_4

    .line 146
    .line 147
    goto/16 :goto_4

    .line 148
    :cond_4
    move-object v13, v3

    .line 149
    move v3, v4

    .line 150
    move-object v6, v8

    .line 151
    .line 152
    move-wide/from16 v22, v11

    .line 153
    move-object v11, v0

    .line 154
    move-object v12, v7

    .line 155
    .line 156
    move-wide/from16 v7, v22

    .line 157
    .line 158
    :goto_2
    :try_start_1
    sget-object v0, Lcom/kubi/utils/k0;->a:Lcom/kubi/utils/k0;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Lcom/kubi/utils/k0;->e()Z

    .line 162
    move-result v0

    .line 163
    .line 164
    if-nez v0, :cond_6

    .line 165
    .line 166
    sget-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->a:Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;

    .line 167
    .line 168
    new-instance v1, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    const-string v3, "Refresh skipped: app is not in foreground, source="

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    move-result-object v1

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->s(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12}, Lcom/kubi/kucoin/token/k;->c()Ljava/lang/String;

    .line 190
    move-result-object v0

    .line 191
    .line 192
    .line 193
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 194
    move-result v1

    .line 195
    .line 196
    if-lez v1, :cond_5

    .line 197
    move-object v14, v0

    .line 198
    goto :goto_3

    .line 199
    :cond_5
    move-object v14, v10

    .line 200
    .line 201
    .line 202
    :goto_3
    invoke-virtual {v12}, Lcom/kubi/kucoin/token/k;->b()Ljava/lang/String;

    .line 203
    move-result-object v16

    .line 204
    .line 205
    new-instance v13, Lcom/kubi/kucoin/token/l;

    .line 206
    .line 207
    const-string v15, "noop"

    .line 208
    .line 209
    const/16 v20, 0x38

    .line 210
    .line 211
    const/16 v21, 0x0

    .line 212
    .line 213
    const/16 v17, 0x0

    .line 214
    .line 215
    const/16 v18, 0x0

    .line 216
    .line 217
    const/16 v19, 0x0

    .line 218
    .line 219
    .line 220
    invoke-direct/range {v13 .. v21}, Lcom/kubi/kucoin/token/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 221
    goto :goto_6

    .line 222
    :catchall_1
    move-exception v0

    .line 223
    move-object v1, v11

    .line 224
    goto :goto_7

    .line 225
    .line 226
    :cond_6
    sget-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->a:Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;

    .line 227
    .line 228
    .line 229
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    move-result-object v14

    .line 231
    .line 232
    iput-object v14, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$0:Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    move-result-object v14

    .line 237
    .line 238
    iput-object v14, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$1:Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    move-result-object v14

    .line 243
    .line 244
    iput-object v14, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$2:Ljava/lang/Object;

    .line 245
    .line 246
    iput-object v11, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->L$3:Ljava/lang/Object;

    .line 247
    .line 248
    iput-wide v7, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->J$0:J

    .line 249
    .line 250
    iput v3, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->I$0:I

    .line 251
    .line 252
    iput v4, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->I$1:I

    .line 253
    .line 254
    iput v5, v9, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshToken$1;->label:I

    .line 255
    move-object v3, v0

    .line 256
    move-object v5, v12

    .line 257
    move-object v4, v13

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v3 .. v9}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->B(Ljava/lang/String;Lcom/kubi/kucoin/token/k;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 261
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 262
    .line 263
    if-ne v0, v1, :cond_7

    .line 264
    :goto_4
    return-object v1

    .line 265
    :cond_7
    move-object v1, v11

    .line 266
    :goto_5
    :try_start_2
    move-object v13, v0

    .line 267
    .line 268
    check-cast v13, Lcom/kubi/kucoin/token/l;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 269
    move-object v11, v1

    .line 270
    .line 271
    .line 272
    :goto_6
    invoke-interface {v11, v10}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 273
    return-object v13

    .line 274
    .line 275
    .line 276
    :goto_7
    invoke-interface {v1, v10}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 277
    throw v0
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
.end method

.method public final B(Ljava/lang/String;Lcom/kubi/kucoin/token/k;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/kubi/kucoin/token/k;",
            "Ljava/lang/String;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/kucoin/token/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v2, p1

    .line 5
    .line 6
    move-object/from16 v3, p3

    .line 7
    .line 8
    move-wide/from16 v4, p4

    .line 9
    .line 10
    move-object/from16 v0, p6

    .line 11
    .line 12
    instance-of v6, v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;

    .line 13
    .line 14
    if-eqz v6, :cond_0

    .line 15
    move-object v6, v0

    .line 16
    .line 17
    check-cast v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;

    .line 18
    .line 19
    iget v7, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->label:I

    .line 20
    .line 21
    const/high16 v8, -0x80000000

    .line 22
    .line 23
    and-int v9, v7, v8

    .line 24
    .line 25
    if-eqz v9, :cond_0

    .line 26
    sub-int/2addr v7, v8

    .line 27
    .line 28
    iput v7, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->label:I

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_0
    new-instance v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;

    .line 32
    .line 33
    .line 34
    invoke-direct {v6, v1, v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;-><init>(Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;Lkotlin/coroutines/Continuation;)V

    .line 35
    .line 36
    :goto_0
    iget-object v0, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->result:Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 40
    move-result-object v7

    .line 41
    .line 42
    iget v8, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->label:I

    .line 43
    const/4 v9, 0x2

    .line 44
    const/4 v12, 0x1

    .line 45
    .line 46
    if-eqz v8, :cond_3

    .line 47
    .line 48
    if-eq v8, v12, :cond_2

    .line 49
    .line 50
    if-ne v8, v9, :cond_1

    .line 51
    .line 52
    iget v2, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->I$0:I

    .line 53
    .line 54
    iget-boolean v3, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->Z$0:Z

    .line 55
    .line 56
    iget-object v4, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$7:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 59
    .line 60
    iget-object v4, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$6:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v4, Ljava/lang/String;

    .line 63
    .line 64
    iget-object v5, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$5:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v5, Ljava/lang/String;

    .line 67
    .line 68
    iget-object v7, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$4:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v7, Ljava/lang/String;

    .line 71
    .line 72
    iget-object v7, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$3:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v7, Ljava/lang/String;

    .line 75
    .line 76
    iget-object v8, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$2:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v8, Ljava/lang/String;

    .line 79
    .line 80
    iget-object v13, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v13, Lcom/kubi/kucoin/token/k;

    .line 83
    .line 84
    iget-object v6, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v6, Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    move v12, v2

    .line 91
    move v13, v3

    .line 92
    move-object v2, v6

    .line 93
    move-object v3, v8

    .line 94
    move-object v8, v7

    .line 95
    move-object v7, v4

    .line 96
    move-object v4, v1

    .line 97
    .line 98
    goto/16 :goto_e

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    move-object v8, v4

    .line 101
    :goto_1
    const/4 v4, 0x0

    .line 102
    .line 103
    goto/16 :goto_18

    .line 104
    :catch_0
    move-exception v0

    .line 105
    .line 106
    goto/16 :goto_1a

    .line 107
    :catch_1
    move-exception v0

    .line 108
    move v12, v2

    .line 109
    move v13, v3

    .line 110
    move-object v14, v5

    .line 111
    move-object v2, v6

    .line 112
    move-object v15, v7

    .line 113
    move-object v3, v8

    .line 114
    move-object v8, v4

    .line 115
    :goto_2
    const/4 v4, 0x0

    .line 116
    .line 117
    goto/16 :goto_1b

    .line 118
    .line 119
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 120
    .line 121
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 122
    .line 123
    .line 124
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    throw v0

    .line 126
    .line 127
    :cond_2
    iget v2, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->I$0:I

    .line 128
    .line 129
    iget-boolean v3, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->Z$0:Z

    .line 130
    .line 131
    iget-object v4, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$7:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 134
    .line 135
    iget-object v4, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$6:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v4, Ljava/lang/String;

    .line 138
    .line 139
    iget-object v5, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$5:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v5, Ljava/lang/String;

    .line 142
    .line 143
    iget-object v7, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$4:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v7, Ljava/lang/String;

    .line 146
    .line 147
    iget-object v7, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$3:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v7, Ljava/lang/String;

    .line 150
    .line 151
    iget-object v8, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$2:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v8, Ljava/lang/String;

    .line 154
    .line 155
    iget-object v13, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$1:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v13, Lcom/kubi/kucoin/token/k;

    .line 158
    .line 159
    iget-object v6, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$0:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v6, Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    :try_start_1
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    move v13, v3

    .line 166
    move-object v3, v8

    .line 167
    move v11, v12

    .line 168
    move v12, v2

    .line 169
    move-object v2, v6

    .line 170
    .line 171
    goto/16 :goto_7

    .line 172
    .line 173
    .line 174
    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kucoin/token/k;->a()Ljava/lang/String;

    .line 178
    move-result-object v8

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kucoin/token/k;->f()Z

    .line 182
    move-result v13

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kucoin/token/k;->d()Ljava/lang/String;

    .line 186
    move-result-object v0

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kucoin/token/k;->c()Ljava/lang/String;

    .line 190
    move-result-object v14

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kucoin/token/k;->b()Ljava/lang/String;

    .line 194
    move-result-object v18

    .line 195
    .line 196
    .line 197
    invoke-static {v4, v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 198
    move-result-object v15

    .line 199
    .line 200
    .line 201
    invoke-virtual {v15}, Ljava/lang/Number;->longValue()J

    .line 202
    move-result-wide v16

    .line 203
    .line 204
    const-string v11, "manual"

    .line 205
    .line 206
    .line 207
    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    move-result v19

    .line 209
    .line 210
    const-wide/16 v20, 0x0

    .line 211
    .line 212
    if-eqz v19, :cond_4

    .line 213
    .line 214
    cmp-long v16, v16, v20

    .line 215
    .line 216
    if-lez v16, :cond_4

    .line 217
    goto :goto_3

    .line 218
    :cond_4
    const/4 v15, 0x0

    .line 219
    .line 220
    :goto_3
    if-eqz v15, :cond_5

    .line 221
    .line 222
    .line 223
    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    .line 224
    move-result-wide v15

    .line 225
    move-wide v9, v15

    .line 226
    goto :goto_4

    .line 227
    .line 228
    :cond_5
    move-wide/from16 v9, v20

    .line 229
    .line 230
    :goto_4
    new-instance v15, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    const-string v12, "Refresh executor accepted immutable account context, isCurrentAccount="

    .line 236
    .line 237
    .line 238
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v12, ", source="

    .line 244
    .line 245
    .line 246
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v12, ", refreshTimeLimit="

    .line 252
    .line 253
    .line 254
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v15, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    move-object/from16 v22, v7

    .line 260
    .line 261
    const-string v7, ", triggerPath="

    .line 262
    .line 263
    .line 264
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    move-result-object v7

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v7}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->s(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v8, v14, v9, v10}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->D(Ljava/lang/String;Ljava/lang/String;J)Z

    .line 278
    move-result v7

    .line 279
    .line 280
    if-eqz v7, :cond_7

    .line 281
    .line 282
    new-instance v0, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 286
    .line 287
    const-string v2, "Refresh skipped: minimum interval has not elapsed, source="

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    move-result-object v0

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1, v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->s(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    .line 310
    move-result v0

    .line 311
    .line 312
    if-lez v0, :cond_6

    .line 313
    .line 314
    move-object/from16 v16, v14

    .line 315
    goto :goto_5

    .line 316
    .line 317
    :cond_6
    const/16 v16, 0x0

    .line 318
    .line 319
    :goto_5
    new-instance v15, Lcom/kubi/kucoin/token/l;

    .line 320
    .line 321
    const/16 v22, 0x38

    .line 322
    .line 323
    const/16 v23, 0x0

    .line 324
    .line 325
    const-string v17, "noop"

    .line 326
    .line 327
    const/16 v19, 0x0

    .line 328
    .line 329
    const/16 v20, 0x0

    .line 330
    .line 331
    const/16 v21, 0x0

    .line 332
    .line 333
    .line 334
    invoke-direct/range {v15 .. v23}, Lcom/kubi/kucoin/token/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 335
    return-object v15

    .line 336
    .line 337
    .line 338
    :cond_7
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 339
    move-result v7

    .line 340
    .line 341
    if-eqz v7, :cond_8

    .line 342
    .line 343
    const-string v0, "Refresh aborted: local refresh token is empty; request not sent"

    .line 344
    .line 345
    .line 346
    invoke-virtual {v1, v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->s(Ljava/lang/String;)V

    .line 347
    .line 348
    new-instance v15, Lcom/kubi/kucoin/token/l;

    .line 349
    .line 350
    const/16 v22, 0x30

    .line 351
    .line 352
    const/16 v23, 0x0

    .line 353
    .line 354
    const/16 v16, 0x0

    .line 355
    .line 356
    const-string v17, "failed"

    .line 357
    .line 358
    const-string v19, "280003"

    .line 359
    .line 360
    const/16 v20, 0x0

    .line 361
    .line 362
    const/16 v21, 0x0

    .line 363
    .line 364
    .line 365
    invoke-direct/range {v15 .. v23}, Lcom/kubi/kucoin/token/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 366
    return-object v15

    .line 367
    .line 368
    :cond_8
    move-object/from16 v7, v18

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kucoin/token/k;->e()J

    .line 372
    move-result-wide v23

    .line 373
    .line 374
    cmp-long v12, v23, v20

    .line 375
    .line 376
    if-lez v12, :cond_9

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kucoin/token/k;->e()J

    .line 380
    move-result-wide v20

    .line 381
    .line 382
    .line 383
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 384
    move-result-wide v23

    .line 385
    .line 386
    cmp-long v12, v20, v23

    .line 387
    .line 388
    if-gtz v12, :cond_9

    .line 389
    const/4 v12, 0x1

    .line 390
    goto :goto_6

    .line 391
    :cond_9
    const/4 v12, 0x0

    .line 392
    .line 393
    :goto_6
    sget-object v15, Lcom/kubi/user/utils/d0;->a:Lcom/kubi/user/utils/d0;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v15, v3, v2}, Lcom/kubi/user/utils/d0;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    .line 398
    :try_start_2
    new-instance v15, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$requestRefreshToken$1;
    :try_end_2
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_2 .. :try_end_2} :catch_d
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_a

    .line 399
    const/4 v1, 0x0

    .line 400
    .line 401
    .line 402
    :try_start_3
    invoke-direct {v15, v14, v0, v1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$requestRefreshToken$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 403
    .line 404
    .line 405
    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 406
    move-result v1
    :try_end_3
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_9

    .line 407
    .line 408
    if-eqz v1, :cond_b

    .line 409
    .line 410
    :try_start_4
    iput-object v2, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$0:Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    move-result-object v1

    .line 415
    .line 416
    iput-object v1, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$1:Ljava/lang/Object;

    .line 417
    .line 418
    iput-object v3, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$2:Ljava/lang/Object;

    .line 419
    .line 420
    iput-object v8, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$3:Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    move-result-object v0

    .line 425
    .line 426
    iput-object v0, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$4:Ljava/lang/Object;

    .line 427
    .line 428
    iput-object v14, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$5:Ljava/lang/Object;

    .line 429
    .line 430
    iput-object v7, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$6:Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    move-result-object v0

    .line 435
    .line 436
    iput-object v0, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$7:Ljava/lang/Object;

    .line 437
    .line 438
    iput-wide v4, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->J$0:J

    .line 439
    .line 440
    iput-boolean v13, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->Z$0:Z

    .line 441
    .line 442
    iput-wide v9, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->J$1:J

    .line 443
    .line 444
    iput v12, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->I$0:I
    :try_end_4
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 445
    const/4 v11, 0x1

    .line 446
    .line 447
    :try_start_5
    iput v11, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->label:I

    .line 448
    .line 449
    .line 450
    invoke-interface {v15, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    move-result-object v0
    :try_end_5
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 452
    .line 453
    move-object/from16 v1, v22

    .line 454
    .line 455
    if-ne v0, v1, :cond_a

    .line 456
    .line 457
    move-object/from16 v4, p0

    .line 458
    .line 459
    goto/16 :goto_d

    .line 460
    :cond_a
    move-object v4, v7

    .line 461
    move-object v7, v8

    .line 462
    move-object v5, v14

    .line 463
    .line 464
    :goto_7
    :try_start_6
    check-cast v0, Lcom/kubi/user/model/LoginUserEntity;
    :try_end_6
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 465
    move-object v8, v2

    .line 466
    .line 467
    move-object/from16 v23, v4

    .line 468
    move-object v2, v7

    .line 469
    .line 470
    move-object/from16 v4, p0

    .line 471
    :goto_8
    move-object v9, v3

    .line 472
    move-object v10, v5

    .line 473
    .line 474
    goto/16 :goto_f

    .line 475
    :catchall_1
    move-exception v0

    .line 476
    .line 477
    move-object/from16 v1, p0

    .line 478
    move-object v8, v4

    .line 479
    :goto_9
    move v2, v12

    .line 480
    .line 481
    goto/16 :goto_1

    .line 482
    :catch_2
    move-exception v0

    .line 483
    .line 484
    move-object/from16 v1, p0

    .line 485
    .line 486
    goto/16 :goto_1a

    .line 487
    :catch_3
    move-exception v0

    .line 488
    .line 489
    move-object/from16 v1, p0

    .line 490
    move-object v8, v4

    .line 491
    move-object v14, v5

    .line 492
    move-object v15, v7

    .line 493
    .line 494
    goto/16 :goto_2

    .line 495
    :catchall_2
    move-exception v0

    .line 496
    .line 497
    :goto_a
    move-object/from16 v1, p0

    .line 498
    move-object v8, v7

    .line 499
    goto :goto_9

    .line 500
    :catch_4
    move-exception v0

    .line 501
    :goto_b
    const/4 v4, 0x0

    .line 502
    .line 503
    move-object/from16 v1, p0

    .line 504
    :goto_c
    move-object v15, v8

    .line 505
    move-object v8, v7

    .line 506
    .line 507
    goto/16 :goto_1b

    .line 508
    :catchall_3
    move-exception v0

    .line 509
    const/4 v11, 0x1

    .line 510
    goto :goto_a

    .line 511
    :catch_5
    move-exception v0

    .line 512
    const/4 v11, 0x1

    .line 513
    goto :goto_b

    .line 514
    .line 515
    :cond_b
    move-object/from16 v1, v22

    .line 516
    const/4 v11, 0x1

    .line 517
    .line 518
    :try_start_7
    iput-object v2, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$0:Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    move-result-object v11

    .line 523
    .line 524
    iput-object v11, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$1:Ljava/lang/Object;

    .line 525
    .line 526
    iput-object v3, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$2:Ljava/lang/Object;

    .line 527
    .line 528
    iput-object v8, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$3:Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 532
    move-result-object v0

    .line 533
    .line 534
    iput-object v0, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$4:Ljava/lang/Object;

    .line 535
    .line 536
    iput-object v14, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$5:Ljava/lang/Object;

    .line 537
    .line 538
    iput-object v7, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$6:Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    move-result-object v0

    .line 543
    .line 544
    iput-object v0, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->L$7:Ljava/lang/Object;

    .line 545
    .line 546
    iput-wide v4, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->J$0:J

    .line 547
    .line 548
    iput-boolean v13, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->Z$0:Z

    .line 549
    .line 550
    iput-wide v9, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->J$1:J

    .line 551
    .line 552
    iput v12, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->I$0:I

    .line 553
    const/4 v4, 0x2

    .line 554
    .line 555
    iput v4, v6, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$refreshTokenInternal$1;->label:I
    :try_end_7
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_9

    .line 556
    move-object v0, v15

    .line 557
    .line 558
    move-object/from16 v4, p0

    .line 559
    .line 560
    .line 561
    :try_start_8
    invoke-virtual {v4, v0, v6}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->C(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 562
    move-result-object v0
    :try_end_8
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_8 .. :try_end_8} :catch_c
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_6
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 563
    .line 564
    if-ne v0, v1, :cond_c

    .line 565
    :goto_d
    return-object v1

    .line 566
    :cond_c
    move-object v5, v14

    .line 567
    .line 568
    :goto_e
    :try_start_9
    check-cast v0, Lcom/kubi/user/model/LoginUserEntity;
    :try_end_9
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_9 .. :try_end_9} :catch_b
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 569
    move-object v9, v8

    .line 570
    move-object v8, v2

    .line 571
    move-object v2, v9

    .line 572
    .line 573
    move-object/from16 v23, v7

    .line 574
    goto :goto_8

    .line 575
    .line 576
    .line 577
    :goto_f
    :try_start_a
    invoke-virtual {v4, v2, v10, v13, v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->k(Ljava/lang/String;Ljava/lang/String;ZLcom/kubi/user/model/LoginUserEntity;)Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;

    .line 578
    move-result-object v0
    :try_end_a
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_a .. :try_end_a} :catch_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 579
    .line 580
    if-nez v0, :cond_e

    .line 581
    .line 582
    :try_start_b
    const-string v0, "Refresh result discarded: account or token changed during refresh"

    .line 583
    .line 584
    .line 585
    invoke-virtual {v4, v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->s(Ljava/lang/String;)V

    .line 586
    .line 587
    new-instance v20, Lcom/kubi/kucoin/token/l;

    .line 588
    .line 589
    const-string v22, "failed"

    .line 590
    .line 591
    const-string v24, "network_error"

    .line 592
    .line 593
    if-eqz v12, :cond_d

    .line 594
    const/4 v0, 0x1

    .line 595
    goto :goto_10

    .line 596
    :cond_d
    const/4 v0, 0x0

    .line 597
    .line 598
    .line 599
    :goto_10
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 600
    move-result-object v25

    .line 601
    .line 602
    const/16 v26, 0x1

    .line 603
    .line 604
    const/16 v21, 0x0

    .line 605
    .line 606
    .line 607
    invoke-direct/range {v20 .. v26}, Lcom/kubi/kucoin/token/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V
    :try_end_b
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_b .. :try_end_b} :catch_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_b .. :try_end_b} :catch_6
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 608
    return-object v20

    .line 609
    :catchall_4
    move-exception v0

    .line 610
    move-object v1, v4

    .line 611
    move v2, v12

    .line 612
    .line 613
    move-object/from16 v8, v23

    .line 614
    .line 615
    goto/16 :goto_1

    .line 616
    :catch_6
    move-exception v0

    .line 617
    move-object v1, v4

    .line 618
    .line 619
    goto/16 :goto_1a

    .line 620
    :catch_7
    move-exception v0

    .line 621
    move-object v15, v2

    .line 622
    move-object v1, v4

    .line 623
    move-object v2, v8

    .line 624
    move-object v3, v9

    .line 625
    move-object v14, v10

    .line 626
    .line 627
    move-object/from16 v8, v23

    .line 628
    .line 629
    goto/16 :goto_2

    .line 630
    .line 631
    .line 632
    :cond_e
    :try_start_c
    invoke-virtual {v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;->b()Lcom/kubi/user/model/LoginUserEntity;

    .line 633
    move-result-object v1
    :try_end_c
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_c .. :try_end_c} :catch_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_c .. :try_end_c} :catch_6
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 634
    .line 635
    if-eqz v1, :cond_f

    .line 636
    .line 637
    :try_start_d
    sget-object v3, Lcom/kubi/user/config/LoginInfoConfig;->a:Lcom/kubi/user/config/LoginInfoConfig;

    .line 638
    const/4 v5, 0x0

    .line 639
    .line 640
    .line 641
    invoke-virtual {v3, v1, v5}, Lcom/kubi/user/config/LoginInfoConfig;->B(Lcom/kubi/user/model/LoginUserEntity;Z)V
    :try_end_d
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_d .. :try_end_d} :catch_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 642
    .line 643
    .line 644
    :cond_f
    :try_start_e
    invoke-virtual {v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;->a()Ljava/lang/String;

    .line 645
    move-result-object v3
    :try_end_e
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_e .. :try_end_e} :catch_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_e .. :try_end_e} :catch_6
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 646
    const/4 v6, 0x4

    .line 647
    const/4 v7, 0x0

    .line 648
    .line 649
    const-wide/16 v4, 0x0

    .line 650
    .line 651
    move-object/from16 v1, p0

    .line 652
    .line 653
    .line 654
    :try_start_f
    invoke-static/range {v1 .. v7}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->x(Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)V
    :try_end_f
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_f .. :try_end_f} :catch_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_f .. :try_end_f} :catch_0
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 655
    const/4 v4, 0x0

    .line 656
    .line 657
    .line 658
    :try_start_10
    invoke-virtual {v1, v4}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->I(I)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->v()V

    .line 662
    .line 663
    new-instance v3, Ljava/lang/StringBuilder;

    .line 664
    .line 665
    .line 666
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 667
    .line 668
    const-string v5, "Refresh succeeded, isCurrentAccount="

    .line 669
    .line 670
    .line 671
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;->c()Z

    .line 675
    move-result v5

    .line 676
    .line 677
    .line 678
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 682
    move-result-object v3

    .line 683
    .line 684
    .line 685
    invoke-virtual {v1, v3}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->s(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;->a()Ljava/lang/String;

    .line 689
    move-result-object v21

    .line 690
    .line 691
    new-instance v20, Lcom/kubi/kucoin/token/l;

    .line 692
    .line 693
    const-string v22, "success"

    .line 694
    .line 695
    if-eqz v12, :cond_10

    .line 696
    const/4 v5, 0x1

    .line 697
    goto :goto_11

    .line 698
    :cond_10
    move v5, v4

    .line 699
    .line 700
    .line 701
    :goto_11
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 702
    move-result-object v25

    .line 703
    .line 704
    const/16 v27, 0x8

    .line 705
    .line 706
    const/16 v28, 0x0

    .line 707
    .line 708
    const/16 v24, 0x0

    .line 709
    .line 710
    const/16 v26, 0x1

    .line 711
    .line 712
    .line 713
    invoke-direct/range {v20 .. v28}, Lcom/kubi/kucoin/token/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_10
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_10 .. :try_end_10} :catch_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_10 .. :try_end_10} :catch_0
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 714
    return-object v20

    .line 715
    :catchall_5
    move-exception v0

    .line 716
    :goto_12
    move v2, v12

    .line 717
    .line 718
    move-object/from16 v8, v23

    .line 719
    goto :goto_18

    .line 720
    :catch_8
    move-exception v0

    .line 721
    :goto_13
    move-object v15, v2

    .line 722
    move-object v2, v8

    .line 723
    move-object v3, v9

    .line 724
    move-object v14, v10

    .line 725
    .line 726
    move-object/from16 v8, v23

    .line 727
    .line 728
    goto/16 :goto_1b

    .line 729
    :catchall_6
    move-exception v0

    .line 730
    :goto_14
    const/4 v4, 0x0

    .line 731
    goto :goto_12

    .line 732
    :catch_9
    move-exception v0

    .line 733
    :goto_15
    const/4 v4, 0x0

    .line 734
    goto :goto_13

    .line 735
    :catchall_7
    move-exception v0

    .line 736
    move-object v1, v4

    .line 737
    goto :goto_14

    .line 738
    :catch_a
    move-exception v0

    .line 739
    move-object v1, v4

    .line 740
    goto :goto_15

    .line 741
    :catchall_8
    move-exception v0

    .line 742
    move-object v1, v4

    .line 743
    :goto_16
    const/4 v4, 0x0

    .line 744
    move-object v8, v7

    .line 745
    move v2, v12

    .line 746
    goto :goto_18

    .line 747
    :catch_b
    move-exception v0

    .line 748
    move-object v1, v4

    .line 749
    const/4 v4, 0x0

    .line 750
    move-object v14, v5

    .line 751
    .line 752
    goto/16 :goto_c

    .line 753
    :catch_c
    move-exception v0

    .line 754
    move-object v1, v4

    .line 755
    :goto_17
    const/4 v4, 0x0

    .line 756
    .line 757
    goto/16 :goto_c

    .line 758
    :catchall_9
    move-exception v0

    .line 759
    .line 760
    move-object/from16 v1, p0

    .line 761
    goto :goto_16

    .line 762
    :catchall_a
    move-exception v0

    .line 763
    goto :goto_16

    .line 764
    .line 765
    :goto_18
    new-instance v5, Lcom/kubi/kucoin/token/l;

    .line 766
    .line 767
    if-eqz v2, :cond_11

    .line 768
    const/4 v11, 0x1

    .line 769
    goto :goto_19

    .line 770
    :cond_11
    move v11, v4

    .line 771
    .line 772
    .line 773
    :goto_19
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 774
    move-result-object v10

    .line 775
    const/4 v11, 0x1

    .line 776
    const/4 v6, 0x0

    .line 777
    .line 778
    const-string v7, "failed"

    .line 779
    .line 780
    const-string v9, "network_error"

    .line 781
    .line 782
    .line 783
    invoke-direct/range {v5 .. v11}, Lcom/kubi/kucoin/token/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V

    .line 784
    .line 785
    const-string v2, "TokenLifecycle"

    .line 786
    .line 787
    const-string v3, "refresh failed"

    .line 788
    .line 789
    .line 790
    invoke-static {v2, v3, v0}, Lro/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 791
    .line 792
    .line 793
    invoke-static {v0}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 794
    move-result v2

    .line 795
    .line 796
    if-nez v2, :cond_1a

    .line 797
    .line 798
    .line 799
    invoke-static {v0}, Ld70/a;->a(Ljava/lang/Throwable;)Z

    .line 800
    move-result v2

    .line 801
    .line 802
    const-string v22, "TokenLifecycle"

    .line 803
    .line 804
    if-eqz v2, :cond_12

    .line 805
    .line 806
    new-instance v20, Lcom/kubi/user/exception/UserCenterException;

    .line 807
    .line 808
    const/16 v25, 0x8

    .line 809
    .line 810
    const/16 v26, 0x0

    .line 811
    .line 812
    const/16 v23, 0x1

    .line 813
    .line 814
    const/16 v24, 0x0

    .line 815
    .line 816
    move-object/from16 v21, v0

    .line 817
    .line 818
    .line 819
    invoke-direct/range {v20 .. v26}, Lcom/kubi/user/exception/UserCenterException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 820
    .line 821
    move-object/from16 v0, v20

    .line 822
    const/4 v2, 0x0

    .line 823
    const/4 v15, 0x2

    .line 824
    .line 825
    .line 826
    invoke-static {v0, v2, v15, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 827
    .line 828
    goto/16 :goto_1f

    .line 829
    .line 830
    :cond_12
    move-object/from16 v2, v22

    .line 831
    .line 832
    .line 833
    invoke-static {v0, v2}, Ld70/a;->b(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 834
    .line 835
    goto/16 :goto_1f

    .line 836
    :goto_1a
    throw v0

    .line 837
    :catch_d
    move-exception v0

    .line 838
    goto :goto_17

    .line 839
    .line 840
    :goto_1b
    sget-object v5, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->b:Ljava/util/Set;

    .line 841
    .line 842
    iget-object v6, v0, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 846
    move-result v6

    .line 847
    .line 848
    const-string v7, "500036"

    .line 849
    .line 850
    if-eqz v6, :cond_13

    .line 851
    .line 852
    const-string v6, "280003"

    .line 853
    :goto_1c
    move-object v9, v6

    .line 854
    move-object v6, v5

    .line 855
    goto :goto_1d

    .line 856
    .line 857
    :cond_13
    iget-object v6, v0, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 861
    move-result v6

    .line 862
    .line 863
    if-eqz v6, :cond_14

    .line 864
    move-object v6, v5

    .line 865
    move-object v9, v7

    .line 866
    goto :goto_1d

    .line 867
    .line 868
    :cond_14
    const-string v6, "network_error"

    .line 869
    goto :goto_1c

    .line 870
    .line 871
    :goto_1d
    new-instance v5, Lcom/kubi/kucoin/token/l;

    .line 872
    .line 873
    if-eqz v12, :cond_15

    .line 874
    const/4 v11, 0x1

    .line 875
    goto :goto_1e

    .line 876
    :cond_15
    move v11, v4

    .line 877
    .line 878
    .line 879
    :goto_1e
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 880
    move-result-object v10

    .line 881
    const/4 v11, 0x1

    .line 882
    move-object v4, v6

    .line 883
    const/4 v6, 0x0

    .line 884
    move-object v12, v7

    .line 885
    .line 886
    const-string v7, "failed"

    .line 887
    .line 888
    .line 889
    invoke-direct/range {v5 .. v11}, Lcom/kubi/kucoin/token/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V

    .line 890
    .line 891
    iget-object v6, v0, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    invoke-interface {v4, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 895
    move-result v4

    .line 896
    .line 897
    const-string v6, "Refresh failed with business error code="

    .line 898
    .line 899
    if-eqz v4, :cond_16

    .line 900
    .line 901
    new-instance v2, Ljava/lang/StringBuilder;

    .line 902
    .line 903
    .line 904
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 908
    .line 909
    iget-object v0, v0, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 913
    .line 914
    const-string v0, "; handled by NetBusinessErrorReceiver"

    .line 915
    .line 916
    .line 917
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 918
    .line 919
    .line 920
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 921
    move-result-object v0

    .line 922
    .line 923
    .line 924
    invoke-virtual {v1, v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->s(Ljava/lang/String;)V

    .line 925
    return-object v5

    .line 926
    .line 927
    :cond_16
    iget-object v4, v0, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 931
    move-result v4

    .line 932
    .line 933
    if-eqz v4, :cond_17

    .line 934
    .line 935
    .line 936
    invoke-virtual {v1, v15, v14, v13}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->q(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 937
    goto :goto_1f

    .line 938
    .line 939
    :cond_17
    const-string v4, "401"

    .line 940
    .line 941
    .line 942
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 943
    move-result v4

    .line 944
    .line 945
    if-eqz v4, :cond_19

    .line 946
    .line 947
    .line 948
    invoke-virtual {v1, v15, v14, v13}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->r(Ljava/lang/String;Ljava/lang/String;Z)Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$a;

    .line 949
    move-result-object v3

    .line 950
    .line 951
    if-eqz v3, :cond_18

    .line 952
    .line 953
    .line 954
    invoke-virtual {v3}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$a;->a()Lcom/kubi/user/model/LoginUserEntity;

    .line 955
    move-result-object v4

    .line 956
    .line 957
    .line 958
    invoke-virtual {v3}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$a;->b()Z

    .line 959
    move-result v3

    .line 960
    .line 961
    .line 962
    invoke-virtual {v1, v0, v4, v3, v2}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->p(Lcom/kubi/network/retrofit/exception/ApiException;Lcom/kubi/user/model/LoginUserEntity;ZLjava/lang/String;)V

    .line 963
    goto :goto_1f

    .line 964
    .line 965
    :cond_18
    const-string v0, "Refresh error ignored: account or token changed during refresh"

    .line 966
    .line 967
    .line 968
    invoke-virtual {v1, v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->s(Ljava/lang/String;)V

    .line 969
    goto :goto_1f

    .line 970
    .line 971
    :cond_19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 972
    .line 973
    .line 974
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 978
    .line 979
    iget-object v0, v0, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 983
    .line 984
    const-string v0, "; business failure side effect skipped for source="

    .line 985
    .line 986
    .line 987
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 988
    .line 989
    .line 990
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 991
    .line 992
    .line 993
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 994
    move-result-object v0

    .line 995
    .line 996
    .line 997
    invoke-virtual {v1, v0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->s(Ljava/lang/String;)V

    .line 998
    :cond_1a
    :goto_1f
    return-object v5
.end method

.method public final C(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    .line 4
    instance-of v2, p2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    move-object v2, p2

    .line 8
    .line 9
    check-cast v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;

    .line 10
    .line 11
    iget v3, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->label:I

    .line 12
    .line 13
    const/high16 v4, -0x80000000

    .line 14
    .line 15
    and-int v5, v3, v4

    .line 16
    .line 17
    if-eqz v5, :cond_0

    .line 18
    sub-int/2addr v3, v4

    .line 19
    .line 20
    iput v3, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->label:I

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    new-instance v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, p0, p2}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;-><init>(Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    :goto_0
    iget-object p2, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    iget v4, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->label:I

    .line 35
    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    if-eq v4, v0, :cond_2

    .line 39
    .line 40
    if-ne v4, v1, :cond_1

    .line 41
    .line 42
    iget p1, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->I$0:I

    .line 43
    .line 44
    iget-object v4, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, Ljava/lang/Exception;

    .line 47
    .line 48
    iget-object v4, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 51
    .line 52
    .line 53
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 54
    move p2, p1

    .line 55
    :goto_1
    move-object p1, v4

    .line 56
    goto :goto_2

    .line 57
    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    throw p1

    .line 65
    .line 66
    :cond_2
    iget p1, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->I$0:I

    .line 67
    .line 68
    iget-object v4, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->L$0:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 71
    .line 72
    .line 73
    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    return-object p2

    .line 75
    :catch_0
    move-exception p2

    .line 76
    goto :goto_3

    .line 77
    :catch_1
    move-exception p1

    .line 78
    goto :goto_5

    .line 79
    :catch_2
    move-exception p1

    .line 80
    goto :goto_6

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 84
    const/4 p2, 0x0

    .line 85
    .line 86
    :goto_2
    :try_start_1
    iput-object p1, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->L$0:Ljava/lang/Object;

    .line 87
    const/4 v4, 0x0

    .line 88
    .line 89
    iput-object v4, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->L$1:Ljava/lang/Object;

    .line 90
    .line 91
    iput p2, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->I$0:I

    .line 92
    .line 93
    iput v0, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->label:I

    .line 94
    .line 95
    .line 96
    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    move-result-object p1
    :try_end_1
    .catch Lcom/kubi/network/retrofit/exception/ApiException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 98
    .line 99
    if-ne p1, v3, :cond_4

    .line 100
    goto :goto_4

    .line 101
    :cond_4
    return-object p1

    .line 102
    :catch_3
    move-exception v4

    .line 103
    move-object v10, v4

    .line 104
    move-object v4, p1

    .line 105
    move p1, p2

    .line 106
    move-object p2, v10

    .line 107
    :goto_3
    const/4 v5, 0x3

    .line 108
    .line 109
    if-ge p1, v5, :cond_6

    .line 110
    .line 111
    add-int/lit8 v5, p1, 0x1

    .line 112
    add-int/2addr p1, v1

    .line 113
    int-to-long v6, p1

    .line 114
    .line 115
    const-wide/16 v8, 0x3e8

    .line 116
    mul-long/2addr v6, v8

    .line 117
    .line 118
    new-instance p1, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    const-string v8, "Refresh network exception; retry "

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v8, " starts in "

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v8, "ms"

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    move-result-object p1

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, p1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->s(Ljava/lang/String;)V

    .line 150
    .line 151
    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    .line 152
    .line 153
    sget-object p1, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    .line 154
    .line 155
    .line 156
    invoke-static {v6, v7, p1}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    .line 157
    move-result-wide v8

    .line 158
    .line 159
    iput-object v4, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->L$0:Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    move-result-object p1

    .line 164
    .line 165
    iput-object p1, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->L$1:Ljava/lang/Object;

    .line 166
    .line 167
    iput v5, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->I$0:I

    .line 168
    .line 169
    iput-wide v6, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->J$0:J

    .line 170
    .line 171
    iput v1, v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$retryNetworkException$1;->label:I

    .line 172
    .line 173
    .line 174
    invoke-static {v8, v9, v2}, Lkotlinx/coroutines/DelayKt;->c(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 175
    move-result-object p1

    .line 176
    .line 177
    if-ne p1, v3, :cond_5

    .line 178
    :goto_4
    return-object v3

    .line 179
    :cond_5
    move p2, v5

    .line 180
    goto :goto_1

    .line 181
    :cond_6
    throw p2

    .line 182
    :goto_5
    throw p1

    .line 183
    :goto_6
    throw p1
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
.end method

.method public final D(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long v0, p3, v2

    .line 18
    .line 19
    if-gtz v0, :cond_0

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    sget-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->e:Ljava/lang/Object;

    .line 23
    monitor-enter v0

    .line 24
    .line 25
    :try_start_0
    sget-object v4, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->f:Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1;

    .line 26
    .line 27
    new-instance v5, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$c;

    .line 28
    .line 29
    .line 30
    invoke-direct {v5, p1, p2}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v5}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    check-cast p1, Ljava/lang/Long;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    monitor-exit v0

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 43
    move-result-wide p1

    .line 44
    .line 45
    .line 46
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 47
    move-result-wide v4

    .line 48
    sub-long/2addr v4, p1

    .line 49
    .line 50
    cmp-long p1, v2, v4

    .line 51
    .line 52
    if-gtz p1, :cond_1

    .line 53
    .line 54
    cmp-long p1, v4, p3

    .line 55
    .line 56
    if-gez p1, :cond_1

    .line 57
    const/4 p1, 0x1

    .line 58
    return p1

    .line 59
    :cond_1
    return v1

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    monitor-exit v0

    .line 62
    throw p1

    .line 63
    :cond_2
    :goto_0
    return v1
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
.end method

.method public final E()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    sget-wide v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->c:J

    .line 7
    .line 8
    sub-long v2, v0, v2

    .line 9
    .line 10
    .line 11
    const-wide/32 v4, 0x493e0

    .line 12
    .line 13
    cmp-long v2, v2, v4

    .line 14
    .line 15
    if-gez v2, :cond_0

    .line 16
    return-void

    .line 17
    .line 18
    :cond_0
    sput-wide v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->c:J

    .line 19
    .line 20
    new-instance v0, Lcom/kubi/user/token/f;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Lcom/kubi/user/token/f;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lo00/g;->e()Ljava/util/concurrent/Executor;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public final I(I)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/constant/monitor/KunlunBusinessEventEnum;->REFRESH_TOKEN_RESULT:Lcom/kubi/sdk/constant/monitor/KunlunBusinessEventEnum;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lqq/h;->a(Lcom/kubi/sdk/constant/monitor/KunlunBusinessEventEnum;I)V

    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final J(Landroid/app/Activity;)Landroidx/fragment/app/FragmentActivity;
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Landroidx/fragment/app/FragmentActivity;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroidx/fragment/app/FragmentActivity;

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v1

    .line 10
    .line 11
    :goto_0
    if-nez p1, :cond_1

    .line 12
    return-object v1

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_3

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->isStateSaved()Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    return-object p1

    .line 37
    :cond_3
    :goto_1
    return-object v1
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;ZLcom/kubi/user/model/LoginUserEntity;)Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;
    .locals 2

    .line 1
    .line 2
    sget-object v0, La70/b;->a:La70/b;

    .line 3
    .line 4
    new-instance v1, Lcom/kubi/user/token/e;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p1, p2, p4, p3}, Lcom/kubi/user/token/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/user/model/LoginUserEntity;Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, La70/b;->o(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$b;

    .line 14
    return-object p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
.end method

.method public final m(Lokhttp3/OkHttpClient;)Lokhttp3/OkHttpClient;
    .locals 1
    .param p1    # Lokhttp3/OkHttpClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "baseClient"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    new-instance v0, Lokhttp3/Dispatcher;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Lokhttp3/Dispatcher;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lokhttp3/OkHttpClient$Builder;->dispatcher(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 22
    move-result-object p1

    .line 23
    return-object p1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final n()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->h:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public final o()Lcom/kubi/user/token/a;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->i:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/user/token/a;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public final p(Lcom/kubi/network/retrofit/exception/ApiException;Lcom/kubi/user/model/LoginUserEntity;ZLjava/lang/String;)V
    .locals 7

    .line 1
    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    sget-object p2, Lcom/kubi/user/config/LoginInfoConfig;->a:Lcom/kubi/user/config/LoginInfoConfig;

    .line 5
    const/4 p3, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2, p3}, Lcom/kubi/user/config/LoginInfoConfig;->O(Z)V

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    sget-object p3, Lcom/kubi/user/account/AccountChangeType;->TYPE_280003:Lcom/kubi/user/account/AccountChangeType;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p2, p3}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->u(Lcom/kubi/user/model/LoginUserEntity;Lcom/kubi/user/account/AccountChangeType;)V

    .line 15
    .line 16
    :goto_0
    iget-object p2, p1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 17
    .line 18
    const-string p3, "code"

    .line 19
    .line 20
    .line 21
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 25
    move-result-object p2

    .line 26
    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 31
    move-result p2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 p2, -0x1

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-virtual {p0, p2}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->I(I)V

    .line 37
    .line 38
    new-instance v1, Lcom/kubi/user/exception/RefreshTokenException;

    .line 39
    .line 40
    new-instance p2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    const-string p3, "\u7eed\u671f\u5931\u8d25,\u4e1a\u52a1\u9519\u8bef\u7801="

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    iget-object p3, p1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string p3, "\uff0c\u539f\u56e0="

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    move-result-object p3

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string p3, ",url="

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    move-result-object p2

    .line 78
    const/4 p3, 0x0

    .line 79
    const/4 p4, 0x2

    .line 80
    .line 81
    .line 82
    invoke-direct {v1, p2, p3, p4, p3}, Lcom/kubi/user/exception/RefreshTokenException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v1}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 86
    move-result p2

    .line 87
    .line 88
    if-nez p2, :cond_3

    .line 89
    .line 90
    .line 91
    invoke-static {v1}, Ld70/a;->a(Ljava/lang/Throwable;)Z

    .line 92
    move-result p2

    .line 93
    .line 94
    const-string v2, "refresh_token"

    .line 95
    .line 96
    if-eqz p2, :cond_2

    .line 97
    .line 98
    new-instance v0, Lcom/kubi/user/exception/UserCenterException;

    .line 99
    .line 100
    const/16 v5, 0x8

    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v3, 0x1

    .line 103
    const/4 v4, 0x0

    .line 104
    .line 105
    .line 106
    invoke-direct/range {v0 .. v6}, Lcom/kubi/user/exception/UserCenterException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v0, p3, p4, p3}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 110
    goto :goto_2

    .line 111
    .line 112
    .line 113
    :cond_2
    invoke-static {v1, v2}, Ld70/a;->b(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 114
    .line 115
    :cond_3
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    const-string p3, "Refresh failed with business error code="

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    iget-object p1, p1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->s(Ljava/lang/String;)V

    .line 136
    return-void
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
.end method

.method public final q(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/user/config/LoginInfoConfig;->a:Lcom/kubi/user/config/LoginInfoConfig;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, v1}, Lcom/kubi/user/config/LoginInfoConfig;->P(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->E()V

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->r(Ljava/lang/String;Ljava/lang/String;Z)Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$a;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$a;->b()Z

    .line 23
    move-result p2

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$a;->a()Lcom/kubi/user/model/LoginUserEntity;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    sget-object p2, Lcom/kubi/user/account/AccountChangeType;->TYPE_500036:Lcom/kubi/user/account/AccountChangeType;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1, p2}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->u(Lcom/kubi/user/model/LoginUserEntity;Lcom/kubi/user/account/AccountChangeType;)V

    .line 35
    return-void

    .line 36
    .line 37
    :cond_1
    const-string p1, "500036 side effect ignored: target session changed before conditional logout"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->s(Ljava/lang/String;)V

    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
.end method

.method public final r(Ljava/lang/String;Ljava/lang/String;Z)Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$a;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/user/config/UserInfo;->c()Lcom/kubi/user/model/LoginUserEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, v0, Lcom/kubi/user/model/LoginUserEntity;->id:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    iget-object p1, v0, Lcom/kubi/user/model/LoginUserEntity;->token:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    move-result p1

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v0, v2

    .line 28
    .line 29
    :goto_0
    if-eqz v0, :cond_1

    .line 30
    .line 31
    new-instance p1, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$a;

    .line 32
    const/4 p2, 0x1

    .line 33
    .line 34
    .line 35
    invoke-direct {p1, v0, p2}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$a;-><init>(Lcom/kubi/user/model/LoginUserEntity;Z)V

    .line 36
    return-object p1

    .line 37
    :cond_1
    return-object v2

    .line 38
    .line 39
    :cond_2
    if-eqz p3, :cond_3

    .line 40
    .line 41
    iget-object p3, v0, Lcom/kubi/user/model/LoginUserEntity;->id:Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-static {p3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 45
    move-result p3

    .line 46
    .line 47
    if-eqz p3, :cond_3

    .line 48
    return-object v2

    .line 49
    .line 50
    :cond_3
    sget-object p3, La70/b;->a:La70/b;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3, p1}, La70/b;->b(Ljava/lang/String;)Lcom/kubi/user/model/LoginUserEntity;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    if-eqz p1, :cond_5

    .line 57
    .line 58
    iget-object p3, p1, Lcom/kubi/user/model/LoginUserEntity;->token:Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    invoke-static {p3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    move-result-object p3

    .line 63
    .line 64
    .line 65
    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    move-result p2

    .line 67
    .line 68
    if-eqz p2, :cond_4

    .line 69
    goto :goto_1

    .line 70
    :cond_4
    move-object p1, v2

    .line 71
    .line 72
    :goto_1
    if-eqz p1, :cond_5

    .line 73
    .line 74
    new-instance p2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$a;

    .line 75
    const/4 p3, 0x0

    .line 76
    .line 77
    .line 78
    invoke-direct {p2, p1, p3}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$a;-><init>(Lcom/kubi/user/model/LoginUserEntity;Z)V

    .line 79
    return-object p2

    .line 80
    :cond_5
    return-object v2
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
.end method

.method public final s(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "TokenLifecycle"

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final u(Lcom/kubi/user/model/LoginUserEntity;Lcom/kubi/user/account/AccountChangeType;)V
    .locals 3

    .line 1
    .line 2
    iget-object p1, p1, Lcom/kubi/user/model/LoginUserEntity;->id:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    return-void

    .line 18
    .line 19
    :cond_0
    sget-object v0, Lxx/a;->a:Lxx/a;

    .line 20
    .line 21
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 22
    .line 23
    const-class v1, La70/a;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/kubi/router/core/Router;->l(Ljava/lang/Class;)Ljava/util/List;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    move-result v1

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    check-cast v1, La70/a;

    .line 44
    .line 45
    new-instance v2, Lcom/kubi/user/account/AccountChange;

    .line 46
    .line 47
    .line 48
    invoke-direct {v2, p1, p2}, Lcom/kubi/user/account/AccountChange;-><init>(Ljava/lang/String;Lcom/kubi/user/account/AccountChangeType;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
.end method

.method public final v()V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->n()Z

    .line 8
    move-result v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    sget-wide v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->d:J

    .line 13
    .line 14
    sub-long v2, v0, v2

    .line 15
    .line 16
    const-wide/16 v4, 0x2710

    .line 17
    .line 18
    cmp-long v2, v2, v4

    .line 19
    .line 20
    if-ltz v2, :cond_0

    .line 21
    .line 22
    sput-wide v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->d:J

    .line 23
    const/4 v7, 0x6

    .line 24
    const/4 v8, 0x0

    .line 25
    .line 26
    const-string v3, "com.kubi.user.event.UserEvent:onTokenRefresh"

    .line 27
    const/4 v4, 0x0

    .line 28
    .line 29
    const-wide/16 v5, 0x0

    .line 30
    .line 31
    .line 32
    invoke-static/range {v3 .. v8}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 33
    :cond_0
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public final w(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "accountId"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "accessToken"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-static {p2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    return-void

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 37
    move-result v0

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    return-void

    .line 41
    .line 42
    :cond_1
    sget-object v0, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->e:Ljava/lang/Object;

    .line 43
    monitor-enter v0

    .line 44
    .line 45
    :try_start_0
    sget-object v1, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor;->f:Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1;->keySet()Ljava/util/Set;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    const-string v3, "<get-keys>(...)"

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    new-instance v3, Lcom/kubi/user/token/d;

    .line 57
    .line 58
    .line 59
    invoke-direct {v3, p1}, Lcom/kubi/user/token/d;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Z

    .line 63
    .line 64
    new-instance v2, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$c;

    .line 65
    .line 66
    .line 67
    invoke-direct {v2, p1, p2}, Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    .line 74
    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    monitor-exit v0

    .line 78
    return-void

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    monitor-exit v0

    .line 81
    throw p1
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
.end method
