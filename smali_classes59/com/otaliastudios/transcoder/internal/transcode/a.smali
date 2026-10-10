.class public Lcom/otaliastudios/transcoder/internal/transcode/a;
.super Ljava/lang/Object;
.source "TranscodeDispatcher.java"


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lq90/d;


# direct methods
.method public constructor <init>(Lq90/e;)V
    .locals 1
    .param p1    # Lq90/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lq90/e;->s()Landroid/os/Handler;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/a;->a:Landroid/os/Handler;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lq90/e;->r()Lq90/d;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    iput-object p1, p0, Lcom/otaliastudios/transcoder/internal/transcode/a;->b:Lq90/d;

    .line 16
    return-void
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

.method public static synthetic a(Lcom/otaliastudios/transcoder/internal/transcode/a;)Lq90/d;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/otaliastudios/transcoder/internal/transcode/a;->b:Lq90/d;

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


# virtual methods
.method public b()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/a;->a:Landroid/os/Handler;

    .line 3
    .line 4
    new-instance v1, Lcom/otaliastudios/transcoder/internal/transcode/a$a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/otaliastudios/transcoder/internal/transcode/a$a;-><init>(Lcom/otaliastudios/transcoder/internal/transcode/a;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public c(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/a;->a:Landroid/os/Handler;

    .line 3
    .line 4
    new-instance v1, Lcom/otaliastudios/transcoder/internal/transcode/a$c;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/otaliastudios/transcoder/internal/transcode/a$c;-><init>(Lcom/otaliastudios/transcoder/internal/transcode/a;Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    return-void
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

.method public d(D)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/a;->a:Landroid/os/Handler;

    .line 3
    .line 4
    new-instance v1, Lcom/otaliastudios/transcoder/internal/transcode/a$d;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1, p2}, Lcom/otaliastudios/transcoder/internal/transcode/a$d;-><init>(Lcom/otaliastudios/transcoder/internal/transcode/a;D)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    return-void
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

.method public e(I)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/otaliastudios/transcoder/internal/transcode/a;->a:Landroid/os/Handler;

    .line 3
    .line 4
    new-instance v1, Lcom/otaliastudios/transcoder/internal/transcode/a$b;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/otaliastudios/transcoder/internal/transcode/a$b;-><init>(Lcom/otaliastudios/transcoder/internal/transcode/a;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    return-void
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
