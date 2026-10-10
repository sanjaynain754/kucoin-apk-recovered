.class public final Lcom/sumsub/sns/internal/features/presentation/utils/o;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/o;->a:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/o;->b:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/utils/o;->c:Lkotlin/jvm/functions/Function1;

    .line 10
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/utils/o;Lcom/sumsub/sns/core/widget/SNSFileItemView;)Lkotlin/Unit;
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/o;->a:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/utils/o;Lcom/sumsub/sns/internal/features/domain/documents/w;)Lkotlin/Unit;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/o;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/utils/o;ILandroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/o;->b:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/core/widget/SNSFileItemView;Lcom/sumsub/sns/internal/features/domain/documents/w;ZZLcom/sumsub/sns/internal/features/presentation/utils/n;)V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p2, :cond_7

    if-eqz p4, :cond_0

    .line 6
    iget-object v3, p5, Lcom/sumsub/sns/internal/features/presentation/utils/n;->d:Ljava/lang/CharSequence;

    goto :goto_0

    .line 7
    :cond_0
    iget-object v3, p5, Lcom/sumsub/sns/internal/features/presentation/utils/n;->c:Ljava/lang/CharSequence;

    .line 8
    :goto_0
    invoke-virtual {p1, v3}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/domain/documents/w;->f:Ljava/lang/CharSequence;

    .line 10
    invoke-virtual {p1, v3}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setError(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/domain/documents/w;->a:Landroid/graphics/Bitmap;

    .line 12
    iget v4, p2, Lcom/sumsub/sns/internal/features/domain/documents/w;->c:I

    .line 13
    invoke-virtual {p1, v3, v4}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setImageBitmap(Landroid/graphics/Bitmap;I)V

    .line 14
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/domain/documents/w;->g:Lcom/sumsub/sns/internal/features/domain/documents/T;

    .line 15
    instance-of v4, v3, Lcom/sumsub/sns/internal/features/domain/documents/O;

    if-eqz v4, :cond_1

    .line 16
    invoke-virtual {p1, v2, v2}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setProgress(IZ)V

    .line 17
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setDescription(Ljava/lang/CharSequence;)V

    .line 18
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setStrokeDashed(Z)V

    goto :goto_1

    .line 19
    :cond_1
    instance-of v4, v3, Lcom/sumsub/sns/internal/features/domain/documents/P;

    if-eqz v4, :cond_2

    .line 20
    iget-object v3, p5, Lcom/sumsub/sns/internal/features/presentation/utils/n;->f:Ljava/lang/CharSequence;

    .line 21
    invoke-virtual {p1, v3}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setDescription(Ljava/lang/CharSequence;)V

    .line 22
    invoke-virtual {p1, v2, v2}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setProgress(IZ)V

    .line 23
    invoke-virtual {p1, v2}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setStrokeDashed(Z)V

    goto :goto_1

    .line 24
    :cond_2
    instance-of v4, v3, Lcom/sumsub/sns/internal/features/domain/documents/Q;

    if-eqz v4, :cond_3

    .line 25
    invoke-virtual {p1, v2, v2}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setProgress(IZ)V

    .line 26
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setDescription(Ljava/lang/CharSequence;)V

    .line 27
    invoke-virtual {p1, v2}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setStrokeDashed(Z)V

    goto :goto_1

    .line 28
    :cond_3
    instance-of v4, v3, Lcom/sumsub/sns/internal/features/domain/documents/S;

    if-eqz v4, :cond_6

    .line 29
    check-cast v3, Lcom/sumsub/sns/internal/features/domain/documents/S;

    .line 30
    iget v3, v3, Lcom/sumsub/sns/internal/features/domain/documents/S;->a:I

    .line 31
    iget-object v4, p5, Lcom/sumsub/sns/internal/features/presentation/utils/n;->e:Ljava/lang/CharSequence;

    .line 32
    invoke-virtual {p1, v4}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setDescription(Ljava/lang/CharSequence;)V

    .line 33
    invoke-virtual {p1, v2}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setStrokeDashed(Z)V

    .line 34
    invoke-virtual {p1, v3, v2}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setProgress(IZ)V

    :goto_1
    if-eqz p3, :cond_5

    .line 35
    iget-object p3, p2, Lcom/sumsub/sns/internal/features/domain/documents/w;->a:Landroid/graphics/Bitmap;

    if-eqz p3, :cond_4

    goto :goto_2

    :cond_4
    move v0, v2

    .line 36
    :goto_2
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setEndIconVisible(Z)V

    .line 37
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/utils/h0;

    invoke-direct {p3, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/h0;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/o;Lcom/sumsub/sns/internal/features/domain/documents/w;)V

    invoke-static {p3, p1}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    goto :goto_4

    .line 38
    :cond_5
    invoke-virtual {p1, v2}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setEndIconVisible(Z)V

    .line 39
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    .line 40
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 41
    :cond_7
    invoke-virtual {p1, v2}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setEndIconVisible(Z)V

    if-eqz p4, :cond_8

    .line 42
    iget-object p2, p5, Lcom/sumsub/sns/internal/features/presentation/utils/n;->b:Ljava/lang/CharSequence;

    goto :goto_3

    .line 43
    :cond_8
    iget-object p2, p5, Lcom/sumsub/sns/internal/features/presentation/utils/n;->a:Ljava/lang/CharSequence;

    .line 44
    :goto_3
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setText(Ljava/lang/CharSequence;)V

    const/4 p2, 0x2

    .line 45
    invoke-static {p1, v1, v2, p2, v1}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setImageBitmap$default(Lcom/sumsub/sns/core/widget/SNSFileItemView;Landroid/graphics/Bitmap;IILjava/lang/Object;)V

    .line 46
    invoke-virtual {p1, v2, v2}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setProgress(IZ)V

    .line 47
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setError(Ljava/lang/CharSequence;)V

    .line 48
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setStrokeDashed(Z)V

    if-eqz p3, :cond_9

    .line 49
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/utils/i0;

    invoke-direct {p2, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/i0;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/o;Lcom/sumsub/sns/core/widget/SNSFileItemView;)V

    invoke-static {p2, p1}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    goto :goto_4

    .line 50
    :cond_9
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_4
    if-eqz p4, :cond_a

    .line 51
    iget-object v1, p5, Lcom/sumsub/sns/internal/features/presentation/utils/n;->g:Ljava/lang/CharSequence;

    .line 52
    :cond_a
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setOptionalText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final varargs a([Lcom/sumsub/sns/core/widget/SNSFileItemView;)V
    .locals 9

    .line 53
    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v3, p1, v1

    add-int/lit8 v4, v2, 0x1

    if-eqz v3, :cond_0

    .line 54
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    sget-object v6, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ATTACHMENT:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v6}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v6

    .line 55
    sget-object v7, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v7}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v8

    invoke-interface {v8, v5, v6}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 56
    invoke-virtual {v3, v5}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setStartIcon(Landroid/graphics/drawable/Drawable;)V

    .line 57
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    sget-object v6, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->BIN:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v6}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v6

    .line 58
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v7

    invoke-interface {v7, v5, v6}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 59
    invoke-virtual {v3, v5}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setEndIcon(Landroid/graphics/drawable/Drawable;)V

    .line 60
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/utils/g0;

    invoke-direct {v5, p0, v2}, Lcom/sumsub/sns/internal/features/presentation/utils/g0;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/o;I)V

    invoke-virtual {v3, v5}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setEndIconClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    move v2, v4

    goto :goto_0

    :cond_1
    return-void
.end method
