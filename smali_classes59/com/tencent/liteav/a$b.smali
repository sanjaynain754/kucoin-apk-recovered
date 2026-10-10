.class final Lcom/tencent/liteav/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/Class;

.field private b:Ljava/lang/Class;

.field private c:Ljava/lang/Class;

.field private d:Ljava/lang/reflect/Field;

.field private e:Ljava/lang/reflect/Field;

.field private f:Ljava/lang/reflect/Field;

.field private g:Ljava/lang/reflect/Field;

.field private h:Ljava/lang/reflect/Field;

.field private i:Ljava/lang/reflect/Field;

.field private j:Ljava/lang/reflect/Field;

.field private k:Ljava/lang/reflect/Field;

.field private l:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    iput-object p1, p0, Lcom/tencent/liteav/a$b;->a:Ljava/lang/Class;

    .line 10
    .line 11
    const-class p1, Lcom/tencent/trtc/TRTCCloudDef$TRTCTexture;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/tencent/liteav/a$b;->b:Ljava/lang/Class;

    .line 14
    .line 15
    const-class v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoFrame;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/liteav/a$b;->c:Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-string/jumbo v0, "textureId"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    iput-object p1, p0, Lcom/tencent/liteav/a$b;->d:Ljava/lang/reflect/Field;

    .line 27
    .line 28
    iget-object p1, p0, Lcom/tencent/liteav/a$b;->b:Ljava/lang/Class;

    .line 29
    .line 30
    const-string v0, "eglContext10"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    iput-object p1, p0, Lcom/tencent/liteav/a$b;->e:Ljava/lang/reflect/Field;

    .line 37
    .line 38
    iget-object p1, p0, Lcom/tencent/liteav/a$b;->c:Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const-string/jumbo v0, "texture"

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    iput-object p1, p0, Lcom/tencent/liteav/a$b;->g:Ljava/lang/reflect/Field;

    .line 48
    .line 49
    iget-object p1, p0, Lcom/tencent/liteav/a$b;->c:Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    const-string/jumbo v0, "width"

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    iput-object p1, p0, Lcom/tencent/liteav/a$b;->h:Ljava/lang/reflect/Field;

    .line 59
    .line 60
    iget-object p1, p0, Lcom/tencent/liteav/a$b;->c:Ljava/lang/Class;

    .line 61
    .line 62
    const-string v0, "height"

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    iput-object p1, p0, Lcom/tencent/liteav/a$b;->i:Ljava/lang/reflect/Field;

    .line 69
    .line 70
    iget-object p1, p0, Lcom/tencent/liteav/a$b;->c:Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const-string/jumbo v0, "pixelFormat"

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    iput-object p1, p0, Lcom/tencent/liteav/a$b;->j:Ljava/lang/reflect/Field;

    .line 80
    .line 81
    iget-object p1, p0, Lcom/tencent/liteav/a$b;->c:Ljava/lang/Class;

    .line 82
    .line 83
    const-string v0, "bufferType"

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    iput-object p1, p0, Lcom/tencent/liteav/a$b;->k:Ljava/lang/reflect/Field;

    .line 90
    .line 91
    iget-object p1, p0, Lcom/tencent/liteav/a$b;->c:Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    const-string/jumbo v0, "timestamp"

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    iput-object p1, p0, Lcom/tencent/liteav/a$b;->l:Ljava/lang/reflect/Field;

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 104
    move-result p1

    .line 105
    .line 106
    const/16 v0, 0x11

    .line 107
    .line 108
    if-lt p1, v0, :cond_0

    .line 109
    .line 110
    iget-object p1, p0, Lcom/tencent/liteav/a$b;->b:Ljava/lang/Class;

    .line 111
    .line 112
    const-string v0, "eglContext14"

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    iput-object p1, p0, Lcom/tencent/liteav/a$b;->f:Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    return-void

    .line 120
    :catch_0
    move-exception p1

    .line 121
    goto :goto_0

    .line 122
    :cond_0
    return-void

    .line 123
    .line 124
    :goto_0
    const-string v0, "TXCVodPlayer"

    .line 125
    .line 126
    const-string v1, "init TRTCCloudClassInvokeWrapper error "

    .line 127
    .line 128
    .line 129
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 130
    return-void
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


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/tencent/liteav/videobase/frame/PixelFrame;)V
    .locals 5

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/a$b;->b:Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/tencent/liteav/a$b;->d:Ljava/lang/reflect/Field;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getTextureId()I

    .line 12
    move-result v2

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getGLContext()Ljava/lang/Object;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    instance-of v1, v1, Ljavax/microedition/khronos/egl/EGLContext;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lcom/tencent/liteav/a$b;->e:Ljava/lang/reflect/Field;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getGLContext()Ljava/lang/Object;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception p1

    .line 39
    goto :goto_1

    .line 40
    .line 41
    :cond_0
    iget-object v1, p0, Lcom/tencent/liteav/a$b;->f:Ljava/lang/reflect/Field;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getGLContext()Ljava/lang/Object;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    :goto_0
    iget-object v1, p0, Lcom/tencent/liteav/a$b;->c:Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    iget-object v2, p0, Lcom/tencent/liteav/a$b;->g:Ljava/lang/reflect/Field;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    iget-object v0, p0, Lcom/tencent/liteav/a$b;->h:Ljava/lang/reflect/Field;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getWidth()I

    .line 65
    move-result v2

    .line 66
    .line 67
    .line 68
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    iget-object v0, p0, Lcom/tencent/liteav/a$b;->i:Ljava/lang/reflect/Field;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getHeight()I

    .line 78
    move-result p2

    .line 79
    .line 80
    .line 81
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    move-result-object p2

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    iget-object p2, p0, Lcom/tencent/liteav/a$b;->j:Ljava/lang/reflect/Field;

    .line 88
    const/4 v0, 0x2

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    move-result-object v2

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    iget-object p2, p0, Lcom/tencent/liteav/a$b;->k:Ljava/lang/reflect/Field;

    .line 98
    const/4 v2, 0x3

    .line 99
    .line 100
    .line 101
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    move-result-object v2

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    iget-object p2, p0, Lcom/tencent/liteav/a$b;->l:Ljava/lang/reflect/Field;

    .line 108
    const/4 v2, 0x0

    .line 109
    .line 110
    .line 111
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    move-result-object v2

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    iget-object p2, p0, Lcom/tencent/liteav/a$b;->a:Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    const-string/jumbo v2, "sendCustomVideoData"

    .line 121
    .line 122
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    move-result-object v4

    .line 127
    .line 128
    .line 129
    filled-new-array {v3, v4}, [Ljava/lang/Class;

    .line 130
    move-result-object v3

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 134
    move-result-object p2

    .line 135
    .line 136
    .line 137
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    .line 141
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 142
    move-result-object v0

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    return-void

    .line 147
    .line 148
    :goto_1
    const-string p2, "TXCVodPlayer"

    .line 149
    .line 150
    .line 151
    const-string/jumbo v0, "sendCustomVideoData method error "

    .line 152
    .line 153
    .line 154
    invoke-static {p2, v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 155
    return-void
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
