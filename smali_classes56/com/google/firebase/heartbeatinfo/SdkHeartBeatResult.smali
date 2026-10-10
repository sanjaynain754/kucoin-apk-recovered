.class public abstract Lcom/google/firebase/heartbeatinfo/SdkHeartBeatResult;
.super Ljava/lang/Object;
.source "SdkHeartBeatResult.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/google/firebase/heartbeatinfo/SdkHeartBeatResult;",
        ">;"
    }
.end annotation


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
.end method

.method public static create(Ljava/lang/String;J)Lcom/google/firebase/heartbeatinfo/SdkHeartBeatResult;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/firebase/heartbeatinfo/AutoValue_SdkHeartBeatResult;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/google/firebase/heartbeatinfo/AutoValue_SdkHeartBeatResult;-><init>(Ljava/lang/String;J)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
.end method


# virtual methods
.method public compareTo(Lcom/google/firebase/heartbeatinfo/SdkHeartBeatResult;)I
    .locals 4

    .line 2
    invoke-virtual {p0}, Lcom/google/firebase/heartbeatinfo/SdkHeartBeatResult;->getMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/google/firebase/heartbeatinfo/SdkHeartBeatResult;->getMillis()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/google/firebase/heartbeatinfo/SdkHeartBeatResult;

    invoke-virtual {p0, p1}, Lcom/google/firebase/heartbeatinfo/SdkHeartBeatResult;->compareTo(Lcom/google/firebase/heartbeatinfo/SdkHeartBeatResult;)I

    move-result p1

    return p1
.end method

.method public abstract getMillis()J
.end method

.method public abstract getSdkName()Ljava/lang/String;
.end method
