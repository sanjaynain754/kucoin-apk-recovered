.class final Lcom/tencent/liteav/videoproducer2/capture/j$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/rtmp/video/VirtualDisplayListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/videoproducer2/capture/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/videoproducer2/capture/j;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/videoproducer2/capture/j;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/videoproducer2/capture/j$1;->a:Lcom/tencent/liteav/videoproducer2/capture/j;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public final onCaptureError()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer2/capture/j$1;->a:Lcom/tencent/liteav/videoproducer2/capture/j;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/liteav/videoproducer2/capture/j;->a(Lcom/tencent/liteav/videoproducer2/capture/j;)Lcom/tencent/liteav/videoproducer2/capture/NativeScreenCaptureListener;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer2/capture/j$1;->a:Lcom/tencent/liteav/videoproducer2/capture/j;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/tencent/liteav/videoproducer2/capture/j;->a(Lcom/tencent/liteav/videoproducer2/capture/j;)Lcom/tencent/liteav/videoproducer2/capture/NativeScreenCaptureListener;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/tencent/liteav/videoproducer2/capture/NativeScreenCaptureListener;->onCaptureError()V

    .line 18
    :cond_0
    return-void
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
.end method

.method public final onStartFinish(ZZ)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer2/capture/j$1;->a:Lcom/tencent/liteav/videoproducer2/capture/j;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/liteav/videoproducer2/capture/j;->a(Lcom/tencent/liteav/videoproducer2/capture/j;)Lcom/tencent/liteav/videoproducer2/capture/NativeScreenCaptureListener;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer2/capture/j$1;->a:Lcom/tencent/liteav/videoproducer2/capture/j;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/tencent/liteav/videoproducer2/capture/j;->a(Lcom/tencent/liteav/videoproducer2/capture/j;)Lcom/tencent/liteav/videoproducer2/capture/NativeScreenCaptureListener;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, Lcom/tencent/liteav/videoproducer2/capture/NativeScreenCaptureListener;->onStartFinish(ZZ)V

    .line 18
    :cond_0
    return-void
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
.end method

.method public final onVirtualDisplayCreate(Lcom/tencent/rtmp/video/VirtualDisplayWrapper;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer2/capture/j$1;->a:Lcom/tencent/liteav/videoproducer2/capture/j;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/tencent/liteav/videoproducer2/capture/j;->a(Lcom/tencent/liteav/videoproducer2/capture/j;Lcom/tencent/rtmp/video/VirtualDisplayWrapper;)Lcom/tencent/rtmp/video/VirtualDisplayWrapper;

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
