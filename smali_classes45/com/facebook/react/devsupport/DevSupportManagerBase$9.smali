.class Lcom/facebook/react/devsupport/DevSupportManagerBase$9;
.super Ljava/lang/Object;
.source "DevSupportManagerBase.java"

# interfaces
.implements Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/DevSupportManagerBase;->reload()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$9;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

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

.method public static synthetic a(Lcom/facebook/react/devsupport/DevSupportManagerBase$9;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase$9;->lambda$onPackagerDevMenuCommand$1()V

    .line 4
    return-void
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic b(Lcom/facebook/react/devsupport/DevSupportManagerBase$9;Lcom/facebook/react/packagerconnection/Responder;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase$9;->lambda$onCaptureHeapCommand$2(Lcom/facebook/react/packagerconnection/Responder;)V

    .line 4
    return-void
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

.method public static synthetic c(Lcom/facebook/react/devsupport/DevSupportManagerBase$9;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase$9;->lambda$onPackagerReloadCommand$0()V

    .line 4
    return-void
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private synthetic lambda$onCaptureHeapCommand$2(Lcom/facebook/react/packagerconnection/Responder;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$9;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->z(Lcom/facebook/react/devsupport/DevSupportManagerBase;Lcom/facebook/react/packagerconnection/Responder;)V

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

.method private synthetic lambda$onPackagerDevMenuCommand$1()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$9;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog()V

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
.end method

.method private synthetic lambda$onPackagerReloadCommand$0()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$9;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->handleReloadJS()V

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
.end method


# virtual methods
.method public customCommandHandlers()Ljava/util/Map;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/packagerconnection/RequestHandler;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$9;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->u(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Ljava/util/Map;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public onCaptureHeapCommand(Lcom/facebook/react/packagerconnection/Responder;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/devsupport/b0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/b0;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase$9;Lcom/facebook/react/packagerconnection/Responder;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 9
    return-void
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

.method public onPackagerConnected()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$9;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->y(Lcom/facebook/react/devsupport/DevSupportManagerBase;Z)V

    .line 7
    return-void
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

.method public onPackagerDevMenuCommand()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/devsupport/d0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/d0;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase$9;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 9
    return-void
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

.method public onPackagerDisconnected()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$9;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->y(Lcom/facebook/react/devsupport/DevSupportManagerBase;Z)V

    .line 7
    return-void
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

.method public onPackagerReloadCommand()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/devsupport/InspectorFlags;->getFuseboxEnabled()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$9;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->w(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Lcom/facebook/react/devsupport/DevServerHelper;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/DevServerHelper;->disableDebugger()V

    .line 16
    .line 17
    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/c0;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/c0;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase$9;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 24
    return-void
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
.end method
