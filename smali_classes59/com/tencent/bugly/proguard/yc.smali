.class public Lcom/tencent/bugly/proguard/yc;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "RMonitor_NatMem_Reporter"

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static d:Lcom/tencent/bugly/proguard/pf;

.field public static e:Lcom/tencent/bugly/common/reporter/data/ReportData;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/pf;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/pf;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/yc;->d:Lcom/tencent/bugly/proguard/pf;

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/bugly/proguard/yc;->e:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
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

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 8

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-static {p0}, Lcom/tencent/bugly/proguard/yc;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    :cond_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/yc;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    :cond_1
    invoke-static {p2}, Lcom/tencent/bugly/proguard/yc;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/tencent/bugly/proguard/ic;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "dump_NatMem_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".zip"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 11
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 13
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_3
    const/4 v2, 0x0

    .line 14
    invoke-static {v0, v1, v2}, Lcom/tencent/rmonitor/common/util/FileUtil;->zipFiles(Ljava/util/List;Ljava/lang/String;Z)Z

    move-result v0

    const-string v3, "RMonitor_NatMem_Reporter"

    if-nez v0, :cond_4

    .line 15
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p1, "dump zip file failed!"

    filled-new-array {v3, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void

    .line 16
    :cond_4
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/nf;->a()Lorg/json/JSONObject;

    move-result-object v0

    .line 17
    const-string/jumbo v4, "process_name"

    sget-object v5, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    invoke-static {v5}, Lcom/tencent/rmonitor/common/util/AppInfo;->obtainProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    const-string v4, "is64bit"

    sget-object v5, Lcom/tencent/rmonitor/base/meta/BaseInfo;->is64Bit:Ljava/lang/Boolean;

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    const-string v4, "fileObj"

    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    const-string/jumbo v4, "stage"

    invoke-static {}, Lcom/tencent/bugly/proguard/g;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "memory_type"

    const/4 v5, 0x1

    if-ne p3, v5, :cond_5

    .line 21
    :try_start_1
    const-string/jumbo p3, "vmsize"

    invoke-virtual {v0, v4, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catch_0
    move-exception p0

    goto/16 :goto_1

    :cond_5
    const/4 v6, 0x2

    if-ne p3, v6, :cond_6

    .line 22
    const-string/jumbo p3, "physical"

    invoke-virtual {v0, v4, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    :cond_6
    :goto_0
    const-string p3, "max_physical_pss"

    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    move-result-object v4

    invoke-virtual {v4}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->a()Lcom/tencent/bugly/proguard/wc;

    move-result-object v4

    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/wc;->h()J

    move-result-wide v6

    invoke-virtual {v0, p3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 24
    const-string p3, "max_vitural_vss"

    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    move-result-object v4

    invoke-virtual {v4}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->a()Lcom/tencent/bugly/proguard/wc;

    move-result-object v4

    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/wc;->i()J

    move-result-wide v6

    invoke-virtual {v0, p3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 25
    const-string p3, "app_min_size"

    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    move-result-object v4

    invoke-virtual {v4}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->a()Lcom/tencent/bugly/proguard/wc;

    move-result-object v4

    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/wc;->d()I

    move-result v4

    invoke-virtual {v0, p3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 26
    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    .line 27
    const-string v4, "mem_ceiling_info"

    invoke-virtual {p3, v4, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 28
    const-string v4, "mem_history_info"

    invoke-virtual {p3, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 29
    const-string/jumbo p1, "smaps_info"

    invoke-virtual {p3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    const-string p1, "file_stacks"

    invoke-virtual {p3, p1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 31
    sget-object p0, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    const-string p1, "memory"

    const-string/jumbo p2, "native_memory"

    sget-object v4, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-static {p0, p1, p2, v4}, Lcom/tencent/bugly/proguard/nf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/meta/UserMeta;)Lorg/json/JSONObject;

    move-result-object p0

    .line 32
    const-string p1, "Attributes"

    invoke-virtual {p0, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 33
    const-string p1, "Body"

    invoke-virtual {p0, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    const-string/jumbo p1, "stack_structure_type"

    invoke-virtual {p0, p1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 35
    sget-object p1, Lcom/tencent/bugly/proguard/yc;->e:Lcom/tencent/bugly/common/reporter/data/ReportData;

    if-nez p1, :cond_7

    .line 36
    new-instance p1, Lcom/tencent/bugly/common/reporter/data/ReportData;

    iget-object p2, v4, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    const-string p3, "NatMem"

    invoke-direct {p1, p2, v5, p3, p0}, Lcom/tencent/bugly/common/reporter/data/ReportData;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V

    sput-object p1, Lcom/tencent/bugly/proguard/yc;->e:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 37
    invoke-virtual {p1, v1, v5, v5}, Lcom/tencent/bugly/common/reporter/data/ReportData;->addFile(Ljava/lang/String;ZZ)V

    .line 38
    sget-object p1, Lcom/tencent/bugly/proguard/yc;->d:Lcom/tencent/bugly/proguard/pf;

    sget-object p2, Lcom/tencent/bugly/proguard/yc;->e:Lcom/tencent/bugly/common/reporter/data/ReportData;

    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/pf;->d(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z

    .line 39
    :cond_7
    sget-object p1, Lcom/tencent/bugly/proguard/yc;->e:Lcom/tencent/bugly/common/reporter/data/ReportData;

    invoke-virtual {p1, p0}, Lcom/tencent/bugly/common/reporter/data/ReportData;->setParams(Lorg/json/JSONObject;)V

    .line 40
    sget-object p0, Lcom/tencent/bugly/proguard/yc;->e:Lcom/tencent/bugly/common/reporter/data/ReportData;

    invoke-virtual {p0, v5}, Lcom/tencent/bugly/common/reporter/data/ReportData;->setShouldRecordLinkData(Z)V

    .line 41
    invoke-static {}, Lcom/tencent/bugly/proguard/x3$a;->a()Lcom/tencent/bugly/proguard/x3;

    move-result-object p0

    .line 42
    sget-object p1, Lcom/tencent/bugly/proguard/yc;->e:Lcom/tencent/bugly/common/reporter/data/ReportData;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/x3;->a(Lcom/tencent/bugly/common/reporter/data/ReportData;)V

    .line 43
    invoke-static {}, Lcom/tencent/bugly/proguard/x3$a;->a()Lcom/tencent/bugly/proguard/x3;

    move-result-object p0

    .line 44
    sget-object p1, Lcom/tencent/bugly/proguard/yc;->e:Lcom/tencent/bugly/common/reporter/data/ReportData;

    invoke-virtual {p0, v2, p1}, Lcom/tencent/bugly/proguard/x3;->a(ZLcom/tencent/bugly/common/reporter/data/ReportData;)V

    .line 45
    sget-object p0, Lcom/tencent/bugly/proguard/yc;->d:Lcom/tencent/bugly/proguard/pf;

    sget-object p1, Lcom/tencent/bugly/proguard/yc;->e:Lcom/tencent/bugly/common/reporter/data/ReportData;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/pf;->b(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    .line 46
    :goto_1
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-virtual {p1, v3, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 1

    if-eqz p0, :cond_0

    .line 1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
