.class public final Lcom/tencent/liteav/txcplayer/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/tencent/liteav/base/storage/PersistStorage;

.field public b:Lcom/tencent/liteav/base/storage/PersistStorage;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/liteav/txcplayer/a/c;->b:Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 9
    .line 10
    new-instance v1, Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p1}, Lcom/tencent/liteav/base/storage/PersistStorage;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    iput-object v1, p0, Lcom/tencent/liteav/txcplayer/a/c;->b:Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 16
    .line 17
    .line 18
    const-string/jumbo v2, "old_data_move_completed"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/base/storage/PersistStorage;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 28
    move-result v1

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    :cond_0
    new-instance v1, Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, p1, v3}, Lcom/tencent/liteav/base/storage/PersistStorage;-><init>(Ljava/lang/String;Z)V

    .line 37
    .line 38
    iput-object v1, p0, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/tencent/liteav/base/storage/PersistStorage;->getAllKeys()[Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object p1, p0, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/tencent/liteav/base/storage/PersistStorage;->getAllKeys()[Ljava/lang/String;

    .line 50
    move-result-object p1

    .line 51
    array-length p1, p1

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    return-void

    .line 56
    .line 57
    :cond_2
    :goto_0
    iput-object v0, p0, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 58
    .line 59
    iget-object p1, p0, Lcom/tencent/liteav/txcplayer/a/c;->b:Lcom/tencent/liteav/base/storage/PersistStorage;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v2, v3}, Lcom/tencent/liteav/base/storage/PersistStorage;->put(Ljava/lang/String;I)V

    .line 63
    return-void
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/txcplayer/a/c;->b:Lcom/tencent/liteav/base/storage/PersistStorage;

    invoke-virtual {v0}, Lcom/tencent/liteav/base/storage/PersistStorage;->commit()V

    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/tencent/liteav/base/storage/PersistStorage;->commit()V

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/base/storage/PersistStorage;->clear(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcplayer/a/c;->b:Lcom/tencent/liteav/base/storage/PersistStorage;

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/base/storage/PersistStorage;->clear(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcplayer/a/c;->b:Lcom/tencent/liteav/base/storage/PersistStorage;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/liteav/base/storage/PersistStorage;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Lcom/tencent/liteav/base/storage/PersistStorage;->clear(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcplayer/a/c;->b:Lcom/tencent/liteav/base/storage/PersistStorage;

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/base/storage/PersistStorage;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/base/storage/PersistStorage;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/tencent/liteav/txcplayer/a/c;->b:Lcom/tencent/liteav/base/storage/PersistStorage;

    invoke-virtual {v1, p1, v0}, Lcom/tencent/liteav/base/storage/PersistStorage;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    invoke-virtual {v1, p1}, Lcom/tencent/liteav/base/storage/PersistStorage;->clear(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/tencent/liteav/txcplayer/a/c;->b:Lcom/tencent/liteav/base/storage/PersistStorage;

    invoke-virtual {p1}, Lcom/tencent/liteav/base/storage/PersistStorage;->commit()V

    .line 7
    iget-object p1, p0, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    invoke-virtual {p1}, Lcom/tencent/liteav/base/storage/PersistStorage;->commit()V

    :cond_1
    return-object v0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b()[Ljava/lang/String;
    .locals 8

    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/txcplayer/a/c;->b:Lcom/tencent/liteav/base/storage/PersistStorage;

    invoke-virtual {v0}, Lcom/tencent/liteav/base/storage/PersistStorage;->getAllKeys()[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/liteav/txcplayer/a/c;->a:Lcom/tencent/liteav/base/storage/PersistStorage;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/tencent/liteav/base/storage/PersistStorage;->getAllKeys()[Ljava/lang/String;

    move-result-object v1

    .line 9
    :goto_0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    .line 10
    array-length v5, v0

    if-lez v5, :cond_1

    .line 11
    array-length v5, v0

    move v6, v4

    :goto_1
    if-ge v6, v5, :cond_1

    aget-object v7, v0, v6

    .line 12
    invoke-interface {v3, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_2

    .line 13
    array-length v0, v1

    if-lez v0, :cond_2

    .line 14
    array-length v0, v1

    :goto_2
    if-ge v4, v0, :cond_2

    aget-object v5, v1, v4

    .line 15
    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 16
    :cond_2
    const-string/jumbo v0, "old_data_move_completed"

    invoke-interface {v3, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 17
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v0

    if-nez v0, :cond_3

    return-object v2

    .line 18
    :cond_3
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    .line 19
    invoke-interface {v3, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    return-object v0
.end method
