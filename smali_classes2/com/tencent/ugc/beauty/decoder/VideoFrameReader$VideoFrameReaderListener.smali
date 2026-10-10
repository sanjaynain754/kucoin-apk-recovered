.class public interface abstract Lcom/tencent/ugc/beauty/decoder/VideoFrameReader$VideoFrameReaderListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/ugc/beauty/decoder/VideoFrameReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "VideoFrameReaderListener"
.end annotation


# virtual methods
.method public abstract onFrameAvailable(Lcom/tencent/ugc/videobase/frame/PixelFrame;)V
.end method

.method public abstract onReadFinished()V
.end method
