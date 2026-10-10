.class public Lcom/tencent/liteav/videoconsumer/consumer/NativeSnapshotListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/videobase/base/a;


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::video"
.end annotation


# instance fields
.field private mNativeVideoSnapListener:J


# direct methods
.method private constructor <init>(J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-wide p1, p0, Lcom/tencent/liteav/videoconsumer/consumer/NativeSnapshotListener;->mNativeVideoSnapListener:J

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

.method private native nativeDestroy(J)V
.end method

.method private native nativeOnComplete(JLandroid/graphics/Bitmap;)V
.end method


# virtual methods
.method public finalize()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/videoconsumer/consumer/NativeSnapshotListener;->mNativeVideoSnapListener:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v4, v0, v2

    .line 7
    .line 8
    if-eqz v4, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/videoconsumer/consumer/NativeSnapshotListener;->nativeDestroy(J)V

    .line 12
    .line 13
    iput-wide v2, p0, Lcom/tencent/liteav/videoconsumer/consumer/NativeSnapshotListener;->mNativeVideoSnapListener:J

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 17
    return-void
.end method

.method public onComplete(Landroid/graphics/Bitmap;)V
    .locals 5

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/videoconsumer/consumer/NativeSnapshotListener;->mNativeVideoSnapListener:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v4, v0, v2

    .line 7
    .line 8
    if-eqz v4, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0, v1, p1}, Lcom/tencent/liteav/videoconsumer/consumer/NativeSnapshotListener;->nativeOnComplete(JLandroid/graphics/Bitmap;)V

    .line 12
    .line 13
    iput-wide v2, p0, Lcom/tencent/liteav/videoconsumer/consumer/NativeSnapshotListener;->mNativeVideoSnapListener:J

    .line 14
    :cond_0
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
