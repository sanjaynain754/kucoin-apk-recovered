.class Lcom/facebook/react/devsupport/InspectorPackagerConnection$1;
.super Ljava/lang/Object;
.source "InspectorPackagerConnection.java"

# interfaces
.implements Lcom/facebook/react/bridge/Inspector$RemoteConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/InspectorPackagerConnection;->handleConnect(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/InspectorPackagerConnection;

.field final synthetic val$pageId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/InspectorPackagerConnection;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/InspectorPackagerConnection$1;->this$0:Lcom/facebook/react/devsupport/InspectorPackagerConnection;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/react/devsupport/InspectorPackagerConnection$1;->val$pageId:Ljava/lang/String;

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
.method public onDisconnect()V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/InspectorPackagerConnection$1;->this$0:Lcom/facebook/react/devsupport/InspectorPackagerConnection;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/devsupport/InspectorPackagerConnection;->a(Lcom/facebook/react/devsupport/InspectorPackagerConnection;)Ljava/util/Map;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/facebook/react/devsupport/InspectorPackagerConnection$1;->val$pageId:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/react/devsupport/InspectorPackagerConnection$1;->this$0:Lcom/facebook/react/devsupport/InspectorPackagerConnection;

    .line 14
    .line 15
    const-string v1, "disconnect"

    .line 16
    .line 17
    iget-object v2, p0, Lcom/facebook/react/devsupport/InspectorPackagerConnection$1;->val$pageId:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2}, Lcom/facebook/react/devsupport/InspectorPackagerConnection;->b(Lcom/facebook/react/devsupport/InspectorPackagerConnection;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Lcom/facebook/react/devsupport/InspectorPackagerConnection;->c(Lcom/facebook/react/devsupport/InspectorPackagerConnection;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    .line 28
    const-string v1, "InspectorPackagerConnection"

    .line 29
    .line 30
    const-string v2, "Couldn\'t send event to packager"

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2, v0}, Lx3/a;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    return-void
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

.method public onMessage(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/InspectorPackagerConnection$1;->this$0:Lcom/facebook/react/devsupport/InspectorPackagerConnection;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/facebook/react/devsupport/InspectorPackagerConnection$1;->val$pageId:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lcom/facebook/react/devsupport/InspectorPackagerConnection;->d(Lcom/facebook/react/devsupport/InspectorPackagerConnection;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    return-void

    .line 9
    :catch_0
    move-exception p1

    .line 10
    .line 11
    const-string v0, "InspectorPackagerConnection"

    .line 12
    .line 13
    const-string v1, "Couldn\'t send event to packager"

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p1}, Lx3/a;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
