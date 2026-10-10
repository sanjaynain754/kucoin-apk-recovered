.class public Lcom/tencent/liteav/videoproducer2/MediaCodecExceptionJni;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::video"
.end annotation


# instance fields
.field public hasException:Z

.field public isErrorRecoverable:Z

.field public systemErrorCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/liteav/videoproducer2/MediaCodecExceptionJni;->hasException:Z

    .line 7
    .line 8
    iput v0, p0, Lcom/tencent/liteav/videoproducer2/MediaCodecExceptionJni;->systemErrorCode:I

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/tencent/liteav/videoproducer2/MediaCodecExceptionJni;->isErrorRecoverable:Z

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static createException()Lcom/tencent/liteav/videoproducer2/MediaCodecExceptionJni;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/liteav/videoproducer2/MediaCodecExceptionJni;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/liteav/videoproducer2/MediaCodecExceptionJni;-><init>()V

    .line 6
    return-object v0
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


# virtual methods
.method public getSystemErrorCode()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/liteav/videoproducer2/MediaCodecExceptionJni;->systemErrorCode:I

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

.method public hasException()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/liteav/videoproducer2/MediaCodecExceptionJni;->hasException:Z

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

.method public isErrorRecoverable()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/liteav/videoproducer2/MediaCodecExceptionJni;->isErrorRecoverable:Z

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
