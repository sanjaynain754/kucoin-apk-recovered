.class public interface abstract Lcom/tencent/ugc/videobase/utils/PixelFrameQueue;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract evictAll()V
.end method

.method public abstract peek()Lcom/tencent/ugc/videobase/frame/PixelFrame;
.end method

.method public abstract poll()Lcom/tencent/ugc/videobase/frame/PixelFrame;
.end method

.method public abstract push(Lcom/tencent/ugc/videobase/frame/PixelFrame;)V
.end method

.method public abstract remove(Lcom/tencent/ugc/videobase/frame/PixelFrame;)Z
.end method

.method public abstract size()I
.end method
