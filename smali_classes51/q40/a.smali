.class public interface abstract Lq40/a;
.super Ljava/lang/Object;
.source "IGridCouponsApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\tH\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\n\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/tradingbotkit/business/coupons/api/IGridCouponsApi;",
        "",
        "newCouponsList",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/tradingbotkit/entity/coupons/ExperienceGoldEntity;",
        "params",
        "Lcom/kubi/tradingbotkit/bean/params/coupons/CouponsReceiveBean;",
        "getCouponsOverview",
        "Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsEntity;",
        "Lcom/kubi/tradingbotkit/bean/params/coupons/CouponsOverviewBean;",
        "TradingBotKitLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Lcom/kubi/tradingbotkit/bean/params/coupons/CouponsOverviewBean;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/tradingbotkit/bean/params/coupons/CouponsOverviewBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/tradingbotkit/bean/params/coupons/CouponsOverviewBean;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/robot/coupon/overview"
    .end annotation
.end method
