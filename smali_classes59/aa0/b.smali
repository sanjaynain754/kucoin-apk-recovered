.class public interface abstract Laa0/b;
.super Ljava/lang/Object;
.source "DataSource.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laa0/b$a;
    }
.end annotation


# virtual methods
.method public abstract a(Lcom/otaliastudios/transcoder/common/TrackType;)Z
    .param p1    # Lcom/otaliastudios/transcoder/common/TrackType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract b()Z
.end method

.method public abstract c(Lcom/otaliastudios/transcoder/common/TrackType;)V
    .param p1    # Lcom/otaliastudios/transcoder/common/TrackType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract d(Lcom/otaliastudios/transcoder/common/TrackType;)Landroid/media/MediaFormat;
    .param p1    # Lcom/otaliastudios/transcoder/common/TrackType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end method

.method public abstract e(Lcom/otaliastudios/transcoder/common/TrackType;)V
    .param p1    # Lcom/otaliastudios/transcoder/common/TrackType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract f(Laa0/b$a;)V
    .param p1    # Laa0/b$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract g()V
.end method

.method public abstract getDurationUs()J
.end method

.method public abstract getLocation()[D
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end method

.method public abstract getOrientation()I
.end method

.method public abstract getPositionUs()J
.end method

.method public abstract initialize()V
.end method

.method public abstract isInitialized()Z
.end method

.method public abstract seekTo(J)J
.end method
