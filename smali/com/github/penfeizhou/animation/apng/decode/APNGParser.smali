.class public Lcom/github/penfeizhou/animation/apng/decode/APNGParser;
.super Ljava/lang/Object;
.source "APNGParser.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/penfeizhou/animation/apng/decode/APNGParser$FormatException;
    }
.end annotation


# direct methods
.method public static a(Lcom/github/penfeizhou/animation/io/Reader;)Z
    .locals 1

    .line 1
    .line 2
    instance-of v0, p0, Lb8/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, Lb8/a;

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    new-instance v0, Lb8/a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0}, Lb8/a;-><init>(Lcom/github/penfeizhou/animation/io/Reader;)V

    .line 13
    move-object p0, v0

    .line 14
    .line 15
    .line 16
    :goto_0
    :try_start_0
    const-string/jumbo v0, "\u0089PNG"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lb8/a;->a(Ljava/lang/String;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    const-string v0, "\r\n\u001a\n"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lb8/a;->a(Ljava/lang/String;)Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->available()I

    .line 34
    move-result v0

    .line 35
    .line 36
    if-lez v0, :cond_3

    .line 37
    .line 38
    .line 39
    invoke-static {p0}, Lcom/github/penfeizhou/animation/apng/decode/APNGParser;->c(Lb8/a;)La8/d;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    instance-of v0, v0, La8/a;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    .line 48
    :cond_2
    new-instance p0, Lcom/github/penfeizhou/animation/apng/decode/APNGParser$FormatException;

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/apng/decode/APNGParser$FormatException;-><init>()V

    .line 52
    throw p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    :catch_0
    move-exception p0

    .line 54
    .line 55
    instance-of v0, p0, Lcom/github/penfeizhou/animation/apng/decode/APNGParser$FormatException;

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 61
    :cond_3
    const/4 p0, 0x0

    .line 62
    return p0
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
.end method

.method public static b(Lb8/a;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb8/a;",
            ")",
            "Ljava/util/List<",
            "La8/d;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "\u0089PNG"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lb8/a;->a(Ljava/lang/String;)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const-string v0, "\r\n\u001a\n"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lb8/a;->a(Ljava/lang/String;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->available()I

    .line 26
    move-result v1

    .line 27
    .line 28
    if-lez v1, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Lcom/github/penfeizhou/animation/apng/decode/APNGParser;->c(Lb8/a;)La8/d;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-object v0

    .line 38
    .line 39
    :cond_1
    new-instance p0, Lcom/github/penfeizhou/animation/apng/decode/APNGParser$FormatException;

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lcom/github/penfeizhou/animation/apng/decode/APNGParser$FormatException;-><init>()V

    .line 43
    throw p0
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public static c(Lb8/a;)La8/d;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->position()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lb8/a;->c()I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lb8/a;->b()I

    .line 12
    move-result v2

    .line 13
    .line 14
    sget v3, La8/a;->g:I

    .line 15
    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    new-instance v3, La8/a;

    .line 19
    .line 20
    .line 21
    invoke-direct {v3}, La8/a;-><init>()V

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    sget v3, La8/e;->n:I

    .line 25
    .line 26
    if-ne v2, v3, :cond_1

    .line 27
    .line 28
    new-instance v3, La8/e;

    .line 29
    .line 30
    .line 31
    invoke-direct {v3}, La8/e;-><init>()V

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_1
    sget v3, La8/f;->f:I

    .line 35
    .line 36
    if-ne v2, v3, :cond_2

    .line 37
    .line 38
    new-instance v3, La8/f;

    .line 39
    .line 40
    .line 41
    invoke-direct {v3}, La8/f;-><init>()V

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_2
    sget v3, La8/g;->e:I

    .line 45
    .line 46
    if-ne v2, v3, :cond_3

    .line 47
    .line 48
    new-instance v3, La8/g;

    .line 49
    .line 50
    .line 51
    invoke-direct {v3}, La8/g;-><init>()V

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_3
    sget v3, La8/h;->e:I

    .line 55
    .line 56
    if-ne v2, v3, :cond_4

    .line 57
    .line 58
    new-instance v3, La8/h;

    .line 59
    .line 60
    .line 61
    invoke-direct {v3}, La8/h;-><init>()V

    .line 62
    goto :goto_0

    .line 63
    .line 64
    :cond_4
    sget v3, La8/i;->h:I

    .line 65
    .line 66
    if-ne v2, v3, :cond_5

    .line 67
    .line 68
    new-instance v3, La8/i;

    .line 69
    .line 70
    .line 71
    invoke-direct {v3}, La8/i;-><init>()V

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :cond_5
    new-instance v3, La8/d;

    .line 75
    .line 76
    .line 77
    invoke-direct {v3}, La8/d;-><init>()V

    .line 78
    .line 79
    :goto_0
    iput v0, v3, La8/d;->d:I

    .line 80
    .line 81
    iput v2, v3, La8/d;->b:I

    .line 82
    .line 83
    iput v1, v3, La8/d;->a:I

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, p0}, La8/d;->c(Lb8/a;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lb8/a;->c()I

    .line 90
    move-result p0

    .line 91
    .line 92
    iput p0, v3, La8/d;->c:I

    .line 93
    return-object v3
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
