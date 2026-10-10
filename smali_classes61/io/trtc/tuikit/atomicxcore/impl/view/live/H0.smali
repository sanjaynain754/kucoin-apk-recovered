.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/H0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/H0;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

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
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 3
    .line 4
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/H0;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 5
    .line 6
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    .line 7
    .line 8
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;->roomState:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$RoomState;

    .line 9
    .line 10
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$RoomState;->roomId:Landroidx/lifecycle/LiveData;

    .line 11
    .line 12
    const-string v0, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.String>"

    .line 13
    .line 14
    .line 15
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/H0;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 27
    .line 28
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    .line 29
    .line 30
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;->roomState:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$RoomState;

    .line 31
    .line 32
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$RoomState;->ownerInfo:Landroidx/lifecycle/LiveData;

    .line 33
    .line 34
    const-string v0, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.UserInfo>"

    .line 35
    .line 36
    .line 37
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/A;->a(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 51
    .line 52
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/H0;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 53
    .line 54
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    .line 55
    .line 56
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;->roomState:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$RoomState;

    .line 57
    .line 58
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$RoomState;->maxCoGuestCount:Landroidx/lifecycle/LiveData;

    .line 59
    .line 60
    const-string v0, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Int>"

    .line 61
    .line 62
    .line 63
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getMaxSeatCount()I

    .line 69
    move-result p1

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 79
    return-object p1
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
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
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
.end method
