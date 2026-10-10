.class public interface abstract Lcom/tencent/bugly/library/BuglyLogLevel;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final LEVEL_DEBUG:I

.field public static final LEVEL_ERROR:I

.field public static final LEVEL_INFO:I

.field public static final LEVEL_OFF:I

.field public static final LEVEL_VERBOS:I

.field public static final LEVEL_WARN:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->OFF:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 6
    move-result v0

    .line 7
    .line 8
    sput v0, Lcom/tencent/bugly/library/BuglyLogLevel;->LEVEL_OFF:I

    .line 9
    .line 10
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 14
    move-result v0

    .line 15
    .line 16
    sput v0, Lcom/tencent/bugly/library/BuglyLogLevel;->LEVEL_ERROR:I

    .line 17
    .line 18
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 22
    move-result v0

    .line 23
    .line 24
    sput v0, Lcom/tencent/bugly/library/BuglyLogLevel;->LEVEL_WARN:I

    .line 25
    .line 26
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 30
    move-result v0

    .line 31
    .line 32
    sput v0, Lcom/tencent/bugly/library/BuglyLogLevel;->LEVEL_INFO:I

    .line 33
    .line 34
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 38
    move-result v0

    .line 39
    .line 40
    sput v0, Lcom/tencent/bugly/library/BuglyLogLevel;->LEVEL_DEBUG:I

    .line 41
    .line 42
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->VERBOS:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    .line 46
    move-result v0

    .line 47
    .line 48
    sput v0, Lcom/tencent/bugly/library/BuglyLogLevel;->LEVEL_VERBOS:I

    .line 49
    return-void
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method
