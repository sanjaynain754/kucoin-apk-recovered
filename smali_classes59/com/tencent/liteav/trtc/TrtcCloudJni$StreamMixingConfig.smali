.class Lcom/tencent/liteav/trtc/TrtcCloudJni$StreamMixingConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/trtc/TrtcCloudJni;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StreamMixingConfig"
.end annotation


# instance fields
.field private a:Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;


# direct methods
.method public constructor <init>(Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$StreamMixingConfig;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;

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
.method public getAudioMixUserList()[Lcom/tencent/liteav/trtc/TrtcCloudJni$TRTCUser;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$StreamMixingConfig;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;->audioMixUserList:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    move-result v0

    .line 13
    .line 14
    new-array v0, v0, [Lcom/tencent/liteav/trtc/TrtcCloudJni$TRTCUser;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    :goto_0
    iget-object v2, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$StreamMixingConfig;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;

    .line 18
    .line 19
    iget-object v2, v2, Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;->audioMixUserList:Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 23
    move-result v2

    .line 24
    .line 25
    if-ge v1, v2, :cond_1

    .line 26
    .line 27
    new-instance v2, Lcom/tencent/liteav/trtc/TrtcCloudJni$TRTCUser;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$StreamMixingConfig;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;

    .line 30
    .line 31
    iget-object v3, v3, Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;->audioMixUserList:Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    check-cast v3, Lcom/tencent/trtc/TRTCCloudDef$TRTCUser;

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, v3}, Lcom/tencent/liteav/trtc/TrtcCloudJni$TRTCUser;-><init>(Lcom/tencent/trtc/TRTCCloudDef$TRTCUser;)V

    .line 41
    .line 42
    aput-object v2, v0, v1

    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-object v0
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$StreamMixingConfig;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;->backgroundColor:I

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

.method public getBackgroundImage()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$StreamMixingConfig;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;->backgroundImage:Ljava/lang/String;

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

.method public getVideoLayoutList()[Lcom/tencent/liteav/trtc/TrtcCloudJni$VideoLayout;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$StreamMixingConfig;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;->videoLayoutList:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    move-result v0

    .line 13
    .line 14
    new-array v0, v0, [Lcom/tencent/liteav/trtc/TrtcCloudJni$VideoLayout;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    :goto_0
    iget-object v2, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$StreamMixingConfig;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;

    .line 18
    .line 19
    iget-object v2, v2, Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;->videoLayoutList:Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 23
    move-result v2

    .line 24
    .line 25
    if-ge v1, v2, :cond_1

    .line 26
    .line 27
    new-instance v2, Lcom/tencent/liteav/trtc/TrtcCloudJni$VideoLayout;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$StreamMixingConfig;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;

    .line 30
    .line 31
    iget-object v3, v3, Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;->videoLayoutList:Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    check-cast v3, Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoLayout;

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, v3}, Lcom/tencent/liteav/trtc/TrtcCloudJni$VideoLayout;-><init>(Lcom/tencent/trtc/TRTCCloudDef$TRTCVideoLayout;)V

    .line 41
    .line 42
    aput-object v2, v0, v1

    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-object v0
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public getWatermarkList()[Lcom/tencent/liteav/trtc/TrtcCloudJni$Watermark;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$StreamMixingConfig;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;->watermarkList:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    move-result v0

    .line 13
    .line 14
    new-array v0, v0, [Lcom/tencent/liteav/trtc/TrtcCloudJni$Watermark;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    :goto_0
    iget-object v2, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$StreamMixingConfig;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;

    .line 18
    .line 19
    iget-object v2, v2, Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;->watermarkList:Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 23
    move-result v2

    .line 24
    .line 25
    if-ge v1, v2, :cond_1

    .line 26
    .line 27
    new-instance v2, Lcom/tencent/liteav/trtc/TrtcCloudJni$Watermark;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$StreamMixingConfig;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;

    .line 30
    .line 31
    iget-object v3, v3, Lcom/tencent/trtc/TRTCCloudDef$TRTCStreamMixingConfig;->watermarkList:Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    check-cast v3, Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, v3}, Lcom/tencent/liteav/trtc/TrtcCloudJni$Watermark;-><init>(Lcom/tencent/trtc/TRTCCloudDef$TRTCWatermark;)V

    .line 41
    .line 42
    aput-object v2, v0, v1

    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-object v0
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method
