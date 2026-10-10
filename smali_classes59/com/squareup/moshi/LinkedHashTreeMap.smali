.class final Lcom/squareup/moshi/LinkedHashTreeMap;
.super Ljava/util/AbstractMap;
.source "LinkedHashTreeMap.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/moshi/LinkedHashTreeMap$e;,
        Lcom/squareup/moshi/LinkedHashTreeMap$d;,
        Lcom/squareup/moshi/LinkedHashTreeMap$f;,
        Lcom/squareup/moshi/LinkedHashTreeMap$b;,
        Lcom/squareup/moshi/LinkedHashTreeMap$c;,
        Lcom/squareup/moshi/LinkedHashTreeMap$g;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractMap<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/lang/Comparable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field comparator:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TK;>;"
        }
    .end annotation
.end field

.field private entrySet:Lcom/squareup/moshi/LinkedHashTreeMap$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/LinkedHashTreeMap<",
            "TK;TV;>.d;"
        }
    .end annotation
.end field

.field final header:Lcom/squareup/moshi/LinkedHashTreeMap$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/LinkedHashTreeMap$g<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private keySet:Lcom/squareup/moshi/LinkedHashTreeMap$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/LinkedHashTreeMap<",
            "TK;TV;>.e;"
        }
    .end annotation
.end field

.field modCount:I

.field size:I

.field table:[Lcom/squareup/moshi/LinkedHashTreeMap$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/squareup/moshi/LinkedHashTreeMap$g<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field threshold:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/squareup/moshi/LinkedHashTreeMap$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/squareup/moshi/LinkedHashTreeMap$a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/squareup/moshi/LinkedHashTreeMap;->b:Ljava/util/Comparator;

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
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/squareup/moshi/LinkedHashTreeMap;-><init>(Ljava/util/Comparator;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-TK;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->size:I

    .line 4
    iput v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->modCount:I

    if-eqz p1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    sget-object p1, Lcom/squareup/moshi/LinkedHashTreeMap;->b:Ljava/util/Comparator;

    :goto_0
    iput-object p1, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->comparator:Ljava/util/Comparator;

    .line 6
    new-instance p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;

    invoke-direct {p1}, Lcom/squareup/moshi/LinkedHashTreeMap$g;-><init>()V

    iput-object p1, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->header:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    const/16 p1, 0x10

    .line 7
    new-array p1, p1, [Lcom/squareup/moshi/LinkedHashTreeMap$g;

    iput-object p1, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->table:[Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 8
    array-length v0, p1

    div-int/lit8 v0, v0, 0x2

    array-length p1, p1

    div-int/lit8 p1, p1, 0x4

    add-int/2addr v0, p1

    iput v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->threshold:I

    return-void
.end method

.method public static doubleCapacity([Lcom/squareup/moshi/LinkedHashTreeMap$g;)[Lcom/squareup/moshi/LinkedHashTreeMap$g;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">([",
            "Lcom/squareup/moshi/LinkedHashTreeMap$g<",
            "TK;TV;>;)[",
            "Lcom/squareup/moshi/LinkedHashTreeMap$g<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    array-length v0, p0

    .line 2
    .line 3
    mul-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    new-array v1, v1, [Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 6
    .line 7
    new-instance v2, Lcom/squareup/moshi/LinkedHashTreeMap$c;

    .line 8
    .line 9
    .line 10
    invoke-direct {v2}, Lcom/squareup/moshi/LinkedHashTreeMap$c;-><init>()V

    .line 11
    .line 12
    new-instance v3, Lcom/squareup/moshi/LinkedHashTreeMap$b;

    .line 13
    .line 14
    .line 15
    invoke-direct {v3}, Lcom/squareup/moshi/LinkedHashTreeMap$b;-><init>()V

    .line 16
    .line 17
    new-instance v4, Lcom/squareup/moshi/LinkedHashTreeMap$b;

    .line 18
    .line 19
    .line 20
    invoke-direct {v4}, Lcom/squareup/moshi/LinkedHashTreeMap$b;-><init>()V

    .line 21
    const/4 v5, 0x0

    .line 22
    move v6, v5

    .line 23
    .line 24
    :goto_0
    if-ge v6, v0, :cond_7

    .line 25
    .line 26
    aget-object v7, p0, v6

    .line 27
    .line 28
    if-nez v7, :cond_0

    .line 29
    goto :goto_4

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {v2, v7}, Lcom/squareup/moshi/LinkedHashTreeMap$c;->b(Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 33
    move v8, v5

    .line 34
    move v9, v8

    .line 35
    .line 36
    .line 37
    :goto_1
    invoke-virtual {v2}, Lcom/squareup/moshi/LinkedHashTreeMap$c;->a()Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 38
    move-result-object v10

    .line 39
    .line 40
    if-eqz v10, :cond_2

    .line 41
    .line 42
    iget v10, v10, Lcom/squareup/moshi/LinkedHashTreeMap$g;->h:I

    .line 43
    and-int/2addr v10, v0

    .line 44
    .line 45
    if-nez v10, :cond_1

    .line 46
    .line 47
    add-int/lit8 v8, v8, 0x1

    .line 48
    goto :goto_1

    .line 49
    .line 50
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 51
    goto :goto_1

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {v3, v8}, Lcom/squareup/moshi/LinkedHashTreeMap$b;->b(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v9}, Lcom/squareup/moshi/LinkedHashTreeMap$b;->b(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v7}, Lcom/squareup/moshi/LinkedHashTreeMap$c;->b(Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    invoke-virtual {v2}, Lcom/squareup/moshi/LinkedHashTreeMap$c;->a()Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 64
    move-result-object v7

    .line 65
    .line 66
    if-eqz v7, :cond_4

    .line 67
    .line 68
    iget v10, v7, Lcom/squareup/moshi/LinkedHashTreeMap$g;->h:I

    .line 69
    and-int/2addr v10, v0

    .line 70
    .line 71
    if-nez v10, :cond_3

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v7}, Lcom/squareup/moshi/LinkedHashTreeMap$b;->a(Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 75
    goto :goto_2

    .line 76
    .line 77
    .line 78
    :cond_3
    invoke-virtual {v4, v7}, Lcom/squareup/moshi/LinkedHashTreeMap$b;->a(Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 79
    goto :goto_2

    .line 80
    :cond_4
    const/4 v7, 0x0

    .line 81
    .line 82
    if-lez v8, :cond_5

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Lcom/squareup/moshi/LinkedHashTreeMap$b;->c()Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 86
    move-result-object v8

    .line 87
    goto :goto_3

    .line 88
    :cond_5
    move-object v8, v7

    .line 89
    .line 90
    :goto_3
    aput-object v8, v1, v6

    .line 91
    .line 92
    add-int v8, v6, v0

    .line 93
    .line 94
    if-lez v9, :cond_6

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Lcom/squareup/moshi/LinkedHashTreeMap$b;->c()Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 98
    move-result-object v7

    .line 99
    .line 100
    :cond_6
    aput-object v7, v1, v8

    .line 101
    .line 102
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 103
    goto :goto_0

    .line 104
    :cond_7
    return-object v1
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
.end method

.method public static g(I)I
    .locals 2

    .line 1
    .line 2
    ushr-int/lit8 v0, p0, 0x14

    .line 3
    .line 4
    ushr-int/lit8 v1, p0, 0xc

    .line 5
    xor-int/2addr v0, v1

    .line 6
    xor-int/2addr p0, v0

    .line 7
    .line 8
    ushr-int/lit8 v0, p0, 0x7

    .line 9
    xor-int/2addr v0, p0

    .line 10
    .line 11
    ushr-int/lit8 p0, p0, 0x4

    .line 12
    xor-int/2addr p0, v0

    .line 13
    return p0
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

.method private writeReplace()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 6
    return-object v0
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
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->table:[Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/squareup/moshi/LinkedHashTreeMap;->doubleCapacity([Lcom/squareup/moshi/LinkedHashTreeMap$g;)[Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iput-object v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->table:[Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 9
    array-length v1, v0

    .line 10
    .line 11
    div-int/lit8 v1, v1, 0x2

    .line 12
    array-length v0, v0

    .line 13
    .line 14
    div-int/lit8 v0, v0, 0x4

    .line 15
    add-int/2addr v1, v0

    .line 16
    .line 17
    iput v1, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->threshold:I

    .line 18
    return-void
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
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    if-eq p1, p2, :cond_1

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    move-result p1

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 15
    return p1
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
.end method

.method public final c(Lcom/squareup/moshi/LinkedHashTreeMap$g;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/LinkedHashTreeMap$g<",
            "TK;TV;>;Z)V"
        }
    .end annotation

    .line 1
    .line 2
    :goto_0
    if-eqz p1, :cond_e

    .line 3
    .line 4
    iget-object v0, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 5
    .line 6
    iget-object v1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v3, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    move v3, v2

    .line 14
    .line 15
    :goto_1
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget v4, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 18
    goto :goto_2

    .line 19
    :cond_1
    move v4, v2

    .line 20
    .line 21
    :goto_2
    sub-int v5, v3, v4

    .line 22
    const/4 v6, -0x2

    .line 23
    .line 24
    if-ne v5, v6, :cond_6

    .line 25
    .line 26
    iget-object v0, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 27
    .line 28
    iget-object v3, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    iget v3, v3, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 33
    goto :goto_3

    .line 34
    :cond_2
    move v3, v2

    .line 35
    .line 36
    :goto_3
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iget v2, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 39
    :cond_3
    sub-int/2addr v2, v3

    .line 40
    const/4 v0, -0x1

    .line 41
    .line 42
    if-eq v2, v0, :cond_5

    .line 43
    .line 44
    if-nez v2, :cond_4

    .line 45
    .line 46
    if-nez p2, :cond_4

    .line 47
    goto :goto_4

    .line 48
    .line 49
    .line 50
    :cond_4
    invoke-virtual {p0, v1}, Lcom/squareup/moshi/LinkedHashTreeMap;->f(Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lcom/squareup/moshi/LinkedHashTreeMap;->e(Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 54
    goto :goto_5

    .line 55
    .line 56
    .line 57
    :cond_5
    :goto_4
    invoke-virtual {p0, p1}, Lcom/squareup/moshi/LinkedHashTreeMap;->e(Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 58
    .line 59
    :goto_5
    if-eqz p2, :cond_d

    .line 60
    goto :goto_9

    .line 61
    :cond_6
    const/4 v1, 0x2

    .line 62
    const/4 v6, 0x1

    .line 63
    .line 64
    if-ne v5, v1, :cond_b

    .line 65
    .line 66
    iget-object v1, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 67
    .line 68
    iget-object v3, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 69
    .line 70
    if-eqz v3, :cond_7

    .line 71
    .line 72
    iget v3, v3, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 73
    goto :goto_6

    .line 74
    :cond_7
    move v3, v2

    .line 75
    .line 76
    :goto_6
    if-eqz v1, :cond_8

    .line 77
    .line 78
    iget v2, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 79
    :cond_8
    sub-int/2addr v2, v3

    .line 80
    .line 81
    if-eq v2, v6, :cond_a

    .line 82
    .line 83
    if-nez v2, :cond_9

    .line 84
    .line 85
    if-nez p2, :cond_9

    .line 86
    goto :goto_7

    .line 87
    .line 88
    .line 89
    :cond_9
    invoke-virtual {p0, v0}, Lcom/squareup/moshi/LinkedHashTreeMap;->e(Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1}, Lcom/squareup/moshi/LinkedHashTreeMap;->f(Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 93
    goto :goto_8

    .line 94
    .line 95
    .line 96
    :cond_a
    :goto_7
    invoke-virtual {p0, p1}, Lcom/squareup/moshi/LinkedHashTreeMap;->f(Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 97
    .line 98
    :goto_8
    if-eqz p2, :cond_d

    .line 99
    goto :goto_9

    .line 100
    .line 101
    :cond_b
    if-nez v5, :cond_c

    .line 102
    .line 103
    add-int/lit8 v3, v3, 0x1

    .line 104
    .line 105
    iput v3, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 106
    .line 107
    if-eqz p2, :cond_d

    .line 108
    goto :goto_9

    .line 109
    .line 110
    .line 111
    :cond_c
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 112
    move-result v0

    .line 113
    add-int/2addr v0, v6

    .line 114
    .line 115
    iput v0, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 116
    .line 117
    if-nez p2, :cond_d

    .line 118
    goto :goto_9

    .line 119
    .line 120
    :cond_d
    iget-object p1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->b:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 121
    goto :goto_0

    .line 122
    :cond_e
    :goto_9
    return-void
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

.method public clear()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->table:[Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->size:I

    .line 10
    .line 11
    iget v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->modCount:I

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    iput v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->modCount:I

    .line 16
    .line 17
    iget-object v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->header:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 18
    .line 19
    iget-object v2, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->e:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 20
    .line 21
    :goto_0
    if-eq v2, v0, :cond_0

    .line 22
    .line 23
    iget-object v3, v2, Lcom/squareup/moshi/LinkedHashTreeMap$g;->e:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 24
    .line 25
    iput-object v1, v2, Lcom/squareup/moshi/LinkedHashTreeMap$g;->f:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 26
    .line 27
    iput-object v1, v2, Lcom/squareup/moshi/LinkedHashTreeMap$g;->e:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 28
    move-object v2, v3

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_0
    iput-object v0, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->f:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 32
    .line 33
    iput-object v0, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->e:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 34
    return-void
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

.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/squareup/moshi/LinkedHashTreeMap;->findByObject(Ljava/lang/Object;)Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
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

.method public final d(Lcom/squareup/moshi/LinkedHashTreeMap$g;Lcom/squareup/moshi/LinkedHashTreeMap$g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/LinkedHashTreeMap$g<",
            "TK;TV;>;",
            "Lcom/squareup/moshi/LinkedHashTreeMap$g<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->b:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    iput-object v1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->b:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iput-object v0, p2, Lcom/squareup/moshi/LinkedHashTreeMap$g;->b:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 10
    .line 11
    :cond_0
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object v1, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 14
    .line 15
    if-ne v1, p1, :cond_1

    .line 16
    .line 17
    iput-object p2, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 18
    return-void

    .line 19
    .line 20
    :cond_1
    iput-object p2, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 21
    return-void

    .line 22
    .line 23
    :cond_2
    iget p1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->h:I

    .line 24
    .line 25
    iget-object v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->table:[Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 26
    array-length v1, v0

    .line 27
    .line 28
    add-int/lit8 v1, v1, -0x1

    .line 29
    and-int/2addr p1, v1

    .line 30
    .line 31
    aput-object p2, v0, p1

    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final e(Lcom/squareup/moshi/LinkedHashTreeMap$g;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/LinkedHashTreeMap$g<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 3
    .line 4
    iget-object v1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 5
    .line 6
    iget-object v2, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 7
    .line 8
    iget-object v3, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 9
    .line 10
    iput-object v2, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iput-object p1, v2, Lcom/squareup/moshi/LinkedHashTreeMap$g;->b:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, p1, v1}, Lcom/squareup/moshi/LinkedHashTreeMap;->d(Lcom/squareup/moshi/LinkedHashTreeMap$g;Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 18
    .line 19
    iput-object p1, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 20
    .line 21
    iput-object v1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->b:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 22
    const/4 v4, 0x0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget v0, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v0, v4

    .line 29
    .line 30
    :goto_0
    if-eqz v2, :cond_2

    .line 31
    .line 32
    iget v2, v2, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v2, v4

    .line 35
    .line 36
    .line 37
    :goto_1
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 38
    move-result v0

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    iput v0, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 43
    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    iget v4, v3, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 47
    .line 48
    .line 49
    :cond_3
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    .line 50
    move-result p1

    .line 51
    .line 52
    add-int/lit8 p1, p1, 0x1

    .line 53
    .line 54
    iput p1, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 55
    return-void
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
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->entrySet:Lcom/squareup/moshi/LinkedHashTreeMap$d;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    new-instance v0, Lcom/squareup/moshi/LinkedHashTreeMap$d;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/squareup/moshi/LinkedHashTreeMap$d;-><init>(Lcom/squareup/moshi/LinkedHashTreeMap;)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->entrySet:Lcom/squareup/moshi/LinkedHashTreeMap$d;

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final f(Lcom/squareup/moshi/LinkedHashTreeMap$g;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/LinkedHashTreeMap$g<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 3
    .line 4
    iget-object v1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 5
    .line 6
    iget-object v2, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 7
    .line 8
    iget-object v3, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 9
    .line 10
    iput-object v3, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    iput-object p1, v3, Lcom/squareup/moshi/LinkedHashTreeMap$g;->b:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, p1, v0}, Lcom/squareup/moshi/LinkedHashTreeMap;->d(Lcom/squareup/moshi/LinkedHashTreeMap$g;Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 18
    .line 19
    iput-object p1, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 20
    .line 21
    iput-object v0, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->b:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 22
    const/4 v4, 0x0

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget v1, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v1, v4

    .line 29
    .line 30
    :goto_0
    if-eqz v3, :cond_2

    .line 31
    .line 32
    iget v3, v3, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v3, v4

    .line 35
    .line 36
    .line 37
    :goto_1
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 38
    move-result v1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    iput v1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 43
    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    iget v4, v2, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 47
    .line 48
    .line 49
    :cond_3
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 50
    move-result p1

    .line 51
    .line 52
    add-int/lit8 p1, p1, 0x1

    .line 53
    .line 54
    iput p1, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 55
    return-void
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
.end method

.method public find(Ljava/lang/Object;Z)Lcom/squareup/moshi/LinkedHashTreeMap$g;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;Z)",
            "Lcom/squareup/moshi/LinkedHashTreeMap$g<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->comparator:Ljava/util/Comparator;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->table:[Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 8
    move-result v2

    .line 9
    .line 10
    .line 11
    invoke-static {v2}, Lcom/squareup/moshi/LinkedHashTreeMap;->g(I)I

    .line 12
    move-result v6

    .line 13
    array-length v2, v1

    .line 14
    const/4 v9, 0x1

    .line 15
    sub-int/2addr v2, v9

    .line 16
    and-int/2addr v2, v6

    .line 17
    .line 18
    aget-object v3, v1, v2

    .line 19
    const/4 v4, 0x0

    .line 20
    .line 21
    if-eqz v3, :cond_5

    .line 22
    .line 23
    sget-object v5, Lcom/squareup/moshi/LinkedHashTreeMap;->b:Ljava/util/Comparator;

    .line 24
    .line 25
    if-ne v0, v5, :cond_0

    .line 26
    move-object v5, p1

    .line 27
    .line 28
    check-cast v5, Ljava/lang/Comparable;

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v5, v4

    .line 31
    .line 32
    :goto_0
    if-eqz v5, :cond_1

    .line 33
    .line 34
    iget-object v7, v3, Lcom/squareup/moshi/LinkedHashTreeMap$g;->g:Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-interface {v5, v7}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 38
    move-result v7

    .line 39
    goto :goto_1

    .line 40
    .line 41
    :cond_1
    iget-object v7, v3, Lcom/squareup/moshi/LinkedHashTreeMap$g;->g:Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, p1, v7}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 45
    move-result v7

    .line 46
    .line 47
    :goto_1
    if-nez v7, :cond_2

    .line 48
    return-object v3

    .line 49
    .line 50
    :cond_2
    if-gez v7, :cond_3

    .line 51
    .line 52
    iget-object v8, v3, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 53
    goto :goto_2

    .line 54
    .line 55
    :cond_3
    iget-object v8, v3, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 56
    .line 57
    :goto_2
    if-nez v8, :cond_4

    .line 58
    :goto_3
    move v10, v7

    .line 59
    goto :goto_4

    .line 60
    :cond_4
    move-object v3, v8

    .line 61
    goto :goto_0

    .line 62
    :cond_5
    const/4 v7, 0x0

    .line 63
    goto :goto_3

    .line 64
    .line 65
    :goto_4
    if-nez p2, :cond_6

    .line 66
    return-object v4

    .line 67
    .line 68
    :cond_6
    iget-object v7, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->header:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 69
    .line 70
    if-nez v3, :cond_9

    .line 71
    .line 72
    sget-object p2, Lcom/squareup/moshi/LinkedHashTreeMap;->b:Ljava/util/Comparator;

    .line 73
    .line 74
    if-ne v0, p2, :cond_7

    .line 75
    .line 76
    instance-of p2, p1, Ljava/lang/Comparable;

    .line 77
    .line 78
    if-eqz p2, :cond_8

    .line 79
    :cond_7
    move-object v4, v3

    .line 80
    goto :goto_5

    .line 81
    .line 82
    :cond_8
    new-instance p2, Ljava/lang/ClassCastException;

    .line 83
    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string p1, " is not Comparable"

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    .line 110
    invoke-direct {p2, p1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 111
    throw p2

    .line 112
    .line 113
    :goto_5
    new-instance v3, Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 114
    .line 115
    iget-object v8, v7, Lcom/squareup/moshi/LinkedHashTreeMap$g;->f:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 116
    move-object v5, p1

    .line 117
    .line 118
    .line 119
    invoke-direct/range {v3 .. v8}, Lcom/squareup/moshi/LinkedHashTreeMap$g;-><init>(Lcom/squareup/moshi/LinkedHashTreeMap$g;Ljava/lang/Object;ILcom/squareup/moshi/LinkedHashTreeMap$g;Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 120
    .line 121
    aput-object v3, v1, v2

    .line 122
    goto :goto_7

    .line 123
    :cond_9
    move-object v5, p1

    .line 124
    move-object v4, v3

    .line 125
    .line 126
    new-instance v3, Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 127
    .line 128
    iget-object v8, v7, Lcom/squareup/moshi/LinkedHashTreeMap$g;->f:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 129
    .line 130
    .line 131
    invoke-direct/range {v3 .. v8}, Lcom/squareup/moshi/LinkedHashTreeMap$g;-><init>(Lcom/squareup/moshi/LinkedHashTreeMap$g;Ljava/lang/Object;ILcom/squareup/moshi/LinkedHashTreeMap$g;Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 132
    .line 133
    if-gez v10, :cond_a

    .line 134
    .line 135
    iput-object v3, v4, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 136
    goto :goto_6

    .line 137
    .line 138
    :cond_a
    iput-object v3, v4, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 139
    .line 140
    .line 141
    :goto_6
    invoke-virtual {p0, v4, v9}, Lcom/squareup/moshi/LinkedHashTreeMap;->c(Lcom/squareup/moshi/LinkedHashTreeMap$g;Z)V

    .line 142
    .line 143
    :goto_7
    iget p1, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->size:I

    .line 144
    .line 145
    add-int/lit8 p2, p1, 0x1

    .line 146
    .line 147
    iput p2, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->size:I

    .line 148
    .line 149
    iget p2, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->threshold:I

    .line 150
    .line 151
    if-le p1, p2, :cond_b

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/squareup/moshi/LinkedHashTreeMap;->a()V

    .line 155
    .line 156
    :cond_b
    iget p1, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->modCount:I

    .line 157
    add-int/2addr p1, v9

    .line 158
    .line 159
    iput p1, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->modCount:I

    .line 160
    return-object v3
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

.method public findByEntry(Ljava/util/Map$Entry;)Lcom/squareup/moshi/LinkedHashTreeMap$g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "**>;)",
            "Lcom/squareup/moshi/LinkedHashTreeMap$g<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/squareup/moshi/LinkedHashTreeMap;->findByObject(Ljava/lang/Object;)Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, v0, Lcom/squareup/moshi/LinkedHashTreeMap$g;->i:Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1, p1}, Lcom/squareup/moshi/LinkedHashTreeMap;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result p1

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    return-object v0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return-object p1
.end method

.method public findByObject(Ljava/lang/Object;)Lcom/squareup/moshi/LinkedHashTreeMap$g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/squareup/moshi/LinkedHashTreeMap$g<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    const/4 v1, 0x0

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0, p1, v1}, Lcom/squareup/moshi/LinkedHashTreeMap;->find(Ljava/lang/Object;Z)Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    :cond_0
    return-object v0
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

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/squareup/moshi/LinkedHashTreeMap;->findByObject(Ljava/lang/Object;)Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->i:Ljava/lang/Object;

    .line 9
    return-object p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return-object p1
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

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->keySet:Lcom/squareup/moshi/LinkedHashTreeMap$e;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    new-instance v0, Lcom/squareup/moshi/LinkedHashTreeMap$e;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/squareup/moshi/LinkedHashTreeMap$e;-><init>(Lcom/squareup/moshi/LinkedHashTreeMap;)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->keySet:Lcom/squareup/moshi/LinkedHashTreeMap$e;

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lcom/squareup/moshi/LinkedHashTreeMap;->find(Ljava/lang/Object;Z)Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    iget-object v0, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->i:Ljava/lang/Object;

    .line 12
    return-object v0

    .line 13
    .line 14
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 15
    .line 16
    const-string p2, "key == null"

    .line 17
    .line 18
    .line 19
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 20
    throw p1
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
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/squareup/moshi/LinkedHashTreeMap;->removeInternalByKey(Ljava/lang/Object;)Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->i:Ljava/lang/Object;

    .line 9
    return-object p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return-object p1
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

.method public removeInternal(Lcom/squareup/moshi/LinkedHashTreeMap$g;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/LinkedHashTreeMap$g<",
            "TK;TV;>;Z)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->f:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 6
    .line 7
    iget-object v1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->e:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 8
    .line 9
    iput-object v1, p2, Lcom/squareup/moshi/LinkedHashTreeMap$g;->e:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 10
    .line 11
    iget-object v1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->e:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 12
    .line 13
    iput-object p2, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->f:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 14
    .line 15
    iput-object v0, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->f:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 16
    .line 17
    iput-object v0, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->e:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 18
    .line 19
    :cond_0
    iget-object p2, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 20
    .line 21
    iget-object v1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 22
    .line 23
    iget-object v2, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->b:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 24
    const/4 v3, 0x0

    .line 25
    .line 26
    if-eqz p2, :cond_4

    .line 27
    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    iget v2, p2, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 31
    .line 32
    iget v4, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 33
    .line 34
    if-le v2, v4, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/squareup/moshi/LinkedHashTreeMap$g;->b()Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 38
    move-result-object p2

    .line 39
    goto :goto_0

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {v1}, Lcom/squareup/moshi/LinkedHashTreeMap$g;->a()Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 43
    move-result-object p2

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual {p0, p2, v3}, Lcom/squareup/moshi/LinkedHashTreeMap;->removeInternal(Lcom/squareup/moshi/LinkedHashTreeMap$g;Z)V

    .line 47
    .line 48
    iget-object v1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    iget v2, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 53
    .line 54
    iput-object v1, p2, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 55
    .line 56
    iput-object p2, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->b:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 57
    .line 58
    iput-object v0, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v2, v3

    .line 61
    .line 62
    :goto_1
    iget-object v1, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    iget v3, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 67
    .line 68
    iput-object v1, p2, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 69
    .line 70
    iput-object p2, v1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->b:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 71
    .line 72
    iput-object v0, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 73
    .line 74
    .line 75
    :cond_3
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 76
    move-result v0

    .line 77
    .line 78
    add-int/lit8 v0, v0, 0x1

    .line 79
    .line 80
    iput v0, p2, Lcom/squareup/moshi/LinkedHashTreeMap$g;->j:I

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1, p2}, Lcom/squareup/moshi/LinkedHashTreeMap;->d(Lcom/squareup/moshi/LinkedHashTreeMap$g;Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 84
    return-void

    .line 85
    .line 86
    :cond_4
    if-eqz p2, :cond_5

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1, p2}, Lcom/squareup/moshi/LinkedHashTreeMap;->d(Lcom/squareup/moshi/LinkedHashTreeMap$g;Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 90
    .line 91
    iput-object v0, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->c:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 92
    goto :goto_2

    .line 93
    .line 94
    :cond_5
    if-eqz v1, :cond_6

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, p1, v1}, Lcom/squareup/moshi/LinkedHashTreeMap;->d(Lcom/squareup/moshi/LinkedHashTreeMap$g;Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 98
    .line 99
    iput-object v0, p1, Lcom/squareup/moshi/LinkedHashTreeMap$g;->d:Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 100
    goto :goto_2

    .line 101
    .line 102
    .line 103
    :cond_6
    invoke-virtual {p0, p1, v0}, Lcom/squareup/moshi/LinkedHashTreeMap;->d(Lcom/squareup/moshi/LinkedHashTreeMap$g;Lcom/squareup/moshi/LinkedHashTreeMap$g;)V

    .line 104
    .line 105
    .line 106
    :goto_2
    invoke-virtual {p0, v2, v3}, Lcom/squareup/moshi/LinkedHashTreeMap;->c(Lcom/squareup/moshi/LinkedHashTreeMap$g;Z)V

    .line 107
    .line 108
    iget p1, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->size:I

    .line 109
    .line 110
    add-int/lit8 p1, p1, -0x1

    .line 111
    .line 112
    iput p1, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->size:I

    .line 113
    .line 114
    iget p1, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->modCount:I

    .line 115
    .line 116
    add-int/lit8 p1, p1, 0x1

    .line 117
    .line 118
    iput p1, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->modCount:I

    .line 119
    return-void
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

.method public removeInternalByKey(Ljava/lang/Object;)Lcom/squareup/moshi/LinkedHashTreeMap$g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/squareup/moshi/LinkedHashTreeMap$g<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/squareup/moshi/LinkedHashTreeMap;->findByObject(Ljava/lang/Object;)Lcom/squareup/moshi/LinkedHashTreeMap$g;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, Lcom/squareup/moshi/LinkedHashTreeMap;->removeInternal(Lcom/squareup/moshi/LinkedHashTreeMap$g;Z)V

    .line 11
    :cond_0
    return-object p1
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

.method public size()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/squareup/moshi/LinkedHashTreeMap;->size:I

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
.end method
