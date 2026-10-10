.class public final Lcom/sumsub/sns/internal/features/presentation/otp/j;
.super Lcom/sumsub/sns/core/presentation/base/I;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/I<",
        "Lcom/sumsub/sns/internal/features/presentation/otp/k;",
        "Lcom/sumsub/sns/internal/features/presentation/otp/q;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/otp/j;",
        "Lcom/sumsub/sns/core/presentation/base/I;",
        "Lcom/sumsub/sns/internal/features/presentation/otp/k;",
        "Lcom/sumsub/sns/internal/features/presentation/otp/q;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/otp/c",
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
        "SMAP\nSNSOtpInputFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSOtpInputFragment.kt\ncom/sumsub/sns/internal/features/presentation/otp/SNSOtpInputFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,149:1\n106#2,15:150\n27#3,4:165\n1#4:169\n256#5,2:170\n*S KotlinDebug\n*F\n+ 1 SNSOtpInputFragment.kt\ncom/sumsub/sns/internal/features/presentation/otp/SNSOtpInputFragment\n*L\n33#1:150,15\n42#1:165,4\n93#1:170,2\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lcom/sumsub/sns/internal/features/presentation/otp/c;

.field public static final synthetic h:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lcom/sumsub/sns/internal/core/common/L;

.field public final c:Lcom/sumsub/sns/internal/core/common/L;

.field public final d:Lcom/sumsub/sns/internal/core/common/L;

.field public final e:Lcom/sumsub/sns/internal/core/common/L;

.field public final f:Lcom/sumsub/sns/internal/core/common/L;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/otp/j;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "tvTitle"

    .line 6
    .line 7
    const-string v2, "getTvTitle()Landroid/widget/TextView;"

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    const-string/jumbo v2, "tvSubtitle"

    .line 16
    .line 17
    const-string v4, "getTvSubtitle()Landroid/widget/TextView;"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    const-string/jumbo v4, "pinCode"

    .line 25
    .line 26
    const-string v5, "getPinCode()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 30
    move-result-object v4

    .line 31
    .line 32
    .line 33
    const-string/jumbo v5, "tvResendCode"

    .line 34
    .line 35
    const-string v6, "getTvResendCode()Landroid/widget/TextView;"

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 39
    move-result-object v5

    .line 40
    .line 41
    .line 42
    const-string/jumbo v6, "tvPidError"

    .line 43
    .line 44
    const-string v7, "getTvPidError()Landroid/widget/TextView;"

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v6, v7, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 48
    move-result-object v0

    .line 49
    const/4 v6, 0x5

    .line 50
    .line 51
    new-array v6, v6, [Lkotlin/reflect/KProperty;

    .line 52
    .line 53
    aput-object v1, v6, v3

    .line 54
    const/4 v1, 0x1

    .line 55
    .line 56
    aput-object v2, v6, v1

    .line 57
    const/4 v1, 0x2

    .line 58
    .line 59
    aput-object v4, v6, v1

    .line 60
    const/4 v1, 0x3

    .line 61
    .line 62
    aput-object v5, v6, v1

    .line 63
    const/4 v1, 0x4

    .line 64
    .line 65
    aput-object v0, v6, v1

    .line 66
    .line 67
    sput-object v6, Lcom/sumsub/sns/internal/features/presentation/otp/j;->h:[Lkotlin/reflect/KProperty;

    .line 68
    .line 69
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/otp/c;

    .line 70
    .line 71
    .line 72
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/otp/c;-><init>()V

    .line 73
    .line 74
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->g:Lcom/sumsub/sns/internal/features/presentation/otp/c;

    .line 75
    return-void
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

.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/I;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/otp/i;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/otp/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/otp/j;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/otp/e;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/otp/e;-><init>(Lcom/sumsub/sns/internal/features/presentation/otp/j;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/otp/f;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/otp/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/otp/e;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/otp/q;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/otp/g;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/otp/g;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/otp/h;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/otp/h;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    sget v0, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 49
    .line 50
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 54
    .line 55
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->b:Lcom/sumsub/sns/internal/core/common/L;

    .line 56
    .line 57
    sget v0, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 58
    .line 59
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 63
    .line 64
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 65
    .line 66
    sget v0, Lcom/sumsub/sns/R$id;->sns_pin_code:I

    .line 67
    .line 68
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 69
    .line 70
    .line 71
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 72
    .line 73
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 74
    .line 75
    sget v0, Lcom/sumsub/sns/R$id;->sns_resend_verification_code:I

    .line 76
    .line 77
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 78
    .line 79
    .line 80
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 81
    .line 82
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 83
    .line 84
    sget v0, Lcom/sumsub/sns/R$id;->sns_pin_error:I

    .line 85
    .line 86
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 87
    .line 88
    .line 89
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 90
    .line 91
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->f:Lcom/sumsub/sns/internal/core/common/L;

    .line 92
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/otp/j;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/otp/a;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v2

    .line 4
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/otp/a;-><init>(Lcom/sumsub/sns/internal/features/presentation/otp/j;Landroid/os/Bundle;Lcom/sumsub/sns/internal/core/domain/h;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/otp/j;Landroid/view/View;)V
    .locals 6

    .line 38
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 39
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Screen;->ConfirmationCodeScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 40
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/otp/j;->getIdDocSetType()Ljava/lang/String;

    move-result-object v2

    .line 41
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->RetryButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 42
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 43
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/otp/q;

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/otp/q;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string/jumbo v2, "onResentCodeClick"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    const/16 v1, 0xb

    .line 46
    invoke-static {p0, v1, p1, v0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->finishWithResult$default(Lcom/sumsub/sns/core/presentation/base/C;ILandroid/os/Bundle;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/otp/k;)V
    .locals 7

    .line 5
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/otp/j;->getLogTag()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleState: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->b:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/otp/j;->h:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v3, v1, v2

    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 7
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/otp/k;->a:Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    invoke-static {v0, v4}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->c:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v4, 0x1

    aget-object v5, v1, v4

    invoke-virtual {v0, p0, v5}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_3

    .line 10
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/otp/k;->b:Ljava/lang/String;

    if-eqz v5, :cond_2

    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v5

    goto :goto_1

    :cond_2
    move-object v5, v3

    :goto_1
    invoke-static {v0, v5}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 12
    :cond_3
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/otp/k;->d:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 13
    sget-object v5, Lcom/sumsub/sns/internal/util/i;->a:Lkotlin/Lazy;

    invoke-interface {v5}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 14
    const-string v5, "Resend code in"

    const/4 v6, 0x2

    invoke-static {v0, v5, v2, v6, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 15
    const-string v3, "Resend code in TEST_PLACEHOLDER"

    goto :goto_2

    :cond_4
    move-object v3, v0

    .line 16
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->e:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v5, 0x3

    aget-object v6, v1, v5

    invoke-virtual {v0, p0, v6}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_6

    .line 17
    invoke-static {v0, v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 18
    :cond_6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->e:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v3, v1, v5

    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_7

    .line 19
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/features/presentation/otp/k;->e:Z

    .line 20
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 21
    :cond_7
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->e:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v3, v1, v5

    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_8

    .line 22
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/otp/r;

    invoke-direct {v3, p0}, Lcom/sumsub/sns/internal/features/presentation/otp/r;-><init>(Lcom/sumsub/sns/internal/features/presentation/otp/j;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    :cond_8
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/otp/j;->f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_9

    move v0, v4

    goto :goto_3

    :cond_9
    move v0, v2

    .line 24
    :goto_3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/otp/j;->f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v3

    if-eqz v3, :cond_a

    .line 25
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_a
    if-nez v0, :cond_e

    .line 26
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/otp/j;->f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->f(Landroid/view/View;)V

    .line 27
    :cond_b
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/otp/j;->f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 28
    iget v3, p1, Lcom/sumsub/sns/internal/features/presentation/otp/k;->c:I

    .line 29
    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setItemCount(I)V

    .line 30
    :cond_c
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/otp/j;->f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/otp/d;

    invoke-direct {v3, p0}, Lcom/sumsub/sns/internal/features/presentation/otp/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/otp/j;)V

    invoke-virtual {v0, v3}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setOnTextCompleteListener(Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;)V

    .line 31
    :cond_d
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/otp/j;->f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 32
    :cond_e
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->f:Lcom/sumsub/sns/internal/core/common/L;

    const/4 v3, 0x4

    aget-object v1, v1, v3

    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_f

    .line 33
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/otp/k;->f:Ljava/lang/String;

    .line 34
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    :cond_f
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/otp/j;->f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 36
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/otp/k;->f:Ljava/lang/String;

    if-eqz p1, :cond_10

    move v2, v4

    .line 37
    :cond_10
    invoke-virtual {v0, v2}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setError(Z)V

    :cond_11
    return-void
.end method

.method public final f()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/otp/j;->h:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x2

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    const-class v1, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    const-string v3, "arg_doc"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v3, v1, v2}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v0

    .line 32
    .line 33
    :cond_1
    :goto_0
    const-string v0, "TYPE_UNKNOWN"

    .line 34
    return-object v0
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

.method public final getLayoutId()Ljava/lang/Integer;
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_otp_input:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final getLogTag()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v1, "arg_client_tag"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    .line 16
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    const-string v2, "SNSOtpInputFragment."

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    return-object v0
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

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    const-string v1, "arg_screen_name"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Screen;->Companion:Lcom/sumsub/sns/internal/core/analytics/r;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lcom/sumsub/sns/internal/core/analytics/Screen;->values()[Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 23
    move-result-object v1

    .line 24
    array-length v2, v1

    .line 25
    const/4 v3, 0x0

    .line 26
    .line 27
    :goto_0
    if-ge v3, v2, :cond_1

    .line 28
    .line 29
    aget-object v4, v1, v3

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/core/analytics/Screen;->getText()Ljava/lang/String;

    .line 33
    move-result-object v5

    .line 34
    .line 35
    .line 36
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    move-result v5

    .line 38
    .line 39
    if-eqz v5, :cond_0

    .line 40
    goto :goto_1

    .line 41
    .line 42
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v4, 0x0

    .line 45
    .line 46
    :goto_1
    if-nez v4, :cond_2

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    return-object v4

    .line 49
    .line 50
    :cond_3
    :goto_2
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->OtpConfirmationScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 51
    return-object v0
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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/otp/j;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/otp/q;

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

.method public final bridge synthetic handleState(Lcom/sumsub/sns/core/presentation/base/s;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/otp/k;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/otp/j;->a(Lcom/sumsub/sns/internal/features/presentation/otp/k;)V

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

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/otp/j;->getLogTag()Ljava/lang/String;

    .line 9
    move-result-object v1

    .line 10
    const/4 v4, 0x4

    .line 11
    const/4 v5, 0x0

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "onCreate"

    .line 15
    const/4 v3, 0x0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
