.class public final Lcom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase$a;
.super Ljava/lang/Object;
.source "SymbolBarFragmentBase.kt"

# interfaces
.implements Lae/v0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase;->m4(Lcom/kubi/data/entity/TradeItemBean;)Lae/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/core/biz/symbolbarold/SymbolBarFragmentBase$createMarginMenuItemsProvider$1",
        "Lcom/kubi/core/biz/symbolbarold/menu/MenuItemsProvider$TradeTypeToggleChangeListener;",
        "onChange",
        "",
        "mode",
        "Lcom/kubi/core/base/setting/data/TradePanelModel;",
        "TradeCoreBizLib_googleRelease"
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
.field public final synthetic a:Lcom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase;


# direct methods
.method public constructor <init>(Lcom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase$a;->a:Lcom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase;

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
.end method


# virtual methods
.method public a(Lhd/b;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "mode"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    const-string v1, "pittttttttt--createMarginMenuItemsProvider: "

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, ", result: "

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    sget-object v1, Lhd/b$b;->a:Lhd/b$b;

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    move-result v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lro/b;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    iget-object v0, p0, Lcom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase$a;->a:Lcom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;->A3()Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    check-cast v0, Lcom/kubi/core/biz/symbolbarold/a0;

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    new-instance v1, Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent$TradePanelModelChange;

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, p1}, Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent$TradePanelModelChange;-><init>(Lhd/b;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/kubi/core/biz/symbolbarold/a0;->v(Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent;)V

    .line 58
    :cond_0
    return-void
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
.end method
