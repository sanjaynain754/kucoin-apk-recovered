.class Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl$21;
.super Ljava/lang/Object;
.source "V2TIMMessageManagerImpl.java"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMCompleteCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl;->modifyMessage(Lcom/tencent/imsdk/v2/V2TIMMessage;Lcom/tencent/imsdk/v2/V2TIMCompleteCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/tencent/imsdk/v2/V2TIMCompleteCallback<",
        "Lcom/tencent/imsdk/message/Message;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl;

.field final synthetic val$callback:Lcom/tencent/imsdk/v2/V2TIMCompleteCallback;


# direct methods
.method public constructor <init>(Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl;Lcom/tencent/imsdk/v2/V2TIMCompleteCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl$21;->this$0:Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl$21;->val$callback:Lcom/tencent/imsdk/v2/V2TIMCompleteCallback;

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
.method public onComplete(ILjava/lang/String;Lcom/tencent/imsdk/message/Message;)V
    .locals 1

    if-eqz p3, :cond_0

    .line 2
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMMessage;

    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;-><init>()V

    .line 3
    invoke-virtual {v0, p3}, Lcom/tencent/imsdk/v2/V2TIMMessage;->setMessage(Lcom/tencent/imsdk/message/Message;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object p3, p0, Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl$21;->val$callback:Lcom/tencent/imsdk/v2/V2TIMCompleteCallback;

    if-eqz p3, :cond_1

    .line 5
    invoke-interface {p3, p1, p2, v0}, Lcom/tencent/imsdk/v2/V2TIMCompleteCallback;->onComplete(ILjava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic onComplete(ILjava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p3, Lcom/tencent/imsdk/message/Message;

    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/imsdk/v2/V2TIMMessageManagerImpl$21;->onComplete(ILjava/lang/String;Lcom/tencent/imsdk/message/Message;)V

    return-void
.end method
