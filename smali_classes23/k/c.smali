.class public Lk/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:I = -0x80000000

.field public static volatile b:I = -0x80000000

.field public static volatile c:I = -0x80000000

.field public static final d:Ljava/lang/Object;

.field public static e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lk/c;->d:Ljava/lang/Object;

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
.end method

.method public static synthetic a()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lk/c;->b()V

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

.method public static b()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, -0x1

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    .line 6
    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 7
    move v3, v1

    .line 8
    move v4, v3

    .line 9
    .line 10
    :goto_0
    if-ge v0, v2, :cond_2

    .line 11
    .line 12
    :try_start_1
    new-instance v5, Landroid/hardware/Camera$CameraInfo;

    .line 13
    .line 14
    .line 15
    invoke-direct {v5}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v5}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 19
    .line 20
    iget v5, v5, Landroid/hardware/Camera$CameraInfo;->facing:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 21
    const/4 v6, 0x1

    .line 22
    .line 23
    if-ne v5, v6, :cond_0

    .line 24
    .line 25
    if-ne v3, v1, :cond_0

    .line 26
    move v3, v0

    .line 27
    goto :goto_1

    .line 28
    .line 29
    :cond_0
    if-nez v5, :cond_1

    .line 30
    .line 31
    if-ne v4, v1, :cond_1

    .line 32
    move v4, v0

    .line 33
    .line 34
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move v0, v2

    .line 37
    move v1, v3

    .line 38
    goto :goto_2

    .line 39
    :catch_1
    move v4, v1

    .line 40
    :goto_2
    move v2, v0

    .line 41
    move v3, v1

    .line 42
    .line 43
    :cond_2
    sput v3, Lk/c;->b:I

    .line 44
    .line 45
    sput v4, Lk/c;->c:I

    .line 46
    .line 47
    sput v2, Lk/c;->a:I

    .line 48
    return-void
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
.end method

.method public static c()V
    .locals 2

    .line 1
    .line 2
    sget v0, Lk/c;->a:I

    .line 3
    .line 4
    const/high16 v1, -0x80000000

    .line 5
    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {}, Lk/c;->b()V

    .line 11
    return-void
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

.method public static d()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lk/c;->c()V

    .line 4
    .line 5
    sget v0, Lk/c;->c:I

    .line 6
    return v0
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

.method public static e(ILandroid/app/Activity;)I
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lk/c;->h(I)Landroid/hardware/Camera$CameraInfo;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    .line 20
    move-result p1

    .line 21
    const/4 v0, 0x1

    .line 22
    const/4 v1, 0x0

    .line 23
    .line 24
    if-eqz p1, :cond_4

    .line 25
    .line 26
    if-eq p1, v0, :cond_3

    .line 27
    const/4 v2, 0x2

    .line 28
    .line 29
    if-eq p1, v2, :cond_2

    .line 30
    const/4 v2, 0x3

    .line 31
    .line 32
    if-eq p1, v2, :cond_1

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_1
    const/16 v1, 0x10e

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_2
    const/16 v1, 0xb4

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_3
    const/16 v1, 0x5a

    .line 42
    .line 43
    :cond_4
    :goto_0
    iget p1, p0, Landroid/hardware/Camera$CameraInfo;->facing:I

    .line 44
    .line 45
    iget p0, p0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    .line 46
    .line 47
    if-ne p1, v0, :cond_5

    .line 48
    add-int/2addr p0, v1

    .line 49
    .line 50
    rem-int/lit16 p0, p0, 0x168

    .line 51
    .line 52
    rsub-int p0, p0, 0x168

    .line 53
    .line 54
    :goto_1
    rem-int/lit16 p0, p0, 0x168

    .line 55
    return p0

    .line 56
    :cond_5
    sub-int/2addr p0, v1

    .line 57
    .line 58
    add-int/lit16 p0, p0, 0x168

    .line 59
    goto :goto_1
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
.end method

.method public static f()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lk/c;->c()V

    .line 4
    .line 5
    sget v0, Lk/c;->b:I

    .line 6
    return v0
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

.method public static g()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lk/c;->c()V

    .line 4
    .line 5
    sget v0, Lk/c;->a:I

    .line 6
    return v0
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

.method public static h(I)Landroid/hardware/Camera$CameraInfo;
    .locals 1

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :try_start_1
    invoke-static {p0, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    const/4 v0, 0x0

    .line 11
    :catch_1
    :goto_0
    return-object v0
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
.end method

.method public static i()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lk/c;->d:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-boolean v1, Lk/c;->e:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    .line 14
    sput-boolean v1, Lk/c;->e:Z

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    new-instance v0, Ljava/lang/Thread;

    .line 18
    .line 19
    new-instance v1, Lk/b;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1}, Lk/b;-><init>()V

    .line 23
    .line 24
    const-string v2, "CameraUtils-preload"

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 31
    return-void

    .line 32
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v1
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
.end method
