.class public abstract Lai/advance/core/LServiceParent;
.super Landroidx/core/app/JobIntentService;
.source "SourceFile"


# static fields
.field public static d:Z = true


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/core/app/JobIntentService;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v0, "log"

    .line 7
    .line 8
    iput-object v0, p0, Lai/advance/core/LServiceParent;->b:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "pictures"

    .line 12
    .line 13
    iput-object v0, p0, Lai/advance/core/LServiceParent;->c:Ljava/lang/String;

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "eventInfo"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lk/g;->g(Ljava/lang/String;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lai/advance/core/LServiceParent;->c()Lorg/json/JSONArray;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    new-instance v1, Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 22
    .line 23
    .line 24
    :try_start_0
    const-string/jumbo v2, "log"

    .line 25
    .line 26
    new-instance v3, Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2, v3}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    :catch_0
    if-eqz v0, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 38
    move-result p1

    .line 39
    .line 40
    if-lez p1, :cond_0

    .line 41
    .line 42
    .line 43
    const-string/jumbo p1, "pictures"

    .line 44
    .line 45
    .line 46
    invoke-static {v1, p1, v0}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 55
    move-result-wide v2

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lai/advance/core/LServiceParent;->d()Ljava/lang/String;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-static {p0, p1, v0}, Lk/d;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    :cond_1
    return-void
    .line 78
.end method

.method public abstract b()V
.end method

.method public abstract c()Lorg/json/JSONArray;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Ljava/lang/String;
.end method

.method public abstract f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public g(Ljava/lang/String;)V
    .locals 10

    .line 1
    .line 2
    const-string v0, "detail"

    .line 3
    .line 4
    const-string v1, "info"

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "log"

    .line 8
    .line 9
    .line 10
    const-string/jumbo v3, "pictures"

    .line 11
    .line 12
    .line 13
    invoke-static {p0, p1}, Lk/d;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object v4

    .line 15
    .line 16
    .line 17
    invoke-static {v4}, Lk/g;->g(Ljava/lang/String;)Z

    .line 18
    move-result v5

    .line 19
    .line 20
    if-eqz v5, :cond_3

    .line 21
    .line 22
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    .line 32
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 33
    move-result v6

    .line 34
    .line 35
    if-eqz v6, :cond_2

    .line 36
    .line 37
    sget-boolean v6, Lai/advance/core/LServiceParent;->d:Z

    .line 38
    .line 39
    if-eqz v6, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-static {v5, v3}, Lk/g;->e(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONArray;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 47
    move-result-object v7

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 51
    move-result-object v8

    .line 52
    .line 53
    .line 54
    invoke-virtual {v8}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 55
    move-result-object v8

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v7, v8}, Lai/advance/core/LServiceParent;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    move-result-object v7

    .line 60
    .line 61
    .line 62
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 63
    move-result v8

    .line 64
    .line 65
    if-eqz v8, :cond_0

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 69
    move-result-object v6

    .line 70
    .line 71
    .line 72
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 73
    move-result-object v7

    .line 74
    .line 75
    .line 76
    invoke-virtual {v7}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 77
    move-result-object v7

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v6, v7}, Lai/advance/core/LServiceParent;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    move-result-object v7

    .line 82
    .line 83
    .line 84
    :cond_0
    invoke-static {v7}, Lk/g;->g(Ljava/lang/String;)Z

    .line 85
    move-result v6

    .line 86
    .line 87
    if-eqz v6, :cond_1

    .line 88
    .line 89
    const-class v6, Lai/advance/common/entity/BaseResultEntity;

    .line 90
    .line 91
    .line 92
    invoke-static {v7, v6}, Lk/g;->h(Ljava/lang/String;Ljava/lang/Class;)Lai/advance/common/entity/BaseResultEntity;

    .line 93
    move-result-object v6

    .line 94
    .line 95
    iget-boolean v7, v6, Lai/advance/common/entity/BaseResultEntity;->success:Z

    .line 96
    .line 97
    if-eqz v7, :cond_1

    .line 98
    .line 99
    iget-object v6, v6, Lai/advance/common/entity/BaseResultEntity;->data:Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    invoke-static {v6}, Lk/g;->g(Ljava/lang/String;)Z

    .line 103
    move-result v7

    .line 104
    .line 105
    if-eqz v7, :cond_1

    .line 106
    .line 107
    new-instance v7, Lorg/json/JSONObject;

    .line 108
    .line 109
    .line 110
    invoke-direct {v7, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    const-string v6, "fileId"

    .line 113
    .line 114
    .line 115
    invoke-static {v7, v6}, Lk/g;->f(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    move-result-object v6

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 120
    move-result-object v7

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 124
    move-result-object v8

    .line 125
    .line 126
    .line 127
    const-string/jumbo v9, "picture_file_id"

    .line 128
    .line 129
    .line 130
    invoke-virtual {v8, v9, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v7, v0, v8}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v1, v7}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5, v2, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 140
    .line 141
    .line 142
    :cond_1
    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 146
    move-result-object v0

    .line 147
    .line 148
    .line 149
    invoke-static {p0, p1, v0}, Lk/d;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_2
    invoke-virtual {p0, v4}, Lai/advance/core/LServiceParent;->h(Lorg/json/JSONObject;)Z

    .line 153
    move-result v0

    .line 154
    .line 155
    if-eqz v0, :cond_3

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 159
    move-result-object v0

    .line 160
    .line 161
    .line 162
    invoke-static {v0, p1}, Lk/d;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    :catch_0
    :cond_3
    return-void
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

.method public h(Lorg/json/JSONObject;)Z
    .locals 10

    .line 1
    .line 2
    const-string v0, "bizType"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lk/g;->f(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object v3

    .line 7
    .line 8
    const-string v0, "info"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lk/g;->f(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v4

    .line 13
    .line 14
    const-string v0, "eventType"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Lk/g;->f(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object v5

    .line 19
    .line 20
    const-string v0, "eventTimestamp"

    .line 21
    .line 22
    const-wide/16 v1, 0x0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 26
    move-result-wide v6

    .line 27
    .line 28
    const-string v0, "eventCostInMilliSeconds"

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 32
    move-result-wide v8

    .line 33
    .line 34
    cmp-long p1, v8, v1

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    const-wide/16 v8, 0x1

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 46
    move-result-object v2

    .line 47
    move-object v1, p0

    .line 48
    .line 49
    .line 50
    invoke-virtual/range {v1 .. v9}, Lai/advance/core/LServiceParent;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Ljava/lang/String;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 55
    move-result v0

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    .line 60
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 65
    move-result-object v2

    .line 66
    move-object v1, p0

    .line 67
    .line 68
    .line 69
    invoke-virtual/range {v1 .. v9}, Lai/advance/core/LServiceParent;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Ljava/lang/String;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    :cond_1
    const-class v0, Lai/advance/common/entity/BaseResultEntity;

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v0}, Lk/g;->h(Ljava/lang/String;Ljava/lang/Class;)Lai/advance/common/entity/BaseResultEntity;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    iget-boolean p1, p1, Lai/advance/common/entity/BaseResultEntity;->success:Z

    .line 79
    return p1
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

.method public onDestroy()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/core/LServiceParent;->b()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroidx/core/app/JobIntentService;->onDestroy()V

    .line 7
    return-void
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

.method public onHandleWork(Landroid/content/Intent;)V
    .locals 3
    .param p1    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, Lai/advance/core/LServiceParent;->a(Landroid/content/Intent;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    :goto_0
    array-length v1, p1

    .line 14
    .line 15
    if-ge v0, v1, :cond_1

    .line 16
    .line 17
    aget-object v1, p1, v0

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 23
    move-result v2

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lai/advance/core/LServiceParent;->d()Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 37
    move-result v2

    .line 38
    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1}, Lai/advance/core/LServiceParent;->g(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 45
    goto :goto_0

    .line 46
    :catch_0
    :cond_1
    return-void
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
.end method
