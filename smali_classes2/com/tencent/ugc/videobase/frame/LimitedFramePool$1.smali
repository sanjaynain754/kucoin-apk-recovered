.class final Lcom/tencent/ugc/videobase/frame/LimitedFramePool$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/ugc/videobase/frame/IRecycler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/ugc/videobase/frame/LimitedFramePool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/tencent/ugc/videobase/frame/IRecycler<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/ugc/videobase/frame/LimitedFramePool;


# direct methods
.method public constructor <init>(Lcom/tencent/ugc/videobase/frame/LimitedFramePool;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/ugc/videobase/frame/LimitedFramePool$1;->a:Lcom/tencent/ugc/videobase/frame/LimitedFramePool;

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
.end method


# virtual methods
.method public final recycle(Lcom/tencent/ugc/videobase/frame/RefCounted;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/LimitedFramePool$1;->a:Lcom/tencent/ugc/videobase/frame/LimitedFramePool;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/ugc/videobase/frame/LimitedFramePool;->access$000(Lcom/tencent/ugc/videobase/frame/LimitedFramePool;)Ljava/util/concurrent/Semaphore;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/tencent/ugc/videobase/frame/LimitedFramePool$1;->a:Lcom/tencent/ugc/videobase/frame/LimitedFramePool;

    .line 15
    monitor-enter v0

    .line 16
    .line 17
    :try_start_0
    iget-object v1, p0, Lcom/tencent/ugc/videobase/frame/LimitedFramePool$1;->a:Lcom/tencent/ugc/videobase/frame/LimitedFramePool;

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lcom/tencent/ugc/videobase/frame/LimitedFramePool;->access$100(Lcom/tencent/ugc/videobase/frame/LimitedFramePool;)Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, Lcom/tencent/ugc/videobase/frame/LimitedFramePool$1;->a:Lcom/tencent/ugc/videobase/frame/LimitedFramePool;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Lcom/tencent/ugc/videobase/frame/LimitedFramePool;->destroyInstance(Lcom/tencent/ugc/videobase/frame/RefCounted;)V

    .line 29
    monitor-exit v0

    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_1
    iget-object v1, p0, Lcom/tencent/ugc/videobase/frame/LimitedFramePool$1;->a:Lcom/tencent/ugc/videobase/frame/LimitedFramePool;

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Lcom/tencent/ugc/videobase/frame/LimitedFramePool;->access$200(Lcom/tencent/ugc/videobase/frame/LimitedFramePool;)Ljava/util/Deque;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-interface {v1, p1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    .line 42
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw p1
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
