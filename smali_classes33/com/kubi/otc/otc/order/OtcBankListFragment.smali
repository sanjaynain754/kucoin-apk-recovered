.class public final Lcom/kubi/otc/otc/order/OtcBankListFragment;
.super Lcom/kubi/sdk/base/ui/BasePagingFragment;
.source "OtcBankListFragment.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/sdk/base/ui/BasePagingFragment<",
        "Lcom/kubi/otc/entity/FiatBankCardOrder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u000c\u001a\u00020\rH\u0014J\u001c\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002J$\u0010\u001d\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0014J\u0008\u0010\"\u001a\u00020\u0014H\u0014R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\tR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000b\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006#"
    }
    d2 = {
        "Lcom/kubi/otc/otc/order/OtcBankListFragment;",
        "Lcom/kubi/sdk/base/ui/BasePagingFragment;",
        "Lcom/kubi/otc/entity/FiatBankCardOrder;",
        "<init>",
        "()V",
        "mApi",
        "Lcom/kubi/otc/api/FiatApi;",
        "kotlin.jvm.PlatformType",
        "getMApi",
        "()Lcom/kubi/otc/api/FiatApi;",
        "mApi$delegate",
        "Lkotlin/Lazy;",
        "getItemLayout",
        "",
        "bubbleWindow",
        "Lcom/cpiz/android/bubbleview/BubblePopupWindow;",
        "getBubbleWindow",
        "()Lcom/cpiz/android/bubbleview/BubblePopupWindow;",
        "bubbleWindow$delegate",
        "bindDataToView",
        "",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "item",
        "bindOrderStatus",
        "orderStatusView",
        "Landroid/widget/TextView;",
        "orderStatusIcon",
        "Landroid/widget/ImageView;",
        "getDataLoader",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/sdk/base/entity/BasePageEntity;",
        "pageIndex",
        "pageSize",
        "onReBack",
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
        "SMAP\nOtcBankListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcBankListFragment.kt\ncom/kubi/otc/otc/order/OtcBankListFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,220:1\n172#2,2:221\n*S KotlinDebug\n*F\n+ 1 OtcBankListFragment.kt\ncom/kubi/otc/otc/order/OtcBankListFragment\n*L\n75#1:221,2\n*E\n"
    }
.end annotation


# instance fields
.field public final Z:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final a0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/otc/otc/order/c;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/otc/otc/order/c;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/otc/otc/order/OtcBankListFragment;->Z:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/otc/otc/order/d;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/kubi/otc/otc/order/d;-><init>(Lcom/kubi/otc/otc/order/OtcBankListFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/otc/otc/order/OtcBankListFragment;->a0:Lkotlin/Lazy;

    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public static synthetic H3()Let/b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/otc/order/OtcBankListFragment;->U3()Let/b;

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

.method public static synthetic I3(Lcom/kubi/otc/otc/order/OtcBankListFragment;Lcom/kubi/otc/entity/FiatBankCardOrder;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/otc/order/OtcBankListFragment;->O3(Lcom/kubi/otc/otc/order/OtcBankListFragment;Lcom/kubi/otc/entity/FiatBankCardOrder;)Lkotlin/Unit;

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

.method public static synthetic J3(Lcom/kubi/otc/otc/order/OtcBankListFragment;)Lcom/cpiz/android/bubbleview/c;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/otc/otc/order/OtcBankListFragment;->R3(Lcom/kubi/otc/otc/order/OtcBankListFragment;)Lcom/cpiz/android/bubbleview/c;

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

.method public static synthetic K3(Lcom/kubi/otc/otc/order/OtcBankListFragment;Lio/chad/library/adapter/base/BaseViewHolder;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/otc/order/OtcBankListFragment;->N3(Lcom/kubi/otc/otc/order/OtcBankListFragment;Lio/chad/library/adapter/base/BaseViewHolder;)Lkotlin/Unit;

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

.method public static synthetic L3(Lcom/kubi/otc/entity/FiatBankCardOrder;Lcom/kubi/otc/otc/order/OtcBankListFragment;Landroid/widget/TextView;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/otc/otc/order/OtcBankListFragment;->Q3(Lcom/kubi/otc/entity/FiatBankCardOrder;Lcom/kubi/otc/otc/order/OtcBankListFragment;Landroid/widget/TextView;)Lkotlin/Unit;

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

.method public static final N3(Lcom/kubi/otc/otc/order/OtcBankListFragment;Lio/chad/library/adapter/base/BaseViewHolder;)Lkotlin/Unit;
    .locals 10

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
    sget v1, Lcom/kubi/otc/R$string;->otc_fast_order:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget v1, Lcom/kubi/otc/R$string;->otc_fast_order_desc:I

    .line 15
    .line 16
    const-string v2, "*"

    .line 17
    .line 18
    .line 19
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    const-string v1, "getString(...)"

    .line 27
    .line 28
    .line 29
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    filled-new-array {v2}, [Ljava/lang/String;

    .line 33
    move-result-object v5

    .line 34
    const/4 v8, 0x6

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    .line 39
    .line 40
    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    new-instance v2, Lcom/kubi/utils/v0;

    .line 44
    .line 45
    .line 46
    invoke-direct {v2}, Lcom/kubi/utils/v0;-><init>()V

    .line 47
    const/4 v3, 0x0

    .line 48
    .line 49
    .line 50
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    move-result-object v4

    .line 52
    .line 53
    check-cast v4, Ljava/lang/CharSequence;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v4}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    sget-object v4, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 60
    .line 61
    sget v5, Lcom/kubi/otc/R$mipmap;->botc_ic_lightning:I

    .line 62
    const/4 v6, 0x2

    .line 63
    const/4 v7, 0x0

    .line 64
    .line 65
    .line 66
    invoke-static {v4, v5, v7, v6, v7}, Lcom/kubi/utils/c;->d(Lcom/kubi/utils/c;ILjava/lang/Integer;ILjava/lang/Object;)Landroid/graphics/drawable/Drawable;

    .line 67
    move-result-object v4

    .line 68
    .line 69
    const/16 v5, 0xf

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v5}, Lcom/kubi/utils/extensions/core/c;->g(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)I

    .line 73
    move-result v5

    .line 74
    .line 75
    const/16 v6, 0x14

    .line 76
    .line 77
    .line 78
    invoke-static {p1, v6}, Lcom/kubi/utils/extensions/core/c;->g(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)I

    .line 79
    move-result p1

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v3, v3, v5, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4}, Lcom/kubi/utils/v0;->f(Landroid/graphics/drawable/Drawable;)Lcom/kubi/utils/v0;

    .line 86
    move-result-object p1

    .line 87
    const/4 v2, 0x1

    .line 88
    .line 89
    .line 90
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    check-cast v1, Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v1}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, p1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->L4(Landroid/text/SpannableStringBuilder;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    sget v0, Lcom/kubi/otc/R$string;->confirm:I

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v0, v7}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 111
    move-result-object p0

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->c5(Landroidx/fragment/app/FragmentManager;)V

    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 117
    return-object p0
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

.method public static final O3(Lcom/kubi/otc/otc/order/OtcBankListFragment;Lcom/kubi/otc/entity/FiatBankCardOrder;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment;->X:Lcom/kubi/otc/fast/PayFiatOrderDetailFragment$Companion;

    .line 3
    .line 4
    iget-object p0, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 5
    .line 6
    const-string v1, "mContext"

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getOrderId()Ljava/lang/String;

    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0, p1}, Lcom/kubi/otc/fast/PayFiatOrderDetailFragment$Companion;->startFragment(Landroid/content/Context;Ljava/lang/String;)V

    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 27
    return-object p0
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

.method public static final Q3(Lcom/kubi/otc/entity/FiatBankCardOrder;Lcom/kubi/otc/otc/order/OtcBankListFragment;Landroid/widget/TextView;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getOrderStatus()Ljava/lang/Integer;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    .line 16
    if-ne v0, v1, :cond_2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getRechargeOrderDetail()Lcom/kubi/otc/entity/RechargeOrderDetail;

    .line 20
    move-result-object p0

    .line 21
    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/otc/entity/RechargeOrderDetail;->getRechargeOrderStatus()Ljava/lang/Integer;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    if-nez p0, :cond_1

    .line 29
    goto :goto_0

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 33
    move-result p0

    .line 34
    const/4 v0, 0x1

    .line 35
    .line 36
    if-ne p0, v0, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/kubi/otc/otc/order/OtcBankListFragment;->S3()Lcom/cpiz/android/bubbleview/c;

    .line 40
    move-result-object p0

    .line 41
    .line 42
    sget-object p1, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->Down:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p2, p1}, Lcom/cpiz/android/bubbleview/c;->m(Landroid/view/View;Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;)V

    .line 46
    .line 47
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 48
    return-object p0
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

.method public static final R3(Lcom/kubi/otc/otc/order/OtcBankListFragment;)Lcom/cpiz/android/bubbleview/c;
    .locals 5

    .line 1
    .line 2
    const/16 v0, 0xc

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/utils/extensions/e;->b(I)I

    .line 6
    move-result v0

    .line 7
    .line 8
    new-instance v1, Lcom/cpiz/android/bubbleview/BubbleTextView;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v2}, Lcom/cpiz/android/bubbleview/BubbleTextView;-><init>(Landroid/content/Context;)V

    .line 14
    const/4 v2, 0x3

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 18
    .line 19
    sget v2, Lcom/kubi/otc/R$string;->payment_fast_deposit_buy_failed_tip:I

    .line 20
    const/4 v3, 0x0

    .line 21
    .line 22
    new-array v3, v3, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    sget-object v2, Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;->Down:Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Lcom/cpiz/android/bubbleview/BubbleTextView;->setArrowDirection(Lcom/cpiz/android/bubbleview/BubbleStyle$ArrowDirection;)V

    .line 35
    .line 36
    const/high16 v2, 0x41000000    # 8.0f

    .line 37
    .line 38
    .line 39
    invoke-static {v2}, Lcom/kubi/utils/extensions/e;->a(F)F

    .line 40
    move-result v3

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v3}, Lcom/cpiz/android/bubbleview/BubbleTextView;->setArrowHeight(F)V

    .line 44
    .line 45
    const/high16 v3, 0x41400000    # 12.0f

    .line 46
    .line 47
    .line 48
    invoke-static {v3}, Lcom/kubi/utils/extensions/e;->a(F)F

    .line 49
    move-result v3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v3}, Lcom/cpiz/android/bubbleview/BubbleTextView;->setArrowWidth(F)V

    .line 53
    const/4 v3, 0x2

    .line 54
    .line 55
    const/high16 v4, 0x41600000    # 14.0f

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v3, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 59
    .line 60
    iget-object v3, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 61
    .line 62
    sget v4, Lcom/kubi/otc/R$color;->c_white:I

    .line 63
    .line 64
    .line 65
    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 66
    move-result v3

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v2}, Lcom/kubi/utils/extensions/e;->a(F)F

    .line 73
    move-result v2

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2}, Lcom/cpiz/android/bubbleview/BubbleTextView;->setCornerRadius(F)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    sget v3, Lcom/kubi/otc/R$font;->regular:I

    .line 86
    .line 87
    .line 88
    invoke-static {v2, v3}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 89
    move-result-object v2

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v0, v0, v0, v0}, Lcom/cpiz/android/bubbleview/BubbleTextView;->a(IIII)V

    .line 96
    .line 97
    iget-object p0, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 98
    .line 99
    sget v2, Lcom/kubi/otc/R$color;->c_toolTip:I

    .line 100
    .line 101
    .line 102
    invoke-static {p0, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 103
    move-result p0

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, p0}, Lcom/cpiz/android/bubbleview/BubbleTextView;->setFillColor(I)V

    .line 107
    .line 108
    new-instance p0, Lcom/cpiz/android/bubbleview/c;

    .line 109
    .line 110
    .line 111
    invoke-direct {p0, v1, v1}, Lcom/cpiz/android/bubbleview/c;-><init>(Landroid/view/View;Lcom/cpiz/android/bubbleview/BubbleStyle;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v0}, Lcom/cpiz/android/bubbleview/c;->l(I)V

    .line 115
    const/4 v0, 0x1

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v0}, Lcom/cpiz/android/bubbleview/c;->j(Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v0}, Lcom/cpiz/android/bubbleview/c;->k(Z)V

    .line 122
    return-object p0
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

.method private final T3()Let/b;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/otc/order/OtcBankListFragment;->Z:Lkotlin/Lazy;

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

.method private static final U3()Let/b;
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


# virtual methods
.method public M3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/otc/entity/FiatBankCardOrder;)V
    .locals 19
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/otc/entity/FiatBankCardOrder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    if-eqz v1, :cond_d

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/kubi/otc/entity/FiatBankCardOrder;->isBuyType()Z

    .line 15
    move-result v4

    .line 16
    .line 17
    .line 18
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    move-result-object v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v4, v3

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-static {v4}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 25
    move-result v4

    .line 26
    .line 27
    sget v5, Lcom/kubi/otc/R$id;->iv_side:I

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    sget v6, Lcom/kubi/otc/R$drawable;->ic2_plus_16:I

    .line 32
    goto :goto_1

    .line 33
    .line 34
    :cond_1
    sget v6, Lcom/kubi/otc/R$drawable;->ic2_sub_16:I

    .line 35
    .line 36
    .line 37
    :goto_1
    invoke-virtual {v1, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setImageResource(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 41
    move-result-object v5

    .line 42
    .line 43
    const-string v6, "getView(...)"

    .line 44
    .line 45
    .line 46
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    check-cast v5, Landroid/widget/ImageView;

    .line 49
    .line 50
    iget-object v7, v0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 51
    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    sget v8, Lcom/kubi/otc/R$color;->brandGreen:I

    .line 55
    goto :goto_2

    .line 56
    .line 57
    :cond_2
    sget v8, Lcom/kubi/otc/R$color;->brandRed:I

    .line 58
    .line 59
    .line 60
    :goto_2
    invoke-static {v7, v8}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 61
    move-result v7

    .line 62
    .line 63
    .line 64
    invoke-static {v5, v7}, Lcom/kubi/utils/extensions/k;->p(Landroid/widget/ImageView;I)V

    .line 65
    .line 66
    sget v5, Lcom/kubi/otc/R$id;->tv_side:I

    .line 67
    .line 68
    if-eqz v4, :cond_3

    .line 69
    .line 70
    sget v7, Lcom/kubi/otc/R$string;->buy:I

    .line 71
    goto :goto_3

    .line 72
    .line 73
    :cond_3
    sget v7, Lcom/kubi/otc/R$string;->sell:I

    .line 74
    .line 75
    .line 76
    :goto_3
    invoke-virtual {v1, v5, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 77
    .line 78
    sget v7, Lcom/kubi/otc/R$id;->tv_name:I

    .line 79
    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getCryptoCurrency()Ljava/lang/String;

    .line 84
    move-result-object v8

    .line 85
    goto :goto_4

    .line 86
    :cond_4
    move-object v8, v3

    .line 87
    .line 88
    .line 89
    :goto_4
    invoke-virtual {v1, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 90
    .line 91
    sget v7, Lcom/kubi/otc/R$id;->tv_amount_title:I

    .line 92
    .line 93
    new-instance v8, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    sget v9, Lcom/kubi/otc/R$string;->amount:I

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v9}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 102
    move-result-object v9

    .line 103
    .line 104
    .line 105
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const/16 v9, 0x28

    .line 108
    .line 109
    .line 110
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    if-eqz v2, :cond_5

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getCryptoCurrency()Ljava/lang/String;

    .line 116
    move-result-object v10

    .line 117
    goto :goto_5

    .line 118
    :cond_5
    move-object v10, v3

    .line 119
    .line 120
    .line 121
    :goto_5
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const/16 v10, 0x29

    .line 124
    .line 125
    .line 126
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    move-result-object v8

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 134
    .line 135
    sget v7, Lcom/kubi/otc/R$id;->tv_price_title:I

    .line 136
    .line 137
    new-instance v8, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    sget v11, Lcom/kubi/otc/R$string;->trade_total_amount:I

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v11}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 146
    move-result-object v11

    .line 147
    .line 148
    .line 149
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    if-eqz v2, :cond_6

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getFiatCurrency()Ljava/lang/String;

    .line 158
    move-result-object v9

    .line 159
    goto :goto_6

    .line 160
    :cond_6
    move-object v9, v3

    .line 161
    .line 162
    .line 163
    :goto_6
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    move-result-object v8

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 174
    .line 175
    sget v7, Lcom/kubi/otc/R$id;->tv_amount_value:I

    .line 176
    .line 177
    if-eqz v2, :cond_7

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getCryptoQuantity()Ljava/lang/String;

    .line 181
    move-result-object v8

    .line 182
    goto :goto_7

    .line 183
    :cond_7
    move-object v8, v3

    .line 184
    .line 185
    .line 186
    :goto_7
    invoke-virtual {v1, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 187
    .line 188
    sget v7, Lcom/kubi/otc/R$id;->tv_pay_name:I

    .line 189
    .line 190
    if-eqz v2, :cond_8

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getPaymentName()Ljava/lang/String;

    .line 194
    move-result-object v8

    .line 195
    goto :goto_8

    .line 196
    :cond_8
    move-object v8, v3

    .line 197
    .line 198
    .line 199
    :goto_8
    invoke-static {v8}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    move-result-object v8

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 204
    .line 205
    sget v7, Lcom/kubi/otc/R$id;->tv_price_value:I

    .line 206
    .line 207
    if-eqz v2, :cond_9

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getFiatAmount()Ljava/lang/String;

    .line 211
    move-result-object v8

    .line 212
    .line 213
    if-eqz v8, :cond_9

    .line 214
    .line 215
    const/16 v17, 0xf7

    .line 216
    .line 217
    const/16 v18, 0x0

    .line 218
    const/4 v9, 0x0

    .line 219
    const/4 v10, 0x0

    .line 220
    const/4 v11, 0x0

    .line 221
    const/4 v12, 0x1

    .line 222
    const/4 v13, 0x0

    .line 223
    const/4 v14, 0x0

    .line 224
    const/4 v15, 0x0

    .line 225
    .line 226
    const/16 v16, 0x0

    .line 227
    .line 228
    .line 229
    invoke-static/range {v8 .. v18}, Lkf/a;->s(Ljava/lang/String;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 230
    move-result-object v8

    .line 231
    goto :goto_9

    .line 232
    :cond_9
    move-object v8, v3

    .line 233
    .line 234
    .line 235
    :goto_9
    invoke-static {v8}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    move-result-object v8

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 240
    .line 241
    sget v7, Lcom/kubi/otc/R$id;->tv_time_value:I

    .line 242
    .line 243
    if-eqz v2, :cond_a

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getCreatedAt()Ljava/lang/Long;

    .line 247
    move-result-object v3

    .line 248
    .line 249
    .line 250
    :cond_a
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 251
    move-result-wide v8

    .line 252
    .line 253
    .line 254
    invoke-static {v8, v9}, Lcom/kubi/utils/TimeUtils;->i(J)Ljava/lang/String;

    .line 255
    move-result-object v3

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v7, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 262
    move-result-object v3

    .line 263
    .line 264
    check-cast v3, Landroid/widget/TextView;

    .line 265
    .line 266
    const-string v5, "mContext"

    .line 267
    .line 268
    if-eqz v4, :cond_b

    .line 269
    .line 270
    iget-object v4, v0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 271
    .line 272
    .line 273
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-static {v4}, Lcom/kubi/resources/g;->p(Landroid/content/Context;)I

    .line 277
    move-result v4

    .line 278
    goto :goto_a

    .line 279
    .line 280
    :cond_b
    iget-object v4, v0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 281
    .line 282
    .line 283
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-static {v4}, Lcom/kubi/resources/g;->n(Landroid/content/Context;)I

    .line 287
    move-result v4

    .line 288
    .line 289
    .line 290
    :goto_a
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 291
    .line 292
    sget v3, Lcom/kubi/otc/R$id;->tv_status:I

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 296
    move-result-object v3

    .line 297
    .line 298
    .line 299
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    check-cast v3, Landroid/widget/TextView;

    .line 302
    .line 303
    sget v4, Lcom/kubi/otc/R$id;->iv_status:I

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 307
    move-result-object v4

    .line 308
    .line 309
    .line 310
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    check-cast v4, Landroid/widget/ImageView;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v3, v4, v2}, Lcom/kubi/otc/otc/order/OtcBankListFragment;->P3(Landroid/widget/TextView;Landroid/widget/ImageView;Lcom/kubi/otc/entity/FiatBankCardOrder;)V

    .line 316
    .line 317
    sget v3, Lcom/kubi/otc/R$id;->iv_fast:I

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 321
    move-result-object v4

    .line 322
    .line 323
    if-eqz v4, :cond_c

    .line 324
    .line 325
    new-instance v7, Lcom/kubi/otc/otc/order/e;

    .line 326
    .line 327
    .line 328
    invoke-direct {v7, v0, v1}, Lcom/kubi/otc/otc/order/e;-><init>(Lcom/kubi/otc/otc/order/OtcBankListFragment;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 329
    const/4 v8, 0x1

    .line 330
    const/4 v9, 0x0

    .line 331
    .line 332
    const-wide/16 v5, 0x0

    .line 333
    .line 334
    .line 335
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 336
    .line 337
    :cond_c
    iget-object v10, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 338
    .line 339
    const-string v1, "itemView"

    .line 340
    .line 341
    .line 342
    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 343
    .line 344
    new-instance v13, Lcom/kubi/otc/otc/order/f;

    .line 345
    .line 346
    .line 347
    invoke-direct {v13, v0, v2}, Lcom/kubi/otc/otc/order/f;-><init>(Lcom/kubi/otc/otc/order/OtcBankListFragment;Lcom/kubi/otc/entity/FiatBankCardOrder;)V

    .line 348
    const/4 v14, 0x1

    .line 349
    const/4 v15, 0x0

    .line 350
    .line 351
    const-wide/16 v11, 0x0

    .line 352
    .line 353
    .line 354
    invoke-static/range {v10 .. v15}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 355
    :cond_d
    return-void
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

.method public final P3(Landroid/widget/TextView;Landroid/widget/ImageView;Lcom/kubi/otc/entity/FiatBankCardOrder;)V
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    sget v3, Lcom/kubi/otc/R$color;->c_text40:I

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getOrderStatus()Ljava/lang/Integer;

    .line 15
    move-result-object v5

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v5, v4

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 21
    move-result v5

    .line 22
    .line 23
    if-eqz v5, :cond_b

    .line 24
    .line 25
    if-eq v5, v1, :cond_a

    .line 26
    .line 27
    if-eq v5, v0, :cond_3

    .line 28
    const/4 v4, 0x3

    .line 29
    .line 30
    if-eq v5, v4, :cond_2

    .line 31
    const/4 v4, 0x4

    .line 32
    .line 33
    if-eq v5, v4, :cond_1

    .line 34
    const/4 v4, 0x5

    .line 35
    .line 36
    if-eq v5, v4, :cond_1

    .line 37
    .line 38
    const-string v4, ""

    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_1
    sget v4, Lcom/kubi/otc/R$string;->order_cancelled:I

    .line 43
    .line 44
    new-array v5, v2, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v4, v5}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    move-result-object v4

    .line 49
    .line 50
    goto/16 :goto_3

    .line 51
    .line 52
    :cond_2
    sget v4, Lcom/kubi/otc/R$string;->failed:I

    .line 53
    .line 54
    new-array v5, v2, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v4, v5}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    move-result-object v4

    .line 59
    goto :goto_3

    .line 60
    .line 61
    :cond_3
    if-eqz p3, :cond_4

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getRechargeOrderDetail()Lcom/kubi/otc/entity/RechargeOrderDetail;

    .line 65
    move-result-object v4

    .line 66
    .line 67
    :cond_4
    if-nez v4, :cond_5

    .line 68
    .line 69
    sget v4, Lcom/kubi/otc/R$string;->order_cancelled:I

    .line 70
    .line 71
    new-array v5, v2, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v4, v5}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    move-result-object v4

    .line 76
    goto :goto_3

    .line 77
    .line 78
    .line 79
    :cond_5
    invoke-virtual {p3}, Lcom/kubi/otc/entity/FiatBankCardOrder;->getRechargeOrderDetail()Lcom/kubi/otc/entity/RechargeOrderDetail;

    .line 80
    move-result-object v3

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Lcom/kubi/otc/entity/RechargeOrderDetail;->getRechargeOrderStatus()Ljava/lang/Integer;

    .line 84
    move-result-object v3

    .line 85
    .line 86
    if-nez v3, :cond_6

    .line 87
    goto :goto_1

    .line 88
    .line 89
    .line 90
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 91
    move-result v4

    .line 92
    .line 93
    if-ne v4, v1, :cond_7

    .line 94
    .line 95
    sget v3, Lcom/kubi/otc/R$string;->failed:I

    .line 96
    .line 97
    new-array v4, v2, [Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v3, v4}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    move-result-object v4

    .line 102
    .line 103
    sget v3, Lcom/kubi/otc/R$color;->complementary:I

    .line 104
    .line 105
    .line 106
    invoke-static {p2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 107
    goto :goto_3

    .line 108
    .line 109
    :cond_7
    :goto_1
    if-nez v3, :cond_8

    .line 110
    goto :goto_2

    .line 111
    .line 112
    .line 113
    :cond_8
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 114
    move-result v3

    .line 115
    .line 116
    if-ne v3, v0, :cond_9

    .line 117
    .line 118
    sget v3, Lcom/kubi/otc/R$string;->failed:I

    .line 119
    .line 120
    new-array v4, v2, [Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v3, v4}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 124
    move-result-object v4

    .line 125
    .line 126
    sget v3, Lcom/kubi/otc/R$color;->brandRed:I

    .line 127
    goto :goto_3

    .line 128
    .line 129
    :cond_9
    :goto_2
    sget v3, Lcom/kubi/otc/R$string;->failed:I

    .line 130
    .line 131
    new-array v4, v2, [Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v3, v4}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    move-result-object v4

    .line 136
    .line 137
    sget v3, Lcom/kubi/otc/R$color;->brandRed:I

    .line 138
    goto :goto_3

    .line 139
    .line 140
    :cond_a
    sget v4, Lcom/kubi/otc/R$string;->success:I

    .line 141
    .line 142
    new-array v5, v2, [Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v4, v5}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    move-result-object v4

    .line 147
    goto :goto_3

    .line 148
    .line 149
    :cond_b
    sget v3, Lcom/kubi/otc/R$string;->payment_status_processing:I

    .line 150
    .line 151
    new-array v4, v2, [Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, v3, v4}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 155
    move-result-object v4

    .line 156
    .line 157
    sget v3, Lcom/kubi/otc/R$color;->primary:I

    .line 158
    .line 159
    .line 160
    :goto_3
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, v3}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 164
    move-result v3

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 168
    .line 169
    new-array v0, v0, [Landroid/view/View;

    .line 170
    .line 171
    aput-object p1, v0, v2

    .line 172
    .line 173
    aput-object p2, v0, v1

    .line 174
    .line 175
    new-instance p2, Lcom/kubi/otc/otc/order/g;

    .line 176
    .line 177
    .line 178
    invoke-direct {p2, p3, p0, p1}, Lcom/kubi/otc/otc/order/g;-><init>(Lcom/kubi/otc/entity/FiatBankCardOrder;Lcom/kubi/otc/otc/order/OtcBankListFragment;Landroid/widget/TextView;)V

    .line 179
    .line 180
    .line 181
    invoke-static {v0, p2}, Lcom/kubi/utils/extensions/k;->D([Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 182
    return-void
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

.method public final S3()Lcom/cpiz/android/bubbleview/c;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/otc/order/OtcBankListFragment;->a0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/cpiz/android/bubbleview/c;

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

.method public bridge synthetic o3(Lio/chad/library/adapter/base/BaseViewHolder;Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/otc/entity/FiatBankCardOrder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/otc/otc/order/OtcBankListFragment;->M3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/otc/entity/FiatBankCardOrder;)V

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

.method public onReBack()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onReBack()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->F3()V

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
.end method

.method public r3(II)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BasePageEntity<",
            "Lcom/kubi/otc/entity/FiatBankCardOrder;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/otc/otc/order/OtcBankListFragment;->T3()Let/b;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Let/b;->f(II)Lio/reactivex/Observable;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    const-string p2, "compose(...)"

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    return-object p1
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

.method public x3()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$layout;->botc_item_fiat_order:I

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
