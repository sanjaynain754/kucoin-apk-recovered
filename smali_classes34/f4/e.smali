.class public Lf4/e;
.super Ljava/lang/Object;
.source "FirstAvailableDataSourceSupplier.java"

# interfaces
.implements Lw3/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf4/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lw3/k<",
        "Lf4/b<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw3/k<",
            "Lf4/b<",
            "TT;>;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw3/k<",
            "Lf4/b<",
            "TT;>;>;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    const-string v1, "List of suppliers is empty!"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lw3/h;->c(ZLjava/lang/Object;)V

    .line 15
    .line 16
    iput-object p1, p0, Lf4/e;->a:Ljava/util/List;

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static bridge synthetic a(Lf4/e;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lf4/e;->a:Ljava/util/List;

    .line 3
    return-object p0
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
    .line 22
    .line 23
.end method

.method public static b(Ljava/util/List;)Lf4/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "Lw3/k<",
            "Lf4/b<",
            "TT;>;>;>;)",
            "Lf4/e<",
            "TT;>;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lf4/e;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lf4/e;-><init>(Ljava/util/List;)V

    .line 6
    return-object v0
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
.end method


# virtual methods
.method public c()Lf4/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf4/b<",
            "TT;>;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lf4/e$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lf4/e$a;-><init>(Lf4/e;)V

    .line 6
    return-object v0
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

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    .line 6
    :cond_0
    instance-of v0, p1, Lf4/e;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lf4/e;

    .line 13
    .line 14
    iget-object v0, p0, Lf4/e;->a:Ljava/util/List;

    .line 15
    .line 16
    iget-object p1, p1, Lf4/e;->a:Ljava/util/List;

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p1}, Lw3/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result p1

    .line 21
    return p1
    .line 22
    .line 23
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lf4/e;->c()Lf4/b;

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

.method public hashCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lf4/e;->a:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lw3/f;->b(Ljava/lang/Object;)Lw3/f$a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "list"

    .line 7
    .line 8
    iget-object v2, p0, Lf4/e;->a:Ljava/util/List;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lw3/f$a;->b(Ljava/lang/String;Ljava/lang/Object;)Lw3/f$a;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lw3/f$a;->toString()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
.end method
