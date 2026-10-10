.class Lcom/facebook/react/devsupport/BridgeDevSupportManager$2;
.super Ljava/lang/Object;
.source "BridgeDevSupportManager.java"

# interfaces
.implements Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/BridgeDevSupportManager;->getExecutorConnectCallback(Lcom/facebook/react/common/futures/SimpleSettableFuture;)Lcom/facebook/react/devsupport/WebsocketJavaScriptExecutor$JSExecutorConnectCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;

.field final synthetic val$future:Lcom/facebook/react/common/futures/SimpleSettableFuture;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/BridgeDevSupportManager;Lcom/facebook/react/common/futures/SimpleSettableFuture;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$2;->this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$2;->val$future:Lcom/facebook/react/common/futures/SimpleSettableFuture;

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
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$2;->this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->hideDevLoadingView()V

    .line 6
    .line 7
    const-string v0, "ReactNative"

    .line 8
    .line 9
    const-string v1, "Failed to connect to debugger!"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p1}, Lx3/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$2;->val$future:Lcom/facebook/react/common/futures/SimpleSettableFuture;

    .line 15
    .line 16
    new-instance v1, Ljava/io/IOException;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$2;->this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->getApplicationContext()Landroid/content/Context;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    sget v3, Lcom/facebook/react/R$string;->catalyst_debug_error:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/facebook/react/common/futures/SimpleSettableFuture;->setException(Ljava/lang/Exception;)V

    .line 35
    return-void
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
.end method

.method public onSuccess()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$2;->val$future:Lcom/facebook/react/common/futures/SimpleSettableFuture;

    .line 3
    .line 4
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/facebook/react/common/futures/SimpleSettableFuture;->set(Ljava/lang/Object;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$2;->this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->hideDevLoadingView()V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
