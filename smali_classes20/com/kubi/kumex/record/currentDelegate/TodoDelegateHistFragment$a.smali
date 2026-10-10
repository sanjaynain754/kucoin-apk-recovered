.class public final Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment$a;
.super Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;
.source "TodoDelegateHistFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment;->D3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment$initListeners$2",
        "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;",
        "onPageSelected",
        "",
        "position",
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
.field public final synthetic b:Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment;

.field public final synthetic c:Ldm/y1;


# direct methods
.method public constructor <init>(Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment;Ldm/y1;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment$a;->b:Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment$a;->c:Ldm/y1;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;-><init>()V

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
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;->onPageSelected(I)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment$a;->b:Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment;->t3(Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment;)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment$a;->b:Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment;

    .line 11
    .line 12
    sget v1, Lcom/kubi/kumex/R$string;->kumex_order_twap:I

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment;->s3(Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment;I)I

    .line 16
    move-result v0

    .line 17
    .line 18
    const-string v1, "assetTypeFilterTv"

    .line 19
    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    sget-object p1, Lcom/kubi/broker/BrokerConfig;->a:Lcom/kubi/broker/BrokerConfig;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/kubi/broker/BrokerConfig;->d()Lcom/kubi/broker/f;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lcom/kubi/broker/f;->O()Z

    .line 30
    move-result p1

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_0
    iget-object p1, p0, Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment$a;->c:Ldm/y1;

    .line 36
    .line 37
    iget-object p1, p1, Ldm/y1;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 44
    return-void

    .line 45
    .line 46
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/kubi/kumex/record/currentDelegate/TodoDelegateHistFragment$a;->c:Ldm/y1;

    .line 47
    .line 48
    iget-object p1, p1, Ldm/y1;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 55
    return-void
    .line 56
.end method
