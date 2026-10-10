.class public final Lcom/fasterxml/jackson/core/io/i;
.super Ljava/io/Writer;
.source "SegmentedStringWriter.java"


# instance fields
.field public final b:Lcom/fasterxml/jackson/core/util/i;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/core/util/a;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/fasterxml/jackson/core/util/i;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/fasterxml/jackson/core/util/i;-><init>(Lcom/fasterxml/jackson/core/util/a;)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/fasterxml/jackson/core/io/i;->b:Lcom/fasterxml/jackson/core/util/i;

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
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/i;->b:Lcom/fasterxml/jackson/core/util/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/i;->b:Lcom/fasterxml/jackson/core/util/i;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/i;->x()V

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public append(C)Ljava/io/Writer;
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/io/i;->write(I)V

    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    .locals 3

    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/i;->b:Lcom/fasterxml/jackson/core/util/i;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Lcom/fasterxml/jackson/core/util/i;->b(Ljava/lang/String;II)V

    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    .locals 1

    .line 7
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 8
    iget-object p2, p0, Lcom/fasterxml/jackson/core/io/i;->b:Lcom/fasterxml/jackson/core/util/i;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0, p3}, Lcom/fasterxml/jackson/core/util/i;->b(Ljava/lang/String;II)V

    return-object p0
.end method

.method public bridge synthetic append(C)Ljava/lang/Appendable;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/io/i;->append(C)Ljava/io/Writer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/io/i;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/io/i;->append(Ljava/lang/CharSequence;II)Ljava/io/Writer;

    move-result-object p1

    return-object p1
.end method

.method public close()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public flush()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public write(I)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/i;->b:Lcom/fasterxml/jackson/core/util/i;

    int-to-char p1, p1

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/util/i;->a(C)V

    return-void
.end method

.method public write(Ljava/lang/String;)V
    .locals 3

    .line 4
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/i;->b:Lcom/fasterxml/jackson/core/util/i;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Lcom/fasterxml/jackson/core/util/i;->b(Ljava/lang/String;II)V

    return-void
.end method

.method public write(Ljava/lang/String;II)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/i;->b:Lcom/fasterxml/jackson/core/util/i;

    invoke-virtual {v0, p1, p2, p3}, Lcom/fasterxml/jackson/core/util/i;->b(Ljava/lang/String;II)V

    return-void
.end method

.method public write([C)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/i;->b:Lcom/fasterxml/jackson/core/util/i;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Lcom/fasterxml/jackson/core/util/i;->c([CII)V

    return-void
.end method

.method public write([CII)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/i;->b:Lcom/fasterxml/jackson/core/util/i;

    invoke-virtual {v0, p1, p2, p3}, Lcom/fasterxml/jackson/core/util/i;->c([CII)V

    return-void
.end method
