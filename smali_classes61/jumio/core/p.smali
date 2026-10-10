.class public abstract Ljumio/core/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(I)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    if-eqz p0, :cond_2

    .line 3
    const/4 v0, 0x4

    .line 4
    .line 5
    if-eq p0, v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    if-eq p0, v0, :cond_0

    .line 10
    .line 11
    const-string p0, "UNKNOWN"

    .line 12
    return-object p0

    .line 13
    .line 14
    :cond_0
    const-string p0, "GONE"

    .line 15
    return-object p0

    .line 16
    .line 17
    :cond_1
    const-string p0, "INVISIBLE"

    .line 18
    return-object p0

    .line 19
    .line 20
    :cond_2
    const-string p0, "VISIBLE"

    .line 21
    return-object p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
