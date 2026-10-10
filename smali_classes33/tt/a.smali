.class public final Ltt/a;
.super Ljava/lang/Object;
.source "FastServiceLocator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u000b\u001a\u00020\u0005H\u0007J\u0008\u0010\u000c\u001a\u00020\u0005H\u0002J\u0008\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\n\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/kubi/payment/fast/FastServiceLocator;",
        "",
        "<init>",
        "()V",
        "value",
        "Lcom/kubi/payment/fast/data/source/IFastRepository;",
        "repository",
        "getRepository",
        "()Lcom/kubi/payment/fast/data/source/IFastRepository;",
        "setRepository",
        "(Lcom/kubi/payment/fast/data/source/IFastRepository;)V",
        "provideFastRepository",
        "createRepository",
        "createRemoteDataSource",
        "Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;",
        "createFastWebService",
        "Lcom/kubi/payment/fast/data/source/remote/FastWebService;",
        "retrofit",
        "Lretrofit2/Retrofit;",
        "PaymentLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ltt/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static volatile b:Lcom/kubi/payment/fast/data/source/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ltt/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ltt/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Ltt/a;->a:Ltt/a;

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
.end method

.method public static final d()Lcom/kubi/payment/fast/data/source/a;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Ltt/a;->a:Ltt/a;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Ltt/a;->b:Lcom/kubi/payment/fast/data/source/a;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Ltt/a;->b:Lcom/kubi/payment/fast/data/source/a;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ltt/a;->c()Lcom/kubi/payment/fast/data/source/a;

    .line 15
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    monitor-exit v0

    .line 20
    return-object v1

    .line 21
    :goto_1
    monitor-exit v0

    .line 22
    throw v1
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


# virtual methods
.method public final a(Lretrofit2/Retrofit;)Lcom/kubi/payment/fast/data/source/remote/a;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/kubi/payment/fast/data/source/remote/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const-string v0, "create(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    check-cast p1, Lcom/kubi/payment/fast/data/source/remote/a;

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
.end method

.method public final b()Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/payment/a;->a:Lcom/kubi/payment/a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/payment/a;->h()Lretrofit2/Retrofit;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v2}, Ltt/a;->a(Lretrofit2/Retrofit;)Lcom/kubi/payment/fast/data/source/remote/a;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/kubi/payment/a;->e()Lkotlinx/coroutines/j0;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v1}, Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;-><init>(Lcom/kubi/payment/fast/data/source/remote/a;Lkotlinx/coroutines/j0;)V

    .line 20
    return-object v0
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

.method public final c()Lcom/kubi/payment/fast/data/source/a;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ltt/a;->b()Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    sget-object v2, Lcom/kubi/payment/a;->a:Lcom/kubi/payment/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/kubi/payment/a;->e()Lkotlinx/coroutines/j0;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcom/kubi/payment/fast/data/source/FastRepositoryImpl;-><init>(Lcom/kubi/payment/fast/data/source/remote/FastRemoteDataSource;Lkotlinx/coroutines/j0;)V

    .line 16
    .line 17
    sput-object v0, Ltt/a;->b:Lcom/kubi/payment/fast/data/source/a;

    .line 18
    return-object v0
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
