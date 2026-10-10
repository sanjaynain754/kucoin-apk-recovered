.class public abstract Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;
.super Ljava/lang/Object;
.source "SearchCoinContract.kt"

# interfaces
.implements Lcom/kubi/mvi/state/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$AddHistoryIntent;,
        Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$FindCoinInfo;,
        Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetCacheData;,
        Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetHeaderIndexList;,
        Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetPositionForSection;,
        Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$RemoveHistoryList;,
        Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$SearchCoinIntent;,
        Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$StartSearchMode;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0008\u0004\u0005\u0006\u0007\u0008\t\n\u000bB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0008\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;",
        "Lcom/kubi/mvi/state/IIntent;",
        "<init>",
        "()V",
        "GetCacheData",
        "GetHeaderIndexList",
        "GetPositionForSection",
        "RemoveHistoryList",
        "SearchCoinIntent",
        "AddHistoryIntent",
        "FindCoinInfo",
        "StartSearchMode",
        "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$AddHistoryIntent;",
        "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$FindCoinInfo;",
        "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetCacheData;",
        "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetHeaderIndexList;",
        "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetPositionForSection;",
        "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$RemoveHistoryList;",
        "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$SearchCoinIntent;",
        "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$StartSearchMode;",
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
    invoke-direct {p0}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;-><init>()V

    return-void
.end method
