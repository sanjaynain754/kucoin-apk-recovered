.class public Lcom/fasterxml/jackson/databind/deser/e;
.super Ljava/lang/Object;
.source "DataFormatReaders.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/deser/e$b;,
        Lcom/fasterxml/jackson/databind/deser/e$a;
    }
.end annotation


# instance fields
.field public final a:[Lcom/fasterxml/jackson/databind/ObjectReader;

.field public final b:Lcom/fasterxml/jackson/core/format/MatchStrength;

.field public final c:Lcom/fasterxml/jackson/core/format/MatchStrength;

.field public final d:I


# direct methods
.method public varargs constructor <init>([Lcom/fasterxml/jackson/databind/ObjectReader;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->SOLID_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    sget-object v1, Lcom/fasterxml/jackson/core/format/MatchStrength;->WEAK_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    const/16 v2, 0x40

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/fasterxml/jackson/databind/deser/e;-><init>([Lcom/fasterxml/jackson/databind/ObjectReader;Lcom/fasterxml/jackson/core/format/MatchStrength;Lcom/fasterxml/jackson/core/format/MatchStrength;I)V

    return-void
.end method

.method public constructor <init>([Lcom/fasterxml/jackson/databind/ObjectReader;Lcom/fasterxml/jackson/core/format/MatchStrength;Lcom/fasterxml/jackson/core/format/MatchStrength;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/e;->a:[Lcom/fasterxml/jackson/databind/ObjectReader;

    .line 4
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/e;->b:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 5
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/deser/e;->c:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 6
    iput p4, p0, Lcom/fasterxml/jackson/databind/deser/e;->d:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/fasterxml/jackson/databind/deser/e$a;)Lcom/fasterxml/jackson/databind/deser/e$b;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/e;->a:[Lcom/fasterxml/jackson/databind/ObjectReader;

    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move v4, v3

    .line 7
    move-object v3, v2

    .line 8
    .line 9
    :goto_0
    if-ge v4, v1, :cond_4

    .line 10
    .line 11
    aget-object v5, v0, v4

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lh7/a$a;->b()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/ObjectReader;->getFactory()Lcom/fasterxml/jackson/core/JsonFactory;

    .line 18
    move-result-object v6

    .line 19
    .line 20
    .line 21
    invoke-virtual {v6, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->hasFormat(Lh7/a;)Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 22
    move-result-object v6

    .line 23
    .line 24
    if-eqz v6, :cond_3

    .line 25
    .line 26
    .line 27
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 28
    move-result v7

    .line 29
    .line 30
    iget-object v8, p0, Lcom/fasterxml/jackson/databind/deser/e;->c:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 34
    move-result v8

    .line 35
    .line 36
    if-ge v7, v8, :cond_0

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :cond_0
    if-eqz v2, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 43
    move-result v7

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 47
    move-result v8

    .line 48
    .line 49
    if-lt v7, v8, :cond_1

    .line 50
    goto :goto_1

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 54
    move-result v2

    .line 55
    .line 56
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/e;->b:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 60
    move-result v3

    .line 61
    .line 62
    if-lt v2, v3, :cond_2

    .line 63
    move-object v2, v5

    .line 64
    move-object v3, v6

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move-object v2, v5

    .line 67
    move-object v3, v6

    .line 68
    .line 69
    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 70
    goto :goto_0

    .line 71
    .line 72
    .line 73
    :cond_4
    :goto_2
    invoke-virtual {p1, v2, v3}, Lcom/fasterxml/jackson/databind/deser/e$a;->c(Lcom/fasterxml/jackson/databind/ObjectReader;Lcom/fasterxml/jackson/core/format/MatchStrength;)Lcom/fasterxml/jackson/databind/deser/e$b;

    .line 74
    move-result-object p1

    .line 75
    return-object p1
    .line 76
    .line 77
    .line 78
.end method

.method public b(Ljava/io/InputStream;)Lcom/fasterxml/jackson/databind/deser/e$b;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/e$a;

    .line 3
    .line 4
    iget v1, p0, Lcom/fasterxml/jackson/databind/deser/e;->d:I

    .line 5
    .line 6
    new-array v1, v1, [B

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Lcom/fasterxml/jackson/databind/deser/e$a;-><init>(Ljava/io/InputStream;[B)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/deser/e;->a(Lcom/fasterxml/jackson/databind/deser/e$a;)Lcom/fasterxml/jackson/databind/deser/e$b;

    .line 13
    move-result-object p1

    .line 14
    return-object p1
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

.method public c([BII)Lcom/fasterxml/jackson/databind/deser/e$b;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/e$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/e$a;-><init>([BII)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/deser/e;->a(Lcom/fasterxml/jackson/databind/deser/e$a;)Lcom/fasterxml/jackson/databind/deser/e$b;

    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method public d(Lcom/fasterxml/jackson/databind/DeserializationConfig;)Lcom/fasterxml/jackson/databind/deser/e;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/e;->a:[Lcom/fasterxml/jackson/databind/ObjectReader;

    .line 3
    array-length v0, v0

    .line 4
    .line 5
    new-array v1, v0, [Lcom/fasterxml/jackson/databind/ObjectReader;

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    :goto_0
    if-ge v2, v0, :cond_0

    .line 9
    .line 10
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/e;->a:[Lcom/fasterxml/jackson/databind/ObjectReader;

    .line 11
    .line 12
    aget-object v3, v3, v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->with(Lcom/fasterxml/jackson/databind/DeserializationConfig;)Lcom/fasterxml/jackson/databind/ObjectReader;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    aput-object v3, v1, v2

    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    new-instance p1, Lcom/fasterxml/jackson/databind/deser/e;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/e;->b:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/e;->c:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 28
    .line 29
    iget v3, p0, Lcom/fasterxml/jackson/databind/deser/e;->d:I

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, v1, v0, v2, v3}, Lcom/fasterxml/jackson/databind/deser/e;-><init>([Lcom/fasterxml/jackson/databind/ObjectReader;Lcom/fasterxml/jackson/core/format/MatchStrength;Lcom/fasterxml/jackson/core/format/MatchStrength;I)V

    .line 33
    return-object p1
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

.method public e(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/deser/e;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/e;->a:[Lcom/fasterxml/jackson/databind/ObjectReader;

    .line 3
    array-length v0, v0

    .line 4
    .line 5
    new-array v1, v0, [Lcom/fasterxml/jackson/databind/ObjectReader;

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    :goto_0
    if-ge v2, v0, :cond_0

    .line 9
    .line 10
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/e;->a:[Lcom/fasterxml/jackson/databind/ObjectReader;

    .line 11
    .line 12
    aget-object v3, v3, v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->forType(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/ObjectReader;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    aput-object v3, v1, v2

    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    new-instance p1, Lcom/fasterxml/jackson/databind/deser/e;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/e;->b:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/deser/e;->c:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 28
    .line 29
    iget v3, p0, Lcom/fasterxml/jackson/databind/deser/e;->d:I

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, v1, v0, v2, v3}, Lcom/fasterxml/jackson/databind/deser/e;-><init>([Lcom/fasterxml/jackson/databind/ObjectReader;Lcom/fasterxml/jackson/core/format/MatchStrength;Lcom/fasterxml/jackson/core/format/MatchStrength;I)V

    .line 33
    return-object p1
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

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const/16 v1, 0x5b

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/e;->a:[Lcom/fasterxml/jackson/databind/ObjectReader;

    .line 13
    array-length v2, v1

    .line 14
    .line 15
    if-lez v2, :cond_0

    .line 16
    const/4 v3, 0x0

    .line 17
    .line 18
    aget-object v1, v1, v3

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/ObjectReader;->getFactory()Lcom/fasterxml/jackson/core/JsonFactory;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonFactory;->getFormatName()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    const/4 v1, 0x1

    .line 31
    .line 32
    :goto_0
    if-ge v1, v2, :cond_0

    .line 33
    .line 34
    const-string v3, ", "

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/e;->a:[Lcom/fasterxml/jackson/databind/ObjectReader;

    .line 40
    .line 41
    aget-object v3, v3, v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/ObjectReader;->getFactory()Lcom/fasterxml/jackson/core/JsonFactory;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonFactory;->getFormatName()Ljava/lang/String;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x1

    .line 55
    goto :goto_0

    .line 56
    .line 57
    :cond_0
    const/16 v1, 0x5d

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    move-result-object v0

    .line 65
    return-object v0
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
