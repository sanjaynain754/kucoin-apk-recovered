.class public final Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI;",
        "",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "acceptApplication",
        "",
        "request",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;",
        "callback",
        "Lkotlin/Function1;",
        "",
        "acceptInvitation",
        "applyForSeat",
        "cancelApplication",
        "cancelInvitation",
        "disconnect",
        "inviteToSeat",
        "rejectApplication",
        "rejectInvitation",
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI;->context:Landroid/content/Context;

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
.method public final acceptApplication(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
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
    .line 36
    const-string/jumbo v3, "userID"

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    move-result-object v0

    .line 41
    goto :goto_2

    .line 42
    :cond_3
    move-object v0, v1

    .line 43
    .line 44
    :goto_2
    instance-of v3, v0, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v3, :cond_4

    .line 47
    move-object v1, v0

    .line 48
    .line 49
    check-cast v1, Ljava/lang/String;

    .line 50
    .line 51
    :cond_4
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    new-instance v2, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$acceptApplication$completionHandler$1;

    .line 58
    .line 59
    .line 60
    invoke-direct {v2, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$acceptApplication$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->acceptApplication(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 64
    return-void
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

.method public final acceptInvitation(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
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
    const-string v3, "inviterID"

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
    instance-of v3, v0, Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v3, :cond_4

    .line 46
    move-object v1, v0

    .line 47
    .line 48
    check-cast v1, Ljava/lang/String;

    .line 49
    .line 50
    :cond_4
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    new-instance v2, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$acceptInvitation$completionHandler$1;

    .line 57
    .line 58
    .line 59
    invoke-direct {v2, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$acceptInvitation$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->acceptInvitation(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 63
    return-void
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

.method public final applyForSeat(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
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
    move-result-object v3

    .line 40
    goto :goto_2

    .line 41
    :cond_3
    move-object v3, v1

    .line 42
    .line 43
    :goto_2
    instance-of v4, v3, Ljava/lang/Number;

    .line 44
    .line 45
    if-eqz v4, :cond_4

    .line 46
    .line 47
    check-cast v3, Ljava/lang/Number;

    .line 48
    goto :goto_3

    .line 49
    :cond_4
    move-object v3, v1

    .line 50
    .line 51
    :goto_3
    if-eqz v3, :cond_5

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 55
    move-result v3

    .line 56
    goto :goto_4

    .line 57
    :cond_5
    const/4 v3, -0x1

    .line 58
    .line 59
    :goto_4
    if-eqz v0, :cond_6

    .line 60
    .line 61
    .line 62
    const-string/jumbo v4, "timeout"

    .line 63
    .line 64
    .line 65
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    move-result-object v4

    .line 67
    goto :goto_5

    .line 68
    :cond_6
    move-object v4, v1

    .line 69
    .line 70
    :goto_5
    instance-of v5, v4, Ljava/lang/Number;

    .line 71
    .line 72
    if-eqz v5, :cond_7

    .line 73
    .line 74
    check-cast v4, Ljava/lang/Number;

    .line 75
    goto :goto_6

    .line 76
    :cond_7
    move-object v4, v1

    .line 77
    .line 78
    :goto_6
    if-eqz v4, :cond_8

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 82
    move-result v4

    .line 83
    goto :goto_7

    .line 84
    :cond_8
    const/4 v4, 0x0

    .line 85
    .line 86
    :goto_7
    if-eqz v0, :cond_9

    .line 87
    .line 88
    const-string v5, "extraInfo"

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    move-result-object v0

    .line 93
    goto :goto_8

    .line 94
    :cond_9
    move-object v0, v1

    .line 95
    .line 96
    :goto_8
    instance-of v5, v0, Ljava/lang/String;

    .line 97
    .line 98
    if-eqz v5, :cond_a

    .line 99
    move-object v1, v0

    .line 100
    .line 101
    check-cast v1, Ljava/lang/String;

    .line 102
    .line 103
    :cond_a
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    new-instance v2, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$applyForSeat$completionHandler$1;

    .line 110
    .line 111
    .line 112
    invoke-direct {v2, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$applyForSeat$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v3, v4, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->applyForSeat(IILjava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 116
    return-void
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

.method public final cancelApplication(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
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
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;

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
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$cancelApplication$completionHandler$1;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$cancelApplication$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->cancelApplication(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

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

.method public final cancelInvitation(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
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
    const-string v4, "inviteeID"

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    move-result-object v0

    .line 41
    goto :goto_2

    .line 42
    :cond_3
    move-object v0, v1

    .line 43
    .line 44
    :goto_2
    instance-of v4, v0, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v4, :cond_4

    .line 47
    move-object v1, v0

    .line 48
    .line 49
    check-cast v1, Ljava/lang/String;

    .line 50
    .line 51
    :cond_4
    if-nez v1, :cond_5

    .line 52
    goto :goto_3

    .line 53
    :cond_5
    move-object v3, v1

    .line 54
    .line 55
    :goto_3
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$cancelInvitation$completionHandler$1;

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$cancelInvitation$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v3, v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->cancelInvitation(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 68
    return-void
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

.method public final disconnect(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
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
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;

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
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$disconnect$completionHandler$1;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$disconnect$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->disconnect(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

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

.method public final inviteToSeat(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 11
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
    const-string v4, "inviteeID"

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    move-result-object v4

    .line 41
    goto :goto_2

    .line 42
    :cond_3
    move-object v4, v1

    .line 43
    .line 44
    :goto_2
    instance-of v5, v4, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v5, :cond_4

    .line 47
    .line 48
    check-cast v4, Ljava/lang/String;

    .line 49
    goto :goto_3

    .line 50
    :cond_4
    move-object v4, v1

    .line 51
    .line 52
    :goto_3
    if-nez v4, :cond_5

    .line 53
    move-object v6, v3

    .line 54
    goto :goto_4

    .line 55
    :cond_5
    move-object v6, v4

    .line 56
    .line 57
    :goto_4
    if-eqz v0, :cond_6

    .line 58
    .line 59
    const-string v3, "seatIndex"

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    move-result-object v3

    .line 64
    goto :goto_5

    .line 65
    :cond_6
    move-object v3, v1

    .line 66
    .line 67
    :goto_5
    instance-of v4, v3, Ljava/lang/Number;

    .line 68
    .line 69
    if-eqz v4, :cond_7

    .line 70
    .line 71
    check-cast v3, Ljava/lang/Number;

    .line 72
    goto :goto_6

    .line 73
    :cond_7
    move-object v3, v1

    .line 74
    .line 75
    :goto_6
    if-eqz v3, :cond_8

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 79
    move-result v3

    .line 80
    :goto_7
    move v7, v3

    .line 81
    goto :goto_8

    .line 82
    :cond_8
    const/4 v3, -0x1

    .line 83
    goto :goto_7

    .line 84
    .line 85
    :goto_8
    if-eqz v0, :cond_9

    .line 86
    .line 87
    .line 88
    const-string/jumbo v3, "timeout"

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    move-result-object v3

    .line 93
    goto :goto_9

    .line 94
    :cond_9
    move-object v3, v1

    .line 95
    .line 96
    :goto_9
    instance-of v4, v3, Ljava/lang/Number;

    .line 97
    .line 98
    if-eqz v4, :cond_a

    .line 99
    .line 100
    check-cast v3, Ljava/lang/Number;

    .line 101
    goto :goto_a

    .line 102
    :cond_a
    move-object v3, v1

    .line 103
    .line 104
    :goto_a
    if-eqz v3, :cond_b

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 108
    move-result v3

    .line 109
    :goto_b
    move v8, v3

    .line 110
    goto :goto_c

    .line 111
    :cond_b
    const/4 v3, 0x0

    .line 112
    goto :goto_b

    .line 113
    .line 114
    :goto_c
    if-eqz v0, :cond_c

    .line 115
    .line 116
    const-string v3, "extraInfo"

    .line 117
    .line 118
    .line 119
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    move-result-object v0

    .line 121
    goto :goto_d

    .line 122
    :cond_c
    move-object v0, v1

    .line 123
    .line 124
    :goto_d
    instance-of v3, v0, Ljava/lang/String;

    .line 125
    .line 126
    if-eqz v3, :cond_d

    .line 127
    move-object v1, v0

    .line 128
    .line 129
    check-cast v1, Ljava/lang/String;

    .line 130
    :cond_d
    move-object v9, v1

    .line 131
    .line 132
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 136
    move-result-object v5

    .line 137
    .line 138
    new-instance v10, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$inviteToSeat$completionHandler$1;

    .line 139
    .line 140
    .line 141
    invoke-direct {v10, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$inviteToSeat$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v5 .. v10}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->inviteToSeat(Ljava/lang/String;IILjava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 145
    return-void
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

.method public final rejectApplication(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
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
    .line 36
    const-string/jumbo v3, "userID"

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    move-result-object v0

    .line 41
    goto :goto_2

    .line 42
    :cond_3
    move-object v0, v1

    .line 43
    .line 44
    :goto_2
    instance-of v3, v0, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v3, :cond_4

    .line 47
    move-object v1, v0

    .line 48
    .line 49
    check-cast v1, Ljava/lang/String;

    .line 50
    .line 51
    :cond_4
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    new-instance v2, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$rejectApplication$completionHandler$1;

    .line 58
    .line 59
    .line 60
    invoke-direct {v2, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$rejectApplication$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->rejectApplication(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 64
    return-void
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

.method public final rejectInvitation(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;Lkotlin/jvm/functions/Function1;)V
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
    const-string v3, "inviterID"

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
    instance-of v3, v0, Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v3, :cond_4

    .line 46
    move-object v1, v0

    .line 47
    .line 48
    check-cast v1, Ljava/lang/String;

    .line 49
    .line 50
    :cond_4
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    new-instance v2, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$rejectInvitation$completionHandler$1;

    .line 57
    .line 58
    .line 59
    invoke-direct {v2, p2, p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI$rejectInvitation$completionHandler$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->rejectInvitation(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 63
    return-void
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
