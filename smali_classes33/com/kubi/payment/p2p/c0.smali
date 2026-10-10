.class public final Lcom/kubi/payment/p2p/c0;
.super Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;
.source "P2PViewModelFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J%\u0010\u0008\u001a\u0002H\t\"\u0008\u0008\u0000\u0010\t*\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u0002H\t0\u000cH\u0016\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/kubi/payment/p2p/P2PViewModelFactory;",
        "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;",
        "p2pRepository",
        "Lcom/kubi/payment/p2p/data/source/IP2PRepository;",
        "application",
        "Landroid/app/Application;",
        "<init>",
        "(Lcom/kubi/payment/p2p/data/source/IP2PRepository;Landroid/app/Application;)V",
        "create",
        "T",
        "Landroidx/lifecycle/ViewModel;",
        "modelClass",
        "Ljava/lang/Class;",
        "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;",
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


# instance fields
.field public final a:Lcom/kubi/payment/p2p/data/source/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Landroid/app/Application;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/payment/p2p/data/source/a;Landroid/app/Application;)V
    .locals 1
    .param p1    # Lcom/kubi/payment/p2p/data/source/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "p2pRepository"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "application"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2}, Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;-><init>(Landroid/app/Application;)V

    .line 14
    .line 15
    iput-object p1, p0, Lcom/kubi/payment/p2p/c0;->a:Lcom/kubi/payment/p2p/data/source/a;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/kubi/payment/p2p/c0;->b:Landroid/app/Application;

    .line 18
    return-void
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


# virtual methods
.method public create(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;
    .locals 3
    .param p1    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "modelClass"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-class v0, Lcom/kubi/payment/p2p/P2PViewModel;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance p1, Lcom/kubi/payment/p2p/P2PViewModel;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/payment/p2p/c0;->a:Lcom/kubi/payment/p2p/data/source/a;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, v0}, Lcom/kubi/payment/p2p/P2PViewModel;-><init>(Lcom/kubi/payment/p2p/data/source/a;)V

    .line 21
    return-object p1

    .line 22
    .line 23
    :cond_0
    const-class v0, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 27
    move-result v0

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    new-instance p1, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;

    .line 32
    .line 33
    iget-object v0, p0, Lcom/kubi/payment/p2p/c0;->a:Lcom/kubi/payment/p2p/data/source/a;

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, v0}, Lcom/kubi/payment/p2p/order/OrderDetailViewModel;-><init>(Lcom/kubi/payment/p2p/data/source/a;)V

    .line 37
    return-object p1

    .line 38
    .line 39
    :cond_1
    const-class v0, Lcom/kubi/payment/p2p/order/transfer/OrderTransferViewModel;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 43
    move-result v0

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    new-instance p1, Lcom/kubi/payment/p2p/order/transfer/OrderTransferViewModel;

    .line 48
    .line 49
    iget-object v0, p0, Lcom/kubi/payment/p2p/c0;->a:Lcom/kubi/payment/p2p/data/source/a;

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, v0}, Lcom/kubi/payment/p2p/order/transfer/OrderTransferViewModel;-><init>(Lcom/kubi/payment/p2p/data/source/a;)V

    .line 53
    return-object p1

    .line 54
    .line 55
    :cond_2
    const-class v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 59
    move-result v0

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    new-instance p1, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;

    .line 64
    .line 65
    iget-object v0, p0, Lcom/kubi/payment/p2p/c0;->a:Lcom/kubi/payment/p2p/data/source/a;

    .line 66
    .line 67
    .line 68
    invoke-direct {p1, v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;-><init>(Lcom/kubi/payment/p2p/data/source/a;)V

    .line 69
    return-object p1

    .line 70
    .line 71
    :cond_3
    const-class v0, Lcom/kubi/payment/p2p/trade/P2PTradeMarketListViewModel;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 75
    move-result v0

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    new-instance p1, Lcom/kubi/payment/p2p/trade/P2PTradeMarketListViewModel;

    .line 80
    .line 81
    iget-object v0, p0, Lcom/kubi/payment/p2p/c0;->a:Lcom/kubi/payment/p2p/data/source/a;

    .line 82
    .line 83
    .line 84
    invoke-direct {p1, v0}, Lcom/kubi/payment/p2p/trade/P2PTradeMarketListViewModel;-><init>(Lcom/kubi/payment/p2p/data/source/a;)V

    .line 85
    return-object p1

    .line 86
    .line 87
    :cond_4
    const-class v0, Lcom/kubi/payment/p2p/order/express/P2PExpressVM;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 91
    move-result v0

    .line 92
    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    new-instance p1, Lcom/kubi/payment/p2p/order/express/P2PExpressVM;

    .line 96
    .line 97
    iget-object v0, p0, Lcom/kubi/payment/p2p/c0;->a:Lcom/kubi/payment/p2p/data/source/a;

    .line 98
    .line 99
    .line 100
    invoke-direct {p1, v0}, Lcom/kubi/payment/p2p/order/express/P2PExpressVM;-><init>(Lcom/kubi/payment/p2p/data/source/a;)V

    .line 101
    return-object p1

    .line 102
    .line 103
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 104
    .line 105
    new-instance v1, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    const-string v2, "Unknown ViewModel class: "

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    move-result-object p1

    .line 125
    .line 126
    .line 127
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 128
    throw v0
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
