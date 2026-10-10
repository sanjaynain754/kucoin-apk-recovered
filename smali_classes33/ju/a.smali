.class public final Lju/a;
.super Ljava/lang/Object;
.source "ThirdServiceLocator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0008\u0010\u0008\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/kubi/payment/third/ThirdServiceLocator;",
        "",
        "<init>",
        "()V",
        "provideFastRepository",
        "Lcom/kubi/payment/third/data/source/IThirdRepository;",
        "application",
        "Landroid/app/Application;",
        "createRemoteDataSource",
        "Lcom/kubi/payment/third/data/source/remote/ThirdRemoteDataSource;",
        "createThirdWebService",
        "Lcom/kubi/payment/third/data/source/remote/ThirdWebService;",
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
.field public static final a:Lju/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lju/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lju/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lju/a;->a:Lju/a;

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

.method public static final c(Landroid/app/Application;)Lcom/kubi/payment/third/data/source/a;
    .locals 2
    .param p0    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "application"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance p0, Lcom/kubi/payment/third/data/source/ThirdRepositoryImpl;

    .line 8
    .line 9
    sget-object v0, Lju/a;->a:Lju/a;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lju/a;->a()Lcom/kubi/payment/third/data/source/remote/ThirdRemoteDataSource;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    sget-object v1, Lcom/kubi/payment/a;->a:Lcom/kubi/payment/a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/kubi/payment/a;->e()Lkotlinx/coroutines/j0;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0, v1}, Lcom/kubi/payment/third/data/source/ThirdRepositoryImpl;-><init>(Lcom/kubi/payment/third/data/source/remote/ThirdRemoteDataSource;Lkotlinx/coroutines/j0;)V

    .line 23
    return-object p0
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


# virtual methods
.method public final a()Lcom/kubi/payment/third/data/source/remote/ThirdRemoteDataSource;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/third/data/source/remote/ThirdRemoteDataSource;

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
    invoke-virtual {p0, v2}, Lju/a;->b(Lretrofit2/Retrofit;)Lcom/kubi/payment/third/data/source/remote/a;

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
    invoke-direct {v0, v2, v1}, Lcom/kubi/payment/third/data/source/remote/ThirdRemoteDataSource;-><init>(Lcom/kubi/payment/third/data/source/remote/a;Lkotlinx/coroutines/j0;)V

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

.method public final b(Lretrofit2/Retrofit;)Lcom/kubi/payment/third/data/source/remote/a;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/kubi/payment/third/data/source/remote/a;

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
    check-cast p1, Lcom/kubi/payment/third/data/source/remote/a;

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
