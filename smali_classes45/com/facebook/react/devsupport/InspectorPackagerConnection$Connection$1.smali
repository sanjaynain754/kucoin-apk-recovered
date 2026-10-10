.class Lcom/facebook/react/devsupport/InspectorPackagerConnection$Connection$1;
.super Ljava/lang/Object;
.source "InspectorPackagerConnection.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/InspectorPackagerConnection$Connection;->reconnect()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/react/devsupport/InspectorPackagerConnection$Connection;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/InspectorPackagerConnection$Connection;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/InspectorPackagerConnection$Connection$1;->this$1:Lcom/facebook/react/devsupport/InspectorPackagerConnection$Connection;

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
.method public run()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/InspectorPackagerConnection$Connection$1;->this$1:Lcom/facebook/react/devsupport/InspectorPackagerConnection$Connection;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/devsupport/InspectorPackagerConnection$Connection;->a(Lcom/facebook/react/devsupport/InspectorPackagerConnection$Connection;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/devsupport/InspectorPackagerConnection$Connection$1;->this$1:Lcom/facebook/react/devsupport/InspectorPackagerConnection$Connection;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/InspectorPackagerConnection$Connection;->connect()V

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
.end method
