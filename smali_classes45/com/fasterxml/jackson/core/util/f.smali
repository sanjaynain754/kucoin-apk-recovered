.class public final Lcom/fasterxml/jackson/core/util/f;
.super Ljava/lang/Object;
.source "JacksonFeatureSet.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<F::",
        "Lcom/fasterxml/jackson/core/util/e;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lcom/fasterxml/jackson/core/util/f;->a:I

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
.end method

.method public static a([Lcom/fasterxml/jackson/core/util/e;)Lcom/fasterxml/jackson/core/util/f;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F::",
            "Lcom/fasterxml/jackson/core/util/e;",
            ">([TF;)",
            "Lcom/fasterxml/jackson/core/util/f<",
            "TF;>;"
        }
    .end annotation

    .line 1
    array-length v0, p0

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    if-gt v0, v1, :cond_2

    .line 7
    array-length v0, p0

    .line 8
    move v1, v2

    .line 9
    .line 10
    :goto_0
    if-ge v2, v0, :cond_1

    .line 11
    .line 12
    aget-object v3, p0, v2

    .line 13
    .line 14
    .line 15
    invoke-interface {v3}, Lcom/fasterxml/jackson/core/util/e;->enabledByDefault()Z

    .line 16
    move-result v4

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v3}, Lcom/fasterxml/jackson/core/util/e;->getMask()I

    .line 22
    move-result v3

    .line 23
    or-int/2addr v1, v3

    .line 24
    .line 25
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_1
    new-instance p0, Lcom/fasterxml/jackson/core/util/f;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/core/util/f;-><init>(I)V

    .line 32
    return-object p0

    .line 33
    .line 34
    :cond_2
    aget-object v0, p0, v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 45
    array-length p0, p0

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    .line 52
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 53
    move-result-object p0

    .line 54
    .line 55
    const-string v0, "Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)"

    .line 56
    .line 57
    .line 58
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    move-result-object p0

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    throw v1
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
.method public b(Lcom/fasterxml/jackson/core/util/e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)Z"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/util/e;->getMask()I

    .line 4
    move-result p1

    .line 5
    .line 6
    iget v0, p0, Lcom/fasterxml/jackson/core/util/f;->a:I

    .line 7
    and-int/2addr p1, v0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
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

.method public c(Lcom/fasterxml/jackson/core/util/e;)Lcom/fasterxml/jackson/core/util/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Lcom/fasterxml/jackson/core/util/f<",
            "TF;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/util/f;->a:I

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Lcom/fasterxml/jackson/core/util/e;->getMask()I

    .line 6
    move-result p1

    .line 7
    or-int/2addr p1, v0

    .line 8
    .line 9
    iget v0, p0, Lcom/fasterxml/jackson/core/util/f;->a:I

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    return-object p0

    .line 13
    .line 14
    :cond_0
    new-instance v0, Lcom/fasterxml/jackson/core/util/f;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p1}, Lcom/fasterxml/jackson/core/util/f;-><init>(I)V

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
