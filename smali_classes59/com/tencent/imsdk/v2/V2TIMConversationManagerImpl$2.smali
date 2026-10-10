.class Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$2;
.super Ljava/lang/Object;
.source "V2TIMConversationManagerImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->setConversationListener(Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;

.field final synthetic val$listener:Lcom/tencent/imsdk/v2/V2TIMConversationListener;


# direct methods
.method public constructor <init>(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$2;->this$0:Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$2;->val$listener:Lcom/tencent/imsdk/v2/V2TIMConversationListener;

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
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$2;->this$0:Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->access$300(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;)Lcom/tencent/imsdk/v2/V2TIMConversationListener;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$2;->this$0:Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->access$200(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;)Ljava/util/List;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$2;->this$0:Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->access$300(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;)Lcom/tencent/imsdk/v2/V2TIMConversationListener;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$2;->val$listener:Lcom/tencent/imsdk/v2/V2TIMConversationListener;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$2;->this$0:Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->access$200(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;)Ljava/util/List;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$2;->val$listener:Lcom/tencent/imsdk/v2/V2TIMConversationListener;

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$2;->this$0:Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl$2;->val$listener:Lcom/tencent/imsdk/v2/V2TIMConversationListener;

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;->access$302(Lcom/tencent/imsdk/v2/V2TIMConversationManagerImpl;Lcom/tencent/imsdk/v2/V2TIMConversationListener;)Lcom/tencent/imsdk/v2/V2TIMConversationListener;

    .line 46
    return-void
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
