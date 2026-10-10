.class public final Lcom/kubi/spot/business/delegation/TradeFundsListViewModel$b;
.super Ljava/lang/Object;
.source "Comparisons.kt"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/spot/business/delegation/TradeFundsListViewModel;->Q(Ljava/util/List;Lcom/kubi/data/entity/SymbolInfoEntity;)V
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
        "SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 TradeFundsListViewModel.kt\ncom/kubi/spot/business/delegation/TradeFundsListViewModel\n*L\n1#1,328:1\n210#2,2:329\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/spot/business/delegation/TradeFundsListViewModel;


# direct methods
.method public constructor <init>(Lcom/kubi/spot/business/delegation/TradeFundsListViewModel;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/spot/business/delegation/TradeFundsListViewModel$b;->b:Lcom/kubi/spot/business/delegation/TradeFundsListViewModel;

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
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v1}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;->getCurrency()Ljava/lang/String;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    iget-object v3, p0, Lcom/kubi/spot/business/delegation/TradeFundsListViewModel$b;->b:Lcom/kubi/spot/business/delegation/TradeFundsListViewModel;

    .line 19
    .line 20
    .line 21
    invoke-static {v3}, Lcom/kubi/spot/business/delegation/TradeFundsListViewModel;->w(Lcom/kubi/spot/business/delegation/TradeFundsListViewModel;)Ljava/lang/String;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    .line 25
    invoke-static {v0, p2, v3}, Lkf/a;->A(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    check-cast p1, Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1, v2, v1}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;->getCurrency()Ljava/lang/String;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    iget-object v1, p0, Lcom/kubi/spot/business/delegation/TradeFundsListViewModel$b;->b:Lcom/kubi/spot/business/delegation/TradeFundsListViewModel;

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Lcom/kubi/spot/business/delegation/TradeFundsListViewModel;->w(Lcom/kubi/spot/business/delegation/TradeFundsListViewModel;)Ljava/lang/String;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-static {v0, p1, v1}, Lkf/a;->A(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    .line 53
    invoke-static {p2, p1}, Lkotlin/comparisons/ComparisonsKt;->compareValues(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 54
    move-result p1

    .line 55
    return p1
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
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
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
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
.end method
