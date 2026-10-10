.class public Lcom/tencent/bugly/proguard/b4;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final k:Ljava/lang/String; = "CustomFileUploadManager"

.field public static final l:Ljava/lang/String; = "bugly_asan"

.field public static final m:Ljava/lang/String; = "bugly_asan_zip"

.field public static final n:Ljava/lang/String; = "asan_info_"

.field public static final o:Ljava/lang/String; = "asan_info.zip"

.field public static final p:Ljava/lang/String; = "custom_file_record.txt"

.field public static final q:Ljava/lang/String; = "bugly_custom_zips"

.field public static final r:Ljava/lang/String; = "/bugly_upload_file"

.field public static final s:Ljava/lang/String; = "/bugly_upload_zip"

.field public static final t:J = 0x240c8400L

.field public static final u:I = 0xa

.field public static final v:J = 0xa00000L

.field public static w:Lcom/tencent/bugly/proguard/b4; = null

.field public static final synthetic x:Z = true


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/Boolean;

.field public c:Lcom/tencent/bugly/proguard/l2;

.field public d:Lorg/json/JSONObject;

.field public e:Ljava/net/URL;

.field public f:Lcom/tencent/bugly/common/meta/UserMeta;

.field public g:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b4;->b:Ljava/lang/Boolean;

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b4;->d:Lorg/json/JSONObject;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b4;->e:Ljava/net/URL;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b4;->f:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b4;->g:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    .line 17
    .line 18
    const-string v0, ""

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b4;->h:Ljava/lang/String;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b4;->i:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lcom/tencent/bugly/proguard/d2;->b()Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b4;->j:Ljava/lang/String;

    .line 29
    return-void
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
.end method

.method public static synthetic a(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 80
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    const-string p1, ".jpg"

    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static c()Lcom/tencent/bugly/proguard/b4;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/b4;->w:Lcom/tencent/bugly/proguard/b4;

    if-nez v0, :cond_0

    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/b4;

    monitor-enter v0

    .line 3
    :try_start_0
    new-instance v1, Lcom/tencent/bugly/proguard/b4;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/b4;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/b4;->w:Lcom/tencent/bugly/proguard/b4;

    .line 4
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 5
    :cond_0
    :goto_0
    sget-object v0, Lcom/tencent/bugly/proguard/b4;->w:Lcom/tencent/bugly/proguard/b4;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/bugly_upload_file"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a()Lorg/json/JSONObject;
    .locals 3

    .line 19
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 20
    const-string/jumbo v1, "product_id"

    iget-object v2, p0, Lcom/tencent/bugly/proguard/b4;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 21
    const-string v1, "app_version"

    iget-object v2, p0, Lcom/tencent/bugly/proguard/b4;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v2

    iget-object v2, v2, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    const-string/jumbo v1, "sdk_version"

    iget-object v2, p0, Lcom/tencent/bugly/proguard/b4;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v2

    iget-object v2, v2, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    .line 23
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Landroid/content/Context;)V
    .locals 1

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "bugly_asan_zip"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/b4;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 9

    .line 64
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/b4;->c(Landroid/content/Context;)V

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 66
    const-string v1, "bugly_asan_zip"

    invoke-static {v0, p1, v1}, Lcom/tencent/bugly/proguard/xh;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 67
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 68
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 69
    array-length v1, v0

    if-nez v1, :cond_0

    goto :goto_3

    .line 70
    :cond_0
    :try_start_0
    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    .line 71
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    .line 72
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "asan_info.zip"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 73
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 74
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 75
    const-string v6, "crash"

    const-string v8, "common_file"

    invoke-virtual {p0, v7, v6, v8, v5}, Lcom/tencent/bugly/proguard/b4;->a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 76
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Successfully upload asan info file, identify is: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v6, v2, [Ljava/lang/Object;

    invoke-static {v5, v6}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 77
    invoke-static {v4}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFile(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 78
    :goto_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_2
    :goto_3
    return-void
.end method

.method public final a(Ljava/io/File;)V
    .locals 10

    .line 47
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_3

    .line 48
    :cond_0
    array-length v0, p1

    const/16 v1, 0xa

    const/4 v2, 0x0

    if-le v0, v1, :cond_1

    .line 49
    array-length v0, p1

    sub-int/2addr v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    .line 50
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 51
    invoke-static {p1}, Lcom/tencent/bugly/proguard/a7;->a([Ljava/io/File;)V

    .line 52
    array-length v1, p1

    :goto_1
    if-ge v2, v1, :cond_4

    aget-object v5, p1, v2

    if-lez v0, :cond_2

    .line 53
    invoke-static {v5}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFile(Ljava/io/File;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 54
    :cond_2
    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    move-result-wide v6

    sub-long v6, v3, v6

    const-wide/32 v8, 0x240c8400

    cmp-long v6, v6, v8

    if-lez v6, :cond_3

    .line 55
    invoke-static {v5}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFile(Ljava/io/File;)V

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_3
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 57
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 58
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    .line 59
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 60
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 61
    array-length p1, p1

    if-lez p1, :cond_1

    .line 62
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/b4;->a(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 63
    :goto_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 31
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 32
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 33
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 34
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 35
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    array-length v1, v1

    const/4 v2, 0x1

    if-lt v1, v2, :cond_2

    .line 36
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    .line 37
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 38
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    .line 39
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    .line 40
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".zip"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 41
    invoke-virtual {v3}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4, v1}, Lcom/tencent/bugly/common/utils/FileUtil;->zipFiles(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 42
    invoke-static {v3}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFile(Ljava/io/File;)V

    .line 43
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 44
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v4

    const-wide/32 v6, 0xa00000

    cmp-long v4, v4, v6

    if-lez v4, :cond_1

    .line 45
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 46
    :goto_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_2
    return-void
.end method

.method public final a(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 24
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "%"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ".zip"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    .line 25
    invoke-static {p1, p2, p3}, Lcom/tencent/bugly/common/utils/FileUtil;->zipFiles(Ljava/util/List;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 26
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/32 v2, 0xa00000

    cmp-long p2, v0, v2

    if-lez p2, :cond_0

    .line 28
    const-string p2, "attachment\'s size is too larger, more than 10MB, just delete it"

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p2, p3}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 29
    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 30
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b4;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "CustomFileManager.upload failed, please call init first"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 3
    :cond_0
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    new-array p1, v1, [Ljava/lang/Object;

    const-string/jumbo p2, "upload custom file failed, identify is empty."

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 5
    :cond_1
    invoke-virtual {p0, p2, p3}, Lcom/tencent/bugly/proguard/b4;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const/4 v2, 0x1

    .line 6
    :try_start_0
    sget-object v3, Lcom/tencent/bugly/proguard/nf;->T:[Ljava/lang/String;

    invoke-static {v3}, Lcom/tencent/bugly/proguard/nf;->a([Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 7
    const-string/jumbo v4, "token"

    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b4;->a:Landroid/content/Context;

    iget-object v4, p0, Lcom/tencent/bugly/proguard/b4;->f:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-static {v0, p2, p3, v4}, Lcom/tencent/bugly/proguard/nf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/meta/UserMeta;)Lorg/json/JSONObject;

    move-result-object p2

    if-nez p2, :cond_2

    .line 9
    const-string p1, "failed to build upload params, return."

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 10
    :cond_2
    sget-boolean v0, Lcom/tencent/bugly/proguard/l2;->H0:Z

    if-nez v0, :cond_3

    .line 11
    const-string v0, "crash_identify"

    invoke-virtual {v3, v0, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 12
    :cond_3
    const-string/jumbo v0, "process_launch_id"

    invoke-virtual {p2, v0, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 13
    :goto_0
    const-string p4, "Attributes"

    invoke-virtual {p2, p4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 14
    new-instance p4, Lcom/tencent/bugly/common/reporter/data/ReportData;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/b4;->f:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v0, v0, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    invoke-direct {p4, v0, v2, p3, p2}, Lcom/tencent/bugly/common/reporter/data/ReportData;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V

    .line 15
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1, v2, v1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->addFile(Ljava/lang/String;ZZ)V

    .line 16
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p2, p0, Lcom/tencent/bugly/proguard/b4;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/tencent/bugly/proguard/b4;->g:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    invoke-virtual {p2, p4}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;->getMD5Params(Lcom/tencent/bugly/common/reporter/data/ReportData;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 17
    iget-object p2, p0, Lcom/tencent/bugly/proguard/b4;->g:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    const/4 p3, 0x0

    invoke-virtual {p2, p4, p1, p3}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;->reportFile(Lcom/tencent/bugly/common/reporter/data/ReportData;Ljava/lang/String;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    .line 18
    :goto_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :goto_2
    return v2

    :cond_4
    return v1
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 21
    const-string v0, "asan_info_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0xa

    .line 22
    const-string v1, "."

    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    if-ltz v0, :cond_0

    if-ltz v1, :cond_0

    if-le v1, v0, :cond_0

    .line 23
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string/jumbo v0, "token"

    const-string v1, "code"

    const/4 v2, 0x0

    .line 8
    :try_start_0
    iget-object v3, p0, Lcom/tencent/bugly/proguard/b4;->e:Ljava/net/URL;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/tencent/bugly/proguard/b4;->d:Lorg/json/JSONObject;

    if-eqz v3, :cond_2

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 9
    const-string v4, "base_type"

    invoke-virtual {v3, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b4;->d:Lorg/json/JSONObject;

    const-string/jumbo v3, "sub_type"

    invoke-virtual {p1, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 11
    :cond_0
    :goto_0
    new-instance p1, Lcom/tencent/bugly/proguard/gg;

    iget-object p2, p0, Lcom/tencent/bugly/proguard/b4;->e:Ljava/net/URL;

    iget-object v3, p0, Lcom/tencent/bugly/proguard/b4;->d:Lorg/json/JSONObject;

    invoke-direct {p1, p2, v3}, Lcom/tencent/bugly/proguard/gg;-><init>(Ljava/net/URL;Lorg/json/JSONObject;)V

    .line 12
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/gg;->request()V

    .line 13
    iget-object p1, p1, Lcom/tencent/bugly/proguard/gg;->c:Lorg/json/JSONObject;

    if-nez p1, :cond_1

    return-object v2

    .line 14
    :cond_1
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 15
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p2

    if-nez p2, :cond_2

    .line 16
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 17
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    .line 18
    :goto_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_2
    return-object v2
.end method

.method public final b()Ljava/net/URL;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x200

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/b4;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    const-string v1, "/v1/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/proguard/b4;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    const-string v1, "/quota/check"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception v0

    .line 7
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Landroid/content/Context;)V
    .locals 2

    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/bugly_upload_file"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/b4;->a(Ljava/lang/String;)V

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/bugly_upload_zip"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/b4;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    .line 24
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/tencent/bugly/common/utils/HprofFileIUtil;->getOOMHprofPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".suc"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/tencent/bugly/common/utils/HprofFileIUtil;->getOOMHprofPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".hprof"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/tencent/bugly/common/utils/HprofFileIUtil;->getOOMHprofZipPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "oom_hprof.zip"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 27
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 28
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 29
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 30
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 31
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 32
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    .line 33
    :cond_0
    :goto_0
    new-instance v0, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v5

    invoke-virtual {v5}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, p1, v5}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 34
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b4;->a:Landroid/content/Context;

    const-string v5, "crash"

    const-string v6, "common_file"

    iget-object v7, p0, Lcom/tencent/bugly/proguard/b4;->f:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-static {p1, v5, v6, v7}, Lcom/tencent/bugly/proguard/nf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/meta/UserMeta;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    :try_start_1
    sget-boolean v5, Lcom/tencent/bugly/proguard/b4;->x:Z

    if-nez v5, :cond_2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :catch_0
    move-exception p1

    goto :goto_2

    .line 36
    :cond_2
    :goto_1
    const-string v5, "crash"

    const-string v6, "common_file"

    invoke-virtual {p0, v5, v6}, Lcom/tencent/bugly/proguard/b4;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 37
    sget-object v6, Lcom/tencent/bugly/proguard/nf;->T:[Ljava/lang/String;

    invoke-static {v6}, Lcom/tencent/bugly/proguard/nf;->a([Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 38
    const-string/jumbo v7, "token"

    invoke-virtual {v6, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    const-string v5, "Attributes"

    invoke-virtual {p1, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    const-string/jumbo v5, "process_launch_id"

    invoke-virtual {p1, v5, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    :try_start_2
    new-instance p2, Lcom/tencent/bugly/common/reporter/data/ReportData;

    const-class v5, Lcom/tencent/bugly/proguard/l2;

    monitor-enter v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    :try_start_3
    sget-object v6, Lcom/tencent/bugly/proguard/l2;->C0:Lcom/tencent/bugly/proguard/l2;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    monitor-exit v5

    .line 43
    invoke-virtual {v6}, Lcom/tencent/bugly/proguard/l2;->F()Ljava/lang/String;

    move-result-object v5

    const-string v6, "CrashUploadEvent"

    const/4 v7, 0x1

    invoke-direct {p2, v5, v7, v6, p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V

    .line 44
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    .line 46
    invoke-static {p1, v1, v2}, Lcom/tencent/bugly/common/utils/FileUtil;->zipFiles(Ljava/util/List;Ljava/lang/String;Z)Z

    .line 47
    invoke-virtual {p2, v1, v7, v7}, Lcom/tencent/bugly/common/reporter/data/ReportData;->addFile(Ljava/lang/String;ZZ)V

    .line 48
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/tencent/bugly/proguard/b4;->h:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/b4;->g:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    invoke-virtual {v1, p2}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;->getMD5Params(Lcom/tencent/bugly/common/reporter/data/ReportData;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    .line 49
    invoke-virtual {v0, p2, p1, v1}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;->reportFile(Lcom/tencent/bugly/common/reporter/data/ReportData;Ljava/lang/String;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)V

    .line 50
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 51
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    return-void

    :catchall_1
    move-exception p1

    monitor-exit v5

    throw p1

    .line 52
    :goto_2
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 53
    :goto_3
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "CustomFileUploadManager"

    invoke-virtual {p2, v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public final c(Landroid/content/Context;)V
    .locals 8

    .line 6
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "bugly_asan"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 8
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 10
    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 11
    array-length v2, v0

    if-nez v2, :cond_1

    goto/16 :goto_4

    .line 12
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "bugly_asan_zip"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 13
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_2

    .line 15
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    .line 16
    :cond_2
    :goto_0
    array-length p1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    if-ge v3, p1, :cond_7

    aget-object v4, v0, v3

    .line 17
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_2

    .line 18
    :cond_3
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    .line 19
    invoke-virtual {p0, v5}, Lcom/tencent/bugly/proguard/b4;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_4

    goto :goto_2

    .line 20
    :cond_4
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 21
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_5

    .line 22
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    .line 23
    :cond_5
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "asan_info.zip"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 24
    invoke-virtual {v4}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v7

    invoke-virtual {v7}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-static {v7, v6, v2}, Lcom/tencent/bugly/common/utils/FileUtil;->zipFiles(Ljava/util/List;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 25
    invoke-static {v4}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFile(Ljava/io/File;)V

    .line 26
    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "fetch and zip asan file "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", result: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 27
    :goto_3
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "failed to fetch and zip asan file."

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_7
    :goto_4
    return-void
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;)V
    .locals 10

    .line 30
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/tencent/bugly/common/utils/FileUtil;->getRootPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "bugly_replay"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/tencent/bugly/common/utils/FileUtil;->getRootPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "bugly_replay"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "replay.zip"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 32
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 33
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 34
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 35
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 36
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    .line 37
    :cond_0
    :goto_0
    new-instance v3, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v4

    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 38
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b4;->a:Landroid/content/Context;

    const-string v4, "crash"

    const-string v5, "common_file"

    iget-object v6, p0, Lcom/tencent/bugly/proguard/b4;->f:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-static {p1, v4, v5, v6}, Lcom/tencent/bugly/proguard/nf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/meta/UserMeta;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    :try_start_1
    sget-boolean v4, Lcom/tencent/bugly/proguard/b4;->x:Z

    if-nez v4, :cond_2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :catch_0
    move-exception p1

    goto/16 :goto_4

    .line 40
    :cond_2
    :goto_1
    const-string v4, "crash"

    const-string v5, "common_file"

    invoke-virtual {p0, v4, v5}, Lcom/tencent/bugly/proguard/b4;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 41
    sget-object v5, Lcom/tencent/bugly/proguard/nf;->T:[Ljava/lang/String;

    invoke-static {v5}, Lcom/tencent/bugly/proguard/nf;->a([Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 42
    const-string/jumbo v6, "token"

    invoke-virtual {v5, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    const-string v4, "Attributes"

    invoke-virtual {p1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    const-string/jumbo v4, "process_launch_id"

    invoke-virtual {p1, v4, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :try_start_2
    new-instance p2, Lcom/tencent/bugly/common/reporter/data/ReportData;

    const-class v4, Lcom/tencent/bugly/proguard/l2;

    monitor-enter v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    :try_start_3
    sget-object v5, Lcom/tencent/bugly/proguard/l2;->C0:Lcom/tencent/bugly/proguard/l2;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    monitor-exit v4

    .line 47
    invoke-virtual {v5}, Lcom/tencent/bugly/proguard/l2;->F()Ljava/lang/String;

    move-result-object v4

    const-string v5, "CrashUploadEvent"

    const/4 v6, 0x1

    invoke-direct {p2, v4, v6, v5, p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V

    .line 48
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 49
    new-instance v4, Lcom/tencent/bugly/proguard/aj;

    invoke-direct {v4}, Lcom/tencent/bugly/proguard/aj;-><init>()V

    invoke-virtual {v2, v4}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    .line 50
    array-length v7, v4

    if-lez v7, :cond_4

    .line 51
    array-length v7, v4

    move v8, v5

    :goto_2
    if-ge v8, v7, :cond_3

    aget-object v9, v4, v8

    .line 52
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 53
    :cond_3
    sget-object v7, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v9, "success add jpg files : "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v4, v4

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    goto :goto_3

    .line 54
    :cond_4
    sget-object v4, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v7, "fail to  add jpg files"

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 55
    :goto_3
    invoke-static {p1, v1, v5}, Lcom/tencent/bugly/common/utils/FileUtil;->zipFiles(Ljava/util/List;Ljava/lang/String;Z)Z

    .line 56
    invoke-virtual {p2, v1, v6, v6}, Lcom/tencent/bugly/common/reporter/data/ReportData;->addFile(Ljava/lang/String;ZZ)V

    .line 57
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/tencent/bugly/proguard/b4;->h:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/b4;->g:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    invoke-virtual {v1, p2}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;->getMD5Params(Lcom/tencent/bugly/common/reporter/data/ReportData;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    .line 58
    invoke-virtual {v3, p2, p1, v1}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;->reportFile(Lcom/tencent/bugly/common/reporter/data/ReportData;Ljava/lang/String;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)V

    .line 59
    invoke-static {v2}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFolder(Ljava/io/File;)V

    .line 60
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    return-void

    :catchall_1
    move-exception p1

    monitor-exit v4

    throw p1

    .line 61
    :goto_4
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 62
    :goto_5
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "CustomFileUploadManager"

    invoke-virtual {p2, v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    return-void
.end method

.method public c(Ljava/lang/String;)Z
    .locals 1

    .line 28
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 29
    iput-object p1, p0, Lcom/tencent/bugly/proguard/b4;->j:Ljava/lang/String;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(Landroid/content/Context;)V
    .locals 4

    .line 1
    :try_start_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/b4;->a:Landroid/content/Context;

    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/tencent/bugly/proguard/b4;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "bugly_custom_zips"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/b4;->i:Ljava/lang/String;

    .line 3
    new-instance p1, Ljava/io/File;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/b4;->i:Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/b4;->a(Ljava/io/File;)V

    .line 4
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b4;->a()Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/b4;->d:Lorg/json/JSONObject;

    .line 5
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b4;->b()Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/b4;->e:Ljava/net/URL;

    .line 6
    new-instance p1, Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-direct {p1}, Lcom/tencent/bugly/common/meta/UserMeta;-><init>()V

    iput-object p1, p0, Lcom/tencent/bugly/proguard/b4;->f:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 7
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b4;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/b4;->c:Lcom/tencent/bugly/proguard/l2;

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b4;->f:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->F()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    .line 9
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b4;->f:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/b4;->c:Lcom/tencent/bugly/proguard/l2;

    iget-object v1, v0, Lcom/tencent/bugly/proguard/l2;->g0:Ljava/lang/String;

    iput-object v1, p1, Lcom/tencent/bugly/common/meta/UserMeta;->buildNumber:Ljava/lang/String;

    .line 10
    const-string/jumbo v1, "unknow_app_key"

    iput-object v1, p1, Lcom/tencent/bugly/common/meta/UserMeta;->appKey:Ljava/lang/String;

    .line 11
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/common/meta/UserMeta;->appId:Ljava/lang/String;

    .line 12
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b4;->f:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/b4;->c:Lcom/tencent/bugly/proguard/l2;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    iput-object v0, p1, Lcom/tencent/bugly/common/meta/UserMeta;->appVersion:Ljava/lang/String;

    .line 13
    invoke-static {}, Lcom/tencent/bugly/proguard/ig;->a()Lcom/tencent/bugly/proguard/ig;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/bugly/proguard/b4;->a:Landroid/content/Context;

    const-string v2, "RMonitor_SP"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/bugly/proguard/ig;->getSharedPreferences(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/common/meta/UserMeta;->sharePreference:Landroid/content/SharedPreferences;

    .line 14
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b4;->f:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 15
    invoke-static {}, Lcom/tencent/bugly/proguard/ig;->a()Lcom/tencent/bugly/proguard/ig;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/bugly/proguard/b4;->a:Landroid/content/Context;

    const-string v2, "BUGLY_COMMON_VALUES"

    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/bugly/proguard/ig;->getSharedPreferences(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/common/meta/UserMeta;->crashSharedPreferences:Landroid/content/SharedPreferences;

    .line 16
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b4;->f:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/b4;->c:Lcom/tencent/bugly/proguard/l2;

    iget-object v1, v0, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    iput-object v1, p1, Lcom/tencent/bugly/common/meta/UserMeta;->sdkVersion:Ljava/lang/String;

    .line 17
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/common/meta/UserMeta;->setModel(Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b4;->f:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/b4;->c:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/common/meta/UserMeta;->setUniqueID(Ljava/lang/String;)V

    .line 19
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b4;->f:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-static {}, Lcom/tencent/bugly/proguard/m7;->e()Lcom/tencent/bugly/common/meta/UserMeta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/common/meta/UserMeta;->getAppVersionMode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/common/meta/UserMeta;->setAppVersionMode(Ljava/lang/String;)V

    .line 20
    new-instance p1, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/b4;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/b4;->c:Lcom/tencent/bugly/proguard/l2;

    .line 21
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tencent/bugly/proguard/b4;->g:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    .line 22
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/tencent/bugly/proguard/b4;->j:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/v1/"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/b4;->a:Landroid/content/Context;

    .line 23
    invoke-static {v0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/custom/upload-file"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/b4;->h:Ljava/lang/String;

    .line 24
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/tencent/bugly/proguard/b4;->b:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 25
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/bugly_upload_file"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/bugly_upload_zip"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 28
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/proguard/b4;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    array-length p1, p1

    if-lez p1, :cond_2

    .line 31
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    .line 32
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    .line 33
    const-string v5, "%"

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    if-lez v5, :cond_1

    .line 34
    invoke-virtual {v4, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    .line 35
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, -0x4

    invoke-virtual {v4, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 36
    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 37
    const-string/jumbo v5, "state_file"

    invoke-virtual {p0, v3, v6, v5, v4}, Lcom/tencent/bugly/proguard/b4;->a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 38
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Successfully upload process and thread record zip file, identify is: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v1, [Ljava/lang/Object;

    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 39
    invoke-static {v3}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFile(Ljava/io/File;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 40
    :cond_1
    invoke-static {v3}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFile(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 41
    :goto_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :cond_2
    return-void
.end method

.method public e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/b4;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/b4;->f(Landroid/content/Context;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/b4;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/b4;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/b4;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 16
    return-void
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
.end method

.method public f(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    .line 1
    .line 2
    new-instance v0, Ljava/io/File;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    const-string v1, "custom_file_record.txt"

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lcom/tencent/bugly/common/utils/FileUtil;->readOutputFromFile(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    const-string v1, ""

    .line 26
    const/4 v2, 0x0

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/common/utils/FileUtil;->writeFile(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 30
    .line 31
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b4;->b:Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    .line 40
    const-string/jumbo p1, "uploadLastCustomFiles failed, please call init first"

    .line 41
    .line 42
    new-array p2, v2, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :cond_0
    const-string v0, "######"

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 55
    move-result-object p1

    .line 56
    const/4 v0, 0x1

    .line 57
    .line 58
    if-eqz p1, :cond_2

    .line 59
    array-length v1, p1

    .line 60
    .line 61
    if-lt v1, v0, :cond_2

    .line 62
    array-length v1, p1

    .line 63
    move v3, v2

    .line 64
    .line 65
    :goto_0
    if-ge v3, v1, :cond_2

    .line 66
    .line 67
    aget-object v4, p1, v3

    .line 68
    .line 69
    const-string v5, "\n"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 73
    move-result-object v4

    .line 74
    .line 75
    if-eqz v4, :cond_1

    .line 76
    array-length v5, v4

    .line 77
    const/4 v6, 0x2

    .line 78
    .line 79
    if-lt v5, v6, :cond_1

    .line 80
    .line 81
    .line 82
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    move-result-object v4

    .line 84
    .line 85
    .line 86
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 87
    move-result v5

    .line 88
    .line 89
    .line 90
    invoke-interface {v4, v6, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 91
    move-result-object v5

    .line 92
    .line 93
    .line 94
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    move-result-object v6

    .line 96
    .line 97
    check-cast v6, Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    move-result-object v4

    .line 102
    .line 103
    check-cast v4, Ljava/lang/String;

    .line 104
    .line 105
    iget-object v7, p0, Lcom/tencent/bugly/proguard/b4;->i:Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v5, v6, v4, v7}, Lcom/tencent/bugly/proguard/b4;->a(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 111
    goto :goto_0

    .line 112
    .line 113
    :cond_2
    new-instance p1, Ljava/io/File;

    .line 114
    .line 115
    iget-object v1, p0, Lcom/tencent/bugly/proguard/b4;->i:Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 122
    move-result v1

    .line 123
    .line 124
    if-eqz v1, :cond_4

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 128
    move-result-object v1

    .line 129
    .line 130
    if-eqz v1, :cond_4

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 134
    move-result-object v1

    .line 135
    array-length v1, v1

    .line 136
    .line 137
    if-lt v1, v0, :cond_4

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 141
    move-result-object p1

    .line 142
    array-length v0, p1

    .line 143
    move v1, v2

    .line 144
    .line 145
    :goto_1
    if-ge v1, v0, :cond_4

    .line 146
    .line 147
    aget-object v3, p1, v1

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 151
    move-result-object v4

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 155
    move-result v5

    .line 156
    .line 157
    if-eqz v5, :cond_3

    .line 158
    .line 159
    const-string v5, "%"

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 163
    move-result v5

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 167
    move-result-object v4

    .line 168
    .line 169
    const-string v5, "custom_log"

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v3, v4, v5, p2}, Lcom/tencent/bugly/proguard/b4;->a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 173
    move-result v3

    .line 174
    .line 175
    if-eqz v3, :cond_3

    .line 176
    .line 177
    new-instance v3, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    const-string v4, "Successfully upload custom zip file, identify is: "

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    move-result-object v3

    .line 193
    .line 194
    new-array v4, v2, [Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    invoke-static {v3, v4}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    .line 199
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 200
    goto :goto_1

    .line 201
    .line 202
    .line 203
    :goto_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 204
    :cond_4
    return-void
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
