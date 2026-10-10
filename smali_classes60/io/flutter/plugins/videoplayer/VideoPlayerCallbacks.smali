.class public interface abstract Lio/flutter/plugins/videoplayer/VideoPlayerCallbacks;
.super Ljava/lang/Object;
.source "VideoPlayerCallbacks.java"


# virtual methods
.method public abstract onBufferingEnd()V
.end method

.method public abstract onBufferingStart()V
.end method

.method public abstract onBufferingUpdate(J)V
.end method

.method public abstract onCompleted()V
.end method

.method public abstract onError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onInitialized(IIJI)V
.end method

.method public abstract onIsPlayingStateUpdate(Z)V
.end method
