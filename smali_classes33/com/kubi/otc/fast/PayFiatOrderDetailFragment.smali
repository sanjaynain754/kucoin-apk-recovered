.class public final Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;
.super Lcom/kubi/sdk/base/ui/OldBaseFragment;
.source "PayFiatOrderDetailFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/otc/fast/PayFiatOrderDetailFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0016\u001a\u00020\u0017H\u0014J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0008\u0010\u001e\u001a\u00020\u0019H\u0002J\u0017\u0010\u001f\u001a\u00020\u00192\u0008\u0010 \u001a\u0004\u0018\u00010\u0017H\u0002\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u001b\u0010\u000b\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\n\u001a\u0004\u0008\r\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;",
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
        "Lcom/kubi/otc/databinding/BotcFragmentFastFiatDetailBinding;",
        "getBinding",
        "()Lcom/kubi/otc/databinding/BotcFragmentFastFiatDetailBinding;",
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
        "getTradeOrderDetails",
        "showOrderStatus",
        "orderStatus",
        "(Ljava/lang/Integer;)V",
        "refreshRefOrderStatus",
        "orderDetail",
        "Lcom/kubi/otc/entity/FiatBankCardOrder;",
        "exposeOrderStatus",
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
        "SMAP\nPayFiatOrderDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayFiatOrderDetailFragment.kt\ncom/kubi/otc/fast/PayFiatOrderDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,195:1\n147#2,16:196\n*S KotlinDebug\n*F\n+ 1 PayFiatOrderDetailFragment.kt\ncom/kubi/otc/fast/PayFiatOrderDetailFragment\n*L\n48#1:196,16\n*E\n"
    }
.end annotation


# static fields
.field public static final X:Lcom/kubi/otc/fast/PayFiatOrderDetailFragment$Companion;
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
    const-string v1, "getBinding()Lcom/kubi/otc/databinding/BotcFragmentFastFiatDetailBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;

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
    sput-object v1, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->Y:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->X:Lcom/kubi/otc/fast/PayFiatOrderDetailFragment$Companion;

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
    new-instance v0, Lcom/kubi/otc/fast/p;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/otc/fast/p;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->U:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/otc/fast/q;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/kubi/otc/fast/q;-><init>(Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->V:Lkotlin/Lazy;

    .line 26
    .line 27
    sget-object v0, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/otc/fast/PayFiatOrderDetailFragment$special$$inlined$viewBindingFragment$1;

    .line 28
    .line 29
    new-instance v1, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment$special$$inlined$viewBindingFragment$2;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    iput-object v0, p0, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->W:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 39
    .line 40
    const-string v0, "B7FastBuyOrderDetail"

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->setPageId(Ljava/lang/String;)V

    .line 44
    return-void
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

.method private final getOrderId()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->V:Lkotlin/Lazy;

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

.method public static synthetic k3(Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->x3(Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;)Ljava/lang/String;

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
    invoke-static {p0, p1}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->v3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static synthetic m3(Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;Lcom/kubi/otc/entity/FiatBankCardOrder;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->w3(Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;Lcom/kubi/otc/entity/FiatBankCardOrder;)V

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

.method public static synthetic n3(Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;Lio/reactivex/disposables/Disposable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->u3(Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;Lio/reactivex/disposables/Disposable;)Lkotlin/Unit;

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

.method public static synthetic o3()Let/b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->q3()Let/b;

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

.method public static final q3()Let/b;
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

.method public static final u3(Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;Lio/reactivex/disposables/Disposable;)Lkotlin/Unit;
    .locals 2

    .line 1
    const/4 p1, 0x3

    .line 2
    const/4 v0, 0x0

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v1, v1, p1, v0}, Lcom/kubi/sdk/BaseFragment;->showLoadingView$default(Lcom/kubi/sdk/BaseFragment;IIILjava/lang/Object;)V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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

.method public static final v3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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

.method public static final w3(Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;Lcom/kubi/otc/entity/FiatBankCardOrder;)V
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showContent()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, Lft/k;->w:Lcom/kubi/resources/widget/BaseTextView;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->isBuyType()Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    sget v1, Lcom/kubi/otc/R$string;->pay_fast_detail_bought:I

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    sget v1, Lcom/kubi/otc/R$string;->pay_fast_detail_sold:I

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    iget-object v0, v0, Lft/k;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->isBuyType()Z

    .line 45
    move-result v1

    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    sget v1, Lcom/kubi/otc/R$string;->buy_qty:I

    .line 50
    goto :goto_1

    .line 51
    .line 52
    :cond_2
    sget v1, Lcom/kubi/otc/R$string;->sell_qty:I

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    iget-object v0, v0, Lft/k;->q:Lcom/kubi/resources/widget/BaseTextView;

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    sget v1, Lcom/kubi/otc/R$string;->visa_payment_method:I

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    const/16 v1, 0x20

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    iget-object v0, v0, Lft/k;->i:Lcom/kubi/resources/widget/BaseTextView;

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getFiatAmount()Ljava/lang/String;

    .line 99
    move-result-object v3

    .line 100
    .line 101
    if-eqz v3, :cond_5

    .line 102
    .line 103
    const/16 v12, 0xf7

    .line 104
    const/4 v13, 0x0

    .line 105
    const/4 v4, 0x0

    .line 106
    const/4 v5, 0x0

    .line 107
    const/4 v6, 0x0

    .line 108
    const/4 v7, 0x1

    .line 109
    const/4 v8, 0x0

    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v10, 0x0

    .line 112
    const/4 v11, 0x0

    .line 113
    .line 114
    .line 115
    invoke-static/range {v3 .. v13}, Lkf/a;->s(Ljava/lang/String;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 116
    move-result-object v3

    .line 117
    goto :goto_2

    .line 118
    :cond_5
    const/4 v3, 0x0

    .line 119
    .line 120
    .line 121
    :goto_2
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getFiatCurrency()Ljava/lang/String;

    .line 128
    move-result-object v3

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    move-result-object v2

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    .line 140
    .line 141
    :cond_6
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getOrderStatus()Ljava/lang/Integer;

    .line 142
    move-result-object v0

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->z3(Ljava/lang/Integer;)V

    .line 146
    .line 147
    .line 148
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, p1}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->y3(Lcom/kubi/otc/entity/FiatBankCardOrder;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    const-string v2, " "

    .line 158
    .line 159
    if-eqz v0, :cond_7

    .line 160
    .line 161
    iget-object v0, v0, Lft/k;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 162
    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    new-instance v3, Lcom/kubi/utils/v0;

    .line 166
    .line 167
    .line 168
    invoke-direct {v3}, Lcom/kubi/utils/v0;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getCryptoQuantity()Ljava/lang/String;

    .line 172
    move-result-object v4

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, v4}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 176
    move-result-object v3

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v2}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 180
    move-result-object v3

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getCryptoCurrency()Ljava/lang/String;

    .line 184
    move-result-object v4

    .line 185
    .line 186
    sget v5, Lcom/kubi/otc/R$color;->emphasis60:I

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, v5}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 190
    move-result v5

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3, v4, v5}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 194
    move-result-object v3

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    .line 199
    .line 200
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    if-eqz v0, :cond_8

    .line 204
    .line 205
    iget-object v0, v0, Lft/k;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 206
    .line 207
    if-eqz v0, :cond_8

    .line 208
    .line 209
    new-instance v3, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getCryptoCurrency()Ljava/lang/String;

    .line 216
    move-result-object v4

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    sget v1, Lcom/kubi/otc/R$string;->single_price:I

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 228
    move-result-object v1

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    move-result-object v1

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 239
    .line 240
    .line 241
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 242
    move-result-object v0

    .line 243
    .line 244
    const-string v1, "--"

    .line 245
    .line 246
    if-eqz v0, :cond_9

    .line 247
    .line 248
    iget-object v0, v0, Lft/k;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 249
    .line 250
    if-eqz v0, :cond_9

    .line 251
    .line 252
    new-instance v3, Lcom/kubi/utils/v0;

    .line 253
    .line 254
    .line 255
    invoke-direct {v3}, Lcom/kubi/utils/v0;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getPrice()Ljava/lang/String;

    .line 259
    move-result-object v4

    .line 260
    .line 261
    .line 262
    invoke-static {v4, v1}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 263
    move-result-object v4

    .line 264
    .line 265
    .line 266
    invoke-virtual {v3, v4}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 267
    move-result-object v3

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3, v2}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 271
    move-result-object v3

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getFiatCurrency()Ljava/lang/String;

    .line 275
    move-result-object v4

    .line 276
    .line 277
    sget v5, Lcom/kubi/otc/R$color;->emphasis60:I

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0, v5}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 281
    move-result v5

    .line 282
    .line 283
    .line 284
    invoke-virtual {v3, v4, v5}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 285
    move-result-object v3

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 289
    .line 290
    .line 291
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 292
    move-result-object v0

    .line 293
    .line 294
    if-eqz v0, :cond_a

    .line 295
    .line 296
    iget-object v0, v0, Lft/k;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 297
    .line 298
    if-eqz v0, :cond_a

    .line 299
    .line 300
    new-instance v3, Lcom/kubi/utils/v0;

    .line 301
    .line 302
    .line 303
    invoke-direct {v3}, Lcom/kubi/utils/v0;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getFee()Ljava/lang/String;

    .line 307
    move-result-object v4

    .line 308
    .line 309
    .line 310
    invoke-static {v4, v1}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 311
    move-result-object v1

    .line 312
    .line 313
    .line 314
    invoke-virtual {v3, v1}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 315
    move-result-object v1

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1, v2}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 319
    move-result-object v1

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getFiatCurrency()Ljava/lang/String;

    .line 323
    move-result-object v2

    .line 324
    .line 325
    sget v3, Lcom/kubi/otc/R$color;->emphasis60:I

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0, v3}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 329
    move-result v3

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1, v2, v3}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 333
    move-result-object v1

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 337
    .line 338
    .line 339
    :cond_a
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getFee()Ljava/lang/String;

    .line 340
    move-result-object v0

    .line 341
    .line 342
    if-eqz v0, :cond_b

    .line 343
    .line 344
    .line 345
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 346
    move-result v0

    .line 347
    .line 348
    if-nez v0, :cond_10

    .line 349
    .line 350
    .line 351
    :cond_b
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getFeeMsgList()Ljava/util/List;

    .line 352
    move-result-object v0

    .line 353
    .line 354
    .line 355
    invoke-static {v0}, Lcom/kubi/utils/extensions/b;->c(Ljava/util/List;)Ljava/util/List;

    .line 356
    move-result-object v0

    .line 357
    .line 358
    .line 359
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 360
    move-result v1

    .line 361
    .line 362
    if-nez v1, :cond_e

    .line 363
    .line 364
    .line 365
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 366
    move-result-object v1

    .line 367
    .line 368
    if-eqz v1, :cond_c

    .line 369
    .line 370
    iget-object v1, v1, Lft/k;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 371
    .line 372
    if-eqz v1, :cond_c

    .line 373
    .line 374
    .line 375
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 376
    .line 377
    .line 378
    :cond_c
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 379
    move-result-object v1

    .line 380
    .line 381
    if-eqz v1, :cond_d

    .line 382
    .line 383
    iget-object v1, v1, Lft/k;->h:Lcom/kubi/otc/view/FeeListLayout;

    .line 384
    .line 385
    if-eqz v1, :cond_d

    .line 386
    .line 387
    .line 388
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 389
    .line 390
    .line 391
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 392
    move-result-object v1

    .line 393
    .line 394
    if-eqz v1, :cond_10

    .line 395
    .line 396
    iget-object v1, v1, Lft/k;->h:Lcom/kubi/otc/view/FeeListLayout;

    .line 397
    .line 398
    if-eqz v1, :cond_10

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1, v0}, Lcom/kubi/otc/view/FeeListLayout;->a(Ljava/util/List;)V

    .line 402
    goto :goto_3

    .line 403
    .line 404
    .line 405
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 406
    move-result-object v0

    .line 407
    .line 408
    if-eqz v0, :cond_f

    .line 409
    .line 410
    iget-object v0, v0, Lft/k;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 411
    .line 412
    if-eqz v0, :cond_f

    .line 413
    .line 414
    .line 415
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 416
    .line 417
    .line 418
    :cond_f
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 419
    move-result-object v0

    .line 420
    .line 421
    if-eqz v0, :cond_10

    .line 422
    .line 423
    iget-object v0, v0, Lft/k;->h:Lcom/kubi/otc/view/FeeListLayout;

    .line 424
    .line 425
    if-eqz v0, :cond_10

    .line 426
    .line 427
    .line 428
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 429
    .line 430
    .line 431
    :cond_10
    :goto_3
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 432
    move-result-object v0

    .line 433
    .line 434
    if-eqz v0, :cond_11

    .line 435
    .line 436
    iget-object v0, v0, Lft/k;->p:Lcom/kubi/resources/widget/BaseTextView;

    .line 437
    .line 438
    if-eqz v0, :cond_11

    .line 439
    .line 440
    .line 441
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getPaymentName()Ljava/lang/String;

    .line 442
    move-result-object v1

    .line 443
    .line 444
    .line 445
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 446
    move-result-object v1

    .line 447
    .line 448
    .line 449
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 450
    .line 451
    .line 452
    :cond_11
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 453
    move-result-object v0

    .line 454
    .line 455
    if-eqz v0, :cond_12

    .line 456
    .line 457
    iget-object v0, v0, Lft/k;->l:Lcom/kubi/resources/widget/BaseTextView;

    .line 458
    .line 459
    if-eqz v0, :cond_12

    .line 460
    .line 461
    .line 462
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getOrderId()Ljava/lang/String;

    .line 463
    move-result-object v1

    .line 464
    .line 465
    .line 466
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 467
    move-result-object v1

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 471
    .line 472
    .line 473
    :cond_12
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 474
    move-result-object v0

    .line 475
    .line 476
    if-eqz v0, :cond_13

    .line 477
    .line 478
    iget-object v0, v0, Lft/k;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 479
    .line 480
    if-eqz v0, :cond_13

    .line 481
    .line 482
    .line 483
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getCreatedAt()Ljava/lang/Long;

    .line 484
    move-result-object v1

    .line 485
    .line 486
    .line 487
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 488
    move-result-wide v1

    .line 489
    .line 490
    .line 491
    invoke-static {v1, v2}, Lcom/kubi/utils/TimeUtils;->k(J)Ljava/lang/String;

    .line 492
    move-result-object v1

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 496
    .line 497
    .line 498
    :cond_13
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getOrderStatus()Ljava/lang/Integer;

    .line 499
    move-result-object v0

    .line 500
    .line 501
    if-nez v0, :cond_14

    .line 502
    goto :goto_4

    .line 503
    .line 504
    .line 505
    :cond_14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 506
    move-result v0

    .line 507
    const/4 v1, 0x4

    .line 508
    .line 509
    if-ne v0, v1, :cond_17

    .line 510
    .line 511
    .line 512
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 513
    move-result-object v0

    .line 514
    .line 515
    if-eqz v0, :cond_15

    .line 516
    .line 517
    iget-object v0, v0, Lft/k;->g:Landroid/view/View;

    .line 518
    .line 519
    if-eqz v0, :cond_15

    .line 520
    .line 521
    .line 522
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 523
    .line 524
    .line 525
    :cond_15
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 526
    move-result-object v0

    .line 527
    .line 528
    if-eqz v0, :cond_16

    .line 529
    .line 530
    iget-object v0, v0, Lft/k;->x:Lcom/kubi/resources/widget/BaseTextView;

    .line 531
    .line 532
    if-eqz v0, :cond_16

    .line 533
    .line 534
    .line 535
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getDisplayErrorMsg()Ljava/lang/String;

    .line 536
    move-result-object v1

    .line 537
    .line 538
    .line 539
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 540
    move-result-object v1

    .line 541
    .line 542
    .line 543
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 544
    .line 545
    .line 546
    :cond_16
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 547
    move-result-object v0

    .line 548
    .line 549
    if-eqz v0, :cond_19

    .line 550
    .line 551
    iget-object v0, v0, Lft/k;->x:Lcom/kubi/resources/widget/BaseTextView;

    .line 552
    .line 553
    if-eqz v0, :cond_19

    .line 554
    .line 555
    .line 556
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 557
    goto :goto_5

    .line 558
    .line 559
    .line 560
    :cond_17
    :goto_4
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 561
    move-result-object v0

    .line 562
    .line 563
    if-eqz v0, :cond_18

    .line 564
    .line 565
    iget-object v0, v0, Lft/k;->g:Landroid/view/View;

    .line 566
    .line 567
    if-eqz v0, :cond_18

    .line 568
    .line 569
    .line 570
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 571
    .line 572
    .line 573
    :cond_18
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 574
    move-result-object v0

    .line 575
    .line 576
    if-eqz v0, :cond_19

    .line 577
    .line 578
    iget-object v0, v0, Lft/k;->x:Lcom/kubi/resources/widget/BaseTextView;

    .line 579
    .line 580
    if-eqz v0, :cond_19

    .line 581
    .line 582
    .line 583
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 584
    .line 585
    .line 586
    :cond_19
    :goto_5
    invoke-virtual {p0, p1}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->p3(Lcom/kubi/otc/entity/FiatBankCardOrder;)V

    .line 587
    return-void
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

.method public static final x3(Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;)Ljava/lang/String;
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
    invoke-static {p0, v0}, Lcom/kubi/router/utils/RouteExKt;->y(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

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


# virtual methods
.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$layout;->botc_fragment_fast_fiat_detail:I

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
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->t3()V

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

.method public final p3(Lcom/kubi/otc/entity/FiatBankCardOrder;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->getPageId()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    new-instance v1, Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getPaymentMethodCode()Ljava/lang/String;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    const-string v3, "paymentMethodCode"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    .line 24
    const-string v2, "channelId"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getChannelId()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 34
    .line 35
    const-string p1, "page"

    .line 36
    .line 37
    const-string v2, "failure"

    .line 38
    .line 39
    .line 40
    invoke-static {v0, p1, v2, v1}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public final r3()Lft/k;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->W:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->Y:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lft/k;

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

.method public final s3()Let/b;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->U:Lkotlin/Lazy;

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

.method public final t3()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->s3()Let/b;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->getOrderId()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Let/b;->a(Ljava/lang/String;)Lio/reactivex/Observable;

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
    new-instance v1, Lcom/kubi/otc/fast/m;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, p0}, Lcom/kubi/otc/fast/m;-><init>(Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;)V

    .line 26
    .line 27
    new-instance v2, Lcom/kubi/otc/fast/n;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2, v1}, Lcom/kubi/otc/fast/n;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnSubscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    new-instance v1, Lcom/kubi/otc/fast/o;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, p0}, Lcom/kubi/otc/fast/o;-><init>(Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;)V

    .line 40
    .line 41
    new-instance v2, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment$a;

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment$a;-><init>(Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    const-string v1, "subscribe(...)"

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    const-string v2, "getCompositeDisposable(...)"

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1}, Lio/reactivex/rxkotlin/DisposableKt;->addTo(Lio/reactivex/disposables/Disposable;Lio/reactivex/disposables/CompositeDisposable;)Lio/reactivex/disposables/Disposable;

    .line 66
    return-void
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

.method public final y3(Lcom/kubi/otc/entity/FiatBankCardOrder;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getOrderStatus()Ljava/lang/Integer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getRechargeOrderDetail()Lcom/kubi/otc/entity/RechargeOrderDetail;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p1}, Lcom/kubi/otc/entity/RechargeOrderDetail;->getRechargeOrderStatus()Ljava/lang/Integer;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    if-nez v0, :cond_3

    .line 32
    goto :goto_0

    .line 33
    .line 34
    .line 35
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x1

    .line 38
    .line 39
    if-ne v0, v1, :cond_6

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    iget-object v0, v0, Lft/k;->v:Lcom/kubi/resources/widget/BaseTextView;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    sget v1, Lcom/kubi/otc/R$string;->fast_result_failure:I

    .line 52
    const/4 v2, 0x0

    .line 53
    .line 54
    new-array v2, v2, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    sget v1, Lcom/kubi/otc/R$color;->complementary:I

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 67
    move-result v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 71
    .line 72
    .line 73
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    iget-object v0, v0, Lft/k;->c:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/kubi/otc/entity/RechargeOrderDetail;->getErrorReason()Ljava/lang/String;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    if-eqz p1, :cond_8

    .line 94
    .line 95
    iget-object p1, p1, Lft/k;->c:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 96
    .line 97
    if-eqz p1, :cond_8

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 101
    return-void

    .line 102
    .line 103
    .line 104
    :cond_6
    :goto_0
    invoke-virtual {p1}, Lcom/kubi/otc/entity/RechargeOrderDetail;->getErrorReason()Ljava/lang/String;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    .line 108
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 113
    move-result v0

    .line 114
    .line 115
    if-nez v0, :cond_8

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 119
    move-result-object v0

    .line 120
    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    iget-object v0, v0, Lft/k;->b:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 124
    .line 125
    if-eqz v0, :cond_7

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Lcom/kubi/otc/entity/RechargeOrderDetail;->getErrorReason()Ljava/lang/String;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    .line 134
    .line 135
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    if-eqz p1, :cond_8

    .line 139
    .line 140
    iget-object p1, p1, Lft/k;->b:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 141
    .line 142
    if-eqz p1, :cond_8

    .line 143
    .line 144
    .line 145
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 146
    :cond_8
    :goto_1
    return-void
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

.method public final z3(Ljava/lang/Integer;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->r3()Lft/k;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    iget-object v0, v0, Lft/k;->v:Lcom/kubi/resources/widget/BaseTextView;

    .line 9
    .line 10
    if-eqz v0, :cond_8

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x1

    .line 20
    .line 21
    if-ne v2, v3, :cond_1

    .line 22
    .line 23
    sget p1, Lcom/kubi/otc/R$string;->fast_result_success:I

    .line 24
    .line 25
    new-array v1, v1, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 35
    .line 36
    sget v1, Lcom/kubi/otc/R$color;->c_text:I

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 40
    move-result p1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 44
    return-void

    .line 45
    .line 46
    :cond_1
    :goto_0
    if-nez p1, :cond_2

    .line 47
    goto :goto_1

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 51
    move-result v2

    .line 52
    const/4 v3, 0x2

    .line 53
    .line 54
    if-ne v2, v3, :cond_3

    .line 55
    .line 56
    sget p1, Lcom/kubi/otc/R$string;->fast_result_failure:I

    .line 57
    .line 58
    new-array v1, v1, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 68
    .line 69
    sget v1, Lcom/kubi/otc/R$color;->brandRed:I

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 73
    move-result p1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 77
    return-void

    .line 78
    .line 79
    :cond_3
    :goto_1
    if-nez p1, :cond_4

    .line 80
    goto :goto_2

    .line 81
    .line 82
    .line 83
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 84
    move-result v2

    .line 85
    const/4 v3, 0x4

    .line 86
    .line 87
    if-ne v2, v3, :cond_5

    .line 88
    .line 89
    sget p1, Lcom/kubi/otc/R$string;->payment_status_refunding:I

    .line 90
    .line 91
    new-array v1, v1, [Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, p1, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    .line 100
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 101
    .line 102
    sget v1, Lcom/kubi/otc/R$color;->brandRed:I

    .line 103
    .line 104
    .line 105
    invoke-static {p1, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 106
    move-result p1

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 110
    return-void

    .line 111
    .line 112
    :cond_5
    :goto_2
    if-nez p1, :cond_6

    .line 113
    goto :goto_3

    .line 114
    .line 115
    .line 116
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 117
    move-result p1

    .line 118
    const/4 v2, 0x5

    .line 119
    .line 120
    if-ne p1, v2, :cond_7

    .line 121
    .line 122
    sget p1, Lcom/kubi/otc/R$string;->payment_status_refunded:I

    .line 123
    .line 124
    new-array v1, v1, [Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, p1, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    .line 133
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 134
    .line 135
    sget v1, Lcom/kubi/otc/R$color;->brandRed:I

    .line 136
    .line 137
    .line 138
    invoke-static {p1, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 139
    move-result p1

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 143
    return-void

    .line 144
    .line 145
    :cond_7
    :goto_3
    sget p1, Lcom/kubi/otc/R$string;->fast_result_pending:I

    .line 146
    .line 147
    new-array v1, v1, [Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, p1, v1}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    move-result-object p1

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 155
    .line 156
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 157
    .line 158
    sget v1, Lcom/kubi/otc/R$color;->c_text:I

    .line 159
    .line 160
    .line 161
    invoke-static {p1, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 162
    move-result p1

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 166
    :cond_8
    return-void
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
