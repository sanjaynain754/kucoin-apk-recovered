.class public Ln8/b;
.super Lcom/github/penfeizhou/animation/io/b;
.source "WebPWriter.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/io/b;-><init>()V

    .line 4
    return-void
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
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public g(I)V
    .locals 0

    .line 1
    .line 2
    add-int/lit8 p1, p1, -0x1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ln8/b;->i(I)V

    .line 6
    return-void
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
.end method

.method public h(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 19
    move-result v0

    .line 20
    .line 21
    and-int/lit16 v0, v0, 0xff

    .line 22
    int-to-byte v0, v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/io/b;->b(B)V

    .line 26
    const/4 v0, 0x1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 30
    move-result v0

    .line 31
    .line 32
    and-int/lit16 v0, v0, 0xff

    .line 33
    int-to-byte v0, v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/io/b;->b(B)V

    .line 37
    const/4 v0, 0x2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 41
    move-result v0

    .line 42
    .line 43
    and-int/lit16 v0, v0, 0xff

    .line 44
    int-to-byte v0, v0

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/io/b;->b(B)V

    .line 48
    const/4 v0, 0x3

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 52
    move-result p1

    .line 53
    .line 54
    and-int/lit16 p1, p1, 0xff

    .line 55
    int-to-byte p1, p1

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lcom/github/penfeizhou/animation/io/b;->b(B)V

    .line 59
    return-void

    .line 60
    .line 61
    .line 62
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Lcom/github/penfeizhou/animation/io/b;->e(I)V

    .line 63
    return-void
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
.end method

.method public i(I)V
    .locals 1

    .line 1
    .line 2
    and-int/lit16 v0, p1, 0xff

    .line 3
    int-to-byte v0, v0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/io/b;->b(B)V

    .line 7
    .line 8
    shr-int/lit8 v0, p1, 0x8

    .line 9
    .line 10
    and-int/lit16 v0, v0, 0xff

    .line 11
    int-to-byte v0, v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/io/b;->b(B)V

    .line 15
    .line 16
    shr-int/lit8 p1, p1, 0x10

    .line 17
    .line 18
    and-int/lit16 p1, p1, 0xff

    .line 19
    int-to-byte p1, p1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/github/penfeizhou/animation/io/b;->b(B)V

    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public j(I)V
    .locals 1

    .line 1
    .line 2
    and-int/lit16 v0, p1, 0xff

    .line 3
    int-to-byte v0, v0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/io/b;->b(B)V

    .line 7
    .line 8
    shr-int/lit8 v0, p1, 0x8

    .line 9
    .line 10
    and-int/lit16 v0, v0, 0xff

    .line 11
    int-to-byte v0, v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/io/b;->b(B)V

    .line 15
    .line 16
    shr-int/lit8 v0, p1, 0x10

    .line 17
    .line 18
    and-int/lit16 v0, v0, 0xff

    .line 19
    int-to-byte v0, v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/io/b;->b(B)V

    .line 23
    .line 24
    shr-int/lit8 p1, p1, 0x18

    .line 25
    .line 26
    and-int/lit16 p1, p1, 0xff

    .line 27
    int-to-byte p1, p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lcom/github/penfeizhou/animation/io/b;->b(B)V

    .line 31
    return-void
.end method
