.class public Lef0/g;
.super Ljava/lang/Object;
.source "ListItemSpanFactory.java"

# interfaces
.implements Lcf0/s;


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
.method public a(Lcf0/g;Lcf0/q;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lcf0/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcf0/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lio/noties/markwon/core/CoreProps$ListItemType;->BULLET:Lio/noties/markwon/core/CoreProps$ListItemType;

    .line 3
    .line 4
    sget-object v1, Lio/noties/markwon/core/CoreProps;->a:Lcf0/o;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1, p2}, Lcf0/o;->c(Lcf0/q;)Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lff0/b;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcf0/g;->e()Ldf0/a;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    sget-object v1, Lio/noties/markwon/core/CoreProps;->b:Lcf0/o;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p2}, Lcf0/o;->c(Lcf0/q;)Ljava/lang/Object;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 28
    move-result p2

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, p1, p2}, Lff0/b;-><init>(Ldf0/a;I)V

    .line 32
    return-object v0

    .line 33
    .line 34
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    sget-object v1, Lio/noties/markwon/core/CoreProps;->c:Lcf0/o;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p2}, Lcf0/o;->c(Lcf0/q;)Ljava/lang/Object;

    .line 43
    move-result-object p2

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    move-result-object p2

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string p2, "."

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const/16 p2, 0xa0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    move-result-object p2

    .line 65
    .line 66
    new-instance v0, Lff0/h;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lcf0/g;->e()Ldf0/a;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-direct {v0, p1, p2}, Lff0/h;-><init>(Ldf0/a;Ljava/lang/String;)V

    .line 74
    return-object v0
    .line 75
    .line 76
    .line 77
    .line 78
.end method
