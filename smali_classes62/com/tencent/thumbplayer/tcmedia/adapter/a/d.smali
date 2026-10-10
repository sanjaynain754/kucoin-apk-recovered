.class public final Lcom/tencent/thumbplayer/tcmedia/adapter/a/d;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;Lcom/tencent/thumbplayer/tcmedia/e/b;)Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b/b;

    invoke-direct {v0, p0, p1}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/b/b;-><init>(Landroid/content/Context;Lcom/tencent/thumbplayer/tcmedia/e/b;)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;ZLcom/tencent/thumbplayer/tcmedia/e/b;)Lcom/tencent/thumbplayer/tcmedia/adapter/a/b;
    .locals 0

    .line 2
    if-eqz p1, :cond_0

    new-instance p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;

    invoke-direct {p1, p0, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/d;-><init>(Landroid/content/Context;Lcom/tencent/thumbplayer/tcmedia/e/b;)V

    return-object p1

    :cond_0
    new-instance p1, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;

    invoke-direct {p1, p0, p2}, Lcom/tencent/thumbplayer/tcmedia/adapter/a/a/e;-><init>(Landroid/content/Context;Lcom/tencent/thumbplayer/tcmedia/e/b;)V

    return-object p1
.end method
