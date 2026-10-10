.class public Lm1/f;
.super Ljava/lang/Object;
.source "CircleShapeParser.java"


# static fields
.field public static final a:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-string v0, "hd"

    .line 3
    .line 4
    const-string v1, "d"

    .line 5
    .line 6
    const-string v2, "nm"

    .line 7
    .line 8
    const-string v3, "p"

    .line 9
    .line 10
    const-string v4, "s"

    .line 11
    .line 12
    .line 13
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/airbnb/lottie/parser/moshi/JsonReader$a;->a([Ljava/lang/String;)Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sput-object v0, Lm1/f;->a:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 21
    return-void
    .line 22
.end method

.method public static a(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;I)Lj1/b;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x3

    .line 4
    .line 5
    if-ne p2, v2, :cond_0

    .line 6
    move p2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p2, v0

    .line 9
    :goto_0
    const/4 v3, 0x0

    .line 10
    move v8, p2

    .line 11
    move v9, v0

    .line 12
    move-object v5, v3

    .line 13
    move-object v6, v5

    .line 14
    move-object v7, v6

    .line 15
    .line 16
    .line 17
    :goto_1
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->j()Z

    .line 18
    move-result p2

    .line 19
    .line 20
    if-eqz p2, :cond_7

    .line 21
    .line 22
    sget-object p2, Lm1/f;->a:Lcom/airbnb/lottie/parser/moshi/JsonReader$a;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->v(Lcom/airbnb/lottie/parser/moshi/JsonReader$a;)I

    .line 26
    move-result p2

    .line 27
    .line 28
    if-eqz p2, :cond_6

    .line 29
    .line 30
    if-eq p2, v1, :cond_5

    .line 31
    const/4 v3, 0x2

    .line 32
    .line 33
    if-eq p2, v3, :cond_4

    .line 34
    .line 35
    if-eq p2, v2, :cond_3

    .line 36
    const/4 v3, 0x4

    .line 37
    .line 38
    if-eq p2, v3, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->w()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->x()V

    .line 45
    goto :goto_1

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->m()I

    .line 49
    move-result p2

    .line 50
    .line 51
    if-ne p2, v2, :cond_2

    .line 52
    move v8, v1

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move v8, v0

    .line 55
    goto :goto_1

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->k()Z

    .line 59
    move-result v9

    .line 60
    goto :goto_1

    .line 61
    .line 62
    .line 63
    :cond_4
    invoke-static {p0, p1}, Lm1/d;->i(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Li1/f;

    .line 64
    move-result-object v7

    .line 65
    goto :goto_1

    .line 66
    .line 67
    .line 68
    :cond_5
    invoke-static {p0, p1}, Lm1/a;->b(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/h;)Li1/m;

    .line 69
    move-result-object v6

    .line 70
    goto :goto_1

    .line 71
    .line 72
    .line 73
    :cond_6
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/JsonReader;->o()Ljava/lang/String;

    .line 74
    move-result-object v5

    .line 75
    goto :goto_1

    .line 76
    .line 77
    :cond_7
    new-instance v4, Lj1/b;

    .line 78
    .line 79
    .line 80
    invoke-direct/range {v4 .. v9}, Lj1/b;-><init>(Ljava/lang/String;Li1/m;Li1/f;ZZ)V

    .line 81
    return-object v4
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
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
.end method
