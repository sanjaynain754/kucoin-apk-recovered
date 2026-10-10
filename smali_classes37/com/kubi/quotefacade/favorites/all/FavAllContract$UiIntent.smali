.class public abstract Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;
.super Ljava/lang/Object;
.source "FavAllContract.kt"

# interfaces
.implements Lcom/kubi/mvi/state/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$CollectOrCancelCoin;,
        Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$FetchFavData;,
        Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$PinItemToTop;,
        Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribe;,
        Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribeAlpha;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\u0008B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;",
        "Lcom/kubi/mvi/state/IIntent;",
        "<init>",
        "()V",
        "FetchFavData",
        "PinItemToTop",
        "CollectOrCancelCoin",
        "UpdateSubscribe",
        "UpdateSubscribeAlpha",
        "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$CollectOrCancelCoin;",
        "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$FetchFavData;",
        "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$PinItemToTop;",
        "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribe;",
        "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribeAlpha;",
        "QuoteFacadeLib_googleRelease"
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
    invoke-direct {p0}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;-><init>()V

    return-void
.end method
