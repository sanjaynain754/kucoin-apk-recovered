.class public final Lio/trtc/tuikit/atomicxcore/impl/room/A0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/A0;->a:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

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
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/room/RoomListener;

    .line 3
    .line 4
    const-string v0, "$this$notify"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/A0;->a:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/api/room/RoomListener;->onRoomEnded(Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;)V

    .line 17
    .line 18
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    return-object p1
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
