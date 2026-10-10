.class Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$3;
.super Ljava/lang/Object;
.source "SensorsABTestApiRequestHelper.java"

# interfaces
.implements Lcom/sensorsdata/abtest/core/IApiCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->requestExperimentsAndUpdateCache(Ljava/util/Map;Ljava/lang/String;Lcom/sensorsdata/abtest/core/IApiCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sensorsdata/abtest/core/IApiCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

.field final synthetic val$callBack:Lcom/sensorsdata/abtest/core/IApiCallback;


# direct methods
.method public constructor <init>(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Lcom/sensorsdata/abtest/core/IApiCallback;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$3;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$3;->val$callBack:Lcom/sensorsdata/abtest/core/IApiCallback;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "onFailure error_code: "

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, ",message: "

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    const-string v1, "SAB.SensorsABTestApiRequestHelper"

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    iget-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$3;->val$callBack:Lcom/sensorsdata/abtest/core/IApiCallback;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, p1, p2}, Lcom/sensorsdata/abtest/core/IApiCallback;->onFailure(ILjava/lang/String;)V

    .line 39
    :cond_0
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$3;->onSuccess(Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 6

    .line 2
    const-string v0, "SAB.SensorsABTestApiRequestHelper"

    const/4 v1, 0x0

    :try_start_0
    const-string/jumbo v2, "\u8bd5\u9a8c\u8fd4\u56de\uff1aresponse\uff1a%s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    const-string/jumbo v3, "status"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 5
    const-string v4, "SUCCESS"

    invoke-static {v4, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 6
    const-string/jumbo v3, "\u83b7\u53d6\u8bd5\u9a8c\u6210\u529f\uff1aresults\uff1a%s"

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/sensorsdata/analytics/android/sdk/util/JSONUtils;->formatJson(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    const-string/jumbo v3, "results"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 8
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 9
    const-string v5, "experiments"

    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    const-string v3, "distinct_id"

    iget-object v5, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$3;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    invoke-static {v5}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->access$200(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    move-object v4, v1

    .line 11
    :goto_0
    invoke-static {}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->getInstance()Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;

    move-result-object v3

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    const-string v4, ""

    :goto_1
    invoke-virtual {v3, v4}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->loadExperimentsFromCache(Ljava/lang/String;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    .line 12
    invoke-static {}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->getInstance()Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;

    move-result-object v4

    const-string v5, "fuzzy_experiments"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->saveFuzzyExperiments(Lorg/json/JSONArray;)V

    goto :goto_2

    .line 13
    :cond_2
    const-string v4, "FAILED"

    invoke-static {v4, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 14
    const-string/jumbo v3, "\u83b7\u53d6\u8bd5\u9a8c\u5931\u8d25\uff1aerror_type\uff1a%s\uff0cerror\uff1a%s"

    const-string v4, "error_type"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "error"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v4, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    move-object v3, v1

    .line 15
    :goto_2
    iget-object v2, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$3;->val$callBack:Lcom/sensorsdata/abtest/core/IApiCallback;

    if-eqz v2, :cond_4

    .line 16
    invoke-interface {v2, v3}, Lcom/sensorsdata/abtest/core/IApiCallback;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 17
    :catch_0
    const-string/jumbo v2, "\u8bd5\u9a8c\u6570\u636e\u89e3\u6790\u5931\u8d25\uff0cresponse \uff1a%s\uff01"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$3;->val$callBack:Lcom/sensorsdata/abtest/core/IApiCallback;

    if-eqz p1, :cond_4

    .line 19
    invoke-interface {p1, v1}, Lcom/sensorsdata/abtest/core/IApiCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_4
    return-void
.end method
