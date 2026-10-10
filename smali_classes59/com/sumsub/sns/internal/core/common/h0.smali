.class public final Lcom/sumsub/sns/internal/core/common/h0;
.super Lcf0/a;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcf0/a;-><init>()V

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
.end method

.method public static final a(Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;
    .locals 2

    .line 6
    invoke-interface {p0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "$$"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lcf0/g;Lcf0/q;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcf0/g;->e()Ldf0/a;

    move-result-object p0

    .line 2
    sget-object v0, Lio/noties/markwon/core/CoreProps;->a:Lcf0/o;

    invoke-virtual {v0, p1}, Lcf0/o;->a(Lcf0/q;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lio/noties/markwon/core/CoreProps$ListItemType;->ORDERED:Lio/noties/markwon/core/CoreProps$ListItemType;

    if-ne v0, v1, :cond_1

    .line 3
    sget-object v0, Lio/noties/markwon/core/CoreProps;->c:Lcf0/o;

    invoke-virtual {v0, p1}, Lcf0/o;->a(Lcf0/q;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 4
    :goto_0
    new-instance v0, Lff0/h;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lff0/h;-><init>(Ldf0/a;Ljava/lang/String;)V

    return-object v0

    .line 5
    :cond_1
    new-instance p1, Lff0/b;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lff0/b;-><init>(Ldf0/a;I)V

    return-object p1
.end method


# virtual methods
.method public final configure(Lcf0/i$b;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/common/e0;->a:Lcom/sumsub/sns/internal/core/common/e0;

    .line 3
    .line 4
    const-class v1, Lof0/d;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v1, v0}, Lcf0/i$b;->a(Ljava/lang/Class;Lcf0/i$a;)V

    .line 8
    return-void
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
.end method

.method public final configureConfiguration(Lcf0/g$b;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/common/f0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/common/f0;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcf0/g$b;->i(Lcf0/c;)Lcf0/g$b;

    .line 9
    return-void
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
.end method

.method public final configureSpansFactory(Lcf0/j$a;)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/common/y1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/common/y1;-><init>()V

    .line 6
    .line 7
    const-class v1, Lih0/r;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v1, v0}, Lcf0/j$a;->a(Ljava/lang/Class;Lcf0/s;)Lcf0/j$a;

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
.end method

.method public final configureTheme(Ldf0/a$a;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcf0/a;->configureTheme(Ldf0/a$a;)V

    .line 4
    const/4 v0, 0x4

    .line 5
    int-to-float v0, v0

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 16
    mul-float/2addr v0, v1

    .line 17
    float-to-int v0, v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ldf0/a$a;->B(I)Ldf0/a$a;

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ldf0/a$a;->D(I)Ldf0/a$a;

    .line 25
    return-void
.end method

.method public final configureVisitor(Lcf0/l$b;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/common/g0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/common/g0;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, v0}, Lcf0/l$b;->c(Lcf0/l$a;)Lcf0/l$b;

    .line 9
    return-void
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
.end method

.method public final processMarkdown(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lkotlin/text/Regex;

    .line 3
    .line 4
    sget-object v1, Lkotlin/text/RegexOption;->MULTILINE:Lkotlin/text/RegexOption;

    .line 5
    .line 6
    const-string v2, "^><\\s*(.+\\S)\\s*$"

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;Lkotlin/text/RegexOption;)V

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sns/internal/core/common/x1;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/sumsub/sns/internal/core/common/x1;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, v1}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 18
    move-result-object p1

    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
