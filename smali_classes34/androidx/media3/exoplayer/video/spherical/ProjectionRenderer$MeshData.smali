.class Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;
.super Ljava/lang/Object;
.source "ProjectionRenderer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MeshData"
.end annotation


# instance fields
.field private final drawMode:I

.field private final textureBuffer:Ljava/nio/FloatBuffer;

.field private final vertexBuffer:Ljava/nio/FloatBuffer;

.field private final vertexCount:I


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/video/spherical/Projection$SubMesh;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/media3/exoplayer/video/spherical/Projection$SubMesh;->getVertexCount()I

    .line 7
    move-result v0

    .line 8
    .line 9
    iput v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;->vertexCount:I

    .line 10
    .line 11
    iget-object v0, p1, Landroidx/media3/exoplayer/video/spherical/Projection$SubMesh;->vertices:[F

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Landroidx/media3/common/util/GlUtil;->createBuffer([F)Ljava/nio/FloatBuffer;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iput-object v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;->vertexBuffer:Ljava/nio/FloatBuffer;

    .line 18
    .line 19
    iget-object v0, p1, Landroidx/media3/exoplayer/video/spherical/Projection$SubMesh;->textureCoords:[F

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Landroidx/media3/common/util/GlUtil;->createBuffer([F)Ljava/nio/FloatBuffer;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;->textureBuffer:Ljava/nio/FloatBuffer;

    .line 26
    .line 27
    iget p1, p1, Landroidx/media3/exoplayer/video/spherical/Projection$SubMesh;->mode:I

    .line 28
    const/4 v0, 0x1

    .line 29
    .line 30
    if-eq p1, v0, :cond_1

    .line 31
    const/4 v0, 0x2

    .line 32
    .line 33
    if-eq p1, v0, :cond_0

    .line 34
    const/4 p1, 0x4

    .line 35
    .line 36
    iput p1, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;->drawMode:I

    .line 37
    return-void

    .line 38
    :cond_0
    const/4 p1, 0x6

    .line 39
    .line 40
    iput p1, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;->drawMode:I

    .line 41
    return-void

    .line 42
    :cond_1
    const/4 p1, 0x5

    .line 43
    .line 44
    iput p1, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;->drawMode:I

    .line 45
    return-void
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
.end method

.method public static synthetic access$000(Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;)Ljava/nio/FloatBuffer;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;->vertexBuffer:Ljava/nio/FloatBuffer;

    .line 3
    return-object p0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic access$100(Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;)Ljava/nio/FloatBuffer;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;->textureBuffer:Ljava/nio/FloatBuffer;

    .line 3
    return-object p0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic access$200(Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;->drawMode:I

    .line 3
    return p0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic access$300(Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Landroidx/media3/exoplayer/video/spherical/ProjectionRenderer$MeshData;->vertexCount:I

    .line 3
    return p0
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
