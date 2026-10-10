.class public final Lcs/a;
.super Ljava/lang/Object;
.source "ModelConverter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\u0008\u00030\u0004H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\u000c*\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;",
        "Lcom/kubi/network/websocket/model/Message;",
        "b",
        "(Lcom/kubi/network/api/subscribe/model/SubscribeMessage;)Lcom/kubi/network/websocket/model/Message;",
        "Lcom/kubi/network/api/model/NetworkMessage;",
        "a",
        "(Lcom/kubi/network/api/model/NetworkMessage;)Lcom/kubi/network/websocket/model/Message;",
        "",
        "id",
        "d",
        "(Lcom/kubi/network/websocket/model/Message;Ljava/lang/String;)Lcom/kubi/network/api/subscribe/model/SubscribeMessage;",
        "Lcom/kubi/network/websocket/model/SocketRequest;",
        "Lcom/kubi/network/api/subscribe/model/SubscribeRequest;",
        "e",
        "(Lcom/kubi/network/websocket/model/SocketRequest;)Lcom/kubi/network/api/subscribe/model/SubscribeRequest;",
        "Lcom/kubi/network/websocket/model/HeartbeatRequest;",
        "",
        "waitHeartbeat",
        "Lcom/kubi/network/api/subscribe/model/PeriodRequest;",
        "c",
        "(Lcom/kubi/network/websocket/model/HeartbeatRequest;Z)Lcom/kubi/network/api/subscribe/model/PeriodRequest;",
        "network-adapter-subscribe-old_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/kubi/network/api/model/NetworkMessage;)Lcom/kubi/network/websocket/model/Message;
    .locals 3
    .param p0    # Lcom/kubi/network/api/model/NetworkMessage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/network/api/model/NetworkMessage<",
            "*>;)",
            "Lcom/kubi/network/websocket/model/Message;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/network/websocket/model/Message;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lcom/kubi/network/websocket/model/Message;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/network/api/model/NetworkMessage;->getData()Ljava/lang/Object;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    const-string v1, "null cannot be cast to non-null type com.kubi.network.api.subscribe.model.SubscribeMessage"

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    check-cast p0, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getId()Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/kubi/network/websocket/model/Message;->setId(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getUserId()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lcom/kubi/network/websocket/model/Message;->setUserId(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->isSocketMessage()Z

    .line 39
    move-result v1

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    const-string v1, "socket"

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_0
    const-string v1, "heartbeat"

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-virtual {v0, v1}, Lcom/kubi/network/websocket/model/Message;->setSource(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getTopic()Ljava/lang/String;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lcom/kubi/network/websocket/model/Message;->setTopic(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getSubject()Ljava/lang/String;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lcom/kubi/network/websocket/model/Message;->setSubject(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getData()Ljava/lang/String;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lcom/kubi/network/websocket/model/Message;->setData(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getExtension()Ljava/lang/Object;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lcom/kubi/network/websocket/model/Message;->setExtension(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getTimestamp()J

    .line 81
    move-result-wide v1

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1, v2}, Lcom/kubi/network/websocket/model/Message;->setTimestamp(J)V

    .line 85
    return-object v0
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public static final b(Lcom/kubi/network/api/subscribe/model/SubscribeMessage;)Lcom/kubi/network/websocket/model/Message;
    .locals 3
    .param p0    # Lcom/kubi/network/api/subscribe/model/SubscribeMessage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/network/websocket/model/Message;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lcom/kubi/network/websocket/model/Message;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getId()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kubi/network/websocket/model/Message;->setId(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getUserId()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/kubi/network/websocket/model/Message;->setUserId(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->isSocketMessage()Z

    .line 28
    move-result v1

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    const-string v1, "socket"

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_0
    const-string v1, "heartbeat"

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {v0, v1}, Lcom/kubi/network/websocket/model/Message;->setSource(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getTopic()Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lcom/kubi/network/websocket/model/Message;->setTopic(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getSubject()Ljava/lang/String;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lcom/kubi/network/websocket/model/Message;->setSubject(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getData()Ljava/lang/String;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lcom/kubi/network/websocket/model/Message;->setData(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getExtension()Ljava/lang/Object;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lcom/kubi/network/websocket/model/Message;->setExtension(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;->getTimestamp()J

    .line 70
    move-result-wide v1

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Lcom/kubi/network/websocket/model/Message;->setTimestamp(J)V

    .line 74
    return-object v0
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
.end method

.method public static final c(Lcom/kubi/network/websocket/model/HeartbeatRequest;Z)Lcom/kubi/network/api/subscribe/model/PeriodRequest;
    .locals 11
    .param p0    # Lcom/kubi/network/websocket/model/HeartbeatRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/network/api/subscribe/model/PeriodRequest;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/HeartbeatRequest;->getRequest()Lokhttp3/Request;

    .line 11
    move-result-object v3

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/HeartbeatRequest;->getSupportBackground()Z

    .line 15
    move-result v4

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/HeartbeatRequest;->getRestfulRequest()Z

    .line 19
    move-result v5

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/HeartbeatRequest;->getConnectedPeriod()I

    .line 23
    move-result v7

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/HeartbeatRequest;->getDisconnectPeriod()I

    .line 27
    move-result v8

    .line 28
    const/4 v9, 0x1

    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    move v6, p1

    .line 32
    .line 33
    .line 34
    invoke-direct/range {v1 .. v10}, Lcom/kubi/network/api/subscribe/model/PeriodRequest;-><init>(Ljava/lang/String;Lokhttp3/Request;ZZZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    return-object v1
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
.end method

.method public static final d(Lcom/kubi/network/websocket/model/Message;Ljava/lang/String;)Lcom/kubi/network/api/subscribe/model/SubscribeMessage;
    .locals 10
    .param p0    # Lcom/kubi/network/websocket/model/Message;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "id"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v1, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/Message;->getUserId()Ljava/lang/String;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/Message;->getTopic()Ljava/lang/String;

    .line 20
    move-result-object v4

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/Message;->getSubject()Ljava/lang/String;

    .line 24
    move-result-object v5

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/Message;->getData()Ljava/lang/String;

    .line 28
    move-result-object v6

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/Message;->getExtension()Ljava/lang/Object;

    .line 32
    move-result-object v7

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/Message;->getTimestamp()J

    .line 36
    move-result-wide v8

    .line 37
    move-object v2, p1

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v1 .. v9}, Lcom/kubi/network/api/subscribe/model/SubscribeMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    .line 41
    return-object v1
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
.end method

.method public static final e(Lcom/kubi/network/websocket/model/SocketRequest;)Lcom/kubi/network/api/subscribe/model/SubscribeRequest;
    .locals 8
    .param p0    # Lcom/kubi/network/websocket/model/SocketRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/network/api/subscribe/model/SubscribeRequest;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/SocketRequest;->getType()Ljava/lang/String;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/SocketRequest;->getTopic()Ljava/lang/String;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    const/16 v6, 0xc

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v1 .. v7}, Lcom/kubi/network/api/subscribe/model/SubscribeRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/kubi/network/api/subscribe/model/PeriodRequest;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    return-object v1
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
    .line 44
    .line 45
.end method
