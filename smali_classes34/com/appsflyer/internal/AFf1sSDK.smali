.class public final Lcom/appsflyer/internal/AFf1sSDK;
.super Lcom/appsflyer/internal/AFf1tSDK;
.source ""


# instance fields
.field private final AFInAppEventType:Lcom/appsflyer/internal/AFa1jSDK;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1qSDK;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final AFLogger:Lcom/appsflyer/internal/AFf1iSDK;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final copydefault:Lcom/appsflyer/internal/AFj1sSDK;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final equals:Lcom/appsflyer/internal/AFc1pSDK;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final hashCode:Lcom/appsflyer/internal/AFh1tSDK;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final registerClient:Lcom/appsflyer/AppsFlyerProperties;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public toString:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFh1mSDK;Lcom/appsflyer/internal/AFd1zSDK;)V
    .locals 0
    .param p1    # Lcom/appsflyer/internal/AFh1mSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFd1zSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFf1tSDK;-><init>(Lcom/appsflyer/internal/AFh1mSDK;Lcom/appsflyer/internal/AFd1zSDK;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->AFLogger()Lcom/appsflyer/internal/AFj1sSDK;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1sSDK;->copydefault:Lcom/appsflyer/internal/AFj1sSDK;

    .line 10
    .line 11
    .line 12
    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->component4()Lcom/appsflyer/internal/AFc1pSDK;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1sSDK;->equals:Lcom/appsflyer/internal/AFc1pSDK;

    .line 16
    .line 17
    .line 18
    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->component3()Lcom/appsflyer/internal/AFh1tSDK;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1sSDK;->hashCode:Lcom/appsflyer/internal/AFh1tSDK;

    .line 22
    .line 23
    .line 24
    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->areAllFieldsValid()Lcom/appsflyer/internal/AFf1iSDK;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1sSDK;->AFLogger:Lcom/appsflyer/internal/AFf1iSDK;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/appsflyer/AppsFlyerProperties;->getInstance()Lcom/appsflyer/AppsFlyerProperties;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1sSDK;->registerClient:Lcom/appsflyer/AppsFlyerProperties;

    .line 34
    .line 35
    .line 36
    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->afWarnLog()Lcom/appsflyer/internal/AFa1jSDK;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1sSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFa1jSDK;

    .line 40
    .line 41
    .line 42
    invoke-interface {p2}, Lcom/appsflyer/internal/AFd1zSDK;->afRDLog()Lcom/appsflyer/internal/AFh1qSDK;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1sSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1qSDK;

    .line 46
    .line 47
    sget-object p1, Lcom/appsflyer/internal/AFe1oSDK;->component3:Lcom/appsflyer/internal/AFe1oSDK;

    .line 48
    .line 49
    iget-object p2, p0, Lcom/appsflyer/internal/AFe1mSDK;->getRevenue:Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    sget-object p1, Lcom/appsflyer/internal/AFe1oSDK;->component4:Lcom/appsflyer/internal/AFe1oSDK;

    .line 55
    .line 56
    iget-object p2, p0, Lcom/appsflyer/internal/AFe1mSDK;->getRevenue:Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 60
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
.end method

.method private copydefault()Z
    .locals 5
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1cSDK;->component2:Lcom/appsflyer/internal/AFe1zSDK;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1mSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFe1qSDK;

    .line 5
    .line 6
    sget-object v2, Lcom/appsflyer/internal/AFe1qSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1qSDK;

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFe1zSDK;->getStatusCode()I

    .line 16
    move-result v0

    .line 17
    .line 18
    div-int/lit16 v0, v0, 0x1f4

    .line 19
    .line 20
    if-ne v0, v4, :cond_0

    .line 21
    move v0, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v3

    .line 24
    .line 25
    :goto_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1mSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFe1oSDK;

    .line 26
    .line 27
    sget-object v2, Lcom/appsflyer/internal/AFe1oSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFe1oSDK;

    .line 28
    .line 29
    if-eq v1, v2, :cond_2

    .line 30
    .line 31
    sget-object v2, Lcom/appsflyer/internal/AFe1oSDK;->copy:Lcom/appsflyer/internal/AFe1oSDK;

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v1, v3

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    :goto_1
    move v1, v4

    .line 38
    .line 39
    :goto_2
    if-eqz v0, :cond_3

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    return v4

    .line 43
    :cond_3
    return v3
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
.end method


# virtual methods
.method public final AFAdRevenueData()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1cSDK;->AFAdRevenueData()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1sSDK;->copydefault()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
    .line 18
.end method

.method public final getMonetizationNetwork()V
    .locals 7

    .line 1
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1cSDK;->getMonetizationNetwork()V

    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1sSDK;->hashCode:Lcom/appsflyer/internal/AFh1tSDK;

    .line 3
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFh1tSDK;->getMonetizationNetwork()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 5
    iget-wide v3, v0, Lcom/appsflyer/internal/AFh1tSDK;->hashCode:J

    const-wide/16 v5, 0x0

    cmp-long v5, v3, v5

    if-eqz v5, :cond_0

    .line 6
    iget-object v5, v0, Lcom/appsflyer/internal/AFh1tSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "net"

    invoke-interface {v5, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    iget-object v1, v0, Lcom/appsflyer/internal/AFh1tSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    .line 8
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 9
    iget-object v0, v0, Lcom/appsflyer/internal/AFh1tSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1pSDK;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "first_launch"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFc1pSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 10
    :cond_0
    const-string v0, "Metrics: launch start ts is missing"

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final getMonetizationNetwork(Lcom/appsflyer/internal/AFh1mSDK;)V
    .locals 11

    .line 11
    invoke-super {p0, p1}, Lcom/appsflyer/internal/AFf1tSDK;->getMonetizationNetwork(Lcom/appsflyer/internal/AFh1mSDK;)V

    .line 12
    iget v0, p1, Lcom/appsflyer/internal/AFh1mSDK;->component2:I

    .line 13
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1sSDK;->hashCode:Lcom/appsflyer/internal/AFh1tSDK;

    .line 14
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFh1tSDK;->getMonetizationNetwork()Z

    move-result v2

    const-wide/16 v3, 0x0

    const-string v5, "first_launch"

    if-eqz v2, :cond_1

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iput-wide v6, v1, Lcom/appsflyer/internal/AFh1tSDK;->hashCode:J

    .line 16
    iget-wide v8, v1, Lcom/appsflyer/internal/AFh1tSDK;->component1:J

    cmp-long v2, v8, v3

    if-eqz v2, :cond_0

    .line 17
    iget-object v2, v1, Lcom/appsflyer/internal/AFh1tSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    sub-long/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v7, "from_fg"

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    iget-object v2, v1, Lcom/appsflyer/internal/AFh1tSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    .line 19
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 20
    iget-object v1, v1, Lcom/appsflyer/internal/AFh1tSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1pSDK;

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v5, v2}, Lcom/appsflyer/internal/AFc1pSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 21
    :cond_0
    const-string v1, "Metrics: fg ts is missing"

    invoke-static {v1}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    .line 22
    :cond_1
    :goto_0
    iget-object v1, p1, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork:Ljava/util/Map;

    .line 23
    const-string v2, "meta"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-nez v1, :cond_2

    .line 24
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 25
    iget-object v6, p1, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork:Ljava/util/Map;

    .line 26
    invoke-interface {v6, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    :cond_2
    iget-object v6, p1, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork:Ljava/util/Map;

    .line 28
    const-string v7, "af_deeplink"

    invoke-interface {v6, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 29
    iget-object v6, p0, Lcom/appsflyer/internal/AFf1sSDK;->AFInAppEventType:Lcom/appsflyer/internal/AFa1jSDK;

    invoke-interface {v6}, Lcom/appsflyer/internal/AFa1jSDK;->AFAdRevenueData()Ljava/util/Map;

    move-result-object v6

    invoke-virtual {p1, v6}, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork(Ljava/util/Map;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 30
    :cond_3
    iget-object v6, p0, Lcom/appsflyer/internal/AFf1sSDK;->AFLogger:Lcom/appsflyer/internal/AFf1iSDK;

    invoke-virtual {v6}, Lcom/appsflyer/internal/AFf1iSDK;->getCurrencyIso4217Code()Lcom/appsflyer/internal/AFi1vSDK;

    move-result-object v6

    if-eqz v6, :cond_b

    .line 31
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 32
    const-string v8, "cdn_token"

    iget-object v9, v6, Lcom/appsflyer/internal/AFi1vSDK;->getMonetizationNetwork:Ljava/lang/String;

    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    iget-object v8, v6, Lcom/appsflyer/internal/AFi1vSDK;->AFAdRevenueData:Ljava/lang/String;

    if-eqz v8, :cond_4

    .line 34
    const-string v9, "c_ver"

    invoke-interface {v7, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    :cond_4
    iget-wide v8, v6, Lcom/appsflyer/internal/AFi1vSDK;->getMediationNetwork:J

    cmp-long v10, v8, v3

    if-lez v10, :cond_5

    .line 36
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const-string v9, "latency"

    invoke-interface {v7, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    :cond_5
    iget-wide v8, v6, Lcom/appsflyer/internal/AFi1vSDK;->getRevenue:J

    cmp-long v3, v8, v3

    if-lez v3, :cond_6

    .line 38
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "delay"

    invoke-interface {v7, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    :cond_6
    iget v3, v6, Lcom/appsflyer/internal/AFi1vSDK;->getCurrencyIso4217Code:I

    if-lez v3, :cond_7

    .line 40
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string/jumbo v4, "res_code"

    invoke-interface {v7, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    :cond_7
    iget-object v3, v6, Lcom/appsflyer/internal/AFi1vSDK;->component1:Ljava/lang/Throwable;

    if-eqz v3, :cond_8

    .line 42
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v6, Lcom/appsflyer/internal/AFi1vSDK;->component1:Ljava/lang/Throwable;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v6, Lcom/appsflyer/internal/AFi1vSDK;->component1:Ljava/lang/Throwable;

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "error"

    invoke-interface {v7, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    :cond_8
    iget-object v3, v6, Lcom/appsflyer/internal/AFi1vSDK;->areAllFieldsValid:Lcom/appsflyer/internal/AFi1xSDK;

    if-eqz v3, :cond_9

    .line 44
    const-string/jumbo v4, "sig"

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v7, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    :cond_9
    iget-object v3, v6, Lcom/appsflyer/internal/AFi1vSDK;->component4:Ljava/lang/String;

    if-eqz v3, :cond_a

    .line 46
    const-string v4, "cdn_cache_status"

    invoke-interface {v7, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    :cond_a
    const-string/jumbo v3, "rc"

    invoke-interface {v1, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    :cond_b
    iget-object v3, p0, Lcom/appsflyer/internal/AFf1tSDK;->copy:Lcom/appsflyer/internal/AFg1pSDK;

    .line 49
    iget-object v4, p1, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork:Ljava/util/Map;

    .line 50
    invoke-interface {v3, v4}, Lcom/appsflyer/internal/AFg1pSDK;->getRevenue(Ljava/util/Map;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v6, 0x1

    if-eq v0, v6, :cond_e

    if-eq v0, v4, :cond_c

    goto :goto_1

    .line 51
    :cond_c
    iget-object v7, p0, Lcom/appsflyer/internal/AFf1sSDK;->hashCode:Lcom/appsflyer/internal/AFh1tSDK;

    .line 52
    iget-object v8, v7, Lcom/appsflyer/internal/AFh1tSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFc1pSDK;

    invoke-interface {v8, v5}, Lcom/appsflyer/internal/AFc1pSDK;->getRevenue(Ljava/lang/String;)V

    .line 53
    new-instance v8, Ljava/util/HashMap;

    iget-object v7, v7, Lcom/appsflyer/internal/AFh1tSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    invoke-direct {v8, v7}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 54
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_d

    .line 55
    invoke-interface {v1, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    :cond_d
    instance-of v5, p1, Lcom/appsflyer/internal/AFh1nSDK;

    if-eqz v5, :cond_12

    iget-object v5, p0, Lcom/appsflyer/internal/AFf1sSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1qSDK;

    if-eqz v5, :cond_12

    .line 57
    invoke-interface {v5}, Lcom/appsflyer/internal/AFh1qSDK;->getCurrencyIso4217Code()Z

    move-result v5

    if-nez v5, :cond_12

    .line 58
    iget-object v5, p0, Lcom/appsflyer/internal/AFf1sSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1qSDK;

    invoke-interface {v5, p1}, Lcom/appsflyer/internal/AFh1qSDK;->getMediationNetwork(Lcom/appsflyer/internal/AFh1mSDK;)V

    goto :goto_1

    .line 59
    :cond_e
    iget-object v7, p0, Lcom/appsflyer/internal/AFf1sSDK;->registerClient:Lcom/appsflyer/AppsFlyerProperties;

    const-string/jumbo v8, "waitForCustomerId"

    invoke-virtual {v7, v8, v3}, Lcom/appsflyer/AppsFlyerProperties;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_f

    .line 60
    iget-object v7, p1, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork:Ljava/util/Map;

    .line 61
    const-string/jumbo v8, "wait_cid"

    invoke-static {v6}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    :cond_f
    iget-object v7, p0, Lcom/appsflyer/internal/AFf1sSDK;->hashCode:Lcom/appsflyer/internal/AFh1tSDK;

    .line 63
    new-instance v8, Ljava/util/HashMap;

    iget-object v9, v7, Lcom/appsflyer/internal/AFh1tSDK;->AFAdRevenueData:Ljava/util/Map;

    invoke-direct {v8, v9}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 64
    iget-object v7, v7, Lcom/appsflyer/internal/AFh1tSDK;->AFAdRevenueData:Ljava/util/Map;

    invoke-interface {v7}, Ljava/util/Map;->clear()V

    .line 65
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_10

    .line 66
    const-string v7, "ddl"

    invoke-interface {v1, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    :cond_10
    iget-object v7, p0, Lcom/appsflyer/internal/AFf1sSDK;->hashCode:Lcom/appsflyer/internal/AFh1tSDK;

    .line 68
    new-instance v8, Ljava/util/HashMap;

    iget-object v7, v7, Lcom/appsflyer/internal/AFh1tSDK;->getCurrencyIso4217Code:Ljava/util/Map;

    invoke-direct {v8, v7}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 69
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_11

    .line 70
    invoke-interface {v1, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :cond_11
    iget-object v5, p0, Lcom/appsflyer/internal/AFf1sSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1qSDK;

    if-eqz v5, :cond_12

    .line 72
    invoke-interface {v5, p1}, Lcom/appsflyer/internal/AFh1qSDK;->getMonetizationNetwork(Lcom/appsflyer/internal/AFh1mSDK;)V

    .line 73
    :cond_12
    :goto_1
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_13

    .line 74
    iget-object v1, p1, Lcom/appsflyer/internal/AFh1mSDK;->getMonetizationNetwork:Ljava/util/Map;

    .line 75
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_13
    if-gt v0, v4, :cond_1a

    .line 76
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 77
    iget-object v2, p0, Lcom/appsflyer/internal/AFf1sSDK;->copydefault:Lcom/appsflyer/internal/AFj1sSDK;

    .line 78
    iget-object v2, v2, Lcom/appsflyer/internal/AFj1sSDK;->getCurrencyIso4217Code:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-array v5, v3, [Lcom/appsflyer/internal/AFj1tSDK;

    invoke-virtual {v2, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/appsflyer/internal/AFj1tSDK;

    .line 79
    array-length v5, v2

    :goto_2
    if-ge v3, v5, :cond_18

    aget-object v7, v2, v3

    .line 80
    instance-of v8, v7, Lcom/appsflyer/internal/AFi1cSDK;

    .line 81
    sget-object v9, Lcom/appsflyer/internal/AFf1sSDK$1;->getCurrencyIso4217Code:[I

    .line 82
    iget-object v10, v7, Lcom/appsflyer/internal/AFj1tSDK;->areAllFieldsValid:Lcom/appsflyer/internal/AFj1tSDK$AFa1ySDK;

    .line 83
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v9, v9, v10

    if-eq v9, v6, :cond_15

    if-eq v9, v4, :cond_14

    goto :goto_3

    :cond_14
    if-ne v0, v4, :cond_17

    if-nez v8, :cond_17

    .line 84
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 85
    const-string/jumbo v9, "source"

    .line 86
    iget-object v10, v7, Lcom/appsflyer/internal/AFj1tSDK;->AFAdRevenueData:Ljava/lang/String;

    .line 87
    invoke-interface {v8, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    const-string/jumbo v9, "response"

    const-string v10, "TIMEOUT"

    invoke-interface {v8, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    const-string/jumbo v9, "type"

    .line 90
    iget-object v7, v7, Lcom/appsflyer/internal/AFj1tSDK;->component2:Ljava/lang/String;

    .line 91
    invoke-interface {v8, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_15
    if-eqz v8, :cond_16

    .line 93
    move-object v8, v7

    check-cast v8, Lcom/appsflyer/internal/AFi1cSDK;

    iget-object v8, v8, Lcom/appsflyer/internal/AFi1cSDK;->getMonetizationNetwork:Ljava/util/Map;

    const-string/jumbo v9, "rfr"

    invoke-virtual {p1, v9, v8}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 94
    iget-object v8, p0, Lcom/appsflyer/internal/AFf1sSDK;->equals:Lcom/appsflyer/internal/AFc1pSDK;

    const-string v9, "newGPReferrerSent"

    invoke-interface {v8, v9, v6}, Lcom/appsflyer/internal/AFc1pSDK;->getRevenue(Ljava/lang/String;Z)V

    .line 95
    :cond_16
    iget-object v7, v7, Lcom/appsflyer/internal/AFj1tSDK;->getMediationNetwork:Ljava/util/Map;

    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_17
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 96
    :cond_18
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_19

    .line 97
    const-string/jumbo v0, "referrers"

    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 98
    :cond_19
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1sSDK;->toString:Ljava/util/Map;

    if-eqz v0, :cond_1a

    .line 99
    const-string v1, "fb_ddl"

    invoke-virtual {p1, v1, v0}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1mSDK;

    .line 100
    :cond_1a
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1mSDK;->AFAdRevenueData()Lcom/appsflyer/internal/AFe1oSDK;

    move-result-object v0

    sget-object v1, Lcom/appsflyer/internal/AFe1oSDK;->copydefault:Lcom/appsflyer/internal/AFe1oSDK;

    if-ne v0, v1, :cond_1b

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1sSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1qSDK;

    if-eqz v0, :cond_1b

    .line 101
    invoke-interface {v0}, Lcom/appsflyer/internal/AFh1qSDK;->getRevenue()Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 102
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1sSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1qSDK;

    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFh1qSDK;->AFAdRevenueData(Lcom/appsflyer/internal/AFh1mSDK;)V

    .line 103
    :cond_1b
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1tSDK;->copy:Lcom/appsflyer/internal/AFg1pSDK;

    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFg1pSDK;->getMediationNetwork(Lcom/appsflyer/internal/AFh1mSDK;)V

    return-void
.end method
