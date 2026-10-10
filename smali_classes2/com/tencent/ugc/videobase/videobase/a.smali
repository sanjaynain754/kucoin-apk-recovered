.class final Lcom/tencent/ugc/videobase/videobase/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/ugc/videobase/videobase/a$a;
    }
.end annotation


# static fields
.field static final a:[Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;


# instance fields
.field final b:Ljava/nio/FloatBuffer;

.field final c:Ljava/nio/FloatBuffer;

.field final d:Lcom/tencent/ugc/videobase/videobase/ConvertParams;

.field final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;",
            "Ljava/util/List<",
            "Lcom/tencent/ugc/videobase/videobase/a$a;",
            ">;>;"
        }
    .end annotation
.end field

.field final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;",
            "Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;",
            ">;"
        }
    .end annotation
.end field

.field g:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

.field h:Z

.field i:Lcom/tencent/ugc/videobase/frame/PixelFramePool;

.field j:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->a:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    .line 3
    .line 4
    sget-object v1, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->c:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    .line 5
    .line 6
    sget-object v2, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->b:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    .line 7
    .line 8
    .line 9
    filled-new-array {v0, v1, v2}, [Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    sput-object v0, Lcom/tencent/ugc/videobase/videobase/a;->a:[Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    .line 13
    return-void
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
.end method

.method public constructor <init>(Lcom/tencent/ugc/videobase/videobase/ConvertParams;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->k:I

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->h:Z

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->createNormalCubeVerticesBuffer()Ljava/nio/FloatBuffer;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    iput-object v1, p0, Lcom/tencent/ugc/videobase/videobase/a;->b:Ljava/nio/FloatBuffer;

    .line 16
    .line 17
    sget-object v1, Lcom/tencent/liteav/base/util/l;->a:Lcom/tencent/liteav/base/util/l;

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v0, v0}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->createTextureCoordsBuffer(Lcom/tencent/liteav/base/util/l;ZZ)Ljava/nio/FloatBuffer;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->c:Ljava/nio/FloatBuffer;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/tencent/ugc/videobase/videobase/a;->d:Lcom/tencent/ugc/videobase/videobase/ConvertParams;

    .line 26
    .line 27
    new-instance p1, Ljava/util/HashMap;

    .line 28
    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 31
    .line 32
    iput-object p1, p0, Lcom/tencent/ugc/videobase/videobase/a;->e:Ljava/util/Map;

    .line 33
    .line 34
    new-instance p1, Ljava/util/HashMap;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 38
    .line 39
    iput-object p1, p0, Lcom/tencent/ugc/videobase/videobase/a;->f:Ljava/util/Map;

    .line 40
    return-void
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
.end method

.method private a(Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;Lcom/tencent/ugc/videobase/frame/GLTexture;Ljava/lang/Object;)V
    .locals 4

    .line 43
    iget-object v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->d:Lcom/tencent/ugc/videobase/videobase/ConvertParams;

    iget v1, v0, Lcom/tencent/ugc/videobase/videobase/ConvertParams;->width:I

    .line 44
    iget v0, v0, Lcom/tencent/ugc/videobase/videobase/ConvertParams;->height:I

    .line 45
    iget v2, p0, Lcom/tencent/ugc/videobase/videobase/a;->k:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    .line 46
    invoke-static {}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->generateFrameBufferId()I

    move-result v2

    iput v2, p0, Lcom/tencent/ugc/videobase/videobase/a;->k:I

    .line 47
    :cond_0
    invoke-virtual {p2}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getId()I

    move-result p2

    iget v2, p0, Lcom/tencent/ugc/videobase/videobase/a;->k:I

    invoke-static {p2, v2}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->attachTextureToFrameBuffer(II)V

    const p2, 0x8d40

    .line 48
    iget v2, p0, Lcom/tencent/ugc/videobase/videobase/a;->k:I

    invoke-static {p2, v2}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 49
    sget-object p2, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->f:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    const/4 v2, 0x0

    if-ne p1, p2, :cond_1

    .line 50
    invoke-static {v2, v2, v1, v0, p3}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->readPixels(IIIILjava/lang/Object;)V

    .line 51
    iget p1, p0, Lcom/tencent/ugc/videobase/videobase/a;->k:I

    invoke-static {p1}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->detachTextureFromFrameBuffer(I)V

    return-void

    .line 52
    :cond_1
    rem-int/lit8 p1, v0, 0x10

    if-nez p1, :cond_2

    mul-int/lit8 v0, v0, 0x3

    .line 53
    div-int/lit8 v0, v0, 0x8

    .line 54
    invoke-static {v2, v2, v1, v0, p3}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->readPixels(IIIILjava/lang/Object;)V

    goto :goto_0

    .line 55
    :cond_2
    instance-of p1, p3, Ljava/nio/ByteBuffer;

    if-eqz p1, :cond_3

    .line 56
    check-cast p3, Ljava/nio/ByteBuffer;

    invoke-static {v1, v0, p3}, Lcom/tencent/ugc/videobase/utils/YUVReadTools;->nativeReadYUVPlanesForByteBuffer(IILjava/nio/ByteBuffer;)V

    goto :goto_0

    .line 57
    :cond_3
    check-cast p3, [B

    invoke-static {v1, v0, p3}, Lcom/tencent/ugc/videobase/utils/YUVReadTools;->nativeReadYUVPlanesForByteArray(II[B)V

    .line 58
    :goto_0
    iget p1, p0, Lcom/tencent/ugc/videobase/videobase/a;->k:I

    invoke-static {p1}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->detachTextureFromFrameBuffer(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;Lcom/tencent/liteav/videobase/base/GLConstants$a;)I
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 67
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/ugc/videobase/videobase/a$a;

    .line 68
    iget-object v1, v1, Lcom/tencent/ugc/videobase/videobase/a$a;->a:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    if-ne v1, p2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final a(JLcom/tencent/ugc/videobase/frame/GLTexture;Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;)Lcom/tencent/ugc/videobase/frame/PixelFrame;
    .locals 9

    .line 18
    sget-object v0, Lcom/tencent/liteav/videobase/base/GLConstants$a;->a:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    invoke-virtual {p0, p4, v0}, Lcom/tencent/ugc/videobase/videobase/a;->a(Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;Lcom/tencent/liteav/videobase/base/GLConstants$a;)I

    move-result v5

    .line 19
    sget-object v1, Lcom/tencent/liteav/videobase/base/GLConstants$a;->d:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    invoke-virtual {p0, p4, v1}, Lcom/tencent/ugc/videobase/videobase/a;->a(Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;Lcom/tencent/liteav/videobase/base/GLConstants$a;)I

    move-result v6

    const/4 v2, 0x0

    if-nez v5, :cond_0

    if-nez v6, :cond_0

    return-object v2

    :cond_0
    if-eqz v5, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 20
    :goto_0
    iget-object v4, p0, Lcom/tencent/ugc/videobase/videobase/a;->i:Lcom/tencent/ugc/videobase/frame/PixelFramePool;

    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getWidth()I

    move-result v7

    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getHeight()I

    move-result v8

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    invoke-virtual {v4, v7, v8, v0, p4}, Lcom/tencent/ugc/videobase/frame/PixelFramePool;->obtain(IILcom/tencent/liteav/videobase/base/GLConstants$a;Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    move-result-object v4

    .line 21
    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getColorRange()Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    move-result-object v0

    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getColorSpace()Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setColorFormat(Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    .line 22
    invoke-virtual {v4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->isFrameDataValid()Z

    move-result v0

    if-nez v0, :cond_3

    .line 23
    invoke-virtual {v4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    return-object v2

    :cond_3
    if-eqz v3, :cond_4

    .line 24
    invoke-virtual {v4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getData()[B

    move-result-object v0

    .line 25
    :goto_2
    invoke-direct {p0, p4, p3, v0}, Lcom/tencent/ugc/videobase/videobase/a;->a(Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;Lcom/tencent/ugc/videobase/frame/GLTexture;Ljava/lang/Object;)V

    .line 26
    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/GLTexture;->getMetaData()Lcom/tencent/ugc/videobase/frame/FrameMetaData;

    move-result-object p3

    invoke-virtual {v4, p3}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setMetaData(Lcom/tencent/ugc/videobase/frame/FrameMetaData;)V

    .line 27
    invoke-virtual {p0, v4, p1, p2}, Lcom/tencent/ugc/videobase/videobase/a;->a(Lcom/tencent/ugc/videobase/frame/PixelFrame;J)V

    move-object v1, p0

    move-wide v2, p1

    .line 28
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/ugc/videobase/videobase/a;->a(JLcom/tencent/ugc/videobase/frame/PixelFrame;II)V

    return-object v4
.end method

.method public final a()V
    .locals 2

    .line 6
    iget-object v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;

    .line 7
    invoke-virtual {v1}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->uninitialize()V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 9
    iget-object v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->g:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;->uninitialize()V

    .line 11
    iput-object v1, p0, Lcom/tencent/ugc/videobase/videobase/a;->g:Lcom/tencent/ugc/videobase/frame/PixelFrameRenderer;

    .line 12
    :cond_1
    iget-object v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->i:Lcom/tencent/ugc/videobase/frame/PixelFramePool;

    if-eqz v0, :cond_2

    .line 13
    invoke-virtual {v0}, Lcom/tencent/ugc/videobase/frame/FramePool;->destroy()V

    .line 14
    iput-object v1, p0, Lcom/tencent/ugc/videobase/videobase/a;->i:Lcom/tencent/ugc/videobase/frame/PixelFramePool;

    .line 15
    :cond_2
    iget v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->k:I

    invoke-static {v0}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->deleteFrameBuffer(I)V

    const/4 v0, -0x1

    .line 16
    iput v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->k:I

    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->h:Z

    return-void
.end method

.method public final a(ILcom/tencent/ugc/videobase/videobase/FrameConverter$FrameConvertListener;)V
    .locals 5

    .line 69
    iget-object v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 70
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/ugc/videobase/videobase/a$a;

    .line 71
    iget v4, v3, Lcom/tencent/ugc/videobase/videobase/a$a;->b:I

    if-ne v4, p1, :cond_1

    iget-object v4, v3, Lcom/tencent/ugc/videobase/videobase/a$a;->c:Lcom/tencent/ugc/videobase/videobase/FrameConverter$FrameConvertListener;

    if-ne v4, p2, :cond_1

    .line 72
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 73
    :cond_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 74
    iget-object p1, p0, Lcom/tencent/ugc/videobase/videobase/a;->e:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public final a(JLcom/tencent/ugc/videobase/frame/PixelFrame;II)V
    .locals 5

    .line 29
    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    move-result-object v0

    sget-object v1, Lcom/tencent/liteav/videobase/base/GLConstants$a;->a:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    if-eqz p5, :cond_0

    move p5, v3

    goto :goto_0

    :cond_0
    move p5, v2

    .line 30
    :goto_0
    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    move-result-object v0

    sget-object v4, Lcom/tencent/liteav/videobase/base/GLConstants$a;->d:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    if-ne v0, v4, :cond_1

    if-eqz p4, :cond_1

    move v2, v3

    :cond_1
    if-nez p5, :cond_2

    if-nez v2, :cond_2

    return-void

    .line 31
    :cond_2
    iget-object p4, p0, Lcom/tencent/ugc/videobase/videobase/a;->i:Lcom/tencent/ugc/videobase/frame/PixelFramePool;

    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getWidth()I

    move-result v0

    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getHeight()I

    move-result v2

    if-eqz p5, :cond_3

    move-object v1, v4

    .line 32
    :cond_3
    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getPixelFormatType()Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    move-result-object v3

    .line 33
    invoke-virtual {p4, v0, v2, v1, v3}, Lcom/tencent/ugc/videobase/frame/PixelFramePool;->obtain(IILcom/tencent/liteav/videobase/base/GLConstants$a;Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;)Lcom/tencent/ugc/videobase/frame/PixelFrame;

    move-result-object p4

    .line 34
    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getColorRange()Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;

    move-result-object v0

    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getColorSpace()Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;

    move-result-object v1

    invoke-virtual {p4, v0, v1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setColorFormat(Lcom/tencent/liteav/videobase/base/GLConstants$ColorRange;Lcom/tencent/liteav/videobase/base/GLConstants$ColorSpace;)V

    .line 35
    invoke-virtual {p4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->isFrameDataValid()Z

    move-result v0

    if-nez v0, :cond_4

    .line 36
    invoke-virtual {p4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    return-void

    :cond_4
    if-eqz p5, :cond_5

    .line 37
    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p3

    invoke-virtual {p4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getData()[B

    move-result-object p5

    invoke-virtual {p4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getData()[B

    move-result-object v0

    array-length v0, v0

    .line 38
    invoke-static {p3, p5, v0}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->nativeCopyDataFromByteBufferToByteArray(Ljava/nio/ByteBuffer;[BI)V

    goto :goto_1

    .line 39
    :cond_5
    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getData()[B

    move-result-object p5

    invoke-virtual {p4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p3}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getData()[B

    move-result-object p3

    array-length p3, p3

    .line 40
    invoke-static {p5, v0, p3}, Lcom/tencent/ugc/videobase/utils/OpenGlUtils;->nativeCopyDataFromByteArrayToByteBuffer([BLjava/nio/ByteBuffer;I)V

    .line 41
    :goto_1
    invoke-virtual {p0, p4, p1, p2}, Lcom/tencent/ugc/videobase/videobase/a;->a(Lcom/tencent/ugc/videobase/frame/PixelFrame;J)V

    .line 42
    invoke-virtual {p4}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->release()V

    return-void
.end method

.method public final a(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->h:Z

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->h:Z

    .line 3
    new-instance v0, Lcom/tencent/ugc/videobase/frame/PixelFramePool;

    invoke-direct {v0}, Lcom/tencent/ugc/videobase/frame/PixelFramePool;-><init>()V

    iput-object v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->i:Lcom/tencent/ugc/videobase/frame/PixelFramePool;

    .line 4
    iput-object p1, p0, Lcom/tencent/ugc/videobase/videobase/a;->j:Lcom/tencent/ugc/videobase/frame/GLTexturePool;

    return-void

    .line 5
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SameParamsConverter mIsInitialized "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/tencent/ugc/videobase/videobase/a;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " , texturePool "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SameParamsConverter"

    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/tencent/ugc/videobase/frame/PixelFrame;J)V
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/tencent/ugc/videobase/videobase/a;->e:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getPixelFormatType()Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_2

    .line 60
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 61
    :cond_0
    invoke-virtual {p1, p2, p3}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->setTimestamp(J)V

    .line 62
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 63
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/tencent/ugc/videobase/videobase/a$a;

    .line 64
    iget-object v0, p3, Lcom/tencent/ugc/videobase/videobase/a$a;->a:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    invoke-virtual {p1}, Lcom/tencent/ugc/videobase/frame/PixelFrame;->getPixelBufferType()Lcom/tencent/liteav/videobase/base/GLConstants$a;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 65
    iget-object v0, p3, Lcom/tencent/ugc/videobase/videobase/a$a;->c:Lcom/tencent/ugc/videobase/videobase/FrameConverter$FrameConvertListener;

    iget p3, p3, Lcom/tencent/ugc/videobase/videobase/a$a;->b:I

    invoke-interface {v0, p3, p1}, Lcom/tencent/ugc/videobase/videobase/FrameConverter$FrameConvertListener;->onFrameConverted(ILcom/tencent/ugc/videobase/frame/PixelFrame;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
