.class public interface abstract Lcom/tencent/ugc/decoder/MediaCodecDecoder$MediaCodecDecoderListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/ugc/decoder/MediaCodecDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "MediaCodecDecoderListener"
.end annotation


# virtual methods
.method public abstract onDecodeFrame(Lcom/tencent/ugc/videobase/frame/PixelFrame;Z)V
.end method

.method public abstract onDecoderError()V
.end method
