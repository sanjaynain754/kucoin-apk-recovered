.class public Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/ugc/decoder/HardwareVideoDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "HardwareVideoDecoderParams"
.end annotation


# instance fields
.field public isHDR:Z

.field public isLowLatencyEnabled:Z

.field public mediaCodecDeviceRelatedParams:Lorg/json/JSONArray;

.field public mediaFormat:Landroid/media/MediaFormat;

.field public resolution:Lcom/tencent/liteav/base/util/Size;

.field public useHevc:Z

.field public useOutputBuffer:Z

.field public useSoftDecoder:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->isHDR:Z

    .line 20
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useHevc:Z

    .line 21
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useOutputBuffer:Z

    .line 22
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->isLowLatencyEnabled:Z

    const/4 v1, 0x0

    .line 23
    iput-object v1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->resolution:Lcom/tencent/liteav/base/util/Size;

    .line 24
    iput-object v1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->mediaFormat:Landroid/media/MediaFormat;

    .line 25
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useSoftDecoder:Z

    .line 26
    iput-object v1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->mediaCodecDeviceRelatedParams:Lorg/json/JSONArray;

    return-void
.end method

.method public constructor <init>(Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->isHDR:Z

    .line 3
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useHevc:Z

    .line 4
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useOutputBuffer:Z

    .line 5
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->isLowLatencyEnabled:Z

    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->resolution:Lcom/tencent/liteav/base/util/Size;

    .line 7
    iput-object v1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->mediaFormat:Landroid/media/MediaFormat;

    .line 8
    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useSoftDecoder:Z

    .line 9
    iput-object v1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->mediaCodecDeviceRelatedParams:Lorg/json/JSONArray;

    .line 10
    iget-boolean v0, p1, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->isHDR:Z

    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->isHDR:Z

    .line 11
    iget-boolean v0, p1, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useHevc:Z

    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useHevc:Z

    .line 12
    iget-boolean v0, p1, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useOutputBuffer:Z

    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useOutputBuffer:Z

    .line 13
    iget-boolean v0, p1, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->isLowLatencyEnabled:Z

    iput-boolean v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->isLowLatencyEnabled:Z

    .line 14
    iget-object v0, p1, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->resolution:Lcom/tencent/liteav/base/util/Size;

    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->resolution:Lcom/tencent/liteav/base/util/Size;

    .line 15
    iget-object v0, p1, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->mediaFormat:Landroid/media/MediaFormat;

    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->mediaFormat:Landroid/media/MediaFormat;

    .line 16
    iget-object v0, p1, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->mediaCodecDeviceRelatedParams:Lorg/json/JSONArray;

    iput-object v0, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->mediaCodecDeviceRelatedParams:Lorg/json/JSONArray;

    .line 17
    iget-boolean p1, p1, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useSoftDecoder:Z

    iput-boolean p1, p0, Lcom/tencent/ugc/decoder/HardwareVideoDecoder$HardwareVideoDecoderParams;->useSoftDecoder:Z

    return-void
.end method
