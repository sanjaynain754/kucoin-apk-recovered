.class public final Lcom/kubi/clean/service/g;
.super Ljava/lang/Object;
.source "AutoCleanNoticeManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0015H\u0001\u00a2\u0006\u0002\u0008\u0016J\u0008\u0010\u0017\u001a\u00020\u0015H\u0002J\u0008\u0010\u0018\u001a\u00020\u0015H\u0002J \u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0080@\u00a2\u0006\u0004\u0008!\u0010\u001fJ2\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010#2\u0012\u0010&\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020(0\'\"\u00020(H\u0080@\u00a2\u0006\u0004\u0008)\u0010*J\u0017\u0010+\u001a\u00020\u00152\u0008\u0010,\u001a\u0004\u0018\u00010-H\u0000\u00a2\u0006\u0002\u0008.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u000cX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013\u00a8\u0006/"
    }
    d2 = {
        "Lcom/kubi/clean/service/AutoCleanNoticeManager;",
        "",
        "<init>",
        "()V",
        "dialogManager",
        "Lcom/kubi/clean/service/AutoCleanDialogManager;",
        "autoCleanRepository",
        "Lcom/kubi/clean/service/AutoCleanRepository;",
        "autoCleanLimitViewManager",
        "Lcom/kubi/clean/service/AutoCleanLimitViewManager;",
        "hasRequestTaskMap",
        "",
        "Lcom/kubi/clean/api/constant/MainTabPage;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "lastLoginState",
        "currentCheckedTabPage",
        "getCurrentCheckedTabPage$AutoCleanUserLib_googleRelease",
        "()Lcom/kubi/clean/api/constant/MainTabPage;",
        "setCurrentCheckedTabPage$AutoCleanUserLib_googleRelease",
        "(Lcom/kubi/clean/api/constant/MainTabPage;)V",
        "bindEvent",
        "",
        "bindEvent$AutoCleanUserLib_googleRelease",
        "destroy",
        "resetCache",
        "showNotice",
        "Lkotlin/Result;",
        "Lcom/kubi/clean/api/entity/AutoCleanDialogResult;",
        "config",
        "Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;",
        "showNotice-YNEx5aM",
        "(Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "showHomeNotice",
        "showHomeNotice$AutoCleanUserLib_googleRelease",
        "queryLimitMessage",
        "",
        "",
        "Lcom/kubi/clean/api/entity/IPLimitConfig;",
        "bizTypeList",
        "",
        "Lcom/kubi/clean/api/entity/AutoCleanBizType;",
        "queryLimitMessage$AutoCleanUserLib_googleRelease",
        "([Lcom/kubi/clean/api/entity/AutoCleanBizType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "dismissAutoLimitView",
        "container",
        "Landroid/view/ViewGroup;",
        "dismissAutoLimitView$AutoCleanUserLib_googleRelease",
        "AutoCleanUserLib_googleRelease"
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
        "SMAP\nAutoCleanNoticeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCleanNoticeManager.kt\ncom/kubi/clean/service/AutoCleanNoticeManager\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 AutoCleanIssue.kt\ncom/kubi/clean/service/AutoCleanIssueKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 AutoCleanUserIssue.kt\ncom/kubi/clean/exception/AutoCleanUserIssueKt\n*L\n1#1,151:1\n32#2,2:152\n42#3,4:154\n382#4,7:158\n44#5,2:165\n*S KotlinDebug\n*F\n+ 1 AutoCleanNoticeManager.kt\ncom/kubi/clean/service/AutoCleanNoticeManager\n*L\n89#1:152,2\n110#1:154,4\n120#1:158,7\n80#1:165,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/clean/service/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lcom/kubi/clean/service/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lcom/kubi/clean/service/AutoCleanRepository;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lcom/kubi/clean/service/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/kubi/clean/api/constant/MainTabPage;",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static g:Lcom/kubi/clean/api/constant/MainTabPage;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/clean/service/g;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/clean/service/g;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/clean/service/g;->a:Lcom/kubi/clean/service/g;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/clean/service/a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/clean/service/a;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/kubi/clean/service/g;->b:Lcom/kubi/clean/service/a;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/clean/service/AutoCleanRepository;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/kubi/clean/service/AutoCleanRepository;-><init>()V

    .line 20
    .line 21
    sput-object v0, Lcom/kubi/clean/service/g;->c:Lcom/kubi/clean/service/AutoCleanRepository;

    .line 22
    .line 23
    new-instance v0, Lcom/kubi/clean/service/b;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Lcom/kubi/clean/service/b;-><init>()V

    .line 27
    .line 28
    sput-object v0, Lcom/kubi/clean/service/g;->d:Lcom/kubi/clean/service/b;

    .line 29
    .line 30
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 34
    .line 35
    sput-object v0, Lcom/kubi/clean/service/g;->e:Ljava/util/Map;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 38
    const/4 v1, 0x0

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 42
    .line 43
    sput-object v0, Lcom/kubi/clean/service/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    sget-object v0, Lcom/kubi/clean/api/constant/MainTabPage;->HOME:Lcom/kubi/clean/api/constant/MainTabPage;

    .line 46
    .line 47
    sput-object v0, Lcom/kubi/clean/service/g;->g:Lcom/kubi/clean/api/constant/MainTabPage;

    .line 48
    return-void
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
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/clean/service/g;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static synthetic b(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/clean/service/g;->h(Ljava/lang/Throwable;)Lkotlin/Unit;

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
.end method

.method public static synthetic c(Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/clean/service/g;->f(Ljava/lang/Boolean;)Lkotlin/Unit;

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
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/clean/service/g;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static final f(Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    sget-object p0, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    sget-object v1, Lcom/kubi/clean/service/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    xor-int/lit8 v2, v0, 0x1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    .line 19
    const-string/jumbo v0, "\u767b\u9646\u72b6\u6001\u53d8\u5316\uff0c\u9700\u8981\u6e05\u7a7a\u7f13\u5b58\uff0c\u4e0b\u6b21\u91cd\u65b0\u8bf7\u6c42"

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lwb/a;->a(Ljava/lang/String;)V

    .line 23
    .line 24
    sget-object v0, Lcom/kubi/clean/service/g;->a:Lcom/kubi/clean/service/g;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/clean/service/g;->l()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 31
    move-result p0

    .line 32
    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    sget-object p0, Lyb/b;->a:Lyb/b;

    .line 36
    .line 37
    sget-object v0, Lcom/kubi/clean/api/entity/AutoCleanBizType;->CLEARANCE_DIALOG:Lcom/kubi/clean/api/entity/AutoCleanBizType;

    .line 38
    .line 39
    sget-object v1, Lcom/kubi/clean/api/entity/AutoCleanBizType;->EXAMINE_DIALOG:Lcom/kubi/clean/api/entity/AutoCleanBizType;

    .line 40
    .line 41
    sget-object v2, Lcom/kubi/clean/api/entity/AutoCleanBizType;->FORCE_KYC_DIALOG:Lcom/kubi/clean/api/entity/AutoCleanBizType;

    .line 42
    .line 43
    .line 44
    filled-new-array {v0, v1, v2}, [Lcom/kubi/clean/api/entity/AutoCleanBizType;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lyb/b;->d(Ljava/util/List;)V

    .line 53
    .line 54
    :cond_0
    sget-object p0, Lcom/kubi/clean/api/service/IAutoCleanService;->a:Lcom/kubi/clean/api/service/IAutoCleanService$Companion;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/kubi/clean/api/service/IAutoCleanService$Companion;->get()Lcom/kubi/clean/api/service/IAutoCleanService;

    .line 58
    move-result-object p0

    .line 59
    .line 60
    .line 61
    invoke-interface {p0}, Lcom/kubi/clean/api/service/IAutoCleanService;->a()V

    .line 62
    .line 63
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 64
    return-object p0
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
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public static final h(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/clean/exception/CleanUserException;

    .line 6
    .line 7
    const/16 v5, 0x8

    .line 8
    const/4 v6, 0x0

    .line 9
    .line 10
    const-string v2, "AutoClean"

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    move-object v1, p0

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v6}, Lcom/kubi/clean/exception/CleanUserException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    const/4 p0, 0x0

    .line 18
    const/4 v1, 0x2

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p0, v1, p0}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    return-object p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
.end method


# virtual methods
.method public final e()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/clean/service/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 8
    move-result v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/kubi/user/config/UserInfo;->e()Lio/reactivex/Observable;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    new-instance v1, Lcom/kubi/clean/service/c;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1}, Lcom/kubi/clean/service/c;-><init>()V

    .line 21
    .line 22
    new-instance v2, Lcom/kubi/clean/service/d;

    .line 23
    .line 24
    .line 25
    invoke-direct {v2, v1}, Lcom/kubi/clean/service/d;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/clean/service/e;

    .line 28
    .line 29
    .line 30
    invoke-direct {v1}, Lcom/kubi/clean/service/e;-><init>()V

    .line 31
    .line 32
    new-instance v3, Lcom/kubi/clean/service/f;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/kubi/clean/service/f;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 39
    return-void
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
.end method

.method public final j(Landroid/view/ViewGroup;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/clean/service/g;->d:Lcom/kubi/clean/service/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/kubi/clean/service/b;->a(Landroid/view/ViewGroup;)V

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
.end method

.method public final k([Lcom/kubi/clean/api/entity/AutoCleanBizType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1    # [Lcom/kubi/clean/api/entity/AutoCleanBizType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/kubi/clean/api/entity/AutoCleanBizType;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/clean/api/entity/IPLimitConfig;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/clean/service/g;->c:Lcom/kubi/clean/service/AutoCleanRepository;

    .line 3
    array-length v1, p1

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 7
    move-result-object p1

    .line 8
    move-object v1, p1

    .line 9
    .line 10
    check-cast v1, [Lcom/kubi/clean/api/entity/AutoCleanBizType;

    .line 11
    const/4 v5, 0x6

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v4, p2

    .line 16
    .line 17
    .line 18
    invoke-static/range {v0 .. v6}, Lcom/kubi/clean/service/AutoCleanRepository;->d(Lcom/kubi/clean/service/AutoCleanRepository;[Lcom/kubi/clean/api/entity/AutoCleanBizType;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final l()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/clean/service/g;->e:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Ljava/util/Map$Entry;

    .line 23
    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    const/4 v2, 0x0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 33
    goto :goto_0

    .line 34
    :cond_0
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
.end method

.method public final m(Lcom/kubi/clean/api/constant/MainTabPage;)V
    .locals 1
    .param p1    # Lcom/kubi/clean/api/constant/MainTabPage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sput-object p1, Lcom/kubi/clean/service/g;->g:Lcom/kubi/clean/api/constant/MainTabPage;

    .line 8
    return-void
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
.end method
