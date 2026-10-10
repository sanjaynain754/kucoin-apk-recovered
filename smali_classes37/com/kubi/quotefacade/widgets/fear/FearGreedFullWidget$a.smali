.class public final Lcom/kubi/quotefacade/widgets/fear/FearGreedFullWidget$a;
.super Ljava/lang/Object;
.source "FearGreedFullWidget.kt"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/quotefacade/widgets/fear/FearGreedFullWidget;->q3(Lcom/kubi/quotefacade/entity/WidgetFearGreedEntity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/kubi/quotefacade/widgets/fear/FearGreedFullWidget$fillViewData$1$3",
        "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "onGlobalLayout",
        "",
        "QuoteFacadeLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFearGreedFullWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FearGreedFullWidget.kt\ncom/kubi/quotefacade/widgets/fear/FearGreedFullWidget$fillViewData$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/resources/widget/BaseTextView;

.field public final synthetic c:Lcom/kubi/resources/widget/BaseTextView;


# direct methods
.method public constructor <init>(Lcom/kubi/resources/widget/BaseTextView;Lcom/kubi/resources/widget/BaseTextView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/quotefacade/widgets/fear/FearGreedFullWidget$a;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/quotefacade/widgets/fear/FearGreedFullWidget$a;->c:Lcom/kubi/resources/widget/BaseTextView;

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
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/widgets/fear/FearGreedFullWidget$a;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/kubi/quotefacade/widgets/fear/FearGreedFullWidget$a;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 15
    move-result v0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/kubi/quotefacade/widgets/fear/FearGreedFullWidget$a;->c:Lcom/kubi/resources/widget/BaseTextView;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 21
    move-result v1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 25
    move-result v0

    .line 26
    .line 27
    if-lez v0, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lcom/kubi/quotefacade/widgets/fear/FearGreedFullWidget$a;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    .line 40
    iget-object v1, p0, Lcom/kubi/quotefacade/widgets/fear/FearGreedFullWidget$a;->c:Lcom/kubi/resources/widget/BaseTextView;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 50
    :cond_0
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
.end method
