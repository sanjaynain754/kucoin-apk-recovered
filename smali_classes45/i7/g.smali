.class public Li7/g;
.super Lf7/b;
.source "ReaderBasedJsonParser.java"


# static fields
.field public static final c0:I

.field public static final d0:I

.field public static final e0:I

.field public static final f0:I

.field public static final g0:I

.field public static final h0:I

.field public static final i0:I

.field public static final j0:I

.field public static final k0:[I


# instance fields
.field public S:Ljava/io/Reader;

.field public T:[C

.field public U:Z

.field public V:Lcom/fasterxml/jackson/core/g;

.field public final W:Lk7/b;

.field public final X:I

.field public Y:Z

.field public Z:J

.field public a0:I

.field public b0:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_TRAILING_COMMA:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 6
    move-result v0

    .line 7
    .line 8
    sput v0, Li7/g;->c0:I

    .line 9
    .line 10
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_NUMERIC_LEADING_ZEROS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 14
    move-result v0

    .line 15
    .line 16
    sput v0, Li7/g;->d0:I

    .line 17
    .line 18
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_NON_NUMERIC_NUMBERS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 22
    move-result v0

    .line 23
    .line 24
    sput v0, Li7/g;->e0:I

    .line 25
    .line 26
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_MISSING_VALUES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 30
    move-result v0

    .line 31
    .line 32
    sput v0, Li7/g;->f0:I

    .line 33
    .line 34
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_SINGLE_QUOTES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 38
    move-result v0

    .line 39
    .line 40
    sput v0, Li7/g;->g0:I

    .line 41
    .line 42
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_UNQUOTED_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 46
    move-result v0

    .line 47
    .line 48
    sput v0, Li7/g;->h0:I

    .line 49
    .line 50
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_COMMENTS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 54
    move-result v0

    .line 55
    .line 56
    sput v0, Li7/g;->i0:I

    .line 57
    .line 58
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_YAML_COMMENTS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 62
    move-result v0

    .line 63
    .line 64
    sput v0, Li7/g;->j0:I

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->h()[I

    .line 68
    move-result-object v0

    .line 69
    .line 70
    sput-object v0, Li7/g;->k0:[I

    .line 71
    return-void
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/io/d;ILjava/io/Reader;Lcom/fasterxml/jackson/core/g;Lk7/b;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Lf7/b;-><init>(Lcom/fasterxml/jackson/core/io/d;I)V

    .line 13
    iput-object p3, p0, Li7/g;->S:Ljava/io/Reader;

    .line 14
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/io/d;->h()[C

    move-result-object p1

    iput-object p1, p0, Li7/g;->T:[C

    const/4 p1, 0x0

    .line 15
    iput p1, p0, Lf7/b;->s:I

    .line 16
    iput p1, p0, Lf7/b;->t:I

    .line 17
    iput-object p4, p0, Li7/g;->V:Lcom/fasterxml/jackson/core/g;

    .line 18
    iput-object p5, p0, Li7/g;->W:Lk7/b;

    .line 19
    invoke-virtual {p5}, Lk7/b;->m()I

    move-result p1

    iput p1, p0, Li7/g;->X:I

    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, Li7/g;->U:Z

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/io/d;ILjava/io/Reader;Lcom/fasterxml/jackson/core/g;Lk7/b;[CIIZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf7/b;-><init>(Lcom/fasterxml/jackson/core/io/d;I)V

    .line 2
    iput-object p3, p0, Li7/g;->S:Ljava/io/Reader;

    .line 3
    iput-object p4, p0, Li7/g;->V:Lcom/fasterxml/jackson/core/g;

    .line 4
    iput-object p6, p0, Li7/g;->T:[C

    .line 5
    iput p7, p0, Lf7/b;->s:I

    .line 6
    iput p8, p0, Lf7/b;->t:I

    .line 7
    iput p7, p0, Lf7/b;->w:I

    neg-int p1, p7

    int-to-long p1, p1

    .line 8
    iput-wide p1, p0, Lf7/b;->u:J

    .line 9
    iput-object p5, p0, Li7/g;->W:Lk7/b;

    .line 10
    invoke-virtual {p5}, Lk7/b;->m()I

    move-result p1

    iput p1, p0, Li7/g;->X:I

    .line 11
    iput-boolean p9, p0, Li7/g;->U:Z

    return-void
.end method

.method private final Y1()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x4

    .line 5
    .line 6
    iget v2, p0, Lf7/b;->t:I

    .line 7
    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Li7/g;->T:[C

    .line 11
    .line 12
    aget-char v2, v1, v0

    .line 13
    .line 14
    const/16 v3, 0x61

    .line 15
    .line 16
    if-ne v2, v3, :cond_1

    .line 17
    .line 18
    add-int/lit8 v2, v0, 0x1

    .line 19
    .line 20
    aget-char v2, v1, v2

    .line 21
    .line 22
    const/16 v3, 0x6c

    .line 23
    .line 24
    if-ne v2, v3, :cond_1

    .line 25
    .line 26
    add-int/lit8 v2, v0, 0x2

    .line 27
    .line 28
    aget-char v2, v1, v2

    .line 29
    .line 30
    const/16 v3, 0x73

    .line 31
    .line 32
    if-ne v2, v3, :cond_1

    .line 33
    .line 34
    add-int/lit8 v2, v0, 0x3

    .line 35
    .line 36
    aget-char v2, v1, v2

    .line 37
    .line 38
    const/16 v3, 0x65

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x4

    .line 43
    .line 44
    aget-char v1, v1, v0

    .line 45
    .line 46
    const/16 v2, 0x30

    .line 47
    .line 48
    if-lt v1, v2, :cond_0

    .line 49
    .line 50
    const/16 v2, 0x5d

    .line 51
    .line 52
    if-eq v1, v2, :cond_0

    .line 53
    .line 54
    const/16 v2, 0x7d

    .line 55
    .line 56
    if-ne v1, v2, :cond_1

    .line 57
    .line 58
    :cond_0
    iput v0, p0, Lf7/b;->s:I

    .line 59
    return-void

    .line 60
    .line 61
    :cond_1
    const-string v0, "false"

    .line 62
    const/4 v1, 0x1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0, v1}, Li7/g;->a2(Ljava/lang/String;I)V

    .line 66
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method private final Z1()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x3

    .line 5
    .line 6
    iget v2, p0, Lf7/b;->t:I

    .line 7
    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Li7/g;->T:[C

    .line 11
    .line 12
    aget-char v2, v1, v0

    .line 13
    .line 14
    const/16 v3, 0x75

    .line 15
    .line 16
    if-ne v2, v3, :cond_1

    .line 17
    .line 18
    add-int/lit8 v2, v0, 0x1

    .line 19
    .line 20
    aget-char v2, v1, v2

    .line 21
    .line 22
    const/16 v3, 0x6c

    .line 23
    .line 24
    if-ne v2, v3, :cond_1

    .line 25
    .line 26
    add-int/lit8 v2, v0, 0x2

    .line 27
    .line 28
    aget-char v2, v1, v2

    .line 29
    .line 30
    if-ne v2, v3, :cond_1

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x3

    .line 33
    .line 34
    aget-char v1, v1, v0

    .line 35
    .line 36
    const/16 v2, 0x30

    .line 37
    .line 38
    if-lt v1, v2, :cond_0

    .line 39
    .line 40
    const/16 v2, 0x5d

    .line 41
    .line 42
    if-eq v1, v2, :cond_0

    .line 43
    .line 44
    const/16 v2, 0x7d

    .line 45
    .line 46
    if-ne v1, v2, :cond_1

    .line 47
    .line 48
    :cond_0
    iput v0, p0, Lf7/b;->s:I

    .line 49
    return-void

    .line 50
    .line 51
    :cond_1
    const-string v0, "null"

    .line 52
    const/4 v1, 0x1

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0, v1}, Li7/g;->a2(Ljava/lang/String;I)V

    .line 56
    return-void
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
.end method

.method private final c2()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x3

    .line 5
    .line 6
    iget v2, p0, Lf7/b;->t:I

    .line 7
    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Li7/g;->T:[C

    .line 11
    .line 12
    aget-char v2, v1, v0

    .line 13
    .line 14
    const/16 v3, 0x72

    .line 15
    .line 16
    if-ne v2, v3, :cond_1

    .line 17
    .line 18
    add-int/lit8 v2, v0, 0x1

    .line 19
    .line 20
    aget-char v2, v1, v2

    .line 21
    .line 22
    const/16 v3, 0x75

    .line 23
    .line 24
    if-ne v2, v3, :cond_1

    .line 25
    .line 26
    add-int/lit8 v2, v0, 0x2

    .line 27
    .line 28
    aget-char v2, v1, v2

    .line 29
    .line 30
    const/16 v3, 0x65

    .line 31
    .line 32
    if-ne v2, v3, :cond_1

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x3

    .line 35
    .line 36
    aget-char v1, v1, v0

    .line 37
    .line 38
    const/16 v2, 0x30

    .line 39
    .line 40
    if-lt v1, v2, :cond_0

    .line 41
    .line 42
    const/16 v2, 0x5d

    .line 43
    .line 44
    if-eq v1, v2, :cond_0

    .line 45
    .line 46
    const/16 v2, 0x7d

    .line 47
    .line 48
    if-ne v1, v2, :cond_1

    .line 49
    .line 50
    :cond_0
    iput v0, p0, Lf7/b;->s:I

    .line 51
    return-void

    .line 52
    .line 53
    .line 54
    :cond_1
    const-string/jumbo v0, "true"

    .line 55
    const/4 v1, 0x1

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0, v1}, Li7/g;->a2(Ljava/lang/String;I)V

    .line 59
    return-void
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
.end method


# virtual methods
.method public final A2()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :cond_0
    :goto_0
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lf7/b;->k1()I

    .line 16
    move-result v0

    .line 17
    return v0

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Li7/g;->T:[C

    .line 20
    .line 21
    iget v1, p0, Lf7/b;->s:I

    .line 22
    .line 23
    add-int/lit8 v2, v1, 0x1

    .line 24
    .line 25
    iput v2, p0, Lf7/b;->s:I

    .line 26
    .line 27
    aget-char v0, v0, v1

    .line 28
    .line 29
    const/16 v1, 0x20

    .line 30
    .line 31
    if-le v0, v1, :cond_4

    .line 32
    .line 33
    const/16 v1, 0x2f

    .line 34
    .line 35
    if-ne v0, v1, :cond_2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Li7/g;->w2()V

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_2
    const/16 v1, 0x23

    .line 42
    .line 43
    if-ne v0, v1, :cond_3

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Li7/g;->B2()Z

    .line 47
    move-result v1

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return v0

    .line 52
    .line 53
    :cond_4
    if-eq v0, v1, :cond_0

    .line 54
    .line 55
    const/16 v1, 0xa

    .line 56
    .line 57
    if-ne v0, v1, :cond_5

    .line 58
    .line 59
    iget v0, p0, Lf7/b;->v:I

    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    iput v0, p0, Lf7/b;->v:I

    .line 64
    .line 65
    iput v2, p0, Lf7/b;->w:I

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :cond_5
    const/16 v1, 0xd

    .line 69
    .line 70
    if-ne v0, v1, :cond_6

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Li7/g;->s2()V

    .line 74
    goto :goto_0

    .line 75
    .line 76
    :cond_6
    const/16 v1, 0x9

    .line 77
    .line 78
    if-eq v0, v1, :cond_0

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lf7/c;->U0(I)V

    .line 82
    goto :goto_0
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
.end method

.method public final B2()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 3
    .line 4
    sget v1, Li7/g;->j0:I

    .line 5
    and-int/2addr v0, v1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    return v0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Li7/g;->x2()V

    .line 13
    const/4 v0, 0x1

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final C2()V
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget-wide v1, p0, Lf7/b;->u:J

    .line 5
    int-to-long v3, v0

    .line 6
    add-long/2addr v1, v3

    .line 7
    .line 8
    iput-wide v1, p0, Lf7/b;->x:J

    .line 9
    .line 10
    iget v1, p0, Lf7/b;->v:I

    .line 11
    .line 12
    iput v1, p0, Lf7/b;->y:I

    .line 13
    .line 14
    iget v1, p0, Lf7/b;->w:I

    .line 15
    sub-int/2addr v0, v1

    .line 16
    .line 17
    iput v0, p0, Lf7/b;->z:I

    .line 18
    return-void
.end method

.method public final D2()V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    int-to-long v1, v0

    .line 4
    .line 5
    iput-wide v1, p0, Li7/g;->Z:J

    .line 6
    .line 7
    iget v1, p0, Lf7/b;->v:I

    .line 8
    .line 9
    iput v1, p0, Li7/g;->a0:I

    .line 10
    .line 11
    iget v1, p0, Lf7/b;->w:I

    .line 12
    sub-int/2addr v0, v1

    .line 13
    .line 14
    iput v0, p0, Li7/g;->b0:I

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
.end method

.method public final E2()C
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    const/16 v2, 0x30

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    return v2

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Li7/g;->T:[C

    .line 18
    .line 19
    iget v1, p0, Lf7/b;->s:I

    .line 20
    .line 21
    aget-char v0, v0, v1

    .line 22
    .line 23
    if-lt v0, v2, :cond_9

    .line 24
    .line 25
    const/16 v1, 0x39

    .line 26
    .line 27
    if-le v0, v1, :cond_1

    .line 28
    goto :goto_2

    .line 29
    .line 30
    :cond_1
    iget v3, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 31
    .line 32
    sget v4, Li7/g;->d0:I

    .line 33
    and-int/2addr v3, v4

    .line 34
    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    const-string v3, "Leading zeroes not allowed"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v3}, Lf7/c;->W0(Ljava/lang/String;)V

    .line 41
    .line 42
    :cond_2
    iget v3, p0, Lf7/b;->s:I

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    iput v3, p0, Lf7/b;->s:I

    .line 47
    .line 48
    if-ne v0, v2, :cond_8

    .line 49
    .line 50
    :cond_3
    iget v3, p0, Lf7/b;->s:I

    .line 51
    .line 52
    iget v4, p0, Lf7/b;->t:I

    .line 53
    .line 54
    if-lt v3, v4, :cond_5

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 58
    move-result v3

    .line 59
    .line 60
    if-eqz v3, :cond_4

    .line 61
    goto :goto_0

    .line 62
    :cond_4
    return v0

    .line 63
    .line 64
    :cond_5
    :goto_0
    iget-object v0, p0, Li7/g;->T:[C

    .line 65
    .line 66
    iget v3, p0, Lf7/b;->s:I

    .line 67
    .line 68
    aget-char v0, v0, v3

    .line 69
    .line 70
    if-lt v0, v2, :cond_7

    .line 71
    .line 72
    if-le v0, v1, :cond_6

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    iput v3, p0, Lf7/b;->s:I

    .line 78
    .line 79
    if-eq v0, v2, :cond_3

    .line 80
    return v0

    .line 81
    :cond_7
    :goto_1
    return v2

    .line 82
    :cond_8
    return v0

    .line 83
    :cond_9
    :goto_2
    return v2
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
.end method

.method public final F2()C
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Li7/g;->T:[C

    .line 9
    .line 10
    aget-char v0, v1, v0

    .line 11
    .line 12
    const/16 v1, 0x30

    .line 13
    .line 14
    if-lt v0, v1, :cond_0

    .line 15
    .line 16
    const/16 v2, 0x39

    .line 17
    .line 18
    if-le v0, v2, :cond_1

    .line 19
    :cond_0
    return v1

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {p0}, Li7/g;->E2()C

    .line 23
    move-result v0

    .line 24
    return v0
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
    .line 44
    .line 45
    .line 46
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
.end method

.method public final G2(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lf7/b;->s:I

    .line 7
    .line 8
    const/16 v1, 0x9

    .line 9
    .line 10
    if-eq p1, v1, :cond_2

    .line 11
    .line 12
    const/16 v1, 0xa

    .line 13
    .line 14
    if-eq p1, v1, :cond_1

    .line 15
    .line 16
    const/16 v0, 0xd

    .line 17
    .line 18
    if-eq p1, v0, :cond_0

    .line 19
    .line 20
    const/16 v0, 0x20

    .line 21
    .line 22
    if-eq p1, v0, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lf7/c;->R0(I)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p0}, Li7/g;->s2()V

    .line 30
    return-void

    .line 31
    .line 32
    :cond_1
    iget p1, p0, Lf7/b;->v:I

    .line 33
    .line 34
    add-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    iput p1, p0, Lf7/b;->v:I

    .line 37
    .line 38
    iput v0, p0, Lf7/b;->w:I

    .line 39
    :cond_2
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
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
    .line 78
.end method

.method public H2(Ljava/lang/String;)C
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, Li7/g;->I2(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)C

    .line 5
    move-result p1

    .line 6
    return p1
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
.end method

.method public I2(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)C
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 16
    .line 17
    :cond_0
    iget-object p1, p0, Li7/g;->T:[C

    .line 18
    .line 19
    iget p2, p0, Lf7/b;->s:I

    .line 20
    .line 21
    add-int/lit8 v0, p2, 0x1

    .line 22
    .line 23
    iput v0, p0, Lf7/b;->s:I

    .line 24
    .line 25
    aget-char p1, p1, p2

    .line 26
    return p1
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
    .line 44
    .line 45
.end method

.method public final L1(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    int-to-char p3, p3

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 5
    move-result p3

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    const/4 p3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p3, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Li7/g;->o2(Ljava/lang/String;)V

    .line 16
    :cond_0
    return-void
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
    .line 44
    .line 45
    .line 46
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
.end method

.method public final M1(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x7d

    .line 3
    .line 4
    const/16 v1, 0x5d

    .line 5
    .line 6
    if-ne p1, v1, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li7/g;->C2()V

    .line 10
    .line 11
    iget-object v2, p0, Lf7/b;->A:Li7/d;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/f;->f()Z

    .line 15
    move-result v2

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, Lf7/b;->t1(IC)V

    .line 21
    .line 22
    :cond_0
    iget-object v2, p0, Lf7/b;->A:Li7/d;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Li7/d;->l()Li7/d;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    iput-object v2, p0, Lf7/b;->A:Li7/d;

    .line 29
    .line 30
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 31
    .line 32
    iput-object v2, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 33
    .line 34
    :cond_1
    if-ne p1, v0, :cond_3

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Li7/g;->C2()V

    .line 38
    .line 39
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->g()Z

    .line 43
    move-result v0

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, v1}, Lf7/b;->t1(IC)V

    .line 49
    .line 50
    :cond_2
    iget-object p1, p0, Lf7/b;->A:Li7/d;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Li7/d;->l()Li7/d;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    iput-object p1, p0, Lf7/b;->A:Li7/d;

    .line 57
    .line 58
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 59
    .line 60
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 61
    :cond_3
    return-void
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
.end method

.method public N1(Lcom/fasterxml/jackson/core/Base64Variant;)[B
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lf7/b;->l1()Lcom/fasterxml/jackson/core/util/c;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    :cond_0
    :goto_0
    iget v1, p0, Lf7/b;->s:I

    .line 7
    .line 8
    iget v2, p0, Lf7/b;->t:I

    .line 9
    .line 10
    if-lt v1, v2, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Li7/g;->X1()V

    .line 14
    .line 15
    :cond_1
    iget-object v1, p0, Li7/g;->T:[C

    .line 16
    .line 17
    iget v2, p0, Lf7/b;->s:I

    .line 18
    .line 19
    add-int/lit8 v3, v2, 0x1

    .line 20
    .line 21
    iput v3, p0, Lf7/b;->s:I

    .line 22
    .line 23
    aget-char v1, v1, v2

    .line 24
    .line 25
    const/16 v2, 0x20

    .line 26
    .line 27
    if-le v1, v2, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(C)I

    .line 31
    move-result v2

    .line 32
    .line 33
    const/16 v3, 0x22

    .line 34
    .line 35
    if-gez v2, :cond_3

    .line 36
    .line 37
    if-ne v1, v3, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/c;->q()[B

    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_2
    const/4 v2, 0x0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1, v1, v2}, Lf7/b;->h1(Lcom/fasterxml/jackson/core/Base64Variant;CI)I

    .line 47
    move-result v2

    .line 48
    .line 49
    if-gez v2, :cond_3

    .line 50
    goto :goto_0

    .line 51
    .line 52
    :cond_3
    iget v1, p0, Lf7/b;->s:I

    .line 53
    .line 54
    iget v4, p0, Lf7/b;->t:I

    .line 55
    .line 56
    if-lt v1, v4, :cond_4

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Li7/g;->X1()V

    .line 60
    .line 61
    :cond_4
    iget-object v1, p0, Li7/g;->T:[C

    .line 62
    .line 63
    iget v4, p0, Lf7/b;->s:I

    .line 64
    .line 65
    add-int/lit8 v5, v4, 0x1

    .line 66
    .line 67
    iput v5, p0, Lf7/b;->s:I

    .line 68
    .line 69
    aget-char v1, v1, v4

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(C)I

    .line 73
    move-result v4

    .line 74
    const/4 v5, 0x1

    .line 75
    .line 76
    if-gez v4, :cond_5

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p1, v1, v5}, Lf7/b;->h1(Lcom/fasterxml/jackson/core/Base64Variant;CI)I

    .line 80
    move-result v4

    .line 81
    .line 82
    :cond_5
    shl-int/lit8 v1, v2, 0x6

    .line 83
    or-int/2addr v1, v4

    .line 84
    .line 85
    iget v2, p0, Lf7/b;->s:I

    .line 86
    .line 87
    iget v4, p0, Lf7/b;->t:I

    .line 88
    .line 89
    if-lt v2, v4, :cond_6

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Li7/g;->X1()V

    .line 93
    .line 94
    :cond_6
    iget-object v2, p0, Li7/g;->T:[C

    .line 95
    .line 96
    iget v4, p0, Lf7/b;->s:I

    .line 97
    .line 98
    add-int/lit8 v6, v4, 0x1

    .line 99
    .line 100
    iput v6, p0, Lf7/b;->s:I

    .line 101
    .line 102
    aget-char v2, v2, v4

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(C)I

    .line 106
    move-result v4

    .line 107
    const/4 v6, 0x3

    .line 108
    const/4 v7, 0x2

    .line 109
    const/4 v8, -0x2

    .line 110
    .line 111
    if-gez v4, :cond_d

    .line 112
    .line 113
    if-eq v4, v8, :cond_9

    .line 114
    .line 115
    if-ne v2, v3, :cond_8

    .line 116
    .line 117
    shr-int/lit8 v1, v1, 0x4

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/c;->b(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPadding()Z

    .line 124
    move-result v1

    .line 125
    .line 126
    if-eqz v1, :cond_7

    .line 127
    .line 128
    iget v1, p0, Lf7/b;->s:I

    .line 129
    sub-int/2addr v1, v5

    .line 130
    .line 131
    iput v1, p0, Lf7/b;->s:I

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, p1}, Lf7/b;->m1(Lcom/fasterxml/jackson/core/Base64Variant;)V

    .line 135
    .line 136
    .line 137
    :cond_7
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/c;->q()[B

    .line 138
    move-result-object p1

    .line 139
    return-object p1

    .line 140
    .line 141
    .line 142
    :cond_8
    invoke-virtual {p0, p1, v2, v7}, Lf7/b;->h1(Lcom/fasterxml/jackson/core/Base64Variant;CI)I

    .line 143
    move-result v4

    .line 144
    .line 145
    :cond_9
    if-ne v4, v8, :cond_d

    .line 146
    .line 147
    iget v2, p0, Lf7/b;->s:I

    .line 148
    .line 149
    iget v3, p0, Lf7/b;->t:I

    .line 150
    .line 151
    if-lt v2, v3, :cond_a

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Li7/g;->X1()V

    .line 155
    .line 156
    :cond_a
    iget-object v2, p0, Li7/g;->T:[C

    .line 157
    .line 158
    iget v3, p0, Lf7/b;->s:I

    .line 159
    .line 160
    add-int/lit8 v4, v3, 0x1

    .line 161
    .line 162
    iput v4, p0, Lf7/b;->s:I

    .line 163
    .line 164
    aget-char v2, v2, v3

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPaddingChar(C)Z

    .line 168
    move-result v3

    .line 169
    .line 170
    if-nez v3, :cond_c

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, p1, v2, v6}, Lf7/b;->h1(Lcom/fasterxml/jackson/core/Base64Variant;CI)I

    .line 174
    move-result v3

    .line 175
    .line 176
    if-ne v3, v8, :cond_b

    .line 177
    goto :goto_1

    .line 178
    .line 179
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    const-string v1, "expected padding character \'"

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->getPaddingChar()C

    .line 191
    move-result v1

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    const-string v1, "\'"

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    move-result-object v0

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, p1, v2, v6, v0}, Lf7/b;->G1(Lcom/fasterxml/jackson/core/Base64Variant;IILjava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 207
    move-result-object p1

    .line 208
    throw p1

    .line 209
    .line 210
    :cond_c
    :goto_1
    shr-int/lit8 v1, v1, 0x4

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/c;->b(I)V

    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_d
    shl-int/lit8 v1, v1, 0x6

    .line 218
    or-int/2addr v1, v4

    .line 219
    .line 220
    iget v2, p0, Lf7/b;->s:I

    .line 221
    .line 222
    iget v4, p0, Lf7/b;->t:I

    .line 223
    .line 224
    if-lt v2, v4, :cond_e

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, Li7/g;->X1()V

    .line 228
    .line 229
    :cond_e
    iget-object v2, p0, Li7/g;->T:[C

    .line 230
    .line 231
    iget v4, p0, Lf7/b;->s:I

    .line 232
    .line 233
    add-int/lit8 v9, v4, 0x1

    .line 234
    .line 235
    iput v9, p0, Lf7/b;->s:I

    .line 236
    .line 237
    aget-char v2, v2, v4

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(C)I

    .line 241
    move-result v4

    .line 242
    .line 243
    if-gez v4, :cond_12

    .line 244
    .line 245
    if-eq v4, v8, :cond_11

    .line 246
    .line 247
    if-ne v2, v3, :cond_10

    .line 248
    shr-int/2addr v1, v7

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/c;->h(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPadding()Z

    .line 255
    move-result v1

    .line 256
    .line 257
    if-eqz v1, :cond_f

    .line 258
    .line 259
    iget v1, p0, Lf7/b;->s:I

    .line 260
    sub-int/2addr v1, v5

    .line 261
    .line 262
    iput v1, p0, Lf7/b;->s:I

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0, p1}, Lf7/b;->m1(Lcom/fasterxml/jackson/core/Base64Variant;)V

    .line 266
    .line 267
    .line 268
    :cond_f
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/c;->q()[B

    .line 269
    move-result-object p1

    .line 270
    return-object p1

    .line 271
    .line 272
    .line 273
    :cond_10
    invoke-virtual {p0, p1, v2, v6}, Lf7/b;->h1(Lcom/fasterxml/jackson/core/Base64Variant;CI)I

    .line 274
    move-result v4

    .line 275
    .line 276
    :cond_11
    if-ne v4, v8, :cond_12

    .line 277
    .line 278
    shr-int/lit8 v1, v1, 0x2

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/c;->h(I)V

    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_12
    shl-int/lit8 v1, v1, 0x6

    .line 286
    or-int/2addr v1, v4

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/c;->g(I)V

    .line 290
    .line 291
    goto/16 :goto_0
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
.end method

.method public final O1()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-ge v0, v1, :cond_2

    .line 7
    .line 8
    sget-object v2, Li7/g;->k0:[I

    .line 9
    array-length v3, v2

    .line 10
    .line 11
    :cond_0
    iget-object v4, p0, Li7/g;->T:[C

    .line 12
    .line 13
    aget-char v5, v4, v0

    .line 14
    .line 15
    if-ge v5, v3, :cond_1

    .line 16
    .line 17
    aget v6, v2, v5

    .line 18
    .line 19
    if-eqz v6, :cond_1

    .line 20
    .line 21
    const/16 v1, 0x22

    .line 22
    .line 23
    if-ne v5, v1, :cond_2

    .line 24
    .line 25
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 26
    .line 27
    iget v2, p0, Lf7/b;->s:I

    .line 28
    .line 29
    sub-int v3, v0, v2

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v4, v2, v3}, Lcom/fasterxml/jackson/core/util/i;->A([CII)V

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    iput v0, p0, Lf7/b;->s:I

    .line 37
    return-void

    .line 38
    .line 39
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    if-lt v0, v1, :cond_0

    .line 42
    .line 43
    :cond_2
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 44
    .line 45
    iget-object v2, p0, Li7/g;->T:[C

    .line 46
    .line 47
    iget v3, p0, Lf7/b;->s:I

    .line 48
    .line 49
    sub-int v4, v0, v3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2, v3, v4}, Lcom/fasterxml/jackson/core/util/i;->z([CII)V

    .line 53
    .line 54
    iput v0, p0, Lf7/b;->s:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Li7/g;->P1()V

    .line 58
    return-void
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
.end method

.method public P1()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->s()[C

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/i;->t()I

    .line 12
    move-result v1

    .line 13
    .line 14
    sget-object v2, Li7/g;->k0:[I

    .line 15
    array-length v3, v2

    .line 16
    .line 17
    :goto_0
    iget v4, p0, Lf7/b;->s:I

    .line 18
    .line 19
    iget v5, p0, Lf7/b;->t:I

    .line 20
    .line 21
    if-lt v4, v5, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 25
    move-result v4

    .line 26
    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    const-string v4, ": was expecting closing quote for a string value"

    .line 30
    .line 31
    sget-object v5, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v4, v5}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 35
    .line 36
    :cond_0
    iget-object v4, p0, Li7/g;->T:[C

    .line 37
    .line 38
    iget v5, p0, Lf7/b;->s:I

    .line 39
    .line 40
    add-int/lit8 v6, v5, 0x1

    .line 41
    .line 42
    iput v6, p0, Lf7/b;->s:I

    .line 43
    .line 44
    aget-char v4, v4, v5

    .line 45
    .line 46
    if-ge v4, v3, :cond_3

    .line 47
    .line 48
    aget v5, v2, v4

    .line 49
    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    const/16 v5, 0x22

    .line 53
    .line 54
    if-ne v4, v5, :cond_1

    .line 55
    .line 56
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 60
    return-void

    .line 61
    .line 62
    :cond_1
    const/16 v5, 0x5c

    .line 63
    .line 64
    if-ne v4, v5, :cond_2

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Li7/g;->j1()C

    .line 68
    move-result v4

    .line 69
    goto :goto_1

    .line 70
    .line 71
    :cond_2
    const/16 v5, 0x20

    .line 72
    .line 73
    if-ge v4, v5, :cond_3

    .line 74
    .line 75
    .line 76
    const-string/jumbo v5, "string value"

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v4, v5}, Lf7/b;->v1(ILjava/lang/String;)V

    .line 80
    :cond_3
    :goto_1
    array-length v5, v0

    .line 81
    .line 82
    if-lt v1, v5, :cond_4

    .line 83
    .line 84
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 88
    move-result-object v0

    .line 89
    const/4 v1, 0x0

    .line 90
    .line 91
    :cond_4
    add-int/lit8 v5, v1, 0x1

    .line 92
    .line 93
    aput-char v4, v0, v1

    .line 94
    move v1, v5

    .line 95
    goto :goto_0
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
.end method

.method public final Q1(Lcom/fasterxml/jackson/core/JsonToken;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x5

    .line 10
    .line 11
    if-eq v0, v1, :cond_2

    .line 12
    const/4 v1, 0x6

    .line 13
    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    const/4 v1, 0x7

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/16 v1, 0x8

    .line 20
    .line 21
    if-eq v0, v1, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonToken;->asString()Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    .line 28
    :cond_1
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    .line 35
    :cond_2
    iget-object p1, p0, Lf7/b;->A:Li7/d;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Li7/d;->b()Ljava/lang/String;

    .line 39
    move-result-object p1

    .line 40
    return-object p1
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
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
    .line 78
.end method

.method public R1()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/i;->t()I

    .line 12
    move-result v1

    .line 13
    .line 14
    :goto_0
    iget v2, p0, Lf7/b;->s:I

    .line 15
    .line 16
    iget v3, p0, Lf7/b;->t:I

    .line 17
    .line 18
    if-lt v2, v3, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 22
    move-result v2

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    const-string v2, ": was expecting closing quote for a string value"

    .line 27
    .line 28
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v2, v3}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 32
    .line 33
    :cond_0
    iget-object v2, p0, Li7/g;->T:[C

    .line 34
    .line 35
    iget v3, p0, Lf7/b;->s:I

    .line 36
    .line 37
    add-int/lit8 v4, v3, 0x1

    .line 38
    .line 39
    iput v4, p0, Lf7/b;->s:I

    .line 40
    .line 41
    aget-char v2, v2, v3

    .line 42
    .line 43
    const/16 v3, 0x5c

    .line 44
    .line 45
    if-gt v2, v3, :cond_3

    .line 46
    .line 47
    if-ne v2, v3, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Li7/g;->j1()C

    .line 51
    move-result v2

    .line 52
    goto :goto_1

    .line 53
    .line 54
    :cond_1
    const/16 v3, 0x27

    .line 55
    .line 56
    if-gt v2, v3, :cond_3

    .line 57
    .line 58
    if-ne v2, v3, :cond_2

    .line 59
    .line 60
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 64
    .line 65
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 66
    return-object v0

    .line 67
    .line 68
    :cond_2
    const/16 v3, 0x20

    .line 69
    .line 70
    if-ge v2, v3, :cond_3

    .line 71
    .line 72
    .line 73
    const-string/jumbo v3, "string value"

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v2, v3}, Lf7/b;->v1(ILjava/lang/String;)V

    .line 77
    :cond_3
    :goto_1
    array-length v3, v0

    .line 78
    .line 79
    if-lt v1, v3, :cond_4

    .line 80
    .line 81
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 85
    move-result-object v0

    .line 86
    const/4 v1, 0x0

    .line 87
    .line 88
    :cond_4
    add-int/lit8 v3, v1, 0x1

    .line 89
    .line 90
    aput-char v2, v0, v1

    .line 91
    move v1, v3

    .line 92
    goto :goto_0
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
.end method

.method public S1(IZ)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x49

    .line 3
    .line 4
    if-ne p1, v0, :cond_8

    .line 5
    .line 6
    iget p1, p0, Lf7/b;->s:I

    .line 7
    .line 8
    iget v0, p0, Lf7/b;->t:I

    .line 9
    .line 10
    if-lt p1, v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lf7/c;->Q0(Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 22
    .line 23
    :cond_0
    iget-object p1, p0, Li7/g;->T:[C

    .line 24
    .line 25
    iget v0, p0, Lf7/b;->s:I

    .line 26
    .line 27
    add-int/lit8 v1, v0, 0x1

    .line 28
    .line 29
    iput v1, p0, Lf7/b;->s:I

    .line 30
    .line 31
    aget-char p1, p1, v0

    .line 32
    .line 33
    const/16 v0, 0x4e

    .line 34
    .line 35
    const-string v1, "\': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"

    .line 36
    .line 37
    const-string v2, "Non-standard token \'"

    .line 38
    .line 39
    const-wide/high16 v3, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 40
    .line 41
    const-wide/high16 v5, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 42
    const/4 v7, 0x3

    .line 43
    .line 44
    if-ne p1, v0, :cond_4

    .line 45
    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    const-string v0, "-INF"

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_1
    const-string v0, "+INF"

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {p0, v0, v7}, Li7/g;->a2(Ljava/lang/String;I)V

    .line 55
    .line 56
    iget v7, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 57
    .line 58
    sget v8, Li7/g;->e0:I

    .line 59
    and-int/2addr v7, v8

    .line 60
    .line 61
    if-eqz v7, :cond_3

    .line 62
    .line 63
    if-eqz p2, :cond_2

    .line 64
    move-wide v3, v5

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {p0, v0, v3, v4}, Lf7/b;->I1(Ljava/lang/String;D)Lcom/fasterxml/jackson/core/JsonToken;

    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    .line 71
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    move-result-object p2

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p2}, Lf7/c;->K0(Ljava/lang/String;)V

    .line 91
    goto :goto_2

    .line 92
    .line 93
    :cond_4
    const/16 v0, 0x6e

    .line 94
    .line 95
    if-ne p1, v0, :cond_8

    .line 96
    .line 97
    if-eqz p2, :cond_5

    .line 98
    .line 99
    const-string v0, "-Infinity"

    .line 100
    goto :goto_1

    .line 101
    .line 102
    :cond_5
    const-string v0, "+Infinity"

    .line 103
    .line 104
    .line 105
    :goto_1
    invoke-virtual {p0, v0, v7}, Li7/g;->a2(Ljava/lang/String;I)V

    .line 106
    .line 107
    iget v7, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 108
    .line 109
    sget v8, Li7/g;->e0:I

    .line 110
    and-int/2addr v7, v8

    .line 111
    .line 112
    if-eqz v7, :cond_7

    .line 113
    .line 114
    if-eqz p2, :cond_6

    .line 115
    move-wide v3, v5

    .line 116
    .line 117
    .line 118
    :cond_6
    invoke-virtual {p0, v0, v3, v4}, Lf7/b;->I1(Ljava/lang/String;D)Lcom/fasterxml/jackson/core/JsonToken;

    .line 119
    move-result-object p1

    .line 120
    return-object p1

    .line 121
    .line 122
    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    move-result-object p2

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, p2}, Lf7/c;->K0(Ljava/lang/String;)V

    .line 142
    .line 143
    :cond_8
    :goto_2
    const-string p2, "expected digit (0-9) to follow minus sign, for valid numeric value"

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, p1, p2}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 147
    const/4 p1, 0x0

    .line 148
    return-object p1
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

.method public T1(I)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x27

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 7
    .line 8
    sget v1, Li7/g;->g0:I

    .line 9
    and-int/2addr v0, v1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Li7/g;->f2()Ljava/lang/String;

    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    .line 18
    :cond_0
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 19
    .line 20
    sget v1, Li7/g;->h0:I

    .line 21
    and-int/2addr v0, v1

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    .line 26
    const-string/jumbo v0, "was expecting double-quote to start field name"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1, v0}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->i()[I

    .line 33
    move-result-object v0

    .line 34
    array-length v1, v0

    .line 35
    const/4 v2, 0x1

    .line 36
    .line 37
    if-ge p1, v1, :cond_3

    .line 38
    .line 39
    aget v3, v0, p1

    .line 40
    .line 41
    if-nez v3, :cond_2

    .line 42
    move v3, v2

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v3, 0x0

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    int-to-char v3, p1

    .line 47
    .line 48
    .line 49
    invoke-static {v3}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 50
    move-result v3

    .line 51
    .line 52
    :goto_0
    if-nez v3, :cond_4

    .line 53
    .line 54
    .line 55
    const-string/jumbo v3, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name"

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1, v3}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 59
    .line 60
    :cond_4
    iget p1, p0, Lf7/b;->s:I

    .line 61
    .line 62
    iget v3, p0, Li7/g;->X:I

    .line 63
    .line 64
    iget v4, p0, Lf7/b;->t:I

    .line 65
    .line 66
    if-ge p1, v4, :cond_8

    .line 67
    .line 68
    :cond_5
    iget-object v5, p0, Li7/g;->T:[C

    .line 69
    .line 70
    aget-char v6, v5, p1

    .line 71
    .line 72
    if-ge v6, v1, :cond_6

    .line 73
    .line 74
    aget v7, v0, v6

    .line 75
    .line 76
    if-eqz v7, :cond_7

    .line 77
    .line 78
    iget v0, p0, Lf7/b;->s:I

    .line 79
    sub-int/2addr v0, v2

    .line 80
    .line 81
    iput p1, p0, Lf7/b;->s:I

    .line 82
    .line 83
    iget-object v1, p0, Li7/g;->W:Lk7/b;

    .line 84
    sub-int/2addr p1, v0

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v5, v0, p1, v3}, Lk7/b;->l([CIII)Ljava/lang/String;

    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :cond_6
    int-to-char v5, v6

    .line 91
    .line 92
    .line 93
    invoke-static {v5}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 94
    move-result v5

    .line 95
    .line 96
    if-nez v5, :cond_7

    .line 97
    .line 98
    iget v0, p0, Lf7/b;->s:I

    .line 99
    sub-int/2addr v0, v2

    .line 100
    .line 101
    iput p1, p0, Lf7/b;->s:I

    .line 102
    .line 103
    iget-object v1, p0, Li7/g;->W:Lk7/b;

    .line 104
    .line 105
    iget-object v2, p0, Li7/g;->T:[C

    .line 106
    sub-int/2addr p1, v0

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v2, v0, p1, v3}, Lk7/b;->l([CIII)Ljava/lang/String;

    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    .line 113
    :cond_7
    mul-int/lit8 v3, v3, 0x21

    .line 114
    add-int/2addr v3, v6

    .line 115
    .line 116
    add-int/lit8 p1, p1, 0x1

    .line 117
    .line 118
    if-lt p1, v4, :cond_5

    .line 119
    .line 120
    :cond_8
    iget v1, p0, Lf7/b;->s:I

    .line 121
    sub-int/2addr v1, v2

    .line 122
    .line 123
    iput p1, p0, Lf7/b;->s:I

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v1, v3, v0}, Li7/g;->U1(II[I)Ljava/lang/String;

    .line 127
    move-result-object p1

    .line 128
    return-object p1
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
.end method

.method public U()Lcom/fasterxml/jackson/core/util/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/fasterxml/jackson/core/util/f<",
            "Lcom/fasterxml/jackson/core/StreamReadCapability;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lf7/b;->R:Lcom/fasterxml/jackson/core/util/f;

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
.end method

.method public final U1(II[I)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 3
    .line 4
    iget-object v1, p0, Li7/g;->T:[C

    .line 5
    .line 6
    iget v2, p0, Lf7/b;->s:I

    .line 7
    sub-int/2addr v2, p1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1, p1, v2}, Lcom/fasterxml/jackson/core/util/i;->A([CII)V

    .line 11
    .line 12
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->s()[C

    .line 16
    move-result-object p1

    .line 17
    .line 18
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->t()I

    .line 22
    move-result v0

    .line 23
    array-length v1, p3

    .line 24
    .line 25
    :goto_0
    iget v2, p0, Lf7/b;->s:I

    .line 26
    .line 27
    iget v3, p0, Lf7/b;->t:I

    .line 28
    .line 29
    if-lt v2, v3, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 33
    move-result v2

    .line 34
    .line 35
    if-nez v2, :cond_0

    .line 36
    goto :goto_1

    .line 37
    .line 38
    :cond_0
    iget-object v2, p0, Li7/g;->T:[C

    .line 39
    .line 40
    iget v3, p0, Lf7/b;->s:I

    .line 41
    .line 42
    aget-char v2, v2, v3

    .line 43
    .line 44
    if-ge v2, v1, :cond_1

    .line 45
    .line 46
    aget v3, p3, v2

    .line 47
    .line 48
    if-eqz v3, :cond_2

    .line 49
    goto :goto_1

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-static {v2}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 53
    move-result v3

    .line 54
    .line 55
    if-nez v3, :cond_2

    .line 56
    .line 57
    :goto_1
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 61
    .line 62
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->u()[C

    .line 66
    move-result-object p3

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->v()I

    .line 70
    move-result v0

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->F()I

    .line 74
    move-result p1

    .line 75
    .line 76
    iget-object v1, p0, Li7/g;->W:Lk7/b;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p3, v0, p1, p2}, Lk7/b;->l([CIII)Ljava/lang/String;

    .line 80
    move-result-object p1

    .line 81
    return-object p1

    .line 82
    .line 83
    :cond_2
    iget v3, p0, Lf7/b;->s:I

    .line 84
    .line 85
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    iput v3, p0, Lf7/b;->s:I

    .line 88
    .line 89
    mul-int/lit8 p2, p2, 0x21

    .line 90
    add-int/2addr p2, v2

    .line 91
    .line 92
    add-int/lit8 v3, v0, 0x1

    .line 93
    .line 94
    aput-char v2, p1, v0

    .line 95
    array-length v0, p1

    .line 96
    .line 97
    if-lt v3, v0, :cond_3

    .line 98
    .line 99
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 103
    move-result-object p1

    .line 104
    const/4 v0, 0x0

    .line 105
    goto :goto_0

    .line 106
    :cond_3
    move v0, v3

    .line 107
    goto :goto_0
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
.end method

.method public V1(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x27

    .line 3
    .line 4
    if-eq p1, v0, :cond_8

    .line 5
    .line 6
    const/16 v0, 0x49

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-eq p1, v0, :cond_6

    .line 10
    .line 11
    const/16 v0, 0x4e

    .line 12
    .line 13
    if-eq p1, v0, :cond_4

    .line 14
    .line 15
    const/16 v0, 0x5d

    .line 16
    .line 17
    if-eq p1, v0, :cond_2

    .line 18
    .line 19
    const/16 v0, 0x2b

    .line 20
    .line 21
    if-eq p1, v0, :cond_0

    .line 22
    .line 23
    const/16 v0, 0x2c

    .line 24
    .line 25
    if-eq p1, v0, :cond_3

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_0
    iget p1, p0, Lf7/b;->s:I

    .line 30
    .line 31
    iget v0, p0, Lf7/b;->t:I

    .line 32
    .line 33
    if-lt p1, v0, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 37
    move-result p1

    .line 38
    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lf7/c;->Q0(Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 45
    .line 46
    :cond_1
    iget-object p1, p0, Li7/g;->T:[C

    .line 47
    .line 48
    iget v0, p0, Lf7/b;->s:I

    .line 49
    .line 50
    add-int/lit8 v1, v0, 0x1

    .line 51
    .line 52
    iput v1, p0, Lf7/b;->s:I

    .line 53
    .line 54
    aget-char p1, p1, v0

    .line 55
    const/4 v0, 0x0

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1, v0}, Li7/g;->S1(IZ)Lcom/fasterxml/jackson/core/JsonToken;

    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    .line 62
    :cond_2
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->f()Z

    .line 66
    move-result v0

    .line 67
    .line 68
    if-nez v0, :cond_3

    .line 69
    goto :goto_0

    .line 70
    .line 71
    :cond_3
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->h()Z

    .line 75
    move-result v0

    .line 76
    .line 77
    if-nez v0, :cond_9

    .line 78
    .line 79
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 80
    .line 81
    sget v2, Li7/g;->f0:I

    .line 82
    and-int/2addr v0, v2

    .line 83
    .line 84
    if-eqz v0, :cond_9

    .line 85
    .line 86
    iget p1, p0, Lf7/b;->s:I

    .line 87
    sub-int/2addr p1, v1

    .line 88
    .line 89
    iput p1, p0, Lf7/b;->s:I

    .line 90
    .line 91
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    .line 92
    return-object p1

    .line 93
    .line 94
    :cond_4
    const-string v0, "NaN"

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v0, v1}, Li7/g;->a2(Ljava/lang/String;I)V

    .line 98
    .line 99
    iget v1, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 100
    .line 101
    sget v2, Li7/g;->e0:I

    .line 102
    and-int/2addr v1, v2

    .line 103
    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    const-wide/high16 v1, 0x7ff8000000000000L    # Double.NaN

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v0, v1, v2}, Lf7/b;->I1(Ljava/lang/String;D)Lcom/fasterxml/jackson/core/JsonToken;

    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    .line 113
    :cond_5
    const-string v0, "Non-standard token \'NaN\': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v0}, Lf7/c;->K0(Ljava/lang/String;)V

    .line 117
    goto :goto_0

    .line 118
    .line 119
    :cond_6
    const-string v0, "Infinity"

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v0, v1}, Li7/g;->a2(Ljava/lang/String;I)V

    .line 123
    .line 124
    iget v1, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 125
    .line 126
    sget v2, Li7/g;->e0:I

    .line 127
    and-int/2addr v1, v2

    .line 128
    .line 129
    if-eqz v1, :cond_7

    .line 130
    .line 131
    const-wide/high16 v1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v0, v1, v2}, Lf7/b;->I1(Ljava/lang/String;D)Lcom/fasterxml/jackson/core/JsonToken;

    .line 135
    move-result-object p1

    .line 136
    return-object p1

    .line 137
    .line 138
    :cond_7
    const-string v0, "Non-standard token \'Infinity\': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v0}, Lf7/c;->K0(Ljava/lang/String;)V

    .line 142
    goto :goto_0

    .line 143
    .line 144
    :cond_8
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 145
    .line 146
    sget v1, Li7/g;->g0:I

    .line 147
    and-int/2addr v0, v1

    .line 148
    .line 149
    if-eqz v0, :cond_9

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Li7/g;->R1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 153
    move-result-object p1

    .line 154
    return-object p1

    .line 155
    .line 156
    .line 157
    :cond_9
    :goto_0
    invoke-static {p1}, Ljava/lang/Character;->isJavaIdentifierStart(I)Z

    .line 158
    move-result v0

    .line 159
    .line 160
    if-eqz v0, :cond_a

    .line 161
    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    const-string v1, ""

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    int-to-char v1, p1

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    move-result-object v0

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Lf7/b;->w1()Ljava/lang/String;

    .line 182
    move-result-object v1

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, v0, v1}, Li7/g;->p2(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    const-string v1, "expected a valid value "

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Lf7/b;->x1()Ljava/lang/String;

    .line 199
    move-result-object v1

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    move-result-object v0

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, p1, v0}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 210
    const/4 p1, 0x0

    .line 211
    return-object p1
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
.end method

.method public final W()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Li7/g;->Y:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-boolean v0, p0, Li7/g;->Y:Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Li7/g;->O1()V

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0, v0}, Li7/g;->Q1(Lcom/fasterxml/jackson/core/JsonToken;)Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    return-object v0
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
    .line 44
    .line 45
    .line 46
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
.end method

.method public W1()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/g;->S:Ljava/io/Reader;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v2, p0, Li7/g;->T:[C

    .line 8
    array-length v3, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v2, v1, v3}, Ljava/io/Reader;->read([CII)I

    .line 12
    move-result v0

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    iget v2, p0, Lf7/b;->t:I

    .line 17
    .line 18
    iget-wide v3, p0, Lf7/b;->u:J

    .line 19
    int-to-long v5, v2

    .line 20
    add-long/2addr v3, v5

    .line 21
    .line 22
    iput-wide v3, p0, Lf7/b;->u:J

    .line 23
    .line 24
    iget v3, p0, Lf7/b;->w:I

    .line 25
    sub-int/2addr v3, v2

    .line 26
    .line 27
    iput v3, p0, Lf7/b;->w:I

    .line 28
    .line 29
    iget-wide v2, p0, Li7/g;->Z:J

    .line 30
    sub-long/2addr v2, v5

    .line 31
    .line 32
    iput-wide v2, p0, Li7/g;->Z:J

    .line 33
    .line 34
    iput v1, p0, Lf7/b;->s:I

    .line 35
    .line 36
    iput v0, p0, Lf7/b;->t:I

    .line 37
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0}, Li7/g;->f1()V

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 47
    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    const-string v2, "Reader returned 0 characters when trying to read "

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    iget v2, p0, Lf7/b;->t:I

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 69
    throw v0

    .line 70
    :cond_2
    :goto_0
    return v1
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public final X()[C
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x5

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    const/4 v1, 0x6

    .line 14
    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    const/4 v1, 0x7

    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const/16 v1, 0x8

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->asCharArray()[C

    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    .line 31
    :cond_0
    iget-boolean v0, p0, Li7/g;->Y:Z

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iput-boolean v2, p0, Li7/g;->Y:Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Li7/g;->O1()V

    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->u()[C

    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    .line 47
    :cond_2
    iget-boolean v0, p0, Lf7/b;->E:Z

    .line 48
    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Li7/d;->b()Ljava/lang/String;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 59
    move-result v1

    .line 60
    .line 61
    iget-object v3, p0, Lf7/b;->D:[C

    .line 62
    .line 63
    if-nez v3, :cond_3

    .line 64
    .line 65
    iget-object v3, p0, Lf7/b;->q:Lcom/fasterxml/jackson/core/io/d;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v1}, Lcom/fasterxml/jackson/core/io/d;->f(I)[C

    .line 69
    move-result-object v3

    .line 70
    .line 71
    iput-object v3, p0, Lf7/b;->D:[C

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    array-length v3, v3

    .line 74
    .line 75
    if-ge v3, v1, :cond_4

    .line 76
    .line 77
    new-array v3, v1, [C

    .line 78
    .line 79
    iput-object v3, p0, Lf7/b;->D:[C

    .line 80
    .line 81
    :cond_4
    :goto_0
    iget-object v3, p0, Lf7/b;->D:[C

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v2, v1, v3, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 85
    const/4 v0, 0x1

    .line 86
    .line 87
    iput-boolean v0, p0, Lf7/b;->E:Z

    .line 88
    .line 89
    :cond_5
    iget-object v0, p0, Lf7/b;->D:[C

    .line 90
    return-object v0

    .line 91
    :cond_6
    const/4 v0, 0x0

    .line 92
    return-object v0
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
.end method

.method public X1()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lf7/c;->O0()V

    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final Y()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x5

    .line 11
    .line 12
    if-eq v0, v2, :cond_2

    .line 13
    const/4 v2, 0x6

    .line 14
    .line 15
    if-eq v0, v2, :cond_0

    .line 16
    const/4 v1, 0x7

    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const/16 v1, 0x8

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->asCharArray()[C

    .line 28
    move-result-object v0

    .line 29
    array-length v0, v0

    .line 30
    return v0

    .line 31
    .line 32
    :cond_0
    iget-boolean v0, p0, Li7/g;->Y:Z

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iput-boolean v1, p0, Li7/g;->Y:Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Li7/g;->O1()V

    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->F()I

    .line 45
    move-result v0

    .line 46
    return v0

    .line 47
    .line 48
    :cond_2
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Li7/d;->b()Ljava/lang/String;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 56
    move-result v0

    .line 57
    return v0

    .line 58
    :cond_3
    return v1
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
.end method

.method public final Z()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x6

    .line 11
    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    const/4 v2, 0x7

    .line 14
    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    const/16 v2, 0x8

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    iget-boolean v0, p0, Li7/g;->Y:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iput-boolean v1, p0, Li7/g;->Y:Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Li7/g;->O1()V

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->v()I

    .line 35
    move-result v0

    .line 36
    return v0

    .line 37
    :cond_2
    :goto_0
    return v1
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
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
.end method

.method public a0()Lcom/fasterxml/jackson/core/JsonLocation;
    .locals 15

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-wide v0, p0, Lf7/b;->u:J

    .line 11
    .line 12
    iget-wide v4, p0, Li7/g;->Z:J

    .line 13
    sub-long/2addr v4, v2

    .line 14
    .line 15
    add-long v10, v0, v4

    .line 16
    .line 17
    new-instance v6, Lcom/fasterxml/jackson/core/JsonLocation;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lf7/b;->g1()Lcom/fasterxml/jackson/core/io/ContentReference;

    .line 21
    move-result-object v7

    .line 22
    .line 23
    iget v12, p0, Li7/g;->a0:I

    .line 24
    .line 25
    iget v13, p0, Li7/g;->b0:I

    .line 26
    .line 27
    const-wide/16 v8, -0x1

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v6 .. v13}, Lcom/fasterxml/jackson/core/JsonLocation;-><init>(Lcom/fasterxml/jackson/core/io/ContentReference;JJII)V

    .line 31
    return-object v6

    .line 32
    .line 33
    :cond_0
    new-instance v7, Lcom/fasterxml/jackson/core/JsonLocation;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lf7/b;->g1()Lcom/fasterxml/jackson/core/io/ContentReference;

    .line 37
    move-result-object v8

    .line 38
    .line 39
    iget-wide v0, p0, Lf7/b;->x:J

    .line 40
    .line 41
    sub-long v11, v0, v2

    .line 42
    .line 43
    iget v13, p0, Lf7/b;->y:I

    .line 44
    .line 45
    iget v14, p0, Lf7/b;->z:I

    .line 46
    .line 47
    const-wide/16 v9, -0x1

    .line 48
    .line 49
    .line 50
    invoke-direct/range {v7 .. v14}, Lcom/fasterxml/jackson/core/JsonLocation;-><init>(Lcom/fasterxml/jackson/core/io/ContentReference;JJII)V

    .line 51
    return-object v7
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
.end method

.method public final a2(Ljava/lang/String;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget v1, p0, Lf7/b;->s:I

    .line 7
    add-int/2addr v1, v0

    .line 8
    .line 9
    iget v2, p0, Lf7/b;->t:I

    .line 10
    .line 11
    if-lt v1, v2, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, p2}, Li7/g;->b2(Ljava/lang/String;I)V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Li7/g;->T:[C

    .line 18
    .line 19
    iget v2, p0, Lf7/b;->s:I

    .line 20
    .line 21
    aget-char v1, v1, v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    const/4 v1, 0x0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, Li7/g;->o2(Ljava/lang/String;)V

    .line 36
    .line 37
    :cond_1
    iget v1, p0, Lf7/b;->s:I

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    iput v1, p0, Lf7/b;->s:I

    .line 42
    .line 43
    add-int/lit8 p2, p2, 0x1

    .line 44
    .line 45
    if-lt p2, v0, :cond_0

    .line 46
    .line 47
    iget-object v0, p0, Li7/g;->T:[C

    .line 48
    .line 49
    aget-char v0, v0, v1

    .line 50
    .line 51
    const/16 v1, 0x30

    .line 52
    .line 53
    if-lt v0, v1, :cond_2

    .line 54
    .line 55
    const/16 v1, 0x5d

    .line 56
    .line 57
    if-eq v0, v1, :cond_2

    .line 58
    .line 59
    const/16 v1, 0x7d

    .line 60
    .line 61
    if-eq v0, v1, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1, p2, v0}, Li7/g;->L1(Ljava/lang/String;II)V

    .line 65
    :cond_2
    return-void
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

.method public final b2(Ljava/lang/String;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    :cond_0
    iget v1, p0, Lf7/b;->s:I

    .line 7
    .line 8
    iget v2, p0, Lf7/b;->t:I

    .line 9
    .line 10
    if-lt v1, v2, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    :cond_1
    iget-object v1, p0, Li7/g;->T:[C

    .line 19
    .line 20
    iget v2, p0, Lf7/b;->s:I

    .line 21
    .line 22
    aget-char v1, v1, v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 26
    move-result v2

    .line 27
    .line 28
    if-eq v1, v2, :cond_3

    .line 29
    :cond_2
    const/4 v1, 0x0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v1}, Li7/g;->o2(Ljava/lang/String;)V

    .line 37
    .line 38
    :cond_3
    iget v1, p0, Lf7/b;->s:I

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    iput v1, p0, Lf7/b;->s:I

    .line 43
    .line 44
    add-int/lit8 p2, p2, 0x1

    .line 45
    .line 46
    if-lt p2, v0, :cond_0

    .line 47
    .line 48
    iget v0, p0, Lf7/b;->t:I

    .line 49
    .line 50
    if-lt v1, v0, :cond_4

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 54
    move-result v0

    .line 55
    .line 56
    if-nez v0, :cond_4

    .line 57
    goto :goto_0

    .line 58
    .line 59
    :cond_4
    iget-object v0, p0, Li7/g;->T:[C

    .line 60
    .line 61
    iget v1, p0, Lf7/b;->s:I

    .line 62
    .line 63
    aget-char v0, v0, v1

    .line 64
    .line 65
    const/16 v1, 0x30

    .line 66
    .line 67
    if-lt v0, v1, :cond_5

    .line 68
    .line 69
    const/16 v1, 0x5d

    .line 70
    .line 71
    if-eq v0, v1, :cond_5

    .line 72
    .line 73
    const/16 v1, 0x7d

    .line 74
    .line 75
    if-eq v0, v1, :cond_5

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p1, p2, v0}, Li7/g;->L1(Ljava/lang/String;II)V

    .line 79
    :cond_5
    :goto_0
    return-void
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

.method public final d2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lf7/b;->E:Z

    .line 4
    .line 5
    iget-object v0, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    iput-object v1, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 9
    .line 10
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lf7/b;->A:Li7/d;

    .line 15
    .line 16
    iget v2, p0, Lf7/b;->y:I

    .line 17
    .line 18
    iget v3, p0, Lf7/b;->z:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Li7/d;->m(II)Li7/d;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    iput-object v1, p0, Lf7/b;->A:Li7/d;

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_0
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 28
    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    iget-object v1, p0, Lf7/b;->A:Li7/d;

    .line 32
    .line 33
    iget v2, p0, Lf7/b;->y:I

    .line 34
    .line 35
    iget v3, p0, Lf7/b;->z:I

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2, v3}, Li7/d;->n(II)Li7/d;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    iput-object v1, p0, Lf7/b;->A:Li7/d;

    .line 42
    .line 43
    :cond_1
    :goto_0
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 44
    return-object v0
    .line 45
    .line 46
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
.end method

.method public final e2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x22

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p0, Li7/g;->Y:Z

    .line 8
    .line 9
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 10
    .line 11
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 12
    return-object p1

    .line 13
    .line 14
    :cond_0
    const/16 v0, 0x5b

    .line 15
    .line 16
    if-eq p1, v0, :cond_6

    .line 17
    .line 18
    const/16 v0, 0x66

    .line 19
    .line 20
    if-eq p1, v0, :cond_5

    .line 21
    .line 22
    const/16 v0, 0x6e

    .line 23
    .line 24
    if-eq p1, v0, :cond_4

    .line 25
    .line 26
    const/16 v0, 0x74

    .line 27
    .line 28
    if-eq p1, v0, :cond_3

    .line 29
    .line 30
    const/16 v0, 0x7b

    .line 31
    .line 32
    if-eq p1, v0, :cond_2

    .line 33
    .line 34
    .line 35
    packed-switch p1, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    packed-switch p1, :pswitch_data_1

    .line 39
    goto :goto_0

    .line 40
    .line 41
    .line 42
    :pswitch_0
    invoke-virtual {p0, p1}, Li7/g;->m2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 46
    return-object p1

    .line 47
    .line 48
    .line 49
    :pswitch_1
    invoke-virtual {p0}, Li7/g;->h2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 53
    return-object p1

    .line 54
    .line 55
    .line 56
    :pswitch_2
    invoke-virtual {p0}, Li7/g;->k2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 60
    return-object p1

    .line 61
    .line 62
    :pswitch_3
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->h()Z

    .line 66
    move-result v0

    .line 67
    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 71
    .line 72
    sget v2, Li7/g;->f0:I

    .line 73
    and-int/2addr v0, v2

    .line 74
    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    iget p1, p0, Lf7/b;->s:I

    .line 78
    sub-int/2addr p1, v1

    .line 79
    .line 80
    iput p1, p0, Lf7/b;->s:I

    .line 81
    .line 82
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    .line 83
    .line 84
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 85
    return-object p1

    .line 86
    .line 87
    .line 88
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Li7/g;->V1(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 92
    return-object p1

    .line 93
    .line 94
    :cond_2
    iget-object p1, p0, Lf7/b;->A:Li7/d;

    .line 95
    .line 96
    iget v0, p0, Lf7/b;->y:I

    .line 97
    .line 98
    iget v1, p0, Lf7/b;->z:I

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0, v1}, Li7/d;->n(II)Li7/d;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    iput-object p1, p0, Lf7/b;->A:Li7/d;

    .line 105
    .line 106
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 107
    .line 108
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 109
    return-object p1

    .line 110
    .line 111
    .line 112
    :cond_3
    const-string/jumbo p1, "true"

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, p1, v1}, Li7/g;->a2(Ljava/lang/String;I)V

    .line 116
    .line 117
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 118
    .line 119
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 120
    return-object p1

    .line 121
    .line 122
    :cond_4
    const-string p1, "null"

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1, v1}, Li7/g;->a2(Ljava/lang/String;I)V

    .line 126
    .line 127
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    .line 128
    .line 129
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 130
    return-object p1

    .line 131
    .line 132
    :cond_5
    const-string p1, "false"

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p1, v1}, Li7/g;->a2(Ljava/lang/String;I)V

    .line 136
    .line 137
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 138
    .line 139
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 140
    return-object p1

    .line 141
    .line 142
    :cond_6
    iget-object p1, p0, Lf7/b;->A:Li7/d;

    .line 143
    .line 144
    iget v0, p0, Lf7/b;->y:I

    .line 145
    .line 146
    iget v1, p0, Lf7/b;->z:I

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v0, v1}, Li7/d;->m(II)Li7/d;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    iput-object p1, p0, Lf7/b;->A:Li7/d;

    .line 153
    .line 154
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 155
    .line 156
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 157
    return-object p1

    .line 158
    nop

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
    :pswitch_data_0
    .packed-switch 0x2c
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
.end method

.method public f1()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/g;->S:Ljava/io/Reader;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lf7/b;->q:Lcom/fasterxml/jackson/core/io/d;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/io/d;->n()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->AUTO_CLOSE_SOURCE:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonParser;->m0(Lcom/fasterxml/jackson/core/JsonParser$Feature;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Li7/g;->S:Ljava/io/Reader;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    .line 28
    iput-object v0, p0, Li7/g;->S:Ljava/io/Reader;

    .line 29
    :cond_2
    return-void
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
    .line 44
    .line 45
    .line 46
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
.end method

.method public f2()Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Li7/g;->X:I

    .line 5
    .line 6
    iget v2, p0, Lf7/b;->t:I

    .line 7
    .line 8
    const/16 v3, 0x27

    .line 9
    .line 10
    if-ge v0, v2, :cond_3

    .line 11
    .line 12
    sget-object v4, Li7/g;->k0:[I

    .line 13
    array-length v5, v4

    .line 14
    .line 15
    :cond_0
    iget-object v6, p0, Li7/g;->T:[C

    .line 16
    .line 17
    aget-char v7, v6, v0

    .line 18
    .line 19
    if-ne v7, v3, :cond_1

    .line 20
    .line 21
    iget v2, p0, Lf7/b;->s:I

    .line 22
    .line 23
    add-int/lit8 v3, v0, 0x1

    .line 24
    .line 25
    iput v3, p0, Lf7/b;->s:I

    .line 26
    .line 27
    iget-object v3, p0, Li7/g;->W:Lk7/b;

    .line 28
    sub-int/2addr v0, v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v6, v2, v0, v1}, Lk7/b;->l([CIII)Ljava/lang/String;

    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    .line 35
    :cond_1
    if-ge v7, v5, :cond_2

    .line 36
    .line 37
    aget v6, v4, v7

    .line 38
    .line 39
    if-eqz v6, :cond_2

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_2
    mul-int/lit8 v1, v1, 0x21

    .line 43
    add-int/2addr v1, v7

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    if-lt v0, v2, :cond_0

    .line 48
    .line 49
    :cond_3
    :goto_0
    iget v2, p0, Lf7/b;->s:I

    .line 50
    .line 51
    iput v0, p0, Lf7/b;->s:I

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v2, v1, v3}, Li7/g;->j2(III)Ljava/lang/String;

    .line 55
    move-result-object v0

    .line 56
    return-object v0
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
.end method

.method public final g0()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Li7/g;->Y:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-boolean v0, p0, Li7/g;->Y:Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Li7/g;->O1()V

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    .line 25
    :cond_1
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 26
    .line 27
    if-ne v0, v1, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lf7/b;->w()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :cond_2
    const/4 v0, 0x0

    .line 34
    .line 35
    .line 36
    invoke-super {p0, v0}, Lf7/c;->h0(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    return-object v0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
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
.end method

.method public final g2(IIIZI)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->t:I

    .line 3
    .line 4
    const/16 v1, 0x2e

    .line 5
    .line 6
    const/16 v2, 0x39

    .line 7
    .line 8
    const/16 v3, 0x30

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    if-ne p1, v1, :cond_4

    .line 12
    move p1, v4

    .line 13
    .line 14
    :goto_0
    if-lt p3, v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p4, p2}, Li7/g;->l2(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    .line 21
    :cond_0
    iget-object v1, p0, Li7/g;->T:[C

    .line 22
    .line 23
    add-int/lit8 v5, p3, 0x1

    .line 24
    .line 25
    aget-char p3, v1, p3

    .line 26
    .line 27
    if-lt p3, v3, :cond_2

    .line 28
    .line 29
    if-le p3, v2, :cond_1

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 33
    move p3, v5

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_2
    :goto_1
    if-nez p1, :cond_3

    .line 37
    .line 38
    const-string v1, "Decimal point not followed by a digit"

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p3, v1}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 42
    :cond_3
    move v8, p3

    .line 43
    move p3, p1

    .line 44
    move p1, v8

    .line 45
    goto :goto_2

    .line 46
    :cond_4
    move v5, p3

    .line 47
    move p3, v4

    .line 48
    .line 49
    :goto_2
    const/16 v1, 0x65

    .line 50
    .line 51
    if-eq p1, v1, :cond_5

    .line 52
    .line 53
    const/16 v1, 0x45

    .line 54
    .line 55
    if-ne p1, v1, :cond_c

    .line 56
    .line 57
    :cond_5
    if-lt v5, v0, :cond_6

    .line 58
    .line 59
    iput p2, p0, Lf7/b;->s:I

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p4, p2}, Li7/g;->l2(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    .line 66
    :cond_6
    iget-object p1, p0, Li7/g;->T:[C

    .line 67
    .line 68
    add-int/lit8 v1, v5, 0x1

    .line 69
    .line 70
    aget-char v6, p1, v5

    .line 71
    .line 72
    const/16 v7, 0x2d

    .line 73
    .line 74
    if-eq v6, v7, :cond_8

    .line 75
    .line 76
    const/16 v7, 0x2b

    .line 77
    .line 78
    if-ne v6, v7, :cond_7

    .line 79
    goto :goto_3

    .line 80
    :cond_7
    move v5, v1

    .line 81
    move p1, v6

    .line 82
    goto :goto_4

    .line 83
    .line 84
    :cond_8
    :goto_3
    if-lt v1, v0, :cond_9

    .line 85
    .line 86
    iput p2, p0, Lf7/b;->s:I

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p4, p2}, Li7/g;->l2(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    .line 93
    :cond_9
    add-int/lit8 v5, v5, 0x2

    .line 94
    .line 95
    aget-char p1, p1, v1

    .line 96
    .line 97
    :goto_4
    if-gt p1, v2, :cond_b

    .line 98
    .line 99
    if-lt p1, v3, :cond_b

    .line 100
    .line 101
    add-int/lit8 v4, v4, 0x1

    .line 102
    .line 103
    if-lt v5, v0, :cond_a

    .line 104
    .line 105
    iput p2, p0, Lf7/b;->s:I

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p4, p2}, Li7/g;->l2(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 109
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    .line 112
    :cond_a
    iget-object p1, p0, Li7/g;->T:[C

    .line 113
    .line 114
    add-int/lit8 v1, v5, 0x1

    .line 115
    .line 116
    aget-char p1, p1, v5

    .line 117
    move v5, v1

    .line 118
    goto :goto_4

    .line 119
    .line 120
    :cond_b
    if-nez v4, :cond_c

    .line 121
    .line 122
    const-string v0, "Exponent indicator not followed by a digit"

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1, v0}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 126
    .line 127
    :cond_c
    add-int/lit8 v5, v5, -0x1

    .line 128
    .line 129
    iput v5, p0, Lf7/b;->s:I

    .line 130
    .line 131
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->h()Z

    .line 135
    move-result v0

    .line 136
    .line 137
    if-eqz v0, :cond_d

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, p1}, Li7/g;->G2(I)V

    .line 141
    :cond_d
    sub-int/2addr v5, p2

    .line 142
    .line 143
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 144
    .line 145
    iget-object v0, p0, Li7/g;->T:[C

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v0, p2, v5}, Lcom/fasterxml/jackson/core/util/i;->A([CII)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, p4, p5, p3, v4}, Lf7/b;->J1(ZIII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 152
    move-result-object p1

    .line 153
    return-object p1
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
.end method

.method public final h0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    iget-boolean p1, p0, Li7/g;->Y:Z

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    const/4 p1, 0x0

    .line 12
    .line 13
    iput-boolean p1, p0, Li7/g;->Y:Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Li7/g;->O1()V

    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    .line 25
    :cond_1
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 26
    .line 27
    if-ne v0, v1, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lf7/b;->w()Ljava/lang/String;

    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-super {p0, p1}, Lf7/c;->h0(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    move-result-object p1

    .line 37
    return-object p1
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
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
    .line 78
.end method

.method public final h2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/fasterxml/jackson/core/json/JsonReadFeature;->ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS:Lcom/fasterxml/jackson/core/json/JsonReadFeature;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonReadFeature;->mappedFeature()Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonParser;->m0(Lcom/fasterxml/jackson/core/JsonParser$Feature;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/16 v0, 0x2e

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Li7/g;->V1(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    .line 21
    :cond_0
    iget v4, p0, Lf7/b;->s:I

    .line 22
    .line 23
    add-int/lit8 v3, v4, -0x1

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    .line 27
    const/16 v2, 0x2e

    .line 28
    move-object v1, p0

    .line 29
    .line 30
    .line 31
    invoke-virtual/range {v1 .. v6}, Li7/g;->g2(IIIZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 32
    move-result-object v0

    .line 33
    return-object v0
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
    .line 44
    .line 45
    .line 46
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
.end method

.method public final i2()Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Li7/g;->X:I

    .line 5
    .line 6
    sget-object v2, Li7/g;->k0:[I

    .line 7
    .line 8
    :goto_0
    iget v3, p0, Lf7/b;->t:I

    .line 9
    .line 10
    const/16 v4, 0x22

    .line 11
    .line 12
    if-ge v0, v3, :cond_1

    .line 13
    .line 14
    iget-object v3, p0, Li7/g;->T:[C

    .line 15
    .line 16
    aget-char v5, v3, v0

    .line 17
    array-length v6, v2

    .line 18
    .line 19
    if-ge v5, v6, :cond_0

    .line 20
    .line 21
    aget v6, v2, v5

    .line 22
    .line 23
    if-eqz v6, :cond_0

    .line 24
    .line 25
    if-ne v5, v4, :cond_1

    .line 26
    .line 27
    iget v2, p0, Lf7/b;->s:I

    .line 28
    .line 29
    add-int/lit8 v4, v0, 0x1

    .line 30
    .line 31
    iput v4, p0, Lf7/b;->s:I

    .line 32
    .line 33
    iget-object v4, p0, Li7/g;->W:Lk7/b;

    .line 34
    sub-int/2addr v0, v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v3, v2, v0, v1}, Lk7/b;->l([CIII)Ljava/lang/String;

    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    .line 41
    :cond_0
    mul-int/lit8 v1, v1, 0x21

    .line 42
    add-int/2addr v1, v5

    .line 43
    .line 44
    add-int/lit8 v0, v0, 0x1

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :cond_1
    iget v2, p0, Lf7/b;->s:I

    .line 48
    .line 49
    iput v0, p0, Lf7/b;->s:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v2, v1, v4}, Li7/g;->j2(III)Ljava/lang/String;

    .line 53
    move-result-object v0

    .line 54
    return-object v0
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
.end method

.method public j1()C
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    const-string v2, " in character escape sequence"

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v2, v0}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Li7/g;->T:[C

    .line 22
    .line 23
    iget v1, p0, Lf7/b;->s:I

    .line 24
    .line 25
    add-int/lit8 v3, v1, 0x1

    .line 26
    .line 27
    iput v3, p0, Lf7/b;->s:I

    .line 28
    .line 29
    aget-char v0, v0, v1

    .line 30
    .line 31
    const/16 v1, 0x22

    .line 32
    .line 33
    if-eq v0, v1, :cond_a

    .line 34
    .line 35
    const/16 v1, 0x2f

    .line 36
    .line 37
    if-eq v0, v1, :cond_a

    .line 38
    .line 39
    const/16 v1, 0x5c

    .line 40
    .line 41
    if-eq v0, v1, :cond_a

    .line 42
    .line 43
    const/16 v1, 0x62

    .line 44
    .line 45
    if-eq v0, v1, :cond_9

    .line 46
    .line 47
    const/16 v1, 0x66

    .line 48
    .line 49
    if-eq v0, v1, :cond_8

    .line 50
    .line 51
    const/16 v1, 0x6e

    .line 52
    .line 53
    if-eq v0, v1, :cond_7

    .line 54
    .line 55
    const/16 v1, 0x72

    .line 56
    .line 57
    if-eq v0, v1, :cond_6

    .line 58
    .line 59
    const/16 v1, 0x74

    .line 60
    .line 61
    if-eq v0, v1, :cond_5

    .line 62
    .line 63
    const/16 v1, 0x75

    .line 64
    .line 65
    if-eq v0, v1, :cond_1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lf7/b;->n1(C)C

    .line 69
    move-result v0

    .line 70
    return v0

    .line 71
    :cond_1
    const/4 v0, 0x0

    .line 72
    move v1, v0

    .line 73
    :goto_0
    const/4 v3, 0x4

    .line 74
    .line 75
    if-ge v0, v3, :cond_4

    .line 76
    .line 77
    iget v3, p0, Lf7/b;->s:I

    .line 78
    .line 79
    iget v4, p0, Lf7/b;->t:I

    .line 80
    .line 81
    if-lt v3, v4, :cond_2

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 85
    move-result v3

    .line 86
    .line 87
    if-nez v3, :cond_2

    .line 88
    .line 89
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v2, v3}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 93
    .line 94
    :cond_2
    iget-object v3, p0, Li7/g;->T:[C

    .line 95
    .line 96
    iget v4, p0, Lf7/b;->s:I

    .line 97
    .line 98
    add-int/lit8 v5, v4, 0x1

    .line 99
    .line 100
    iput v5, p0, Lf7/b;->s:I

    .line 101
    .line 102
    aget-char v3, v3, v4

    .line 103
    .line 104
    .line 105
    invoke-static {v3}, Lcom/fasterxml/jackson/core/io/b;->b(I)I

    .line 106
    move-result v4

    .line 107
    .line 108
    if-gez v4, :cond_3

    .line 109
    .line 110
    const-string v5, "expected a hex-digit for character escape sequence"

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v3, v5}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 114
    .line 115
    :cond_3
    shl-int/lit8 v1, v1, 0x4

    .line 116
    or-int/2addr v1, v4

    .line 117
    .line 118
    add-int/lit8 v0, v0, 0x1

    .line 119
    goto :goto_0

    .line 120
    :cond_4
    int-to-char v0, v1

    .line 121
    return v0

    .line 122
    .line 123
    :cond_5
    const/16 v0, 0x9

    .line 124
    return v0

    .line 125
    .line 126
    :cond_6
    const/16 v0, 0xd

    .line 127
    return v0

    .line 128
    .line 129
    :cond_7
    const/16 v0, 0xa

    .line 130
    return v0

    .line 131
    .line 132
    :cond_8
    const/16 v0, 0xc

    .line 133
    return v0

    .line 134
    .line 135
    :cond_9
    const/16 v0, 0x8

    .line 136
    :cond_a
    return v0
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
.end method

.method public final j2(III)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 3
    .line 4
    iget-object v1, p0, Li7/g;->T:[C

    .line 5
    .line 6
    iget v2, p0, Lf7/b;->s:I

    .line 7
    sub-int/2addr v2, p1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1, p1, v2}, Lcom/fasterxml/jackson/core/util/i;->A([CII)V

    .line 11
    .line 12
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->s()[C

    .line 16
    move-result-object p1

    .line 17
    .line 18
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->t()I

    .line 22
    move-result v0

    .line 23
    .line 24
    :goto_0
    iget v1, p0, Lf7/b;->s:I

    .line 25
    .line 26
    iget v2, p0, Lf7/b;->t:I

    .line 27
    .line 28
    if-lt v1, v2, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    const-string v1, " in field name"

    .line 37
    .line 38
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1, v2}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 42
    .line 43
    :cond_0
    iget-object v1, p0, Li7/g;->T:[C

    .line 44
    .line 45
    iget v2, p0, Lf7/b;->s:I

    .line 46
    .line 47
    add-int/lit8 v3, v2, 0x1

    .line 48
    .line 49
    iput v3, p0, Lf7/b;->s:I

    .line 50
    .line 51
    aget-char v1, v1, v2

    .line 52
    .line 53
    const/16 v2, 0x5c

    .line 54
    .line 55
    if-gt v1, v2, :cond_3

    .line 56
    .line 57
    if-ne v1, v2, :cond_1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Li7/g;->j1()C

    .line 61
    move-result v1

    .line 62
    goto :goto_1

    .line 63
    .line 64
    :cond_1
    if-gt v1, p3, :cond_3

    .line 65
    .line 66
    if-ne v1, p3, :cond_2

    .line 67
    .line 68
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 72
    .line 73
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->u()[C

    .line 77
    move-result-object p3

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->v()I

    .line 81
    move-result v0

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->F()I

    .line 85
    move-result p1

    .line 86
    .line 87
    iget-object v1, p0, Li7/g;->W:Lk7/b;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, p3, v0, p1, p2}, Lk7/b;->l([CIII)Ljava/lang/String;

    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    .line 94
    :cond_2
    const/16 v2, 0x20

    .line 95
    .line 96
    if-ge v1, v2, :cond_3

    .line 97
    .line 98
    const-string v2, "name"

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v1, v2}, Lf7/b;->v1(ILjava/lang/String;)V

    .line 102
    .line 103
    :cond_3
    :goto_1
    mul-int/lit8 p2, p2, 0x21

    .line 104
    add-int/2addr p2, v1

    .line 105
    .line 106
    add-int/lit8 v2, v0, 0x1

    .line 107
    .line 108
    aput-char v1, p1, v0

    .line 109
    array-length v0, p1

    .line 110
    .line 111
    if-lt v2, v0, :cond_4

    .line 112
    .line 113
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 117
    move-result-object p1

    .line 118
    const/4 v0, 0x0

    .line 119
    goto :goto_0

    .line 120
    :cond_4
    move v0, v2

    .line 121
    goto :goto_0
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
.end method

.method public final k2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    add-int/lit8 v3, v0, -0x1

    .line 5
    .line 6
    iget v1, p0, Lf7/b;->t:I

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v2, v3}, Li7/g;->l2(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    .line 16
    :cond_0
    iget-object v4, p0, Li7/g;->T:[C

    .line 17
    .line 18
    add-int/lit8 v5, v0, 0x1

    .line 19
    .line 20
    aget-char v0, v4, v0

    .line 21
    .line 22
    const/16 v4, 0x39

    .line 23
    .line 24
    if-gt v0, v4, :cond_1

    .line 25
    .line 26
    const/16 v6, 0x30

    .line 27
    .line 28
    if-ge v0, v6, :cond_2

    .line 29
    :cond_1
    move-object v1, p0

    .line 30
    goto :goto_3

    .line 31
    .line 32
    :cond_2
    if-ne v0, v6, :cond_3

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v2, v3}, Li7/g;->l2(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :cond_3
    move v0, v6

    .line 39
    move v6, v2

    .line 40
    .line 41
    :goto_0
    if-lt v5, v1, :cond_4

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v2, v3}, Li7/g;->l2(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    .line 48
    :cond_4
    iget-object v7, p0, Li7/g;->T:[C

    .line 49
    move v8, v4

    .line 50
    .line 51
    add-int/lit8 v4, v5, 0x1

    .line 52
    .line 53
    aget-char v7, v7, v5

    .line 54
    .line 55
    if-lt v7, v0, :cond_6

    .line 56
    .line 57
    if-le v7, v8, :cond_5

    .line 58
    goto :goto_1

    .line 59
    .line 60
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 61
    move v5, v4

    .line 62
    move v4, v8

    .line 63
    goto :goto_0

    .line 64
    .line 65
    :cond_6
    :goto_1
    const/16 v0, 0x2e

    .line 66
    .line 67
    if-eq v7, v0, :cond_9

    .line 68
    .line 69
    const/16 v0, 0x65

    .line 70
    .line 71
    if-eq v7, v0, :cond_9

    .line 72
    .line 73
    const/16 v0, 0x45

    .line 74
    .line 75
    if-ne v7, v0, :cond_7

    .line 76
    goto :goto_2

    .line 77
    .line 78
    :cond_7
    iput v5, p0, Lf7/b;->s:I

    .line 79
    .line 80
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->h()Z

    .line 84
    move-result v0

    .line 85
    .line 86
    if-eqz v0, :cond_8

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v7}, Li7/g;->G2(I)V

    .line 90
    :cond_8
    sub-int/2addr v5, v3

    .line 91
    .line 92
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 93
    .line 94
    iget-object v1, p0, Li7/g;->T:[C

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1, v3, v5}, Lcom/fasterxml/jackson/core/util/i;->A([CII)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v2, v6}, Lf7/b;->K1(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 101
    move-result-object v0

    .line 102
    return-object v0

    .line 103
    .line 104
    :cond_9
    :goto_2
    iput v4, p0, Lf7/b;->s:I

    .line 105
    const/4 v5, 0x1

    .line 106
    move-object v1, p0

    .line 107
    move v2, v7

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v1 .. v6}, Li7/g;->g2(IIIZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 111
    move-result-object v0

    .line 112
    return-object v0

    .line 113
    .line 114
    :goto_3
    iput v5, v1, Lf7/b;->s:I

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v0, v2}, Li7/g;->S1(IZ)Lcom/fasterxml/jackson/core/JsonToken;

    .line 118
    move-result-object v0

    .line 119
    return-object v0
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
.end method

.method public final l2(ZI)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    add-int/lit8 p2, p2, 0x1

    .line 5
    .line 6
    :cond_0
    iput p2, p0, Lf7/b;->s:I

    .line 7
    .line 8
    iget-object p2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 12
    move-result-object p2

    .line 13
    .line 14
    const/16 v0, 0x2d

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    aput-char v0, p2, v1

    .line 21
    move v3, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v3, v1

    .line 24
    .line 25
    :goto_0
    iget v4, p0, Lf7/b;->s:I

    .line 26
    .line 27
    iget v5, p0, Lf7/b;->t:I

    .line 28
    .line 29
    if-ge v4, v5, :cond_2

    .line 30
    .line 31
    iget-object v5, p0, Li7/g;->T:[C

    .line 32
    .line 33
    add-int/lit8 v6, v4, 0x1

    .line 34
    .line 35
    iput v6, p0, Lf7/b;->s:I

    .line 36
    .line 37
    aget-char v4, v5, v4

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :cond_2
    const-string v4, "No digit following minus sign"

    .line 41
    .line 42
    sget-object v5, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v4, v5}, Li7/g;->I2(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)C

    .line 46
    move-result v4

    .line 47
    .line 48
    :goto_1
    const/16 v5, 0x30

    .line 49
    .line 50
    if-ne v4, v5, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Li7/g;->F2()C

    .line 54
    move-result v4

    .line 55
    :cond_3
    move v6, v1

    .line 56
    .line 57
    :goto_2
    const/16 v7, 0x39

    .line 58
    .line 59
    if-lt v4, v5, :cond_6

    .line 60
    .line 61
    if-gt v4, v7, :cond_6

    .line 62
    .line 63
    add-int/lit8 v6, v6, 0x1

    .line 64
    array-length v8, p2

    .line 65
    .line 66
    if-lt v3, v8, :cond_4

    .line 67
    .line 68
    iget-object p2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 72
    move-result-object p2

    .line 73
    move v3, v1

    .line 74
    .line 75
    :cond_4
    add-int/lit8 v8, v3, 0x1

    .line 76
    .line 77
    aput-char v4, p2, v3

    .line 78
    .line 79
    iget v3, p0, Lf7/b;->s:I

    .line 80
    .line 81
    iget v4, p0, Lf7/b;->t:I

    .line 82
    .line 83
    if-lt v3, v4, :cond_5

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 87
    move-result v3

    .line 88
    .line 89
    if-nez v3, :cond_5

    .line 90
    move v4, v1

    .line 91
    move v3, v8

    .line 92
    move v8, v2

    .line 93
    goto :goto_3

    .line 94
    .line 95
    :cond_5
    iget-object v3, p0, Li7/g;->T:[C

    .line 96
    .line 97
    iget v4, p0, Lf7/b;->s:I

    .line 98
    .line 99
    add-int/lit8 v7, v4, 0x1

    .line 100
    .line 101
    iput v7, p0, Lf7/b;->s:I

    .line 102
    .line 103
    aget-char v4, v3, v4

    .line 104
    move v3, v8

    .line 105
    goto :goto_2

    .line 106
    :cond_6
    move v8, v1

    .line 107
    .line 108
    :goto_3
    if-nez v6, :cond_7

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v4, p1}, Li7/g;->S1(IZ)Lcom/fasterxml/jackson/core/JsonToken;

    .line 112
    move-result-object p1

    .line 113
    return-object p1

    .line 114
    .line 115
    :cond_7
    const/16 v9, 0x2e

    .line 116
    .line 117
    if-ne v4, v9, :cond_d

    .line 118
    array-length v9, p2

    .line 119
    .line 120
    if-lt v3, v9, :cond_8

    .line 121
    .line 122
    iget-object p2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 126
    move-result-object p2

    .line 127
    move v3, v1

    .line 128
    .line 129
    :cond_8
    add-int/lit8 v9, v3, 0x1

    .line 130
    .line 131
    aput-char v4, p2, v3

    .line 132
    move v3, v9

    .line 133
    move v9, v1

    .line 134
    .line 135
    :goto_4
    iget v10, p0, Lf7/b;->s:I

    .line 136
    .line 137
    iget v11, p0, Lf7/b;->t:I

    .line 138
    .line 139
    if-lt v10, v11, :cond_9

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 143
    move-result v10

    .line 144
    .line 145
    if-nez v10, :cond_9

    .line 146
    move v8, v2

    .line 147
    goto :goto_5

    .line 148
    .line 149
    :cond_9
    iget-object v4, p0, Li7/g;->T:[C

    .line 150
    .line 151
    iget v10, p0, Lf7/b;->s:I

    .line 152
    .line 153
    add-int/lit8 v11, v10, 0x1

    .line 154
    .line 155
    iput v11, p0, Lf7/b;->s:I

    .line 156
    .line 157
    aget-char v4, v4, v10

    .line 158
    .line 159
    if-lt v4, v5, :cond_c

    .line 160
    .line 161
    if-le v4, v7, :cond_a

    .line 162
    goto :goto_5

    .line 163
    .line 164
    :cond_a
    add-int/lit8 v9, v9, 0x1

    .line 165
    array-length v10, p2

    .line 166
    .line 167
    if-lt v3, v10, :cond_b

    .line 168
    .line 169
    iget-object p2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 173
    move-result-object p2

    .line 174
    move v3, v1

    .line 175
    .line 176
    :cond_b
    add-int/lit8 v10, v3, 0x1

    .line 177
    .line 178
    aput-char v4, p2, v3

    .line 179
    move v3, v10

    .line 180
    goto :goto_4

    .line 181
    .line 182
    :cond_c
    :goto_5
    if-nez v9, :cond_e

    .line 183
    .line 184
    const-string v10, "Decimal point not followed by a digit"

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0, v4, v10}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 188
    goto :goto_6

    .line 189
    :cond_d
    move v9, v1

    .line 190
    .line 191
    :cond_e
    :goto_6
    const/16 v10, 0x65

    .line 192
    .line 193
    if-eq v4, v10, :cond_f

    .line 194
    .line 195
    const/16 v10, 0x45

    .line 196
    .line 197
    if-ne v4, v10, :cond_19

    .line 198
    :cond_f
    array-length v10, p2

    .line 199
    .line 200
    if-lt v3, v10, :cond_10

    .line 201
    .line 202
    iget-object p2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 206
    move-result-object p2

    .line 207
    move v3, v1

    .line 208
    .line 209
    :cond_10
    add-int/lit8 v10, v3, 0x1

    .line 210
    .line 211
    aput-char v4, p2, v3

    .line 212
    .line 213
    iget v3, p0, Lf7/b;->s:I

    .line 214
    .line 215
    iget v4, p0, Lf7/b;->t:I

    .line 216
    .line 217
    const-string v11, "expected a digit for number exponent"

    .line 218
    .line 219
    if-ge v3, v4, :cond_11

    .line 220
    .line 221
    iget-object v4, p0, Li7/g;->T:[C

    .line 222
    .line 223
    add-int/lit8 v12, v3, 0x1

    .line 224
    .line 225
    iput v12, p0, Lf7/b;->s:I

    .line 226
    .line 227
    aget-char v3, v4, v3

    .line 228
    goto :goto_7

    .line 229
    .line 230
    .line 231
    :cond_11
    invoke-virtual {p0, v11}, Li7/g;->H2(Ljava/lang/String;)C

    .line 232
    move-result v3

    .line 233
    .line 234
    :goto_7
    if-eq v3, v0, :cond_13

    .line 235
    .line 236
    const/16 v0, 0x2b

    .line 237
    .line 238
    if-ne v3, v0, :cond_12

    .line 239
    goto :goto_9

    .line 240
    :cond_12
    :goto_8
    move v0, v1

    .line 241
    move v4, v3

    .line 242
    goto :goto_b

    .line 243
    :cond_13
    :goto_9
    array-length v0, p2

    .line 244
    .line 245
    if-lt v10, v0, :cond_14

    .line 246
    .line 247
    iget-object p2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 251
    move-result-object p2

    .line 252
    move v10, v1

    .line 253
    .line 254
    :cond_14
    add-int/lit8 v0, v10, 0x1

    .line 255
    .line 256
    aput-char v3, p2, v10

    .line 257
    .line 258
    iget v3, p0, Lf7/b;->s:I

    .line 259
    .line 260
    iget v4, p0, Lf7/b;->t:I

    .line 261
    .line 262
    if-ge v3, v4, :cond_15

    .line 263
    .line 264
    iget-object v4, p0, Li7/g;->T:[C

    .line 265
    .line 266
    add-int/lit8 v10, v3, 0x1

    .line 267
    .line 268
    iput v10, p0, Lf7/b;->s:I

    .line 269
    .line 270
    aget-char v3, v4, v3

    .line 271
    goto :goto_a

    .line 272
    .line 273
    .line 274
    :cond_15
    invoke-virtual {p0, v11}, Li7/g;->H2(Ljava/lang/String;)C

    .line 275
    move-result v3

    .line 276
    :goto_a
    move v10, v0

    .line 277
    goto :goto_8

    .line 278
    .line 279
    :goto_b
    if-gt v4, v7, :cond_18

    .line 280
    .line 281
    if-lt v4, v5, :cond_18

    .line 282
    .line 283
    add-int/lit8 v0, v0, 0x1

    .line 284
    array-length v3, p2

    .line 285
    .line 286
    if-lt v10, v3, :cond_16

    .line 287
    .line 288
    iget-object p2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 289
    .line 290
    .line 291
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 292
    move-result-object p2

    .line 293
    move v10, v1

    .line 294
    .line 295
    :cond_16
    add-int/lit8 v3, v10, 0x1

    .line 296
    .line 297
    aput-char v4, p2, v10

    .line 298
    .line 299
    iget v10, p0, Lf7/b;->s:I

    .line 300
    .line 301
    iget v11, p0, Lf7/b;->t:I

    .line 302
    .line 303
    if-lt v10, v11, :cond_17

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 307
    move-result v10

    .line 308
    .line 309
    if-nez v10, :cond_17

    .line 310
    move v8, v2

    .line 311
    :goto_c
    move v1, v0

    .line 312
    goto :goto_d

    .line 313
    .line 314
    :cond_17
    iget-object v4, p0, Li7/g;->T:[C

    .line 315
    .line 316
    iget v10, p0, Lf7/b;->s:I

    .line 317
    .line 318
    add-int/lit8 v11, v10, 0x1

    .line 319
    .line 320
    iput v11, p0, Lf7/b;->s:I

    .line 321
    .line 322
    aget-char v4, v4, v10

    .line 323
    move v10, v3

    .line 324
    goto :goto_b

    .line 325
    :cond_18
    move v3, v10

    .line 326
    goto :goto_c

    .line 327
    .line 328
    :goto_d
    if-nez v1, :cond_19

    .line 329
    .line 330
    const-string p2, "Exponent indicator not followed by a digit"

    .line 331
    .line 332
    .line 333
    invoke-virtual {p0, v4, p2}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 334
    .line 335
    :cond_19
    if-nez v8, :cond_1a

    .line 336
    .line 337
    iget p2, p0, Lf7/b;->s:I

    .line 338
    sub-int/2addr p2, v2

    .line 339
    .line 340
    iput p2, p0, Lf7/b;->s:I

    .line 341
    .line 342
    iget-object p2, p0, Lf7/b;->A:Li7/d;

    .line 343
    .line 344
    .line 345
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/f;->h()Z

    .line 346
    move-result p2

    .line 347
    .line 348
    if-eqz p2, :cond_1a

    .line 349
    .line 350
    .line 351
    invoke-virtual {p0, v4}, Li7/g;->G2(I)V

    .line 352
    .line 353
    :cond_1a
    iget-object p2, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 354
    .line 355
    .line 356
    invoke-virtual {p2, v3}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {p0, p1, v6, v9, v1}, Lf7/b;->H1(ZIII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 360
    move-result-object p1

    .line 361
    return-object p1
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
.end method

.method public final m2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    add-int/lit8 v3, v0, -0x1

    .line 5
    .line 6
    iget v1, p0, Lf7/b;->t:I

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    const/16 v4, 0x30

    .line 10
    .line 11
    if-ne p1, v4, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v2, v3}, Li7/g;->l2(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    const/4 p1, 0x1

    .line 18
    move v6, p1

    .line 19
    .line 20
    :goto_0
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    iput v3, p0, Lf7/b;->s:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2, v3}, Li7/g;->l2(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    .line 29
    :cond_1
    iget-object p1, p0, Li7/g;->T:[C

    .line 30
    move v5, v4

    .line 31
    .line 32
    add-int/lit8 v4, v0, 0x1

    .line 33
    .line 34
    aget-char p1, p1, v0

    .line 35
    .line 36
    if-lt p1, v5, :cond_3

    .line 37
    .line 38
    const/16 v7, 0x39

    .line 39
    .line 40
    if-le p1, v7, :cond_2

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 44
    move v0, v4

    .line 45
    move v4, v5

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_3
    :goto_1
    const/16 v1, 0x2e

    .line 49
    .line 50
    if-eq p1, v1, :cond_6

    .line 51
    .line 52
    const/16 v1, 0x65

    .line 53
    .line 54
    if-eq p1, v1, :cond_6

    .line 55
    .line 56
    const/16 v1, 0x45

    .line 57
    .line 58
    if-ne p1, v1, :cond_4

    .line 59
    goto :goto_2

    .line 60
    .line 61
    :cond_4
    iput v0, p0, Lf7/b;->s:I

    .line 62
    .line 63
    iget-object v1, p0, Lf7/b;->A:Li7/d;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/f;->h()Z

    .line 67
    move-result v1

    .line 68
    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1}, Li7/g;->G2(I)V

    .line 73
    :cond_5
    sub-int/2addr v0, v3

    .line 74
    .line 75
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 76
    .line 77
    iget-object v1, p0, Li7/g;->T:[C

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v1, v3, v0}, Lcom/fasterxml/jackson/core/util/i;->A([CII)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v2, v6}, Lf7/b;->K1(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    .line 87
    :cond_6
    :goto_2
    iput v4, p0, Lf7/b;->s:I

    .line 88
    const/4 v5, 0x0

    .line 89
    move-object v1, p0

    .line 90
    move v2, p1

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v1 .. v6}, Li7/g;->g2(IIIZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 94
    move-result-object p1

    .line 95
    return-object p1
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
.end method

.method public n2(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/OutputStream;[B)I
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    move-object/from16 v3, p3

    .line 9
    array-length v4, v3

    .line 10
    const/4 v5, 0x3

    .line 11
    sub-int/2addr v4, v5

    .line 12
    const/4 v6, 0x0

    .line 13
    move v7, v6

    .line 14
    move v8, v7

    .line 15
    .line 16
    :cond_0
    :goto_0
    iget v9, v0, Lf7/b;->s:I

    .line 17
    .line 18
    iget v10, v0, Lf7/b;->t:I

    .line 19
    .line 20
    if-lt v9, v10, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Li7/g;->X1()V

    .line 24
    .line 25
    :cond_1
    iget-object v9, v0, Li7/g;->T:[C

    .line 26
    .line 27
    iget v10, v0, Lf7/b;->s:I

    .line 28
    .line 29
    add-int/lit8 v11, v10, 0x1

    .line 30
    .line 31
    iput v11, v0, Lf7/b;->s:I

    .line 32
    .line 33
    aget-char v9, v9, v10

    .line 34
    .line 35
    const/16 v10, 0x20

    .line 36
    .line 37
    if-le v9, v10, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v9}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(C)I

    .line 41
    move-result v10

    .line 42
    .line 43
    const/16 v11, 0x22

    .line 44
    .line 45
    if-gez v10, :cond_3

    .line 46
    .line 47
    if-ne v9, v11, :cond_2

    .line 48
    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {v0, v1, v9, v6}, Lf7/b;->h1(Lcom/fasterxml/jackson/core/Base64Variant;CI)I

    .line 53
    move-result v10

    .line 54
    .line 55
    if-gez v10, :cond_3

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_3
    if-le v7, v4, :cond_4

    .line 59
    add-int/2addr v8, v7

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3, v6, v7}, Ljava/io/OutputStream;->write([BII)V

    .line 63
    move v7, v6

    .line 64
    .line 65
    :cond_4
    iget v9, v0, Lf7/b;->s:I

    .line 66
    .line 67
    iget v12, v0, Lf7/b;->t:I

    .line 68
    .line 69
    if-lt v9, v12, :cond_5

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Li7/g;->X1()V

    .line 73
    .line 74
    :cond_5
    iget-object v9, v0, Li7/g;->T:[C

    .line 75
    .line 76
    iget v12, v0, Lf7/b;->s:I

    .line 77
    .line 78
    add-int/lit8 v13, v12, 0x1

    .line 79
    .line 80
    iput v13, v0, Lf7/b;->s:I

    .line 81
    .line 82
    aget-char v9, v9, v12

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v9}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(C)I

    .line 86
    move-result v12

    .line 87
    const/4 v13, 0x1

    .line 88
    .line 89
    if-gez v12, :cond_6

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1, v9, v13}, Lf7/b;->h1(Lcom/fasterxml/jackson/core/Base64Variant;CI)I

    .line 93
    move-result v12

    .line 94
    .line 95
    :cond_6
    shl-int/lit8 v9, v10, 0x6

    .line 96
    or-int/2addr v9, v12

    .line 97
    .line 98
    iget v10, v0, Lf7/b;->s:I

    .line 99
    .line 100
    iget v12, v0, Lf7/b;->t:I

    .line 101
    .line 102
    if-lt v10, v12, :cond_7

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Li7/g;->X1()V

    .line 106
    .line 107
    :cond_7
    iget-object v10, v0, Li7/g;->T:[C

    .line 108
    .line 109
    iget v12, v0, Lf7/b;->s:I

    .line 110
    .line 111
    add-int/lit8 v14, v12, 0x1

    .line 112
    .line 113
    iput v14, v0, Lf7/b;->s:I

    .line 114
    .line 115
    aget-char v10, v10, v12

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v10}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(C)I

    .line 119
    move-result v12

    .line 120
    const/4 v14, -0x2

    .line 121
    const/4 v15, 0x2

    .line 122
    .line 123
    if-gez v12, :cond_e

    .line 124
    .line 125
    if-eq v12, v14, :cond_a

    .line 126
    .line 127
    if-ne v10, v11, :cond_9

    .line 128
    .line 129
    shr-int/lit8 v4, v9, 0x4

    .line 130
    .line 131
    add-int/lit8 v5, v7, 0x1

    .line 132
    int-to-byte v4, v4

    .line 133
    .line 134
    aput-byte v4, v3, v7

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPadding()Z

    .line 138
    move-result v4

    .line 139
    .line 140
    if-eqz v4, :cond_8

    .line 141
    .line 142
    iget v4, v0, Lf7/b;->s:I

    .line 143
    sub-int/2addr v4, v13

    .line 144
    .line 145
    iput v4, v0, Lf7/b;->s:I

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {p0 .. p1}, Lf7/b;->m1(Lcom/fasterxml/jackson/core/Base64Variant;)V

    .line 149
    :cond_8
    move v7, v5

    .line 150
    .line 151
    goto/16 :goto_2

    .line 152
    .line 153
    .line 154
    :cond_9
    invoke-virtual {v0, v1, v10, v15}, Lf7/b;->h1(Lcom/fasterxml/jackson/core/Base64Variant;CI)I

    .line 155
    move-result v12

    .line 156
    .line 157
    :cond_a
    if-ne v12, v14, :cond_e

    .line 158
    .line 159
    iget v10, v0, Lf7/b;->s:I

    .line 160
    .line 161
    iget v11, v0, Lf7/b;->t:I

    .line 162
    .line 163
    if-lt v10, v11, :cond_b

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Li7/g;->X1()V

    .line 167
    .line 168
    :cond_b
    iget-object v10, v0, Li7/g;->T:[C

    .line 169
    .line 170
    iget v11, v0, Lf7/b;->s:I

    .line 171
    .line 172
    add-int/lit8 v12, v11, 0x1

    .line 173
    .line 174
    iput v12, v0, Lf7/b;->s:I

    .line 175
    .line 176
    aget-char v10, v10, v11

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v10}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPaddingChar(C)Z

    .line 180
    move-result v11

    .line 181
    .line 182
    if-nez v11, :cond_d

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1, v10, v5}, Lf7/b;->h1(Lcom/fasterxml/jackson/core/Base64Variant;CI)I

    .line 186
    move-result v11

    .line 187
    .line 188
    if-ne v11, v14, :cond_c

    .line 189
    goto :goto_1

    .line 190
    .line 191
    :cond_c
    new-instance v2, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    const-string v3, "expected padding character \'"

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/Base64Variant;->getPaddingChar()C

    .line 203
    move-result v3

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    const-string v3, "\'"

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    move-result-object v2

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v1, v10, v5, v2}, Lf7/b;->G1(Lcom/fasterxml/jackson/core/Base64Variant;IILjava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 219
    move-result-object v1

    .line 220
    throw v1

    .line 221
    .line 222
    :cond_d
    :goto_1
    shr-int/lit8 v9, v9, 0x4

    .line 223
    .line 224
    add-int/lit8 v10, v7, 0x1

    .line 225
    int-to-byte v9, v9

    .line 226
    .line 227
    aput-byte v9, v3, v7

    .line 228
    move v7, v10

    .line 229
    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    :cond_e
    shl-int/lit8 v9, v9, 0x6

    .line 233
    or-int/2addr v9, v12

    .line 234
    .line 235
    iget v10, v0, Lf7/b;->s:I

    .line 236
    .line 237
    iget v12, v0, Lf7/b;->t:I

    .line 238
    .line 239
    if-lt v10, v12, :cond_f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, Li7/g;->X1()V

    .line 243
    .line 244
    :cond_f
    iget-object v10, v0, Li7/g;->T:[C

    .line 245
    .line 246
    iget v12, v0, Lf7/b;->s:I

    .line 247
    .line 248
    move/from16 v16, v13

    .line 249
    .line 250
    add-int/lit8 v13, v12, 0x1

    .line 251
    .line 252
    iput v13, v0, Lf7/b;->s:I

    .line 253
    .line 254
    aget-char v10, v10, v12

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, v10}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(C)I

    .line 258
    move-result v12

    .line 259
    .line 260
    if-gez v12, :cond_14

    .line 261
    .line 262
    if-eq v12, v14, :cond_13

    .line 263
    .line 264
    if-ne v10, v11, :cond_12

    .line 265
    .line 266
    shr-int/lit8 v4, v9, 0x2

    .line 267
    .line 268
    add-int/lit8 v5, v7, 0x1

    .line 269
    .line 270
    shr-int/lit8 v9, v9, 0xa

    .line 271
    int-to-byte v9, v9

    .line 272
    .line 273
    aput-byte v9, v3, v7

    .line 274
    add-int/2addr v7, v15

    .line 275
    int-to-byte v4, v4

    .line 276
    .line 277
    aput-byte v4, v3, v5

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPadding()Z

    .line 281
    move-result v4

    .line 282
    .line 283
    if-eqz v4, :cond_10

    .line 284
    .line 285
    iget v4, v0, Lf7/b;->s:I

    .line 286
    .line 287
    add-int/lit8 v4, v4, -0x1

    .line 288
    .line 289
    iput v4, v0, Lf7/b;->s:I

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {p0 .. p1}, Lf7/b;->m1(Lcom/fasterxml/jackson/core/Base64Variant;)V

    .line 293
    .line 294
    :cond_10
    :goto_2
    iput-boolean v6, v0, Li7/g;->Y:Z

    .line 295
    .line 296
    if-lez v7, :cond_11

    .line 297
    add-int/2addr v8, v7

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2, v3, v6, v7}, Ljava/io/OutputStream;->write([BII)V

    .line 301
    :cond_11
    return v8

    .line 302
    .line 303
    .line 304
    :cond_12
    invoke-virtual {v0, v1, v10, v5}, Lf7/b;->h1(Lcom/fasterxml/jackson/core/Base64Variant;CI)I

    .line 305
    move-result v12

    .line 306
    .line 307
    :cond_13
    if-ne v12, v14, :cond_14

    .line 308
    .line 309
    shr-int/lit8 v10, v9, 0x2

    .line 310
    .line 311
    add-int/lit8 v11, v7, 0x1

    .line 312
    .line 313
    shr-int/lit8 v9, v9, 0xa

    .line 314
    int-to-byte v9, v9

    .line 315
    .line 316
    aput-byte v9, v3, v7

    .line 317
    .line 318
    add-int/lit8 v7, v7, 0x2

    .line 319
    int-to-byte v9, v10

    .line 320
    .line 321
    aput-byte v9, v3, v11

    .line 322
    .line 323
    goto/16 :goto_0

    .line 324
    .line 325
    :cond_14
    shl-int/lit8 v9, v9, 0x6

    .line 326
    or-int/2addr v9, v12

    .line 327
    .line 328
    add-int/lit8 v10, v7, 0x1

    .line 329
    .line 330
    shr-int/lit8 v11, v9, 0x10

    .line 331
    int-to-byte v11, v11

    .line 332
    .line 333
    aput-byte v11, v3, v7

    .line 334
    .line 335
    add-int/lit8 v11, v7, 0x2

    .line 336
    .line 337
    shr-int/lit8 v12, v9, 0x8

    .line 338
    int-to-byte v12, v12

    .line 339
    .line 340
    aput-byte v12, v3, v10

    .line 341
    .line 342
    add-int/lit8 v7, v7, 0x3

    .line 343
    int-to-byte v9, v9

    .line 344
    .line 345
    aput-byte v9, v3, v11

    .line 346
    .line 347
    goto/16 :goto_0
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
.end method

.method public o2(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lf7/b;->w1()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Li7/g;->p2(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    return-void
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
.end method

.method public p(Lcom/fasterxml/jackson/core/Base64Variant;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_EMBEDDED_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lf7/b;->G:[B

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    return-object v1

    .line 12
    .line 13
    :cond_0
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    const-string v1, "Current token ("

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    iget-object v1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lf7/c;->K0(Ljava/lang/String;)V

    .line 43
    .line 44
    :cond_1
    iget-boolean v0, p0, Li7/g;->Y:Z

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    .line 49
    :try_start_0
    invoke-virtual {p0, p1}, Li7/g;->N1(Lcom/fasterxml/jackson/core/Base64Variant;)[B

    .line 50
    move-result-object v0

    .line 51
    .line 52
    iput-object v0, p0, Lf7/b;->G:[B
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    const/4 p1, 0x0

    .line 54
    .line 55
    iput-boolean p1, p0, Li7/g;->Y:Z

    .line 56
    goto :goto_0

    .line 57
    :catch_0
    move-exception v0

    .line 58
    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    const-string v2, "Failed to decode VALUE_STRING as base64 ("

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string p1, "): "

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonParser;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParseException;

    .line 90
    move-result-object p1

    .line 91
    throw p1

    .line 92
    .line 93
    :cond_2
    iget-object v0, p0, Lf7/b;->G:[B

    .line 94
    .line 95
    if-nez v0, :cond_3

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lf7/b;->l1()Lcom/fasterxml/jackson/core/util/c;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Li7/g;->W()Ljava/lang/String;

    .line 103
    move-result-object v1

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v1, v0, p1}, Lf7/c;->E0(Ljava/lang/String;Lcom/fasterxml/jackson/core/util/c;Lcom/fasterxml/jackson/core/Base64Variant;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/c;->q()[B

    .line 110
    move-result-object p1

    .line 111
    .line 112
    iput-object p1, p0, Lf7/b;->G:[B

    .line 113
    .line 114
    :cond_3
    :goto_0
    iget-object p1, p0, Lf7/b;->G:[B

    .line 115
    return-object p1
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
.end method

.method public p2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    :cond_0
    iget p1, p0, Lf7/b;->s:I

    .line 8
    .line 9
    iget v1, p0, Lf7/b;->t:I

    .line 10
    .line 11
    if-lt p1, v1, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 15
    move-result p1

    .line 16
    .line 17
    if-eqz p1, :cond_3

    .line 18
    .line 19
    :cond_1
    iget-object p1, p0, Li7/g;->T:[C

    .line 20
    .line 21
    iget v1, p0, Lf7/b;->s:I

    .line 22
    .line 23
    aget-char p1, p1, v1

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_2
    iget v1, p0, Lf7/b;->s:I

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    iput v1, p0, Lf7/b;->s:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 43
    move-result p1

    .line 44
    .line 45
    const/16 v1, 0x100

    .line 46
    .line 47
    if-lt p1, v1, :cond_0

    .line 48
    .line 49
    const-string p1, "..."

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    :cond_3
    :goto_0
    const-string p1, "Unrecognized token \'%s\': was expecting %s"

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1, v0, p2}, Lf7/c;->M0(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    return-void
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

.method public final q2()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :cond_0
    :goto_0
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    const-string v1, "Unexpected end-of-input within/between "

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    iget-object v1, p0, Lf7/b;->A:Li7/d;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/f;->j()Ljava/lang/String;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, " entries"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonParser;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParseException;

    .line 45
    move-result-object v0

    .line 46
    throw v0

    .line 47
    .line 48
    :cond_2
    :goto_1
    iget-object v0, p0, Li7/g;->T:[C

    .line 49
    .line 50
    iget v1, p0, Lf7/b;->s:I

    .line 51
    .line 52
    add-int/lit8 v2, v1, 0x1

    .line 53
    .line 54
    iput v2, p0, Lf7/b;->s:I

    .line 55
    .line 56
    aget-char v0, v0, v1

    .line 57
    .line 58
    const/16 v1, 0x20

    .line 59
    .line 60
    if-le v0, v1, :cond_5

    .line 61
    .line 62
    const/16 v1, 0x2f

    .line 63
    .line 64
    if-ne v0, v1, :cond_3

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Li7/g;->w2()V

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_3
    const/16 v1, 0x23

    .line 71
    .line 72
    if-ne v0, v1, :cond_4

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Li7/g;->B2()Z

    .line 76
    move-result v1

    .line 77
    .line 78
    if-eqz v1, :cond_4

    .line 79
    goto :goto_0

    .line 80
    :cond_4
    return v0

    .line 81
    .line 82
    :cond_5
    if-ge v0, v1, :cond_0

    .line 83
    .line 84
    const/16 v1, 0xa

    .line 85
    .line 86
    if-ne v0, v1, :cond_6

    .line 87
    .line 88
    iget v0, p0, Lf7/b;->v:I

    .line 89
    .line 90
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    iput v0, p0, Lf7/b;->v:I

    .line 93
    .line 94
    iput v2, p0, Lf7/b;->w:I

    .line 95
    goto :goto_0

    .line 96
    .line 97
    :cond_6
    const/16 v1, 0xd

    .line 98
    .line 99
    if-ne v0, v1, :cond_7

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Li7/g;->s2()V

    .line 103
    goto :goto_0

    .line 104
    .line 105
    :cond_7
    const/16 v1, 0x9

    .line 106
    .line 107
    if-eq v0, v1, :cond_0

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v0}, Lf7/c;->U0(I)V

    .line 111
    goto :goto_0
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
.end method

.method public r0()Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lf7/b;->H:I

    .line 4
    .line 5
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 6
    .line 7
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Li7/g;->d2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 14
    return-object v2

    .line 15
    .line 16
    :cond_0
    iget-boolean v0, p0, Li7/g;->Y:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Li7/g;->y2()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, Li7/g;->z2()I

    .line 25
    move-result v0

    .line 26
    .line 27
    if-gez v0, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lf7/b;->close()V

    .line 31
    .line 32
    iput-object v2, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 33
    return-object v2

    .line 34
    .line 35
    :cond_2
    iput-object v2, p0, Lf7/b;->G:[B

    .line 36
    .line 37
    const/16 v3, 0x5d

    .line 38
    .line 39
    if-eq v0, v3, :cond_10

    .line 40
    .line 41
    const/16 v4, 0x7d

    .line 42
    .line 43
    if-ne v0, v4, :cond_3

    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_3
    iget-object v5, p0, Lf7/b;->A:Li7/d;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Li7/d;->p()Z

    .line 51
    move-result v5

    .line 52
    .line 53
    if-eqz v5, :cond_5

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, Li7/g;->v2(I)I

    .line 57
    move-result v0

    .line 58
    .line 59
    iget v5, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 60
    .line 61
    sget v6, Li7/g;->c0:I

    .line 62
    and-int/2addr v5, v6

    .line 63
    .line 64
    if-eqz v5, :cond_5

    .line 65
    .line 66
    if-eq v0, v3, :cond_4

    .line 67
    .line 68
    if-ne v0, v4, :cond_5

    .line 69
    .line 70
    .line 71
    :cond_4
    invoke-virtual {p0, v0}, Li7/g;->M1(I)V

    .line 72
    return-object v2

    .line 73
    .line 74
    :cond_5
    iget-object v3, p0, Lf7/b;->A:Li7/d;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/f;->g()Z

    .line 78
    move-result v3

    .line 79
    .line 80
    if-nez v3, :cond_6

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Li7/g;->C2()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, Li7/g;->e2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 87
    return-object v2

    .line 88
    .line 89
    .line 90
    :cond_6
    invoke-virtual {p0}, Li7/g;->D2()V

    .line 91
    .line 92
    const/16 v2, 0x22

    .line 93
    .line 94
    if-ne v0, v2, :cond_7

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Li7/g;->i2()Ljava/lang/String;

    .line 98
    move-result-object v0

    .line 99
    goto :goto_0

    .line 100
    .line 101
    .line 102
    :cond_7
    invoke-virtual {p0, v0}, Li7/g;->T1(I)Ljava/lang/String;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    :goto_0
    iget-object v3, p0, Lf7/b;->A:Li7/d;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v0}, Li7/d;->t(Ljava/lang/String;)V

    .line 109
    .line 110
    iput-object v1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Li7/g;->t2()I

    .line 114
    move-result v1

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Li7/g;->C2()V

    .line 118
    .line 119
    if-ne v1, v2, :cond_8

    .line 120
    const/4 v1, 0x1

    .line 121
    .line 122
    iput-boolean v1, p0, Li7/g;->Y:Z

    .line 123
    .line 124
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 125
    .line 126
    iput-object v1, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 127
    return-object v0

    .line 128
    .line 129
    :cond_8
    const/16 v2, 0x2d

    .line 130
    .line 131
    if-eq v1, v2, :cond_f

    .line 132
    .line 133
    const/16 v2, 0x2e

    .line 134
    .line 135
    if-eq v1, v2, :cond_e

    .line 136
    .line 137
    const/16 v2, 0x5b

    .line 138
    .line 139
    if-eq v1, v2, :cond_d

    .line 140
    .line 141
    const/16 v2, 0x66

    .line 142
    .line 143
    if-eq v1, v2, :cond_c

    .line 144
    .line 145
    const/16 v2, 0x6e

    .line 146
    .line 147
    if-eq v1, v2, :cond_b

    .line 148
    .line 149
    const/16 v2, 0x74

    .line 150
    .line 151
    if-eq v1, v2, :cond_a

    .line 152
    .line 153
    const/16 v2, 0x7b

    .line 154
    .line 155
    if-eq v1, v2, :cond_9

    .line 156
    .line 157
    .line 158
    packed-switch v1, :pswitch_data_0

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, v1}, Li7/g;->V1(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 162
    move-result-object v1

    .line 163
    goto :goto_1

    .line 164
    .line 165
    .line 166
    :pswitch_0
    invoke-virtual {p0, v1}, Li7/g;->m2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 167
    move-result-object v1

    .line 168
    goto :goto_1

    .line 169
    .line 170
    :cond_9
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 171
    goto :goto_1

    .line 172
    .line 173
    .line 174
    :cond_a
    invoke-direct {p0}, Li7/g;->c2()V

    .line 175
    .line 176
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 177
    goto :goto_1

    .line 178
    .line 179
    .line 180
    :cond_b
    invoke-direct {p0}, Li7/g;->Z1()V

    .line 181
    .line 182
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    .line 183
    goto :goto_1

    .line 184
    .line 185
    .line 186
    :cond_c
    invoke-direct {p0}, Li7/g;->Y1()V

    .line 187
    .line 188
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 189
    goto :goto_1

    .line 190
    .line 191
    :cond_d
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 192
    goto :goto_1

    .line 193
    .line 194
    .line 195
    :cond_e
    invoke-virtual {p0}, Li7/g;->h2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 196
    move-result-object v1

    .line 197
    goto :goto_1

    .line 198
    .line 199
    .line 200
    :cond_f
    invoke-virtual {p0}, Li7/g;->k2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 201
    move-result-object v1

    .line 202
    .line 203
    :goto_1
    iput-object v1, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 204
    return-object v0

    .line 205
    .line 206
    .line 207
    :cond_10
    :goto_2
    invoke-virtual {p0, v0}, Li7/g;->M1(I)V

    .line 208
    return-object v2

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
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
.end method

.method public final r2()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :cond_0
    :goto_0
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    :cond_1
    iget-object v0, p0, Li7/g;->T:[C

    .line 15
    .line 16
    iget v1, p0, Lf7/b;->s:I

    .line 17
    .line 18
    add-int/lit8 v2, v1, 0x1

    .line 19
    .line 20
    iput v2, p0, Lf7/b;->s:I

    .line 21
    .line 22
    aget-char v0, v0, v1

    .line 23
    .line 24
    const/16 v1, 0x2a

    .line 25
    .line 26
    if-gt v0, v1, :cond_0

    .line 27
    .line 28
    if-ne v0, v1, :cond_4

    .line 29
    .line 30
    iget v0, p0, Lf7/b;->t:I

    .line 31
    .line 32
    if-lt v2, v0, :cond_3

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-nez v0, :cond_3

    .line 39
    .line 40
    :cond_2
    const-string v0, " in a comment"

    .line 41
    const/4 v1, 0x0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0, v1}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 45
    return-void

    .line 46
    .line 47
    :cond_3
    iget-object v0, p0, Li7/g;->T:[C

    .line 48
    .line 49
    iget v1, p0, Lf7/b;->s:I

    .line 50
    .line 51
    aget-char v0, v0, v1

    .line 52
    .line 53
    const/16 v2, 0x2f

    .line 54
    .line 55
    if-ne v0, v2, :cond_0

    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    iput v1, p0, Lf7/b;->s:I

    .line 60
    return-void

    .line 61
    .line 62
    :cond_4
    const/16 v1, 0x20

    .line 63
    .line 64
    if-ge v0, v1, :cond_0

    .line 65
    .line 66
    const/16 v1, 0xa

    .line 67
    .line 68
    if-ne v0, v1, :cond_5

    .line 69
    .line 70
    iget v0, p0, Lf7/b;->v:I

    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    iput v0, p0, Lf7/b;->v:I

    .line 75
    .line 76
    iput v2, p0, Lf7/b;->w:I

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :cond_5
    const/16 v1, 0xd

    .line 80
    .line 81
    if-ne v0, v1, :cond_6

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Li7/g;->s2()V

    .line 85
    goto :goto_0

    .line 86
    .line 87
    :cond_6
    const/16 v1, 0x9

    .line 88
    .line 89
    if-eq v0, v1, :cond_0

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0}, Lf7/c;->U0(I)V

    .line 93
    goto :goto_0
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
.end method

.method public final s0()Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-ne v0, v1, :cond_4

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-boolean v0, p0, Lf7/b;->E:Z

    .line 11
    .line 12
    iget-object v1, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 13
    .line 14
    iput-object v2, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 15
    .line 16
    iput-object v1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 17
    .line 18
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 19
    .line 20
    if-ne v1, v3, :cond_1

    .line 21
    .line 22
    iget-boolean v1, p0, Li7/g;->Y:Z

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iput-boolean v0, p0, Li7/g;->Y:Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Li7/g;->O1()V

    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    .line 38
    :cond_1
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 39
    .line 40
    if-ne v1, v0, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 43
    .line 44
    iget v1, p0, Lf7/b;->y:I

    .line 45
    .line 46
    iget v3, p0, Lf7/b;->z:I

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1, v3}, Li7/d;->m(II)Li7/d;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    iput-object v0, p0, Lf7/b;->A:Li7/d;

    .line 53
    goto :goto_0

    .line 54
    .line 55
    :cond_2
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 56
    .line 57
    if-ne v1, v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 60
    .line 61
    iget v1, p0, Lf7/b;->y:I

    .line 62
    .line 63
    iget v3, p0, Lf7/b;->z:I

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1, v3}, Li7/d;->n(II)Li7/d;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    iput-object v0, p0, Lf7/b;->A:Li7/d;

    .line 70
    :cond_3
    :goto_0
    return-object v2

    .line 71
    .line 72
    .line 73
    :cond_4
    invoke-virtual {p0}, Li7/g;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 77
    .line 78
    if-ne v0, v1, :cond_5

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Li7/g;->W()Ljava/lang/String;

    .line 82
    move-result-object v0

    .line 83
    return-object v0

    .line 84
    :cond_5
    return-object v2
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
.end method

.method public s1()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lf7/b;->s1()V

    .line 4
    .line 5
    iget-object v0, p0, Li7/g;->W:Lk7/b;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lk7/b;->r()V

    .line 9
    .line 10
    iget-boolean v0, p0, Li7/g;->U:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Li7/g;->T:[C

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    iput-object v1, p0, Li7/g;->T:[C

    .line 20
    .line 21
    iget-object v1, p0, Lf7/b;->q:Lcom/fasterxml/jackson/core/io/d;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/io/d;->s([C)V

    .line 25
    :cond_0
    return-void
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
    .line 44
    .line 45
    .line 46
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
.end method

.method public final s2()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Li7/g;->T:[C

    .line 15
    .line 16
    iget v1, p0, Lf7/b;->s:I

    .line 17
    .line 18
    aget-char v0, v0, v1

    .line 19
    .line 20
    const/16 v2, 0xa

    .line 21
    .line 22
    if-ne v0, v2, :cond_1

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    iput v1, p0, Lf7/b;->s:I

    .line 27
    .line 28
    :cond_1
    iget v0, p0, Lf7/b;->v:I

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    iput v0, p0, Lf7/b;->v:I

    .line 33
    .line 34
    iget v0, p0, Lf7/b;->s:I

    .line 35
    .line 36
    iput v0, p0, Lf7/b;->w:I

    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
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
.end method

.method public final t0()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li7/g;->d2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    iput v0, p0, Lf7/b;->H:I

    .line 15
    .line 16
    iget-boolean v0, p0, Li7/g;->Y:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Li7/g;->y2()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, Li7/g;->z2()I

    .line 25
    move-result v0

    .line 26
    const/4 v2, 0x0

    .line 27
    .line 28
    if-gez v0, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lf7/b;->close()V

    .line 32
    .line 33
    iput-object v2, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 34
    return-object v2

    .line 35
    .line 36
    :cond_2
    iput-object v2, p0, Lf7/b;->G:[B

    .line 37
    .line 38
    const/16 v2, 0x5d

    .line 39
    .line 40
    if-eq v0, v2, :cond_14

    .line 41
    .line 42
    const/16 v3, 0x7d

    .line 43
    .line 44
    if-ne v0, v3, :cond_3

    .line 45
    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_3
    iget-object v4, p0, Lf7/b;->A:Li7/d;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Li7/d;->p()Z

    .line 52
    move-result v4

    .line 53
    .line 54
    if-eqz v4, :cond_5

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, Li7/g;->v2(I)I

    .line 58
    move-result v0

    .line 59
    .line 60
    iget v4, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 61
    .line 62
    sget v5, Li7/g;->c0:I

    .line 63
    and-int/2addr v4, v5

    .line 64
    .line 65
    if-eqz v4, :cond_5

    .line 66
    .line 67
    if-eq v0, v2, :cond_4

    .line 68
    .line 69
    if-ne v0, v3, :cond_5

    .line 70
    .line 71
    .line 72
    :cond_4
    invoke-virtual {p0, v0}, Li7/g;->M1(I)V

    .line 73
    .line 74
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 75
    return-object v0

    .line 76
    .line 77
    :cond_5
    iget-object v2, p0, Lf7/b;->A:Li7/d;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/f;->g()Z

    .line 81
    move-result v2

    .line 82
    .line 83
    const/16 v4, 0x22

    .line 84
    .line 85
    if-eqz v2, :cond_7

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Li7/g;->D2()V

    .line 89
    .line 90
    if-ne v0, v4, :cond_6

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Li7/g;->i2()Ljava/lang/String;

    .line 94
    move-result-object v0

    .line 95
    goto :goto_0

    .line 96
    .line 97
    .line 98
    :cond_6
    invoke-virtual {p0, v0}, Li7/g;->T1(I)Ljava/lang/String;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    :goto_0
    iget-object v5, p0, Lf7/b;->A:Li7/d;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v0}, Li7/d;->t(Ljava/lang/String;)V

    .line 105
    .line 106
    iput-object v1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Li7/g;->t2()I

    .line 110
    move-result v0

    .line 111
    .line 112
    .line 113
    :cond_7
    invoke-virtual {p0}, Li7/g;->C2()V

    .line 114
    .line 115
    if-eq v0, v4, :cond_12

    .line 116
    .line 117
    const/16 v1, 0x5b

    .line 118
    .line 119
    if-eq v0, v1, :cond_10

    .line 120
    .line 121
    const/16 v1, 0x66

    .line 122
    .line 123
    if-eq v0, v1, :cond_f

    .line 124
    .line 125
    const/16 v1, 0x6e

    .line 126
    .line 127
    if-eq v0, v1, :cond_e

    .line 128
    .line 129
    const/16 v1, 0x74

    .line 130
    .line 131
    if-eq v0, v1, :cond_d

    .line 132
    .line 133
    const/16 v1, 0x7b

    .line 134
    .line 135
    if-eq v0, v1, :cond_b

    .line 136
    .line 137
    if-eq v0, v3, :cond_a

    .line 138
    .line 139
    const/16 v1, 0x2d

    .line 140
    .line 141
    if-eq v0, v1, :cond_9

    .line 142
    .line 143
    const/16 v1, 0x2e

    .line 144
    .line 145
    if-eq v0, v1, :cond_8

    .line 146
    .line 147
    .line 148
    packed-switch v0, :pswitch_data_0

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v0}, Li7/g;->V1(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 152
    move-result-object v0

    .line 153
    goto :goto_2

    .line 154
    .line 155
    .line 156
    :pswitch_0
    invoke-virtual {p0, v0}, Li7/g;->m2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 157
    move-result-object v0

    .line 158
    goto :goto_2

    .line 159
    .line 160
    .line 161
    :cond_8
    invoke-virtual {p0}, Li7/g;->h2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 162
    move-result-object v0

    .line 163
    goto :goto_2

    .line 164
    .line 165
    .line 166
    :cond_9
    invoke-virtual {p0}, Li7/g;->k2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 167
    move-result-object v0

    .line 168
    goto :goto_2

    .line 169
    .line 170
    :cond_a
    const-string v1, "expected a value"

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, v0, v1}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 174
    goto :goto_1

    .line 175
    .line 176
    :cond_b
    if-nez v2, :cond_c

    .line 177
    .line 178
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 179
    .line 180
    iget v1, p0, Lf7/b;->y:I

    .line 181
    .line 182
    iget v3, p0, Lf7/b;->z:I

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1, v3}, Li7/d;->n(II)Li7/d;

    .line 186
    move-result-object v0

    .line 187
    .line 188
    iput-object v0, p0, Lf7/b;->A:Li7/d;

    .line 189
    .line 190
    :cond_c
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 191
    goto :goto_2

    .line 192
    .line 193
    .line 194
    :cond_d
    :goto_1
    invoke-direct {p0}, Li7/g;->c2()V

    .line 195
    .line 196
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 197
    goto :goto_2

    .line 198
    .line 199
    .line 200
    :cond_e
    invoke-direct {p0}, Li7/g;->Z1()V

    .line 201
    .line 202
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    .line 203
    goto :goto_2

    .line 204
    .line 205
    .line 206
    :cond_f
    invoke-direct {p0}, Li7/g;->Y1()V

    .line 207
    .line 208
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 209
    goto :goto_2

    .line 210
    .line 211
    :cond_10
    if-nez v2, :cond_11

    .line 212
    .line 213
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 214
    .line 215
    iget v1, p0, Lf7/b;->y:I

    .line 216
    .line 217
    iget v3, p0, Lf7/b;->z:I

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v1, v3}, Li7/d;->m(II)Li7/d;

    .line 221
    move-result-object v0

    .line 222
    .line 223
    iput-object v0, p0, Lf7/b;->A:Li7/d;

    .line 224
    .line 225
    :cond_11
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 226
    goto :goto_2

    .line 227
    :cond_12
    const/4 v0, 0x1

    .line 228
    .line 229
    iput-boolean v0, p0, Li7/g;->Y:Z

    .line 230
    .line 231
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 232
    .line 233
    :goto_2
    if-eqz v2, :cond_13

    .line 234
    .line 235
    iput-object v0, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 236
    .line 237
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 238
    return-object v0

    .line 239
    .line 240
    :cond_13
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 241
    return-object v0

    .line 242
    .line 243
    .line 244
    :cond_14
    :goto_3
    invoke-virtual {p0, v0}, Li7/g;->M1(I)V

    .line 245
    .line 246
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 247
    return-object v0

    .line 248
    nop

    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
.end method

.method public final t2()I
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x4

    .line 5
    .line 6
    iget v2, p0, Lf7/b;->t:I

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    if-lt v1, v2, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v3}, Li7/g;->u2(Z)I

    .line 13
    move-result v0

    .line 14
    return v0

    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, Li7/g;->T:[C

    .line 17
    .line 18
    aget-char v2, v1, v0

    .line 19
    .line 20
    const/16 v4, 0x3a

    .line 21
    .line 22
    const/16 v5, 0x9

    .line 23
    .line 24
    const/16 v6, 0x23

    .line 25
    .line 26
    const/16 v7, 0x2f

    .line 27
    .line 28
    const/16 v8, 0x20

    .line 29
    const/4 v9, 0x1

    .line 30
    .line 31
    if-ne v2, v4, :cond_8

    .line 32
    .line 33
    add-int/lit8 v2, v0, 0x1

    .line 34
    .line 35
    iput v2, p0, Lf7/b;->s:I

    .line 36
    .line 37
    aget-char v2, v1, v2

    .line 38
    .line 39
    if-le v2, v8, :cond_3

    .line 40
    .line 41
    if-eq v2, v7, :cond_2

    .line 42
    .line 43
    if-ne v2, v6, :cond_1

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_1
    add-int/lit8 v0, v0, 0x2

    .line 47
    .line 48
    iput v0, p0, Lf7/b;->s:I

    .line 49
    return v2

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    invoke-virtual {p0, v9}, Li7/g;->u2(Z)I

    .line 53
    move-result v0

    .line 54
    return v0

    .line 55
    .line 56
    :cond_3
    if-eq v2, v8, :cond_4

    .line 57
    .line 58
    if-ne v2, v5, :cond_7

    .line 59
    .line 60
    :cond_4
    add-int/lit8 v2, v0, 0x2

    .line 61
    .line 62
    iput v2, p0, Lf7/b;->s:I

    .line 63
    .line 64
    aget-char v1, v1, v2

    .line 65
    .line 66
    if-le v1, v8, :cond_7

    .line 67
    .line 68
    if-eq v1, v7, :cond_6

    .line 69
    .line 70
    if-ne v1, v6, :cond_5

    .line 71
    goto :goto_1

    .line 72
    .line 73
    :cond_5
    add-int/lit8 v0, v0, 0x3

    .line 74
    .line 75
    iput v0, p0, Lf7/b;->s:I

    .line 76
    return v1

    .line 77
    .line 78
    .line 79
    :cond_6
    :goto_1
    invoke-virtual {p0, v9}, Li7/g;->u2(Z)I

    .line 80
    move-result v0

    .line 81
    return v0

    .line 82
    .line 83
    .line 84
    :cond_7
    invoke-virtual {p0, v9}, Li7/g;->u2(Z)I

    .line 85
    move-result v0

    .line 86
    return v0

    .line 87
    .line 88
    :cond_8
    if-eq v2, v8, :cond_9

    .line 89
    .line 90
    if-ne v2, v5, :cond_a

    .line 91
    :cond_9
    add-int/2addr v0, v9

    .line 92
    .line 93
    iput v0, p0, Lf7/b;->s:I

    .line 94
    .line 95
    aget-char v2, v1, v0

    .line 96
    .line 97
    :cond_a
    if-ne v2, v4, :cond_12

    .line 98
    .line 99
    iget v0, p0, Lf7/b;->s:I

    .line 100
    .line 101
    add-int/lit8 v2, v0, 0x1

    .line 102
    .line 103
    iput v2, p0, Lf7/b;->s:I

    .line 104
    .line 105
    aget-char v2, v1, v2

    .line 106
    .line 107
    if-le v2, v8, :cond_d

    .line 108
    .line 109
    if-eq v2, v7, :cond_c

    .line 110
    .line 111
    if-ne v2, v6, :cond_b

    .line 112
    goto :goto_2

    .line 113
    .line 114
    :cond_b
    add-int/lit8 v0, v0, 0x2

    .line 115
    .line 116
    iput v0, p0, Lf7/b;->s:I

    .line 117
    return v2

    .line 118
    .line 119
    .line 120
    :cond_c
    :goto_2
    invoke-virtual {p0, v9}, Li7/g;->u2(Z)I

    .line 121
    move-result v0

    .line 122
    return v0

    .line 123
    .line 124
    :cond_d
    if-eq v2, v8, :cond_e

    .line 125
    .line 126
    if-ne v2, v5, :cond_11

    .line 127
    .line 128
    :cond_e
    add-int/lit8 v2, v0, 0x2

    .line 129
    .line 130
    iput v2, p0, Lf7/b;->s:I

    .line 131
    .line 132
    aget-char v1, v1, v2

    .line 133
    .line 134
    if-le v1, v8, :cond_11

    .line 135
    .line 136
    if-eq v1, v7, :cond_10

    .line 137
    .line 138
    if-ne v1, v6, :cond_f

    .line 139
    goto :goto_3

    .line 140
    .line 141
    :cond_f
    add-int/lit8 v0, v0, 0x3

    .line 142
    .line 143
    iput v0, p0, Lf7/b;->s:I

    .line 144
    return v1

    .line 145
    .line 146
    .line 147
    :cond_10
    :goto_3
    invoke-virtual {p0, v9}, Li7/g;->u2(Z)I

    .line 148
    move-result v0

    .line 149
    return v0

    .line 150
    .line 151
    .line 152
    :cond_11
    invoke-virtual {p0, v9}, Li7/g;->u2(Z)I

    .line 153
    move-result v0

    .line 154
    return v0

    .line 155
    .line 156
    .line 157
    :cond_12
    invoke-virtual {p0, v3}, Li7/g;->u2(Z)I

    .line 158
    move-result v0

    .line 159
    return v0
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
.end method

.method public u()Lcom/fasterxml/jackson/core/g;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Li7/g;->V:Lcom/fasterxml/jackson/core/g;

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
.end method

.method public final u2(Z)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :cond_0
    :goto_0
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    const-string v0, " within/between "

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->j()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v0, " entries"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    const/4 v0, 0x0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, v0}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 46
    const/4 p1, -0x1

    .line 47
    return p1

    .line 48
    .line 49
    :cond_2
    :goto_1
    iget-object v0, p0, Li7/g;->T:[C

    .line 50
    .line 51
    iget v1, p0, Lf7/b;->s:I

    .line 52
    .line 53
    add-int/lit8 v2, v1, 0x1

    .line 54
    .line 55
    iput v2, p0, Lf7/b;->s:I

    .line 56
    .line 57
    aget-char v0, v0, v1

    .line 58
    .line 59
    const/16 v1, 0x20

    .line 60
    const/4 v3, 0x1

    .line 61
    .line 62
    if-le v0, v1, :cond_7

    .line 63
    .line 64
    const/16 v1, 0x2f

    .line 65
    .line 66
    if-ne v0, v1, :cond_3

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Li7/g;->w2()V

    .line 70
    goto :goto_0

    .line 71
    .line 72
    :cond_3
    const/16 v1, 0x23

    .line 73
    .line 74
    if-ne v0, v1, :cond_4

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Li7/g;->B2()Z

    .line 78
    move-result v1

    .line 79
    .line 80
    if-eqz v1, :cond_4

    .line 81
    goto :goto_0

    .line 82
    .line 83
    :cond_4
    if-eqz p1, :cond_5

    .line 84
    return v0

    .line 85
    .line 86
    :cond_5
    const/16 p1, 0x3a

    .line 87
    .line 88
    if-eq v0, p1, :cond_6

    .line 89
    .line 90
    .line 91
    const-string/jumbo p1, "was expecting a colon to separate field name and value"

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0, p1}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 95
    :cond_6
    move p1, v3

    .line 96
    goto :goto_0

    .line 97
    .line 98
    :cond_7
    if-ge v0, v1, :cond_0

    .line 99
    .line 100
    const/16 v1, 0xa

    .line 101
    .line 102
    if-ne v0, v1, :cond_8

    .line 103
    .line 104
    iget v0, p0, Lf7/b;->v:I

    .line 105
    add-int/2addr v0, v3

    .line 106
    .line 107
    iput v0, p0, Lf7/b;->v:I

    .line 108
    .line 109
    iput v2, p0, Lf7/b;->w:I

    .line 110
    goto :goto_0

    .line 111
    .line 112
    :cond_8
    const/16 v1, 0xd

    .line 113
    .line 114
    if-ne v0, v1, :cond_9

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Li7/g;->s2()V

    .line 118
    goto :goto_0

    .line 119
    .line 120
    :cond_9
    const/16 v1, 0x9

    .line 121
    .line 122
    if-eq v0, v1, :cond_0

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v0}, Lf7/c;->U0(I)V

    .line 126
    goto :goto_0
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
.end method

.method public v()Lcom/fasterxml/jackson/core/JsonLocation;
    .locals 9

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->w:I

    .line 5
    sub-int/2addr v0, v1

    .line 6
    .line 7
    add-int/lit8 v8, v0, 0x1

    .line 8
    .line 9
    new-instance v1, Lcom/fasterxml/jackson/core/JsonLocation;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lf7/b;->g1()Lcom/fasterxml/jackson/core/io/ContentReference;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    iget-wide v3, p0, Lf7/b;->u:J

    .line 16
    .line 17
    iget v0, p0, Lf7/b;->s:I

    .line 18
    int-to-long v5, v0

    .line 19
    add-long/2addr v5, v3

    .line 20
    .line 21
    iget v7, p0, Lf7/b;->v:I

    .line 22
    .line 23
    const-wide/16 v3, -0x1

    .line 24
    .line 25
    .line 26
    invoke-direct/range {v1 .. v8}, Lcom/fasterxml/jackson/core/JsonLocation;-><init>(Lcom/fasterxml/jackson/core/io/ContentReference;JJII)V

    .line 27
    return-object v1
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
    .line 44
    .line 45
    .line 46
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
.end method

.method public final v2(I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x2c

    .line 3
    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string/jumbo v1, "was expecting comma to separate "

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    iget-object v1, p0, Lf7/b;->A:Li7/d;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/f;->j()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v1, " entries"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1, v0}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 37
    .line 38
    :cond_0
    :goto_0
    iget p1, p0, Lf7/b;->s:I

    .line 39
    .line 40
    iget v0, p0, Lf7/b;->t:I

    .line 41
    .line 42
    if-ge p1, v0, :cond_6

    .line 43
    .line 44
    iget-object v0, p0, Li7/g;->T:[C

    .line 45
    .line 46
    add-int/lit8 v1, p1, 0x1

    .line 47
    .line 48
    iput v1, p0, Lf7/b;->s:I

    .line 49
    .line 50
    aget-char v0, v0, p1

    .line 51
    .line 52
    const/16 v2, 0x20

    .line 53
    .line 54
    if-le v0, v2, :cond_3

    .line 55
    .line 56
    const/16 v1, 0x2f

    .line 57
    .line 58
    if-eq v0, v1, :cond_2

    .line 59
    .line 60
    const/16 v1, 0x23

    .line 61
    .line 62
    if-ne v0, v1, :cond_1

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    return v0

    .line 65
    .line 66
    :cond_2
    :goto_1
    iput p1, p0, Lf7/b;->s:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Li7/g;->q2()I

    .line 70
    move-result p1

    .line 71
    return p1

    .line 72
    .line 73
    :cond_3
    if-ge v0, v2, :cond_0

    .line 74
    .line 75
    const/16 p1, 0xa

    .line 76
    .line 77
    if-ne v0, p1, :cond_4

    .line 78
    .line 79
    iget p1, p0, Lf7/b;->v:I

    .line 80
    .line 81
    add-int/lit8 p1, p1, 0x1

    .line 82
    .line 83
    iput p1, p0, Lf7/b;->v:I

    .line 84
    .line 85
    iput v1, p0, Lf7/b;->w:I

    .line 86
    goto :goto_0

    .line 87
    .line 88
    :cond_4
    const/16 p1, 0xd

    .line 89
    .line 90
    if-ne v0, p1, :cond_5

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Li7/g;->s2()V

    .line 94
    goto :goto_0

    .line 95
    .line 96
    :cond_5
    const/16 p1, 0x9

    .line 97
    .line 98
    if-eq v0, p1, :cond_0

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v0}, Lf7/c;->U0(I)V

    .line 102
    goto :goto_0

    .line 103
    .line 104
    .line 105
    :cond_6
    invoke-virtual {p0}, Li7/g;->q2()I

    .line 106
    move-result p1

    .line 107
    return p1
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
.end method

.method public final w2()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 3
    .line 4
    sget v1, Li7/g;->i0:I

    .line 5
    and-int/2addr v0, v1

    .line 6
    .line 7
    const/16 v1, 0x2f

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "maybe a (non-standard) comment? (not recognized as one since Feature \'ALLOW_COMMENTS\' not enabled for parser)"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1, v0}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 15
    .line 16
    :cond_0
    iget v0, p0, Lf7/b;->s:I

    .line 17
    .line 18
    iget v2, p0, Lf7/b;->t:I

    .line 19
    .line 20
    if-lt v0, v2, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    const-string v0, " in a comment"

    .line 29
    const/4 v2, 0x0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0, v2}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Li7/g;->T:[C

    .line 35
    .line 36
    iget v2, p0, Lf7/b;->s:I

    .line 37
    .line 38
    add-int/lit8 v3, v2, 0x1

    .line 39
    .line 40
    iput v3, p0, Lf7/b;->s:I

    .line 41
    .line 42
    aget-char v0, v0, v2

    .line 43
    .line 44
    if-ne v0, v1, :cond_2

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Li7/g;->x2()V

    .line 48
    return-void

    .line 49
    .line 50
    :cond_2
    const/16 v1, 0x2a

    .line 51
    .line 52
    if-ne v0, v1, :cond_3

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Li7/g;->r2()V

    .line 56
    return-void

    .line 57
    .line 58
    .line 59
    :cond_3
    const-string/jumbo v1, "was expecting either \'*\' or \'/\' for a comment"

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0, v1}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 63
    return-void
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
.end method

.method public x0(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/OutputStream;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Li7/g;->Y:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 7
    .line 8
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lf7/b;->q:Lcom/fasterxml/jackson/core/io/d;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/io/d;->d()[B

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Li7/g;->n2(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/OutputStream;[B)I

    .line 21
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    iget-object p2, p0, Lf7/b;->q:Lcom/fasterxml/jackson/core/io/d;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/io/d;->o([B)V

    .line 27
    return p1

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    .line 30
    iget-object p2, p0, Lf7/b;->q:Lcom/fasterxml/jackson/core/io/d;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/io/d;->o([B)V

    .line 34
    throw p1

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Li7/g;->p(Lcom/fasterxml/jackson/core/Base64Variant;)[B

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    .line 42
    array-length p1, p1

    .line 43
    return p1
    .line 44
    .line 45
.end method

.method public final x2()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :cond_0
    :goto_0
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    return-void

    .line 15
    .line 16
    :cond_2
    :goto_1
    iget-object v0, p0, Li7/g;->T:[C

    .line 17
    .line 18
    iget v1, p0, Lf7/b;->s:I

    .line 19
    .line 20
    add-int/lit8 v2, v1, 0x1

    .line 21
    .line 22
    iput v2, p0, Lf7/b;->s:I

    .line 23
    .line 24
    aget-char v0, v0, v1

    .line 25
    .line 26
    const/16 v1, 0x20

    .line 27
    .line 28
    if-ge v0, v1, :cond_0

    .line 29
    .line 30
    const/16 v1, 0xa

    .line 31
    .line 32
    if-ne v0, v1, :cond_3

    .line 33
    .line 34
    iget v0, p0, Lf7/b;->v:I

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    iput v0, p0, Lf7/b;->v:I

    .line 39
    .line 40
    iput v2, p0, Lf7/b;->w:I

    .line 41
    return-void

    .line 42
    .line 43
    :cond_3
    const/16 v1, 0xd

    .line 44
    .line 45
    if-ne v0, v1, :cond_4

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Li7/g;->s2()V

    .line 49
    return-void

    .line 50
    .line 51
    :cond_4
    const/16 v1, 0x9

    .line 52
    .line 53
    if-eq v0, v1, :cond_0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lf7/c;->U0(I)V

    .line 57
    goto :goto_0
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
.end method

.method public final y2()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Li7/g;->Y:Z

    .line 4
    .line 5
    iget v0, p0, Lf7/b;->s:I

    .line 6
    .line 7
    iget v1, p0, Lf7/b;->t:I

    .line 8
    .line 9
    iget-object v2, p0, Li7/g;->T:[C

    .line 10
    .line 11
    :goto_0
    if-lt v0, v1, :cond_1

    .line 12
    .line 13
    iput v0, p0, Lf7/b;->s:I

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const-string v0, ": was expecting closing quote for a string value"

    .line 22
    .line 23
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 27
    .line 28
    :cond_0
    iget v0, p0, Lf7/b;->s:I

    .line 29
    .line 30
    iget v1, p0, Lf7/b;->t:I

    .line 31
    .line 32
    :cond_1
    add-int/lit8 v3, v0, 0x1

    .line 33
    .line 34
    aget-char v0, v2, v0

    .line 35
    .line 36
    const/16 v4, 0x5c

    .line 37
    .line 38
    if-gt v0, v4, :cond_4

    .line 39
    .line 40
    if-ne v0, v4, :cond_2

    .line 41
    .line 42
    iput v3, p0, Lf7/b;->s:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Li7/g;->j1()C

    .line 46
    .line 47
    iget v0, p0, Lf7/b;->s:I

    .line 48
    .line 49
    iget v1, p0, Lf7/b;->t:I

    .line 50
    goto :goto_0

    .line 51
    .line 52
    :cond_2
    const/16 v4, 0x22

    .line 53
    .line 54
    if-gt v0, v4, :cond_4

    .line 55
    .line 56
    if-ne v0, v4, :cond_3

    .line 57
    .line 58
    iput v3, p0, Lf7/b;->s:I

    .line 59
    return-void

    .line 60
    .line 61
    :cond_3
    const/16 v4, 0x20

    .line 62
    .line 63
    if-ge v0, v4, :cond_4

    .line 64
    .line 65
    iput v3, p0, Lf7/b;->s:I

    .line 66
    .line 67
    .line 68
    const-string/jumbo v4, "string value"

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0, v4}, Lf7/b;->v1(ILjava/lang/String;)V

    .line 72
    :cond_4
    move v0, v3

    .line 73
    goto :goto_0
    .line 74
    .line 75
.end method

.method public final z2()I
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lf7/b;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf7/b;->t:I

    .line 5
    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li7/g;->W1()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lf7/b;->k1()I

    .line 16
    move-result v0

    .line 17
    return v0

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Li7/g;->T:[C

    .line 20
    .line 21
    iget v1, p0, Lf7/b;->s:I

    .line 22
    .line 23
    add-int/lit8 v2, v1, 0x1

    .line 24
    .line 25
    iput v2, p0, Lf7/b;->s:I

    .line 26
    .line 27
    aget-char v0, v0, v1

    .line 28
    .line 29
    const/16 v3, 0x23

    .line 30
    .line 31
    const/16 v4, 0x2f

    .line 32
    .line 33
    const/16 v5, 0x20

    .line 34
    .line 35
    if-le v0, v5, :cond_3

    .line 36
    .line 37
    if-eq v0, v4, :cond_2

    .line 38
    .line 39
    if-ne v0, v3, :cond_1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return v0

    .line 42
    .line 43
    :cond_2
    :goto_0
    iput v1, p0, Lf7/b;->s:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Li7/g;->A2()I

    .line 47
    move-result v0

    .line 48
    return v0

    .line 49
    .line 50
    :cond_3
    const/16 v1, 0x9

    .line 51
    .line 52
    const/16 v6, 0xd

    .line 53
    .line 54
    const/16 v7, 0xa

    .line 55
    .line 56
    if-eq v0, v5, :cond_6

    .line 57
    .line 58
    if-ne v0, v7, :cond_4

    .line 59
    .line 60
    iget v0, p0, Lf7/b;->v:I

    .line 61
    .line 62
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    iput v0, p0, Lf7/b;->v:I

    .line 65
    .line 66
    iput v2, p0, Lf7/b;->w:I

    .line 67
    goto :goto_1

    .line 68
    .line 69
    :cond_4
    if-ne v0, v6, :cond_5

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Li7/g;->s2()V

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :cond_5
    if-eq v0, v1, :cond_6

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lf7/c;->U0(I)V

    .line 79
    .line 80
    :cond_6
    :goto_1
    iget v0, p0, Lf7/b;->s:I

    .line 81
    .line 82
    iget v2, p0, Lf7/b;->t:I

    .line 83
    .line 84
    if-ge v0, v2, :cond_c

    .line 85
    .line 86
    iget-object v2, p0, Li7/g;->T:[C

    .line 87
    .line 88
    add-int/lit8 v8, v0, 0x1

    .line 89
    .line 90
    iput v8, p0, Lf7/b;->s:I

    .line 91
    .line 92
    aget-char v2, v2, v0

    .line 93
    .line 94
    if-le v2, v5, :cond_9

    .line 95
    .line 96
    if-eq v2, v4, :cond_8

    .line 97
    .line 98
    if-ne v2, v3, :cond_7

    .line 99
    goto :goto_2

    .line 100
    :cond_7
    return v2

    .line 101
    .line 102
    :cond_8
    :goto_2
    iput v0, p0, Lf7/b;->s:I

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Li7/g;->A2()I

    .line 106
    move-result v0

    .line 107
    return v0

    .line 108
    .line 109
    :cond_9
    if-eq v2, v5, :cond_6

    .line 110
    .line 111
    if-ne v2, v7, :cond_a

    .line 112
    .line 113
    iget v0, p0, Lf7/b;->v:I

    .line 114
    .line 115
    add-int/lit8 v0, v0, 0x1

    .line 116
    .line 117
    iput v0, p0, Lf7/b;->v:I

    .line 118
    .line 119
    iput v8, p0, Lf7/b;->w:I

    .line 120
    goto :goto_1

    .line 121
    .line 122
    :cond_a
    if-ne v2, v6, :cond_b

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Li7/g;->s2()V

    .line 126
    goto :goto_1

    .line 127
    .line 128
    :cond_b
    if-eq v2, v1, :cond_6

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v2}, Lf7/c;->U0(I)V

    .line 132
    goto :goto_1

    .line 133
    .line 134
    .line 135
    :cond_c
    invoke-virtual {p0}, Li7/g;->A2()I

    .line 136
    move-result v0

    .line 137
    return v0
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
.end method
