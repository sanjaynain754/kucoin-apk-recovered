.class public final Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;
.super Lcom/sumsub/sns/core/presentation/base/adapter/c;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic g:I


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/c;

.field public final b:Lcom/sumsub/sns/databinding/F;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/c;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/presentation/base/adapter/c;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/c;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/sumsub/sns/databinding/F;->a(Landroid/view/View;)Lcom/sumsub/sns/databinding/F;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;->b:Lcom/sumsub/sns/databinding/F;

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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;Lcom/sumsub/sns/internal/features/presentation/sumsubid/p;Landroid/widget/CompoundButton;Z)V
    .locals 0

    if-eqz p3, :cond_0

    .line 23
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;->a:Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/c;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/c;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/p;)V
    .locals 3

    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;->b:Lcom/sumsub/sns/databinding/F;

    iget-object v0, v0, Lcom/sumsub/sns/databinding/F;->e:Lcom/sumsub/sns/core/widget/SNSBodyTextView;

    move-object v1, p1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m;

    .line 4
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m;->e:Ljava/lang/CharSequence;

    .line 5
    invoke-static {v0, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;->b:Lcom/sumsub/sns/databinding/F;

    iget-object v0, v0, Lcom/sumsub/sns/databinding/F;->d:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 7
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m;->f:Ljava/lang/CharSequence;

    .line 8
    invoke-static {v0, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;->b:Lcom/sumsub/sns/databinding/F;

    iget-object v0, v0, Lcom/sumsub/sns/databinding/F;->c:Lcom/sumsub/sns/core/widget/SNSCardRadioButton;

    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 11
    iget-boolean v2, v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m;->g:Z

    .line 12
    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 13
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/i;

    invoke-direct {v2, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;Lcom/sumsub/sns/internal/features/presentation/sumsubid/p;)V

    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 14
    iget-object p1, v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m;->d:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 15
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;->b:Lcom/sumsub/sns/databinding/F;

    iget-object p1, p1, Lcom/sumsub/sns/databinding/F;->b:Landroid/widget/ImageView;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 16
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/m;->d:Ljava/lang/String;

    .line 17
    sget-object v2, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 18
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 19
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;->b:Lcom/sumsub/sns/databinding/F;

    iget-object p1, p1, Lcom/sumsub/sns/databinding/F;->b:Landroid/widget/ImageView;

    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 21
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;->b:Lcom/sumsub/sns/databinding/F;

    iget-object p1, p1, Lcom/sumsub/sns/databinding/F;->b:Landroid/widget/ImageView;

    const/16 v0, 0x8

    .line 22
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/sumsubid/p;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/ui/adapter/f;->a(Lcom/sumsub/sns/internal/features/presentation/sumsubid/p;)V

    return-void
.end method
