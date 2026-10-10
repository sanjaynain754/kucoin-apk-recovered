.class public final Lio/trtc/tuikit/atomicxcore/impl/live/I;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/I;->a:Ljava/lang/String;

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
    .locals 7

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/HostListener;

    .line 3
    .line 4
    const-string v0, "$this$notify"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 10
    .line 11
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/I;->a:Ljava/lang/String;

    .line 12
    const/4 v5, 0x6

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;->TIMEOUT:Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/HostListener;->onHostInvitationNoResponse(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;)V

    .line 24
    .line 25
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 26
    return-object p1
    .line 27
    .line 28
    .line 29
    .line 30
.end method
