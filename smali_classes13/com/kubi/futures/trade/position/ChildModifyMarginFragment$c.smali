.class public final Lcom/kubi/futures/trade/position/ChildModifyMarginFragment$c;
.super Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$d;
.source "ChildModifyMarginFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/kubi/futures/trade/position/ChildModifyMarginFragment$onViewCreated$5",
        "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnSimpleProgressChangedListener;",
        "onChanged",
        "",
        "progress",
        "",
        "progressFloat",
        "",
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


# instance fields
.field public final synthetic a:Ldm/v1;

.field public final synthetic b:Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;


# direct methods
.method public constructor <init>(Ldm/v1;Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment$c;->a:Ldm/v1;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment$c;->b:Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$d;-><init>()V

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
.end method


# virtual methods
.method public c(IF)V
    .locals 3

    .line 1
    .line 2
    iget-object p2, p0, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment$c;->a:Ldm/v1;

    .line 3
    .line 4
    iget-object p2, p2, Ldm/v1;->y:Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;

    .line 5
    .line 6
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    .line 11
    iget-object p2, p0, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment$c;->b:Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;

    .line 12
    int-to-long v0, p1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    const-string v0, "valueOf(...)"

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    new-instance v0, Ljava/math/BigDecimal;

    .line 24
    .line 25
    const/16 v1, 0x64

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(I)V

    .line 29
    const/4 v1, 0x2

    .line 30
    .line 31
    sget-object v2, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v0, v1, v2}, Lcom/kubi/kumex/utils/k0;->a(Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-static {p2, p1}, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;->o3(Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;Ljava/math/BigDecimal;)V

    .line 39
    .line 40
    iget-object p1, p0, Lcom/kubi/futures/trade/position/ChildModifyMarginFragment$c;->a:Ldm/v1;

    .line 41
    .line 42
    iget-object p1, p1, Ldm/v1;->y:Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;

    .line 43
    .line 44
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 48
    return-void
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method
