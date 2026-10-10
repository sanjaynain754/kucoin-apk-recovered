.class public Lcom/tencent/bugly/proguard/la;
.super Ljava/lang/Object;
.source "BUGLY"


# instance fields
.field public a:Ljava/nio/ByteBuffer;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x80

    .line 7
    invoke-direct {p0, v0}, Lcom/tencent/bugly/proguard/la;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    const-string v0, "GBK"

    iput-object v0, p0, Lcom/tencent/bugly/proguard/la;->b:Ljava/lang/String;

    .line 6
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, "GBK"

    iput-object v0, p0, Lcom/tencent/bugly/proguard/la;->b:Ljava/lang/String;

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public static a([Ljava/lang/String;)V
    .locals 3

    .line 141
    new-instance p0, Lcom/tencent/bugly/proguard/la;

    const/16 v0, 0x80

    .line 142
    invoke-direct {p0, v0}, Lcom/tencent/bugly/proguard/la;-><init>(I)V

    const-wide v0, 0x1234567890012345L    # 5.626349097915623E-221

    const/4 v2, 0x0

    .line 143
    invoke-virtual {p0, v0, v1, v2}, Lcom/tencent/bugly/proguard/la;->a(JI)V

    .line 144
    iget-object v0, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    .line 145
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/t7;->a([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 146
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/la;->b()[B

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 0

    .line 140
    iput-object p1, p0, Lcom/tencent/bugly/proguard/la;->b:Ljava/lang/String;

    const/4 p1, 0x0

    return p1
.end method

.method public a()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public a(BI)V
    .locals 1

    const/4 v0, 0x3

    .line 8
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    if-nez p1, :cond_0

    const/16 p1, 0xc

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 11
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public a(DI)V
    .locals 1

    const/16 v0, 0xa

    .line 27
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/4 v0, 0x5

    .line 28
    invoke-virtual {p0, v0, p3}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 29
    iget-object p3, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p3, p1, p2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public a(FI)V
    .locals 1

    const/4 v0, 0x6

    .line 24
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/4 v0, 0x4

    .line 25
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 26
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public a(I)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-ge v0, p1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    add-int/2addr v0, p1

    mul-int/lit8 v0, v0, 0x2

    .line 4
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 6
    iput-object p1, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    :cond_0
    return-void
.end method

.method public a(II)V
    .locals 1

    const/4 v0, 0x6

    .line 16
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/16 v0, -0x8000

    if-lt p1, v0, :cond_0

    const/16 v0, 0x7fff

    if-gt p1, v0, :cond_0

    int-to-short p1, p1

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(SI)V

    return-void

    :cond_0
    const/4 v0, 0x2

    .line 18
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 19
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public a(JI)V
    .locals 2

    const/16 v0, 0xa

    .line 20
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const-wide/32 v0, -0x80000000

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    long-to-int p1, p1

    .line 21
    invoke-virtual {p0, p1, p3}, Lcom/tencent/bugly/proguard/la;->a(II)V

    return-void

    :cond_0
    const/4 v0, 0x3

    .line 22
    invoke-virtual {p0, v0, p3}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 23
    iget-object p3, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p3, p1, p2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/JceStruct;I)V
    .locals 2

    const/4 v0, 0x2

    .line 87
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/16 v1, 0xa

    .line 88
    invoke-virtual {p0, v1, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 89
    invoke-virtual {p1, p0}, Lcom/tencent/bugly/proguard/JceStruct;->a(Lcom/tencent/bugly/proguard/la;)V

    .line 90
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/16 p1, 0xb

    const/4 p2, 0x0

    .line 91
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    return-void
.end method

.method public a(Ljava/lang/Boolean;I)V
    .locals 0

    .line 93
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(ZI)V

    return-void
.end method

.method public a(Ljava/lang/Byte;I)V
    .locals 0

    .line 92
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(BI)V

    return-void
.end method

.method public a(Ljava/lang/Double;I)V
    .locals 2

    .line 98
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, Lcom/tencent/bugly/proguard/la;->a(DI)V

    return-void
.end method

.method public a(Ljava/lang/Float;I)V
    .locals 0

    .line 97
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(FI)V

    return-void
.end method

.method public a(Ljava/lang/Integer;I)V
    .locals 0

    .line 95
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(II)V

    return-void
.end method

.method public a(Ljava/lang/Long;I)V
    .locals 2

    .line 96
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, Lcom/tencent/bugly/proguard/la;->a(JI)V

    return-void
.end method

.method public a(Ljava/lang/Object;I)V
    .locals 2

    .line 99
    instance-of v0, p1, Ljava/lang/Byte;

    if-eqz v0, :cond_0

    .line 100
    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(BI)V

    return-void

    .line 101
    :cond_0
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 102
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(ZI)V

    return-void

    .line 103
    :cond_1
    instance-of v0, p1, Ljava/lang/Short;

    if-eqz v0, :cond_2

    .line 104
    check-cast p1, Ljava/lang/Short;

    invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(SI)V

    return-void

    .line 105
    :cond_2
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 106
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(II)V

    return-void

    .line 107
    :cond_3
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_4

    .line 108
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, Lcom/tencent/bugly/proguard/la;->a(JI)V

    return-void

    .line 109
    :cond_4
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_5

    .line 110
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(FI)V

    return-void

    .line 111
    :cond_5
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_6

    .line 112
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, Lcom/tencent/bugly/proguard/la;->a(DI)V

    return-void

    .line 113
    :cond_6
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 114
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/String;I)V

    return-void

    .line 115
    :cond_7
    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_8

    .line 116
    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Map;I)V

    return-void

    .line 117
    :cond_8
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_9

    .line 118
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Collection;I)V

    return-void

    .line 119
    :cond_9
    instance-of v0, p1, Lcom/tencent/bugly/proguard/JceStruct;

    if-eqz v0, :cond_a

    .line 120
    check-cast p1, Lcom/tencent/bugly/proguard/JceStruct;

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(Lcom/tencent/bugly/proguard/JceStruct;I)V

    return-void

    .line 121
    :cond_a
    instance-of v0, p1, [B

    if-eqz v0, :cond_b

    .line 122
    check-cast p1, [B

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a([BI)V

    return-void

    .line 123
    :cond_b
    instance-of v0, p1, [Z

    if-eqz v0, :cond_c

    .line 124
    check-cast p1, [Z

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a([ZI)V

    return-void

    .line 125
    :cond_c
    instance-of v0, p1, [S

    if-eqz v0, :cond_d

    .line 126
    check-cast p1, [S

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a([SI)V

    return-void

    .line 127
    :cond_d
    instance-of v0, p1, [I

    if-eqz v0, :cond_e

    .line 128
    check-cast p1, [I

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a([II)V

    return-void

    .line 129
    :cond_e
    instance-of v0, p1, [J

    if-eqz v0, :cond_f

    .line 130
    check-cast p1, [J

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a([JI)V

    return-void

    .line 131
    :cond_f
    instance-of v0, p1, [F

    if-eqz v0, :cond_10

    .line 132
    check-cast p1, [F

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a([FI)V

    return-void

    .line 133
    :cond_10
    instance-of v0, p1, [D

    if-eqz v0, :cond_11

    .line 134
    check-cast p1, [D

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a([DI)V

    return-void

    .line 135
    :cond_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 136
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->b([Ljava/lang/Object;I)V

    return-void

    .line 137
    :cond_12
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_13

    .line 138
    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Collection;I)V

    return-void

    .line 139
    :cond_13
    new-instance p2, Lcom/tencent/bugly/proguard/ia;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "write object error: unsupport type. "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/tencent/bugly/proguard/ia;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public a(Ljava/lang/Short;I)V
    .locals 0

    .line 94
    invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(SI)V

    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 2

    .line 30
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/la;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 31
    :catch_0
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    .line 32
    :goto_0
    array-length v0, p1

    add-int/lit8 v0, v0, 0xa

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    .line 33
    array-length v0, p1

    const/16 v1, 0xff

    if-le v0, v1, :cond_0

    const/4 v0, 0x7

    .line 34
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 35
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    array-length v0, p1

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 36
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_1

    :cond_0
    const/4 v0, 0x6

    .line 37
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 38
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    array-length v0, p1

    int-to-byte v0, v0

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 39
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :goto_1
    return-void
.end method

.method public a(Ljava/util/Collection;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TT;>;I)V"
        }
    .end annotation

    const/16 v0, 0x8

    .line 82
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/16 v0, 0x9

    .line 83
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    const/4 p2, 0x0

    if-nez p1, :cond_0

    move v0, p2

    goto :goto_0

    .line 84
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    :goto_0
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->a(II)V

    if-eqz p1, :cond_1

    .line 85
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 86
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public a(Ljava/util/Map;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;I)V"
        }
    .end annotation

    const/16 v0, 0x8

    .line 40
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    .line 41
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    const/4 p2, 0x0

    if-nez p1, :cond_0

    move v0, p2

    goto :goto_0

    .line 42
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    :goto_0
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->a(II)V

    if-eqz p1, :cond_1

    .line 43
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 44
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/Object;I)V

    .line 45
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public a(SI)V
    .locals 1

    const/4 v0, 0x4

    .line 12
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/16 v0, -0x80

    if-lt p1, v0, :cond_0

    const/16 v0, 0x7f

    if-gt p1, v0, :cond_0

    int-to-byte p1, p1

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(BI)V

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 14
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 15
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public a(ZI)V
    .locals 0

    int-to-byte p1, p1

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->a(BI)V

    return-void
.end method

.method public a([BI)V
    .locals 1

    .line 51
    array-length v0, p1

    add-int/lit8 v0, v0, 0x8

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/16 v0, 0xd

    .line 52
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    const/4 p2, 0x0

    .line 53
    invoke-virtual {p0, p2, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 54
    array-length v0, p1

    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->a(II)V

    .line 55
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public a([DI)V
    .locals 4

    const/16 v0, 0x8

    .line 76
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/16 v0, 0x9

    .line 77
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 78
    array-length p2, p1

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lcom/tencent/bugly/proguard/la;->a(II)V

    .line 79
    array-length p2, p1

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_0

    aget-wide v2, p1, v1

    .line 80
    invoke-virtual {p0, v2, v3, v0}, Lcom/tencent/bugly/proguard/la;->a(DI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a([FI)V
    .locals 3

    const/16 v0, 0x8

    .line 71
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/16 v0, 0x9

    .line 72
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 73
    array-length p2, p1

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lcom/tencent/bugly/proguard/la;->a(II)V

    .line 74
    array-length p2, p1

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_0

    aget v2, p1, v1

    .line 75
    invoke-virtual {p0, v2, v0}, Lcom/tencent/bugly/proguard/la;->a(FI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a([II)V
    .locals 3

    const/16 v0, 0x8

    .line 61
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/16 v0, 0x9

    .line 62
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 63
    array-length p2, p1

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lcom/tencent/bugly/proguard/la;->a(II)V

    .line 64
    array-length p2, p1

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_0

    aget v2, p1, v1

    .line 65
    invoke-virtual {p0, v2, v0}, Lcom/tencent/bugly/proguard/la;->a(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a([JI)V
    .locals 4

    const/16 v0, 0x8

    .line 66
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/16 v0, 0x9

    .line 67
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 68
    array-length p2, p1

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lcom/tencent/bugly/proguard/la;->a(II)V

    .line 69
    array-length p2, p1

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_0

    aget-wide v2, p1, v1

    .line 70
    invoke-virtual {p0, v2, v3, v0}, Lcom/tencent/bugly/proguard/la;->a(JI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a([Ljava/lang/Object;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;I)V"
        }
    .end annotation

    .line 81
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/la;->b([Ljava/lang/Object;I)V

    return-void
.end method

.method public a([SI)V
    .locals 3

    const/16 v0, 0x8

    .line 56
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/16 v0, 0x9

    .line 57
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 58
    array-length p2, p1

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lcom/tencent/bugly/proguard/la;->a(II)V

    .line 59
    array-length p2, p1

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_0

    aget-short v2, p1, v1

    .line 60
    invoke-virtual {p0, v2, v0}, Lcom/tencent/bugly/proguard/la;->a(SI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a([ZI)V
    .locals 3

    const/16 v0, 0x8

    .line 46
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/16 v0, 0x9

    .line 47
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 48
    array-length p2, p1

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lcom/tencent/bugly/proguard/la;->a(II)V

    .line 49
    array-length p2, p1

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_0

    aget-boolean v2, p1, v1

    .line 50
    invoke-virtual {p0, v2, v0}, Lcom/tencent/bugly/proguard/la;->a(ZI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(BI)V
    .locals 1

    const/16 v0, 0xf

    if-ge p2, v0, :cond_0

    shl-int/lit8 p2, p2, 0x4

    or-int/2addr p1, p2

    int-to-byte p1, p1

    .line 3
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    return-void

    :cond_0
    const/16 v0, 0x100

    if-ge p2, v0, :cond_1

    or-int/lit16 p1, p1, 0xf0

    int-to-byte p1, p1

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 5
    iget-object p1, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    return-void

    .line 6
    :cond_1
    new-instance p1, Lcom/tencent/bugly/proguard/ia;

    .line 7
    const-string/jumbo v0, "tag is too large: "

    invoke-static {v0, p2}, Lcom/tencent/bugly/proguard/vi;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    .line 8
    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/ia;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/lang/String;I)V
    .locals 2

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0xa

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    .line 10
    invoke-static {p1}, Lcom/tencent/bugly/proguard/t7;->b(Ljava/lang/String;)[B

    move-result-object p1

    .line 11
    array-length v0, p1

    const/16 v1, 0xff

    if-le v0, v1, :cond_0

    const/4 v0, 0x7

    .line 12
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 13
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    array-length v0, p1

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 14
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    return-void

    :cond_0
    const/4 v0, 0x6

    .line 15
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 16
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    array-length v0, p1

    int-to-byte v0, v0

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 17
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final b([Ljava/lang/Object;I)V
    .locals 3

    const/16 v0, 0x8

    .line 18
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    const/16 v0, 0x9

    .line 19
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 20
    array-length p2, p1

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lcom/tencent/bugly/proguard/la;->a(II)V

    .line 21
    array-length p2, p1

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_0

    aget-object v2, p1, v1

    .line 22
    invoke-virtual {p0, v2, v0}, Lcom/tencent/bugly/proguard/la;->a(Ljava/lang/Object;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b()[B
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    new-array v0, v0, [B

    .line 2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public c(Ljava/lang/String;I)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/bugly/proguard/t7;->b(Ljava/lang/String;)[B

    .line 4
    move-result-object p1

    .line 5
    array-length v0, p1

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0xa

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/la;->a(I)V

    .line 11
    array-length v0, p1

    .line 12
    .line 13
    const/16 v1, 0xff

    .line 14
    .line 15
    if-le v0, v1, :cond_0

    .line 16
    const/4 v0, 0x7

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 20
    .line 21
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    .line 22
    array-length v0, p1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 31
    return-void

    .line 32
    :cond_0
    const/4 v0, 0x6

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0, p2}, Lcom/tencent/bugly/proguard/la;->b(BI)V

    .line 36
    .line 37
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    .line 38
    array-length v0, p1

    .line 39
    int-to-byte v0, v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    iget-object p2, p0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 48
    return-void
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
