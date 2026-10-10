.class public abstract Lcom/geetest/gtc4/z;
.super Lcom/geetest/gtc4/w;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public a:[Lcom/geetest/gtc4/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 2
    sget-object v0, Lcom/geetest/gtc4/g;->d:[Lcom/geetest/gtc4/f;

    iput-object v0, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    return-void
.end method

.method public constructor <init>(Lcom/geetest/gtc4/g;)V
    .locals 3

    .line 6
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    if-eqz p1, :cond_2

    .line 7
    iget v0, p1, Lcom/geetest/gtc4/g;->b:I

    if-nez v0, :cond_0

    .line 8
    sget-object p1, Lcom/geetest/gtc4/g;->d:[Lcom/geetest/gtc4/f;

    goto :goto_0

    .line 9
    :cond_0
    iget-object v1, p1, Lcom/geetest/gtc4/g;->a:[Lcom/geetest/gtc4/f;

    array-length v2, v1

    if-ne v2, v0, :cond_1

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p1, Lcom/geetest/gtc4/g;->c:Z

    move-object p1, v1

    goto :goto_0

    .line 11
    :cond_1
    new-array p1, v0, [Lcom/geetest/gtc4/f;

    const/4 v2, 0x0

    .line 12
    invoke-static {v1, v2, p1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    :goto_0
    iput-object p1, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    return-void

    .line 14
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "\'elementVector\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lcom/geetest/gtc4/w;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 4
    new-array v0, v0, [Lcom/geetest/gtc4/f;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iput-object v0, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "\'element\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>([Lcom/geetest/gtc4/f;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/geetest/gtc4/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final a(Lcom/geetest/gtc4/w;)Z
    .locals 5

    .line 2
    instance-of v0, p1, Lcom/geetest/gtc4/z;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 3
    :cond_0
    check-cast p1, Lcom/geetest/gtc4/z;

    .line 4
    invoke-virtual {p0}, Lcom/geetest/gtc4/z;->k()I

    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/geetest/gtc4/z;->k()I

    move-result v2

    if-eq v2, v0, :cond_1

    return v1

    :cond_1
    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_3

    .line 6
    iget-object v3, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    aget-object v3, v3, v2

    invoke-interface {v3}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v3

    .line 7
    iget-object v4, p1, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    aget-object v4, v4, v2

    invoke-interface {v4}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v4

    if-eq v3, v4, :cond_2

    .line 8
    invoke-virtual {v3, v4}, Lcom/geetest/gtc4/w;->a(Lcom/geetest/gtc4/w;)Z

    move-result v3

    if-nez v3, :cond_2

    return v1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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

.method public g()Lcom/geetest/gtc4/w;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/m2;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/m2;-><init>([Lcom/geetest/gtc4/f;)V

    .line 8
    return-object v0
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

.method public h()Lcom/geetest/gtc4/w;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/z2;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/z2;-><init>([Lcom/geetest/gtc4/f;)V

    .line 8
    return-object v0
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

.method public hashCode()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    .line 3
    array-length v0, v0

    .line 4
    .line 5
    add-int/lit8 v1, v0, 0x1

    .line 6
    .line 7
    :goto_0
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    mul-int/lit16 v1, v1, 0x101

    .line 12
    .line 13
    iget-object v2, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    .line 14
    .line 15
    aget-object v2, v2, v0

    .line 16
    .line 17
    .line 18
    invoke-interface {v2}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/geetest/gtc4/w;->hashCode()I

    .line 23
    move-result v2

    .line 24
    xor-int/2addr v1, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return v1
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

.method public final i()[Lcom/geetest/gtc4/b;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/geetest/gtc4/z;->k()I

    .line 4
    move-result v0

    .line 5
    .line 6
    new-array v1, v0, [Lcom/geetest/gtc4/b;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    :goto_0
    if-ge v2, v0, :cond_3

    .line 10
    .line 11
    iget-object v3, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    .line 12
    .line 13
    aget-object v3, v3, v2

    .line 14
    .line 15
    if-eqz v3, :cond_2

    .line 16
    .line 17
    instance-of v4, v3, Lcom/geetest/gtc4/b;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-interface {v3}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    instance-of v5, v4, Lcom/geetest/gtc4/b;

    .line 27
    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    check-cast v4, Lcom/geetest/gtc4/b;

    .line 31
    goto :goto_2

    .line 32
    .line 33
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    const-string v2, "illegal object in getInstance: "

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    throw v0

    .line 52
    :cond_2
    :goto_1
    move-object v4, v3

    .line 53
    .line 54
    check-cast v4, Lcom/geetest/gtc4/b;

    .line 55
    .line 56
    :goto_2
    aput-object v4, v1, v2

    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    return-object v1
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

.method public iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/n0;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/geetest/gtc4/n0;-><init>([Ljava/lang/Object;)V

    .line 8
    return-object v0
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

.method public final j()[Lcom/geetest/gtc4/s;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/geetest/gtc4/z;->k()I

    .line 4
    move-result v0

    .line 5
    .line 6
    new-array v1, v0, [Lcom/geetest/gtc4/s;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    :goto_0
    if-ge v2, v0, :cond_3

    .line 10
    .line 11
    iget-object v3, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    .line 12
    .line 13
    aget-object v3, v3, v2

    .line 14
    .line 15
    if-eqz v3, :cond_2

    .line 16
    .line 17
    instance-of v4, v3, Lcom/geetest/gtc4/s;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-interface {v3}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    instance-of v5, v4, Lcom/geetest/gtc4/s;

    .line 27
    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    check-cast v4, Lcom/geetest/gtc4/s;

    .line 31
    goto :goto_2

    .line 32
    .line 33
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    const-string v2, "illegal object in getInstance: "

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    throw v0

    .line 52
    :cond_2
    :goto_1
    move-object v4, v3

    .line 53
    .line 54
    check-cast v4, Lcom/geetest/gtc4/s;

    .line 55
    .line 56
    :goto_2
    aput-object v4, v1, v2

    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    return-object v1
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

.method public k()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    .line 3
    array-length v0, v0

    .line 4
    return v0
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

.method public abstract l()Lcom/geetest/gtc4/b;
.end method

.method public abstract m()Lcom/geetest/gtc4/s;
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/geetest/gtc4/z;->k()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "[]"

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    .line 12
    .line 13
    const-string v2, "["

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    :goto_0
    iget-object v3, p0, Lcom/geetest/gtc4/z;->a:[Lcom/geetest/gtc4/f;

    .line 20
    .line 21
    aget-object v3, v3, v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    if-lt v2, v0, :cond_1

    .line 29
    .line 30
    const/16 v0, 0x5d

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    .line 40
    :cond_1
    const-string v3, ", "

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 44
    goto :goto_0
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
