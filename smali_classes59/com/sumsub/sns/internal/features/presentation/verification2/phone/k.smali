.class public final Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "Lcom/sumsub/sns/databinding/v;",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/r;",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/F;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "Lcom/sumsub/sns/databinding/v;",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/r;",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/F;",
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
        "SMAP\nPhoneVerificationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneVerificationFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/phone/PhoneVerificationFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,70:1\n106#2,15:71\n256#3,2:86\n*S KotlinDebug\n*F\n+ 1 PhoneVerificationFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/phone/PhoneVerificationFragment\n*L\n20#1:71,15\n52#1:86,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/F;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c0;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/f;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/g;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/g;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/f;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/F;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/h;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/h;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/i;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/i;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;

    .line 49
    .line 50
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/d0;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;)V

    .line 54
    .line 55
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e0;

    .line 56
    .line 57
    .line 58
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/e;-><init>(Lcom/sumsub/sns/core/presentation/base/F;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 62
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;)Lkotlin/Unit;
    .locals 2

    .line 25
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    .line 26
    check-cast v0, Lcom/sumsub/sns/databinding/v;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/sumsub/sns/databinding/v;->d:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/F;

    .line 28
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/F;->e:Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;

    .line 29
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;->k:Lkotlinx/coroutines/flow/n;

    .line 30
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;

    if-eqz v1, :cond_1

    .line 31
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;->a:Ljava/lang/String;

    .line 32
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/F;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/phone/l;

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->b(Ljava/lang/String;)V

    .line 33
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/databinding/v;

    if-eqz p0, :cond_2

    iget-object p0, p0, Lcom/sumsub/sns/databinding/v;->c:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    invoke-static {p0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 34
    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 24
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;)Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/F;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/F;->e:Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;

    .line 11
    return-object p0
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
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/F;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/F;->e:Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;->k:Lkotlinx/coroutines/flow/n;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;->a:Ljava/lang/String;

    .line 23
    .line 24
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/F;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/phone/l;

    .line 25
    .line 26
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->b(Ljava/lang/String;)V

    .line 30
    .line 31
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 32
    return-object p0
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
.end method

.method public static final d(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/G;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/G;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;)V

    .line 6
    return-object v0
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
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/r;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/databinding/v;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, v0, Lcom/sumsub/sns/databinding/v;->f:Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 3
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/r;->a:Ljava/lang/CharSequence;

    .line 4
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v1, v0, Lcom/sumsub/sns/databinding/v;->e:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 6
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/r;->b:Ljava/lang/CharSequence;

    .line 7
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v1, v0, Lcom/sumsub/sns/databinding/v;->b:Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 9
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/r;->c:Ljava/lang/CharSequence;

    .line 10
    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 11
    iget-object v1, v0, Lcom/sumsub/sns/databinding/v;->b:Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 12
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/r;->c:Ljava/lang/CharSequence;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    const/16 v2, 0x8

    .line 13
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 14
    iget-object v1, v0, Lcom/sumsub/sns/databinding/v;->b:Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/f0;

    invoke-direct {v2}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/f0;-><init>()V

    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 15
    iget-object v1, v0, Lcom/sumsub/sns/databinding/v;->d:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 16
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/r;->d:Lcom/sumsub/sns/internal/features/presentation/verification2/phone/o;

    if-eqz v2, :cond_2

    .line 17
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/o;->a:Ljava/lang/CharSequence;

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 18
    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    iget-object v1, v0, Lcom/sumsub/sns/databinding/v;->d:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 20
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/r;->d:Lcom/sumsub/sns/internal/features/presentation/verification2/phone/o;

    if-eqz p1, :cond_3

    .line 21
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/o;->b:Z

    .line 22
    :cond_3
    invoke-virtual {v1, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 23
    iget-object p1, v0, Lcom/sumsub/sns/databinding/v;->d:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/g0;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/g0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;)V

    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    return-void
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "PHONE_VERIFICATION"

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
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->ConfirmationContactScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/F;

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

.method public final bridge synthetic handleSuccessState(Lcom/sumsub/sns/core/presentation/base/V;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/r;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/k;->a(Lcom/sumsub/sns/internal/features/presentation/verification2/phone/r;)V

    .line 6
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 8

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_verify_phone2:I

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
    sget p2, Lcom/sumsub/sns/R$id;->sns_footer:I

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
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_end:I

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_start:I

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    sget p2, Lcom/sumsub/sns/R$id;->sns_phone:I

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    sget p2, Lcom/sumsub/sns/R$id;->sns_phone_id:I

    .line 51
    .line 52
    .line 53
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 54
    move-result-object v0

    .line 55
    move-object v4, v0

    .line 56
    .line 57
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 58
    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    sget p2, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 62
    .line 63
    .line 64
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 65
    move-result-object v0

    .line 66
    move-object v5, v0

    .line 67
    .line 68
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 69
    .line 70
    if-eqz v5, :cond_0

    .line 71
    .line 72
    sget p2, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 73
    .line 74
    .line 75
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 76
    move-result-object v0

    .line 77
    move-object v6, v0

    .line 78
    .line 79
    check-cast v6, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 80
    .line 81
    if-eqz v6, :cond_0

    .line 82
    .line 83
    sget p2, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 84
    .line 85
    .line 86
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 87
    move-result-object v0

    .line 88
    move-object v7, v0

    .line 89
    .line 90
    check-cast v7, Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 91
    .line 92
    if-eqz v7, :cond_0

    .line 93
    .line 94
    sget p2, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 95
    .line 96
    .line 97
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 101
    .line 102
    if-eqz v0, :cond_0

    .line 103
    .line 104
    new-instance v1, Lcom/sumsub/sns/databinding/v;

    .line 105
    move-object v2, p1

    .line 106
    .line 107
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 108
    .line 109
    .line 110
    invoke-direct/range {v1 .. v7}, Lcom/sumsub/sns/databinding/v;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/sumsub/sns/core/widget/SNSCaptionTextView;Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSH1TextView;)V

    .line 111
    return-object v1

    .line 112
    .line 113
    .line 114
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    new-instance p2, Ljava/lang/NullPointerException;

    .line 122
    .line 123
    const-string v0, "Missing required view with ID: "

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    move-result-object p1

    .line 128
    .line 129
    .line 130
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 131
    throw p2
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
