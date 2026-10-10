.class public Lcom/otaliastudios/opengl/core/EglNativeConfigChooser;
.super Ljava/lang/Object;
.source "EglNativeConfigChooser.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/otaliastudios/opengl/core/EglNativeConfigChooser$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0002\u0008\u0004\u0008\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0010B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/otaliastudios/opengl/core/EglNativeConfigChooser;",
        "",
        "<init>",
        "()V",
        "Ln90/c;",
        "display",
        "",
        "version",
        "",
        "recordable",
        "Ln90/a;",
        "a",
        "(Ln90/c;IZ)Ln90/a;",
        "",
        "b",
        "(IZ)[I",
        "Companion",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/otaliastudios/opengl/core/EglNativeConfigChooser$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/otaliastudios/opengl/core/EglNativeConfigChooser$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/otaliastudios/opengl/core/EglNativeConfigChooser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/otaliastudios/opengl/core/EglNativeConfigChooser;->a:Lcom/otaliastudios/opengl/core/EglNativeConfigChooser$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
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


# virtual methods
.method public final a(Ln90/c;IZ)Ln90/a;
    .locals 9
    .param p1    # Ln90/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "display"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p2, p3}, Lcom/otaliastudios/opengl/core/EglNativeConfigChooser;->b(IZ)[I

    .line 9
    move-result-object v2

    .line 10
    const/4 p3, 0x1

    .line 11
    .line 12
    new-array v0, p3, [Ln90/a;

    .line 13
    .line 14
    new-array v7, p3, [I

    .line 15
    .line 16
    new-array v4, p3, [Landroid/opengl/EGLConfig;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ln90/c;->a()Landroid/opengl/EGLDisplay;

    .line 20
    move-result-object v1

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v6, 0x1

    .line 25
    .line 26
    .line 27
    invoke-static/range {v1 .. v8}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    .line 28
    move-result p1

    .line 29
    const/4 p3, 0x0

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->getIndices([Ljava/lang/Object;)Lkotlin/ranges/IntRange;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    move-result v2

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    move-object v2, v1

    .line 47
    .line 48
    check-cast v2, Lkotlin/collections/IntIterator;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 52
    move-result v2

    .line 53
    .line 54
    aget-object v3, v4, v2

    .line 55
    .line 56
    if-nez v3, :cond_0

    .line 57
    move-object v5, p3

    .line 58
    goto :goto_1

    .line 59
    .line 60
    :cond_0
    new-instance v5, Ln90/a;

    .line 61
    .line 62
    .line 63
    invoke-direct {v5, v3}, Ln90/a;-><init>(Landroid/opengl/EGLConfig;)V

    .line 64
    .line 65
    :goto_1
    aput-object v5, v0, v2

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :cond_1
    if-nez p1, :cond_2

    .line 69
    .line 70
    new-instance p1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    const-string v0, "Unable to find RGB8888 / "

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string p2, " EGLConfig"

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    const-string p2, "EglConfigChooser"

    .line 93
    .line 94
    .line 95
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    return-object p3

    .line 97
    :cond_2
    const/4 p1, 0x0

    .line 98
    .line 99
    aget-object p1, v0, p1

    .line 100
    return-object p1
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final b(IZ)[I
    .locals 16
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x3

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    if-lt v1, v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ln90/d;->i()I

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ln90/d;->j()I

    .line 13
    move-result v1

    .line 14
    or-int/2addr v0, v1

    .line 15
    :goto_0
    move v12, v0

    .line 16
    goto :goto_1

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {}, Ln90/d;->i()I

    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :goto_1
    invoke-static {}, Ln90/d;->l()I

    .line 25
    move-result v1

    .line 26
    .line 27
    .line 28
    invoke-static {}, Ln90/d;->d()I

    .line 29
    move-result v3

    .line 30
    .line 31
    .line 32
    invoke-static {}, Ln90/d;->b()I

    .line 33
    move-result v5

    .line 34
    .line 35
    .line 36
    invoke-static {}, Ln90/d;->a()I

    .line 37
    move-result v7

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ln90/d;->o()I

    .line 41
    move-result v9

    .line 42
    .line 43
    .line 44
    invoke-static {}, Ln90/d;->p()I

    .line 45
    move-result v0

    .line 46
    .line 47
    .line 48
    invoke-static {}, Ln90/d;->k()I

    .line 49
    move-result v2

    .line 50
    .line 51
    or-int v10, v0, v2

    .line 52
    .line 53
    .line 54
    invoke-static {}, Ln90/d;->m()I

    .line 55
    move-result v11

    .line 56
    .line 57
    if-eqz p2, :cond_1

    .line 58
    .line 59
    const/16 v0, 0x3142

    .line 60
    :goto_2
    move v13, v0

    .line 61
    goto :goto_3

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-static {}, Ln90/d;->e()I

    .line 65
    move-result v0

    .line 66
    goto :goto_2

    .line 67
    .line 68
    .line 69
    :goto_3
    invoke-static {}, Ln90/d;->e()I

    .line 70
    move-result v15

    .line 71
    .line 72
    const/16 v2, 0x8

    .line 73
    .line 74
    const/16 v4, 0x8

    .line 75
    .line 76
    const/16 v6, 0x8

    .line 77
    .line 78
    const/16 v8, 0x8

    .line 79
    .line 80
    move/from16 v14, p2

    .line 81
    .line 82
    .line 83
    filled-new-array/range {v1 .. v15}, [I

    .line 84
    move-result-object v0

    .line 85
    return-object v0
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
.end method
