.class public interface abstract Lcom/tencent/ugc/UGCVideoProcessor$VideoEncodedFrameListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/ugc/UGCVideoProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "VideoEncodedFrameListener"
.end annotation


# virtual methods
.method public abstract onEncodedFail(Lcom/tencent/ugc/encoder/UGCVideoEncoderJNI$EncoderType;Lcom/tencent/ugc/encoder/UGCVideoEncoderJNI$VideoEncoderError;)V
.end method

.method public abstract onVideoEncodeStarted()V
.end method

.method public abstract onVideoEncodingCompleted()V
.end method

.method public abstract onVideoFrameEncoded(Lcom/tencent/ugc/videobase/common/EncodedVideoFrame;)V
.end method
