.class public final Lcom/revolut/revolutpay/ui/sandbox/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revolut/revolutpay/ui/sandbox/a$a;,
        Lcom/revolut/revolutpay/ui/sandbox/a$b;
    }
.end annotation


# static fields
.field public static final c:Lcom/revolut/revolutpay/ui/sandbox/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/revolut/revolutpay/ui/sandbox/a$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/revolut/revolutpay/polling/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/revolut/revolutpay/ui/sandbox/a$a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/revolut/revolutpay/ui/sandbox/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/revolut/revolutpay/ui/sandbox/a;->c:Lcom/revolut/revolutpay/ui/sandbox/a$a;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>(Lcom/revolut/revolutpay/ui/sandbox/a$b;)V
    .locals 4
    .param p1    # Lcom/revolut/revolutpay/ui/sandbox/a$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "view"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/sandbox/a;->a:Lcom/revolut/revolutpay/ui/sandbox/a$b;

    .line 12
    .line 13
    new-instance p1, Lcom/revolut/revolutpay/polling/e;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    const-string/jumbo v1, "newCachedThreadPool()"

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    const-string/jumbo v2, "newSingleThreadScheduledExecutor()"

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    new-instance v2, Landroid/os/Handler;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, v0, v1, v2}, Lcom/revolut/revolutpay/polling/e;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V

    .line 46
    .line 47
    iput-object p1, p0, Lcom/revolut/revolutpay/ui/sandbox/a;->b:Lcom/revolut/revolutpay/polling/d;

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
.end method

.method public static final synthetic a(Lcom/revolut/revolutpay/ui/sandbox/a;)Lcom/revolut/revolutpay/polling/d;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/revolut/revolutpay/ui/sandbox/a;->b:Lcom/revolut/revolutpay/polling/d;

    .line 3
    return-object p0
    .line 4
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
.end method

.method public static final synthetic b(Lcom/revolut/revolutpay/ui/sandbox/a;Ljava/lang/String;)Lretrofit2/Response;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/revolut/revolutpay/ui/sandbox/a;->d(Ljava/lang/String;)Lretrofit2/Response;

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
.end method

.method public static final synthetic c(Lcom/revolut/revolutpay/ui/sandbox/a;Lla0/b;)Lretrofit2/Response;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/revolut/revolutpay/ui/sandbox/a;->e(Lla0/b;)Lretrofit2/Response;

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
.end method

.method public static final synthetic h(Lcom/revolut/revolutpay/ui/sandbox/a;)Lcom/revolut/revolutpay/ui/sandbox/a$b;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/revolut/revolutpay/ui/sandbox/a;->a:Lcom/revolut/revolutpay/ui/sandbox/a$b;

    .line 3
    return-object p0
    .line 4
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
.end method


# virtual methods
.method public final d(Ljava/lang/String;)Lretrofit2/Response;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Response<",
            "Lla0/b;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/revolut/revolutpay/factory/sandbox/b;->a:Lcom/revolut/revolutpay/factory/sandbox/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/revolut/revolutpay/factory/sandbox/b;->c()Lka0/a;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lla0/a;

    .line 9
    .line 10
    const/16 v2, 0xa00

    .line 11
    .line 12
    const/16 v3, 0x5a0

    .line 13
    .line 14
    const/16 v4, 0x18

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v4, v2, v3}, Lla0/a;-><init>(III)V

    .line 18
    .line 19
    const-string v2, "application/json"

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p1, v2, v2, v1}, Lka0/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lla0/a;)Lretrofit2/Call;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    const-string v0, "SandboxServiceFactory.sa\u2026    )\n        ).execute()"

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    return-object p1
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
.end method

.method public final e(Lla0/b;)Lretrofit2/Response;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla0/b;",
            ")",
            "Lretrofit2/Response<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/revolut/revolutpay/factory/sandbox/b;->a:Lcom/revolut/revolutpay/factory/sandbox/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/revolut/revolutpay/factory/sandbox/b;->c()Lka0/a;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lla0/b;->a()Ljava/lang/String;

    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    .line 16
    :goto_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    const-string p1, ""

    .line 19
    .line 20
    :cond_1
    const-string v1, "application/json"

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, p1, v1, v1}, Lka0/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    .line 28
    move-result-object p1

    .line 29
    return-object p1
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
.end method

.method public final f()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/sandbox/a;->b:Lcom/revolut/revolutpay/polling/d;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/revolut/revolutpay/polling/d;->pause()V

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
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "orderToken"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/sandbox/a;->b:Lcom/revolut/revolutpay/polling/d;

    .line 9
    .line 10
    new-instance v1, Lcom/revolut/revolutpay/ui/sandbox/a$c;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0, p1, p2}, Lcom/revolut/revolutpay/ui/sandbox/a$c;-><init>(Lcom/revolut/revolutpay/ui/sandbox/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Lcom/revolut/revolutpay/polling/d;->b(Lkotlin/jvm/functions/Function0;)Z

    .line 17
    move-result p1

    .line 18
    return p1
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
.end method

.method public final i()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/ui/sandbox/a;->b:Lcom/revolut/revolutpay/polling/d;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/revolut/revolutpay/polling/d;->a()V

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
.end method
