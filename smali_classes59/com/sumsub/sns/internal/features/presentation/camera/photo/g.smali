.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "Lcom/sumsub/sns/databinding/e;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/G;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "Lcom/sumsub/sns/databinding/e;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/G;",
        "Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;",
        "<init>",
        "()V",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSNSDocumentSelectorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSDocumentSelectorFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/SNSDocumentSelectorFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,306:1\n106#2,15:307\n256#3,2:322\n256#3,2:324\n256#3,2:326\n1869#4,2:328\n*S KotlinDebug\n*F\n+ 1 SNSDocumentSelectorFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/photo/SNSDocumentSelectorFragment\n*L\n55#1:307,15\n102#1:322,2\n103#1:324,2\n116#1:326,2\n186#1:328,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lkotlin/Lazy;

.field public c:Z

.field public d:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/F;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/d1;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/d1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->a:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/e1;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/e1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;)V

    .line 20
    .line 21
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/b;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;)V

    .line 25
    .line 26
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 27
    .line 28
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/c;

    .line 29
    .line 30
    .line 31
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/b;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/d;

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/d;-><init>(Lkotlin/Lazy;)V

    .line 47
    .line 48
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/e;

    .line 49
    .line 50
    .line 51
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/e;-><init>(Lkotlin/Lazy;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->b:Lkotlin/Lazy;

    .line 58
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
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v0, "extra_document_type"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3

    .line 8
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->b:Lkotlin/Lazy;

    .line 9
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 10
    invoke-static {p0, p1, v2, v0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->onLinkClicked$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/String;ZILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;Landroid/view/View;)V
    .locals 0

    .line 5
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->b:Lkotlin/Lazy;

    .line 6
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 7
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/A;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/A;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;Landroid/widget/CompoundButton;Z)V
    .locals 0

    if-eqz p3, :cond_0

    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->b:Lkotlin/Lazy;

    .line 3
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 4
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/z;

    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;)V

    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    :cond_0
    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/t;Landroid/widget/RadioButton;)Z
    .locals 0

    .line 69
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/q;

    .line 70
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/q;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;

    .line 71
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 4

    .line 4
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w0;

    .line 5
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->a:Lkotlin/Lazy;

    .line 6
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 7
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;Ljava/lang/String;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->b:Lkotlin/Lazy;

    .line 2
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 3
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/w;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/w;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;)Lcom/sumsub/sns/core/widget/SNSCardRadioButton;
    .locals 8

    .line 86
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSCardRadioButton;

    .line 87
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    .line 88
    sget-object v5, Lcom/sumsub/sns/core/theme/SNSMetricElement;->DOCUMENT_TYPE_CARD_STYLE:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 89
    invoke-direct/range {v0 .. v7}, Lcom/sumsub/sns/core/widget/SNSCardRadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/sumsub/sns/core/theme/SNSMetricElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 90
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;->b:Ljava/lang/CharSequence;

    .line 91
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 93
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v1

    .line 94
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    .line 95
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;->c:Ljava/lang/String;

    .line 96
    invoke-interface {v1, v2, v3}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x1

    .line 97
    invoke-virtual {v0, v1, v2}, Lcom/sumsub/sns/core/widget/SNSCardRadioButton;->setStartDrawable(Landroid/graphics/drawable/Drawable;Z)V

    .line 98
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/f1;

    invoke-direct {v1, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/f1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-object v0
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/t;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 11
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/databinding/e;

    if-eqz v2, :cond_11

    .line 12
    iget-object v3, v2, Lcom/sumsub/sns/databinding/e;->e:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    const/16 v4, 0x8

    .line 13
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 14
    iget-object v3, v2, Lcom/sumsub/sns/databinding/e;->g:Landroid/widget/RadioGroup;

    .line 15
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 16
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/r;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/r;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 17
    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->d:Ljava/util/List;

    return-void

    .line 18
    :cond_0
    instance-of v3, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/s;

    if-eqz v3, :cond_1

    .line 19
    iget-object v2, v2, Lcom/sumsub/sns/databinding/e;->e:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/s;

    .line 20
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/s;->a:Ljava/lang/CharSequence;

    .line 21
    invoke-static {v2, v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 22
    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->d:Ljava/util/List;

    return-void

    .line 23
    :cond_1
    instance-of v3, v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/q;

    if-eqz v3, :cond_10

    .line 24
    move-object v3, v1

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/q;

    .line 25
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/camera/photo/q;->a:Ljava/util/List;

    .line 26
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/databinding/e;

    const/4 v6, -0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_c

    iget-object v5, v5, Lcom/sumsub/sns/databinding/e;->g:Landroid/widget/RadioGroup;

    .line 27
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->d:Ljava/util/List;

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto/16 :goto_6

    .line 28
    :cond_2
    iput-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->d:Ljava/util/List;

    .line 29
    invoke-static {v5}, Landroidx/transition/TransitionManager;->beginDelayedTransition(Landroid/view/ViewGroup;)V

    .line 30
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/databinding/e;

    if-eqz v5, :cond_c

    iget-object v5, v5, Lcom/sumsub/sns/databinding/e;->g:Landroid/widget/RadioGroup;

    .line 31
    invoke-virtual {v5}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 32
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/m;

    .line 33
    instance-of v9, v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/F;

    const/4 v10, -0x2

    if-eqz v9, :cond_9

    check-cast v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/F;

    .line 34
    new-instance v11, Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v12

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/F;->a:Ljava/lang/CharSequence;

    .line 36
    invoke-virtual {v11, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    sget-object v8, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v8}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-interface {v8}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    move-result-object v8

    goto :goto_1

    :cond_3
    move-object v8, v4

    :goto_1
    instance-of v9, v8, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz v9, :cond_4

    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    goto :goto_2

    :cond_4
    move-object v8, v4

    :goto_2
    if-eqz v8, :cond_7

    .line 38
    sget-object v9, Lcom/sumsub/sns/core/theme/SNSMetricElement;->SECTION_HEADER_ALIGNMENT:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 39
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    if-eqz v8, :cond_5

    .line 40
    invoke-virtual {v9}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    goto :goto_3

    :cond_5
    move-object v8, v4

    :goto_3
    instance-of v9, v8, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    if-eqz v9, :cond_6

    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    goto :goto_4

    :cond_6
    move-object v8, v4

    :goto_4
    if-eqz v8, :cond_7

    .line 41
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/presentation/theme/h;->a:Ljava/lang/String;

    goto :goto_5

    :cond_7
    move-object v8, v4

    :goto_5
    if-eqz v8, :cond_8

    .line 42
    invoke-static {v11, v8}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 43
    :cond_8
    new-instance v8, Landroid/widget/RadioGroup$LayoutParams;

    invoke-direct {v8, v6, v10}, Landroid/widget/RadioGroup$LayoutParams;-><init>(II)V

    .line 44
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    sget v10, Lcom/sumsub/sns/R$dimen;->sns_margin_small:I

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    invoke-virtual {v8, v7, v7, v7, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 45
    invoke-virtual {v5, v11, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 46
    :cond_9
    instance-of v9, v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;

    if-eqz v9, :cond_a

    check-cast v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;

    .line 47
    invoke-virtual {v0, v8}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/E;)Lcom/sumsub/sns/core/widget/SNSCardRadioButton;

    move-result-object v8

    .line 48
    new-instance v9, Landroid/widget/RadioGroup$LayoutParams;

    invoke-direct {v9, v6, v10}, Landroid/widget/RadioGroup$LayoutParams;-><init>(II)V

    .line 49
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    sget v11, Lcom/sumsub/sns/R$dimen;->sns_margin_small:I

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v10

    invoke-virtual {v9, v7, v7, v7, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 50
    invoke-virtual {v5, v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 51
    :cond_a
    instance-of v9, v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/o;

    if-eqz v9, :cond_b

    check-cast v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/o;

    .line 52
    new-instance v11, Lcom/sumsub/sns/core/widget/SNSDividerWithTextView;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v12

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lcom/sumsub/sns/core/widget/SNSDividerWithTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/o;->a:Ljava/lang/CharSequence;

    .line 54
    invoke-virtual {v11, v8}, Lcom/sumsub/sns/core/widget/SNSDividerWithTextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    new-instance v8, Landroid/widget/RadioGroup$LayoutParams;

    invoke-direct {v8, v6, v10}, Landroid/widget/RadioGroup$LayoutParams;-><init>(II)V

    .line 56
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    sget v10, Lcom/sumsub/sns/R$dimen;->sns_margin_small:I

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    invoke-virtual {v8, v7, v7, v7, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 57
    invoke-virtual {v5, v11, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 58
    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 59
    :cond_c
    :goto_6
    iget-object v3, v2, Lcom/sumsub/sns/databinding/e;->g:Landroid/widget/RadioGroup;

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/photo/c1;

    invoke-direct {v5, v1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/c1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/t;)V

    .line 60
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    move v8, v7

    :goto_7
    if-ge v8, v1, :cond_f

    .line 61
    invoke-virtual {v3, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 62
    instance-of v10, v9, Lcom/sumsub/sns/core/widget/SNSCardRadioButton;

    if-eqz v10, :cond_d

    check-cast v9, Lcom/sumsub/sns/core/widget/SNSCardRadioButton;

    goto :goto_8

    :cond_d
    move-object v9, v4

    :goto_8
    if-eqz v9, :cond_e

    .line 63
    invoke-interface {v5, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_e

    .line 64
    invoke-virtual {v9}, Landroid/view/View;->getId()I

    move-result v6

    :cond_e
    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    .line 65
    :cond_f
    invoke-virtual {v3, v6}, Landroid/widget/RadioGroup;->check(I)V

    .line 66
    iget-object v1, v2, Lcom/sumsub/sns/databinding/e;->g:Landroid/widget/RadioGroup;

    .line 67
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 68
    :cond_10
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_11
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v;)V
    .locals 3

    .line 72
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/databinding/e;

    if-eqz v0, :cond_0

    .line 73
    iget-object v1, v0, Lcom/sumsub/sns/databinding/e;->f:Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 74
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v;->a:Ljava/lang/CharSequence;

    .line 75
    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 76
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/b1;

    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/b1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;)V

    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 77
    new-instance v2, Landroid/text/method/LinkMovementMethod;

    invoke-direct {v2}, Landroid/text/method/LinkMovementMethod;-><init>()V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 78
    iget-object v1, v0, Lcom/sumsub/sns/databinding/e;->b:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 79
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/l;

    .line 80
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/l;->a:Ljava/lang/CharSequence;

    .line 81
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    iget-object v0, v0, Lcom/sumsub/sns/databinding/e;->b:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 83
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v;->b:Lcom/sumsub/sns/internal/features/presentation/camera/photo/l;

    .line 84
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/l;->b:Z

    .line 85
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/v0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final handleSuccessState(Lcom/sumsub/sns/core/presentation/base/V;Landroid/os/Bundle;)V
    .locals 10

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/G;

    .line 3
    .line 4
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/G;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/n;

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-eqz p2, :cond_3

    .line 9
    .line 10
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->c:Z

    .line 11
    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/n;->a:Ljava/util/List;

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    iput-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->c:Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/photo/a;

    .line 24
    .line 25
    .line 26
    invoke-direct {v4, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/a;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;)V

    .line 27
    .line 28
    instance-of v5, v3, Landroidx/fragment/app/FragmentActivity;

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    check-cast v3, Landroidx/fragment/app/FragmentActivity;

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v3, v1

    .line 35
    .line 36
    :goto_0
    if-eqz v3, :cond_4

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    if-nez v3, :cond_1

    .line 43
    goto :goto_1

    .line 44
    .line 45
    :cond_1
    const-string v5, "CountryPickerDialog"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v5}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 49
    move-result-object v6

    .line 50
    .line 51
    if-eqz v6, :cond_2

    .line 52
    goto :goto_1

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    .line 56
    move-result-object v6

    .line 57
    .line 58
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;

    .line 59
    .line 60
    .line 61
    invoke-direct {v7}, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;-><init>()V

    .line 62
    .line 63
    iput-object v4, v7, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;->c:Lcom/sumsub/sns/internal/features/presentation/country/picker/e;

    .line 64
    .line 65
    new-instance v4, Landroid/os/Bundle;

    .line 66
    .line 67
    .line 68
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 69
    .line 70
    sget-object v8, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;->SINGLE:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog$SelectionMode;

    .line 71
    .line 72
    const-string v9, "extra_selection_mode"

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v9, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 76
    .line 77
    new-array v8, v0, [Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 78
    .line 79
    .line 80
    invoke-interface {p2, v8}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 81
    move-result-object p2

    .line 82
    .line 83
    check-cast p2, [Landroid/os/Parcelable;

    .line 84
    .line 85
    const-string v8, "extra_items"

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v8, p2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 89
    .line 90
    new-array p2, v0, [Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 91
    .line 92
    .line 93
    invoke-interface {v6, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 94
    move-result-object p2

    .line 95
    .line 96
    check-cast p2, [Landroid/os/Parcelable;

    .line 97
    .line 98
    const-string v0, "extra_preselected_items"

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v0, p2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 102
    .line 103
    const-string p2, "extra_sort"

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, p2, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v7, v4}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v7, v3, v5}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 113
    goto :goto_1

    .line 114
    .line 115
    :cond_3
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->c:Z

    .line 116
    .line 117
    .line 118
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 119
    move-result-object p2

    .line 120
    .line 121
    check-cast p2, Lcom/sumsub/sns/databinding/e;

    .line 122
    .line 123
    if-eqz p2, :cond_5

    .line 124
    .line 125
    iget-object p2, p2, Lcom/sumsub/sns/databinding/e;->h:Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 126
    .line 127
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/G;->b:Ljava/lang/CharSequence;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    .line 132
    :cond_5
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/G;->c:Lcom/sumsub/sns/internal/features/presentation/camera/photo/C;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 136
    move-result-object v0

    .line 137
    .line 138
    check-cast v0, Lcom/sumsub/sns/databinding/e;

    .line 139
    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    iget-object v2, v0, Lcom/sumsub/sns/databinding/e;->c:Lcom/sumsub/sns/core/widget/SNSCountrySelectorView;

    .line 143
    .line 144
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/C;->c:Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 145
    .line 146
    if-eqz v3, :cond_6

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 150
    move-result-object v4

    .line 151
    .line 152
    .line 153
    invoke-static {v3, v4}, Lcom/sumsub/sns/internal/features/presentation/country/c;->a(Lcom/sumsub/sns/internal/features/presentation/country/b;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 154
    move-result-object v3

    .line 155
    goto :goto_2

    .line 156
    :cond_6
    move-object v3, v1

    .line 157
    .line 158
    .line 159
    :goto_2
    invoke-virtual {v2, v3}, Lcom/sumsub/sns/core/widget/SNSStepView;->setIconStart(Landroid/graphics/drawable/Drawable;)V

    .line 160
    .line 161
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/C;->c:Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 162
    .line 163
    if-eqz v3, :cond_7

    .line 164
    .line 165
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/country/b;->b:Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    :cond_7
    invoke-virtual {v2, v1}, Lcom/sumsub/sns/core/widget/SNSStepView;->setTitle(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    iget-object v1, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/C;->b:Ljava/lang/CharSequence;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v1}, Lcom/sumsub/sns/core/widget/SNSStepView;->setPlaceholder(Ljava/lang/CharSequence;)V

    .line 174
    .line 175
    iget-object v0, v0, Lcom/sumsub/sns/databinding/e;->d:Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;

    .line 176
    .line 177
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/C;->a:Ljava/lang/CharSequence;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    :cond_8
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/G;->d:Lcom/sumsub/sns/internal/features/presentation/camera/photo/t;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/t;)V

    .line 186
    .line 187
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/G;->e:Lcom/sumsub/sns/internal/features/presentation/camera/photo/v;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->a(Lcom/sumsub/sns/internal/features/presentation/camera/photo/v;)V

    .line 191
    return-void
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public final onDestroyView()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/F;->onDestroyView()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;->d:Ljava/util/List;

    .line 7
    return-void
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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/F;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Lcom/sumsub/sns/databinding/e;

    .line 10
    .line 11
    if-eqz p1, :cond_7

    .line 12
    .line 13
    iget-object p2, p1, Lcom/sumsub/sns/databinding/e;->c:Lcom/sumsub/sns/core/widget/SNSCountrySelectorView;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->MORE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    sget-object v2, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-interface {v3, v0, v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->DISCLOSURE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    .line 48
    invoke-interface {v3, v0, v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-virtual {p2, v1}, Lcom/sumsub/sns/core/widget/SNSStepView;->setIconEnd(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 56
    move-result-object p2

    .line 57
    const/4 v0, 0x0

    .line 58
    .line 59
    if-eqz p2, :cond_1

    .line 60
    .line 61
    .line 62
    invoke-interface {p2}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    .line 63
    move-result-object p2

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move-object p2, v0

    .line 66
    .line 67
    :goto_0
    instance-of v1, p2, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 68
    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move-object p2, v0

    .line 74
    .line 75
    :goto_1
    if-eqz p2, :cond_5

    .line 76
    .line 77
    sget-object v1, Lcom/sumsub/sns/core/theme/SNSMetricElement;->SECTION_HEADER_ALIGNMENT:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 78
    .line 79
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    .line 80
    .line 81
    if-eqz p2, :cond_3

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    .line 85
    move-result-object v1

    .line 86
    .line 87
    .line 88
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    move-result-object p2

    .line 90
    .line 91
    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    .line 92
    goto :goto_2

    .line 93
    :cond_3
    move-object p2, v0

    .line 94
    .line 95
    :goto_2
    instance-of v1, p2, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    .line 96
    .line 97
    if-eqz v1, :cond_4

    .line 98
    .line 99
    check-cast p2, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    .line 100
    goto :goto_3

    .line 101
    :cond_4
    move-object p2, v0

    .line 102
    .line 103
    :goto_3
    if-eqz p2, :cond_5

    .line 104
    .line 105
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/theme/h;->a:Ljava/lang/String;

    .line 106
    .line 107
    :cond_5
    if-eqz v0, :cond_6

    .line 108
    .line 109
    iget-object p2, p1, Lcom/sumsub/sns/databinding/e;->d:Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;

    .line 110
    .line 111
    .line 112
    invoke-static {p2, v0}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 113
    .line 114
    :cond_6
    iget-object p2, p1, Lcom/sumsub/sns/databinding/e;->c:Lcom/sumsub/sns/core/widget/SNSCountrySelectorView;

    .line 115
    .line 116
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/z0;

    .line 117
    .line 118
    .line 119
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/z0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 123
    .line 124
    iget-object p1, p1, Lcom/sumsub/sns/databinding/e;->b:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 125
    .line 126
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/camera/photo/a1;

    .line 127
    .line 128
    .line 129
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/a1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/g;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    :cond_7
    return-void
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 10

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_document_selector:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    sget p2, Lcom/sumsub/sns/R$id;->sns_bottom_controls:I

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget p2, Lcom/sumsub/sns/R$id;->sns_container:I

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    check-cast v0, Landroidx/fragment/app/FragmentContainerView;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    sget p2, Lcom/sumsub/sns/R$id;->sns_continue:I

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 33
    move-result-object v0

    .line 34
    move-object v3, v0

    .line 35
    .line 36
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    sget p2, Lcom/sumsub/sns/R$id;->sns_country_selector:I

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 44
    move-result-object v0

    .line 45
    move-object v4, v0

    .line 46
    .line 47
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSCountrySelectorView;

    .line 48
    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    sget p2, Lcom/sumsub/sns/R$id;->sns_country_title:I

    .line 52
    .line 53
    .line 54
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 55
    move-result-object v0

    .line 56
    move-object v5, v0

    .line 57
    .line 58
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;

    .line 59
    .line 60
    if-eqz v5, :cond_0

    .line 61
    .line 62
    sget p2, Lcom/sumsub/sns/R$id;->sns_documents_empty:I

    .line 63
    .line 64
    .line 65
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 66
    move-result-object v0

    .line 67
    move-object v6, v0

    .line 68
    .line 69
    check-cast v6, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 70
    .line 71
    if-eqz v6, :cond_0

    .line 72
    .line 73
    sget p2, Lcom/sumsub/sns/R$id;->sns_footer:I

    .line 74
    .line 75
    .line 76
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 77
    move-result-object v0

    .line 78
    move-object v7, v0

    .line 79
    .line 80
    check-cast v7, Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 81
    .line 82
    if-eqz v7, :cond_0

    .line 83
    .line 84
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_end:I

    .line 85
    .line 86
    .line 87
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 91
    .line 92
    if-eqz v0, :cond_0

    .line 93
    .line 94
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_start:I

    .line 95
    .line 96
    .line 97
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 101
    .line 102
    if-eqz v0, :cond_0

    .line 103
    .line 104
    sget p2, Lcom/sumsub/sns/R$id;->sns_radiogroup:I

    .line 105
    .line 106
    .line 107
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 108
    move-result-object v0

    .line 109
    move-object v8, v0

    .line 110
    .line 111
    check-cast v8, Landroid/widget/RadioGroup;

    .line 112
    .line 113
    if-eqz v8, :cond_0

    .line 114
    .line 115
    sget p2, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 116
    .line 117
    .line 118
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 119
    move-result-object v0

    .line 120
    move-object v9, v0

    .line 121
    .line 122
    check-cast v9, Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 123
    .line 124
    if-eqz v9, :cond_0

    .line 125
    .line 126
    sget p2, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 127
    .line 128
    .line 129
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 133
    .line 134
    if-eqz v0, :cond_0

    .line 135
    .line 136
    new-instance v1, Lcom/sumsub/sns/databinding/e;

    .line 137
    move-object v2, p1

    .line 138
    .line 139
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;

    .line 140
    .line 141
    .line 142
    invoke-direct/range {v1 .. v9}, Lcom/sumsub/sns/databinding/e;-><init>(Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;Lcom/sumsub/sns/core/widget/SNSCountrySelectorView;Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSCaptionTextView;Landroid/widget/RadioGroup;Lcom/sumsub/sns/core/widget/SNSH1TextView;)V

    .line 143
    return-object v1

    .line 144
    .line 145
    .line 146
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 147
    move-result-object p1

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 151
    move-result-object p1

    .line 152
    .line 153
    new-instance p2, Ljava/lang/NullPointerException;

    .line 154
    .line 155
    const-string v0, "Missing required view with ID: "

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    move-result-object p1

    .line 160
    .line 161
    .line 162
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 163
    throw p2
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
