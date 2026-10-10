.class public abstract Lio/trtc/tuikit/atomicxcore/impl/call/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(ILjava/lang/String;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "liteav"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/tencent/liteav/base/ContextUtils;->initContextFromNative(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    :cond_0
    if-nez v0, :cond_1

    .line 18
    goto :goto_2

    .line 19
    .line 20
    :cond_1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 24
    .line 25
    const-string v2, "level"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 29
    .line 30
    const-string p0, "message"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    const-string p0, "module"

    .line 36
    .line 37
    const-string p1, "call_state"

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    .line 42
    const-string p0, "file"

    .line 43
    .line 44
    .line 45
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 50
    move-result-object p1

    .line 51
    array-length v2, p1

    .line 52
    const/4 v3, 0x5

    .line 53
    const/4 v4, 0x6

    .line 54
    .line 55
    if-ge v2, v4, :cond_2

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_2
    aget-object p1, p1, v3

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    .line 62
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    :goto_0
    const-string p1, ""

    .line 67
    .line 68
    .line 69
    :cond_3
    :try_start_1
    invoke-virtual {v1, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 70
    .line 71
    const-string p0, "line"

    .line 72
    .line 73
    .line 74
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 79
    move-result-object p1

    .line 80
    array-length v2, p1

    .line 81
    .line 82
    if-ge v2, v4, :cond_4

    .line 83
    const/4 p1, 0x0

    .line 84
    goto :goto_1

    .line 85
    .line 86
    :cond_4
    aget-object p1, p1, v3

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 90
    move-result p1

    .line 91
    .line 92
    .line 93
    :goto_1
    invoke-virtual {v1, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 94
    .line 95
    new-instance p0, Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 99
    .line 100
    const-string p1, "api"

    .line 101
    .line 102
    const-string v2, "TuikitLog"

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 106
    .line 107
    const-string p1, "params"

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    .line 112
    .line 113
    invoke-static {v0}, Lcom/tencent/trtc/TRTCCloud;->sharedInstance(Landroid/content/Context;)Lcom/tencent/trtc/TRTCCloud;

    .line 114
    move-result-object p1

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 118
    move-result-object p0

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p0}, Lcom/tencent/trtc/TRTCCloud;->callExperimentalAPI(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 122
    return-void

    .line 123
    :catch_0
    move-exception p0

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 127
    move-result-object p0

    .line 128
    .line 129
    const-string p1, "Logger"

    .line 130
    .line 131
    .line 132
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    :goto_2
    return-void
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
