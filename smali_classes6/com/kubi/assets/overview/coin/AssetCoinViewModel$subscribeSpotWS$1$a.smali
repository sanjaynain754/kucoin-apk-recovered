.class public final Lcom/kubi/assets/overview/coin/AssetCoinViewModel$subscribeSpotWS$1$a;
.super Ljava/lang/Object;
.source "AssetCoinViewModel.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/overview/coin/AssetCoinViewModel$subscribeSpotWS$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lkotlinx/coroutines/flow/f;"
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
        "SMAP\nAssetCoinViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCoinViewModel.kt\ncom/kubi/assets/overview/coin/AssetCoinViewModel$subscribeSpotWS$1$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,237:1\n1#2:238\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lkotlinx/coroutines/m0;

.field public final synthetic c:Lcom/kubi/assets/overview/coin/AssetCoinViewModel;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/m0;Lcom/kubi/assets/overview/coin/AssetCoinViewModel;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$subscribeSpotWS$1$a;->b:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$subscribeSpotWS$1$a;->c:Lcom/kubi/assets/overview/coin/AssetCoinViewModel;

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
.end method

.method public static synthetic a(Lcom/kubi/data/entity/WsMarketSnapshotEntity;Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$subscribeSpotWS$1$a;->f(Lcom/kubi/data/entity/WsMarketSnapshotEntity;Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;

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
.end method

.method public static final f(Lcom/kubi/data/entity/WsMarketSnapshotEntity;Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;
    .locals 9

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/16 v7, 0x1d

    .line 8
    const/4 v8, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    move-object v3, p0

    .line 14
    move-object v1, p1

    .line 15
    .line 16
    .line 17
    invoke-static/range {v1 .. v8}, Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;->copy$default(Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;Ljava/util/ArrayList;Lcom/kubi/data/entity/WsMarketSnapshotEntity;ZLjava/util/ArrayList;Landroid/text/SpannableString;ILjava/lang/Object;)Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
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
.end method


# virtual methods
.method public final c(Lcom/kubi/assets/entity/SpotWSEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/entity/SpotWSEntity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object p2, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$subscribeSpotWS$1$a;->b:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Lkotlinx/coroutines/n0;->h(Lkotlinx/coroutines/m0;)Z

    .line 6
    move-result p2

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/kubi/assets/entity/SpotWSEntity;->getData()Lcom/kubi/data/entity/WsMarketSnapshotEntity;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p2, p0, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$subscribeSpotWS$1$a;->c:Lcom/kubi/assets/overview/coin/AssetCoinViewModel;

    .line 17
    .line 18
    new-instance v0, Lcom/kubi/assets/overview/coin/r;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p1}, Lcom/kubi/assets/overview/coin/r;-><init>(Lcom/kubi/data/entity/WsMarketSnapshotEntity;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p2, v0}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel;->z(Lcom/kubi/assets/overview/coin/AssetCoinViewModel;Lkotlin/jvm/functions/Function1;)Z

    .line 25
    .line 26
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 27
    return-object p1

    .line 28
    .line 29
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 30
    return-object p1
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
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/assets/entity/SpotWSEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/overview/coin/AssetCoinViewModel$subscribeSpotWS$1$a;->c(Lcom/kubi/assets/entity/SpotWSEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method
