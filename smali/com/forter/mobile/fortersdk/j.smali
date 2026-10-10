.class public final Lcom/forter/mobile/fortersdk/j;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/text/DecimalFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/text/DecimalFormat;

    .line 3
    .line 4
    const-string v1, "#"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    sput-object v0, Lcom/forter/mobile/fortersdk/j;->a:Ljava/text/DecimalFormat;

    .line 10
    return-void
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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/forter/mobile/fortersdk/j;->a:Ljava/text/DecimalFormat;

    .line 6
    .line 7
    sget-object v1, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/text/DecimalFormat;->setRoundingMode(Ljava/math/RoundingMode;)V

    .line 11
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/forter/mobile/fortersdk/aj;I)Lcom/forter/mobile/fortersdk/ae;
    .locals 6

    .line 1
    .line 2
    if-gtz p4, :cond_0

    .line 3
    .line 4
    new-instance p1, Lcom/forter/mobile/fortersdk/ae;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1}, Lcom/forter/mobile/fortersdk/ae;-><init>()V

    .line 8
    return-object p1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    .line 11
    :try_start_0
    sget-object v1, Lcom/forter/mobile/fortersdk/j;->a:Ljava/text/DecimalFormat;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    move-result-wide v2

    .line 16
    .line 17
    .line 18
    const-wide/32 v4, 0xea60

    .line 19
    div-long/2addr v2, v4

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    const-string v3, "https://#SID#.cdn4.forter.com/mob/v3/#SID#/prop.json?t=#TS#&s=#BS#&u=#UID#&r=#RT#&seed=#SEED#&bn=#BNUMBER#"

    .line 34
    .line 35
    const-string v4, "#SID#"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v4, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    const-string v4, "#UID#"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v4, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    const-string v4, "#TS#"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v4, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    const-string v3, "#RT#"

    .line 54
    .line 55
    .line 56
    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 57
    move-result-object v4

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    const-string v3, "#BS#"

    .line 64
    .line 65
    const-string v4, "5d28616add6fd8b22170274424d204a7"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    const-string v3, "#BNUMBER#"

    .line 72
    .line 73
    const-string v4, "75"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    const-string v3, "#BNAME#"

    .line 80
    .line 81
    const-string v4, "2.4.12"

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 85
    move-result-object v1

    .line 86
    .line 87
    const-string v3, "#SEED#"

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    const-string v2, "Fetching conf from URL: "

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    move-result-object v3

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3, v1, v0, v0}, Lcom/forter/mobile/fortersdk/aj;->a(Ljava/lang/String;Ljava/util/Map;Lcom/forter/mobile/fortersdk/l;)Lcom/forter/mobile/fortersdk/aj$d;

    .line 107
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 108
    .line 109
    :try_start_1
    new-instance v2, Lcom/forter/mobile/fortersdk/r;

    .line 110
    .line 111
    .line 112
    invoke-direct {v2, v1}, Lcom/forter/mobile/fortersdk/r;-><init>(Lcom/forter/mobile/fortersdk/aj$d;)V

    .line 113
    .line 114
    iget v3, v2, Lcom/forter/mobile/fortersdk/r;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 115
    .line 116
    const/16 v4, 0x12c

    .line 117
    .line 118
    if-ge v3, v4, :cond_2

    .line 119
    const/4 v4, -0x1

    .line 120
    .line 121
    if-eq v3, v4, :cond_2

    .line 122
    .line 123
    :try_start_2
    iget-object v2, v2, Lcom/forter/mobile/fortersdk/r;->b:Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    invoke-static {v2}, Lcom/forter/mobile/fortersdk/bk;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    move-result-object v2

    .line 128
    .line 129
    if-eqz v2, :cond_1

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 133
    move-result v3

    .line 134
    .line 135
    if-lez v3, :cond_1

    .line 136
    .line 137
    new-instance v3, Lcom/forter/mobile/fortersdk/ae;

    .line 138
    .line 139
    .line 140
    invoke-direct {v3, v2}, Lcom/forter/mobile/fortersdk/ae;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 141
    .line 142
    .line 143
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/p;->d(Ljava/io/Closeable;)V

    .line 144
    return-object v3

    .line 145
    .line 146
    .line 147
    :cond_1
    :try_start_3
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->a()V

    .line 148
    .line 149
    add-int/lit8 v2, p4, -0x1

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, p1, p2, p3, v2}, Lcom/forter/mobile/fortersdk/j;->a(Ljava/lang/String;Ljava/lang/String;Lcom/forter/mobile/fortersdk/aj;I)Lcom/forter/mobile/fortersdk/ae;

    .line 153
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 154
    .line 155
    .line 156
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/p;->d(Ljava/io/Closeable;)V

    .line 157
    return-object p1

    .line 158
    .line 159
    .line 160
    :catchall_0
    :try_start_4
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 161
    .line 162
    add-int/lit8 v2, p4, -0x1

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, p1, p2, p3, v2}, Lcom/forter/mobile/fortersdk/j;->a(Ljava/lang/String;Ljava/lang/String;Lcom/forter/mobile/fortersdk/aj;I)Lcom/forter/mobile/fortersdk/ae;

    .line 166
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 167
    .line 168
    .line 169
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/p;->d(Ljava/io/Closeable;)V

    .line 170
    return-object p1

    .line 171
    .line 172
    :cond_2
    add-int/lit8 v2, p4, -0x1

    .line 173
    .line 174
    .line 175
    :try_start_5
    invoke-virtual {p0, p1, p2, p3, v2}, Lcom/forter/mobile/fortersdk/j;->a(Ljava/lang/String;Ljava/lang/String;Lcom/forter/mobile/fortersdk/aj;I)Lcom/forter/mobile/fortersdk/ae;

    .line 176
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 177
    .line 178
    .line 179
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/p;->d(Ljava/io/Closeable;)V

    .line 180
    return-object p1

    .line 181
    :catchall_1
    move-object v1, v0

    .line 182
    .line 183
    .line 184
    :catchall_2
    :try_start_6
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 185
    .line 186
    .line 187
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/p;->d(Ljava/io/Closeable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 188
    .line 189
    add-int/lit8 p4, p4, -0x1

    .line 190
    .line 191
    .line 192
    :try_start_7
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/forter/mobile/fortersdk/j;->a(Ljava/lang/String;Ljava/lang/String;Lcom/forter/mobile/fortersdk/aj;I)Lcom/forter/mobile/fortersdk/ae;

    .line 193
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 194
    .line 195
    .line 196
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/p;->d(Ljava/io/Closeable;)V

    .line 197
    return-object p1

    .line 198
    :catchall_3
    move-exception p1

    .line 199
    goto :goto_0

    .line 200
    :catchall_4
    move-exception p1

    .line 201
    move-object v0, v1

    .line 202
    .line 203
    .line 204
    :goto_0
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/p;->d(Ljava/io/Closeable;)V

    .line 205
    throw p1
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
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method
