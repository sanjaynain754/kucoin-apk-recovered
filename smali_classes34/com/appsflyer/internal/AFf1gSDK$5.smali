.class final Lcom/appsflyer/internal/AFf1gSDK$5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/appsflyer/lvl/AppsFlyerLVL$resultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/AFf1gSDK;->getMonetizationNetwork(JLandroid/content/Context;Lcom/appsflyer/internal/AFf1gSDK$AFa1tSDK;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic getCurrencyIso4217Code:Lcom/appsflyer/internal/AFf1gSDK;

.field private synthetic getMonetizationNetwork:Lcom/appsflyer/internal/AFf1gSDK$AFa1tSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFf1gSDK;Lcom/appsflyer/internal/AFf1gSDK$AFa1tSDK;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1gSDK$5;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFf1gSDK;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/appsflyer/internal/AFf1gSDK$5;->getMonetizationNetwork:Lcom/appsflyer/internal/AFf1gSDK$AFa1tSDK;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final onLvlFailure(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1gSDK$5;->getMonetizationNetwork:Lcom/appsflyer/internal/AFf1gSDK$AFa1tSDK;

    .line 3
    .line 4
    const-string v1, "onLvlFailure with exception"

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, v1, p1}, Lcom/appsflyer/internal/AFf1gSDK$AFa1tSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Exception;)V

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
.end method

.method public final onLvlResult(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1gSDK$5;->getMonetizationNetwork:Lcom/appsflyer/internal/AFf1gSDK$AFa1tSDK;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, Lcom/appsflyer/internal/AFf1gSDK$AFa1tSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    const-string p1, "onLvlResult with error"

    .line 13
    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    iget-object p2, p0, Lcom/appsflyer/internal/AFf1gSDK$5;->getMonetizationNetwork:Lcom/appsflyer/internal/AFf1gSDK$AFa1tSDK;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Exception;

    .line 19
    .line 20
    const-string v1, "AFLVL Invalid signature"

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p2, p1, v0}, Lcom/appsflyer/internal/AFf1gSDK$AFa1tSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 27
    return-void

    .line 28
    .line 29
    :cond_1
    iget-object p2, p0, Lcom/appsflyer/internal/AFf1gSDK$5;->getMonetizationNetwork:Lcom/appsflyer/internal/AFf1gSDK$AFa1tSDK;

    .line 30
    .line 31
    new-instance v0, Ljava/lang/Exception;

    .line 32
    .line 33
    const-string v1, "AFLVL Invalid signedData"

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p2, p1, v0}, Lcom/appsflyer/internal/AFf1gSDK$AFa1tSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 40
    return-void
    .line 41
    .line 42
.end method
