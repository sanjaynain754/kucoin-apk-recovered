.class public Lai/advance/common/recorder_old/VideoRecorder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    api = 0x12
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lai/advance/common/recorder_old/VideoRecorder$a;,
        Lai/advance/common/recorder_old/VideoRecorder$MediaType;
    }
.end annotation


# instance fields
.field public A:I

.field public B:J

.field public C:I

.field public D:J

.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Ljava/io/File;

.field public h:[B

.field public i:Lai/advance/common/recorder_old/VideoRecorder$a;

.field public j:Landroid/media/MediaCodec;

.field public k:Landroid/media/MediaCodec;

.field public l:J

.field public m:Landroid/media/MediaMuxer;

.field public final n:Ljava/lang/Object;

.field public final o:Ljava/lang/Object;

.field public p:Ljava/util/concurrent/CountDownLatch;

.field public q:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Li/w;",
            ">;"
        }
    .end annotation
.end field

.field public r:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "[B>;"
        }
    .end annotation
.end field

.field public volatile s:Z

.field public t:I

.field public volatile u:Z

.field public v:Ljava/lang/Integer;

.field public w:Ljava/lang/Integer;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const v0, 0x30d40

    .line 7
    .line 8
    iput v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->a:I

    .line 9
    .line 10
    const/16 v0, 0x1e

    .line 11
    .line 12
    iput v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->b:I

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    iput v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->y:I

    .line 16
    .line 17
    const/16 v0, 0xa

    .line 18
    .line 19
    iput v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->z:I

    .line 20
    .line 21
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 25
    .line 26
    iput-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 27
    .line 28
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 32
    .line 33
    iput-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->r:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 34
    .line 35
    new-instance v0, Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    iput-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->n:Ljava/lang/Object;

    .line 41
    .line 42
    new-instance v0, Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    iput-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->o:Ljava/lang/Object;

    .line 48
    return-void
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
.end method

.method public static synthetic a(Lai/advance/common/recorder_old/VideoRecorder;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->l:J

    .line 3
    return-wide v0
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
    .line 24
.end method

.method public static synthetic b(Lai/advance/common/recorder_old/VideoRecorder;J)J
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->l:J

    .line 3
    return-wide p1
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
.end method


# virtual methods
.method public final c(Lai/advance/common/recorder_old/VideoRecorder$MediaType;I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lai/advance/common/recorder_old/VideoRecorder$MediaType;->VideoType:Lai/advance/common/recorder_old/VideoRecorder$MediaType;

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->j:Landroid/media/MediaCodec;

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p1, p2}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    .line 13
    :cond_0
    iget-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->k:Landroid/media/MediaCodec;

    .line 14
    goto :goto_0
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
.end method

.method public d()V
    .locals 1

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->j:Landroid/media/MediaCodec;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    :catch_0
    :cond_0
    :try_start_1
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->k:Landroid/media/MediaCodec;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 15
    .line 16
    :catch_1
    :cond_1
    :try_start_2
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->m:Landroid/media/MediaMuxer;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/media/MediaMuxer;->stop()V

    .line 22
    .line 23
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->m:Landroid/media/MediaMuxer;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/media/MediaMuxer;->release()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 27
    .line 28
    :catch_2
    :cond_2
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 32
    .line 33
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->r:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 37
    return-void
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
.end method

.method public final e(Lai/advance/common/recorder_old/VideoRecorder$MediaType;Landroid/media/MediaFormat;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lai/advance/common/recorder_old/VideoRecorder$MediaType;->VideoType:Lai/advance/common/recorder_old/VideoRecorder$MediaType;

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->m:Landroid/media/MediaMuxer;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    .line 10
    move-result p1

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    iput-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->v:Ljava/lang/Integer;

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    sget-object v0, Lai/advance/common/recorder_old/VideoRecorder$MediaType;->AudioType:Lai/advance/common/recorder_old/VideoRecorder$MediaType;

    .line 20
    .line 21
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->m:Landroid/media/MediaMuxer;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    .line 27
    move-result p1

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    iput-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->w:Ljava/lang/Integer;

    .line 34
    .line 35
    :cond_1
    :goto_0
    iget-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->v:Ljava/lang/Integer;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->m:Landroid/media/MediaMuxer;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/media/MediaMuxer;->start()V

    .line 43
    :cond_2
    return-void
    .line 44
    .line 45
.end method

.method public final f(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
    .line 24
.end method

.method public final g(IILi/w;)[B
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->h:[B

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    mul-int v0, p1, p2

    .line 7
    .line 8
    mul-int/lit8 v0, v0, 0x3

    .line 9
    .line 10
    div-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    iput-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->h:[B

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p3}, Li/w;->b()[B

    .line 18
    move-result-object p3

    .line 19
    mul-int/2addr p1, p2

    .line 20
    .line 21
    if-ltz p1, :cond_1

    .line 22
    .line 23
    iget-object p2, p0, Lai/advance/common/recorder_old/VideoRecorder;->h:[B

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static {p3, v0, p2, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 28
    .line 29
    :cond_1
    div-int/lit8 p2, p1, 0x4

    .line 30
    add-int/2addr p2, p1

    .line 31
    move v0, p1

    .line 32
    move v1, v0

    .line 33
    .line 34
    :goto_0
    mul-int/lit8 v2, p1, 0x3

    .line 35
    .line 36
    div-int/lit8 v2, v2, 0x2

    .line 37
    .line 38
    if-ge v0, v2, :cond_2

    .line 39
    .line 40
    iget-object v2, p0, Lai/advance/common/recorder_old/VideoRecorder;->h:[B

    .line 41
    .line 42
    aget-byte v3, p3, v0

    .line 43
    .line 44
    aput-byte v3, v2, p2

    .line 45
    .line 46
    add-int/lit8 v3, v0, 0x1

    .line 47
    .line 48
    aget-byte v3, p3, v3

    .line 49
    .line 50
    aput-byte v3, v2, v1

    .line 51
    .line 52
    add-int/lit8 p2, p2, 0x1

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    add-int/lit8 v0, v0, 0x2

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_2
    iget-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->h:[B

    .line 60
    return-object p1
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

.method public final h(Lai/advance/common/recorder_old/VideoRecorder$MediaType;I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lai/advance/common/recorder_old/VideoRecorder$MediaType;->VideoType:Lai/advance/common/recorder_old/VideoRecorder$MediaType;

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->j:Landroid/media/MediaCodec;

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p1, p2}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    .line 13
    :cond_0
    iget-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->k:Landroid/media/MediaCodec;

    .line 14
    goto :goto_0
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
.end method

.method public final i(IILi/w;)[B
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->h:[B

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    mul-int v0, p1, p2

    .line 7
    .line 8
    mul-int/lit8 v0, v0, 0x3

    .line 9
    .line 10
    div-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    iput-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->h:[B

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p3}, Li/w;->b()[B

    .line 18
    move-result-object p3

    .line 19
    mul-int/2addr p1, p2

    .line 20
    .line 21
    if-ltz p1, :cond_1

    .line 22
    .line 23
    iget-object p2, p0, Lai/advance/common/recorder_old/VideoRecorder;->h:[B

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static {p3, v0, p2, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 28
    :cond_1
    move p2, p1

    .line 29
    .line 30
    :goto_0
    mul-int/lit8 v0, p1, 0x3

    .line 31
    .line 32
    div-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    if-ge p2, v0, :cond_3

    .line 35
    .line 36
    add-int/lit8 v0, p2, 0x1

    .line 37
    .line 38
    rem-int/lit8 v1, v0, 0x2

    .line 39
    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    iget-object v1, p0, Lai/advance/common/recorder_old/VideoRecorder;->h:[B

    .line 43
    .line 44
    add-int/lit8 v2, p2, -0x1

    .line 45
    .line 46
    aget-byte v3, p3, v2

    .line 47
    .line 48
    aput-byte v3, v1, p2

    .line 49
    .line 50
    aget-byte p2, p3, p2

    .line 51
    .line 52
    aput-byte p2, v1, v2

    .line 53
    :cond_2
    move p2, v0

    .line 54
    goto :goto_0

    .line 55
    .line 56
    :cond_3
    iget-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->h:[B

    .line 57
    return-object p1
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

.method public final j(IILi/w;)[B
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->x:I

    .line 3
    .line 4
    const/16 v1, 0x15

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, p2, p3}, Lai/advance/common/recorder_old/VideoRecorder;->i(IILi/w;)[B

    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lai/advance/common/recorder_old/VideoRecorder;->g(IILi/w;)[B

    .line 15
    move-result-object p1

    .line 16
    return-object p1
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

.method public k()V
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    iget-boolean v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->s:Z

    .line 6
    .line 7
    if-eqz v0, :cond_c

    .line 8
    .line 9
    iget-boolean v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->u:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_c

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    check-cast v0, Li/w;

    .line 28
    const/4 v1, 0x1

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object v2, p0, Lai/advance/common/recorder_old/VideoRecorder;->n:Ljava/lang/Object;

    .line 33
    monitor-enter v2

    .line 34
    .line 35
    :try_start_0
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 39
    .line 40
    iput-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->p:Ljava/util/concurrent/CountDownLatch;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    :try_start_1
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto :goto_1

    .line 47
    :catch_0
    move-exception v0

    .line 48
    .line 49
    .line 50
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 51
    .line 52
    :goto_0
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    check-cast v0, Li/w;

    .line 59
    monitor-exit v2

    .line 60
    goto :goto_2

    .line 61
    :goto_1
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    throw v0

    .line 63
    .line 64
    :cond_1
    :goto_2
    if-nez v0, :cond_2

    .line 65
    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :cond_2
    iget v2, p0, Lai/advance/common/recorder_old/VideoRecorder;->C:I

    .line 69
    .line 70
    if-nez v2, :cond_3

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Li/w;->a()J

    .line 74
    move-result-wide v2

    .line 75
    .line 76
    iput-wide v2, p0, Lai/advance/common/recorder_old/VideoRecorder;->B:J

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-virtual {v0}, Li/w;->a()J

    .line 80
    move-result-wide v2

    .line 81
    .line 82
    iget-wide v4, p0, Lai/advance/common/recorder_old/VideoRecorder;->B:J

    .line 83
    sub-long/2addr v2, v4

    .line 84
    long-to-float v2, v2

    .line 85
    .line 86
    iget-wide v3, p0, Lai/advance/common/recorder_old/VideoRecorder;->D:J

    .line 87
    long-to-float v3, v3

    .line 88
    .line 89
    cmpg-float v2, v2, v3

    .line 90
    .line 91
    if-gez v2, :cond_4

    .line 92
    .line 93
    goto/16 :goto_3

    .line 94
    .line 95
    .line 96
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 97
    .line 98
    .line 99
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 100
    .line 101
    iget v2, p0, Lai/advance/common/recorder_old/VideoRecorder;->d:I

    .line 102
    .line 103
    iget v3, p0, Lai/advance/common/recorder_old/VideoRecorder;->e:I

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v2, v3, v0}, Lai/advance/common/recorder_old/VideoRecorder;->j(IILi/w;)[B

    .line 107
    move-result-object v2

    .line 108
    .line 109
    .line 110
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 111
    .line 112
    iget-object v3, p0, Lai/advance/common/recorder_old/VideoRecorder;->j:Landroid/media/MediaCodec;

    .line 113
    .line 114
    .line 115
    const-wide/32 v4, 0x30d40

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v4, v5}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 119
    move-result v7

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Li/w;->a()J

    .line 123
    move-result-wide v8

    .line 124
    .line 125
    iget-wide v10, p0, Lai/advance/common/recorder_old/VideoRecorder;->B:J

    .line 126
    sub-long/2addr v8, v10

    .line 127
    .line 128
    const-wide/16 v10, 0x3e8

    .line 129
    mul-long/2addr v10, v8

    .line 130
    .line 131
    const-wide/16 v8, 0x0

    .line 132
    .line 133
    cmp-long v3, v10, v8

    .line 134
    .line 135
    if-gez v3, :cond_5

    .line 136
    .line 137
    goto/16 :goto_3

    .line 138
    .line 139
    :cond_5
    if-ltz v7, :cond_6

    .line 140
    .line 141
    sget-object v3, Lai/advance/common/recorder_old/VideoRecorder$MediaType;->VideoType:Lai/advance/common/recorder_old/VideoRecorder$MediaType;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v3, v7}, Lai/advance/common/recorder_old/VideoRecorder;->c(Lai/advance/common/recorder_old/VideoRecorder$MediaType;I)Ljava/nio/ByteBuffer;

    .line 145
    move-result-object v3

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 152
    .line 153
    iget-object v6, p0, Lai/advance/common/recorder_old/VideoRecorder;->j:Landroid/media/MediaCodec;

    .line 154
    array-length v9, v2

    .line 155
    const/4 v8, 0x0

    .line 156
    const/4 v12, 0x0

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v6 .. v12}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 160
    .line 161
    iget v2, p0, Lai/advance/common/recorder_old/VideoRecorder;->t:I

    .line 162
    add-int/2addr v2, v1

    .line 163
    .line 164
    iput v2, p0, Lai/advance/common/recorder_old/VideoRecorder;->t:I

    .line 165
    .line 166
    :cond_6
    new-instance v2, Landroid/media/MediaCodec$BufferInfo;

    .line 167
    .line 168
    .line 169
    invoke-direct {v2}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 170
    .line 171
    iget-object v3, p0, Lai/advance/common/recorder_old/VideoRecorder;->j:Landroid/media/MediaCodec;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v2, v4, v5}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 175
    move-result v3

    .line 176
    const/4 v4, -0x1

    .line 177
    .line 178
    if-ne v3, v4, :cond_7

    .line 179
    goto :goto_3

    .line 180
    :cond_7
    const/4 v4, -0x2

    .line 181
    .line 182
    if-ne v3, v4, :cond_8

    .line 183
    .line 184
    sget-object v0, Lai/advance/common/recorder_old/VideoRecorder$MediaType;->VideoType:Lai/advance/common/recorder_old/VideoRecorder$MediaType;

    .line 185
    .line 186
    iget-object v1, p0, Lai/advance/common/recorder_old/VideoRecorder;->j:Landroid/media/MediaCodec;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 190
    move-result-object v1

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, v0, v1}, Lai/advance/common/recorder_old/VideoRecorder;->e(Lai/advance/common/recorder_old/VideoRecorder$MediaType;Landroid/media/MediaFormat;)V

    .line 194
    return-void

    .line 195
    .line 196
    :cond_8
    if-gez v3, :cond_9

    .line 197
    goto :goto_3

    .line 198
    .line 199
    :cond_9
    sget-object v4, Lai/advance/common/recorder_old/VideoRecorder$MediaType;->VideoType:Lai/advance/common/recorder_old/VideoRecorder$MediaType;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0, v4, v3}, Lai/advance/common/recorder_old/VideoRecorder;->h(Lai/advance/common/recorder_old/VideoRecorder$MediaType;I)Ljava/nio/ByteBuffer;

    .line 203
    move-result-object v4

    .line 204
    .line 205
    if-nez v4, :cond_a

    .line 206
    goto :goto_3

    .line 207
    .line 208
    :cond_a
    iget v5, v2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 209
    .line 210
    .line 211
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 212
    .line 213
    iget v5, v2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 214
    .line 215
    iget v6, v2, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 216
    add-int/2addr v5, v6

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 220
    .line 221
    iget-object v5, p0, Lai/advance/common/recorder_old/VideoRecorder;->v:Ljava/lang/Integer;

    .line 222
    .line 223
    if-eqz v5, :cond_b

    .line 224
    .line 225
    .line 226
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 227
    .line 228
    iget-object v5, p0, Lai/advance/common/recorder_old/VideoRecorder;->m:Landroid/media/MediaMuxer;

    .line 229
    .line 230
    iget-object v6, p0, Lai/advance/common/recorder_old/VideoRecorder;->v:Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 234
    move-result v6

    .line 235
    .line 236
    .line 237
    invoke-virtual {v5, v6, v4, v2}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 238
    .line 239
    :cond_b
    iget-object v2, p0, Lai/advance/common/recorder_old/VideoRecorder;->j:Landroid/media/MediaCodec;

    .line 240
    const/4 v4, 0x0

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v3, v4}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0}, Li/w;->a()J

    .line 247
    move-result-wide v2

    .line 248
    .line 249
    iget-wide v4, p0, Lai/advance/common/recorder_old/VideoRecorder;->B:J

    .line 250
    sub-long/2addr v2, v4

    .line 251
    .line 252
    iput-wide v2, p0, Lai/advance/common/recorder_old/VideoRecorder;->D:J

    .line 253
    .line 254
    iget v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->C:I

    .line 255
    add-int/2addr v0, v1

    .line 256
    .line 257
    iput v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->C:I

    .line 258
    :cond_c
    :goto_3
    return-void
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
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
.end method

.method public l()Lorg/json/JSONObject;
    .locals 9

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 11
    .line 12
    iget v2, p0, Lai/advance/common/recorder_old/VideoRecorder;->C:I

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    const-string v3, "encode_frame_count"

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v3, v2}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    iget v2, p0, Lai/advance/common/recorder_old/VideoRecorder;->y:I

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    const-string/jumbo v3, "lost_model_frame_count"

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v3, v2}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    iget v2, p0, Lai/advance/common/recorder_old/VideoRecorder;->z:I

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    const-string v3, "encode_queue_max_size"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v3, v2}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    .line 46
    new-instance v2, Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 50
    .line 51
    iget-object v3, p0, Lai/advance/common/recorder_old/VideoRecorder;->g:Ljava/io/File;

    .line 52
    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 57
    move-result v3

    .line 58
    .line 59
    if-eqz v3, :cond_0

    .line 60
    .line 61
    iget-object v3, p0, Lai/advance/common/recorder_old/VideoRecorder;->g:Ljava/io/File;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 65
    move-result-wide v3

    .line 66
    long-to-float v3, v3

    .line 67
    .line 68
    const/high16 v4, 0x44800000    # 1024.0f

    .line 69
    div-float/2addr v3, v4

    .line 70
    div-float/2addr v3, v4

    .line 71
    .line 72
    .line 73
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 74
    move-result-object v3

    .line 75
    .line 76
    .line 77
    const-string/jumbo v4, "length"

    .line 78
    .line 79
    .line 80
    invoke-static {v2, v4, v3}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 81
    .line 82
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 83
    .line 84
    const/16 v4, 0x1d

    .line 85
    .line 86
    if-lt v3, v4, :cond_0

    .line 87
    .line 88
    :try_start_0
    new-instance v3, Landroid/media/MediaMetadataRetriever;

    .line 89
    .line 90
    .line 91
    invoke-direct {v3}, Landroid/media/MediaMetadataRetriever;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 92
    .line 93
    :try_start_1
    iget-object v4, p0, Lai/advance/common/recorder_old/VideoRecorder;->g:Ljava/io/File;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 97
    move-result-object v4

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v4}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 101
    .line 102
    const/16 v4, 0x12

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 106
    move-result-object v4

    .line 107
    .line 108
    const/16 v5, 0x13

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 112
    move-result-object v5

    .line 113
    .line 114
    const/16 v6, 0x9

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 118
    move-result-object v6

    .line 119
    .line 120
    .line 121
    const-string/jumbo v7, "size"

    .line 122
    .line 123
    new-instance v8, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v4, "*"

    .line 132
    .line 133
    .line 134
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    move-result-object v4

    .line 142
    .line 143
    .line 144
    invoke-static {v2, v7, v4}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 145
    .line 146
    const-string v4, "duration"

    .line 147
    .line 148
    .line 149
    invoke-static {v2, v4, v6}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 150
    .line 151
    const/16 v4, 0x20

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 155
    move-result-object v4

    .line 156
    .line 157
    const-string v5, "frame_count"

    .line 158
    .line 159
    .line 160
    invoke-static {v2, v5, v4}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    .line 162
    .line 163
    :try_start_2
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 164
    goto :goto_1

    .line 165
    :catchall_0
    move-exception v4

    .line 166
    .line 167
    .line 168
    :try_start_3
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 169
    goto :goto_0

    .line 170
    :catchall_1
    move-exception v3

    .line 171
    .line 172
    .line 173
    :try_start_4
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 174
    :goto_0
    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 175
    .line 176
    .line 177
    :catchall_2
    :goto_1
    const-string/jumbo v3, "meta_data"

    .line 178
    .line 179
    .line 180
    invoke-static {v0, v3, v2}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 181
    .line 182
    :cond_0
    const-string v2, "config"

    .line 183
    .line 184
    .line 185
    invoke-static {v0, v2, v1}, Lk/g;->i(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 186
    return-object v0
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
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
.end method

.method public m()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->s:Z

    .line 3
    return v0
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
.end method

.method public n(Li/w;)V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->s:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    .line 16
    if-le v0, v1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 22
    .line 23
    iget v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->y:I

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    iput v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->y:I

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    iget-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->p:Ljava/util/concurrent/CountDownLatch;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    .line 40
    move-result-wide v0

    .line 41
    .line 42
    const-wide/16 v2, 0x0

    .line 43
    .line 44
    cmp-long p1, v0, v2

    .line 45
    .line 46
    if-lez p1, :cond_1

    .line 47
    .line 48
    iget-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->p:Ljava/util/concurrent/CountDownLatch;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 52
    :cond_1
    return-void
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
.end method

.method public o(I)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "\u6bd4\u7279\u7387\uff1a"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lai/advance/common/recorder_old/VideoRecorder;->f(Ljava/lang/String;)V

    .line 22
    .line 23
    iput p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->a:I

    .line 24
    return-void
.end method

.method public p(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->z:I

    .line 3
    return-void
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
    .line 24
.end method

.method public q(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->b:I

    .line 3
    return-void
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
    .line 24
.end method

.method public r(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->A:I

    .line 3
    return-void
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
    .line 24
.end method

.method public s(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->c:I

    .line 3
    return-void
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
    .line 24
.end method

.method public t(IIILjava/io/File;)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->d:I

    .line 3
    .line 4
    iput p2, p0, Lai/advance/common/recorder_old/VideoRecorder;->e:I

    .line 5
    .line 6
    iput p3, p0, Lai/advance/common/recorder_old/VideoRecorder;->f:I

    .line 7
    .line 8
    iput-object p4, p0, Lai/advance/common/recorder_old/VideoRecorder;->g:Ljava/io/File;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p4}, Ljava/io/File;->exists()Z

    .line 12
    move-result p3

    .line 13
    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    iget-object p3, p0, Lai/advance/common/recorder_old/VideoRecorder;->g:Ljava/io/File;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/io/File;->delete()Z

    .line 20
    .line 21
    :cond_0
    :try_start_0
    new-instance p3, Landroid/media/MediaMuxer;

    .line 22
    .line 23
    iget-object p4, p0, Lai/advance/common/recorder_old/VideoRecorder;->g:Ljava/io/File;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 27
    move-result-object p4

    .line 28
    const/4 v0, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct {p3, p4, v0}, Landroid/media/MediaMuxer;-><init>(Ljava/lang/String;I)V

    .line 32
    .line 33
    iput-object p3, p0, Lai/advance/common/recorder_old/VideoRecorder;->m:Landroid/media/MediaMuxer;

    .line 34
    .line 35
    iget p4, p0, Lai/advance/common/recorder_old/VideoRecorder;->c:I

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3, p4}, Landroid/media/MediaMuxer;->setOrientationHint(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    const-string/jumbo p3, "video/avc"

    .line 42
    .line 43
    .line 44
    invoke-static {p3}, Lj/a;->b(Ljava/lang/String;)Landroid/media/MediaCodecInfo;

    .line 45
    move-result-object p4

    .line 46
    .line 47
    if-nez p4, :cond_1

    .line 48
    goto :goto_0

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-static {p4, p3}, Lj/a;->a(Landroid/media/MediaCodecInfo;Ljava/lang/String;)I

    .line 52
    move-result v0

    .line 53
    .line 54
    iput v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->x:I

    .line 55
    .line 56
    .line 57
    :try_start_1
    invoke-virtual {p4}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 58
    move-result-object p4

    .line 59
    .line 60
    .line 61
    invoke-static {p4}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 62
    move-result-object p4

    .line 63
    .line 64
    iput-object p4, p0, Lai/advance/common/recorder_old/VideoRecorder;->j:Landroid/media/MediaCodec;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 65
    .line 66
    .line 67
    invoke-static {p3, p1, p2}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    new-instance p2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string/jumbo p3, "\u653e\u5165\u7684 bitRate:"

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    iget p3, p0, Lai/advance/common/recorder_old/VideoRecorder;->a:I

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    move-result-object p2

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p2}, Lai/advance/common/recorder_old/VideoRecorder;->f(Ljava/lang/String;)V

    .line 92
    .line 93
    iget p2, p0, Lai/advance/common/recorder_old/VideoRecorder;->a:I

    .line 94
    .line 95
    const-string p3, "bitrate"

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p3, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 99
    .line 100
    iget p2, p0, Lai/advance/common/recorder_old/VideoRecorder;->b:I

    .line 101
    .line 102
    const-string p3, "frame-rate"

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, p3, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 106
    .line 107
    iget p2, p0, Lai/advance/common/recorder_old/VideoRecorder;->x:I

    .line 108
    .line 109
    const-string p3, "color-format"

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p3, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 113
    .line 114
    const-string p2, "i-frame-interval"

    .line 115
    const/4 p3, 0x1

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, p2, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 119
    .line 120
    iget-object p2, p0, Lai/advance/common/recorder_old/VideoRecorder;->j:Landroid/media/MediaCodec;

    .line 121
    const/4 p4, 0x0

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, p1, p4, p4, p3}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 125
    .line 126
    iget-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->j:Landroid/media/MediaCodec;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/media/MediaCodec;->start()V

    .line 130
    .line 131
    iput-boolean p3, p0, Lai/advance/common/recorder_old/VideoRecorder;->s:Z

    .line 132
    .line 133
    new-instance p1, Lai/advance/common/recorder_old/VideoRecorder$a;

    .line 134
    .line 135
    .line 136
    invoke-direct {p1, p0}, Lai/advance/common/recorder_old/VideoRecorder$a;-><init>(Lai/advance/common/recorder_old/VideoRecorder;)V

    .line 137
    .line 138
    iput-object p1, p0, Lai/advance/common/recorder_old/VideoRecorder;->i:Lai/advance/common/recorder_old/VideoRecorder$a;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 142
    :catch_0
    :goto_0
    return-void
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
.end method

.method public declared-synchronized u()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-boolean v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    :try_start_1
    iput-boolean v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->s:Z

    .line 11
    .line 12
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->j:Landroid/media/MediaCodec;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->m:Landroid/media/MediaMuxer;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    const/4 v0, 0x1

    .line 20
    .line 21
    iput-boolean v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->u:Z

    .line 22
    .line 23
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->p:Ljava/util/concurrent/CountDownLatch;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    .line 29
    move-result-wide v0

    .line 30
    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    cmp-long v0, v0, v2

    .line 34
    .line 35
    if-lez v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Lai/advance/common/recorder_old/VideoRecorder;->p:Ljava/util/concurrent/CountDownLatch;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lai/advance/common/recorder_old/VideoRecorder;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    monitor-exit p0

    .line 48
    return-void

    .line 49
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    throw v0
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
.end method
