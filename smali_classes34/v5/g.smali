.class public Lv5/g;
.super Ljava/lang/Object;
.source "SimpleProgressiveJpegConfig.java"

# interfaces
.implements Lv5/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv5/g$a;,
        Lv5/g$b;
    }
.end annotation


# instance fields
.field public final a:Lv5/g$b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lv5/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv5/g$a;-><init>(Lv5/h;)V

    invoke-direct {p0, v0}, Lv5/g;-><init>(Lv5/g$b;)V

    return-void
.end method

.method public constructor <init>(Lv5/g$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv5/g$b;

    iput-object p1, p0, Lv5/g;->a:Lv5/g$b;

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lv5/g;->a:Lv5/g$b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lv5/g$b;->a()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 20
    move-result v2

    .line 21
    .line 22
    if-ge v1, v2, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    check-cast v2, Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 32
    move-result v2

    .line 33
    .line 34
    if-le v2, p1, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    check-cast p1, Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 44
    move-result p1

    .line 45
    return p1

    .line 46
    .line 47
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 48
    goto :goto_0

    .line 49
    .line 50
    .line 51
    :cond_2
    const p1, 0x7fffffff

    .line 52
    return p1

    .line 53
    .line 54
    :cond_3
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 55
    return p1
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
.end method

.method public b(I)Lx5/n;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lv5/g;->a:Lv5/g$b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lv5/g$b;->b()I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-lt p1, v0, :cond_0

    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v1

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {p1, v0, v1}, Lx5/m;->d(IZZ)Lx5/n;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public c()Z
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
.end method
