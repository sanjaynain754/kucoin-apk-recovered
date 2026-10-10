.class public final Lg00/c$a;
.super Ljava/lang/Object;
.source "KCRouterBridgeFeedCall.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg00/c;
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
.method public static synthetic a(Lg00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    if-nez p10, :cond_6

    .line 3
    .line 4
    and-int/lit8 p10, p9, 0x4

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p10, :cond_0

    .line 8
    move-object p3, v0

    .line 9
    .line 10
    :cond_0
    and-int/lit8 p10, p9, 0x8

    .line 11
    .line 12
    if-eqz p10, :cond_1

    .line 13
    move-object p4, v0

    .line 14
    .line 15
    :cond_1
    and-int/lit8 p10, p9, 0x10

    .line 16
    .line 17
    if-eqz p10, :cond_2

    .line 18
    move-object p5, v0

    .line 19
    .line 20
    :cond_2
    and-int/lit8 p10, p9, 0x20

    .line 21
    .line 22
    if-eqz p10, :cond_3

    .line 23
    move-object p6, v0

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p10, p9, 0x40

    .line 26
    .line 27
    if-eqz p10, :cond_4

    .line 28
    move-object p7, v0

    .line 29
    .line 30
    :cond_4
    and-int/lit16 p9, p9, 0x80

    .line 31
    .line 32
    if-eqz p9, :cond_5

    .line 33
    move-object p8, v0

    .line 34
    .line 35
    .line 36
    :cond_5
    invoke-interface/range {p0 .. p8}, Lg00/c;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;)Z

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
    const-string p1, "Super calls with default arguments not supported in this target, function: jumpLiveRoom"

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 46
    throw p0
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
.end method
