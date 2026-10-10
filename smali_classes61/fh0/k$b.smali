.class public Lfh0/k$b;
.super Lkh0/b;
.source "HtmlBlockParser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfh0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lkh0/b;-><init>()V

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public a(Lkh0/h;Lkh0/g;)Lkh0/f;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Lkh0/h;->b()I

    .line 6
    move-result v2

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lkh0/h;->getLine()Ljava/lang/CharSequence;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lkh0/h;->c()I

    .line 14
    move-result v4

    .line 15
    const/4 v5, 0x4

    .line 16
    .line 17
    if-ge v4, v5, :cond_2

    .line 18
    .line 19
    .line 20
    invoke-interface {v3, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 21
    move-result v4

    .line 22
    .line 23
    const/16 v5, 0x3c

    .line 24
    .line 25
    if-ne v4, v5, :cond_2

    .line 26
    move v4, v1

    .line 27
    :goto_0
    const/4 v5, 0x7

    .line 28
    .line 29
    if-gt v4, v5, :cond_2

    .line 30
    .line 31
    if-ne v4, v5, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-interface {p2}, Lkh0/g;->a()Lkh0/d;

    .line 35
    move-result-object v5

    .line 36
    .line 37
    .line 38
    invoke-interface {v5}, Lkh0/d;->c()Lih0/a;

    .line 39
    move-result-object v5

    .line 40
    .line 41
    instance-of v5, v5, Lih0/u;

    .line 42
    .line 43
    if-eqz v5, :cond_0

    .line 44
    goto :goto_1

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-static {}, Lfh0/k;->i()[[Ljava/util/regex/Pattern;

    .line 48
    move-result-object v5

    .line 49
    .line 50
    aget-object v5, v5, v4

    .line 51
    .line 52
    aget-object v5, v5, v0

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lfh0/k;->i()[[Ljava/util/regex/Pattern;

    .line 56
    move-result-object v6

    .line 57
    .line 58
    aget-object v6, v6, v4

    .line 59
    .line 60
    aget-object v6, v6, v1

    .line 61
    .line 62
    .line 63
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 64
    move-result v7

    .line 65
    .line 66
    .line 67
    invoke-interface {v3, v2, v7}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 68
    move-result-object v7

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 72
    move-result-object v5

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    .line 76
    move-result v5

    .line 77
    .line 78
    if-eqz v5, :cond_1

    .line 79
    .line 80
    new-instance p2, Lfh0/k;

    .line 81
    const/4 v2, 0x0

    .line 82
    .line 83
    .line 84
    invoke-direct {p2, v6, v2}, Lfh0/k;-><init>(Ljava/util/regex/Pattern;Lfh0/k$a;)V

    .line 85
    .line 86
    new-array v1, v1, [Lkh0/d;

    .line 87
    .line 88
    aput-object p2, v1, v0

    .line 89
    .line 90
    .line 91
    invoke-static {v1}, Lkh0/f;->d([Lkh0/d;)Lkh0/f;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    .line 95
    invoke-interface {p1}, Lkh0/h;->getIndex()I

    .line 96
    move-result p1

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, p1}, Lkh0/f;->b(I)Lkh0/f;

    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    :cond_1
    :goto_1
    add-int/2addr v4, v1

    .line 103
    goto :goto_0

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-static {}, Lkh0/f;->c()Lkh0/f;

    .line 107
    move-result-object p1

    .line 108
    return-object p1
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
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
.end method
