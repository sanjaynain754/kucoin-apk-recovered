.class public final Lcom/facebook/react/modules/intent/IntentModule$waitForActivityAndGetInitialURL$1;
.super Ljava/lang/Object;
.source "IntentModule.kt"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/intent/IntentModule;->waitForActivityAndGetInitialURL(Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0008\u0010\u0004\u001a\u00020\u0003H\u0016J\u0008\u0010\u0005\u001a\u00020\u0003H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/facebook/react/modules/intent/IntentModule$waitForActivityAndGetInitialURL$1",
        "Lcom/facebook/react/bridge/LifecycleEventListener;",
        "onHostResume",
        "",
        "onHostPause",
        "onHostDestroy",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/intent/IntentModule;


# direct methods
.method public constructor <init>(Lcom/facebook/react/modules/intent/IntentModule;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/modules/intent/IntentModule$waitForActivityAndGetInitialURL$1;->this$0:Lcom/facebook/react/modules/intent/IntentModule;

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
.method public onHostDestroy()V
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

.method public onHostPause()V
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

.method public onHostResume()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/modules/intent/IntentModule$waitForActivityAndGetInitialURL$1;->this$0:Lcom/facebook/react/modules/intent/IntentModule;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/modules/intent/IntentModule;->access$getReactApplicationContext(Lcom/facebook/react/modules/intent/IntentModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/modules/intent/IntentModule$waitForActivityAndGetInitialURL$1;->this$0:Lcom/facebook/react/modules/intent/IntentModule;

    .line 12
    monitor-enter v0

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-static {v0}, Lcom/facebook/react/modules/intent/IntentModule;->access$getPendingOpenURLPromises$p(Lcom/facebook/react/modules/intent/IntentModule;)Ljava/util/List;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    move-result v2

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    check-cast v2, Lcom/facebook/react/bridge/Promise;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lcom/facebook/react/modules/intent/IntentModule;->getInitialURL(Lcom/facebook/react/bridge/Promise;)V

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const/4 v1, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lcom/facebook/react/modules/intent/IntentModule;->access$setInitialURLListener$p(Lcom/facebook/react/modules/intent/IntentModule;Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lcom/facebook/react/modules/intent/IntentModule;->access$getPendingOpenURLPromises$p(Lcom/facebook/react/modules/intent/IntentModule;)Ljava/util/List;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 50
    .line 51
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    monitor-exit v0

    .line 53
    return-void

    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    throw v1
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
.end method
