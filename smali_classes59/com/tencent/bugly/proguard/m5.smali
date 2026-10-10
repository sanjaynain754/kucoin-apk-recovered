.class public Lcom/tencent/bugly/proguard/m5;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final g:Ljava/lang/String;

.field public static final h:Ljava/lang/String; = "exception"

.field public static final i:Ljava/lang/String; = "application_exit"

.field public static final j:Ljava/lang/String; = "exception"

.field public static final k:Ljava/lang/String; = "normal"

.field public static l:Lcom/tencent/bugly/proguard/m5;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lcom/tencent/bugly/common/meta/UserMeta;

.field public c:Lcom/tencent/bugly/proguard/l2;

.field public d:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/d2;->b()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sput-object v0, Lcom/tencent/bugly/proguard/m5;->g:Ljava/lang/String;

    .line 7
    return-void
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
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/m5;->d:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    .line 7
    .line 8
    const-string v0, ""

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/m5;->e:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/bugly/proguard/m5;->f:Ljava/lang/String;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static a()Lcom/tencent/bugly/proguard/m5;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/m5;->l:Lcom/tencent/bugly/proguard/m5;

    if-nez v0, :cond_0

    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/m5;

    monitor-enter v0

    .line 3
    :try_start_0
    new-instance v1, Lcom/tencent/bugly/proguard/m5;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/m5;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/m5;->l:Lcom/tencent/bugly/proguard/m5;

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
    sget-object v0, Lcom/tencent/bugly/proguard/m5;->l:Lcom/tencent/bugly/proguard/m5;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 5

    .line 6
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v1, :cond_0

    .line 8
    new-array p1, v2, [Ljava/lang/Object;

    const-string p2, "Exit file do not exist."

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v3

    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    .line 10
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 11
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ".zip"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 13
    invoke-static {v4, p1, v2}, Lcom/tencent/bugly/common/utils/FileUtil;->zipFiles(Ljava/util/List;Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 14
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 15
    :cond_1
    invoke-static {v0}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFile(Ljava/io/File;)V

    return-object v3
.end method

.method public a(I)V
    .locals 4

    .line 63
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/proguard/nf;->T:[Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/nf;->a([Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 64
    const-string/jumbo v1, "type"

    const-string/jumbo v2, "normal"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    const-string v1, "count"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 66
    iget-object p1, p0, Lcom/tencent/bugly/proguard/m5;->a:Landroid/content/Context;

    const-string v1, "exception"

    const-string v2, "application_exit"

    iget-object v3, p0, Lcom/tencent/bugly/proguard/m5;->b:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-static {p1, v1, v2, v3}, Lcom/tencent/bugly/proguard/nf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/meta/UserMeta;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 67
    :cond_0
    const-string v1, "Attributes"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    new-instance v0, Lcom/tencent/bugly/common/reporter/data/ReportData;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/m5;->b:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v1, v1, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    const-string v2, "ExitInfo"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2, p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V

    .line 69
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/tencent/bugly/proguard/m5;->f:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/m5;->d:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    invoke-virtual {v1, v0}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;->getMD5Params(Lcom/tencent/bugly/common/reporter/data/ReportData;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 70
    iget-object v1, p0, Lcom/tencent/bugly/proguard/m5;->d:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, p1, v2}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;->reportJson(Lcom/tencent/bugly/common/reporter/data/ReportData;Ljava/lang/String;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 71
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 5

    const-string/jumbo v0, "v1"

    .line 16
    :try_start_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/m5;->a:Landroid/content/Context;

    .line 17
    new-instance p1, Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-direct {p1}, Lcom/tencent/bugly/common/meta/UserMeta;-><init>()V

    iput-object p1, p0, Lcom/tencent/bugly/proguard/m5;->b:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 18
    iget-object p1, p0, Lcom/tencent/bugly/proguard/m5;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/m5;->c:Lcom/tencent/bugly/proguard/l2;

    .line 19
    iget-object v1, p0, Lcom/tencent/bugly/proguard/m5;->b:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->F()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    .line 20
    iget-object p1, p0, Lcom/tencent/bugly/proguard/m5;->b:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/m5;->c:Lcom/tencent/bugly/proguard/l2;

    iget-object v2, v1, Lcom/tencent/bugly/proguard/l2;->g0:Ljava/lang/String;

    iput-object v2, p1, Lcom/tencent/bugly/common/meta/UserMeta;->buildNumber:Ljava/lang/String;

    .line 21
    const-string/jumbo v2, "unknow_app_key"

    iput-object v2, p1, Lcom/tencent/bugly/common/meta/UserMeta;->appKey:Ljava/lang/String;

    .line 22
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p1, Lcom/tencent/bugly/common/meta/UserMeta;->appId:Ljava/lang/String;

    .line 23
    iget-object p1, p0, Lcom/tencent/bugly/proguard/m5;->b:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/m5;->c:Lcom/tencent/bugly/proguard/l2;

    iget-object v1, v1, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    iput-object v1, p1, Lcom/tencent/bugly/common/meta/UserMeta;->appVersion:Ljava/lang/String;

    .line 24
    invoke-static {}, Lcom/tencent/bugly/proguard/ig;->a()Lcom/tencent/bugly/proguard/ig;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/bugly/proguard/m5;->a:Landroid/content/Context;

    const-string v3, "RMonitor_SP"

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4}, Lcom/tencent/bugly/proguard/ig;->getSharedPreferences(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, p1, Lcom/tencent/bugly/common/meta/UserMeta;->sharePreference:Landroid/content/SharedPreferences;

    .line 25
    iget-object p1, p0, Lcom/tencent/bugly/proguard/m5;->b:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 26
    invoke-static {}, Lcom/tencent/bugly/proguard/ig;->a()Lcom/tencent/bugly/proguard/ig;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/bugly/proguard/m5;->a:Landroid/content/Context;

    const-string v3, "BUGLY_COMMON_VALUES"

    invoke-virtual {v1, v2, v3, v4}, Lcom/tencent/bugly/proguard/ig;->getSharedPreferences(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, p1, Lcom/tencent/bugly/common/meta/UserMeta;->crashSharedPreferences:Landroid/content/SharedPreferences;

    .line 27
    iget-object p1, p0, Lcom/tencent/bugly/proguard/m5;->b:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/m5;->c:Lcom/tencent/bugly/proguard/l2;

    iget-object v2, v1, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    iput-object v2, p1, Lcom/tencent/bugly/common/meta/UserMeta;->sdkVersion:Ljava/lang/String;

    .line 28
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tencent/bugly/common/meta/UserMeta;->setModel(Ljava/lang/String;)V

    .line 29
    iget-object p1, p0, Lcom/tencent/bugly/proguard/m5;->b:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/m5;->c:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tencent/bugly/common/meta/UserMeta;->setUniqueID(Ljava/lang/String;)V

    .line 30
    iget-object p1, p0, Lcom/tencent/bugly/proguard/m5;->b:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-static {}, Lcom/tencent/bugly/proguard/m7;->e()Lcom/tencent/bugly/common/meta/UserMeta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/bugly/common/meta/UserMeta;->getAppVersionMode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tencent/bugly/common/meta/UserMeta;->setAppVersionMode(Ljava/lang/String;)V

    .line 31
    new-instance p1, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/m5;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/tencent/bugly/proguard/m5;->c:Lcom/tencent/bugly/proguard/l2;

    .line 32
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v1, v2}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tencent/bugly/proguard/m5;->d:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    .line 33
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/tencent/bugly/proguard/m5;->g:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/tencent/bugly/proguard/m5;->a:Landroid/content/Context;

    .line 34
    invoke-static {v3}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v3

    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v3, "upload-file"

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/m5;->e:Ljava/lang/String;

    .line 35
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/m5;->a:Landroid/content/Context;

    .line 36
    invoke-static {v0}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "upload-json"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/m5;->f:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 37
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/k5;Ljava/lang/String;)V
    .locals 7

    const-string v0, "exception"

    .line 38
    :try_start_0
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k5;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 39
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k5;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lcom/tencent/bugly/proguard/m5;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_1

    :cond_0
    move-object p2, v2

    .line 40
    :goto_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 41
    sget-object v3, Lcom/tencent/bugly/proguard/nf;->T:[Ljava/lang/String;

    invoke-static {v3}, Lcom/tencent/bugly/proguard/nf;->a([Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 42
    const-string/jumbo v4, "process_id"

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k5;->e()I

    move-result v5

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 43
    const-string/jumbo v4, "process_name"

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k5;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    const-string v4, "exit_time"

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k5;->i()J

    move-result-wide v5

    invoke-virtual {v1, v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 45
    const-string/jumbo v4, "reason"

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k5;->g()I

    move-result v5

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 46
    const-string v4, "description"

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k5;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 47
    const-string v4, "crash_identify"

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k5;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    const-string v4, "importance"

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k5;->d()I

    move-result v5

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 49
    const-string/jumbo v4, "type"

    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 50
    const-string v4, "data"

    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    const-string/jumbo v1, "stage"

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k5;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k5;->j()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 53
    const-string v1, "biz_extend_info"

    new-instance v4, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k5;->j()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v3, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 54
    :cond_1
    iget-object p1, p0, Lcom/tencent/bugly/proguard/m5;->a:Landroid/content/Context;

    const-string v1, "application_exit"

    iget-object v4, p0, Lcom/tencent/bugly/proguard/m5;->b:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-static {p1, v0, v1, v4}, Lcom/tencent/bugly/proguard/nf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/meta/UserMeta;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_2

    .line 55
    :cond_2
    const-string v0, "Attributes"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 56
    new-instance v0, Lcom/tencent/bugly/common/reporter/data/ReportData;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/m5;->b:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v1, v1, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    const-string v3, "ExitInfo"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v3, p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V

    if-eqz p2, :cond_3

    .line 57
    invoke-virtual {p2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v4, v4}, Lcom/tencent/bugly/common/reporter/data/ReportData;->addFile(Ljava/lang/String;ZZ)V

    .line 58
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p2, p0, Lcom/tencent/bugly/proguard/m5;->e:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/tencent/bugly/proguard/m5;->d:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    invoke-virtual {p2, v0}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;->getMD5Params(Lcom/tencent/bugly/common/reporter/data/ReportData;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 59
    iget-object p2, p0, Lcom/tencent/bugly/proguard/m5;->d:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    invoke-virtual {p2, v0, p1, v2}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;->reportFile(Lcom/tencent/bugly/common/reporter/data/ReportData;Ljava/lang/String;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)V

    return-void

    .line 60
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p2, p0, Lcom/tencent/bugly/proguard/m5;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/tencent/bugly/proguard/m5;->d:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    invoke-virtual {p2, v0}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;->getMD5Params(Lcom/tencent/bugly/common/reporter/data/ReportData;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 61
    iget-object p2, p0, Lcom/tencent/bugly/proguard/m5;->d:Lcom/tencent/bugly/common/reporter/upload/UploadProxy;

    invoke-virtual {p2, v0, p1, v2}, Lcom/tencent/bugly/common/reporter/upload/UploadProxy;->reportJson(Lcom/tencent/bugly/common/reporter/data/ReportData;Ljava/lang/String;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 62
    :goto_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    :goto_2
    return-void
.end method
