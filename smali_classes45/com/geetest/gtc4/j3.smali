.class public final Lcom/geetest/gtc4/j3;
.super Lcom/geetest/gtc4/h7;
.source "SourceFile"


# instance fields
.field public final e:D


# direct methods
.method public constructor <init>(D)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/geetest/gtc4/k7;->IEEE_754_DOUBLE_PRECISION_FLOAT:Lcom/geetest/gtc4/k7;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/geetest/gtc4/h7;-><init>(Lcom/geetest/gtc4/k7;)V

    .line 6
    .line 7
    iput-wide p1, p0, Lcom/geetest/gtc4/j3;->e:D

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    .line 2
    instance-of v0, p1, Lcom/geetest/gtc4/j3;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    move-object v0, p1

    .line 7
    .line 8
    check-cast v0, Lcom/geetest/gtc4/j3;

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Lcom/geetest/gtc4/h7;->equals(Ljava/lang/Object;)Z

    .line 12
    move-result p1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-wide v2, p0, Lcom/geetest/gtc4/j3;->e:D

    .line 17
    .line 18
    iget-wide v4, v0, Lcom/geetest/gtc4/j3;->e:D

    .line 19
    .line 20
    cmpl-double p1, v2, v4

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    return v1
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

.method public final hashCode()I
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/geetest/gtc4/h7;->hashCode()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget-wide v1, p0, Lcom/geetest/gtc4/j3;->e:D

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    move-result v1

    .line 15
    xor-int/2addr v0, v1

    .line 16
    return v0
    .line 17
    .line 18
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/geetest/gtc4/j3;->e:D

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

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
