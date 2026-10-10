.class public final Lio/trtc/tuikit/atomicxcore/impl/room/J0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InviteUsersCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/api/room/CallUserToRoomCompletionHandler;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/api/room/CallUserToRoomCompletionHandler;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/J0;->a:Lio/trtc/tuikit/atomicxcore/api/room/CallUserToRoomCompletionHandler;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
.method public final onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "error"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "message"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/J0;->a:Lio/trtc/tuikit/atomicxcore/api/room/CallUserToRoomCompletionHandler;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 18
    move-result p1

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/room/CallUserToRoomCompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 22
    :cond_0
    return-void
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

.method public final onSuccess(Ljava/util/Map;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "resultMap"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 11
    move-result v1

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    .line 15
    move-result v1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    move-result v1

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    check-cast v1, Ljava/util/Map$Entry;

    .line 39
    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationCode;

    .line 49
    .line 50
    const-string v3, "code"

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/room/l0;->e:[I

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 59
    move-result v1

    .line 60
    .line 61
    aget v1, v3, v1

    .line 62
    const/4 v3, 0x1

    .line 63
    .line 64
    if-eq v1, v3, :cond_2

    .line 65
    const/4 v3, 0x2

    .line 66
    .line 67
    if-eq v1, v3, :cond_1

    .line 68
    const/4 v3, 0x3

    .line 69
    .line 70
    if-ne v1, v3, :cond_0

    .line 71
    .line 72
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/room/RoomCallResult;->ALREADY_IN_ROOM:Lio/trtc/tuikit/atomicxcore/api/room/RoomCallResult;

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 76
    .line 77
    .line 78
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 79
    throw p1

    .line 80
    .line 81
    :cond_1
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/room/RoomCallResult;->ALREADY_IN_CALLING:Lio/trtc/tuikit/atomicxcore/api/room/RoomCallResult;

    .line 82
    goto :goto_1

    .line 83
    .line 84
    :cond_2
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/room/RoomCallResult;->SUCCESS:Lio/trtc/tuikit/atomicxcore/api/room/RoomCallResult;

    .line 85
    .line 86
    .line 87
    :goto_1
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    goto :goto_0

    .line 89
    .line 90
    :cond_3
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/J0;->a:Lio/trtc/tuikit/atomicxcore/api/room/CallUserToRoomCompletionHandler;

    .line 91
    .line 92
    if-eqz p1, :cond_4

    .line 93
    .line 94
    .line 95
    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    .line 99
    invoke-interface {p1, v0}, Lio/trtc/tuikit/atomicxcore/api/room/CallUserToRoomCompletionHandler;->onSuccess(Ljava/util/Map;)V

    .line 100
    :cond_4
    return-void
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method
