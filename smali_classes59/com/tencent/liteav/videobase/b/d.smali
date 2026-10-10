.class public final Lcom/tencent/liteav/videobase/b/d;
.super Lcom/tencent/liteav/videobase/a/a;
.source "SourceFile"


# instance fields
.field private h:I

.field private i:I

.field private j:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/liteav/videobase/a/a;-><init>()V

    .line 4
    const/4 v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/liteav/videobase/b/d;->h:I

    .line 7
    .line 8
    iput v0, p0, Lcom/tencent/liteav/videobase/b/d;->i:I

    .line 9
    .line 10
    iput v0, p0, Lcom/tencent/liteav/videobase/b/d;->j:I

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public final a(ILcom/tencent/liteav/videobase/frame/d;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/tencent/liteav/videobase/b/d;->j:I

    invoke-super {p0, p1, p2, p3, p4}, Lcom/tencent/liteav/videobase/a/a;->a(ILcom/tencent/liteav/videobase/frame/d;Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    return-void
.end method

.method public final a(Ljava/nio/Buffer;II)V
    .locals 2

    .line 2
    iget v0, p0, Lcom/tencent/liteav/videobase/b/d;->h:I

    if-ne v0, p2, :cond_0

    iget v0, p0, Lcom/tencent/liteav/videobase/b/d;->i:I

    if-eq v0, p3, :cond_1

    .line 3
    :cond_0
    iput p2, p0, Lcom/tencent/liteav/videobase/b/d;->h:I

    .line 4
    iput p3, p0, Lcom/tencent/liteav/videobase/b/d;->i:I

    .line 5
    iget v0, p0, Lcom/tencent/liteav/videobase/b/d;->j:I

    invoke-static {v0}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->deleteTexture(I)V

    const/4 v0, -0x1

    .line 6
    iput v0, p0, Lcom/tencent/liteav/videobase/b/d;->j:I

    :cond_1
    const/16 v0, 0x1908

    .line 7
    iget v1, p0, Lcom/tencent/liteav/videobase/b/d;->j:I

    invoke-static {v0, p1, p2, p3, v1}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->loadTexture(ILjava/nio/Buffer;III)I

    move-result p1

    iput p1, p0, Lcom/tencent/liteav/videobase/b/d;->j:I

    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/tencent/liteav/videobase/a/a;->c()V

    .line 4
    .line 5
    iget v0, p0, Lcom/tencent/liteav/videobase/b/d;->j:I

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/liteav/videobase/utils/OpenGlUtils;->deleteTexture(I)V

    .line 9
    const/4 v0, -0x1

    .line 10
    .line 11
    iput v0, p0, Lcom/tencent/liteav/videobase/b/d;->j:I

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
