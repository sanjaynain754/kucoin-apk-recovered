.class public interface abstract Lz90/a;
.super Ljava/lang/Object;
.source "DataSink.java"


# virtual methods
.method public abstract a(Lcom/otaliastudios/transcoder/common/TrackType;Landroid/media/MediaFormat;)V
    .param p1    # Lcom/otaliastudios/transcoder/common/TrackType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/media/MediaFormat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract b(DD)V
.end method

.method public abstract c(I)V
.end method

.method public abstract d(Lcom/otaliastudios/transcoder/common/TrackType;Lcom/otaliastudios/transcoder/common/TrackStatus;)V
    .param p1    # Lcom/otaliastudios/transcoder/common/TrackType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/otaliastudios/transcoder/common/TrackStatus;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract e(Lcom/otaliastudios/transcoder/common/TrackType;Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    .param p1    # Lcom/otaliastudios/transcoder/common/TrackType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/nio/ByteBuffer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/media/MediaCodec$BufferInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract release()V
.end method

.method public abstract stop()V
.end method
