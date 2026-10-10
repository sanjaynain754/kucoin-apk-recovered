.class public final Lcom/kubi/spot/business/submit/TradeSubmitFragment$a;
.super Ljava/lang/Object;
.source "TradeSubmitFragment.kt"

# interfaces
.implements Lcom/kubi/spot/business/saving/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/spot/business/submit/TradeSubmitFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/spot/business/submit/TradeSubmitFragment$savingModelChangeEvent$1",
        "Lcom/kubi/spot/business/saving/SavingConfig$ISavingModeChangeEvent;",
        "onChange",
        "",
        "enable",
        "",
        "SpotLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/kubi/spot/business/submit/TradeSubmitFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/spot/business/submit/TradeSubmitFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/spot/business/submit/TradeSubmitFragment$a;->a:Lcom/kubi/spot/business/submit/TradeSubmitFragment;

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
.method public a(Z)V
    .locals 3

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    sget-object p1, Lcom/kubi/spot/business/saving/SavingCacheManager;->a:Lcom/kubi/spot/business/saving/SavingCacheManager;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/kubi/spot/business/submit/TradeSubmitFragment$a;->a:Lcom/kubi/spot/business/submit/TradeSubmitFragment;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/spot/business/submit/TradeSubmitFragment;->N()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/spot/business/submit/TradeSubmitFragment$a;->a:Lcom/kubi/spot/business/submit/TradeSubmitFragment;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/kubi/sdk/BaseFragment;->getVisibleDisposable()Lio/reactivex/disposables/CompositeDisposable;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    iget-object v2, p0, Lcom/kubi/spot/business/submit/TradeSubmitFragment$a;->a:Lcom/kubi/spot/business/submit/TradeSubmitFragment;

    .line 19
    .line 20
    .line 21
    invoke-static {v2}, Lcom/kubi/spot/business/submit/TradeSubmitFragment;->g4(Lcom/kubi/spot/business/submit/TradeSubmitFragment;)Lcom/kubi/spot/business/saving/q;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0, v1, v2}, Lcom/kubi/spot/business/saving/SavingCacheManager;->s(Lcom/kubi/data/entity/SymbolInfoEntity;Lio/reactivex/disposables/CompositeDisposable;Lcom/kubi/spot/business/saving/q;)V

    .line 26
    return-void

    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, Lcom/kubi/spot/business/submit/TradeSubmitFragment$a;->a:Lcom/kubi/spot/business/submit/TradeSubmitFragment;

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lcom/kubi/spot/business/submit/TradeSubmitFragment;->g4(Lcom/kubi/spot/business/submit/TradeSubmitFragment;)Lcom/kubi/spot/business/saving/q;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/kubi/spot/business/saving/q;->close()V

    .line 36
    return-void
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
