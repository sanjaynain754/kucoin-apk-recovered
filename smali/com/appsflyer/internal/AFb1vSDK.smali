.class public final Lcom/appsflyer/internal/AFb1vSDK;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final getRevenue:[Ljava/lang/String;


# direct methods
.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    if-eqz p1, :cond_5

    .line 7
    array-length v1, p1

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    goto :goto_2

    .line 11
    .line 12
    :cond_0
    const-string v1, "[\\w]{1,45}"

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    array-length v3, p1

    .line 23
    const/4 v4, 0x0

    .line 24
    move v5, v4

    .line 25
    .line 26
    :goto_0
    if-ge v5, v3, :cond_2

    .line 27
    .line 28
    aget-object v6, p1, v5

    .line 29
    .line 30
    if-eqz v6, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 34
    move-result-object v7

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    .line 38
    move-result v7

    .line 39
    .line 40
    if-eqz v7, :cond_1

    .line 41
    .line 42
    .line 43
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 44
    move-result-object v7

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 48
    move-result-object v6

    .line 49
    .line 50
    .line 51
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    goto :goto_1

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    move-result-object v6

    .line 57
    .line 58
    const-string v7, "Invalid partner name: "

    .line 59
    .line 60
    .line 61
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    move-result-object v6

    .line 63
    .line 64
    .line 65
    invoke-static {v6}, Lcom/appsflyer/AFLogger;->afWarnLog(Ljava/lang/String;)V

    .line 66
    .line 67
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_2
    const-string p1, "all"

    .line 71
    .line 72
    .line 73
    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 74
    move-result v1

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    .line 79
    filled-new-array {p1}, [Ljava/lang/String;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    iput-object p1, p0, Lcom/appsflyer/internal/AFb1vSDK;->getRevenue:[Ljava/lang/String;

    .line 83
    return-void

    .line 84
    .line 85
    .line 86
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 87
    move-result p1

    .line 88
    .line 89
    if-nez p1, :cond_4

    .line 90
    .line 91
    new-array p1, v4, [Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    invoke-interface {v2, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    check-cast p1, [Ljava/lang/String;

    .line 98
    .line 99
    iput-object p1, p0, Lcom/appsflyer/internal/AFb1vSDK;->getRevenue:[Ljava/lang/String;

    .line 100
    return-void

    .line 101
    .line 102
    :cond_4
    iput-object v0, p0, Lcom/appsflyer/internal/AFb1vSDK;->getRevenue:[Ljava/lang/String;

    .line 103
    return-void

    .line 104
    .line 105
    :cond_5
    :goto_2
    iput-object v0, p0, Lcom/appsflyer/internal/AFb1vSDK;->getRevenue:[Ljava/lang/String;

    .line 106
    return-void
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method
