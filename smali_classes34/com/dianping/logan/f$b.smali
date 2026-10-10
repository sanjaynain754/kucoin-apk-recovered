.class public Lcom/dianping/logan/f$b;
.super Ljava/lang/Object;
.source "LoganThread.java"

# interfaces
.implements Lcom/dianping/logan/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dianping/logan/f;->i(Lcom/dianping/logan/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/dianping/logan/f;


# direct methods
.method public constructor <init>(Lcom/dianping/logan/f;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/dianping/logan/f$b;->a:Lcom/dianping/logan/f;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/dianping/logan/f$b;->a:Lcom/dianping/logan/f;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/dianping/logan/f;->a(Lcom/dianping/logan/f;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/dianping/logan/f$b;->a:Lcom/dianping/logan/f;

    .line 10
    .line 11
    .line 12
    invoke-static {v1, p1}, Lcom/dianping/logan/f;->b(Lcom/dianping/logan/f;I)I

    .line 13
    .line 14
    const/16 v1, 0x2712

    .line 15
    .line 16
    if-ne p1, v1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lcom/dianping/logan/f$b;->a:Lcom/dianping/logan/f;

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lcom/dianping/logan/f;->d(Lcom/dianping/logan/f;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    iget-object v1, p0, Lcom/dianping/logan/f$b;->a:Lcom/dianping/logan/f;

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lcom/dianping/logan/f;->c(Lcom/dianping/logan/f;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->addAll(Ljava/util/Collection;)Z

    .line 32
    .line 33
    iget-object p1, p0, Lcom/dianping/logan/f$b;->a:Lcom/dianping/logan/f;

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lcom/dianping/logan/f;->c(Lcom/dianping/logan/f;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 41
    .line 42
    iget-object p1, p0, Lcom/dianping/logan/f$b;->a:Lcom/dianping/logan/f;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/dianping/logan/f;->n()V

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw p1
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
.end method
