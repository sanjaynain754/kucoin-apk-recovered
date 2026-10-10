.class public final Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;
.super Lcom/kubi/sdk/base/ui/OldBaseFragment;
.source "FiatRechargeAdvCashInputFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 12\u00020\u0001:\u00011B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u001d\u001a\u00020\u001eH\u0014J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0008\u0010%\u001a\u00020 H\u0016J\u0008\u0010&\u001a\u00020 H\u0002J\u0019\u0010\'\u001a\u00020 2\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u0016H\u0002\u00a2\u0006\u0002\u0010)J\u0018\u0010*\u001a\u00020 2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010,H\u0002J\u0008\u0010-\u001a\u00020 H\u0002J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\n\u001a\u0004\u0008\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\n\u001a\u0004\u0008\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u00062"
    }
    d2 = {
        "Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;",
        "Lcom/kubi/sdk/base/ui/OldBaseFragment;",
        "<init>",
        "()V",
        "fiatApi",
        "Lcom/kubi/otc/api/FiatApi;",
        "kotlin.jvm.PlatformType",
        "getFiatApi",
        "()Lcom/kubi/otc/api/FiatApi;",
        "fiatApi$delegate",
        "Lkotlin/Lazy;",
        "recharge",
        "Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;",
        "getRecharge",
        "()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;",
        "recharge$delegate",
        "dayLimit",
        "Lcom/kubi/payment/common/helper/DayLimitHelper;",
        "getDayLimit",
        "()Lcom/kubi/payment/common/helper/DayLimitHelper;",
        "dayLimit$delegate",
        "isInputLimit",
        "",
        "binding",
        "Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeAdvcashInputBinding;",
        "getBinding",
        "()Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeAdvcashInputBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "getLayout",
        "",
        "onViewCreated",
        "",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onResume",
        "initView",
        "checkInput",
        "isCheck",
        "(Ljava/lang/Boolean;)V",
        "verifyDayLimit",
        "verifySuccess",
        "Lkotlin/Function0;",
        "trackCheckAdvcashLimit",
        "trackCheckAdvcashFee",
        "exception",
        "Lcom/kubi/network/retrofit/exception/ApiException;",
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
        "SMAP\nFiatRechargeAdvCashInputFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatRechargeAdvCashInputFragment.kt\ncom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,206:1\n147#2,16:207\n*S KotlinDebug\n*F\n+ 1 FiatRechargeAdvCashInputFragment.kt\ncom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment\n*L\n50#1:207,16\n*E\n"
    }
.end annotation


# static fields
.field public static final Z:Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic a0:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static b0:Z


# instance fields
.field public final U:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final V:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final W:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public X:Z

.field public final Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;
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
    const-string v1, "getBinding()Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeAdvcashInputBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;

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
    sput-object v1, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->a0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->Z:Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$Companion;

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
    invoke-direct {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/otc/fiat/recharge/advcash/o;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/otc/fiat/recharge/advcash/o;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->U:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/otc/fiat/recharge/advcash/p;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/kubi/otc/fiat/recharge/advcash/p;-><init>(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->V:Lkotlin/Lazy;

    .line 26
    .line 27
    new-instance v0, Lcom/kubi/otc/fiat/recharge/advcash/q;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Lcom/kubi/otc/fiat/recharge/advcash/q;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    iput-object v0, p0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->W:Lkotlin/Lazy;

    .line 37
    .line 38
    sget-object v0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$special$$inlined$viewBindingFragment$1;

    .line 39
    .line 40
    new-instance v1, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$special$$inlined$viewBindingFragment$2;

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    iput-object v0, p0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 50
    return-void
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

.method public static final A3()Lcom/kubi/payment/common/helper/DayLimitHelper;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/common/helper/DayLimitHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/payment/common/helper/DayLimitHelper;-><init>()V

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method private static final B3()Let/b;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Let/b;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Let/b;

    .line 13
    return-object v0
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

.method private final E3()Let/b;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->U:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Let/b;

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

.method public static final G3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->y3(Ljava/lang/Boolean;)V

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->X:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    return-object p0

    .line 13
    .line 14
    :cond_0
    new-instance v0, Lcom/kubi/otc/fiat/recharge/advcash/r;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0}, Lcom/kubi/otc/fiat/recharge/advcash/r;-><init>(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->P3(Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    return-object p0
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

.method public static final H3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)Lkotlin/Unit;
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showDialogLoading()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->E3()Let/b;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    sget-object v1, Lcom/kubi/otc/entity/FiatFee;->Companion:Lcom/kubi/otc/entity/FiatFee$Companion;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getFiatCurrency()Ljava/lang/String;

    .line 20
    move-result-object v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v2, v3

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 30
    move-result-object v4

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    iget-object v4, v4, Lft/s;->g:Lcom/kubi/otc/view/FiatEditTextView;

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Lcom/kubi/otc/view/FiatEditTextView;->getInputText()Ljava/lang/String;

    .line 40
    move-result-object v4

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v4, v3

    .line 43
    .line 44
    .line 45
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 46
    move-result-object v5

    .line 47
    .line 48
    if-eqz v5, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getChannelId()Ljava/lang/String;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    move-result-object v3

    .line 57
    .line 58
    const/16 v7, 0x10

    .line 59
    const/4 v8, 0x0

    .line 60
    .line 61
    const-string v5, "RECHARGE"

    .line 62
    const/4 v6, 0x0

    .line 63
    move-object v9, v4

    .line 64
    move-object v4, v3

    .line 65
    move-object v3, v9

    .line 66
    .line 67
    .line 68
    invoke-static/range {v1 .. v8}, Lcom/kubi/otc/entity/FiatFee$Companion;->getParams$default(Lcom/kubi/otc/entity/FiatFee$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/Map;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    .line 72
    invoke-interface {v0, v1}, Let/b;->k(Ljava/util/Map;)Lio/reactivex/Observable;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    new-instance v1, Lcom/kubi/otc/fiat/recharge/advcash/u;

    .line 84
    .line 85
    .line 86
    invoke-direct {v1, p0}, Lcom/kubi/otc/fiat/recharge/advcash/u;-><init>(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)V

    .line 87
    .line 88
    new-instance v2, Lcom/kubi/otc/fiat/recharge/advcash/l;

    .line 89
    .line 90
    .line 91
    invoke-direct {v2, v1}, Lcom/kubi/otc/fiat/recharge/advcash/l;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 92
    .line 93
    new-instance v1, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$a;

    .line 94
    .line 95
    .line 96
    invoke-direct {v1, p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$a;-><init>(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    const-string v1, "subscribe(...)"

    .line 103
    .line 104
    .line 105
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    .line 109
    move-result-object p0

    .line 110
    .line 111
    const-string v1, "getCompositeDisposable(...)"

    .line 112
    .line 113
    .line 114
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0, p0}, Lio/reactivex/rxkotlin/DisposableKt;->addTo(Lio/reactivex/disposables/Disposable;Lio/reactivex/disposables/CompositeDisposable;)Lio/reactivex/disposables/Disposable;

    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 120
    return-object p0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
.end method

.method public static final I3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Lcom/kubi/otc/entity/FiatFee;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->hideDialogLoading()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashConfirmFragment;->Y:Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashConfirmFragment$Companion;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 8
    .line 9
    const-string v2, "mContext"

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, p1}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->setFee(Lcom/kubi/otc/entity/FiatFee;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    iget-object p0, p0, Lft/s;->g:Lcom/kubi/otc/view/FiatEditTextView;

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/kubi/otc/view/FiatEditTextView;->getInputText()Ljava/lang/String;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {v2, v3}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->setAmount(Ljava/lang/String;)V

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v2, v3

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual {v0, v1, v2}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashConfirmFragment$Companion;->startFragment(Landroid/content/Context;Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;)V

    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 49
    return-object p0
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

.method public static final J3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static final K3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    .line 2
    sget-object p1, Lcom/kubi/otc/fiat/FiatHistoryListFragment;->Z:Lcom/kubi/otc/fiat/FiatHistoryListFragment$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getFiatCurrency()Ljava/lang/String;

    .line 13
    move-result-object p0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object p0, v0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object p0

    .line 20
    const/4 v1, 0x2

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p0, v0, v1, v0}, Lcom/kubi/otc/fiat/FiatHistoryListFragment$Companion;->startFragment$default(Lcom/kubi/otc/fiat/FiatHistoryListFragment$Companion;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)V

    .line 24
    return-void
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

.method public static final L3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Ljava/math/BigDecimal;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 p1, 0x0

    .line 7
    const/4 v0, 0x1

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1, v0, p1}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->z3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Ljava/lang/Boolean;ILjava/lang/Object;)V

    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    return-object p0
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

.method public static final M3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-string v0, "data"

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, Lcom/kubi/router/utils/RouteExKt;->t(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    check-cast p0, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

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

.method public static final Q3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lft/s;->g:Lcom/kubi/otc/view/FiatEditTextView;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/kubi/otc/view/FiatEditTextView;->setInputText(Ljava/lang/String;)V

    .line 19
    .line 20
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    return-object p0
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

.method public static final R3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->hideDialogLoading()V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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

.method private final initView()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    sget v2, Lcom/kubi/otc/R$string;->legal_account_deposit_currency:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 13
    move-result-object v3

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getFiatCurrency()Ljava/lang/String;

    .line 19
    move-result-object v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v3, v1

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    .line 28
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v2, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2}, Lcom/kubi/resources/widget/NavigationBar;->setMainTitle(Ljava/lang/String;)V

    .line 37
    .line 38
    sget v2, Lcom/kubi/otc/R$drawable;->ic_history_24:I

    .line 39
    .line 40
    new-instance v3, Lcom/kubi/otc/fiat/recharge/advcash/k;

    .line 41
    .line 42
    .line 43
    invoke-direct {v3, p0}, Lcom/kubi/otc/fiat/recharge/advcash/k;-><init>(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2, v3}, Lcom/kubi/resources/widget/NavigationBar;->g(ILandroid/view/View$OnClickListener;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    iget-object v0, v0, Lft/s;->g:Lcom/kubi/otc/view/FiatEditTextView;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    new-instance v2, Lcom/kubi/otc/fiat/recharge/advcash/m;

    .line 59
    .line 60
    .line 61
    invoke-direct {v2, p0}, Lcom/kubi/otc/fiat/recharge/advcash/m;-><init>(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p0, v2}, Lcom/kubi/otc/view/FiatEditTextView;->o(Lcom/kubi/sdk/base/ui/g;Lkotlin/jvm/functions/Function1;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object v2, v0, Lft/s;->c:Lcom/kubi/resources/widget/BaseTextView;

    .line 73
    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    new-instance v5, Lcom/kubi/otc/fiat/recharge/advcash/n;

    .line 77
    .line 78
    .line 79
    invoke-direct {v5, p0}, Lcom/kubi/otc/fiat/recharge/advcash/n;-><init>(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)V

    .line 80
    const/4 v6, 0x1

    .line 81
    const/4 v7, 0x0

    .line 82
    .line 83
    const-wide/16 v3, 0x0

    .line 84
    .line 85
    .line 86
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    iget-object v0, v0, Lft/s;->g:Lcom/kubi/otc/view/FiatEditTextView;

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 100
    move-result-object v2

    .line 101
    .line 102
    if-eqz v2, :cond_4

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getFiatCurrency()Ljava/lang/String;

    .line 106
    move-result-object v2

    .line 107
    goto :goto_1

    .line 108
    :cond_4
    move-object v2, v1

    .line 109
    .line 110
    .line 111
    :goto_1
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    move-result-object v2

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v2}, Lcom/kubi/otc/view/FiatEditTextView;->setCurrency(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 119
    move-result-object v0

    .line 120
    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    iget-object v0, v0, Lft/s;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 124
    .line 125
    if-eqz v0, :cond_7

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 129
    move-result-object v2

    .line 130
    .line 131
    if-eqz v2, :cond_6

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getPaymentName()Ljava/lang/String;

    .line 135
    move-result-object v2

    .line 136
    .line 137
    if-eqz v2, :cond_6

    .line 138
    .line 139
    .line 140
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    move-result-object v2

    .line 142
    goto :goto_2

    .line 143
    :cond_6
    move-object v2, v1

    .line 144
    .line 145
    .line 146
    :goto_2
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 150
    move-result-object v0

    .line 151
    .line 152
    if-eqz v0, :cond_9

    .line 153
    .line 154
    iget-object v0, v0, Lft/s;->b:Landroid/widget/ImageView;

    .line 155
    .line 156
    if-eqz v0, :cond_9

    .line 157
    .line 158
    iget-object v2, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 159
    .line 160
    .line 161
    invoke-static {v2}, Lxy/a;->a(Landroid/content/Context;)Lxy/d;

    .line 162
    move-result-object v2

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 166
    move-result-object v3

    .line 167
    .line 168
    if-eqz v3, :cond_8

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getPaymentIcon()Ljava/lang/String;

    .line 172
    move-result-object v1

    .line 173
    .line 174
    .line 175
    :cond_8
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    move-result-object v1

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v1}, Lxy/d;->N(Ljava/lang/String;)Lxy/c;

    .line 180
    move-result-object v1

    .line 181
    .line 182
    sget v2, Lcom/kubi/otc/R$mipmap;->kucoin_icon_default_icon:I

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, v2}, Lxy/c;->q1(I)Lxy/c;

    .line 186
    move-result-object v1

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v2}, Lxy/c;->a1(I)Lxy/c;

    .line 190
    move-result-object v1

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1, v0}, Lcom/bumptech/glide/g;->E0(Landroid/widget/ImageView;)Lm2/k;

    .line 194
    :cond_9
    return-void
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

.method public static synthetic k3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->H3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)Lkotlin/Unit;

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

.method public static synthetic l3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->J3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static synthetic m3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->Q3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Ljava/lang/String;)Lkotlin/Unit;

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

.method public static synthetic n3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->G3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)Lkotlin/Unit;

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

.method public static synthetic o3()Let/b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->B3()Let/b;

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

.method public static synthetic p3()Lcom/kubi/payment/common/helper/DayLimitHelper;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->A3()Lcom/kubi/payment/common/helper/DayLimitHelper;

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

.method public static synthetic q3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Lcom/kubi/otc/entity/FiatFee;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->I3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Lcom/kubi/otc/entity/FiatFee;)Lkotlin/Unit;

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

.method public static synthetic r3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->K3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Landroid/view/View;)V

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

.method public static synthetic s3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->R3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)Lkotlin/Unit;

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

.method public static synthetic t3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Ljava/math/BigDecimal;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->L3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Ljava/math/BigDecimal;)Lkotlin/Unit;

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

.method public static synthetic u3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->M3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

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

.method public static final synthetic v3()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->b0:Z

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

.method public static final synthetic w3(Z)V
    .locals 0

    .line 1
    .line 2
    sput-boolean p0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->b0:Z

    .line 3
    return-void
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

.method public static final synthetic x3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Lcom/kubi/network/retrofit/exception/ApiException;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->N3(Lcom/kubi/network/retrofit/exception/ApiException;)V

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

.method public static synthetic z3(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;Ljava/lang/Boolean;ILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p2, p2, 0x1

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->y3(Ljava/lang/Boolean;)V

    .line 10
    return-void
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
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
.end method


# virtual methods
.method public final C3()Lft/s;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->a0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lft/s;

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

.method public final D3()Lcom/kubi/payment/common/helper/DayLimitHelper;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->W:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/payment/common/helper/DayLimitHelper;

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

.method public final F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->V:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

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

.method public final N3(Lcom/kubi/network/retrofit/exception/ApiException;)V
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/track/IPaymentTrack;->a:Lcom/kubi/payment/track/IPaymentTrack$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/payment/track/IPaymentTrack$Companion;->getTrack()Lcom/kubi/payment/track/IPaymentTrack;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    iget-object v2, p1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const/16 v2, 0x3a

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    new-instance v5, Lcom/kubi/payment/track/RechargeTrackData;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 38
    move-result-object p1

    .line 39
    const/4 v0, 0x0

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getChannelId()Ljava/lang/String;

    .line 45
    move-result-object p1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object p1, v0

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-direct {v5, p1}, Lcom/kubi/payment/track/RechargeTrackData;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getFiatCurrency()Ljava/lang/String;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {v5, v0}, Lcom/kubi/payment/track/PaymentTrackData;->setFiatCurrency(Ljava/lang/String;)V

    .line 64
    .line 65
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 66
    const/4 v6, 0x2

    .line 67
    const/4 v7, 0x0

    .line 68
    .line 69
    const-string v2, "CHECK_ADVCASH_FEE"

    .line 70
    const/4 v3, 0x0

    .line 71
    .line 72
    .line 73
    invoke-static/range {v1 .. v7}, Lcom/kubi/payment/track/IPaymentTrack;->e(Lcom/kubi/payment/track/IPaymentTrack;Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/payment/track/RechargeTrackData;ILjava/lang/Object;)V

    .line 74
    return-void
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
.end method

.method public final O3()V
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/track/IPaymentTrack;->a:Lcom/kubi/payment/track/IPaymentTrack$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/payment/track/IPaymentTrack$Companion;->getTrack()Lcom/kubi/payment/track/IPaymentTrack;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    new-instance v5, Lcom/kubi/payment/track/RechargeTrackData;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getChannelId()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v0, v2

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-direct {v5, v0}, Lcom/kubi/payment/track/RechargeTrackData;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getFiatCurrency()Ljava/lang/String;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {v5, v2}, Lcom/kubi/payment/track/PaymentTrackData;->setFiatCurrency(Ljava/lang/String;)V

    .line 38
    .line 39
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 40
    const/4 v6, 0x2

    .line 41
    const/4 v7, 0x0

    .line 42
    .line 43
    const-string v2, "CHECK_ADVCASH_LIMIT"

    .line 44
    const/4 v3, 0x0

    .line 45
    .line 46
    const-string v4, "-10003:CHECK_ADVCASH_LIMIT"

    .line 47
    .line 48
    .line 49
    invoke-static/range {v1 .. v7}, Lcom/kubi/payment/track/IPaymentTrack;->e(Lcom/kubi/payment/track/IPaymentTrack;Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/payment/track/RechargeTrackData;ILjava/lang/Object;)V

    .line 50
    return-void
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

.method public final P3(Lkotlin/jvm/functions/Function0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showDialogLoading()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->D3()Lcom/kubi/payment/common/helper/DayLimitHelper;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, v1, Lft/s;->g:Lcom/kubi/otc/view/FiatEditTextView;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/kubi/otc/view/FiatEditTextView;->getInputText()Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v1, v2

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getFiatCurrency()Ljava/lang/String;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 46
    move-result-object v4

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 50
    move-result-object v5

    .line 51
    .line 52
    const-string v3, "getChildFragmentManager(...)"

    .line 53
    .line 54
    .line 55
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    new-instance v7, Lcom/kubi/otc/fiat/recharge/advcash/s;

    .line 58
    .line 59
    .line 60
    invoke-direct {v7, p0}, Lcom/kubi/otc/fiat/recharge/advcash/s;-><init>(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)V

    .line 61
    .line 62
    new-instance v8, Lcom/kubi/otc/fiat/recharge/advcash/t;

    .line 63
    .line 64
    .line 65
    invoke-direct {v8, p0}, Lcom/kubi/otc/fiat/recharge/advcash/t;-><init>(Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;)V

    .line 66
    .line 67
    const-string v3, "RECHARGE"

    .line 68
    move-object v6, p1

    .line 69
    .line 70
    .line 71
    invoke-virtual/range {v0 .. v8}, Lcom/kubi/payment/common/helper/DayLimitHelper;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/m0;Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 72
    return-void
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
.end method

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$layout;->botc_fragment_fiat_recharge_advcash_input:I

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

.method public onResume()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onResume()V

    .line 4
    .line 5
    sget-boolean v0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->b0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lft/s;->g:Lcom/kubi/otc/view/FiatEditTextView;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v1, ""

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/kubi/otc/view/FiatEditTextView;->setInputText(Ljava/lang/String;)V

    .line 23
    :cond_0
    return-void
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
    .locals 1
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
    invoke-direct {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->initView()V

    .line 12
    return-void
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

.method public final y3(Ljava/lang/Boolean;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lft/s;->g:Lcom/kubi/otc/view/FiatEditTextView;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/kubi/otc/view/FiatEditTextView;->getInputText()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v1

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-static {v0}, Lht/y;->A(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 25
    move-result p1

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    sget-object p1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 33
    move-result p1

    .line 34
    .line 35
    if-eqz p1, :cond_9

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->isLimitFiat(Ljava/math/BigDecimal;)Z

    .line 45
    move-result p1

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    move-result-object p1

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object p1, v1

    .line 52
    .line 53
    .line 54
    :goto_1
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 55
    move-result p1

    .line 56
    .line 57
    if-eqz p1, :cond_9

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    iget-object p1, p1, Lft/s;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 66
    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    if-eqz p1, :cond_7

    .line 77
    .line 78
    iget-object p1, p1, Lft/s;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 79
    .line 80
    if-eqz p1, :cond_7

    .line 81
    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    sget v2, Lcom/kubi/otc/R$string;->pay_fast_sell_limit_tip:I

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    if-eqz v3, :cond_4

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getMinFiatAmount()Ljava/lang/String;

    .line 97
    move-result-object v3

    .line 98
    goto :goto_2

    .line 99
    :cond_4
    move-object v3, v1

    .line 100
    .line 101
    .line 102
    :goto_2
    invoke-static {v3}, Lht/y;->A(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 103
    move-result-object v3

    .line 104
    .line 105
    .line 106
    invoke-static {v3}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 107
    move-result-object v3

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 111
    move-result-object v3

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 115
    move-result-object v4

    .line 116
    .line 117
    if-eqz v4, :cond_5

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getMaxFiatAmount()Ljava/lang/String;

    .line 121
    move-result-object v4

    .line 122
    goto :goto_3

    .line 123
    :cond_5
    move-object v4, v1

    .line 124
    .line 125
    .line 126
    :goto_3
    invoke-static {v4}, Lht/y;->A(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 127
    move-result-object v4

    .line 128
    .line 129
    .line 130
    invoke-static {v4}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 131
    move-result-object v4

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 135
    move-result-object v4

    .line 136
    .line 137
    .line 138
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 139
    move-result-object v3

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, v2, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    move-result-object v2

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const/16 v2, 0x20

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->F3()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;

    .line 155
    move-result-object v2

    .line 156
    .line 157
    if-eqz v2, :cond_6

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;->getFiatCurrency()Ljava/lang/String;

    .line 161
    move-result-object v1

    .line 162
    .line 163
    .line 164
    :cond_6
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    move-result-object v1

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    move-result-object v0

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    .line 177
    .line 178
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 179
    move-result-object p1

    .line 180
    .line 181
    if-eqz p1, :cond_8

    .line 182
    .line 183
    iget-object p1, p1, Lft/s;->g:Lcom/kubi/otc/view/FiatEditTextView;

    .line 184
    .line 185
    if-eqz p1, :cond_8

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Lcom/kubi/otc/view/FiatEditTextView;->A()V

    .line 189
    :cond_8
    const/4 p1, 0x1

    .line 190
    .line 191
    iput-boolean p1, p0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->X:Z

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->O3()V

    .line 195
    return-void

    .line 196
    .line 197
    .line 198
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 199
    move-result-object p1

    .line 200
    .line 201
    if-eqz p1, :cond_a

    .line 202
    .line 203
    iget-object p1, p1, Lft/s;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 204
    .line 205
    if-eqz p1, :cond_a

    .line 206
    .line 207
    .line 208
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 209
    .line 210
    .line 211
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->C3()Lft/s;

    .line 212
    move-result-object p1

    .line 213
    .line 214
    if-eqz p1, :cond_b

    .line 215
    .line 216
    iget-object p1, p1, Lft/s;->g:Lcom/kubi/otc/view/FiatEditTextView;

    .line 217
    .line 218
    if-eqz p1, :cond_b

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1}, Lcom/kubi/otc/view/FiatEditTextView;->z()V

    .line 222
    :cond_b
    const/4 p1, 0x0

    .line 223
    .line 224
    iput-boolean p1, p0, Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;->X:Z

    .line 225
    return-void
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
.end method
