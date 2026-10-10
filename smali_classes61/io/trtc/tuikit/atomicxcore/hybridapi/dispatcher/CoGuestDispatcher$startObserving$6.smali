.class public final Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6;
.super Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;->startObserving()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000c\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u0010"
    }
    d2 = {
        "io/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6",
        "Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;",
        "onGuestApplicationNoResponse",
        "",
        "reason",
        "Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;",
        "onGuestApplicationResponded",
        "isAccept",
        "",
        "hostUser",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;",
        "onHostInvitationCancelled",
        "onHostInvitationReceived",
        "onKickedOffSeat",
        "seatIndex",
        "",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCoGuestDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoGuestDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,233:1\n35#2,2:234\n35#2,2:236\n35#2,2:238\n35#2,2:240\n*S KotlinDebug\n*F\n+ 1 CoGuestDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6\n*L\n136#1:234,2\n146#1:236,2\n160#1:238,2\n181#1:240,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;

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


# virtual methods
.method public onGuestApplicationNoResponse(Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;)V
    .locals 10
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "reason"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    const/16 v8, 0x1a

    .line 14
    const/4 v9, 0x0

    .line 15
    .line 16
    const-string v3, "listener"

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    const-string v5, "onGuestApplicationNoResponse"

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v2 .. v9}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/NoResponseReason;->getValue()I

    .line 34
    move-result p1

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1, v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 47
    return-void
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

.method public onGuestApplicationResponded(ZLio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 10
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "hostUser"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    const/16 v8, 0x1a

    .line 14
    const/4 v9, 0x0

    .line 15
    .line 16
    const-string v3, "listener"

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    const-string v5, "onGuestApplicationResponded"

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v2 .. v9}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    const-string v3, "isAccept"

    .line 37
    .line 38
    .line 39
    invoke-interface {v2, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    const-string/jumbo p2, "toJson(...)"

    .line 51
    .line 52
    .line 53
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v1, v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 62
    return-void
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

.method public onHostInvitationCancelled(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 10
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "hostUser"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    const/16 v8, 0x1a

    .line 14
    const/4 v9, 0x0

    .line 15
    .line 16
    const-string v3, "listener"

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    const-string v5, "onHostInvitationCancelled"

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v2 .. v9}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    const-string/jumbo v3, "toJson(...)"

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v1, v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 53
    return-void
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

.method public onHostInvitationReceived(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 10
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "hostUser"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    const/16 v8, 0x1a

    .line 14
    const/4 v9, 0x0

    .line 15
    .line 16
    const-string v3, "listener"

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    const-string v5, "onHostInvitationReceived"

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v2 .. v9}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    const-string/jumbo v3, "toJson(...)"

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v1, v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 53
    return-void
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

.method public onKickedOffSeat(ILio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 10
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "hostUser"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    const/16 v8, 0x1a

    .line 14
    const/4 v9, 0x0

    .line 15
    .line 16
    const-string v3, "listener"

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    const-string v5, "onKickedOffSeat"

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v2 .. v9}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    const-string v3, "seatIndex"

    .line 37
    .line 38
    .line 39
    invoke-interface {v2, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    const-string/jumbo p2, "toJson(...)"

    .line 51
    .line 52
    .line 53
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher$startObserving$6;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v1, v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 62
    return-void
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
