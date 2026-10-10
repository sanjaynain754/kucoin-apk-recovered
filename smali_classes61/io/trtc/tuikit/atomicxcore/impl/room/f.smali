.class public final Lio/trtc/tuikit/atomicxcore/impl/room/f;
.super Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/impl/room/k0;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/f;->b:Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;-><init>()V

    .line 11
    .line 12
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/f;->a:Ljava/lang/String;

    .line 13
    return-void
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
.method public final onInvitationAdded(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "invitation"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/f;->a:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    move-result p1

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/f;->b:Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    .line 21
    .line 22
    iget-object v0, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;->invitee:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 23
    .line 24
    const-string v1, "invitee"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    iget-object p2, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;->status:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;

    .line 30
    .line 31
    .line 32
    const-string/jumbo v1, "status"

    .line 33
    .line 34
    .line 35
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;)Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 39
    move-result-object p2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    const-string v0, "participant"

    .line 45
    .line 46
    .line 47
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->o:Ljava/util/LinkedHashMap;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 57
    move-result v0

    .line 58
    .line 59
    if-eqz v0, :cond_0

    .line 60
    goto :goto_0

    .line 61
    .line 62
    :cond_0
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->p:Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->f:Lkotlinx/coroutines/flow/n;

    .line 72
    .line 73
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/room/H;->a:Lio/trtc/tuikit/atomicxcore/impl/room/H;

    .line 74
    .line 75
    .line 76
    invoke-static {p1, p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/room/a;->a(Lkotlinx/coroutines/flow/n;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 77
    :cond_1
    :goto_0
    return-void
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

.method public final onInvitationRemoved(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "invitation"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/f;->a:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    move-result p1

    .line 17
    .line 18
    if-eqz p1, :cond_3

    .line 19
    .line 20
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/f;->b:Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    .line 21
    .line 22
    iget-object p2, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;->invitee:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 23
    .line 24
    iget-object p2, p2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userId:Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    const-string/jumbo v0, "userId"

    .line 28
    .line 29
    .line 30
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const-string/jumbo v0, "userID"

    .line 37
    .line 38
    .line 39
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->p:Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->f:Lkotlinx/coroutines/flow/n;

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 50
    move-result-object v0

    .line 51
    move-object v1, v0

    .line 52
    .line 53
    check-cast v1, Ljava/util/List;

    .line 54
    .line 55
    new-instance v2, Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    move-result v3

    .line 67
    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    move-result-object v3

    .line 73
    move-object v4, v3

    .line 74
    .line 75
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    .line 79
    move-result-object v4

    .line 80
    .line 81
    .line 82
    invoke-static {v4, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    move-result v4

    .line 84
    .line 85
    if-nez v4, :cond_1

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    goto :goto_0

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-interface {p1, v0, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    move-result v0

    .line 94
    .line 95
    if-eqz v0, :cond_0

    .line 96
    :cond_3
    return-void
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

.method public final onInvitationStatusChanged(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "invitation"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/f;->a:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    move-result p1

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/f;->b:Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    .line 21
    .line 22
    iget-object v0, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;->invitee:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 23
    .line 24
    const-string v1, "invitee"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    iget-object p2, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;->status:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;

    .line 30
    .line 31
    .line 32
    const-string/jumbo v1, "status"

    .line 33
    .line 34
    .line 35
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;)Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 39
    move-result-object p2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    const-string v0, "participant"

    .line 45
    .line 46
    .line 47
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->o:Ljava/util/LinkedHashMap;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 57
    move-result v0

    .line 58
    .line 59
    if-eqz v0, :cond_0

    .line 60
    goto :goto_0

    .line 61
    .line 62
    :cond_0
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->p:Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->f:Lkotlinx/coroutines/flow/n;

    .line 72
    .line 73
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/room/H;->a:Lio/trtc/tuikit/atomicxcore/impl/room/H;

    .line 74
    .line 75
    .line 76
    invoke-static {p1, p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/room/a;->a(Lkotlinx/coroutines/flow/n;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 77
    :cond_1
    :goto_0
    return-void
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
