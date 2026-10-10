.class public Lcom/tencent/qcloud/tuicore/push/OfflinePushExtInfo;
.super Ljava/lang/Object;
.source "OfflinePushExtInfo.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final REDIRECT_ACTION_CALL:I = 0x2

.field public static final REDIRECT_ACTION_CHAT:I = 0x1


# instance fields
.field private entity:Lcom/tencent/qcloud/tuicore/push/OfflinePushExtBusinessInfo;

.field private timPushFeatures:Lcom/tencent/qcloud/tuicore/push/OfflinePushExtConfigInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtBusinessInfo;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtBusinessInfo;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtInfo;->entity:Lcom/tencent/qcloud/tuicore/push/OfflinePushExtBusinessInfo;

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtConfigInfo;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtConfigInfo;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtInfo;->timPushFeatures:Lcom/tencent/qcloud/tuicore/push/OfflinePushExtConfigInfo;

    .line 18
    return-void
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
.end method


# virtual methods
.method public getBusinessInfo()Lcom/tencent/qcloud/tuicore/push/OfflinePushExtBusinessInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtInfo;->entity:Lcom/tencent/qcloud/tuicore/push/OfflinePushExtBusinessInfo;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public getConfigInfo()Lcom/tencent/qcloud/tuicore/push/OfflinePushExtConfigInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtInfo;->timPushFeatures:Lcom/tencent/qcloud/tuicore/push/OfflinePushExtConfigInfo;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public setBusinessInfo(Lcom/tencent/qcloud/tuicore/push/OfflinePushExtBusinessInfo;)V
    .locals 0

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    new-instance p1, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtBusinessInfo;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1}, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtBusinessInfo;-><init>()V

    .line 8
    .line 9
    :cond_0
    iput-object p1, p0, Lcom/tencent/qcloud/tuicore/push/OfflinePushExtInfo;->entity:Lcom/tencent/qcloud/tuicore/push/OfflinePushExtBusinessInfo;

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
.end method
