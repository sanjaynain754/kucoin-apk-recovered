.class public abstract Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager;
.super Ljava/lang/Object;
.source "TUILiveGiftManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$Observer;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetLikesCountCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetGiftCountCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetGiftListCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GiftCategory;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GiftInfo;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
    .line 17
.end method


# virtual methods
.method public abstract addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$Observer;)V
.end method

.method public abstract getGiftCountByAnchor(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetGiftCountCallback;)V
.end method

.method public abstract getGiftList(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetGiftListCallback;)V
.end method

.method public abstract getLikesCount(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetLikesCountCallback;)V
.end method

.method public abstract removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$Observer;)V
.end method

.method public abstract sendGift(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract sendLike(Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method
