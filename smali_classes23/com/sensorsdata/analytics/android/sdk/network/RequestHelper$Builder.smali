.class public Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;
.super Ljava/lang/Object;
.source "RequestHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private callBack:Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;

.field private headerMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private httpMethod:Lcom/sensorsdata/analytics/android/sdk/network/HttpMethod;

.field private httpUrl:Ljava/lang/String;

.field private jsonData:Ljava/lang/String;

.field private paramsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private retryCount:I


# direct methods
.method public constructor <init>(Lcom/sensorsdata/analytics/android/sdk/network/HttpMethod;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->retryCount:I

    .line 7
    .line 8
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->httpMethod:Lcom/sensorsdata/analytics/android/sdk/network/HttpMethod;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->httpUrl:Ljava/lang/String;

    .line 11
    return-void
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
.method public callback(Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;)Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->callBack:Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;

    .line 3
    return-object p0
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
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public execute()V
    .locals 9

    .line 1
    .line 2
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->httpMethod:Lcom/sensorsdata/analytics/android/sdk/network/HttpMethod;

    .line 3
    .line 4
    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/network/HttpMethod;->POST:Lcom/sensorsdata/analytics/android/sdk/network/HttpMethod;

    .line 5
    .line 6
    if-ne v1, v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->paramsMap:Ljava/util/Map;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v2, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;

    .line 13
    .line 14
    iget-object v3, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->httpUrl:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v4, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->jsonData:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v5, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->headerMap:Ljava/util/Map;

    .line 19
    .line 20
    iget v6, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->retryCount:I

    .line 21
    .line 22
    iget-object v7, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->callBack:Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;

    .line 23
    const/4 v8, 0x0

    .line 24
    .line 25
    .line 26
    invoke-direct/range {v2 .. v8}, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILcom/sensorsdata/analytics/android/sdk/network/HttpCallback;Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;)V

    .line 27
    return-void

    .line 28
    .line 29
    :cond_0
    new-instance v0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;

    .line 30
    .line 31
    iget-object v2, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->httpUrl:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->paramsMap:Ljava/util/Map;

    .line 34
    .line 35
    iget-object v4, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->headerMap:Ljava/util/Map;

    .line 36
    .line 37
    iget v5, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->retryCount:I

    .line 38
    .line 39
    iget-object v6, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->callBack:Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;

    .line 40
    const/4 v7, 0x0

    .line 41
    .line 42
    .line 43
    invoke-direct/range {v0 .. v7}, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper;-><init>(Lcom/sensorsdata/analytics/android/sdk/network/HttpMethod;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILcom/sensorsdata/analytics/android/sdk/network/HttpCallback;Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$1;)V

    .line 44
    return-void
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
.end method

.method public header(Ljava/util/Map;)Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->headerMap:Ljava/util/Map;

    .line 3
    return-object p0
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
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public jsonData(Ljava/lang/String;)Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->jsonData:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public params(Ljava/util/Map;)Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->paramsMap:Ljava/util/Map;

    .line 3
    return-object p0
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
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public retryCount(I)Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->retryCount:I

    .line 3
    return-object p0
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
    .line 21
    .line 22
    .line 23
    .line 24
.end method
