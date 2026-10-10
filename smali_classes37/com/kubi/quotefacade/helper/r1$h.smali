.class public final Lcom/kubi/quotefacade/helper/r1$h;
.super Ljava/lang/Object;
.source "Comparisons.kt"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/quotefacade/helper/r1;->u(Ljava/util/ArrayList;Z)Ljava/util/Collection;
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
        "SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HoldingsSortHelper.kt\ncom/kubi/quotefacade/helper/HoldingsSortHelper\n*L\n1#1,328:1\n247#2,5:329\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/quotefacade/helper/r1$h;->b:Z

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
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/quotefacade/entity/HoldingEntity;

    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/kubi/quotefacade/helper/r1$h;->b:Z

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/HoldingEntity;->getCurrentPrice()Ljava/math/BigDecimal;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 15
    move-result-wide v2

    .line 16
    neg-double v2, v2

    .line 17
    .line 18
    .line 19
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 20
    move-result-object p1

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/HoldingEntity;->getCurrentPrice()Ljava/math/BigDecimal;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    new-instance v0, Ljava/math/BigDecimal;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(I)V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/HoldingEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lkf/c;->c()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-static {v0, p1}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 46
    move-result-wide v2

    .line 47
    neg-double v2, v2

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    :goto_0
    check-cast p2, Lcom/kubi/quotefacade/entity/HoldingEntity;

    .line 54
    .line 55
    iget-boolean v0, p0, Lcom/kubi/quotefacade/helper/r1$h;->b:Z

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Lcom/kubi/quotefacade/entity/HoldingEntity;->getCurrentPrice()Ljava/math/BigDecimal;

    .line 61
    move-result-object p2

    .line 62
    .line 63
    .line 64
    invoke-static {p2}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 65
    move-result-wide v0

    .line 66
    neg-double v0, v0

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 70
    move-result-object p2

    .line 71
    goto :goto_1

    .line 72
    .line 73
    .line 74
    :cond_3
    invoke-virtual {p2}, Lcom/kubi/quotefacade/entity/HoldingEntity;->getCurrentPrice()Ljava/math/BigDecimal;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-nez v0, :cond_4

    .line 78
    .line 79
    new-instance v0, Ljava/math/BigDecimal;

    .line 80
    .line 81
    .line 82
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(I)V

    .line 83
    .line 84
    .line 85
    :cond_4
    invoke-virtual {p2}, Lcom/kubi/quotefacade/entity/HoldingEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 86
    move-result-object p2

    .line 87
    .line 88
    if-nez p2, :cond_5

    .line 89
    .line 90
    .line 91
    invoke-static {}, Lkf/c;->c()Ljava/lang/String;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    .line 95
    :cond_5
    invoke-static {v0, p2}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 96
    move-result-wide v0

    .line 97
    neg-double v0, v0

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 101
    move-result-object p2

    .line 102
    .line 103
    .line 104
    :goto_1
    invoke-static {p1, p2}, Lkotlin/comparisons/ComparisonsKt;->compareValues(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 105
    move-result p1

    .line 106
    return p1
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
