.class public Lcom/tencent/liteav/base/util/CpuUsageMeasurer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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

.method public static a()[I
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/base/util/CpuUsageMeasurer;->nativeGetCpuUsage()[I

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    aget v1, v0, v1

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    aget v0, v0, v2

    .line 11
    .line 12
    .line 13
    filled-new-array {v1, v0}, [I

    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public static native nativeGetCpuUsage()[I
.end method
