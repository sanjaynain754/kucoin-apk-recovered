.class public final Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/a;
.super Lcom/sumsub/sns/core/presentation/base/adapter/c;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic g:I


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/b;

.field public final b:Lcom/sumsub/sns/databinding/E;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/b;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/presentation/base/adapter/c;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/a;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/b;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/sumsub/sns/databinding/E;->a(Landroid/view/View;)Lcom/sumsub/sns/databinding/E;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/a;->b:Lcom/sumsub/sns/databinding/E;

    .line 12
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/p;Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/a;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 14
    move-object p2, p0

    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/i;

    .line 15
    iput-boolean p3, p2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/i;->e:Z

    if-eqz p3, :cond_0

    .line 16
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/a;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/b;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/p;)V
    .locals 3

    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/i;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/a;->b:Lcom/sumsub/sns/databinding/E;

    iget-object v0, v0, Lcom/sumsub/sns/databinding/E;->d:Lcom/sumsub/sns/core/widget/SNSBodyTextView;

    move-object v1, p1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/i;

    .line 4
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/i;->c:Ljava/lang/CharSequence;

    .line 5
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/a;->b:Lcom/sumsub/sns/databinding/E;

    iget-object v0, v0, Lcom/sumsub/sns/databinding/E;->c:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 7
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/i;->d:Ljava/lang/CharSequence;

    .line 8
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/a;->b:Lcom/sumsub/sns/databinding/E;

    iget-object v0, v0, Lcom/sumsub/sns/databinding/E;->b:Lcom/sumsub/sns/core/widget/SNSCardCheckBox;

    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 11
    iget-boolean v1, v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/i;->e:Z

    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 13
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/h;

    invoke-direct {v1, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/p;Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/p;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/a;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/p;)V

    return-void
.end method
