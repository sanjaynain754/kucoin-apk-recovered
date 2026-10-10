.class public final Lcom/fasterxml/jackson/databind/node/c$a;
.super Lcom/fasterxml/jackson/databind/node/c;
.source "NodeCursor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/node/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public f:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Lcom/fasterxml/jackson/databind/f;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lcom/fasterxml/jackson/databind/f;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/f;Lcom/fasterxml/jackson/databind/node/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0, p2}, Lcom/fasterxml/jackson/databind/node/c;-><init>(ILcom/fasterxml/jackson/databind/node/c;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/f;->elements()Ljava/util/Iterator;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/node/c$a;->f:Ljava/util/Iterator;

    .line 11
    return-void
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
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/c$a;->g:Lcom/fasterxml/jackson/databind/f;

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

.method public m()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/c$a;->f:Ljava/util/Iterator;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/node/c$a;->g:Lcom/fasterxml/jackson/databind/f;

    .line 12
    .line 13
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 14
    return-object v0

    .line 15
    .line 16
    :cond_0
    iget v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    iput v0, p0, Lcom/fasterxml/jackson/core/f;->b:I

    .line 21
    .line 22
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/c$a;->f:Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Lcom/fasterxml/jackson/databind/f;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/node/c$a;->g:Lcom/fasterxml/jackson/databind/f;

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Lcom/fasterxml/jackson/core/l;->asToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 34
    move-result-object v0

    .line 35
    return-object v0
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

.method public n()Lcom/fasterxml/jackson/databind/node/c;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/databind/node/c$a;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/node/c$a;->g:Lcom/fasterxml/jackson/databind/f;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lcom/fasterxml/jackson/databind/node/c$a;-><init>(Lcom/fasterxml/jackson/databind/f;Lcom/fasterxml/jackson/databind/node/c;)V

    .line 8
    return-object v0
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

.method public o()Lcom/fasterxml/jackson/databind/node/c;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/databind/node/c$b;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/node/c$a;->g:Lcom/fasterxml/jackson/databind/f;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lcom/fasterxml/jackson/databind/node/c$b;-><init>(Lcom/fasterxml/jackson/databind/f;Lcom/fasterxml/jackson/databind/node/c;)V

    .line 8
    return-object v0
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
