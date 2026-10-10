.class public final Lcom/kubi/futures/trade/position/vm/FuturesPositionComposeViewModel$Companion;
.super Ljava/lang/Object;
.source "FuturesPositionComposeViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/futures/trade/position/vm/FuturesPositionComposeViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/futures/trade/position/vm/FuturesPositionComposeViewModel$Companion;",
        "",
        "<init>",
        "()V",
        "POSITION_DATA_SOURCE_TAG",
        "",
        "create",
        "Lcom/kubi/futures/trade/position/vm/FuturesPositionComposeViewModel;",
        "fragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "KumexLib_googleRelease"
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
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/vm/FuturesPositionComposeViewModel$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/kubi/sdk/BaseFragment;)Lcom/kubi/futures/trade/position/vm/FuturesPositionComposeViewModel;
    .locals 2
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "fragment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/futures/trade/position/vm/FuturesPositionComposeViewModel;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/kubi/futures/trade/vm/b1;->a(Landroidx/fragment/app/Fragment;)Lcom/kubi/futures/trade/vm/FuturesClassicStreamViewModel;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lcom/kubi/futures/trade/vm/y1;->a(Landroidx/fragment/app/Fragment;)Lcom/kubi/futures/trade/vm/FuturesTrialStreamViewModel;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, p1}, Lcom/kubi/futures/trade/position/vm/FuturesPositionComposeViewModel;-><init>(Lcom/kubi/futures/trade/vm/FuturesClassicStreamViewModel;Lcom/kubi/futures/trade/vm/FuturesTrialStreamViewModel;)V

    .line 19
    return-object v0
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
.end method
