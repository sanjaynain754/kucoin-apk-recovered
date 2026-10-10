.class Lcom/facebook/react/devsupport/DevServerHelper$3;
.super Landroid/os/AsyncTask;
.source "DevServerHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/DevServerHelper;->openInspectorConnection()V
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


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/DevServerHelper;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevServerHelper$3;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

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
.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/DevServerHelper$3;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 4

    .line 2
    invoke-static {}, Lcom/facebook/react/devsupport/InspectorFlags;->getFuseboxEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/facebook/react/devsupport/DevServerHelper$3;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    invoke-static {p1}, Lcom/facebook/react/devsupport/DevServerHelper;->a(Lcom/facebook/react/devsupport/DevServerHelper;)Landroid/content/Context;

    move-result-object p1

    .line 4
    invoke-static {p1}, Lcom/facebook/react/modules/systeminfo/AndroidInfoHelpers;->getInspectorHostMetadata(Landroid/content/Context;)Ljava/util/Map;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevServerHelper$3;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    new-instance v1, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection;

    iget-object v2, p0, Lcom/facebook/react/devsupport/DevServerHelper$3;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 6
    invoke-static {v2}, Lcom/facebook/react/devsupport/DevServerHelper;->h(Lcom/facebook/react/devsupport/DevServerHelper;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "deviceName"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/react/devsupport/DevServerHelper$3;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    invoke-static {v3}, Lcom/facebook/react/devsupport/DevServerHelper;->c(Lcom/facebook/react/devsupport/DevServerHelper;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, p1, v3}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/DevServerHelper;->f(Lcom/facebook/react/devsupport/DevServerHelper;Lcom/facebook/react/devsupport/IInspectorPackagerConnection;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/DevServerHelper$3;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    new-instance v0, Lcom/facebook/react/devsupport/InspectorPackagerConnection;

    .line 8
    invoke-static {p1}, Lcom/facebook/react/devsupport/DevServerHelper;->h(Lcom/facebook/react/devsupport/DevServerHelper;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/react/devsupport/DevServerHelper$3;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    invoke-static {v2}, Lcom/facebook/react/devsupport/DevServerHelper;->c(Lcom/facebook/react/devsupport/DevServerHelper;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/devsupport/InspectorPackagerConnection;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/facebook/react/devsupport/DevServerHelper;->f(Lcom/facebook/react/devsupport/DevServerHelper;Lcom/facebook/react/devsupport/IInspectorPackagerConnection;)V

    .line 9
    :goto_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/DevServerHelper$3;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    invoke-static {p1}, Lcom/facebook/react/devsupport/DevServerHelper;->b(Lcom/facebook/react/devsupport/DevServerHelper;)Lcom/facebook/react/devsupport/IInspectorPackagerConnection;

    move-result-object p1

    invoke-interface {p1}, Lcom/facebook/react/devsupport/IInspectorPackagerConnection;->connect()V

    const/4 p1, 0x0

    return-object p1
.end method
