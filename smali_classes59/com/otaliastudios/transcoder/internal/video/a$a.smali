.class public Lcom/otaliastudios/transcoder/internal/video/a$a;
.super Ljava/lang/Object;
.source "FrameDrawer.java"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/otaliastudios/transcoder/internal/video/a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/otaliastudios/transcoder/internal/video/a;


# direct methods
.method public constructor <init>(Lcom/otaliastudios/transcoder/internal/video/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/video/a$a;->b:Lcom/otaliastudios/transcoder/internal/video/a;

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
.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/otaliastudios/transcoder/internal/video/a;->a()Lw90/i;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    const-string v0, "New frame available"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lw90/i;->h(Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object p1, p0, Lcom/otaliastudios/transcoder/internal/video/a$a;->b:Lcom/otaliastudios/transcoder/internal/video/a;

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lcom/otaliastudios/transcoder/internal/video/a;->b(Lcom/otaliastudios/transcoder/internal/video/a;)Ljava/lang/Object;

    .line 15
    move-result-object p1

    .line 16
    monitor-enter p1

    .line 17
    .line 18
    :try_start_0
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a$a;->b:Lcom/otaliastudios/transcoder/internal/video/a;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/otaliastudios/transcoder/internal/video/a;->c(Lcom/otaliastudios/transcoder/internal/video/a;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a$a;->b:Lcom/otaliastudios/transcoder/internal/video/a;

    .line 27
    const/4 v1, 0x1

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lcom/otaliastudios/transcoder/internal/video/a;->d(Lcom/otaliastudios/transcoder/internal/video/a;Z)Z

    .line 31
    .line 32
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/video/a$a;->b:Lcom/otaliastudios/transcoder/internal/video/a;

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/otaliastudios/transcoder/internal/video/a;->b(Lcom/otaliastudios/transcoder/internal/video/a;)Ljava/lang/Object;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 40
    monitor-exit p1

    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 46
    .line 47
    const-string v1, "mFrameAvailable already set, frame could be dropped"

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 51
    throw v0

    .line 52
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    throw v0
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
.end method
