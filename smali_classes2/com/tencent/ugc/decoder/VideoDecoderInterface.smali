.class public interface abstract Lcom/tencent/ugc/decoder/VideoDecoderInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/ugc/decoder/VideoDecoderInterface$DecoderType;
    }
.end annotation


# virtual methods
.method public abstract abandonDecodingFrames()V
.end method

.method public abstract decode(Lcom/tencent/ugc/videobase/common/EncodedVideoFrame;)Z
.end method

.method public abstract getDecoderType()Lcom/tencent/ugc/decoder/VideoDecoderInterface$DecoderType;
.end method

.method public abstract initialize()V
.end method

.method public abstract setScene(Lcom/tencent/ugc/decoder/VideoDecoderDef$ConsumerScene;)V
.end method

.method public abstract start(Ljava/lang/Object;Lcom/tencent/ugc/decoder/VideoDecoderListener;)V
.end method

.method public abstract stop()V
.end method

.method public abstract uninitialize()V
.end method
