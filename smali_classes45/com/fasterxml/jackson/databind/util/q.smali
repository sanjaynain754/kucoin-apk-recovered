.class public Lcom/fasterxml/jackson/databind/util/q;
.super Lcom/fasterxml/jackson/core/f;
.source "TokenBufferReadContext.java"


# instance fields
.field public final c:Lcom/fasterxml/jackson/core/f;

.field public final d:Lcom/fasterxml/jackson/core/JsonLocation;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, -0x1

    .line 14
    invoke-direct {p0, v0, v1}, Lcom/fasterxml/jackson/core/f;-><init>(II)V

    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/q;->c:Lcom/fasterxml/jackson/core/f;

    .line 16
    sget-object v0, Lcom/fasterxml/jackson/core/JsonLocation;->NA:Lcom/fasterxml/jackson/core/JsonLocation;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/q;->d:Lcom/fasterxml/jackson/core/JsonLocation;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/f;Lcom/fasterxml/jackson/core/JsonLocation;)V
    .locals 1

    .line 9
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/f;-><init>(Lcom/fasterxml/jackson/core/f;)V

    .line 10
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/f;->e()Lcom/fasterxml/jackson/core/f;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/q;->c:Lcom/fasterxml/jackson/core/f;

    .line 11
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/f;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/q;->e:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/f;->c()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/util/q;->f:Ljava/lang/Object;

    .line 13
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/util/q;->d:Lcom/fasterxml/jackson/core/JsonLocation;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/f;Lcom/fasterxml/jackson/core/io/ContentReference;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/f;-><init>(Lcom/fasterxml/jackson/core/f;)V

    .line 2
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/f;->e()Lcom/fasterxml/jackson/core/f;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/q;->c:Lcom/fasterxml/jackson/core/f;

    .line 3
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/f;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/q;->e:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/f;->c()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/q;->f:Ljava/lang/Object;

    .line 5
    instance-of v0, p1, Li7/d;

    if-eqz v0, :cond_0

    .line 6
    check-cast p1, Li7/d;

    .line 7
    invoke-virtual {p1, p2}, Li7/d;->u(Lcom/fasterxml/jackson/core/io/ContentReference;)Lcom/fasterxml/jackson/core/JsonLocation;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/util/q;->d:Lcom/fasterxml/jackson/core/JsonLocation;

    return-void

    .line 8
    :cond_0
    sget-object p1, Lcom/fasterxml/jackson/core/JsonLocation;->NA:Lcom/fasterxml/jackson/core/JsonLocation;

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/util/q;->d:Lcom/fasterxml/jackson/core/JsonLocation;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/util/q;II)V
    .locals 0

    .line 17
    invoke-direct {p0, p2, p3}, Lcom/fasterxml/jackson/core/f;-><init>(II)V

    .line 18
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/util/q;->c:Lcom/fasterxml/jackson/core/f;

    .line 19
    iget-object p1, p1, Lcom/fasterxml/jackson/databind/util/q;->d:Lcom/fasterxml/jackson/core/JsonLocation;

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/util/q;->d:Lcom/fasterxml/jackson/core/JsonLocation;

    return-void
.end method

.method public static m(Lcom/fasterxml/jackson/core/f;)Lcom/fasterxml/jackson/databind/util/q;
    .locals 2

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    new-instance p0, Lcom/fasterxml/jackson/databind/util/q;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/util/q;-><init>()V

    .line 8
    return-object p0

    .line 9
    .line 10
    :cond_0
    new-instance v0, Lcom/fasterxml/jackson/databind/util/q;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/fasterxml/jackson/core/io/ContentReference;->unknown()Lcom/fasterxml/jackson/core/io/ContentReference;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, Lcom/fasterxml/jackson/databind/util/q;-><init>(Lcom/fasterxml/jackson/core/f;Lcom/fasterxml/jackson/core/io/ContentReference;)V

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/q;->e:Ljava/lang/String;

    .line 3
    return-object v0
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

.method public c()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/q;->f:Ljava/lang/Object;

    .line 3
    return-object v0
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

.method public e()Lcom/fasterxml/jackson/core/f;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/q;->c:Lcom/fasterxml/jackson/core/f;

    .line 3
    return-object v0
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

.method public i(Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/util/q;->f:Ljava/lang/Object;

    .line 3
    return-void
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public k()Lcom/fasterxml/jackson/databind/util/q;
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    .line 6
    iput v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 7
    .line 8
    new-instance v0, Lcom/fasterxml/jackson/databind/util/q;

    .line 9
    const/4 v2, -0x1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0, v1, v2}, Lcom/fasterxml/jackson/databind/util/q;-><init>(Lcom/fasterxml/jackson/databind/util/q;II)V

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public l()Lcom/fasterxml/jackson/databind/util/q;
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 7
    .line 8
    new-instance v0, Lcom/fasterxml/jackson/databind/util/q;

    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, -0x1

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, v1, v2}, Lcom/fasterxml/jackson/databind/util/q;-><init>(Lcom/fasterxml/jackson/databind/util/q;II)V

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public n()Lcom/fasterxml/jackson/databind/util/q;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/q;->c:Lcom/fasterxml/jackson/core/f;

    .line 3
    .line 4
    instance-of v1, v0, Lcom/fasterxml/jackson/databind/util/q;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lcom/fasterxml/jackson/databind/util/q;

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    if-nez v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Lcom/fasterxml/jackson/databind/util/q;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/util/q;-><init>()V

    .line 17
    return-object v0

    .line 18
    .line 19
    :cond_1
    new-instance v1, Lcom/fasterxml/jackson/databind/util/q;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/util/q;->d:Lcom/fasterxml/jackson/core/JsonLocation;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v0, v2}, Lcom/fasterxml/jackson/databind/util/q;-><init>(Lcom/fasterxml/jackson/core/f;Lcom/fasterxml/jackson/core/JsonLocation;)V

    .line 25
    return-object v1
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

.method public o(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonProcessingException;
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/util/q;->e:Ljava/lang/String;

    .line 3
    return-void
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public p()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 7
    return-void
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
