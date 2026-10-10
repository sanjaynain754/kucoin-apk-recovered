.class public final Lcom/geetest/gtc4/e0;
.super Lcom/geetest/gtc4/w;
.source "SourceFile"


# instance fields
.field public final a:[B


# direct methods
.method public constructor <init>([B)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 4
    array-length v0, p1

    .line 5
    const/4 v1, 0x2

    .line 6
    .line 7
    if-lt v0, v1, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, Lcom/geetest/gtc4/e0;->a:[B

    .line 10
    array-length v0, p1

    .line 11
    .line 12
    if-lez v0, :cond_0

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    aget-byte v0, p1, v0

    .line 16
    .line 17
    const/16 v1, 0x30

    .line 18
    .line 19
    if-lt v0, v1, :cond_0

    .line 20
    .line 21
    const/16 v2, 0x39

    .line 22
    .line 23
    if-gt v0, v2, :cond_0

    .line 24
    array-length v0, p1

    .line 25
    const/4 v3, 0x1

    .line 26
    .line 27
    if-le v0, v3, :cond_0

    .line 28
    .line 29
    aget-byte p1, p1, v3

    .line 30
    .line 31
    if-lt p1, v1, :cond_0

    .line 32
    .line 33
    if-gt p1, v2, :cond_0

    .line 34
    return-void

    .line 35
    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    const-string v0, "illegal characters in UTCTime string"

    .line 39
    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    throw p1

    .line 43
    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    const-string v0, "UTCTime string too short"

    .line 47
    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    throw p1
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


# virtual methods
.method public final a(Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/geetest/gtc4/e0;->a:[B

    array-length v0, v0

    .line 2
    invoke-static {v0, p1, v0}, Lcom/geetest/gtc4/d;->a(III)I

    move-result p1

    return p1
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/geetest/gtc4/e0;->a:[B

    const/16 v1, 0x17

    invoke-virtual {p1, p2, v1, v0}, Lcom/geetest/gtc4/u;->a(ZI[B)V

    return-void
.end method

.method public final a(Lcom/geetest/gtc4/w;)Z
    .locals 1

    .line 4
    instance-of v0, p1, Lcom/geetest/gtc4/e0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/geetest/gtc4/e0;->a:[B

    check-cast p1, Lcom/geetest/gtc4/e0;

    iget-object p1, p1, Lcom/geetest/gtc4/e0;->a:[B

    .line 6
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

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

.method public final hashCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/e0;->a:[B

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/geetest/gtc4/o0;->b([B)I

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

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/e0;->a:[B

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/geetest/gtc4/n7;->a([B)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
