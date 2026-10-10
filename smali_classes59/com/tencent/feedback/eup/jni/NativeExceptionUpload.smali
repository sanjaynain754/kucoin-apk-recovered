.class public Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final ANDROID_LOG_DEBUG:I = 0x3

.field public static final ANDROID_LOG_ERROR:I = 0x6

.field public static final ANDROID_LOG_INFO:I = 0x4

.field public static final ANDROID_LOG_WARN:I = 0x5

.field private static final EXTRA_JNI_NATIVE_VERSION:Ljava/lang/String; = "nativeRqd.2.1.0"

.field public static final JAR_JNI_VERSION:I = 0x1

.field protected static instance:Lcom/tencent/feedback/eup/jni/NativeExceptionHandler;

.field public static isEnable:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->isEnable:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    sput-object v0, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->instance:Lcom/tencent/feedback/eup/jni/NativeExceptionHandler;

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

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

.method public static native appendNativeLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static native appendWholeNativeLog(Ljava/lang/String;)Z
.end method

.method public static checkExtraJni(Ljava/lang/String;)Z
    .locals 4

    .line 1
    .line 2
    .line 3
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "Check extra jni for RQD NDK: %s"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    const-string/jumbo v0, "nativeRqd.2.1.0"

    .line 13
    .line 14
    .line 15
    const-string/jumbo v1, "nativeRqd."

    .line 16
    .line 17
    const-string v2, ""

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    const-string v3, "."

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 31
    move-result-object p0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 35
    move-result-object p0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x2

    .line 41
    const/4 v3, 0x1

    .line 42
    .line 43
    if-ne v1, v2, :cond_0

    .line 44
    .line 45
    const-string v1, "0"

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object p0

    .line 50
    goto :goto_0

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 54
    move-result v1

    .line 55
    .line 56
    if-ne v1, v3, :cond_1

    .line 57
    .line 58
    const-string v1, "00"

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    move-result-object p0

    .line 63
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 64
    .line 65
    .line 66
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 67
    move-result p0

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 71
    move-result v0

    .line 72
    .line 73
    if-lt p0, v0, :cond_2

    .line 74
    .line 75
    const-string p0, "Extra RQD JNI can be accessed."

    .line 76
    .line 77
    new-array v0, v1, [Ljava/lang/Object;

    .line 78
    .line 79
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 80
    .line 81
    .line 82
    invoke-static {v2, p0, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    return v3

    .line 84
    :catchall_0
    move-exception p0

    .line 85
    .line 86
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 87
    .line 88
    .line 89
    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    .line 90
    move-result v0

    .line 91
    .line 92
    if-nez v0, :cond_2

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 96
    .line 97
    :cond_2
    new-array p0, v1, [Ljava/lang/Object;

    .line 98
    .line 99
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 100
    .line 101
    const-string v2, "Extra RQD JNI can not be accessed."

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v2, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 105
    return v1
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

.method public static native doNativeCrashForTest()V
.end method

.method public static native enableHandler(Z)V
.end method

.method public static native getCrashThreadLocalValue()Ljava/lang/String;
.end method

.method public static native getNativeLog()Ljava/lang/String;
.end method

.method public static declared-synchronized getmHandler()Lcom/tencent/feedback/eup/jni/NativeExceptionHandler;
    .locals 2

    .line 1
    .line 2
    const-class v0, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->instance:Lcom/tencent/feedback/eup/jni/NativeExceptionHandler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static native putNativeKeyValue(Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static native registNativeExceptionHandler(Ljava/lang/String;Ljava/lang/String;I)Z
.end method

.method public static native registNativeExceptionHandler2(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
.end method

.method public static native removeNativeKeyValue(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native setLogMode(I)V
.end method

.method public static declared-synchronized setmHandler(Lcom/tencent/feedback/eup/jni/NativeExceptionHandler;)V
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sput-object p0, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->instance:Lcom/tencent/feedback/eup/jni/NativeExceptionHandler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p0

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw p0
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
.end method

.method public static testNativeCrash()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string/jumbo v1, "rqdp{ test native crash}"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/tencent/feedback/eup/jni/NativeExceptionUpload;->doNativeCrashForTest()V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method
