.class public final Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI;",
        "",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "closeRemoteCamera",
        "",
        "request",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
        "callback",
        "Lkotlin/Function1;",
        "",
        "closeRemoteMicrophone",
        "kickUserOutOfSeat",
        "leaveSeat",
        "lockSeat",
        "moveUserToSeat",
        "muteMicrophone",
        "openRemoteCamera",
        "openRemoteMicrophone",
        "takeSeat",
        "unlockSeat",
        "unmuteMicrophone",
        "atomicxcore_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI;->context:Landroid/content/Context;

    .line 11
    return-void
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
.method public final closeRemoteCamera(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    const-string v1, "callback"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, p2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "liveID"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    .line 21
    :goto_0
    instance-of v3, v2, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v2, v1

    .line 28
    .line 29
    :goto_1
    const-string v3, ""

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    move-object v2, v3

    .line 33
    .line 34
    :cond_2
    if-eqz v0, :cond_3

    .line 35
    .line 36
    .line 37
    const-string/jumbo v4, "userID"

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    move-result-object v0

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    move-object v0, v1

    .line 44
    .line 45
    :goto_2
    instance-of v4, v0, Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v4, :cond_4

    .line 48
    move-object v1, v0

    .line 49
    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    :cond_4
    if-nez v1, :cond_5

    .line 53
    goto :goto_3

    .line 54
    :cond_5
    move-object v3, v1

    .line 55
    .line 56
    :goto_3
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$closeRemoteCamera$completionHandler$1;

    .line 63
    .line 64
    .line 65
    invoke-direct {v1, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$closeRemoteCamera$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->closeRemoteCamera(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 69
    return-void
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

.method public final closeRemoteMicrophone(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    const-string v1, "callback"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, p2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "liveID"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    .line 21
    :goto_0
    instance-of v3, v2, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v2, v1

    .line 28
    .line 29
    :goto_1
    const-string v3, ""

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    move-object v2, v3

    .line 33
    .line 34
    :cond_2
    if-eqz v0, :cond_3

    .line 35
    .line 36
    .line 37
    const-string/jumbo v4, "userID"

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    move-result-object v0

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    move-object v0, v1

    .line 44
    .line 45
    :goto_2
    instance-of v4, v0, Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v4, :cond_4

    .line 48
    move-object v1, v0

    .line 49
    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    :cond_4
    if-nez v1, :cond_5

    .line 53
    goto :goto_3

    .line 54
    :cond_5
    move-object v3, v1

    .line 55
    .line 56
    :goto_3
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$closeRemoteMicrophone$completionHandler$1;

    .line 63
    .line 64
    .line 65
    invoke-direct {v1, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$closeRemoteMicrophone$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->closeRemoteMicrophone(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 69
    return-void
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

.method public final kickUserOutOfSeat(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    const-string v1, "callback"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, p2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "liveID"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    .line 21
    :goto_0
    instance-of v3, v2, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v2, v1

    .line 28
    .line 29
    :goto_1
    const-string v3, ""

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    move-object v2, v3

    .line 33
    .line 34
    :cond_2
    if-eqz v0, :cond_3

    .line 35
    .line 36
    .line 37
    const-string/jumbo v4, "userID"

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    move-result-object v0

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    move-object v0, v1

    .line 44
    .line 45
    :goto_2
    instance-of v4, v0, Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v4, :cond_4

    .line 48
    move-object v1, v0

    .line 49
    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    :cond_4
    if-nez v1, :cond_5

    .line 53
    goto :goto_3

    .line 54
    :cond_5
    move-object v3, v1

    .line 55
    .line 56
    :goto_3
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$kickUserOutOfSeat$completionHandler$1;

    .line 63
    .line 64
    .line 65
    invoke-direct {v1, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$kickUserOutOfSeat$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->kickUserOutOfSeat(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 69
    return-void
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

.method public final leaveSeat(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    const-string v1, "callback"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, p2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "liveID"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v1

    .line 20
    .line 21
    :goto_0
    instance-of v2, v0, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    move-object v1, v0

    .line 25
    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    :cond_1
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;

    .line 29
    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    const-string v1, ""

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$leaveSeat$completionHandler$1;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$leaveSeat$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->leaveSeat(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 45
    return-void
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

.method public final lockSeat(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    const-string v1, "callback"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, p2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "liveID"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    .line 21
    :goto_0
    instance-of v3, v2, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v2, v1

    .line 28
    .line 29
    :goto_1
    if-nez v2, :cond_2

    .line 30
    .line 31
    const-string v2, ""

    .line 32
    .line 33
    :cond_2
    if-eqz v0, :cond_3

    .line 34
    .line 35
    const-string v3, "seatIndex"

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    move-result-object v0

    .line 40
    goto :goto_2

    .line 41
    :cond_3
    move-object v0, v1

    .line 42
    .line 43
    :goto_2
    instance-of v3, v0, Ljava/lang/Number;

    .line 44
    .line 45
    if-eqz v3, :cond_4

    .line 46
    move-object v1, v0

    .line 47
    .line 48
    check-cast v1, Ljava/lang/Number;

    .line 49
    .line 50
    :cond_4
    if-eqz v1, :cond_5

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 54
    move-result v0

    .line 55
    goto :goto_3

    .line 56
    :cond_5
    const/4 v0, 0x0

    .line 57
    .line 58
    :goto_3
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    new-instance v2, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$lockSeat$completionHandler$1;

    .line 65
    .line 66
    .line 67
    invoke-direct {v2, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$lockSeat$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->lockSeat(ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 71
    return-void
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

.method public final moveUserToSeat(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 8
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    const-string v1, "callback"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, p2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "liveID"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    .line 21
    :goto_0
    instance-of v3, v2, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v2, v1

    .line 28
    .line 29
    :goto_1
    const-string v3, ""

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    move-object v2, v3

    .line 33
    .line 34
    :cond_2
    if-eqz v0, :cond_3

    .line 35
    .line 36
    .line 37
    const-string/jumbo v4, "userID"

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    move-result-object v4

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    move-object v4, v1

    .line 44
    .line 45
    :goto_2
    instance-of v5, v4, Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v5, :cond_4

    .line 48
    .line 49
    check-cast v4, Ljava/lang/String;

    .line 50
    goto :goto_3

    .line 51
    :cond_4
    move-object v4, v1

    .line 52
    .line 53
    :goto_3
    if-nez v4, :cond_5

    .line 54
    goto :goto_4

    .line 55
    :cond_5
    move-object v3, v4

    .line 56
    .line 57
    :goto_4
    if-eqz v0, :cond_6

    .line 58
    .line 59
    .line 60
    const-string/jumbo v4, "targetIndex"

    .line 61
    .line 62
    .line 63
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    move-result-object v4

    .line 65
    goto :goto_5

    .line 66
    :cond_6
    move-object v4, v1

    .line 67
    .line 68
    :goto_5
    instance-of v5, v4, Ljava/lang/Number;

    .line 69
    .line 70
    if-eqz v5, :cond_7

    .line 71
    .line 72
    check-cast v4, Ljava/lang/Number;

    .line 73
    goto :goto_6

    .line 74
    :cond_7
    move-object v4, v1

    .line 75
    :goto_6
    const/4 v5, 0x0

    .line 76
    .line 77
    if-eqz v4, :cond_8

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 81
    move-result v4

    .line 82
    goto :goto_7

    .line 83
    :cond_8
    move v4, v5

    .line 84
    .line 85
    :goto_7
    sget-object v6, Lio/trtc/tuikit/atomicxcore/api/live/MoveSeatPolicy;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/MoveSeatPolicy$Companion;

    .line 86
    .line 87
    if-eqz v0, :cond_9

    .line 88
    .line 89
    const-string v7, "policy"

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    move-result-object v0

    .line 94
    goto :goto_8

    .line 95
    :cond_9
    move-object v0, v1

    .line 96
    .line 97
    :goto_8
    instance-of v7, v0, Ljava/lang/Number;

    .line 98
    .line 99
    if-eqz v7, :cond_a

    .line 100
    move-object v1, v0

    .line 101
    .line 102
    check-cast v1, Ljava/lang/Number;

    .line 103
    .line 104
    :cond_a
    if-eqz v1, :cond_b

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 108
    move-result v5

    .line 109
    .line 110
    .line 111
    :cond_b
    invoke-virtual {v6, v5}, Lio/trtc/tuikit/atomicxcore/api/live/MoveSeatPolicy$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/live/MoveSeatPolicy;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    new-instance v2, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$moveUserToSeat$completionHandler$1;

    .line 121
    .line 122
    .line 123
    invoke-direct {v2, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$moveUserToSeat$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v3, v4, v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->moveUserToSeat(Ljava/lang/String;ILio/trtc/tuikit/atomicxcore/api/live/MoveSeatPolicy;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 127
    return-void
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

.method public final muteMicrophone(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    const-string v1, "callback"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, p2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "liveID"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v1

    .line 20
    .line 21
    :goto_0
    instance-of v2, v0, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    check-cast v0, Ljava/lang/String;

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v0, v1

    .line 28
    .line 29
    :goto_1
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    const-string v0, ""

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-virtual {v2, v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->muteMicrophone()V

    .line 41
    .line 42
    sget-object v0, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse;->Companion:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;->getApi()Ljava/lang/String;

    .line 46
    move-result-object p1

    .line 47
    const/4 v2, 0x2

    .line 48
    .line 49
    .line 50
    invoke-static {v0, p1, v1, v2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;->success$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridResponse$Companion;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    .line 54
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    return-void
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

.method public final openRemoteCamera(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 6
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    const-string v1, "callback"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, p2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "liveID"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    .line 21
    :goto_0
    instance-of v3, v2, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v2, v1

    .line 28
    .line 29
    :goto_1
    const-string v3, ""

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    move-object v2, v3

    .line 33
    .line 34
    :cond_2
    if-eqz v0, :cond_3

    .line 35
    .line 36
    .line 37
    const-string/jumbo v4, "userID"

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    move-result-object v4

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    move-object v4, v1

    .line 44
    .line 45
    :goto_2
    instance-of v5, v4, Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v5, :cond_4

    .line 48
    .line 49
    check-cast v4, Ljava/lang/String;

    .line 50
    goto :goto_3

    .line 51
    :cond_4
    move-object v4, v1

    .line 52
    .line 53
    :goto_3
    if-nez v4, :cond_5

    .line 54
    goto :goto_4

    .line 55
    :cond_5
    move-object v3, v4

    .line 56
    .line 57
    :goto_4
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy$Companion;

    .line 58
    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    const-string v5, "policy"

    .line 62
    .line 63
    .line 64
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    move-result-object v0

    .line 66
    goto :goto_5

    .line 67
    :cond_6
    move-object v0, v1

    .line 68
    .line 69
    :goto_5
    instance-of v5, v0, Ljava/lang/Number;

    .line 70
    .line 71
    if-eqz v5, :cond_7

    .line 72
    move-object v1, v0

    .line 73
    .line 74
    check-cast v1, Ljava/lang/Number;

    .line 75
    .line 76
    :cond_7
    if-eqz v1, :cond_8

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 80
    move-result v0

    .line 81
    goto :goto_6

    .line 82
    :cond_8
    const/4 v0, 0x1

    .line 83
    .line 84
    .line 85
    :goto_6
    invoke-virtual {v4, v0}, Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    new-instance v2, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$openRemoteCamera$completionHandler$1;

    .line 95
    .line 96
    .line 97
    invoke-direct {v2, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$openRemoteCamera$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v3, v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->openRemoteCamera(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 101
    return-void
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

.method public final openRemoteMicrophone(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 6
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    const-string v1, "callback"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, p2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "liveID"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    .line 21
    :goto_0
    instance-of v3, v2, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v2, v1

    .line 28
    .line 29
    :goto_1
    const-string v3, ""

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    move-object v2, v3

    .line 33
    .line 34
    :cond_2
    if-eqz v0, :cond_3

    .line 35
    .line 36
    .line 37
    const-string/jumbo v4, "userID"

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    move-result-object v4

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    move-object v4, v1

    .line 44
    .line 45
    :goto_2
    instance-of v5, v4, Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v5, :cond_4

    .line 48
    .line 49
    check-cast v4, Ljava/lang/String;

    .line 50
    goto :goto_3

    .line 51
    :cond_4
    move-object v4, v1

    .line 52
    .line 53
    :goto_3
    if-nez v4, :cond_5

    .line 54
    goto :goto_4

    .line 55
    :cond_5
    move-object v3, v4

    .line 56
    .line 57
    :goto_4
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy$Companion;

    .line 58
    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    const-string v5, "policy"

    .line 62
    .line 63
    .line 64
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    move-result-object v0

    .line 66
    goto :goto_5

    .line 67
    :cond_6
    move-object v0, v1

    .line 68
    .line 69
    :goto_5
    instance-of v5, v0, Ljava/lang/Number;

    .line 70
    .line 71
    if-eqz v5, :cond_7

    .line 72
    move-object v1, v0

    .line 73
    .line 74
    check-cast v1, Ljava/lang/Number;

    .line 75
    .line 76
    :cond_7
    if-eqz v1, :cond_8

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 80
    move-result v0

    .line 81
    goto :goto_6

    .line 82
    :cond_8
    const/4 v0, 0x1

    .line 83
    .line 84
    .line 85
    :goto_6
    invoke-virtual {v4, v0}, Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    new-instance v2, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$openRemoteMicrophone$completionHandler$1;

    .line 95
    .line 96
    .line 97
    invoke-direct {v2, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$openRemoteMicrophone$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v3, v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->openRemoteMicrophone(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/DeviceControlPolicy;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 101
    return-void
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

.method public final takeSeat(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    const-string v1, "callback"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, p2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "liveID"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    .line 21
    :goto_0
    instance-of v3, v2, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v2, v1

    .line 28
    .line 29
    :goto_1
    if-nez v2, :cond_2

    .line 30
    .line 31
    const-string v2, ""

    .line 32
    .line 33
    :cond_2
    if-eqz v0, :cond_3

    .line 34
    .line 35
    const-string v3, "seatIndex"

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    move-result-object v0

    .line 40
    goto :goto_2

    .line 41
    :cond_3
    move-object v0, v1

    .line 42
    .line 43
    :goto_2
    instance-of v3, v0, Ljava/lang/Number;

    .line 44
    .line 45
    if-eqz v3, :cond_4

    .line 46
    move-object v1, v0

    .line 47
    .line 48
    check-cast v1, Ljava/lang/Number;

    .line 49
    .line 50
    :cond_4
    if-eqz v1, :cond_5

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 54
    move-result v0

    .line 55
    goto :goto_3

    .line 56
    :cond_5
    const/4 v0, 0x0

    .line 57
    .line 58
    :goto_3
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    new-instance v2, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$takeSeat$completionHandler$1;

    .line 65
    .line 66
    .line 67
    invoke-direct {v2, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$takeSeat$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->takeSeat(ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 71
    return-void
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

.method public final unlockSeat(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    const-string v1, "callback"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, p2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "liveID"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    .line 21
    :goto_0
    instance-of v3, v2, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v2, v1

    .line 28
    .line 29
    :goto_1
    if-nez v2, :cond_2

    .line 30
    .line 31
    const-string v2, ""

    .line 32
    .line 33
    :cond_2
    if-eqz v0, :cond_3

    .line 34
    .line 35
    const-string v3, "seatIndex"

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    move-result-object v0

    .line 40
    goto :goto_2

    .line 41
    :cond_3
    move-object v0, v1

    .line 42
    .line 43
    :goto_2
    instance-of v3, v0, Ljava/lang/Number;

    .line 44
    .line 45
    if-eqz v3, :cond_4

    .line 46
    move-object v1, v0

    .line 47
    .line 48
    check-cast v1, Ljava/lang/Number;

    .line 49
    .line 50
    :cond_4
    if-eqz v1, :cond_5

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 54
    move-result v0

    .line 55
    goto :goto_3

    .line 56
    :cond_5
    const/4 v0, 0x0

    .line 57
    .line 58
    :goto_3
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    new-instance v2, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$unlockSeat$completionHandler$1;

    .line 65
    .line 66
    .line 67
    invoke-direct {v2, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$unlockSeat$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->unlockSeat(ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 71
    return-void
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

.method public final unmuteMicrophone(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "request"

    .line 3
    .line 4
    const-string v1, "callback"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0, p2, v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/a;->a(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v2, "liveID"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v1

    .line 20
    .line 21
    :goto_0
    instance-of v2, v0, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    move-object v1, v0

    .line 25
    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    :cond_1
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;

    .line 29
    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    const-string v1, ""

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$unmuteMicrophone$completionHandler$1;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI$unmuteMicrophone$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->unmuteMicrophone(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 45
    return-void
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
