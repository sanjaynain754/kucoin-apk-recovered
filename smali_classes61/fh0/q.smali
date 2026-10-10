.class public Lfh0/q;
.super Lkh0/a;
.source "ParagraphParser.java"


# instance fields
.field public final a:Lih0/u;

.field public b:Lorg/commonmark/internal/LinkReferenceDefinitionParser;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lkh0/a;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lih0/u;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lih0/u;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lfh0/q;->a:Lih0/u;

    .line 11
    .line 12
    new-instance v0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lorg/commonmark/internal/LinkReferenceDefinitionParser;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lfh0/q;->b:Lorg/commonmark/internal/LinkReferenceDefinitionParser;

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
    .line 19
    .line 20
    .line 21
.end method

.method public c()Lih0/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lfh0/q;->a:Lih0/u;

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
    .line 19
    .line 20
    .line 21
.end method

.method public d(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lfh0/q;->b:Lorg/commonmark/internal/LinkReferenceDefinitionParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->f(Ljava/lang/CharSequence;)V

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public e(Ljh0/a;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lfh0/q;->b:Lorg/commonmark/internal/LinkReferenceDefinitionParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->d()Ljava/lang/CharSequence;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 10
    move-result v1

    .line 11
    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object v1, p0, Lfh0/q;->a:Lih0/u;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, v1}, Ljh0/a;->a(Ljava/lang/String;Lih0/s;)V

    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public f()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lfh0/q;->b:Lorg/commonmark/internal/LinkReferenceDefinitionParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->d()Ljava/lang/CharSequence;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lfh0/q;->a:Lih0/u;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lih0/s;->l()V

    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public h(Lkh0/h;)Lkh0/c;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lkh0/h;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lkh0/h;->getIndex()I

    .line 10
    move-result p1

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lkh0/c;->b(I)Lkh0/c;

    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {}, Lkh0/c;->d()Lkh0/c;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public i()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lfh0/q;->b:Lorg/commonmark/internal/LinkReferenceDefinitionParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->d()Ljava/lang/CharSequence;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lih0/p;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lfh0/q;->b:Lorg/commonmark/internal/LinkReferenceDefinitionParser;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->c()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method
