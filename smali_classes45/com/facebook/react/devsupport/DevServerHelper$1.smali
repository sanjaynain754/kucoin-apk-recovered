.class Lcom/facebook/react/devsupport/DevServerHelper$1;
.super Landroid/os/AsyncTask;
.source "DevServerHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/DevServerHelper;->openPackagerConnection(Ljava/lang/String;Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/DevServerHelper;

.field final synthetic val$clientId:Ljava/lang/String;

.field final synthetic val$commandListener:Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/DevServerHelper;Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevServerHelper$1;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/react/devsupport/DevServerHelper$1;->val$commandListener:Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/facebook/react/devsupport/DevServerHelper$1;->val$clientId:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 10
    return-void
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
.end method


# virtual methods
.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/DevServerHelper$1;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 5

    .line 2
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 3
    new-instance v0, Lcom/facebook/react/devsupport/DevServerHelper$1$1;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/DevServerHelper$1$1;-><init>(Lcom/facebook/react/devsupport/DevServerHelper$1;)V

    const-string/jumbo v1, "reload"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    new-instance v0, Lcom/facebook/react/devsupport/DevServerHelper$1$2;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/DevServerHelper$1$2;-><init>(Lcom/facebook/react/devsupport/DevServerHelper$1;)V

    const-string v1, "devMenu"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    new-instance v0, Lcom/facebook/react/devsupport/DevServerHelper$1$3;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/DevServerHelper$1$3;-><init>(Lcom/facebook/react/devsupport/DevServerHelper$1;)V

    const-string v1, "captureHeap"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevServerHelper$1;->val$commandListener:Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;

    invoke-interface {v0}, Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;->customCommandHandlers()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 7
    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 8
    :cond_0
    new-instance v0, Lcom/facebook/react/packagerconnection/FileIoHandler;

    invoke-direct {v0}, Lcom/facebook/react/packagerconnection/FileIoHandler;-><init>()V

    invoke-virtual {v0}, Lcom/facebook/react/packagerconnection/FileIoHandler;->handlers()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 9
    new-instance v0, Lcom/facebook/react/devsupport/DevServerHelper$1$4;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/DevServerHelper$1$4;-><init>(Lcom/facebook/react/devsupport/DevServerHelper$1;)V

    .line 10
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevServerHelper$1;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    new-instance v2, Lcom/facebook/react/packagerconnection/JSPackagerClient;

    iget-object v3, p0, Lcom/facebook/react/devsupport/DevServerHelper$1;->val$clientId:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/react/devsupport/DevServerHelper$1;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    invoke-static {v4}, Lcom/facebook/react/devsupport/DevServerHelper;->e(Lcom/facebook/react/devsupport/DevServerHelper;)Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;

    move-result-object v4

    invoke-direct {v2, v3, v4, p1, v0}, Lcom/facebook/react/packagerconnection/JSPackagerClient;-><init>(Ljava/lang/String;Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;Ljava/util/Map;Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$ConnectionCallback;)V

    invoke-static {v1, v2}, Lcom/facebook/react/devsupport/DevServerHelper;->g(Lcom/facebook/react/devsupport/DevServerHelper;Lcom/facebook/react/packagerconnection/JSPackagerClient;)V

    .line 11
    iget-object p1, p0, Lcom/facebook/react/devsupport/DevServerHelper$1;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    invoke-static {p1}, Lcom/facebook/react/devsupport/DevServerHelper;->d(Lcom/facebook/react/devsupport/DevServerHelper;)Lcom/facebook/react/packagerconnection/JSPackagerClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/packagerconnection/JSPackagerClient;->init()V

    const/4 p1, 0x0

    return-object p1
.end method
