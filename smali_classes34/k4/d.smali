.class public Lk4/d;
.super Ljava/lang/Object;
.source "Fresco.java"


# static fields
.field public static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static b:Lk4/g;

.field public static volatile c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-class v0, Lk4/d;

    .line 3
    .line 4
    sput-object v0, Lk4/d;->a:Ljava/lang/Class;

    .line 5
    return-void
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
    .line 18
.end method

.method public static a()Lcom/facebook/imagepipeline/core/ImagePipeline;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lk4/d;->b()Lcom/facebook/imagepipeline/core/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a;->j()Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public static b()Lcom/facebook/imagepipeline/core/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/imagepipeline/core/a;->l()Lcom/facebook/imagepipeline/core/a;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static c(Landroid/content/Context;Lcom/facebook/imagepipeline/core/ImagePipelineConfig;Lk4/b;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1, p2, v0}, Lk4/d;->d(Landroid/content/Context;Lcom/facebook/imagepipeline/core/ImagePipelineConfig;Lk4/b;Z)V

    .line 5
    return-void
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
.end method

.method public static d(Landroid/content/Context;Lcom/facebook/imagepipeline/core/ImagePipelineConfig;Lk4/b;Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld6/b;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "Fresco#initialize"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    :cond_0
    sget-boolean v0, Lk4/d;->c:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    sget-object v0, Lk4/d;->a:Ljava/lang/Class;

    .line 18
    .line 19
    const-string v1, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!"

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lx3/a;->E(Ljava/lang/Class;Ljava/lang/String;)V

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x1

    .line 25
    .line 26
    sput-boolean v0, Lk4/d;->c:Z

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-static {p3}, Ls5/s;->b(Z)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/facebook/soloader/nativeloader/NativeLoader;->isInitialized()Z

    .line 33
    move-result p3

    .line 34
    .line 35
    if-nez p3, :cond_4

    .line 36
    .line 37
    .line 38
    invoke-static {}, Ld6/b;->d()Z

    .line 39
    move-result p3

    .line 40
    .line 41
    if-eqz p3, :cond_2

    .line 42
    .line 43
    const-string p3, "Fresco.initialize->SoLoader.init"

    .line 44
    .line 45
    .line 46
    invoke-static {p3}, Ld6/b;->a(Ljava/lang/String;)V

    .line 47
    .line 48
    :cond_2
    :try_start_0
    const-string p3, "com.facebook.imagepipeline.nativecode.NativeCodeInitializer"

    .line 49
    .line 50
    .line 51
    invoke-static {p3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 52
    move-result-object p3

    .line 53
    .line 54
    const-string v0, "init"

    .line 55
    .line 56
    const-class v1, Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    move-result-object p3

    .line 65
    .line 66
    .line 67
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 68
    move-result-object v0

    .line 69
    const/4 v1, 0x0

    .line 70
    .line 71
    .line 72
    invoke-virtual {p3, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    invoke-static {}, Ld6/b;->d()Z

    .line 76
    move-result p3

    .line 77
    .line 78
    if-eqz p3, :cond_4

    .line 79
    .line 80
    .line 81
    :goto_1
    invoke-static {}, Ld6/b;->b()V

    .line 82
    goto :goto_2

    .line 83
    .line 84
    :catch_0
    :try_start_1
    new-instance p3, Lcom/facebook/soloader/nativeloader/SystemDelegate;

    .line 85
    .line 86
    .line 87
    invoke-direct {p3}, Lcom/facebook/soloader/nativeloader/SystemDelegate;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-static {p3}, Lcom/facebook/soloader/nativeloader/NativeLoader;->initIfUninitialized(Lcom/facebook/soloader/nativeloader/NativeLoaderDelegate;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    .line 92
    .line 93
    invoke-static {}, Ld6/b;->d()Z

    .line 94
    move-result p3

    .line 95
    .line 96
    if-eqz p3, :cond_4

    .line 97
    goto :goto_1

    .line 98
    .line 99
    :catch_1
    :try_start_2
    new-instance p3, Lcom/facebook/soloader/nativeloader/SystemDelegate;

    .line 100
    .line 101
    .line 102
    invoke-direct {p3}, Lcom/facebook/soloader/nativeloader/SystemDelegate;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-static {p3}, Lcom/facebook/soloader/nativeloader/NativeLoader;->initIfUninitialized(Lcom/facebook/soloader/nativeloader/NativeLoaderDelegate;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    .line 107
    .line 108
    invoke-static {}, Ld6/b;->d()Z

    .line 109
    move-result p3

    .line 110
    .line 111
    if-eqz p3, :cond_4

    .line 112
    goto :goto_1

    .line 113
    .line 114
    :catch_2
    :try_start_3
    new-instance p3, Lcom/facebook/soloader/nativeloader/SystemDelegate;

    .line 115
    .line 116
    .line 117
    invoke-direct {p3}, Lcom/facebook/soloader/nativeloader/SystemDelegate;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-static {p3}, Lcom/facebook/soloader/nativeloader/NativeLoader;->initIfUninitialized(Lcom/facebook/soloader/nativeloader/NativeLoaderDelegate;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 121
    .line 122
    .line 123
    invoke-static {}, Ld6/b;->d()Z

    .line 124
    move-result p3

    .line 125
    .line 126
    if-eqz p3, :cond_4

    .line 127
    goto :goto_1

    .line 128
    .line 129
    :catch_3
    :try_start_4
    new-instance p3, Lcom/facebook/soloader/nativeloader/SystemDelegate;

    .line 130
    .line 131
    .line 132
    invoke-direct {p3}, Lcom/facebook/soloader/nativeloader/SystemDelegate;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-static {p3}, Lcom/facebook/soloader/nativeloader/NativeLoader;->initIfUninitialized(Lcom/facebook/soloader/nativeloader/NativeLoaderDelegate;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 136
    .line 137
    .line 138
    invoke-static {}, Ld6/b;->d()Z

    .line 139
    move-result p3

    .line 140
    .line 141
    if-eqz p3, :cond_4

    .line 142
    goto :goto_1

    .line 143
    :catchall_0
    move-exception p0

    .line 144
    .line 145
    .line 146
    invoke-static {}, Ld6/b;->d()Z

    .line 147
    move-result p1

    .line 148
    .line 149
    if-eqz p1, :cond_3

    .line 150
    .line 151
    .line 152
    invoke-static {}, Ld6/b;->b()V

    .line 153
    :cond_3
    throw p0

    .line 154
    .line 155
    .line 156
    :cond_4
    :goto_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 157
    move-result-object p0

    .line 158
    .line 159
    if-nez p1, :cond_5

    .line 160
    .line 161
    .line 162
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/a;->q(Landroid/content/Context;)V

    .line 163
    goto :goto_3

    .line 164
    .line 165
    .line 166
    :cond_5
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/a;->r(Ls5/r;)V

    .line 167
    .line 168
    .line 169
    :goto_3
    invoke-static {p0, p2}, Lk4/d;->e(Landroid/content/Context;Lk4/b;)V

    .line 170
    .line 171
    .line 172
    invoke-static {}, Ld6/b;->d()Z

    .line 173
    move-result p0

    .line 174
    .line 175
    if-eqz p0, :cond_6

    .line 176
    .line 177
    .line 178
    invoke-static {}, Ld6/b;->b()V

    .line 179
    :cond_6
    return-void
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
.end method

.method public static e(Landroid/content/Context;Lk4/b;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ld6/b;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "Fresco.initializeDrawee"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    :cond_0
    new-instance v0, Lk4/g;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0, p1}, Lk4/g;-><init>(Landroid/content/Context;Lk4/b;)V

    .line 17
    .line 18
    sput-object v0, Lk4/d;->b:Lk4/g;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/facebook/drawee/view/SimpleDraweeView;->b(Lw3/k;)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ld6/b;->d()Z

    .line 25
    move-result p0

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ld6/b;->b()V

    .line 31
    :cond_1
    return-void
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
.end method

.method public static f()Lk4/f;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lk4/d;->b:Lk4/g;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lk4/g;->a()Lk4/f;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method
