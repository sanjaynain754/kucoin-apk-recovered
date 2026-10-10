.class public Lcom/tencent/bugly/proguard/z2;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/n8;


# static fields
.field public static final a:Ljava/lang/String; = "RMonitor_config_ParserV7"


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


# virtual methods
.method public final a(Lcom/tencent/bugly/proguard/af;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/af;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1, p3}, Lcom/tencent/bugly/proguard/n9;->a(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;Lcom/tencent/bugly/proguard/af;)Z
    .locals 0
    .param p2    # Lcom/tencent/bugly/proguard/af;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/z2;->b(Lorg/json/JSONObject;Lcom/tencent/bugly/proguard/af;)Z

    move-result p1

    return p1
.end method

.method public final b(Lorg/json/JSONObject;Lcom/tencent/bugly/proguard/af;)Z
    .locals 7
    .param p2    # Lcom/tencent/bugly/proguard/af;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "features"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "sample_ratio"

    .line 6
    .line 7
    const-string v2, "crash"

    .line 8
    .line 9
    const-string v3, "atta"

    .line 10
    const/4 v4, 0x0

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 14
    move-result v5

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 20
    move-result-wide v5

    .line 21
    double-to-float v1, v5

    .line 22
    .line 23
    iput v1, p2, Lcom/tencent/bugly/proguard/af;->a:F

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_3

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 30
    move-result v1

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p2, v3, v1}, Lcom/tencent/bugly/proguard/z2;->a(Lcom/tencent/bugly/proguard/af;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 43
    move-result v1

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p2, v2, v1}, Lcom/tencent/bugly/proguard/z2;->a(Lcom/tencent/bugly/proguard/af;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 56
    move-result v1

    .line 57
    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 62
    move-result-object p1

    .line 63
    move v0, v4

    .line 64
    .line 65
    .line 66
    :goto_1
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 67
    move-result v1

    .line 68
    .line 69
    if-ge v0, v1, :cond_4

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    .line 76
    const-string/jumbo v2, "name"

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    move-result-object v2

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, v2}, Lcom/tencent/bugly/proguard/af;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    .line 84
    move-result-object v2

    .line 85
    .line 86
    if-nez v2, :cond_3

    .line 87
    goto :goto_2

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-interface {v2, v1}, Lcom/tencent/bugly/proguard/n9;->a(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    const/4 p1, 0x1

    .line 95
    return p1

    .line 96
    .line 97
    :goto_3
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 98
    .line 99
    const-string v0, "RMonitor_config_ParserV7"

    .line 100
    .line 101
    .line 102
    const-string/jumbo v1, "parseConfig"

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v0, v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 106
    return v4
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
