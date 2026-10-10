.class public Lcom/google/api/client/util/ExponentialBackOff$Builder;
.super Ljava/lang/Object;
.source "ExponentialBackOff.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/api/client/util/ExponentialBackOff;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field initialIntervalMillis:I

.field maxElapsedTimeMillis:I

.field maxIntervalMillis:I

.field multiplier:D

.field nanoClock:Lcom/google/api/client/util/NanoClock;

.field randomizationFactor:D


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0x1f4

    .line 6
    .line 7
    iput v0, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->initialIntervalMillis:I

    .line 8
    .line 9
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->randomizationFactor:D

    .line 12
    .line 13
    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    .line 14
    .line 15
    iput-wide v0, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->multiplier:D

    .line 16
    .line 17
    .line 18
    const v0, 0xea60

    .line 19
    .line 20
    iput v0, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->maxIntervalMillis:I

    .line 21
    .line 22
    .line 23
    const v0, 0xdbba0

    .line 24
    .line 25
    iput v0, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->maxElapsedTimeMillis:I

    .line 26
    .line 27
    sget-object v0, Lcom/google/api/client/util/NanoClock;->SYSTEM:Lcom/google/api/client/util/NanoClock;

    .line 28
    .line 29
    iput-object v0, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->nanoClock:Lcom/google/api/client/util/NanoClock;

    .line 30
    return-void
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


# virtual methods
.method public build()Lcom/google/api/client/util/ExponentialBackOff;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/client/util/ExponentialBackOff;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/google/api/client/util/ExponentialBackOff;-><init>(Lcom/google/api/client/util/ExponentialBackOff$Builder;)V

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
.end method

.method public final getInitialIntervalMillis()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->initialIntervalMillis:I

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

.method public final getMaxElapsedTimeMillis()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->maxElapsedTimeMillis:I

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

.method public final getMaxIntervalMillis()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->maxIntervalMillis:I

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

.method public final getMultiplier()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->multiplier:D

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
.end method

.method public final getNanoClock()Lcom/google/api/client/util/NanoClock;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->nanoClock:Lcom/google/api/client/util/NanoClock;

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
.end method

.method public final getRandomizationFactor()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->randomizationFactor:D

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
.end method

.method public setInitialIntervalMillis(I)Lcom/google/api/client/util/ExponentialBackOff$Builder;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->initialIntervalMillis:I

    .line 3
    return-object p0
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

.method public setMaxElapsedTimeMillis(I)Lcom/google/api/client/util/ExponentialBackOff$Builder;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->maxElapsedTimeMillis:I

    .line 3
    return-object p0
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

.method public setMaxIntervalMillis(I)Lcom/google/api/client/util/ExponentialBackOff$Builder;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->maxIntervalMillis:I

    .line 3
    return-object p0
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

.method public setMultiplier(D)Lcom/google/api/client/util/ExponentialBackOff$Builder;
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->multiplier:D

    .line 3
    return-object p0
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

.method public setNanoClock(Lcom/google/api/client/util/NanoClock;)Lcom/google/api/client/util/ExponentialBackOff$Builder;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/api/client/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    check-cast p1, Lcom/google/api/client/util/NanoClock;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->nanoClock:Lcom/google/api/client/util/NanoClock;

    .line 9
    return-object p0
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

.method public setRandomizationFactor(D)Lcom/google/api/client/util/ExponentialBackOff$Builder;
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/google/api/client/util/ExponentialBackOff$Builder;->randomizationFactor:D

    .line 3
    return-object p0
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
