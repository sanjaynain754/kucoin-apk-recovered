.class public final Lcom/tencent/liteav/videobase/b/b;
.super Lcom/tencent/liteav/videobase/a/a;
.source "SourceFile"


# instance fields
.field private h:I

.field private i:[F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "precision highp float;\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform mat3 matrix;\n\nvoid main()\n{\n  float cv_y = 1.0 - textureCoordinate.y;\n  float denominator = matrix[0][2] * textureCoordinate.x + matrix[1][2] * cv_y + matrix[2][2];\n  vec2 dst_coords;\n  dst_coords.x = matrix[0][0] * textureCoordinate.x + matrix[1][0] * cv_y + matrix[2][0];\n  dst_coords.y = matrix[0][1] * textureCoordinate.x + matrix[1][1] * cv_y + matrix[2][1];\n  dst_coords.x = dst_coords.x / denominator;\n  dst_coords.y = 1.0 - (dst_coords.y / denominator);\n  gl_FragColor = texture2D(inputImageTexture, dst_coords);\n}\n"

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/videobase/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

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

.method public static synthetic a(Lcom/tencent/liteav/videobase/b/b;Ljava/util/List;Ljava/util/List;)V
    .locals 6

    .line 4
    invoke-static {p1, p2}, Lcom/tencent/liteav/videobase/utils/PerspectiveTransformMatrixCalculator;->getPerspectiveTransformMatrix(Ljava/util/List;Ljava/util/List;)[F

    move-result-object p1

    const/16 p2, 0x9

    .line 5
    new-array p2, p2, [F

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x3

    if-ge v1, v2, :cond_1

    move v3, v0

    :goto_1
    if-ge v3, v2, :cond_0

    mul-int/lit8 v4, v3, 0x3

    add-int/2addr v4, v1

    mul-int/lit8 v5, v1, 0x3

    add-int/2addr v5, v3

    .line 6
    aget v5, p1, v5

    aput v5, p2, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7
    :cond_1
    iput-object p2, p0, Lcom/tencent/liteav/videobase/b/b;->i:[F

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/liteav/videobase/a/a;->a(I)V

    .line 2
    iget-object p1, p0, Lcom/tencent/liteav/videobase/b/b;->i:[F

    if-nez p1, :cond_0

    sget-object p1, Lcom/tencent/liteav/videobase/base/GLConstants;->a:[F

    .line 3
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/videobase/b/b;->h:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p1, v2}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    return-void
.end method

.method public final b(Lcom/tencent/liteav/videobase/frame/e;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/tencent/liteav/videobase/a/a;->b(Lcom/tencent/liteav/videobase/frame/e;)V

    .line 4
    .line 5
    iget p1, p0, Lcom/tencent/liteav/videobase/a/a;->f:I

    .line 6
    .line 7
    const-string v0, "matrix"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 11
    move-result p1

    .line 12
    .line 13
    iput p1, p0, Lcom/tencent/liteav/videobase/b/b;->h:I

    .line 14
    return-void
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
