.class public final Lwd0/d;
.super Ljava/lang/Object;
.source "AnchorBattleStore.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "convertToBattleUser",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/BattleUser;",
        "seatUserInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;",
        "tuilivekit_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)Lwd0/l;
    .locals 9
    .param p0    # Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "seatUserInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v1, Lwd0/l;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getLiveID()Ljava/lang/String;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserName()Ljava/lang/String;

    .line 19
    move-result-object v4

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getAvatarURL()Ljava/lang/String;

    .line 23
    move-result-object v5

    .line 24
    .line 25
    new-instance v8, Landroid/graphics/Rect;

    .line 26
    .line 27
    .line 28
    invoke-direct {v8}, Landroid/graphics/Rect;-><init>()V

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    .line 32
    .line 33
    invoke-direct/range {v1 .. v8}, Lwd0/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 34
    return-object v1
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method
