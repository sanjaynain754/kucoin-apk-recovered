.class public Lcom/tencent/rmonitor/common/logger/NativeLogger;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field private static sLogLevel:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 6
    move-result v0

    .line 7
    .line 8
    sput v0, Lcom/tencent/rmonitor/common/logger/NativeLogger;->sLogLevel:I

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

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
.end method

.method public static getLogLevel()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/tencent/rmonitor/common/logger/NativeLogger;->sLogLevel:I

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
.end method

.method public static initLogLevel(I)I
    .locals 0

    .line 1
    .line 2
    sput p0, Lcom/tencent/rmonitor/common/logger/NativeLogger;->sLogLevel:I

    .line 3
    return p0
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
.end method
