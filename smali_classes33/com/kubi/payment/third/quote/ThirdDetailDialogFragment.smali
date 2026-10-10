.class public final Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;
.super Lcom/kubi/resources/dialog/DialogFragmentHelper;
.source "ThirdDetailDialogFragment.kt"

# interfaces
.implements Lcom/kubi/resources/dialog/DialogFragmentHelper$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$Companion;,
        Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0002*+B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0001H\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J2\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0008\u0008\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002J\u0010\u0010$\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0006H\u0002J\u0010\u0010\'\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010(\u001a\u00020 2\u0008\u0008\u0001\u0010)\u001a\u00020 H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006,"
    }
    d2 = {
        "Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;",
        "Lcom/kubi/resources/dialog/DialogFragmentHelper;",
        "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;",
        "<init>",
        "()V",
        "fiatSelected",
        "",
        "currencySelected",
        "payMethodIdSelected",
        "payChannelSelected",
        "Lcom/kubi/payment/third/data/entities/PayChannelSelect;",
        "checkSimplexKycAction",
        "Lkotlin/Function0;",
        "",
        "createOrderAction",
        "dialogContext",
        "Landroid/content/Context;",
        "kotlin.jvm.PlatformType",
        "getDialogContext",
        "()Landroid/content/Context;",
        "dialogContext$delegate",
        "Lkotlin/Lazy;",
        "setupView",
        "viewHolder",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "helper",
        "handleCoinTRStatement",
        "statementView",
        "Landroid/widget/TextView;",
        "handleTreasuraStatement",
        "handleStatement",
        "statementResId",
        "",
        "channelUrl",
        "termsUrl",
        "privacyUrl",
        "handleBanxaStatement",
        "viewRemotePdf",
        "url",
        "handleLegendTradingStatement",
        "getColorRes",
        "id",
        "SimpleClickableSpan",
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


# static fields
.field public static final x0:Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public q0:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public r0:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public s0:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public t0:Lcom/kubi/payment/third/data/entities/PayChannelSelect;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public u0:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public v0:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final w0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->x0:Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$Companion;

    .line 9
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;-><init>()V

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->q0:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->r0:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v0, Lcom/kubi/payment/third/quote/d;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/kubi/payment/third/quote/d;-><init>(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->w0:Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->e4(Lcom/kubi/resources/dialog/DialogFragmentHelper$b;)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static final C4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

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

.method public static final D4(Landroid/view/View;Landroid/widget/CompoundButton;Z)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "<unused var>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
.end method

.method public static final E4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)Lkotlin/Unit;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->t0:Lcom/kubi/payment/third/data/entities/PayChannelSelect;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kubi/payment/third/data/entities/PayChannelSelect;->isSimplex()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v1

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object p0, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->u0:Lkotlin/jvm/functions/Function0;

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 34
    return-object p0

    .line 35
    .line 36
    :cond_2
    iget-object v0, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->v0:Lkotlin/jvm/functions/Function0;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 42
    .line 43
    :cond_3
    iget-object v0, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->q0:Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    const-string v2, "fiat"

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    iget-object v2, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->r0:Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    move-result-object v2

    .line 60
    .line 61
    const-string v3, "coin"

    .line 62
    .line 63
    .line 64
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    iget-object v3, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->s0:Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    const-string v4, "PaymentMethod"

    .line 74
    .line 75
    .line 76
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 77
    move-result-object v3

    .line 78
    .line 79
    iget-object p0, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->t0:Lcom/kubi/payment/third/data/entities/PayChannelSelect;

    .line 80
    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/kubi/payment/third/data/entities/PayChannelSelect;->getChannel()Ljava/lang/String;

    .line 85
    move-result-object v1

    .line 86
    .line 87
    .line 88
    :cond_4
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    move-result-object p0

    .line 90
    .line 91
    const-string v1, "PaymentChannel"

    .line 92
    .line 93
    .line 94
    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 95
    move-result-object p0

    .line 96
    .line 97
    .line 98
    filled-new-array {v0, v2, v3, p0}, [Lkotlin/Pair;

    .line 99
    move-result-object p0

    .line 100
    .line 101
    const-string v0, "B7ThirdParty"

    .line 102
    .line 103
    const-string v1, "button"

    .line 104
    .line 105
    const-string v2, "1"

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v1, v2, p0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 109
    .line 110
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 111
    return-object p0
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

.method private final getColorRes(I)I
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorRes;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->w4()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 8
    move-result p1

    .line 9
    return p1
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

.method public static synthetic j4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->C4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)Lkotlin/Unit;

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

.method public static synthetic k4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->E4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)Lkotlin/Unit;

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

.method public static synthetic l4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)Landroid/content/Context;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->v4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)Landroid/content/Context;

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

.method public static synthetic m4(Landroid/view/View;Landroid/widget/CompoundButton;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->D4(Landroid/view/View;Landroid/widget/CompoundButton;Z)Lkotlin/Unit;

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
.end method

.method public static final synthetic n4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;I)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->getColorRes(I)I

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static final synthetic o4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->u0:Lkotlin/jvm/functions/Function0;

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

.method public static final synthetic p4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->v0:Lkotlin/jvm/functions/Function0;

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

.method public static final synthetic q4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->r0:Ljava/lang/String;

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

.method public static final synthetic r4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->q0:Ljava/lang/String;

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

.method public static final synthetic s4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;Lcom/kubi/payment/third/data/entities/PayChannelSelect;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->t0:Lcom/kubi/payment/third/data/entities/PayChannelSelect;

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

.method public static final synthetic t4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->s0:Ljava/lang/String;

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

.method public static final synthetic u4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->F4(Ljava/lang/String;)V

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

.method public static final v4(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)Landroid/content/Context;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/blankj/utilcode/util/a;->h()Landroid/app/Activity;

    .line 10
    move-result-object p0

    .line 11
    :cond_0
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
.method public final A4(Landroid/widget/TextView;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p2    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 8
    .line 9
    .line 10
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p2, v0}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    sget-object p2, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 21
    .line 22
    new-instance v0, Lkotlin/Pair;

    .line 23
    .line 24
    sget-object v1, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 25
    .line 26
    new-instance v2, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$a;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->w4()Landroid/content/Context;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    const-string v4, "<get-dialogContext>(...)"

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    const/4 v5, 0x1

    .line 37
    .line 38
    .line 39
    invoke-direct {v2, v3, p3, v5}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$a;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    new-instance p3, Lkotlin/Pair;

    .line 45
    .line 46
    sget-object v1, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN1:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 47
    .line 48
    new-instance v2, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$a;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->w4()Landroid/content/Context;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    .line 55
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v2, v3, p4, v5}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$a;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p3, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    new-instance p4, Lkotlin/Pair;

    .line 64
    .line 65
    sget-object v1, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN2:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 66
    .line 67
    new-instance v2, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$a;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->w4()Landroid/content/Context;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {v2, v3, p5, v5}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$a;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p4, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    filled-new-array {v0, p3, p4}, [Lkotlin/Pair;

    .line 84
    move-result-object p3

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, p1, p3}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 88
    return-void
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
.end method

.method public final B4(Landroid/widget/TextView;)V
    .locals 6

    .line 1
    .line 2
    sget v2, Lcom/kubi/otc/R$string;->payment_third_treasura_disclaimer:I

    .line 3
    .line 4
    const-string v4, "https://trytreasura.com/terms-and-conditions"

    .line 5
    .line 6
    const-string v5, "https://trytreasura.com/privacy-policy"

    .line 7
    .line 8
    const-string v3, "https://www.trytreasura.com"

    .line 9
    move-object v0, p0

    .line 10
    move-object v1, p1

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->A4(Landroid/widget/TextView;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    return-void
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

.method public final F4(Ljava/lang/String;)V
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "https://docs.google.com/gview?embedded=true&url="

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    const/16 v8, 0x7e

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v7, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static/range {v0 .. v9}, Lg00/r$a;->a(Lg00/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

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
.end method

.method public b3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V
    .locals 8
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/resources/dialog/DialogFragmentHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "viewHolder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "helper"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget p2, Lcom/kubi/otc/R$id;->tv_fiat:I

    .line 13
    .line 14
    new-instance v0, Lcom/kubi/utils/v0;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Lcom/kubi/utils/v0;-><init>()V

    .line 18
    .line 19
    iget-object v1, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->t0:Lcom/kubi/payment/third/data/entities/PayChannelSelect;

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/kubi/payment/third/data/entities/PayChannelSelect;->getPayDetail()Lcom/kubi/payment/third/data/entities/PayDetail;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/kubi/payment/third/data/entities/PayDetail;->getPayFiatCurrencyAmount()Ljava/math/BigDecimal;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v1, v2

    .line 41
    .line 42
    :goto_0
    const-string v3, "--"

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    sget v4, Lcom/kubi/otc/R$color;->emphasis:I

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, v4}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->getColorRes(I)I

    .line 52
    move-result v5

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1, v5}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    const/16 v5, 0x20

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    iget-object v6, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->q0:Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    move-result-object v6

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    sget v6, Lcom/kubi/otc/R$color;->emphasis60:I

    .line 82
    .line 83
    .line 84
    invoke-direct {p0, v6}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->getColorRes(I)I

    .line 85
    move-result v7

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1, v7}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 93
    .line 94
    sget p2, Lcom/kubi/otc/R$id;->tv_amount:I

    .line 95
    .line 96
    new-instance v0, Lcom/kubi/utils/v0;

    .line 97
    .line 98
    .line 99
    invoke-direct {v0}, Lcom/kubi/utils/v0;-><init>()V

    .line 100
    .line 101
    iget-object v1, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->t0:Lcom/kubi/payment/third/data/entities/PayChannelSelect;

    .line 102
    .line 103
    if-eqz v1, :cond_1

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Lcom/kubi/payment/third/data/entities/PayChannelSelect;->getCurrencyAmount()Ljava/lang/String;

    .line 107
    move-result-object v1

    .line 108
    goto :goto_1

    .line 109
    :cond_1
    move-object v1, v2

    .line 110
    .line 111
    .line 112
    :goto_1
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    move-result-object v1

    .line 114
    .line 115
    .line 116
    invoke-direct {p0, v4}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->getColorRes(I)I

    .line 117
    move-result v3

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1, v3}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    new-instance v1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    iget-object v3, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->r0:Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    move-result-object v3

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    move-result-object v1

    .line 143
    .line 144
    .line 145
    invoke-direct {p0, v6}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->getColorRes(I)I

    .line 146
    move-result v3

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v1, v3}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 150
    move-result-object v0

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 154
    .line 155
    sget p2, Lcom/kubi/otc/R$id;->tv_account:I

    .line 156
    .line 157
    iget-object v0, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->t0:Lcom/kubi/payment/third/data/entities/PayChannelSelect;

    .line 158
    .line 159
    if-eqz v0, :cond_2

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Lcom/kubi/payment/third/data/entities/PayChannelSelect;->getPayDetail()Lcom/kubi/payment/third/data/entities/PayDetail;

    .line 163
    move-result-object v0

    .line 164
    .line 165
    if-eqz v0, :cond_2

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Lcom/kubi/payment/third/data/entities/PayDetail;->getAccount()Ljava/lang/String;

    .line 169
    move-result-object v0

    .line 170
    goto :goto_2

    .line 171
    :cond_2
    move-object v0, v2

    .line 172
    .line 173
    .line 174
    :goto_2
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    move-result-object v0

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 179
    .line 180
    sget p2, Lcom/kubi/otc/R$id;->tv_statement:I

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 184
    move-result-object v0

    .line 185
    .line 186
    check-cast v0, Landroid/widget/TextView;

    .line 187
    .line 188
    iget-object v1, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->t0:Lcom/kubi/payment/third/data/entities/PayChannelSelect;

    .line 189
    .line 190
    if-eqz v1, :cond_3

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1}, Lcom/kubi/payment/third/data/entities/PayChannelSelect;->getChannel()Ljava/lang/String;

    .line 194
    move-result-object v1

    .line 195
    goto :goto_3

    .line 196
    :cond_3
    move-object v1, v2

    .line 197
    .line 198
    :goto_3
    if-eqz v1, :cond_a

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 202
    move-result v3

    .line 203
    .line 204
    .line 205
    sparse-switch v3, :sswitch_data_0

    .line 206
    .line 207
    goto/16 :goto_5

    .line 208
    .line 209
    :sswitch_0
    const-string v3, "treasura"

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    move-result v1

    .line 214
    .line 215
    if-nez v1, :cond_4

    .line 216
    goto :goto_5

    .line 217
    .line 218
    .line 219
    :cond_4
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, v0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->B4(Landroid/widget/TextView;)V

    .line 223
    .line 224
    goto/16 :goto_7

    .line 225
    .line 226
    :sswitch_1
    const-string v3, "banxa"

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    move-result v1

    .line 231
    .line 232
    if-nez v1, :cond_9

    .line 233
    goto :goto_5

    .line 234
    .line 235
    :sswitch_2
    const-string v3, "legendtrading"

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 239
    move-result v1

    .line 240
    .line 241
    if-nez v1, :cond_5

    .line 242
    goto :goto_5

    .line 243
    .line 244
    .line 245
    :cond_5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0, v0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->z4(Landroid/widget/TextView;)V

    .line 249
    goto :goto_7

    .line 250
    .line 251
    :sswitch_3
    const-string v3, "onramp"

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    move-result v1

    .line 256
    .line 257
    if-nez v1, :cond_6

    .line 258
    goto :goto_5

    .line 259
    .line 260
    :cond_6
    iget-object p2, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->t0:Lcom/kubi/payment/third/data/entities/PayChannelSelect;

    .line 261
    .line 262
    if-eqz p2, :cond_7

    .line 263
    .line 264
    .line 265
    invoke-virtual {p2}, Lcom/kubi/payment/third/data/entities/PayChannelSelect;->getDisclaimer()Ljava/lang/String;

    .line 266
    move-result-object p2

    .line 267
    goto :goto_4

    .line 268
    :cond_7
    move-object p2, v2

    .line 269
    .line 270
    .line 271
    :goto_4
    invoke-static {p2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 272
    move-result-object p2

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 276
    goto :goto_7

    .line 277
    .line 278
    :sswitch_4
    const-string v3, "cointr"

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    move-result v1

    .line 283
    .line 284
    if-nez v1, :cond_8

    .line 285
    goto :goto_5

    .line 286
    .line 287
    .line 288
    :cond_8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p0, v0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->y4(Landroid/widget/TextView;)V

    .line 292
    goto :goto_7

    .line 293
    .line 294
    :sswitch_5
    const-string v3, "banxa_au"

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 298
    move-result v1

    .line 299
    .line 300
    if-nez v1, :cond_9

    .line 301
    goto :goto_5

    .line 302
    .line 303
    .line 304
    :cond_9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p0, v0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->x4(Landroid/widget/TextView;)V

    .line 308
    goto :goto_7

    .line 309
    .line 310
    :cond_a
    :goto_5
    iget-object v0, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->t0:Lcom/kubi/payment/third/data/entities/PayChannelSelect;

    .line 311
    .line 312
    if-eqz v0, :cond_b

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0}, Lcom/kubi/payment/third/data/entities/PayChannelSelect;->getDisclaimer()Ljava/lang/String;

    .line 316
    move-result-object v0

    .line 317
    goto :goto_6

    .line 318
    :cond_b
    move-object v0, v2

    .line 319
    .line 320
    .line 321
    :goto_6
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 322
    move-result-object v0

    .line 323
    .line 324
    .line 325
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 326
    .line 327
    .line 328
    :goto_7
    invoke-virtual {p0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->w4()Landroid/content/Context;

    .line 329
    move-result-object p2

    .line 330
    .line 331
    .line 332
    invoke-static {p2}, Lxy/a;->a(Landroid/content/Context;)Lxy/d;

    .line 333
    move-result-object p2

    .line 334
    .line 335
    iget-object v0, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->t0:Lcom/kubi/payment/third/data/entities/PayChannelSelect;

    .line 336
    .line 337
    if-eqz v0, :cond_c

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0}, Lcom/kubi/payment/third/data/entities/PayChannelSelect;->getIconUrl()Ljava/lang/String;

    .line 341
    move-result-object v2

    .line 342
    .line 343
    .line 344
    :cond_c
    invoke-virtual {p2, v2}, Lxy/d;->N(Ljava/lang/String;)Lxy/c;

    .line 345
    move-result-object p2

    .line 346
    .line 347
    sget v0, Lcom/kubi/otc/R$id;->iv_channel:I

    .line 348
    .line 349
    .line 350
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 351
    move-result-object v0

    .line 352
    .line 353
    check-cast v0, Landroid/widget/ImageView;

    .line 354
    .line 355
    .line 356
    invoke-virtual {p2, v0}, Lcom/bumptech/glide/g;->E0(Landroid/widget/ImageView;)Lm2/k;

    .line 357
    .line 358
    sget p2, Lcom/kubi/otc/R$id;->tv_buy:I

    .line 359
    .line 360
    .line 361
    invoke-virtual {p1, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 362
    move-result-object v0

    .line 363
    .line 364
    sget p2, Lcom/kubi/otc/R$id;->iv_cancel:I

    .line 365
    .line 366
    .line 367
    invoke-virtual {p1, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 368
    move-result-object v1

    .line 369
    .line 370
    const-string p2, "getView(...)"

    .line 371
    .line 372
    .line 373
    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 374
    .line 375
    new-instance v4, Lcom/kubi/payment/third/quote/a;

    .line 376
    .line 377
    .line 378
    invoke-direct {v4, p0}, Lcom/kubi/payment/third/quote/a;-><init>(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)V

    .line 379
    const/4 v5, 0x1

    .line 380
    const/4 v6, 0x0

    .line 381
    .line 382
    const-wide/16 v2, 0x0

    .line 383
    .line 384
    .line 385
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 386
    .line 387
    sget v1, Lcom/kubi/otc/R$id;->cb_check:I

    .line 388
    .line 389
    .line 390
    invoke-virtual {p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 391
    move-result-object p1

    .line 392
    .line 393
    .line 394
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 395
    .line 396
    check-cast p1, Landroid/widget/CompoundButton;

    .line 397
    .line 398
    new-instance p2, Lcom/kubi/payment/third/quote/b;

    .line 399
    .line 400
    .line 401
    invoke-direct {p2, v0}, Lcom/kubi/payment/third/quote/b;-><init>(Landroid/view/View;)V

    .line 402
    .line 403
    .line 404
    invoke-static {p1, p2}, Lcom/kubi/utils/extensions/k;->w(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    .line 405
    .line 406
    .line 407
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 408
    .line 409
    new-instance v3, Lcom/kubi/payment/third/quote/c;

    .line 410
    .line 411
    .line 412
    invoke-direct {v3, p0}, Lcom/kubi/payment/third/quote/c;-><init>(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)V

    .line 413
    const/4 v4, 0x1

    .line 414
    const/4 v5, 0x0

    .line 415
    .line 416
    const-wide/16 v1, 0x0

    .line 417
    .line 418
    .line 419
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 420
    return-void

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
    :sswitch_data_0
    .sparse-switch
        -0x6e12bd65 -> :sswitch_5
        -0x50c2a331 -> :sswitch_4
        -0x3c52ad8f -> :sswitch_3
        -0x4e6f78c -> :sswitch_2
        0x592c338 -> :sswitch_1
        0x527522ab -> :sswitch_0
    .end sparse-switch
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

.method public final w4()Landroid/content/Context;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->w0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroid/content/Context;

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

.method public final x4(Landroid/widget/TextView;)V
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 12
    .line 13
    new-instance v2, Lcom/kubi/utils/v0;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2}, Lcom/kubi/utils/v0;-><init>()V

    .line 17
    .line 18
    sget v3, Lcom/kubi/otc/R$string;->payment_terms:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 22
    move-result-object v5

    .line 23
    .line 24
    const-string v3, "getString(...)"

    .line 25
    .line 26
    .line 27
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    sget v4, Lcom/kubi/otc/R$string;->payment_privacy:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 33
    move-result-object v10

    .line 34
    .line 35
    .line 36
    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    sget v4, Lcom/kubi/otc/R$string;->payment_banxa_statement:I

    .line 39
    .line 40
    const-string v12, "https://banxa.com"

    .line 41
    .line 42
    .line 43
    filled-new-array {v12, v5, v10}, [Ljava/lang/Object;

    .line 44
    move-result-object v6

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v4, v6}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    move-result-object v4

    .line 49
    .line 50
    .line 51
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v4}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 55
    const/4 v15, 0x6

    .line 56
    .line 57
    const/16 v16, 0x0

    .line 58
    const/4 v13, 0x0

    .line 59
    const/4 v14, 0x0

    .line 60
    move-object v11, v4

    .line 61
    .line 62
    .line 63
    invoke-static/range {v11 .. v16}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 64
    move-result v3

    .line 65
    .line 66
    add-int/lit8 v6, v3, 0x11

    .line 67
    .line 68
    new-instance v7, Landroid/text/style/UnderlineSpan;

    .line 69
    .line 70
    .line 71
    invoke-direct {v7}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 72
    .line 73
    const/16 v12, 0x21

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v7, v3, v6, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 77
    .line 78
    new-instance v7, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$b;

    .line 79
    .line 80
    .line 81
    invoke-direct {v7, v0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$b;-><init>(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)V

    .line 82
    .line 83
    const/16 v13, 0x12

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v7, v3, v6, v13}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 87
    const/4 v8, 0x6

    .line 88
    const/4 v9, 0x0

    .line 89
    const/4 v6, 0x0

    .line 90
    const/4 v7, 0x0

    .line 91
    .line 92
    .line 93
    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 94
    move-result v3

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 98
    move-result v5

    .line 99
    add-int/2addr v5, v3

    .line 100
    .line 101
    new-instance v6, Landroid/text/style/UnderlineSpan;

    .line 102
    .line 103
    .line 104
    invoke-direct {v6}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v6, v3, v5, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 108
    .line 109
    new-instance v6, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$c;

    .line 110
    .line 111
    .line 112
    invoke-direct {v6, v0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$c;-><init>(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v6, v3, v5, v13}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 116
    move-object v7, v10

    .line 117
    const/4 v10, 0x6

    .line 118
    const/4 v11, 0x0

    .line 119
    const/4 v8, 0x0

    .line 120
    const/4 v9, 0x0

    .line 121
    move-object v6, v4

    .line 122
    .line 123
    .line 124
    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 125
    move-result v3

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 129
    move-result v4

    .line 130
    add-int/2addr v4, v3

    .line 131
    .line 132
    new-instance v5, Landroid/text/style/UnderlineSpan;

    .line 133
    .line 134
    .line 135
    invoke-direct {v5}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v5, v3, v4, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 139
    .line 140
    new-instance v5, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$d;

    .line 141
    .line 142
    .line 143
    invoke-direct {v5, v0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$d;-><init>(Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v5, v3, v4, v13}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    return-void
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

.method public final y4(Landroid/widget/TextView;)V
    .locals 6

    .line 1
    .line 2
    sget v2, Lcom/kubi/otc/R$string;->payment_3d_disclaimer_cointr:I

    .line 3
    .line 4
    const-string v4, "https://support.cointr.com/hc/tr/articles/5538297429903"

    .line 5
    .line 6
    const-string v5, "https://support.cointr.com/hc/tr/articles/5538328908943"

    .line 7
    .line 8
    const-string v3, "https://cointr.com"

    .line 9
    move-object v0, p0

    .line 10
    move-object v1, p1

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->A4(Landroid/widget/TextView;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    return-void
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

.method public final z4(Landroid/widget/TextView;)V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 12
    .line 13
    new-instance v2, Lcom/kubi/utils/v0;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2}, Lcom/kubi/utils/v0;-><init>()V

    .line 17
    .line 18
    sget v3, Lcom/kubi/otc/R$string;->payment_terms:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 22
    move-result-object v5

    .line 23
    .line 24
    const-string v3, "getString(...)"

    .line 25
    .line 26
    .line 27
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    sget v4, Lcom/kubi/otc/R$string;->payment_privacy:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 33
    move-result-object v7

    .line 34
    .line 35
    .line 36
    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    sget v11, Lcom/kubi/otc/R$string;->payment_3d_statement_template:I

    .line 39
    .line 40
    const-string v9, "LegendTrading"

    .line 41
    .line 42
    const-string v10, "support@legendtrading.com"

    .line 43
    .line 44
    const-string v4, "https://legendtrading.com"

    .line 45
    move-object v8, v7

    .line 46
    move-object v7, v5

    .line 47
    .line 48
    const-string v5, "LegendTrading"

    .line 49
    .line 50
    const-string v6, "LegendTrading"

    .line 51
    .line 52
    .line 53
    filled-new-array/range {v4 .. v10}, [Ljava/lang/Object;

    .line 54
    move-result-object v4

    .line 55
    move-object v10, v8

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v11, v4}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    move-result-object v4

    .line 60
    .line 61
    .line 62
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v4}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 66
    .line 67
    const/16 v16, 0x6

    .line 68
    .line 69
    const/16 v17, 0x0

    .line 70
    .line 71
    const-string v13, "https://legendtrading.com"

    .line 72
    const/4 v14, 0x0

    .line 73
    const/4 v15, 0x0

    .line 74
    move-object v12, v4

    .line 75
    .line 76
    .line 77
    invoke-static/range {v12 .. v17}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 78
    move-result v3

    .line 79
    .line 80
    add-int/lit8 v5, v3, 0x19

    .line 81
    .line 82
    new-instance v6, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$a;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->w4()Landroid/content/Context;

    .line 86
    move-result-object v8

    .line 87
    .line 88
    const-string v12, "<get-dialogContext>(...)"

    .line 89
    .line 90
    .line 91
    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    const-string v9, "https://legendtrading.com"

    .line 94
    const/4 v13, 0x1

    .line 95
    .line 96
    .line 97
    invoke-direct {v6, v8, v9, v13}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$a;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 98
    .line 99
    const/16 v14, 0x12

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v6, v3, v5, v14}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 103
    const/4 v8, 0x6

    .line 104
    const/4 v9, 0x0

    .line 105
    const/4 v6, 0x0

    .line 106
    move-object v5, v7

    .line 107
    const/4 v7, 0x0

    .line 108
    .line 109
    .line 110
    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 111
    move-result v3

    .line 112
    move-object v7, v5

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 116
    move-result v5

    .line 117
    add-int/2addr v5, v3

    .line 118
    .line 119
    new-instance v6, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$a;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->w4()Landroid/content/Context;

    .line 123
    move-result-object v7

    .line 124
    .line 125
    .line 126
    invoke-static {v7, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    const-string v8, "https://legendtrading.com/terms"

    .line 129
    .line 130
    .line 131
    invoke-direct {v6, v7, v8, v13}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$a;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v6, v3, v5, v14}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 135
    move-object v8, v10

    .line 136
    const/4 v10, 0x6

    .line 137
    const/4 v11, 0x0

    .line 138
    move-object v7, v8

    .line 139
    const/4 v8, 0x0

    .line 140
    const/4 v9, 0x0

    .line 141
    move-object v6, v4

    .line 142
    .line 143
    .line 144
    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 145
    move-result v3

    .line 146
    move-object v8, v7

    .line 147
    .line 148
    .line 149
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 150
    move-result v4

    .line 151
    add-int/2addr v4, v3

    .line 152
    .line 153
    new-instance v5, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$a;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;->w4()Landroid/content/Context;

    .line 157
    move-result-object v6

    .line 158
    .line 159
    .line 160
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    const-string v7, "https://legendtrading.com/policy"

    .line 163
    .line 164
    .line 165
    invoke-direct {v5, v6, v7, v13}, Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$a;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v5, v3, v4, v14}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    return-void
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
