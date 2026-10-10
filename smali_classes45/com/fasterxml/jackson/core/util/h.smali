.class public Lcom/fasterxml/jackson/core/util/h;
.super Lcom/fasterxml/jackson/core/util/g;
.source "JsonParserSequence.java"


# instance fields
.field public final f:[Lcom/fasterxml/jackson/core/JsonParser;

.field public final g:Z

.field public h:I

.field public i:Z


# direct methods
.method public constructor <init>(Z[Lcom/fasterxml/jackson/core/JsonParser;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    aget-object v1, p2, v0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/core/util/g;-><init>(Lcom/fasterxml/jackson/core/JsonParser;)V

    .line 7
    .line 8
    iput-boolean p1, p0, Lcom/fasterxml/jackson/core/util/h;->g:Z

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->i0()Z

    .line 17
    move-result p1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    move v0, v1

    .line 21
    .line 22
    :cond_0
    iput-boolean v0, p0, Lcom/fasterxml/jackson/core/util/h;->i:Z

    .line 23
    .line 24
    iput-object p2, p0, Lcom/fasterxml/jackson/core/util/h;->f:[Lcom/fasterxml/jackson/core/JsonParser;

    .line 25
    .line 26
    iput v1, p0, Lcom/fasterxml/jackson/core/util/h;->h:I

    .line 27
    return-void
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

.method public static E0(ZLcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/util/h;
    .locals 2

    .line 1
    .line 2
    instance-of v0, p1, Lcom/fasterxml/jackson/core/util/h;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    instance-of v1, p2, Lcom/fasterxml/jackson/core/util/h;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/fasterxml/jackson/core/util/h;

    .line 11
    .line 12
    .line 13
    filled-new-array {p1, p2}, [Lcom/fasterxml/jackson/core/JsonParser;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Lcom/fasterxml/jackson/core/util/h;-><init>(Z[Lcom/fasterxml/jackson/core/JsonParser;)V

    .line 18
    return-object v0

    .line 19
    .line 20
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    check-cast p1, Lcom/fasterxml/jackson/core/util/h;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/util/h;->D0(Ljava/util/List;)V

    .line 31
    goto :goto_0

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    :goto_0
    instance-of p1, p2, Lcom/fasterxml/jackson/core/util/h;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    check-cast p2, Lcom/fasterxml/jackson/core/util/h;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v1}, Lcom/fasterxml/jackson/core/util/h;->D0(Ljava/util/List;)V

    .line 44
    goto :goto_1

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    :goto_1
    new-instance p1, Lcom/fasterxml/jackson/core/util/h;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 53
    move-result p2

    .line 54
    .line 55
    new-array p2, p2, [Lcom/fasterxml/jackson/core/JsonParser;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 59
    move-result-object p2

    .line 60
    .line 61
    check-cast p2, [Lcom/fasterxml/jackson/core/JsonParser;

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, p0, p2}, Lcom/fasterxml/jackson/core/util/h;-><init>(Z[Lcom/fasterxml/jackson/core/JsonParser;)V

    .line 65
    return-object p1
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
.method public C0()Lcom/fasterxml/jackson/core/JsonParser;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->k()Lcom/fasterxml/jackson/core/JsonToken;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->k()Lcom/fasterxml/jackson/core/JsonToken;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 19
    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 v0, 0x1

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/util/h;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    goto :goto_1

    .line 30
    .line 31
    .line 32
    :cond_2
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonToken;->isStructStart()Z

    .line 33
    move-result v2

    .line 34
    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    goto :goto_0

    .line 39
    .line 40
    .line 41
    :cond_3
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonToken;->isStructEnd()Z

    .line 42
    move-result v1

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    add-int/lit8 v0, v0, -0x1

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    :goto_1
    return-object p0
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

.method public D0(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/util/h;->h:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    iget-object v1, p0, Lcom/fasterxml/jackson/core/util/h;->f:[Lcom/fasterxml/jackson/core/JsonParser;

    .line 7
    array-length v1, v1

    .line 8
    .line 9
    :goto_0
    if-ge v0, v1, :cond_1

    .line 10
    .line 11
    iget-object v2, p0, Lcom/fasterxml/jackson/core/util/h;->f:[Lcom/fasterxml/jackson/core/JsonParser;

    .line 12
    .line 13
    aget-object v2, v2, v0

    .line 14
    .line 15
    instance-of v3, v2, Lcom/fasterxml/jackson/core/util/h;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    check-cast v2, Lcom/fasterxml/jackson/core/util/h;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, p1}, Lcom/fasterxml/jackson/core/util/h;->D0(Ljava/util/List;)V

    .line 23
    goto :goto_1

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
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

.method public F0()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :cond_0
    iget v0, p0, Lcom/fasterxml/jackson/core/util/h;->h:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/fasterxml/jackson/core/util/h;->f:[Lcom/fasterxml/jackson/core/JsonParser;

    .line 5
    array-length v2, v1

    .line 6
    .line 7
    if-ge v0, v2, :cond_2

    .line 8
    .line 9
    add-int/lit8 v2, v0, 0x1

    .line 10
    .line 11
    iput v2, p0, Lcom/fasterxml/jackson/core/util/h;->h:I

    .line 12
    .line 13
    aget-object v0, v1, v0

    .line 14
    .line 15
    iput-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 16
    .line 17
    iget-boolean v1, p0, Lcom/fasterxml/jackson/core/util/h;->g:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->i0()Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->x()Lcom/fasterxml/jackson/core/JsonToken;

    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    return-object v0

    .line 42
    :cond_2
    const/4 v0, 0x0

    .line 43
    return-object v0
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

.method public G0()Z
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/util/h;->h:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/fasterxml/jackson/core/util/h;->f:[Lcom/fasterxml/jackson/core/JsonParser;

    .line 5
    array-length v2, v1

    .line 6
    .line 7
    if-ge v0, v2, :cond_0

    .line 8
    .line 9
    add-int/lit8 v2, v0, 0x1

    .line 10
    .line 11
    iput v2, p0, Lcom/fasterxml/jackson/core/util/h;->h:I

    .line 12
    .line 13
    aget-object v0, v1, v0

    .line 14
    .line 15
    iput-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0
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
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->close()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/util/h;->G0()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public t0()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/g;->e:Lcom/fasterxml/jackson/core/JsonParser;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    .line 8
    :cond_0
    iget-boolean v1, p0, Lcom/fasterxml/jackson/core/util/h;->i:Z

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    iput-boolean v1, p0, Lcom/fasterxml/jackson/core/util/h;->i:Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->k()Lcom/fasterxml/jackson/core/JsonToken;

    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/util/h;->F0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 28
    move-result-object v0

    .line 29
    :cond_2
    return-object v0
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
