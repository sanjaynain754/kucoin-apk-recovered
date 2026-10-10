.class public Lcom/tencent/qcloud/tim/push/ue/UEPushListener;
.super Lcom/tencent/qcloud/tim/push/TIMPushListener;
.source "SourceFile"


# instance fields
.field private nativePtr:J


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/qcloud/tim/push/TIMPushListener;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v0, p1, v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "UEPushListener"

    .line 12
    .line 13
    const-string v1, "invalid Native pointer"

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lcom/tencent/qcloud/tim/push/utils/TIMPushLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    :cond_0
    iput-wide p1, p0, Lcom/tencent/qcloud/tim/push/ue/UEPushListener;->nativePtr:J

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private native nativeOnNotificationClicked(JLjava/lang/String;)V
.end method

.method private native nativeOnRecvPushMessage(JLcom/tencent/qcloud/tim/push/TIMPushMessage;)V
.end method

.method private native nativeOnRevokePushMessage(JLjava/lang/String;)V
.end method


# virtual methods
.method public onNotificationClicked(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/qcloud/tim/push/ue/UEPushListener;->nativePtr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0, v1, p1}, Lcom/tencent/qcloud/tim/push/ue/UEPushListener;->nativeOnNotificationClicked(JLjava/lang/String;)V

    .line 12
    :cond_0
    return-void
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
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/qcloud/tim/push/ue/UEPushListener;->nativePtr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0, v1, p1}, Lcom/tencent/qcloud/tim/push/ue/UEPushListener;->nativeOnRecvPushMessage(JLcom/tencent/qcloud/tim/push/TIMPushMessage;)V

    .line 12
    :cond_0
    return-void
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
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/qcloud/tim/push/ue/UEPushListener;->nativePtr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0, v1, p1}, Lcom/tencent/qcloud/tim/push/ue/UEPushListener;->nativeOnRevokePushMessage(JLjava/lang/String;)V

    .line 12
    :cond_0
    return-void
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
