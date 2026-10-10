.class public final Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment$a;
.super Lcom/kubi/sdk/util/c1;
.source "OtcAdPublishFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/otc/otc/merchant/OtcAdPublishFragment$initView$1$3",
        "Lcom/kubi/sdk/util/SimpleThrowableConsumer;",
        "accept",
        "",
        "throwable",
        "",
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
        "SMAP\nOtcAdPublishFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcAdPublishFragment.kt\ncom/kubi/otc/otc/merchant/OtcAdPublishFragment$initView$1$3\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,143:1\n48#2,2:144\n*S KotlinDebug\n*F\n+ 1 OtcAdPublishFragment.kt\ncom/kubi/otc/otc/merchant/OtcAdPublishFragment$initView$1$3\n*L\n70#1:144,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic d:Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment$a;->d:Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment;

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lcom/kubi/sdk/util/c1;-><init>(Lcom/kubi/sdk/base/ui/g;Z)V

    .line 7
    return-void
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
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Ljava/lang/Throwable;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment$a;->b(Ljava/lang/Throwable;)V

    .line 6
    return-void
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

.method public b(Ljava/lang/Throwable;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/sdk/util/c1;->b(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    instance-of v0, p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    move-object v0, p1

    .line 11
    .line 12
    check-cast v0, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 13
    .line 14
    iget-object v3, v0, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 15
    .line 16
    const-string v4, "618203"

    .line 17
    .line 18
    .line 19
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v4

    .line 21
    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    sget-object v0, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    sget v1, Lcom/kubi/otc/R$string;->notice_prompt:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sget v1, Lcom/kubi/otc/R$string;->payment_edit_ad_risk_refused:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->J4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    sget v1, Lcom/kubi/otc/R$string;->i_already_know:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    iget-object v1, p0, Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment$a;->d:Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->c5(Landroidx/fragment/app/FragmentManager;)V

    .line 56
    goto :goto_1

    .line 57
    .line 58
    :cond_0
    const-string v4, "600000"

    .line 59
    .line 60
    .line 61
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    move-result v3

    .line 63
    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    new-instance v4, Lcom/kubi/otc/exception/OtcMessage;

    .line 67
    const/4 v8, 0x4

    .line 68
    const/4 v9, 0x0

    .line 69
    .line 70
    const-string v5, "error 600000"

    .line 71
    .line 72
    const-string v6, "payment_p2p"

    .line 73
    const/4 v7, 0x0

    .line 74
    .line 75
    .line 76
    invoke-direct/range {v4 .. v9}, Lcom/kubi/otc/exception/OtcMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 77
    const/4 v0, 0x2

    .line 78
    .line 79
    .line 80
    invoke-static {v4, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 81
    goto :goto_1

    .line 82
    .line 83
    .line 84
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    new-array v1, v1, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    invoke-static {v0, v1}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    goto :goto_1

    .line 92
    .line 93
    :cond_2
    if-eqz p1, :cond_3

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 97
    move-result-object v0

    .line 98
    goto :goto_0

    .line 99
    :cond_3
    move-object v0, v2

    .line 100
    .line 101
    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v1}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    .line 106
    :goto_1
    const-string v0, "source"

    .line 107
    .line 108
    const-string v1, "publish"

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    iget-object v1, p0, Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment$a;->d:Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Lcom/kubi/otc/otc/merchant/AbsOtcAdBaseFragment;->O4()Lcom/kubi/otc/entity/OtcAd;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    if-eqz v1, :cond_4

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Lcom/kubi/otc/entity/OtcAd;->getLegal()Ljava/lang/String;

    .line 124
    move-result-object v1

    .line 125
    goto :goto_2

    .line 126
    :cond_4
    move-object v1, v2

    .line 127
    .line 128
    .line 129
    :goto_2
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    move-result-object v1

    .line 131
    .line 132
    const-string v3, "fiat"

    .line 133
    .line 134
    .line 135
    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 136
    move-result-object v1

    .line 137
    .line 138
    iget-object v3, p0, Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment$a;->d:Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3}, Lcom/kubi/otc/otc/merchant/AbsOtcAdBaseFragment;->O4()Lcom/kubi/otc/entity/OtcAd;

    .line 142
    move-result-object v3

    .line 143
    .line 144
    if-eqz v3, :cond_5

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3}, Lcom/kubi/otc/entity/OtcAd;->getCurrency()Ljava/lang/String;

    .line 148
    move-result-object v3

    .line 149
    goto :goto_3

    .line 150
    :cond_5
    move-object v3, v2

    .line 151
    .line 152
    .line 153
    :goto_3
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    move-result-object v3

    .line 155
    .line 156
    const-string v4, "coin"

    .line 157
    .line 158
    .line 159
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 160
    move-result-object v3

    .line 161
    .line 162
    if-eqz p1, :cond_6

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 166
    move-result-object v2

    .line 167
    .line 168
    .line 169
    :cond_6
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    move-result-object p1

    .line 171
    .line 172
    const-string v2, "message"

    .line 173
    .line 174
    .line 175
    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 176
    move-result-object p1

    .line 177
    .line 178
    .line 179
    filled-new-array {v0, v1, v3, p1}, [Lkotlin/Pair;

    .line 180
    move-result-object p1

    .line 181
    .line 182
    const-string v0, "B7P2PPostAdvertisements"

    .line 183
    .line 184
    const-string v1, "button"

    .line 185
    .line 186
    const-string v2, "1"

    .line 187
    .line 188
    .line 189
    invoke-static {v0, v1, v2, p1}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 190
    return-void
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
