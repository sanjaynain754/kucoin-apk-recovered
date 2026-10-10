.class public abstract Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;
.super Ljava/lang/Object;
.source "AssetFuturesCoinsContract.kt"

# interfaces
.implements Lcom/kubi/mvi/state/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$FetchFuturesList;,
        Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$FetchFuturesTrialDetails;,
        Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$FetchSpotPnlOverview;,
        Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$FetchTrialList;,
        Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$HideOrShowNumber;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\u0008B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;",
        "Lcom/kubi/mvi/state/IIntent;",
        "<init>",
        "()V",
        "HideOrShowNumber",
        "FetchFuturesList",
        "FetchSpotPnlOverview",
        "FetchFuturesTrialDetails",
        "FetchTrialList",
        "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$FetchFuturesList;",
        "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$FetchFuturesTrialDetails;",
        "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$FetchSpotPnlOverview;",
        "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$FetchTrialList;",
        "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent$HideOrShowNumber;",
        "AssetsCenterLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;-><init>()V

    return-void
.end method
