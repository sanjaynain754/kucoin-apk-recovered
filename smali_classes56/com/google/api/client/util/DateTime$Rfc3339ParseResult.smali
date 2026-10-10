.class Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;
.super Ljava/lang/Object;
.source "DateTime.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/api/client/util/DateTime;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Rfc3339ParseResult"
.end annotation


# instance fields
.field private final nanos:I

.field private final seconds:J

.field private final timeGiven:Z

.field private final tzShift:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(JIZLjava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;->seconds:J

    .line 4
    iput p3, p0, Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;->nanos:I

    .line 5
    iput-boolean p4, p0, Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;->timeGiven:Z

    .line 6
    iput-object p5, p0, Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;->tzShift:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(JIZLjava/lang/Integer;Lcom/google/api/client/util/DateTime$1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;-><init>(JIZLjava/lang/Integer;)V

    return-void
.end method

.method public static synthetic access$000(Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;)Lcom/google/api/client/util/DateTime;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;->toDateTime()Lcom/google/api/client/util/DateTime;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static synthetic access$100(Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;)Lcom/google/api/client/util/DateTime$SecondsAndNanos;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;->toSecondsAndNanos()Lcom/google/api/client/util/DateTime$SecondsAndNanos;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private toDateTime()Lcom/google/api/client/util/DateTime;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 3
    .line 4
    iget-wide v1, p0, Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;->seconds:J

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    iget v3, p0, Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;->nanos:I

    .line 13
    int-to-long v3, v3

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 17
    move-result-wide v2

    .line 18
    .line 19
    new-instance v4, Lcom/google/api/client/util/DateTime;

    .line 20
    .line 21
    iget-boolean v5, p0, Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;->timeGiven:Z

    .line 22
    .line 23
    xor-int/lit8 v5, v5, 0x1

    .line 24
    add-long/2addr v0, v2

    .line 25
    .line 26
    iget-object v2, p0, Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;->tzShift:Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    invoke-direct {v4, v5, v0, v1, v2}, Lcom/google/api/client/util/DateTime;-><init>(ZJLjava/lang/Integer;)V

    .line 30
    return-object v4
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
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method private toSecondsAndNanos()Lcom/google/api/client/util/DateTime$SecondsAndNanos;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/client/util/DateTime$SecondsAndNanos;

    .line 3
    .line 4
    iget-wide v1, p0, Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;->seconds:J

    .line 5
    .line 6
    iget v3, p0, Lcom/google/api/client/util/DateTime$Rfc3339ParseResult;->nanos:I

    .line 7
    const/4 v4, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/api/client/util/DateTime$SecondsAndNanos;-><init>(JILcom/google/api/client/util/DateTime$1;)V

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method
