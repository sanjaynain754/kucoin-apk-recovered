.class Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$1;
.super Lcom/tencent/qcloud/tim/push/TIMPushListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/qcloud/tim/push/unity/UnityPushListener;->createPushListener(Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$IJava2CSharpListener;)Lcom/tencent/qcloud/tim/push/TIMPushListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$IJava2CSharpListener;


# direct methods
.method public constructor <init>(Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$IJava2CSharpListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$1;->a:Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$IJava2CSharpListener;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/qcloud/tim/push/TIMPushListener;-><init>()V

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
    .line 24
.end method


# virtual methods
.method public onNotificationClicked(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$1;->a:Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$IJava2CSharpListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$IJava2CSharpListener;->onNotificationClicked(Ljava/lang/String;)V

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
    .line 24
.end method

.method public onRecvPushMessage(Lcom/tencent/qcloud/tim/push/TIMPushMessage;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$1;->a:Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$IJava2CSharpListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$IJava2CSharpListener;->onRecvPushMessage(Lcom/tencent/qcloud/tim/push/TIMPushMessage;)V

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
    .line 24
.end method

.method public onRevokePushMessage(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$1;->a:Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$IJava2CSharpListener;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/qcloud/tim/push/unity/UnityPushListener$IJava2CSharpListener;->onRevokePushMessage(Ljava/lang/String;)V

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
    .line 24
.end method
