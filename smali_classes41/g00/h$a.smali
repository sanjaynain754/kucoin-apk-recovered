.class public final Lg00/h$a;
.super Ljava/lang/Object;
.source "KCRouterBridgeLeverCall.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg00/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lg00/h;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    if-nez p8, :cond_6

    .line 3
    .line 4
    and-int/lit8 p8, p7, 0x1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p8, :cond_0

    .line 8
    move-object p1, v0

    .line 9
    .line 10
    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 11
    .line 12
    if-eqz p8, :cond_1

    .line 13
    move-object p2, v0

    .line 14
    .line 15
    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 16
    .line 17
    if-eqz p8, :cond_2

    .line 18
    move-object p3, v0

    .line 19
    .line 20
    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 21
    .line 22
    if-eqz p8, :cond_3

    .line 23
    move-object p4, v0

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p8, p7, 0x10

    .line 26
    .line 27
    if-eqz p8, :cond_4

    .line 28
    move-object p5, v0

    .line 29
    .line 30
    :cond_4
    and-int/lit8 p7, p7, 0x20

    .line 31
    .line 32
    if-eqz p7, :cond_5

    .line 33
    move-object p6, v0

    .line 34
    .line 35
    .line 36
    :cond_5
    invoke-interface/range {p0 .. p6}, Lg00/h;->b0(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z

    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    .line 40
    :cond_6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 41
    .line 42
    const-string p1, "Super calls with default arguments not supported in this target, function: jumpLeverBorrowRecordPaying"

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 46
    throw p0
    .line 47
    .line 48
.end method

.method public static synthetic b(Lg00/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    if-nez p9, :cond_7

    .line 3
    .line 4
    and-int/lit8 p9, p8, 0x1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p9, :cond_0

    .line 8
    move-object p1, v0

    .line 9
    .line 10
    :cond_0
    and-int/lit8 p9, p8, 0x2

    .line 11
    .line 12
    if-eqz p9, :cond_1

    .line 13
    move-object p2, v0

    .line 14
    .line 15
    :cond_1
    and-int/lit8 p9, p8, 0x4

    .line 16
    .line 17
    if-eqz p9, :cond_2

    .line 18
    move-object p3, v0

    .line 19
    .line 20
    :cond_2
    and-int/lit8 p9, p8, 0x8

    .line 21
    .line 22
    if-eqz p9, :cond_3

    .line 23
    move-object p4, v0

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p9, p8, 0x10

    .line 26
    .line 27
    if-eqz p9, :cond_4

    .line 28
    move-object p5, v0

    .line 29
    .line 30
    :cond_4
    and-int/lit8 p9, p8, 0x20

    .line 31
    .line 32
    if-eqz p9, :cond_5

    .line 33
    move-object p6, v0

    .line 34
    .line 35
    :cond_5
    and-int/lit8 p8, p8, 0x40

    .line 36
    .line 37
    if-eqz p8, :cond_6

    .line 38
    move-object p7, v0

    .line 39
    .line 40
    .line 41
    :cond_6
    invoke-interface/range {p0 .. p7}, Lg00/h;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z

    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    .line 45
    :cond_7
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 46
    .line 47
    const-string p1, "Super calls with default arguments not supported in this target, function: jumpLeverBorrowRepay"

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p0
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
.end method

.method public static synthetic c(Lg00/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    if-nez p8, :cond_6

    .line 3
    .line 4
    and-int/lit8 p8, p7, 0x1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p8, :cond_0

    .line 8
    move-object p1, v0

    .line 9
    .line 10
    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 11
    .line 12
    if-eqz p8, :cond_1

    .line 13
    move-object p2, v0

    .line 14
    .line 15
    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 16
    .line 17
    if-eqz p8, :cond_2

    .line 18
    move-object p3, v0

    .line 19
    .line 20
    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 21
    .line 22
    if-eqz p8, :cond_3

    .line 23
    move-object p4, v0

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p8, p7, 0x10

    .line 26
    .line 27
    if-eqz p8, :cond_4

    .line 28
    move-object p5, v0

    .line 29
    .line 30
    :cond_4
    and-int/lit8 p7, p7, 0x20

    .line 31
    .line 32
    if-eqz p7, :cond_5

    .line 33
    move-object p6, v0

    .line 34
    .line 35
    .line 36
    :cond_5
    invoke-interface/range {p0 .. p6}, Lg00/h;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z

    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    .line 40
    :cond_6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 41
    .line 42
    const-string p1, "Super calls with default arguments not supported in this target, function: jumpMarginKlinePage"

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 46
    throw p0
    .line 47
    .line 48
.end method

.method public static synthetic d(Lg00/h;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    if-nez p10, :cond_8

    .line 3
    .line 4
    and-int/lit8 p10, p9, 0x1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p10, :cond_0

    .line 8
    move-object p1, v0

    .line 9
    .line 10
    :cond_0
    and-int/lit8 p10, p9, 0x2

    .line 11
    .line 12
    if-eqz p10, :cond_1

    .line 13
    move-object p2, v0

    .line 14
    .line 15
    :cond_1
    and-int/lit8 p10, p9, 0x4

    .line 16
    .line 17
    if-eqz p10, :cond_2

    .line 18
    move-object p3, v0

    .line 19
    .line 20
    :cond_2
    and-int/lit8 p10, p9, 0x8

    .line 21
    .line 22
    if-eqz p10, :cond_3

    .line 23
    move-object p4, v0

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p10, p9, 0x10

    .line 26
    .line 27
    if-eqz p10, :cond_4

    .line 28
    move-object p5, v0

    .line 29
    .line 30
    :cond_4
    and-int/lit8 p10, p9, 0x20

    .line 31
    .line 32
    if-eqz p10, :cond_5

    .line 33
    move-object p6, v0

    .line 34
    .line 35
    :cond_5
    and-int/lit8 p10, p9, 0x40

    .line 36
    .line 37
    if-eqz p10, :cond_6

    .line 38
    move-object p7, v0

    .line 39
    .line 40
    :cond_6
    and-int/lit16 p9, p9, 0x80

    .line 41
    .line 42
    if-eqz p9, :cond_7

    .line 43
    move-object p8, v0

    .line 44
    .line 45
    .line 46
    :cond_7
    invoke-interface/range {p0 .. p8}, Lg00/h;->t(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z

    .line 47
    move-result p0

    .line 48
    return p0

    .line 49
    .line 50
    :cond_8
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 51
    .line 52
    const-string p1, "Super calls with default arguments not supported in this target, function: jumpMarginOrderCenter"

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p0
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
.end method

.method public static synthetic e(Lg00/h;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    if-nez p9, :cond_7

    .line 3
    .line 4
    and-int/lit8 p9, p8, 0x1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p9, :cond_0

    .line 8
    move-object p1, v0

    .line 9
    .line 10
    :cond_0
    and-int/lit8 p9, p8, 0x2

    .line 11
    .line 12
    if-eqz p9, :cond_1

    .line 13
    move-object p2, v0

    .line 14
    .line 15
    :cond_1
    and-int/lit8 p9, p8, 0x4

    .line 16
    .line 17
    if-eqz p9, :cond_2

    .line 18
    move-object p3, v0

    .line 19
    .line 20
    :cond_2
    and-int/lit8 p9, p8, 0x8

    .line 21
    .line 22
    if-eqz p9, :cond_3

    .line 23
    move-object p4, v0

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p9, p8, 0x10

    .line 26
    .line 27
    if-eqz p9, :cond_4

    .line 28
    move-object p5, v0

    .line 29
    .line 30
    :cond_4
    and-int/lit8 p9, p8, 0x20

    .line 31
    .line 32
    if-eqz p9, :cond_5

    .line 33
    move-object p6, v0

    .line 34
    .line 35
    :cond_5
    and-int/lit8 p8, p8, 0x40

    .line 36
    .line 37
    if-eqz p8, :cond_6

    .line 38
    move-object p7, v0

    .line 39
    .line 40
    .line 41
    :cond_6
    invoke-interface/range {p0 .. p7}, Lg00/h;->u(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z

    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    .line 45
    :cond_7
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 46
    .line 47
    const-string p1, "Super calls with default arguments not supported in this target, function: jumpOpenMarginEtfTrade"

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p0
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
.end method

.method public static synthetic f(Lg00/h;ZLjava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    if-nez p7, :cond_5

    .line 3
    .line 4
    and-int/lit8 p7, p6, 0x1

    .line 5
    .line 6
    if-eqz p7, :cond_0

    .line 7
    const/4 p1, 0x0

    .line 8
    .line 9
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    if-eqz p7, :cond_1

    .line 13
    move-object p2, v0

    .line 14
    .line 15
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 16
    .line 17
    if-eqz p7, :cond_2

    .line 18
    move-object p3, v0

    .line 19
    .line 20
    :cond_2
    and-int/lit8 p7, p6, 0x8

    .line 21
    .line 22
    if-eqz p7, :cond_3

    .line 23
    move-object p4, v0

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p6, p6, 0x10

    .line 26
    .line 27
    if-eqz p6, :cond_4

    .line 28
    move-object p7, v0

    .line 29
    move-object p5, p3

    .line 30
    move-object p6, p4

    .line 31
    move p3, p1

    .line 32
    move-object p4, p2

    .line 33
    move-object p2, p0

    .line 34
    goto :goto_0

    .line 35
    :cond_4
    move-object p7, p5

    .line 36
    move-object p6, p4

    .line 37
    move-object p4, p2

    .line 38
    move-object p5, p3

    .line 39
    move-object p2, p0

    .line 40
    move p3, p1

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-interface/range {p2 .. p7}, Lg00/h;->x(ZLjava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z

    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    .line 47
    :cond_5
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 48
    .line 49
    const-string p1, "Super calls with default arguments not supported in this target, function: jumpTradeSetting"

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 53
    throw p0
.end method
