.class public final Ldu/a;
.super Ljava/lang/Object;
.source "KuCardServiceLocator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0008\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/payment/kucard/KuCardServiceLocator;",
        "",
        "<init>",
        "()V",
        "provideKuCardRepository",
        "Lcom/kubi/payment/kucard/data/source/IKuCardRepository;",
        "createRemoteDataSource",
        "Lcom/kubi/payment/kucard/data/source/remote/KuCardRemoteDataSource;",
        "createWebService",
        "Lcom/kubi/payment/kucard/data/source/remote/KuCardWebService;",
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
.field public static final a:Ldu/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ldu/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ldu/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Ldu/a;->a:Ldu/a;

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


# virtual methods
.method public final a()Lcom/kubi/payment/kucard/data/source/remote/KuCardRemoteDataSource;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/kucard/data/source/remote/KuCardRemoteDataSource;

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
    invoke-virtual {p0, v2}, Ldu/a;->b(Lretrofit2/Retrofit;)Lcom/kubi/payment/kucard/data/source/remote/a;

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
    invoke-direct {v0, v2, v1}, Lcom/kubi/payment/kucard/data/source/remote/KuCardRemoteDataSource;-><init>(Lcom/kubi/payment/kucard/data/source/remote/a;Lkotlinx/coroutines/j0;)V

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

.method public final b(Lretrofit2/Retrofit;)Lcom/kubi/payment/kucard/data/source/remote/a;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/kubi/payment/kucard/data/source/remote/a;

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
    check-cast p1, Lcom/kubi/payment/kucard/data/source/remote/a;

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

.method public final c()Lcom/kubi/payment/kucard/data/source/a;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/kucard/data/source/KuCardRepositoryImpl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ldu/a;->a()Lcom/kubi/payment/kucard/data/source/remote/KuCardRemoteDataSource;

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
    invoke-direct {v0, v1, v2}, Lcom/kubi/payment/kucard/data/source/KuCardRepositoryImpl;-><init>(Lcom/kubi/payment/kucard/data/source/remote/KuCardRemoteDataSource;Lkotlinx/coroutines/j0;)V

    .line 16
    return-object v0
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
