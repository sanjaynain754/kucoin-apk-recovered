.class public Li2/e$a;
.super Landroid/content/BroadcastReceiver;
.source "DefaultConnectivityMonitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Li2/e;


# direct methods
.method public constructor <init>(Li2/e;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Li2/e$a;->a:Li2/e;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

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
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object p2, p0, Li2/e$a;->a:Li2/e;

    .line 3
    .line 4
    iget-boolean v0, p2, Li2/e;->d:Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p1}, Li2/e;->b(Landroid/content/Context;)Z

    .line 8
    move-result p1

    .line 9
    .line 10
    iput-boolean p1, p2, Li2/e;->d:Z

    .line 11
    .line 12
    iget-object p1, p0, Li2/e$a;->a:Li2/e;

    .line 13
    .line 14
    iget-boolean p1, p1, Li2/e;->d:Z

    .line 15
    .line 16
    if-eq v0, p1, :cond_1

    .line 17
    const/4 p1, 0x3

    .line 18
    .line 19
    const-string p2, "ConnectivityMonitor"

    .line 20
    .line 21
    .line 22
    invoke-static {p2, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 23
    move-result p1

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    new-instance p1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    const-string v0, "connectivity changed, isConnected: "

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    iget-object v0, p0, Li2/e$a;->a:Li2/e;

    .line 38
    .line 39
    iget-boolean v0, v0, Li2/e;->d:Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    :cond_0
    iget-object p1, p0, Li2/e$a;->a:Li2/e;

    .line 52
    .line 53
    iget-object p2, p1, Li2/e;->c:Li2/c$a;

    .line 54
    .line 55
    iget-boolean p1, p1, Li2/e;->d:Z

    .line 56
    .line 57
    .line 58
    invoke-interface {p2, p1}, Li2/c$a;->a(Z)V

    .line 59
    :cond_1
    return-void
.end method
