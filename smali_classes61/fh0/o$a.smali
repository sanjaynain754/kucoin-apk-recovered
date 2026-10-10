.class public Lfh0/o$a;
.super Lkh0/b;
.source "ListBlockParser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfh0/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
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
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-interface {p2}, Lkh0/g;->a()Lkh0/d;

    .line 6
    move-result-object v2

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lkh0/h;->c()I

    .line 10
    move-result v3

    .line 11
    .line 12
    sget v4, Lhh0/d;->a:I

    .line 13
    .line 14
    if-lt v3, v4, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lkh0/f;->c()Lkh0/f;

    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-interface {p1}, Lkh0/h;->b()I

    .line 23
    move-result v3

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Lkh0/h;->getColumn()I

    .line 27
    move-result v4

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Lkh0/h;->c()I

    .line 31
    move-result v5

    .line 32
    add-int/2addr v4, v5

    .line 33
    .line 34
    .line 35
    invoke-interface {p2}, Lkh0/g;->b()Ljava/lang/CharSequence;

    .line 36
    move-result-object p2

    .line 37
    .line 38
    if-eqz p2, :cond_1

    .line 39
    move p2, v1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move p2, v0

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-interface {p1}, Lkh0/h;->getLine()Ljava/lang/CharSequence;

    .line 45
    move-result-object v5

    .line 46
    .line 47
    .line 48
    invoke-static {v5, v3, v4, p2}, Lfh0/o;->i(Ljava/lang/CharSequence;IIZ)Lfh0/o$b;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    if-nez p2, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lkh0/f;->c()Lkh0/f;

    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    .line 58
    :cond_2
    iget v3, p2, Lfh0/o$b;->b:I

    .line 59
    .line 60
    new-instance v4, Lfh0/p;

    .line 61
    .line 62
    .line 63
    invoke-interface {p1}, Lkh0/h;->getColumn()I

    .line 64
    move-result p1

    .line 65
    .line 66
    sub-int p1, v3, p1

    .line 67
    .line 68
    .line 69
    invoke-direct {v4, p1}, Lfh0/p;-><init>(I)V

    .line 70
    .line 71
    instance-of p1, v2, Lfh0/o;

    .line 72
    .line 73
    if-eqz p1, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-interface {v2}, Lkh0/d;->c()Lih0/a;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    check-cast p1, Lih0/q;

    .line 80
    .line 81
    iget-object v2, p2, Lfh0/o$b;->a:Lih0/q;

    .line 82
    .line 83
    .line 84
    invoke-static {p1, v2}, Lfh0/o;->j(Lih0/q;Lih0/q;)Z

    .line 85
    move-result p1

    .line 86
    .line 87
    if-nez p1, :cond_3

    .line 88
    goto :goto_1

    .line 89
    .line 90
    :cond_3
    new-array p1, v1, [Lkh0/d;

    .line 91
    .line 92
    aput-object v4, p1, v0

    .line 93
    .line 94
    .line 95
    invoke-static {p1}, Lkh0/f;->d([Lkh0/d;)Lkh0/f;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v3}, Lkh0/f;->a(I)Lkh0/f;

    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    .line 103
    :cond_4
    :goto_1
    new-instance p1, Lfh0/o;

    .line 104
    .line 105
    iget-object v2, p2, Lfh0/o$b;->a:Lih0/q;

    .line 106
    .line 107
    .line 108
    invoke-direct {p1, v2}, Lfh0/o;-><init>(Lih0/q;)V

    .line 109
    .line 110
    iget-object p2, p2, Lfh0/o$b;->a:Lih0/q;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2, v1}, Lih0/q;->o(Z)V

    .line 114
    const/4 p2, 0x2

    .line 115
    .line 116
    new-array p2, p2, [Lkh0/d;

    .line 117
    .line 118
    aput-object p1, p2, v0

    .line 119
    .line 120
    aput-object v4, p2, v1

    .line 121
    .line 122
    .line 123
    invoke-static {p2}, Lkh0/f;->d([Lkh0/d;)Lkh0/f;

    .line 124
    move-result-object p1

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v3}, Lkh0/f;->a(I)Lkh0/f;

    .line 128
    move-result-object p1

    .line 129
    return-object p1
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
