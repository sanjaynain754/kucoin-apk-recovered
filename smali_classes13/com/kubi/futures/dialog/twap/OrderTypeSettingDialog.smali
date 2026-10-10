.class public final Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;
.super Lcom/kubi/resources/dialog/DialogFragmentHelper;
.source "OrderTypeSettingDialog.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0008\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0008\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00132\u0008\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0002J\u0008\u0010*\u001a\u00020%H\u0002J\u0010\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-H\u0002J\u0008\u0010.\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\tR\u001d\u0010\u000c\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000b\u001a\u0004\u0008\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000b\u001a\u0004\u0008\u0010\u0010\tR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"
    }
    d2 = {
        "Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;",
        "Lcom/kubi/resources/dialog/DialogFragmentHelper;",
        "<init>",
        "()V",
        "binding",
        "Lcom/kubi/kumex/databinding/BkumexDialogTwapOrderTypeSettingBinding;",
        "curMarketPrice",
        "",
        "getCurMarketPrice",
        "()Ljava/lang/String;",
        "curMarketPrice$delegate",
        "Lkotlin/Lazy;",
        "symbol",
        "getSymbol",
        "symbol$delegate",
        "reqKey",
        "getReqKey",
        "reqKey$delegate",
        "priceSettingView",
        "Landroid/view/View;",
        "percentTv",
        "Lcom/kubi/resources/widget/BaseTextView;",
        "valueDeltaTv",
        "customPriceWithPercentView",
        "Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithPercentView;",
        "customPriceWithValueView",
        "Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithValueView;",
        "onCreateView",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "initType",
        "",
        "onViewCreated",
        "",
        "view",
        "setSelected",
        "orderPriceType",
        "Lcom/kubi/futures/dialog/twap/OrderPriceType;",
        "switchPriceType",
        "setCustomPriceSelected",
        "isSelected",
        "",
        "initPriceSettingViewStub",
        "Companion",
        "KumexLib_googleRelease"
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
        "SMAP\nOrderTypeSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderTypeSettingDialog.kt\ncom/kubi/futures/dialog/twap/OrderTypeSettingDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,272:1\n1#2:273\n254#3:274\n*S KotlinDebug\n*F\n+ 1 OrderTypeSettingDialog.kt\ncom/kubi/futures/dialog/twap/OrderTypeSettingDialog\n*L\n106#1:274\n*E\n"
    }
.end annotation


# static fields
.field public static final z0:Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public q0:Ldm/g1;

.field public final r0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final s0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final t0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public u0:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public v0:Lcom/kubi/resources/widget/BaseTextView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public w0:Lcom/kubi/resources/widget/BaseTextView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public x0:Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithPercentView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public y0:Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithValueView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->z0:Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog$Companion;

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
    .line 32
    .line 33
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lzh/h;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lzh/h;-><init>(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->r0:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lzh/i;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lzh/i;-><init>(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->s0:Lkotlin/Lazy;

    .line 26
    .line 27
    new-instance v0, Lzh/j;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p0}, Lzh/j;-><init>(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    iput-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->t0:Lkotlin/Lazy;

    .line 37
    return-void
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
.end method

.method public static final A4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/futures/dialog/twap/OrderPriceType$MarketPrice;->INSTANCE:Lcom/kubi/futures/dialog/twap/OrderPriceType$MarketPrice;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->F4(Lcom/kubi/futures/dialog/twap/OrderPriceType;)V

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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
.end method

.method public static final B4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->G4()V

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
.end method

.method public static final C4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;
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
.end method

.method public static final D4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const-string v0, "data_1"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object p0

    .line 17
    .line 18
    :cond_1
    :goto_0
    const-string p0, ""

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
.end method

.method public static final H4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Ljava/lang/String;
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
    const-string v0, "symbol"

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, Lcom/kubi/router/utils/RouteExKt;->y(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
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
.end method

.method public static synthetic j4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->C4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;

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
.end method

.method public static synthetic k4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->z4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;

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
.end method

.method public static synthetic l4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->y4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;

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
.end method

.method public static synthetic m4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->D4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Ljava/lang/String;

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
.end method

.method public static synthetic n4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->A4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;

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
.end method

.method public static synthetic o4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->H4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Ljava/lang/String;

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
.end method

.method public static synthetic p4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->x4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;

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
.end method

.method public static synthetic q4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->B4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;

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
.end method

.method public static synthetic r4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->s4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Ljava/lang/String;

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
.end method

.method public static final s4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Ljava/lang/String;
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
    const-string v0, "cur_market_price"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
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
.end method

.method private final u4()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->t0:Lkotlin/Lazy;

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
    .line 32
    .line 33
.end method

.method private final v4()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->s0:Lkotlin/Lazy;

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
    .line 32
    .line 33
.end method

.method public static final x4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->v0:Lcom/kubi/resources/widget/BaseTextView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->w0:Lcom/kubi/resources/widget/BaseTextView;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->v0:Lcom/kubi/resources/widget/BaseTextView;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    sget v1, Lcom/kubi/kumex/R$drawable;->shape_darkoverlay_6r:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 26
    .line 27
    :cond_2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->w0:Lcom/kubi/resources/widget/BaseTextView;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    const/4 v1, 0x0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 34
    .line 35
    :cond_3
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->v0:Lcom/kubi/resources/widget/BaseTextView;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 40
    .line 41
    sget v2, Lcom/kubi/kumex/R$color;->c_text:I

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 45
    move-result v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 49
    .line 50
    :cond_4
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->w0:Lcom/kubi/resources/widget/BaseTextView;

    .line 51
    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 55
    .line 56
    sget v2, Lcom/kubi/kumex/R$color;->c_text60:I

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 60
    move-result v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 64
    .line 65
    :cond_5
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->x0:Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithPercentView;

    .line 66
    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 71
    .line 72
    :cond_6
    iget-object p0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->y0:Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithValueView;

    .line 73
    .line 74
    if-eqz p0, :cond_7

    .line 75
    .line 76
    .line 77
    invoke-static {p0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 78
    .line 79
    :cond_7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 80
    return-object p0
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
.end method

.method public static final y4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->v0:Lcom/kubi/resources/widget/BaseTextView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->w0:Lcom/kubi/resources/widget/BaseTextView;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    const/4 v1, 0x1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->w0:Lcom/kubi/resources/widget/BaseTextView;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    sget v1, Lcom/kubi/kumex/R$drawable;->shape_darkoverlay_6r:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 26
    .line 27
    :cond_2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->v0:Lcom/kubi/resources/widget/BaseTextView;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    const/4 v1, 0x0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 34
    .line 35
    :cond_3
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->v0:Lcom/kubi/resources/widget/BaseTextView;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 40
    .line 41
    sget v2, Lcom/kubi/kumex/R$color;->c_text60:I

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 45
    move-result v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 49
    .line 50
    :cond_4
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->w0:Lcom/kubi/resources/widget/BaseTextView;

    .line 51
    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 55
    .line 56
    sget v2, Lcom/kubi/kumex/R$color;->c_text:I

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 60
    move-result v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 64
    .line 65
    :cond_5
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->x0:Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithPercentView;

    .line 66
    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 71
    .line 72
    :cond_6
    iget-object p0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->y0:Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithValueView;

    .line 73
    .line 74
    if-eqz p0, :cond_7

    .line 75
    .line 76
    .line 77
    invoke-static {p0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 78
    .line 79
    :cond_7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 80
    return-object p0
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
.end method

.method public static final z4(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)Lkotlin/Unit;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->q0:Ldm/g1;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "binding"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    :cond_0
    iget-object v0, v0, Ldm/g1;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->isSelected()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget-object v1, Lcom/kubi/futures/dialog/twap/OrderPriceType$MarketPrice;->INSTANCE:Lcom/kubi/futures/dialog/twap/OrderPriceType$MarketPrice;

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->x0:Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithPercentView;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->x0:Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithPercentView;

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithPercentView;->h()Lcom/kubi/futures/dialog/twap/OrderPriceType;

    .line 40
    move-result-object v1

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->y0:Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithValueView;

    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->t4()Ljava/lang/String;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    .line 54
    invoke-static {v2}, Lkotlin/text/StringsKt;->toBigDecimalOrNull(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-virtual {v0, v1}, Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithValueView;->j(Ljava/math/BigDecimal;)Lcom/kubi/futures/dialog/twap/OrderPriceType;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    :cond_4
    :goto_0
    if-eqz v1, :cond_6

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    .line 76
    invoke-direct {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->u4()Ljava/lang/String;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    new-instance v3, Landroid/os/Bundle;

    .line 80
    .line 81
    .line 82
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 83
    .line 84
    const-string v4, "order_price_type"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v4, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 88
    .line 89
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2, v3}, Landroidx/fragment/app/FragmentManager;->setFragmentResult(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 93
    .line 94
    .line 95
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 96
    .line 97
    :cond_6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 98
    return-object p0
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
.end method


# virtual methods
.method public final E4(Z)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->q0:Ldm/g1;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    :cond_0
    iget-object v0, v0, Ldm/g1;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 14
    .line 15
    xor-int/lit8 v3, p1, 0x1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v3}, Landroid/view/View;->setSelected(Z)V

    .line 19
    .line 20
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->q0:Ldm/g1;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v1, v0

    .line 28
    .line 29
    :goto_0
    iget-object v0, v1, Ldm/g1;->c:Lcom/kubi/resources/widget/BaseTextView;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 33
    return-void
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
.end method

.method public final F4(Lcom/kubi/futures/dialog/twap/OrderPriceType;)V
    .locals 2

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/futures/dialog/twap/OrderPriceType$CustomPriceWithPercent;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->E4(Z)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->u0:Landroid/view/View;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->w4()V

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 22
    .line 23
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->v0:Lcom/kubi/resources/widget/BaseTextView;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 29
    .line 30
    :cond_2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->x0:Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithPercentView;

    .line 31
    .line 32
    if-eqz v0, :cond_9

    .line 33
    .line 34
    check-cast p1, Lcom/kubi/futures/dialog/twap/OrderPriceType$CustomPriceWithPercent;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/kubi/futures/dialog/twap/OrderPriceType$CustomPriceWithPercent;->getPercent()Ljava/math/BigDecimal;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithPercentView;->setInputPercent(Ljava/math/BigDecimal;)V

    .line 42
    return-void

    .line 43
    .line 44
    :cond_3
    instance-of v0, p1, Lcom/kubi/futures/dialog/twap/OrderPriceType$CustomPriceWithValueDelta;

    .line 45
    .line 46
    if-eqz v0, :cond_7

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->E4(Z)V

    .line 50
    .line 51
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->u0:Landroid/view/View;

    .line 52
    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->w4()V

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :cond_4
    if-eqz v0, :cond_5

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 63
    .line 64
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->w0:Lcom/kubi/resources/widget/BaseTextView;

    .line 65
    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 70
    .line 71
    :cond_6
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->y0:Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithValueView;

    .line 72
    .line 73
    if-eqz v0, :cond_9

    .line 74
    .line 75
    check-cast p1, Lcom/kubi/futures/dialog/twap/OrderPriceType$CustomPriceWithValueDelta;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/kubi/futures/dialog/twap/OrderPriceType$CustomPriceWithValueDelta;->getValueDelta()Ljava/math/BigDecimal;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p1}, Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithValueView;->setInputDelta(Ljava/math/BigDecimal;)V

    .line 83
    return-void

    .line 84
    .line 85
    :cond_7
    instance-of p1, p1, Lcom/kubi/futures/dialog/twap/OrderPriceType$MarketPrice;

    .line 86
    .line 87
    if-eqz p1, :cond_a

    .line 88
    const/4 p1, 0x0

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->E4(Z)V

    .line 92
    .line 93
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->u0:Landroid/view/View;

    .line 94
    .line 95
    if-eqz p1, :cond_8

    .line 96
    .line 97
    .line 98
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 99
    .line 100
    :cond_8
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->u0:Landroid/view/View;

    .line 101
    .line 102
    if-eqz p1, :cond_9

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, Lcom/blankj/utilcode/util/KeyboardUtils;->f(Landroid/view/View;)V

    .line 106
    :cond_9
    return-void

    .line 107
    .line 108
    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 109
    .line 110
    .line 111
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 112
    throw p1
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
.end method

.method public final G4()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->q0:Ldm/g1;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "binding"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    :cond_0
    iget-object v0, v0, Ldm/g1;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->isSelected()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    const/4 v0, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->E4(Z)V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->u0:Landroid/view/View;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->w4()V

    .line 30
    return-void

    .line 31
    .line 32
    :cond_1
    if-eqz v0, :cond_3

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 36
    return-void

    .line 37
    :cond_2
    const/4 v0, 0x0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->E4(Z)V

    .line 41
    .line 42
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->u0:Landroid/view/View;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 48
    :cond_3
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
.end method

.method public N3()I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x8

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
    .line 32
    .line 33
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string p3, "inflater"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 p3, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2, p3}, Ldm/g1;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Ldm/g1;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    const-string p2, "inflate(...)"

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->q0:Ldm/g1;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const-string p1, "binding"

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 25
    const/4 p1, 0x0

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p1}, Ldm/g1;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 29
    move-result-object p1

    .line 30
    return-object p1
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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 7
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
    invoke-super {p0, p1, p2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const-string p2, "data"

    .line 17
    .line 18
    const-class v0, Lcom/kubi/futures/dialog/twap/OrderPriceType;

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2, v0}, Landroidx/core/os/BundleCompat;->getParcelable(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    check-cast p1, Lcom/kubi/futures/dialog/twap/OrderPriceType;

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    :cond_0
    sget-object p1, Lcom/kubi/futures/dialog/twap/OrderPriceType$MarketPrice;->INSTANCE:Lcom/kubi/futures/dialog/twap/OrderPriceType$MarketPrice;

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0, p1}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->F4(Lcom/kubi/futures/dialog/twap/OrderPriceType;)V

    .line 32
    .line 33
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->q0:Ldm/g1;

    .line 34
    const/4 p2, 0x0

    .line 35
    .line 36
    const-string v0, "binding"

    .line 37
    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 42
    move-object p1, p2

    .line 43
    .line 44
    :cond_2
    iget-object v1, p1, Ldm/g1;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 45
    .line 46
    const-string p1, "marketPriceCl"

    .line 47
    .line 48
    .line 49
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    new-instance v4, Lzh/k;

    .line 52
    .line 53
    .line 54
    invoke-direct {v4, p0}, Lzh/k;-><init>(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)V

    .line 55
    const/4 v5, 0x1

    .line 56
    const/4 v6, 0x0

    .line 57
    .line 58
    const-wide/16 v2, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 62
    .line 63
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->q0:Ldm/g1;

    .line 64
    .line 65
    if-nez p1, :cond_3

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 69
    move-object p1, p2

    .line 70
    .line 71
    :cond_3
    iget-object v1, p1, Ldm/g1;->c:Lcom/kubi/resources/widget/BaseTextView;

    .line 72
    .line 73
    const-string p1, "customPriceTv"

    .line 74
    .line 75
    .line 76
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    new-instance v4, Lzh/l;

    .line 79
    .line 80
    .line 81
    invoke-direct {v4, p0}, Lzh/l;-><init>(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)V

    .line 82
    const/4 v5, 0x1

    .line 83
    const/4 v6, 0x0

    .line 84
    .line 85
    const-wide/16 v2, 0x0

    .line 86
    .line 87
    .line 88
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 89
    .line 90
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->q0:Ldm/g1;

    .line 91
    .line 92
    if-nez p1, :cond_4

    .line 93
    .line 94
    .line 95
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 96
    move-object p1, p2

    .line 97
    .line 98
    :cond_4
    iget-object v1, p1, Ldm/g1;->d:Landroid/widget/ImageView;

    .line 99
    .line 100
    const-string p1, "ivClose"

    .line 101
    .line 102
    .line 103
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    new-instance v4, Lzh/m;

    .line 106
    .line 107
    .line 108
    invoke-direct {v4, p0}, Lzh/m;-><init>(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)V

    .line 109
    const/4 v5, 0x1

    .line 110
    const/4 v6, 0x0

    .line 111
    .line 112
    const-wide/16 v2, 0x0

    .line 113
    .line 114
    .line 115
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 116
    .line 117
    iget-object p1, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->q0:Ldm/g1;

    .line 118
    .line 119
    if-nez p1, :cond_5

    .line 120
    .line 121
    .line 122
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 123
    goto :goto_0

    .line 124
    :cond_5
    move-object p2, p1

    .line 125
    .line 126
    :goto_0
    iget-object v0, p2, Ldm/g1;->b:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 127
    .line 128
    const-string p1, "confirmTv"

    .line 129
    .line 130
    .line 131
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    new-instance v3, Lzh/n;

    .line 134
    .line 135
    .line 136
    invoke-direct {v3, p0}, Lzh/n;-><init>(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)V

    .line 137
    const/4 v4, 0x1

    .line 138
    const/4 v5, 0x0

    .line 139
    .line 140
    const-wide/16 v1, 0x0

    .line 141
    .line 142
    .line 143
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 144
    return-void
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
.end method

.method public final t4()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->r0:Lkotlin/Lazy;

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
    .line 32
    .line 33
.end method

.method public final w4()V
    .locals 15

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->q0:Ldm/g1;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "binding"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    :cond_0
    iget-object v0, v0, Ldm/g1;->g:Landroid/view/ViewStub;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iput-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->u0:Landroid/view/View;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    sget v2, Lcom/kubi/kumex/R$id;->percentTv:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    check-cast v0, Lcom/kubi/resources/widget/BaseTextView;

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v0, v1

    .line 32
    .line 33
    :goto_0
    iput-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->v0:Lcom/kubi/resources/widget/BaseTextView;

    .line 34
    const/4 v2, 0x1

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    .line 40
    .line 41
    :cond_2
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->u0:Landroid/view/View;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    sget v3, Lcom/kubi/kumex/R$id;->valueDeltaTv:I

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    check-cast v0, Lcom/kubi/resources/widget/BaseTextView;

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move-object v0, v1

    .line 54
    .line 55
    :goto_1
    iput-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->w0:Lcom/kubi/resources/widget/BaseTextView;

    .line 56
    .line 57
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->u0:Landroid/view/View;

    .line 58
    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    sget v3, Lcom/kubi/kumex/R$id;->customPriceWithPercentView:I

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    check-cast v0, Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithPercentView;

    .line 68
    goto :goto_2

    .line 69
    :cond_4
    move-object v0, v1

    .line 70
    .line 71
    :goto_2
    iput-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->x0:Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithPercentView;

    .line 72
    .line 73
    iget-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->u0:Landroid/view/View;

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    sget v3, Lcom/kubi/kumex/R$id;->customPriceWithValueView:I

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    check-cast v0, Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithValueView;

    .line 84
    goto :goto_3

    .line 85
    :cond_5
    move-object v0, v1

    .line 86
    .line 87
    :goto_3
    iput-object v0, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->y0:Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithValueView;

    .line 88
    .line 89
    if-eqz v0, :cond_7

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->t4()Ljava/lang/String;

    .line 93
    move-result-object v3

    .line 94
    .line 95
    if-eqz v3, :cond_6

    .line 96
    .line 97
    .line 98
    invoke-static {v3}, Lkotlin/text/StringsKt;->toBigDecimalOrNull(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 99
    move-result-object v3

    .line 100
    goto :goto_4

    .line 101
    :cond_6
    move-object v3, v1

    .line 102
    .line 103
    .line 104
    :goto_4
    invoke-static {v3, v1, v2, v1}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 105
    move-result-object v2

    .line 106
    .line 107
    sget-object v3, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 111
    move-result-object v3

    .line 112
    .line 113
    .line 114
    invoke-direct {p0}, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->v4()Ljava/lang/String;

    .line 115
    move-result-object v4

    .line 116
    .line 117
    .line 118
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    move-result-object v4

    .line 120
    const/4 v5, 0x0

    .line 121
    const/4 v6, 0x2

    .line 122
    .line 123
    .line 124
    invoke-static {v3, v4, v5, v6, v1}, Lth/d;->O(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 125
    move-result-object v1

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v2, v1}, Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithValueView;->k(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/platform/model/ContractEntity;)V

    .line 129
    .line 130
    :cond_7
    iget-object v3, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->v0:Lcom/kubi/resources/widget/BaseTextView;

    .line 131
    .line 132
    if-eqz v3, :cond_8

    .line 133
    .line 134
    new-instance v6, Lzh/o;

    .line 135
    .line 136
    .line 137
    invoke-direct {v6, p0}, Lzh/o;-><init>(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)V

    .line 138
    const/4 v7, 0x1

    .line 139
    const/4 v8, 0x0

    .line 140
    .line 141
    const-wide/16 v4, 0x0

    .line 142
    .line 143
    .line 144
    invoke-static/range {v3 .. v8}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 145
    .line 146
    :cond_8
    iget-object v9, p0, Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;->w0:Lcom/kubi/resources/widget/BaseTextView;

    .line 147
    .line 148
    if-eqz v9, :cond_9

    .line 149
    .line 150
    new-instance v12, Lzh/p;

    .line 151
    .line 152
    .line 153
    invoke-direct {v12, p0}, Lzh/p;-><init>(Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;)V

    .line 154
    const/4 v13, 0x1

    .line 155
    const/4 v14, 0x0

    .line 156
    .line 157
    const-wide/16 v10, 0x0

    .line 158
    .line 159
    .line 160
    invoke-static/range {v9 .. v14}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 161
    :cond_9
    return-void
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
.end method
