.class final Lcom/kubi/sdk/thread/impl/KThreadPoolImpl$backup$2;
.super Lkotlin/jvm/internal/Lambda;
.source "KThreadPoolImpl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/sdk/thread/impl/KThreadPoolImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lp00/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lp00/c;",
        "invoke",
        "()Lp00/c;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/kubi/sdk/thread/impl/KThreadPoolImpl$backup$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/thread/impl/KThreadPoolImpl$backup$2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/sdk/thread/impl/KThreadPoolImpl$backup$2;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/sdk/thread/impl/KThreadPoolImpl$backup$2;->INSTANCE:Lcom/kubi/sdk/thread/impl/KThreadPoolImpl$backup$2;

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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    return-void
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
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kubi/sdk/thread/impl/KThreadPoolImpl$backup$2;->invoke()Lp00/c;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lp00/c;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Lp00/c$a;

    invoke-direct {v0}, Lp00/c$a;-><init>()V

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Lp00/c$a;->i(I)V

    .line 4
    invoke-static {}, Lcom/kubi/sdk/thread/impl/KThreadPoolImpl;->b()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Lp00/c$a;->k(I)V

    .line 5
    const-string v1, "kPool-backup"

    invoke-virtual {v0, v1}, Lp00/c$a;->l(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lp00/c$a;->n(I)V

    .line 7
    new-instance v1, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    invoke-virtual {v0, v1}, Lp00/c$a;->h(Ljava/util/concurrent/BlockingQueue;)V

    .line 8
    new-instance v1, Lp00/c;

    invoke-direct {v1, v0}, Lp00/c;-><init>(Lp00/c$a;)V

    return-object v1
.end method
