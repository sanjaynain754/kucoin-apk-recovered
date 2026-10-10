.class public final Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;
.super Lcom/sumsub/sns/internal/features/presentation/preview/photo/m;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/m<",
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/i;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/m;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/i;",
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
        "SMAP\nSNSProofOfAddressFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSProofOfAddressFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/poa/SNSProofOfAddressFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,47:1\n106#2,15:48\n27#3,4:63\n*S KotlinDebug\n*F\n+ 1 SNSProofOfAddressFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/poa/SNSProofOfAddressFragment\n*L\n24#1:48,15\n15#1:63,4\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic U:I


# instance fields
.field public final u:Lkotlin/Lazy;

.field public final v:Lcom/sumsub/sns/internal/core/analytics/Screen;

.field public final w:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/m;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 6
    .line 7
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/e;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/e;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;->u:Lkotlin/Lazy;

    .line 17
    .line 18
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Screen;->ProofOfAddressFormScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 19
    .line 20
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;->v:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 21
    .line 22
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/k;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;)V

    .line 26
    .line 27
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/a;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/a;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;)V

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/b;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/a;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/i;

    .line 42
    .line 43
    .line 44
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/c;

    .line 48
    .line 49
    .line 50
    invoke-direct {v3, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/c;-><init>(Lkotlin/Lazy;)V

    .line 51
    .line 52
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/d;

    .line 53
    .line 54
    .line 55
    invoke-direct {v4, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/d;-><init>(Lkotlin/Lazy;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v2, v3, v4, v1}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;->w:Lkotlin/Lazy;

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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;)Lcom/sumsub/sns/internal/features/data/model/common/Document;
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
    const-string v1, "ARGS_DOCUMENT"

    .line 10
    .line 11
    const-class v2, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v1, v2, v0}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/Document;

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

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/j;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;->u:Lkotlin/Lazy;

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
    .line 13
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1, p0, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/j;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    .line 22
    return-object v0
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;->u:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;->v:Lcom/sumsub/sns/internal/core/analytics/Screen;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;->w:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/i;

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

.method public final l()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move-object v0, p0

    .line 7
    .line 8
    .line 9
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/l;->finish$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;ILjava/lang/Object;)V

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
