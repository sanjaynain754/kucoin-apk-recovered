.class public interface abstract Lio/flutter/embedding/engine/dart/PlatformMessageHandler;
.super Ljava/lang/Object;
.source "PlatformMessageHandler.java"


# virtual methods
.method public abstract handleMessageFromDart(Ljava/lang/String;Ljava/nio/ByteBuffer;IJ)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/nio/ByteBuffer;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract handlePlatformMessageResponse(ILjava/nio/ByteBuffer;)V
    .param p2    # Ljava/nio/ByteBuffer;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method
