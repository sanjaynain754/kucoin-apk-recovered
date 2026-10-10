.class public final Lcom/fasterxml/jackson/databind/node/c$b;
.super Lcom/fasterxml/jackson/databind/node/c;
.source "NodeCursor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/node/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public f:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Lcom/fasterxml/jackson/databind/f;",
            ">;>;"
        }
    .end annotation
.end field

.field public g:Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Lcom/fasterxml/jackson/databind/f;",
            ">;"
        }
    .end annotation
.end field

.field public h:Z


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/f;Lcom/fasterxml/jackson/databind/node/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0, p2}, Lcom/fasterxml/jackson/databind/node/c;-><init>(ILcom/fasterxml/jackson/databind/node/c;)V

    .line 5
    .line 6
    check-cast p1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->fields()Ljava/util/Iterator;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/node/c$b;->f:Ljava/util/Iterator;

    .line 13
    const/4 p1, 0x1

    .line 14
    .line 15
    iput-boolean p1, p0, Lcom/fasterxml/jackson/databind/node/c$b;->h:Z

    .line 16
    return-void
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
.end method


# virtual methods
.method public bridge synthetic e()Lcom/fasterxml/jackson/core/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/fasterxml/jackson/databind/node/c;->l()Lcom/fasterxml/jackson/databind/node/c;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public k()Lcom/fasterxml/jackson/databind/f;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/c$b;->g:Ljava/util/Map$Entry;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/fasterxml/jackson/databind/f;

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public m()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/fasterxml/jackson/databind/node/c$b;->h:Z

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/c$b;->f:Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iput-object v2, p0, Lcom/fasterxml/jackson/databind/node/c;->d:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v2, p0, Lcom/fasterxml/jackson/databind/node/c$b;->g:Ljava/util/Map$Entry;

    .line 19
    .line 20
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 21
    return-object v0

    .line 22
    .line 23
    :cond_0
    iget v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 24
    add-int/2addr v0, v1

    .line 25
    .line 26
    iput v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 27
    const/4 v0, 0x0

    .line 28
    .line 29
    iput-boolean v0, p0, Lcom/fasterxml/jackson/databind/node/c$b;->h:Z

    .line 30
    .line 31
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/c$b;->f:Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    check-cast v0, Ljava/util/Map$Entry;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/node/c$b;->g:Ljava/util/Map$Entry;

    .line 40
    .line 41
    if-nez v0, :cond_1

    .line 42
    goto :goto_0

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 46
    move-result-object v0

    .line 47
    move-object v2, v0

    .line 48
    .line 49
    check-cast v2, Ljava/lang/String;

    .line 50
    .line 51
    :goto_0
    iput-object v2, p0, Lcom/fasterxml/jackson/databind/node/c;->d:Ljava/lang/String;

    .line 52
    .line 53
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 54
    return-object v0

    .line 55
    .line 56
    :cond_2
    iput-boolean v1, p0, Lcom/fasterxml/jackson/databind/node/c$b;->h:Z

    .line 57
    .line 58
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/c$b;->g:Ljava/util/Map$Entry;

    .line 59
    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    check-cast v0, Lcom/fasterxml/jackson/databind/f;

    .line 65
    .line 66
    .line 67
    invoke-interface {v0}, Lcom/fasterxml/jackson/core/l;->asToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 68
    move-result-object v0

    .line 69
    return-object v0
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public n()Lcom/fasterxml/jackson/databind/node/c;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/databind/node/c$a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/c$b;->k()Lcom/fasterxml/jackson/databind/f;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, p0}, Lcom/fasterxml/jackson/databind/node/c$a;-><init>(Lcom/fasterxml/jackson/databind/f;Lcom/fasterxml/jackson/databind/node/c;)V

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public o()Lcom/fasterxml/jackson/databind/node/c;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/databind/node/c$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/c$b;->k()Lcom/fasterxml/jackson/databind/f;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, p0}, Lcom/fasterxml/jackson/databind/node/c$b;-><init>(Lcom/fasterxml/jackson/databind/f;Lcom/fasterxml/jackson/databind/node/c;)V

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
