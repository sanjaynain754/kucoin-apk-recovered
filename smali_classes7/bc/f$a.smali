.class public final Lbc/f$a;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "ToggleCardSelectorAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u0007\"\u0004\u0008\u0000\u0010\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\nJ\u001c\u0010\u000b\u001a\u00020\u0007\"\u0004\u0008\u0000\u0010\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/component/dialog/ToggleCardSelectorAdapter$ViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "binding",
        "Lcom/kubi/tradebase/databinding/KcLayoutToggleCardItemSelectorBinding;",
        "<init>",
        "(Lcom/kubi/component/dialog/ToggleCardSelectorAdapter;Lcom/kubi/tradebase/databinding/KcLayoutToggleCardItemSelectorBinding;)V",
        "bindItem",
        "",
        "T",
        "model",
        "Lcom/kubi/component/dialog/ToggleCardModeData;",
        "updateUIBySelectedMode",
        "TradeBaseLib_googleRelease"
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
        "SMAP\nToggleCardSelectorAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToggleCardSelectorAdapter.kt\ncom/kubi/component/dialog/ToggleCardSelectorAdapter$ViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n360#2,7:104\n*S KotlinDebug\n*F\n+ 1 ToggleCardSelectorAdapter.kt\ncom/kubi/component/dialog/ToggleCardSelectorAdapter$ViewHolder\n*L\n66#1:104,7\n*E\n"
    }
.end annotation


# instance fields
.field public final g:Ln30/n;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final synthetic h:Lbc/f;


# direct methods
.method public constructor <init>(Lbc/f;Ln30/n;)V
    .locals 1
    .param p1    # Lbc/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln30/n;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "binding"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lbc/f$a;->h:Lbc/f;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ln30/n;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 15
    .line 16
    iput-object p2, p0, Lbc/f$a;->g:Ln30/n;

    .line 17
    return-void
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
.end method

.method public static synthetic a(Lbc/f;Lbc/f$a;Lbc/b;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lbc/f$a;->e(Lbc/f;Lbc/f$a;Lbc/b;Landroid/view/View;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
.end method

.method public static synthetic b(Lbc/b;Lbc/f;Lbc/f$a;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lbc/f$a;->f(Lbc/b;Lbc/f;Lbc/f$a;Landroid/widget/CompoundButton;Z)V

    .line 4
    return-void
    .line 5
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
.end method

.method public static final e(Lbc/f;Lbc/f$a;Lbc/b;Landroid/view/View;)Lkotlin/Unit;
    .locals 4

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p0}, Lbc/f;->g(Lbc/f;)Ljava/util/List;

    move-result-object p3

    .line 2
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 3
    check-cast v2, Lbc/b;

    .line 4
    invoke-virtual {v2}, Lbc/b;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_1
    if-eq v1, v3, :cond_2

    .line 5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    move-result p3

    if-eq v1, p3, :cond_2

    .line 6
    invoke-static {p0}, Lbc/f;->g(Lbc/f;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lbc/b;

    invoke-virtual {p3, v0}, Lbc/b;->f(Z)V

    .line 7
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 8
    :cond_2
    invoke-virtual {p2}, Lbc/b;->e()Z

    move-result p3

    xor-int/lit8 p3, p3, 0x1

    .line 9
    invoke-virtual {p2, p3}, Lbc/b;->f(Z)V

    .line 10
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 11
    invoke-virtual {p2}, Lbc/b;->c()Lkotlin/jvm/functions/Function2;

    move-result-object p0

    invoke-virtual {p2}, Lbc/b;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final f(Lbc/b;Lbc/f;Lbc/f$a;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lbc/b;->e()Z

    .line 4
    move-result p3

    .line 5
    .line 6
    if-eq p3, p4, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p4}, Lbc/b;->f(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 13
    move-result p2

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lbc/b;->c()Lkotlin/jvm/functions/Function2;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lbc/b;->a()Ljava/lang/Object;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    .line 27
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, p0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    :cond_0
    return-void
.end method


# virtual methods
.method public final c(Lbc/b;)V
    .locals 3
    .param p1    # Lbc/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lbc/b<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "model"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lbc/f$a;->g:Ln30/n;

    .line 8
    .line 9
    iget-object v1, v0, Ln30/n;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lbc/b;->d()Ljava/lang/CharSequence;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    iget-object v1, v0, Ln30/n;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lbc/b;->b()Ljava/lang/CharSequence;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    iget-object v1, v0, Ln30/n;->c:Lcom/kubi/resources/widget/KcSwitchButton;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lbc/b;->e()Z

    .line 31
    move-result v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Lcom/kubi/resources/widget/BaseSwitchButton;->setChecked(Z)V

    .line 35
    .line 36
    iget-object v0, v0, Ln30/n;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lbc/b;->e()Z

    .line 40
    move-result v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lbc/f$a;->d(Lbc/b;)V

    .line 47
    return-void
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
.end method

.method public final d(Lbc/b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lbc/b<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lbc/f$a;->g:Ln30/n;

    .line 3
    .line 4
    iget-object v1, p0, Lbc/f$a;->h:Lbc/f;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Lbc/f;->h(Lbc/f;)Lbc/c;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    sget-object v3, Lbc/c$a;->a:Lbc/c$a;

    .line 11
    .line 12
    .line 13
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result v3

    .line 15
    .line 16
    const-string v4, "switchCompat"

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    iget-object v2, v0, Ln30/n;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 21
    const/4 v3, 0x1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v3}, Landroid/view/View;->setClickable(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lbc/b;->e()Z

    .line 28
    move-result v2

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    sget v2, Lcom/kubi/tradebase/R$drawable;->shape_border_emphasis_8r:I

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_0
    sget v2, Lcom/kubi/tradebase/R$drawable;->shape_border_emphasis16_8r:I

    .line 36
    .line 37
    :goto_0
    iget-object v3, v0, Ln30/n;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 41
    .line 42
    iget-object v2, v0, Ln30/n;->c:Lcom/kubi/resources/widget/KcSwitchButton;

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 49
    .line 50
    iget-object v0, v0, Ln30/n;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 51
    .line 52
    const-string v2, "layoutItem"

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    new-instance v2, Lbc/d;

    .line 58
    .line 59
    .line 60
    invoke-direct {v2, v1, p0, p1}, Lbc/d;-><init>(Lbc/f;Lbc/f$a;Lbc/b;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->f(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 64
    return-void

    .line 65
    .line 66
    :cond_1
    sget-object v3, Lbc/c$b;->a:Lbc/c$b;

    .line 67
    .line 68
    .line 69
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    move-result v2

    .line 71
    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    iget-object v2, v0, Ln30/n;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 75
    const/4 v3, 0x0

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v3}, Landroid/view/View;->setClickable(Z)V

    .line 79
    .line 80
    iget-object v2, v0, Ln30/n;->c:Lcom/kubi/resources/widget/KcSwitchButton;

    .line 81
    .line 82
    .line 83
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 87
    .line 88
    iget-object v2, v0, Ln30/n;->c:Lcom/kubi/resources/widget/KcSwitchButton;

    .line 89
    const/4 v3, 0x0

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v3}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 93
    .line 94
    iget-object v2, v0, Ln30/n;->c:Lcom/kubi/resources/widget/KcSwitchButton;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lbc/b;->e()Z

    .line 98
    move-result v3

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v3}, Lcom/kubi/resources/widget/BaseSwitchButton;->setChecked(Z)V

    .line 102
    .line 103
    iget-object v0, v0, Ln30/n;->c:Lcom/kubi/resources/widget/KcSwitchButton;

    .line 104
    .line 105
    new-instance v2, Lbc/e;

    .line 106
    .line 107
    .line 108
    invoke-direct {v2, p1, v1, p0}, Lbc/e;-><init>(Lbc/b;Lbc/f;Lbc/f$a;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 112
    return-void

    .line 113
    .line 114
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 115
    .line 116
    .line 117
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 118
    throw p1
.end method
