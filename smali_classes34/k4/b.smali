.class public Lk4/b;
.super Ljava/lang/Object;
.source "DraweeConfig.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk4/b$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/facebook/common/internal/ImmutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/internal/ImmutableList<",
            "Lw5/a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lk4/h;

.field public final c:Lw3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/k<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lg5/b;


# direct methods
.method public constructor <init>(Lk4/b$a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lk4/b$a;->a(Lk4/b$a;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p1}, Lk4/b$a;->a(Lk4/b$a;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/internal/ImmutableList;->copyOf(Ljava/util/List;)Lcom/facebook/common/internal/ImmutableList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    iput-object v0, p0, Lk4/b;->a:Lcom/facebook/common/internal/ImmutableList;

    .line 6
    invoke-static {p1}, Lk4/b$a;->b(Lk4/b$a;)Lw3/k;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    invoke-static {p1}, Lk4/b$a;->b(Lk4/b$a;)Lw3/k;

    move-result-object v0

    goto :goto_1

    .line 8
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lw3/l;->a(Ljava/lang/Object;)Lw3/k;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lk4/b;->c:Lw3/k;

    .line 9
    invoke-static {p1}, Lk4/b$a;->d(Lk4/b$a;)Lk4/h;

    move-result-object v0

    iput-object v0, p0, Lk4/b;->b:Lk4/h;

    .line 10
    invoke-static {p1}, Lk4/b$a;->c(Lk4/b$a;)Lg5/b;

    move-result-object p1

    iput-object p1, p0, Lk4/b;->d:Lg5/b;

    return-void
.end method

.method public synthetic constructor <init>(Lk4/b$a;Lk4/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lk4/b;-><init>(Lk4/b$a;)V

    return-void
.end method

.method public static e()Lk4/b$a;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lk4/b$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lk4/b$a;-><init>()V

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


# virtual methods
.method public a()Lcom/facebook/common/internal/ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/common/internal/ImmutableList<",
            "Lw5/a;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lk4/b;->a:Lcom/facebook/common/internal/ImmutableList;

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
.end method

.method public b()Lw3/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw3/k<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lk4/b;->c:Lw3/k;

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
.end method

.method public c()Lg5/b;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lk4/b;->d:Lg5/b;

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
.end method

.method public d()Lk4/h;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lk4/b;->b:Lk4/h;

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
.end method
