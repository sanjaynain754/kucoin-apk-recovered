.class public final Lcom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel$b;
.super Ljava/lang/Object;
.source "CallAuctionViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel;->M(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$UIState;",
        "Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$UIState;",
        ">;"
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


# instance fields
.field public final synthetic b:Lj20/b;

.field public final synthetic c:Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;


# direct methods
.method public constructor <init>(Lj20/b;Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel$b;->b:Lj20/b;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel$b;->c:Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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


# virtual methods
.method public final a(Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$UIState;)Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$UIState;
    .locals 11

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel$b;->b:Lj20/b;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel$b;->c:Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lj20/b;->a(Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;)Li20/a;

    .line 13
    move-result-object v3

    .line 14
    .line 15
    const/16 v9, 0x3e

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    move-object v2, p1

    .line 23
    .line 24
    .line 25
    invoke-static/range {v2 .. v10}, Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$UIState;->copy$default(Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$UIState;Li20/a;Lcom/kubi/spot/business/callAuction/bean/CallAuctionConfigBean;Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$Phase;Ljava/lang/String;Lcom/kubi/spot/entity/TradeItemBeanEquals;Lcom/kubi/spot/entity/TradeItemBeanEquals;ILjava/lang/Object;)Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$UIState;

    .line 26
    move-result-object p1

    .line 27
    return-object p1
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

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$UIState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel$b;->a(Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$UIState;)Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$UIState;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
