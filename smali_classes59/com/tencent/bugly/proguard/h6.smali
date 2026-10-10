.class public Lcom/tencent/bugly/proguard/h6;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "RMonitor_FdLeak_kDumpHelper"

.field public static final b:[Lcom/tencent/bugly/proguard/x8;

.field public static final c:Ljava/lang/String; = "fd_dump_"


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/s6;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/s6;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/tencent/bugly/proguard/y6;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/tencent/bugly/proguard/y6;-><init>()V

    .line 11
    .line 12
    new-instance v2, Lcom/tencent/bugly/proguard/d6;

    .line 13
    .line 14
    .line 15
    invoke-direct {v2}, Lcom/tencent/bugly/proguard/d6;-><init>()V

    .line 16
    .line 17
    new-instance v3, Lcom/tencent/bugly/proguard/v6;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3}, Lcom/tencent/bugly/proguard/v6;-><init>()V

    .line 21
    const/4 v4, 0x4

    .line 22
    .line 23
    new-array v4, v4, [Lcom/tencent/bugly/proguard/x8;

    .line 24
    const/4 v5, 0x0

    .line 25
    .line 26
    aput-object v0, v4, v5

    .line 27
    const/4 v0, 0x1

    .line 28
    .line 29
    aput-object v1, v4, v0

    .line 30
    const/4 v0, 0x2

    .line 31
    .line 32
    aput-object v2, v4, v0

    .line 33
    const/4 v0, 0x3

    .line 34
    .line 35
    aput-object v3, v4, v0

    .line 36
    .line 37
    sput-object v4, Lcom/tencent/bugly/proguard/h6;->b:[Lcom/tencent/bugly/proguard/x8;

    .line 38
    return-void
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
.end method

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
.end method

.method public static a(ILcom/tencent/bugly/proguard/w8;)Lcom/tencent/bugly/proguard/i6;
    .locals 5

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1, p0}, Lcom/tencent/bugly/proguard/w8;->c(I)V

    .line 3
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/h6;->b:[Lcom/tencent/bugly/proguard/x8;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 4
    invoke-interface {v3}, Lcom/tencent/bugly/proguard/x8;->a()I

    move-result v4

    if-ne v4, p0, :cond_1

    .line 5
    invoke-static {}, Lcom/tencent/bugly/proguard/h6;->b()Ljava/io/File;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/tencent/bugly/proguard/h6;->a(ILjava/io/File;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lcom/tencent/bugly/proguard/x8;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/i6;

    move-result-object v0

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_3

    const/4 v0, 0x2

    .line 6
    invoke-static {p0, v0}, Lcom/tencent/bugly/proguard/i6;->a(II)Lcom/tencent/bugly/proguard/i6;

    move-result-object v0

    :cond_3
    if-eqz p1, :cond_4

    .line 7
    invoke-interface {p1, p0, v0}, Lcom/tencent/bugly/proguard/w8;->a(ILcom/tencent/bugly/proguard/i6;)V

    :cond_4
    return-object v0
.end method

.method public static a(ILjava/io/File;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    .line 27
    const-string p0, ""

    goto :goto_0

    .line 28
    :cond_0
    const-string p0, "fd_stacks.txt"

    goto :goto_0

    .line 29
    :cond_1
    const-string p0, "heap.hprof"

    goto :goto_0

    .line 30
    :cond_2
    const-string/jumbo p0, "threads.txt"

    goto :goto_0

    .line 31
    :cond_3
    const-string p0, "fd.txt"

    .line 32
    :goto_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 33
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/util/List;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eqz p1, :cond_0

    .line 17
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    return-object v1

    .line 20
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/h6;->c()Ljava/lang/String;

    move-result-object p1

    .line 21
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 23
    invoke-static {v2}, Lcom/tencent/rmonitor/common/util/FileUtil;->deleteFile(Ljava/io/File;)V

    :cond_2
    const/4 v2, 0x0

    .line 24
    invoke-static {v0, p1, v2}, Lcom/tencent/rmonitor/common/util/FileUtil;->zipFiles(Ljava/util/List;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 25
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 26
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/tencent/rmonitor/common/util/FileUtil;->deleteFile(Ljava/io/File;)V

    goto :goto_0

    :cond_3
    return-object p1

    :cond_4
    return-object v1
.end method

.method public static a(Lcom/tencent/bugly/proguard/w8;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/proguard/w8;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/i6;",
            ">;"
        }
    .end annotation

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lcom/tencent/bugly/proguard/h6;->b:[Lcom/tencent/bugly/proguard/x8;

    array-length v2, v1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    .line 10
    invoke-interface {v4}, Lcom/tencent/bugly/proguard/x8;->b()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p0, :cond_1

    .line 11
    invoke-interface {v4}, Lcom/tencent/bugly/proguard/x8;->a()I

    move-result v5

    invoke-interface {p0, v5}, Lcom/tencent/bugly/proguard/w8;->c(I)V

    .line 12
    :cond_1
    invoke-interface {v4}, Lcom/tencent/bugly/proguard/x8;->a()I

    move-result v5

    invoke-static {}, Lcom/tencent/bugly/proguard/h6;->b()Ljava/io/File;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tencent/bugly/proguard/h6;->a(ILjava/io/File;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lcom/tencent/bugly/proguard/x8;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/i6;

    move-result-object v5

    if-eqz p0, :cond_2

    .line 13
    invoke-interface {v4}, Lcom/tencent/bugly/proguard/x8;->a()I

    move-result v4

    invoke-interface {p0, v4, v5}, Lcom/tencent/bugly/proguard/w8;->a(ILcom/tencent/bugly/proguard/i6;)V

    .line 14
    :cond_2
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static a()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/h6;->b()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/rmonitor/common/util/FileUtil;->deleteFile(Ljava/io/File;)V

    return-void
.end method

.method public static b()Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->b()Ljava/io/File;

    move-result-object v1

    const-string v2, "dump_root"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Ljava/util/List;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/i6;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-eqz p0, :cond_4

    .line 2
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 3
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/i6;

    .line 5
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/s5;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/i6;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/i6;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_2
    :goto_1
    const-string v1, "RMonitor_FdLeak_kDumpHelper"

    const-string v2, "dump result error or dump file path is empty"

    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/fb;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_3
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/h6;->a(Ljava/util/List;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "fd_dump_"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    move-result-wide v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, ".zip"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    new-instance v1, Ljava/io/File;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->b()Ljava/io/File;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    const-string/jumbo v3, "zips"

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 36
    .line 37
    new-instance v2, Ljava/io/File;

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 44
    move-result-object v0

    .line 45
    return-object v0
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
.end method
