.class public Lorg/springframework/web/util/pattern/j;
.super Lorg/springframework/web/util/pattern/e;
.source "WildcardPathElement.java"


# direct methods
.method public constructor <init>(IC)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lorg/springframework/web/util/pattern/e;-><init>(IC)V

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
    .line 4
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

.method public c()I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x64

    .line 3
    return v0
    .line 4
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

.method public e(ILorg/springframework/web/util/pattern/f$a;)Z
    .locals 4

    .line 1
    .line 2
    iget v0, p2, Lorg/springframework/web/util/pattern/f$a;->c:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-ge p1, v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p2, Lorg/springframework/web/util/pattern/f$a;->b:Ljava/util/List;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lvh0/b$a;

    .line 14
    .line 15
    instance-of v2, v0, Lvh0/b$c;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    return v1

    .line 19
    .line 20
    :cond_0
    check-cast v0, Lvh0/b$c;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Lvh0/b$c;->a()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    add-int/lit8 p1, p1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {p0}, Lorg/springframework/web/util/pattern/e;->d()Z

    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_5

    .line 36
    .line 37
    iget-boolean v2, p2, Lorg/springframework/web/util/pattern/f$a;->g:Z

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    iput p1, p2, Lorg/springframework/web/util/pattern/f$a;->h:I

    .line 42
    return v3

    .line 43
    .line 44
    :cond_2
    iget v2, p2, Lorg/springframework/web/util/pattern/f$a;->c:I

    .line 45
    .line 46
    if-ne p1, v2, :cond_3

    .line 47
    return v3

    .line 48
    .line 49
    .line 50
    :cond_3
    invoke-virtual {p2}, Lorg/springframework/web/util/pattern/f$a;->b()Z

    .line 51
    move-result v2

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 59
    move-result v0

    .line 60
    .line 61
    if-lez v0, :cond_4

    .line 62
    .line 63
    add-int/lit8 v0, p1, 0x1

    .line 64
    .line 65
    iget v2, p2, Lorg/springframework/web/util/pattern/f$a;->c:I

    .line 66
    .line 67
    if-ne v0, v2, :cond_4

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p1}, Lorg/springframework/web/util/pattern/f$a;->c(I)Z

    .line 71
    move-result p1

    .line 72
    .line 73
    if-eqz p1, :cond_4

    .line 74
    return v3

    .line 75
    :cond_4
    return v1

    .line 76
    .line 77
    :cond_5
    if-eqz v0, :cond_7

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 81
    move-result v0

    .line 82
    .line 83
    if-nez v0, :cond_6

    .line 84
    goto :goto_1

    .line 85
    .line 86
    :cond_6
    iget-object v0, p0, Lorg/springframework/web/util/pattern/e;->c:Lorg/springframework/web/util/pattern/e;

    .line 87
    .line 88
    if-eqz v0, :cond_7

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, p1, p2}, Lorg/springframework/web/util/pattern/e;->e(ILorg/springframework/web/util/pattern/f$a;)Z

    .line 92
    move-result p1

    .line 93
    .line 94
    if-eqz p1, :cond_7

    .line 95
    return v3

    .line 96
    :cond_7
    :goto_1
    return v1
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

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "Wildcard(*)"

    .line 3
    return-object v0
    .line 4
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
