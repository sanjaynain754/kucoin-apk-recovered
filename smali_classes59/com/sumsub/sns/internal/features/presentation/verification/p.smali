.class public final Lcom/sumsub/sns/internal/features/presentation/verification/p;
.super Lcom/sumsub/sns/core/presentation/base/I;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/I<",
        "Lcom/sumsub/sns/internal/features/presentation/verification/E;",
        "Lcom/sumsub/sns/internal/features/presentation/verification/j0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/verification/p;",
        "Lcom/sumsub/sns/core/presentation/base/I;",
        "Lcom/sumsub/sns/internal/features/presentation/verification/E;",
        "Lcom/sumsub/sns/internal/features/presentation/verification/j0;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/verification/e",
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
        "SMAP\nSNSVerificationStepFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSVerificationStepFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 Extensions.kt\ncom/sumsub/sns/internal/core/common/ExtensionsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n106#2,15:438\n49#3:453\n65#3,16:454\n93#3,3:470\n119#4:473\n133#4,3:474\n254#5:477\n256#5,2:479\n1#6:478\n*S KotlinDebug\n*F\n+ 1 SNSVerificationStepFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepFragment\n*L\n72#1:438,15\n100#1:453\n100#1:454,16\n100#1:470,3\n110#1:473\n110#1:474,3\n127#1:477\n229#1:479,2\n*E\n"
    }
.end annotation


# static fields
.field public static final p:Lcom/sumsub/sns/internal/features/presentation/verification/e;

.field public static final synthetic q:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/common/L;

.field public final b:Lcom/sumsub/sns/internal/core/common/L;

.field public final c:Lcom/sumsub/sns/internal/core/common/L;

.field public final d:Lcom/sumsub/sns/internal/core/common/L;

.field public final e:Lcom/sumsub/sns/internal/core/common/L;

.field public final f:Lcom/sumsub/sns/internal/core/common/L;

.field public final g:Lcom/sumsub/sns/internal/core/common/L;

.field public final h:Lcom/sumsub/sns/internal/core/common/L;

.field public final i:Lcom/sumsub/sns/internal/core/common/L;

.field public final j:Lcom/sumsub/sns/internal/core/common/L;

.field public final k:Lcom/sumsub/sns/internal/core/common/L;

.field public final l:Lcom/sumsub/sns/internal/core/common/L;

.field public final m:Lcom/sumsub/sns/internal/core/common/L;

.field public final n:Lkotlin/Lazy;

.field public o:Lcom/sumsub/sns/core/widget/PhoneKit;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;

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
    const-string/jumbo v4, "tvFooter"

    .line 25
    .line 26
    const-string v5, "getTvFooter()Landroid/widget/TextView;"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 30
    move-result-object v4

    .line 31
    .line 32
    .line 33
    const-string/jumbo v5, "tlEmail"

    .line 34
    .line 35
    const-string v6, "getTlEmail()Lcom/google/android/material/textfield/TextInputLayout;"

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 39
    move-result-object v5

    .line 40
    .line 41
    const-string v6, "etEmailId"

    .line 42
    .line 43
    const-string v7, "getEtEmailId()Lcom/google/android/material/textfield/TextInputEditText;"

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v6, v7, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 47
    move-result-object v6

    .line 48
    .line 49
    .line 50
    const-string/jumbo v7, "tlPhone"

    .line 51
    .line 52
    const-string v8, "getTlPhone()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;"

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v7, v8, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 56
    move-result-object v7

    .line 57
    .line 58
    const-string v8, "etPhone"

    .line 59
    .line 60
    const-string v9, "getEtPhone()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;"

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v8, v9, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 64
    move-result-object v8

    .line 65
    .line 66
    .line 67
    const-string/jumbo v9, "pinCode"

    .line 68
    .line 69
    const-string v10, "getPinCode()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;"

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v9, v10, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 73
    move-result-object v9

    .line 74
    .line 75
    .line 76
    const-string/jumbo v10, "tvResendCode"

    .line 77
    .line 78
    const-string v11, "getTvResendCode()Landroid/widget/TextView;"

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v10, v11, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 82
    move-result-object v10

    .line 83
    .line 84
    const-string v11, "ivIcon"

    .line 85
    .line 86
    const-string v12, "getIvIcon()Landroid/widget/ImageView;"

    .line 87
    .line 88
    .line 89
    invoke-static {v0, v11, v12, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 90
    move-result-object v11

    .line 91
    .line 92
    .line 93
    const-string/jumbo v12, "tvStatus"

    .line 94
    .line 95
    const-string v13, "getTvStatus()Landroid/widget/TextView;"

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v12, v13, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 99
    move-result-object v12

    .line 100
    .line 101
    const-string v13, "btnPrimary"

    .line 102
    .line 103
    const-string v14, "getBtnPrimary()Landroid/widget/Button;"

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v13, v14, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 107
    move-result-object v13

    .line 108
    .line 109
    .line 110
    const-string/jumbo v14, "otpErrorText"

    .line 111
    .line 112
    const-string v15, "getOtpErrorText()Landroid/widget/TextView;"

    .line 113
    .line 114
    .line 115
    invoke-static {v0, v14, v15, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    const/16 v14, 0xd

    .line 119
    .line 120
    new-array v14, v14, [Lkotlin/reflect/KProperty;

    .line 121
    .line 122
    aput-object v1, v14, v3

    .line 123
    const/4 v1, 0x1

    .line 124
    .line 125
    aput-object v2, v14, v1

    .line 126
    const/4 v1, 0x2

    .line 127
    .line 128
    aput-object v4, v14, v1

    .line 129
    const/4 v1, 0x3

    .line 130
    .line 131
    aput-object v5, v14, v1

    .line 132
    const/4 v1, 0x4

    .line 133
    .line 134
    aput-object v6, v14, v1

    .line 135
    const/4 v1, 0x5

    .line 136
    .line 137
    aput-object v7, v14, v1

    .line 138
    const/4 v1, 0x6

    .line 139
    .line 140
    aput-object v8, v14, v1

    .line 141
    const/4 v1, 0x7

    .line 142
    .line 143
    aput-object v9, v14, v1

    .line 144
    .line 145
    const/16 v1, 0x8

    .line 146
    .line 147
    aput-object v10, v14, v1

    .line 148
    .line 149
    const/16 v1, 0x9

    .line 150
    .line 151
    aput-object v11, v14, v1

    .line 152
    .line 153
    const/16 v1, 0xa

    .line 154
    .line 155
    aput-object v12, v14, v1

    .line 156
    .line 157
    const/16 v1, 0xb

    .line 158
    .line 159
    aput-object v13, v14, v1

    .line 160
    .line 161
    const/16 v1, 0xc

    .line 162
    .line 163
    aput-object v0, v14, v1

    .line 164
    .line 165
    sput-object v14, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    .line 166
    .line 167
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/e;

    .line 168
    .line 169
    .line 170
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/e;-><init>()V

    .line 171
    .line 172
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->p:Lcom/sumsub/sns/internal/features/presentation/verification/e;

    .line 173
    return-void
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
    sget v0, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 6
    .line 7
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 11
    .line 12
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->a:Lcom/sumsub/sns/internal/core/common/L;

    .line 13
    .line 14
    sget v0, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 15
    .line 16
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 20
    .line 21
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->b:Lcom/sumsub/sns/internal/core/common/L;

    .line 22
    .line 23
    sget v0, Lcom/sumsub/sns/R$id;->sns_footer:I

    .line 24
    .line 25
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 29
    .line 30
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 31
    .line 32
    sget v0, Lcom/sumsub/sns/R$id;->sns_email:I

    .line 33
    .line 34
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 35
    .line 36
    .line 37
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 38
    .line 39
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 40
    .line 41
    sget v0, Lcom/sumsub/sns/R$id;->sns_email_id:I

    .line 42
    .line 43
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 47
    .line 48
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 49
    .line 50
    sget v0, Lcom/sumsub/sns/R$id;->sns_phone:I

    .line 51
    .line 52
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 56
    .line 57
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f:Lcom/sumsub/sns/internal/core/common/L;

    .line 58
    .line 59
    sget v0, Lcom/sumsub/sns/R$id;->sns_phone_id:I

    .line 60
    .line 61
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 65
    .line 66
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g:Lcom/sumsub/sns/internal/core/common/L;

    .line 67
    .line 68
    sget v0, Lcom/sumsub/sns/R$id;->sns_pin_code:I

    .line 69
    .line 70
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 71
    .line 72
    .line 73
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 74
    .line 75
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->h:Lcom/sumsub/sns/internal/core/common/L;

    .line 76
    .line 77
    sget v0, Lcom/sumsub/sns/R$id;->sns_resend_verification_code:I

    .line 78
    .line 79
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 80
    .line 81
    .line 82
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 83
    .line 84
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->i:Lcom/sumsub/sns/internal/core/common/L;

    .line 85
    .line 86
    sget v0, Lcom/sumsub/sns/R$id;->sns_status_icon:I

    .line 87
    .line 88
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 89
    .line 90
    .line 91
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 92
    .line 93
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j:Lcom/sumsub/sns/internal/core/common/L;

    .line 94
    .line 95
    sget v0, Lcom/sumsub/sns/R$id;->sns_status_comment:I

    .line 96
    .line 97
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 98
    .line 99
    .line 100
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 101
    .line 102
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->k:Lcom/sumsub/sns/internal/core/common/L;

    .line 103
    .line 104
    sget v0, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 105
    .line 106
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 107
    .line 108
    .line 109
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 110
    .line 111
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->l:Lcom/sumsub/sns/internal/core/common/L;

    .line 112
    .line 113
    sget v0, Lcom/sumsub/sns/R$id;->sns_otp_error:I

    .line 114
    .line 115
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 116
    .line 117
    .line 118
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 119
    .line 120
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m:Lcom/sumsub/sns/internal/core/common/L;

    .line 121
    .line 122
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/s0;

    .line 123
    .line 124
    .line 125
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/verification/s0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/p;)V

    .line 126
    .line 127
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/verification/k;

    .line 128
    .line 129
    .line 130
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/verification/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/p;)V

    .line 131
    .line 132
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 133
    .line 134
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification/l;

    .line 135
    .line 136
    .line 137
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/verification/l;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/k;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 141
    move-result-object v1

    .line 142
    .line 143
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    .line 144
    .line 145
    .line 146
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 147
    move-result-object v2

    .line 148
    .line 149
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification/m;

    .line 150
    .line 151
    .line 152
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/verification/m;-><init>(Lkotlin/Lazy;)V

    .line 153
    .line 154
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/verification/n;

    .line 155
    .line 156
    .line 157
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/verification/n;-><init>(Lkotlin/Lazy;)V

    .line 158
    .line 159
    .line 160
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 161
    move-result-object v0

    .line 162
    .line 163
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n:Lkotlin/Lazy;

    .line 164
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification/p;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 6

    .line 13
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/v;

    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 15
    const-string v2, "ValidationIdentifier"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    const-string v4, "SendPhoneCodeImmediately"

    invoke-virtual {v1, v4, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 17
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v4

    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v5

    move-object v1, p0

    .line 19
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/verification/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/p;Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;ZLcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification/p;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3

    .line 9
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n:Lkotlin/Lazy;

    .line 10
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 11
    invoke-static {p0, p1, v2, v0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->onLinkClicked$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification/p;Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n:Lkotlin/Lazy;

    .line 2
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;->INIT:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;)V

    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->t:[Lkotlin/reflect/KProperty;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    .line 6
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 7
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification/p;Lcom/sumsub/sns/internal/features/presentation/verification/B;Landroid/view/View;)V
    .locals 13

    .line 162
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 163
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Screen;->ConfirmationCodeScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 164
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->getIdDocSetType()Ljava/lang/String;

    move-result-object v2

    .line 165
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->RetryButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 166
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 167
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n:Lkotlin/Lazy;

    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    .line 168
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/verification/B;->g:Ljava/lang/String;

    .line 169
    iget-object p1, v1, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 170
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/verification/F;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    const/4 v6, 0x2

    if-eq p1, p2, :cond_1

    if-ne p1, v6, :cond_0

    .line 171
    const-string p1, "PHONE_VERIFICATION"

    :goto_0
    move-object v2, p1

    goto :goto_1

    .line 172
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 173
    :cond_1
    const-string p1, "EMAIL_VERIFICATION"

    goto :goto_0

    .line 174
    :goto_1
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v7

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/d0;

    const/4 v3, 0x0

    move-object v4, v1

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/verification/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/verification/j0;Ljava/lang/String;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v10, v0

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    const/4 p1, 0x3

    const/4 p2, 0x0

    .line 175
    invoke-static {p0, p1, p2, v6, p2}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification/p;Lcom/sumsub/sns/internal/features/presentation/verification/C;Landroid/view/View;)V
    .locals 1

    .line 221
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->f:Lcom/sumsub/sns/internal/features/presentation/verification/y;

    .line 222
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object p2

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    .line 223
    invoke-virtual {p2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 224
    :cond_0
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/verification/y;->b:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    if-eqz p2, :cond_1

    .line 225
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    .line 226
    invoke-virtual {v0, p2}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;)V

    .line 227
    :cond_1
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification/y;->b:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    const/4 p2, -0x1

    if-nez p1, :cond_2

    move p1, p2

    goto :goto_0

    .line 228
    :cond_2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification/f;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    if-eq p1, p2, :cond_5

    const/4 p2, 0x1

    const/4 v0, 0x2

    if-eq p1, p2, :cond_4

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    const/4 p1, 0x0

    .line 229
    invoke-static {p0, v0, p1, v0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 230
    :cond_5
    :goto_1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-static {p0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    :cond_6
    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification/p;Lcom/sumsub/sns/internal/features/presentation/verification/D;Landroid/view/View;)V
    .locals 1

    .line 242
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification/D;->f:Lcom/sumsub/sns/internal/features/presentation/verification/y;

    .line 243
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object p2

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    .line 244
    invoke-virtual {p2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 245
    :cond_0
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/verification/y;->b:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    if-eqz p2, :cond_1

    .line 246
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    .line 247
    invoke-virtual {v0, p2}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;)V

    .line 248
    :cond_1
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification/y;->b:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    const/4 p2, -0x1

    if-nez p1, :cond_2

    move p1, p2

    goto :goto_0

    .line 249
    :cond_2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification/f;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    if-eq p1, p2, :cond_5

    const/4 p2, 0x1

    const/4 v0, 0x2

    if-eq p1, p2, :cond_4

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    const/4 p1, 0x0

    .line 250
    invoke-static {p0, v0, p1, v0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 251
    :cond_5
    :goto_1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->h()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-static {p0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    :cond_6
    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification/C;Lcom/sumsub/sns/internal/features/presentation/verification/p;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 p2, 0x6

    const/4 p4, 0x0

    if-ne p3, p2, :cond_8

    .line 210
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/C;->f:Lcom/sumsub/sns/internal/features/presentation/verification/y;

    .line 211
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/verification/y;->b:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    const/4 p3, 0x1

    if-eqz p2, :cond_0

    move p2, p3

    goto :goto_0

    :cond_0
    move p2, p4

    :goto_0
    if-eqz p2, :cond_7

    .line 212
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 213
    invoke-virtual {v0, p4}, Landroid/view/View;->setEnabled(Z)V

    .line 214
    :cond_1
    iget-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/verification/y;->b:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    if-eqz p4, :cond_2

    .line 215
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    .line 216
    invoke-virtual {v0, p4}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;)V

    .line 217
    :cond_2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/y;->b:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    const/4 p4, -0x1

    if-nez p0, :cond_3

    move p0, p4

    goto :goto_1

    .line 218
    :cond_3
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification/f;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_1
    if-eq p0, p4, :cond_6

    const/4 p4, 0x2

    if-eq p0, p3, :cond_5

    if-ne p0, p4, :cond_4

    goto :goto_2

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    const/4 p0, 0x0

    .line 219
    invoke-static {p1, p4, p0, p4, p0}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 220
    :cond_6
    :goto_2
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-static {p0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    :cond_7
    return p2

    :cond_8
    return p4
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification/D;Lcom/sumsub/sns/internal/features/presentation/verification/p;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 p2, 0x6

    const/4 p4, 0x0

    if-ne p3, p2, :cond_8

    .line 231
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/D;->f:Lcom/sumsub/sns/internal/features/presentation/verification/y;

    .line 232
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/verification/y;->b:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    const/4 p3, 0x1

    if-eqz p2, :cond_0

    move p2, p3

    goto :goto_0

    :cond_0
    move p2, p4

    :goto_0
    if-eqz p2, :cond_7

    .line 233
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 234
    invoke-virtual {v0, p4}, Landroid/view/View;->setEnabled(Z)V

    .line 235
    :cond_1
    iget-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/verification/y;->b:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    if-eqz p4, :cond_2

    .line 236
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    .line 237
    invoke-virtual {v0, p4}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;)V

    .line 238
    :cond_2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/y;->b:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    const/4 p4, -0x1

    if-nez p0, :cond_3

    move p0, p4

    goto :goto_1

    .line 239
    :cond_3
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification/f;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_1
    if-eq p0, p4, :cond_6

    const/4 p4, 0x2

    if-eq p0, p3, :cond_5

    if-ne p0, p4, :cond_4

    goto :goto_2

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    const/4 p0, 0x0

    .line 240
    invoke-static {p1, p4, p0, p4, p0}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 241
    :cond_6
    :goto_2
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->h()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-static {p0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    :cond_7
    return p2

    :cond_8
    return p4
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/verification/p;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    .line 9
    const/4 v0, 0x2

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1, v2, v0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->onLinkClicked$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 17
    return-object p0
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


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/verification/A;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 176
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "showStatus "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 177
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->i()Landroid/widget/ImageView;

    move-result-object v2

    .line 178
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->k:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    const/16 v5, 0xa

    aget-object v6, v4, v5

    invoke-virtual {v3, v0, v6}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const/4 v6, 0x2

    .line 179
    new-array v7, v6, [Landroid/view/View;

    const/4 v8, 0x0

    aput-object v2, v7, v8

    const/4 v2, 0x1

    aput-object v3, v7, v2

    invoke-static {v7}, Lcom/sumsub/sns/internal/core/common/h;->b([Landroid/view/View;)V

    .line 180
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->o()Landroid/widget/TextView;

    move-result-object v3

    .line 181
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n()Landroid/widget/TextView;

    move-result-object v7

    .line 182
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->k()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v9

    .line 183
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v10

    .line 184
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->l()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    move-result-object v11

    .line 185
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->h()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v12

    .line 186
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v13

    .line 187
    iget-object v14, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m:Lcom/sumsub/sns/internal/core/common/L;

    const/16 v15, 0xc

    aget-object v15, v4, v15

    invoke-virtual {v14, v0, v15}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/widget/TextView;

    .line 188
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m()Landroid/widget/TextView;

    move-result-object v15

    .line 189
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v16

    move/from16 v17, v2

    new-array v2, v5, [Landroid/view/View;

    aput-object v3, v2, v8

    aput-object v7, v2, v17

    aput-object v9, v2, v6

    const/4 v3, 0x3

    aput-object v10, v2, v3

    const/4 v3, 0x4

    aput-object v11, v2, v3

    const/4 v7, 0x5

    aput-object v12, v2, v7

    const/4 v7, 0x6

    aput-object v13, v2, v7

    const/4 v7, 0x7

    aput-object v14, v2, v7

    const/16 v7, 0x8

    aput-object v15, v2, v7

    const/16 v7, 0x9

    aput-object v16, v2, v7

    .line 190
    invoke-static {v2}, Lcom/sumsub/sns/internal/core/common/h;->a([Landroid/view/View;)V

    .line 191
    iget-boolean v2, v1, Lcom/sumsub/sns/internal/features/presentation/verification/A;->d:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 192
    invoke-static {v0, v3, v2, v6, v2}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 193
    :cond_0
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->i()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 194
    iget-boolean v3, v1, Lcom/sumsub/sns/internal/features/presentation/verification/A;->d:Z

    if-eqz v3, :cond_1

    .line 195
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    goto :goto_0

    :cond_1
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->APPROVED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    :goto_0
    invoke-static {v2, v3}, Lcom/sumsub/sns/core/widget/SNSStepViewExtensionsKt;->setSnsStepState(Landroid/view/View;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    .line 196
    :cond_2
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->i()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_3

    sget-object v3, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v3

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    .line 197
    iget-object v7, v1, Lcom/sumsub/sns/internal/features/presentation/verification/A;->b:Ljava/lang/String;

    .line 198
    invoke-interface {v3, v6, v7}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 199
    :cond_3
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->k:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v3, v4, v5

    invoke-virtual {v2, v0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_4

    .line 200
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/verification/A;->a:Ljava/lang/CharSequence;

    .line 201
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 202
    :cond_4
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/verification/A;->c:Ljava/lang/CharSequence;

    if-eqz v2, :cond_9

    .line 203
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 204
    :cond_5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 205
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/verification/A;->c:Ljava/lang/CharSequence;

    .line 206
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 207
    :cond_6
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 208
    :cond_7
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v1

    if-eqz v1, :cond_8

    move/from16 v2, v17

    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 209
    :cond_8
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/verification/n0;

    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/features/presentation/verification/n0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/p;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_9
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/verification/B;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v3, 0x3

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 120
    sget-object v9, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v12, "showVerifyCode "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 121
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v9

    if-eqz v9, :cond_0

    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v9

    if-nez v9, :cond_0

    goto :goto_0

    .line 122
    :cond_0
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v9

    if-eqz v9, :cond_1

    invoke-static {v9}, Lcom/sumsub/sns/internal/core/common/h;->f(Landroid/view/View;)V

    .line 123
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->o()Landroid/widget/TextView;

    move-result-object v9

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n()Landroid/widget/TextView;

    move-result-object v10

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v11

    .line 124
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v13, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    const/16 v14, 0xc

    aget-object v15, v13, v14

    invoke-virtual {v12, v0, v15}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/widget/TextView;

    .line 125
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m()Landroid/widget/TextView;

    move-result-object v15

    const/16 v16, 0x6

    new-array v2, v4, [Landroid/view/View;

    aput-object v9, v2, v8

    aput-object v10, v2, v7

    aput-object v11, v2, v6

    aput-object v12, v2, v3

    aput-object v15, v2, v5

    invoke-static {v2}, Lcom/sumsub/sns/internal/core/common/h;->b([Landroid/view/View;)V

    .line 126
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->k()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v9

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->l()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    move-result-object v10

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->h()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v11

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->i()Landroid/widget/ImageView;

    move-result-object v12

    .line 127
    iget-object v15, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->k:Lcom/sumsub/sns/internal/core/common/L;

    const/16 v17, 0xa

    move/from16 v18, v3

    aget-object v3, v13, v17

    invoke-virtual {v15, v0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 128
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v15

    move/from16 v17, v4

    const/4 v4, 0x7

    new-array v4, v4, [Landroid/view/View;

    aput-object v2, v4, v8

    aput-object v9, v4, v7

    aput-object v10, v4, v6

    aput-object v11, v4, v18

    aput-object v12, v4, v5

    aput-object v3, v4, v17

    aput-object v15, v4, v16

    invoke-static {v4}, Lcom/sumsub/sns/internal/core/common/h;->a([Landroid/view/View;)V

    .line 129
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->o()Landroid/widget/TextView;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    .line 130
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/verification/B;->a:Ljava/lang/CharSequence;

    if-eqz v4, :cond_2

    .line 131
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v4, v9}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v3

    :goto_1
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    :cond_3
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n()Landroid/widget/TextView;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 133
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/verification/B;->b:Ljava/lang/CharSequence;

    if-eqz v4, :cond_4

    .line 134
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v4, v9}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v4

    goto :goto_2

    :cond_4
    move-object v4, v3

    :goto_2
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    :cond_5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 136
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/verification/B;->e:Ljava/lang/Integer;

    if-eqz v4, :cond_6

    .line 137
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_3

    :cond_6
    move/from16 v4, v16

    :goto_3
    invoke-virtual {v2, v4}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setItemCount(I)V

    .line 138
    :cond_7
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v2

    if-eqz v2, :cond_8

    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/verification/j;

    invoke-direct {v4, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/verification/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/p;Lcom/sumsub/sns/internal/features/presentation/verification/B;)V

    invoke-virtual {v2, v4}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setOnTextCompleteListener(Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;)V

    .line 139
    :cond_8
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v4, v13, v14

    invoke-virtual {v2, v0, v4}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_9

    .line 140
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/verification/B;->f:Ljava/lang/CharSequence;

    .line 141
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    :cond_9
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v2

    if-eqz v2, :cond_b

    .line 143
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/verification/B;->f:Ljava/lang/CharSequence;

    if-eqz v4, :cond_a

    move v4, v7

    goto :goto_4

    :cond_a
    move v4, v8

    .line 144
    :goto_4
    invoke-virtual {v2, v4}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setError(Z)V

    .line 145
    :cond_b
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/verification/B;->f:Ljava/lang/CharSequence;

    if-eqz v2, :cond_c

    .line 146
    invoke-static {v0, v5, v3, v6, v3}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 147
    :cond_c
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/verification/B;->c:Ljava/lang/CharSequence;

    if-eqz v2, :cond_10

    .line 148
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m()Landroid/widget/TextView;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 149
    :cond_d
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m()Landroid/widget/TextView;

    move-result-object v2

    if-eqz v2, :cond_e

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    :cond_e
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m()Landroid/widget/TextView;

    move-result-object v2

    if-eqz v2, :cond_13

    .line 151
    sget-object v3, Lcom/sumsub/sns/internal/util/i;->a:Lkotlin/Lazy;

    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_f

    .line 152
    const-string v1, "Test"

    goto :goto_5

    .line 153
    :cond_f
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/verification/B;->c:Ljava/lang/CharSequence;

    .line 154
    :goto_5
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 155
    :cond_10
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/presentation/verification/B;->d:Ljava/lang/CharSequence;

    if-eqz v2, :cond_13

    .line 156
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m()Landroid/widget/TextView;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 157
    :cond_11
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m()Landroid/widget/TextView;

    move-result-object v2

    if-eqz v2, :cond_12

    .line 158
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/verification/B;->d:Ljava/lang/CharSequence;

    .line 159
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    :cond_12
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m()Landroid/widget/TextView;

    move-result-object v2

    if-eqz v2, :cond_13

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification/r0;

    invoke-direct {v3, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/verification/r0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/p;Lcom/sumsub/sns/internal/features/presentation/verification/B;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 161
    :cond_13
    :goto_6
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v1

    if-eqz v1, :cond_14

    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    :cond_14
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/verification/C;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 20
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "showValidateEmailForm "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 21
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->o()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->k()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v4

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v5

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v6

    const/4 v7, 0x5

    new-array v8, v7, [Landroid/view/View;

    const/4 v9, 0x0

    aput-object v2, v8, v9

    const/4 v2, 0x1

    aput-object v3, v8, v2

    const/4 v3, 0x2

    aput-object v4, v8, v3

    const/4 v4, 0x3

    aput-object v5, v8, v4

    const/4 v5, 0x4

    aput-object v6, v8, v5

    invoke-static {v8}, Lcom/sumsub/sns/internal/core/common/h;->b([Landroid/view/View;)V

    .line 22
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->l()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    move-result-object v6

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->h()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v8

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v10

    .line 23
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v12, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    const/16 v13, 0xc

    aget-object v13, v12, v13

    invoke-virtual {v11, v0, v13}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    .line 24
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m()Landroid/widget/TextView;

    move-result-object v13

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->i()Landroid/widget/ImageView;

    move-result-object v14

    .line 25
    iget-object v15, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->k:Lcom/sumsub/sns/internal/core/common/L;

    const/16 v16, 0xa

    move/from16 v17, v3

    aget-object v3, v12, v16

    invoke-virtual {v15, v0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const/4 v15, 0x7

    .line 26
    new-array v15, v15, [Landroid/view/View;

    aput-object v6, v15, v9

    aput-object v8, v15, v2

    aput-object v10, v15, v17

    aput-object v11, v15, v4

    aput-object v13, v15, v5

    aput-object v14, v15, v7

    const/4 v4, 0x6

    aput-object v3, v15, v4

    invoke-static {v15}, Lcom/sumsub/sns/internal/core/common/h;->a([Landroid/view/View;)V

    .line 27
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->o()Landroid/widget/TextView;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 28
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->a:Ljava/lang/CharSequence;

    if-eqz v5, :cond_0

    .line 29
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    :cond_1
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n()Landroid/widget/TextView;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 31
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->b:Ljava/lang/CharSequence;

    if-eqz v5, :cond_2

    .line 32
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v5

    goto :goto_1

    :cond_2
    move-object v5, v4

    :goto_1
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    :cond_3
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->k()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 34
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->e:Ljava/lang/CharSequence;

    .line 35
    invoke-virtual {v3, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 36
    :cond_4
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->k()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 37
    iget-boolean v5, v1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->h:Z

    xor-int/2addr v5, v2

    .line 38
    invoke-virtual {v3, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setEnabled(Z)V

    .line 39
    :cond_5
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->c:Ljava/lang/CharSequence;

    if-eqz v3, :cond_7

    .line 40
    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/2addr v3, v2

    if-ne v3, v2, :cond_7

    .line 41
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 42
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->c:Ljava/lang/CharSequence;

    .line 43
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    :cond_6
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 45
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->c:Ljava/lang/CharSequence;

    .line 46
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/widget/EditText;->setSelection(I)V

    .line 47
    :cond_7
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v3

    if-eqz v3, :cond_8

    .line 48
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->d:Ljava/lang/CharSequence;

    .line 49
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 50
    :cond_8
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v3

    if-eqz v3, :cond_9

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/verification/k0;

    invoke-direct {v5, v1, v0}, Lcom/sumsub/sns/internal/features/presentation/verification/k0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/C;Lcom/sumsub/sns/internal/features/presentation/verification/p;)V

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 51
    :cond_9
    iget-boolean v3, v1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->h:Z

    if-nez v3, :cond_d

    .line 52
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    :cond_a
    if-eqz v4, :cond_c

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_2

    .line 53
    :cond_b
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->e:Ljava/lang/CharSequence;

    if-eqz v3, :cond_d

    .line 54
    :cond_c
    :goto_2
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-static {v3}, Lcom/sumsub/sns/internal/core/common/h;->f(Landroid/view/View;)V

    goto :goto_3

    .line 55
    :cond_d
    iget-boolean v3, v1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->h:Z

    if-eqz v3, :cond_e

    .line 56
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-static {v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 57
    :cond_e
    :goto_3
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->c:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v4, v12, v17

    invoke-virtual {v3, v0, v4}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_f

    .line 58
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->g:Ljava/lang/CharSequence;

    .line 59
    invoke-static {v3, v4}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 60
    :cond_f
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->c:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v4, v12, v17

    invoke-virtual {v3, v0, v4}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_10

    .line 61
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/verification/l0;

    invoke-direct {v4, v0}, Lcom/sumsub/sns/internal/features/presentation/verification/l0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/p;)V

    invoke-static {v3, v4}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 62
    :cond_10
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v3

    if-eqz v3, :cond_11

    .line 63
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->f:Lcom/sumsub/sns/internal/features/presentation/verification/y;

    .line 64
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/presentation/verification/y;->a:Ljava/lang/String;

    .line 65
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    :cond_11
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v3

    if-eqz v3, :cond_13

    .line 67
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/verification/C;->f:Lcom/sumsub/sns/internal/features/presentation/verification/y;

    .line 68
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/presentation/verification/y;->b:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    if-eqz v4, :cond_12

    move v9, v2

    .line 69
    :cond_12
    invoke-virtual {v3, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 70
    :cond_13
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v2

    if-eqz v2, :cond_14

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification/m0;

    invoke-direct {v3, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/verification/m0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/p;Lcom/sumsub/sns/internal/features/presentation/verification/C;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_14
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/verification/D;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 71
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "showValidatePhoneForm "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 72
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->o()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->l()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    move-result-object v4

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->h()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v5

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v6

    const/4 v7, 0x5

    new-array v8, v7, [Landroid/view/View;

    const/4 v9, 0x0

    aput-object v2, v8, v9

    const/4 v2, 0x1

    aput-object v3, v8, v2

    const/4 v3, 0x2

    aput-object v4, v8, v3

    const/4 v4, 0x3

    aput-object v5, v8, v4

    const/4 v5, 0x4

    aput-object v6, v8, v5

    invoke-static {v8}, Lcom/sumsub/sns/internal/core/common/h;->b([Landroid/view/View;)V

    .line 73
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->k()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v6

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v8

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v10

    .line 74
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v12, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    const/16 v13, 0xc

    aget-object v13, v12, v13

    invoke-virtual {v11, v0, v13}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    .line 75
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->m()Landroid/widget/TextView;

    move-result-object v13

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->i()Landroid/widget/ImageView;

    move-result-object v14

    .line 76
    iget-object v15, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->k:Lcom/sumsub/sns/internal/core/common/L;

    const/16 v16, 0xa

    move/from16 v17, v2

    aget-object v2, v12, v16

    invoke-virtual {v15, v0, v2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const/4 v15, 0x7

    .line 77
    new-array v15, v15, [Landroid/view/View;

    aput-object v6, v15, v9

    aput-object v8, v15, v17

    aput-object v10, v15, v3

    aput-object v11, v15, v4

    aput-object v13, v15, v5

    aput-object v14, v15, v7

    const/4 v4, 0x6

    aput-object v2, v15, v4

    invoke-static {v15}, Lcom/sumsub/sns/internal/core/common/h;->a([Landroid/view/View;)V

    .line 78
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->o()Landroid/widget/TextView;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    .line 79
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/presentation/verification/D;->a:Ljava/lang/CharSequence;

    if-eqz v5, :cond_0

    .line 80
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    :cond_1
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n()Landroid/widget/TextView;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 82
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/presentation/verification/D;->b:Ljava/lang/CharSequence;

    if-eqz v5, :cond_2

    .line 83
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v5

    goto :goto_1

    :cond_2
    move-object v5, v4

    :goto_1
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    :cond_3
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->k()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v2

    if-eqz v2, :cond_4

    const/16 v5, 0x8

    .line 85
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 86
    :cond_4
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->l()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 87
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/presentation/verification/D;->e:Ljava/lang/CharSequence;

    .line 88
    invoke-virtual {v2, v5}, Lcom/sumsub/sns/core/widget/SNSTextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 89
    :cond_5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->l()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 90
    iget-boolean v5, v1, Lcom/sumsub/sns/internal/features/presentation/verification/D;->h:Z

    xor-int/lit8 v5, v5, 0x1

    .line 91
    invoke-virtual {v2, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 92
    :cond_6
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->h()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/verification/o0;

    invoke-direct {v5, v1, v0}, Lcom/sumsub/sns/internal/features/presentation/verification/o0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/D;Lcom/sumsub/sns/internal/features/presentation/verification/p;)V

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 93
    :cond_7
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 94
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/presentation/verification/D;->f:Lcom/sumsub/sns/internal/features/presentation/verification/y;

    .line 95
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/presentation/verification/y;->a:Ljava/lang/String;

    .line 96
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    :cond_8
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v2

    if-eqz v2, :cond_a

    .line 98
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/presentation/verification/D;->f:Lcom/sumsub/sns/internal/features/presentation/verification/y;

    .line 99
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/presentation/verification/y;->b:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    if-eqz v5, :cond_9

    move/from16 v9, v17

    .line 100
    :cond_9
    invoke-virtual {v2, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 101
    :cond_a
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f()Landroid/widget/Button;

    move-result-object v2

    if-eqz v2, :cond_b

    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/verification/p0;

    invoke-direct {v5, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/verification/p0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/p;Lcom/sumsub/sns/internal/features/presentation/verification/D;)V

    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    :cond_b
    iget-boolean v2, v1, Lcom/sumsub/sns/internal/features/presentation/verification/D;->h:Z

    if-nez v2, :cond_e

    .line 103
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->h()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getText()Landroid/text/Editable;

    move-result-object v4

    :cond_c
    if-eqz v4, :cond_d

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 104
    :cond_d
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->h()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-static {v2}, Lcom/sumsub/sns/internal/core/common/h;->f(Landroid/view/View;)V

    goto :goto_2

    .line 105
    :cond_e
    iget-boolean v2, v1, Lcom/sumsub/sns/internal/features/presentation/verification/D;->h:Z

    if-eqz v2, :cond_f

    .line 106
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->h()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-static {v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 107
    :cond_f
    :goto_2
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->c:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v4, v12, v3

    invoke-virtual {v2, v0, v4}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_10

    .line 108
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/verification/D;->g:Ljava/lang/CharSequence;

    .line 109
    invoke-static {v2, v4}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 110
    :cond_10
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->c:Lcom/sumsub/sns/internal/core/common/L;

    aget-object v3, v12, v3

    invoke-virtual {v2, v0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_11

    .line 111
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification/q0;

    invoke-direct {v3, v0}, Lcom/sumsub/sns/internal/features/presentation/verification/q0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/p;)V

    invoke-static {v2, v3}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 112
    :cond_11
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->o:Lcom/sumsub/sns/core/widget/PhoneKit;

    if-eqz v2, :cond_12

    return-void

    .line 113
    :cond_12
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/verification/i;

    invoke-direct {v2, v0}, Lcom/sumsub/sns/internal/features/presentation/verification/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/p;)V

    .line 114
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->l()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    move-result-object v3

    .line 115
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/verification/D;->d:Lcom/sumsub/sns/internal/features/domain/n;

    .line 116
    iget-object v5, v4, Lcom/sumsub/sns/internal/features/domain/n;->c:Ljava/util/Map;

    .line 117
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/domain/n;->b:Ljava/util/Map;

    .line 118
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/verification/D;->c:Ljava/lang/CharSequence;

    .line 119
    invoke-static {v3, v5, v4, v2, v1}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneKitProviderKt;->getPhoneKit(Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;Ljava/lang/CharSequence;)Lcom/sumsub/sns/core/widget/PhoneKit;

    move-result-object v1

    iput-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->o:Lcom/sumsub/sns/core/widget/PhoneKit;

    return-void
.end method

.method public final f()Landroid/widget/Button;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->l:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    .line 5
    .line 6
    const/16 v2, 0xb

    .line 7
    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Landroid/widget/Button;

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public final g()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x4

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
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 2

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
    const-string v1, "ValidationIdentifier"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

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
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 17
    .line 18
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/f;->a:[I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 22
    move-result v0

    .line 23
    .line 24
    aget v0, v1, v0

    .line 25
    const/4 v1, 0x1

    .line 26
    .line 27
    if-eq v0, v1, :cond_2

    .line 28
    const/4 v1, 0x2

    .line 29
    .line 30
    if-ne v0, v1, :cond_1

    .line 31
    .line 32
    const-string v0, "PHONE_VERIFICATION"

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
    :cond_2
    const-string v0, "EMAIL_VERIFICATION"

    .line 42
    return-object v0
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
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_verification_step:I

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;

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

.method public final h()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x6

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
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    .locals 9

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification/s;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/h;->f(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/g;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/verification/g;-><init>(Lcom/sumsub/sns/core/widget/pincode/SNSPinView;Lcom/sumsub/sns/internal/features/presentation/verification/p;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 38
    :cond_2
    return-void

    .line 39
    .line 40
    :cond_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification/q;

    .line 41
    const/4 v2, 0x2

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v2, v1, v2, v1}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 47
    return-void

    .line 48
    .line 49
    :cond_4
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification/r;

    .line 50
    .line 51
    if-eqz v0, :cond_6

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->isForResult()Z

    .line 55
    move-result p1

    .line 56
    .line 57
    if-eqz p1, :cond_5

    .line 58
    const/4 p1, 0x1

    .line 59
    .line 60
    .line 61
    invoke-static {p0, p1, v1, v2, v1}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 62
    return-void

    .line 63
    .line 64
    :cond_5
    new-instance v4, Lcom/sumsub/sns/internal/core/common/t;

    .line 65
    .line 66
    .line 67
    invoke-direct {v4}, Lcom/sumsub/sns/internal/core/common/t;-><init>()V

    .line 68
    const/4 v7, 0x6

    .line 69
    const/4 v8, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    const/4 v6, 0x0

    .line 72
    move-object v3, p0

    .line 73
    .line 74
    .line 75
    invoke-static/range {v3 .. v8}, Lcom/sumsub/sns/core/presentation/base/l;->finish$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;ILjava/lang/Object;)V

    .line 76
    return-void

    .line 77
    .line 78
    .line 79
    :cond_6
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 80
    return-void
    .line 81
.end method

.method public final handleState(Lcom/sumsub/sns/core/presentation/base/s;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification/E;

    .line 3
    .line 4
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/verification/C;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification/C;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->a(Lcom/sumsub/sns/internal/features/presentation/verification/C;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/verification/D;

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification/D;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->a(Lcom/sumsub/sns/internal/features/presentation/verification/D;)V

    .line 22
    return-void

    .line 23
    .line 24
    :cond_1
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/verification/B;

    .line 25
    .line 26
    if-eqz p2, :cond_2

    .line 27
    .line 28
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification/B;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->a(Lcom/sumsub/sns/internal/features/presentation/verification/B;)V

    .line 32
    return-void

    .line 33
    .line 34
    :cond_2
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/verification/A;

    .line 35
    .line 36
    if-eqz p2, :cond_3

    .line 37
    .line 38
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification/A;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->a(Lcom/sumsub/sns/internal/features/presentation/verification/A;)V

    .line 42
    :cond_3
    return-void
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

.method public final i()Landroid/widget/ImageView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    .line 5
    .line 6
    const/16 v2, 0x9

    .line 7
    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Landroid/widget/ImageView;

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public final j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->h:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x7

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

.method public final k()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x3

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
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final l()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->f:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x5

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
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final m()Landroid/widget/TextView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->i:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    .line 5
    .line 6
    const/16 v2, 0x8

    .line 7
    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Landroid/widget/TextView;

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public final n()Landroid/widget/TextView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->b:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x1

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
    check-cast v0, Landroid/widget/TextView;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final o()Landroid/widget/TextView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->a:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->q:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

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
    check-cast v0, Landroid/widget/TextView;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/common/u;->b:Lcom/sumsub/sns/internal/core/common/u;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result p1

    .line 7
    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 19
    move-result p1

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/p;->n:Lkotlin/Lazy;

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;->INIT:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$Step;)V

    .line 38
    .line 39
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->m:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 40
    .line 41
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->t:[Lkotlin/reflect/KProperty;

    .line 42
    const/4 v3, 0x3

    .line 43
    .line 44
    aget-object v2, v2, v3

    .line 45
    .line 46
    iget-object v2, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 47
    .line 48
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v1, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->a(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->j()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    if-eqz p1, :cond_0

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 64
    :cond_0
    const/4 p1, 0x0

    .line 65
    return p1

    .line 66
    :cond_1
    const/4 p1, 0x5

    .line 67
    const/4 v1, 0x2

    .line 68
    .line 69
    .line 70
    invoke-static {p0, p1, v0, v1, v0}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->e()V

    .line 74
    const/4 p1, 0x1

    .line 75
    return p1
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final onViewModelPrepared(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/I;->onViewModelPrepared(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/verification/p;->g()Lcom/google/android/material/textfield/TextInputEditText;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification/h;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/verification/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/p;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
