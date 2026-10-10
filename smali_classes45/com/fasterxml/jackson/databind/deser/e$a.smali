.class public Lcom/fasterxml/jackson/databind/deser/e$a;
.super Lh7/a$a;
.source "DataFormatReaders.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Ljava/io/InputStream;[B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lh7/a$a;-><init>(Ljava/io/InputStream;[B)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lh7/a$a;-><init>([BII)V

    return-void
.end method


# virtual methods
.method public c(Lcom/fasterxml/jackson/databind/ObjectReader;Lcom/fasterxml/jackson/core/format/MatchStrength;)Lcom/fasterxml/jackson/databind/deser/e$b;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/e$b;

    .line 3
    .line 4
    iget-object v1, p0, Lh7/a$a;->a:Ljava/io/InputStream;

    .line 5
    .line 6
    iget-object v2, p0, Lh7/a$a;->b:[B

    .line 7
    .line 8
    iget v3, p0, Lh7/a$a;->c:I

    .line 9
    .line 10
    iget v4, p0, Lh7/a$a;->d:I

    .line 11
    sub-int/2addr v4, v3

    .line 12
    move-object v5, p1

    .line 13
    move-object v6, p2

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/databind/deser/e$b;-><init>(Ljava/io/InputStream;[BIILcom/fasterxml/jackson/databind/ObjectReader;Lcom/fasterxml/jackson/core/format/MatchStrength;)V

    .line 17
    return-object v0
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
