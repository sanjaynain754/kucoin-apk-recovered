.class Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;
.super Ljava/lang/Object;
.source "TUILiveListManagerJni.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LiveInfo"
.end annotation


# instance fields
.field private mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

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
    .line 25
.end method


# virtual methods
.method public getActivityStatus()I
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "LiveInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->activityStatus:I

    .line 5
    return v0
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
    .line 17
.end method

.method public getBackgroundUrl()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "LiveInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->backgroundUrl:Ljava/lang/String;

    .line 5
    return-object v0
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
    .line 17
.end method

.method public getCategoryList()[I
    .locals 3
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "LiveInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->categoryList:Ljava/util/List;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-array v0, v1, [I

    .line 10
    return-object v0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    move-result v0

    .line 15
    .line 16
    new-array v0, v0, [I

    .line 17
    .line 18
    :goto_0
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 19
    .line 20
    iget-object v2, v2, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->categoryList:Ljava/util/List;

    .line 21
    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 24
    move-result v2

    .line 25
    .line 26
    if-ge v1, v2, :cond_1

    .line 27
    .line 28
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 29
    .line 30
    iget-object v2, v2, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->categoryList:Ljava/util/List;

    .line 31
    .line 32
    .line 33
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    check-cast v2, Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 40
    move-result v2

    .line 41
    .line 42
    aput v2, v0, v1

    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-object v0
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

.method public getCoverUrl()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "LiveInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->coverUrl:Ljava/lang/String;

    .line 5
    return-object v0
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
    .line 17
.end method

.method public getMaxSeatCount()I
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "LiveInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->maxSeatCount:I

    .line 5
    return v0
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
    .line 17
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "LiveInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->name:Ljava/lang/String;

    .line 5
    return-object v0
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
    .line 17
.end method

.method public getNotice()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "LiveInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->notice:Ljava/lang/String;

    .line 5
    return-object v0
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
    .line 17
.end method

.method public getRoomId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "LiveInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->roomId:Ljava/lang/String;

    .line 5
    return-object v0
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
    .line 17
.end method

.method public getSeatLayoutTemplateId()I
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "LiveInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->seatLayoutTemplateId:I

    .line 5
    return v0
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
    .line 17
.end method

.method public getSeatMode()I
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "LiveInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->getValue()I

    .line 8
    move-result v0

    .line 9
    return v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public isMessageDisabledForAllUser()Z
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "LiveInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isMessageDisableForAllUser:Z

    .line 5
    return v0
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
    .line 17
.end method

.method public isPublicVisible()Z
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "LiveInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isPublicVisible:Z

    .line 5
    return v0
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
    .line 17
.end method

.method public isSeatEnabled()Z
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "LiveInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->isSeatEnabled:Z

    .line 5
    return v0
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
    .line 17
.end method

.method public keepOwnerOnSeat()Z
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "LiveInfo"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveListManagerJni$LiveInfo;->mLiveInfo:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;->keepOwnerOnSeat:Z

    .line 5
    return v0
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
    .line 17
.end method
