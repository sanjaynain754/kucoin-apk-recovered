.class public Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;
.super Ljava/lang/Object;
.source "SensorsABTestCacheManager.java"

# interfaces
.implements Lcom/sensorsdata/abtest/core/IExperimentCacheAPI;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager$SensorsABTestCacheManagerStaticNestedClass;
    }
.end annotation


# static fields
.field private static final KEY_EXPERIMENT:Ljava/lang/String; = "key_experiment_with_distinct_id"

.field private static final TAG:Ljava/lang/String; = "SAB.SensorsABTestCacheManager"


# instance fields
.field private mFuzzyExperiments:Lorg/json/JSONArray;

.field public mHashMap:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/sensorsdata/abtest/entity/Experiment;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->mFuzzyExperiments:Lorg/json/JSONArray;

    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->mHashMap:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;-><init>()V

    return-void
.end method

.method private getExperimentByParamName(Ljava/lang/String;)Lcom/sensorsdata/abtest/entity/Experiment;
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->mHashMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->mHashMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Lcom/sensorsdata/abtest/entity/Experiment;

    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
.end method

.method public static getInstance()Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager$SensorsABTestCacheManagerStaticNestedClass;->access$100()Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method private parseCache(Ljava/lang/String;Ljava/util/concurrent/ConcurrentHashMap;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/sensorsdata/abtest/entity/Experiment;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 9
    move-result p1

    .line 10
    .line 11
    if-lez p1, :cond_4

    .line 12
    const/4 p1, 0x0

    .line 13
    move v1, p1

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 17
    move-result v2

    .line 18
    .line 19
    if-ge v1, v2, :cond_4

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    new-instance v3, Lcom/sensorsdata/abtest/entity/Experiment;

    .line 28
    .line 29
    .line 30
    invoke-direct {v3}, Lcom/sensorsdata/abtest/entity/Experiment;-><init>()V

    .line 31
    .line 32
    const-string v4, "abtest_experiment_id"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    iput-object v4, v3, Lcom/sensorsdata/abtest/entity/Experiment;->experimentId:Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 42
    move-result v4

    .line 43
    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_0
    const-string v4, "abtest_experiment_group_id"

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    move-result-object v4

    .line 53
    .line 54
    iput-object v4, v3, Lcom/sensorsdata/abtest/entity/Experiment;->experimentGroupId:Ljava/lang/String;

    .line 55
    .line 56
    const-string v4, "is_control_group"

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 60
    move-result v4

    .line 61
    .line 62
    iput-boolean v4, v3, Lcom/sensorsdata/abtest/entity/Experiment;->isControlGroup:Z

    .line 63
    .line 64
    const-string v4, "is_white_list"

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 68
    move-result v4

    .line 69
    .line 70
    iput-boolean v4, v3, Lcom/sensorsdata/abtest/entity/Experiment;->isWhiteList:Z

    .line 71
    .line 72
    .line 73
    const-string/jumbo v4, "variables"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 83
    move-result v4

    .line 84
    .line 85
    if-lez v4, :cond_3

    .line 86
    .line 87
    new-instance v4, Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 91
    move v5, p1

    .line 92
    .line 93
    .line 94
    :goto_1
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 95
    move-result v6

    .line 96
    .line 97
    if-ge v5, v6, :cond_2

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 101
    move-result-object v6

    .line 102
    .line 103
    new-instance v7, Lcom/sensorsdata/abtest/entity/Experiment$Variable;

    .line 104
    .line 105
    .line 106
    invoke-direct {v7}, Lcom/sensorsdata/abtest/entity/Experiment$Variable;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string/jumbo v8, "type"

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    move-result-object v8

    .line 114
    .line 115
    iput-object v8, v7, Lcom/sensorsdata/abtest/entity/Experiment$Variable;->type:Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    const-string/jumbo v8, "name"

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    move-result-object v8

    .line 123
    .line 124
    iput-object v8, v7, Lcom/sensorsdata/abtest/entity/Experiment$Variable;->name:Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    const-string/jumbo v8, "value"

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    move-result-object v6

    .line 132
    .line 133
    iput-object v6, v7, Lcom/sensorsdata/abtest/entity/Experiment$Variable;->value:Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    iget-object v6, v7, Lcom/sensorsdata/abtest/entity/Experiment$Variable;->name:Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2, v6}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 142
    move-result v6

    .line 143
    .line 144
    if-nez v6, :cond_1

    .line 145
    .line 146
    iget-object v6, v7, Lcom/sensorsdata/abtest/entity/Experiment$Variable;->name:Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, v6, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    goto :goto_2

    .line 151
    :catch_0
    move-exception p1

    .line 152
    goto :goto_3

    .line 153
    .line 154
    :cond_1
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 155
    goto :goto_1

    .line 156
    .line 157
    :cond_2
    iput-object v4, v3, Lcom/sensorsdata/abtest/entity/Experiment;->variables:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    .line 159
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    .line 164
    :goto_3
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 165
    :cond_4
    :goto_4
    return-void
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
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
.end method


# virtual methods
.method public clearCache()V
    .locals 1

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->loadExperimentsFromCache(Ljava/lang/String;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    iput-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->mFuzzyExperiments:Lorg/json/JSONArray;

    .line 9
    return-void
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

.method public getExperimentVariableValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    const-string v2, "SAB.SensorsABTestCacheManager"

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string p2, "experiment param name\uff1a%s\uff0c\u8bd5\u9a8c\u53c2\u6570\u540d\u4e0d\u6b63\u786e\uff0c\u8bd5\u9a8c\u53c2\u6570\u540d\u5fc5\u987b\u4e3a\u975e\u7a7a\u5b57\u7b26\u4e32\uff01"

    .line 12
    .line 13
    .line 14
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-static {v2, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    return-object v1

    .line 24
    .line 25
    :cond_0
    if-eqz p2, :cond_1

    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    const-string v3, "getExperimentVariableValue param name: "

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v3, " , type: "

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    move-result-object v3

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-direct {p0, p1}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->getExperimentByParamName(Ljava/lang/String;)Lcom/sensorsdata/abtest/entity/Experiment;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    if-eqz v0, :cond_5

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p1, p2}, Lcom/sensorsdata/abtest/entity/Experiment;->checkTypeIsValid(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 67
    move-result v3

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p1, p2}, Lcom/sensorsdata/abtest/entity/Experiment;->getVariableValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    new-instance p2, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    const-string v1, "getExperimentVariableValue success and type: "

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v1, " ,value: "

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    move-result-object v1

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    move-result-object p2

    .line 109
    .line 110
    .line 111
    invoke-static {v2, p2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    iget-boolean p2, v0, Lcom/sensorsdata/abtest/entity/Experiment;->isWhiteList:Z

    .line 114
    .line 115
    if-nez p2, :cond_2

    .line 116
    .line 117
    .line 118
    invoke-static {}, Lcom/sensorsdata/abtest/core/SensorsABTestTrackHelper;->getInstance()Lcom/sensorsdata/abtest/core/SensorsABTestTrackHelper;

    .line 119
    move-result-object p2

    .line 120
    .line 121
    .line 122
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->sharedInstance()Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 123
    move-result-object v1

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->getDistinctId()Ljava/lang/String;

    .line 127
    move-result-object v1

    .line 128
    .line 129
    .line 130
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->sharedInstance()Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 131
    move-result-object v2

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->getLoginId()Ljava/lang/String;

    .line 135
    move-result-object v2

    .line 136
    .line 137
    .line 138
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->sharedInstance()Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 139
    move-result-object v3

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->getAnonymousId()Ljava/lang/String;

    .line 143
    move-result-object v3

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, v0, v1, v2, v3}, Lcom/sensorsdata/abtest/core/SensorsABTestTrackHelper;->trackABTestTrigger(Lcom/sensorsdata/abtest/entity/Experiment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    :cond_2
    return-object p1

    .line 148
    .line 149
    :cond_3
    if-eqz p2, :cond_5

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, p1}, Lcom/sensorsdata/abtest/entity/Experiment;->getVariableByParamName(Ljava/lang/String;)Lcom/sensorsdata/abtest/entity/Experiment$Variable;

    .line 153
    move-result-object v0

    .line 154
    .line 155
    if-eqz v0, :cond_4

    .line 156
    .line 157
    iget-object v0, v0, Lcom/sensorsdata/abtest/entity/Experiment$Variable;->type:Ljava/lang/String;

    .line 158
    goto :goto_0

    .line 159
    .line 160
    :cond_4
    const-string v0, ""

    .line 161
    .line 162
    :goto_0
    sget-object v3, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->ASYNC_REQUEST_PARAMS_TYPE_NOT_VALID:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    move-result-object p2

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/lang/Class;->toString()Ljava/lang/String;

    .line 170
    move-result-object p2

    .line 171
    .line 172
    .line 173
    filled-new-array {p1, v0, p2}, [Ljava/lang/Object;

    .line 174
    move-result-object p1

    .line 175
    .line 176
    .line 177
    invoke-static {v3, p1}, Lcom/sensorsdata/abtest/core/SABErrorDispatcher;->dispatchSABException(Lcom/sensorsdata/abtest/entity/SABErrorEnum;[Ljava/lang/Object;)V

    .line 178
    .line 179
    :cond_5
    const-string p1, "getExperimentVariableValue return null"

    .line 180
    .line 181
    .line 182
    invoke-static {v2, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    return-object v1
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
.end method

.method public getExperimentsFromMemoryCache(Ljava/lang/String;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/sensorsdata/abtest/entity/Experiment;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->mHashMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 17
    return-object v0

    .line 18
    .line 19
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    const-string p1, "experiments"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->mHashMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 40
    return-object v0

    .line 41
    :catch_0
    move-exception p1

    .line 42
    goto :goto_0

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-direct {p0, p1, v0}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->parseCache(Ljava/lang/String;Ljava/util/concurrent/ConcurrentHashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    goto :goto_1

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 50
    .line 51
    :goto_1
    iget-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->mHashMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 55
    .line 56
    iget-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->mHashMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 60
    return-object v0
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
.end method

.method public isFuzzyExperiments(Ljava/lang/String;)Z
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->mFuzzyExperiments:Lorg/json/JSONArray;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    .line 14
    :goto_0
    if-ge v3, v0, :cond_2

    .line 15
    .line 16
    :try_start_0
    iget-object v4, p0, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->mFuzzyExperiments:Lorg/json/JSONArray;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 20
    move-result-object v4

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    return v1

    .line 28
    :catch_0
    move-exception v4

    .line 29
    .line 30
    .line 31
    invoke-static {v4}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 32
    .line 33
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    return v2
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
.end method

.method public loadExperimentsFromCache(Ljava/lang/String;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/sensorsdata/abtest/entity/Experiment;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->getExperimentsFromMemoryCache(Ljava/lang/String;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->saveExperiments2DiskCache(Ljava/lang/String;)V

    .line 8
    return-object v0
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

.method public loadExperimentsFromDiskCache()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sensorsdata/abtest/util/SPUtils;->getInstance()Lcom/sensorsdata/abtest/util/SPUtils;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "key_experiment_with_distinct_id"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/sensorsdata/abtest/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string/jumbo v2, "loadExperimentsFromDiskCache | experiments:\n"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/util/JSONUtils;->formatJson(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    const-string v2, "SAB.SensorsABTestCacheManager"

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->getExperimentsFromMemoryCache(Ljava/lang/String;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    return-void
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
.end method

.method public saveExperiments2DiskCache(Ljava/lang/String;)V
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
    const-string/jumbo v1, "\u66f4\u65b0\u8bd5\u9a8c\u6570\u636e\u6210\u529f:\n"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    const-string v1, "SAB.SensorsABTestCacheManager"

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/sensorsdata/abtest/util/SPUtils;->getInstance()Lcom/sensorsdata/abtest/util/SPUtils;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    const-string/jumbo v1, "key_experiment_with_distinct_id"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, p1}, Lcom/sensorsdata/abtest/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    return-void
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
.end method

.method public saveFuzzyExperiments(Lorg/json/JSONArray;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->mFuzzyExperiments:Lorg/json/JSONArray;

    .line 3
    return-void
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
