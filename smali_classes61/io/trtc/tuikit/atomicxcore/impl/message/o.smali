.class public final Lio/trtc/tuikit/atomicxcore/impl/message/o;
.super Lio/trtc/tuikit/atomicxcore/api/message/MessageActionStore;
.source "SourceFile"


# instance fields
.field public final a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

.field public b:J

.field public c:J

.field public d:I

.field public e:I

.field public f:Ljava/lang/String;

.field public g:I

.field public h:I

.field public i:Z

.field public final j:Lkotlinx/coroutines/flow/n;

.field public final k:Lkotlinx/coroutines/flow/n;

.field public final l:Lkotlinx/coroutines/flow/n;

.field public final m:Lkotlinx/coroutines/flow/n;

.field public final n:Lkotlinx/coroutines/flow/n;

.field public final o:Lkotlinx/coroutines/flow/n;

.field public final p:Lio/trtc/tuikit/atomicxcore/api/message/MessageActionState;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;)V
    .locals 12

    .line 1
    .line 2
    const-string v0, "message"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageActionStore;-><init>(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;)V

    .line 9
    .line 10
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 11
    .line 12
    const-string p1, ""

    .line 13
    .line 14
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->f:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->j:Lkotlinx/coroutines/flow/n;

    .line 25
    .line 26
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->k:Lkotlinx/coroutines/flow/n;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->l:Lkotlinx/coroutines/flow/n;

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->m:Lkotlinx/coroutines/flow/n;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 52
    move-result-object v4

    .line 53
    .line 54
    .line 55
    invoke-static {v4}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 56
    move-result-object v4

    .line 57
    .line 58
    iput-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->n:Lkotlinx/coroutines/flow/n;

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->o:Lkotlinx/coroutines/flow/n;

    .line 65
    .line 66
    new-instance v5, Lio/trtc/tuikit/atomicxcore/api/message/MessageActionState;

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 70
    move-result-object v6

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 74
    move-result-object v7

    .line 75
    .line 76
    .line 77
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 78
    move-result-object v8

    .line 79
    .line 80
    .line 81
    invoke-static {v3}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 82
    move-result-object v9

    .line 83
    .line 84
    .line 85
    invoke-static {v4}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 86
    move-result-object v10

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 90
    move-result-object v11

    .line 91
    .line 92
    .line 93
    invoke-direct/range {v5 .. v11}, Lio/trtc/tuikit/atomicxcore/api/message/MessageActionState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 94
    .line 95
    iput-object v5, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->p:Lio/trtc/tuikit/atomicxcore/api/message/MessageActionState;

    .line 96
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
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 6
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->i:Z

    .line 8
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/common/d;->c:Lio/trtc/tuikit/atomicxcore/impl/common/d;

    .line 9
    const-string v1, "componentType"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const/16 v1, 0x3eb

    int-to-long v1, v1

    .line 11
    const-string v3, "UIComponentType"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 12
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v1

    .line 14
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/m;

    invoke-direct {v2}, Lio/trtc/tuikit/atomicxcore/impl/common/m;-><init>()V

    const-string v3, "reportTUIFeatureUsage"

    invoke-virtual {v1, v3, v0, v2}, Lcom/tencent/imsdk/v2/V2TIMManager;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    return-void
.end method

.method public final a(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 2
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 4
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    const/16 v1, 0x1781

    .line 5
    const-string v2, "Message not found for operation"

    invoke-interface {p1, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    :cond_1
    return v0
.end method

.method public final addMessageReaction(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "reactionID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    move-result v0

    .line 13
    .line 14
    const/16 v1, 0x1781

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    const-string p1, "reactionID cannot be empty"

    .line 21
    .line 22
    .line 23
    invoke-interface {p2, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 24
    return-void

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    const-string p1, "Message not found for operation"

    .line 37
    .line 38
    .line 39
    invoke-interface {p2, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 40
    :cond_1
    return-void

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/message/a;

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/a;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v0, p1, v2}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->addMessageReaction(Lcom/tencent/imsdk/v2/V2TIMMessage;Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

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

.method public final convertVoiceToText(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "language"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a()V

    .line 9
    .line 10
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    const/16 v2, 0x1781

    .line 17
    .line 18
    if-eqz v1, :cond_4

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 22
    move-result v3

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_0
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 31
    move-result-object v3

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    if-eqz p2, :cond_5

    .line 36
    .line 37
    const-string p1, "Message not found for operation"

    .line 38
    .line 39
    .line 40
    invoke-interface {p2, v2, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 41
    return-void

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getSoundElem()Lcom/tencent/imsdk/v2/V2TIMSoundElem;

    .line 45
    move-result-object v4

    .line 46
    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    if-eqz p2, :cond_5

    .line 50
    .line 51
    const-string p1, "This is not a voice message"

    .line 52
    .line 53
    .line 54
    invoke-interface {p2, v2, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 55
    return-void

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getLocalCustomData()Ljava/lang/String;

    .line 59
    move-result-object v2

    .line 60
    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const-string/jumbo v2, "voice_to_text"

    .line 70
    .line 71
    const-string v5, ""

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    move-result-object v2

    .line 76
    .line 77
    .line 78
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 82
    move-result v3

    .line 83
    .line 84
    if-lez v3, :cond_3

    .line 85
    .line 86
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 87
    .line 88
    const-string v3, "onVoiceConvertedToText"

    .line 89
    .line 90
    const-string v5, "messageID"

    .line 91
    .line 92
    .line 93
    invoke-static {v5, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 94
    move-result-object v5

    .line 95
    .line 96
    .line 97
    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    const-string v6, "asrText"

    .line 101
    .line 102
    .line 103
    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    .line 107
    filled-new-array {v5, v0, v2}, [Lkotlin/Pair;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    .line 111
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    .line 115
    invoke-static {v3, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    .line 117
    if-eqz p2, :cond_5

    .line 118
    .line 119
    .line 120
    invoke-interface {p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    return-void

    .line 122
    .line 123
    :catch_0
    :cond_3
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/message/b;

    .line 124
    .line 125
    .line 126
    invoke-direct {v0, p2, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/message/b;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4, p1, v0}, Lcom/tencent/imsdk/v2/V2TIMSoundElem;->convertVoiceToText(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 130
    return-void

    .line 131
    .line 132
    :cond_4
    :goto_0
    if-eqz p2, :cond_5

    .line 133
    .line 134
    const-string p1, "Message ID not found"

    .line 135
    .line 136
    .line 137
    invoke-interface {p2, v2, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 138
    :cond_5
    return-void
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

.method public final deleteMessage(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/message/c;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/message/c;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1, v3}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->deleteMessages(Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 39
    return-void
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

.method public final deleteMessageExtensions(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const/16 p1, 0x1781

    .line 13
    .line 14
    const-string v0, "Message not found for operation"

    .line 15
    .line 16
    .line 17
    invoke-interface {p2, p1, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 18
    :cond_0
    return-void

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/message/d;

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/d;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0, p1, v2}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->deleteMessageExtensions(Lcom/tencent/imsdk/v2/V2TIMMessage;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 31
    return-void
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

.method public final fetchMessageReactionUsers(Ljava/lang/String;ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 8

    .line 1
    .line 2
    const-string v0, "reactionID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    move-result v0

    .line 13
    .line 14
    const/16 v1, 0x1781

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    if-eqz p3, :cond_2

    .line 19
    .line 20
    const-string p1, "reactionID cannot be empty"

    .line 21
    .line 22
    .line 23
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 24
    return-void

    .line 25
    .line 26
    :cond_0
    if-gtz p2, :cond_1

    .line 27
    .line 28
    if-eqz p3, :cond_2

    .line 29
    .line 30
    const-string p1, "count cannot be 0"

    .line 31
    .line 32
    .line 33
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 34
    return-void

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    if-nez v3, :cond_3

    .line 43
    .line 44
    if-eqz p3, :cond_2

    .line 45
    .line 46
    const-string p1, "Message not found for operation"

    .line 47
    .line 48
    .line 49
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 50
    :cond_2
    return-void

    .line 51
    .line 52
    :cond_3
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->f:Ljava/lang/String;

    .line 53
    .line 54
    iput p2, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->h:I

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 58
    move-result-object v2

    .line 59
    .line 60
    new-instance v7, Lio/trtc/tuikit/atomicxcore/impl/message/e;

    .line 61
    .line 62
    .line 63
    invoke-direct {v7, p0, p3}, Lio/trtc/tuikit/atomicxcore/impl/message/e;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/o;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 64
    const/4 v5, 0x0

    .line 65
    move-object v4, p1

    .line 66
    move v6, p2

    .line 67
    .line 68
    .line 69
    invoke-virtual/range {v2 .. v7}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->getAllUserListOfMessageReaction(Lcom/tencent/imsdk/v2/V2TIMMessage;Ljava/lang/String;IILcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 70
    return-void
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
.end method

.method public final fetchMessageReadMembers(ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a()V

    .line 4
    .line 5
    const/16 v0, 0x1781

    .line 6
    .line 7
    if-gtz p1, :cond_0

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    const-string p1, "count cannot be 0"

    .line 12
    .line 13
    .line 14
    invoke-interface {p2, v0, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    const-string p1, "Message not found for operation"

    .line 28
    .line 29
    .line 30
    invoke-interface {p2, v0, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 31
    :cond_1
    return-void

    .line 32
    .line 33
    :cond_2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->d:I

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/message/f;

    .line 40
    .line 41
    .line 42
    invoke-direct {v8, p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/message/f;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lio/trtc/tuikit/atomicxcore/impl/message/o;)V

    .line 43
    const/4 v4, 0x0

    .line 44
    .line 45
    const-wide/16 v5, 0x0

    .line 46
    move v7, p1

    .line 47
    .line 48
    .line 49
    invoke-virtual/range {v2 .. v8}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->getGroupMessageReadMemberList(Lcom/tencent/imsdk/v2/V2TIMMessage;IJILcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 50
    return-void
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

.method public final fetchMessageUnreadMembers(ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a()V

    .line 4
    .line 5
    const/16 v0, 0x1781

    .line 6
    .line 7
    if-gtz p1, :cond_0

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    const-string p1, "count cannot be 0"

    .line 12
    .line 13
    .line 14
    invoke-interface {p2, v0, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    const-string p1, "Message not found for operation"

    .line 28
    .line 29
    .line 30
    invoke-interface {p2, v0, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 31
    :cond_1
    return-void

    .line 32
    .line 33
    :cond_2
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->e:I

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/message/g;

    .line 40
    .line 41
    .line 42
    invoke-direct {v8, p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/message/g;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lio/trtc/tuikit/atomicxcore/impl/message/o;)V

    .line 43
    const/4 v4, 0x1

    .line 44
    .line 45
    const-wide/16 v5, 0x0

    .line 46
    move v7, p1

    .line 47
    .line 48
    .line 49
    invoke-virtual/range {v2 .. v8}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->getGroupMessageReadMemberList(Lcom/tencent/imsdk/v2/V2TIMMessage;IJILcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 50
    return-void
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

.method public final fetchMoreMessageMembers(ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 8

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->k:Lkotlinx/coroutines/flow/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    :cond_0
    if-nez p1, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->m:Lkotlinx/coroutines/flow/n;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast v0, Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    :cond_1
    if-eqz p2, :cond_3

    .line 35
    .line 36
    .line 37
    invoke-interface {p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 38
    return-void

    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    if-nez v2, :cond_4

    .line 47
    .line 48
    if-eqz p2, :cond_3

    .line 49
    .line 50
    const/16 p1, 0x1781

    .line 51
    .line 52
    const-string v0, "Message not found for operation"

    .line 53
    .line 54
    .line 55
    invoke-interface {p2, p1, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 56
    :cond_3
    return-void

    .line 57
    .line 58
    :cond_4
    xor-int/lit8 v3, p1, 0x1

    .line 59
    .line 60
    if-eqz p1, :cond_5

    .line 61
    .line 62
    iget-wide v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->b:J

    .line 63
    :goto_0
    move-wide v4, v0

    .line 64
    goto :goto_1

    .line 65
    .line 66
    :cond_5
    iget-wide v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->c:J

    .line 67
    goto :goto_0

    .line 68
    .line 69
    :goto_1
    if-eqz p1, :cond_6

    .line 70
    .line 71
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->d:I

    .line 72
    :goto_2
    move v6, v0

    .line 73
    goto :goto_3

    .line 74
    .line 75
    :cond_6
    iget v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->e:I

    .line 76
    goto :goto_2

    .line 77
    .line 78
    .line 79
    :goto_3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    new-instance v7, Lio/trtc/tuikit/atomicxcore/impl/message/h;

    .line 83
    .line 84
    .line 85
    invoke-direct {v7, p2, p1, p0}, Lio/trtc/tuikit/atomicxcore/impl/message/h;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;ZLio/trtc/tuikit/atomicxcore/impl/message/o;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual/range {v1 .. v7}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->getGroupMessageReadMemberList(Lcom/tencent/imsdk/v2/V2TIMMessage;IJILcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 89
    return-void
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

.method public final fetchMoreMessageReactionUsers(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->o:Lkotlinx/coroutines/flow/n;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->f:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 26
    move-result v0

    .line 27
    .line 28
    const/16 v1, 0x1781

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    const-string v0, "Please call fetchMessageReactionUsers first"

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, v1, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 38
    return-void

    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 44
    move-result-object v3

    .line 45
    .line 46
    if-nez v3, :cond_3

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    const-string v0, "Message not found for operation"

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v1, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 54
    :cond_2
    return-void

    .line 55
    .line 56
    :cond_3
    iget v5, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->g:I

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->f:Ljava/lang/String;

    .line 63
    .line 64
    iget v6, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->h:I

    .line 65
    .line 66
    new-instance v7, Lio/trtc/tuikit/atomicxcore/impl/message/i;

    .line 67
    .line 68
    .line 69
    invoke-direct {v7, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/message/i;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/o;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual/range {v2 .. v7}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->getAllUserListOfMessageReaction(Lcom/tencent/imsdk/v2/V2TIMMessage;Ljava/lang/String;IILcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 73
    return-void
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

.method public final getMessage()Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final getMessageActionState()Lio/trtc/tuikit/atomicxcore/api/message/MessageActionState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->p:Lio/trtc/tuikit/atomicxcore/api/message/MessageActionState;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final pinMessage(ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    goto :goto_1

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getGroupID()Ljava/lang/String;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 34
    move-result v3

    .line 35
    .line 36
    if-nez v3, :cond_1

    .line 37
    goto :goto_0

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/message/j;

    .line 44
    .line 45
    .line 46
    invoke-direct {v4, v0, v2, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v2, v1, p1, v4}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->pinGroupMessage(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMMessage;ZLcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 50
    return-void

    .line 51
    .line 52
    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    .line 53
    .line 54
    const/16 p1, 0x1781

    .line 55
    .line 56
    const-string v0, "Only group messages can be pinned"

    .line 57
    .line 58
    .line 59
    invoke-interface {p2, p1, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 60
    :cond_3
    :goto_1
    return-void
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

.method public final recallMessage(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/message/k;

    .line 29
    .line 30
    .line 31
    invoke-direct {v3, v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/message/k;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v1, v3}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->revokeMessage(Lcom/tencent/imsdk/v2/V2TIMMessage;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 35
    return-void
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

.method public final removeMessageReaction(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "reactionID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 9
    move-result v0

    .line 10
    .line 11
    const/16 v1, 0x1781

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    const-string p1, "reactionID cannot be empty"

    .line 18
    .line 19
    .line 20
    invoke-interface {p2, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 21
    return-void

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    const-string p1, "Message not found for operation"

    .line 34
    .line 35
    .line 36
    invoke-interface {p2, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 37
    :cond_1
    return-void

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/message/l;

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/l;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v0, p1, v2}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->removeMessageReaction(Lcom/tencent/imsdk/v2/V2TIMMessage;Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 50
    return-void
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

.method public final setMessageExtensions(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "extensions"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    const/16 v1, 0x1781

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    const-string p1, "extensions cannot be empty"

    .line 21
    .line 22
    .line 23
    invoke-interface {p2, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 24
    return-void

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    const-string p1, "Message not found for operation"

    .line 37
    .line 38
    .line 39
    invoke-interface {p2, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 40
    :cond_1
    return-void

    .line 41
    .line 42
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    move-result v2

    .line 54
    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    move-result-object v2

    .line 60
    .line 61
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;

    .line 62
    .line 63
    new-instance v3, Lcom/tencent/imsdk/v2/V2TIMMessageExtension;

    .line 64
    .line 65
    .line 66
    invoke-direct {v3}, Lcom/tencent/imsdk/v2/V2TIMMessageExtension;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;->getExtensionKey()Ljava/lang/String;

    .line 70
    move-result-object v4

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v4}, Lcom/tencent/imsdk/v2/V2TIMMessageExtension;->setExtensionKey(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;->getExtensionValue()Ljava/lang/String;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v2}, Lcom/tencent/imsdk/v2/V2TIMMessageExtension;->setExtensionValue(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    goto :goto_0

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/message/m;

    .line 91
    .line 92
    .line 93
    invoke-direct {v2, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/m;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->setMessageExtensions(Lcom/tencent/imsdk/v2/V2TIMMessage;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 97
    return-void
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

.method public final translateText(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 9

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "sourceTextList"

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string/jumbo v1, "targetLanguage"

    .line 12
    .line 13
    .line 14
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 21
    move-result v2

    .line 22
    .line 23
    const/16 v3, 0x1781

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    if-eqz p4, :cond_7

    .line 28
    .line 29
    .line 30
    const-string/jumbo p1, "sourceTextList cannot be empty"

    .line 31
    .line 32
    .line 33
    invoke-interface {p4, v3, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 34
    return-void

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 38
    move-result v2

    .line 39
    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    if-eqz p4, :cond_7

    .line 43
    .line 44
    .line 45
    const-string/jumbo p1, "targetLanguage cannot be empty"

    .line 46
    .line 47
    .line 48
    invoke-interface {p4, v3, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 49
    return-void

    .line 50
    .line 51
    :cond_1
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    if-eqz v2, :cond_6

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 61
    move-result v4

    .line 62
    .line 63
    if-nez v4, :cond_2

    .line 64
    .line 65
    goto/16 :goto_1

    .line 66
    .line 67
    :cond_2
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/message/o;->a:Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 71
    move-result-object v4

    .line 72
    .line 73
    if-nez v4, :cond_3

    .line 74
    .line 75
    if-eqz p4, :cond_7

    .line 76
    .line 77
    const-string p1, "Message not found for operation"

    .line 78
    .line 79
    .line 80
    invoke-interface {p4, v3, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 81
    return-void

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getLocalCustomData()Ljava/lang/String;

    .line 85
    move-result-object v3

    .line 86
    .line 87
    if-eqz v3, :cond_5

    .line 88
    .line 89
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string/jumbo v3, "text_translation"

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 99
    move-result-object v3

    .line 100
    .line 101
    .line 102
    const-string/jumbo v5, "text_translation_language"

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    move-result-object v4

    .line 107
    .line 108
    if-eqz v3, :cond_5

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Lorg/json/JSONObject;->length()I

    .line 112
    move-result v5

    .line 113
    .line 114
    if-lez v5, :cond_5

    .line 115
    .line 116
    .line 117
    invoke-static {v4, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    move-result v4

    .line 119
    .line 120
    if-eqz v4, :cond_5

    .line 121
    .line 122
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 123
    .line 124
    .line 125
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 129
    move-result-object v5

    .line 130
    .line 131
    .line 132
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    move-result v6

    .line 134
    .line 135
    if-eqz v6, :cond_4

    .line 136
    .line 137
    .line 138
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    move-result-object v6

    .line 140
    .line 141
    check-cast v6, Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    move-result-object v7

    .line 149
    .line 150
    const-string v8, "optString(...)"

    .line 151
    .line 152
    .line 153
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v4, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    goto :goto_0

    .line 158
    .line 159
    .line 160
    :cond_4
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    .line 161
    move-result v0

    .line 162
    .line 163
    if-nez v0, :cond_5

    .line 164
    .line 165
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 166
    .line 167
    const-string v0, "onMessageTranslated"

    .line 168
    .line 169
    const-string v3, "messageID"

    .line 170
    .line 171
    .line 172
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 173
    move-result-object v3

    .line 174
    .line 175
    .line 176
    invoke-static {v1, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 177
    move-result-object v1

    .line 178
    .line 179
    .line 180
    const-string/jumbo v5, "translatedTextMap"

    .line 181
    .line 182
    .line 183
    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 184
    move-result-object v4

    .line 185
    .line 186
    .line 187
    filled-new-array {v3, v1, v4}, [Lkotlin/Pair;

    .line 188
    move-result-object v1

    .line 189
    .line 190
    .line 191
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 192
    move-result-object v1

    .line 193
    .line 194
    .line 195
    invoke-static {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 196
    .line 197
    if-eqz p4, :cond_7

    .line 198
    .line 199
    .line 200
    invoke-interface {p4}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    return-void

    .line 202
    .line 203
    .line 204
    :catch_0
    :cond_5
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 205
    move-result-object v0

    .line 206
    .line 207
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/message/n;

    .line 208
    .line 209
    .line 210
    invoke-direct {v1, p4, v2, p3}, Lio/trtc/tuikit/atomicxcore/impl/message/n;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->translateText(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 214
    return-void

    .line 215
    .line 216
    :cond_6
    :goto_1
    if-eqz p4, :cond_7

    .line 217
    .line 218
    const-string p1, "Message ID not found"

    .line 219
    .line 220
    .line 221
    invoke-interface {p4, v3, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 222
    :cond_7
    return-void
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
.end method
