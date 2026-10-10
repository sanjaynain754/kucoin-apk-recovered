.class public Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::video"
.end annotation


# instance fields
.field private hardwareEncoderBitrateModeCBRSupported:Ljava/lang/Boolean;

.field private mHardwareEncodeType:I

.field private mHardwareEncoderHighProfileEnable:Z

.field private mHardwareEncoderHighProfileSupport:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->mHardwareEncodeType:I

    .line 7
    const/4 v0, 0x1

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->mHardwareEncoderHighProfileEnable:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->mHardwareEncoderHighProfileSupport:Z

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static isHWHevcEncodeAllowed()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->nativeIsHardwareHevcEncodeAllowed()Z

    .line 4
    move-result v0

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

.method private static native nativeIsHardwareHevcEncodeAllowed()Z
.end method


# virtual methods
.method public getHardwareEncodeType()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->mHardwareEncodeType:I

    .line 3
    return v0
    .line 4
    .line 5
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

.method public getHardwareEncoderHighProfileEnable()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->mHardwareEncoderHighProfileEnable:Z

    .line 3
    return v0
    .line 4
    .line 5
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

.method public getHardwareEncoderHighProfileSupport()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->mHardwareEncoderHighProfileSupport:Z

    .line 3
    return v0
    .line 4
    .line 5
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

.method public isHardwareEncoderAllowed()Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->mHardwareEncodeType:I

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public isHardwareEncoderBitrateModeCBRSupported()Ljava/lang/Boolean;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->hardwareEncoderBitrateModeCBRSupported:Ljava/lang/Boolean;

    .line 3
    return-object v0
    .line 4
    .line 5
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

.method public isHardwareEncoderHighProfileAllowed()Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->mHardwareEncodeType:I

    .line 3
    const/4 v1, 0x2

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->mHardwareEncoderHighProfileEnable:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->mHardwareEncoderHighProfileSupport:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public setHardwareEncodeType(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->mHardwareEncodeType:I

    .line 3
    return-void
    .line 4
    .line 5
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setHardwareEncoderBitrateModeCBRSupported(Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->hardwareEncoderBitrateModeCBRSupported:Ljava/lang/Boolean;

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

.method public setHardwareEncoderHighProfileEnable(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->mHardwareEncoderHighProfileEnable:Z

    .line 3
    return-void
    .line 4
    .line 5
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setHardwareEncoderHighProfileSupport(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/liteav/videoproducer2/HWEncoderServerConfig;->mHardwareEncoderHighProfileSupport:Z

    .line 3
    return-void
    .line 4
    .line 5
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
