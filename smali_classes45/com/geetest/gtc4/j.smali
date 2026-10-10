.class public abstract Lcom/geetest/gtc4/j;
.super Lcom/geetest/gtc4/w;
.source "SourceFile"


# instance fields
.field public final a:Lcom/geetest/gtc4/q;

.field public final b:Lcom/geetest/gtc4/n;

.field public final c:Lcom/geetest/gtc4/w;

.field public final d:I

.field public final e:Lcom/geetest/gtc4/w;


# direct methods
.method public constructor <init>(Lcom/geetest/gtc4/q;Lcom/geetest/gtc4/n;Lcom/geetest/gtc4/w;ILcom/geetest/gtc4/w;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/geetest/gtc4/j;->a:Lcom/geetest/gtc4/q;

    .line 48
    iput-object p2, p0, Lcom/geetest/gtc4/j;->b:Lcom/geetest/gtc4/n;

    .line 49
    iput-object p3, p0, Lcom/geetest/gtc4/j;->c:Lcom/geetest/gtc4/w;

    if-ltz p4, :cond_4

    const/4 p1, 0x2

    if-gt p4, p1, :cond_4

    .line 50
    iput p4, p0, Lcom/geetest/gtc4/j;->d:I

    const/4 p2, 0x1

    const-string/jumbo p3, "unexpected object: "

    if-eq p4, p2, :cond_2

    if-eq p4, p1, :cond_0

    goto :goto_0

    .line 51
    :cond_0
    const-class p1, Lcom/geetest/gtc4/b;

    invoke-virtual {p1, p5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 54
    :cond_2
    const-class p1, Lcom/geetest/gtc4/s;

    invoke-virtual {p1, p5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 55
    :goto_0
    iput-object p5, p0, Lcom/geetest/gtc4/j;->e:Lcom/geetest/gtc4/w;

    return-void

    .line 56
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 58
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "invalid encoding value: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lcom/geetest/gtc4/z;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/geetest/gtc4/z;->k()I

    move-result v0

    const-string/jumbo v1, "too few objects in input sequence"

    if-lez v0, :cond_12

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Lcom/geetest/gtc4/z;->a(I)Lcom/geetest/gtc4/f;

    move-result-object v2

    invoke-interface {v2}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v2

    .line 4
    instance-of v3, v2, Lcom/geetest/gtc4/q;

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    .line 5
    check-cast v2, Lcom/geetest/gtc4/q;

    iput-object v2, p0, Lcom/geetest/gtc4/j;->a:Lcom/geetest/gtc4/q;

    .line 6
    invoke-virtual {p1}, Lcom/geetest/gtc4/z;->k()I

    move-result v0

    if-le v0, v4, :cond_0

    .line 7
    invoke-virtual {p1, v4}, Lcom/geetest/gtc4/z;->a(I)Lcom/geetest/gtc4/f;

    move-result-object v0

    invoke-interface {v0}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v2

    move v0, v4

    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 9
    :cond_1
    :goto_0
    instance-of v3, v2, Lcom/geetest/gtc4/n;

    if-eqz v3, :cond_3

    .line 10
    check-cast v2, Lcom/geetest/gtc4/n;

    iput-object v2, p0, Lcom/geetest/gtc4/j;->b:Lcom/geetest/gtc4/n;

    add-int/lit8 v0, v0, 0x1

    .line 11
    invoke-virtual {p1}, Lcom/geetest/gtc4/z;->k()I

    move-result v2

    if-le v2, v0, :cond_2

    .line 12
    invoke-virtual {p1, v0}, Lcom/geetest/gtc4/z;->a(I)Lcom/geetest/gtc4/f;

    move-result-object v2

    invoke-interface {v2}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v2

    goto :goto_1

    .line 13
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_3
    :goto_1
    instance-of v3, v2, Lcom/geetest/gtc4/d0;

    if-nez v3, :cond_5

    .line 15
    iput-object v2, p0, Lcom/geetest/gtc4/j;->c:Lcom/geetest/gtc4/w;

    add-int/lit8 v0, v0, 0x1

    .line 16
    invoke-virtual {p1}, Lcom/geetest/gtc4/z;->k()I

    move-result v2

    if-le v2, v0, :cond_4

    .line 17
    invoke-virtual {p1, v0}, Lcom/geetest/gtc4/z;->a(I)Lcom/geetest/gtc4/f;

    move-result-object v1

    invoke-interface {v1}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v2

    goto :goto_2

    .line 18
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :cond_5
    :goto_2
    invoke-virtual {p1}, Lcom/geetest/gtc4/z;->k()I

    move-result p1

    add-int/2addr v0, v4

    if-ne p1, v0, :cond_11

    .line 20
    instance-of p1, v2, Lcom/geetest/gtc4/d0;

    if-eqz p1, :cond_10

    .line 21
    check-cast v2, Lcom/geetest/gtc4/d0;

    .line 22
    iget p1, v2, Lcom/geetest/gtc4/d0;->c:I

    if-ltz p1, :cond_f

    const/4 v0, 0x2

    if-gt p1, v0, :cond_f

    .line 23
    iput p1, p0, Lcom/geetest/gtc4/j;->d:I

    .line 24
    iget v1, v2, Lcom/geetest/gtc4/d0;->b:I

    const/16 v3, 0x80

    if-ne v1, v3, :cond_b

    if-eqz p1, :cond_8

    if-eq p1, v4, :cond_7

    if-ne p1, v0, :cond_6

    .line 25
    sget-object p1, Lcom/geetest/gtc4/b;->b:Lcom/geetest/gtc4/a;

    invoke-virtual {p1, v2}, Lcom/geetest/gtc4/f0;->a(Lcom/geetest/gtc4/d0;)Lcom/geetest/gtc4/w;

    move-result-object p1

    check-cast p1, Lcom/geetest/gtc4/b;

    goto :goto_4

    .line 26
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "invalid tag: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    iget v1, v2, Lcom/geetest/gtc4/d0;->b:I

    .line 28
    iget v2, v2, Lcom/geetest/gtc4/d0;->c:I

    .line 29
    invoke-static {v1, v2}, Lcom/geetest/gtc4/g0;->a(II)Ljava/lang/String;

    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 31
    :cond_7
    sget-object p1, Lcom/geetest/gtc4/s;->b:Lcom/geetest/gtc4/r;

    invoke-virtual {p1, v2}, Lcom/geetest/gtc4/f0;->a(Lcom/geetest/gtc4/d0;)Lcom/geetest/gtc4/w;

    move-result-object p1

    check-cast p1, Lcom/geetest/gtc4/s;

    goto :goto_4

    .line 32
    :cond_8
    invoke-virtual {v2}, Lcom/geetest/gtc4/d0;->i()Z

    move-result p1

    if-eqz p1, :cond_a

    .line 33
    iget-object p1, v2, Lcom/geetest/gtc4/d0;->d:Lcom/geetest/gtc4/f;

    instance-of v0, p1, Lcom/geetest/gtc4/w;

    if-eqz v0, :cond_9

    check-cast p1, Lcom/geetest/gtc4/w;

    goto :goto_3

    :cond_9
    invoke-interface {p1}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object p1

    .line 34
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    :goto_4
    iput-object p1, p0, Lcom/geetest/gtc4/j;->e:Lcom/geetest/gtc4/w;

    return-void

    .line 36
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "object implicit - explicit expected."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    const/16 p1, 0x40

    if-eq v1, p1, :cond_e

    if-eq v1, v3, :cond_d

    const/16 p1, 0xc0

    if-eq v1, p1, :cond_c

    .line 37
    const-string p1, "UNIVERSAL"

    goto :goto_5

    .line 38
    :cond_c
    const-string p1, "PRIVATE"

    goto :goto_5

    .line 39
    :cond_d
    const-string p1, "CONTEXT"

    goto :goto_5

    .line 40
    :cond_e
    const-string p1, "APPLICATION"

    .line 41
    :goto_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected CONTEXT tag but found "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 42
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid encoding value: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 43
    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No tagged object found in sequence. Structure doesn\'t seem to be of type External"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 44
    :cond_11
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "input sequence too large"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 45
    :cond_12
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/geetest/gtc4/j;->i()Lcom/geetest/gtc4/z;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/geetest/gtc4/w;->a(Z)I

    move-result p1

    return p1
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 1

    const/16 v0, 0x28

    .line 2
    invoke-virtual {p1, p2, v0}, Lcom/geetest/gtc4/u;->a(ZI)V

    .line 3
    invoke-virtual {p0}, Lcom/geetest/gtc4/j;->i()Lcom/geetest/gtc4/z;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/geetest/gtc4/w;->a(Lcom/geetest/gtc4/u;Z)V

    return-void
.end method

.method public final a(Lcom/geetest/gtc4/w;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 4
    :cond_0
    instance-of v1, p1, Lcom/geetest/gtc4/j;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 5
    :cond_1
    check-cast p1, Lcom/geetest/gtc4/j;

    .line 6
    iget-object v1, p0, Lcom/geetest/gtc4/j;->a:Lcom/geetest/gtc4/q;

    iget-object v3, p1, Lcom/geetest/gtc4/j;->a:Lcom/geetest/gtc4/q;

    if-eq v1, v3, :cond_2

    if-eqz v1, :cond_5

    if-eqz v3, :cond_5

    .line 7
    invoke-virtual {v1, v3}, Lcom/geetest/gtc4/w;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 8
    :cond_2
    iget-object v1, p0, Lcom/geetest/gtc4/j;->b:Lcom/geetest/gtc4/n;

    iget-object v3, p1, Lcom/geetest/gtc4/j;->b:Lcom/geetest/gtc4/n;

    if-eq v1, v3, :cond_3

    if-eqz v1, :cond_5

    if-eqz v3, :cond_5

    .line 9
    invoke-virtual {v1, v3}, Lcom/geetest/gtc4/w;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 10
    :cond_3
    iget-object v1, p0, Lcom/geetest/gtc4/j;->c:Lcom/geetest/gtc4/w;

    iget-object v3, p1, Lcom/geetest/gtc4/j;->c:Lcom/geetest/gtc4/w;

    if-eq v1, v3, :cond_4

    if-eqz v1, :cond_5

    if-eqz v3, :cond_5

    .line 11
    invoke-virtual {v1, v3}, Lcom/geetest/gtc4/w;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 12
    :cond_4
    iget v1, p0, Lcom/geetest/gtc4/j;->d:I

    iget v3, p1, Lcom/geetest/gtc4/j;->d:I

    if-ne v1, v3, :cond_5

    iget-object v1, p0, Lcom/geetest/gtc4/j;->e:Lcom/geetest/gtc4/w;

    iget-object p1, p1, Lcom/geetest/gtc4/j;->e:Lcom/geetest/gtc4/w;

    .line 13
    invoke-virtual {v1, p1}, Lcom/geetest/gtc4/w;->b(Lcom/geetest/gtc4/w;)Z

    move-result p1

    if-eqz p1, :cond_5

    return v0

    :cond_5
    return v2
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
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/geetest/gtc4/a2;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/geetest/gtc4/j;->a:Lcom/geetest/gtc4/q;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/geetest/gtc4/j;->b:Lcom/geetest/gtc4/n;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/geetest/gtc4/j;->c:Lcom/geetest/gtc4/w;

    .line 9
    .line 10
    iget v4, p0, Lcom/geetest/gtc4/j;->d:I

    .line 11
    .line 12
    iget-object v5, p0, Lcom/geetest/gtc4/j;->e:Lcom/geetest/gtc4/w;

    .line 13
    .line 14
    .line 15
    invoke-direct/range {v0 .. v5}, Lcom/geetest/gtc4/a2;-><init>(Lcom/geetest/gtc4/q;Lcom/geetest/gtc4/n;Lcom/geetest/gtc4/w;ILcom/geetest/gtc4/w;)V

    .line 16
    return-object v0
    .line 17
    .line 18
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/j;->a:Lcom/geetest/gtc4/q;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/geetest/gtc4/q;->hashCode()I

    .line 11
    move-result v0

    .line 12
    .line 13
    :goto_0
    iget-object v2, p0, Lcom/geetest/gtc4/j;->b:Lcom/geetest/gtc4/n;

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    move v2, v1

    .line 17
    goto :goto_1

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {v2}, Lcom/geetest/gtc4/n;->hashCode()I

    .line 21
    move-result v2

    .line 22
    :goto_1
    xor-int/2addr v0, v2

    .line 23
    .line 24
    iget-object v2, p0, Lcom/geetest/gtc4/j;->c:Lcom/geetest/gtc4/w;

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    goto :goto_2

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-virtual {v2}, Lcom/geetest/gtc4/w;->hashCode()I

    .line 31
    move-result v1

    .line 32
    :goto_2
    xor-int/2addr v0, v1

    .line 33
    .line 34
    iget v1, p0, Lcom/geetest/gtc4/j;->d:I

    .line 35
    xor-int/2addr v0, v1

    .line 36
    .line 37
    iget-object v1, p0, Lcom/geetest/gtc4/j;->e:Lcom/geetest/gtc4/w;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/geetest/gtc4/w;->hashCode()I

    .line 41
    move-result v1

    .line 42
    xor-int/2addr v0, v1

    .line 43
    return v0
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

.method public abstract i()Lcom/geetest/gtc4/z;
.end method
