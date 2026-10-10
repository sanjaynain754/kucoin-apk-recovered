.class public final Lcom/appsflyer/internal/AFi1oSDK$AFa1zSDK;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/AFi1oSDK;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private synthetic AFAdRevenueData:Lcom/appsflyer/internal/AFi1oSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFi1oSDK;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/appsflyer/internal/AFi1oSDK$AFa1zSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFi1oSDK;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

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
.method public final onAvailable(Landroid/net/Network;)V
    .locals 1
    .param p1    # Landroid/net/Network;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1oSDK$AFa1zSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFi1oSDK;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lcom/appsflyer/internal/AFi1oSDK;->z_(Lcom/appsflyer/internal/AFi1oSDK;Landroid/net/Network;)V

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
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 1
    .param p1    # Landroid/net/Network;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1oSDK$AFa1zSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFi1oSDK;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lcom/appsflyer/internal/AFi1oSDK;->z_(Lcom/appsflyer/internal/AFi1oSDK;Landroid/net/Network;)V

    .line 11
    .line 12
    iget-object p1, p0, Lcom/appsflyer/internal/AFi1oSDK$AFa1zSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFi1oSDK;

    .line 13
    .line 14
    const-string v0, "NetworkLost"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Lcom/appsflyer/internal/AFi1oSDK;->getMonetizationNetwork(Lcom/appsflyer/internal/AFi1oSDK;Ljava/lang/String;)V

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
