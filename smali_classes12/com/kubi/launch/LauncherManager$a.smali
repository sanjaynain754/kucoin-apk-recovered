.class public final Lcom/kubi/launch/LauncherManager$a;
.super Ljava/lang/Object;
.source "LauncherManager.kt"

# interfaces
.implements Lcom/kubi/sdk/startup/StartupDispatcher$IStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/launch/LauncherManager;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/launch/LauncherManager$listener$1",
        "Lcom/kubi/sdk/startup/StartupDispatcher$IStateListener;",
        "onStateChanged",
        "",
        "newState",
        "",
        "LAppFacade_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/kubi/launch/LauncherManager;


# direct methods
.method public constructor <init>(Lcom/kubi/launch/LauncherManager;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/launch/LauncherManager$a;->a:Lcom/kubi/launch/LauncherManager;

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
.end method


# virtual methods
.method public onStateChanged(I)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "SplashActivity"

    .line 3
    const/4 v1, 0x4

    .line 4
    .line 5
    if-lt p1, v1, :cond_0

    .line 6
    .line 7
    const-string v2, "enable task finish 1"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    iget-object v2, p0, Lcom/kubi/launch/LauncherManager$a;->a:Lcom/kubi/launch/LauncherManager;

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Lcom/kubi/launch/LauncherManager;->i(Lcom/kubi/launch/LauncherManager;)Lkotlinx/coroutines/w;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    invoke-interface {v2, v3}, Lkotlinx/coroutines/w;->n(Ljava/lang/Object;)Z

    .line 22
    .line 23
    :cond_0
    if-ne p1, v1, :cond_1

    .line 24
    .line 25
    :try_start_0
    sget-object p1, Lcom/kubi/sdk/util/i1;->a:Lcom/kubi/sdk/util/i1;

    .line 26
    .line 27
    const-string v1, "task_done"

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Lcom/kubi/sdk/util/i1;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    return-void

    .line 32
    :catch_0
    move-exception p1

    .line 33
    .line 34
    .line 35
    invoke-static {v0, p1}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    :cond_1
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method
