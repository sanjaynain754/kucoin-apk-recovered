.class public final Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;
.super Lio/trtc/tuikit/atomicxcore/api/live/CoHostListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;->startObserving()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H\u0016\u00a8\u0006\u0010"
    }
    d2 = {
        "io/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5",
        "Lio/trtc/tuikit/atomicxcore/api/live/CoHostListener;",
        "onCoHostRequestAccepted",
        "",
        "invitee",
        "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;",
        "onCoHostRequestCancelled",
        "inviter",
        "onCoHostRequestReceived",
        "extensionInfo",
        "",
        "onCoHostRequestRejected",
        "onCoHostRequestTimeout",
        "onCoHostUserJoined",
        "userInfo",
        "onCoHostUserLeft",
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
        "SMAP\nCoHostDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoHostDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,185:1\n35#2,2:186\n35#2,2:188\n35#2,2:190\n35#2,2:192\n35#2,2:194\n35#2,2:196\n35#2,2:198\n35#2,2:200\n35#2,2:202\n*S KotlinDebug\n*F\n+ 1 CoHostDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5\n*L\n73#1:186,2\n87#1:188,2\n88#1:190,2\n98#1:192,2\n108#1:194,2\n121#1:196,2\n122#1:198,2\n132#1:200,2\n142#1:202,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostListener;-><init>()V

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
.method public onCoHostRequestAccepted(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V
    .locals 10
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "invitee"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

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
    const-string v5, "onCoHostRequestAccepted"

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
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

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

.method public onCoHostRequestCancelled(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V
    .locals 10
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "inviter"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

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
    const-string v5, "onCoHostRequestCancelled"

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
    if-eqz p2, :cond_0

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    if-nez p1, :cond_1

    .line 63
    .line 64
    :cond_0
    const-string p1, "null"

    .line 65
    .line 66
    :cond_1
    const-string p2, "invitee"

    .line 67
    .line 68
    .line 69
    invoke-interface {v2, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v1, v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 75
    return-void
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

.method public onCoHostRequestReceived(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Ljava/lang/String;)V
    .locals 11
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "inviter"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "extensionInfo"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    const/16 v9, 0x1a

    .line 19
    const/4 v10, 0x0

    .line 20
    .line 21
    const-string v4, "listener"

    .line 22
    const/4 v5, 0x0

    .line 23
    .line 24
    const-string v6, "onCoHostRequestReceived"

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x0

    .line 27
    .line 28
    .line 29
    invoke-static/range {v3 .. v10}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    const-string/jumbo v4, "toJson(...)"

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    invoke-interface {v3, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v2, v3}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 61
    return-void
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

.method public onCoHostRequestRejected(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V
    .locals 10
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "invitee"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

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
    const-string v5, "onCoHostRequestRejected"

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
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

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

.method public onCoHostRequestTimeout(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V
    .locals 11
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "inviter"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "invitee"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    const/16 v9, 0x1a

    .line 19
    const/4 v10, 0x0

    .line 20
    .line 21
    const-string v4, "listener"

    .line 22
    const/4 v5, 0x0

    .line 23
    .line 24
    const-string v6, "onCoHostRequestTimeout"

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x0

    .line 27
    .line 28
    .line 29
    invoke-static/range {v3 .. v10}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    const-string/jumbo v4, "toJson(...)"

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    .line 63
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v3, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v2, v3}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 72
    return-void
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

.method public onCoHostUserJoined(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V
    .locals 10
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userInfo"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    const/16 v8, 0x1a

    .line 15
    const/4 v9, 0x0

    .line 16
    .line 17
    const-string v3, "listener"

    .line 18
    const/4 v4, 0x0

    .line 19
    .line 20
    const-string v5, "onCoHostUserJoined"

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static/range {v2 .. v9}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    .line 31
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    const-string/jumbo v3, "toJson(...)"

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1, v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 54
    return-void
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

.method public onCoHostUserLeft(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V
    .locals 10
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userInfo"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;->access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    const/16 v8, 0x1a

    .line 15
    const/4 v9, 0x0

    .line 16
    .line 17
    const-string v3, "listener"

    .line 18
    const/4 v4, 0x0

    .line 19
    .line 20
    const-string v5, "onCoHostUserLeft"

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static/range {v2 .. v9}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->copy$default(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    .line 31
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    const-string/jumbo v3, "toJson(...)"

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher$startObserving$5;->this$0:Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1, v2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 54
    return-void
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
