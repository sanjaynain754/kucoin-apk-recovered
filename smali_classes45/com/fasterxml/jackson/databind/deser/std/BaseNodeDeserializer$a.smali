.class public final Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;
.super Ljava/lang/Object;
.source "JsonNodeDeserializer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a()Lcom/fasterxml/jackson/databind/node/ContainerNode;
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->b:I

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
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->a:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

    .line 9
    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    iput v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->b:I

    .line 13
    .line 14
    aget-object v0, v1, v0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
.end method

.method public b(Lcom/fasterxml/jackson/databind/node/ContainerNode;)V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->b:I

    .line 3
    .line 4
    iget v1, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->c:I

    .line 5
    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->a:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

    .line 9
    .line 10
    add-int/lit8 v2, v0, 0x1

    .line 11
    .line 12
    iput v2, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->b:I

    .line 13
    .line 14
    aput-object p1, v1, v0

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->a:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0xa

    .line 22
    .line 23
    iput v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->c:I

    .line 24
    .line 25
    new-array v0, v0, [Lcom/fasterxml/jackson/databind/node/ContainerNode;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->a:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_1
    shr-int/lit8 v0, v1, 0x1

    .line 31
    .line 32
    const/16 v2, 0x14

    .line 33
    .line 34
    .line 35
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 36
    move-result v0

    .line 37
    .line 38
    const/16 v2, 0xfa0

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 42
    move-result v0

    .line 43
    add-int/2addr v1, v0

    .line 44
    .line 45
    iput v1, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->c:I

    .line 46
    .line 47
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->a:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    check-cast v0, [Lcom/fasterxml/jackson/databind/node/ContainerNode;

    .line 54
    .line 55
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->a:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

    .line 56
    .line 57
    :goto_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->a:[Lcom/fasterxml/jackson/databind/node/ContainerNode;

    .line 58
    .line 59
    iget v1, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->b:I

    .line 60
    .line 61
    add-int/lit8 v2, v1, 0x1

    .line 62
    .line 63
    iput v2, p0, Lcom/fasterxml/jackson/databind/deser/std/BaseNodeDeserializer$a;->b:I

    .line 64
    .line 65
    aput-object p1, v0, v1

    .line 66
    return-void
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
