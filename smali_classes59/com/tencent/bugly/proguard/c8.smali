.class public Lcom/tencent/bugly/proguard/c8;
.super Lcom/tencent/bugly/proguard/hf;
.source "BUGLY"


# static fields
.field public static final A:Ljava/lang/String; = "error_portal_ratio"

.field public static final B:Ljava/lang/String; = "launch_time_ratio"

.field public static final C:Ljava/lang/String; = "userinfo_ratio"

.field public static final D:Ljava/lang/String; = "http"

.field public static final x:Ljava/lang/String; = "HttpRequestControlConfig"

.field public static final y:Ljava/lang/String; = "crash_atta_ratio"

.field public static final z:Ljava/lang/String; = "crash_portal_ratio"


# instance fields
.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:F

.field public w:F


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;)V

    .line 4
    const/4 p1, 0x0

    .line 5
    .line 6
    iput p1, p0, Lcom/tencent/bugly/proguard/c8;->s:F

    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    iput v0, p0, Lcom/tencent/bugly/proguard/c8;->t:F

    .line 11
    .line 12
    iput v0, p0, Lcom/tencent/bugly/proguard/c8;->u:F

    .line 13
    .line 14
    iput v0, p0, Lcom/tencent/bugly/proguard/c8;->v:F

    .line 15
    .line 16
    iput p1, p0, Lcom/tencent/bugly/proguard/c8;->w:F

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 20
    move-result-wide v0

    .line 21
    double-to-float p1, v0

    .line 22
    .line 23
    iput p1, p0, Lcom/tencent/bugly/proguard/c8;->n:F

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 27
    move-result-wide v0

    .line 28
    double-to-float p1, v0

    .line 29
    .line 30
    iput p1, p0, Lcom/tencent/bugly/proguard/c8;->o:F

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 34
    move-result-wide v0

    .line 35
    double-to-float p1, v0

    .line 36
    .line 37
    iput p1, p0, Lcom/tencent/bugly/proguard/c8;->p:F

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 41
    move-result-wide v0

    .line 42
    double-to-float p1, v0

    .line 43
    .line 44
    iput p1, p0, Lcom/tencent/bugly/proguard/c8;->q:F

    .line 45
    .line 46
    .line 47
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 48
    move-result-wide v0

    .line 49
    double-to-float p1, v0

    .line 50
    .line 51
    iput p1, p0, Lcom/tencent/bugly/proguard/c8;->r:F

    .line 52
    return-void
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

.method public static a(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object v0

    .line 2
    const-string v1, "http"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    move-result-object v0

    .line 3
    instance-of v1, v0, Lcom/tencent/bugly/proguard/c8;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 4
    check-cast v0, Lcom/tencent/bugly/proguard/c8;

    .line 5
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/c8;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " is disabled, please modify your project\'s setting"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "HttpRequestControlConfig"

    filled-new-array {v1, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return v2

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    return v2
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 8

    const-string/jumbo v0, "userinfo_ratio"

    const-string v1, "launch_time_ratio"

    const-string v2, "error_portal_ratio"

    const-string v3, "crash_portal_ratio"

    const-string v4, "crash_atta_ratio"

    const-string v5, "HttpRequestControlConfig"

    if-nez p1, :cond_0

    .line 7
    :try_start_0
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "http configs is null"

    filled-new-array {v5, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 9
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    double-to-float v4, v6

    iput v4, p0, Lcom/tencent/bugly/proguard/c8;->s:F

    .line 10
    :cond_1
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 11
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    double-to-float v3, v3

    iput v3, p0, Lcom/tencent/bugly/proguard/c8;->t:F

    .line 12
    :cond_2
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 13
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    double-to-float v2, v2

    iput v2, p0, Lcom/tencent/bugly/proguard/c8;->u:F

    .line 14
    :cond_3
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 15
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    double-to-float v1, v1

    iput v1, p0, Lcom/tencent/bugly/proguard/c8;->w:F

    .line 16
    :cond_4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 17
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float p1, v0

    iput p1, p0, Lcom/tencent/bugly/proguard/c8;->v:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 18
    :goto_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v1, "parseHttpConfigs"

    invoke-virtual {v0, v5, v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, -0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 10
    move-result v3

    .line 11
    .line 12
    .line 13
    sparse-switch v3, :sswitch_data_0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :sswitch_0
    const-string v3, "launch_time_ratio"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result v3

    .line 21
    .line 22
    if-nez v3, :cond_0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x4

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :sswitch_1
    const-string v3, "crash_portal_ratio"

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    move-result v3

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v2, 0x3

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :sswitch_2
    const-string v3, "error_portal_ratio"

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    move-result v3

    .line 43
    .line 44
    if-nez v3, :cond_2

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v2, 0x2

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :sswitch_3
    const-string v3, "crash_atta_ratio"

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    move-result v3

    .line 54
    .line 55
    if-nez v3, :cond_3

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    move v2, v0

    .line 58
    goto :goto_0

    .line 59
    .line 60
    .line 61
    :sswitch_4
    const-string/jumbo v3, "userinfo_ratio"

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    move-result v3

    .line 66
    .line 67
    if-nez v3, :cond_4

    .line 68
    goto :goto_0

    .line 69
    :cond_4
    move v2, v1

    .line 70
    .line 71
    .line 72
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 73
    .line 74
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 75
    .line 76
    const-string v2, " is not a valid key"

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    const-string v2, "HttpRequestControlConfig"

    .line 83
    .line 84
    .line 85
    filled-new-array {v2, p1}, [Ljava/lang/String;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 90
    return v1

    .line 91
    .line 92
    :pswitch_0
    iget p1, p0, Lcom/tencent/bugly/proguard/c8;->w:F

    .line 93
    .line 94
    iget v2, p0, Lcom/tencent/bugly/proguard/c8;->q:F

    .line 95
    .line 96
    cmpl-float p1, p1, v2

    .line 97
    .line 98
    if-ltz p1, :cond_5

    .line 99
    goto :goto_1

    .line 100
    .line 101
    :pswitch_1
    iget p1, p0, Lcom/tencent/bugly/proguard/c8;->t:F

    .line 102
    .line 103
    iget v2, p0, Lcom/tencent/bugly/proguard/c8;->o:F

    .line 104
    .line 105
    cmpl-float p1, p1, v2

    .line 106
    .line 107
    if-ltz p1, :cond_5

    .line 108
    goto :goto_1

    .line 109
    .line 110
    :pswitch_2
    iget p1, p0, Lcom/tencent/bugly/proguard/c8;->u:F

    .line 111
    .line 112
    iget v2, p0, Lcom/tencent/bugly/proguard/c8;->p:F

    .line 113
    .line 114
    cmpl-float p1, p1, v2

    .line 115
    .line 116
    if-ltz p1, :cond_5

    .line 117
    goto :goto_1

    .line 118
    .line 119
    :pswitch_3
    iget p1, p0, Lcom/tencent/bugly/proguard/c8;->s:F

    .line 120
    .line 121
    iget v2, p0, Lcom/tencent/bugly/proguard/c8;->n:F

    .line 122
    .line 123
    cmpl-float p1, p1, v2

    .line 124
    .line 125
    if-ltz p1, :cond_5

    .line 126
    goto :goto_1

    .line 127
    .line 128
    :pswitch_4
    iget p1, p0, Lcom/tencent/bugly/proguard/c8;->v:F

    .line 129
    .line 130
    iget v2, p0, Lcom/tencent/bugly/proguard/c8;->r:F

    .line 131
    .line 132
    cmpl-float p1, p1, v2

    .line 133
    .line 134
    if-ltz p1, :cond_5

    .line 135
    :goto_1
    return v0

    .line 136
    :cond_5
    return v1

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
    :sswitch_data_0
    .sparse-switch
        -0x6635b8bb -> :sswitch_4
        -0x2147677c -> :sswitch_3
        0x344a5f4f -> :sswitch_2
        0x453aa810 -> :sswitch_1
        0x7fd6ec25 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
