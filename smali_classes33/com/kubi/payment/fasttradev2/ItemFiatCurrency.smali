.class public abstract Lcom/kubi/payment/fasttradev2/ItemFiatCurrency;
.super Ljava/lang/Object;
.source "FastTradeFiatCurrencySelectAdapter.kt"

# interfaces
.implements Lio/chad/library/adapter/base/entity/MultiItemEntity;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/fasttradev2/ItemFiatCurrency$Companion;,
        Lcom/kubi/payment/fasttradev2/ItemFiatCurrency$ItemHeader;,
        Lcom/kubi/payment/fasttradev2/ItemFiatCurrency$ItemNormal;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 \n2\u00020\u0001:\u0003\u0008\t\nB\u0011\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0002\u000b\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/kubi/payment/fasttradev2/ItemFiatCurrency;",
        "Lio/chad/library/adapter/base/entity/MultiItemEntity;",
        "fiatCurrency",
        "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;",
        "<init>",
        "(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;)V",
        "getFiatCurrency",
        "()Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;",
        "ItemHeader",
        "ItemNormal",
        "Companion",
        "Lcom/kubi/payment/fasttradev2/ItemFiatCurrency$ItemHeader;",
        "Lcom/kubi/payment/fasttradev2/ItemFiatCurrency$ItemNormal;",
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
.field public static final Companion:Lcom/kubi/payment/fasttradev2/ItemFiatCurrency$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final ITEM_TYPE_HEADER:I = 0x0

.field public static final ITEM_TYPE_NORMAL:I = 0x1


# instance fields
.field private final fiatCurrency:Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/fasttradev2/ItemFiatCurrency$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/payment/fasttradev2/ItemFiatCurrency$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/payment/fasttradev2/ItemFiatCurrency;->Companion:Lcom/kubi/payment/fasttradev2/ItemFiatCurrency$Companion;

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

.method private constructor <init>(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/ItemFiatCurrency;->fiatCurrency:Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kubi/payment/fasttradev2/ItemFiatCurrency;-><init>(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;)V

    return-void
.end method


# virtual methods
.method public getFiatCurrency()Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttradev2/ItemFiatCurrency;->fiatCurrency:Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;

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
