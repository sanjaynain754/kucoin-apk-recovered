.class public Lcom/facebook/cache/disk/a$a;
.super Ljava/lang/Object;
.source "DefaultEntryEvictionComparatorSupplier.java"

# interfaces
.implements Lcom/facebook/cache/disk/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/cache/disk/a;->get()Lcom/facebook/cache/disk/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/facebook/cache/disk/a;


# direct methods
.method public constructor <init>(Lcom/facebook/cache/disk/a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/cache/disk/a$a;->b:Lcom/facebook/cache/disk/a;

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
.end method


# virtual methods
.method public a(Lcom/facebook/cache/disk/b$a;Lcom/facebook/cache/disk/b$a;)I
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lcom/facebook/cache/disk/b$a;->getTimestamp()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Lcom/facebook/cache/disk/b$a;->getTimestamp()J

    .line 8
    move-result-wide p1

    .line 9
    .line 10
    cmp-long v2, v0, p1

    .line 11
    .line 12
    if-gez v2, :cond_0

    .line 13
    const/4 p1, -0x1

    .line 14
    return p1

    .line 15
    .line 16
    :cond_0
    cmp-long p1, p1, v0

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    const/4 p1, 0x0

    .line 20
    return p1

    .line 21
    :cond_1
    const/4 p1, 0x1

    .line 22
    return p1
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

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/facebook/cache/disk/b$a;

    .line 3
    .line 4
    check-cast p2, Lcom/facebook/cache/disk/b$a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/facebook/cache/disk/a$a;->a(Lcom/facebook/cache/disk/b$a;Lcom/facebook/cache/disk/b$a;)I

    .line 8
    move-result p1

    .line 9
    return p1
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
