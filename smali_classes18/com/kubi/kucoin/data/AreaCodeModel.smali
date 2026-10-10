.class public final Lcom/kubi/kucoin/data/AreaCodeModel;
.super Lio/chad/library/adapter/base/entity/SectionEntity;
.source "AreaCodeModel.kt"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/entity/SectionEntity<",
        "Lcom/kubi/kucoin/data/platform/model/CountryEntity;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B\u0011\u0008\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/kubi/kucoin/data/AreaCodeModel;",
        "Lio/chad/library/adapter/base/entity/SectionEntity;",
        "Lcom/kubi/kucoin/data/platform/model/CountryEntity;",
        "isHeader",
        "",
        "header",
        "",
        "<init>",
        "(ZLjava/lang/String;)V",
        "countryEntity",
        "(Lcom/kubi/kucoin/data/platform/model/CountryEntity;)V",
        "LAppCountry_googleRelease"
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
.method public constructor <init>(Lcom/kubi/kucoin/data/platform/model/CountryEntity;)V
    .locals 1
    .param p1    # Lcom/kubi/kucoin/data/platform/model/CountryEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "countryEntity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lio/chad/library/adapter/base/entity/SectionEntity;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "header"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Lio/chad/library/adapter/base/entity/SectionEntity;-><init>(ZLjava/lang/String;)V

    return-void
.end method
