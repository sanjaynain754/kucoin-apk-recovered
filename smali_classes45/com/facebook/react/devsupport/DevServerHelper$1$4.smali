.class Lcom/facebook/react/devsupport/DevServerHelper$1$4;
.super Ljava/lang/Object;
.source "DevServerHelper.java"

# interfaces
.implements Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/DevServerHelper$1;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/react/devsupport/DevServerHelper$1;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/DevServerHelper$1;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevServerHelper$1$4;->this$1:Lcom/facebook/react/devsupport/DevServerHelper$1;

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
.method public onConnected()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevServerHelper$1$4;->this$1:Lcom/facebook/react/devsupport/DevServerHelper$1;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/facebook/react/devsupport/DevServerHelper$1;->val$commandListener:Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;->onPackagerConnected()V

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
.end method

.method public onDisconnected()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevServerHelper$1$4;->this$1:Lcom/facebook/react/devsupport/DevServerHelper$1;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/facebook/react/devsupport/DevServerHelper$1;->val$commandListener:Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;->onPackagerDisconnected()V

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
.end method
