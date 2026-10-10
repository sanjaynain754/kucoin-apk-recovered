.class public final Lcom/tencent/liteav/videobase/frame/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[F

.field private static final b:[F

.field private static final c:[F

.field private static final d:[F


# instance fields
.field private e:I

.field private f:I

.field private final g:Ljava/nio/FloatBuffer;

.field private final h:Ljava/nio/FloatBuffer;

.field private final i:[Lcom/tencent/liteav/videobase/a/a;

.field private j:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

.field private k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

.field private l:Lcom/tencent/liteav/videobase/b/a;

.field private m:Lcom/tencent/liteav/videobase/a/a;

.field private n:Lcom/tencent/liteav/videobase/frame/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x8

    .line 3
    .line 4
    new-array v1, v0, [F

    .line 5
    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    sput-object v1, Lcom/tencent/liteav/videobase/frame/i;->a:[F

    .line 10
    .line 11
    new-array v1, v0, [F

    .line 12
    .line 13
    .line 14
    fill-array-data v1, :array_1

    .line 15
    .line 16
    sput-object v1, Lcom/tencent/liteav/videobase/frame/i;->b:[F

    .line 17
    .line 18
    new-array v1, v0, [F

    .line 19
    .line 20
    .line 21
    fill-array-data v1, :array_2

    .line 22
    .line 23
    sput-object v1, Lcom/tencent/liteav/videobase/frame/i;->c:[F

    .line 24
    .line 25
    new-array v0, v0, [F

    .line 26
    .line 27
    .line 28
    fill-array-data v0, :array_3

    .line 29
    .line 30
    sput-object v0, Lcom/tencent/liteav/videobase/frame/i;->d:[F

    .line 31
    return-void

    .line 32
    nop

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
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    :array_1
    .array-data 4
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
    .end array-data

    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->values()[Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    .line 7
    move-result-object v0

    .line 8
    array-length v0, v0

    .line 9
    .line 10
    new-array v0, v0, [Lcom/tencent/liteav/videobase/a/a;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->i:[Lcom/tencent/liteav/videobase/a/a;

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    iput-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->l:Lcom/tencent/liteav/videobase/b/a;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->m:Lcom/tencent/liteav/videobase/a/a;

    .line 20
    .line 21
    iput p1, p0, Lcom/tencent/liteav/videobase/frame/i;->e:I

    .line 22
    .line 23
    iput p2, p0, Lcom/tencent/liteav/videobase/frame/i;->f:I

    .line 24
    .line 25
    sget-object p1, Lcom/tencent/liteav/videobase/base/GLConstants;->d:[F

    .line 26
    array-length p2, p1

    .line 27
    .line 28
    mul-int/lit8 p2, p2, 0x4

    .line 29
    .line 30
    .line 31
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 40
    move-result-object p2

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 44
    move-result-object p2

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, p1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    iput-object p1, p0, Lcom/tencent/liteav/videobase/frame/i;->g:Ljava/nio/FloatBuffer;

    .line 51
    .line 52
    sget-object p1, Lcom/tencent/liteav/base/util/l;->a:Lcom/tencent/liteav/base/util/l;

    .line 53
    const/4 p2, 0x0

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2, p2}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->createTextureCoordsBuffer(Lcom/tencent/liteav/base/util/l;ZZ)Ljava/nio/FloatBuffer;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    iput-object p1, p0, Lcom/tencent/liteav/videobase/frame/i;->h:Ljava/nio/FloatBuffer;

    .line 60
    return-void
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

.method private static a(F)F
    .locals 1

    .line 1
    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-nez p0, :cond_0

    const/high16 p0, 0x3f800000    # 1.0f

    return p0

    :cond_0
    return v0
.end method

.method private static a(FF)F
    .locals 1

    .line 2
    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-nez p0, :cond_0

    return p1

    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    sub-float/2addr p0, p1

    return p0
.end method

.method private a(Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;Lcom/tencent/liteav/videobase/frame/d;Ljava/nio/ByteBuffer;Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V
    .locals 3

    .line 54
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    .line 55
    iget-object v1, p0, Lcom/tencent/liteav/videobase/frame/i;->i:[Lcom/tencent/liteav/videobase/a/a;

    aget-object v2, v1, v0

    if-nez v2, :cond_2

    .line 56
    sget-object v2, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->a:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    if-ne p1, v2, :cond_0

    .line 57
    new-instance p1, Lcom/tencent/liteav/videobase/c/a;

    invoke-direct {p1, p4, p5}, Lcom/tencent/liteav/videobase/c/a;-><init>(Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    aput-object p1, v1, v0

    goto :goto_0

    .line 58
    :cond_0
    sget-object p4, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->c:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    if-ne p1, p4, :cond_1

    .line 59
    new-instance p1, Lcom/tencent/liteav/videobase/c/d;

    invoke-direct {p1}, Lcom/tencent/liteav/videobase/c/d;-><init>()V

    aput-object p1, v1, v0

    goto :goto_0

    .line 60
    :cond_1
    new-instance p1, Lcom/tencent/liteav/videobase/c/c;

    invoke-direct {p1}, Lcom/tencent/liteav/videobase/c/c;-><init>()V

    aput-object p1, v1, v0

    .line 61
    :goto_0
    iget-object p1, p0, Lcom/tencent/liteav/videobase/frame/i;->i:[Lcom/tencent/liteav/videobase/a/a;

    aget-object p1, p1, v0

    const/4 p4, 0x0

    invoke-virtual {p1, p4}, Lcom/tencent/liteav/videobase/a/a;->a(Lcom/tencent/liteav/videobase/frame/e;)V

    .line 62
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/videobase/frame/i;->i:[Lcom/tencent/liteav/videobase/a/a;

    aget-object p1, p1, v0

    check-cast p1, Lcom/tencent/liteav/videobase/c/e;

    .line 63
    iget p4, p0, Lcom/tencent/liteav/videobase/frame/i;->e:I

    iget p5, p0, Lcom/tencent/liteav/videobase/frame/i;->f:I

    invoke-virtual {p1, p4, p5}, Lcom/tencent/liteav/videobase/a/a;->a(II)V

    .line 64
    iget p4, p0, Lcom/tencent/liteav/videobase/frame/i;->e:I

    iget p5, p0, Lcom/tencent/liteav/videobase/frame/i;->f:I

    const/4 v0, 0x0

    invoke-static {v0, v0, p4, p5}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->glViewport(IIII)V

    .line 65
    iget-object p4, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {p4}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    move-result-object p4

    sget-object p5, Lcom/tencent/liteav/base/util/l;->b:Lcom/tencent/liteav/base/util/l;

    if-eq p4, p5, :cond_4

    iget-object p4, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 66
    invoke-virtual {p4}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    move-result-object p4

    sget-object p5, Lcom/tencent/liteav/base/util/l;->d:Lcom/tencent/liteav/base/util/l;

    if-ne p4, p5, :cond_3

    goto :goto_1

    .line 67
    :cond_3
    iget-object p4, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 68
    invoke-virtual {p4}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getWidth()I

    move-result p4

    iget-object p5, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {p5}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getHeight()I

    move-result p5

    .line 69
    invoke-virtual {p1, p3, p4, p5}, Lcom/tencent/liteav/videobase/c/e;->a(Ljava/nio/ByteBuffer;II)V

    goto :goto_2

    .line 70
    :cond_4
    :goto_1
    iget-object p4, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 71
    invoke-virtual {p4}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getHeight()I

    move-result p4

    iget-object p5, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {p5}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getWidth()I

    move-result p5

    .line 72
    invoke-virtual {p1, p3, p4, p5}, Lcom/tencent/liteav/videobase/c/e;->a(Ljava/nio/ByteBuffer;II)V

    .line 73
    :goto_2
    iget-object p3, p0, Lcom/tencent/liteav/videobase/frame/i;->g:Ljava/nio/FloatBuffer;

    iget-object p4, p0, Lcom/tencent/liteav/videobase/frame/i;->h:Ljava/nio/FloatBuffer;

    const/4 p5, -0x1

    invoke-virtual {p1, p5, p2, p3, p4}, Lcom/tencent/liteav/videobase/c/e;->a(ILcom/tencent/liteav/videobase/frame/d;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    return-void
.end method

.method private a(Lcom/tencent/liteav/videobase/frame/d;)V
    .locals 4

    .line 86
    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->n:Lcom/tencent/liteav/videobase/frame/c;

    if-nez v0, :cond_0

    .line 87
    new-instance v0, Lcom/tencent/liteav/videobase/frame/c;

    invoke-direct {v0}, Lcom/tencent/liteav/videobase/frame/c;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->n:Lcom/tencent/liteav/videobase/frame/c;

    .line 88
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/c;->a()V

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    .line 89
    invoke-static {v1, v1, v1, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 v0, 0x4100

    const/4 v1, 0x0

    const v2, 0x8d40

    if-nez p1, :cond_1

    .line 90
    invoke-static {v2, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 91
    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    return-void

    .line 92
    :cond_1
    iget-object v3, p0, Lcom/tencent/liteav/videobase/frame/i;->n:Lcom/tencent/liteav/videobase/frame/c;

    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/d;->a()I

    move-result p1

    invoke-virtual {v3, p1}, Lcom/tencent/liteav/videobase/frame/c;->a(I)V

    .line 93
    iget-object p1, p0, Lcom/tencent/liteav/videobase/frame/i;->n:Lcom/tencent/liteav/videobase/frame/c;

    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/c;->b()V

    .line 94
    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    .line 95
    invoke-static {v2, v1}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->bindFramebuffer(II)V

    .line 96
    iget-object p1, p0, Lcom/tencent/liteav/videobase/frame/i;->n:Lcom/tencent/liteav/videobase/frame/c;

    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/c;->c()V

    return-void
.end method

.method private a(Lcom/tencent/liteav/videobase/frame/d;I)V
    .locals 3

    .line 82
    invoke-direct {p0}, Lcom/tencent/liteav/videobase/frame/i;->c()V

    .line 83
    iget v0, p0, Lcom/tencent/liteav/videobase/frame/i;->e:I

    iget v1, p0, Lcom/tencent/liteav/videobase/frame/i;->f:I

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->glViewport(IIII)V

    .line 84
    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->m:Lcom/tencent/liteav/videobase/a/a;

    iget v1, p0, Lcom/tencent/liteav/videobase/frame/i;->e:I

    iget v2, p0, Lcom/tencent/liteav/videobase/frame/i;->f:I

    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/videobase/a/a;->a(II)V

    .line 85
    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->m:Lcom/tencent/liteav/videobase/a/a;

    iget-object v1, p0, Lcom/tencent/liteav/videobase/frame/i;->g:Ljava/nio/FloatBuffer;

    iget-object v2, p0, Lcom/tencent/liteav/videobase/frame/i;->h:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, p2, p1, v1, v2}, Lcom/tencent/liteav/videobase/a/a;->a(ILcom/tencent/liteav/videobase/frame/d;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    return-void
.end method

.method private a(Lcom/tencent/liteav/videobase/frame/d;I[F)V
    .locals 3

    .line 74
    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->l:Lcom/tencent/liteav/videobase/b/a;

    if-nez v0, :cond_0

    .line 75
    new-instance v0, Lcom/tencent/liteav/videobase/b/a;

    invoke-direct {v0}, Lcom/tencent/liteav/videobase/b/a;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->l:Lcom/tencent/liteav/videobase/b/a;

    const/4 v1, 0x0

    .line 76
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/videobase/a/a;->a(Lcom/tencent/liteav/videobase/frame/e;)V

    .line 77
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/videobase/frame/i;->e:I

    iget v1, p0, Lcom/tencent/liteav/videobase/frame/i;->f:I

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->glViewport(IIII)V

    .line 78
    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->l:Lcom/tencent/liteav/videobase/b/a;

    .line 79
    iput-object p3, v0, Lcom/tencent/liteav/videobase/a/a;->g:[F

    .line 80
    iget p3, p0, Lcom/tencent/liteav/videobase/frame/i;->e:I

    iget v1, p0, Lcom/tencent/liteav/videobase/frame/i;->f:I

    invoke-virtual {v0, p3, v1}, Lcom/tencent/liteav/videobase/a/a;->a(II)V

    .line 81
    iget-object p3, p0, Lcom/tencent/liteav/videobase/frame/i;->l:Lcom/tencent/liteav/videobase/b/a;

    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->g:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lcom/tencent/liteav/videobase/frame/i;->h:Ljava/nio/FloatBuffer;

    invoke-virtual {p3, p2, p1, v0, v1}, Lcom/tencent/liteav/videobase/a/a;->a(ILcom/tencent/liteav/videobase/frame/d;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    return-void
.end method

.method private a(Lcom/tencent/liteav/videobase/frame/d;Ljava/nio/Buffer;)V
    .locals 4

    .line 42
    sget-object v0, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->f:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    .line 43
    iget-object v1, p0, Lcom/tencent/liteav/videobase/frame/i;->i:[Lcom/tencent/liteav/videobase/a/a;

    aget-object v2, v1, v0

    if-nez v2, :cond_0

    .line 44
    new-instance v2, Lcom/tencent/liteav/videobase/b/d;

    invoke-direct {v2}, Lcom/tencent/liteav/videobase/b/d;-><init>()V

    aput-object v2, v1, v0

    .line 45
    iget-object v1, p0, Lcom/tencent/liteav/videobase/frame/i;->i:[Lcom/tencent/liteav/videobase/a/a;

    aget-object v1, v1, v0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/tencent/liteav/videobase/a/a;->a(Lcom/tencent/liteav/videobase/frame/e;)V

    .line 46
    :cond_0
    iget-object v1, p0, Lcom/tencent/liteav/videobase/frame/i;->i:[Lcom/tencent/liteav/videobase/a/a;

    aget-object v0, v1, v0

    check-cast v0, Lcom/tencent/liteav/videobase/b/d;

    .line 47
    iget v1, p0, Lcom/tencent/liteav/videobase/frame/i;->e:I

    iget v2, p0, Lcom/tencent/liteav/videobase/frame/i;->f:I

    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/videobase/a/a;->a(II)V

    .line 48
    iget v1, p0, Lcom/tencent/liteav/videobase/frame/i;->e:I

    iget v2, p0, Lcom/tencent/liteav/videobase/frame/i;->f:I

    const/4 v3, 0x0

    invoke-static {v3, v3, v1, v2}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->glViewport(IIII)V

    .line 49
    iget-object v1, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    move-result-object v1

    sget-object v2, Lcom/tencent/liteav/base/util/l;->b:Lcom/tencent/liteav/base/util/l;

    if-eq v1, v2, :cond_2

    iget-object v1, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 50
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    move-result-object v1

    sget-object v2, Lcom/tencent/liteav/base/util/l;->d:Lcom/tencent/liteav/base/util/l;

    if-ne v1, v2, :cond_1

    goto :goto_0

    .line 51
    :cond_1
    iget-object v1, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {v2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getHeight()I

    move-result v2

    invoke-virtual {v0, p2, v1, v2}, Lcom/tencent/liteav/videobase/b/d;->a(Ljava/nio/Buffer;II)V

    goto :goto_1

    .line 52
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {v2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getWidth()I

    move-result v2

    invoke-virtual {v0, p2, v1, v2}, Lcom/tencent/liteav/videobase/b/d;->a(Ljava/nio/Buffer;II)V

    .line 53
    :goto_1
    iget-object p2, p0, Lcom/tencent/liteav/videobase/frame/i;->g:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lcom/tencent/liteav/videobase/frame/i;->h:Ljava/nio/FloatBuffer;

    const/4 v2, -0x1

    invoke-virtual {v0, v2, p1, p2, v1}, Lcom/tencent/liteav/videobase/b/d;->a(ILcom/tencent/liteav/videobase/frame/d;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    return-void
.end method

.method private static a([FLcom/tencent/liteav/base/util/l;ZZ)V
    .locals 5

    .line 97
    sget-object v0, Lcom/tencent/liteav/videobase/frame/i;->a:[F

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz p1, :cond_3

    .line 98
    sget-object v4, Lcom/tencent/liteav/videobase/frame/i$1;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v4, p1

    if-eq p1, v3, :cond_2

    if-eq p1, v2, :cond_1

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 99
    :cond_0
    sget-object v0, Lcom/tencent/liteav/videobase/frame/i;->c:[F

    goto :goto_0

    .line 100
    :cond_1
    sget-object v0, Lcom/tencent/liteav/videobase/frame/i;->d:[F

    goto :goto_0

    .line 101
    :cond_2
    sget-object v0, Lcom/tencent/liteav/videobase/frame/i;->b:[F

    .line 102
    :cond_3
    :goto_0
    array-length p1, v0

    const/4 v4, 0x0

    invoke-static {v0, v4, p0, v4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz p2, :cond_4

    .line 103
    aget p1, p0, v4

    invoke-static {p1}, Lcom/tencent/liteav/videobase/frame/i;->a(F)F

    move-result p1

    aput p1, p0, v4

    .line 104
    aget p1, p0, v2

    invoke-static {p1}, Lcom/tencent/liteav/videobase/frame/i;->a(F)F

    move-result p1

    aput p1, p0, v2

    const/4 p1, 0x4

    .line 105
    aget p2, p0, p1

    invoke-static {p2}, Lcom/tencent/liteav/videobase/frame/i;->a(F)F

    move-result p2

    aput p2, p0, p1

    const/4 p1, 0x6

    .line 106
    aget p2, p0, p1

    invoke-static {p2}, Lcom/tencent/liteav/videobase/frame/i;->a(F)F

    move-result p2

    aput p2, p0, p1

    :cond_4
    if-eqz p3, :cond_5

    .line 107
    aget p1, p0, v3

    invoke-static {p1}, Lcom/tencent/liteav/videobase/frame/i;->a(F)F

    move-result p1

    aput p1, p0, v3

    .line 108
    aget p1, p0, v1

    invoke-static {p1}, Lcom/tencent/liteav/videobase/frame/i;->a(F)F

    move-result p1

    aput p1, p0, v1

    const/4 p1, 0x5

    .line 109
    aget p2, p0, p1

    invoke-static {p2}, Lcom/tencent/liteav/videobase/frame/i;->a(F)F

    move-result p2

    aput p2, p0, p1

    const/4 p1, 0x7

    .line 110
    aget p2, p0, p1

    invoke-static {p2}, Lcom/tencent/liteav/videobase/frame/i;->a(F)F

    move-result p2

    aput p2, p0, p1

    :cond_5
    return-void
.end method

.method private a(Lcom/tencent/liteav/videobase/frame/PixelFrame;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)Z
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->j:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    if-ne p2, v0, :cond_1

    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getWidth()I

    move-result p2

    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getWidth()I

    move-result v0

    if-ne p2, v0, :cond_1

    .line 36
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getHeight()I

    move-result p2

    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getHeight()I

    move-result v0

    if-ne p2, v0, :cond_1

    .line 37
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    move-result-object p2

    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    move-result-object v0

    if-ne p2, v0, :cond_1

    .line 38
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getPixelFormatType()Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    move-result-object p2

    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getPixelFormatType()Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    move-result-object v0

    if-ne p2, v0, :cond_1

    .line 39
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->isMirrorHorizontal()Z

    move-result p2

    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->isMirrorHorizontal()Z

    move-result v0

    if-ne p2, v0, :cond_1

    .line 40
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->isMirrorVertical()Z

    move-result p2

    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->isMirrorVertical()Z

    move-result v0

    if-ne p2, v0, :cond_1

    .line 41
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    move-result-object p1

    iget-object p2, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    move-result-object p2

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private b()V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    sget-object v2, Lcom/tencent/liteav/base/util/l;->b:Lcom/tencent/liteav/base/util/l;

    .line 14
    const/4 v3, 0x1

    .line 15
    const/4 v4, 0x0

    .line 16
    .line 17
    if-eq v1, v2, :cond_2

    .line 18
    .line 19
    iget-object v1, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    sget-object v2, Lcom/tencent/liteav/base/util/l;->d:Lcom/tencent/liteav/base/util/l;

    .line 26
    .line 27
    if-ne v1, v2, :cond_1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v1, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    :goto_0
    move v1, v3

    .line 32
    .line 33
    :goto_1
    iget-object v2, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getWidth()I

    .line 37
    move-result v2

    .line 38
    .line 39
    iget-object v5, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getHeight()I

    .line 43
    move-result v5

    .line 44
    .line 45
    iget v6, v0, Lcom/tencent/liteav/videobase/frame/i;->e:I

    .line 46
    int-to-float v6, v6

    .line 47
    .line 48
    const/high16 v7, 0x3f800000    # 1.0f

    .line 49
    mul-float/2addr v6, v7

    .line 50
    int-to-float v2, v2

    .line 51
    div-float/2addr v6, v2

    .line 52
    .line 53
    iget v8, v0, Lcom/tencent/liteav/videobase/frame/i;->f:I

    .line 54
    int-to-float v8, v8

    .line 55
    mul-float/2addr v8, v7

    .line 56
    int-to-float v5, v5

    .line 57
    div-float/2addr v8, v5

    .line 58
    .line 59
    .line 60
    invoke-static {v6, v8}, Ljava/lang/Math;->max(FF)F

    .line 61
    move-result v6

    .line 62
    mul-float/2addr v2, v6

    .line 63
    .line 64
    .line 65
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 66
    move-result v2

    .line 67
    int-to-float v2, v2

    .line 68
    mul-float/2addr v2, v7

    .line 69
    .line 70
    iget v8, v0, Lcom/tencent/liteav/videobase/frame/i;->e:I

    .line 71
    int-to-float v8, v8

    .line 72
    div-float/2addr v2, v8

    .line 73
    mul-float/2addr v5, v6

    .line 74
    .line 75
    .line 76
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 77
    move-result v5

    .line 78
    int-to-float v5, v5

    .line 79
    mul-float/2addr v5, v7

    .line 80
    .line 81
    iget v6, v0, Lcom/tencent/liteav/videobase/frame/i;->f:I

    .line 82
    int-to-float v6, v6

    .line 83
    div-float/2addr v5, v6

    .line 84
    .line 85
    sget-object v6, Lcom/tencent/liteav/videobase/base/GLConstants;->d:[F

    .line 86
    .line 87
    const/16 v8, 0x8

    .line 88
    .line 89
    new-array v9, v8, [F

    .line 90
    .line 91
    iget-object v10, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v10}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 95
    move-result-object v10

    .line 96
    .line 97
    sget-object v11, Lcom/tencent/liteav/videobase/base/GLConstants$a;->c:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 98
    .line 99
    if-ne v10, v11, :cond_3

    .line 100
    .line 101
    iget-object v10, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v10}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    .line 105
    move-result-object v10

    .line 106
    .line 107
    iget-object v11, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v11}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->isMirrorHorizontal()Z

    .line 111
    move-result v11

    .line 112
    .line 113
    iget-object v12, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->isMirrorVertical()Z

    .line 117
    move-result v12

    .line 118
    .line 119
    .line 120
    invoke-static {v9, v10, v11, v12}, Lcom/tencent/liteav/videobase/frame/i;->a([FLcom/tencent/liteav/base/util/l;ZZ)V

    .line 121
    goto :goto_2

    .line 122
    .line 123
    :cond_3
    iget-object v10, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v10}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getRotation()Lcom/tencent/liteav/base/util/l;

    .line 127
    move-result-object v10

    .line 128
    .line 129
    iget-object v11, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v11}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->isMirrorHorizontal()Z

    .line 133
    move-result v11

    .line 134
    .line 135
    iget-object v12, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->isMirrorVertical()Z

    .line 139
    move-result v12

    .line 140
    .line 141
    .line 142
    invoke-static {v9, v10, v11, v12}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->initTextureCoordsBuffer([FLcom/tencent/liteav/base/util/l;ZZ)V

    .line 143
    .line 144
    :goto_2
    iget-object v10, v0, Lcom/tencent/liteav/videobase/frame/i;->j:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 145
    .line 146
    sget-object v11, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->a:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 147
    const/4 v12, 0x7

    .line 148
    const/4 v13, 0x6

    .line 149
    const/4 v14, 0x5

    .line 150
    const/4 v15, 0x4

    .line 151
    .line 152
    const/16 v16, 0x3

    .line 153
    .line 154
    const/16 v17, 0x2

    .line 155
    .line 156
    if-ne v10, v11, :cond_6

    .line 157
    .line 158
    const/high16 v8, 0x40000000    # 2.0f

    .line 159
    .line 160
    if-eqz v1, :cond_4

    .line 161
    .line 162
    div-float v10, v7, v5

    .line 163
    .line 164
    :goto_3
    sub-float v10, v7, v10

    .line 165
    div-float/2addr v10, v8

    .line 166
    goto :goto_4

    .line 167
    .line 168
    :cond_4
    div-float v10, v7, v2

    .line 169
    goto :goto_3

    .line 170
    .line 171
    :goto_4
    if-eqz v1, :cond_5

    .line 172
    .line 173
    div-float v1, v7, v2

    .line 174
    :goto_5
    sub-float/2addr v7, v1

    .line 175
    div-float/2addr v7, v8

    .line 176
    goto :goto_6

    .line 177
    .line 178
    :cond_5
    div-float v1, v7, v5

    .line 179
    goto :goto_5

    .line 180
    .line 181
    :goto_6
    aget v1, v9, v4

    .line 182
    .line 183
    .line 184
    invoke-static {v1, v10}, Lcom/tencent/liteav/videobase/frame/i;->a(FF)F

    .line 185
    move-result v1

    .line 186
    .line 187
    aput v1, v9, v4

    .line 188
    .line 189
    aget v1, v9, v3

    .line 190
    .line 191
    .line 192
    invoke-static {v1, v7}, Lcom/tencent/liteav/videobase/frame/i;->a(FF)F

    .line 193
    move-result v1

    .line 194
    .line 195
    aput v1, v9, v3

    .line 196
    .line 197
    aget v1, v9, v17

    .line 198
    .line 199
    .line 200
    invoke-static {v1, v10}, Lcom/tencent/liteav/videobase/frame/i;->a(FF)F

    .line 201
    move-result v1

    .line 202
    .line 203
    aput v1, v9, v17

    .line 204
    .line 205
    aget v1, v9, v16

    .line 206
    .line 207
    .line 208
    invoke-static {v1, v7}, Lcom/tencent/liteav/videobase/frame/i;->a(FF)F

    .line 209
    move-result v1

    .line 210
    .line 211
    aput v1, v9, v16

    .line 212
    .line 213
    aget v1, v9, v15

    .line 214
    .line 215
    .line 216
    invoke-static {v1, v10}, Lcom/tencent/liteav/videobase/frame/i;->a(FF)F

    .line 217
    move-result v1

    .line 218
    .line 219
    aput v1, v9, v15

    .line 220
    .line 221
    aget v1, v9, v14

    .line 222
    .line 223
    .line 224
    invoke-static {v1, v7}, Lcom/tencent/liteav/videobase/frame/i;->a(FF)F

    .line 225
    move-result v1

    .line 226
    .line 227
    aput v1, v9, v14

    .line 228
    .line 229
    aget v1, v9, v13

    .line 230
    .line 231
    .line 232
    invoke-static {v1, v10}, Lcom/tencent/liteav/videobase/frame/i;->a(FF)F

    .line 233
    move-result v1

    .line 234
    .line 235
    aput v1, v9, v13

    .line 236
    .line 237
    aget v1, v9, v12

    .line 238
    .line 239
    .line 240
    invoke-static {v1, v7}, Lcom/tencent/liteav/videobase/frame/i;->a(FF)F

    .line 241
    move-result v1

    .line 242
    .line 243
    aput v1, v9, v12

    .line 244
    goto :goto_7

    .line 245
    .line 246
    :cond_6
    sget-object v1, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->b:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 247
    .line 248
    if-ne v10, v1, :cond_7

    .line 249
    .line 250
    new-array v1, v8, [F

    .line 251
    .line 252
    aget v7, v6, v4

    .line 253
    div-float/2addr v7, v5

    .line 254
    .line 255
    aput v7, v1, v4

    .line 256
    .line 257
    aget v7, v6, v3

    .line 258
    div-float/2addr v7, v2

    .line 259
    .line 260
    aput v7, v1, v3

    .line 261
    .line 262
    aget v3, v6, v17

    .line 263
    div-float/2addr v3, v5

    .line 264
    .line 265
    aput v3, v1, v17

    .line 266
    .line 267
    aget v3, v6, v16

    .line 268
    div-float/2addr v3, v2

    .line 269
    .line 270
    aput v3, v1, v16

    .line 271
    .line 272
    aget v3, v6, v15

    .line 273
    div-float/2addr v3, v5

    .line 274
    .line 275
    aput v3, v1, v15

    .line 276
    .line 277
    aget v3, v6, v14

    .line 278
    div-float/2addr v3, v2

    .line 279
    .line 280
    aput v3, v1, v14

    .line 281
    .line 282
    aget v3, v6, v13

    .line 283
    div-float/2addr v3, v5

    .line 284
    .line 285
    aput v3, v1, v13

    .line 286
    .line 287
    aget v3, v6, v12

    .line 288
    div-float/2addr v3, v2

    .line 289
    .line 290
    aput v3, v1, v12

    .line 291
    move-object v6, v1

    .line 292
    .line 293
    :cond_7
    :goto_7
    iget-object v1, v0, Lcom/tencent/liteav/videobase/frame/i;->g:Ljava/nio/FloatBuffer;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    .line 297
    .line 298
    iget-object v1, v0, Lcom/tencent/liteav/videobase/frame/i;->g:Ljava/nio/FloatBuffer;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1, v6}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 302
    move-result-object v1

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1, v4}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 306
    .line 307
    iget-object v1, v0, Lcom/tencent/liteav/videobase/frame/i;->h:Ljava/nio/FloatBuffer;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    .line 311
    .line 312
    iget-object v1, v0, Lcom/tencent/liteav/videobase/frame/i;->h:Ljava/nio/FloatBuffer;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, v9}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 316
    move-result-object v1

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v4}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 320
    return-void
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method private c()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->m:Lcom/tencent/liteav/videobase/a/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    new-instance v0, Lcom/tencent/liteav/videobase/a/a;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lcom/tencent/liteav/videobase/a/a;-><init>()V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->m:Lcom/tencent/liteav/videobase/a/a;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/videobase/a/a;->a(Lcom/tencent/liteav/videobase/frame/e;)V

    .line 17
    return-void
.end method

.method private d()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->l:Lcom/tencent/liteav/videobase/b/a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/a/a;->b()V

    .line 9
    .line 10
    iput-object v1, p0, Lcom/tencent/liteav/videobase/frame/i;->l:Lcom/tencent/liteav/videobase/b/a;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->m:Lcom/tencent/liteav/videobase/a/a;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/a/a;->b()V

    .line 18
    .line 19
    iput-object v1, p0, Lcom/tencent/liteav/videobase/frame/i;->m:Lcom/tencent/liteav/videobase/a/a;

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->n:Lcom/tencent/liteav/videobase/frame/c;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/c;->d()V

    .line 27
    .line 28
    iput-object v1, p0, Lcom/tencent/liteav/videobase/frame/i;->n:Lcom/tencent/liteav/videobase/frame/c;

    .line 29
    :cond_2
    const/4 v0, 0x0

    .line 30
    .line 31
    :goto_0
    iget-object v2, p0, Lcom/tencent/liteav/videobase/frame/i;->i:[Lcom/tencent/liteav/videobase/a/a;

    .line 32
    array-length v3, v2

    .line 33
    .line 34
    if-ge v0, v3, :cond_4

    .line 35
    .line 36
    aget-object v2, v2, v0

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/tencent/liteav/videobase/a/a;->b()V

    .line 42
    .line 43
    iget-object v2, p0, Lcom/tencent/liteav/videobase/frame/i;->i:[Lcom/tencent/liteav/videobase/a/a;

    .line 44
    .line 45
    aput-object v1, v2, v0

    .line 46
    .line 47
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_4
    const-string v0, "PixelFrameRenderer"

    .line 51
    .line 52
    .line 53
    const-string/jumbo v1, "uninitialize GL components"

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 34
    invoke-direct {p0}, Lcom/tencent/liteav/videobase/frame/i;->d()V

    return-void
.end method

.method public final a(II)V
    .locals 1

    .line 29
    iget v0, p0, Lcom/tencent/liteav/videobase/frame/i;->e:I

    if-ne v0, p1, :cond_1

    iget v0, p0, Lcom/tencent/liteav/videobase/frame/i;->f:I

    if-eq v0, p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 30
    :cond_1
    :goto_0
    iput p1, p0, Lcom/tencent/liteav/videobase/frame/i;->e:I

    .line 31
    iput p2, p0, Lcom/tencent/liteav/videobase/frame/i;->f:I

    .line 32
    invoke-direct {p0}, Lcom/tencent/liteav/videobase/frame/i;->b()V

    return-void
.end method

.method public final a(Lcom/tencent/liteav/videobase/frame/PixelFrame;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;Lcom/tencent/liteav/videobase/frame/d;)V
    .locals 12

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->isFrameDataValid()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p0

    goto/16 :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    if-eqz v0, :cond_2

    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/videobase/frame/i;->a(Lcom/tencent/liteav/videobase/frame/PixelFrame;Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 5
    :cond_2
    iput-object p2, p0, Lcom/tencent/liteav/videobase/frame/i;->j:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    .line 6
    new-instance v0, Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-direct {v0, p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;-><init>(Lcom/tencent/liteav/videobase/frame/PixelFrame;)V

    iput-object v0, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    .line 7
    invoke-direct {p0}, Lcom/tencent/liteav/videobase/frame/i;->d()V

    .line 8
    invoke-direct {p0}, Lcom/tencent/liteav/videobase/frame/i;->b()V

    .line 9
    :cond_3
    sget-object v0, Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;->b:Lcom/tencent/liteav/videobase/base/GLConstants$GLScaleType;

    if-ne p2, v0, :cond_4

    .line 10
    invoke-direct {p0, p3}, Lcom/tencent/liteav/videobase/frame/i;->a(Lcom/tencent/liteav/videobase/frame/d;)V

    .line 11
    :cond_4
    iget-object p2, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    move-result-object p2

    sget-object v0, Lcom/tencent/liteav/videobase/base/GLConstants$a;->a:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    if-ne p2, v0, :cond_6

    .line 12
    iget-object p2, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getPixelFormatType()Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    move-result-object p2

    sget-object v0, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->f:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    if-eq p2, v0, :cond_5

    .line 13
    iget-object p2, p0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getPixelFormatType()Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    move-result-object v1

    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 14
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getColorRange()Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    move-result-object v4

    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getColorSpace()Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    move-result-object v5

    move-object v0, p0

    move-object v2, p3

    .line 15
    invoke-direct/range {v0 .. v5}, Lcom/tencent/liteav/videobase/frame/i;->a(Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;Lcom/tencent/liteav/videobase/frame/d;Ljava/nio/ByteBuffer;Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    return-void

    :cond_5
    move-object v0, p0

    move-object v2, p3

    .line 16
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Lcom/tencent/liteav/videobase/frame/i;->a(Lcom/tencent/liteav/videobase/frame/d;Ljava/nio/Buffer;)V

    return-void

    :cond_6
    move-object v0, p0

    move-object v2, p3

    .line 17
    iget-object p2, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    move-result-object p2

    sget-object p3, Lcom/tencent/liteav/videobase/base/GLConstants$a;->d:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    if-ne p2, p3, :cond_8

    .line 18
    iget-object p2, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getPixelFormatType()Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    move-result-object p2

    sget-object p3, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->f:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    if-eq p2, p3, :cond_7

    .line 19
    iget-object p2, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getPixelFormatType()Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    move-result-object v7

    .line 20
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getData()[B

    move-result-object p2

    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v9

    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getColorRange()Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    move-result-object v10

    .line 21
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getColorSpace()Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    move-result-object v11

    move-object v6, v0

    move-object v8, v2

    .line 22
    invoke-direct/range {v6 .. v11}, Lcom/tencent/liteav/videobase/frame/i;->a(Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;Lcom/tencent/liteav/videobase/frame/d;Ljava/nio/ByteBuffer;Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    return-void

    .line 23
    :cond_7
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getData()[B

    move-result-object p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Lcom/tencent/liteav/videobase/frame/i;->a(Lcom/tencent/liteav/videobase/frame/d;Ljava/nio/Buffer;)V

    return-void

    .line 24
    :cond_8
    iget-object p2, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    move-result-object p2

    sget-object p3, Lcom/tencent/liteav/videobase/base/GLConstants$a;->c:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    if-ne p2, p3, :cond_9

    .line 25
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getTextureId()I

    move-result p2

    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getMatrix()[F

    move-result-object p1

    invoke-direct {p0, v2, p2, p1}, Lcom/tencent/liteav/videobase/frame/i;->a(Lcom/tencent/liteav/videobase/frame/d;I[F)V

    return-void

    .line 26
    :cond_9
    iget-object p2, v0, Lcom/tencent/liteav/videobase/frame/i;->k:Lcom/tencent/liteav/videobase/frame/PixelFrame;

    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    move-result-object p2

    sget-object p3, Lcom/tencent/liteav/videobase/base/GLConstants$a;->b:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    if-ne p2, p3, :cond_a

    .line 27
    invoke-virtual {p1}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->getTextureId()I

    move-result p1

    invoke-direct {p0, v2, p1}, Lcom/tencent/liteav/videobase/frame/i;->a(Lcom/tencent/liteav/videobase/frame/d;I)V

    :cond_a
    return-void

    .line 28
    :goto_0
    const-string p1, "PixelFrameRenderer"

    const-string/jumbo p2, "renderFrame: pixelFrame is not valid"

    invoke-static {p1, p2}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
