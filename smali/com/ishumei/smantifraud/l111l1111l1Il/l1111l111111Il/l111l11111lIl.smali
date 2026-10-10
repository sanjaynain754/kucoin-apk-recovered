.class public final Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111lIl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111lIl$l1111l111111Il;
    }
.end annotation


# instance fields
.field private final l1111l111111Il:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 6
    .line 7
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 10
    .line 11
    .line 12
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 13
    .line 14
    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;

    .line 15
    .line 16
    .line 17
    invoke-direct {v7}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;-><init>()V

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    const/16 v2, 0xa

    .line 21
    .line 22
    const-wide/16 v3, 0x0

    .line 23
    .line 24
    .line 25
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 26
    .line 27
    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il:Ljava/util/concurrent/Executor;

    .line 28
    return-void
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
.end method


# virtual methods
.method public final l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "post-error"

    invoke-virtual {p1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;)Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;

    move-result-object p2

    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111lIl$l1111l111111Il;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111lIl$l1111l111111Il;-><init>(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl<",
            "*>;)V"
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l11l11IlIIll()V

    const-string v0, "post-response"

    invoke-virtual {p1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111lIl$l1111l111111Il;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111lIl$l1111l111111Il;-><init>(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;Ljava/lang/Runnable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl<",
            "*>;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l11l11IlIIll()V

    const-string p3, "post-response"

    invoke-virtual {p1, p3}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Ljava/lang/String;)V

    iget-object p3, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111lIl;->l1111l111111Il:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111lIl$l1111l111111Il;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111lIl$l1111l111111Il;-><init>(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;Ljava/lang/Runnable;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
