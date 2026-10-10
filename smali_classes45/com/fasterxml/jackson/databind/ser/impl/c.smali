.class public final Lcom/fasterxml/jackson/databind/ser/impl/c;
.super Ljava/lang/Object;
.source "ReadOnlyClassToSerializerMap.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/ser/impl/c$a;
    }
.end annotation


# instance fields
.field public final a:[Lcom/fasterxml/jackson/databind/ser/impl/c$a;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/fasterxml/jackson/databind/util/r;",
            "Lcom/fasterxml/jackson/databind/h<",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 7
    move-result v0

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/ser/impl/c;->a(I)I

    .line 11
    move-result v0

    .line 12
    .line 13
    iput v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/c;->b:I

    .line 14
    .line 15
    add-int/lit8 v1, v0, -0x1

    .line 16
    .line 17
    iput v1, p0, Lcom/fasterxml/jackson/databind/ser/impl/c;->c:I

    .line 18
    .line 19
    new-array v0, v0, [Lcom/fasterxml/jackson/databind/ser/impl/c$a;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    check-cast v1, Ljava/util/Map$Entry;

    .line 40
    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    check-cast v2, Lcom/fasterxml/jackson/databind/util/r;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/util/r;->hashCode()I

    .line 49
    move-result v3

    .line 50
    .line 51
    iget v4, p0, Lcom/fasterxml/jackson/databind/ser/impl/c;->c:I

    .line 52
    and-int/2addr v3, v4

    .line 53
    .line 54
    new-instance v4, Lcom/fasterxml/jackson/databind/ser/impl/c$a;

    .line 55
    .line 56
    aget-object v5, v0, v3

    .line 57
    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    check-cast v1, Lcom/fasterxml/jackson/databind/h;

    .line 63
    .line 64
    .line 65
    invoke-direct {v4, v5, v2, v1}, Lcom/fasterxml/jackson/databind/ser/impl/c$a;-><init>(Lcom/fasterxml/jackson/databind/ser/impl/c$a;Lcom/fasterxml/jackson/databind/util/r;Lcom/fasterxml/jackson/databind/h;)V

    .line 66
    .line 67
    aput-object v4, v0, v3

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_0
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/c;->a:[Lcom/fasterxml/jackson/databind/ser/impl/c$a;

    .line 71
    return-void
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final a(I)I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x40

    .line 3
    .line 4
    if-gt p0, v0, :cond_0

    .line 5
    add-int/2addr p0, p0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    shr-int/lit8 v0, p0, 0x2

    .line 9
    add-int/2addr p0, v0

    .line 10
    .line 11
    :goto_0
    const/16 v0, 0x8

    .line 12
    .line 13
    :goto_1
    if-ge v0, p0, :cond_1

    .line 14
    add-int/2addr v0, v0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static b(Ljava/util/HashMap;)Lcom/fasterxml/jackson/databind/ser/impl/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Lcom/fasterxml/jackson/databind/util/r;",
            "Lcom/fasterxml/jackson/databind/h<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Lcom/fasterxml/jackson/databind/ser/impl/c;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/databind/ser/impl/c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/ser/impl/c;-><init>(Ljava/util/Map;)V

    .line 6
    return-object v0
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
.end method


# virtual methods
.method public c(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/c;->a:[Lcom/fasterxml/jackson/databind/ser/impl/c$a;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/r;->d(Lcom/fasterxml/jackson/databind/JavaType;)I

    .line 6
    move-result v1

    .line 7
    .line 8
    iget v2, p0, Lcom/fasterxml/jackson/databind/ser/impl/c;->c:I

    .line 9
    and-int/2addr v1, v2

    .line 10
    .line 11
    aget-object v0, v0, v1

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    return-object v1

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->a(Lcom/fasterxml/jackson/databind/JavaType;)Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object p1, v0, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->a:Lcom/fasterxml/jackson/databind/h;

    .line 24
    return-object p1

    .line 25
    .line 26
    :cond_1
    iget-object v0, v0, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->b:Lcom/fasterxml/jackson/databind/ser/impl/c$a;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->a(Lcom/fasterxml/jackson/databind/JavaType;)Z

    .line 32
    move-result v2

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->a:Lcom/fasterxml/jackson/databind/h;

    .line 37
    return-object p1

    .line 38
    :cond_2
    return-object v1
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

.method public d(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/c;->a:[Lcom/fasterxml/jackson/databind/ser/impl/c$a;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/r;->e(Ljava/lang/Class;)I

    .line 6
    move-result v1

    .line 7
    .line 8
    iget v2, p0, Lcom/fasterxml/jackson/databind/ser/impl/c;->c:I

    .line 9
    and-int/2addr v1, v2

    .line 10
    .line 11
    aget-object v0, v0, v1

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    return-object v1

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->b(Ljava/lang/Class;)Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object p1, v0, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->a:Lcom/fasterxml/jackson/databind/h;

    .line 24
    return-object p1

    .line 25
    .line 26
    :cond_1
    iget-object v0, v0, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->b:Lcom/fasterxml/jackson/databind/ser/impl/c$a;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->b(Ljava/lang/Class;)Z

    .line 32
    move-result v2

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->a:Lcom/fasterxml/jackson/databind/h;

    .line 37
    return-object p1

    .line 38
    :cond_2
    return-object v1
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

.method public e(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")",
            "Lcom/fasterxml/jackson/databind/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/c;->a:[Lcom/fasterxml/jackson/databind/ser/impl/c$a;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/r;->f(Lcom/fasterxml/jackson/databind/JavaType;)I

    .line 6
    move-result v1

    .line 7
    .line 8
    iget v2, p0, Lcom/fasterxml/jackson/databind/ser/impl/c;->c:I

    .line 9
    and-int/2addr v1, v2

    .line 10
    .line 11
    aget-object v0, v0, v1

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    return-object v1

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->c(Lcom/fasterxml/jackson/databind/JavaType;)Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object p1, v0, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->a:Lcom/fasterxml/jackson/databind/h;

    .line 24
    return-object p1

    .line 25
    .line 26
    :cond_1
    iget-object v0, v0, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->b:Lcom/fasterxml/jackson/databind/ser/impl/c$a;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->c(Lcom/fasterxml/jackson/databind/JavaType;)Z

    .line 32
    move-result v2

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->a:Lcom/fasterxml/jackson/databind/h;

    .line 37
    return-object p1

    .line 38
    :cond_2
    return-object v1
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

.method public f(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/impl/c;->a:[Lcom/fasterxml/jackson/databind/ser/impl/c$a;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/r;->g(Ljava/lang/Class;)I

    .line 6
    move-result v1

    .line 7
    .line 8
    iget v2, p0, Lcom/fasterxml/jackson/databind/ser/impl/c;->c:I

    .line 9
    and-int/2addr v1, v2

    .line 10
    .line 11
    aget-object v0, v0, v1

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    return-object v1

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->d(Ljava/lang/Class;)Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object p1, v0, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->a:Lcom/fasterxml/jackson/databind/h;

    .line 24
    return-object p1

    .line 25
    .line 26
    :cond_1
    iget-object v0, v0, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->b:Lcom/fasterxml/jackson/databind/ser/impl/c$a;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->d(Ljava/lang/Class;)Z

    .line 32
    move-result v2

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lcom/fasterxml/jackson/databind/ser/impl/c$a;->a:Lcom/fasterxml/jackson/databind/h;

    .line 37
    return-object p1

    .line 38
    :cond_2
    return-object v1
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
