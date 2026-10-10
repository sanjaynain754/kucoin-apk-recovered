.class public final Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;
.super Lcom/kubi/payment/third/base/BaseThirdFragment;
.source "PlatformVerifyFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/payment/third/base/BaseThirdFragment<",
        "Lcom/kubi/payment/third/common/kyc/PlatformVerifyViewModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u0000 \u00132\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016J\u0008\u0010\r\u001a\u00020\u000eH\u0014J\u0008\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u0011\u001a\u00020\u0010H\u0016J\u0008\u0010\u0012\u001a\u00020\u0010H\u0014R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;",
        "Lcom/kubi/payment/third/base/BaseThirdFragment;",
        "Lcom/kubi/payment/third/common/kyc/PlatformVerifyViewModel;",
        "<init>",
        "()V",
        "viewBinding",
        "Lcom/kubi/otc/databinding/PaymentThirdPlatformVerifyBinding;",
        "getViewBinding",
        "()Lcom/kubi/otc/databinding/PaymentThirdPlatformVerifyBinding;",
        "viewBinding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "viewModelClass",
        "Lkotlin/reflect/KClass;",
        "getLayout",
        "",
        "initViews",
        "",
        "onResume",
        "observeData",
        "Companion",
        "PaymentLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPlatformVerifyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformVerifyFragment.kt\ncom/kubi/payment/third/common/kyc/PlatformVerifyFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,99:1\n147#2,16:100\n*S KotlinDebug\n*F\n+ 1 PlatformVerifyFragment.kt\ncom/kubi/payment/third/common/kyc/PlatformVerifyFragment\n*L\n17#1:100,16\n*E\n"
    }
.end annotation


# static fields
.field public static final W:Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic X:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final V:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getViewBinding()Lcom/kubi/otc/databinding/PaymentThirdPlatformVerifyBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;

    .line 8
    .line 9
    const-string v4, "viewBinding"

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 20
    .line 21
    aput-object v0, v1, v2

    .line 22
    .line 23
    sput-object v1, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->X:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->W:Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment$Companion;

    .line 32
    return-void
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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/payment/third/base/BaseThirdFragment;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment$special$$inlined$viewBindingFragment$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment$special$$inlined$viewBindingFragment$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->V:Lcom/kubi/sdk/viewbindingdelegate/base/a;

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
.end method

.method public static final A3(Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;Lcom/kubi/otc/entity/FiatUserInfo;)Lkotlin/Unit;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatUserInfo;->isUnverified()Z

    .line 7
    move-result v1

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    move-result-object v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v1, v0

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_4

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p1, Lft/u2;->c:Landroid/widget/ImageView;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    sget v0, Lcom/kubi/otc/R$drawable;->ic_warning_20:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget-object p1, p1, Lft/u2;->c:Landroid/widget/ImageView;

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    sget v0, Lcom/kubi/otc/R$color;->complementary:I

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 50
    move-result v0

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v0}, Lcom/kubi/utils/extensions/k;->p(Landroid/widget/ImageView;I)V

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iget-object p1, p1, Lft/u2;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 62
    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 70
    move-result-object p0

    .line 71
    .line 72
    if-eqz p0, :cond_19

    .line 73
    .line 74
    iget-object p0, p0, Lft/u2;->b:Landroid/widget/ImageView;

    .line 75
    .line 76
    if-eqz p0, :cond_19

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 80
    .line 81
    goto/16 :goto_3

    .line 82
    .line 83
    :cond_4
    if-eqz p1, :cond_5

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatUserInfo;->isHighKyc()Z

    .line 87
    move-result v1

    .line 88
    .line 89
    .line 90
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    move-result-object v1

    .line 92
    goto :goto_1

    .line 93
    :cond_5
    move-object v1, v0

    .line 94
    .line 95
    .line 96
    :goto_1
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 97
    move-result v1

    .line 98
    .line 99
    if-eqz v1, :cond_b

    .line 100
    .line 101
    if-eqz p1, :cond_6

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatUserInfo;->isSanctionKyc()Z

    .line 105
    move-result p1

    .line 106
    .line 107
    .line 108
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    .line 112
    :cond_6
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 113
    move-result p1

    .line 114
    .line 115
    if-eqz p1, :cond_7

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 119
    move-result-object p0

    .line 120
    .line 121
    if-eqz p0, :cond_19

    .line 122
    .line 123
    iget-object p0, p0, Lft/u2;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 124
    .line 125
    if-eqz p0, :cond_19

    .line 126
    .line 127
    .line 128
    invoke-static {p0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 129
    .line 130
    goto/16 :goto_3

    .line 131
    .line 132
    .line 133
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    if-eqz p1, :cond_8

    .line 137
    .line 138
    iget-object p1, p1, Lft/u2;->c:Landroid/widget/ImageView;

    .line 139
    .line 140
    if-eqz p1, :cond_8

    .line 141
    .line 142
    sget v0, Lcom/kubi/otc/R$drawable;->ic_success_20:I

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 146
    .line 147
    .line 148
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 149
    move-result-object p1

    .line 150
    .line 151
    if-eqz p1, :cond_9

    .line 152
    .line 153
    iget-object p1, p1, Lft/u2;->c:Landroid/widget/ImageView;

    .line 154
    .line 155
    if-eqz p1, :cond_9

    .line 156
    .line 157
    sget v0, Lcom/kubi/otc/R$color;->primary:I

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 161
    move-result v0

    .line 162
    .line 163
    .line 164
    invoke-static {p1, v0}, Lcom/kubi/utils/extensions/k;->p(Landroid/widget/ImageView;I)V

    .line 165
    .line 166
    .line 167
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 168
    move-result-object p1

    .line 169
    .line 170
    if-eqz p1, :cond_a

    .line 171
    .line 172
    iget-object p1, p1, Lft/u2;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 173
    .line 174
    if-eqz p1, :cond_a

    .line 175
    .line 176
    .line 177
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 178
    .line 179
    .line 180
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 181
    move-result-object p0

    .line 182
    .line 183
    if-eqz p0, :cond_19

    .line 184
    .line 185
    iget-object p0, p0, Lft/u2;->b:Landroid/widget/ImageView;

    .line 186
    .line 187
    if-eqz p0, :cond_19

    .line 188
    .line 189
    .line 190
    invoke-static {p0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 191
    .line 192
    goto/16 :goto_3

    .line 193
    .line 194
    :cond_b
    if-eqz p1, :cond_c

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatUserInfo;->isVerifying()Z

    .line 198
    move-result v1

    .line 199
    .line 200
    .line 201
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 202
    move-result-object v1

    .line 203
    goto :goto_2

    .line 204
    :cond_c
    move-object v1, v0

    .line 205
    .line 206
    .line 207
    :goto_2
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 208
    move-result v1

    .line 209
    .line 210
    if-eqz v1, :cond_12

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 214
    move-result-object p1

    .line 215
    .line 216
    if-eqz p1, :cond_d

    .line 217
    .line 218
    iget-object p1, p1, Lft/u2;->c:Landroid/widget/ImageView;

    .line 219
    .line 220
    if-eqz p1, :cond_d

    .line 221
    .line 222
    sget v0, Lcom/kubi/otc/R$mipmap;->botc_ic_progress_status:I

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 226
    .line 227
    .line 228
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 229
    move-result-object p1

    .line 230
    .line 231
    if-eqz p1, :cond_e

    .line 232
    .line 233
    iget-object p1, p1, Lft/u2;->c:Landroid/widget/ImageView;

    .line 234
    .line 235
    if-eqz p1, :cond_e

    .line 236
    .line 237
    sget v0, Lcom/kubi/otc/R$color;->complementary:I

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 241
    move-result v0

    .line 242
    .line 243
    .line 244
    invoke-static {p1, v0}, Lcom/kubi/utils/extensions/k;->p(Landroid/widget/ImageView;I)V

    .line 245
    .line 246
    .line 247
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 248
    move-result-object p1

    .line 249
    .line 250
    if-eqz p1, :cond_f

    .line 251
    .line 252
    iget-object p1, p1, Lft/u2;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 253
    .line 254
    if-eqz p1, :cond_f

    .line 255
    .line 256
    sget v0, Lcom/kubi/otc/R$string;->payment_verify_processing:I

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 260
    move-result-object v0

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 264
    .line 265
    .line 266
    :cond_f
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 267
    move-result-object p1

    .line 268
    .line 269
    if-eqz p1, :cond_10

    .line 270
    .line 271
    iget-object p1, p1, Lft/u2;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 272
    .line 273
    if-eqz p1, :cond_10

    .line 274
    .line 275
    sget v0, Lcom/kubi/otc/R$color;->complementary:I

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 279
    move-result v0

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 283
    .line 284
    .line 285
    :cond_10
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 286
    move-result-object p1

    .line 287
    .line 288
    if-eqz p1, :cond_11

    .line 289
    .line 290
    iget-object p1, p1, Lft/u2;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 291
    .line 292
    if-eqz p1, :cond_11

    .line 293
    .line 294
    .line 295
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 296
    .line 297
    .line 298
    :cond_11
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 299
    move-result-object p0

    .line 300
    .line 301
    if-eqz p0, :cond_19

    .line 302
    .line 303
    iget-object p0, p0, Lft/u2;->b:Landroid/widget/ImageView;

    .line 304
    .line 305
    if-eqz p0, :cond_19

    .line 306
    .line 307
    .line 308
    invoke-static {p0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 309
    .line 310
    goto/16 :goto_3

    .line 311
    .line 312
    :cond_12
    if-eqz p1, :cond_13

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatUserInfo;->isFailed()Z

    .line 316
    move-result p1

    .line 317
    .line 318
    .line 319
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 320
    move-result-object v0

    .line 321
    .line 322
    .line 323
    :cond_13
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 324
    move-result p1

    .line 325
    .line 326
    if-eqz p1, :cond_19

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 330
    move-result-object p1

    .line 331
    .line 332
    if-eqz p1, :cond_14

    .line 333
    .line 334
    iget-object p1, p1, Lft/u2;->c:Landroid/widget/ImageView;

    .line 335
    .line 336
    if-eqz p1, :cond_14

    .line 337
    .line 338
    sget v0, Lcom/kubi/otc/R$drawable;->ic_fail_20:I

    .line 339
    .line 340
    .line 341
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 342
    .line 343
    .line 344
    :cond_14
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 345
    move-result-object p1

    .line 346
    .line 347
    if-eqz p1, :cond_15

    .line 348
    .line 349
    iget-object p1, p1, Lft/u2;->c:Landroid/widget/ImageView;

    .line 350
    .line 351
    if-eqz p1, :cond_15

    .line 352
    .line 353
    sget v0, Lcom/kubi/otc/R$color;->secondary:I

    .line 354
    .line 355
    .line 356
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 357
    move-result v0

    .line 358
    .line 359
    .line 360
    invoke-static {p1, v0}, Lcom/kubi/utils/extensions/k;->p(Landroid/widget/ImageView;I)V

    .line 361
    .line 362
    .line 363
    :cond_15
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 364
    move-result-object p1

    .line 365
    .line 366
    if-eqz p1, :cond_16

    .line 367
    .line 368
    iget-object p1, p1, Lft/u2;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 369
    .line 370
    if-eqz p1, :cond_16

    .line 371
    .line 372
    sget v0, Lcom/kubi/otc/R$string;->payment_verify_failure:I

    .line 373
    .line 374
    .line 375
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 376
    move-result-object v0

    .line 377
    .line 378
    .line 379
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 380
    .line 381
    .line 382
    :cond_16
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 383
    move-result-object p1

    .line 384
    .line 385
    if-eqz p1, :cond_17

    .line 386
    .line 387
    iget-object p1, p1, Lft/u2;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 388
    .line 389
    if-eqz p1, :cond_17

    .line 390
    .line 391
    sget v0, Lcom/kubi/otc/R$color;->secondary:I

    .line 392
    .line 393
    .line 394
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 395
    move-result v0

    .line 396
    .line 397
    .line 398
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 399
    .line 400
    .line 401
    :cond_17
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 402
    move-result-object p1

    .line 403
    .line 404
    if-eqz p1, :cond_18

    .line 405
    .line 406
    iget-object p1, p1, Lft/u2;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 407
    .line 408
    if-eqz p1, :cond_18

    .line 409
    .line 410
    .line 411
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 412
    .line 413
    .line 414
    :cond_18
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 415
    move-result-object p0

    .line 416
    .line 417
    if-eqz p0, :cond_19

    .line 418
    .line 419
    iget-object p0, p0, Lft/u2;->b:Landroid/widget/ImageView;

    .line 420
    .line 421
    if-eqz p0, :cond_19

    .line 422
    .line 423
    .line 424
    invoke-static {p0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 425
    .line 426
    :cond_19
    :goto_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 427
    return-object p0
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
.end method

.method public static synthetic u3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->z3()Lkotlin/Unit;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic v3(Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->y3(Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;Landroid/view/View;)V

    .line 4
    return-void
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
.end method

.method public static synthetic w3(Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;Lcom/kubi/otc/entity/FiatUserInfo;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->A3(Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;Lcom/kubi/otc/entity/FiatUserInfo;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final y3(Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->preformBackPressed()V

    .line 4
    return-void
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
.end method

.method public static final z3()Lkotlin/Unit;
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    const/16 v6, 0x1f

    .line 5
    const/4 v7, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v7}, Lg00/g$a;->a(Lg00/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 14
    .line 15
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object v0
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
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$layout;->payment_third_platform_verify:I

    .line 3
    return v0
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
.end method

.method public n3()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget v1, Lcom/kubi/otc/R$drawable;->ic_close_24:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/NavigationBar;->setLeftIcon(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    new-instance v1, Lcom/kubi/payment/third/common/kyc/b;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcom/kubi/payment/third/common/kyc/b;-><init>(Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/NavigationBar;->setLeftOnclickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->x3()Lft/u2;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v1, v0, Lft/u2;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    new-instance v4, Lcom/kubi/payment/third/common/kyc/c;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4}, Lcom/kubi/payment/third/common/kyc/c;-><init>()V

    .line 41
    const/4 v5, 0x1

    .line 42
    const/4 v6, 0x0

    .line 43
    .line 44
    const-wide/16 v2, 0x0

    .line 45
    .line 46
    .line 47
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 48
    :cond_2
    return-void
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
.end method

.method public o3()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/payment/base/BaseFragment;->o3()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Lcom/kubi/payment/third/common/kyc/PlatformVerifyViewModel;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyViewModel;->x()Landroidx/lifecycle/LiveData;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    new-instance v2, Lcom/kubi/payment/third/common/kyc/a;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, p0}, Lcom/kubi/payment/third/common/kyc/a;-><init>(Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;)V

    .line 23
    .line 24
    new-instance v3, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment$a;

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v2}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 31
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onResume()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/base/BaseFragment;->m3()Lnt/g;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Lcom/kubi/payment/third/common/kyc/PlatformVerifyViewModel;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/payment/third/common/kyc/PlatformVerifyViewModel;->y()V

    .line 13
    return-void
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
.end method

.method public s3()Lkotlin/reflect/KClass;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KClass<",
            "Lcom/kubi/payment/third/common/kyc/PlatformVerifyViewModel;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-class v0, Lcom/kubi/payment/third/common/kyc/PlatformVerifyViewModel;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

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
.end method

.method public final x3()Lft/u2;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->V:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/payment/third/common/kyc/PlatformVerifyFragment;->X:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/a;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lft/u2;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method
