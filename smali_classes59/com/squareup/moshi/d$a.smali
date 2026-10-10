.class public Lcom/squareup/moshi/d$a;
.super Ljava/lang/Object;
.source "CollectionJsonAdapter.java"

# interfaces
.implements Lcom/squareup/moshi/f$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/moshi/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


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
.end method


# virtual methods
.method public a(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/o;)Lcom/squareup/moshi/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/squareup/moshi/o;",
            ")",
            "Lcom/squareup/moshi/f<",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/squareup/moshi/q;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    .line 8
    move-result p2

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    return-object v1

    .line 13
    .line 14
    :cond_0
    const-class p2, Ljava/util/List;

    .line 15
    .line 16
    if-eq v0, p2, :cond_3

    .line 17
    .line 18
    const-class p2, Ljava/util/Collection;

    .line 19
    .line 20
    if-ne v0, p2, :cond_1

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_1
    const-class p2, Ljava/util/Set;

    .line 24
    .line 25
    if-ne v0, p2, :cond_2

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p3}, Lcom/squareup/moshi/d;->j(Ljava/lang/reflect/Type;Lcom/squareup/moshi/o;)Lcom/squareup/moshi/f;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/squareup/moshi/f;->d()Lcom/squareup/moshi/f;

    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_2
    return-object v1

    .line 36
    .line 37
    .line 38
    :cond_3
    :goto_0
    invoke-static {p1, p3}, Lcom/squareup/moshi/d;->h(Ljava/lang/reflect/Type;Lcom/squareup/moshi/o;)Lcom/squareup/moshi/f;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/squareup/moshi/f;->d()Lcom/squareup/moshi/f;

    .line 43
    move-result-object p1

    .line 44
    return-object p1
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
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
