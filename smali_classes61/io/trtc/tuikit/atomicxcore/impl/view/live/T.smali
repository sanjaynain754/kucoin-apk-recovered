.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/T;
.super Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;-><init>()V

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

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V
    .locals 1

    const-string v0, "$guestUser"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 1
    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/A;->a(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    move-result-object p0

    invoke-interface {p1, p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;->onUserConnectionAccepted(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V

    :cond_0
    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V
    .locals 2

    if-eqz p0, :cond_0

    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;-><init>()V

    .line 3
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userId:Ljava/lang/String;

    .line 4
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userName:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userName:Ljava/lang/String;

    .line 5
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->avatarUrl:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->avatarUrl:Ljava/lang/String;

    .line 6
    invoke-interface {p0, v0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;->onUserConnectionTimeout(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V

    :cond_0
    return-void
.end method

.method public static final b(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "$guestUser"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/A;->a(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, p0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$ConnectionObserver;->onUserConnectionRejected(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V

    .line 15
    :cond_0
    return-void
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
.method public final onGuestApplicationNoResponse(Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "reason"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;->TIMEOUT:Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 12
    .line 13
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 14
    .line 15
    const-string v0, "message"

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    const-string v2, "onGuestApplicationNoResponse => onUserConnectionTimeout"

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v2, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 22
    .line 23
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 24
    .line 25
    new-instance v0, Lig0/m;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, Lig0/m;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a(Lio/trtc/tuikit/atomicxcore/impl/view/live/Q;)V

    .line 32
    :cond_0
    return-void
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
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
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
.end method

.method public final onGuestApplicationResponded(ZLio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "guestUser"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    const-string v1, "message"

    .line 9
    .line 10
    if-eqz p1, :cond_3

    .line 11
    .line 12
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 13
    .line 14
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v3, "onUserConnectionAccepted:"

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 24
    .line 25
    iget-object v3, v3, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->c:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;

    .line 32
    const/4 v4, 0x0

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoGuestAutoOpenCamera$atomicxcore_release()Z

    .line 38
    move-result v3

    .line 39
    .line 40
    .line 41
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    move-result-object v3

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object v3, v4

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 61
    .line 62
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->isFrontCamera()Lkotlinx/coroutines/flow/w;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    .line 77
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    check-cast p1, Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    move-result p1

    .line 85
    .line 86
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 87
    .line 88
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->c:Ljava/lang/ref/WeakReference;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;

    .line 95
    const/4 v1, 0x1

    .line 96
    .line 97
    if-eqz v0, :cond_1

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoGuestAutoOpenCamera$atomicxcore_release()Z

    .line 101
    move-result v0

    .line 102
    .line 103
    if-ne v0, v1, :cond_1

    .line 104
    .line 105
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 106
    .line 107
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->c:Ljava/lang/ref/WeakReference;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;

    .line 114
    .line 115
    if-eqz v0, :cond_1

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, p1, v4}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->startCamera(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 119
    .line 120
    :cond_1
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 121
    .line 122
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->c:Ljava/lang/ref/WeakReference;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;

    .line 129
    .line 130
    if-eqz p1, :cond_2

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getCoGuestAutoOpenMicrophone$atomicxcore_release()Z

    .line 134
    move-result p1

    .line 135
    .line 136
    if-ne p1, v1, :cond_2

    .line 137
    .line 138
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 139
    .line 140
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->c:Ljava/lang/ref/WeakReference;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 144
    move-result-object p1

    .line 145
    .line 146
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;

    .line 147
    .line 148
    if-eqz p1, :cond_2

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v4}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->startMicrophone(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 152
    .line 153
    :cond_2
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 154
    .line 155
    new-instance v0, Lig0/k;

    .line 156
    .line 157
    .line 158
    invoke-direct {v0, p2}, Lig0/k;-><init>(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a(Lio/trtc/tuikit/atomicxcore/impl/view/live/Q;)V

    .line 162
    return-void

    .line 163
    .line 164
    :cond_3
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 165
    .line 166
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 167
    .line 168
    const-string v2, "onGuestApplicationResponded => onUserConnectionRejected"

    .line 169
    .line 170
    .line 171
    invoke-static {p1, v2, v1, v0, v2}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 172
    .line 173
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T;->a:Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;

    .line 174
    .line 175
    new-instance v0, Lig0/l;

    .line 176
    .line 177
    .line 178
    invoke-direct {v0, p2}, Lig0/l;-><init>(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Y;->a(Lio/trtc/tuikit/atomicxcore/impl/view/live/Q;)V

    .line 182
    return-void
    .line 183
    .line 184
    .line 185
    .line 186
.end method
