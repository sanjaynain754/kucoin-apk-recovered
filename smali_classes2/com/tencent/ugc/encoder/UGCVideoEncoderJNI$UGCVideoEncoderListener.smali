.class public interface abstract Lcom/tencent/ugc/encoder/UGCVideoEncoderJNI$UGCVideoEncoderListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/ugc/encoder/UGCVideoEncoderJNI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "UGCVideoEncoderListener"
.end annotation


# virtual methods
.method public abstract onEncodedFail(Lcom/tencent/ugc/encoder/UGCVideoEncoderJNI$VideoEncoderError;)V
.end method

.method public abstract onEncodedNAL(Lcom/tencent/ugc/videobase/common/EncodedVideoFrame;)V
.end method
