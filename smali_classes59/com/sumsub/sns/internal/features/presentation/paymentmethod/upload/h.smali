.class public final Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;
.super Lcom/sumsub/sns/internal/features/presentation/common/g;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/internal/features/presentation/common/g<",
        "Lcom/sumsub/sns/databinding/d;",
        "Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/p;",
        "Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;",
        "Lcom/sumsub/sns/internal/features/presentation/common/g;",
        "Lcom/sumsub/sns/databinding/d;",
        "Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/p;",
        "Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;",
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
        "SMAP\nSNSBankCardUploadFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSBankCardUploadFragment.kt\ncom/sumsub/sns/internal/features/presentation/paymentmethod/upload/SNSBankCardUploadFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,179:1\n106#2,15:180\n256#3,2:195\n256#3,2:197\n256#3,2:199\n256#3,2:201\n256#3,2:203\n27#4,4:205\n27#4,4:209\n*S KotlinDebug\n*F\n+ 1 SNSBankCardUploadFragment.kt\ncom/sumsub/sns/internal/features/presentation/paymentmethod/upload/SNSBankCardUploadFragment\n*L\n42#1:180,15\n101#1:195,2\n102#1:197,2\n103#1:199,2\n150#1:201,2\n160#1:203,2\n33#1:205,4\n38#1:209,4\n*E\n"
    }
.end annotation


# instance fields
.field public final e:Lkotlin/Lazy;

.field public final f:Lkotlin/Lazy;

.field public final g:Lkotlin/Lazy;

.field public final h:Ljava/lang/String;

.field public final i:Lcom/sumsub/sns/internal/core/analytics/Screen;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/common/g;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/x;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/x;-><init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;->e:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/y;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/y;-><init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;->f:Lkotlin/Lazy;

    .line 26
    .line 27
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/z;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;)V

    .line 31
    .line 32
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/c;

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;)V

    .line 36
    .line 37
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 38
    .line 39
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/d;

    .line 40
    .line 41
    .line 42
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/c;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;

    .line 49
    .line 50
    .line 51
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/e;

    .line 55
    .line 56
    .line 57
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/e;-><init>(Lkotlin/Lazy;)V

    .line 58
    .line 59
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/f;

    .line 60
    .line 61
    .line 62
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/f;-><init>(Lkotlin/Lazy;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;->g:Lkotlin/Lazy;

    .line 69
    .line 70
    const-string v0, "PAYMENT_METHODS"

    .line 71
    .line 72
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;->h:Ljava/lang/String;

    .line 73
    .line 74
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->PaymentMethodsBankCardUploadScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 75
    .line 76
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;->i:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 77
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;)Lcom/sumsub/sns/internal/features/data/model/common/Document;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    const/4 v1, 0x0

    const-string v2, "ARGS_DOCUMENT"

    invoke-static {p0, v2, v0, v1}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    move-result-object p0

    .line 3
    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    if-eqz p0, :cond_0

    return-object p0

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    const-string v0, "Document argument is required"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/o;Lcom/sumsub/sns/databinding/d;)Lkotlin/Unit;
    .locals 4

    .line 69
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->ContinueButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v1, v2, v2, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 70
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/o;->f:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/k;

    .line 71
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/k;->b:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/SNSBankCardUploadViewModel$SNSBankCardUploadViewState$DocUpload$ButtonState$Action;

    if-eqz p1, :cond_2

    .line 72
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 73
    iget-object p1, p2, Lcom/sumsub/sns/databinding/d;->h:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    .line 74
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/common/G;

    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/common/t;

    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/common/t;-><init>(I)V

    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/common/G;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    goto :goto_0

    .line 75
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 76
    :cond_1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;->g:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;

    .line 77
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/common/u;->a:Lcom/sumsub/sns/internal/features/presentation/common/u;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/common/G;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 78
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;)Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const-class v0, Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    const-string v2, "ARGS_PHOTOS_AMOUNT"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v2, v0, v1}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object p0

    .line 22
    .line 23
    :cond_1
    :goto_0
    sget-object p0, Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;->SOME:Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;

    .line 24
    return-object p0
    .line 25
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/w;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;->e:Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;->f:Lkotlin/Lazy;

    .line 13
    .line 14
    .line 15
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    .line 22
    move-result-object v4

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 26
    move-result-object v5

    .line 27
    move-object v3, p0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/w;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    .line 31
    return-object v0
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
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;->g:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;

    .line 7
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/j;

    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/j;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/o;)V
    .locals 13

    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/databinding/d;

    if-eqz v0, :cond_2

    .line 9
    iget-object v1, v0, Lcom/sumsub/sns/databinding/d;->k:Lcom/sumsub/sns/core/widget/SNSH1TextView;

    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 11
    iget-object v1, v0, Lcom/sumsub/sns/databinding/d;->j:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 12
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 13
    iget-object v1, v0, Lcom/sumsub/sns/databinding/d;->i:Landroid/widget/ScrollView;

    .line 14
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 15
    iget-object v1, v0, Lcom/sumsub/sns/databinding/d;->k:Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 16
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/o;->a:Ljava/lang/String;

    .line 17
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    iget-object v1, v0, Lcom/sumsub/sns/databinding/d;->j:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 19
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/o;->b:Ljava/lang/String;

    .line 20
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    iget-object v1, v0, Lcom/sumsub/sns/databinding/d;->c:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 22
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/o;->c:Ljava/lang/CharSequence;

    .line 23
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    iget-object v1, v0, Lcom/sumsub/sns/databinding/d;->d:Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 25
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/o;->d:Ljava/lang/CharSequence;

    .line 26
    invoke-static {v1, v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 27
    iget-object v1, v0, Lcom/sumsub/sns/databinding/d;->h:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 28
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/o;->f:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/k;

    .line 29
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/k;->a:Ljava/lang/CharSequence;

    .line 30
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    iget-object v1, v0, Lcom/sumsub/sns/databinding/d;->h:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 32
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/o;->f:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/k;

    .line 33
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/k;->b:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/SNSBankCardUploadViewModel$SNSBankCardUploadViewState$DocUpload$ButtonState$Action;

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v2

    .line 34
    :goto_0
    invoke-virtual {v1, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 35
    iget-object v1, v0, Lcom/sumsub/sns/databinding/d;->h:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/g;

    invoke-direct {v3, p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/g;-><init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/o;Lcom/sumsub/sns/databinding/d;)V

    invoke-static {v3, v1}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    .line 36
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/o;->e:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/m;

    .line 37
    iget-object v1, v0, Lcom/sumsub/sns/databinding/d;->g:Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 38
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/m;->b:Ljava/lang/CharSequence;

    .line 39
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/utils/n;

    .line 41
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/m;->a:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/l;

    .line 42
    iget-object v6, v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/l;->a:Ljava/lang/CharSequence;

    .line 43
    iget-object v7, v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/l;->b:Ljava/lang/CharSequence;

    .line 44
    iget-object v8, v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/l;->c:Ljava/lang/CharSequence;

    .line 45
    iget-object v9, v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/l;->d:Ljava/lang/CharSequence;

    move-object v5, v10

    .line 46
    iget-object v10, v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/l;->e:Ljava/lang/CharSequence;

    .line 47
    iget-object v11, v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/l;->f:Ljava/lang/CharSequence;

    .line 48
    iget-object v12, v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/l;->g:Ljava/lang/CharSequence;

    .line 49
    invoke-direct/range {v5 .. v12}, Lcom/sumsub/sns/internal/features/presentation/utils/n;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 50
    iget-object v6, v0, Lcom/sumsub/sns/databinding/d;->e:Lcom/sumsub/sns/core/widget/SNSFileItemView;

    .line 51
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/m;->c:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/n;

    move-object v10, v5

    .line 52
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/common/g;->c:Lcom/sumsub/sns/internal/features/presentation/utils/o;

    .line 53
    iget-object v7, v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/n;->a:Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 54
    iget-boolean v8, v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/n;->c:Z

    .line 55
    iget-boolean v9, v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/n;->b:Z

    .line 56
    invoke-virtual/range {v5 .. v10}, Lcom/sumsub/sns/internal/features/presentation/utils/o;->a(Lcom/sumsub/sns/core/widget/SNSFileItemView;Lcom/sumsub/sns/internal/features/domain/documents/w;ZZLcom/sumsub/sns/internal/features/presentation/utils/n;)V

    move-object v5, v10

    .line 57
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 58
    invoke-virtual {v6, v4}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setEnabled(Z)V

    .line 59
    iget-object v6, v0, Lcom/sumsub/sns/databinding/d;->f:Lcom/sumsub/sns/core/widget/SNSFileItemView;

    .line 60
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/m;->d:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/n;

    if-nez p1, :cond_1

    const/16 p1, 0x8

    .line 61
    invoke-virtual {v6, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    move-object v10, v5

    .line 62
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/common/g;->c:Lcom/sumsub/sns/internal/features/presentation/utils/o;

    .line 63
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/n;->a:Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 64
    iget-boolean v8, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/n;->c:Z

    .line 65
    iget-boolean v9, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/n;->b:Z

    .line 66
    invoke-virtual/range {v5 .. v10}, Lcom/sumsub/sns/internal/features/presentation/utils/o;->a(Lcom/sumsub/sns/core/widget/SNSFileItemView;Lcom/sumsub/sns/internal/features/domain/documents/w;ZZLcom/sumsub/sns/internal/features/presentation/utils/n;)V

    .line 67
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 68
    invoke-virtual {v6, v4}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setEnabled(Z)V

    :cond_2
    return-void
.end method

.method public final f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/sumsub/sns/databinding/d;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/databinding/d;->b:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;->h:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;->i:Lcom/sumsub/sns/internal/core/analytics/Screen;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/v;

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

.method public final handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    .locals 1

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/i;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/i;

    .line 13
    .line 14
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/i;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)V

    .line 24
    :cond_0
    return-void

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/common/g;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 28
    return-void
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
.end method

.method public final handleSuccessState(Lcom/sumsub/sns/core/presentation/base/V;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/p;

    .line 3
    .line 4
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/o;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/o;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/h;->a(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/upload/o;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 18
    throw p1
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

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/sumsub/sns/databinding/d;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/databinding/d;->b:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->isHidden()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    check-cast p1, Lcom/sumsub/sns/databinding/d;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p1, Lcom/sumsub/sns/databinding/d;->b:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->hide()V

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    return p1

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/F;->onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z

    .line 39
    move-result p1

    .line 40
    return p1
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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/common/g;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/g;->c:Lcom/sumsub/sns/internal/features/presentation/utils/o;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 9
    move-result-object p2

    .line 10
    .line 11
    check-cast p2, Lcom/sumsub/sns/databinding/d;

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    iget-object p2, p2, Lcom/sumsub/sns/databinding/d;->e:Lcom/sumsub/sns/core/widget/SNSFileItemView;

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p2, v0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    check-cast v1, Lcom/sumsub/sns/databinding/d;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v0, v1, Lcom/sumsub/sns/databinding/d;->f:Lcom/sumsub/sns/core/widget/SNSFileItemView;

    .line 29
    .line 30
    .line 31
    :cond_1
    filled-new-array {p2, v0}, [Lcom/sumsub/sns/core/widget/SNSFileItemView;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/o;->a([Lcom/sumsub/sns/core/widget/SNSFileItemView;)V

    .line 36
    return-void
    .line 37
.end method

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 13

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_bank_card_upload:I

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
    sget p2, Lcom/sumsub/sns/R$id;->sns_bank_card_bottom_sheet:I

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
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    sget p2, Lcom/sumsub/sns/R$id;->sns_body:I

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
    sget p2, Lcom/sumsub/sns/R$id;->sns_container:I

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    check-cast v0, Landroid/widget/LinearLayout;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    sget p2, Lcom/sumsub/sns/R$id;->sns_disclaimer:I

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 45
    move-result-object v0

    .line 46
    move-object v5, v0

    .line 47
    .line 48
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 49
    .line 50
    if-eqz v5, :cond_0

    .line 51
    .line 52
    sget p2, Lcom/sumsub/sns/R$id;->sns_file1:I

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 56
    move-result-object v0

    .line 57
    move-object v6, v0

    .line 58
    .line 59
    check-cast v6, Lcom/sumsub/sns/core/widget/SNSFileItemView;

    .line 60
    .line 61
    if-eqz v6, :cond_0

    .line 62
    .line 63
    sget p2, Lcom/sumsub/sns/R$id;->sns_file2:I

    .line 64
    .line 65
    .line 66
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 67
    move-result-object v0

    .line 68
    move-object v7, v0

    .line 69
    .line 70
    check-cast v7, Lcom/sumsub/sns/core/widget/SNSFileItemView;

    .line 71
    .line 72
    if-eqz v7, :cond_0

    .line 73
    .line 74
    sget p2, Lcom/sumsub/sns/R$id;->sns_file_formats_text_view:I

    .line 75
    .line 76
    .line 77
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 78
    move-result-object v0

    .line 79
    move-object v8, v0

    .line 80
    .line 81
    check-cast v8, Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 82
    .line 83
    if-eqz v8, :cond_0

    .line 84
    .line 85
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_end:I

    .line 86
    .line 87
    .line 88
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 92
    .line 93
    if-eqz v0, :cond_0

    .line 94
    .line 95
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_start:I

    .line 96
    .line 97
    .line 98
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 102
    .line 103
    if-eqz v0, :cond_0

    .line 104
    .line 105
    sget p2, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 106
    .line 107
    .line 108
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 109
    move-result-object v0

    .line 110
    move-object v9, v0

    .line 111
    .line 112
    check-cast v9, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 113
    .line 114
    if-eqz v9, :cond_0

    .line 115
    .line 116
    sget p2, Lcom/sumsub/sns/R$id;->sns_scroller:I

    .line 117
    .line 118
    .line 119
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 120
    move-result-object v0

    .line 121
    move-object v10, v0

    .line 122
    .line 123
    check-cast v10, Landroid/widget/ScrollView;

    .line 124
    .line 125
    if-eqz v10, :cond_0

    .line 126
    .line 127
    sget p2, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 128
    .line 129
    .line 130
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 131
    move-result-object v0

    .line 132
    move-object v11, v0

    .line 133
    .line 134
    check-cast v11, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 135
    .line 136
    if-eqz v11, :cond_0

    .line 137
    .line 138
    sget p2, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 139
    .line 140
    .line 141
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 142
    move-result-object v0

    .line 143
    move-object v12, v0

    .line 144
    .line 145
    check-cast v12, Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 146
    .line 147
    if-eqz v12, :cond_0

    .line 148
    .line 149
    sget p2, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 150
    .line 151
    .line 152
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 153
    move-result-object v0

    .line 154
    .line 155
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 156
    .line 157
    if-eqz v0, :cond_0

    .line 158
    .line 159
    new-instance v1, Lcom/sumsub/sns/databinding/d;

    .line 160
    move-object v2, p1

    .line 161
    .line 162
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSBackgroundView;

    .line 163
    .line 164
    .line 165
    invoke-direct/range {v1 .. v12}, Lcom/sumsub/sns/databinding/d;-><init>(Lcom/sumsub/sns/core/widget/SNSBackgroundView;Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSCaptionTextView;Lcom/sumsub/sns/core/widget/SNSFileItemView;Lcom/sumsub/sns/core/widget/SNSFileItemView;Lcom/sumsub/sns/core/widget/SNSCaptionTextView;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;Landroid/widget/ScrollView;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSH1TextView;)V

    .line 166
    return-object v1

    .line 167
    .line 168
    .line 169
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 170
    move-result-object p1

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 174
    move-result-object p1

    .line 175
    .line 176
    new-instance p2, Ljava/lang/NullPointerException;

    .line 177
    .line 178
    const-string v0, "Missing required view with ID: "

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    move-result-object p1

    .line 183
    .line 184
    .line 185
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 186
    throw p2
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
