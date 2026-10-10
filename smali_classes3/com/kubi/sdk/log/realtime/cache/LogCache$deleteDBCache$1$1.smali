.class final Lcom/kubi/sdk/log/realtime/cache/LogCache$deleteDBCache$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "LogCache.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/sdk/log/realtime/cache/LogCache;->m(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $dbCache:Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;

.field final synthetic $logs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/sdk/log/realtime/db/LogData;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/kubi/sdk/log/realtime/cache/LogCache;


# direct methods
.method public constructor <init>(Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;Ljava/util/List;Lcom/kubi/sdk/log/realtime/cache/LogCache;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;",
            "Ljava/util/List<",
            "Lcom/kubi/sdk/log/realtime/db/LogData;",
            ">;",
            "Lcom/kubi/sdk/log/realtime/cache/LogCache;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/sdk/log/realtime/cache/LogCache$deleteDBCache$1$1;->$dbCache:Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/sdk/log/realtime/cache/LogCache$deleteDBCache$1$1;->$logs:Ljava/util/List;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/sdk/log/realtime/cache/LogCache$deleteDBCache$1$1;->this$0:Lcom/kubi/sdk/log/realtime/cache/LogCache;

    .line 7
    const/4 p1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kubi/sdk/log/realtime/cache/LogCache$deleteDBCache$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/kubi/sdk/log/realtime/cache/LogCache$deleteDBCache$1$1;->$dbCache:Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;

    invoke-virtual {v0}, Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;->d()Loz/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kubi/sdk/log/realtime/cache/LogCache$deleteDBCache$1$1;->$logs:Ljava/util/List;

    invoke-interface {v0, v1}, Loz/a;->d(Ljava/util/List;)V

    .line 3
    iget-object v0, p0, Lcom/kubi/sdk/log/realtime/cache/LogCache$deleteDBCache$1$1;->this$0:Lcom/kubi/sdk/log/realtime/cache/LogCache;

    invoke-static {v0}, Lcom/kubi/sdk/log/realtime/cache/LogCache;->f(Lcom/kubi/sdk/log/realtime/cache/LogCache;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    iget-object v1, p0, Lcom/kubi/sdk/log/realtime/cache/LogCache$deleteDBCache$1$1;->$logs:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    return-void
.end method
