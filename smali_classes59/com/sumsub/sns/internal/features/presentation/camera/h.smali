.class public final Lcom/sumsub/sns/internal/features/presentation/camera/h;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic n:[Lkotlin/reflect/KProperty;


# instance fields
.field public final e:Lkotlin/jvm/functions/Function0;

.field public final f:Lkotlin/jvm/functions/Function1;

.field public final g:Lkotlin/coroutines/jvm/internal/SuspendLambda;

.field public final h:Ljava/lang/String;

.field public final i:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final j:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final k:Lcom/sumsub/sns/internal/core/presentation/common/i;

.field public final l:Lcom/sumsub/sns/internal/core/presentation/common/i;

.field public m:Lcom/sumsub/sns/internal/core/presentation/camera/l;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "previewView"

    .line 6
    .line 7
    const-string v2, "getPreviewView()Landroidx/camera/view/PreviewView;"

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    const-string v2, "cornersOverlay"

    .line 15
    .line 16
    const-string v4, "getCornersOverlay()Landroid/view/View;"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    const-string v4, "cameraInitAllowed"

    .line 23
    .line 24
    const-string v5, "getCameraInitAllowed()Z"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    const-string v5, "isFlashEnabled"

    .line 31
    .line 32
    const-string v6, "isFlashEnabled()Z"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 36
    move-result-object v0

    .line 37
    const/4 v5, 0x4

    .line 38
    .line 39
    new-array v5, v5, [Lkotlin/reflect/KProperty;

    .line 40
    .line 41
    aput-object v1, v5, v3

    .line 42
    const/4 v1, 0x1

    .line 43
    .line 44
    aput-object v2, v5, v1

    .line 45
    const/4 v1, 0x2

    .line 46
    .line 47
    aput-object v4, v5, v1

    .line 48
    const/4 v1, 0x3

    .line 49
    .line 50
    aput-object v0, v5, v1

    .line 51
    .line 52
    sput-object v5, Lcom/sumsub/sns/internal/features/presentation/camera/h;->n:[Lkotlin/reflect/KProperty;

    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V
    .locals 3

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$id;->sns_camera_preview:I

    .line 3
    .line 4
    sget v1, Lcom/sumsub/sns/R$id;->sns_corners_overlay:I

    .line 5
    .line 6
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v2, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 10
    .line 11
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->e:Lkotlin/jvm/functions/Function0;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->f:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    check-cast p4, Lkotlin/coroutines/jvm/internal/SuspendLambda;

    .line 16
    .line 17
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->g:Lkotlin/coroutines/jvm/internal/SuspendLambda;

    .line 18
    .line 19
    const-string p1, "Camera"

    .line 20
    .line 21
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->h:Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->j:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 34
    .line 35
    sget-object p1, Lcom/sumsub/sns/internal/ff/a;->P:Lcom/sumsub/sns/internal/ff/core/a;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 39
    move-result p1

    .line 40
    .line 41
    xor-int/lit8 p1, p1, 0x1

    .line 42
    .line 43
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 44
    .line 45
    const-string p3, "CAMERA_INIT_ALLOWED"

    .line 46
    .line 47
    .line 48
    invoke-direct {p2, p3, p1}, Lcom/sumsub/sns/internal/core/presentation/common/i;-><init>(Ljava/lang/String;Z)V

    .line 49
    .line 50
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->k:Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 51
    .line 52
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 53
    .line 54
    const-string p2, "IS_FLASH_ENABLED"

    .line 55
    const/4 p3, 0x0

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, p2, p3}, Lcom/sumsub/sns/internal/core/presentation/common/i;-><init>(Ljava/lang/String;Z)V

    .line 59
    .line 60
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->l:Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 61
    return-void
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
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->h:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public final j()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->l:Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/h;->n:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x3

    .line 6
    .line 7
    aget-object v3, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lcom/sumsub/sns/internal/core/presentation/common/i;->a(Lcom/sumsub/sns/internal/core/presentation/common/t;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->m:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 16
    const/4 v3, 0x1

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 21
    .line 22
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 23
    .line 24
    const-string v5, "Enable flash"

    .line 25
    const/4 v6, 0x0

    .line 26
    .line 27
    const-string v7, "CameraX"

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v7, v5, v6}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->n:Landroidx/camera/core/Camera;

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-interface {v4}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    .line 38
    move-result-object v4

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    .line 43
    invoke-interface {v4, v3}, Landroidx/camera/core/CameraControl;->enableTorch(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 44
    .line 45
    :cond_0
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->k:Landroidx/camera/core/ImageCapture;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroidx/camera/core/ImageCapture;->setFlashMode(I)V

    .line 51
    .line 52
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->l:Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 53
    .line 54
    aget-object v1, v1, v2

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/common/i;->a:Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v0, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 75
    :cond_2
    return-void
    .line 76
    .line 77
    .line 78
    .line 79
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
.end method

.method public final l()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/h;->n()V

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

.method public final m()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->m:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->e()V

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->m:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final n()V
    .locals 12

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->m:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->e()V

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->m:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->e:Lkotlin/jvm/functions/Function0;

    .line 13
    .line 14
    .line 15
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/e;

    .line 19
    .line 20
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/camera/e;->b:Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;

    .line 21
    .line 22
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->h:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->k:Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 25
    .line 26
    sget-object v10, Lcom/sumsub/sns/internal/features/presentation/camera/h;->n:[Lkotlin/reflect/KProperty;

    .line 27
    const/4 v11, 0x2

    .line 28
    .line 29
    aget-object v5, v10, v11

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, p0}, Lcom/sumsub/sns/internal/core/presentation/common/i;->a(Lcom/sumsub/sns/internal/core/presentation/common/t;)Z

    .line 33
    move-result v4

    .line 34
    .line 35
    new-instance v5, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    const-string v6, "initCamera: mode="

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v6, ", cameraInitAllowed="

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 61
    .line 62
    iget-object v5, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5, v2, v4, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/camera/e;->c:Landroid/util/Size;

    .line 68
    .line 69
    iget-object v6, v1, Lcom/sumsub/sns/internal/features/presentation/camera/e;->d:Lcom/sumsub/sns/internal/core/presentation/camera/b;

    .line 70
    .line 71
    iget-boolean v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/e;->a:Z

    .line 72
    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    sget-object v1, Landroidx/camera/core/CameraSelector;->DEFAULT_FRONT_CAMERA:Landroidx/camera/core/CameraSelector;

    .line 76
    :goto_0
    move-object v7, v1

    .line 77
    goto :goto_1

    .line 78
    .line 79
    :cond_1
    sget-object v1, Landroidx/camera/core/CameraSelector;->DEFAULT_BACK_CAMERA:Landroidx/camera/core/CameraSelector;

    .line 80
    goto :goto_0

    .line 81
    .line 82
    :goto_1
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/camera/g;

    .line 83
    .line 84
    .line 85
    invoke-direct {v9, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/g;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/h;)V

    .line 86
    .line 87
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 88
    const/4 v5, 0x0

    .line 89
    const/4 v8, 0x0

    .line 90
    .line 91
    .line 92
    invoke-direct/range {v2 .. v9}, Lcom/sumsub/sns/internal/core/presentation/camera/l;-><init>(Lcom/sumsub/sns/internal/core/presentation/camera/CameraX$Mode;Landroid/util/Size;ILcom/sumsub/sns/internal/core/presentation/camera/b;Landroidx/camera/core/CameraSelector;Lcom/sumsub/sns/internal/util/camera/d;Lcom/sumsub/sns/internal/core/presentation/camera/s;)V

    .line 93
    .line 94
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->m:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 95
    .line 96
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->k:Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 97
    .line 98
    aget-object v2, v10, v11

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, p0}, Lcom/sumsub/sns/internal/core/presentation/common/i;->a(Lcom/sumsub/sns/internal/core/presentation/common/t;)Z

    .line 102
    move-result v1

    .line 103
    .line 104
    if-eqz v1, :cond_2

    .line 105
    .line 106
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->m:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    .line 107
    .line 108
    if-eqz v1, :cond_2

    .line 109
    .line 110
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 114
    move-result-object v2

    .line 115
    .line 116
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 117
    const/4 v4, 0x0

    .line 118
    .line 119
    aget-object v4, v10, v4

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, p0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 123
    move-result-object v3

    .line 124
    .line 125
    check-cast v3, Landroidx/camera/view/PreviewView;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v2, v3, v0}, Lcom/sumsub/sns/internal/core/presentation/camera/l;->a(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/view/PreviewView;Lkotlin/jvm/functions/Function0;)V

    .line 129
    :cond_2
    return-void
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
.end method
