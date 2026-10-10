.class public final Lcom/appsflyer/internal/AFj1oSDK;
.super Lcom/appsflyer/internal/AFi1eSDK;
.source ""


# instance fields
.field private final getMonetizationNetwork:Lcom/appsflyer/internal/AFd1zSDK;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;Lcom/appsflyer/internal/AFd1zSDK;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "store"

    .line 4
    .line 5
    const-string v1, "samsung"

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0, v1, p1}, Lcom/appsflyer/internal/AFi1eSDK;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 9
    .line 10
    iput-object p2, p0, Lcom/appsflyer/internal/AFj1oSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFd1zSDK;

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
.end method


# virtual methods
.method public final AFAdRevenueData(Landroid/content/Context;)V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/appsflyer/internal/AFj1oSDK$5;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1oSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFd1zSDK;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Lcom/appsflyer/internal/AFd1zSDK;->getMonetizationNetwork()Ljava/util/concurrent/ExecutorService;

    .line 8
    move-result-object v3

    .line 9
    .line 10
    const-string v1, "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901"

    .line 11
    .line 12
    .line 13
    filled-new-array {v1}, [Ljava/lang/String;

    .line 14
    move-result-object v5

    .line 15
    .line 16
    const-string v4, "com.sec.android.app.samsungapps.referrer"

    .line 17
    move-object v1, p0

    .line 18
    move-object v2, p1

    .line 19
    .line 20
    .line 21
    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/internal/AFj1oSDK$5;-><init>(Lcom/appsflyer/internal/AFj1oSDK;Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/lang/String;[Ljava/lang/String;)V

    .line 22
    .line 23
    iget-object p1, v1, Lcom/appsflyer/internal/AFj1oSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFd1zSDK;

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Lcom/appsflyer/internal/AFd1zSDK;->component4()Lcom/appsflyer/internal/AFc1pSDK;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/appsflyer/internal/AFa1ySDK;->getMonetizationNetwork()Lcom/appsflyer/internal/AFa1ySDK;

    .line 31
    const/4 v2, 0x0

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v2}, Lcom/appsflyer/internal/AFa1ySDK;->getCurrencyIso4217Code(Lcom/appsflyer/internal/AFc1pSDK;Z)I

    .line 35
    move-result p1

    .line 36
    .line 37
    if-gtz p1, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFb1rSDK;->getMonetizationNetwork()Z

    .line 41
    move-result p1

    .line 42
    .line 43
    if-nez p1, :cond_0

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_0
    iget-object p1, v0, Lcom/appsflyer/internal/AFb1rSDK;->AFAdRevenueData:Ljava/util/concurrent/Executor;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/appsflyer/internal/AFb1rSDK;->getMonetizationNetwork:Ljava/util/concurrent/FutureTask;

    .line 49
    .line 50
    .line 51
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 55
    move-result-wide v2

    .line 56
    .line 57
    iput-wide v2, v1, Lcom/appsflyer/internal/AFj1tSDK;->component4:J

    .line 58
    .line 59
    sget-object p1, Lcom/appsflyer/internal/AFj1tSDK$AFa1ySDK;->getMediationNetwork:Lcom/appsflyer/internal/AFj1tSDK$AFa1ySDK;

    .line 60
    .line 61
    iput-object p1, v1, Lcom/appsflyer/internal/AFj1tSDK;->areAllFieldsValid:Lcom/appsflyer/internal/AFj1tSDK$AFa1ySDK;

    .line 62
    .line 63
    new-instance p1, Lcom/appsflyer/internal/AFj1tSDK$2;

    .line 64
    .line 65
    .line 66
    invoke-direct {p1, p0}, Lcom/appsflyer/internal/AFj1tSDK$2;-><init>(Lcom/appsflyer/internal/AFj1tSDK;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1}, Ljava/util/Observable;->addObserver(Ljava/util/Observer;)V

    .line 70
    :cond_1
    :goto_0
    return-void
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
