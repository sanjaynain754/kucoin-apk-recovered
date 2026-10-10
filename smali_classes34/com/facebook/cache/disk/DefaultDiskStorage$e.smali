.class public Lcom/facebook/cache/disk/DefaultDiskStorage$e;
.super Ljava/lang/Object;
.source "DefaultDiskStorage.java"

# interfaces
.implements Lv3/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/cache/disk/DefaultDiskStorage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Lcom/facebook/cache/disk/DefaultDiskStorage;


# direct methods
.method public constructor <init>(Lcom/facebook/cache/disk/DefaultDiskStorage;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/facebook/cache/disk/DefaultDiskStorage$e;->b:Lcom/facebook/cache/disk/DefaultDiskStorage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/cache/disk/DefaultDiskStorage;Lr3/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/cache/disk/DefaultDiskStorage$e;-><init>(Lcom/facebook/cache/disk/DefaultDiskStorage;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/cache/disk/DefaultDiskStorage$e;->a:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/facebook/cache/disk/DefaultDiskStorage$e;->d(Ljava/io/File;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    .line 14
    .line 15
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public b(Ljava/io/File;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/cache/disk/DefaultDiskStorage$e;->b:Lcom/facebook/cache/disk/DefaultDiskStorage;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/cache/disk/DefaultDiskStorage;->j(Lcom/facebook/cache/disk/DefaultDiskStorage;)Ljava/io/File;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/facebook/cache/disk/DefaultDiskStorage$e;->a:Z

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 20
    .line 21
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/cache/disk/DefaultDiskStorage$e;->a:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lcom/facebook/cache/disk/DefaultDiskStorage$e;->b:Lcom/facebook/cache/disk/DefaultDiskStorage;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lcom/facebook/cache/disk/DefaultDiskStorage;->k(Lcom/facebook/cache/disk/DefaultDiskStorage;)Ljava/io/File;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 33
    move-result p1

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    const/4 p1, 0x0

    .line 37
    .line 38
    iput-boolean p1, p0, Lcom/facebook/cache/disk/DefaultDiskStorage$e;->a:Z

    .line 39
    :cond_1
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
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
.end method

.method public c(Ljava/io/File;)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/facebook/cache/disk/DefaultDiskStorage$e;->a:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/cache/disk/DefaultDiskStorage$e;->b:Lcom/facebook/cache/disk/DefaultDiskStorage;

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/facebook/cache/disk/DefaultDiskStorage;->k(Lcom/facebook/cache/disk/DefaultDiskStorage;)Ljava/io/File;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    const/4 p1, 0x1

    .line 18
    .line 19
    iput-boolean p1, p0, Lcom/facebook/cache/disk/DefaultDiskStorage$e;->a:Z

    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method public final d(Ljava/io/File;)Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/cache/disk/DefaultDiskStorage$e;->b:Lcom/facebook/cache/disk/DefaultDiskStorage;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/facebook/cache/disk/DefaultDiskStorage;->l(Lcom/facebook/cache/disk/DefaultDiskStorage;Ljava/io/File;)Lcom/facebook/cache/disk/DefaultDiskStorage$c;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return v1

    .line 11
    .line 12
    :cond_0
    iget-object v0, v0, Lcom/facebook/cache/disk/DefaultDiskStorage$c;->a:Ljava/lang/String;

    .line 13
    .line 14
    const-string v2, ".tmp"

    .line 15
    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/facebook/cache/disk/DefaultDiskStorage$e;->e(Ljava/io/File;)Z

    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    .line 23
    :cond_1
    const-string p1, ".cnt"

    .line 24
    const/4 v2, 0x1

    .line 25
    .line 26
    if-ne v0, p1, :cond_2

    .line 27
    move v1, v2

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-static {v1}, Lw3/h;->i(Z)V

    .line 31
    return v2
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
    .line 43
    .line 44
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
.end method

.method public final e(Ljava/io/File;)Z
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/cache/disk/DefaultDiskStorage$e;->b:Lcom/facebook/cache/disk/DefaultDiskStorage;

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lcom/facebook/cache/disk/DefaultDiskStorage;->i(Lcom/facebook/cache/disk/DefaultDiskStorage;)Lc4/a;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lc4/a;->now()J

    .line 14
    move-result-wide v2

    .line 15
    .line 16
    sget-wide v4, Lcom/facebook/cache/disk/DefaultDiskStorage;->g:J

    .line 17
    sub-long/2addr v2, v4

    .line 18
    .line 19
    cmp-long p1, v0, v2

    .line 20
    .line 21
    if-lez p1, :cond_0

    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
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
    .line 43
    .line 44
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
.end method
