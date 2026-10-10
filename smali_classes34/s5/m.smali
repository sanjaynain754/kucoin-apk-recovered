.class public Ls5/m;
.super Ljava/lang/Object;
.source "DynamicDefaultDiskStorageFactory.java"

# interfaces
.implements Ls5/l;


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
.end method


# virtual methods
.method public a(Lr3/b;)Lcom/facebook/cache/disk/b;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/cache/disk/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lr3/b;->l()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lr3/b;->c()Lw3/k;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lr3/b;->b()Ljava/lang/String;

    .line 14
    move-result-object v3

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lr3/b;->d()Lcom/facebook/cache/common/CacheErrorLogger;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/facebook/cache/disk/d;-><init>(ILw3/k;Ljava/lang/String;Lcom/facebook/cache/common/CacheErrorLogger;)V

    .line 22
    return-object v0
    .line 23
.end method
