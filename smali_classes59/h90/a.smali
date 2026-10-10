.class public Lh90/a;
.super Ljava/lang/Object;
.source "SGVADrawer.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh90/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0010\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\n\u001a\u000c\u0012\u0008\u0012\u00060\tR\u00020\u00000\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\r2\u0010\u0010\u000c\u001a\u000c\u0012\u0008\u0012\u00060\tR\u00020\u00000\u0008H\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\'\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001e\u0010\u001d\u001a\u000c\u0012\u0008\u0012\u00060\tR\u00020\u00000\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lh90/a;",
        "",
        "Lcom/opensource/svgaplayer/SVGAVideoEntity;",
        "videoItem",
        "<init>",
        "(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V",
        "",
        "frameIndex",
        "",
        "Lh90/a$a;",
        "e",
        "(I)Ljava/util/List;",
        "sprites",
        "",
        "d",
        "(Ljava/util/List;)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "Landroid/widget/ImageView$ScaleType;",
        "scaleType",
        "a",
        "(Landroid/graphics/Canvas;ILandroid/widget/ImageView$ScaleType;)V",
        "Lj90/f;",
        "Lj90/f;",
        "b",
        "()Lj90/f;",
        "scaleInfo",
        "Lj90/a;",
        "Lj90/a;",
        "spritePool",
        "c",
        "Lcom/opensource/svgaplayer/SVGAVideoEntity;",
        "()Lcom/opensource/svgaplayer/SVGAVideoEntity;",
        "com.opensource.svgaplayer"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lj90/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lj90/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj90/a<",
            "Lh90/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/opensource/svgaplayer/SVGAVideoEntity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V
    .locals 1
    .param p1    # Lcom/opensource/svgaplayer/SVGAVideoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lh90/a;->c:Lcom/opensource/svgaplayer/SVGAVideoEntity;

    .line 6
    .line 7
    new-instance v0, Lj90/f;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lj90/f;-><init>()V

    .line 11
    .line 12
    iput-object v0, p0, Lh90/a;->a:Lj90/f;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->q()Ljava/util/List;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 20
    move-result p1

    .line 21
    const/4 v0, 0x1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 25
    move-result p1

    .line 26
    .line 27
    new-instance v0, Lj90/a;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p1}, Lj90/a;-><init>(I)V

    .line 31
    .line 32
    iput-object v0, p0, Lh90/a;->b:Lj90/a;

    .line 33
    return-void
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
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;ILandroid/widget/ImageView$ScaleType;)V
    .locals 6
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/ImageView$ScaleType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lh90/a;->a:Lj90/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 6
    move-result p2

    .line 7
    int-to-float v1, p2

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 11
    move-result p1

    .line 12
    int-to-float v2, p1

    .line 13
    .line 14
    iget-object p1, p0, Lh90/a;->c:Lcom/opensource/svgaplayer/SVGAVideoEntity;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->r()Lj90/d;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lj90/d;->b()D

    .line 22
    move-result-wide p1

    .line 23
    double-to-float v3, p1

    .line 24
    .line 25
    iget-object p1, p0, Lh90/a;->c:Lcom/opensource/svgaplayer/SVGAVideoEntity;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->r()Lj90/d;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lj90/d;->a()D

    .line 33
    move-result-wide p1

    .line 34
    double-to-float v4, p1

    .line 35
    move-object v5, p3

    .line 36
    .line 37
    .line 38
    invoke-virtual/range {v0 .. v5}, Lj90/f;->f(FFFFLandroid/widget/ImageView$ScaleType;)V

    .line 39
    return-void
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
.end method

.method public final b()Lj90/f;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lh90/a;->a:Lj90/f;

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

.method public final c()Lcom/opensource/svgaplayer/SVGAVideoEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lh90/a;->c:Lcom/opensource/svgaplayer/SVGAVideoEntity;

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

.method public final d(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh90/a$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lh90/a$a;

    .line 17
    .line 18
    iget-object v1, p0, Lh90/a;->b:Lj90/a;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lj90/a;->c(Ljava/lang/Object;)Z

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
.end method

.method public final e(I)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lh90/a$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lh90/a;->c:Lcom/opensource/svgaplayer/SVGAVideoEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/opensource/svgaplayer/SVGAVideoEntity;->q()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_4

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Li90/f;

    .line 28
    const/4 v3, 0x0

    .line 29
    .line 30
    if-ltz p1, :cond_3

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Li90/f;->a()Ljava/util/List;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    .line 37
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 38
    move-result v4

    .line 39
    .line 40
    if-ge p1, v4, :cond_3

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Li90/f;->b()Ljava/lang/String;

    .line 44
    move-result-object v4

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x2

    .line 49
    .line 50
    const-string v7, ".matte"

    .line 51
    .line 52
    .line 53
    invoke-static {v4, v7, v5, v6, v3}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 54
    move-result v4

    .line 55
    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Li90/f;->a()Ljava/util/List;

    .line 60
    move-result-object v4

    .line 61
    .line 62
    .line 63
    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    move-result-object v4

    .line 65
    .line 66
    check-cast v4, Li90/g;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4}, Li90/g;->a()D

    .line 70
    move-result-wide v4

    .line 71
    .line 72
    const-wide/16 v6, 0x0

    .line 73
    .line 74
    cmpg-double v4, v4, v6

    .line 75
    .line 76
    if-gtz v4, :cond_1

    .line 77
    goto :goto_2

    .line 78
    .line 79
    :cond_1
    iget-object v3, p0, Lh90/a;->b:Lj90/a;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3}, Lj90/a;->a()Ljava/lang/Object;

    .line 83
    move-result-object v3

    .line 84
    .line 85
    check-cast v3, Lh90/a$a;

    .line 86
    .line 87
    if-eqz v3, :cond_2

    .line 88
    goto :goto_1

    .line 89
    .line 90
    :cond_2
    new-instance v4, Lh90/a$a;

    .line 91
    const/4 v9, 0x7

    .line 92
    const/4 v10, 0x0

    .line 93
    const/4 v6, 0x0

    .line 94
    const/4 v7, 0x0

    .line 95
    const/4 v8, 0x0

    .line 96
    move-object v5, p0

    .line 97
    .line 98
    .line 99
    invoke-direct/range {v4 .. v10}, Lh90/a$a;-><init>(Lh90/a;Ljava/lang/String;Ljava/lang/String;Li90/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 100
    move-object v3, v4

    .line 101
    .line 102
    .line 103
    :goto_1
    invoke-virtual {v2}, Li90/f;->c()Ljava/lang/String;

    .line 104
    move-result-object v4

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v4}, Lh90/a$a;->f(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Li90/f;->b()Ljava/lang/String;

    .line 111
    move-result-object v4

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v4}, Lh90/a$a;->e(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Li90/f;->a()Ljava/util/List;

    .line 118
    move-result-object v2

    .line 119
    .line 120
    .line 121
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    move-result-object v2

    .line 123
    .line 124
    check-cast v2, Li90/g;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v2}, Lh90/a$a;->d(Li90/g;)V

    .line 128
    .line 129
    :cond_3
    :goto_2
    if-eqz v3, :cond_0

    .line 130
    .line 131
    .line 132
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 133
    goto :goto_0

    .line 134
    :cond_4
    return-object v1
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
