.class public final synthetic Lkotlin/d;
.super Ljava/lang/Object;
.source "R8$$SyntheticClass"


# direct methods
.method public static synthetic a(JJ)J
    .locals 7

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmp-long v2, p2, v0

    .line 5
    .line 6
    const-wide/high16 v3, -0x8000000000000000L

    .line 7
    .line 8
    if-gez v2, :cond_1

    .line 9
    xor-long/2addr p0, v3

    .line 10
    xor-long/2addr p2, v3

    .line 11
    .line 12
    cmp-long p0, p0, p2

    .line 13
    .line 14
    if-gez p0, :cond_0

    .line 15
    return-wide v0

    .line 16
    .line 17
    :cond_0
    const-wide/16 p0, 0x1

    .line 18
    return-wide p0

    .line 19
    .line 20
    :cond_1
    cmp-long v0, p0, v0

    .line 21
    .line 22
    if-ltz v0, :cond_2

    .line 23
    div-long/2addr p0, p2

    .line 24
    return-wide p0

    .line 25
    :cond_2
    const/4 v0, 0x1

    .line 26
    .line 27
    ushr-long v1, p0, v0

    .line 28
    div-long/2addr v1, p2

    .line 29
    shl-long/2addr v1, v0

    .line 30
    .line 31
    mul-long v5, v1, p2

    .line 32
    sub-long/2addr p0, v5

    .line 33
    xor-long/2addr p0, v3

    .line 34
    xor-long/2addr p2, v3

    .line 35
    .line 36
    cmp-long p0, p0, p2

    .line 37
    .line 38
    if-ltz p0, :cond_3

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    const/4 v0, 0x0

    .line 41
    :goto_0
    int-to-long p0, v0

    .line 42
    add-long/2addr v1, p0

    .line 43
    return-wide v1
.end method
