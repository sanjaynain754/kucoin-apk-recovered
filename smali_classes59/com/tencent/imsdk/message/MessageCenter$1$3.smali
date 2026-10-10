.class Lcom/tencent/imsdk/message/MessageCenter$1$3;
.super Ljava/lang/Object;
.source "MessageCenter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/imsdk/message/MessageCenter$1;->onReceiveGroupMessageReceipt(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tencent/imsdk/message/MessageCenter$1;

.field final synthetic val$receiptList:Ljava/util/List;


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
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageCenter$1$3;->this$1:Lcom/tencent/imsdk/message/MessageCenter$1;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/imsdk/message/MessageCenter$1$3;->val$receiptList:Ljava/util/List;

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
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/message/MessageCenter$1$3;->this$1:Lcom/tencent/imsdk/message/MessageCenter$1;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/imsdk/message/MessageCenter$1;->this$0:Lcom/tencent/imsdk/message/MessageCenter;

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/tencent/imsdk/message/MessageCenter;->access$200(Lcom/tencent/imsdk/message/MessageCenter;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    check-cast v1, Lcom/tencent/imsdk/message/MessageListener;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/tencent/imsdk/message/MessageCenter$1$3;->val$receiptList:Ljava/util/List;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/message/MessageListener;->onReceiveGroupMessageReceipt(Ljava/util/List;)V

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
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
.end method
