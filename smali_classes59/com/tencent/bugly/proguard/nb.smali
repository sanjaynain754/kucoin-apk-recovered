.class public Lcom/tencent/bugly/proguard/nb;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final c:J = 0xc8L


# instance fields
.field public final a:Lcom/tencent/bugly/proguard/sc;

.field public final b:Lcom/tencent/bugly/proguard/ae;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/sc;Lcom/tencent/bugly/proguard/ae;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/bugly/proguard/nb;->a:Lcom/tencent/bugly/proguard/sc;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/tencent/bugly/proguard/nb;->b:Lcom/tencent/bugly/proguard/ae;

    .line 8
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 8
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 9
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/nb;->b(Lorg/json/JSONObject;)V

    .line 10
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/nb;->a(Lorg/json/JSONObject;)V

    .line 11
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/nb;->c(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 12
    invoke-static {v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 13
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(JJ)Ljava/lang/String;
    .locals 3

    .line 16
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nb;->b:Lcom/tencent/bugly/proguard/ae;

    const-string v1, "looper"

    const-string v2, "looper_stack"

    invoke-interface {v0, v1, v2, p1, p2}, Lcom/tencent/bugly/proguard/ae;->a(Ljava/lang/String;Ljava/lang/String;J)Lcom/tencent/bugly/proguard/va;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 17
    iget-wide v1, v0, Lcom/tencent/bugly/proguard/va;->g:J

    sub-long/2addr p1, v1

    .line 18
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    cmp-long p1, p1, p3

    if-gtz p1, :cond_0

    .line 19
    iget-object p1, v0, Lcom/tencent/bugly/proguard/va;->e:Ljava/lang/String;

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public final a(Lcom/tencent/bugly/proguard/sc$a;)Ljava/lang/String;
    .locals 4

    .line 14
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/sc$a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 15
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/sc$a;->g:J

    const-wide/16 v2, 0xc8

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/tencent/bugly/proguard/nb;->a(JJ)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public final a(Lorg/json/JSONObject;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nb;->a:Lcom/tencent/bugly/proguard/sc;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/sc;->a()Lcom/tencent/bugly/proguard/sc$a;

    move-result-object v0

    .line 2
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    if-eqz v0, :cond_0

    .line 3
    iget-wide v2, v0, Lcom/tencent/bugly/proguard/sc$a;->b:J

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 4
    iget-wide v2, v0, Lcom/tencent/bugly/proguard/sc$a;->c:J

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 5
    iget-object v2, v0, Lcom/tencent/bugly/proguard/sc$a;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, v0, Lcom/tencent/bugly/proguard/sc$a;->b:J

    invoke-virtual {p0, v2, v3, v4, v5}, Lcom/tencent/bugly/proguard/nb;->a(JJ)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 7
    :cond_0
    const-string v0, "current_item"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void
.end method

.method public final b(Lorg/json/JSONObject;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nb;->a:Lcom/tencent/bugly/proguard/sc;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/sc;->b()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lorg/json/JSONArray;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 17
    move-result v2

    .line 18
    .line 19
    if-lez v2, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v2

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    check-cast v2, Lcom/tencent/bugly/proguard/sc$a;

    .line 36
    .line 37
    new-instance v3, Lorg/json/JSONArray;

    .line 38
    .line 39
    .line 40
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 41
    .line 42
    iget-wide v4, v2, Lcom/tencent/bugly/proguard/sc$a;->b:J

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 46
    .line 47
    iget-wide v4, v2, Lcom/tencent/bugly/proguard/sc$a;->c:J

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 51
    .line 52
    iget-object v4, v2, Lcom/tencent/bugly/proguard/sc$a;->d:Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 56
    .line 57
    iget v4, v2, Lcom/tencent/bugly/proguard/sc$a;->e:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 61
    .line 62
    iget v4, v2, Lcom/tencent/bugly/proguard/sc$a;->f:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/nb;->a(Lcom/tencent/bugly/proguard/sc$a;)Ljava/lang/String;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 76
    goto :goto_0

    .line 77
    .line 78
    :cond_0
    const-string v0, "excuted_queue"

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    return-void
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public final c(Lorg/json/JSONObject;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nb;->a:Lcom/tencent/bugly/proguard/sc;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/sc;->c()Ljava/util/ArrayList;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lorg/json/JSONArray;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    move-result v2

    .line 18
    .line 19
    if-lez v2, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v2

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    check-cast v2, Lcom/tencent/bugly/proguard/sc$b;

    .line 36
    .line 37
    new-instance v3, Lorg/json/JSONArray;

    .line 38
    .line 39
    .line 40
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 41
    .line 42
    iget v4, v2, Lcom/tencent/bugly/proguard/sc$b;->a:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 46
    .line 47
    iget v4, v2, Lcom/tencent/bugly/proguard/sc$b;->b:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 51
    .line 52
    iget v4, v2, Lcom/tencent/bugly/proguard/sc$b;->c:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 56
    .line 57
    iget-wide v4, v2, Lcom/tencent/bugly/proguard/sc$b;->d:J

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 61
    .line 62
    iget-object v4, v2, Lcom/tencent/bugly/proguard/sc$b;->e:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 66
    .line 67
    iget-object v2, v2, Lcom/tencent/bugly/proguard/sc$b;->f:Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 74
    goto :goto_0

    .line 75
    .line 76
    :cond_0
    const-string v0, "excuting_queue"

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    return-void
    .line 81
.end method
