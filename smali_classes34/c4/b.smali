.class public interface abstract Lc4/b;
.super Ljava/lang/Object;
.source "MonotonicClock.java"


# virtual methods
.method public now()J
    .locals 3
    .annotation build Lw3/d;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lc4/b;->nowNanos()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public abstract nowNanos()J
    .annotation build Lw3/d;
    .end annotation
.end method
