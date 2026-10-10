.class public Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;
.super Ljava/lang/Object;
.source "SensorsABTestApiRequestHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$TimeoutRunnable;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "SAB.SensorsABTestApiRequestHelper"


# instance fields
.field private mDistinctId:Ljava/lang/String;

.field private mHasCallback:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->mHasCallback:Z

    .line 7
    return-void
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

.method public static synthetic access$000(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->mHasCallback:Z

    .line 3
    return p0
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

.method public static synthetic access$002(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Z)Z
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->mHasCallback:Z

    .line 3
    return p1
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

.method public static synthetic access$100(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Lcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->doCallbackOnMainThread(Lcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)V

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

.method public static synthetic access$200(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->mDistinctId:Ljava/lang/String;

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

.method private doCallbackOnMainThread(Lcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sensorsdata/abtest/OnABTestReceivedData<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const-string/jumbo v1, "onResult"

    .line 8
    .line 9
    const-class v2, Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    if-ne v1, v2, :cond_0

    .line 32
    .line 33
    .line 34
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 35
    move-result-object p2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    return-void

    .line 40
    :catch_0
    move-exception p1

    .line 41
    goto :goto_0

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-static {}, Lcom/sensorsdata/abtest/util/TaskRunner;->getUiThreadHandler()Landroid/os/Handler;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    new-instance v2, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$4;

    .line 48
    .line 49
    .line 50
    invoke-direct {v2, p0, v0, p1, p2}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$4;-><init>(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Ljava/lang/reflect/Method;Lcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    return-void

    .line 55
    .line 56
    .line 57
    :goto_0
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 58
    return-void
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
.method public requestExperimentByParamName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;ILcom/sensorsdata/abtest/OnABTestReceivedData;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "TT;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;I",
            "Lcom/sensorsdata/abtest/OnABTestReceivedData<",
            "TT;>;Z)V"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v6, p8

    .line 3
    .line 4
    const-string v0, "SAB.SensorsABTestApiRequestHelper"

    .line 5
    .line 6
    if-nez v6, :cond_0

    .line 7
    .line 8
    .line 9
    const-string/jumbo p1, "\u8bd5\u9a8c callback \u4e0d\u6b63\u786e\uff0c\u8bd5\u9a8c callback \u4e0d\u80fd\u4e3a\u7a7a\uff01"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const-string p1, "experiment param name\uff1a%s\uff0c\u8bd5\u9a8c\u53c2\u6570\u540d\u4e0d\u6b63\u786e\uff0c\u8bd5\u9a8c\u53c2\u6570\u540d\u5fc5\u987b\u4e3a\u975e\u7a7a\u5b57\u7b26\u4e32\uff01"

    .line 23
    .line 24
    .line 25
    filled-new-array {p4}, [Ljava/lang/Object;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    .line 29
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    invoke-static {v0, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    iget-boolean p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->mHasCallback:Z

    .line 36
    .line 37
    if-nez p1, :cond_6

    .line 38
    .line 39
    sget-object p1, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->ASYNC_REQUEST_NULL_EXPERIMENT_PARAMETER_NAME:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 40
    .line 41
    .line 42
    filled-new-array {p5}, [Ljava/lang/Object;

    .line 43
    move-result-object p2

    .line 44
    .line 45
    .line 46
    invoke-static {p1, p2}, Lcom/sensorsdata/abtest/core/SABErrorDispatcher;->dispatchSABException(Lcom/sensorsdata/abtest/entity/SABErrorEnum;[Ljava/lang/Object;)V

    .line 47
    .line 48
    iput-boolean v2, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->mHasCallback:Z

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, v6, p5}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->doCallbackOnMainThread(Lcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)V

    .line 52
    return-void

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-static {}, Lcom/sensorsdata/abtest/SensorsABTest;->shareInstance()Lcom/sensorsdata/abtest/SensorsABTest;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/sensorsdata/abtest/SensorsABTest;->getContext()Landroid/content/Context;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/util/NetworkUtils;->isNetworkAvailable(Landroid/content/Context;)Z

    .line 66
    move-result v0

    .line 67
    .line 68
    if-nez v0, :cond_2

    .line 69
    .line 70
    iget-boolean p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->mHasCallback:Z

    .line 71
    .line 72
    if-nez p1, :cond_6

    .line 73
    .line 74
    sget-object p1, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->ASYNC_REQUEST_NETWORK_UNAVAILABLE:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 75
    .line 76
    .line 77
    filled-new-array {p5}, [Ljava/lang/Object;

    .line 78
    move-result-object p2

    .line 79
    .line 80
    .line 81
    invoke-static {p1, p2}, Lcom/sensorsdata/abtest/core/SABErrorDispatcher;->dispatchSABException(Lcom/sensorsdata/abtest/entity/SABErrorEnum;[Ljava/lang/Object;)V

    .line 82
    .line 83
    iput-boolean v2, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->mHasCallback:Z

    .line 84
    .line 85
    .line 86
    invoke-direct {p0, v6, p5}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->doCallbackOnMainThread(Lcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)V

    .line 87
    return-void

    .line 88
    .line 89
    :cond_2
    if-eqz p6, :cond_3

    .line 90
    .line 91
    .line 92
    invoke-interface {p6}, Ljava/util/Map;->size()I

    .line 93
    move-result v0

    .line 94
    .line 95
    if-lez v0, :cond_3

    .line 96
    .line 97
    .line 98
    :try_start_0
    invoke-static {p6}, Lcom/sensorsdata/abtest/util/SensorsDataHelper;->checkPropertiesAndToString(Ljava/util/Map;)Ljava/util/Map;

    .line 99
    move-result-object v0
    :try_end_0
    .catch Lcom/sensorsdata/abtest/exception/DataInvalidException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    :goto_0
    move-object v8, v0

    .line 101
    goto :goto_1

    .line 102
    :catch_0
    move-exception v0

    .line 103
    move-object p1, v0

    .line 104
    .line 105
    iget-boolean p2, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->mHasCallback:Z

    .line 106
    .line 107
    if-nez p2, :cond_6

    .line 108
    .line 109
    sget-object p2, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->ASYNC_REQUEST_PROPERTIES_NOT_VALID:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 113
    move-result-object p1

    .line 114
    .line 115
    .line 116
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    .line 120
    invoke-static {p2, p1}, Lcom/sensorsdata/abtest/core/SABErrorDispatcher;->dispatchSABException(Lcom/sensorsdata/abtest/entity/SABErrorEnum;[Ljava/lang/Object;)V

    .line 121
    .line 122
    iput-boolean v2, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->mHasCallback:Z

    .line 123
    .line 124
    .line 125
    invoke-direct {p0, v6, p5}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->doCallbackOnMainThread(Lcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)V

    .line 126
    goto :goto_4

    .line 127
    :cond_3
    const/4 v0, 0x0

    .line 128
    goto :goto_0

    .line 129
    .line 130
    :goto_1
    if-eqz p9, :cond_5

    .line 131
    .line 132
    .line 133
    invoke-static {}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->getInstance()Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, p4}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->isFuzzyExperiments(Ljava/lang/String;)Z

    .line 138
    move-result v0

    .line 139
    .line 140
    if-nez v0, :cond_4

    .line 141
    .line 142
    iget-boolean p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->mHasCallback:Z

    .line 143
    .line 144
    if-nez p1, :cond_6

    .line 145
    .line 146
    sget-object p1, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->ASYNC_REQUEST_EXPERIMENT_NOT_IN_FUZZY:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    .line 147
    .line 148
    .line 149
    filled-new-array {p5}, [Ljava/lang/Object;

    .line 150
    move-result-object p2

    .line 151
    .line 152
    .line 153
    invoke-static {p1, p2}, Lcom/sensorsdata/abtest/core/SABErrorDispatcher;->dispatchSABException(Lcom/sensorsdata/abtest/entity/SABErrorEnum;[Ljava/lang/Object;)V

    .line 154
    .line 155
    iput-boolean v2, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->mHasCallback:Z

    .line 156
    .line 157
    .line 158
    invoke-direct {p0, v6, p5}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->doCallbackOnMainThread(Lcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)V

    .line 159
    return-void

    .line 160
    .line 161
    .line 162
    :cond_4
    invoke-static {}, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;->getInstance()Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;

    .line 163
    move-result-object v0

    .line 164
    move-object v1, p2

    .line 165
    move-object v2, p3

    .line 166
    move-object v3, p4

    .line 167
    move-object v7, p5

    .line 168
    move-object v4, p6

    .line 169
    .line 170
    move/from16 v5, p7

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v0 .. v7}, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;->mergeRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;

    .line 174
    move-result-object v0

    .line 175
    :goto_2
    move-object v3, v0

    .line 176
    goto :goto_3

    .line 177
    .line 178
    .line 179
    :cond_5
    invoke-static {}, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;->getInstance()Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;

    .line 180
    move-result-object v0

    .line 181
    move-object v1, p2

    .line 182
    move-object v2, p3

    .line 183
    move-object v3, p4

    .line 184
    move-object v7, p5

    .line 185
    move-object v4, p6

    .line 186
    .line 187
    move/from16 v5, p7

    .line 188
    .line 189
    move-object/from16 v6, p8

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v0 .. v7}, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;->createRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;

    .line 193
    move-result-object v0

    .line 194
    goto :goto_2

    .line 195
    .line 196
    .line 197
    :goto_3
    invoke-virtual {v3}, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;->isMergedTask()Z

    .line 198
    move-result v0

    .line 199
    .line 200
    if-eqz v0, :cond_7

    .line 201
    :cond_6
    :goto_4
    return-void

    .line 202
    .line 203
    :cond_7
    new-instance v4, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$TimeoutRunnable;

    .line 204
    .line 205
    .line 206
    invoke-direct {v4, p0, v3}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$TimeoutRunnable;-><init>(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;)V

    .line 207
    .line 208
    .line 209
    invoke-static {}, Lcom/sensorsdata/abtest/util/TaskRunner;->getBackHandler()Landroid/os/Handler;

    .line 210
    move-result-object v0

    .line 211
    .line 212
    move/from16 v5, p7

    .line 213
    int-to-long v1, v5

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 217
    .line 218
    iput-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->mDistinctId:Ljava/lang/String;

    .line 219
    .line 220
    new-instance v1, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;

    .line 221
    move-object v2, p0

    .line 222
    move-object v5, p1

    .line 223
    move-object v6, p2

    .line 224
    move-object v7, p3

    .line 225
    .line 226
    .line 227
    invoke-direct/range {v1 .. v7}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;-><init>(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$TimeoutRunnable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0, v8, p4, v1}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->requestExperimentsAndUpdateCache(Ljava/util/Map;Ljava/lang/String;Lcom/sensorsdata/abtest/core/IApiCallback;)V

    .line 231
    return-void
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
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
.end method

.method public requestExperiments(Ljava/util/Map;Ljava/lang/String;Lcom/sensorsdata/abtest/core/IApiCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/sensorsdata/abtest/core/IApiCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->requestExperiments(Ljava/util/Map;Ljava/lang/String;Lorg/json/JSONObject;Lcom/sensorsdata/abtest/core/IApiCallback;)V

    return-void
.end method

.method public requestExperiments(Ljava/util/Map;Ljava/lang/String;Lorg/json/JSONObject;Lcom/sensorsdata/abtest/core/IApiCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "Lcom/sensorsdata/abtest/core/IApiCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-static {}, Lcom/sensorsdata/abtest/SensorsABTest;->shareInstance()Lcom/sensorsdata/abtest/SensorsABTest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sensorsdata/abtest/SensorsABTest;->getConfigOptions()Lcom/sensorsdata/abtest/SensorsABTestConfigOptions;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/sensorsdata/abtest/SensorsABTestConfigOptions;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {v0}, Lcom/sensorsdata/abtest/util/UrlUtil;->getApiBaseUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-static {v0}, Lcom/sensorsdata/abtest/util/UrlUtil;->getProjectKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    move-object v0, v1

    .line 6
    :goto_0
    new-instance v2, Lcom/sensorsdata/abtest/entity/ExperimentRequest;

    invoke-direct {v2, p1, p2, p3}, Lcom/sensorsdata/abtest/entity/ExperimentRequest;-><init>(Ljava/util/Map;Ljava/lang/String;Lorg/json/JSONObject;)V

    invoke-virtual {v2}, Lcom/sensorsdata/abtest/entity/ExperimentRequest;->createRequestBody()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const-string p3, "SAB.SensorsABTestApiRequestHelper"

    if-eqz p2, :cond_1

    .line 8
    const-string/jumbo p1, "url is empty and request cancel"

    invoke-static {p3, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 9
    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 10
    const-string/jumbo p1, "key is empty and request cancel"

    invoke-static {p3, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 11
    :cond_2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 12
    const-string/jumbo p1, "request body is empty and request cancel"

    invoke-static {p3, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 13
    :cond_3
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 14
    const-string/jumbo p3, "project-key"

    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    new-instance p3, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;

    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/network/HttpMethod;->POST:Lcom/sensorsdata/analytics/android/sdk/network/HttpMethod;

    invoke-direct {p3, v0, v1}, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;-><init>(Lcom/sensorsdata/analytics/android/sdk/network/HttpMethod;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p3, p2}, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->header(Ljava/util/Map;)Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;

    move-result-object p2

    .line 17
    invoke-virtual {p2, p1}, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->jsonData(Ljava/lang/String;)Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;

    move-result-object p1

    new-instance p2, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$2;

    invoke-direct {p2, p0, p4}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$2;-><init>(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Lcom/sensorsdata/abtest/core/IApiCallback;)V

    .line 18
    invoke-virtual {p1, p2}, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->callback(Lcom/sensorsdata/analytics/android/sdk/network/HttpCallback;)Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;

    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lcom/sensorsdata/analytics/android/sdk/network/RequestHelper$Builder;->execute()V

    return-void
.end method

.method public requestExperimentsAndUpdateCache()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, v0, v0}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->requestExperimentsAndUpdateCache(Ljava/util/Map;Ljava/lang/String;Lcom/sensorsdata/abtest/core/IApiCallback;)V

    return-void
.end method

.method public requestExperimentsAndUpdateCache(Ljava/util/Map;Ljava/lang/String;Lcom/sensorsdata/abtest/core/IApiCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/sensorsdata/abtest/core/IApiCallback<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/sensorsdata/abtest/entity/Experiment;",
            ">;>;)V"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$3;

    invoke-direct {v0, p0, p3}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$3;-><init>(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Lcom/sensorsdata/abtest/core/IApiCallback;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->requestExperiments(Ljava/util/Map;Ljava/lang/String;Lcom/sensorsdata/abtest/core/IApiCallback;)V

    return-void
.end method
