.class public final Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "Lcom/sumsub/sns/databinding/j;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/S;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "Lcom/sumsub/sns/databinding/j;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/S;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;",
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
        "SMAP\nSNSMRTDReadFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSMRTDReadFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/SNSMRTDReadFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,94:1\n106#2,15:95\n27#3,4:110\n*S KotlinDebug\n*F\n+ 1 SNSMRTDReadFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/SNSMRTDReadFragment\n*L\n37#1:95,15\n26#1:110,4\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/h0;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/h0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;->a:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/i0;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/i0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)V

    .line 20
    .line 21
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/A;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/A;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)V

    .line 25
    .line 26
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 27
    .line 28
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/B;

    .line 29
    .line 30
    .line 31
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/B;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/A;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/C;

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/C;-><init>(Lkotlin/Lazy;)V

    .line 47
    .line 48
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/D;

    .line 49
    .line 50
    .line 51
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/D;-><init>(Lkotlin/Lazy;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;->b:Lkotlin/Lazy;

    .line 58
    .line 59
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/nfc/m;

    .line 60
    .line 61
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j0;

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)V

    .line 65
    .line 66
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k0;

    .line 67
    .line 68
    .line 69
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/core/presentation/nfc/m;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 73
    .line 74
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;

    .line 75
    .line 76
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/l0;

    .line 77
    .line 78
    .line 79
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/l0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;Lkotlin/jvm/functions/Function0;)V

    .line 83
    .line 84
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;

    .line 85
    .line 86
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/m0;

    .line 87
    .line 88
    .line 89
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/m0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)V

    .line 90
    .line 91
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/n0;

    .line 92
    .line 93
    .line 94
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/n0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 98
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->i:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;

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

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)Lcom/sumsub/sns/internal/features/data/model/common/A2;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const-string v1, "ARGS_MRTD_DOCUMENT"

    .line 10
    .line 11
    const-class v2, Lcom/sumsub/sns/internal/features/data/model/common/A2;

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v1, v2, v0}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/A2;

    .line 18
    return-object p0

    .line 19
    :cond_0
    return-object v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/d0;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->j:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/d0;

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

.method public static final d(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/t;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/t;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;->a:Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/A2;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->h()Lcom/sumsub/sns/internal/features/data/model/common/MRTDInstructionType;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    const/4 v1, -0x1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/z;->a:[I

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 24
    move-result v1

    .line 25
    .line 26
    aget v1, v2, v1

    .line 27
    :goto_0
    const/4 v2, 0x1

    .line 28
    .line 29
    if-eq v1, v2, :cond_2

    .line 30
    const/4 v2, 0x2

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    sget v1, Lcom/sumsub/sns/nfc/R$raw;->sns_animation_nfc_passport_2:I

    .line 35
    goto :goto_1

    .line 36
    .line 37
    :cond_1
    sget v1, Lcom/sumsub/sns/nfc/R$raw;->sns_animation_nfc_passport_1:I

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :cond_2
    sget v1, Lcom/sumsub/sns/R$raw;->sns_animation_nfc_id_card:I

    .line 41
    .line 42
    :goto_1
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;->a:Lkotlin/Lazy;

    .line 43
    .line 44
    .line 45
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/A2;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->f()Ljava/lang/String;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;->a:Lkotlin/Lazy;

    .line 55
    .line 56
    .line 57
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 58
    move-result-object p0

    .line 59
    .line 60
    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/A2;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->c()Ljava/lang/String;

    .line 64
    move-result-object p0

    .line 65
    .line 66
    .line 67
    invoke-direct {v0, v1, v2, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/t;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 68
    return-object v0
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

.method public static final e(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)Lcom/sumsub/sns/internal/core/presentation/nfc/l;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->h:Lcom/sumsub/sns/internal/core/presentation/nfc/l;

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

.method public static final f(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;

    .line 9
    .line 10
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/K;->a:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/K;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object p0
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

.method public static final g(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/g0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/g0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    .line 14
    return-object v0
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
.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/A2;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->d()Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 19
    return-object v0
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
.end method

.method public final getLogTag()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "SNSMRTDReadFragment"

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

.method public final getOpenPayload()Ljava/util/Map;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/A2;

    .line 9
    .line 10
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/C2;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const-string v0, "basic"

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    instance-of v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/E2;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const-string v0, "kinegram"

    .line 22
    .line 23
    .line 24
    :goto_0
    const-string/jumbo v1, "reader"

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    .line 35
    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 39
    throw v0
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
.end method

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;

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

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_mrtd_read:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 7
    move-result-object p1

    .line 8
    move-object p2, p1

    .line 9
    .line 10
    check-cast p2, Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;

    .line 11
    .line 12
    sget v0, Lcom/sumsub/sns/R$id;->sns_custom_view_container:I

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Landroid/widget/FrameLayout;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    sget v0, Lcom/sumsub/sns/R$id;->sns_guideline_end:I

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Landroidx/constraintlayout/widget/Guideline;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    sget v0, Lcom/sumsub/sns/R$id;->sns_guideline_start:I

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    check-cast v1, Landroidx/constraintlayout/widget/Guideline;

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    sget v0, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    check-cast v1, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 49
    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    sget v0, Lcom/sumsub/sns/R$id;->sns_secondary_button:I

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    check-cast v1, Lcom/sumsub/sns/core/widget/SNSSecondaryButton;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    sget v0, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    check-cast v1, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 69
    .line 70
    if-eqz v1, :cond_0

    .line 71
    .line 72
    new-instance p1, Lcom/sumsub/sns/databinding/j;

    .line 73
    .line 74
    .line 75
    invoke-direct {p1, p2}, Lcom/sumsub/sns/databinding/j;-><init>(Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;)V

    .line 76
    return-object p1

    .line 77
    .line 78
    .line 79
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    new-instance p2, Ljava/lang/NullPointerException;

    .line 87
    .line 88
    const-string v0, "Missing required view with ID: "

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    move-result-object p1

    .line 93
    .line 94
    .line 95
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 96
    throw p2
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
