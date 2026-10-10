.class public final Lcom/tencent/liteav/videobase/frame/e$a;
.super Lcom/tencent/liteav/videobase/frame/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/videobase/frame/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:I

.field final b:I

.field final c:I

.field private d:Lcom/tencent/liteav/videobase/frame/FrameMetaData;

.field private e:Lcom/tencent/liteav/videobase/utils/ProducerChainTimestamp;

.field private f:Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;


# direct methods
.method private constructor <init>(Lcom/tencent/liteav/videobase/frame/g;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/liteav/videobase/frame/g<",
            "Lcom/tencent/liteav/videobase/frame/d;",
            ">;II)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videobase/frame/d;-><init>(Lcom/tencent/liteav/videobase/frame/g;)V

    const/4 p1, -0x1

    .line 3
    iput p1, p0, Lcom/tencent/liteav/videobase/frame/e$a;->a:I

    .line 4
    iput p2, p0, Lcom/tencent/liteav/videobase/frame/e$a;->b:I

    .line 5
    iput p3, p0, Lcom/tencent/liteav/videobase/frame/e$a;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/liteav/videobase/frame/g;IIB)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/liteav/videobase/frame/e$a;-><init>(Lcom/tencent/liteav/videobase/frame/g;II)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/liteav/videobase/frame/e$a;->a:I

    return v0
.end method

.method public final a(Ljava/lang/Object;)Lcom/tencent/liteav/videobase/frame/PixelFrame;
    .locals 2

    .line 2
    new-instance v0, Lcom/tencent/liteav/videobase/frame/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/tencent/liteav/videobase/frame/e$b;-><init>(Lcom/tencent/liteav/videobase/frame/d;Ljava/lang/Object;B)V

    .line 3
    invoke-virtual {v0}, Lcom/tencent/liteav/videobase/frame/PixelFrame;->retain()I

    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/videobase/frame/e$a;->b:I

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
.end method

.method public final c()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/videobase/frame/e$a;->c:I

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
.end method

.method public final d()Lcom/tencent/liteav/videobase/frame/FrameMetaData;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videobase/frame/e$a;->d:Lcom/tencent/liteav/videobase/frame/FrameMetaData;

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

.method public final e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/tencent/liteav/videobase/frame/e$a;->d:Lcom/tencent/liteav/videobase/frame/FrameMetaData;

    .line 4
    .line 5
    iput-object v0, p0, Lcom/tencent/liteav/videobase/frame/e$a;->e:Lcom/tencent/liteav/videobase/utils/ProducerChainTimestamp;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/liteav/videobase/frame/e$a;->f:Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;

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
.end method

.method public final release()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/tencent/liteav/videobase/frame/j;->release()V

    .line 4
    return-void
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
