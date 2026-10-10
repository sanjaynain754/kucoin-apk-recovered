.class public final Lcom/tencent/bugly/common/reporter/data/ReportStrategy;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/common/reporter/data/ReportStrategy$Companion;,
        Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;,
        Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0018\u0000 )2\u00020\u0001:\u0003)*+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\'\u001a\u00020(H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u0006\"\u0004\u0008\u000b\u0010\u0008R\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0006\"\u0004\u0008\u0014\u0010\u0008R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0006\"\u0004\u0008\u0017\u0010\u0008R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010\u0006\"\u0004\u0008 \u0010\u0008R\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&\u00a8\u0006,"
    }
    d2 = {
        "Lcom/tencent/bugly/common/reporter/data/ReportStrategy;",
        "",
        "()V",
        "alreadyRetryTimes",
        "",
        "getAlreadyRetryTimes",
        "()I",
        "setAlreadyRetryTimes",
        "(I)V",
        "connectTimeout",
        "getConnectTimeout",
        "setConnectTimeout",
        "needCache",
        "",
        "getNeedCache",
        "()Z",
        "setNeedCache",
        "(Z)V",
        "priority",
        "getPriority",
        "setPriority",
        "readTimeout",
        "getReadTimeout",
        "setReadTimeout",
        "retryStrategy",
        "Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;",
        "getRetryStrategy",
        "()Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;",
        "setRetryStrategy",
        "(Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;)V",
        "retryTimes",
        "getRetryTimes",
        "setRetryTimes",
        "uploadStrategy",
        "Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;",
        "getUploadStrategy",
        "()Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;",
        "setUploadStrategy",
        "(Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;)V",
        "toString",
        "",
        "Companion",
        "RetryStrategy",
        "UploadStrategy",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final DEFAULT_BACKOFF_RETRY_DURATION:I = 0xea60

.field public static final DEFAULT_CONNECT_TIMEOUT:I = 0x7530

.field public static final DEFAULT_READ_TIMEOUT:I = 0x7530

.field public static final DEFAULT_RETRY_TIMES:I = 0x3

.field private static final emergencyPluginSet:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private alreadyRetryTimes:I

.field private connectTimeout:I

.field private needCache:Z

.field private priority:I
    .annotation build Landroidx/annotation/IntRange;
        from = 0x0L
        to = 0x4L
    .end annotation
.end field

.field private readTimeout:I

.field private retryStrategy:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private retryTimes:I

.field private uploadStrategy:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/bugly/common/reporter/data/ReportStrategy$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->Companion:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$Companion;

    .line 9
    .line 10
    new-instance v0, Ljava/util/HashSet;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    sput-object v0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->emergencyPluginSet:Ljava/util/HashSet;

    .line 16
    return-void
    .line 17
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->needCache:Z

    .line 7
    const/4 v0, 0x2

    .line 8
    .line 9
    iput v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->priority:I

    .line 10
    .line 11
    const/16 v0, 0x7530

    .line 12
    .line 13
    iput v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->connectTimeout:I

    .line 14
    .line 15
    iput v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->readTimeout:I

    .line 16
    const/4 v0, 0x3

    .line 17
    .line 18
    iput v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->retryTimes:I

    .line 19
    .line 20
    sget-object v0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;->RETRY_BACKOFF:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->retryStrategy:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;

    .line 23
    .line 24
    sget-object v0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;->UPLOAD_WIFI:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->uploadStrategy:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;

    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
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
.end method

.method public static final synthetic access$getEmergencyPluginSet$cp()Ljava/util/HashSet;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->emergencyPluginSet:Ljava/util/HashSet;

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


# virtual methods
.method public final getAlreadyRetryTimes()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->alreadyRetryTimes:I

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

.method public final getConnectTimeout()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->connectTimeout:I

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

.method public final getNeedCache()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->needCache:Z

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

.method public final getPriority()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->priority:I

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

.method public final getReadTimeout()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->readTimeout:I

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

.method public final getRetryStrategy()Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->retryStrategy:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;

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

.method public final getRetryTimes()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->retryTimes:I

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

.method public final getUploadStrategy()Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->uploadStrategy:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;

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

.method public final setAlreadyRetryTimes(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->alreadyRetryTimes:I

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

.method public final setConnectTimeout(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->connectTimeout:I

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

.method public final setNeedCache(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->needCache:Z

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

.method public final setPriority(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->priority:I

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

.method public final setReadTimeout(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->readTimeout:I

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

.method public final setRetryStrategy(Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;)V
    .locals 1
    .param p1    # Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->retryStrategy:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;

    .line 8
    return-void
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

.method public final setRetryTimes(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->retryTimes:I

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

.method public final setUploadStrategy(Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;)V
    .locals 1
    .param p1    # Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->uploadStrategy:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;

    .line 8
    return-void
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

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "ReportStrategy(needCache="

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->needCache:Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, ", priority="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget v1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->priority:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, ", connectTimeout="

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    iget v1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->connectTimeout:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, ", readTimeout="

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    iget v1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->readTimeout:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, ", retryTimes="

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    iget v1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->retryTimes:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, ", retryStrategy="

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    iget-object v1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->retryStrategy:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$RetryStrategy;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v1, ", uploadStrategy="

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    iget-object v1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->uploadStrategy:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, ", alreadyRetryTimes="

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    iget v1, p0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->alreadyRetryTimes:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const/16 v1, 0x29

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    move-result-object v0

    .line 92
    return-object v0
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
