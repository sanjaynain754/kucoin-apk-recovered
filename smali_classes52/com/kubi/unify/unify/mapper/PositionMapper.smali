.class public interface abstract Lcom/kubi/unify/unify/mapper/PositionMapper;
.super Ljava/lang/Object;
.source "PositionMapper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0006\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/unify/unify/mapper/PositionMapper;",
        "",
        "toPositionEntity",
        "Lcom/kubi/kumex/data/trade/model/PositionEntity;",
        "entity",
        "Lcom/kubi/unify/entity/UnifyPositionEntity;",
        "BUnifyAccountLib_googleRelease"
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
.method public abstract toPositionEntity(Lcom/kubi/unify/entity/UnifyPositionEntity;)Lcom/kubi/kumex/data/trade/model/PositionEntity;
    .param p1    # Lcom/kubi/unify/entity/UnifyPositionEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
