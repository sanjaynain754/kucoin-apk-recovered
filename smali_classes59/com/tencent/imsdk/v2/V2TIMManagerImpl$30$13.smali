.class Lcom/tencent/imsdk/v2/V2TIMManagerImpl$30$13;
.super Ljava/lang/Object;
.source "V2TIMManagerImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/imsdk/v2/V2TIMManagerImpl$30;->onAllReceiveMessageOptChanged(Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tencent/imsdk/v2/V2TIMManagerImpl$30;

.field final synthetic val$option:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;


# direct methods
.method public constructor <init>(Lcom/tencent/imsdk/v2/V2TIMManagerImpl$30;Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMManagerImpl$30$13;->this$1:Lcom/tencent/imsdk/v2/V2TIMManagerImpl$30;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/imsdk/v2/V2TIMManagerImpl$30$13;->val$option:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

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
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMManagerImpl$30$13;->this$1:Lcom/tencent/imsdk/v2/V2TIMManagerImpl$30;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/imsdk/v2/V2TIMManagerImpl$30;->this$0:Lcom/tencent/imsdk/v2/V2TIMManagerImpl;

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/tencent/imsdk/v2/V2TIMManagerImpl;->access$200(Lcom/tencent/imsdk/v2/V2TIMManagerImpl;)Ljava/util/List;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

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
    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMSDKListener;

    .line 25
    .line 26
    new-instance v2, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;

    .line 27
    .line 28
    .line 29
    invoke-direct {v2}, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;-><init>()V

    .line 30
    .line 31
    iget-object v3, p0, Lcom/tencent/imsdk/v2/V2TIMManagerImpl$30$13;->val$option:Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;->setReceiveMessageOptInfo(Lcom/tencent/imsdk/relationship/ReceiveMessageOptInfo;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMSDKListener;->onAllReceiveMessageOptChanged(Lcom/tencent/imsdk/v2/V2TIMReceiveMessageOptInfo;)V

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
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
