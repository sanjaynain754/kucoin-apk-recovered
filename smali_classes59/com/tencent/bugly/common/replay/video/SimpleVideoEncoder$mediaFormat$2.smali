.class final Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder$mediaFormat$2;
.super Lkotlin/jvm/internal/Lambda;
.source "BUGLY"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;-><init>(Lcom/tencent/bugly/common/replay/video/MuxerConfig;Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/media/MediaFormat;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroid/media/MediaFormat;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder$mediaFormat$2;->this$0:Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final invoke()Landroid/media/MediaFormat;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "Encoder doesn\'t support the provided bitRate: "

    .line 2
    iget-object v1, p0, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder$mediaFormat$2;->this$0:Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;

    invoke-virtual {v1}, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;->getMuxerConfig()Lcom/tencent/bugly/common/replay/video/MuxerConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/bugly/common/replay/video/MuxerConfig;->getBitRate()I

    move-result v1

    .line 3
    :try_start_0
    iget-object v2, p0, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder$mediaFormat$2;->this$0:Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;

    invoke-virtual {v2}, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;->getMediaCodec$bugly_pro_release()Landroid/media/MediaCodec;

    move-result-object v2

    invoke-virtual {v2}, Landroid/media/MediaCodec;->getCodecInfo()Landroid/media/MediaCodecInfo;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder$mediaFormat$2;->this$0:Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;

    invoke-virtual {v3}, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;->getMuxerConfig()Lcom/tencent/bugly/common/replay/video/MuxerConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/tencent/bugly/common/replay/video/MuxerConfig;->getMimeType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object v2

    .line 5
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v2

    .line 6
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getBitrateRange()Landroid/util/Range;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 7
    sget-object v3, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    iget-object v4, p0, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder$mediaFormat$2;->this$0:Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;

    invoke-static {v4}, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;->access$getTAG$p(Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", the value will be clamped to the closest one"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v4, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 8
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getBitrateRange()Landroid/util/Range;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v0

    const-string/jumbo v2, "videoCapabilities.bitrateRange.clamp(bitRate)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 9
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    iget-object v3, p0, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder$mediaFormat$2;->this$0:Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;

    invoke-static {v3}, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;->access$getTAG$p(Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Could not retrieve MediaCodec info"

    invoke-virtual {v2, v3, v4, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder$mediaFormat$2;->this$0:Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;

    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;->getMuxerConfig()Lcom/tencent/bugly/common/replay/video/MuxerConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/common/replay/video/MuxerConfig;->getMimeType()Ljava/lang/String;

    move-result-object v0

    .line 11
    iget-object v2, p0, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder$mediaFormat$2;->this$0:Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;

    invoke-virtual {v2}, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;->getMuxerConfig()Lcom/tencent/bugly/common/replay/video/MuxerConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/bugly/common/replay/video/MuxerConfig;->getRecordingWidth()I

    move-result v2

    .line 12
    iget-object v3, p0, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder$mediaFormat$2;->this$0:Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;

    invoke-virtual {v3}, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;->getMuxerConfig()Lcom/tencent/bugly/common/replay/video/MuxerConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/tencent/bugly/common/replay/video/MuxerConfig;->getRecordingHeight()I

    move-result v3

    .line 13
    invoke-static {v0, v2, v3}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v0

    const-string v2, "createVideoFormat(\n     \u2026recordingHeight\n        )"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    const-string v2, "color-format"

    const v3, 0x7f000789

    invoke-virtual {v0, v2, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 15
    const-string v2, "bitrate"

    invoke-virtual {v0, v2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 16
    iget-object v1, p0, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder$mediaFormat$2;->this$0:Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;

    invoke-virtual {v1}, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;->getMuxerConfig()Lcom/tencent/bugly/common/replay/video/MuxerConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/bugly/common/replay/video/MuxerConfig;->getFrameRate()I

    move-result v1

    int-to-float v1, v1

    const-string v2, "frame-rate"

    invoke-virtual {v0, v2, v1}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 17
    const-string v1, "i-frame-interval"

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder$mediaFormat$2;->invoke()Landroid/media/MediaFormat;

    move-result-object v0

    return-object v0
.end method
