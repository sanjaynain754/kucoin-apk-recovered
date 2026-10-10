.class public Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;
.super Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeObserver;
.source "TUIRoomObserverProxy.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "TUIRoomObserverProxy"


# instance fields
.field private mFunctionMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mObserverList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeObserver;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->mObserverList:Ljava/util/List;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->mFunctionMap:Ljava/util/HashMap;

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->registerEventHandler()V

    .line 21
    return-void
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
.end method

.method private bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->mFunctionMap:Ljava/util/HashMap;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    :cond_1
    :goto_0
    return-void
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
.end method

.method private copyOnReadListeners()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->mObserverList:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    return-object v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private registerEventHandler()V
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "onReceiveTextMessage"

    .line 4
    .line 5
    .line 6
    const-string/jumbo v1, "onReceiveTextMessageHandler"

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string/jumbo v0, "onReceiveCustomMessage"

    .line 13
    .line 14
    .line 15
    const-string/jumbo v1, "onReceiveCustomMessageHandler"

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string/jumbo v0, "onSeatListChanged"

    .line 22
    .line 23
    .line 24
    const-string/jumbo v1, "onSeatListChangedHandler"

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    return-void
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
.end method


# virtual methods
.method public addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->mObserverList:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->mObserverList:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public destroy()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->mObserverList:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->mFunctionMap:Ljava/util/HashMap;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public onReceiveCustomMessageHandler(Lorg/json/JSONArray;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const-class v1, Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getRoomCustomMessageFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->copyOnReadListeners()Ljava/util/List;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onReceiveCustomMessage(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;)V

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
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
.end method

.method public onReceiveEventFromPipeline(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    new-instance p2, Lorg/json/JSONArray;

    .line 9
    .line 10
    .line 11
    invoke-direct {p2}, Lorg/json/JSONArray;-><init>()V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->mFunctionMap:Ljava/util/HashMap;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    :catch_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    check-cast v1, Ljava/util/Map$Entry;

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    check-cast v2, Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    invoke-static {v2, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 43
    move-result v2

    .line 44
    .line 45
    if-nez v2, :cond_1

    .line 46
    goto :goto_0

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    :try_start_0
    const-class v2, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;

    .line 55
    .line 56
    const-class v3, Lorg/json/JSONArray;

    .line 57
    .line 58
    .line 59
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    .line 67
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    goto :goto_0

    .line 73
    :cond_2
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
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public onReceiveTextMessageHandler(Lorg/json/JSONArray;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const-class v1, Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getRoomTextMessageFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->copyOnReadListeners()Ljava/util/List;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onReceiveTextMessage(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;)V

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
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
.end method

.method public onSeatListChangedHandler(Lorg/json/JSONArray;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    const-class v2, Lorg/json/JSONArray;

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lorg/json/JSONArray;

    .line 19
    const/4 v3, 0x2

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v3, v2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    check-cast v3, Lorg/json/JSONArray;

    .line 26
    const/4 v4, 0x3

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v4, v2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    check-cast p1, Lorg/json/JSONArray;

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getSeatListFromJSONArray(Lorg/json/JSONArray;)Ljava/util/List;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getUserInfoListFromJSONArray(Lorg/json/JSONArray;)Ljava/util/List;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getUserInfoListFromJSONArray(Lorg/json/JSONArray;)Ljava/util/List;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->copyOnReadListeners()Ljava/util/List;

    .line 48
    move-result-object v3

    .line 49
    .line 50
    .line 51
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    move-result v4

    .line 57
    .line 58
    if-eqz v4, :cond_0

    .line 59
    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    move-result-object v4

    .line 63
    .line 64
    check-cast v4, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v0, v1, v2, p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;->onSeatListChanged(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 68
    goto :goto_0

    .line 69
    :cond_0
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
.end method

.method public removeObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->mObserverList:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/room/TUIRoomObserverProxy;->mObserverList:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
