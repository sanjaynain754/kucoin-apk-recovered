.class public Lfh0/j$a;
.super Lkh0/b;
.source "HeadingParser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfh0/j;
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
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Lkh0/h;->c()I

    .line 6
    move-result v2

    .line 7
    .line 8
    sget v3, Lhh0/d;->a:I

    .line 9
    .line 10
    if-lt v2, v3, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lkh0/f;->c()Lkh0/f;

    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {p1}, Lkh0/h;->getLine()Ljava/lang/CharSequence;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Lkh0/h;->b()I

    .line 23
    move-result p1

    .line 24
    .line 25
    .line 26
    invoke-static {v2, p1}, Lfh0/j;->i(Ljava/lang/CharSequence;I)Lfh0/j;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    new-array p1, v1, [Lkh0/d;

    .line 32
    .line 33
    aput-object v3, p1, v0

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lkh0/f;->d([Lkh0/d;)Lkh0/f;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 41
    move-result p2

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lkh0/f;->b(I)Lkh0/f;

    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-static {v2, p1}, Lfh0/j;->j(Ljava/lang/CharSequence;I)I

    .line 50
    move-result p1

    .line 51
    .line 52
    if-lez p1, :cond_2

    .line 53
    .line 54
    .line 55
    invoke-interface {p2}, Lkh0/g;->b()Ljava/lang/CharSequence;

    .line 56
    move-result-object p2

    .line 57
    .line 58
    if-eqz p2, :cond_2

    .line 59
    .line 60
    .line 61
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 62
    move-result-object p2

    .line 63
    .line 64
    new-instance v3, Lfh0/j;

    .line 65
    .line 66
    .line 67
    invoke-direct {v3, p1, p2}, Lfh0/j;-><init>(ILjava/lang/String;)V

    .line 68
    .line 69
    new-array p1, v1, [Lkh0/d;

    .line 70
    .line 71
    aput-object v3, p1, v0

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lkh0/f;->d([Lkh0/d;)Lkh0/f;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    .line 78
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 79
    move-result p2

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p2}, Lkh0/f;->b(I)Lkh0/f;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lkh0/f;->e()Lkh0/f;

    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    .line 90
    .line 91
    :cond_2
    invoke-static {}, Lkh0/f;->c()Lkh0/f;

    .line 92
    move-result-object p1

    .line 93
    return-object p1
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
