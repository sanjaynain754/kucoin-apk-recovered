.class public final Lcom/kubi/quotefacade/helper/n0$b;
.super Ljava/lang/Object;
.source "Comparisons.kt"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/quotefacade/helper/n0;->J(Ljava/util/ArrayList;Z)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CoinListSortHelper.kt\ncom/kubi/quotefacade/helper/CoinListSortHelper\n*L\n1#1,328:1\n360#2,3:329\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/quotefacade/helper/n0$b;->b:Z

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/data/entity/TradeItemBean;

    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/kubi/quotefacade/helper/n0$b;->b:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    instance-of v0, p1, Lcom/kubi/quotefacade/entity/AlphaFavEntity;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, Lcom/kubi/quotefacade/entity/AlphaFavEntity;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaFavEntity;->getItemEntity()Lcom/kubi/quotefacade/entity/AlphaItemEntity;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getTradingVolume()Ljava/math/BigDecimal;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 24
    move-result-wide v0

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 28
    move-result-object p1

    .line 29
    goto :goto_0

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getValue()D

    .line 33
    move-result-wide v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1, p1}, Lkf/a;->m(DLjava/lang/String;)D

    .line 45
    move-result-wide v0

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    :goto_0
    check-cast p2, Lcom/kubi/data/entity/TradeItemBean;

    .line 52
    .line 53
    iget-boolean v0, p0, Lcom/kubi/quotefacade/helper/n0$b;->b:Z

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    instance-of v0, p2, Lcom/kubi/quotefacade/entity/AlphaFavEntity;

    .line 58
    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    check-cast p2, Lcom/kubi/quotefacade/entity/AlphaFavEntity;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Lcom/kubi/quotefacade/entity/AlphaFavEntity;->getItemEntity()Lcom/kubi/quotefacade/entity/AlphaItemEntity;

    .line 65
    move-result-object p2

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getTradingVolume()Ljava/math/BigDecimal;

    .line 69
    move-result-object p2

    .line 70
    .line 71
    .line 72
    invoke-static {p2}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 73
    move-result-wide v0

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 77
    move-result-object p2

    .line 78
    goto :goto_1

    .line 79
    .line 80
    .line 81
    :cond_1
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getValue()D

    .line 82
    move-result-wide v0

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 86
    move-result-object p2

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 90
    move-result-object p2

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v1, p2}, Lkf/a;->m(DLjava/lang/String;)D

    .line 94
    move-result-wide v0

    .line 95
    .line 96
    .line 97
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 98
    move-result-object p2

    .line 99
    .line 100
    .line 101
    :goto_1
    invoke-static {p1, p2}, Lkotlin/comparisons/ComparisonsKt;->compareValues(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 102
    move-result p1

    .line 103
    return p1
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method
