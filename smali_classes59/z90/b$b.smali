.class public Lz90/b$b;
.super Ljava/lang/Object;
.source "DefaultDataSink.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz90/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/otaliastudios/transcoder/common/TrackType;

.field public final b:I

.field public final c:J

.field public final d:I


# direct methods
.method public constructor <init>(Lcom/otaliastudios/transcoder/common/TrackType;Landroid/media/MediaCodec$BufferInfo;)V
    .locals 2
    .param p1    # Lcom/otaliastudios/transcoder/common/TrackType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/media/MediaCodec$BufferInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lz90/b$b;->a:Lcom/otaliastudios/transcoder/common/TrackType;

    .line 4
    iget p1, p2, Landroid/media/MediaCodec$BufferInfo;->size:I

    iput p1, p0, Lz90/b$b;->b:I

    .line 5
    iget-wide v0, p2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iput-wide v0, p0, Lz90/b$b;->c:J

    .line 6
    iget p1, p2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    iput p1, p0, Lz90/b$b;->d:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/otaliastudios/transcoder/common/TrackType;Landroid/media/MediaCodec$BufferInfo;Lz90/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lz90/b$b;-><init>(Lcom/otaliastudios/transcoder/common/TrackType;Landroid/media/MediaCodec$BufferInfo;)V

    return-void
.end method

.method public static synthetic a(Lz90/b$b;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lz90/b$b;->b:I

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
    .line 24
    .line 25
.end method

.method public static synthetic b(Lz90/b$b;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lz90/b$b;->c:J

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
    .line 25
.end method

.method public static synthetic c(Lz90/b$b;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lz90/b$b;->d:I

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
    .line 24
    .line 25
.end method

.method public static synthetic d(Lz90/b$b;)Lcom/otaliastudios/transcoder/common/TrackType;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lz90/b$b;->a:Lcom/otaliastudios/transcoder/common/TrackType;

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
    .line 24
    .line 25
.end method
