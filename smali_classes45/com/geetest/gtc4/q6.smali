.class public final Lcom/geetest/gtc4/q6;
.super Lcom/geetest/gtc4/l0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/geetest/gtc4/d6;Lcom/geetest/gtc4/d6;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/geetest/gtc4/l0;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/geetest/gtc4/o7;

    .line 6
    .line 7
    const-wide/16 v1, 0x1e

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Lcom/geetest/gtc4/o7;-><init>(J)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/geetest/gtc4/f3;->b:Lcom/geetest/gtc4/o7;

    .line 13
    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    iget-object v0, p2, Lcom/geetest/gtc4/d6;->c:Ljava/math/BigInteger;

    .line 19
    .line 20
    sget-object v1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lcom/geetest/gtc4/l0;->d:Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    iget-object p1, p0, Lcom/geetest/gtc4/l0;->d:Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    return-void

    .line 38
    .line 39
    :cond_0
    new-instance p1, Lcom/geetest/gtc4/q1;

    .line 40
    .line 41
    const-string p2, "Denominator is zero"

    .line 42
    .line 43
    .line 44
    invoke-direct {p1, p2}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 45
    throw p1

    .line 46
    .line 47
    :cond_1
    new-instance p1, Lcom/geetest/gtc4/q1;

    .line 48
    .line 49
    const-string p2, "Denominator is null"

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, p2}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 53
    throw p1

    .line 54
    .line 55
    :cond_2
    new-instance p1, Lcom/geetest/gtc4/q1;

    .line 56
    .line 57
    const-string p2, "Numerator is null"

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, p2}, Lcom/geetest/gtc4/q1;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
.end method
