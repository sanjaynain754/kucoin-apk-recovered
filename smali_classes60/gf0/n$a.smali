.class public Lgf0/n$a;
.super Lgf0/n;
.source "TrimmingAppender.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgf0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lgf0/n;-><init>()V

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
.end method


# virtual methods
.method public a(Ljava/lang/Appendable;Ljava/lang/String;)V
    .locals 9
    .param p1    # Ljava/lang/Appendable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ":",
            "Ljava/lang/CharSequence;",
            ">(TT;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 7
    move-result v1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    move v5, v4

    .line 15
    .line 16
    :goto_0
    const/16 v6, 0x20

    .line 17
    .line 18
    if-ge v4, v2, :cond_2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, v4}, Ljava/lang/String;->charAt(I)C

    .line 22
    move-result v7

    .line 23
    .line 24
    .line 25
    invoke-static {v7}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 26
    move-result v8

    .line 27
    .line 28
    if-eqz v8, :cond_0

    .line 29
    const/4 v5, 0x1

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :cond_0
    if-eqz v5, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 36
    move-result v5

    .line 37
    .line 38
    if-lez v5, :cond_1

    .line 39
    .line 40
    add-int/lit8 v5, v5, -0x1

    .line 41
    .line 42
    .line 43
    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 44
    move-result v5

    .line 45
    .line 46
    .line 47
    invoke-static {v5}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 48
    move-result v5

    .line 49
    .line 50
    if-nez v5, :cond_1

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v6}, Lgf0/a;->a(Ljava/lang/Appendable;C)V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-static {p1, v7}, Lgf0/a;->a(Ljava/lang/Appendable;C)V

    .line 57
    move v5, v3

    .line 58
    .line 59
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 60
    goto :goto_0

    .line 61
    .line 62
    :cond_2
    if-eqz v5, :cond_3

    .line 63
    .line 64
    .line 65
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 66
    move-result p2

    .line 67
    .line 68
    if-ge v1, p2, :cond_3

    .line 69
    .line 70
    .line 71
    invoke-static {p1, v6}, Lgf0/a;->a(Ljava/lang/Appendable;C)V

    .line 72
    :cond_3
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
