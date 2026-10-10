.class public final Lio/trtc/tuikit/atomicxcore/impl/live/U;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;

.field public final synthetic b:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/U;->a:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/U;->b:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;

    .line 5
    const/4 p1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    return-void
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
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/CoHostListener;

    .line 3
    .line 4
    const-string v0, "$this$notify"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/U;->a:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/impl/live/P0;->a(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/U;->b:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/live/P0;->a(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionUser;)Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostListener;->onCoHostRequestTimeout(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V

    .line 23
    .line 24
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 25
    return-object p1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
