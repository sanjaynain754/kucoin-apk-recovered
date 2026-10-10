.class public final Lio/trtc/tuikit/atomicxcore/impl/room/B;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/impl/room/k0;


# direct methods
.method public constructor <init>(ZLio/trtc/tuikit/atomicxcore/impl/room/k0;)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/B;->a:Z

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/B;->b:Lio/trtc/tuikit/atomicxcore/impl/room/k0;

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
    .locals 3

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantListener;

    .line 3
    .line 4
    const-string v0, "$this$notify"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;->SCREEN_SHARE:Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;

    .line 10
    .line 11
    iget-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/B;->a:Z

    .line 12
    .line 13
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/B;->b:Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    .line 14
    .line 15
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->t:Lio/trtc/tuikit/atomicxcore/impl/room/e;

    .line 16
    .line 17
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/room/e;->a:Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantListener;->onAllDevicesDisabled(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;ZLio/trtc/tuikit/atomicxcore/api/room/RoomUser;)V

    .line 21
    .line 22
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    return-object p1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
