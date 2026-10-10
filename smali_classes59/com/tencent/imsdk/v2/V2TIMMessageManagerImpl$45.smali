.class Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl$45;
.super Ljava/lang/Object;
.source "V2TIMMessageManagerImpl.java"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl;->getGroupMessageReadReceipts(Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/tencent/imsdk/v2/V2TIMValueCallback<",
        "Ljava/util/List<",
        "Lcom/tencent/imsdk/message/GroupMessageReceipt;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl;

.field final synthetic val$callback:Lcom/tencent/imsdk/v2/V2TIMValueCallback;

.field final synthetic val$results:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl$45;->this$0:Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl$45;->val$results:Ljava/util/List;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl$45;->val$callback:Lcom/tencent/imsdk/v2/V2TIMValueCallback;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 105
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl$45;->val$callback:Lcom/tencent/imsdk/v2/V2TIMValueCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onError(ILjava/lang/String;)V

    .line 8
    :cond_0
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

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl$45;->onSuccess(Ljava/util/List;)V

    return-void
.end method

.method public onSuccess(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/message/GroupMessageReceipt;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/imsdk/message/GroupMessageReceipt;

    .line 3
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMMessageReceipt;

    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMMessageReceipt;-><init>()V

    .line 4
    new-instance v2, Lcom/tencent/imsdk/message/GroupMessageReceipt;

    invoke-direct {v2}, Lcom/tencent/imsdk/message/GroupMessageReceipt;-><init>()V

    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/GroupMessageReceipt;->getGroupID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tencent/imsdk/message/GroupMessageReceipt;->setGroupID(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/GroupMessageReceipt;->getMsgID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tencent/imsdk/message/GroupMessageReceipt;->setMsgID(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/GroupMessageReceipt;->getReadCount()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/tencent/imsdk/message/GroupMessageReceipt;->setReadCount(J)V

    .line 8
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/GroupMessageReceipt;->getUnreadCount()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/tencent/imsdk/message/GroupMessageReceipt;->setUnreadCount(J)V

    .line 9
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMMessageReceipt;->setGroupMessageReceipt(Lcom/tencent/imsdk/message/GroupMessageReceipt;)V

    .line 10
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl$45;->val$results:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl$45;->val$callback:Lcom/tencent/imsdk/v2/V2TIMValueCallback;

    if-eqz p1, :cond_1

    .line 12
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl$45;->val$results:Ljava/util/List;

    invoke-interface {p1, v0}, Lcom/tencent/imsdk/v2/V2TIMValueCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
