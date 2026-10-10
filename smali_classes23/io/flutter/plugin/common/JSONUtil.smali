.class public Lio/flutter/plugin/common/JSONUtil;
.super Ljava/lang/Object;
.source "JSONUtil.java"


# direct methods
.method private constructor <init>()V
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
    .line 18
    .line 19
    .line 20
.end method

.method public static unwrap(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p0    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_7

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 16
    .line 17
    if-nez v0, :cond_6

    .line 18
    .line 19
    instance-of v0, p0, Ljava/lang/Byte;

    .line 20
    .line 21
    if-nez v0, :cond_6

    .line 22
    .line 23
    instance-of v0, p0, Ljava/lang/Character;

    .line 24
    .line 25
    if-nez v0, :cond_6

    .line 26
    .line 27
    instance-of v0, p0, Ljava/lang/Double;

    .line 28
    .line 29
    if-nez v0, :cond_6

    .line 30
    .line 31
    instance-of v0, p0, Ljava/lang/Float;

    .line 32
    .line 33
    if-nez v0, :cond_6

    .line 34
    .line 35
    instance-of v0, p0, Ljava/lang/Integer;

    .line 36
    .line 37
    if-nez v0, :cond_6

    .line 38
    .line 39
    instance-of v0, p0, Ljava/lang/Long;

    .line 40
    .line 41
    if-nez v0, :cond_6

    .line 42
    .line 43
    instance-of v0, p0, Ljava/lang/Short;

    .line 44
    .line 45
    if-nez v0, :cond_6

    .line 46
    .line 47
    instance-of v0, p0, Ljava/lang/String;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    return-object p0

    .line 51
    .line 52
    :cond_1
    :try_start_0
    instance-of v0, p0, Lorg/json/JSONArray;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    new-instance v0, Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    check-cast p0, Lorg/json/JSONArray;

    .line 62
    const/4 v2, 0x0

    .line 63
    .line 64
    .line 65
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 66
    move-result v3

    .line 67
    .line 68
    if-ge v2, v3, :cond_2

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    .line 75
    invoke-static {v3}, Lio/flutter/plugin/common/JSONUtil;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    move-result-object v3

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x1

    .line 82
    goto :goto_0

    .line 83
    :cond_2
    return-object v0

    .line 84
    .line 85
    :cond_3
    instance-of v0, p0, Lorg/json/JSONObject;

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    new-instance v0, Ljava/util/HashMap;

    .line 90
    .line 91
    .line 92
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 93
    .line 94
    check-cast p0, Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 98
    move-result-object v2

    .line 99
    .line 100
    .line 101
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    move-result v3

    .line 103
    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    .line 107
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    move-result-object v3

    .line 109
    .line 110
    check-cast v3, Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 114
    move-result-object v4

    .line 115
    .line 116
    .line 117
    invoke-static {v4}, Lio/flutter/plugin/common/JSONUtil;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    move-result-object v4

    .line 119
    .line 120
    .line 121
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    goto :goto_1

    .line 123
    :cond_4
    return-object v0

    .line 124
    :catch_0
    :cond_5
    return-object v1

    .line 125
    :cond_6
    return-object p0

    .line 126
    :cond_7
    :goto_2
    return-object v1
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
.end method

.method public static wrap(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p0    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    sget-object p0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 5
    return-object p0

    .line 6
    .line 7
    :cond_0
    instance-of v0, p0, Lorg/json/JSONArray;

    .line 8
    .line 9
    if-nez v0, :cond_c

    .line 10
    .line 11
    instance-of v0, p0, Lorg/json/JSONObject;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    return-object p0

    .line 15
    .line 16
    :cond_1
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    return-object p0

    .line 24
    .line 25
    :cond_2
    :try_start_0
    instance-of v0, p0, Ljava/util/Collection;

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    new-instance v0, Lorg/json/JSONArray;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 33
    .line 34
    check-cast p0, Ljava/util/Collection;

    .line 35
    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 38
    move-result-object p0

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    move-result v1

    .line 43
    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    .line 47
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lio/flutter/plugin/common/JSONUtil;->wrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    return-object v0

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 65
    move-result v0

    .line 66
    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    new-instance v0, Lorg/json/JSONArray;

    .line 70
    .line 71
    .line 72
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 76
    move-result v1

    .line 77
    const/4 v2, 0x0

    .line 78
    .line 79
    :goto_1
    if-ge v2, v1, :cond_5

    .line 80
    .line 81
    .line 82
    invoke-static {p0, v2}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 83
    move-result-object v3

    .line 84
    .line 85
    .line 86
    invoke-static {v3}, Lio/flutter/plugin/common/JSONUtil;->wrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    move-result-object v3

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x1

    .line 93
    goto :goto_1

    .line 94
    :cond_5
    return-object v0

    .line 95
    .line 96
    :cond_6
    instance-of v0, p0, Ljava/util/Map;

    .line 97
    .line 98
    if-eqz v0, :cond_8

    .line 99
    .line 100
    new-instance v0, Lorg/json/JSONObject;

    .line 101
    .line 102
    .line 103
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 104
    .line 105
    check-cast p0, Ljava/util/Map;

    .line 106
    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 109
    move-result-object p0

    .line 110
    .line 111
    .line 112
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 113
    move-result-object p0

    .line 114
    .line 115
    .line 116
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    move-result v1

    .line 118
    .line 119
    if-eqz v1, :cond_7

    .line 120
    .line 121
    .line 122
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    move-result-object v1

    .line 124
    .line 125
    check-cast v1, Ljava/util/Map$Entry;

    .line 126
    .line 127
    .line 128
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 129
    move-result-object v2

    .line 130
    .line 131
    check-cast v2, Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 135
    move-result-object v1

    .line 136
    .line 137
    .line 138
    invoke-static {v1}, Lio/flutter/plugin/common/JSONUtil;->wrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    move-result-object v1

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 143
    goto :goto_2

    .line 144
    :cond_7
    return-object v0

    .line 145
    .line 146
    :cond_8
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 147
    .line 148
    if-nez v0, :cond_a

    .line 149
    .line 150
    instance-of v0, p0, Ljava/lang/Byte;

    .line 151
    .line 152
    if-nez v0, :cond_a

    .line 153
    .line 154
    instance-of v0, p0, Ljava/lang/Character;

    .line 155
    .line 156
    if-nez v0, :cond_a

    .line 157
    .line 158
    instance-of v0, p0, Ljava/lang/Double;

    .line 159
    .line 160
    if-nez v0, :cond_a

    .line 161
    .line 162
    instance-of v0, p0, Ljava/lang/Float;

    .line 163
    .line 164
    if-nez v0, :cond_a

    .line 165
    .line 166
    instance-of v0, p0, Ljava/lang/Integer;

    .line 167
    .line 168
    if-nez v0, :cond_a

    .line 169
    .line 170
    instance-of v0, p0, Ljava/lang/Long;

    .line 171
    .line 172
    if-nez v0, :cond_a

    .line 173
    .line 174
    instance-of v0, p0, Ljava/lang/Short;

    .line 175
    .line 176
    if-nez v0, :cond_a

    .line 177
    .line 178
    instance-of v0, p0, Ljava/lang/String;

    .line 179
    .line 180
    if-eqz v0, :cond_9

    .line 181
    return-object p0

    .line 182
    .line 183
    .line 184
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    move-result-object v0

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 193
    move-result-object v0

    .line 194
    .line 195
    const-string v1, "java."

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 199
    move-result v0

    .line 200
    .line 201
    if-eqz v0, :cond_b

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 205
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 206
    :cond_a
    return-object p0

    .line 207
    :catch_0
    :cond_b
    const/4 p0, 0x0

    .line 208
    :cond_c
    return-object p0
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
.end method
