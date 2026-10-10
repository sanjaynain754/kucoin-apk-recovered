.class public interface abstract Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$c;
.super Ljava/lang/Object;
.source "GiftPlayView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u001a\u0010\u000c\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\r\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$TUIGiftPlayViewListener;",
        "",
        "onReceiveGift",
        "",
        "view",
        "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;",
        "gift",
        "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;",
        "giftCount",
        "",
        "sender",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;",
        "onPlayGiftAnimation",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;Lio/trtc/tuikit/atomicxcore/api/gift/Gift;)V
    .param p1    # Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/gift/Gift;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract b(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;Lio/trtc/tuikit/atomicxcore/api/gift/Gift;ILio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .param p1    # Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/gift/Gift;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
