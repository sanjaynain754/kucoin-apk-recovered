.class public final Lnw/c;
.super Ljava/lang/Object;
.source "Frame.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0012\u0010\u0008\u001a\u00020\t*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b\u001a\u001a\u0010\u000c\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u001a\u0010\u000c\u001a\u00020\r*\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "toRect",
        "Landroid/graphics/Rect;",
        "Lcom/kubi/resources/widget/chart/data/Frame;",
        "toRectF",
        "Landroid/graphics/RectF;",
        "withPaddings",
        "paddings",
        "Lcom/kubi/resources/widget/chart/data/Paddings;",
        "toLinearGradient",
        "Landroid/graphics/LinearGradient;",
        "data",
        "Lcom/kubi/resources/widget/chart/data/LinearGradientData;",
        "contains",
        "",
        "x",
        "",
        "y",
        "Lcom/kubi/resources/widget/chart/data/PointFrame;",
        "LComponent_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFrame.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Frame.kt\ncom/kubi/resources/widget/chart/data/FrameKt\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,58:1\n337#2:59\n*S KotlinDebug\n*F\n+ 1 Frame.kt\ncom/kubi/resources/widget/chart/data/FrameKt\n*L\n24#1:59\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lnw/h;FF)Z
    .locals 2
    .param p0    # Lnw/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    const-string v1, "x "

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, " y "

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string p2, "->>>"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    move-result-object p2

    .line 39
    .line 40
    const-string v0, "chart"

    .line 41
    .line 42
    .line 43
    invoke-static {v0, p2}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lnw/h;->b()Lnw/b;

    .line 47
    move-result-object p2

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Lnw/b;->c()F

    .line 51
    move-result p2

    .line 52
    .line 53
    cmpg-float p2, p1, p2

    .line 54
    .line 55
    if-gtz p2, :cond_0

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lnw/h;->b()Lnw/b;

    .line 59
    move-result-object p0

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lnw/b;->b()F

    .line 63
    move-result p0

    .line 64
    .line 65
    cmpl-float p0, p1, p0

    .line 66
    .line 67
    if-ltz p0, :cond_0

    .line 68
    const/4 p0, 0x1

    .line 69
    return p0

    .line 70
    :cond_0
    const/4 p0, 0x0

    .line 71
    return p0
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
.end method

.method public static final b(Lnw/b;Lnw/e;)Landroid/graphics/LinearGradient;
    .locals 9
    .param p0    # Lnw/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lnw/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "data"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v1, Landroid/graphics/LinearGradient;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lnw/b;->b()F

    .line 16
    move-result v2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lnw/b;->d()F

    .line 20
    move-result v3

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lnw/b;->b()F

    .line 24
    move-result v4

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lnw/b;->a()F

    .line 28
    move-result v5

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lnw/e;->d()I

    .line 32
    move-result v6

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lnw/e;->a()I

    .line 36
    move-result v7

    .line 37
    .line 38
    sget-object v8, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 39
    .line 40
    .line 41
    invoke-direct/range {v1 .. v8}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 42
    return-object v1
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

.method public static final c(Lnw/b;Lnw/f;)Lnw/b;
    .locals 5
    .param p0    # Lnw/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lnw/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "paddings"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v0, Lnw/b;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lnw/b;->b()F

    .line 16
    move-result v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lnw/f;->c()F

    .line 20
    move-result v2

    .line 21
    add-float/2addr v1, v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lnw/b;->d()F

    .line 25
    move-result v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lnw/f;->e()F

    .line 29
    move-result v3

    .line 30
    add-float/2addr v2, v3

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lnw/b;->c()F

    .line 34
    move-result v3

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lnw/f;->d()F

    .line 38
    move-result v4

    .line 39
    sub-float/2addr v3, v4

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lnw/b;->a()F

    .line 43
    move-result p0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lnw/f;->b()F

    .line 47
    move-result p1

    .line 48
    sub-float/2addr p0, p1

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v1, v2, v3, p0}, Lnw/b;-><init>(FFFF)V

    .line 52
    return-object v0
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method
