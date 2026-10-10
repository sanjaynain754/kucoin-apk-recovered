.class public final Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;
.super Lcom/kubi/sdk/base/ui/OldBaseFragment;
.source "FiatWithdrawStatusFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0016\u001a\u00020\u0017H\u0014J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00192\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0008\u0010!\u001a\u00020\u0019H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u001b\u0010\u000b\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\n\u001a\u0004\u0008\r\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006#"
    }
    d2 = {
        "Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;",
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
        "orderId",
        "",
        "getOrderId",
        "()Ljava/lang/String;",
        "orderId$delegate",
        "binding",
        "Lcom/kubi/otc/databinding/BotcFragmentFiatWithdrawStatusBinding;",
        "getBinding",
        "()Lcom/kubi/otc/databinding/BotcFragmentFiatWithdrawStatusBinding;",
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
        "initData",
        "data",
        "Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;",
        "getWithdrawOrderDetails",
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
        "SMAP\nFiatWithdrawStatusFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatWithdrawStatusFragment.kt\ncom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,223:1\n147#2,16:224\n*S KotlinDebug\n*F\n+ 1 FiatWithdrawStatusFragment.kt\ncom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment\n*L\n41#1:224,16\n*E\n"
    }
.end annotation


# static fields
.field public static final X:Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic Y:[Lkotlin/reflect/KProperty;
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
.field public final U:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final V:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final W:Lcom/kubi/sdk/viewbindingdelegate/base/a;
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
    const-string v1, "getBinding()Lcom/kubi/otc/databinding/BotcFragmentFiatWithdrawStatusBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;

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
    sput-object v1, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->Y:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->X:Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment$Companion;

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
    new-instance v0, Lcom/kubi/otc/fiat/withdraw/t1;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/otc/fiat/withdraw/t1;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->U:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/otc/fiat/withdraw/u1;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/kubi/otc/fiat/withdraw/u1;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->V:Lkotlin/Lazy;

    .line 26
    .line 27
    sget-object v0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment$special$$inlined$viewBindingFragment$1;

    .line 28
    .line 29
    new-instance v1, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment$special$$inlined$viewBindingFragment$2;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    iput-object v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->W:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 39
    return-void
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

.method public static synthetic A3()Let/b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->C3()Let/b;

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

.method public static synthetic B3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->T3()Lkotlin/Unit;

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

.method private static final C3()Let/b;
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
    iget-object v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->U:Lkotlin/Lazy;

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

.method private final F3()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->E3()Let/b;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->getOrderId()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Let/b;->d(Ljava/lang/String;)Lio/reactivex/Observable;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    new-instance v1, Lcom/kubi/otc/fiat/withdraw/h1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, p0}, Lcom/kubi/otc/fiat/withdraw/h1;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)V

    .line 26
    .line 27
    new-instance v2, Lcom/kubi/otc/fiat/withdraw/q1;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2, v1}, Lcom/kubi/otc/fiat/withdraw/q1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnSubscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    new-instance v1, Lcom/kubi/otc/fiat/withdraw/r1;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, p0}, Lcom/kubi/otc/fiat/withdraw/r1;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)V

    .line 40
    .line 41
    new-instance v2, Lcom/kubi/otc/fiat/withdraw/s1;

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, v1}, Lcom/kubi/otc/fiat/withdraw/s1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 45
    .line 46
    new-instance v1, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment$a;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment$a;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    const-string v1, "subscribe(...)"

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    const-string v2, "getCompositeDisposable(...)"

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1}, Lio/reactivex/rxkotlin/DisposableKt;->addTo(Lio/reactivex/disposables/Disposable;Lio/reactivex/disposables/CompositeDisposable;)Lio/reactivex/disposables/Disposable;

    .line 71
    return-void
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

.method public static final G3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;Lio/reactivex/disposables/Disposable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showDialogLoading()V

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

.method public static final H3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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

.method public static final I3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->hideDialogLoading()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;->isShowProcess()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;->setShowProSuccess(Ljava/lang/Boolean;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->K3(Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;)V

    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    return-object p0
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

.method public static final L3()Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    const/16 v5, 0xf

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v6}, Lg00/f$a;->b(Lg00/f;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 13
    .line 14
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    return-object v0
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

.method public static final M3()Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    const/4 v4, 0x7

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Lg00/e$a;->a(Lg00/e;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 11
    .line 12
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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

.method public static final N3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawOrderDetailFragment;->X:Lcom/kubi/otc/fiat/withdraw/FiatWithdrawOrderDetailFragment$Companion;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->getOrderId()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawOrderDetailFragment$Companion;->startFragment(Ljava/lang/String;)V

    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    return-object p0
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

.method public static final O3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->F3()V

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

.method public static final P3()Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    const/16 v5, 0xf

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v6}, Lg00/f$a;->b(Lg00/f;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 13
    .line 14
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    return-object v0
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

.method public static final Q3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawOrderDetailFragment;->X:Lcom/kubi/otc/fiat/withdraw/FiatWithdrawOrderDetailFragment$Companion;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->getOrderId()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawOrderDetailFragment$Companion;->startFragment(Ljava/lang/String;)V

    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    return-object p0
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

.method public static final R3()Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    const/16 v5, 0xf

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v6}, Lg00/f$a;->b(Lg00/f;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 13
    .line 14
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    return-object v0
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

.method public static final S3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->preformBackPressed()V

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

.method public static final T3()Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    const/16 v5, 0xf

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v6}, Lg00/f$a;->b(Lg00/f;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 13
    .line 14
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    return-object v0
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

.method public static final U3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->preformBackPressed()V

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

.method public static final V3()Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    const/16 v5, 0xf

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v6}, Lg00/f$a;->b(Lg00/f;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 13
    .line 14
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    return-object v0
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

.method public static final W3()Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    const/4 v4, 0x7

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Lg00/e$a;->a(Lg00/e;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 11
    .line 12
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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

.method public static final X3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Ljava/lang/String;
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
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
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

.method private final getOrderId()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->V:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

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

.method public static synthetic k3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->U3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;

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

.method public static synthetic l3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->W3()Lkotlin/Unit;

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

.method public static synthetic m3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->N3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;

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

.method public static synthetic n3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->R3()Lkotlin/Unit;

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

.method public static synthetic o3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->O3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;

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

.method public static synthetic p3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->I3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;)Lkotlin/Unit;

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

.method public static synthetic q3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->M3()Lkotlin/Unit;

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

.method public static synthetic r3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->V3()Lkotlin/Unit;

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

.method public static synthetic s3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->L3()Lkotlin/Unit;

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

.method public static synthetic t3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->Q3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;

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

.method public static synthetic u3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->P3()Lkotlin/Unit;

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

.method public static synthetic v3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;Lio/reactivex/disposables/Disposable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->G3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;Lio/reactivex/disposables/Disposable;)Lkotlin/Unit;

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

.method public static synthetic w3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->J3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static synthetic x3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->H3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static synthetic y3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->X3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Ljava/lang/String;

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

.method public static synthetic z3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->S3(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)Lkotlin/Unit;

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


# virtual methods
.method public final D3()Lft/z;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->W:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->Y:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lft/z;

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

.method public final K3(Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;)V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;->getStatus()Ljava/lang/String;

    .line 9
    move-result-object v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v2, v1

    .line 12
    .line 13
    :goto_0
    const/16 v3, 0x20

    .line 14
    .line 15
    if-eqz v2, :cond_2f

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 19
    move-result v4

    .line 20
    .line 21
    .line 22
    packed-switch v4, :pswitch_data_0

    .line 23
    .line 24
    :pswitch_0
    goto/16 :goto_4

    .line 25
    .line 26
    :pswitch_1
    const-string v4, "5"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    move-result v2

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    iget-object v1, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    iget-object v1, v1, Lft/z;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 56
    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    if-eqz v1, :cond_4

    .line 67
    .line 68
    iget-object v1, v1, Lft/z;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 69
    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    if-eqz v1, :cond_5

    .line 80
    .line 81
    iget-object v1, v1, Lft/z;->b:Landroid/widget/ImageView;

    .line 82
    .line 83
    if-eqz v1, :cond_5

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    if-eqz v1, :cond_6

    .line 93
    .line 94
    iget-object v1, v1, Lft/z;->c:Landroid/widget/ImageView;

    .line 95
    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    sget v2, Lcom/kubi/otc/R$mipmap;->botc_ic_fiat_withdraw_process:I

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 102
    .line 103
    .line 104
    :cond_6
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    if-eqz v1, :cond_7

    .line 108
    .line 109
    iget-object v1, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 110
    .line 111
    if-eqz v1, :cond_7

    .line 112
    .line 113
    sget v2, Lcom/kubi/otc/R$string;->pay_fiat_withdraw_result_back_to_assets:I

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 117
    move-result-object v2

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    .line 122
    .line 123
    :cond_7
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 124
    move-result-object v1

    .line 125
    .line 126
    if-eqz v1, :cond_8

    .line 127
    .line 128
    iget-object v1, v1, Lft/z;->g:Lcom/kubi/resources/widget/BaseTextView;

    .line 129
    .line 130
    if-eqz v1, :cond_8

    .line 131
    .line 132
    sget v2, Lcom/kubi/otc/R$string;->pay_fiat_capitual_detail_processing:I

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 136
    move-result-object v2

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    .line 141
    .line 142
    :cond_8
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 143
    move-result-object v1

    .line 144
    .line 145
    if-eqz v1, :cond_9

    .line 146
    .line 147
    iget-object v1, v1, Lft/z;->h:Lcom/kubi/resources/widget/BaseTextView;

    .line 148
    .line 149
    if-eqz v1, :cond_9

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;->getStatusMessage()Ljava/lang/String;

    .line 153
    move-result-object v2

    .line 154
    .line 155
    .line 156
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    move-result-object v2

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    .line 162
    .line 163
    :cond_9
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 164
    move-result-object v1

    .line 165
    .line 166
    if-eqz v1, :cond_a

    .line 167
    .line 168
    iget-object v2, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 169
    .line 170
    if-eqz v2, :cond_a

    .line 171
    .line 172
    new-instance v5, Lcom/kubi/otc/fiat/withdraw/n1;

    .line 173
    .line 174
    .line 175
    invoke-direct {v5}, Lcom/kubi/otc/fiat/withdraw/n1;-><init>()V

    .line 176
    const/4 v6, 0x1

    .line 177
    const/4 v7, 0x0

    .line 178
    .line 179
    const-wide/16 v3, 0x0

    .line 180
    .line 181
    .line 182
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :cond_a
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 186
    move-result-object v1

    .line 187
    .line 188
    if-eqz v1, :cond_43

    .line 189
    .line 190
    iget-object v2, v1, Lft/z;->b:Landroid/widget/ImageView;

    .line 191
    .line 192
    if-eqz v2, :cond_43

    .line 193
    .line 194
    new-instance v5, Lcom/kubi/otc/fiat/withdraw/o1;

    .line 195
    .line 196
    .line 197
    invoke-direct {v5}, Lcom/kubi/otc/fiat/withdraw/o1;-><init>()V

    .line 198
    const/4 v6, 0x1

    .line 199
    const/4 v7, 0x0

    .line 200
    .line 201
    const-wide/16 v3, 0x0

    .line 202
    .line 203
    .line 204
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 205
    return-void

    .line 206
    .line 207
    :pswitch_2
    const-string v4, "4"

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    move-result v2

    .line 212
    .line 213
    if-nez v2, :cond_b

    .line 214
    .line 215
    goto/16 :goto_4

    .line 216
    .line 217
    .line 218
    :cond_b
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 219
    move-result-object v1

    .line 220
    .line 221
    if-eqz v1, :cond_c

    .line 222
    .line 223
    iget-object v1, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 224
    .line 225
    if-eqz v1, :cond_c

    .line 226
    .line 227
    .line 228
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 229
    .line 230
    .line 231
    :cond_c
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 232
    move-result-object v1

    .line 233
    .line 234
    if-eqz v1, :cond_d

    .line 235
    .line 236
    iget-object v1, v1, Lft/z;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 237
    .line 238
    if-eqz v1, :cond_d

    .line 239
    .line 240
    .line 241
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 242
    .line 243
    .line 244
    :cond_d
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 245
    move-result-object v1

    .line 246
    .line 247
    if-eqz v1, :cond_e

    .line 248
    .line 249
    iget-object v1, v1, Lft/z;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 250
    .line 251
    if-eqz v1, :cond_e

    .line 252
    .line 253
    .line 254
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 255
    .line 256
    .line 257
    :cond_e
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 258
    move-result-object v1

    .line 259
    .line 260
    if-eqz v1, :cond_f

    .line 261
    .line 262
    iget-object v1, v1, Lft/z;->b:Landroid/widget/ImageView;

    .line 263
    .line 264
    if-eqz v1, :cond_f

    .line 265
    .line 266
    .line 267
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 268
    .line 269
    .line 270
    :cond_f
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 271
    move-result-object v1

    .line 272
    .line 273
    if-eqz v1, :cond_10

    .line 274
    .line 275
    iget-object v1, v1, Lft/z;->c:Landroid/widget/ImageView;

    .line 276
    .line 277
    if-eqz v1, :cond_10

    .line 278
    .line 279
    sget v2, Lcom/kubi/otc/R$mipmap;->botc_ic_fiat_withdraw_fail:I

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 283
    .line 284
    .line 285
    :cond_10
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 286
    move-result-object v1

    .line 287
    .line 288
    if-eqz v1, :cond_11

    .line 289
    .line 290
    iget-object v1, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 291
    .line 292
    if-eqz v1, :cond_11

    .line 293
    .line 294
    sget v2, Lcom/kubi/otc/R$string;->fast_result_buy_again:I

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 298
    move-result-object v2

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 302
    .line 303
    .line 304
    :cond_11
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 305
    move-result-object v1

    .line 306
    .line 307
    if-eqz v1, :cond_12

    .line 308
    .line 309
    iget-object v1, v1, Lft/z;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 310
    .line 311
    if-eqz v1, :cond_12

    .line 312
    .line 313
    sget v2, Lcom/kubi/otc/R$string;->pay_fiat_withdraw_result_back_to_assets:I

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 317
    move-result-object v2

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 321
    .line 322
    .line 323
    :cond_12
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;->getStatusMessage()Ljava/lang/String;

    .line 324
    move-result-object v1

    .line 325
    .line 326
    .line 327
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 328
    move-result-object v1

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 332
    move-result-object v2

    .line 333
    .line 334
    if-eqz v2, :cond_13

    .line 335
    .line 336
    iget-object v2, v2, Lft/z;->g:Lcom/kubi/resources/widget/BaseTextView;

    .line 337
    .line 338
    if-eqz v2, :cond_13

    .line 339
    .line 340
    sget v3, Lcom/kubi/otc/R$string;->pay_capitual_withdraw_result_rejected_title:I

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 344
    move-result-object v3

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 348
    .line 349
    .line 350
    :cond_13
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 351
    move-result-object v2

    .line 352
    .line 353
    if-eqz v2, :cond_15

    .line 354
    .line 355
    iget-object v2, v2, Lft/z;->h:Lcom/kubi/resources/widget/BaseTextView;

    .line 356
    .line 357
    if-eqz v2, :cond_15

    .line 358
    .line 359
    .line 360
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 361
    move-result v3

    .line 362
    .line 363
    if-lez v3, :cond_14

    .line 364
    goto :goto_1

    .line 365
    .line 366
    :cond_14
    sget v1, Lcom/kubi/otc/R$string;->pay_capitual_withdraw_result_rejected_subtitle:I

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 370
    move-result-object v1

    .line 371
    .line 372
    .line 373
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    :goto_1
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 377
    .line 378
    .line 379
    :cond_15
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 380
    move-result-object v1

    .line 381
    .line 382
    if-eqz v1, :cond_16

    .line 383
    .line 384
    iget-object v2, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 385
    .line 386
    if-eqz v2, :cond_16

    .line 387
    .line 388
    new-instance v5, Lcom/kubi/otc/fiat/withdraw/k1;

    .line 389
    .line 390
    .line 391
    invoke-direct {v5, v0}, Lcom/kubi/otc/fiat/withdraw/k1;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)V

    .line 392
    const/4 v6, 0x1

    .line 393
    const/4 v7, 0x0

    .line 394
    .line 395
    const-wide/16 v3, 0x0

    .line 396
    .line 397
    .line 398
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    :cond_16
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 402
    move-result-object v1

    .line 403
    .line 404
    if-eqz v1, :cond_17

    .line 405
    .line 406
    iget-object v2, v1, Lft/z;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 407
    .line 408
    if-eqz v2, :cond_17

    .line 409
    .line 410
    new-instance v5, Lcom/kubi/otc/fiat/withdraw/l1;

    .line 411
    .line 412
    .line 413
    invoke-direct {v5}, Lcom/kubi/otc/fiat/withdraw/l1;-><init>()V

    .line 414
    const/4 v6, 0x1

    .line 415
    const/4 v7, 0x0

    .line 416
    .line 417
    const-wide/16 v3, 0x0

    .line 418
    .line 419
    .line 420
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    :cond_17
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 424
    move-result-object v1

    .line 425
    .line 426
    if-eqz v1, :cond_43

    .line 427
    .line 428
    iget-object v2, v1, Lft/z;->b:Landroid/widget/ImageView;

    .line 429
    .line 430
    if-eqz v2, :cond_43

    .line 431
    .line 432
    new-instance v5, Lcom/kubi/otc/fiat/withdraw/m1;

    .line 433
    .line 434
    .line 435
    invoke-direct {v5}, Lcom/kubi/otc/fiat/withdraw/m1;-><init>()V

    .line 436
    const/4 v6, 0x1

    .line 437
    const/4 v7, 0x0

    .line 438
    .line 439
    const-wide/16 v3, 0x0

    .line 440
    .line 441
    .line 442
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 443
    return-void

    .line 444
    .line 445
    :pswitch_3
    const-string v4, "2"

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 449
    move-result v2

    .line 450
    .line 451
    if-nez v2, :cond_18

    .line 452
    .line 453
    goto/16 :goto_4

    .line 454
    .line 455
    .line 456
    :cond_18
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 457
    move-result-object v1

    .line 458
    .line 459
    if-eqz v1, :cond_19

    .line 460
    .line 461
    iget-object v1, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 462
    .line 463
    if-eqz v1, :cond_19

    .line 464
    .line 465
    .line 466
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 467
    .line 468
    .line 469
    :cond_19
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 470
    move-result-object v1

    .line 471
    .line 472
    if-eqz v1, :cond_1a

    .line 473
    .line 474
    iget-object v1, v1, Lft/z;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 475
    .line 476
    if-eqz v1, :cond_1a

    .line 477
    .line 478
    .line 479
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 480
    .line 481
    .line 482
    :cond_1a
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 483
    move-result-object v1

    .line 484
    .line 485
    if-eqz v1, :cond_1b

    .line 486
    .line 487
    iget-object v1, v1, Lft/z;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 488
    .line 489
    if-eqz v1, :cond_1b

    .line 490
    .line 491
    .line 492
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 493
    .line 494
    .line 495
    :cond_1b
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 496
    move-result-object v1

    .line 497
    .line 498
    if-eqz v1, :cond_1c

    .line 499
    .line 500
    iget-object v1, v1, Lft/z;->c:Landroid/widget/ImageView;

    .line 501
    .line 502
    if-eqz v1, :cond_1c

    .line 503
    .line 504
    sget v2, Lcom/kubi/otc/R$mipmap;->botc_ic_fiat_withdraw_fail:I

    .line 505
    .line 506
    .line 507
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 508
    .line 509
    .line 510
    :cond_1c
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 511
    move-result-object v1

    .line 512
    .line 513
    if-eqz v1, :cond_1d

    .line 514
    .line 515
    iget-object v1, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 516
    .line 517
    if-eqz v1, :cond_1d

    .line 518
    .line 519
    sget v2, Lcom/kubi/otc/R$string;->fast_result_buy_again:I

    .line 520
    .line 521
    .line 522
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 523
    move-result-object v2

    .line 524
    .line 525
    .line 526
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 527
    .line 528
    .line 529
    :cond_1d
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 530
    move-result-object v1

    .line 531
    .line 532
    if-eqz v1, :cond_1e

    .line 533
    .line 534
    iget-object v1, v1, Lft/z;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 535
    .line 536
    if-eqz v1, :cond_1e

    .line 537
    .line 538
    sget v2, Lcom/kubi/otc/R$string;->pay_fiat_withdraw_result_back_to_assets:I

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 542
    move-result-object v2

    .line 543
    .line 544
    .line 545
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 546
    .line 547
    .line 548
    :cond_1e
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;->getStatusMessage()Ljava/lang/String;

    .line 549
    move-result-object v1

    .line 550
    .line 551
    .line 552
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 553
    move-result-object v1

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 557
    move-result-object v2

    .line 558
    .line 559
    if-eqz v2, :cond_1f

    .line 560
    .line 561
    iget-object v2, v2, Lft/z;->g:Lcom/kubi/resources/widget/BaseTextView;

    .line 562
    .line 563
    if-eqz v2, :cond_1f

    .line 564
    .line 565
    sget v3, Lcom/kubi/otc/R$string;->pay_fiat_withdraw_result_failed_title:I

    .line 566
    .line 567
    .line 568
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 569
    move-result-object v3

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 573
    .line 574
    .line 575
    :cond_1f
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 576
    move-result-object v2

    .line 577
    .line 578
    if-eqz v2, :cond_21

    .line 579
    .line 580
    iget-object v2, v2, Lft/z;->h:Lcom/kubi/resources/widget/BaseTextView;

    .line 581
    .line 582
    if-eqz v2, :cond_21

    .line 583
    .line 584
    .line 585
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 586
    move-result v3

    .line 587
    .line 588
    if-lez v3, :cond_20

    .line 589
    goto :goto_2

    .line 590
    .line 591
    :cond_20
    sget v1, Lcom/kubi/otc/R$string;->pay_fiat_withdraw_result_failed_subtitle:I

    .line 592
    .line 593
    .line 594
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 595
    move-result-object v1

    .line 596
    .line 597
    .line 598
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    :goto_2
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 602
    .line 603
    .line 604
    :cond_21
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 605
    move-result-object v1

    .line 606
    .line 607
    if-eqz v1, :cond_22

    .line 608
    .line 609
    iget-object v2, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 610
    .line 611
    if-eqz v2, :cond_22

    .line 612
    .line 613
    new-instance v5, Lcom/kubi/otc/fiat/withdraw/i1;

    .line 614
    .line 615
    .line 616
    invoke-direct {v5, v0}, Lcom/kubi/otc/fiat/withdraw/i1;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)V

    .line 617
    const/4 v6, 0x1

    .line 618
    const/4 v7, 0x0

    .line 619
    .line 620
    const-wide/16 v3, 0x0

    .line 621
    .line 622
    .line 623
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    :cond_22
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 627
    move-result-object v1

    .line 628
    .line 629
    if-eqz v1, :cond_43

    .line 630
    .line 631
    iget-object v2, v1, Lft/z;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 632
    .line 633
    if-eqz v2, :cond_43

    .line 634
    .line 635
    new-instance v5, Lcom/kubi/otc/fiat/withdraw/j1;

    .line 636
    .line 637
    .line 638
    invoke-direct {v5}, Lcom/kubi/otc/fiat/withdraw/j1;-><init>()V

    .line 639
    const/4 v6, 0x1

    .line 640
    const/4 v7, 0x0

    .line 641
    .line 642
    const-wide/16 v3, 0x0

    .line 643
    .line 644
    .line 645
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 646
    return-void

    .line 647
    .line 648
    :pswitch_4
    const-string v4, "1"

    .line 649
    .line 650
    .line 651
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 652
    move-result v2

    .line 653
    .line 654
    if-nez v2, :cond_23

    .line 655
    .line 656
    goto/16 :goto_4

    .line 657
    .line 658
    .line 659
    :cond_23
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 660
    move-result-object v2

    .line 661
    .line 662
    if-eqz v2, :cond_24

    .line 663
    .line 664
    iget-object v2, v2, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 665
    .line 666
    if-eqz v2, :cond_24

    .line 667
    .line 668
    .line 669
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 670
    .line 671
    .line 672
    :cond_24
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 673
    move-result-object v2

    .line 674
    .line 675
    if-eqz v2, :cond_25

    .line 676
    .line 677
    iget-object v2, v2, Lft/z;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 678
    .line 679
    if-eqz v2, :cond_25

    .line 680
    .line 681
    .line 682
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 683
    .line 684
    .line 685
    :cond_25
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 686
    move-result-object v2

    .line 687
    .line 688
    if-eqz v2, :cond_26

    .line 689
    .line 690
    iget-object v2, v2, Lft/z;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 691
    .line 692
    if-eqz v2, :cond_26

    .line 693
    .line 694
    .line 695
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 696
    .line 697
    .line 698
    :cond_26
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 699
    move-result-object v2

    .line 700
    .line 701
    if-eqz v2, :cond_29

    .line 702
    .line 703
    iget-object v2, v2, Lft/z;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 704
    .line 705
    if-eqz v2, :cond_29

    .line 706
    .line 707
    new-instance v4, Ljava/lang/StringBuilder;

    .line 708
    .line 709
    .line 710
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 711
    .line 712
    .line 713
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;->getWithdrawAmount()Lcom/kubi/otc/entity/WithdrawAmount;

    .line 714
    move-result-object v5

    .line 715
    .line 716
    if-eqz v5, :cond_27

    .line 717
    .line 718
    .line 719
    invoke-virtual {v5}, Lcom/kubi/otc/entity/WithdrawAmount;->getAmount()Ljava/lang/String;

    .line 720
    move-result-object v5

    .line 721
    goto :goto_3

    .line 722
    :cond_27
    move-object v5, v1

    .line 723
    .line 724
    .line 725
    :goto_3
    invoke-static {v5}, Lht/y;->A(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 726
    move-result-object v6

    .line 727
    .line 728
    const/16 v16, 0x1f7

    .line 729
    .line 730
    const/16 v17, 0x0

    .line 731
    const/4 v7, 0x0

    .line 732
    const/4 v8, 0x0

    .line 733
    const/4 v9, 0x0

    .line 734
    const/4 v10, 0x1

    .line 735
    const/4 v11, 0x0

    .line 736
    const/4 v12, 0x0

    .line 737
    const/4 v13, 0x0

    .line 738
    const/4 v14, 0x0

    .line 739
    const/4 v15, 0x0

    .line 740
    .line 741
    .line 742
    invoke-static/range {v6 .. v17}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 743
    move-result-object v5

    .line 744
    .line 745
    .line 746
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;->getWithdrawAmount()Lcom/kubi/otc/entity/WithdrawAmount;

    .line 753
    move-result-object v3

    .line 754
    .line 755
    if-eqz v3, :cond_28

    .line 756
    .line 757
    .line 758
    invoke-virtual {v3}, Lcom/kubi/otc/entity/WithdrawAmount;->getCurrency()Ljava/lang/String;

    .line 759
    move-result-object v1

    .line 760
    .line 761
    .line 762
    :cond_28
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 763
    move-result-object v1

    .line 764
    .line 765
    .line 766
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 767
    .line 768
    .line 769
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 770
    move-result-object v1

    .line 771
    .line 772
    .line 773
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 774
    .line 775
    .line 776
    :cond_29
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 777
    move-result-object v1

    .line 778
    .line 779
    if-eqz v1, :cond_2a

    .line 780
    .line 781
    iget-object v1, v1, Lft/z;->c:Landroid/widget/ImageView;

    .line 782
    .line 783
    if-eqz v1, :cond_2a

    .line 784
    .line 785
    sget v2, Lcom/kubi/otc/R$mipmap;->botc_ic_fiat_withdraw_success:I

    .line 786
    .line 787
    .line 788
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 789
    .line 790
    .line 791
    :cond_2a
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 792
    move-result-object v1

    .line 793
    .line 794
    if-eqz v1, :cond_2b

    .line 795
    .line 796
    iget-object v1, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 797
    .line 798
    if-eqz v1, :cond_2b

    .line 799
    .line 800
    sget v2, Lcom/kubi/otc/R$string;->pay_fiat_withdraw_result_view_details:I

    .line 801
    .line 802
    .line 803
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 804
    move-result-object v2

    .line 805
    .line 806
    .line 807
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 808
    .line 809
    .line 810
    :cond_2b
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 811
    move-result-object v1

    .line 812
    .line 813
    if-eqz v1, :cond_2c

    .line 814
    .line 815
    iget-object v1, v1, Lft/z;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 816
    .line 817
    if-eqz v1, :cond_2c

    .line 818
    .line 819
    sget v2, Lcom/kubi/otc/R$string;->pay_fiat_withdraw_result_back_to_assets:I

    .line 820
    .line 821
    .line 822
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 823
    move-result-object v2

    .line 824
    .line 825
    .line 826
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 827
    .line 828
    .line 829
    :cond_2c
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 830
    move-result-object v1

    .line 831
    .line 832
    if-eqz v1, :cond_2d

    .line 833
    .line 834
    iget-object v1, v1, Lft/z;->g:Lcom/kubi/resources/widget/BaseTextView;

    .line 835
    .line 836
    if-eqz v1, :cond_2d

    .line 837
    .line 838
    sget v2, Lcom/kubi/otc/R$string;->pay_fiat_withdraw_result_success_title:I

    .line 839
    .line 840
    .line 841
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 842
    move-result-object v2

    .line 843
    .line 844
    .line 845
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 846
    .line 847
    .line 848
    :cond_2d
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 849
    move-result-object v1

    .line 850
    .line 851
    if-eqz v1, :cond_2e

    .line 852
    .line 853
    iget-object v2, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 854
    .line 855
    if-eqz v2, :cond_2e

    .line 856
    .line 857
    new-instance v5, Lcom/kubi/otc/fiat/withdraw/v1;

    .line 858
    .line 859
    .line 860
    invoke-direct {v5, v0}, Lcom/kubi/otc/fiat/withdraw/v1;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)V

    .line 861
    const/4 v6, 0x1

    .line 862
    const/4 v7, 0x0

    .line 863
    .line 864
    const-wide/16 v3, 0x0

    .line 865
    .line 866
    .line 867
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 868
    .line 869
    .line 870
    :cond_2e
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 871
    move-result-object v1

    .line 872
    .line 873
    if-eqz v1, :cond_43

    .line 874
    .line 875
    iget-object v2, v1, Lft/z;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 876
    .line 877
    if-eqz v2, :cond_43

    .line 878
    .line 879
    new-instance v5, Lcom/kubi/otc/fiat/withdraw/y1;

    .line 880
    .line 881
    .line 882
    invoke-direct {v5}, Lcom/kubi/otc/fiat/withdraw/y1;-><init>()V

    .line 883
    const/4 v6, 0x1

    .line 884
    const/4 v7, 0x0

    .line 885
    .line 886
    const-wide/16 v3, 0x0

    .line 887
    .line 888
    .line 889
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 890
    return-void

    .line 891
    .line 892
    :cond_2f
    :goto_4
    if-eqz p1, :cond_30

    .line 893
    .line 894
    .line 895
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;->isShowProSuccess()Ljava/lang/Boolean;

    .line 896
    move-result-object v2

    .line 897
    goto :goto_5

    .line 898
    :cond_30
    move-object v2, v1

    .line 899
    .line 900
    .line 901
    :goto_5
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 902
    move-result v2

    .line 903
    .line 904
    if-eqz v2, :cond_39

    .line 905
    .line 906
    .line 907
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 908
    move-result-object v2

    .line 909
    .line 910
    if-eqz v2, :cond_31

    .line 911
    .line 912
    iget-object v2, v2, Lft/z;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 913
    .line 914
    if-eqz v2, :cond_31

    .line 915
    .line 916
    .line 917
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 918
    .line 919
    .line 920
    :cond_31
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 921
    move-result-object v2

    .line 922
    .line 923
    if-eqz v2, :cond_34

    .line 924
    .line 925
    iget-object v2, v2, Lft/z;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 926
    .line 927
    if-eqz v2, :cond_34

    .line 928
    .line 929
    new-instance v4, Ljava/lang/StringBuilder;

    .line 930
    .line 931
    .line 932
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 933
    .line 934
    if-eqz p1, :cond_32

    .line 935
    .line 936
    .line 937
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;->getWithdrawAmount()Lcom/kubi/otc/entity/WithdrawAmount;

    .line 938
    move-result-object v5

    .line 939
    .line 940
    if-eqz v5, :cond_32

    .line 941
    .line 942
    .line 943
    invoke-virtual {v5}, Lcom/kubi/otc/entity/WithdrawAmount;->getAmount()Ljava/lang/String;

    .line 944
    move-result-object v5

    .line 945
    goto :goto_6

    .line 946
    :cond_32
    move-object v5, v1

    .line 947
    .line 948
    .line 949
    :goto_6
    invoke-static {v5}, Lht/y;->A(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 950
    move-result-object v6

    .line 951
    .line 952
    const/16 v16, 0x1f7

    .line 953
    .line 954
    const/16 v17, 0x0

    .line 955
    const/4 v7, 0x0

    .line 956
    const/4 v8, 0x0

    .line 957
    const/4 v9, 0x0

    .line 958
    const/4 v10, 0x1

    .line 959
    const/4 v11, 0x0

    .line 960
    const/4 v12, 0x0

    .line 961
    const/4 v13, 0x0

    .line 962
    const/4 v14, 0x0

    .line 963
    const/4 v15, 0x0

    .line 964
    .line 965
    .line 966
    invoke-static/range {v6 .. v17}, Lkf/a;->t(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 967
    move-result-object v5

    .line 968
    .line 969
    .line 970
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 971
    .line 972
    .line 973
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 974
    .line 975
    if-eqz p1, :cond_33

    .line 976
    .line 977
    .line 978
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;->getWithdrawAmount()Lcom/kubi/otc/entity/WithdrawAmount;

    .line 979
    move-result-object v3

    .line 980
    .line 981
    if-eqz v3, :cond_33

    .line 982
    .line 983
    .line 984
    invoke-virtual {v3}, Lcom/kubi/otc/entity/WithdrawAmount;->getCurrency()Ljava/lang/String;

    .line 985
    move-result-object v1

    .line 986
    .line 987
    .line 988
    :cond_33
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 989
    move-result-object v1

    .line 990
    .line 991
    .line 992
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 993
    .line 994
    .line 995
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 996
    move-result-object v1

    .line 997
    .line 998
    .line 999
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1000
    .line 1001
    .line 1002
    :cond_34
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 1003
    move-result-object v1

    .line 1004
    .line 1005
    if-eqz v1, :cond_35

    .line 1006
    .line 1007
    iget-object v1, v1, Lft/z;->c:Landroid/widget/ImageView;

    .line 1008
    .line 1009
    if-eqz v1, :cond_35

    .line 1010
    .line 1011
    sget v2, Lcom/kubi/otc/R$mipmap;->botc_ic_fiat_withdraw_success:I

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1015
    .line 1016
    .line 1017
    :cond_35
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 1018
    move-result-object v1

    .line 1019
    .line 1020
    if-eqz v1, :cond_36

    .line 1021
    .line 1022
    iget-object v1, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 1023
    .line 1024
    if-eqz v1, :cond_36

    .line 1025
    .line 1026
    sget v2, Lcom/kubi/otc/R$string;->pay_fiat_withdraw_result_view_details:I

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 1030
    move-result-object v2

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1034
    .line 1035
    .line 1036
    :cond_36
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 1037
    move-result-object v1

    .line 1038
    .line 1039
    if-eqz v1, :cond_37

    .line 1040
    .line 1041
    iget-object v1, v1, Lft/z;->g:Lcom/kubi/resources/widget/BaseTextView;

    .line 1042
    .line 1043
    if-eqz v1, :cond_37

    .line 1044
    .line 1045
    sget v2, Lcom/kubi/otc/R$string;->pay_capitual_withdraw_result_processing_title:I

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 1049
    move-result-object v2

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1053
    .line 1054
    .line 1055
    :cond_37
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 1056
    move-result-object v1

    .line 1057
    .line 1058
    if-eqz v1, :cond_38

    .line 1059
    .line 1060
    iget-object v1, v1, Lft/z;->h:Lcom/kubi/resources/widget/BaseTextView;

    .line 1061
    .line 1062
    if-eqz v1, :cond_38

    .line 1063
    .line 1064
    sget v2, Lcom/kubi/otc/R$string;->pay_capitual_withdraw_result_processing_subtitle:I

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 1068
    move-result-object v2

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1072
    .line 1073
    .line 1074
    :cond_38
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 1075
    move-result-object v1

    .line 1076
    .line 1077
    if-eqz v1, :cond_3f

    .line 1078
    .line 1079
    iget-object v2, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 1080
    .line 1081
    if-eqz v2, :cond_3f

    .line 1082
    .line 1083
    new-instance v5, Lcom/kubi/otc/fiat/withdraw/p1;

    .line 1084
    .line 1085
    .line 1086
    invoke-direct {v5, v0}, Lcom/kubi/otc/fiat/withdraw/p1;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)V

    .line 1087
    const/4 v6, 0x1

    .line 1088
    const/4 v7, 0x0

    .line 1089
    .line 1090
    const-wide/16 v3, 0x0

    .line 1091
    .line 1092
    .line 1093
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 1094
    goto :goto_7

    .line 1095
    .line 1096
    .line 1097
    :cond_39
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 1098
    move-result-object v2

    .line 1099
    .line 1100
    if-eqz v2, :cond_3a

    .line 1101
    .line 1102
    iget-object v2, v2, Lft/z;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 1103
    .line 1104
    if-eqz v2, :cond_3a

    .line 1105
    .line 1106
    .line 1107
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 1108
    .line 1109
    .line 1110
    :cond_3a
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 1111
    move-result-object v2

    .line 1112
    .line 1113
    if-eqz v2, :cond_3b

    .line 1114
    .line 1115
    iget-object v2, v2, Lft/z;->c:Landroid/widget/ImageView;

    .line 1116
    .line 1117
    if-eqz v2, :cond_3b

    .line 1118
    .line 1119
    sget v3, Lcom/kubi/otc/R$mipmap;->botc_ic_fiat_withdraw_process:I

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1123
    .line 1124
    .line 1125
    :cond_3b
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 1126
    move-result-object v2

    .line 1127
    .line 1128
    if-eqz v2, :cond_3d

    .line 1129
    .line 1130
    iget-object v2, v2, Lft/z;->g:Lcom/kubi/resources/widget/BaseTextView;

    .line 1131
    .line 1132
    if-eqz v2, :cond_3d

    .line 1133
    .line 1134
    if-eqz p1, :cond_3c

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;->getStatusMessage()Ljava/lang/String;

    .line 1138
    move-result-object v1

    .line 1139
    .line 1140
    .line 1141
    :cond_3c
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 1142
    move-result-object v1

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1146
    .line 1147
    .line 1148
    :cond_3d
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 1149
    move-result-object v1

    .line 1150
    .line 1151
    if-eqz v1, :cond_3e

    .line 1152
    .line 1153
    iget-object v1, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 1154
    .line 1155
    if-eqz v1, :cond_3e

    .line 1156
    .line 1157
    sget v2, Lcom/kubi/otc/R$string;->fast_result_refresh:I

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 1161
    move-result-object v2

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1165
    .line 1166
    .line 1167
    :cond_3e
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 1168
    move-result-object v1

    .line 1169
    .line 1170
    if-eqz v1, :cond_3f

    .line 1171
    .line 1172
    iget-object v2, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 1173
    .line 1174
    if-eqz v2, :cond_3f

    .line 1175
    .line 1176
    new-instance v5, Lcom/kubi/otc/fiat/withdraw/w1;

    .line 1177
    .line 1178
    .line 1179
    invoke-direct {v5, v0}, Lcom/kubi/otc/fiat/withdraw/w1;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;)V

    .line 1180
    const/4 v6, 0x1

    .line 1181
    const/4 v7, 0x0

    .line 1182
    .line 1183
    const-wide/16 v3, 0x0

    .line 1184
    .line 1185
    .line 1186
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 1187
    .line 1188
    .line 1189
    :cond_3f
    :goto_7
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 1190
    move-result-object v1

    .line 1191
    .line 1192
    if-eqz v1, :cond_40

    .line 1193
    .line 1194
    iget-object v1, v1, Lft/z;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 1195
    .line 1196
    if-eqz v1, :cond_40

    .line 1197
    .line 1198
    .line 1199
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 1200
    .line 1201
    .line 1202
    :cond_40
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 1203
    move-result-object v1

    .line 1204
    .line 1205
    if-eqz v1, :cond_41

    .line 1206
    .line 1207
    iget-object v1, v1, Lft/z;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 1208
    .line 1209
    if-eqz v1, :cond_41

    .line 1210
    .line 1211
    .line 1212
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 1213
    .line 1214
    .line 1215
    :cond_41
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 1216
    move-result-object v1

    .line 1217
    .line 1218
    if-eqz v1, :cond_42

    .line 1219
    .line 1220
    iget-object v1, v1, Lft/z;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 1221
    .line 1222
    if-eqz v1, :cond_42

    .line 1223
    .line 1224
    sget v2, Lcom/kubi/otc/R$string;->pay_fiat_withdraw_result_back_to_assets:I

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 1228
    move-result-object v2

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1232
    .line 1233
    .line 1234
    :cond_42
    invoke-virtual {v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->D3()Lft/z;

    .line 1235
    move-result-object v1

    .line 1236
    .line 1237
    if-eqz v1, :cond_43

    .line 1238
    .line 1239
    iget-object v2, v1, Lft/z;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 1240
    .line 1241
    if-eqz v2, :cond_43

    .line 1242
    .line 1243
    new-instance v5, Lcom/kubi/otc/fiat/withdraw/x1;

    .line 1244
    .line 1245
    .line 1246
    invoke-direct {v5}, Lcom/kubi/otc/fiat/withdraw/x1;-><init>()V

    .line 1247
    const/4 v6, 0x1

    .line 1248
    const/4 v7, 0x0

    .line 1249
    .line 1250
    const-wide/16 v3, 0x0

    .line 1251
    .line 1252
    .line 1253
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 1254
    :cond_43
    return-void

    :pswitch_data_0
    .packed-switch 0x31
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$layout;->botc_fragment_fiat_withdraw_status:I

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
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/kubi/resources/widget/NavigationBar;->c()V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-direct {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;->F3()V

    .line 21
    return-void
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
