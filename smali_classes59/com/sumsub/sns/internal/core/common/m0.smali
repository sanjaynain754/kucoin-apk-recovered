.class public final Lcom/sumsub/sns/internal/core/common/m0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public a:Landroid/content/Context;

.field public final b:Lkotlin/Lazy;

.field public c:Lkotlin/jvm/functions/Function1;

.field public final d:Lcom/sumsub/sns/internal/core/common/l0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/core/common/d2;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/common/d2;-><init>(Lcom/sumsub/sns/internal/core/common/m0;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/common/m0;->b:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/sumsub/sns/internal/core/common/l0;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/common/l0;-><init>(Lcom/sumsub/sns/internal/core/common/m0;)V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/common/m0;->d:Lcom/sumsub/sns/internal/core/common/l0;

    .line 22
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/common/m0;)Landroid/net/ConnectivityManager;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/common/m0;->a:Landroid/content/Context;

    if-eqz p0, :cond_0

    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    check-cast p0, Landroid/net/ConnectivityManager;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/common/m0;Landroid/content/Context;)Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;
    .locals 2

    if-nez p1, :cond_0

    .line 21
    :try_start_0
    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->NONE:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    return-object p0

    .line 22
    :cond_0
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    .line 23
    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_9

    .line 24
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/common/m0;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_8

    .line 25
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 26
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/common/m0;->b:Lkotlin/Lazy;

    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    if-eqz v1, :cond_7

    .line 27
    invoke-virtual {v1, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    .line 28
    invoke-virtual {v0, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->WIFI:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    return-object p0

    :cond_3
    const/4 v1, 0x3

    .line 29
    invoke-virtual {v0, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->ETHERNET:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    return-object p0

    :cond_4
    const/4 v1, 0x0

    .line 30
    invoke-virtual {v0, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 31
    const-string v0, "android.permission.READ_PHONE_STATE"

    .line 32
    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_5

    .line 33
    const-string/jumbo v0, "phone"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telephony/TelephonyManager;

    .line 34
    invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getDataNetworkType()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    .line 35
    :pswitch_0
    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->OTHER:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    return-object p0

    .line 36
    :pswitch_1
    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->M_5G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    return-object p0

    .line 37
    :pswitch_2
    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->M_4G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    return-object p0

    .line 38
    :pswitch_3
    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->LTE:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    return-object p0

    .line 39
    :pswitch_4
    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->M_3G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    return-object p0

    .line 40
    :pswitch_5
    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->M_2G:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    return-object p0

    .line 41
    :cond_5
    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->NONE:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    return-object p0

    .line 42
    :cond_6
    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->OTHER:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    return-object p0

    .line 43
    :cond_7
    :goto_0
    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->NONE:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    return-object p0

    .line 44
    :cond_8
    :goto_1
    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->OTHER:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    return-object p0

    .line 45
    :cond_9
    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->NO_PERMISSION:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 46
    :catchall_0
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 47
    const-string p1, "Error while getting network type"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    sget-object p0, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->NONE:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 15
    :try_start_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/common/m0;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 16
    const-string v1, "android.permission.CHANGE_NETWORK_STATE"

    .line 17
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    .line 18
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/common/m0;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    .line 19
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/common/m0;->d:Lcom/sumsub/sns/internal/core/common/l0;

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    return-void

    .line 20
    :goto_0
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Can\'t stop network manager"

    invoke-static {v1, v2, v0}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/common/m0;->a:Landroid/content/Context;

    .line 3
    :try_start_0
    const-string v0, "android.permission.CHANGE_NETWORK_STATE"

    .line 4
    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_1

    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/common/m0;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    new-instance p1, Landroid/net/NetworkRequest$Builder;

    invoke-direct {p1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    const/16 p2, 0xc

    .line 7
    invoke-virtual {p1, p2}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    move-result-object p1

    const/4 p2, 0x1

    .line 8
    invoke-virtual {p1, p2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 9
    invoke-virtual {p1, p2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object p1

    .line 11
    iget-object p2, p0, Lcom/sumsub/sns/internal/core/common/m0;->b:Lkotlin/Lazy;

    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/net/ConnectivityManager;

    if-eqz p2, :cond_0

    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/common/m0;->d:Lcom/sumsub/sns/internal/core/common/l0;

    invoke-virtual {p2, p1, v0}, Landroid/net/ConnectivityManager;->requestNetwork(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    .line 13
    :cond_1
    sget-object p1, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->NO_PERMISSION:Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 14
    :goto_0
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "Can\'t start network manager"

    invoke-static {p2, v0, p1}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
