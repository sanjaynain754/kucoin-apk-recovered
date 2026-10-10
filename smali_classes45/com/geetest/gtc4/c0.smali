.class public final Lcom/geetest/gtc4/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/geetest/gtc4/o5;

.field public final b:I

.field public final c:[[B


# direct methods
.method public constructor <init>(Lcom/geetest/gtc4/o5;I[[B)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/c0;->a:Lcom/geetest/gtc4/o5;

    .line 6
    .line 7
    iput p2, p0, Lcom/geetest/gtc4/c0;->b:I

    .line 8
    .line 9
    iput-object p3, p0, Lcom/geetest/gtc4/c0;->c:[[B

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


# virtual methods
.method public final a(I)Lcom/geetest/gtc4/f;
    .locals 12

    .line 17
    iget-object v0, p0, Lcom/geetest/gtc4/c0;->a:Lcom/geetest/gtc4/o5;

    instance-of v1, v0, Lcom/geetest/gtc4/j5;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 18
    check-cast v0, Lcom/geetest/gtc4/j5;

    .line 19
    iput-boolean v2, v0, Lcom/geetest/gtc4/j5;->f:Z

    .line 20
    invoke-virtual {v0}, Lcom/geetest/gtc4/j5;->b()Z

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/geetest/gtc4/c0;->a:Lcom/geetest/gtc4/o5;

    invoke-static {v0, p1}, Lcom/geetest/gtc4/m;->a(Ljava/io/InputStream;I)I

    move-result v0

    .line 22
    iget-object v1, p0, Lcom/geetest/gtc4/c0;->a:Lcom/geetest/gtc4/o5;

    iget v3, p0, Lcom/geetest/gtc4/c0;->b:I

    const/4 v4, 0x1

    const/16 v5, 0x8

    const/16 v6, 0x11

    const/16 v7, 0x10

    const/4 v8, 0x4

    const/4 v9, 0x3

    if-eq v0, v9, :cond_2

    if-eq v0, v8, :cond_2

    if-eq v0, v7, :cond_2

    if-eq v0, v6, :cond_2

    if-ne v0, v5, :cond_1

    goto :goto_0

    :cond_1
    move v10, v2

    goto :goto_1

    :cond_2
    :goto_0
    move v10, v4

    :goto_1
    invoke-static {v1, v3, v10}, Lcom/geetest/gtc4/m;->a(Ljava/io/InputStream;IZ)I

    move-result v1

    if-gez v1, :cond_a

    and-int/lit8 v1, p1, 0x20

    if-eqz v1, :cond_9

    .line 23
    new-instance v1, Lcom/geetest/gtc4/j5;

    iget-object v2, p0, Lcom/geetest/gtc4/c0;->a:Lcom/geetest/gtc4/o5;

    iget v3, p0, Lcom/geetest/gtc4/c0;->b:I

    invoke-direct {v1, v2, v3}, Lcom/geetest/gtc4/j5;-><init>(Ljava/io/InputStream;I)V

    .line 24
    new-instance v2, Lcom/geetest/gtc4/c0;

    iget v3, p0, Lcom/geetest/gtc4/c0;->b:I

    iget-object v4, p0, Lcom/geetest/gtc4/c0;->c:[[B

    invoke-direct {v2, v1, v3, v4}, Lcom/geetest/gtc4/c0;-><init>(Lcom/geetest/gtc4/o5;I[[B)V

    and-int/lit16 p1, p1, 0xc0

    if-eqz p1, :cond_3

    .line 25
    new-instance v1, Lcom/geetest/gtc4/l1;

    invoke-direct {v1, p1, v0, v2}, Lcom/geetest/gtc4/l1;-><init>(IILcom/geetest/gtc4/c0;)V

    return-object v1

    :cond_3
    if-eq v0, v9, :cond_8

    if-eq v0, v8, :cond_7

    if-eq v0, v5, :cond_6

    if-eq v0, v7, :cond_5

    if-ne v0, v6, :cond_4

    .line 26
    new-instance p1, Lcom/geetest/gtc4/j1;

    invoke-direct {p1, v2}, Lcom/geetest/gtc4/j1;-><init>(Lcom/geetest/gtc4/c0;)V

    return-object p1

    .line 27
    :cond_4
    new-instance p1, Lcom/geetest/gtc4/i;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "unknown BER object encountered: 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/geetest/gtc4/i;-><init>(Ljava/lang/String;)V

    throw p1

    .line 28
    :cond_5
    new-instance p1, Lcom/geetest/gtc4/h1;

    invoke-direct {p1, v2}, Lcom/geetest/gtc4/h1;-><init>(Lcom/geetest/gtc4/c0;)V

    return-object p1

    .line 29
    :cond_6
    new-instance p1, Lcom/geetest/gtc4/b2;

    invoke-direct {p1, v2}, Lcom/geetest/gtc4/b2;-><init>(Lcom/geetest/gtc4/c0;)V

    return-object p1

    .line 30
    :cond_7
    new-instance p1, Lcom/geetest/gtc4/f1;

    invoke-direct {p1, v2}, Lcom/geetest/gtc4/f1;-><init>(Lcom/geetest/gtc4/c0;)V

    return-object p1

    .line 31
    :cond_8
    new-instance p1, Lcom/geetest/gtc4/c1;

    invoke-direct {p1, v2}, Lcom/geetest/gtc4/c1;-><init>(Lcom/geetest/gtc4/c0;)V

    return-object p1

    .line 32
    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string v0, "indefinite-length primitive encoding encountered"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 33
    :cond_a
    new-instance v3, Lcom/geetest/gtc4/h3;

    iget-object v10, p0, Lcom/geetest/gtc4/c0;->a:Lcom/geetest/gtc4/o5;

    iget v11, p0, Lcom/geetest/gtc4/c0;->b:I

    invoke-direct {v3, v10, v1, v11}, Lcom/geetest/gtc4/h3;-><init>(Ljava/io/InputStream;II)V

    and-int/lit16 v1, p1, 0xe0

    if-nez v1, :cond_10

    if-eq v0, v9, :cond_f

    if-eq v0, v8, :cond_e

    if-eq v0, v5, :cond_d

    if-eq v0, v7, :cond_c

    if-eq v0, v6, :cond_b

    .line 34
    :try_start_0
    iget-object p1, p0, Lcom/geetest/gtc4/c0;->c:[[B

    invoke-static {v0, v3, p1}, Lcom/geetest/gtc4/m;->a(ILcom/geetest/gtc4/h3;[[B)Lcom/geetest/gtc4/w;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 35
    new-instance v0, Lcom/geetest/gtc4/i;

    const-string v1, "corrupted stream detected"

    invoke-direct {v0, v1, p1}, Lcom/geetest/gtc4/i;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 36
    :cond_b
    new-instance p1, Lcom/geetest/gtc4/i;

    const-string/jumbo v0, "sequences must use constructed encoding (see X.690 8.9.1/8.10.1)"

    invoke-direct {p1, v0}, Lcom/geetest/gtc4/i;-><init>(Ljava/lang/String;)V

    throw p1

    .line 37
    :cond_c
    new-instance p1, Lcom/geetest/gtc4/i;

    const-string/jumbo v0, "sets must use constructed encoding (see X.690 8.11.1/8.12.1)"

    invoke-direct {p1, v0}, Lcom/geetest/gtc4/i;-><init>(Ljava/lang/String;)V

    throw p1

    .line 38
    :cond_d
    new-instance p1, Lcom/geetest/gtc4/i;

    const-string v0, "externals must use constructed encoding (see X.690 8.18)"

    invoke-direct {p1, v0}, Lcom/geetest/gtc4/i;-><init>(Ljava/lang/String;)V

    throw p1

    .line 39
    :cond_e
    new-instance p1, Lcom/geetest/gtc4/j2;

    invoke-direct {p1, v3}, Lcom/geetest/gtc4/j2;-><init>(Lcom/geetest/gtc4/h3;)V

    return-object p1

    .line 40
    :cond_f
    new-instance p1, Lcom/geetest/gtc4/v2;

    invoke-direct {p1, v3}, Lcom/geetest/gtc4/v2;-><init>(Lcom/geetest/gtc4/h3;)V

    return-object p1

    .line 41
    :cond_10
    new-instance v1, Lcom/geetest/gtc4/c0;

    .line 42
    iget v10, v3, Lcom/geetest/gtc4/o5;->b:I

    .line 43
    iget-object v11, p0, Lcom/geetest/gtc4/c0;->c:[[B

    invoke-direct {v1, v3, v10, v11}, Lcom/geetest/gtc4/c0;-><init>(Lcom/geetest/gtc4/o5;I[[B)V

    and-int/lit16 v3, p1, 0xc0

    if-eqz v3, :cond_12

    and-int/lit8 p1, p1, 0x20

    if-eqz p1, :cond_11

    move v2, v4

    .line 44
    :cond_11
    new-instance p1, Lcom/geetest/gtc4/e3;

    invoke-direct {p1, v3, v0, v2, v1}, Lcom/geetest/gtc4/e3;-><init>(IIZLcom/geetest/gtc4/c0;)V

    return-object p1

    :cond_12
    if-eq v0, v9, :cond_17

    if-eq v0, v8, :cond_16

    if-eq v0, v5, :cond_15

    if-eq v0, v7, :cond_14

    if-ne v0, v6, :cond_13

    .line 45
    new-instance p1, Lcom/geetest/gtc4/c3;

    invoke-direct {p1, v1}, Lcom/geetest/gtc4/c3;-><init>(Lcom/geetest/gtc4/c0;)V

    return-object p1

    .line 46
    :cond_13
    new-instance p1, Lcom/geetest/gtc4/i;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "unknown DL object encountered: 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/geetest/gtc4/i;-><init>(Ljava/lang/String;)V

    throw p1

    .line 47
    :cond_14
    new-instance p1, Lcom/geetest/gtc4/a3;

    invoke-direct {p1, v1}, Lcom/geetest/gtc4/a3;-><init>(Lcom/geetest/gtc4/c0;)V

    return-object p1

    .line 48
    :cond_15
    new-instance p1, Lcom/geetest/gtc4/b2;

    invoke-direct {p1, v1}, Lcom/geetest/gtc4/b2;-><init>(Lcom/geetest/gtc4/c0;)V

    return-object p1

    .line 49
    :cond_16
    new-instance p1, Lcom/geetest/gtc4/f1;

    invoke-direct {p1, v1}, Lcom/geetest/gtc4/f1;-><init>(Lcom/geetest/gtc4/c0;)V

    return-object p1

    .line 50
    :cond_17
    new-instance p1, Lcom/geetest/gtc4/c1;

    invoke-direct {p1, v1}, Lcom/geetest/gtc4/c1;-><init>(Lcom/geetest/gtc4/c0;)V

    return-object p1
.end method

.method public final a()Lcom/geetest/gtc4/g;
    .locals 3

    .line 8
    iget-object v0, p0, Lcom/geetest/gtc4/c0;->a:Lcom/geetest/gtc4/o5;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-gez v0, :cond_0

    .line 9
    new-instance v0, Lcom/geetest/gtc4/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/geetest/gtc4/g;-><init>(I)V

    return-object v0

    .line 10
    :cond_0
    new-instance v1, Lcom/geetest/gtc4/g;

    const/16 v2, 0xa

    .line 11
    invoke-direct {v1, v2}, Lcom/geetest/gtc4/g;-><init>(I)V

    .line 12
    :cond_1
    invoke-virtual {p0, v0}, Lcom/geetest/gtc4/c0;->a(I)Lcom/geetest/gtc4/f;

    move-result-object v0

    .line 13
    instance-of v2, v0, Lcom/geetest/gtc4/i5;

    if-eqz v2, :cond_2

    .line 14
    check-cast v0, Lcom/geetest/gtc4/i5;

    invoke-interface {v0}, Lcom/geetest/gtc4/i5;->b()Lcom/geetest/gtc4/w;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/geetest/gtc4/g;->a(Lcom/geetest/gtc4/f;)V

    goto :goto_0

    .line 15
    :cond_2
    invoke-interface {v0}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/geetest/gtc4/g;->a(Lcom/geetest/gtc4/f;)V

    .line 16
    :goto_0
    iget-object v0, p0, Lcom/geetest/gtc4/c0;->a:Lcom/geetest/gtc4/o5;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-gez v0, :cond_1

    return-object v1
.end method

.method public final a(II)Lcom/geetest/gtc4/k1;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/geetest/gtc4/c0;->a()Lcom/geetest/gtc4/g;

    move-result-object v0

    .line 2
    iget v1, v0, Lcom/geetest/gtc4/g;->b:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 3
    new-instance v1, Lcom/geetest/gtc4/k1;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/geetest/gtc4/g;->a(I)Lcom/geetest/gtc4/f;

    move-result-object v0

    const/4 v2, 0x3

    invoke-direct {v1, v2, p1, p2, v0}, Lcom/geetest/gtc4/k1;-><init>(IIILcom/geetest/gtc4/f;)V

    return-object v1

    .line 4
    :cond_0
    new-instance v3, Lcom/geetest/gtc4/k1;

    sget-object v4, Lcom/geetest/gtc4/d1;->a:Lcom/geetest/gtc4/g1;

    if-ge v1, v2, :cond_1

    .line 5
    sget-object v0, Lcom/geetest/gtc4/d1;->a:Lcom/geetest/gtc4/g1;

    goto :goto_0

    .line 6
    :cond_1
    new-instance v1, Lcom/geetest/gtc4/g1;

    invoke-direct {v1, v0}, Lcom/geetest/gtc4/g1;-><init>(Lcom/geetest/gtc4/g;)V

    move-object v0, v1

    :goto_0
    const/4 v1, 0x4

    .line 7
    invoke-direct {v3, v1, p1, p2, v0}, Lcom/geetest/gtc4/k1;-><init>(IIILcom/geetest/gtc4/f;)V

    return-object v3
.end method
