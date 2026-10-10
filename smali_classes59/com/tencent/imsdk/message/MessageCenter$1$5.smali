.class Lcom/tencent/imsdk/message/MessageCenter$1$5;
.super Ljava/lang/Object;
.source "MessageCenter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/imsdk/message/MessageCenter$1;->onReceiveMessageModified(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tencent/imsdk/message/MessageCenter$1;

.field final synthetic val$messageList:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/tencent/imsdk/message/MessageCenter$1;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageCenter$1$5;->this$1:Lcom/tencent/imsdk/message/MessageCenter$1;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/imsdk/message/MessageCenter$1$5;->val$messageList:Ljava/util/List;

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
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/message/MessageCenter$1$5;->this$1:Lcom/tencent/imsdk/message/MessageCenter$1;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/imsdk/message/MessageCenter$1;->this$0:Lcom/tencent/imsdk/message/MessageCenter;

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/tencent/imsdk/message/MessageCenter;->access$100(Lcom/tencent/imsdk/message/MessageCenter;)Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    monitor-enter v0

    .line 10
    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/tencent/imsdk/message/MessageCenter$1$5;->this$1:Lcom/tencent/imsdk/message/MessageCenter$1;

    .line 12
    .line 13
    iget-object v1, v1, Lcom/tencent/imsdk/message/MessageCenter$1;->this$0:Lcom/tencent/imsdk/message/MessageCenter;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lcom/tencent/imsdk/message/MessageCenter;->access$200(Lcom/tencent/imsdk/message/MessageCenter;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    check-cast v2, Lcom/tencent/imsdk/message/MessageListener;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/tencent/imsdk/message/MessageCenter$1$5;->val$messageList:Ljava/util/List;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Lcom/tencent/imsdk/message/MessageListener;->onReceiveMessageModified(Ljava/util/List;)V

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw v1
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
.end method
