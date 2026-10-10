.class public Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::video"
.end annotation


# instance fields
.field private mDecodeFinishTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

.field private mDeliverTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

.field private mRenderFinishTimestamp:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mDeliverTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

    .line 13
    .line 14
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mDecodeFinishTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

    .line 20
    .line 21
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mRenderFinishTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

    .line 27
    return-void
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
.end method


# virtual methods
.method public copy(Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p1, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mDeliverTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mDeliverTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    .line 6
    iget-object v0, p1, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mDecodeFinishTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mDecodeFinishTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mRenderFinishTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mRenderFinishTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

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
.end method

.method public getDecodeFinishTimestamp()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mDecodeFinishTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public getDeliverTimestamp()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mDeliverTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public getRenderFinishTimestamp()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mRenderFinishTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public setDecodeFinishTimestamp(J)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mDecodeFinishTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 6
    return-void
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

.method public setDeliverTimestamp(J)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mDeliverTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 6
    return-void
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

.method public setRenderFinishTimestamp(J)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videobase/utils/ConsumerChainTimestamp;->mRenderFinishTimestamp:Ljava/util/concurrent/atomic/AtomicLong;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 6
    return-void
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
