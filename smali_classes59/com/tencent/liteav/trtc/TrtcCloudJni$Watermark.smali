.class Lcom/tencent/liteav/trtc/TrtcCloudJni$Watermark;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/trtc/TrtcCloudJni;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Watermark"
.end annotation


# instance fields
.field private a:Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;


# direct methods
.method public constructor <init>(Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$Watermark;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;

    .line 6
    return-void
    .line 7
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
.method public getHeight()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$Watermark;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;->height:I

    .line 5
    return v0
    .line 6
    .line 7
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
.end method

.method public getWatermarkUrl()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$Watermark;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;->watermarkUrl:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-object v0

    .line 8
    .line 9
    :cond_0
    const-string v0, ""

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getWidth()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$Watermark;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;->width:I

    .line 5
    return v0
    .line 6
    .line 7
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
.end method

.method public getX()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$Watermark;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;->x:I

    .line 5
    return v0
    .line 6
    .line 7
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
.end method

.method public getY()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$Watermark;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;->y:I

    .line 5
    return v0
    .line 6
    .line 7
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
.end method

.method public getZOrder()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$Watermark;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;->zOrder:I

    .line 5
    return v0
    .line 6
    .line 7
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
.end method
