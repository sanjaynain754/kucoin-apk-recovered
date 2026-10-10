.class public Lv4/c$a;
.super Ljava/lang/Object;
.source "AnimationBackendDelegateWithInactivityCheck.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lv4/c;


# direct methods
.method public constructor <init>(Lv4/c;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lv4/c$a;->b:Lv4/c;

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
.method public run()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lv4/c$a;->b:Lv4/c;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lv4/c$a;->b:Lv4/c;

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lv4/c;->o(Lv4/c;Z)V

    .line 10
    .line 11
    iget-object v1, p0, Lv4/c$a;->b:Lv4/c;

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lv4/c;->p(Lv4/c;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lv4/c$a;->b:Lv4/c;

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Lv4/c;->n(Lv4/c;)Lv4/c$b;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lv4/c$a;->b:Lv4/c;

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Lv4/c;->n(Lv4/c;)Lv4/c$b;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Lv4/c$b;->n()V

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :cond_0
    iget-object v1, p0, Lv4/c$a;->b:Lv4/c;

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Lv4/c;->q(Lv4/c;)V

    .line 43
    :cond_1
    :goto_0
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw v1
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
.end method
