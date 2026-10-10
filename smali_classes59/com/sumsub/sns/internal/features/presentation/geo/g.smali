.class public final Lcom/sumsub/sns/internal/features/presentation/geo/g;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/form/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "Lcom/sumsub/sns/databinding/h;",
        "Lcom/sumsub/sns/internal/features/presentation/geo/H0;",
        "Lcom/sumsub/sns/internal/features/presentation/geo/v0;",
        ">;",
        "Lcom/sumsub/sns/internal/core/presentation/form/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/geo/g;",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "Lcom/sumsub/sns/databinding/h;",
        "Lcom/sumsub/sns/internal/features/presentation/geo/H0;",
        "Lcom/sumsub/sns/internal/features/presentation/geo/v0;",
        "Lcom/sumsub/sns/internal/core/presentation/form/d;",
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
        "SMAP\nSNSGeoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSGeoFragment.kt\ncom/sumsub/sns/internal/features/presentation/geo/SNSGeoFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n106#2,15:182\n256#3,2:197\n256#3,2:211\n256#3,2:213\n256#3,2:215\n50#4,12:199\n1#5:217\n*S KotlinDebug\n*F\n+ 1 SNSGeoFragment.kt\ncom/sumsub/sns/internal/features/presentation/geo/SNSGeoFragment\n*L\n40#1:182,15\n109#1:197,2\n128#1:211,2\n134#1:213,2\n146#1:215,2\n112#1:199,12\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic U:I


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/F;-><init>()V

    .line 4
    .line 5
    const-string v0, "SumSubGeo"

    .line 6
    .line 7
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/g;->a:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/a1;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/geo/a1;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/g;)V

    .line 13
    .line 14
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/geo/b;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/geo/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/g;)V

    .line 18
    .line 19
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 20
    .line 21
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/geo/c;

    .line 22
    .line 23
    .line 24
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/geo/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/b;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 31
    .line 32
    .line 33
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/geo/d;

    .line 37
    .line 38
    .line 39
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/geo/d;-><init>(Lkotlin/Lazy;)V

    .line 40
    .line 41
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/geo/e;

    .line 42
    .line 43
    .line 44
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/geo/e;-><init>(Lkotlin/Lazy;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/g;->b:Lkotlin/Lazy;

    .line 51
    .line 52
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/location/v;

    .line 53
    .line 54
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/geo/b1;

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/geo/b1;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/g;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/location/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/g;Lkotlin/jvm/functions/Function0;)V

    .line 61
    .line 62
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/x;

    .line 63
    .line 64
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/geo/c1;

    .line 65
    .line 66
    .line 67
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/geo/c1;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/g;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/x;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/g;Lkotlin/jvm/functions/Function0;)V

    .line 71
    .line 72
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/location/r;

    .line 73
    .line 74
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/geo/d1;

    .line 75
    .line 76
    .line 77
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/geo/d1;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/g;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/location/r;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/g;Lkotlin/jvm/functions/Function0;)V

    .line 81
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/geo/g;)Lcom/sumsub/sns/internal/core/presentation/android/location/l;
    .locals 0

    .line 7
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/g;->b:Lkotlin/Lazy;

    .line 8
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 9
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->j:Lcom/sumsub/sns/internal/core/presentation/android/location/l;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/geo/x0;Lcom/sumsub/sns/internal/features/presentation/geo/g;)Lkotlin/Unit;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/x0;->b:Lcom/sumsub/sns/internal/features/presentation/geo/G0;

    if-eqz p0, :cond_0

    .line 2
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/geo/g;->b:Lkotlin/Lazy;

    .line 3
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 4
    invoke-virtual {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 5
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/geo/g;)Lcom/sumsub/sns/internal/core/presentation/android/t;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/g;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->i:Lcom/sumsub/sns/internal/core/presentation/android/t;

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

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/geo/g;)Lcom/sumsub/sns/internal/core/presentation/android/location/s;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/g;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->h:Lcom/sumsub/sns/internal/core/presentation/android/location/s;

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

.method public static final d(Lcom/sumsub/sns/internal/features/presentation/geo/g;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/w0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 14
    move-result-object v3

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0, v1, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/geo/w0;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/g;Lcom/sumsub/sns/internal/core/domain/h;Lcom/sumsub/sns/internal/core/common/u0;Landroid/os/Bundle;)V

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final a()Lcom/sumsub/sns/internal/core/presentation/form/k;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/g;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    return-object v0
.end method

.method public final a(Lcom/google/android/material/button/MaterialButton;Lcom/sumsub/sns/internal/features/presentation/geo/x0;)V
    .locals 1

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    .line 73
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    if-eqz p2, :cond_1

    .line 74
    iget-object v0, p2, Lcom/sumsub/sns/internal/features/presentation/geo/x0;->a:Ljava/lang/String;

    .line 75
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    iget-boolean v0, p2, Lcom/sumsub/sns/internal/features/presentation/geo/x0;->c:Z

    .line 77
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 78
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/e1;

    invoke-direct {v0, p2, p0}, Lcom/sumsub/sns/internal/features/presentation/geo/e1;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/x0;Lcom/sumsub/sns/internal/features/presentation/geo/g;)V

    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/geo/H0;)V
    .locals 10

    const/4 v0, 0x1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleSuccessState: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/geo/a;->a(Ljava/lang/String;)V

    .line 11
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/geo/A0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_6

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/geo/A0;

    .line 12
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/databinding/h;

    if-nez v1, :cond_0

    goto/16 :goto_4

    .line 13
    :cond_0
    iget-object v1, v1, Lcom/sumsub/sns/databinding/h;->b:Landroid/widget/FrameLayout;

    new-array v0, v0, [Landroid/view/View;

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->a([Landroid/view/View;)V

    .line 14
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/geo/A0;->a:Lcom/sumsub/sns/internal/features/presentation/geo/B0;

    .line 15
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/databinding/h;

    if-nez v1, :cond_1

    goto :goto_1

    .line 16
    :cond_1
    iget-object v4, v1, Lcom/sumsub/sns/databinding/h;->c:Lcom/sumsub/sns/core/widget/SNSImageView;

    .line 17
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 18
    iget-object v4, v1, Lcom/sumsub/sns/databinding/h;->c:Lcom/sumsub/sns/core/widget/SNSImageView;

    .line 19
    sget-object v5, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v5

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    .line 20
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/geo/B0;->a:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 21
    invoke-virtual {v7}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 22
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 23
    iget-object v4, v1, Lcom/sumsub/sns/databinding/h;->i:Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 24
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/geo/B0;->b:Ljava/lang/CharSequence;

    .line 25
    invoke-static {v4, v5}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 26
    iget-object v4, v1, Lcom/sumsub/sns/databinding/h;->f:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 27
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/geo/B0;->c:Ljava/lang/CharSequence;

    .line 28
    invoke-static {v4, v5}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 29
    iget-object v4, v1, Lcom/sumsub/sns/databinding/h;->h:Lcom/sumsub/sns/core/widget/SNSDividerWithTextView;

    .line 30
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/geo/B0;->d:Ljava/lang/CharSequence;

    if-eqz v5, :cond_2

    goto :goto_0

    :cond_2
    const/16 v2, 0x8

    .line 31
    :goto_0
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 32
    iget-object v2, v1, Lcom/sumsub/sns/databinding/h;->h:Lcom/sumsub/sns/core/widget/SNSDividerWithTextView;

    .line 33
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/geo/B0;->d:Ljava/lang/CharSequence;

    .line 34
    invoke-virtual {v2, v4}, Lcom/sumsub/sns/core/widget/SNSDividerWithTextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    iget-object v1, v1, Lcom/sumsub/sns/databinding/h;->g:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 36
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/geo/B0;->e:Ljava/lang/CharSequence;

    .line 37
    invoke-static {v1, v0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 38
    :goto_1
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/geo/A0;->b:Lcom/sumsub/sns/internal/features/presentation/geo/y0;

    .line 39
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/databinding/h;

    if-nez v0, :cond_3

    goto/16 :goto_4

    .line 40
    :cond_3
    iget-object v1, v0, Lcom/sumsub/sns/databinding/h;->d:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    if-eqz p1, :cond_4

    .line 41
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/geo/y0;->a:Lcom/sumsub/sns/internal/features/presentation/geo/x0;

    goto :goto_2

    :cond_4
    move-object v2, v3

    .line 42
    :goto_2
    invoke-virtual {p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/geo/g;->a(Lcom/google/android/material/button/MaterialButton;Lcom/sumsub/sns/internal/features/presentation/geo/x0;)V

    .line 43
    iget-object v0, v0, Lcom/sumsub/sns/databinding/h;->e:Lcom/sumsub/sns/core/widget/SNSSecondaryButton;

    if-eqz p1, :cond_5

    .line 44
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/geo/y0;->b:Lcom/sumsub/sns/internal/features/presentation/geo/x0;

    .line 45
    :cond_5
    invoke-virtual {p0, v0, v3}, Lcom/sumsub/sns/internal/features/presentation/geo/g;->a(Lcom/google/android/material/button/MaterialButton;Lcom/sumsub/sns/internal/features/presentation/geo/x0;)V

    return-void

    .line 46
    :cond_6
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/geo/z0;

    if-eqz v1, :cond_d

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/geo/z0;

    .line 47
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/databinding/h;

    if-nez v1, :cond_7

    goto :goto_4

    .line 48
    :cond_7
    iget-object v4, v1, Lcom/sumsub/sns/databinding/h;->c:Lcom/sumsub/sns/core/widget/SNSImageView;

    .line 49
    iget-object v5, v1, Lcom/sumsub/sns/databinding/h;->i:Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 50
    iget-object v6, v1, Lcom/sumsub/sns/databinding/h;->f:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 51
    iget-object v7, v1, Lcom/sumsub/sns/databinding/h;->h:Lcom/sumsub/sns/core/widget/SNSDividerWithTextView;

    .line 52
    iget-object v8, v1, Lcom/sumsub/sns/databinding/h;->g:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    const/4 v9, 0x5

    new-array v9, v9, [Landroid/view/View;

    aput-object v4, v9, v2

    aput-object v5, v9, v0

    const/4 v0, 0x2

    aput-object v6, v9, v0

    const/4 v0, 0x3

    aput-object v7, v9, v0

    const/4 v0, 0x4

    aput-object v8, v9, v0

    .line 53
    invoke-static {v9}, Lcom/sumsub/sns/internal/core/common/h;->a([Landroid/view/View;)V

    .line 54
    iget-object v0, v1, Lcom/sumsub/sns/databinding/h;->b:Landroid/widget/FrameLayout;

    .line 55
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 56
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    sget v1, Lcom/sumsub/sns/R$id;->sns_form_placeholder:I

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    instance-of v2, v0, Lcom/sumsub/sns/core/presentation/form/f;

    if-eqz v2, :cond_8

    check-cast v0, Lcom/sumsub/sns/core/presentation/form/f;

    goto :goto_3

    :cond_8
    move-object v0, v3

    :goto_3
    if-nez v0, :cond_9

    .line 57
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    .line 58
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    .line 59
    sget-object v2, Lcom/sumsub/sns/core/presentation/form/f;->o:Lcom/sumsub/sns/core/presentation/form/b;

    .line 60
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/geo/g;->getIdDocSetType()Ljava/lang/String;

    move-result-object v4

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "SumSubGeo"

    invoke-static {v2, v4}, Lcom/sumsub/sns/core/presentation/form/b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/form/f;

    move-result-object v2

    .line 62
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 63
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitNow()V

    .line 64
    :cond_9
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/geo/z0;->d:Lcom/sumsub/sns/internal/features/presentation/geo/y0;

    .line 65
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/databinding/h;

    if-nez v0, :cond_a

    :goto_4
    return-void

    .line 66
    :cond_a
    iget-object v1, v0, Lcom/sumsub/sns/databinding/h;->d:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    if-eqz p1, :cond_b

    .line 67
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/geo/y0;->a:Lcom/sumsub/sns/internal/features/presentation/geo/x0;

    goto :goto_5

    :cond_b
    move-object v2, v3

    .line 68
    :goto_5
    invoke-virtual {p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/geo/g;->a(Lcom/google/android/material/button/MaterialButton;Lcom/sumsub/sns/internal/features/presentation/geo/x0;)V

    .line 69
    iget-object v0, v0, Lcom/sumsub/sns/databinding/h;->e:Lcom/sumsub/sns/core/widget/SNSSecondaryButton;

    if-eqz p1, :cond_c

    .line 70
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/geo/y0;->b:Lcom/sumsub/sns/internal/features/presentation/geo/x0;

    .line 71
    :cond_c
    invoke-virtual {p0, v0, v3}, Lcom/sumsub/sns/internal/features/presentation/geo/g;->a(Lcom/google/android/material/button/MaterialButton;Lcom/sumsub/sns/internal/features/presentation/geo/x0;)V

    return-void

    .line 72
    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/g;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->g:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 17
    return-object v0
.end method

.method public final getLogTag()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/g;->a:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/g;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;

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
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 4
    .line 5
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/presentation/geo/D;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/g;->b:Lkotlin/Lazy;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->g:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 23
    .line 24
    const-string v1, "geo_fallback_document"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 28
    .line 29
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 30
    .line 31
    const-string v0, "geo_request_fallback"

    .line 32
    .line 33
    .line 34
    invoke-static {p0, v0, p1}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 35
    :cond_0
    return-void
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

.method public final bridge synthetic handleSuccessState(Lcom/sumsub/sns/core/presentation/base/V;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/geo/H0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/geo/g;->a(Lcom/sumsub/sns/internal/features/presentation/geo/H0;)V

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
    .locals 11

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_geo:I

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
    sget p2, Lcom/sumsub/sns/R$id;->sns_form_placeholder:I

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
    check-cast v3, Landroid/widget/FrameLayout;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    sget p2, Lcom/sumsub/sns/R$id;->sns_fragment_content:I

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    sget p2, Lcom/sumsub/sns/R$id;->sns_icon:I

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 34
    move-result-object v0

    .line 35
    move-object v4, v0

    .line 36
    .line 37
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSImageView;

    .line 38
    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    sget p2, Lcom/sumsub/sns/R$id;->sns_primary_button:I

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
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 49
    .line 50
    if-eqz v5, :cond_0

    .line 51
    .line 52
    sget p2, Lcom/sumsub/sns/R$id;->sns_secondary_button:I

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
    check-cast v6, Lcom/sumsub/sns/core/widget/SNSSecondaryButton;

    .line 60
    .line 61
    if-eqz v6, :cond_0

    .line 62
    .line 63
    sget p2, Lcom/sumsub/sns/R$id;->sns_subtitle:I

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
    check-cast v7, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 71
    .line 72
    if-eqz v7, :cond_0

    .line 73
    .line 74
    sget p2, Lcom/sumsub/sns/R$id;->sns_subtitle2:I

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
    check-cast v8, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 82
    .line 83
    if-eqz v8, :cond_0

    .line 84
    .line 85
    sget p2, Lcom/sumsub/sns/R$id;->sns_subtitle_divider:I

    .line 86
    .line 87
    .line 88
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 89
    move-result-object v0

    .line 90
    move-object v9, v0

    .line 91
    .line 92
    check-cast v9, Lcom/sumsub/sns/core/widget/SNSDividerWithTextView;

    .line 93
    .line 94
    if-eqz v9, :cond_0

    .line 95
    .line 96
    sget p2, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 97
    .line 98
    .line 99
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 100
    move-result-object v0

    .line 101
    move-object v10, v0

    .line 102
    .line 103
    check-cast v10, Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 104
    .line 105
    if-eqz v10, :cond_0

    .line 106
    .line 107
    sget p2, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 108
    .line 109
    .line 110
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 114
    .line 115
    if-eqz v0, :cond_0

    .line 116
    .line 117
    new-instance v1, Lcom/sumsub/sns/databinding/h;

    .line 118
    move-object v2, p1

    .line 119
    .line 120
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSBackgroundView;

    .line 121
    .line 122
    .line 123
    invoke-direct/range {v1 .. v10}, Lcom/sumsub/sns/databinding/h;-><init>(Lcom/sumsub/sns/core/widget/SNSBackgroundView;Landroid/widget/FrameLayout;Lcom/sumsub/sns/core/widget/SNSImageView;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;Lcom/sumsub/sns/core/widget/SNSSecondaryButton;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSDividerWithTextView;Lcom/sumsub/sns/core/widget/SNSH1TextView;)V

    .line 124
    return-object v1

    .line 125
    .line 126
    .line 127
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    new-instance p2, Ljava/lang/NullPointerException;

    .line 135
    .line 136
    const-string v0, "Missing required view with ID: "

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    move-result-object p1

    .line 141
    .line 142
    .line 143
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 144
    throw p2
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

.method public final trackOpen()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
