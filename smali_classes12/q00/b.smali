.class public final Lq00/b;
.super Ljava/lang/Object;
.source "ExecutorMonitorFactory.kt"

# interfaces
.implements Lq00/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lq00/b;",
        "Lq00/d;",
        "",
        "enableWaitTime",
        "<init>",
        "(Z)V",
        "Lcom/kubi/sdk/thread/IKExecutor;",
        "executor",
        "Lq00/c;",
        "a",
        "(Lcom/kubi/sdk/thread/IKExecutor;)Lq00/c;",
        "Z",
        "ThreadPoolMonitor_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lq00/b;->a:Z

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lq00/b;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public a(Lcom/kubi/sdk/thread/IKExecutor;)Lq00/c;
    .locals 4
    .param p1    # Lcom/kubi/sdk/thread/IKExecutor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "executor"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/sdk/thread/monitor/ExecutorTimerMonitor;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Lcom/kubi/sdk/thread/IKExecutor;->getName()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "kPool-main"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const-wide/16 v1, 0x50

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    const-wide/16 v1, 0x2bc

    .line 25
    .line 26
    :goto_0
    iget-boolean v3, p0, Lq00/b;->a:Z

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p1, v1, v2, v3}, Lcom/kubi/sdk/thread/monitor/ExecutorTimerMonitor;-><init>(Lcom/kubi/sdk/thread/IKExecutor;JZ)V

    .line 30
    .line 31
    sget-object v1, Lq00/a;->a:Lq00/a;

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Lcom/kubi/sdk/thread/IKExecutor;->getName()Ljava/lang/String;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p1, v0}, Lq00/a;->a(Ljava/lang/String;Lcom/kubi/sdk/thread/monitor/ExecutorTimerMonitor;)V

    .line 39
    return-object v0
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method
