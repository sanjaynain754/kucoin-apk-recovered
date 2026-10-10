.class public final Lcom/geetest/gtc4/m;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:[[B


# direct methods
.method public constructor <init>(Lcom/geetest/gtc4/h3;IZ[[B)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 9
    iput p2, p0, Lcom/geetest/gtc4/m;->a:I

    .line 10
    iput-boolean p3, p0, Lcom/geetest/gtc4/m;->b:Z

    .line 11
    iput-object p4, p0, Lcom/geetest/gtc4/m;->c:[[B

    return-void
.end method

.method public constructor <init>(Ljava/io/ByteArrayInputStream;IZ)V
    .locals 1

    const/16 v0, 0xb

    .line 3
    new-array v0, v0, [[B

    .line 4
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 5
    iput p2, p0, Lcom/geetest/gtc4/m;->a:I

    .line 6
    iput-boolean p3, p0, Lcom/geetest/gtc4/m;->b:Z

    .line 7
    iput-object v0, p0, Lcom/geetest/gtc4/m;->c:[[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length p1, p1

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, v0, p1, v1}, Lcom/geetest/gtc4/m;-><init>(Ljava/io/ByteArrayInputStream;IZ)V

    return-void
.end method

.method public static a(Ljava/io/InputStream;I)I
    .locals 4

    const/16 v0, 0x1f

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_6

    .line 103
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p1

    const-string v1, "EOF found inside tag value."

    if-ge p1, v0, :cond_1

    if-gez p1, :cond_0

    .line 104
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 105
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "corrupted stream - high tag number < 31 found"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    and-int/lit8 v0, p1, 0x7f

    if-eqz v0, :cond_5

    :goto_0
    and-int/lit16 p1, p1, 0x80

    if-eqz p1, :cond_4

    ushr-int/lit8 p1, v0, 0x18

    if-nez p1, :cond_3

    shl-int/lit8 p1, v0, 0x7

    .line 106
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_2

    and-int/lit8 v2, v0, 0x7f

    or-int/2addr p1, v2

    move v3, v0

    move v0, p1

    move p1, v3

    goto :goto_0

    .line 107
    :cond_2
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 108
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Tag number more than 31 bits"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    return v0

    .line 109
    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string p1, "corrupted stream - invalid high tag number found"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    return p1
.end method

.method public static a(Ljava/io/InputStream;IZ)I
    .locals 5

    .line 110
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    ushr-int/lit8 v1, v0, 0x7

    if-nez v1, :cond_0

    return v0

    :cond_0
    const/16 v1, 0x80

    if-ne v1, v0, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    if-ltz v0, :cond_8

    const/16 v1, 0xff

    if-eq v1, v0, :cond_7

    and-int/lit8 v0, v0, 0x7f

    const/4 v1, 0x0

    move v2, v1

    .line 111
    :cond_2
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v3

    if-ltz v3, :cond_6

    ushr-int/lit8 v4, v1, 0x17

    if-nez v4, :cond_5

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v0, :cond_2

    if-lt v1, p1, :cond_4

    if-eqz p2, :cond_3

    goto :goto_0

    .line 112
    :cond_3
    new-instance p0, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "corrupted stream - out of bounds length found: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " >= "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_0
    return v1

    .line 113
    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string p1, "long form definite-length more than 31 bits"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 114
    :cond_6
    new-instance p0, Ljava/io/EOFException;

    const-string p1, "EOF found reading length"

    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 115
    :cond_7
    new-instance p0, Ljava/io/IOException;

    const-string p1, "invalid long form definite-length 0xFF"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 116
    :cond_8
    new-instance p0, Ljava/io/EOFException;

    const-string p1, "EOF found when length expected"

    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(ILcom/geetest/gtc4/h3;[[B)Lcom/geetest/gtc4/w;
    .locals 5

    .line 117
    const-string/jumbo v0, "unknown tag "

    const-string/jumbo v1, "unsupported tag "

    const/4 v2, 0x1

    const-string v3, " encountered"

    const/16 v4, 0x1000

    packed-switch p0, :pswitch_data_0

    .line 118
    :pswitch_0
    :try_start_0
    new-instance p1, Ljava/io/IOException;

    .line 119
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 120
    :pswitch_1
    invoke-static {p1}, Lcom/geetest/gtc4/m;->a(Lcom/geetest/gtc4/h3;)[C

    move-result-object p0

    .line 121
    new-instance p1, Lcom/geetest/gtc4/y1;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/y1;-><init>([C)V

    return-object p1

    .line 122
    :pswitch_2
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 123
    new-instance p1, Lcom/geetest/gtc4/r2;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/r2;-><init>([B)V

    return-object p1

    .line 124
    :pswitch_3
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 125
    new-instance p1, Lcom/geetest/gtc4/c2;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/c2;-><init>([B)V

    return-object p1

    .line 126
    :pswitch_4
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 127
    new-instance p1, Lcom/geetest/gtc4/t2;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/t2;-><init>([B)V

    return-object p1

    .line 128
    :pswitch_5
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 129
    new-instance p1, Lcom/geetest/gtc4/e2;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/e2;-><init>([B)V

    return-object p1

    .line 130
    :pswitch_6
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 131
    new-instance p1, Lcom/geetest/gtc4/k;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/k;-><init>([B)V

    return-object p1

    .line 132
    :pswitch_7
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 133
    new-instance p1, Lcom/geetest/gtc4/e0;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/e0;-><init>([B)V

    return-object p1

    .line 134
    :pswitch_8
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 135
    new-instance p1, Lcom/geetest/gtc4/f2;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/f2;-><init>([B)V

    return-object p1

    .line 136
    :pswitch_9
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 137
    new-instance p1, Lcom/geetest/gtc4/s2;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/s2;-><init>([B)V

    return-object p1

    .line 138
    :pswitch_a
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 139
    new-instance p1, Lcom/geetest/gtc4/o2;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/o2;-><init>([B)V

    return-object p1

    .line 140
    :pswitch_b
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 141
    new-instance p1, Lcom/geetest/gtc4/l2;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/l2;-><init>([B)V

    return-object p1

    .line 142
    :pswitch_c
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 143
    new-instance p1, Lcom/geetest/gtc4/h2;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/h2;-><init>([B)V

    return-object p1

    .line 144
    :pswitch_d
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 145
    :pswitch_e
    iget p0, p1, Lcom/geetest/gtc4/h3;->d:I

    .line 146
    sget-object v0, Lcom/geetest/gtc4/x;->c:Ljava/util/concurrent/ConcurrentHashMap;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v0, "exceeded relative OID contents length limit"

    if-gt p0, v4, :cond_3

    .line 147
    :try_start_1
    invoke-static {p1, p2}, Lcom/geetest/gtc4/m;->a(Lcom/geetest/gtc4/h3;[[B)[B

    move-result-object p0

    .line 148
    array-length p1, p0

    if-gt p1, v4, :cond_2

    .line 149
    new-instance p1, Lcom/geetest/gtc4/p;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/p;-><init>([B)V

    .line 150
    sget-object p2, Lcom/geetest/gtc4/x;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/geetest/gtc4/x;

    if-eqz p1, :cond_0

    return-object p1

    .line 151
    :cond_0
    invoke-static {p0}, Lcom/geetest/gtc4/x;->a([B)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 152
    new-instance p1, Lcom/geetest/gtc4/x;

    invoke-static {p0}, Lcom/geetest/gtc4/o0;->a([B)[B

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/x;-><init>([B)V

    return-object p1

    .line 153
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "invalid relative OID contents"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 154
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 155
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 156
    :pswitch_f
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 157
    new-instance p1, Lcom/geetest/gtc4/q2;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/q2;-><init>([B)V

    return-object p1

    .line 158
    :pswitch_10
    invoke-static {p1, p2}, Lcom/geetest/gtc4/m;->a(Lcom/geetest/gtc4/h3;[[B)[B

    move-result-object p0

    invoke-static {p0, v2}, Lcom/geetest/gtc4/h;->a([BZ)Lcom/geetest/gtc4/h;

    move-result-object p0

    return-object p0

    .line 159
    :pswitch_11
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 160
    new-instance p1, Lcom/geetest/gtc4/o;

    .line 161
    new-instance p2, Lcom/geetest/gtc4/e2;

    invoke-direct {p2, p0}, Lcom/geetest/gtc4/e2;-><init>([B)V

    .line 162
    invoke-direct {p1, p2}, Lcom/geetest/gtc4/o;-><init>(Lcom/geetest/gtc4/e2;)V

    return-object p1

    .line 163
    :pswitch_12
    iget p0, p1, Lcom/geetest/gtc4/h3;->d:I

    .line 164
    sget-object v0, Lcom/geetest/gtc4/q;->c:Ljava/util/concurrent/ConcurrentHashMap;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    const-string v0, "exceeded OID contents length limit"

    if-gt p0, v4, :cond_7

    .line 165
    :try_start_2
    invoke-static {p1, p2}, Lcom/geetest/gtc4/m;->a(Lcom/geetest/gtc4/h3;[[B)[B

    move-result-object p0

    .line 166
    array-length p1, p0

    if-gt p1, v4, :cond_6

    .line 167
    new-instance p1, Lcom/geetest/gtc4/p;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/p;-><init>([B)V

    .line 168
    sget-object p2, Lcom/geetest/gtc4/q;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/geetest/gtc4/q;

    if-eqz p1, :cond_4

    return-object p1

    .line 169
    :cond_4
    invoke-static {p0}, Lcom/geetest/gtc4/x;->a([B)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 170
    new-instance p1, Lcom/geetest/gtc4/q;

    invoke-static {p0}, Lcom/geetest/gtc4/o0;->a([B)[B

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/q;-><init>([B)V

    return-object p1

    .line 171
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "invalid OID contents"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 172
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 173
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 174
    :pswitch_13
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 175
    array-length p0, p0

    if-nez p0, :cond_8

    .line 176
    sget-object p0, Lcom/geetest/gtc4/g2;->a:Lcom/geetest/gtc4/g2;

    return-object p0

    .line 177
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "malformed NULL encoding encountered"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 178
    :pswitch_14
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 179
    new-instance p1, Lcom/geetest/gtc4/i2;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/i2;-><init>([B)V

    return-object p1

    .line 180
    :pswitch_15
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    invoke-static {p0}, Lcom/geetest/gtc4/b;->a([B)Lcom/geetest/gtc4/b;

    move-result-object p0

    return-object p0

    .line 181
    :pswitch_16
    invoke-virtual {p1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    .line 182
    new-instance p1, Lcom/geetest/gtc4/n;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/n;-><init>([B)V

    return-object p1

    .line 183
    :pswitch_17
    invoke-static {p1, p2}, Lcom/geetest/gtc4/m;->a(Lcom/geetest/gtc4/h3;[[B)[B

    move-result-object p0

    .line 184
    array-length p1, p0

    if-ne p1, v2, :cond_b

    const/4 p1, 0x0

    .line 185
    aget-byte p0, p0, p1

    const/4 p1, -0x1

    if-eq p0, p1, :cond_a

    if-eqz p0, :cond_9

    .line 186
    new-instance p1, Lcom/geetest/gtc4/e;

    invoke-direct {p1, p0}, Lcom/geetest/gtc4/e;-><init>(B)V

    return-object p1

    .line 187
    :cond_9
    sget-object p0, Lcom/geetest/gtc4/e;->b:Lcom/geetest/gtc4/e;

    return-object p0

    .line 188
    :cond_a
    sget-object p0, Lcom/geetest/gtc4/e;->c:Lcom/geetest/gtc4/e;

    return-object p0

    .line 189
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "BOOLEAN value should have 1 byte in it"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p0

    .line 190
    new-instance p1, Lcom/geetest/gtc4/i;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Lcom/geetest/gtc4/i;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    .line 191
    new-instance p1, Lcom/geetest/gtc4/i;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Lcom/geetest/gtc4/i;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_0
        :pswitch_0
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
    .end packed-switch
.end method

.method public static a(Lcom/geetest/gtc4/h3;[[B)[B
    .locals 3

    .line 18
    iget v0, p0, Lcom/geetest/gtc4/h3;->d:I

    .line 19
    array-length v1, p1

    if-lt v0, v1, :cond_0

    .line 20
    invoke-virtual {p0}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p0

    return-object p0

    .line 21
    :cond_0
    aget-object v1, p1, v0

    if-nez v1, :cond_1

    .line 22
    new-array v1, v0, [B

    aput-object v1, p1, v0

    .line 23
    :cond_1
    array-length p1, v1

    if-ne v0, p1, :cond_5

    if-nez v0, :cond_2

    return-object v1

    .line 24
    :cond_2
    iget p1, p0, Lcom/geetest/gtc4/o5;->b:I

    if-ge v0, p1, :cond_4

    .line 25
    iget-object p1, p0, Lcom/geetest/gtc4/o5;->a:Ljava/io/InputStream;

    array-length v2, v1

    invoke-static {p1, v1, v2}, Lcom/geetest/gtc4/l7;->a(Ljava/io/InputStream;[BI)I

    move-result p1

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/geetest/gtc4/h3;->d:I

    if-nez v0, :cond_3

    .line 26
    invoke-virtual {p0}, Lcom/geetest/gtc4/o5;->a()V

    return-object v1

    .line 27
    :cond_3
    new-instance p1, Ljava/io/EOFException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DEF length "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/geetest/gtc4/h3;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " object truncated by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Lcom/geetest/gtc4/h3;->d:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 28
    :cond_4
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "corrupted stream - out of bounds length found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p0, p0, Lcom/geetest/gtc4/h3;->d:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " >= "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 29
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "buffer length not right for data"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Lcom/geetest/gtc4/h3;)[C
    .locals 11

    .line 1
    iget v0, p0, Lcom/geetest/gtc4/h3;->d:I

    and-int/lit8 v1, v0, 0x1

    if-nez v1, :cond_6

    .line 2
    div-int/lit8 v1, v0, 0x2

    new-array v2, v1, [C

    const/16 v3, 0x8

    .line 3
    new-array v4, v3, [B

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    const-string v7, "EOF encountered in middle of BMPString"

    const/4 v8, 0x2

    if-lt v0, v3, :cond_1

    .line 4
    invoke-static {p0, v4, v3}, Lcom/geetest/gtc4/l7;->a(Ljava/io/InputStream;[BI)I

    move-result v9

    if-ne v9, v3, :cond_0

    .line 5
    aget-byte v7, v4, v5

    shl-int/2addr v7, v3

    const/4 v9, 0x1

    aget-byte v9, v4, v9

    and-int/lit16 v9, v9, 0xff

    or-int/2addr v7, v9

    int-to-char v7, v7

    aput-char v7, v2, v6

    add-int/lit8 v7, v6, 0x1

    .line 6
    aget-byte v8, v4, v8

    shl-int/2addr v8, v3

    const/4 v9, 0x3

    aget-byte v9, v4, v9

    and-int/lit16 v9, v9, 0xff

    or-int/2addr v8, v9

    int-to-char v8, v8

    aput-char v8, v2, v7

    add-int/lit8 v7, v6, 0x2

    const/4 v8, 0x4

    .line 7
    aget-byte v8, v4, v8

    shl-int/2addr v8, v3

    const/4 v9, 0x5

    aget-byte v9, v4, v9

    and-int/lit16 v9, v9, 0xff

    or-int/2addr v8, v9

    int-to-char v8, v8

    aput-char v8, v2, v7

    add-int/lit8 v7, v6, 0x3

    const/4 v8, 0x6

    .line 8
    aget-byte v8, v4, v8

    shl-int/2addr v8, v3

    const/4 v9, 0x7

    aget-byte v9, v4, v9

    and-int/lit16 v9, v9, 0xff

    or-int/2addr v8, v9

    int-to-char v8, v8

    aput-char v8, v2, v7

    add-int/lit8 v6, v6, 0x4

    add-int/lit8 v0, v0, -0x8

    goto :goto_0

    .line 9
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0, v7}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-lez v0, :cond_4

    .line 10
    invoke-static {p0, v4, v0}, Lcom/geetest/gtc4/l7;->a(Ljava/io/InputStream;[BI)I

    move-result v9

    if-ne v9, v0, :cond_3

    :cond_2
    add-int/lit8 v7, v5, 0x1

    .line 11
    aget-byte v9, v4, v5

    shl-int/2addr v9, v3

    add-int/2addr v5, v8

    .line 12
    aget-byte v7, v4, v7

    and-int/lit16 v7, v7, 0xff

    add-int/lit8 v10, v6, 0x1

    or-int/2addr v7, v9

    int-to-char v7, v7

    .line 13
    aput-char v7, v2, v6

    move v6, v10

    if-lt v5, v0, :cond_2

    goto :goto_1

    .line 14
    :cond_3
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0, v7}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 15
    :cond_4
    :goto_1
    iget p0, p0, Lcom/geetest/gtc4/h3;->d:I

    if-nez p0, :cond_5

    if-ne v1, v6, :cond_5

    return-object v2

    .line 16
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    .line 17
    :cond_6
    new-instance p0, Ljava/io/IOException;

    const-string v0, "malformed BMPString encoding encountered"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()Lcom/geetest/gtc4/w;
    .locals 7

    .line 73
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-gtz v0, :cond_1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 74
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string/jumbo v1, "unexpected end-of-contents marker"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 75
    :cond_1
    invoke-static {p0, v0}, Lcom/geetest/gtc4/m;->a(Ljava/io/InputStream;I)I

    move-result v1

    .line 76
    iget v2, p0, Lcom/geetest/gtc4/m;->a:I

    const/4 v3, 0x0

    invoke-static {p0, v2, v3}, Lcom/geetest/gtc4/m;->a(Ljava/io/InputStream;IZ)I

    move-result v2

    if-ltz v2, :cond_2

    .line 77
    :try_start_0
    invoke-virtual {p0, v0, v1, v2}, Lcom/geetest/gtc4/m;->a(III)Lcom/geetest/gtc4/w;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 78
    new-instance v1, Lcom/geetest/gtc4/i;

    const-string v2, "corrupted stream detected"

    invoke-direct {v1, v2, v0}, Lcom/geetest/gtc4/i;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_b

    .line 79
    new-instance v2, Lcom/geetest/gtc4/j5;

    iget v4, p0, Lcom/geetest/gtc4/m;->a:I

    invoke-direct {v2, p0, v4}, Lcom/geetest/gtc4/j5;-><init>(Ljava/io/InputStream;I)V

    .line 80
    new-instance v4, Lcom/geetest/gtc4/c0;

    iget v5, p0, Lcom/geetest/gtc4/m;->a:I

    iget-object v6, p0, Lcom/geetest/gtc4/m;->c:[[B

    invoke-direct {v4, v2, v5, v6}, Lcom/geetest/gtc4/c0;-><init>(Lcom/geetest/gtc4/o5;I[[B)V

    and-int/lit16 v0, v0, 0xc0

    if-eqz v0, :cond_3

    .line 81
    invoke-virtual {v4, v0, v1}, Lcom/geetest/gtc4/c0;->a(II)Lcom/geetest/gtc4/k1;

    move-result-object v0

    return-object v0

    :cond_3
    const/4 v0, 0x3

    const/16 v2, 0x1000

    if-eq v1, v0, :cond_9

    const/4 v0, 0x4

    if-eq v1, v0, :cond_7

    const/16 v0, 0x8

    if-eq v1, v0, :cond_6

    const/16 v0, 0x10

    if-eq v1, v0, :cond_5

    const/16 v0, 0x11

    if-ne v1, v0, :cond_4

    .line 82
    new-instance v0, Lcom/geetest/gtc4/i1;

    invoke-virtual {v4}, Lcom/geetest/gtc4/c0;->a()Lcom/geetest/gtc4/g;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/geetest/gtc4/i1;-><init>(Lcom/geetest/gtc4/g;)V

    return-object v0

    .line 83
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string/jumbo v1, "unknown BER object encountered"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :cond_5
    new-instance v0, Lcom/geetest/gtc4/g1;

    invoke-virtual {v4}, Lcom/geetest/gtc4/c0;->a()Lcom/geetest/gtc4/g;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/geetest/gtc4/g1;-><init>(Lcom/geetest/gtc4/g;)V

    return-object v0

    .line 85
    :cond_6
    :try_start_1
    new-instance v0, Lcom/geetest/gtc4/w2;

    new-instance v1, Lcom/geetest/gtc4/z2;

    invoke-virtual {v4}, Lcom/geetest/gtc4/c0;->a()Lcom/geetest/gtc4/g;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/geetest/gtc4/z2;-><init>(Lcom/geetest/gtc4/g;)V

    invoke-direct {v0, v1}, Lcom/geetest/gtc4/w2;-><init>(Lcom/geetest/gtc4/z2;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception v0

    .line 86
    new-instance v1, Lcom/geetest/gtc4/i;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/geetest/gtc4/i;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 87
    :cond_7
    new-instance v0, Lcom/geetest/gtc4/e1;

    new-instance v1, Lcom/geetest/gtc4/u1;

    invoke-direct {v1, v4}, Lcom/geetest/gtc4/u1;-><init>(Lcom/geetest/gtc4/c0;)V

    .line 88
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 89
    new-array v5, v2, [B

    .line 90
    :goto_0
    invoke-virtual {v1, v5, v3, v2}, Lcom/geetest/gtc4/u1;->read([BII)I

    move-result v6

    if-ltz v6, :cond_8

    .line 91
    invoke-virtual {v4, v5, v3, v6}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    .line 92
    :cond_8
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 93
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/e1;-><init>([B)V

    return-object v0

    .line 94
    :cond_9
    new-instance v0, Lcom/geetest/gtc4/t1;

    invoke-direct {v0, v4}, Lcom/geetest/gtc4/t1;-><init>(Lcom/geetest/gtc4/c0;)V

    .line 95
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 96
    new-array v4, v2, [B

    .line 97
    :goto_1
    invoke-virtual {v0, v4, v3, v2}, Lcom/geetest/gtc4/t1;->read([BII)I

    move-result v5

    if-ltz v5, :cond_a

    .line 98
    invoke-virtual {v1, v4, v3, v5}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_1

    .line 99
    :cond_a
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 100
    iget v0, v0, Lcom/geetest/gtc4/t1;->c:I

    .line 101
    new-instance v2, Lcom/geetest/gtc4/b1;

    invoke-direct {v2, v1, v0}, Lcom/geetest/gtc4/b1;-><init>([BI)V

    return-object v2

    .line 102
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "indefinite-length primitive encoding encountered"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a(III)Lcom/geetest/gtc4/w;
    .locals 5

    const/4 v0, 0x1

    .line 30
    new-instance v1, Lcom/geetest/gtc4/h3;

    iget v2, p0, Lcom/geetest/gtc4/m;->a:I

    invoke-direct {v1, p0, p3, v2}, Lcom/geetest/gtc4/h3;-><init>(Ljava/io/InputStream;II)V

    and-int/lit16 p3, p1, 0xe0

    if-nez p3, :cond_0

    .line 31
    iget-object p1, p0, Lcom/geetest/gtc4/m;->c:[[B

    invoke-static {p2, v1, p1}, Lcom/geetest/gtc4/m;->a(ILcom/geetest/gtc4/h3;[[B)Lcom/geetest/gtc4/w;

    move-result-object p1

    return-object p1

    :cond_0
    and-int/lit16 p3, p1, 0xc0

    const/4 v2, 0x3

    const/4 v3, 0x4

    const/4 v4, 0x0

    if-eqz p3, :cond_4

    and-int/lit8 p1, p1, 0x20

    if-eqz p1, :cond_3

    .line 32
    invoke-virtual {p0, v1}, Lcom/geetest/gtc4/m;->b(Lcom/geetest/gtc4/h3;)Lcom/geetest/gtc4/g;

    move-result-object p1

    .line 33
    iget v1, p1, Lcom/geetest/gtc4/g;->b:I

    if-ne v1, v0, :cond_1

    .line 34
    new-instance v0, Lcom/geetest/gtc4/d3;

    invoke-virtual {p1, v4}, Lcom/geetest/gtc4/g;->a(I)Lcom/geetest/gtc4/f;

    move-result-object p1

    invoke-direct {v0, v2, p3, p2, p1}, Lcom/geetest/gtc4/d3;-><init>(IIILcom/geetest/gtc4/f;)V

    return-object v0

    .line 35
    :cond_1
    new-instance v2, Lcom/geetest/gtc4/d3;

    sget-object v4, Lcom/geetest/gtc4/x2;->a:Lcom/geetest/gtc4/z2;

    if-ge v1, v0, :cond_2

    .line 36
    sget-object p1, Lcom/geetest/gtc4/x2;->a:Lcom/geetest/gtc4/z2;

    goto :goto_0

    .line 37
    :cond_2
    new-instance v0, Lcom/geetest/gtc4/z2;

    invoke-direct {v0, p1}, Lcom/geetest/gtc4/z2;-><init>(Lcom/geetest/gtc4/g;)V

    move-object p1, v0

    .line 38
    :goto_0
    invoke-direct {v2, v3, p3, p2, p1}, Lcom/geetest/gtc4/d3;-><init>(IIILcom/geetest/gtc4/f;)V

    return-object v2

    .line 39
    :cond_3
    invoke-virtual {v1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p1

    .line 40
    new-instance v0, Lcom/geetest/gtc4/d3;

    new-instance v1, Lcom/geetest/gtc4/i2;

    invoke-direct {v1, p1}, Lcom/geetest/gtc4/i2;-><init>([B)V

    invoke-direct {v0, v3, p3, p2, v1}, Lcom/geetest/gtc4/d3;-><init>(IIILcom/geetest/gtc4/f;)V

    return-object v0

    :cond_4
    if-eq p2, v2, :cond_f

    if-eq p2, v3, :cond_c

    const/16 p1, 0x8

    if-eq p2, p1, :cond_a

    const/16 p1, 0x10

    if-eq p2, p1, :cond_6

    const/16 p1, 0x11

    if-ne p2, p1, :cond_5

    .line 41
    invoke-virtual {p0, v1}, Lcom/geetest/gtc4/m;->b(Lcom/geetest/gtc4/h3;)Lcom/geetest/gtc4/g;

    move-result-object p1

    invoke-static {p1}, Lcom/geetest/gtc4/x2;->a(Lcom/geetest/gtc4/g;)Lcom/geetest/gtc4/b3;

    move-result-object p1

    return-object p1

    .line 42
    :cond_5
    new-instance p1, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string/jumbo v0, "unknown tag "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " encountered"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 43
    :cond_6
    iget p1, v1, Lcom/geetest/gtc4/h3;->d:I

    if-ge p1, v0, :cond_7

    .line 44
    sget-object p1, Lcom/geetest/gtc4/x2;->a:Lcom/geetest/gtc4/z2;

    return-object p1

    .line 45
    :cond_7
    iget-boolean p1, p0, Lcom/geetest/gtc4/m;->b:Z

    if-eqz p1, :cond_8

    .line 46
    new-instance p1, Lcom/geetest/gtc4/l5;

    invoke-virtual {v1}, Lcom/geetest/gtc4/h3;->b()[B

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/geetest/gtc4/l5;-><init>([B)V

    return-object p1

    .line 47
    :cond_8
    invoke-virtual {p0, v1}, Lcom/geetest/gtc4/m;->b(Lcom/geetest/gtc4/h3;)Lcom/geetest/gtc4/g;

    move-result-object p1

    sget-object p2, Lcom/geetest/gtc4/x2;->a:Lcom/geetest/gtc4/z2;

    .line 48
    iget p2, p1, Lcom/geetest/gtc4/g;->b:I

    if-ge p2, v0, :cond_9

    .line 49
    sget-object p1, Lcom/geetest/gtc4/x2;->a:Lcom/geetest/gtc4/z2;

    return-object p1

    .line 50
    :cond_9
    new-instance p2, Lcom/geetest/gtc4/z2;

    invoke-direct {p2, p1}, Lcom/geetest/gtc4/z2;-><init>(Lcom/geetest/gtc4/g;)V

    return-object p2

    .line 51
    :cond_a
    invoke-virtual {p0, v1}, Lcom/geetest/gtc4/m;->b(Lcom/geetest/gtc4/h3;)Lcom/geetest/gtc4/g;

    move-result-object p1

    sget-object p2, Lcom/geetest/gtc4/x2;->a:Lcom/geetest/gtc4/z2;

    .line 52
    iget p2, p1, Lcom/geetest/gtc4/g;->b:I

    if-ge p2, v0, :cond_b

    .line 53
    sget-object p1, Lcom/geetest/gtc4/x2;->a:Lcom/geetest/gtc4/z2;

    goto :goto_1

    .line 54
    :cond_b
    new-instance p2, Lcom/geetest/gtc4/z2;

    invoke-direct {p2, p1}, Lcom/geetest/gtc4/z2;-><init>(Lcom/geetest/gtc4/g;)V

    move-object p1, p2

    .line 55
    :goto_1
    new-instance p2, Lcom/geetest/gtc4/w2;

    invoke-direct {p2, p1}, Lcom/geetest/gtc4/w2;-><init>(Lcom/geetest/gtc4/z2;)V

    return-object p2

    .line 56
    :cond_c
    invoke-virtual {p0, v1}, Lcom/geetest/gtc4/m;->b(Lcom/geetest/gtc4/h3;)Lcom/geetest/gtc4/g;

    move-result-object p1

    .line 57
    iget p2, p1, Lcom/geetest/gtc4/g;->b:I

    .line 58
    new-array p3, p2, [Lcom/geetest/gtc4/s;

    :goto_2
    if-eq v4, p2, :cond_e

    .line 59
    invoke-virtual {p1, v4}, Lcom/geetest/gtc4/g;->a(I)Lcom/geetest/gtc4/f;

    move-result-object v1

    .line 60
    instance-of v2, v1, Lcom/geetest/gtc4/s;

    if-eqz v2, :cond_d

    .line 61
    check-cast v1, Lcom/geetest/gtc4/s;

    aput-object v1, p3, v4

    add-int/2addr v4, v0

    goto :goto_2

    .line 62
    :cond_d
    new-instance p1, Lcom/geetest/gtc4/i;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string/jumbo p3, "unknown object encountered in constructed OCTET STRING: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/geetest/gtc4/i;-><init>(Ljava/lang/String;)V

    throw p1

    .line 64
    :cond_e
    new-instance p1, Lcom/geetest/gtc4/e1;

    invoke-direct {p1, p3}, Lcom/geetest/gtc4/e1;-><init>([Lcom/geetest/gtc4/s;)V

    return-object p1

    .line 65
    :cond_f
    invoke-virtual {p0, v1}, Lcom/geetest/gtc4/m;->b(Lcom/geetest/gtc4/h3;)Lcom/geetest/gtc4/g;

    move-result-object p1

    .line 66
    iget p2, p1, Lcom/geetest/gtc4/g;->b:I

    .line 67
    new-array p3, p2, [Lcom/geetest/gtc4/b;

    :goto_3
    if-eq v4, p2, :cond_11

    .line 68
    invoke-virtual {p1, v4}, Lcom/geetest/gtc4/g;->a(I)Lcom/geetest/gtc4/f;

    move-result-object v1

    .line 69
    instance-of v2, v1, Lcom/geetest/gtc4/b;

    if-eqz v2, :cond_10

    .line 70
    check-cast v1, Lcom/geetest/gtc4/b;

    aput-object v1, p3, v4

    add-int/2addr v4, v0

    goto :goto_3

    .line 71
    :cond_10
    new-instance p1, Lcom/geetest/gtc4/i;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string/jumbo p3, "unknown object encountered in constructed BIT STRING: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/geetest/gtc4/i;-><init>(Ljava/lang/String;)V

    throw p1

    .line 72
    :cond_11
    new-instance p1, Lcom/geetest/gtc4/b1;

    invoke-direct {p1, p3}, Lcom/geetest/gtc4/b1;-><init>([Lcom/geetest/gtc4/b;)V

    return-object p1
.end method

.method public final b(Lcom/geetest/gtc4/h3;)Lcom/geetest/gtc4/g;
    .locals 5

    .line 1
    .line 2
    iget v0, p1, Lcom/geetest/gtc4/h3;->d:I

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    new-instance p1, Lcom/geetest/gtc4/g;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v2}, Lcom/geetest/gtc4/g;-><init>(I)V

    .line 12
    return-object p1

    .line 13
    .line 14
    :cond_0
    new-instance v1, Lcom/geetest/gtc4/m;

    .line 15
    .line 16
    iget-boolean v3, p0, Lcom/geetest/gtc4/m;->b:Z

    .line 17
    .line 18
    iget-object v4, p0, Lcom/geetest/gtc4/m;->c:[[B

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, p1, v0, v3, v4}, Lcom/geetest/gtc4/m;-><init>(Lcom/geetest/gtc4/h3;IZ[[B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/geetest/gtc4/m;->a()Lcom/geetest/gtc4/w;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    new-instance p1, Lcom/geetest/gtc4/g;

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, v2}, Lcom/geetest/gtc4/g;-><init>(I)V

    .line 33
    return-object p1

    .line 34
    .line 35
    :cond_1
    new-instance v0, Lcom/geetest/gtc4/g;

    .line 36
    .line 37
    const/16 v2, 0xa

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v2}, Lcom/geetest/gtc4/g;-><init>(I)V

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {v0, p1}, Lcom/geetest/gtc4/g;->a(Lcom/geetest/gtc4/f;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/geetest/gtc4/m;->a()Lcom/geetest/gtc4/w;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    if-nez p1, :cond_2

    .line 50
    return-object v0
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
