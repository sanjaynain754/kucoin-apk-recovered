.class Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$13;
.super Lcom/tencent/imsdk/v2/V2TIMConversationListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;->a(Lcom/tencent/qcloud/tim/push/interfaces/IMEventListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/qcloud/tim/push/interfaces/IMEventListener;

.field public final synthetic b:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;


# direct methods
.method public constructor <init>(Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;Lcom/tencent/qcloud/tim/push/interfaces/IMEventListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$13;->b:Lcom/tencent/qcloud/tim/push/model/TIMPushProvider;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$13;->a:Lcom/tencent/qcloud/tim/push/interfaces/IMEventListener;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tencent/imsdk/v2/V2TIMConversationListener;-><init>()V

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
.end method


# virtual methods
.method public onTotalUnreadMessageCountChanged(J)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/model/TIMPushProvider$13;->a:Lcom/tencent/qcloud/tim/push/interfaces/IMEventListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/tencent/qcloud/tim/push/interfaces/IMEventListener;->a(J)V

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
.end method
