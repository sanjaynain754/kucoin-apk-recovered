.class public final Lio/trtc/tuikit/atomicxcore/impl/live/S0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/live/Y0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/S0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatListener;

    .line 3
    .line 4
    const-string v0, "$this$notify"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/S0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 10
    .line 11
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 12
    .line 13
    const-string v1, "message"

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    const-string v3, "Listener: onLocalCameraClosedByAdmin"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatListener;->onLocalCameraClosedByAdmin()V

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
