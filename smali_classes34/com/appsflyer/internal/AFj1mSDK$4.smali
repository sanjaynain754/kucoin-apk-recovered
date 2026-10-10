.class final Lcom/appsflyer/internal/AFj1mSDK$4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFj1mSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic AFAdRevenueData:Lcom/appsflyer/internal/AFj1mSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFj1mSDK;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/appsflyer/internal/AFj1mSDK$4;->AFAdRevenueData:Lcom/appsflyer/internal/AFj1mSDK;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1mSDK$4;->AFAdRevenueData:Lcom/appsflyer/internal/AFj1mSDK;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/appsflyer/internal/AFj1mSDK;->getRevenue:Ljava/lang/Object;

    .line 5
    monitor-enter v0

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1mSDK$4;->AFAdRevenueData:Lcom/appsflyer/internal/AFj1mSDK;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFj1mSDK;->getMediationNetwork()V

    .line 11
    .line 12
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1mSDK$4;->AFAdRevenueData:Lcom/appsflyer/internal/AFj1mSDK;

    .line 13
    .line 14
    iget-object v2, v1, Lcom/appsflyer/internal/AFj1mSDK;->AFAdRevenueData:Landroid/os/Handler;

    .line 15
    .line 16
    iget-object v1, v1, Lcom/appsflyer/internal/AFj1mSDK;->getMonetizationNetwork:Ljava/lang/Runnable;

    .line 17
    .line 18
    const-wide/16 v3, 0x96

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 22
    .line 23
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1mSDK$4;->AFAdRevenueData:Lcom/appsflyer/internal/AFj1mSDK;

    .line 24
    const/4 v2, 0x1

    .line 25
    .line 26
    iput-boolean v2, v1, Lcom/appsflyer/internal/AFj1mSDK;->getMediationNetwork:Z

    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    monitor-exit v0

    .line 31
    throw v1
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
.end method
