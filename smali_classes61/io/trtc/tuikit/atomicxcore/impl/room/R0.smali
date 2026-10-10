.class public final Lio/trtc/tuikit/atomicxcore/impl/room/R0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/room/T0;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/R0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/R0;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.method public final onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
    .locals 4

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
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/R0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 13
    .line 14
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->d:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v3, "leaveRoom onError: "

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v3, ", "

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;->a(ILjava/lang/String;)V

    .line 47
    .line 48
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/R0;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 54
    move-result p1

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 58
    :cond_0
    return-void
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

.method public final onSuccess()V
    .locals 23

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/R0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 5
    .line 6
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->d:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    const-string v2, "message"

    .line 12
    .line 13
    const-string v3, "leaveRoom onSuccess"

    .line 14
    .line 15
    .line 16
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;->a(ILjava/lang/String;)V

    .line 21
    .line 22
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/room/p0;->b:Lkotlin/Lazy;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/room/o0;->a()Lio/trtc/tuikit/atomicxcore/impl/room/p0;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/R0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 29
    .line 30
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 31
    .line 32
    .line 33
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->getRoomID()Ljava/lang/String;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/room/p0;->a(Ljava/lang/String;)V

    .line 44
    .line 45
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/R0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 46
    .line 47
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 48
    .line 49
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 50
    .line 51
    const/16 v21, 0x7fff

    .line 52
    .line 53
    const/16 v22, 0x0

    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    const/4 v5, 0x0

    .line 57
    const/4 v6, 0x0

    .line 58
    .line 59
    const-wide/16 v7, 0x0

    .line 60
    const/4 v9, 0x0

    .line 61
    .line 62
    const-wide/16 v10, 0x0

    .line 63
    .line 64
    const-wide/16 v12, 0x0

    .line 65
    const/4 v14, 0x0

    .line 66
    const/4 v15, 0x0

    .line 67
    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    const/16 v17, 0x0

    .line 71
    .line 72
    const/16 v18, 0x0

    .line 73
    .line 74
    const/16 v19, 0x0

    .line 75
    .line 76
    const/16 v20, 0x0

    .line 77
    .line 78
    .line 79
    invoke-direct/range {v2 .. v22}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;IJLio/trtc/tuikit/atomicxcore/api/room/RoomStatus;JJILjava/util/List;Ljava/lang/String;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 83
    .line 84
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/R0;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 85
    .line 86
    if-eqz v1, :cond_0

    .line 87
    .line 88
    .line 89
    invoke-interface {v1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 90
    :cond_0
    return-void
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
.end method
