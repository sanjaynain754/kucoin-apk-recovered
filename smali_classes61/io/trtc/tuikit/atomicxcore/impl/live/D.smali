.class public final Lio/trtc/tuikit/atomicxcore/impl/live/D;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/live/M;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/live/M;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/D;->a:Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 3
    const/4 p1, 0x0

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
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/D;->a:Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 3
    .line 4
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/M;->f:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 5
    .line 6
    const-string v1, "message"

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    const-string v3, "Response: cancelApplication onSuccess"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 13
    .line 14
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/D;->a:Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/live/M;->l:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 18
    .line 19
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    return-object v0
    .line 21
.end method
