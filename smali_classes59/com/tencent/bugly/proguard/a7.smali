.class public Lcom/tencent/bugly/proguard/a7;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:I = 0x2


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
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J
    .locals 3

    const-wide/16 v0, -0x1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    .line 33
    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "File name is null."

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-wide v0

    .line 34
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 35
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    .line 36
    invoke-virtual {p0, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p2

    .line 37
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-wide p0

    :catchall_0
    move-exception p0

    .line 38
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_1
    return-wide v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/util/Comparator;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JZ",
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 17
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_6

    if-nez p2, :cond_0

    goto :goto_4

    .line 18
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 19
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 21
    :try_start_0
    new-instance v3, Lcom/tencent/bugly/proguard/a7$a;

    invoke-direct {v3, p1, p2}, Lcom/tencent/bugly/proguard/a7$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 22
    array-length v3, v0

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p5, :cond_2

    sub-long v3, v5, p3

    move-object v1, p1

    move-object v2, p2

    .line 23
    invoke-static/range {v0 .. v6}, Lcom/tencent/bugly/proguard/a7;->a([Ljava/io/File;Ljava/lang/String;Ljava/lang/String;JJ)Ljava/util/List;

    move-result-object v0

    :goto_0
    move-object v7, v0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    sub-long/2addr v5, p3

    const-wide/16 v3, 0x0

    move-object v1, p1

    move-object v2, p2

    .line 24
    invoke-static/range {v0 .. v6}, Lcom/tencent/bugly/proguard/a7;->a([Ljava/io/File;Ljava/lang/String;Ljava/lang/String;JJ)Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_3
    :goto_1
    return-object v7

    .line 25
    :goto_2
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_4
    :goto_3
    if-eqz p6, :cond_5

    .line 26
    invoke-static {v7, p6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_5
    return-object v7

    .line 27
    :cond_6
    :goto_4
    filled-new-array/range {p1 .. p2}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "prefix %s and/or postfix %s is null."

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v7
.end method

.method public static a([Ljava/io/File;Ljava/lang/String;Ljava/lang/String;JJ)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJ)",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    .line 30
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    .line 31
    invoke-static {v4, p1, p2}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-gez v6, :cond_0

    goto :goto_1

    :cond_0
    cmp-long v6, p3, v4

    if-gtz v6, :cond_1

    cmp-long v4, v4, p5

    if-gtz v4, :cond_1

    .line 32
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 7

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    .line 11
    invoke-static/range {v0 .. v6}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    .line 12
    :try_start_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p1, 0x0

    move p2, p1

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/io/File;

    .line 13
    const-string p4, "File %s is to be deleted."

    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p4, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 14
    invoke-virtual {p3}, Ljava/io/File;->delete()Z

    move-result p3

    if-eqz p3, :cond_0

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 15
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Number of overdue trace files that has deleted: "

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p0, v0

    .line 16
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public static a([Ljava/io/File;)V
    .locals 1

    .line 49
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/a7$b;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/a7$b;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 50
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public static a(Ljava/io/File;Ljava/lang/String;JZ)Z
    .locals 8

    const/4 v1, 0x0

    if-nez p0, :cond_0

    return v1

    .line 1
    :cond_0
    :try_start_0
    new-instance v2, Ljava/io/BufferedWriter;

    new-instance v0, Ljava/io/FileWriter;

    invoke-direct {v0, p0, p4}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    invoke-direct {v2, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 2
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v4

    move-object v3, p1

    move-wide v6, p2

    invoke-static/range {v2 .. v7}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/io/Writer;Ljava/lang/String;JJ)Z

    move-result p0

    .line 3
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    .line 4
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    return v1
.end method

.method public static a(Ljava/io/Writer;Ljava/lang/String;JJ)Z
    .locals 7

    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    move-object v0, p0

    move-wide v3, p2

    move-wide v5, p4

    invoke-static/range {v0 .. v6}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/io/Writer;[CIJJ)Z

    move-result p0

    return p0
.end method

.method public static a(Ljava/io/Writer;[CIJJ)Z
    .locals 4

    cmp-long v0, p3, p5

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    return v1

    :cond_0
    mul-int/lit8 v0, p2, 0x2

    int-to-long v2, v0

    add-long/2addr v2, p3

    cmp-long v0, v2, p5

    if-gtz v0, :cond_1

    .line 6
    :try_start_0
    invoke-virtual {p0, p1, v1, p2}, Ljava/io/Writer;->write([CII)V

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_1
    sub-long/2addr p5, p3

    const-wide/16 p2, 0x2

    .line 7
    div-long/2addr p5, p2

    long-to-int p2, p5

    .line 8
    invoke-virtual {p0, p1, v1, p2}, Ljava/io/Writer;->write([CII)V

    .line 9
    :goto_0
    invoke-virtual {p0}, Ljava/io/Writer;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    .line 10
    :goto_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    return v1
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 6

    .line 39
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "rqdp{  sv sd start} %s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 40
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_3

    .line 41
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 42
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_2

    .line 43
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 44
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 45
    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    :cond_2
    int-to-long v2, p2

    .line 46
    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v4

    cmp-long p0, v4, v2

    if-gez p0, :cond_3

    const/4 p0, 0x1

    goto :goto_1

    :cond_3
    move p0, v0

    :goto_1
    invoke-static {v1, p1, v2, v3, p0}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/io/File;Ljava/lang/String;JZ)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    .line 47
    :goto_2
    sget-object p1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 48
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    :goto_3
    return v0
.end method
