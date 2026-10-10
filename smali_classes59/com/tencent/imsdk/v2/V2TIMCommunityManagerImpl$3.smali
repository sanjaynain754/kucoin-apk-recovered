.class Lcom/tencent/imsdk/v2/V2TIMCommunityManagerImpl$3;
.super Ljava/lang/Object;
.source "V2TIMCommunityManagerImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/imsdk/v2/V2TIMCommunityManagerImpl;->removeCommunityListener(Lcom/tencent/imsdk/v2/V2TIMCommunityListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/imsdk/v2/V2TIMCommunityManagerImpl;

.field final synthetic val$listener:Lcom/tencent/imsdk/v2/V2TIMCommunityListener;


# direct methods
.method public constructor <init>(Lcom/tencent/imsdk/v2/V2TIMCommunityManagerImpl;Lcom/tencent/imsdk/v2/V2TIMCommunityListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMCommunityManagerImpl$3;->this$0:Lcom/tencent/imsdk/v2/V2TIMCommunityManagerImpl;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/imsdk/v2/V2TIMCommunityManagerImpl$3;->val$listener:Lcom/tencent/imsdk/v2/V2TIMCommunityListener;

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
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMCommunityManagerImpl$3;->this$0:Lcom/tencent/imsdk/v2/V2TIMCommunityManagerImpl;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/imsdk/v2/V2TIMCommunityManagerImpl;->access$200(Lcom/tencent/imsdk/v2/V2TIMCommunityManagerImpl;)Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/tencent/imsdk/v2/V2TIMCommunityManagerImpl$3;->val$listener:Lcom/tencent/imsdk/v2/V2TIMCommunityListener;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
