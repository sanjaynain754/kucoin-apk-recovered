.class public Lcom/tencent/bugly/proguard/pf;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/of;


# instance fields
.field public final a:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/pf$a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/pf$a;-><init>(Lcom/tencent/bugly/proguard/pf;)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/pf;->a:Lkotlin/jvm/functions/Function0;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public a()Lcom/tencent/rmonitor/base/db/DBHandler;
    .locals 1

    .line 9
    sget-object v0, Lcom/tencent/rmonitor/base/meta/BaseInfo;->dbHelper:Lcom/tencent/rmonitor/base/db/DBHelper;

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/db/DBHelper;->getDbHandler()Lcom/tencent/rmonitor/base/db/DBHandler;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(I)Z
    .locals 1

    .line 1
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 v0, -0x2

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public a(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z
    .locals 1

    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/db/DBDataStatus;->SENT:Lcom/tencent/rmonitor/base/db/DBDataStatus;

    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/pf;->a(Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/rmonitor/base/db/DBDataStatus;)Z

    move-result p1

    return p1
.end method

.method public final a(Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/rmonitor/base/db/DBDataStatus;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/pf;->a()Lcom/tencent/rmonitor/base/db/DBHandler;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/pf;->e(Lcom/tencent/bugly/common/reporter/data/ReportData;)Lcom/tencent/rmonitor/base/db/table/ReportDataTable;

    move-result-object v2

    .line 5
    invoke-virtual {v2, p2}, Lcom/tencent/rmonitor/base/db/table/ReportDataTable;->setInsertStatus(Lcom/tencent/rmonitor/base/db/DBDataStatus;)V

    .line 6
    iget-object p2, p0, Lcom/tencent/bugly/proguard/pf;->a:Lkotlin/jvm/functions/Function0;

    invoke-virtual {v1, v2, p2}, Lcom/tencent/rmonitor/base/db/DBHandler;->insert(Lcom/tencent/rmonitor/base/db/BaseTable;Lkotlin/jvm/functions/Function0;)I

    move-result p2

    .line 7
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/pf;->a(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {p1, p2}, Lcom/tencent/bugly/common/reporter/data/ReportData;->setDbId(I)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public b(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getDbId()I

    .line 8
    move-result v1

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/pf;->d(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z

    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/pf;->e(Lcom/tencent/bugly/common/reporter/data/ReportData;)Lcom/tencent/rmonitor/base/db/table/ReportDataTable;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/pf;->a()Lcom/tencent/rmonitor/base/db/DBHandler;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/tencent/rmonitor/base/db/table/ReportDataTable;->makeContentValues()Landroid/content/ContentValues;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getDbId()I

    .line 33
    move-result v3

    .line 34
    .line 35
    .line 36
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    move-result-object v3

    .line 38
    .line 39
    const-string v4, "_id"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 43
    .line 44
    .line 45
    const-string/jumbo v3, "report_data"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v3, v4, v1}, Lcom/tencent/rmonitor/base/db/DBHandler;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)I

    .line 49
    move-result v1

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/pf;->a(I)Z

    .line 53
    move-result v2

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->setDbId(I)V

    .line 59
    const/4 p1, 0x1

    .line 60
    return p1

    .line 61
    :cond_2
    return v0
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
    .line 79
    .line 80
    .line 81
.end method

.method public c(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/pf;->e(Lcom/tencent/bugly/common/reporter/data/ReportData;)Lcom/tencent/rmonitor/base/db/table/ReportDataTable;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/pf;->a()Lcom/tencent/rmonitor/base/db/DBHandler;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/tencent/rmonitor/base/db/table/ReportDataTable;->getWhereAndArgs()Lkotlin/Pair;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    check-cast v3, Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    check-cast v1, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    const-string/jumbo v4, "report_data"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v4, v3, v1}, Lcom/tencent/rmonitor/base/db/DBHandler;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 37
    move-result v1

    .line 38
    .line 39
    if-lez v1, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/common/reporter/data/ReportData;->setDbId(I)V

    .line 43
    const/4 p1, 0x1

    .line 44
    return p1

    .line 45
    :cond_1
    return v0
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

.method public d(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/db/DBDataStatus;->TO_SEND:Lcom/tencent/rmonitor/base/db/DBDataStatus;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/pf;->a(Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/rmonitor/base/db/DBDataStatus;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
    .line 24
    .line 25
.end method

.method public e(Lcom/tencent/bugly/common/reporter/data/ReportData;)Lcom/tencent/rmonitor/base/db/table/ReportDataTable;
    .locals 4
    .param p1    # Lcom/tencent/bugly/common/reporter/data/ReportData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/base/db/table/ReportDataTable;

    .line 3
    .line 4
    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 5
    .line 6
    iget-object v2, v1, Lcom/tencent/bugly/common/meta/UserMeta;->appId:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    .line 13
    invoke-static {v3}, Lcom/tencent/bugly/common/utils/ProcessUtil;->getCurrentProcessName(Landroid/content/Context;)Ljava/lang/String;

    .line 14
    move-result-object v3

    .line 15
    .line 16
    iget-object v1, v1, Lcom/tencent/bugly/common/meta/UserMeta;->appVersion:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1, p1}, Lcom/tencent/rmonitor/base/db/table/ReportDataTable;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/reporter/data/ReportData;)V

    .line 20
    return-object v0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
