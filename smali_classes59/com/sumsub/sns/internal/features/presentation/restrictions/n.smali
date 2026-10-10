.class public final Lcom/sumsub/sns/internal/features/presentation/restrictions/n;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "Lcom/sumsub/sns/databinding/n;",
        "Lcom/sumsub/sns/internal/features/presentation/restrictions/t;",
        "Lcom/sumsub/sns/internal/features/presentation/restrictions/C;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/restrictions/n;",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "Lcom/sumsub/sns/databinding/n;",
        "Lcom/sumsub/sns/internal/features/presentation/restrictions/t;",
        "Lcom/sumsub/sns/internal/features/presentation/restrictions/C;",
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
        "SMAP\nSNSRestrictionsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSRestrictionsFragment.kt\ncom/sumsub/sns/internal/features/presentation/restrictions/SNSRestrictionsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,85:1\n106#2,15:86\n256#3,2:101\n*S KotlinDebug\n*F\n+ 1 SNSRestrictionsFragment.kt\ncom/sumsub/sns/internal/features/presentation/restrictions/SNSRestrictionsFragment\n*L\n29#1:86,15\n64#1:101,2\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic U:I


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/analytics/Screen;

.field public final b:Ljava/lang/String;

.field public final c:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/F;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->RestrictionsScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/n;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 8
    .line 9
    const-string v0, "Status"

    .line 10
    .line 11
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/n;->b:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/restrictions/a0;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/restrictions/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/restrictions/n;)V

    .line 17
    .line 18
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/restrictions/i;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/restrictions/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/restrictions/n;)V

    .line 22
    .line 23
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 24
    .line 25
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/restrictions/j;

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/restrictions/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/restrictions/i;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/restrictions/k;

    .line 41
    .line 42
    .line 43
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/restrictions/k;-><init>(Lkotlin/Lazy;)V

    .line 44
    .line 45
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/restrictions/l;

    .line 46
    .line 47
    .line 48
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/restrictions/l;-><init>(Lkotlin/Lazy;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/n;->c:Lkotlin/Lazy;

    .line 55
    return-void
    .line 56
    .line 57
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/restrictions/n;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 6

    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/restrictions/h;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    move-result-object v4

    .line 6
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/n;->b:Ljava/lang/String;

    move-object v1, p0

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/restrictions/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/restrictions/n;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;Lcom/sumsub/sns/internal/core/common/u0;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/restrictions/n;Lcom/sumsub/sns/internal/features/presentation/restrictions/o;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/n;->c:Lkotlin/Lazy;

    .line 2
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

    .line 3
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/o;->b:Lcom/sumsub/sns/internal/features/presentation/restrictions/r;

    .line 4
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/core/widget/SNSPrimaryButton;Lcom/sumsub/sns/internal/features/presentation/restrictions/o;)V
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 9
    iget-object v0, p2, Lcom/sumsub/sns/internal/features/presentation/restrictions/o;->a:Ljava/lang/String;

    .line 10
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/restrictions/m;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/restrictions/m;-><init>(Lcom/sumsub/sns/internal/features/presentation/restrictions/n;Lcom/sumsub/sns/internal/features/presentation/restrictions/o;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/n;->b:Ljava/lang/String;

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

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/n;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

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

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/restrictions/n;->c:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/restrictions/C;

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
    .locals 3

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/t;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    check-cast p2, Lcom/sumsub/sns/databinding/n;

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    return-void

    .line 12
    .line 13
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/s;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p2, Lcom/sumsub/sns/databinding/n;->d:Lcom/sumsub/sns/core/widget/SNSH2TextView;

    .line 18
    .line 19
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/s;

    .line 20
    .line 21
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/s;->a:Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    iget-object v0, p2, Lcom/sumsub/sns/databinding/n;->c:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 27
    .line 28
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/s;->b:Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/s;->c:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSRestrictionsIcons;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSRestrictionsIcons;->getImageName()Ljava/lang/String;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v1, v2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    iget-object v1, p2, Lcom/sumsub/sns/databinding/n;->b:Lcom/sumsub/sns/core/widget/SNSImageView;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 57
    .line 58
    iget-object p2, p2, Lcom/sumsub/sns/databinding/n;->e:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 59
    .line 60
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/restrictions/s;->d:Lcom/sumsub/sns/internal/features/presentation/restrictions/o;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/restrictions/n;->a(Lcom/sumsub/sns/core/widget/SNSPrimaryButton;Lcom/sumsub/sns/internal/features/presentation/restrictions/o;)V

    .line 64
    return-void

    .line 65
    .line 66
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 67
    .line 68
    .line 69
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 70
    throw p1
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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

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
    check-cast p1, Lcom/sumsub/sns/databinding/n;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Lcom/sumsub/sns/databinding/n;->b:Lcom/sumsub/sns/core/widget/SNSImageView;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    sget-object p2, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Lcom/sumsub/sns/core/widget/SNSStepViewExtensionsKt;->setSnsStepState(Landroid/view/View;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    .line 21
    :cond_0
    return-void
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

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 7

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_restrictions:I

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
    sget p2, Lcom/sumsub/sns/R$id;->sns_error_icon:I

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 13
    move-result-object v0

    .line 14
    move-object v3, v0

    .line 15
    .line 16
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSImageView;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    sget p2, Lcom/sumsub/sns/R$id;->sns_error_subtitle:I

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 24
    move-result-object v0

    .line 25
    move-object v4, v0

    .line 26
    .line 27
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    sget p2, Lcom/sumsub/sns/R$id;->sns_error_title:I

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 35
    move-result-object v0

    .line 36
    move-object v5, v0

    .line 37
    .line 38
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSH2TextView;

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_end:I

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_start:I

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 59
    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    sget p2, Lcom/sumsub/sns/R$id;->sns_primary_button:I

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
    check-cast v6, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 70
    .line 71
    if-eqz v6, :cond_0

    .line 72
    .line 73
    sget p2, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 74
    .line 75
    .line 76
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 80
    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    new-instance v1, Lcom/sumsub/sns/databinding/n;

    .line 84
    move-object v2, p1

    .line 85
    .line 86
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;

    .line 87
    .line 88
    .line 89
    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/databinding/n;-><init>(Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;Lcom/sumsub/sns/core/widget/SNSImageView;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSH2TextView;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;)V

    .line 90
    return-object v1

    .line 91
    .line 92
    .line 93
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    new-instance p2, Ljava/lang/NullPointerException;

    .line 101
    .line 102
    const-string v0, "Missing required view with ID: "

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    .line 109
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 110
    throw p2
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
