.class public Lcom/tencent/bugly/proguard/ih;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "TrafficReport"

.field public static final synthetic b:Z = true


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

.method public static a(ILjava/util/ArrayList;Ljava/util/List;)Lorg/json/JSONObject;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e;",
            ">;)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    move/from16 v0, p0

    .line 1
    sget-object v1, Lcom/tencent/bugly/proguard/nf;->T:[Ljava/lang/String;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/nf;->a([Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 2
    sget-object v2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    .line 3
    invoke-static {v2}, Lcom/tencent/rmonitor/common/util/AppInfo;->obtainProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 4
    const-string/jumbo v3, "process_name"

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 5
    sget-object v2, Lcom/tencent/bugly/traffic/TrafficMonitor;->z:Ljava/lang/String;

    const-string/jumbo v3, "operator"

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 6
    const-string/jumbo v2, "report_type"

    const/4 v3, 0x2

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 7
    const-string v2, "exception_type"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const/4 v2, 0x0

    const-string/jumbo v3, "traffic_detail"

    if-eqz v0, :cond_0

    .line 8
    invoke-static {}, Lcom/tencent/bugly/proguard/x3$a;->a()Lcom/tencent/bugly/proguard/x3;

    move-result-object v4

    .line 9
    invoke-virtual {v4, v1}, Lcom/tencent/bugly/proguard/x3;->a(Lorg/json/JSONObject;)V

    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/x3$a;->a()Lcom/tencent/bugly/proguard/x3;

    move-result-object v4

    .line 11
    invoke-virtual {v4, v2, v3, v1}, Lcom/tencent/bugly/proguard/x3;->a(ZLjava/lang/String;Lorg/json/JSONObject;)V

    goto :goto_0

    .line 12
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/x3$a;->a()Lcom/tencent/bugly/proguard/x3;

    move-result-object v4

    const/4 v5, 0x1

    .line 13
    invoke-virtual {v4, v5, v3, v1}, Lcom/tencent/bugly/proguard/x3;->a(ZLjava/lang/String;Lorg/json/JSONObject;)V

    .line 14
    :goto_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 15
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 16
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v8, "http"

    const-string/jumbo v9, "tcp"

    const-string/jumbo v10, "recv"

    const-string/jumbo v11, "send"

    const-string/jumbo v12, "net_type"

    const-string v13, "front_state"

    const-string/jumbo v14, "peer_name"

    const-string/jumbo v15, "traffic_type"

    const-string v2, "collect_type"

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tencent/bugly/proguard/e;

    .line 17
    invoke-virtual {v7}, Lcom/tencent/bugly/proguard/e;->b()Ljava/util/Map;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_1

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/util/Map$Entry;

    .line 18
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 19
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 p2, v6

    move-object/from16 v6, v18

    check-cast v6, Lcom/tencent/bugly/traffic/TrafficMsg;

    iget-object v6, v6, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    .line 20
    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 21
    invoke-virtual {v0, v15, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v14, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    invoke-virtual {v7}, Lcom/tencent/bugly/proguard/e;->f()I

    move-result v6

    invoke-static {v6}, Lcom/tencent/bugly/proguard/jh;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 24
    invoke-virtual {v0, v13, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    invoke-virtual {v7}, Lcom/tencent/bugly/proguard/e;->g()I

    move-result v6

    invoke-static {v6}, Lcom/tencent/bugly/proguard/jh;->b(I)Ljava/lang/String;

    move-result-object v6

    .line 26
    invoke-virtual {v0, v12, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/tencent/bugly/traffic/TrafficMsg;

    iget v6, v6, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    invoke-virtual {v0, v11, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 28
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/tencent/bugly/traffic/TrafficMsg;

    iget v6, v6, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    invoke-virtual {v0, v10, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 29
    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move/from16 v0, p0

    move-object/from16 v6, p2

    goto :goto_2

    :cond_1
    move-object/from16 p2, v6

    .line 30
    invoke-virtual {v7}, Lcom/tencent/bugly/proguard/e;->d()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 31
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 32
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v0

    move-object/from16 v0, v16

    check-cast v0, Lcom/tencent/bugly/traffic/TrafficMsg;

    iget-object v0, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    .line 33
    invoke-virtual {v9, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    invoke-virtual {v9, v15, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v9, v14, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    invoke-virtual {v7}, Lcom/tencent/bugly/proguard/e;->f()I

    move-result v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/jh;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 37
    invoke-virtual {v9, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 38
    invoke-virtual {v7}, Lcom/tencent/bugly/proguard/e;->g()I

    move-result v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/jh;->b(I)Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-virtual {v9, v12, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/traffic/TrafficMsg;

    iget v0, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    invoke-virtual {v9, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 41
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/traffic/TrafficMsg;

    iget v0, v0, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    invoke-virtual {v9, v10, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 42
    invoke-virtual {v5, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-object/from16 v0, v17

    goto :goto_3

    :cond_2
    move/from16 v0, p0

    move-object/from16 v6, p2

    const/4 v2, 0x0

    goto/16 :goto_1

    .line 43
    :cond_3
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-gtz v0, :cond_4

    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_4
    const-string/jumbo v0, "metrics"

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p0, :cond_7

    .line 45
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 46
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/tencent/bugly/traffic/TrafficMsg;

    .line 47
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    move-object/from16 p0, v5

    .line 48
    iget-object v5, v6, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    invoke-virtual {v7, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 49
    iget-object v5, v6, Lcom/tencent/bugly/traffic/TrafficMsg;->mCollectType:Ljava/lang/String;

    move-object/from16 p2, v2

    const-string v2, "auto"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object v2, v9

    goto :goto_5

    :cond_5
    move-object v2, v8

    .line 50
    :goto_5
    invoke-virtual {v7, v15, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    iget-object v2, v6, Lcom/tencent/bugly/traffic/TrafficMsg;->mHost:Ljava/lang/String;

    invoke-virtual {v7, v14, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    iget v2, v6, Lcom/tencent/bugly/traffic/TrafficMsg;->mFore:I

    .line 53
    invoke-static {v2}, Lcom/tencent/bugly/proguard/jh;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 54
    invoke-virtual {v7, v13, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 55
    iget v2, v6, Lcom/tencent/bugly/traffic/TrafficMsg;->mNet:I

    .line 56
    invoke-static {v2}, Lcom/tencent/bugly/proguard/jh;->b(I)Ljava/lang/String;

    move-result-object v2

    .line 57
    invoke-virtual {v7, v12, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 58
    iget v2, v6, Lcom/tencent/bugly/traffic/TrafficMsg;->mTx:I

    invoke-virtual {v7, v11, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 59
    iget v2, v6, Lcom/tencent/bugly/traffic/TrafficMsg;->mRx:I

    invoke-virtual {v7, v10, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 60
    const-string/jumbo v2, "start_time"

    const/4 v5, 0x0

    invoke-virtual {v7, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 61
    iget-wide v5, v6, Lcom/tencent/bugly/traffic/TrafficMsg;->mTime:J

    const-string v2, "end_time"

    invoke-virtual {v7, v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 62
    invoke-virtual {v0, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-object/from16 v5, p0

    move-object/from16 v2, p2

    goto :goto_4

    .line 63
    :cond_6
    const-string v2, "connection_details"

    invoke-virtual {v4, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    :cond_7
    sget-object v0, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    sget-object v2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    const-string/jumbo v5, "resource"

    invoke-static {v0, v5, v3, v2}, Lcom/tencent/bugly/proguard/nf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/meta/UserMeta;)Lorg/json/JSONObject;

    move-result-object v0

    .line 65
    sget-boolean v2, Lcom/tencent/bugly/proguard/ih;->b:Z

    if-nez v2, :cond_9

    if-eqz v0, :cond_8

    goto :goto_6

    :cond_8
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 66
    :cond_9
    :goto_6
    const-string v2, "Attributes"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    const-string v1, "Body"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method public static a(Lorg/json/JSONObject;)V
    .locals 4

    .line 68
    new-instance v0, Lcom/tencent/bugly/common/reporter/data/ReportData;

    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v1, v1, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    const/4 v2, 0x1

    const-string/jumbo v3, "traffic_detail"

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/tencent/bugly/common/reporter/data/ReportData;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V

    .line 69
    invoke-virtual {v0}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getReportStrategy()Lcom/tencent/bugly/common/reporter/data/ReportStrategy;

    move-result-object p0

    sget-object v1, Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;->UPLOAD_ANY:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;

    invoke-virtual {p0, v1}, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->setUploadStrategy(Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;)V

    .line 70
    sget-object p0, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/ReporterMachine;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->reportNow(Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)Z

    return-void
.end method

.method public static b(ILjava/util/ArrayList;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/traffic/TrafficMsg;",
            ">;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    :try_start_0
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/ih;->a(ILjava/util/ArrayList;Ljava/util/List;)Lorg/json/JSONObject;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ih;->a(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    .line 20
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 21
    .line 22
    const-string p2, "TrafficReport"

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    :cond_1
    :goto_0
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
