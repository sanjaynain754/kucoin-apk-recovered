.class public Lcom/fasterxml/jackson/core/e;
.super Ljava/lang/Object;
.source "JsonPointer.java"


# static fields
.field public static final e:Lcom/fasterxml/jackson/core/e;


# instance fields
.field public final a:Lcom/fasterxml/jackson/core/e;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/core/e;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/fasterxml/jackson/core/e;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/fasterxml/jackson/core/e;->e:Lcom/fasterxml/jackson/core/e;

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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/fasterxml/jackson/core/e;->a:Lcom/fasterxml/jackson/core/e;

    .line 3
    const-string v0, ""

    iput-object v0, p0, Lcom/fasterxml/jackson/core/e;->c:Ljava/lang/String;

    const/4 v1, -0x1

    .line 4
    iput v1, p0, Lcom/fasterxml/jackson/core/e;->d:I

    .line 5
    iput-object v0, p0, Lcom/fasterxml/jackson/core/e;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/jackson/core/e;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/fasterxml/jackson/core/e;->b:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/fasterxml/jackson/core/e;->a:Lcom/fasterxml/jackson/core/e;

    .line 9
    iput-object p2, p0, Lcom/fasterxml/jackson/core/e;->c:Ljava/lang/String;

    .line 10
    invoke-static {p2}, Lcom/fasterxml/jackson/core/e;->b(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/fasterxml/jackson/core/e;->d:I

    return-void
.end method

.method public static a(Ljava/lang/StringBuilder;C)V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x30

    .line 3
    .line 4
    const/16 v1, 0x7e

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    move p1, v1

    .line 8
    goto :goto_0

    .line 9
    .line 10
    :cond_0
    const/16 v0, 0x31

    .line 11
    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    const/16 p1, 0x2f

    .line 15
    goto :goto_0

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    return-void
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

.method public static final b(Ljava/lang/String;)I
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    .line 7
    if-eqz v0, :cond_8

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    if-le v0, v2, :cond_0

    .line 12
    goto :goto_2

    .line 13
    :cond_0
    const/4 v3, 0x0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 17
    move-result v4

    .line 18
    const/4 v5, 0x1

    .line 19
    .line 20
    const/16 v6, 0x30

    .line 21
    .line 22
    if-gt v4, v6, :cond_2

    .line 23
    .line 24
    if-ne v0, v5, :cond_1

    .line 25
    .line 26
    if-ne v4, v6, :cond_1

    .line 27
    return v3

    .line 28
    :cond_1
    return v1

    .line 29
    .line 30
    :cond_2
    const/16 v3, 0x39

    .line 31
    .line 32
    if-le v4, v3, :cond_3

    .line 33
    return v1

    .line 34
    .line 35
    :cond_3
    :goto_0
    if-ge v5, v0, :cond_6

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 39
    move-result v4

    .line 40
    .line 41
    if-gt v4, v3, :cond_5

    .line 42
    .line 43
    if-ge v4, v6, :cond_4

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 47
    goto :goto_0

    .line 48
    :cond_5
    :goto_1
    return v1

    .line 49
    .line 50
    :cond_6
    if-ne v0, v2, :cond_7

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/g;->l(Ljava/lang/String;)J

    .line 54
    move-result-wide v2

    .line 55
    .line 56
    .line 57
    const-wide/32 v4, 0x7fffffff

    .line 58
    .line 59
    cmp-long v0, v2, v4

    .line 60
    .line 61
    if-lez v0, :cond_7

    .line 62
    return v1

    .line 63
    .line 64
    .line 65
    :cond_7
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/g;->j(Ljava/lang/String;)I

    .line 66
    move-result p0

    .line 67
    return p0

    .line 68
    :cond_8
    :goto_2
    return v1
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

.method public static c(Ljava/lang/String;I)Lcom/fasterxml/jackson/core/e;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const/16 v2, 0x10

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 12
    move-result v2

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 16
    const/4 v2, 0x2

    .line 17
    .line 18
    if-le p1, v2, :cond_0

    .line 19
    .line 20
    add-int/lit8 v2, p1, -0x1

    .line 21
    const/4 v3, 0x1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p0, v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    :cond_0
    add-int/lit8 v2, p1, 0x1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 30
    move-result p1

    .line 31
    .line 32
    .line 33
    invoke-static {v1, p1}, Lcom/fasterxml/jackson/core/e;->a(Ljava/lang/StringBuilder;C)V

    .line 34
    .line 35
    :goto_0
    if-ge v2, v0, :cond_3

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 39
    move-result p1

    .line 40
    .line 41
    const/16 v3, 0x2f

    .line 42
    .line 43
    if-ne p1, v3, :cond_1

    .line 44
    .line 45
    new-instance p1, Lcom/fasterxml/jackson/core/e;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, Lcom/fasterxml/jackson/core/e;->d(Ljava/lang/String;)Lcom/fasterxml/jackson/core/e;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, p0, v0, v1}, Lcom/fasterxml/jackson/core/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/jackson/core/e;)V

    .line 61
    return-object p1

    .line 62
    .line 63
    :cond_1
    add-int/lit8 v3, v2, 0x1

    .line 64
    .line 65
    const/16 v4, 0x7e

    .line 66
    .line 67
    if-ne p1, v4, :cond_2

    .line 68
    .line 69
    if-ge v3, v0, :cond_2

    .line 70
    .line 71
    add-int/lit8 v2, v2, 0x2

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 75
    move-result p1

    .line 76
    .line 77
    .line 78
    invoke-static {v1, p1}, Lcom/fasterxml/jackson/core/e;->a(Ljava/lang/StringBuilder;C)V

    .line 79
    goto :goto_0

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    move v2, v3

    .line 84
    goto :goto_0

    .line 85
    .line 86
    :cond_3
    new-instance p1, Lcom/fasterxml/jackson/core/e;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    sget-object v1, Lcom/fasterxml/jackson/core/e;->e:Lcom/fasterxml/jackson/core/e;

    .line 93
    .line 94
    .line 95
    invoke-direct {p1, p0, v0, v1}, Lcom/fasterxml/jackson/core/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/jackson/core/e;)V

    .line 96
    return-object p1
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

.method public static d(Ljava/lang/String;)Lcom/fasterxml/jackson/core/e;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    move v2, v1

    .line 7
    .line 8
    :cond_0
    if-ge v2, v0, :cond_2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 12
    move-result v3

    .line 13
    .line 14
    const/16 v4, 0x2f

    .line 15
    .line 16
    if-ne v3, v4, :cond_1

    .line 17
    .line 18
    new-instance v0, Lcom/fasterxml/jackson/core/e;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lcom/fasterxml/jackson/core/e;->d(Ljava/lang/String;)Lcom/fasterxml/jackson/core/e;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, p0, v1, v2}, Lcom/fasterxml/jackson/core/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/jackson/core/e;)V

    .line 34
    return-object v0

    .line 35
    .line 36
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    const/16 v4, 0x7e

    .line 39
    .line 40
    if-ne v3, v4, :cond_0

    .line 41
    .line 42
    if-ge v2, v0, :cond_0

    .line 43
    .line 44
    .line 45
    invoke-static {p0, v2}, Lcom/fasterxml/jackson/core/e;->c(Ljava/lang/String;I)Lcom/fasterxml/jackson/core/e;

    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    .line 49
    :cond_2
    new-instance v0, Lcom/fasterxml/jackson/core/e;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    sget-object v2, Lcom/fasterxml/jackson/core/e;->e:Lcom/fasterxml/jackson/core/e;

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, p0, v1, v2}, Lcom/fasterxml/jackson/core/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/jackson/core/e;)V

    .line 59
    return-object v0
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

.method public static e(Ljava/lang/String;)Lcom/fasterxml/jackson/core/e;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 14
    move-result v0

    .line 15
    .line 16
    const/16 v1, 0x2f

    .line 17
    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Lcom/fasterxml/jackson/core/e;->d(Ljava/lang/String;)Lcom/fasterxml/jackson/core/e;

    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    .line 25
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    const-string v2, "Invalid input: JSON Pointer expression must start with \'/\': \""

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string p0, "\""

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    move-result-object p0

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    throw v0

    .line 52
    .line 53
    :cond_2
    :goto_0
    sget-object p0, Lcom/fasterxml/jackson/core/e;->e:Lcom/fasterxml/jackson/core/e;

    .line 54
    return-object p0
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


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    return v0

    .line 9
    .line 10
    :cond_1
    instance-of v1, p1, Lcom/fasterxml/jackson/core/e;

    .line 11
    .line 12
    if-nez v1, :cond_2

    .line 13
    return v0

    .line 14
    .line 15
    :cond_2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/e;->b:Ljava/lang/String;

    .line 16
    .line 17
    check-cast p1, Lcom/fasterxml/jackson/core/e;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/fasterxml/jackson/core/e;->b:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    move-result p1

    .line 24
    return p1
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

.method public f()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/e;->d:I

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
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/e;->c:Ljava/lang/String;

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

.method public h(I)Lcom/fasterxml/jackson/core/e;
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/e;->d:I

    .line 3
    .line 4
    if-ne p1, v0, :cond_1

    .line 5
    .line 6
    if-gez p1, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    iget-object p1, p0, Lcom/fasterxml/jackson/core/e;->a:Lcom/fasterxml/jackson/core/e;

    .line 10
    return-object p1

    .line 11
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 12
    return-object p1
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

.method public hashCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/e;->b:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public i(Ljava/lang/String;)Lcom/fasterxml/jackson/core/e;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/e;->a:Lcom/fasterxml/jackson/core/e;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/fasterxml/jackson/core/e;->c:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    move-result p1

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/fasterxml/jackson/core/e;->a:Lcom/fasterxml/jackson/core/e;

    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public j()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/e;->a:Lcom/fasterxml/jackson/core/e;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public k()Lcom/fasterxml/jackson/core/e;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/e;->a:Lcom/fasterxml/jackson/core/e;

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

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/e;->b:Ljava/lang/String;

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
