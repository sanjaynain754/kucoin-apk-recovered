.class public final Lcom/appsflyer/internal/AFg1qSDK;
.super Lcom/appsflyer/internal/AFe1cSDK;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1cSDK<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final component1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private AFKeystoreWrapper:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final copy:Lcom/appsflyer/internal/AFh1tSDK;

.field private final copydefault:Lcom/appsflyer/internal/AFd1mSDK;

.field private final equals:Lcom/appsflyer/internal/AFc1kSDK;

.field private hashCode:Ljava/util/Map;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final toString:Lcom/appsflyer/internal/AFc1pSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    const-string v0, "playstore"

    .line 3
    .line 4
    const-string v1, "googleplaystore"

    .line 5
    .line 6
    const-string v2, "googleplay"

    .line 7
    .line 8
    .line 9
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sput-object v0, Lcom/appsflyer/internal/AFg1qSDK;->component1:Ljava/util/List;

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFd1zSDK;)V
    .locals 3
    .param p1    # Lcom/appsflyer/internal/AFd1zSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/appsflyer/internal/AFe1oSDK;->equals:Lcom/appsflyer/internal/AFe1oSDK;

    .line 3
    .line 4
    sget-object v1, Lcom/appsflyer/internal/AFe1oSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFe1oSDK;

    .line 5
    .line 6
    .line 7
    filled-new-array {v1}, [Lcom/appsflyer/internal/AFe1oSDK;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const-string v2, "GCD-FETCH"

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v0, v1, p1, v2}, Lcom/appsflyer/internal/AFe1cSDK;-><init>(Lcom/appsflyer/internal/AFe1oSDK;[Lcom/appsflyer/internal/AFe1oSDK;Lcom/appsflyer/internal/AFd1zSDK;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lcom/appsflyer/internal/AFd1zSDK;->AFAdRevenueData()Lcom/appsflyer/internal/AFd1mSDK;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iput-object v0, p0, Lcom/appsflyer/internal/AFg1qSDK;->copydefault:Lcom/appsflyer/internal/AFd1mSDK;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Lcom/appsflyer/internal/AFd1zSDK;->component4()Lcom/appsflyer/internal/AFc1pSDK;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/appsflyer/internal/AFg1qSDK;->toString:Lcom/appsflyer/internal/AFc1pSDK;

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Lcom/appsflyer/internal/AFd1zSDK;->component3()Lcom/appsflyer/internal/AFh1tSDK;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    iput-object v0, p0, Lcom/appsflyer/internal/AFg1qSDK;->copy:Lcom/appsflyer/internal/AFh1tSDK;

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Lcom/appsflyer/internal/AFd1zSDK;->getCurrencyIso4217Code()Lcom/appsflyer/internal/AFc1kSDK;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    iput-object p1, p0, Lcom/appsflyer/internal/AFg1qSDK;->equals:Lcom/appsflyer/internal/AFc1kSDK;

    .line 38
    .line 39
    sget-object p1, Lcom/appsflyer/internal/AFe1oSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFe1oSDK;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1mSDK;->getRevenue:Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    sget-object p1, Lcom/appsflyer/internal/AFe1oSDK;->copydefault:Lcom/appsflyer/internal/AFe1oSDK;

    .line 47
    .line 48
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1mSDK;->getRevenue:Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 52
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method


# virtual methods
.method public final AFAdRevenueData(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1iSDK;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1iSDK<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1qSDK;->toString:Lcom/appsflyer/internal/AFc1pSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFg1qSDK;->equals:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFc1kSDK;->component4()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/appsflyer/internal/AFa1ySDK;->getMediationNetwork(Lcom/appsflyer/internal/AFc1pSDK;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 4
    sget-object v1, Lcom/appsflyer/internal/AFg1qSDK;->component1:Ljava/util/List;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 5
    const-string v1, "-"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 6
    :cond_0
    const-string v1, "[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afWarnLog(Ljava/lang/String;)V

    .line 7
    :cond_1
    const-string v0, ""

    :goto_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1qSDK;->copydefault:Lcom/appsflyer/internal/AFd1mSDK;

    invoke-virtual {v1, v0, p1}, Lcom/appsflyer/internal/AFd1mSDK;->getCurrencyIso4217Code(Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1iSDK;

    move-result-object p1

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[GCD-B01] URL: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    iget-object v1, p1, Lcom/appsflyer/internal/AFd1iSDK;->getRevenue:Lcom/appsflyer/internal/AFd1aSDK;

    .line 10
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1aSDK;->getCurrencyIso4217Code:Ljava/lang/String;

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    return-object p1
.end method

.method public final AFAdRevenueData()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public final areAllFieldsValid()Lcom/appsflyer/attribution/AppsFlyerRequestListener;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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
    .line 21
    .line 22
.end method

.method public final equals()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
    .line 21
    .line 22
.end method

.method public final getMonetizationNetwork()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1cSDK;->getMonetizationNetwork()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1qSDK;->hashCode:Ljava/util/Map;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1qSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1nSDK;->AFAdRevenueData(Ljava/util/Map;)V

    .line 13
    return-void

    .line 14
    .line 15
    :cond_0
    if-eqz v1, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lcom/appsflyer/internal/AFg1nSDK;->getMonetizationNetwork(Ljava/lang/String;)V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_1
    const-string v0, "Unknown error"

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/appsflyer/internal/AFg1nSDK;->getMonetizationNetwork(Ljava/lang/String;)V

    .line 31
    return-void
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
.end method

.method public final getRevenue()Lcom/appsflyer/internal/AFe1qSDK;
    .locals 13
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "is_first_launch"

    .line 3
    .line 4
    const-string v1, "af_channel"

    .line 5
    .line 6
    const-string v2, "af_siteid"

    .line 7
    .line 8
    const-string v3, "[GCD-A03] Server retrieving attempt finished"

    .line 9
    .line 10
    iget-object v4, p0, Lcom/appsflyer/internal/AFe1cSDK;->component3:Lcom/appsflyer/internal/AFf1fSDK;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v4}, Lcom/appsflyer/internal/AFf1fSDK;->getMediationNetwork()Z

    .line 14
    move-result v4

    .line 15
    .line 16
    if-nez v4, :cond_f

    .line 17
    .line 18
    sget-object v4, Lcom/appsflyer/internal/AFe1qSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1qSDK;

    .line 19
    const/4 v5, 0x0

    .line 20
    move v6, v5

    .line 21
    :goto_0
    const/4 v7, 0x2

    .line 22
    .line 23
    if-gt v6, v7, :cond_e

    .line 24
    const/4 v4, 0x1

    .line 25
    .line 26
    if-lt v6, v7, :cond_0

    .line 27
    move v7, v4

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    move v7, v5

    .line 30
    .line 31
    :goto_1
    iget-object v8, p0, Lcom/appsflyer/internal/AFg1qSDK;->copy:Lcom/appsflyer/internal/AFh1tSDK;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    move-result-wide v9

    .line 36
    .line 37
    iput-wide v9, v8, Lcom/appsflyer/internal/AFh1tSDK;->copy:J

    .line 38
    .line 39
    .line 40
    :try_start_0
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1cSDK;->getRevenue()Lcom/appsflyer/internal/AFe1qSDK;

    .line 41
    move-result-object v8

    .line 42
    .line 43
    iget-object v9, p0, Lcom/appsflyer/internal/AFe1cSDK;->component2:Lcom/appsflyer/internal/AFe1zSDK;

    .line 44
    .line 45
    if-nez v9, :cond_1

    .line 46
    .line 47
    goto/16 :goto_9

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {v9}, Lcom/appsflyer/internal/AFe1zSDK;->getStatusCode()I

    .line 51
    move-result v10

    .line 52
    .line 53
    const/16 v11, 0x193

    .line 54
    .line 55
    if-eq v10, v11, :cond_3

    .line 56
    .line 57
    const/16 v11, 0x1f4

    .line 58
    .line 59
    if-lt v10, v11, :cond_2

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move v4, v5

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_2
    invoke-virtual {v9}, Lcom/appsflyer/internal/AFe1zSDK;->isSuccessful()Z

    .line 65
    move-result v11

    .line 66
    .line 67
    const/16 v12, 0x194

    .line 68
    .line 69
    if-nez v11, :cond_6

    .line 70
    .line 71
    if-ne v10, v12, :cond_4

    .line 72
    goto :goto_6

    .line 73
    .line 74
    :cond_4
    if-nez v7, :cond_5

    .line 75
    .line 76
    if-nez v4, :cond_c

    .line 77
    goto :goto_4

    .line 78
    :goto_3
    move-object v4, v8

    .line 79
    .line 80
    goto/16 :goto_a

    .line 81
    .line 82
    :cond_5
    :goto_4
    const-string v4, "Error connection to server: "

    .line 83
    .line 84
    .line 85
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 86
    move-result-object v8

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    move-result-object v4

    .line 91
    .line 92
    iput-object v4, p0, Lcom/appsflyer/internal/AFg1qSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 93
    .line 94
    sget-object v0, Lcom/appsflyer/internal/AFe1qSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1qSDK;
    :try_end_0
    .catch Lcom/appsflyer/internal/AFe1pSDK; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    :goto_5
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1qSDK;->copy:Lcom/appsflyer/internal/AFh1tSDK;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v6}, Lcom/appsflyer/internal/AFh1tSDK;->getMonetizationNetwork(I)V

    .line 100
    .line 101
    .line 102
    invoke-static {v3}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    .line 103
    return-object v0

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    .line 106
    goto/16 :goto_c

    .line 107
    :catch_0
    move-exception v4

    .line 108
    .line 109
    goto/16 :goto_8

    .line 110
    :catch_1
    move-exception v0

    .line 111
    .line 112
    goto/16 :goto_b

    .line 113
    .line 114
    .line 115
    :cond_6
    :goto_6
    :try_start_1
    invoke-virtual {v9}, Lcom/appsflyer/internal/AFe1zSDK;->getBody()Ljava/lang/Object;

    .line 116
    move-result-object v4

    .line 117
    .line 118
    check-cast v4, Ljava/util/Map;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9}, Lcom/appsflyer/internal/AFe1zSDK;->getStatusCode()I

    .line 122
    move-result v8

    .line 123
    .line 124
    const-string v9, "iscache"

    .line 125
    .line 126
    .line 127
    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    move-result-object v9

    .line 129
    .line 130
    check-cast v9, Ljava/lang/Boolean;

    .line 131
    .line 132
    if-ne v8, v12, :cond_7

    .line 133
    .line 134
    const-string v8, "error_reason"

    .line 135
    .line 136
    .line 137
    invoke-interface {v4, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    const-string/jumbo v8, "status_code"

    .line 141
    .line 142
    .line 143
    invoke-interface {v4, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    const-string v8, "af_status"

    .line 146
    .line 147
    const-string v10, "Organic"

    .line 148
    .line 149
    .line 150
    invoke-interface {v4, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    const-string v8, "af_message"

    .line 153
    .line 154
    const-string v10, "organic install"

    .line 155
    .line 156
    .line 157
    invoke-interface {v4, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    :cond_7
    if-eqz v9, :cond_8

    .line 160
    .line 161
    .line 162
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 163
    move-result v8

    .line 164
    .line 165
    if-nez v8, :cond_8

    .line 166
    .line 167
    iget-object v8, p0, Lcom/appsflyer/internal/AFg1qSDK;->toString:Lcom/appsflyer/internal/AFc1pSDK;

    .line 168
    .line 169
    const-string v9, "appsflyerConversionDataCacheExpiration"

    .line 170
    .line 171
    .line 172
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 173
    move-result-wide v10

    .line 174
    .line 175
    .line 176
    invoke-interface {v8, v9, v10, v11}, Lcom/appsflyer/internal/AFc1pSDK;->getCurrencyIso4217Code(Ljava/lang/String;J)V

    .line 177
    .line 178
    .line 179
    :cond_8
    invoke-interface {v4, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 180
    move-result v8

    .line 181
    .line 182
    if-eqz v8, :cond_a

    .line 183
    .line 184
    .line 185
    invoke-interface {v4, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 186
    move-result v8

    .line 187
    .line 188
    if-eqz v8, :cond_9

    .line 189
    .line 190
    new-instance v8, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    const-string v9, "[Invite] Detected App-Invite via channel: "

    .line 193
    .line 194
    .line 195
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    move-result-object v9

    .line 200
    .line 201
    .line 202
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 206
    move-result-object v8

    .line 207
    .line 208
    .line 209
    invoke-static {v8}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    .line 210
    goto :goto_7

    .line 211
    .line 212
    :cond_9
    const-string v8, "[CrossPromotion] App was installed via %s\'s Cross Promotion"

    .line 213
    .line 214
    .line 215
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    move-result-object v9

    .line 217
    .line 218
    .line 219
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 220
    move-result-object v9

    .line 221
    .line 222
    .line 223
    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 224
    move-result-object v8

    .line 225
    .line 226
    .line 227
    invoke-static {v8}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    .line 228
    .line 229
    :cond_a
    :goto_7
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 230
    .line 231
    .line 232
    invoke-interface {v4, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    new-instance v8, Lorg/json/JSONObject;

    .line 235
    .line 236
    .line 237
    invoke-direct {v8, v4}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 241
    move-result-object v8

    .line 242
    .line 243
    iget-object v9, p0, Lcom/appsflyer/internal/AFg1qSDK;->toString:Lcom/appsflyer/internal/AFc1pSDK;

    .line 244
    .line 245
    const-string v10, "attributionId"

    .line 246
    .line 247
    .line 248
    invoke-interface {v9, v10, v8}, Lcom/appsflyer/internal/AFc1pSDK;->getMonetizationNetwork(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    .line 250
    iget-object v8, p0, Lcom/appsflyer/internal/AFg1qSDK;->toString:Lcom/appsflyer/internal/AFc1pSDK;

    .line 251
    .line 252
    .line 253
    const-string/jumbo v9, "sixtyDayConversionData"

    .line 254
    .line 255
    .line 256
    invoke-interface {v8, v9, v5}, Lcom/appsflyer/internal/AFc1pSDK;->getMonetizationNetwork(Ljava/lang/String;Z)Z

    .line 257
    move-result v8

    .line 258
    .line 259
    if-nez v8, :cond_b

    .line 260
    .line 261
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 262
    .line 263
    .line 264
    invoke-interface {v4, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    :cond_b
    iput-object v4, p0, Lcom/appsflyer/internal/AFg1qSDK;->hashCode:Ljava/util/Map;

    .line 267
    .line 268
    sget-object v0, Lcom/appsflyer/internal/AFe1qSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFe1qSDK;
    :try_end_1
    .catch Lcom/appsflyer/internal/AFe1pSDK; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 269
    .line 270
    goto/16 :goto_5

    .line 271
    .line 272
    :goto_8
    :try_start_2
    new-instance v8, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    const-string v9, "[GCD] Error: "

    .line 275
    .line 276
    .line 277
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 281
    move-result-object v9

    .line 282
    .line 283
    .line 284
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 288
    move-result-object v8

    .line 289
    .line 290
    .line 291
    invoke-static {v8, v4, v5, v5}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 292
    .line 293
    sget-object v8, Lcom/appsflyer/internal/AFe1qSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFe1qSDK;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 294
    .line 295
    if-nez v7, :cond_d

    .line 296
    .line 297
    :cond_c
    :goto_9
    iget-object v4, p0, Lcom/appsflyer/internal/AFg1qSDK;->copy:Lcom/appsflyer/internal/AFh1tSDK;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4, v6}, Lcom/appsflyer/internal/AFh1tSDK;->getMonetizationNetwork(I)V

    .line 301
    .line 302
    .line 303
    invoke-static {v3}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    .line 304
    .line 305
    goto/16 :goto_3

    .line 306
    .line 307
    :goto_a
    add-int/lit8 v6, v6, 0x1

    .line 308
    .line 309
    goto/16 :goto_0

    .line 310
    .line 311
    .line 312
    :cond_d
    :try_start_3
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 313
    move-result-object v0

    .line 314
    .line 315
    iput-object v0, p0, Lcom/appsflyer/internal/AFg1qSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 316
    throw v4

    .line 317
    .line 318
    :goto_b
    const-string v1, "[GCD-E05] AppsFlyer dev key is missing"

    .line 319
    .line 320
    .line 321
    invoke-static {v1}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    .line 322
    .line 323
    const-string v1, "AppsFlyer dev key is missing"

    .line 324
    .line 325
    iput-object v1, p0, Lcom/appsflyer/internal/AFg1qSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 326
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 327
    .line 328
    :goto_c
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1qSDK;->copy:Lcom/appsflyer/internal/AFh1tSDK;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v1, v6}, Lcom/appsflyer/internal/AFh1tSDK;->getMonetizationNetwork(I)V

    .line 332
    .line 333
    .line 334
    invoke-static {v3}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    .line 335
    throw v0

    .line 336
    :cond_e
    return-object v4

    .line 337
    .line 338
    :cond_f
    const-string v0, "[GCD-E03] \'isStopTracking\' enabled"

    .line 339
    .line 340
    .line 341
    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    .line 342
    .line 343
    const-string v0, "\'isStopTracking\' enabled"

    .line 344
    .line 345
    iput-object v0, p0, Lcom/appsflyer/internal/AFg1qSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 346
    .line 347
    new-instance v0, Lcom/appsflyer/internal/AFe1kSDK;

    .line 348
    .line 349
    .line 350
    invoke-direct {v0}, Lcom/appsflyer/internal/AFe1kSDK;-><init>()V

    .line 351
    throw v0
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
.end method
