.class public Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;
.super Ljava/lang/Object;
.source "ParamsParse.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "ParamsParse"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method

.method public static JSONArrayToList(Lorg/json/JSONArray;Ljava/lang/Class;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/json/JSONArray;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "ParamsParse"

    .line 3
    .line 4
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 16
    move-result v3

    .line 17
    .line 18
    if-ge v2, v3, :cond_4

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    :try_start_0
    const-class v4, Ljava/lang/String;

    .line 22
    .line 23
    if-ne p1, v4, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v4}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    move-result-object v3

    .line 32
    goto :goto_2

    .line 33
    :catch_0
    move-exception v4

    .line 34
    goto :goto_1

    .line 35
    .line 36
    :cond_1
    const-class v4, Ljava/lang/Integer;

    .line 37
    .line 38
    if-ne p1, v4, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->getInt(I)I

    .line 42
    move-result v4

    .line 43
    .line 44
    .line 45
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    move-result-object v4

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v4}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    move-result-object v3

    .line 51
    goto :goto_2

    .line 52
    .line 53
    :cond_2
    const-class v4, Ljava/lang/Double;

    .line 54
    .line 55
    if-ne p1, v4, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->getDouble(I)D

    .line 59
    move-result-wide v4

    .line 60
    .line 61
    .line 62
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v4}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    move-result-object v3

    .line 68
    goto :goto_2

    .line 69
    .line 70
    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    const-string v5, "JSONArrayToList, Unsupported type: "

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 82
    move-result-object v5

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    move-result-object v4

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v4}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    goto :goto_2

    .line 94
    .line 95
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    const-string v6, "JSONArrayToList, error: "

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v4, " jsonArray: "

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    move-result-object v4

    .line 119
    .line 120
    .line 121
    invoke-static {v0, v4}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :goto_2
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    add-int/lit8 v2, v2, 0x1

    .line 127
    goto :goto_0

    .line 128
    :cond_4
    :goto_3
    return-object v1
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

.method public static JSONObjectToMap(Lorg/json/JSONObject;Ljava/lang/Class;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "TT;>;"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "ParamsParse"

    .line 3
    .line 4
    new-instance v1, Ljava/util/HashMap;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v3

    .line 20
    .line 21
    if-eqz v3, :cond_4

    .line 22
    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    check-cast v3, Ljava/lang/String;

    .line 28
    .line 29
    :try_start_0
    const-class v4, Ljava/lang/String;

    .line 30
    .line 31
    if-ne p1, v4, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v4}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    move-result-object v4

    .line 40
    goto :goto_1

    .line 41
    :catch_0
    move-exception v3

    .line 42
    goto :goto_2

    .line 43
    .line 44
    :cond_1
    const-class v4, Ljava/lang/Integer;

    .line 45
    .line 46
    if-ne p1, v4, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 50
    move-result v4

    .line 51
    .line 52
    .line 53
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    move-result-object v4

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v4}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    move-result-object v4

    .line 59
    goto :goto_1

    .line 60
    .line 61
    :cond_2
    const-class v4, Ljava/lang/Double;

    .line 62
    .line 63
    if-ne p1, v4, :cond_3

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 67
    move-result-wide v4

    .line 68
    .line 69
    .line 70
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 71
    move-result-object v4

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v4}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    move-result-object v4

    .line 76
    goto :goto_1

    .line 77
    .line 78
    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    const-string v5, "JSONObjectToMap, Unsupported type: "

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 90
    move-result-object v5

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    move-result-object v4

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v4}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    const/4 v4, 0x0

    .line 102
    .line 103
    .line 104
    :goto_1
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    goto :goto_0

    .line 106
    .line 107
    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    const-string v5, "JSONObjectToMap, error: "

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v3, " jsonObject: "

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    move-result-object v3

    .line 131
    .line 132
    .line 133
    invoke-static {v0, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    goto :goto_0

    .line 135
    :cond_4
    :goto_3
    return-object v1
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

.method public static StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 2

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    return-object v0

    .line 7
    :catch_0
    move-exception p0

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    const-string v1, "StringToJSONArray failed, error: "

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    const-string v0, "ParamsParse"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0
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

.method public static callParamsToJsonObject(Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;)Lorg/json/JSONObject;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    const-string v1, "ParamsParse"

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const-string p0, "callParams is null, return empty JSONObject"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->roomId:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    .line 22
    const-string/jumbo v3, "room_id"

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->roomIdToJsonObject(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;)Lorg/json/JSONObject;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p0

    .line 32
    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    const-string/jumbo v2, "timeout"

    .line 37
    .line 38
    iget v3, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->timeout:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 42
    .line 43
    const-string v2, "is_ephemeral_call"

    .line 44
    .line 45
    iget-boolean v3, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->isEphemeralCall:Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    const-string/jumbo v2, "user_data"

    .line 52
    .line 53
    iget-object v3, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->userData:Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 57
    .line 58
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 59
    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    new-instance v2, Lorg/json/JSONObject;

    .line 63
    .line 64
    .line 65
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string/jumbo v3, "title"

    .line 69
    .line 70
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->getTitle()Ljava/lang/String;

    .line 74
    move-result-object v4

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    .line 79
    const-string v3, "desc"

    .line 80
    .line 81
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->getDesc()Ljava/lang/String;

    .line 85
    move-result-object v4

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    .line 90
    const-string v3, "ignore_ios_badge"

    .line 91
    .line 92
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->isIgnoreIOSBadge()Z

    .line 96
    move-result v4

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 100
    .line 101
    const-string v3, "enable_ios_background_notification"

    .line 102
    .line 103
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 104
    .line 105
    iget-boolean v4, v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->enableIOSBackgroundNotification:Z

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 109
    .line 110
    const-string v3, "ios_interruption_level"

    .line 111
    .line 112
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 113
    .line 114
    iget-object v4, v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->iOSInterruptionLevel:Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 118
    .line 119
    const-string v3, "ios_image"

    .line 120
    .line 121
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 122
    .line 123
    iget-object v4, v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->iOSImage:Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 127
    .line 128
    const-string v3, "ios_sound"

    .line 129
    .line 130
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->getIOSSound()Ljava/lang/String;

    .line 134
    move-result-object v4

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 138
    .line 139
    const-string v3, "android_sound"

    .line 140
    .line 141
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->getAndroidSound()Ljava/lang/String;

    .line 145
    move-result-object v4

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 149
    .line 150
    const-string v3, "android_oppo_channel_id"

    .line 151
    .line 152
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->getAndroidOPPOChannelID()Ljava/lang/String;

    .line 156
    move-result-object v4

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 160
    .line 161
    .line 162
    const-string/jumbo v3, "oppo_category"

    .line 163
    .line 164
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 165
    .line 166
    iget-object v4, v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->OPPOCategory:Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 170
    .line 171
    .line 172
    const-string/jumbo v3, "oppo_notify_level"

    .line 173
    .line 174
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 175
    .line 176
    iget v4, v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->OPPONotifyLevel:I

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 180
    .line 181
    const-string v3, "android_fcm_channel_id"

    .line 182
    .line 183
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->getAndroidFCMChannelID()Ljava/lang/String;

    .line 187
    move-result-object v4

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 191
    .line 192
    const-string v3, "fcm_image"

    .line 193
    .line 194
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 195
    .line 196
    iget-object v4, v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->fcmImage:Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 200
    .line 201
    const-string v3, "android_xiaomi_channel_id"

    .line 202
    .line 203
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->getAndroidXiaoMiChannelID()Ljava/lang/String;

    .line 207
    move-result-object v4

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 211
    .line 212
    const-string v3, "android_vivo_classification"

    .line 213
    .line 214
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->getAndroidVIVOClassification()I

    .line 218
    move-result v4

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 222
    .line 223
    .line 224
    const-string/jumbo v3, "vivo_category"

    .line 225
    .line 226
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 227
    .line 228
    iget-object v4, v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->VIVOCategory:Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 232
    .line 233
    const-string v3, "android_huawei_category"

    .line 234
    .line 235
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->getAndroidHuaWeiCategory()Ljava/lang/String;

    .line 239
    move-result-object v4

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 243
    .line 244
    const-string v3, "huawei_image"

    .line 245
    .line 246
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 247
    .line 248
    iget-object v4, v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->huaweiImage:Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 252
    .line 253
    const-string v3, "honor_importance"

    .line 254
    .line 255
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 256
    .line 257
    iget-object v4, v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->honorImportance:Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 261
    .line 262
    const-string v3, "honor_image"

    .line 263
    .line 264
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 265
    .line 266
    iget-object v4, v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->honorImage:Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 270
    .line 271
    const-string v3, "is_disable_push"

    .line 272
    .line 273
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->isDisablePush()Z

    .line 277
    move-result v4

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 281
    .line 282
    const-string v3, "ios_push_type"

    .line 283
    .line 284
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->getIOSPushType()Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$IOSOfflinePushType;

    .line 288
    move-result-object v4

    .line 289
    .line 290
    if-eqz v4, :cond_2

    .line 291
    .line 292
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->getIOSPushType()Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$IOSOfflinePushType;

    .line 296
    move-result-object v4

    .line 297
    .line 298
    .line 299
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$IOSOfflinePushType;->getValue()I

    .line 300
    move-result v4

    .line 301
    goto :goto_1

    .line 302
    .line 303
    :cond_2
    sget-object v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$IOSOfflinePushType;->APNs:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$IOSOfflinePushType;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$IOSOfflinePushType;->getValue()I

    .line 307
    move-result v4

    .line 308
    .line 309
    .line 310
    :goto_1
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 311
    .line 312
    const-string v3, "extension"

    .line 313
    .line 314
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;->offlinePushInfo:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;

    .line 315
    .line 316
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$OfflinePushInfo;->extraInfo:Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v3, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 320
    .line 321
    .line 322
    const-string/jumbo p0, "offline_push_info"

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, p0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 326
    :cond_3
    return-object v0

    .line 327
    .line 328
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 332
    .line 333
    const-string v2, "callParamsToJsonString failed, error: "

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    move-result-object p0

    .line 344
    .line 345
    .line 346
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    .line 348
    new-instance p0, Lorg/json/JSONObject;

    .line 349
    .line 350
    .line 351
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 352
    return-object p0
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method

.method public static getCallRecordsFromJSONArray(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    const-string v1, "ParamsParse"

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    .line 12
    const-string/jumbo p0, "parseCallRecords: invalid JSON format"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    return-object v0

    .line 17
    :cond_0
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 21
    move-result v3

    .line 22
    .line 23
    if-ge v2, v3, :cond_2

    .line 24
    .line 25
    .line 26
    :try_start_0
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-static {v3}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getRecordFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    goto :goto_1

    .line 40
    :catch_0
    move-exception v3

    .line 41
    .line 42
    new-instance v4, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string/jumbo v5, "parseCallRecords error at index "

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    .line 61
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v4, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    .line 67
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string/jumbo v2, "parseCallRecords: successfully parsed "

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 83
    move-result v2

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v2, " records"

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    move-result-object p0

    .line 96
    .line 97
    .line 98
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    return-object v0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
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
.end method

.method public static getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/json/JSONArray;",
            "I",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p0, :cond_a

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 7
    move-result v1

    .line 8
    .line 9
    if-gt v1, p1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_1

    .line 12
    .line 13
    :cond_0
    const-class v1, Ljava/lang/String;

    .line 14
    .line 15
    if-ne p2, v1, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :catch_0
    move-exception p0

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_1
    const-class v1, Ljava/lang/Integer;

    .line 25
    .line 26
    if-ne p2, v1, :cond_2

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getInt(I)I

    .line 30
    move-result p0

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    .line 37
    :cond_2
    const-class v1, Ljava/lang/Boolean;

    .line 38
    .line 39
    if-ne p2, v1, :cond_3

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getBoolean(I)Z

    .line 43
    move-result p0

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    .line 50
    :cond_3
    const-class v1, Lorg/json/JSONObject;

    .line 51
    .line 52
    if-ne p2, v1, :cond_4

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    .line 59
    :cond_4
    const-class v1, Lorg/json/JSONArray;

    .line 60
    .line 61
    if-ne p2, v1, :cond_5

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    .line 68
    :cond_5
    const-class v1, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 69
    .line 70
    if-ne p2, v1, :cond_6

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getInt(I)I

    .line 74
    move-result p0

    .line 75
    .line 76
    .line 77
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    .line 81
    :cond_6
    const-class v1, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 82
    .line 83
    if-ne p2, v1, :cond_7

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getInt(I)I

    .line 87
    move-result p0

    .line 88
    .line 89
    .line 90
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    .line 94
    :cond_7
    const-class v1, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallEndReason;

    .line 95
    .line 96
    if-ne p2, v1, :cond_8

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getInt(I)I

    .line 100
    move-result p0

    .line 101
    .line 102
    .line 103
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallEndReason;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallEndReason;

    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    .line 107
    :cond_8
    const-class v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 108
    .line 109
    if-ne p2, v1, :cond_9

    .line 110
    .line 111
    new-instance p2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 112
    .line 113
    .line 114
    invoke-direct {p2}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getInt(I)I

    .line 118
    move-result v1

    .line 119
    .line 120
    iput v1, p2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;->intRoomId:I

    .line 121
    .line 122
    add-int/lit8 p1, p1, 0x1

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 126
    move-result-object p0

    .line 127
    .line 128
    iput-object p0, p2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;->strRoomId:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    return-object p2

    .line 130
    :cond_9
    return-object v0

    .line 131
    .line 132
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    const-string p2, "getParamFromJSONArray json parse fail error"

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    move-result-object p0

    .line 148
    .line 149
    const-string p1, "ParamsParse"

    .line 150
    .line 151
    .line 152
    invoke-static {p1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    :cond_a
    :goto_1
    return-object v0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
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
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
.end method

.method public static getQualityInfoListFromJSONArray(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkQualityInfo;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 11
    move-result v1

    .line 12
    .line 13
    if-gtz v1, :cond_0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 19
    move-result v2

    .line 20
    .line 21
    if-ge v1, v2, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    new-instance v3, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkQualityInfo;

    .line 28
    .line 29
    .line 30
    invoke-direct {v3}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkQualityInfo;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string/jumbo v4, "user_id"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    move-result-object v4

    .line 38
    .line 39
    iput-object v4, v3, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkQualityInfo;->userId:Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkQuality;->values()[Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkQuality;

    .line 43
    move-result-object v4

    .line 44
    .line 45
    .line 46
    const-string/jumbo v5, "quality"

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 50
    move-result v2

    .line 51
    .line 52
    aget-object v2, v4, v2

    .line 53
    .line 54
    iput-object v2, v3, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkQualityInfo;->quality:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkQuality;

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    add-int/lit8 v1, v1, 0x1

    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception p0

    .line 62
    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    const-string v2, "getQualityInfoList failed, error: "

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    move-result-object p0

    .line 79
    .line 80
    const-string v1, "ParamsParse"

    .line 81
    .line 82
    .line 83
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    :cond_1
    :goto_1
    return-object v0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
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
.end method

.method public static getRecordFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const-string v1, "ParamsParse"

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-string p0, "getRecordFromJSONObject: input jsonObject is null"

    .line 8
    .line 9
    .line 10
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    :try_start_0
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;-><init>()V

    .line 17
    .line 18
    const-string v3, "call_id"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;->callId:Ljava/lang/String;

    .line 25
    .line 26
    const-string v3, "inviter"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;->inviter:Ljava/lang/String;

    .line 33
    .line 34
    const-string v3, "chat_group_id"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;->groupId:Ljava/lang/String;

    .line 41
    .line 42
    const-string v3, "invitee_list"

    .line 43
    .line 44
    const-string v4, "[]"

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    move-result-object v3

    .line 49
    .line 50
    new-instance v4, Lorg/json/JSONArray;

    .line 51
    .line 52
    .line 53
    invoke-direct {v4, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    new-instance v3, Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 59
    const/4 v5, 0x0

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 63
    move-result v6

    .line 64
    .line 65
    if-ge v5, v6, :cond_1

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 69
    move-result-object v6

    .line 70
    .line 71
    .line 72
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    add-int/lit8 v5, v5, 0x1

    .line 75
    goto :goto_0

    .line 76
    :catch_0
    move-exception p0

    .line 77
    goto :goto_1

    .line 78
    .line 79
    :cond_1
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;->inviteList:Ljava/util/List;

    .line 80
    .line 81
    const-string v3, "call_type"

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 85
    move-result v3

    .line 86
    .line 87
    .line 88
    invoke-static {v3}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Scene;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Scene;

    .line 89
    move-result-object v3

    .line 90
    .line 91
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;->scene:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Scene;

    .line 92
    .line 93
    const-string v3, "call_role"

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 97
    move-result v3

    .line 98
    .line 99
    .line 100
    invoke-static {v3}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 101
    move-result-object v3

    .line 102
    .line 103
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;->role:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 104
    .line 105
    const-string v3, "media_type"

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 109
    move-result v3

    .line 110
    .line 111
    .line 112
    invoke-static {v3}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 113
    move-result-object v3

    .line 114
    .line 115
    iput-object v3, v2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;->mediaType:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 116
    .line 117
    .line 118
    const-string/jumbo v3, "start_time"

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 122
    move-result-wide v3

    .line 123
    .line 124
    iput-wide v3, v2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;->beginTime:J

    .line 125
    .line 126
    const-string v3, "end_time"

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 130
    move-result-wide v3

    .line 131
    .line 132
    const-string v5, "accept_time"

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 136
    move-result-wide v5

    .line 137
    .line 138
    const-wide/16 v7, 0x0

    .line 139
    .line 140
    cmp-long v9, v5, v7

    .line 141
    .line 142
    if-lez v9, :cond_2

    .line 143
    sub-long/2addr v3, v5

    .line 144
    .line 145
    const-wide/16 v5, 0x3e8

    .line 146
    div-long/2addr v3, v5

    .line 147
    .line 148
    .line 149
    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 150
    move-result-wide v7

    .line 151
    .line 152
    :cond_2
    iput-wide v7, v2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;->totalTime:J

    .line 153
    .line 154
    const-string v3, "call_result"

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 158
    move-result p0

    .line 159
    .line 160
    .line 161
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords$Result;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords$Result;

    .line 162
    move-result-object p0

    .line 163
    .line 164
    iput-object p0, v2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords;->result:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallRecords$Result;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    return-object v2

    .line 166
    .line 167
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    const-string/jumbo v3, "parseSingleRecord error: "

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 180
    move-result-object p0

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    move-result-object p0

    .line 188
    .line 189
    .line 190
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    return-object v0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
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
.end method

.method public static getRoomCustomInfoFromJSONObject(Lorg/json/JSONObject;)Ljava/util/HashMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    move-result v2

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    check-cast v2, Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception p0

    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    const-string v2, "getRoomCustomInfo failed, error: "

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    move-result-object p0

    .line 52
    .line 53
    const-string v1, "ParamsParse"

    .line 54
    .line 55
    .line 56
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    :cond_0
    return-object v0
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

.method public static getRoomCustomMessageFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;-><init>()V

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    goto :goto_0

    .line 9
    .line 10
    .line 11
    :cond_0
    :try_start_0
    const-string/jumbo v1, "roomId"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->roomId:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    const-string/jumbo v1, "sender"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getUserInfoFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->sender:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 31
    .line 32
    .line 33
    const-string/jumbo v1, "sequence"

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 37
    move-result-wide v1

    .line 38
    .line 39
    iput-wide v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->sequence:J

    .line 40
    .line 41
    .line 42
    const-string/jumbo v1, "timestampInSecond"

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 46
    move-result-wide v1

    .line 47
    .line 48
    iput-wide v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->timestampInSecond:J

    .line 49
    .line 50
    const-string v1, "businessId"

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->businessId:Ljava/lang/String;

    .line 57
    .line 58
    const-string v1, "data"

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    move-result-object p0

    .line 63
    .line 64
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomCustomMessage;->data:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    return-object v0

    .line 66
    :catch_0
    move-exception p0

    .line 67
    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    const-string v2, "getRoomCustomMessageFromJSONObject failed, error: "

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    move-result-object p0

    .line 84
    .line 85
    const-string v1, "ParamsParse"

    .line 86
    .line 87
    .line 88
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    :goto_0
    return-object v0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
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
.end method

.method public static getRoomTextMessageFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;-><init>()V

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    goto :goto_0

    .line 9
    .line 10
    .line 11
    :cond_0
    :try_start_0
    const-string/jumbo v1, "roomId"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->roomId:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    const-string/jumbo v1, "sender"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getUserInfoFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->sender:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 31
    .line 32
    .line 33
    const-string/jumbo v1, "sequence"

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 37
    move-result-wide v1

    .line 38
    .line 39
    iput-wide v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->sequence:J

    .line 40
    .line 41
    .line 42
    const-string/jumbo v1, "timestampInSecond"

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 46
    move-result-wide v1

    .line 47
    .line 48
    iput-wide v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->timestampInSecond:J

    .line 49
    .line 50
    .line 51
    const-string/jumbo v1, "textContent"

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->textContent:Ljava/lang/String;

    .line 58
    .line 59
    const-string v1, "extensionInfo"

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 63
    move-result-object p0

    .line 64
    .line 65
    const-class v1, Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    invoke-static {p0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->JSONObjectToMap(Lorg/json/JSONObject;Ljava/lang/Class;)Ljava/util/Map;

    .line 69
    move-result-object p0

    .line 70
    .line 71
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomTextMessage;->extensionInfo:Ljava/util/Map;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    return-object v0

    .line 73
    :catch_0
    move-exception p0

    .line 74
    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    const-string v2, "getRoomTextMessageFromJSONObject failed, error: "

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    move-result-object p0

    .line 91
    .line 92
    const-string v1, "ParamsParse"

    .line 93
    .line 94
    .line 95
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    :goto_0
    return-object v0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
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
.end method

.method public static getSeatFullInfoFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;-><init>()V

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    :try_start_0
    const-string/jumbo v1, "roomId"

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->roomId:Ljava/lang/String;

    .line 19
    .line 20
    const-string v1, "index"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 24
    move-result v1

    .line 25
    .line 26
    iput v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->seatIndex:I

    .line 27
    .line 28
    const-string v1, "isLocked"

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 32
    move-result v1

    .line 33
    .line 34
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->isSeatLocked:Z

    .line 35
    .line 36
    .line 37
    const-string/jumbo v1, "userId"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userId:Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    const-string/jumbo v1, "userName"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userName:Ljava/lang/String;

    .line 53
    .line 54
    const-string v1, "avatarUrl"

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userAvatar:Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    const-string/jumbo v1, "userMicrophoneStatus"

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 67
    move-result v1

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userMicrophoneStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 74
    .line 75
    .line 76
    const-string/jumbo v1, "userCameraStatus"

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 80
    move-result v1

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userCameraStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 87
    .line 88
    .line 89
    const-string/jumbo v1, "userSuspendStatus"

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 93
    move-result v1

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SuspendStatus;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SuspendStatus;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userSuspendStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SuspendStatus;

    .line 100
    .line 101
    .line 102
    const-string/jumbo v1, "x"

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 106
    move-result v1

    .line 107
    .line 108
    iput v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->x:I

    .line 109
    .line 110
    .line 111
    const-string/jumbo v1, "y"

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 115
    move-result v1

    .line 116
    .line 117
    iput v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->y:I

    .line 118
    .line 119
    .line 120
    const-string/jumbo v1, "width"

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 124
    move-result v1

    .line 125
    .line 126
    iput v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->width:I

    .line 127
    .line 128
    const-string v1, "height"

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 132
    move-result v1

    .line 133
    .line 134
    iput v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->height:I

    .line 135
    .line 136
    .line 137
    const-string/jumbo v1, "zorder"

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 141
    move-result p0

    .line 142
    .line 143
    iput p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->zorder:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    return-object v0

    .line 145
    :catch_0
    move-exception p0

    .line 146
    .line 147
    new-instance v1, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    const-string/jumbo v2, "parse getSeatFullInfoFromJSONObject failed, error: "

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    move-result-object p0

    .line 164
    .line 165
    const-string v1, "ParamsParse"

    .line 166
    .line 167
    .line 168
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    :goto_0
    return-object v0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
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
.end method

.method public static getSeatListFromJSONArray(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    if-eqz p0, :cond_2

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 11
    move-result v1

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    goto :goto_3

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 19
    move-result v2

    .line 20
    .line 21
    if-ge v1, v2, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getSeatFullInfoFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    goto :goto_1

    .line 36
    :catch_0
    move-exception p0

    .line 37
    goto :goto_2

    .line 38
    .line 39
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string/jumbo v2, "parse getSeatListFromJSONArray failed, error: "

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    move-result-object p0

    .line 59
    .line 60
    const-string v1, "ParamsParse"

    .line 61
    .line 62
    .line 63
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    :cond_2
    :goto_3
    return-object v0
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

.method public static getUserInfoFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    const-string/jumbo v1, "userId"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userId:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "userName"

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userName:Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    const-string/jumbo v1, "nameCard"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->nameCard:Ljava/lang/String;

    .line 33
    .line 34
    const-string v1, "avatarUrl"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->avatarUrl:Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    const-string/jumbo v1, "userRole"

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 47
    move-result v1

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userRole:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 54
    .line 55
    const-string v1, "hasAudioStream"

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 59
    move-result v1

    .line 60
    .line 61
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasAudioStream:Z

    .line 62
    .line 63
    const-string v1, "hasVideoStream"

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 67
    move-result v1

    .line 68
    .line 69
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasVideoStream:Z

    .line 70
    .line 71
    const-string v1, "hasScreenStream"

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 75
    move-result v1

    .line 76
    .line 77
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasScreenStream:Z

    .line 78
    .line 79
    const-string v1, "isMessageDisabled"

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 83
    move-result v1

    .line 84
    .line 85
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->isMessageDisabled:Z

    .line 86
    .line 87
    .line 88
    const-string/jumbo v1, "roomCustomInfo"

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 92
    move-result-object p0

    .line 93
    .line 94
    .line 95
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getRoomCustomInfoFromJSONObject(Lorg/json/JSONObject;)Ljava/util/HashMap;

    .line 96
    move-result-object p0

    .line 97
    .line 98
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->roomCustomInfo:Ljava/util/HashMap;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    return-object v0

    .line 100
    :catch_0
    move-exception p0

    .line 101
    .line 102
    new-instance v1, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    const-string v2, "getUserInfoFromJSONObject failed, error: "

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    move-result-object p0

    .line 118
    .line 119
    const-string v1, "ParamsParse"

    .line 120
    .line 121
    .line 122
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    return-object v0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
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
.end method

.method public static getUserInfoListFromJSONArray(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 13
    move-result v2

    .line 14
    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getUserInfoFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p0

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    const-string v2, "getUserInfoListFromJSONArray failed, error: "

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    move-result-object p0

    .line 48
    .line 49
    const-string v1, "ParamsParse"

    .line 50
    .line 51
    .line 52
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    :cond_1
    :goto_1
    return-object v0
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

.method public static getUserSearchResultFromJSONArray(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchResult;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchResult;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchResult;-><init>()V

    .line 6
    .line 7
    const-string v1, ""

    .line 8
    .line 9
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchResult;->cursor:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchResult;->userInfoList:Ljava/util/List;

    .line 17
    .line 18
    if-nez p0, :cond_0

    .line 19
    goto :goto_1

    .line 20
    .line 21
    :cond_0
    :try_start_0
    const-string v1, "cursor"

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchResult;->cursor:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    const-string/jumbo v1, "user_info_list"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 34
    move-result-object p0

    .line 35
    const/4 v1, 0x0

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 39
    move-result v2

    .line 40
    .line 41
    if-ge v1, v2, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    .line 48
    invoke-static {v2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getUserInfoFromJSONObject(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    iget-object v3, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserSearchResult;->userInfoList:Ljava/util/List;

    .line 52
    .line 53
    .line 54
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    goto :goto_0

    .line 58
    :catch_0
    move-exception p0

    .line 59
    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    const-string v2, "getUserSearchResultFromJSONArray failed, error: "

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    move-result-object p0

    .line 76
    .line 77
    const-string v1, "ParamsParse"

    .line 78
    .line 79
    .line 80
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    :cond_1
    :goto_1
    return-object v0
.end method

.method public static roomIdToJsonObject(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    const-string v1, "ParamsParse"

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    .line 12
    const-string/jumbo p0, "roomId is null, return empty JSONObject"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    return-object v0

    .line 17
    .line 18
    :cond_0
    :try_start_0
    const-string v2, "int_room_id"

    .line 19
    .line 20
    iget v3, p0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;->intRoomId:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    const-string/jumbo v2, "str_room_id"

    .line 27
    .line 28
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;->strRoomId:Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    return-object v0

    .line 33
    :catch_0
    move-exception p0

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    const-string v2, "callParamsToJsonString failed, error: "

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    move-result-object p0

    .line 51
    .line 52
    .line 53
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    new-instance p0, Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 59
    return-object p0
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
