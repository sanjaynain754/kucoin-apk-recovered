.class Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$13;
.super Ljava/lang/Object;
.source "V2TIMConversationManagerImpl.java"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->deleteConversation(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V
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
        "Lcom/tencent/imsdk/conversation/ConversationOperationResult;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;

.field final synthetic val$callback:Lcom/tencent/imsdk/v2/V2TIMCallback;


# direct methods
.method public constructor <init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$13;->this$0:Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$13;->val$callback:Lcom/tencent/imsdk/v2/V2TIMCallback;

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
.method public onError(ILjava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$13;->val$callback:Lcom/tencent/imsdk/v2/V2TIMCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/tencent/imsdk/v2/V2TIMCallback;->onError(ILjava/lang/String;)V

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

    invoke-virtual {p0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$13;->onSuccess(Ljava/util/List;)V

    return-void
.end method

.method public onSuccess(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/imsdk/conversation/ConversationOperationResult;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$13;->val$callback:Lcom/tencent/imsdk/v2/V2TIMCallback;

    if-eqz v0, :cond_1

    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/imsdk/conversation/ConversationOperationResult;

    invoke-virtual {v1}, Lcom/tencent/imsdk/conversation/ConversationOperationResult;->getResultCode()I

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$13;->val$callback:Lcom/tencent/imsdk/v2/V2TIMCallback;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/imsdk/conversation/ConversationOperationResult;

    invoke-virtual {v2}, Lcom/tencent/imsdk/conversation/ConversationOperationResult;->getResultCode()I

    move-result v2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/imsdk/conversation/ConversationOperationResult;

    invoke-virtual {p1}, Lcom/tencent/imsdk/conversation/ConversationOperationResult;->getResultInfo()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Lcom/tencent/imsdk/v2/V2TIMCallback;->onError(ILjava/lang/String;)V

    return-void

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$13;->val$callback:Lcom/tencent/imsdk/v2/V2TIMCallback;

    invoke-interface {p1}, Lcom/tencent/imsdk/v2/V2TIMCallback;->onSuccess()V

    :cond_1
    return-void
.end method
