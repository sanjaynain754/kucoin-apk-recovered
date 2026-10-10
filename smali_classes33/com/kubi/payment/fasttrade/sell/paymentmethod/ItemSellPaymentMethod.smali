.class public abstract Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;
.super Ljava/lang/Object;
.source "ItemSellPaymentMethod.kt"

# interfaces
.implements Lio/chad/library/adapter/base/entity/MultiItemEntity;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$Companion;,
        Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemCategory;,
        Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemGuideP2P;,
        Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemNormalPaymentMethod;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0003\u0008\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;",
        "Lio/chad/library/adapter/base/entity/MultiItemEntity;",
        "<init>",
        "()V",
        "ItemCategory",
        "ItemNormalPaymentMethod",
        "ItemGuideP2P",
        "Companion",
        "Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemCategory;",
        "Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemGuideP2P;",
        "Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$ItemNormalPaymentMethod;",
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
.field public static final Companion:Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final ITEM_TYPE_CATEGORY:I = 0x0

.field public static final ITEM_TYPE_GUIDE_P2P:I = 0x2

.field public static final ITEM_TYPE_PAYMENT_METHOD:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;->Companion:Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod$Companion;

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

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/payment/fasttrade/sell/paymentmethod/ItemSellPaymentMethod;-><init>()V

    return-void
.end method
