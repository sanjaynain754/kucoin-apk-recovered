.class public abstract Lcom/appsflyer/internal/AFe1sSDK;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFe1sSDK$AFa1tSDK;,
        Lcom/appsflyer/internal/AFe1sSDK$AFa1uSDK;,
        Lcom/appsflyer/internal/AFe1sSDK$AFa1vSDK;,
        Lcom/appsflyer/internal/AFe1sSDK$AFa1zSDK;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008&\u0018\u0000 \t2\u00020\u0001:\u0004\t\n\u000b\u000cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0008\u001a\u00020\u00028\u0007X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFe1sSDK;",
        "",
        "",
        "p0",
        "<init>",
        "(Ljava/lang/String;)V",
        "getCurrencyIso4217Code",
        "Ljava/lang/String;",
        "AFAdRevenueData",
        "AFa1tSDK",
        "AFa1uSDK",
        "AFa1vSDK",
        "AFa1zSDK"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AFa1tSDK:Lcom/appsflyer/internal/AFe1sSDK$AFa1tSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final getRevenue:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final getCurrencyIso4217Code:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 27

    .line 1
    .line 2
    new-instance v0, Lcom/appsflyer/internal/AFe1sSDK$AFa1tSDK;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFe1sSDK$AFa1tSDK;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/appsflyer/internal/AFe1sSDK;->AFa1tSDK:Lcom/appsflyer/internal/AFe1sSDK$AFa1tSDK;

    .line 9
    .line 10
    const-string v25, "af_tutorial_completion"

    .line 11
    .line 12
    const-string v26, "af_update"

    .line 13
    .line 14
    const-string v2, "af_achievement_unlocked"

    .line 15
    .line 16
    const-string v3, "af_ad_click"

    .line 17
    .line 18
    const-string v4, "af_ad_view"

    .line 19
    .line 20
    const-string v5, "af_add_payment_info"

    .line 21
    .line 22
    const-string v6, "af_add_to_cart"

    .line 23
    .line 24
    const-string v7, "af_add_to_wishlist"

    .line 25
    .line 26
    const-string v8, "af_complete_registration"

    .line 27
    .line 28
    const-string v9, "af_content_view"

    .line 29
    .line 30
    const-string v10, "af_initiated_checkout"

    .line 31
    .line 32
    const-string v11, "af_invite"

    .line 33
    .line 34
    const-string v12, "af_level_achieved"

    .line 35
    .line 36
    const-string v13, "af_list_view"

    .line 37
    .line 38
    const-string v14, "af_login"

    .line 39
    .line 40
    const-string v15, "af_opened_from_push_notification"

    .line 41
    .line 42
    const-string v16, "af_purchase"

    .line 43
    .line 44
    const-string v17, "af_rate"

    .line 45
    .line 46
    const-string v18, "af_re_engage"

    .line 47
    .line 48
    const-string v19, "af_search"

    .line 49
    .line 50
    const-string v20, "af_share"

    .line 51
    .line 52
    const-string v21, "af_spent_credits"

    .line 53
    .line 54
    const-string v22, "af_start_trial"

    .line 55
    .line 56
    const-string v23, "af_subscribe"

    .line 57
    .line 58
    const-string v24, "af_travel_booking"

    .line 59
    .line 60
    .line 61
    filled-new-array/range {v2 .. v26}, [Ljava/lang/String;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    sput-object v0, Lcom/appsflyer/internal/AFe1sSDK;->getRevenue:Ljava/util/List;

    .line 69
    return-void
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

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
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
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1sSDK;->getCurrencyIso4217Code:Ljava/lang/String;

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
.end method

.method public static final synthetic getMonetizationNetwork()Ljava/util/List;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/appsflyer/internal/AFe1sSDK;->getRevenue:Ljava/util/List;

    .line 3
    return-object v0
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
