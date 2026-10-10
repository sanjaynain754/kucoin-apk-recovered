.class public Lnf0/a$a;
.super Ljava/lang/Object;
.source "LinkifyPlugin.java"

# interfaces
.implements Lcf0/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnf0/a;->configure(Lcf0/i$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcf0/i$a<",
        "Lio/noties/markwon/core/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lnf0/a;


# direct methods
.method public constructor <init>(Lnf0/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lnf0/a$a;->a:Lnf0/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method


# virtual methods
.method public a(Lio/noties/markwon/core/a;)V
    .locals 2
    .param p1    # Lio/noties/markwon/core/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lnf0/a$a;->a:Lnf0/a;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lnf0/a;->a(Lnf0/a;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lnf0/a$b;

    .line 11
    .line 12
    iget-object v1, p0, Lnf0/a$a;->a:Lnf0/a;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lnf0/a;->b(Lnf0/a;)I

    .line 16
    move-result v1

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Lnf0/a$b;-><init>(I)V

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lnf0/a$c;

    .line 23
    .line 24
    iget-object v1, p0, Lnf0/a$a;->a:Lnf0/a;

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lnf0/a;->b(Lnf0/a;)I

    .line 28
    move-result v1

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1}, Lnf0/a$c;-><init>(I)V

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {p1, v0}, Lio/noties/markwon/core/a;->d(Lio/noties/markwon/core/a$p;)Lio/noties/markwon/core/a;

    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public bridge synthetic apply(Lcf0/i;)V
    .locals 0
    .param p1    # Lcf0/i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    check-cast p1, Lio/noties/markwon/core/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lnf0/a$a;->a(Lio/noties/markwon/core/a;)V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method
