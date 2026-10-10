.class public final Lcom/kubi/sdk/site/startup/SiteConfigFetchStartUpTask$run$3;
.super Ljava/lang/Object;
.source "SiteInitStartupTask.kt"

# interfaces
.implements Lcom/blankj/utilcode/util/NetworkUtils$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/sdk/site/startup/SiteConfigFetchStartUpTask;->run(Landroid/app/Application;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "com/kubi/sdk/site/startup/SiteConfigFetchStartUpTask$run$3",
        "Lcom/blankj/utilcode/util/NetworkUtils$OnNetworkStatusChangedListener;",
        "onDisconnected",
        "",
        "onConnected",
        "networkType",
        "Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;",
        "LSiteConfig_googleRelease"
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
.field public final synthetic a:Lkotlinx/coroutines/m0;

.field public final synthetic b:Landroid/app/Application;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/m0;Landroid/app/Application;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/sdk/site/startup/SiteConfigFetchStartUpTask$run$3;->a:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/sdk/site/startup/SiteConfigFetchStartUpTask$run$3;->b:Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public a(Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/sdk/site/startup/SiteConfigFetchStartUpTask$run$3;->a:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    new-instance v3, Lcom/kubi/sdk/site/startup/SiteConfigFetchStartUpTask$run$3$onConnected$1;

    .line 5
    .line 6
    iget-object p1, p0, Lcom/kubi/sdk/site/startup/SiteConfigFetchStartUpTask$run$3;->b:Landroid/app/Application;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v3, p1, v1}, Lcom/kubi/sdk/site/startup/SiteConfigFetchStartUpTask$run$3$onConnected$1;-><init>(Landroid/app/Application;Lkotlin/coroutines/Continuation;)V

    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onDisconnected()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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
.end method
