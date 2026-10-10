.class Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$2;
.super Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback$StringCallback;
.source "SensorsABTestApiRequestHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->requestExperiments(Ljava/util/Map;Ljava/lang/String;Lorg/json/JSONObject;Lcom/sensorsdata/abtest/core/IApiCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

.field final synthetic val$callBack:Lcom/sensorsdata/abtest/core/IApiCallback;


# direct methods
.method public constructor <init>(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Lcom/sensorsdata/abtest/core/IApiCallback;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$2;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$2;->val$callBack:Lcom/sensorsdata/abtest/core/IApiCallback;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback$StringCallback;-><init>()V

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
.method public onAfter()V
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
    .line 18
    .line 19
    .line 20
.end method

.method public onFailure(ILjava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$2;->val$callBack:Lcom/sensorsdata/abtest/core/IApiCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/sensorsdata/abtest/core/IApiCallback;->onFailure(ILjava/lang/String;)V

    .line 8
    :cond_0
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

.method public bridge synthetic onResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$2;->onResponse(Ljava/lang/String;)V

    return-void
.end method

.method public onResponse(Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$2;->val$callBack:Lcom/sensorsdata/abtest/core/IApiCallback;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Lcom/sensorsdata/abtest/core/IApiCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
