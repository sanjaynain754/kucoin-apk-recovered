.class public final Lio/trtc/tuikit/atomicxcore/impl/view/call/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/view/call/A;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/A;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/z;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/A;

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
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/z;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/A;

    .line 3
    .line 4
    iget-boolean v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->e:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 11
    move-result-wide v0

    .line 12
    .line 13
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/z;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/A;

    .line 14
    .line 15
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->a:Landroid/graphics/Movie;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/graphics/Movie;->duration()I

    .line 19
    move-result v2

    .line 20
    .line 21
    if-lez v2, :cond_1

    .line 22
    .line 23
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/z;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/A;

    .line 24
    .line 25
    iget-wide v4, v3, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->c:J

    .line 26
    sub-long/2addr v0, v4

    .line 27
    int-to-long v4, v2

    .line 28
    rem-long/2addr v0, v4

    .line 29
    long-to-int v0, v0

    .line 30
    .line 31
    iget-object v1, v3, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->a:Landroid/graphics/Movie;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroid/graphics/Movie;->setTime(I)Z

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/z;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/A;

    .line 38
    .line 39
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->a:Landroid/graphics/Movie;

    .line 40
    const/4 v1, 0x0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/graphics/Movie;->setTime(I)Z

    .line 44
    .line 45
    :goto_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/z;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/A;

    .line 46
    .line 47
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->b:Landroid/widget/ImageView;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 51
    .line 52
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/z;->a:Lio/trtc/tuikit/atomicxcore/impl/view/call/A;

    .line 53
    .line 54
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->d:Landroid/os/Handler;

    .line 55
    .line 56
    const-wide/16 v1, 0x10

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 60
    return-void
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
    .line 106
    .line 107
.end method
