.class public abstract Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;
.super Ljava/lang/Object;
.source "MarketingCouponListAdapter.kt"

# interfaces
.implements Lio/chad/library/adapter/base/entity/MultiItemEntity;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$Companion;,
        Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$ItemAvailable;,
        Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$ItemHeader;,
        Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$ItemUnAvailable;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 \u000f2\u00020\u0001:\u0004\u000c\r\u000e\u000fB\u001f\u0008\u0004\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u0082\u0001\u0003\u0010\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;",
        "Lio/chad/library/adapter/base/entity/MultiItemEntity;",
        "title",
        "",
        "couponInfo",
        "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;",
        "<init>",
        "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;)V",
        "getTitle",
        "()Ljava/lang/String;",
        "getCouponInfo",
        "()Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;",
        "ItemHeader",
        "ItemAvailable",
        "ItemUnAvailable",
        "Companion",
        "Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$ItemAvailable;",
        "Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$ItemHeader;",
        "Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$ItemUnAvailable;",
        "PaymentLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final ITEM_TYPE_AVAILABLE:I = 0x1

.field public static final ITEM_TYPE_HEADER:I = 0x0

.field public static final ITEM_TYPE_UNAVAILABLE:I = 0x2


# instance fields
.field private final couponInfo:Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;->Companion:Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$Companion;

    .line 9
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;->title:Ljava/lang/String;

    iput-object p2, p0, Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;->couponInfo:Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    move-object p1, p4

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2, p4}, Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;-><init>(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;-><init>(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;)V

    return-void
.end method


# virtual methods
.method public getCouponInfo()Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;->couponInfo:Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;

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

.method public getTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;->title:Ljava/lang/String;

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
