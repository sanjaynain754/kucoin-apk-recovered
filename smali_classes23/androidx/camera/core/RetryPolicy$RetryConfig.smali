.class public final Landroidx/camera/core/RetryPolicy$RetryConfig;
.super Ljava/lang/Object;
.source "RetryPolicy.java"


# annotations
.annotation build Landroidx/camera/core/ExperimentalRetryPolicy;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/RetryPolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RetryConfig"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/RetryPolicy$RetryConfig$Builder;
    }
.end annotation


# static fields
.field public static COMPLETE_WITHOUT_FAILURE:Landroidx/camera/core/RetryPolicy$RetryConfig; = null
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation
.end field

.field private static final DEFAULT_DELAY_MILLIS:J = 0x1f4L

.field public static final DEFAULT_DELAY_RETRY:Landroidx/camera/core/RetryPolicy$RetryConfig;

.field private static final MINI_DELAY_MILLIS:J = 0x64L

.field public static final MINI_DELAY_RETRY:Landroidx/camera/core/RetryPolicy$RetryConfig;

.field public static final NOT_RETRY:Landroidx/camera/core/RetryPolicy$RetryConfig;


# instance fields
.field private final mCompleteWithoutFailure:Z

.field private final mDelayInMillis:J

.field private final mShouldRetry:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/RetryPolicy$RetryConfig;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, Landroidx/camera/core/RetryPolicy$RetryConfig;-><init>(ZJ)V

    .line 9
    .line 10
    sput-object v0, Landroidx/camera/core/RetryPolicy$RetryConfig;->NOT_RETRY:Landroidx/camera/core/RetryPolicy$RetryConfig;

    .line 11
    .line 12
    new-instance v0, Landroidx/camera/core/RetryPolicy$RetryConfig;

    .line 13
    const/4 v4, 0x1

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v4}, Landroidx/camera/core/RetryPolicy$RetryConfig;-><init>(Z)V

    .line 17
    .line 18
    sput-object v0, Landroidx/camera/core/RetryPolicy$RetryConfig;->DEFAULT_DELAY_RETRY:Landroidx/camera/core/RetryPolicy$RetryConfig;

    .line 19
    .line 20
    new-instance v0, Landroidx/camera/core/RetryPolicy$RetryConfig;

    .line 21
    .line 22
    const-wide/16 v5, 0x64

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v4, v5, v6}, Landroidx/camera/core/RetryPolicy$RetryConfig;-><init>(ZJ)V

    .line 26
    .line 27
    sput-object v0, Landroidx/camera/core/RetryPolicy$RetryConfig;->MINI_DELAY_RETRY:Landroidx/camera/core/RetryPolicy$RetryConfig;

    .line 28
    .line 29
    new-instance v0, Landroidx/camera/core/RetryPolicy$RetryConfig;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/camera/core/RetryPolicy$RetryConfig;-><init>(ZJZ)V

    .line 33
    .line 34
    sput-object v0, Landroidx/camera/core/RetryPolicy$RetryConfig;->COMPLETE_WITHOUT_FAILURE:Landroidx/camera/core/RetryPolicy$RetryConfig;

    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method

.method private constructor <init>(Z)V
    .locals 2

    .line 2
    invoke-static {}, Landroidx/camera/core/RetryPolicy$RetryConfig;->getDefaultRetryDelayInMillis()J

    move-result-wide v0

    invoke-direct {p0, p1, v0, v1}, Landroidx/camera/core/RetryPolicy$RetryConfig;-><init>(ZJ)V

    return-void
.end method

.method private constructor <init>(ZJ)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/camera/core/RetryPolicy$RetryConfig;-><init>(ZJZ)V

    return-void
.end method

.method public synthetic constructor <init>(ZJLandroidx/camera/core/RetryPolicy$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/core/RetryPolicy$RetryConfig;-><init>(ZJ)V

    return-void
.end method

.method private constructor <init>(ZJZ)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-boolean p1, p0, Landroidx/camera/core/RetryPolicy$RetryConfig;->mShouldRetry:Z

    .line 6
    iput-wide p2, p0, Landroidx/camera/core/RetryPolicy$RetryConfig;->mDelayInMillis:J

    if-eqz p4, :cond_0

    xor-int/lit8 p1, p1, 0x1

    .line 7
    const-string/jumbo p2, "shouldRetry must be false when completeWithoutFailure is set to true"

    invoke-static {p1, p2}, Landroidx/core/util/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 8
    :cond_0
    iput-boolean p4, p0, Landroidx/camera/core/RetryPolicy$RetryConfig;->mCompleteWithoutFailure:Z

    return-void
.end method

.method public static getDefaultRetryDelayInMillis()J
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x1f4

    .line 3
    return-wide v0
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
.end method


# virtual methods
.method public getRetryDelayInMillis()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/camera/core/RetryPolicy$RetryConfig;->mDelayInMillis:J

    .line 3
    return-wide v0
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
.end method

.method public shouldCompleteWithoutFailure()Z
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/camera/core/RetryPolicy$RetryConfig;->mCompleteWithoutFailure:Z

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
    .line 18
    .line 19
    .line 20
.end method

.method public shouldRetry()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/camera/core/RetryPolicy$RetryConfig;->mShouldRetry:Z

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
    .line 18
    .line 19
    .line 20
.end method
