.class public final Lcom/sumsub/sns/internal/core/presentation/common/a;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final e:Lkotlin/jvm/internal/FunctionReferenceImpl;

.field public final f:Lkotlin/jvm/internal/FunctionReferenceImpl;

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/presentation/base/F;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 5
    .line 6
    check-cast p2, Lkotlin/jvm/internal/FunctionReferenceImpl;

    .line 7
    .line 8
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/common/a;->e:Lkotlin/jvm/internal/FunctionReferenceImpl;

    .line 9
    .line 10
    check-cast p3, Lkotlin/jvm/internal/FunctionReferenceImpl;

    .line 11
    .line 12
    iput-object p3, p0, Lcom/sumsub/sns/internal/core/presentation/common/a;->f:Lkotlin/jvm/internal/FunctionReferenceImpl;

    .line 13
    .line 14
    const-string p1, "AttachSourceSelector"

    .line 15
    .line 16
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/a;->g:Ljava/lang/String;

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

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/common/a;Landroid/view/View;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Lkotlin/Unit;
    .locals 7

    .line 32
    const-string/jumbo v0, "sns_prompt_documentSource_action_camera"

    invoke-virtual {p2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 33
    const-string/jumbo v0, "sns_prompt_documentSource_action_gallery"

    invoke-virtual {p2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 34
    iget-object v5, p0, Lcom/sumsub/sns/internal/core/presentation/common/a;->f:Lkotlin/jvm/internal/FunctionReferenceImpl;

    .line 35
    iget-object v6, p0, Lcom/sumsub/sns/internal/core/presentation/common/a;->e:Lkotlin/jvm/internal/FunctionReferenceImpl;

    move-object v1, p0

    move-object v2, p1

    .line 36
    invoke-virtual/range {v1 .. v6}, Lcom/sumsub/sns/internal/core/presentation/common/a;->a(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 37
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/common/a;Lkotlin/jvm/functions/Function0;Landroid/view/MenuItem;)Z
    .locals 2

    .line 38
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 39
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p0

    .line 40
    sget-object p2, Lcom/sumsub/sns/internal/core/analytics/Control;->DocumentSourceCamera:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p0, p2, v0, v0, v1}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 41
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    const/4 p0, 0x1

    return p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/core/presentation/common/a;Lkotlin/jvm/functions/Function0;Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    sget-object p2, Lcom/sumsub/sns/internal/core/analytics/Control;->DocumentSourceGallery:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x6

    .line 11
    .line 12
    .line 13
    invoke-static {p0, p2, v0, v0, v1}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 17
    const/4 p0, 0x1

    .line 18
    return p0
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


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 7

    .line 28
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/common/v;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/v;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/a;Landroid/view/View;)V

    .line 29
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    move-result-object p1

    .line 30
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    .line 31
    new-instance v4, Lcom/sumsub/sns/internal/core/presentation/common/s;

    const/4 p1, 0x0

    invoke-direct {v4, p0, v0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/s;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/t;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    .line 3
    sget-object v1, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_WEAK:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {p1, v1}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    .line 4
    :cond_0
    sget v1, Lcom/sumsub/sns/R$color;->sns_contentWeak:I

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    .line 5
    :goto_0
    sget-object v2, Lcom/sumsub/sns/core/theme/SNSColorElement;->ALERT_TINT:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {p1, v2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    move-result-object v2

    .line 6
    new-instance v3, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v5

    const/4 v6, 0x0

    invoke-direct {v3, v6, v6, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    const/4 v4, 0x1

    invoke-virtual {p1, v3, v4}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;Z)Z

    .line 7
    new-instance v3, Landroidx/appcompat/widget/PopupMenu;

    invoke-direct {v3, v0, p1}, Landroidx/appcompat/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 8
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/PopupMenu;->setForceShowIcon(Z)V

    .line 9
    invoke-virtual {v3}, Landroidx/appcompat/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    move-result-object p1

    const/16 v4, 0x21

    const/4 v5, 0x0

    if-eqz p2, :cond_1

    if-eqz v2, :cond_2

    .line 10
    new-instance v7, Landroid/text/SpannableString;

    invoke-direct {v7, p2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 11
    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-direct {p2, v8}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v7}, Landroid/text/SpannableString;->length()I

    move-result v8

    invoke-virtual {v7, p2, v6, v8, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    move-object p2, v7

    goto :goto_1

    :cond_1
    move-object p2, v5

    .line 12
    :cond_2
    :goto_1
    invoke-interface {p1, p2}, Landroid/view/Menu;->add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    .line 13
    sget-object p2, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->ICON_CAMERA:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {p2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object p2

    .line 14
    sget-object v7, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v7}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v8

    invoke-interface {v8, v0, p2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 15
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v8

    invoke-virtual {p2, v8}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_2

    :cond_3
    move-object p2, v5

    .line 16
    :goto_2
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 17
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/common/w;

    invoke-direct {p2, p0, p5}, Lcom/sumsub/sns/internal/core/presentation/common/w;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/a;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 18
    invoke-virtual {v3}, Landroidx/appcompat/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    move-result-object p1

    if-eqz p3, :cond_4

    if-eqz v2, :cond_5

    .line 19
    new-instance p2, Landroid/text/SpannableString;

    invoke-direct {p2, p3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 20
    new-instance p3, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p5

    invoke-direct {p3, p5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p2}, Landroid/text/SpannableString;->length()I

    move-result p5

    invoke-virtual {p2, p3, v6, p5, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    move-object p3, p2

    goto :goto_3

    :cond_4
    move-object p3, v5

    .line 21
    :cond_5
    :goto_3
    invoke-interface {p1, p3}, Landroid/view/Menu;->add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    .line 22
    sget-object p2, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->GALLERY_SMALL:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {p2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object p2

    .line 23
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object p3

    invoke-interface {p3, v0, p2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 24
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    move-object v5, p2

    .line 25
    :cond_6
    invoke-interface {p1, v5}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 26
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/common/x;

    invoke-direct {p2, p0, p4}, Lcom/sumsub/sns/internal/core/presentation/common/x;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/a;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 27
    invoke-virtual {v3}, Landroidx/appcompat/widget/PopupMenu;->show()V

    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/a;->g:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
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
.end method
