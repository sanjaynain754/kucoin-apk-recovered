.class public Lcom/tencent/bugly/proguard/x3;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/x3$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "RMonitor_custom"


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

.method public static b()Lcom/tencent/bugly/proguard/x3;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/x3$a;->a()Lcom/tencent/bugly/proguard/x3;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lcom/tencent/rmonitor/custom/a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/rmonitor/custom/a;
    .locals 3

    .line 22
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->customDataCollectorForIssue:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 23
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;->getListenerList()Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    .line 24
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 25
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/x3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/rmonitor/custom/a;->b()Lcom/tencent/rmonitor/custom/a;

    move-result-object v2

    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/rmonitor/base/plugin/listener/ICustomDataCollectorForIssue;

    .line 27
    invoke-interface {v1, p1, p2, v2}, Lcom/tencent/rmonitor/base/plugin/listener/ICustomDataCollectorForIssue;->collectCustomData(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/rmonitor/custom/ICustomDataEditorForIssue;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    return-object v2

    .line 28
    :goto_2
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "collectCustomDataForIssueInner, msg: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RMonitor_custom"

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    :cond_2
    return-object v2
.end method

.method public a(Lcom/tencent/bugly/common/reporter/data/ReportData;)V
    .locals 0

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/x3;->b(Lcom/tencent/bugly/common/reporter/data/ReportData;)Lorg/json/JSONObject;

    move-result-object p1

    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/x3;->a(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 4
    sget-object v0, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->INSTANCE:Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->getOperationLog()Lorg/json/JSONArray;

    move-result-object v0

    const-string/jumbo v1, "operation_log"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-void
.end method

.method public a(ZLcom/tencent/bugly/common/reporter/data/ReportData;)V
    .locals 2

    if-nez p2, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getPluginName()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/x3;->b(Lcom/tencent/bugly/common/reporter/data/ReportData;)Lorg/json/JSONObject;

    move-result-object p2

    .line 8
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/tencent/bugly/proguard/x3;->a(ZLjava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_0
    return-void
.end method

.method public a(ZLjava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 4

    .line 10
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    if-nez p4, :cond_0

    goto/16 :goto_3

    .line 11
    :cond_0
    sget-boolean v0, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    const-string v1, "RMonitor_custom"

    if-eqz v0, :cond_1

    .line 12
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "collectCustomData, pluginName: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", scene: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 13
    invoke-virtual {p0, p2, p3}, Lcom/tencent/bugly/proguard/x3;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/rmonitor/custom/a;

    move-result-object p1

    goto :goto_0

    .line 14
    :cond_2
    invoke-virtual {p0, p2, p3}, Lcom/tencent/bugly/proguard/x3;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/rmonitor/custom/a;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_3

    .line 15
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/x3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object p1

    .line 16
    :cond_3
    invoke-virtual {p1}, Lcom/tencent/rmonitor/custom/a;->h()Z

    move-result p2

    if-nez p2, :cond_5

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lcom/tencent/rmonitor/custom/a;->g()Lorg/json/JSONObject;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 18
    const-string/jumbo p3, "user_custom"

    invoke-virtual {p4, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    .line 19
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lcom/tencent/rmonitor/custom/a;->c()Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 20
    const-string p2, "biz_extend_info"

    invoke-virtual {p4, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 21
    :goto_2
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "collectCustomData, msg: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    :cond_5
    :goto_3
    return-void
.end method

.method public a(ZLjava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/tencent/bugly/proguard/x3;->a(ZLjava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/rmonitor/custom/a;
    .locals 3

    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->customDataCollector:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;->getListenerList()Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 5
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/x3;->a()Lcom/tencent/rmonitor/custom/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/rmonitor/custom/a;->b()Lcom/tencent/rmonitor/custom/a;

    move-result-object v2

    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/rmonitor/base/plugin/listener/ICustomDataCollector;

    .line 7
    invoke-interface {v1, p1, p2, v2}, Lcom/tencent/rmonitor/base/plugin/listener/ICustomDataCollector;->collectCustomData(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/rmonitor/custom/ICustomDataEditor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    return-object v2

    .line 8
    :goto_2
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "collectCustomDataForMetricInner, msg: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RMonitor_custom"

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    :cond_2
    return-object v2
.end method

.method public final b(Lcom/tencent/bugly/common/reporter/data/ReportData;)Lorg/json/JSONObject;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 9
    invoke-virtual {p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getParams()Lorg/json/JSONObject;

    move-result-object p1

    .line 10
    const-string v0, "Attributes"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_0

    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/nf;->a()Lorg/json/JSONObject;

    move-result-object v1

    .line 12
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-object v1
.end method
