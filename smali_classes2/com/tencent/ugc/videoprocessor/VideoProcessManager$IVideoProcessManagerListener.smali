.class public interface abstract Lcom/tencent/ugc/videoprocessor/VideoProcessManager$IVideoProcessManagerListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/ugc/videoprocessor/VideoProcessManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IVideoProcessManagerListener"
.end annotation


# virtual methods
.method public abstract customProcessFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;)I
.end method

.method public abstract didProcessFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;)V
.end method
