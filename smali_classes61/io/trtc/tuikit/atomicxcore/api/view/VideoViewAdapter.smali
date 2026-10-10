.class public interface abstract Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH&J\u001e\u0010\n\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH&\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/api/view/VideoViewAdapter;",
        "",
        "createBattleContainerView",
        "Landroid/view/View;",
        "createBattleView",
        "seatInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;",
        "createCoGuestView",
        "viewLayer",
        "Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;",
        "createCoHostView",
        "atomicxcore_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract createBattleContainerView()Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract createBattleView(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;)Landroid/view/View;
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract createCoGuestView(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;)Landroid/view/View;
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract createCoHostView(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;)Landroid/view/View;
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/view/ViewLayer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
