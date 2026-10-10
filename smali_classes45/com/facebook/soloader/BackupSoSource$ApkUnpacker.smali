.class public Lcom/facebook/soloader/BackupSoSource$ApkUnpacker;
.super Lcom/facebook/soloader/UnpackingSoSource$Unpacker;
.source "BackupSoSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/soloader/BackupSoSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ApkUnpacker"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/soloader/BackupSoSource;


# direct methods
.method public constructor <init>(Lcom/facebook/soloader/BackupSoSource;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/soloader/BackupSoSource$ApkUnpacker;->this$0:Lcom/facebook/soloader/BackupSoSource;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/facebook/soloader/UnpackingSoSource$Unpacker;-><init>()V

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
.method public getDsos()[Lcom/facebook/soloader/UnpackingSoSource$Dso;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/facebook/soloader/BackupSoSource$ApkUnpacker;->this$0:Lcom/facebook/soloader/BackupSoSource;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lcom/facebook/soloader/BackupSoSource;->access$000(Lcom/facebook/soloader/BackupSoSource;)Ljava/util/ArrayList;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Lcom/facebook/soloader/ExtractFromZipSoSource;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/facebook/soloader/ExtractFromZipSoSource;->makeUnpacker()Lcom/facebook/soloader/UnpackingSoSource$Unpacker;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    :try_start_0
    invoke-virtual {v2}, Lcom/facebook/soloader/UnpackingSoSource$Unpacker;->getDsos()[Lcom/facebook/soloader/UnpackingSoSource$Dso;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Lcom/facebook/soloader/UnpackingSoSource$Unpacker;->close()V

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    .line 52
    :try_start_1
    invoke-virtual {v2}, Lcom/facebook/soloader/UnpackingSoSource$Unpacker;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    goto :goto_1

    .line 54
    :catchall_1
    move-exception v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 58
    :cond_0
    :goto_1
    throw v0

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 62
    move-result v1

    .line 63
    .line 64
    new-array v1, v1, [Lcom/facebook/soloader/UnpackingSoSource$Dso;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    check-cast v0, [Lcom/facebook/soloader/UnpackingSoSource$Dso;

    .line 71
    return-object v0
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public unpack(Ljava/io/File;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/soloader/BackupSoSource$ApkUnpacker;->this$0:Lcom/facebook/soloader/BackupSoSource;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/soloader/BackupSoSource;->access$000(Lcom/facebook/soloader/BackupSoSource;)Ljava/util/ArrayList;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/facebook/soloader/ExtractFromZipSoSource;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/facebook/soloader/ExtractFromZipSoSource;->makeUnpacker()Lcom/facebook/soloader/UnpackingSoSource$Unpacker;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/facebook/soloader/ExtractFromZipSoSource$ZipUnpacker;

    .line 29
    .line 30
    .line 31
    :try_start_0
    invoke-virtual {v1, p1}, Lcom/facebook/soloader/ExtractFromZipSoSource$ZipUnpacker;->unpack(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/facebook/soloader/ExtractFromZipSoSource$ZipUnpacker;->close()V

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    .line 41
    :try_start_1
    invoke-virtual {v1}, Lcom/facebook/soloader/ExtractFromZipSoSource$ZipUnpacker;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    goto :goto_1

    .line 43
    :catchall_1
    move-exception v0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 47
    :cond_0
    :goto_1
    throw p1

    .line 48
    :cond_1
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
