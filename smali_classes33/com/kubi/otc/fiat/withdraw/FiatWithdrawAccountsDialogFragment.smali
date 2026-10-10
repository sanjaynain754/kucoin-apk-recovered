.class public final Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;
.super Lcom/kubi/resources/dialog/DialogFragmentHelper;
.source "FiatWithdrawAccountsDialogFragment.kt"

# interfaces
.implements Lcom/kubi/resources/dialog/DialogFragmentHelper$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001 \u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020\u0001H\u0016J\u0018\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+H\u0002J\u0008\u0010,\u001a\u00020\u0017H\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\tR\u001d\u0010\u000c\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000b\u001a\u0004\u0008\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u000b\u001a\u0004\u0008\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u000b\u001a\u0004\u0008!\u0010\"\u00a8\u0006."
    }
    d2 = {
        "Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;",
        "Lcom/kubi/resources/dialog/DialogFragmentHelper;",
        "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;",
        "<init>",
        "()V",
        "fiatApi",
        "Lcom/kubi/otc/api/FiatApi;",
        "kotlin.jvm.PlatformType",
        "getFiatApi",
        "()Lcom/kubi/otc/api/FiatApi;",
        "fiatApi$delegate",
        "Lkotlin/Lazy;",
        "fatherFragment",
        "Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;",
        "getFatherFragment",
        "()Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;",
        "fatherFragment$delegate",
        "bundleDates",
        "Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;",
        "getBundleDates",
        "()Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;",
        "bundleDates$delegate",
        "isDelCard",
        "",
        "currentSelectId",
        "",
        "viewDialogHolder",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "itemSelect",
        "Lio/reactivex/functions/Consumer;",
        "Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;",
        "accountsAdapter",
        "com/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1",
        "getAccountsAdapter",
        "()Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1;",
        "accountsAdapter$delegate",
        "setupView",
        "",
        "viewHolder",
        "helper",
        "deleteAccount",
        "account",
        "action",
        "Lio/reactivex/functions/Action;",
        "needHideAccountManage",
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
        "SMAP\nFiatWithdrawAccountsDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatWithdrawAccountsDialogFragment.kt\ncom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,221:1\n17#2,2:222\n*S KotlinDebug\n*F\n+ 1 FiatWithdrawAccountsDialogFragment.kt\ncom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment\n*L\n197#1:222,2\n*E\n"
    }
.end annotation


# static fields
.field public static final y0:Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final q0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final r0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final s0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public t0:Z

.field public u0:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public v0:Lio/chad/library/adapter/base/BaseViewHolder;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public w0:Lio/reactivex/functions/Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/Consumer<",
            "Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final x0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->y0:Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$Companion;

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
    new-instance v0, Lcom/kubi/otc/fiat/withdraw/n0;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/otc/fiat/withdraw/n0;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->q0:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/otc/fiat/withdraw/o0;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/kubi/otc/fiat/withdraw/o0;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->r0:Lkotlin/Lazy;

    .line 26
    .line 27
    new-instance v0, Lcom/kubi/otc/fiat/withdraw/p0;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p0}, Lcom/kubi/otc/fiat/withdraw/p0;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    iput-object v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->s0:Lkotlin/Lazy;

    .line 37
    .line 38
    new-instance v0, Lcom/kubi/otc/fiat/withdraw/q0;

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, p0}, Lcom/kubi/otc/fiat/withdraw/q0;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    iput-object v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->x0:Lkotlin/Lazy;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->e4(Lcom/kubi/resources/dialog/DialogFragmentHelper$b;)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 51
    return-void
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

.method public static final synthetic A4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->t0:Z

    .line 3
    return p0
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

.method public static final synthetic B4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->S4()Z

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
.end method

.method public static final synthetic C4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->u0:Ljava/lang/String;

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

.method public static final synthetic D4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Lio/reactivex/functions/Consumer;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->w0:Lio/reactivex/functions/Consumer;

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

.method public static final E4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$layout;->payment_item_withdraw_account:I

    .line 3
    .line 4
    new-instance v1, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, v0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;I)V

    .line 8
    return-object v1
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

.method public static final F4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;
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
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    check-cast p0, Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;

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

.method public static final H4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;Lio/reactivex/functions/Action;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->R4()Let/b;

    .line 4
    move-result-object p3

    .line 5
    .line 6
    new-instance p4, Lcom/kubi/otc/entity/FiatUnBindWithdrawAccount;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;->getPayoutAccountId()Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-direct {p4, p1}, Lcom/kubi/otc/entity/FiatUnBindWithdrawAccount;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p3, p4}, Let/b;->m(Lcom/kubi/otc/entity/FiatUnBindWithdrawAccount;)Lio/reactivex/Observable;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 25
    move-result-object p3

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    new-instance p3, Lcom/kubi/otc/fiat/withdraw/s0;

    .line 32
    .line 33
    .line 34
    invoke-direct {p3, p0}, Lcom/kubi/otc/fiat/withdraw/s0;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)V

    .line 35
    .line 36
    new-instance p4, Lcom/kubi/otc/fiat/withdraw/t0;

    .line 37
    .line 38
    .line 39
    invoke-direct {p4, p3}, Lcom/kubi/otc/fiat/withdraw/t0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->doOnSubscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    new-instance p3, Lcom/kubi/otc/fiat/withdraw/u0;

    .line 46
    .line 47
    .line 48
    invoke-direct {p3, p0, p2}, Lcom/kubi/otc/fiat/withdraw/u0;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Lio/reactivex/functions/Action;)V

    .line 49
    .line 50
    new-instance p2, Lcom/kubi/otc/fiat/withdraw/l0;

    .line 51
    .line 52
    .line 53
    invoke-direct {p2, p3}, Lcom/kubi/otc/fiat/withdraw/l0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 54
    .line 55
    new-instance p3, Lcom/kubi/sdk/util/c1;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->Q4()Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;

    .line 59
    move-result-object p4

    .line 60
    .line 61
    .line 62
    invoke-direct {p3, p4}, Lcom/kubi/sdk/util/c1;-><init>(Lcom/kubi/sdk/base/ui/g;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p2, p3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    const-string p2, "subscribe(...)"

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->Q4()Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;

    .line 75
    move-result-object p0

    .line 76
    .line 77
    if-eqz p0, :cond_0

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    .line 81
    move-result-object p0

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    const/4 p0, 0x0

    .line 84
    .line 85
    .line 86
    :goto_0
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1, p0}, Lio/reactivex/rxkotlin/DisposableKt;->addTo(Lio/reactivex/disposables/Disposable;Lio/reactivex/disposables/CompositeDisposable;)Lio/reactivex/disposables/Disposable;

    .line 90
    return-void
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

.method public static final I4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Lio/reactivex/disposables/Disposable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->Q4()Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showDialogLoading()V

    .line 10
    .line 11
    :cond_0
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

.method public static final J4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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

.method public static final K4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Lio/reactivex/functions/Action;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->Q4()Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->hideDialogLoading()V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {p1}, Lio/reactivex/functions/Action;->run()V

    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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

.method public static final L4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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

.method public static final M4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    instance-of v0, p0, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

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
.end method

.method private static final N4()Let/b;
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

.method private final R4()Let/b;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->q0:Lkotlin/Lazy;

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

.method public static final T4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Landroid/widget/TextView;Lio/chad/library/adapter/base/BaseViewHolder;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->t0:Z

    .line 3
    .line 4
    xor-int/lit8 v1, v0, 0x1

    .line 5
    .line 6
    iput-boolean v1, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->t0:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget v0, Lcom/kubi/otc/R$string;->complete_done:I

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    sget v0, Lcom/kubi/otc/R$string;->edit:I

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 17
    .line 18
    sget p1, Lcom/kubi/otc/R$id;->tv_title:I

    .line 19
    .line 20
    iget-boolean v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->t0:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    sget v0, Lcom/kubi/otc/R$string;->edit:I

    .line 25
    goto :goto_1

    .line 26
    .line 27
    :cond_1
    sget v0, Lcom/kubi/otc/R$string;->fait_account_card_select:I

    .line 28
    .line 29
    .line 30
    :goto_1
    invoke-virtual {p2, p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->O4()Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1;

    .line 34
    move-result-object p0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 40
    return-object p0
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

.method public static final U4(Lcom/kubi/resources/dialog/DialogFragmentHelper;Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->Q4()Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;->J4()V

    .line 15
    .line 16
    :cond_1
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

.method public static synthetic j4(Lcom/kubi/resources/dialog/DialogFragmentHelper;Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->U4(Lcom/kubi/resources/dialog/DialogFragmentHelper;Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lkotlin/Unit;

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

.method public static synthetic k4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Landroid/widget/TextView;Lio/chad/library/adapter/base/BaseViewHolder;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->T4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Landroid/widget/TextView;Lio/chad/library/adapter/base/BaseViewHolder;)Lkotlin/Unit;

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

.method public static synthetic l4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->L4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static synthetic m4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Lio/reactivex/functions/Action;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->K4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Lio/reactivex/functions/Action;Ljava/lang/Boolean;)Lkotlin/Unit;

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

.method public static synthetic n4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Lio/reactivex/disposables/Disposable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->I4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Lio/reactivex/disposables/Disposable;)Lkotlin/Unit;

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

.method public static synthetic o4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;Lio/reactivex/functions/Action;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->H4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;Lio/reactivex/functions/Action;Landroid/content/DialogInterface;I)V

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
.end method

.method public static synthetic p4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->E4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1;

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

.method public static synthetic q4()Let/b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->N4()Let/b;

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

.method public static synthetic r4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->F4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;

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

.method public static synthetic s4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->M4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;

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

.method public static synthetic t4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->J4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static final synthetic u4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;Lio/reactivex/functions/Action;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->G4(Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;Lio/reactivex/functions/Action;)V

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

.method public static final synthetic v4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->P4()Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;

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

.method public static final synthetic w4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->u0:Ljava/lang/String;

    .line 3
    return-object p0
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

.method public static final synthetic x4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->Q4()Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;

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

.method public static final synthetic y4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lio/reactivex/functions/Consumer;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->w0:Lio/reactivex/functions/Consumer;

    .line 3
    return-object p0
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

.method public static final synthetic z4(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)Lio/chad/library/adapter/base/BaseViewHolder;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->v0:Lio/chad/library/adapter/base/BaseViewHolder;

    .line 3
    return-object p0
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


# virtual methods
.method public final G4(Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;Lio/reactivex/functions/Action;)V
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
    sget v1, Lcom/kubi/otc/R$string;->fiat_withdraw_manage_account_delete_title:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget v1, Lcom/kubi/otc/R$string;->fiat_withdraw_manage_account_delete_msg:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;->getIbanLast4()Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sget v1, Lcom/kubi/otc/R$string;->delete:I

    .line 37
    .line 38
    new-instance v2, Lcom/kubi/otc/fiat/withdraw/r0;

    .line 39
    .line 40
    .line 41
    invoke-direct {v2, p0, p1, p2}, Lcom/kubi/otc/fiat/withdraw/r0;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;Lio/reactivex/functions/Action;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    sget p2, Lcom/kubi/otc/R$string;->cancel:I

    .line 48
    const/4 v0, 0x0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2, v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->P4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 56
    move-result-object p2

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->c5(Landroidx/fragment/app/FragmentManager;)V

    .line 60
    return-void
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

.method public final O4()Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->x0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1;

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

.method public final P4()Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->s0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;

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

.method public final Q4()Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->r0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;

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

.method public final S4()Z
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const-class v2, Lau/a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast v0, Lau/a;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Lau/a;->a()Z

    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public b3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V
    .locals 12
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
    iput-object p1, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->v0:Lio/chad/library/adapter/base/BaseViewHolder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->P4()Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;

    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;->getAccounts()Ljava/util/List;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 29
    move-result v0

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v0, v1

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 39
    move-result v0

    .line 40
    const/4 v2, 0x5

    .line 41
    const/4 v3, 0x1

    .line 42
    .line 43
    if-lt v0, v2, :cond_1

    .line 44
    move v0, v3

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const/4 v0, 0x0

    .line 47
    .line 48
    .line 49
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->S4()Z

    .line 50
    move-result v4

    .line 51
    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    sget v4, Lcom/kubi/otc/R$id;->tv_account_limit_tip:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v4, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 58
    .line 59
    :cond_2
    sget v4, Lcom/kubi/otc/R$id;->iv_add:I

    .line 60
    .line 61
    xor-int/lit8 v5, v0, 0x1

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v4, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 65
    .line 66
    sget v5, Lcom/kubi/otc/R$id;->tv_add_account:I

    .line 67
    xor-int/2addr v0, v3

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v5, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 71
    .line 72
    sget v0, Lcom/kubi/otc/R$id;->view_account_recycler:I

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->P4()Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;

    .line 82
    move-result-object v3

    .line 83
    .line 84
    if-eqz v3, :cond_4

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;->getAccounts()Ljava/util/List;

    .line 88
    move-result-object v3

    .line 89
    .line 90
    if-eqz v3, :cond_4

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->P4()Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;

    .line 94
    move-result-object v6

    .line 95
    .line 96
    if-eqz v6, :cond_3

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6}, Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;->getCurrentSelectId()Ljava/lang/String;

    .line 100
    move-result-object v6

    .line 101
    goto :goto_2

    .line 102
    :cond_3
    move-object v6, v1

    .line 103
    .line 104
    :goto_2
    iput-object v6, p0, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->u0:Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->O4()Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1;

    .line 108
    move-result-object v6

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->O4()Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v3}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 119
    .line 120
    :cond_4
    sget v0, Lcom/kubi/otc/R$id;->tv_manage_account:I

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 124
    move-result-object v0

    .line 125
    move-object v6, v0

    .line 126
    .line 127
    check-cast v6, Landroid/widget/TextView;

    .line 128
    .line 129
    .line 130
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 131
    .line 132
    new-instance v9, Lcom/kubi/otc/fiat/withdraw/k0;

    .line 133
    .line 134
    .line 135
    invoke-direct {v9, p0, v6, p1}, Lcom/kubi/otc/fiat/withdraw/k0;-><init>(Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;Landroid/widget/TextView;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 136
    const/4 v10, 0x1

    .line 137
    const/4 v11, 0x0

    .line 138
    .line 139
    const-wide/16 v7, 0x0

    .line 140
    .line 141
    .line 142
    invoke-static/range {v6 .. v11}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 143
    .line 144
    sget v0, Lcom/kubi/otc/R$string;->edit:I

    .line 145
    .line 146
    .line 147
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->S4()Z

    .line 151
    move-result v0

    .line 152
    .line 153
    if-eqz v0, :cond_5

    .line 154
    .line 155
    .line 156
    invoke-static {v6}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 157
    goto :goto_3

    .line 158
    .line 159
    .line 160
    :cond_5
    invoke-static {v6}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 161
    .line 162
    .line 163
    :goto_3
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->S4()Z

    .line 164
    move-result v0

    .line 165
    .line 166
    const-string v3, "getView(...)"

    .line 167
    .line 168
    if-nez v0, :cond_8

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;->P4()Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;

    .line 172
    move-result-object v0

    .line 173
    .line 174
    if-eqz v0, :cond_6

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;->getAccounts()Ljava/util/List;

    .line 178
    move-result-object v0

    .line 179
    .line 180
    if-eqz v0, :cond_6

    .line 181
    .line 182
    .line 183
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 184
    move-result v0

    .line 185
    .line 186
    .line 187
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    move-result-object v1

    .line 189
    .line 190
    .line 191
    :cond_6
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 192
    move-result v0

    .line 193
    .line 194
    if-lt v0, v2, :cond_7

    .line 195
    goto :goto_4

    .line 196
    .line 197
    .line 198
    :cond_7
    invoke-virtual {p1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 199
    move-result-object v0

    .line 200
    .line 201
    .line 202
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 209
    move-result-object v0

    .line 210
    .line 211
    .line 212
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 216
    goto :goto_5

    .line 217
    .line 218
    .line 219
    :cond_8
    :goto_4
    invoke-virtual {p1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 220
    move-result-object v0

    .line 221
    .line 222
    .line 223
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 230
    move-result-object v0

    .line 231
    .line 232
    .line 233
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 237
    .line 238
    .line 239
    :goto_5
    invoke-virtual {p1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 240
    move-result-object v0

    .line 241
    .line 242
    .line 243
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 247
    move-result-object p1

    .line 248
    .line 249
    .line 250
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    filled-new-array {v0, p1}, [Landroid/view/View;

    .line 254
    move-result-object p1

    .line 255
    .line 256
    new-instance v0, Lcom/kubi/otc/fiat/withdraw/m0;

    .line 257
    .line 258
    .line 259
    invoke-direct {v0, p2, p0}, Lcom/kubi/otc/fiat/withdraw/m0;-><init>(Lcom/kubi/resources/dialog/DialogFragmentHelper;Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;)V

    .line 260
    .line 261
    .line 262
    invoke-static {p1, v0}, Lcom/kubi/utils/extensions/k;->D([Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 263
    return-void
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
