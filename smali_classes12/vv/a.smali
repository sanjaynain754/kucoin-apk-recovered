.class public interface abstract Lvv/a;
.super Ljava/lang/Object;
.source "IRedpacketSendFlavor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\u0008\u0010\u0007\u001a\u00020\u0008H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\t\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/redpackage/flavor/IRedpacketSendFlavor;",
        "",
        "getDefaultSelectedCoin",
        "Lcom/kubi/redpackage/entity/CurrenciesConfig;",
        "redConfig",
        "Lcom/kubi/redpackage/entity/RedConfig;",
        "coinConfig",
        "isDescendUSDT",
        "",
        "RedpackageLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lvx/a;
.end annotation


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b(Lcom/kubi/redpackage/entity/RedConfig;Lcom/kubi/redpackage/entity/CurrenciesConfig;)Lcom/kubi/redpackage/entity/CurrenciesConfig;
    .param p1    # Lcom/kubi/redpackage/entity/RedConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/redpackage/entity/CurrenciesConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
