.class public Lcom/facebook/imagepipeline/producers/l0;
.super Ljava/lang/Object;
.source "LocalVideoThumbnailProducer.java"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/v0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/imagepipeline/producers/v0<",
        "La4/a<",
        "Lx5/e;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Landroid/content/ContentResolver;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/l0;->a:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/l0;->b:Landroid/content/ContentResolver;

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
.end method

.method public static bridge synthetic c(Lcom/facebook/imagepipeline/producers/l0;)Landroid/content/ContentResolver;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/l0;->b:Landroid/content/ContentResolver;

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

.method public static bridge synthetic d(Lcom/facebook/imagepipeline/producers/l0;Lcom/facebook/imagepipeline/request/ImageRequest;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/l0;->i(Lcom/facebook/imagepipeline/request/ImageRequest;)Ljava/lang/String;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static bridge synthetic e(Lcom/facebook/imagepipeline/request/ImageRequest;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/facebook/imagepipeline/producers/l0;->g(Lcom/facebook/imagepipeline/request/ImageRequest;)I

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static bridge synthetic f(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/facebook/imagepipeline/producers/l0;->h(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static g(Lcom/facebook/imagepipeline/request/ImageRequest;)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/request/ImageRequest;->getPreferredWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x60

    .line 7
    .line 8
    if-gt v0, v1, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/request/ImageRequest;->getPreferredHeight()I

    .line 12
    move-result p0

    .line 13
    .line 14
    if-le p0, v1, :cond_0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x3

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static h(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    const-string/jumbo v0, "r"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    new-instance p1, Landroid/media/MediaMetadataRetriever;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;)V

    .line 23
    .line 24
    const-wide/16 v0, -0x1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(J)Landroid/graphics/Bitmap;

    .line 28
    move-result-object p0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    return-object p0

    .line 30
    :catch_0
    const/4 p0, 0x0

    .line 31
    return-object p0
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

.method private i(Lcom/facebook/imagepipeline/request/ImageRequest;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUri()Landroid/net/Uri;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/l0;->b:Landroid/content/ContentResolver;

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p1}, Ld4/d;->e(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    return-object p1
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


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m<",
            "La4/a<",
            "Lx5/e;",
            ">;>;",
            "Lcom/facebook/imagepipeline/producers/w0;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->g()Lcom/facebook/imagepipeline/producers/y0;

    .line 4
    move-result-object v3

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->h()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 8
    move-result-object v8

    .line 9
    .line 10
    const-string v0, "local"

    .line 11
    .line 12
    .line 13
    const-string/jumbo v1, "video"

    .line 14
    .line 15
    .line 16
    invoke-interface {p2, v0, v1}, Lcom/facebook/imagepipeline/producers/w0;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    new-instance v0, Lcom/facebook/imagepipeline/producers/l0$a;

    .line 19
    .line 20
    const-string v5, "VideoThumbnailProducer"

    .line 21
    move-object v6, v3

    .line 22
    move-object v7, p2

    .line 23
    move-object v1, p0

    .line 24
    move-object v2, p1

    .line 25
    move-object v4, p2

    .line 26
    .line 27
    .line 28
    invoke-direct/range {v0 .. v8}, Lcom/facebook/imagepipeline/producers/l0$a;-><init>(Lcom/facebook/imagepipeline/producers/l0;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/y0;Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/y0;Lcom/facebook/imagepipeline/producers/w0;Lcom/facebook/imagepipeline/request/ImageRequest;)V

    .line 29
    .line 30
    new-instance p1, Lcom/facebook/imagepipeline/producers/l0$b;

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, p0, v0}, Lcom/facebook/imagepipeline/producers/l0$b;-><init>(Lcom/facebook/imagepipeline/producers/l0;Lcom/facebook/imagepipeline/producers/d1;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v4, p1}, Lcom/facebook/imagepipeline/producers/w0;->i(Lcom/facebook/imagepipeline/producers/x0;)V

    .line 37
    .line 38
    iget-object p1, v1, Lcom/facebook/imagepipeline/producers/l0;->a:Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 42
    return-void
.end method
