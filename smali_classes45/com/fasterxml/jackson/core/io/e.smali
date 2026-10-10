.class public final Lcom/fasterxml/jackson/core/io/e;
.super Ljava/lang/Object;
.source "JsonStringEncoder.java"


# static fields
.field public static final a:[C

.field public static final b:[B

.field public static final c:Lcom/fasterxml/jackson/core/io/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->d()[C

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sput-object v0, Lcom/fasterxml/jackson/core/io/e;->a:[C

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->c()[B

    .line 10
    move-result-object v0

    .line 11
    .line 12
    sput-object v0, Lcom/fasterxml/jackson/core/io/e;->b:[B

    .line 13
    .line 14
    new-instance v0, Lcom/fasterxml/jackson/core/io/e;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/e;-><init>()V

    .line 18
    .line 19
    sput-object v0, Lcom/fasterxml/jackson/core/io/e;->c:Lcom/fasterxml/jackson/core/io/e;

    .line 20
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static d(II)I
    .locals 3

    .line 1
    .line 2
    .line 3
    const v0, 0xdc00

    .line 4
    .line 5
    if-lt p1, v0, :cond_0

    .line 6
    .line 7
    .line 8
    const v1, 0xdfff

    .line 9
    .line 10
    if-gt p1, v1, :cond_0

    .line 11
    .line 12
    .line 13
    const v1, 0xd800

    .line 14
    sub-int/2addr p0, v1

    .line 15
    .line 16
    shl-int/lit8 p0, p0, 0xa

    .line 17
    .line 18
    const/high16 v1, 0x10000

    .line 19
    add-int/2addr p0, v1

    .line 20
    sub-int/2addr p1, v0

    .line 21
    add-int/2addr p0, p1

    .line 22
    return p0

    .line 23
    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    const-string v2, "Broken surrogate pair: first char 0x"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 38
    move-result-object p0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string p0, ", second 0x"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 50
    move-result-object p0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string p0, "; illegal combination"

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    move-result-object p0

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 66
    throw v0
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

.method public static e(I)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/k;->g(I)Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 10
    throw v0
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

.method public static f(I)I
    .locals 1

    .line 1
    .line 2
    add-int/lit8 v0, p0, 0x6

    .line 3
    .line 4
    shr-int/lit8 p0, p0, 0x1

    .line 5
    add-int/2addr v0, p0

    .line 6
    .line 7
    const/16 p0, 0x18

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 11
    move-result p0

    .line 12
    .line 13
    const/16 v0, 0x7d00

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 17
    move-result p0

    .line 18
    return p0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static g(I)I
    .locals 2

    .line 1
    .line 2
    shr-int/lit8 v0, p0, 0x3

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x6

    .line 5
    .line 6
    const/16 v1, 0x3e8

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    move-result v0

    .line 11
    add-int/2addr p0, v0

    .line 12
    .line 13
    const/16 v0, 0x10

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 17
    move-result p0

    .line 18
    .line 19
    const/16 v0, 0x7d00

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 23
    move-result p0

    .line 24
    return p0
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
.end method

.method public static j()Lcom/fasterxml/jackson/core/io/e;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/fasterxml/jackson/core/io/e;->c:Lcom/fasterxml/jackson/core/io/e;

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


# virtual methods
.method public final a(IILcom/fasterxml/jackson/core/util/c;I)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p3, p4}, Lcom/fasterxml/jackson/core/util/c;->p(I)V

    .line 4
    .line 5
    const/16 p4, 0x5c

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3, p4}, Lcom/fasterxml/jackson/core/util/c;->b(I)V

    .line 9
    .line 10
    if-gez p2, :cond_1

    .line 11
    .line 12
    const/16 p2, 0x75

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/core/util/c;->b(I)V

    .line 16
    .line 17
    const/16 p2, 0xff

    .line 18
    .line 19
    if-le p1, p2, :cond_0

    .line 20
    .line 21
    shr-int/lit8 p2, p1, 0x8

    .line 22
    .line 23
    sget-object p4, Lcom/fasterxml/jackson/core/io/e;->b:[B

    .line 24
    .line 25
    shr-int/lit8 v0, p1, 0xc

    .line 26
    .line 27
    aget-byte v0, p4, v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p3, v0}, Lcom/fasterxml/jackson/core/util/c;->b(I)V

    .line 31
    .line 32
    and-int/lit8 p2, p2, 0xf

    .line 33
    .line 34
    aget-byte p2, p4, p2

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/core/util/c;->b(I)V

    .line 38
    .line 39
    and-int/lit16 p1, p1, 0xff

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_0
    const/16 p2, 0x30

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/core/util/c;->b(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/core/util/c;->b(I)V

    .line 49
    .line 50
    :goto_0
    sget-object p2, Lcom/fasterxml/jackson/core/io/e;->b:[B

    .line 51
    .line 52
    shr-int/lit8 p4, p1, 0x4

    .line 53
    .line 54
    aget-byte p4, p2, p4

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3, p4}, Lcom/fasterxml/jackson/core/util/c;->b(I)V

    .line 58
    .line 59
    and-int/lit8 p1, p1, 0xf

    .line 60
    .line 61
    aget-byte p1, p2, p1

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3, p1}, Lcom/fasterxml/jackson/core/util/c;->b(I)V

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    int-to-byte p1, p2

    .line 67
    .line 68
    .line 69
    invoke-virtual {p3, p1}, Lcom/fasterxml/jackson/core/util/c;->b(I)V

    .line 70
    .line 71
    .line 72
    :goto_1
    invoke-virtual {p3}, Lcom/fasterxml/jackson/core/util/c;->m()I

    .line 73
    move-result p1

    .line 74
    return p1
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
.end method

.method public final b(I[C)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    int-to-char p1, p1

    .line 3
    .line 4
    aput-char p1, p2, v0

    .line 5
    const/4 p1, 0x2

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
.end method

.method public final c(I[C)I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    const/16 v1, 0x75

    .line 4
    .line 5
    aput-char v1, p2, v0

    .line 6
    .line 7
    sget-object v0, Lcom/fasterxml/jackson/core/io/e;->a:[C

    .line 8
    .line 9
    shr-int/lit8 v1, p1, 0x4

    .line 10
    .line 11
    aget-char v1, v0, v1

    .line 12
    const/4 v2, 0x4

    .line 13
    .line 14
    aput-char v1, p2, v2

    .line 15
    .line 16
    and-int/lit8 p1, p1, 0xf

    .line 17
    .line 18
    aget-char p1, v0, p1

    .line 19
    const/4 v0, 0x5

    .line 20
    .line 21
    aput-char p1, p2, v0

    .line 22
    const/4 p1, 0x6

    .line 23
    return p1
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
.end method

.method public final h()[C
    .locals 3

    .line 1
    const/4 v0, 0x6

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    const/4 v1, 0x0

    .line 5
    .line 6
    const/16 v2, 0x5c

    .line 7
    .line 8
    aput-char v2, v0, v1

    .line 9
    const/4 v1, 0x2

    .line 10
    .line 11
    const/16 v2, 0x30

    .line 12
    .line 13
    aput-char v2, v0, v1

    .line 14
    const/4 v1, 0x3

    .line 15
    .line 16
    aput-char v2, v0, v1

    .line 17
    return-object v0
    .line 18
.end method

.method public i(Ljava/lang/String;)[B
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/e;->f(I)I

    .line 8
    move-result v1

    .line 9
    .line 10
    new-array v2, v1, [B

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    move v5, v3

    .line 14
    move v6, v5

    .line 15
    .line 16
    :goto_0
    if-ge v5, v0, :cond_10

    .line 17
    .line 18
    add-int/lit8 v7, v5, 0x1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 22
    move-result v5

    .line 23
    .line 24
    :goto_1
    const/16 v8, 0x7f

    .line 25
    .line 26
    if-gt v5, v8, :cond_3

    .line 27
    .line 28
    if-lt v6, v1, :cond_1

    .line 29
    .line 30
    if-nez v4, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v6}, Lcom/fasterxml/jackson/core/util/c;->k([BI)Lcom/fasterxml/jackson/core/util/c;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/util/c;->j()[B

    .line 38
    move-result-object v1

    .line 39
    array-length v2, v1

    .line 40
    move v6, v2

    .line 41
    move-object v2, v1

    .line 42
    move v1, v6

    .line 43
    move v6, v3

    .line 44
    .line 45
    :cond_1
    add-int/lit8 v8, v6, 0x1

    .line 46
    int-to-byte v5, v5

    .line 47
    .line 48
    aput-byte v5, v2, v6

    .line 49
    .line 50
    if-lt v7, v0, :cond_2

    .line 51
    move v6, v8

    .line 52
    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :cond_2
    add-int/lit8 v5, v7, 0x1

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    .line 59
    move-result v6

    .line 60
    move v7, v5

    .line 61
    move v5, v6

    .line 62
    move v6, v8

    .line 63
    goto :goto_1

    .line 64
    .line 65
    :cond_3
    if-nez v4, :cond_4

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v6}, Lcom/fasterxml/jackson/core/util/c;->k([BI)Lcom/fasterxml/jackson/core/util/c;

    .line 69
    move-result-object v4

    .line 70
    .line 71
    :cond_4
    if-lt v6, v1, :cond_5

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/util/c;->j()[B

    .line 75
    move-result-object v2

    .line 76
    array-length v1, v2

    .line 77
    move v6, v3

    .line 78
    .line 79
    :cond_5
    const/16 v8, 0x800

    .line 80
    .line 81
    if-ge v5, v8, :cond_6

    .line 82
    .line 83
    add-int/lit8 v8, v6, 0x1

    .line 84
    .line 85
    shr-int/lit8 v9, v5, 0x6

    .line 86
    .line 87
    or-int/lit16 v9, v9, 0xc0

    .line 88
    int-to-byte v9, v9

    .line 89
    .line 90
    aput-byte v9, v2, v6

    .line 91
    :goto_2
    move v6, v5

    .line 92
    move v5, v7

    .line 93
    .line 94
    goto/16 :goto_4

    .line 95
    .line 96
    .line 97
    :cond_6
    const v8, 0xd800

    .line 98
    .line 99
    if-lt v5, v8, :cond_d

    .line 100
    .line 101
    .line 102
    const v8, 0xdfff

    .line 103
    .line 104
    if-le v5, v8, :cond_7

    .line 105
    goto :goto_3

    .line 106
    .line 107
    .line 108
    :cond_7
    const v8, 0xdbff

    .line 109
    .line 110
    if-le v5, v8, :cond_8

    .line 111
    .line 112
    .line 113
    invoke-static {v5}, Lcom/fasterxml/jackson/core/io/e;->e(I)V

    .line 114
    .line 115
    :cond_8
    if-lt v7, v0, :cond_9

    .line 116
    .line 117
    .line 118
    invoke-static {v5}, Lcom/fasterxml/jackson/core/io/e;->e(I)V

    .line 119
    .line 120
    :cond_9
    add-int/lit8 v8, v7, 0x1

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    .line 124
    move-result v7

    .line 125
    .line 126
    .line 127
    invoke-static {v5, v7}, Lcom/fasterxml/jackson/core/io/e;->d(II)I

    .line 128
    move-result v5

    .line 129
    .line 130
    .line 131
    const v7, 0x10ffff

    .line 132
    .line 133
    if-le v5, v7, :cond_a

    .line 134
    .line 135
    .line 136
    invoke-static {v5}, Lcom/fasterxml/jackson/core/io/e;->e(I)V

    .line 137
    .line 138
    :cond_a
    add-int/lit8 v7, v6, 0x1

    .line 139
    .line 140
    shr-int/lit8 v9, v5, 0x12

    .line 141
    .line 142
    or-int/lit16 v9, v9, 0xf0

    .line 143
    int-to-byte v9, v9

    .line 144
    .line 145
    aput-byte v9, v2, v6

    .line 146
    .line 147
    if-lt v7, v1, :cond_b

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/util/c;->j()[B

    .line 151
    move-result-object v2

    .line 152
    array-length v1, v2

    .line 153
    move v7, v3

    .line 154
    .line 155
    :cond_b
    add-int/lit8 v6, v7, 0x1

    .line 156
    .line 157
    shr-int/lit8 v9, v5, 0xc

    .line 158
    .line 159
    and-int/lit8 v9, v9, 0x3f

    .line 160
    .line 161
    or-int/lit16 v9, v9, 0x80

    .line 162
    int-to-byte v9, v9

    .line 163
    .line 164
    aput-byte v9, v2, v7

    .line 165
    .line 166
    if-lt v6, v1, :cond_c

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/util/c;->j()[B

    .line 170
    move-result-object v1

    .line 171
    array-length v2, v1

    .line 172
    move v6, v2

    .line 173
    move-object v2, v1

    .line 174
    move v1, v6

    .line 175
    move v6, v3

    .line 176
    .line 177
    :cond_c
    add-int/lit8 v7, v6, 0x1

    .line 178
    .line 179
    shr-int/lit8 v9, v5, 0x6

    .line 180
    .line 181
    and-int/lit8 v9, v9, 0x3f

    .line 182
    .line 183
    or-int/lit16 v9, v9, 0x80

    .line 184
    int-to-byte v9, v9

    .line 185
    .line 186
    aput-byte v9, v2, v6

    .line 187
    move v6, v5

    .line 188
    move v5, v8

    .line 189
    move v8, v7

    .line 190
    goto :goto_4

    .line 191
    .line 192
    :cond_d
    :goto_3
    add-int/lit8 v8, v6, 0x1

    .line 193
    .line 194
    shr-int/lit8 v9, v5, 0xc

    .line 195
    .line 196
    or-int/lit16 v9, v9, 0xe0

    .line 197
    int-to-byte v9, v9

    .line 198
    .line 199
    aput-byte v9, v2, v6

    .line 200
    .line 201
    if-lt v8, v1, :cond_e

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/util/c;->j()[B

    .line 205
    move-result-object v2

    .line 206
    array-length v1, v2

    .line 207
    move v8, v3

    .line 208
    .line 209
    :cond_e
    add-int/lit8 v6, v8, 0x1

    .line 210
    .line 211
    shr-int/lit8 v9, v5, 0x6

    .line 212
    .line 213
    and-int/lit8 v9, v9, 0x3f

    .line 214
    .line 215
    or-int/lit16 v9, v9, 0x80

    .line 216
    int-to-byte v9, v9

    .line 217
    .line 218
    aput-byte v9, v2, v8

    .line 219
    move v8, v6

    .line 220
    .line 221
    goto/16 :goto_2

    .line 222
    .line 223
    :goto_4
    if-lt v8, v1, :cond_f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/util/c;->j()[B

    .line 227
    move-result-object v1

    .line 228
    array-length v2, v1

    .line 229
    move v8, v2

    .line 230
    move-object v2, v1

    .line 231
    move v1, v8

    .line 232
    move v8, v3

    .line 233
    .line 234
    :cond_f
    add-int/lit8 v7, v8, 0x1

    .line 235
    .line 236
    and-int/lit8 v6, v6, 0x3f

    .line 237
    .line 238
    or-int/lit16 v6, v6, 0x80

    .line 239
    int-to-byte v6, v6

    .line 240
    .line 241
    aput-byte v6, v2, v8

    .line 242
    move v6, v7

    .line 243
    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :cond_10
    :goto_5
    if-nez v4, :cond_11

    .line 247
    .line 248
    .line 249
    invoke-static {v2, v3, v6}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 250
    move-result-object p1

    .line 251
    return-object p1

    .line 252
    .line 253
    .line 254
    :cond_11
    invoke-virtual {v4, v6}, Lcom/fasterxml/jackson/core/util/c;->i(I)[B

    .line 255
    move-result-object p1

    .line 256
    return-object p1
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

.method public k(Ljava/lang/String;)[C
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/e;->g(I)I

    .line 8
    move-result v1

    .line 9
    .line 10
    new-array v1, v1, [C

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->e()[I

    .line 14
    move-result-object v2

    .line 15
    array-length v3, v2

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    move v7, v4

    .line 19
    move v8, v7

    .line 20
    move-object v6, v5

    .line 21
    .line 22
    :goto_0
    if-ge v7, v0, :cond_9

    .line 23
    .line 24
    .line 25
    :goto_1
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    .line 26
    move-result v9

    .line 27
    .line 28
    if-ge v9, v3, :cond_5

    .line 29
    .line 30
    aget v10, v2, v9

    .line 31
    .line 32
    if-eqz v10, :cond_5

    .line 33
    .line 34
    if-nez v6, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/io/e;->h()[C

    .line 38
    move-result-object v6

    .line 39
    .line 40
    :cond_0
    add-int/lit8 v9, v7, 0x1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    .line 44
    move-result v7

    .line 45
    .line 46
    aget v10, v2, v7

    .line 47
    .line 48
    if-gez v10, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v7, v6}, Lcom/fasterxml/jackson/core/io/e;->c(I[C)I

    .line 52
    move-result v7

    .line 53
    goto :goto_2

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {p0, v10, v6}, Lcom/fasterxml/jackson/core/io/e;->b(I[C)I

    .line 57
    move-result v7

    .line 58
    .line 59
    :goto_2
    add-int v10, v8, v7

    .line 60
    array-length v11, v1

    .line 61
    .line 62
    if-le v10, v11, :cond_4

    .line 63
    array-length v10, v1

    .line 64
    sub-int/2addr v10, v8

    .line 65
    .line 66
    if-lez v10, :cond_2

    .line 67
    .line 68
    .line 69
    invoke-static {v6, v4, v1, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 70
    .line 71
    :cond_2
    if-nez v5, :cond_3

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Lcom/fasterxml/jackson/core/util/i;->q([C)Lcom/fasterxml/jackson/core/util/i;

    .line 75
    move-result-object v5

    .line 76
    .line 77
    .line 78
    :cond_3
    invoke-virtual {v5}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 79
    move-result-object v1

    .line 80
    sub-int/2addr v7, v10

    .line 81
    .line 82
    .line 83
    invoke-static {v6, v10, v1, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 84
    move v8, v7

    .line 85
    goto :goto_3

    .line 86
    .line 87
    .line 88
    :cond_4
    invoke-static {v6, v4, v1, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 89
    move v8, v10

    .line 90
    :goto_3
    move v7, v9

    .line 91
    goto :goto_0

    .line 92
    :cond_5
    array-length v10, v1

    .line 93
    .line 94
    if-lt v8, v10, :cond_7

    .line 95
    .line 96
    if-nez v5, :cond_6

    .line 97
    .line 98
    .line 99
    invoke-static {v1}, Lcom/fasterxml/jackson/core/util/i;->q([C)Lcom/fasterxml/jackson/core/util/i;

    .line 100
    move-result-object v5

    .line 101
    .line 102
    .line 103
    :cond_6
    invoke-virtual {v5}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 104
    move-result-object v1

    .line 105
    move v8, v4

    .line 106
    .line 107
    :cond_7
    add-int/lit8 v10, v8, 0x1

    .line 108
    .line 109
    aput-char v9, v1, v8

    .line 110
    .line 111
    add-int/lit8 v7, v7, 0x1

    .line 112
    .line 113
    if-lt v7, v0, :cond_8

    .line 114
    move v8, v10

    .line 115
    goto :goto_4

    .line 116
    :cond_8
    move v8, v10

    .line 117
    goto :goto_1

    .line 118
    .line 119
    :cond_9
    :goto_4
    if-nez v5, :cond_a

    .line 120
    .line 121
    .line 122
    invoke-static {v1, v4, v8}, Ljava/util/Arrays;->copyOfRange([CII)[C

    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    .line 126
    .line 127
    :cond_a
    invoke-virtual {v5, v8}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5}, Lcom/fasterxml/jackson/core/util/i;->g()[C

    .line 131
    move-result-object p1

    .line 132
    return-object p1
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

.method public l(Ljava/lang/String;)[B
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/e;->f(I)I

    .line 8
    move-result v1

    .line 9
    .line 10
    new-array v1, v1, [B

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v2

    .line 14
    move v5, v4

    .line 15
    .line 16
    :goto_0
    if-ge v4, v0, :cond_12

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->e()[I

    .line 20
    move-result-object v6

    .line 21
    .line 22
    .line 23
    :goto_1
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 24
    move-result v7

    .line 25
    .line 26
    const/16 v8, 0x7f

    .line 27
    .line 28
    if-gt v7, v8, :cond_4

    .line 29
    .line 30
    aget v9, v6, v7

    .line 31
    .line 32
    if-eqz v9, :cond_0

    .line 33
    goto :goto_2

    .line 34
    :cond_0
    array-length v8, v1

    .line 35
    .line 36
    if-lt v5, v8, :cond_2

    .line 37
    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v5}, Lcom/fasterxml/jackson/core/util/c;->k([BI)Lcom/fasterxml/jackson/core/util/c;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/util/c;->j()[B

    .line 46
    move-result-object v1

    .line 47
    move v5, v2

    .line 48
    .line 49
    :cond_2
    add-int/lit8 v8, v5, 0x1

    .line 50
    int-to-byte v7, v7

    .line 51
    .line 52
    aput-byte v7, v1, v5

    .line 53
    .line 54
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    if-lt v4, v0, :cond_3

    .line 57
    move v5, v8

    .line 58
    .line 59
    goto/16 :goto_7

    .line 60
    :cond_3
    move v5, v8

    .line 61
    goto :goto_1

    .line 62
    .line 63
    :cond_4
    :goto_2
    if-nez v3, :cond_5

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v5}, Lcom/fasterxml/jackson/core/util/c;->k([BI)Lcom/fasterxml/jackson/core/util/c;

    .line 67
    move-result-object v3

    .line 68
    :cond_5
    array-length v7, v1

    .line 69
    .line 70
    if-lt v5, v7, :cond_6

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/util/c;->j()[B

    .line 74
    move-result-object v1

    .line 75
    move v5, v2

    .line 76
    .line 77
    :cond_6
    add-int/lit8 v7, v4, 0x1

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 81
    move-result v9

    .line 82
    .line 83
    if-gt v9, v8, :cond_7

    .line 84
    .line 85
    aget v1, v6, v9

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v9, v1, v3, v5}, Lcom/fasterxml/jackson/core/io/e;->a(IILcom/fasterxml/jackson/core/util/c;I)I

    .line 89
    move-result v5

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/util/c;->l()[B

    .line 93
    move-result-object v1

    .line 94
    :goto_3
    move v4, v7

    .line 95
    goto :goto_0

    .line 96
    .line 97
    :cond_7
    const/16 v6, 0x7ff

    .line 98
    .line 99
    if-gt v9, v6, :cond_8

    .line 100
    .line 101
    add-int/lit8 v4, v5, 0x1

    .line 102
    .line 103
    shr-int/lit8 v6, v9, 0x6

    .line 104
    .line 105
    or-int/lit16 v6, v6, 0xc0

    .line 106
    int-to-byte v6, v6

    .line 107
    .line 108
    aput-byte v6, v1, v5

    .line 109
    .line 110
    and-int/lit8 v5, v9, 0x3f

    .line 111
    .line 112
    or-int/lit16 v5, v5, 0x80

    .line 113
    .line 114
    goto/16 :goto_6

    .line 115
    .line 116
    .line 117
    :cond_8
    const v6, 0xd800

    .line 118
    .line 119
    if-lt v9, v6, :cond_f

    .line 120
    .line 121
    .line 122
    const v6, 0xdfff

    .line 123
    .line 124
    if-le v9, v6, :cond_9

    .line 125
    goto :goto_5

    .line 126
    .line 127
    .line 128
    :cond_9
    const v6, 0xdbff

    .line 129
    .line 130
    if-le v9, v6, :cond_a

    .line 131
    .line 132
    .line 133
    invoke-static {v9}, Lcom/fasterxml/jackson/core/io/e;->e(I)V

    .line 134
    .line 135
    :cond_a
    if-lt v7, v0, :cond_b

    .line 136
    .line 137
    .line 138
    invoke-static {v9}, Lcom/fasterxml/jackson/core/io/e;->e(I)V

    .line 139
    .line 140
    :cond_b
    add-int/lit8 v4, v4, 0x2

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    .line 144
    move-result v6

    .line 145
    .line 146
    .line 147
    invoke-static {v9, v6}, Lcom/fasterxml/jackson/core/io/e;->d(II)I

    .line 148
    move-result v6

    .line 149
    .line 150
    .line 151
    const v7, 0x10ffff

    .line 152
    .line 153
    if-le v6, v7, :cond_c

    .line 154
    .line 155
    .line 156
    invoke-static {v6}, Lcom/fasterxml/jackson/core/io/e;->e(I)V

    .line 157
    .line 158
    :cond_c
    add-int/lit8 v7, v5, 0x1

    .line 159
    .line 160
    shr-int/lit8 v8, v6, 0x12

    .line 161
    .line 162
    or-int/lit16 v8, v8, 0xf0

    .line 163
    int-to-byte v8, v8

    .line 164
    .line 165
    aput-byte v8, v1, v5

    .line 166
    array-length v5, v1

    .line 167
    .line 168
    if-lt v7, v5, :cond_d

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/util/c;->j()[B

    .line 172
    move-result-object v1

    .line 173
    move v7, v2

    .line 174
    .line 175
    :cond_d
    add-int/lit8 v5, v7, 0x1

    .line 176
    .line 177
    shr-int/lit8 v8, v6, 0xc

    .line 178
    .line 179
    and-int/lit8 v8, v8, 0x3f

    .line 180
    .line 181
    or-int/lit16 v8, v8, 0x80

    .line 182
    int-to-byte v8, v8

    .line 183
    .line 184
    aput-byte v8, v1, v7

    .line 185
    array-length v7, v1

    .line 186
    .line 187
    if-lt v5, v7, :cond_e

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/util/c;->j()[B

    .line 191
    move-result-object v1

    .line 192
    move v5, v2

    .line 193
    .line 194
    :cond_e
    add-int/lit8 v7, v5, 0x1

    .line 195
    .line 196
    shr-int/lit8 v8, v6, 0x6

    .line 197
    .line 198
    and-int/lit8 v8, v8, 0x3f

    .line 199
    .line 200
    or-int/lit16 v8, v8, 0x80

    .line 201
    int-to-byte v8, v8

    .line 202
    .line 203
    aput-byte v8, v1, v5

    .line 204
    .line 205
    and-int/lit8 v5, v6, 0x3f

    .line 206
    .line 207
    or-int/lit16 v5, v5, 0x80

    .line 208
    move v10, v7

    .line 209
    move v7, v4

    .line 210
    :goto_4
    move v4, v10

    .line 211
    goto :goto_6

    .line 212
    .line 213
    :cond_f
    :goto_5
    add-int/lit8 v4, v5, 0x1

    .line 214
    .line 215
    shr-int/lit8 v6, v9, 0xc

    .line 216
    .line 217
    or-int/lit16 v6, v6, 0xe0

    .line 218
    int-to-byte v6, v6

    .line 219
    .line 220
    aput-byte v6, v1, v5

    .line 221
    array-length v5, v1

    .line 222
    .line 223
    if-lt v4, v5, :cond_10

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/util/c;->j()[B

    .line 227
    move-result-object v1

    .line 228
    move v4, v2

    .line 229
    .line 230
    :cond_10
    add-int/lit8 v5, v4, 0x1

    .line 231
    .line 232
    shr-int/lit8 v6, v9, 0x6

    .line 233
    .line 234
    and-int/lit8 v6, v6, 0x3f

    .line 235
    .line 236
    or-int/lit16 v6, v6, 0x80

    .line 237
    int-to-byte v6, v6

    .line 238
    .line 239
    aput-byte v6, v1, v4

    .line 240
    .line 241
    and-int/lit8 v4, v9, 0x3f

    .line 242
    .line 243
    or-int/lit16 v4, v4, 0x80

    .line 244
    move v10, v5

    .line 245
    move v5, v4

    .line 246
    goto :goto_4

    .line 247
    :goto_6
    array-length v6, v1

    .line 248
    .line 249
    if-lt v4, v6, :cond_11

    .line 250
    .line 251
    .line 252
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/util/c;->j()[B

    .line 253
    move-result-object v1

    .line 254
    move v4, v2

    .line 255
    .line 256
    :cond_11
    add-int/lit8 v6, v4, 0x1

    .line 257
    int-to-byte v5, v5

    .line 258
    .line 259
    aput-byte v5, v1, v4

    .line 260
    move v5, v6

    .line 261
    .line 262
    goto/16 :goto_3

    .line 263
    .line 264
    :cond_12
    :goto_7
    if-nez v3, :cond_13

    .line 265
    .line 266
    .line 267
    invoke-static {v1, v2, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 268
    move-result-object p1

    .line 269
    return-object p1

    .line 270
    .line 271
    .line 272
    :cond_13
    invoke-virtual {v3, v5}, Lcom/fasterxml/jackson/core/util/c;->i(I)[B

    .line 273
    move-result-object p1

    .line 274
    return-object p1
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
