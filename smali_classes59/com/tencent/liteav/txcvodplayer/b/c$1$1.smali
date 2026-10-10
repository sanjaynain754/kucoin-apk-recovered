.class final Lcom/tencent/liteav/txcvodplayer/b/c$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/txcvodplayer/b/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/liteav/txcvodplayer/b/c$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/txcvodplayer/b/c$1;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/txcvodplayer/b/c$1;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b/c$1$1;->a:Lcom/tencent/liteav/txcvodplayer/b/c$1;

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
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/b/c$1$1;->a:Lcom/tencent/liteav/txcvodplayer/b/c$1;

    iget-object v0, v0, Lcom/tencent/liteav/txcvodplayer/b/c$1;->b:Lcom/tencent/liteav/txcvodplayer/b/c;

    new-instance v1, Lcom/tencent/liteav/txcvodplayer/b/c$1$1$2;

    invoke-direct {v1, p0}, Lcom/tencent/liteav/txcvodplayer/b/c$1$1$2;-><init>(Lcom/tencent/liteav/txcvodplayer/b/c$1$1;)V

    invoke-static {v0, v1}, Lcom/tencent/liteav/txcvodplayer/b/c;->a(Lcom/tencent/liteav/txcvodplayer/b/c;Ljava/lang/Runnable;)V

    .line 8
    const-string v0, ""

    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/b/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/c/a;->a()Lcom/tencent/liteav/txcvodplayer/c/a;

    move-result-object v0

    .line 10
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/b/c;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/txcvodplayer/c/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/b/c$1$1;->a:Lcom/tencent/liteav/txcvodplayer/b/c$1;

    iget-object v1, v0, Lcom/tencent/liteav/txcvodplayer/b/c$1;->b:Lcom/tencent/liteav/txcvodplayer/b/c;

    iget-object v0, v0, Lcom/tencent/liteav/txcvodplayer/b/c$1;->a:Lcom/tencent/liteav/txcvodplayer/b/c$a;

    invoke-static {v1, p1, p2, v0}, Lcom/tencent/liteav/txcvodplayer/b/c;->a(Lcom/tencent/liteav/txcvodplayer/b/c;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/liteav/txcvodplayer/b/c$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b/c$1$1;->a:Lcom/tencent/liteav/txcvodplayer/b/c$1;

    iget-object p1, p1, Lcom/tencent/liteav/txcvodplayer/b/c$1;->b:Lcom/tencent/liteav/txcvodplayer/b/c;

    new-instance p2, Lcom/tencent/liteav/txcvodplayer/b/c$1$1$1;

    invoke-direct {p2, p0}, Lcom/tencent/liteav/txcvodplayer/b/c$1$1$1;-><init>(Lcom/tencent/liteav/txcvodplayer/b/c$1$1;)V

    invoke-static {p1, p2}, Lcom/tencent/liteav/txcvodplayer/b/c;->a(Lcom/tencent/liteav/txcvodplayer/b/c;Ljava/lang/Runnable;)V

    .line 3
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b/c$1$1;->a:Lcom/tencent/liteav/txcvodplayer/b/c$1;

    iget-object p1, p1, Lcom/tencent/liteav/txcvodplayer/b/c$1;->b:Lcom/tencent/liteav/txcvodplayer/b/c;

    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/b/c;->b(Lcom/tencent/liteav/txcvodplayer/b/c;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/c/a;->a()Lcom/tencent/liteav/txcvodplayer/c/a;

    move-result-object p1

    .line 5
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/b/c$1$1;->a:Lcom/tencent/liteav/txcvodplayer/b/c$1;

    iget-object p2, p2, Lcom/tencent/liteav/txcvodplayer/b/c$1;->b:Lcom/tencent/liteav/txcvodplayer/b/c;

    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/b/c;->b(Lcom/tencent/liteav/txcvodplayer/b/c;)Ljava/util/List;

    move-result-object p2

    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/b/c$1$1;->a:Lcom/tencent/liteav/txcvodplayer/b/c$1;

    iget-object v0, v0, Lcom/tencent/liteav/txcvodplayer/b/c$1;->b:Lcom/tencent/liteav/txcvodplayer/b/c;

    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/b/c;->c(Lcom/tencent/liteav/txcvodplayer/b/c;)I

    move-result v0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/b/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    invoke-static {}, Lcom/tencent/liteav/txcvodplayer/b/c;->n()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/liteav/txcvodplayer/c/a;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
