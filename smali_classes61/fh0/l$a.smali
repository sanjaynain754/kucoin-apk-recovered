.class public Lfh0/l$a;
.super Lkh0/b;
.source "IndentedCodeBlockParser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfh0/l;
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
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lkh0/h;->c()I

    .line 4
    move-result p2

    .line 5
    .line 6
    sget v0, Lhh0/d;->a:I

    .line 7
    .line 8
    if-lt p2, v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lkh0/h;->a()Z

    .line 12
    move-result p2

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Lkh0/h;->d()Lkh0/d;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    .line 21
    invoke-interface {p2}, Lkh0/d;->c()Lih0/a;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    instance-of p2, p2, Lih0/u;

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    new-instance p2, Lfh0/l;

    .line 29
    .line 30
    .line 31
    invoke-direct {p2}, Lfh0/l;-><init>()V

    .line 32
    const/4 v0, 0x1

    .line 33
    .line 34
    new-array v0, v0, [Lkh0/d;

    .line 35
    const/4 v1, 0x0

    .line 36
    .line 37
    aput-object p2, v0, v1

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lkh0/f;->d([Lkh0/d;)Lkh0/f;

    .line 41
    move-result-object p2

    .line 42
    .line 43
    .line 44
    invoke-interface {p1}, Lkh0/h;->getColumn()I

    .line 45
    move-result p1

    .line 46
    .line 47
    sget v0, Lhh0/d;->a:I

    .line 48
    add-int/2addr p1, v0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, p1}, Lkh0/f;->a(I)Lkh0/f;

    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-static {}, Lkh0/f;->c()Lkh0/f;

    .line 57
    move-result-object p1

    .line 58
    return-object p1
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
    .line 78
    .line 79
    .line 80
    .line 81
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
