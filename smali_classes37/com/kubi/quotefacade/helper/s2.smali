.class public final Lcom/kubi/quotefacade/helper/s2;
.super Ljava/lang/Object;
.source "QuoteWSDataController.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toQuoteFutureEntity",
        "Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;",
        "Lcom/kubi/data/entity/WsFutureSnapshotEntity;",
        "QuoteFacadeLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Lcom/kubi/data/entity/WsFutureSnapshotEntity;)Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/helper/s2;->b(Lcom/kubi/data/entity/WsFutureSnapshotEntity;)Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
.end method

.method public static final b(Lcom/kubi/data/entity/WsFutureSnapshotEntity;)Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;
    .locals 18

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/WsFutureSnapshotEntity;->getSymbol()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/WsFutureSnapshotEntity;->getVolume()D

    .line 10
    move-result-wide v2

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/WsFutureSnapshotEntity;->getTurnover()D

    .line 14
    move-result-wide v4

    .line 15
    .line 16
    .line 17
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/WsFutureSnapshotEntity;->getLastPrice()D

    .line 18
    move-result-wide v6

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/WsFutureSnapshotEntity;->getLowPrice()D

    .line 22
    move-result-wide v8

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/WsFutureSnapshotEntity;->getHighPrice()D

    .line 26
    move-result-wide v10

    .line 27
    .line 28
    .line 29
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/WsFutureSnapshotEntity;->getPriceChg()D

    .line 30
    move-result-wide v12

    .line 31
    .line 32
    .line 33
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/data/entity/WsFutureSnapshotEntity;->getPriceChgPct()D

    .line 34
    move-result-wide v14

    .line 35
    .line 36
    const/16 v16, 0x0

    .line 37
    .line 38
    const/16 v17, 0x0

    .line 39
    .line 40
    .line 41
    invoke-direct/range {v0 .. v17}, Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;-><init>(Ljava/lang/String;DDDDDDDLjava/math/BigDecimal;Ljava/util/List;)V

    .line 42
    return-object v0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
.end method
