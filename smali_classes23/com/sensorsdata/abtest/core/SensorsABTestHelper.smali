.class public Lcom/sensorsdata/abtest/core/SensorsABTestHelper;
.super Ljava/lang/Object;
.source "SensorsABTestHelper.java"

# interfaces
.implements Lcom/sensorsdata/analytics/android/sdk/listener/SAJSListener;
.implements Lcom/sensorsdata/analytics/android/sdk/listener/SAEventListener;
.implements Lcom/sensorsdata/abtest/core/AppStateManager$AppStateChangedListener;


# static fields
.field private static final TAG:Ljava/lang/String; = "SensorsABTestHelper"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mCountDownTimer:Landroid/os/CountDownTimer;


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
    .line 18
    .line 19
    .line 20
.end method

.method public static synthetic access$000(Lcom/sensorsdata/abtest/core/SensorsABTestHelper;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->cancelTimer()V

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
.end method

.method public static synthetic access$100(Lcom/sensorsdata/abtest/core/SensorsABTestHelper;)Landroid/os/CountDownTimer;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->mCountDownTimer:Landroid/os/CountDownTimer;

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

.method public static synthetic access$102(Lcom/sensorsdata/abtest/core/SensorsABTestHelper;Landroid/os/CountDownTimer;)Landroid/os/CountDownTimer;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->mCountDownTimer:Landroid/os/CountDownTimer;

    .line 3
    return-object p1
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

.method private cancelTimer()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->mCountDownTimer:Landroid/os/CountDownTimer;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/os/CountDownTimer;->cancel()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    goto :goto_2

    .line 12
    :catch_0
    move-exception v1

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :cond_0
    :goto_0
    iput-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->mCountDownTimer:Landroid/os/CountDownTimer;

    .line 16
    return-void

    .line 17
    .line 18
    .line 19
    :goto_1
    :try_start_1
    invoke-static {v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    iput-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->mCountDownTimer:Landroid/os/CountDownTimer;

    .line 22
    return-void

    .line 23
    .line 24
    :goto_2
    iput-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->mCountDownTimer:Landroid/os/CountDownTimer;

    .line 25
    throw v1
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
.end method

.method private onDistinctIdChanged()V
    .locals 1

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->getInstance()Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->clearCache()V

    .line 8
    .line 9
    new-instance v0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->requestExperimentsAndUpdateCache()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-void

    .line 17
    :catch_0
    move-exception v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 21
    return-void
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
.end method

.method private requestExperimentsAndUpdateCacheWithRetry()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sensorsdata/abtest/util/TaskRunner;->getBackHandler()Landroid/os/Handler;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;-><init>(Lcom/sensorsdata/abtest/core/SensorsABTestHelper;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method


# virtual methods
.method public identify()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "identify"

    .line 3
    .line 4
    const-string v1, "SensorsABTestHelper"

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->sharedInstance()Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->getLoginId()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->onDistinctIdChanged()V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_0
    const-string v0, "User has login, no need change!"

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

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
.end method

.method public init(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->mContext:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/sensorsdata/abtest/util/SPUtils;->getInstance()Lcom/sensorsdata/abtest/util/SPUtils;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/sensorsdata/abtest/util/SPUtils;->init(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->getInstance()Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/sensorsdata/abtest/core/SensorsABTestCacheManager;->loadExperimentsFromDiskCache()V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->sharedInstance()Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->addSAJSListener(Lcom/sensorsdata/analytics/android/sdk/listener/SAJSListener;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->sharedInstance()Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Lcom/sensorsdata/analytics/android/sdk/SensorsDataAPI;->addEventListener(Lcom/sensorsdata/analytics/android/sdk/listener/SAEventListener;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->requestExperimentsAndUpdateCacheWithRetry()V

    .line 34
    .line 35
    instance-of v0, p1, Landroid/app/Application;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    check-cast p1, Landroid/app/Application;

    .line 40
    .line 41
    new-instance v0, Lcom/sensorsdata/abtest/core/AppStateManager;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0}, Lcom/sensorsdata/abtest/core/AppStateManager;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p0}, Lcom/sensorsdata/abtest/core/AppStateManager;->addAppStateChangedListener(Lcom/sensorsdata/abtest/core/AppStateManager$AppStateChangedListener;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 51
    :cond_0
    return-void
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

.method public login()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "SensorsABTestHelper"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "login"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->onDistinctIdChanged()V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public logout()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "SensorsABTestHelper"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "logout"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->onDistinctIdChanged()V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public onEnterBackground()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "AppStartupManager"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "onEnterBackground"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->mContext:Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/sensorsdata/abtest/util/AlarmManagerUtils;->getInstance(Landroid/content/Context;)Lcom/sensorsdata/abtest/util/AlarmManagerUtils;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/sensorsdata/abtest/util/AlarmManagerUtils;->cancelAlarm()V

    .line 18
    return-void
    .line 19
    .line 20
.end method

.method public onEnterForeground(Z)V
    .locals 1

    .line 1
    .line 2
    const-string p1, "AppStartupManager"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v0, "onEnterForeground"

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->mContext:Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/sensorsdata/abtest/util/AlarmManagerUtils;->getInstance(Landroid/content/Context;)Lcom/sensorsdata/abtest/util/AlarmManagerUtils;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/sensorsdata/abtest/util/AlarmManagerUtils;->setUpAlarm()V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public onReceiveJSMessage(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/sensorsdata/abtest/core/SensorsABTestH5Helper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, Lcom/sensorsdata/abtest/core/SensorsABTestH5Helper;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/sensorsdata/abtest/core/SensorsABTestH5Helper;->handlerJSMessage()V

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

.method public resetAnonymousId()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "SensorsABTestHelper"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "resetAnonymousId"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->onDistinctIdChanged()V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public trackEvent(Lorg/json/JSONObject;)V
    .locals 9

    .line 1
    .line 2
    const-string v0, "$abtest_anonymous_id"

    .line 3
    .line 4
    const-string v1, "$abtest_login_id"

    .line 5
    .line 6
    const-string v2, "$abtest_distinct_id"

    .line 7
    .line 8
    :try_start_0
    const-string v3, "event"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v3

    .line 13
    .line 14
    const-string v4, "$ABTestTrigger"

    .line 15
    .line 16
    .line 17
    invoke-static {v4, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 18
    move-result v3

    .line 19
    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    .line 23
    const-string/jumbo v3, "properties"

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    if-nez v3, :cond_0

    .line 30
    goto :goto_3

    .line 31
    .line 32
    :cond_0
    const-string v4, "SensorsABTestHelper"

    .line 33
    .line 34
    const-string v5, "distinct_id is %s,login_id is %s,anonymous_id is %s"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    move-result-object v6

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v7

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    move-result-object v8

    .line 47
    .line 48
    .line 49
    filled-new-array {v6, v7, v8}, [Ljava/lang/Object;

    .line 50
    move-result-object v6

    .line 51
    .line 52
    .line 53
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    move-result-object v5

    .line 55
    .line 56
    .line 57
    invoke-static {v4, v5}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 61
    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    :try_start_1
    const-string v4, "distinct_id"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    move-result-object v5

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 76
    goto :goto_0

    .line 77
    :catch_0
    move-exception p1

    .line 78
    goto :goto_2

    .line 79
    :catch_1
    move-exception v2

    .line 80
    .line 81
    .line 82
    :try_start_2
    invoke-static {v2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    :goto_0
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 86
    move-result v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 87
    .line 88
    if-eqz v2, :cond_2

    .line 89
    .line 90
    .line 91
    :try_start_3
    const-string/jumbo v2, "login_id"

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    move-result-object v4

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 102
    goto :goto_1

    .line 103
    :catch_2
    move-exception v1

    .line 104
    .line 105
    .line 106
    :try_start_4
    invoke-static {v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    :goto_1
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 110
    move-result v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 111
    .line 112
    if-eqz v1, :cond_3

    .line 113
    .line 114
    :try_start_5
    const-string v1, "anonymous_id"

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    move-result-object v2

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 125
    goto :goto_3

    .line 126
    :catch_3
    move-exception p1

    .line 127
    .line 128
    .line 129
    :try_start_6
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 130
    goto :goto_3

    .line 131
    .line 132
    .line 133
    :goto_2
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 134
    :cond_3
    :goto_3
    return-void
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
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method
