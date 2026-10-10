.class public final Lcom/appsflyer/internal/AFg1sSDK;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/appsflyer/internal/AFg1wSDK;


# static fields
.field private static getMonetizationNetwork:Landroid/content/IntentFilter;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/content/IntentFilter;

    .line 3
    .line 4
    const-string v1, "android.intent.action.BATTERY_CHANGED"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    sput-object v0, Lcom/appsflyer/internal/AFg1sSDK;->getMonetizationNetwork:Landroid/content/IntentFilter;

    .line 10
    return-void
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
    .line 21
    .line 22
.end method


# virtual methods
.method public final getMediationNetwork(Landroid/content/Context;)Lcom/appsflyer/internal/AFg1wSDK$AFa1uSDK;
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    :try_start_0
    sget-object v2, Lcom/appsflyer/internal/AFg1sSDK;->getMonetizationNetwork:Landroid/content/IntentFilter;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    if-eqz p1, :cond_4

    .line 11
    .line 12
    .line 13
    const-string/jumbo v2, "status"

    .line 14
    const/4 v3, -0x1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 18
    move-result v2

    .line 19
    const/4 v4, 0x2

    .line 20
    .line 21
    if-ne v4, v2, :cond_3

    .line 22
    .line 23
    const-string v2, "plugged"

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 27
    move-result v2

    .line 28
    const/4 v5, 0x1

    .line 29
    .line 30
    if-eq v2, v5, :cond_2

    .line 31
    .line 32
    if-eq v2, v4, :cond_1

    .line 33
    const/4 v4, 0x4

    .line 34
    .line 35
    if-eq v2, v4, :cond_0

    .line 36
    .line 37
    const-string v0, "other"

    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_1

    .line 41
    .line 42
    .line 43
    :cond_0
    const-string/jumbo v0, "wireless"

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :cond_1
    const-string/jumbo v0, "usb"

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_2
    const-string v0, "ac"

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_3
    const-string v0, "no"

    .line 54
    .line 55
    :goto_0
    const-string v2, "level"

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 59
    move-result v2

    .line 60
    .line 61
    const-string v4, "scale"

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v4, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 65
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    if-eq v3, v2, :cond_4

    .line 68
    .line 69
    if-eq v3, p1, :cond_4

    .line 70
    .line 71
    const/high16 v1, 0x42c80000    # 100.0f

    .line 72
    int-to-float v2, v2

    .line 73
    mul-float/2addr v2, v1

    .line 74
    int-to-float p1, p1

    .line 75
    .line 76
    div-float v1, v2, p1

    .line 77
    goto :goto_2

    .line 78
    .line 79
    :goto_1
    const-string v2, "Device that failed to register receiver"

    .line 80
    .line 81
    .line 82
    invoke-static {v2, p1}, Lcom/appsflyer/AFLogger;->afErrorLogForExcManagerOnly(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    :cond_4
    :goto_2
    new-instance p1, Lcom/appsflyer/internal/AFg1wSDK$AFa1uSDK;

    .line 85
    .line 86
    .line 87
    invoke-direct {p1, v1, v0}, Lcom/appsflyer/internal/AFg1wSDK$AFa1uSDK;-><init>(FLjava/lang/String;)V

    .line 88
    return-object p1
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
