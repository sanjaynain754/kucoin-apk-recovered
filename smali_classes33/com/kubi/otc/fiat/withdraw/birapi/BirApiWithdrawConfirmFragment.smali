.class public final Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;
.super Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;
.source "BirApiWithdrawConfirmFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0008\u0010\u0016\u001a\u00020\u0017H\u0014R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;",
        "Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;",
        "<init>",
        "()V",
        "binding",
        "Lcom/kubi/otc/databinding/PaymentFragmentBirapiWithdrawConfirmBinding;",
        "getBinding",
        "()Lcom/kubi/otc/databinding/PaymentFragmentBirapiWithdrawConfirmBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "securityWidgetOpen",
        "",
        "getSecurityWidgetOpen",
        "()Z",
        "securityWidgetOpen$delegate",
        "Lkotlin/Lazy;",
        "onViewCreated",
        "",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "getLayout",
        "",
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
        "SMAP\nBirApiWithdrawConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirApiWithdrawConfirmFragment.kt\ncom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,74:1\n147#2,16:75\n35#3,4:91\n39#3:97\n44#4,2:95\n*S KotlinDebug\n*F\n+ 1 BirApiWithdrawConfirmFragment.kt\ncom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment\n*L\n24#1:75,16\n34#1:91,4\n34#1:97\n34#1:95,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a0:Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic b0:[Lkotlin/reflect/KProperty;
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
.field public final Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Z:Lkotlin/Lazy;
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
    const-string v1, "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentBirapiWithdrawConfirmBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;

    .line 8
    .line 9
    const-string v4, "binding"

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
    sput-object v1, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->b0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->a0:Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment$Companion;

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
    invoke-direct {p0}, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment$special$$inlined$viewBindingFragment$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment$special$$inlined$viewBindingFragment$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    new-instance v0, Lcom/kubi/otc/fiat/withdraw/birapi/c;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Lcom/kubi/otc/fiat/withdraw/birapi/c;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iput-object v0, p0, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->Z:Lkotlin/Lazy;

    .line 28
    return-void
    .line 29
    .line 30
    .line 31
.end method

.method public static synthetic Q3(Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->W3(Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;)Lkotlin/Unit;

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
.end method

.method public static synthetic R3()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->X3()Z

    .line 4
    move-result v0

    .line 5
    return v0
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

.method public static synthetic S3(Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->V3(Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;)Lkotlin/Unit;

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
.end method

.method public static final V3(Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget v1, Lcom/kubi/otc/R$string;->payment_cj_estimated_amount_title:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget v1, Lcom/kubi/otc/R$string;->payment_cj_estimated_amount_tip:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->J4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sget v1, Lcom/kubi/otc/R$string;->payment_cj_estimated_amount_understand:I

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 29
    move-result-object p0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->c5(Landroidx/fragment/app/FragmentManager;)V

    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    return-object p0
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
.end method

.method public static final W3(Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->U3()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;->y3()V

    .line 10
    goto :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;->v3()V

    .line 14
    .line 15
    :goto_0
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
.end method

.method public static final X3()Z
    .locals 8

    .line 1
    .line 2
    const-string v0, "payment_android_ee_withdraw"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment$a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment$a;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object v2, v0

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 28
    .line 29
    const/16 v6, 0x8

    .line 30
    const/4 v7, 0x0

    .line 31
    .line 32
    const-string v3, "RemoteConfig"

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 43
    move-object v0, v2

    .line 44
    .line 45
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 46
    const/4 v1, 0x1

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 50
    move-result v0

    .line 51
    return v0
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


# virtual methods
.method public final T3()Lft/c1;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->b0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lft/c1;

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

.method public final U3()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->Z:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    move-result v0

    .line 13
    return v0
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

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$layout;->payment_fragment_birapi_withdraw_confirm:I

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

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 13
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "view"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->T3()Lft/c1;

    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x0

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lft/c1;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p1, p2

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->T3()Lft/c1;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, v0, Lft/c1;->c:Lcom/kubi/resources/widget/BaseTextView;

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object v0, p2

    .line 30
    .line 31
    .line 32
    :goto_1
    invoke-virtual {p0, p1, v0}, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;->E3(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->T3()Lft/c1;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    if-eqz p1, :cond_4

    .line 39
    .line 40
    iget-object p1, p1, Lft/c1;->l:Lcom/kubi/resources/widget/BaseTextView;

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;->C3()Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;->getAmount()Ljava/lang/String;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    const/16 v11, 0xf7

    .line 62
    const/4 v12, 0x0

    .line 63
    const/4 v3, 0x0

    .line 64
    const/4 v4, 0x0

    .line 65
    const/4 v5, 0x0

    .line 66
    const/4 v6, 0x1

    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    const/4 v9, 0x0

    .line 70
    const/4 v10, 0x0

    .line 71
    .line 72
    .line 73
    invoke-static/range {v2 .. v12}, Lkf/a;->s(Ljava/lang/String;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 74
    move-result-object v1

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    move-object v1, p2

    .line 77
    .line 78
    .line 79
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const/16 v1, 0x20

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;->C3()Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;->getCurrency()Ljava/lang/String;

    .line 94
    move-result-object v1

    .line 95
    goto :goto_3

    .line 96
    :cond_3
    move-object v1, p2

    .line 97
    .line 98
    .line 99
    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->T3()Lft/c1;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    const-string v0, "--"

    .line 113
    .line 114
    if-eqz p1, :cond_6

    .line 115
    .line 116
    iget-object p1, p1, Lft/c1;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 117
    .line 118
    if-eqz p1, :cond_6

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;->C3()Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    if-eqz v1, :cond_5

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;->getFiatFee()Lcom/kubi/otc/entity/FiatFee;

    .line 128
    move-result-object v1

    .line 129
    .line 130
    if-eqz v1, :cond_5

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Lcom/kubi/otc/entity/FiatFee;->getFeeAmount()Ljava/lang/String;

    .line 134
    move-result-object v1

    .line 135
    goto :goto_4

    .line 136
    :cond_5
    move-object v1, p2

    .line 137
    .line 138
    .line 139
    :goto_4
    invoke-static {v1, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    move-result-object v1

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    .line 145
    .line 146
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->T3()Lft/c1;

    .line 147
    move-result-object p1

    .line 148
    .line 149
    if-eqz p1, :cond_8

    .line 150
    .line 151
    iget-object p1, p1, Lft/c1;->g:Lcom/kubi/resources/widget/BaseTextView;

    .line 152
    .line 153
    if-eqz p1, :cond_8

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;->C3()Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;

    .line 157
    move-result-object v1

    .line 158
    .line 159
    if-eqz v1, :cond_7

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;->getCurrency()Ljava/lang/String;

    .line 163
    move-result-object v1

    .line 164
    goto :goto_5

    .line 165
    :cond_7
    move-object v1, p2

    .line 166
    .line 167
    .line 168
    :goto_5
    invoke-static {v1, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 169
    move-result-object v1

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 173
    .line 174
    .line 175
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->T3()Lft/c1;

    .line 176
    move-result-object p1

    .line 177
    .line 178
    if-eqz p1, :cond_b

    .line 179
    .line 180
    iget-object p1, p1, Lft/c1;->i:Lcom/kubi/resources/widget/BaseTextView;

    .line 181
    .line 182
    if-eqz p1, :cond_b

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;->C3()Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;

    .line 186
    move-result-object v1

    .line 187
    .line 188
    if-eqz v1, :cond_9

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;->getAmount()Ljava/lang/String;

    .line 192
    move-result-object v1

    .line 193
    goto :goto_6

    .line 194
    :cond_9
    move-object v1, p2

    .line 195
    .line 196
    .line 197
    :goto_6
    invoke-static {v1}, Lht/y;->A(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 198
    move-result-object v1

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;->C3()Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;

    .line 202
    move-result-object v2

    .line 203
    .line 204
    if-eqz v2, :cond_a

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;->getFiatFee()Lcom/kubi/otc/entity/FiatFee;

    .line 208
    move-result-object v2

    .line 209
    .line 210
    if-eqz v2, :cond_a

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Lcom/kubi/otc/entity/FiatFee;->getFeeAmount()Ljava/lang/String;

    .line 214
    move-result-object v2

    .line 215
    goto :goto_7

    .line 216
    :cond_a
    move-object v2, p2

    .line 217
    .line 218
    .line 219
    :goto_7
    invoke-static {v2}, Lht/y;->A(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 220
    move-result-object v2

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v2}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 224
    move-result-object v1

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 228
    move-result-object v1

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    .line 233
    .line 234
    :cond_b
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->T3()Lft/c1;

    .line 235
    move-result-object p1

    .line 236
    .line 237
    if-eqz p1, :cond_d

    .line 238
    .line 239
    iget-object p1, p1, Lft/c1;->k:Lcom/kubi/resources/widget/BaseTextView;

    .line 240
    .line 241
    if-eqz p1, :cond_d

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;->C3()Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;

    .line 245
    move-result-object v1

    .line 246
    .line 247
    if-eqz v1, :cond_c

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1}, Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;->getCurrency()Ljava/lang/String;

    .line 251
    move-result-object p2

    .line 252
    .line 253
    .line 254
    :cond_c
    invoke-static {p2, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 255
    move-result-object p2

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 259
    .line 260
    .line 261
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->T3()Lft/c1;

    .line 262
    move-result-object p1

    .line 263
    .line 264
    if-eqz p1, :cond_e

    .line 265
    .line 266
    iget-object v0, p1, Lft/c1;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 267
    .line 268
    if-eqz v0, :cond_e

    .line 269
    .line 270
    new-instance v3, Lcom/kubi/otc/fiat/withdraw/birapi/a;

    .line 271
    .line 272
    .line 273
    invoke-direct {v3, p0}, Lcom/kubi/otc/fiat/withdraw/birapi/a;-><init>(Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;)V

    .line 274
    const/4 v4, 0x1

    .line 275
    const/4 v5, 0x0

    .line 276
    .line 277
    const-wide/16 v1, 0x0

    .line 278
    .line 279
    .line 280
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;->T3()Lft/c1;

    .line 284
    move-result-object p1

    .line 285
    .line 286
    if-eqz p1, :cond_f

    .line 287
    .line 288
    iget-object v0, p1, Lft/c1;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 289
    .line 290
    if-eqz v0, :cond_f

    .line 291
    .line 292
    new-instance v3, Lcom/kubi/otc/fiat/withdraw/birapi/b;

    .line 293
    .line 294
    .line 295
    invoke-direct {v3, p0}, Lcom/kubi/otc/fiat/withdraw/birapi/b;-><init>(Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;)V

    .line 296
    const/4 v4, 0x1

    .line 297
    const/4 v5, 0x0

    .line 298
    .line 299
    const-wide/16 v1, 0x0

    .line 300
    .line 301
    .line 302
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 303
    :cond_f
    return-void
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
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
