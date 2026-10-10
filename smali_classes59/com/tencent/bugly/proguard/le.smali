.class public Lcom/tencent/bugly/proguard/le;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final c:Ljava/lang/String; = "ProcTimeInStateReader"

.field public static final d:[I

.field public static final e:[I

.field public static final f:[I


# instance fields
.field public a:[I

.field public b:[J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    const/16 v0, 0x2020

    .line 3
    .line 4
    const/16 v1, 0xa

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [I

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/bugly/proguard/le;->d:[I

    .line 11
    .line 12
    const/16 v0, 0x20

    .line 13
    .line 14
    const/16 v2, 0x200a

    .line 15
    .line 16
    .line 17
    filled-new-array {v0, v2}, [I

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sput-object v0, Lcom/tencent/bugly/proguard/le;->e:[I

    .line 21
    .line 22
    .line 23
    filled-new-array {v1}, [I

    .line 24
    move-result-object v0

    .line 25
    .line 26
    sput-object v0, Lcom/tencent/bugly/proguard/le;->f:[I

    .line 27
    return-void
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
.end method

.method public constructor <init>(Ljava/nio/file/Path;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/le;->b(Ljava/nio/file/Path;)V

    .line 7
    return-void
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
.end method


# virtual methods
.method public a()[J
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/le;->b:[J

    return-object v0
.end method

.method public a(Ljava/nio/file/Path;)[J
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/le;->b:[J

    array-length v0, v0

    new-array v1, v0, [J

    .line 2
    invoke-static {p1}, Lcom/datavisorobfus/e1;->a(Ljava/nio/file/Path;)Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lcom/tencent/bugly/proguard/le;->a:[I

    const/4 v3, 0x0

    .line 3
    invoke-static {p1, v2, v3, v1, v3}, Lcom/tencent/bugly/common/utils/cpu/Process;->readProcFile(Ljava/lang/String;[I[Ljava/lang/String;[J[F)Z

    move-result p1

    if-nez p1, :cond_0

    return-object v3

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ge p1, v0, :cond_1

    .line 4
    aget-wide v2, v1, p1

    const-wide/16 v4, 0xa

    mul-long/2addr v2, v4

    aput-wide v2, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final b(Ljava/nio/file/Path;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/bugly/proguard/ej;->a(Ljava/nio/file/Path;)[B

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance p1, Lcom/tencent/bugly/proguard/da;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {p1, v1}, Lcom/tencent/bugly/proguard/da;-><init>(I)V

    .line 11
    .line 12
    new-instance v7, Lcom/tencent/bugly/proguard/da;

    .line 13
    .line 14
    .line 15
    invoke-direct {v7, v1}, Lcom/tencent/bugly/proguard/da;-><init>(I)V

    .line 16
    move v2, v1

    .line 17
    :goto_0
    array-length v3, v0

    .line 18
    .line 19
    if-ge v1, v3, :cond_2

    .line 20
    .line 21
    aget-byte v3, v0, v1

    .line 22
    .line 23
    .line 24
    invoke-static {v3}, Ljava/lang/Character;->isDigit(I)Z

    .line 25
    move-result v3

    .line 26
    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    sget-object v3, Lcom/tencent/bugly/proguard/le;->f:[I

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v3}, Lcom/tencent/bugly/proguard/da;->a([I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v7, v3}, Lcom/tencent/bugly/proguard/da;->a([I)V

    .line 36
    goto :goto_1

    .line 37
    .line 38
    :cond_0
    sget-object v3, Lcom/tencent/bugly/proguard/le;->d:[I

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v3}, Lcom/tencent/bugly/proguard/da;->a([I)V

    .line 42
    .line 43
    sget-object v3, Lcom/tencent/bugly/proguard/le;->e:[I

    .line 44
    .line 45
    .line 46
    invoke-virtual {v7, v3}, Lcom/tencent/bugly/proguard/da;->a([I)V

    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    :goto_1
    array-length v3, v0

    .line 50
    .line 51
    if-ge v1, v3, :cond_1

    .line 52
    .line 53
    aget-byte v3, v0, v1

    .line 54
    .line 55
    const/16 v4, 0xa

    .line 56
    .line 57
    if-eq v3, v4, :cond_1

    .line 58
    .line 59
    add-int/lit8 v1, v1, 0x1

    .line 60
    goto :goto_1

    .line 61
    .line 62
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 63
    goto :goto_0

    .line 64
    .line 65
    :cond_2
    if-eqz v2, :cond_4

    .line 66
    .line 67
    new-array v5, v2, [J

    .line 68
    array-length v2, v0

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/da;->b()[I

    .line 72
    move-result-object v3

    .line 73
    const/4 v4, 0x0

    .line 74
    const/4 v6, 0x0

    .line 75
    const/4 v1, 0x0

    .line 76
    .line 77
    .line 78
    invoke-static/range {v0 .. v6}, Lcom/tencent/bugly/common/utils/cpu/Process;->parseProcLine([BII[I[Ljava/lang/String;[J[F)Z

    .line 79
    move-result p1

    .line 80
    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7}, Lcom/tencent/bugly/proguard/da;->b()[I

    .line 85
    move-result-object p1

    .line 86
    .line 87
    iput-object p1, p0, Lcom/tencent/bugly/proguard/le;->a:[I

    .line 88
    .line 89
    iput-object v5, p0, Lcom/tencent/bugly/proguard/le;->b:[J

    .line 90
    return-void

    .line 91
    .line 92
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 93
    .line 94
    const-string v0, "Failed to parse time_in_state file"

    .line 95
    .line 96
    .line 97
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 98
    throw p1

    .line 99
    .line 100
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 101
    .line 102
    const-string v0, "Empty time_in_state file"

    .line 103
    .line 104
    .line 105
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 106
    throw p1
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
.end method
