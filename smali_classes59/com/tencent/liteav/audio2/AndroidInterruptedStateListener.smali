.class public Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/audio2/d$a;
.implements Lcom/tencent/liteav/audio2/e$b;


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::audio"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener$RecordingConfig;
    }
.end annotation


# static fields
.field private static final RECORDING_CONFIGS_LIMIT:I = 0xa

.field public static final TAG:Ljava/lang/String; = "AndroidInterruptedStateListener"

.field private static mRecordingCallback:Lcom/tencent/liteav/audio2/d;


# instance fields
.field private final mNativeRecordingConfigListener:J

.field private volatile mNeedNotify:Z

.field private mObject:Ljava/lang/Object;

.field private mPhoneStateManager:Lcom/tencent/liteav/audio2/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/liteav/audio2/d;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/liteav/audio2/d;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mRecordingCallback:Lcom/tencent/liteav/audio2/d;

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
.end method

.method public constructor <init>(J)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mNeedNotify:Z

    .line 7
    .line 8
    new-instance v1, Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    iput-object v1, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mObject:Ljava/lang/Object;

    .line 14
    .line 15
    iput-wide p1, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mNativeRecordingConfigListener:J

    .line 16
    .line 17
    new-instance p1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string/jumbo p2, "new AndroidInterruptedStateListener"

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 27
    move-result p2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    new-array p2, v0, [Ljava/lang/Object;

    .line 37
    .line 38
    const-string v0, "AndroidInterruptedStateListener"

    .line 39
    .line 40
    .line 41
    invoke-static {v0, p1, p2}, Lcom/tencent/liteav/base/Log;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    return-void
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

.method public static synthetic lambda$registerAudioRecordingCallback$0(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mPhoneStateManager:Lcom/tencent/liteav/audio2/e;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/liteav/audio2/e;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/tencent/liteav/audio2/e;-><init>(Lcom/tencent/liteav/audio2/e$b;)V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mPhoneStateManager:Lcom/tencent/liteav/audio2/e;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mPhoneStateManager:Lcom/tencent/liteav/audio2/e;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/tencent/liteav/audio2/e;->b()Z

    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    const-string v2, "PhoneStateManager"

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/audio2/e;->a:Landroid/telephony/TelephonyManager;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const/16 v3, 0x20

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0, v3}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 32
    .line 33
    goto/16 :goto_3

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_1
    const-string v0, "TelephonyManager is null, start listen phone state failed."

    .line 38
    .line 39
    new-array v3, v1, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v0, v3}, Lcom/tencent/liteav/base/Log;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string/jumbo v4, "start listen phone state failed, "

    .line 50
    .line 51
    .line 52
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    new-array v1, v1, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v0, v1}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    .line 70
    goto/16 :goto_3

    .line 71
    .line 72
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 73
    .line 74
    const/16 v3, 0x1f

    .line 75
    .line 76
    if-lt v0, v3, :cond_5

    .line 77
    .line 78
    :try_start_1
    iget-object v0, p0, Lcom/tencent/liteav/audio2/e;->d:Ljava/lang/Class;

    .line 79
    .line 80
    if-nez v0, :cond_3

    .line 81
    .line 82
    const-string v0, "android.media.AudioManager$OnModeChangedListener"

    .line 83
    .line 84
    .line 85
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    iput-object v0, p0, Lcom/tencent/liteav/audio2/e;->d:Ljava/lang/Class;

    .line 89
    goto :goto_1

    .line 90
    :catchall_1
    move-exception v0

    .line 91
    goto :goto_2

    .line 92
    .line 93
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/tencent/liteav/audio2/e;->e:Ljava/lang/Object;

    .line 94
    .line 95
    if-nez v0, :cond_4

    .line 96
    .line 97
    new-instance v0, Lcom/tencent/liteav/audio2/e$a;

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, p0}, Lcom/tencent/liteav/audio2/e$a;-><init>(Lcom/tencent/liteav/audio2/e;)V

    .line 101
    .line 102
    iget-object v3, p0, Lcom/tencent/liteav/audio2/e;->d:Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 106
    move-result-object v3

    .line 107
    .line 108
    iget-object v4, p0, Lcom/tencent/liteav/audio2/e;->d:Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 112
    move-result-object v4

    .line 113
    .line 114
    .line 115
    invoke-static {v3, v4, v0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    iput-object v0, p0, Lcom/tencent/liteav/audio2/e;->e:Ljava/lang/Object;

    .line 119
    .line 120
    :cond_4
    const-class v0, Landroid/media/AudioManager;

    .line 121
    .line 122
    const-string v3, "addOnModeChangedListener"

    .line 123
    .line 124
    const-class v4, Ljava/util/concurrent/Executor;

    .line 125
    .line 126
    iget-object v5, p0, Lcom/tencent/liteav/audio2/e;->d:Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 130
    move-result-object v4

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    .line 137
    invoke-static {p0}, Lcom/tencent/liteav/audio2/h;->a(Lcom/tencent/liteav/audio2/e;)Ljava/util/concurrent/Executor;

    .line 138
    move-result-object v3

    .line 139
    .line 140
    iget-object v4, p0, Lcom/tencent/liteav/audio2/e;->b:Landroid/media/AudioManager;

    .line 141
    .line 142
    iget-object v5, p0, Lcom/tencent/liteav/audio2/e;->e:Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    filled-new-array {v3, v5}, [Ljava/lang/Object;

    .line 146
    move-result-object v3

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 150
    goto :goto_3

    .line 151
    .line 152
    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-string v4, "add mode changed listener failed, "

    .line 155
    .line 156
    .line 157
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 161
    move-result-object v0

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    move-result-object v0

    .line 169
    .line 170
    new-array v1, v1, [Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    invoke-static {v2, v0, v1}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    goto :goto_3

    .line 175
    .line 176
    :cond_5
    const/16 v3, 0x1a

    .line 177
    .line 178
    if-lt v0, v3, :cond_6

    .line 179
    .line 180
    sget-object v0, Lcom/tencent/liteav/audio2/e;->c:Lcom/tencent/liteav/audio2/c;

    .line 181
    .line 182
    if-eqz v0, :cond_6

    .line 183
    .line 184
    .line 185
    const-string/jumbo v0, "register audio playback callback."

    .line 186
    .line 187
    new-array v1, v1, [Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    invoke-static {v2, v0, v1}, Lcom/tencent/liteav/base/Log;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    .line 192
    sget-object v0, Lcom/tencent/liteav/audio2/e;->c:Lcom/tencent/liteav/audio2/c;

    .line 193
    .line 194
    iput-object p0, v0, Lcom/tencent/liteav/audio2/c;->a:Lcom/tencent/liteav/audio2/c$a;

    .line 195
    .line 196
    :cond_6
    :goto_3
    iget-object v0, p0, Lcom/tencent/liteav/audio2/e;->f:Lcom/tencent/liteav/base/util/m;

    .line 197
    .line 198
    .line 199
    invoke-static {p0}, Lcom/tencent/liteav/audio2/f;->a(Lcom/tencent/liteav/audio2/e;)Ljava/lang/Runnable;

    .line 200
    move-result-object p0

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, p0}, Lcom/tencent/liteav/base/util/m;->a(Ljava/lang/Runnable;)V

    .line 204
    return-void
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

.method public static synthetic lambda$unregisterAudioRecordingCallback$1(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)V
    .locals 5

    .line 1
    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mPhoneStateManager:Lcom/tencent/liteav/audio2/e;

    .line 3
    .line 4
    if-eqz p0, :cond_3

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/tencent/liteav/audio2/e;->b()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    const-string v1, "PhoneStateManager"

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/audio2/e;->a:Landroid/telephony/TelephonyManager;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_1

    .line 24
    .line 25
    :cond_0
    :goto_0
    iput v2, p0, Lcom/tencent/liteav/audio2/e;->g:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    return-void

    .line 27
    .line 28
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string/jumbo v3, "stop listen phone state failed, "

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 38
    move-result-object p0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    new-array v0, v2, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-static {v1, p0, v0}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    return-void

    .line 52
    .line 53
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 54
    .line 55
    const/16 v3, 0x1f

    .line 56
    .line 57
    if-lt v0, v3, :cond_2

    .line 58
    .line 59
    :try_start_1
    iget-object v0, p0, Lcom/tencent/liteav/audio2/e;->d:Ljava/lang/Class;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    iget-object v3, p0, Lcom/tencent/liteav/audio2/e;->e:Ljava/lang/Object;

    .line 64
    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    const-class v3, Landroid/media/AudioManager;

    .line 68
    .line 69
    .line 70
    const-string/jumbo v4, "removeOnModeChangedListener"

    .line 71
    .line 72
    .line 73
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    iget-object v3, p0, Lcom/tencent/liteav/audio2/e;->b:Landroid/media/AudioManager;

    .line 81
    .line 82
    iget-object p0, p0, Lcom/tencent/liteav/audio2/e;->e:Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 86
    move-result-object p0

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v3, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    return-void

    .line 91
    :catchall_1
    move-exception p0

    .line 92
    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string/jumbo v3, "remove mode changed listener failed, "

    .line 97
    .line 98
    .line 99
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 103
    move-result-object p0

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    move-result-object p0

    .line 111
    .line 112
    new-array v0, v2, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    invoke-static {v1, p0, v0}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    return-void

    .line 117
    .line 118
    .line 119
    :cond_2
    invoke-static {}, Lcom/tencent/liteav/audio2/e;->c()V

    .line 120
    :cond_3
    return-void
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

.method private static native nativeNotifyAudioRecordingConfigChangedFromJava(J[Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener$RecordingConfig;)V
.end method

.method private static native nativeNotifyInterruptedByPhoneCallFromJava(J)V
.end method

.method private static native nativeNotifyResumedByPhoneCallFromJava(J)V
.end method


# virtual methods
.method public OnRecordingConfigChanged(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/AudioRecordingConfiguration;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 7
    move-result v0

    .line 8
    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 13
    move-result v0

    .line 14
    .line 15
    new-array v1, v0, [Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener$RecordingConfig;

    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    .line 19
    :goto_0
    if-ge v3, v0, :cond_3

    .line 20
    .line 21
    new-instance v4, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener$RecordingConfig;

    .line 22
    .line 23
    .line 24
    invoke-direct {v4}, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener$RecordingConfig;-><init>()V

    .line 25
    .line 26
    aput-object v4, v1, v3

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    move-result-object v4

    .line 31
    .line 32
    check-cast v4, Landroid/media/AudioRecordingConfiguration;

    .line 33
    .line 34
    aget-object v5, v1, v3

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Landroid/media/AudioRecordingConfiguration;->getClientAudioSessionId()I

    .line 38
    move-result v6

    .line 39
    .line 40
    iput v6, v5, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener$RecordingConfig;->a:I

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 44
    move-result v5

    .line 45
    .line 46
    const/16 v6, 0x1d

    .line 47
    .line 48
    if-lt v5, v6, :cond_1

    .line 49
    .line 50
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    .line 52
    if-lt v5, v6, :cond_2

    .line 53
    .line 54
    aget-object v5, v1, v3

    .line 55
    .line 56
    .line 57
    invoke-static {v4}, Lcom/tencent/liteav/audio2/i;->a(Landroid/media/AudioRecordingConfiguration;)Z

    .line 58
    move-result v4

    .line 59
    .line 60
    iput-boolean v4, v5, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener$RecordingConfig;->b:Z

    .line 61
    goto :goto_1

    .line 62
    .line 63
    :cond_1
    aget-object v4, v1, v3

    .line 64
    .line 65
    iput-boolean v2, v4, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener$RecordingConfig;->b:Z

    .line 66
    .line 67
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_3
    iget-object p1, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mObject:Ljava/lang/Object;

    .line 71
    monitor-enter p1

    .line 72
    .line 73
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mNeedNotify:Z

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    iget-wide v2, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mNativeRecordingConfigListener:J

    .line 78
    .line 79
    .line 80
    invoke-static {v2, v3, v1}, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->nativeNotifyAudioRecordingConfigChangedFromJava(J[Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener$RecordingConfig;)V

    .line 81
    goto :goto_2

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    :goto_2
    monitor-exit p1

    .line 85
    return-void

    .line 86
    :goto_3
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    throw v0
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

.method public onInterruptedByPhoneCall()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mObject:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-boolean v1, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mNeedNotify:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v1, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mNativeRecordingConfigListener:J

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2}, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->nativeNotifyInterruptedByPhoneCallFromJava(J)V

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v1
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

.method public onResumedByPhoneCall()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mObject:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-boolean v1, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mNeedNotify:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v1, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mNativeRecordingConfigListener:J

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2}, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->nativeNotifyResumedByPhoneCallFromJava(J)V

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v1
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

.method public registerAudioRecordingCallback()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mRecordingCallback:Lcom/tencent/liteav/audio2/d;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iput-object p0, v0, Lcom/tencent/liteav/audio2/d;->a:Lcom/tencent/liteav/audio2/d$a;

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-static {}, Lcom/tencent/liteav/base/ThreadUtils;->getUiThreadHandler()Landroid/os/Handler;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lcom/tencent/liteav/audio2/a;->a(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)Ljava/lang/Runnable;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    const/4 v0, 0x1

    .line 28
    .line 29
    iput-boolean v0, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mNeedNotify:Z

    .line 30
    return-void
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

.method public unregisterAudioRecordingCallback()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mRecordingCallback:Lcom/tencent/liteav/audio2/d;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    :goto_0
    return-void

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mObject:Ljava/lang/Object;

    .line 17
    monitor-enter v0

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    :try_start_0
    iput-boolean v1, p0, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mNeedNotify:Z

    .line 21
    .line 22
    sget-object v1, Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;->mRecordingCallback:Lcom/tencent/liteav/audio2/d;

    .line 23
    const/4 v2, 0x0

    .line 24
    .line 25
    iput-object v2, v1, Lcom/tencent/liteav/audio2/d;->a:Lcom/tencent/liteav/audio2/d$a;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/tencent/liteav/base/ThreadUtils;->getUiThreadHandler()Landroid/os/Handler;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Lcom/tencent/liteav/audio2/b;->a(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)Ljava/lang/Runnable;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 37
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw v1
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
