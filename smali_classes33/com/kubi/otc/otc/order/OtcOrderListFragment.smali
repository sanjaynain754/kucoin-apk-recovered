.class public final Lcom/kubi/otc/otc/order/OtcOrderListFragment;
.super Lcom/kubi/sdk/base/ui/BasePagingFragment;
.source "OtcOrderListFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/otc/otc/order/OtcOrderListFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/sdk/base/ui/BasePagingFragment<",
        "Lcom/kubi/otc/entity/OtcOrder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 +2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0008\u0010\u001b\u001a\u00020\u001cH\u0014J\u0008\u0010\u001d\u001a\u00020\u001cH\u0014J\u001c\u0010\u001e\u001a\u00020\u00152\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0010!\u001a\u0004\u0018\u00010\u0002H\u0014J,\u0010\"\u001a&\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0012j\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u0001`\u0013H\u0002J\u0010\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J$\u0010$\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020&0%2\u0006\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001cH\u0014J\u0008\u0010)\u001a\u00020\u0015H\u0014J\u0016\u0010*\u001a\u00020\u00152\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\tR\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R2\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0012j\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u0001`\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"
    }
    d2 = {
        "Lcom/kubi/otc/otc/order/OtcOrderListFragment;",
        "Lcom/kubi/sdk/base/ui/BasePagingFragment;",
        "Lcom/kubi/otc/entity/OtcOrder;",
        "<init>",
        "()V",
        "orderApi",
        "Lcom/kubi/otc/api/OtcApi;",
        "kotlin.jvm.PlatformType",
        "getOrderApi",
        "()Lcom/kubi/otc/api/OtcApi;",
        "orderApi$delegate",
        "Lkotlin/Lazy;",
        "side",
        "",
        "status",
        "isFromP2PContainer",
        "",
        "statusTypeMap",
        "Ljava/util/LinkedHashMap;",
        "Lkotlin/collections/LinkedHashMap;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onViewCreated",
        "view",
        "Landroid/view/View;",
        "getLayout",
        "",
        "getItemLayout",
        "bindDataToView",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "item",
        "getLocalOtcOrderStatusTypeMap",
        "byName",
        "getDataLoader",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/sdk/base/entity/BasePageEntity;",
        "pageIndex",
        "pageSize",
        "onReBack",
        "onFilter",
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
.field public static final e0:Lcom/kubi/otc/otc/order/OtcOrderListFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final Z:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public a0:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b0:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c0:Z

.field public d0:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/otc/otc/order/OtcOrderListFragment$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/otc/otc/order/OtcOrderListFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->e0:Lcom/kubi/otc/otc/order/OtcOrderListFragment$Companion;

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
    invoke-direct {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/otc/otc/order/h;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/otc/otc/order/h;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->Z:Lkotlin/Lazy;

    .line 15
    .line 16
    const-string v0, ""

    .line 17
    .line 18
    iput-object v0, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->a0:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->b0:Ljava/lang/String;

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
.end method

.method public static synthetic H3(Lcom/kubi/otc/otc/order/OtcOrderListFragment;Lio/chad/library/adapter/base/BaseViewHolder;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->O3(Lcom/kubi/otc/otc/order/OtcOrderListFragment;Lio/chad/library/adapter/base/BaseViewHolder;)Lkotlin/Unit;

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

.method public static synthetic I3(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->S3(Landroid/content/DialogInterface;I)V

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

.method public static synthetic J3()Let/c;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->X3()Let/c;

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

.method public static synthetic K3(Lcom/kubi/otc/entity/OtcOrder;Lcom/kubi/otc/otc/order/OtcOrderListFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->Q3(Lcom/kubi/otc/entity/OtcOrder;Lcom/kubi/otc/otc/order/OtcOrderListFragment;)Lkotlin/Unit;

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

.method public static synthetic L3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/otc/entity/OtcOrder;Lcom/kubi/otc/otc/order/OtcOrderListFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->P3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/otc/entity/OtcOrder;Lcom/kubi/otc/otc/order/OtcOrderListFragment;)Lkotlin/Unit;

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

.method public static synthetic M3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->R3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V

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

.method public static final O3(Lcom/kubi/otc/otc/order/OtcOrderListFragment;Lio/chad/library/adapter/base/BaseViewHolder;)Lkotlin/Unit;
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

.method public static final P3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/otc/entity/OtcOrder;Lcom/kubi/otc/otc/order/OtcOrderListFragment;)Lkotlin/Unit;
    .locals 5

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$id;->view_unread_dot:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 7
    const/4 p0, 0x0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/otc/entity/OtcOrder;->getImRelationshipDto()Lcom/kubi/otc/entity/OrderImInfo;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kubi/otc/entity/OrderImInfo;->getFrom()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v0, p0

    .line 22
    .line 23
    :goto_0
    if-eqz p1, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/kubi/otc/entity/OtcOrder;->getImRelationshipDto()Lcom/kubi/otc/entity/OrderImInfo;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/kubi/otc/entity/OrderImInfo;->getTo()Ljava/lang/String;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    :cond_1
    if-eqz v0, :cond_6

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 39
    move-result v1

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :cond_2
    if-eqz p0, :cond_6

    .line 46
    .line 47
    .line 48
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 49
    move-result v1

    .line 50
    .line 51
    if-nez v1, :cond_3

    .line 52
    .line 53
    goto/16 :goto_1

    .line 54
    .line 55
    :cond_3
    sget-object v1, Lcom/kubi/chat/service/ChatClient;->d:Lcom/kubi/chat/service/ChatClient$Companion;

    .line 56
    .line 57
    new-instance v2, Lcom/kubi/payment/chat/a;

    .line 58
    .line 59
    .line 60
    invoke-direct {v2, v0}, Lcom/kubi/payment/chat/a;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v2}, Lcom/kubi/chat/service/ChatClient$Companion;->init(Ltb/b;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/kubi/chat/service/ChatClient$Companion;->get()Lcom/kubi/chat/service/ChatClient;

    .line 67
    move-result-object v2

    .line 68
    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, p0}, Lcom/kubi/chat/service/ChatClient;->e(Ljava/lang/String;)Lnb/a;

    .line 73
    .line 74
    .line 75
    :cond_4
    invoke-virtual {v1}, Lcom/kubi/chat/service/ChatClient$Companion;->get()Lcom/kubi/chat/service/ChatClient;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    if-eqz v1, :cond_5

    .line 79
    .line 80
    new-instance v2, Lcom/kubi/otc/otc/order/OtcOrderListFragment$a;

    .line 81
    .line 82
    .line 83
    invoke-direct {v2}, Lcom/kubi/otc/otc/order/OtcOrderListFragment$a;-><init>()V

    .line 84
    .line 85
    const-string v3, "orderList"

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v3, v2}, Lcom/kubi/chat/service/ChatClient;->j(Ljava/lang/String;Ltb/c;)V

    .line 89
    .line 90
    :cond_5
    sget-object v1, Lcom/kubi/sdk/BaseActivity;->Companion:Lcom/kubi/sdk/BaseActivity$Companion;

    .line 91
    .line 92
    iget-object p2, p2, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 93
    .line 94
    const-string v2, "mContext"

    .line 95
    .line 96
    .line 97
    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    new-instance v2, Landroid/os/Bundle;

    .line 100
    .line 101
    .line 102
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/kubi/otc/entity/OtcOrder;->getId()Ljava/lang/String;

    .line 106
    move-result-object v3

    .line 107
    .line 108
    const-string v4, "oId"

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/kubi/otc/entity/OtcOrder;->getAdRemarks()Ljava/lang/String;

    .line 115
    move-result-object v3

    .line 116
    .line 117
    .line 118
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    move-result-object v3

    .line 120
    .line 121
    const-string v4, "adRemark"

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/kubi/otc/entity/OtcOrder;->getDisplayOpTradeInfo()Ljava/lang/Boolean;

    .line 128
    move-result-object v3

    .line 129
    .line 130
    .line 131
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 132
    move-result v3

    .line 133
    .line 134
    const-string v4, "isMerchant"

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Lcom/kubi/otc/entity/OtcOrder;->getCanChat()Ljava/lang/Boolean;

    .line 141
    move-result-object v3

    .line 142
    const/4 v4, 0x1

    .line 143
    .line 144
    .line 145
    invoke-static {v3, v4}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 146
    move-result v3

    .line 147
    xor-int/2addr v3, v4

    .line 148
    .line 149
    const-string v4, "isForbid"

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 153
    .line 154
    new-instance v3, Lcom/kubi/payment/chat/entity/ChatInfo;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Lcom/kubi/otc/entity/OtcOrder;->getImRelationshipDto()Lcom/kubi/otc/entity/OrderImInfo;

    .line 158
    move-result-object v4

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4}, Lcom/kubi/otc/entity/OrderImInfo;->getFromName()Ljava/lang/String;

    .line 162
    move-result-object v4

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Lcom/kubi/otc/entity/OtcOrder;->getImRelationshipDto()Lcom/kubi/otc/entity/OrderImInfo;

    .line 166
    move-result-object p1

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Lcom/kubi/otc/entity/OrderImInfo;->getToName()Ljava/lang/String;

    .line 170
    move-result-object p1

    .line 171
    .line 172
    .line 173
    invoke-direct {v3, v0, v4, p0, p1}, Lcom/kubi/payment/chat/entity/ChatInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    const-string p0, "info"

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, p0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 179
    .line 180
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 181
    .line 182
    const-class p0, Lcom/kubi/payment/chat/ui/ChatFragment;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, p2, p0, v2}, Lcom/kubi/sdk/BaseActivity$Companion;->launch(Landroid/content/Context;Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 186
    .line 187
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 188
    return-object p0

    .line 189
    .line 190
    :cond_6
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 191
    return-object p0
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

.method public static final Q3(Lcom/kubi/otc/entity/OtcOrder;Lcom/kubi/otc/otc/order/OtcOrderListFragment;)Lkotlin/Unit;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/otc/entity/OtcOrder;->getBuyerRole()Ljava/lang/Boolean;

    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 13
    move-result v1

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    sget-object v1, Lcom/kubi/otc/v;->a:Lcom/kubi/otc/v;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/kubi/otc/v;->j()Lcom/kubi/otc/entity/OtcUserInfo;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/kubi/otc/entity/OtcUserInfo;->getBindTradePassword()Ljava/lang/Boolean;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 29
    move-result v1

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    sget-object p0, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 37
    move-result-object p0

    .line 38
    .line 39
    sget v1, Lcom/kubi/otc/R$string;->rule_limit:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 43
    move-result-object p0

    .line 44
    .line 45
    sget v1, Lcom/kubi/otc/R$string;->otc_deal_tips:I

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->J4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    sget v1, Lcom/kubi/otc/R$layout;->botc_view_otc_received_way_error:I

    .line 52
    .line 53
    new-instance v2, Lcom/kubi/otc/otc/order/l;

    .line 54
    .line 55
    .line 56
    invoke-direct {v2}, Lcom/kubi/otc/otc/order/l;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->E4(ILcom/kubi/resources/dialog/DialogFragmentHelper$b;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 60
    move-result-object p0

    .line 61
    .line 62
    sget v1, Lcom/kubi/otc/R$string;->cancel:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v1, v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->P4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 66
    move-result-object p0

    .line 67
    .line 68
    sget v0, Lcom/kubi/otc/R$string;->go_set:I

    .line 69
    .line 70
    new-instance v1, Lcom/kubi/otc/otc/order/m;

    .line 71
    .line 72
    .line 73
    invoke-direct {v1}, Lcom/kubi/otc/otc/order/m;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 77
    move-result-object p0

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    const-string v0, "getChildFragmentManager(...)"

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    const-string v0, "otcDialog"

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1, v0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 92
    goto :goto_4

    .line 93
    .line 94
    :cond_1
    sget-object v1, Lf00/a;->a:Lf00/a;

    .line 95
    .line 96
    if-eqz p0, :cond_2

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/kubi/otc/entity/OtcOrder;->getId()Ljava/lang/String;

    .line 100
    move-result-object p1

    .line 101
    goto :goto_1

    .line 102
    :cond_2
    move-object p1, v0

    .line 103
    .line 104
    .line 105
    :goto_1
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    move-result-object v4

    .line 107
    .line 108
    if-eqz p0, :cond_3

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/kubi/otc/entity/OtcOrder;->getBuyerRole()Ljava/lang/Boolean;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    .line 115
    :cond_3
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 116
    move-result p0

    .line 117
    .line 118
    if-eqz p0, :cond_4

    .line 119
    .line 120
    const-wide/16 p0, 0x1

    .line 121
    :goto_2
    move-wide v2, p0

    .line 122
    goto :goto_3

    .line 123
    .line 124
    :cond_4
    const-wide/16 p0, 0x0

    .line 125
    goto :goto_2

    .line 126
    .line 127
    :goto_3
    const/16 v9, 0x3c

    .line 128
    const/4 v10, 0x0

    .line 129
    const/4 v5, 0x0

    .line 130
    const/4 v6, 0x0

    .line 131
    const/4 v7, 0x0

    .line 132
    const/4 v8, 0x0

    .line 133
    .line 134
    .line 135
    invoke-static/range {v1 .. v10}, Lg00/j$a;->m(Lg00/j;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 136
    .line 137
    :goto_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 138
    return-object p0
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

.method public static final R3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "helper"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "<unused var>"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget p1, Lcom/kubi/otc/R$id;->tv_error_one:I

    .line 13
    .line 14
    sget-object v0, Lcom/kubi/otc/v;->a:Lcom/kubi/otc/v;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/kubi/otc/v;->j()Lcom/kubi/otc/entity/OtcUserInfo;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/kubi/otc/entity/OtcUserInfo;->getBindTradePassword()Ljava/lang/Boolean;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    xor-int/2addr v0, v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    sget v0, Lcom/kubi/otc/R$string;->open_trade_pwd:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 38
    move-result-object p0

    .line 39
    .line 40
    sget p1, Lcom/kubi/otc/R$id;->tv_error_two:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

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
.end method

.method public static final S3(Landroid/content/DialogInterface;I)V
    .locals 8

    .line 1
    .line 2
    const-string p1, "<unused var>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object p0, Lcom/kubi/otc/v;->a:Lcom/kubi/otc/v;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/otc/v;->j()Lcom/kubi/otc/entity/OtcUserInfo;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/otc/entity/OtcUserInfo;->getBindTradePassword()Ljava/lang/Boolean;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 19
    move-result p0

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 24
    .line 25
    const/16 v6, 0x1e

    .line 26
    const/4 v7, 0x0

    .line 27
    .line 28
    const-string v1, "SET_WITHDRAWAL_PASSWORD"

    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    .line 34
    .line 35
    invoke-static/range {v0 .. v7}, Lg00/k$a;->e(Lg00/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 36
    :cond_0
    return-void
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

.method public static final X3()Let/c;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Let/c;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Let/c;

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
.method public N3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/otc/entity/OtcOrder;)V
    .locals 13
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/otc/entity/OtcOrder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->getBuyerRole()Ljava/lang/Boolean;

    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 13
    move-result v1

    .line 14
    .line 15
    if-eqz p1, :cond_22

    .line 16
    .line 17
    sget v2, Lcom/kubi/otc/R$id;->tv_p2p_express:I

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->getOrderSource()Ljava/lang/String;

    .line 23
    move-result-object v3

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v3, v0

    .line 26
    .line 27
    .line 28
    :goto_1
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    const-string v4, "P2P Express"

    .line 32
    .line 33
    .line 34
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    move-result v3

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    const/4 v3, 0x1

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/4 v3, 0x0

    .line 43
    .line 44
    .line 45
    :goto_2
    invoke-virtual {p1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 46
    .line 47
    sget v2, Lcom/kubi/otc/R$id;->iv_side:I

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    sget v3, Lcom/kubi/otc/R$mipmap;->payment_ic_buy:I

    .line 52
    goto :goto_3

    .line 53
    .line 54
    :cond_3
    sget v3, Lcom/kubi/otc/R$mipmap;->payment_ic_sell:I

    .line 55
    .line 56
    .line 57
    :goto_3
    invoke-virtual {p1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setImageResource(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 58
    .line 59
    sget v2, Lcom/kubi/otc/R$id;->tv_side:I

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    sget v1, Lcom/kubi/otc/R$string;->buy:I

    .line 64
    goto :goto_4

    .line 65
    .line 66
    :cond_4
    sget v1, Lcom/kubi/otc/R$string;->sell:I

    .line 67
    .line 68
    .line 69
    :goto_4
    invoke-virtual {p1, v2, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 70
    .line 71
    sget v1, Lcom/kubi/otc/R$id;->tv_name:I

    .line 72
    .line 73
    if-eqz p2, :cond_5

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->getOpTraderNickName()Ljava/lang/String;

    .line 77
    move-result-object v3

    .line 78
    goto :goto_5

    .line 79
    :cond_5
    move-object v3, v0

    .line 80
    .line 81
    .line 82
    :goto_5
    invoke-virtual {p1, v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 83
    .line 84
    sget v1, Lcom/kubi/otc/R$id;->tv_label_name:I

    .line 85
    .line 86
    if-eqz p2, :cond_6

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->getCurrency()Ljava/lang/String;

    .line 90
    move-result-object v3

    .line 91
    goto :goto_6

    .line 92
    :cond_6
    move-object v3, v0

    .line 93
    .line 94
    .line 95
    :goto_6
    invoke-virtual {p1, v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 96
    .line 97
    sget v1, Lcom/kubi/otc/R$id;->tv_amount_title:I

    .line 98
    .line 99
    new-instance v3, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    sget v4, Lcom/kubi/otc/R$string;->amount:I

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 108
    move-result-object v4

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const/16 v4, 0x28

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    if-eqz p2, :cond_7

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->getCurrency()Ljava/lang/String;

    .line 122
    move-result-object v5

    .line 123
    goto :goto_7

    .line 124
    :cond_7
    move-object v5, v0

    .line 125
    .line 126
    .line 127
    :goto_7
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const/16 v5, 0x29

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    move-result-object v3

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 140
    .line 141
    sget v1, Lcom/kubi/otc/R$id;->tv_price_title:I

    .line 142
    .line 143
    new-instance v3, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    sget v6, Lcom/kubi/otc/R$string;->trade_total_amount:I

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 152
    move-result-object v6

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    if-eqz p2, :cond_8

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->getLegalCurrency()Ljava/lang/String;

    .line 164
    move-result-object v4

    .line 165
    goto :goto_8

    .line 166
    :cond_8
    move-object v4, v0

    .line 167
    .line 168
    .line 169
    :goto_8
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    move-result-object v3

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 180
    .line 181
    sget v1, Lcom/kubi/otc/R$id;->tv_amount_value:I

    .line 182
    .line 183
    if-eqz p2, :cond_9

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->getCurrencyAmount()Ljava/math/BigDecimal;

    .line 187
    move-result-object v3

    .line 188
    goto :goto_9

    .line 189
    :cond_9
    move-object v3, v0

    .line 190
    .line 191
    .line 192
    :goto_9
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->c(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 193
    move-result-object v3

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 197
    .line 198
    sget v1, Lcom/kubi/otc/R$id;->tv_price_value:I

    .line 199
    .line 200
    if-eqz p2, :cond_a

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->getLegalCurrencyAmount()Ljava/math/BigDecimal;

    .line 204
    move-result-object v3

    .line 205
    .line 206
    if-eqz v3, :cond_a

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 210
    move-result-object v3

    .line 211
    goto :goto_a

    .line 212
    :cond_a
    move-object v3, v0

    .line 213
    .line 214
    .line 215
    :goto_a
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    move-result-object v3

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 220
    .line 221
    sget v1, Lcom/kubi/otc/R$id;->tv_time_value:I

    .line 222
    .line 223
    if-eqz p2, :cond_b

    .line 224
    .line 225
    .line 226
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->getCreatedAt()Ljava/lang/Long;

    .line 227
    move-result-object v3

    .line 228
    goto :goto_b

    .line 229
    :cond_b
    move-object v3, v0

    .line 230
    .line 231
    .line 232
    :goto_b
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 233
    move-result-wide v3

    .line 234
    .line 235
    .line 236
    invoke-static {v3, v4}, Lcom/kubi/utils/TimeUtils;->i(J)Ljava/lang/String;

    .line 237
    move-result-object v3

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 241
    .line 242
    sget v1, Lcom/kubi/otc/R$id;->iv_fast:I

    .line 243
    .line 244
    if-eqz p2, :cond_c

    .line 245
    .line 246
    .line 247
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->isFast()Z

    .line 248
    move-result v3

    .line 249
    .line 250
    .line 251
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 252
    move-result-object v3

    .line 253
    goto :goto_c

    .line 254
    :cond_c
    move-object v3, v0

    .line 255
    .line 256
    .line 257
    :goto_c
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 258
    move-result v3

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1, v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 262
    .line 263
    sget v3, Lcom/kubi/otc/R$id;->view_unread_dot:I

    .line 264
    .line 265
    if-eqz p2, :cond_d

    .line 266
    .line 267
    .line 268
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->getImRelationshipDto()Lcom/kubi/otc/entity/OrderImInfo;

    .line 269
    move-result-object v4

    .line 270
    .line 271
    if-eqz v4, :cond_d

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4}, Lcom/kubi/otc/entity/OrderImInfo;->getMessageUnread()Ljava/lang/Boolean;

    .line 275
    move-result-object v4

    .line 276
    goto :goto_d

    .line 277
    :cond_d
    move-object v4, v0

    .line 278
    .line 279
    .line 280
    :goto_d
    invoke-static {v4}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 281
    move-result v4

    .line 282
    .line 283
    .line 284
    invoke-virtual {p1, v3, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 288
    move-result-object v2

    .line 289
    .line 290
    check-cast v2, Landroid/widget/TextView;

    .line 291
    .line 292
    if-eqz v2, :cond_10

    .line 293
    .line 294
    if-eqz p2, :cond_e

    .line 295
    .line 296
    .line 297
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->getBuyerRole()Ljava/lang/Boolean;

    .line 298
    move-result-object v3

    .line 299
    goto :goto_e

    .line 300
    :cond_e
    move-object v3, v0

    .line 301
    .line 302
    .line 303
    :goto_e
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 304
    move-result v3

    .line 305
    .line 306
    const-string v4, "mContext"

    .line 307
    .line 308
    if-eqz v3, :cond_f

    .line 309
    .line 310
    iget-object v3, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 311
    .line 312
    .line 313
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-static {v3}, Lcom/kubi/resources/g;->p(Landroid/content/Context;)I

    .line 317
    move-result v3

    .line 318
    goto :goto_f

    .line 319
    .line 320
    :cond_f
    iget-object v3, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 321
    .line 322
    .line 323
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-static {v3}, Lcom/kubi/resources/g;->n(Landroid/content/Context;)I

    .line 327
    move-result v3

    .line 328
    .line 329
    .line 330
    :goto_f
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 331
    .line 332
    :cond_10
    sget v2, Lcom/kubi/otc/R$id;->tv_status:I

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 336
    move-result-object v2

    .line 337
    .line 338
    check-cast v2, Landroid/widget/TextView;

    .line 339
    .line 340
    if-eqz p2, :cond_11

    .line 341
    .line 342
    .line 343
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->getAppealStatus()Ljava/lang/String;

    .line 344
    move-result-object v3

    .line 345
    goto :goto_10

    .line 346
    :cond_11
    move-object v3, v0

    .line 347
    .line 348
    .line 349
    :goto_10
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 350
    move-result-object v3

    .line 351
    .line 352
    const-string v4, "APPEALING"

    .line 353
    .line 354
    .line 355
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    move-result v3

    .line 357
    .line 358
    if-eqz v3, :cond_13

    .line 359
    .line 360
    if-eqz v2, :cond_12

    .line 361
    .line 362
    sget v0, Lcom/kubi/otc/R$color;->secondary:I

    .line 363
    .line 364
    .line 365
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 366
    move-result v0

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 370
    .line 371
    :cond_12
    if-eqz v2, :cond_1f

    .line 372
    .line 373
    sget v0, Lcom/kubi/otc/R$string;->appealing:I

    .line 374
    .line 375
    .line 376
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 377
    move-result-object v0

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 381
    .line 382
    goto/16 :goto_14

    .line 383
    .line 384
    :cond_13
    if-eqz p2, :cond_14

    .line 385
    .line 386
    .line 387
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->getStatus()Ljava/lang/String;

    .line 388
    move-result-object v3

    .line 389
    goto :goto_11

    .line 390
    :cond_14
    move-object v3, v0

    .line 391
    .line 392
    .line 393
    :goto_11
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 394
    move-result-object v3

    .line 395
    .line 396
    .line 397
    invoke-virtual {p0, v3}, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->T3(Ljava/lang/String;)Ljava/lang/String;

    .line 398
    move-result-object v3

    .line 399
    .line 400
    .line 401
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 402
    move-result v4

    .line 403
    .line 404
    .line 405
    const v5, 0x201b82

    .line 406
    .line 407
    if-eq v4, v5, :cond_19

    .line 408
    .line 409
    .line 410
    const v5, 0x274e7499

    .line 411
    .line 412
    if-eq v4, v5, :cond_17

    .line 413
    .line 414
    .line 415
    const v5, 0x36141b13

    .line 416
    .line 417
    if-eq v4, v5, :cond_15

    .line 418
    goto :goto_12

    .line 419
    .line 420
    :cond_15
    const-string v4, "PROCESSING"

    .line 421
    .line 422
    .line 423
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 424
    move-result v4

    .line 425
    .line 426
    if-nez v4, :cond_16

    .line 427
    goto :goto_12

    .line 428
    .line 429
    :cond_16
    if-eqz v2, :cond_1b

    .line 430
    .line 431
    sget v4, Lcom/kubi/otc/R$color;->primary:I

    .line 432
    .line 433
    .line 434
    invoke-virtual {p0, v4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 435
    move-result v4

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 439
    goto :goto_13

    .line 440
    .line 441
    :cond_17
    const-string v4, "CANCELED"

    .line 442
    .line 443
    .line 444
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 445
    move-result v4

    .line 446
    .line 447
    if-nez v4, :cond_18

    .line 448
    goto :goto_12

    .line 449
    .line 450
    :cond_18
    if-eqz v2, :cond_1b

    .line 451
    .line 452
    sget v4, Lcom/kubi/otc/R$color;->c_text20:I

    .line 453
    .line 454
    .line 455
    invoke-virtual {p0, v4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 456
    move-result v4

    .line 457
    .line 458
    .line 459
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 460
    goto :goto_13

    .line 461
    .line 462
    :cond_19
    const-string v4, "DONE"

    .line 463
    .line 464
    .line 465
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 466
    move-result v4

    .line 467
    .line 468
    if-nez v4, :cond_1a

    .line 469
    .line 470
    :goto_12
    if-eqz v2, :cond_1b

    .line 471
    .line 472
    sget v4, Lcom/kubi/otc/R$color;->c_text40:I

    .line 473
    .line 474
    .line 475
    invoke-virtual {p0, v4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 476
    move-result v4

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 480
    goto :goto_13

    .line 481
    .line 482
    :cond_1a
    if-eqz v2, :cond_1b

    .line 483
    .line 484
    sget v4, Lcom/kubi/otc/R$color;->c_text40:I

    .line 485
    .line 486
    .line 487
    invoke-virtual {p0, v4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 488
    move-result v4

    .line 489
    .line 490
    .line 491
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 492
    .line 493
    :cond_1b
    :goto_13
    if-eqz p2, :cond_1c

    .line 494
    .line 495
    .line 496
    invoke-virtual {p2}, Lcom/kubi/otc/entity/OtcOrder;->getStatus()Ljava/lang/String;

    .line 497
    move-result-object v0

    .line 498
    .line 499
    :cond_1c
    const-string v4, "CREATED"

    .line 500
    .line 501
    .line 502
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 503
    move-result v4

    .line 504
    .line 505
    if-eqz v4, :cond_1d

    .line 506
    .line 507
    if-eqz v2, :cond_1f

    .line 508
    .line 509
    sget v0, Lcom/kubi/otc/R$string;->unpaid:I

    .line 510
    .line 511
    .line 512
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 513
    goto :goto_14

    .line 514
    .line 515
    :cond_1d
    const-string v4, "PAYED_MONEY"

    .line 516
    .line 517
    .line 518
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 519
    move-result v0

    .line 520
    .line 521
    if-eqz v0, :cond_1e

    .line 522
    .line 523
    if-eqz v2, :cond_1f

    .line 524
    .line 525
    sget v0, Lcom/kubi/otc/R$string;->wait_release:I

    .line 526
    .line 527
    .line 528
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 529
    goto :goto_14

    .line 530
    .line 531
    :cond_1e
    if-eqz v2, :cond_1f

    .line 532
    .line 533
    .line 534
    invoke-virtual {p0}, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->U3()Ljava/util/LinkedHashMap;

    .line 535
    move-result-object v0

    .line 536
    .line 537
    .line 538
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    move-result-object v0

    .line 543
    .line 544
    check-cast v0, Ljava/lang/CharSequence;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 548
    .line 549
    .line 550
    :cond_1f
    :goto_14
    invoke-virtual {p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 551
    move-result-object v3

    .line 552
    .line 553
    if-eqz v3, :cond_20

    .line 554
    .line 555
    new-instance v6, Lcom/kubi/otc/otc/order/i;

    .line 556
    .line 557
    .line 558
    invoke-direct {v6, p0, p1}, Lcom/kubi/otc/otc/order/i;-><init>(Lcom/kubi/otc/otc/order/OtcOrderListFragment;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 559
    const/4 v7, 0x1

    .line 560
    const/4 v8, 0x0

    .line 561
    .line 562
    const-wide/16 v4, 0x0

    .line 563
    .line 564
    .line 565
    invoke-static/range {v3 .. v8}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 566
    .line 567
    :cond_20
    sget v0, Lcom/kubi/otc/R$id;->view_chat:I

    .line 568
    .line 569
    .line 570
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 571
    move-result-object v1

    .line 572
    .line 573
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->P2P:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 574
    .line 575
    .line 576
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 577
    move-result v0

    .line 578
    .line 579
    if-eqz v0, :cond_21

    .line 580
    .line 581
    .line 582
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 586
    goto :goto_15

    .line 587
    .line 588
    .line 589
    :cond_21
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 593
    .line 594
    :goto_15
    new-instance v4, Lcom/kubi/otc/otc/order/j;

    .line 595
    .line 596
    .line 597
    invoke-direct {v4, p1, p2, p0}, Lcom/kubi/otc/otc/order/j;-><init>(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/otc/entity/OtcOrder;Lcom/kubi/otc/otc/order/OtcOrderListFragment;)V

    .line 598
    const/4 v5, 0x1

    .line 599
    const/4 v6, 0x0

    .line 600
    .line 601
    const-wide/16 v2, 0x0

    .line 602
    .line 603
    .line 604
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 605
    .line 606
    iget-object v7, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 607
    .line 608
    const-string p1, "itemView"

    .line 609
    .line 610
    .line 611
    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 612
    .line 613
    new-instance v10, Lcom/kubi/otc/otc/order/k;

    .line 614
    .line 615
    .line 616
    invoke-direct {v10, p2, p0}, Lcom/kubi/otc/otc/order/k;-><init>(Lcom/kubi/otc/entity/OtcOrder;Lcom/kubi/otc/otc/order/OtcOrderListFragment;)V

    .line 617
    const/4 v11, 0x1

    .line 618
    const/4 v12, 0x0

    .line 619
    .line 620
    const-wide/16 v8, 0x0

    .line 621
    .line 622
    .line 623
    invoke-static/range {v7 .. v12}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 624
    :cond_22
    return-void
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

.method public final T3(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "CREATED"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "PAYED_MONEY"

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object p1

    .line 19
    .line 20
    :cond_1
    :goto_0
    const-string p1, "PROCESSING"

    .line 21
    return-object p1
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

.method public final U3()Ljava/util/LinkedHashMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->d0:Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->d0:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->d0:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    sget v1, Lcom/kubi/otc/R$string;->payment_status_processing:I

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    new-array v3, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-string v3, "PROCESSING"

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    sget v1, Lcom/kubi/otc/R$string;->completed:I

    .line 32
    .line 33
    new-array v3, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v1, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    const-string v3, "DONE"

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    sget v1, Lcom/kubi/otc/R$string;->canceled:I

    .line 45
    .line 46
    new-array v3, v2, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v1, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    const-string v3, "CANCELED"

    .line 53
    .line 54
    .line 55
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    sget v1, Lcom/kubi/otc/R$string;->p2p_list_status_succeeded:I

    .line 58
    .line 59
    new-array v3, v2, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    const-string v3, "SUCCEEDED"

    .line 66
    .line 67
    .line 68
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    sget v1, Lcom/kubi/otc/R$string;->p2p_list_status_failed:I

    .line 71
    .line 72
    new-array v3, v2, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v1, v3}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    const-string v3, "FAILED"

    .line 79
    .line 80
    .line 81
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    sget v1, Lcom/kubi/otc/R$string;->p2p_list_status_converting:I

    .line 84
    .line 85
    new-array v2, v2, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    const-string v2, "CONVERTING"

    .line 92
    .line 93
    .line 94
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    :cond_1
    iget-object v0, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->d0:Ljava/util/LinkedHashMap;

    .line 97
    return-object v0
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

.method public final V3()Let/c;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->Z:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Let/c;

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

.method public final W3(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "side"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "status"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iput-object p1, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->a0:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p2, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->b0:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->F3()V

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

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/otc/R$layout;->order_list_fragment_layout:I

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

.method public bridge synthetic o3(Lio/chad/library/adapter/base/BaseViewHolder;Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/otc/entity/OtcOrder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->N3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/otc/entity/OtcOrder;)V

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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const-string v2, "side"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v2, v0}, Lcom/kubi/router/utils/RouteExKt;->z(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object p1, v1

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    iput-object p1, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->a0:Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    const-string v2, "key_status"

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v2, v0}, Lcom/kubi/router/utils/RouteExKt;->z(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-object p1, v1

    .line 41
    .line 42
    .line 43
    :goto_1
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    iput-object p1, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->b0:Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    const-string v0, "key_is_from_p2p_container"

    .line 55
    const/4 v1, 0x0

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v0, v1}, Lcom/kubi/router/utils/RouteExKt;->i(Landroid/os/Bundle;Ljava/lang/String;Z)Z

    .line 59
    move-result p1

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 67
    move-result p1

    .line 68
    .line 69
    iput-boolean p1, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->c0:Z

    .line 70
    return-void
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

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3
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
    invoke-super {p0, p1, p2}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    iget-boolean p2, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->c0:Z

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    iget-object p2, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    new-instance v0, Lcom/kubi/payment/p2p/trade/d;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    const/high16 v2, 0x42a80000    # 84.0f

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v1}, Landroidx/core/util/TypedValueCompat;->dpToPx(FLandroid/util/DisplayMetrics;)F

    .line 34
    move-result v1

    .line 35
    float-to-int v1, v1

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Lcom/kubi/payment/p2p/trade/d;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 42
    .line 43
    :cond_0
    sget p2, Lcom/kubi/otc/R$id;->history_data_warn:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    check-cast p1, Lcom/kubi/resources/widget/BaseTextView;

    .line 50
    .line 51
    sget-object p2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->P2P:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 52
    .line 53
    .line 54
    invoke-static {p2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 55
    move-result p2

    .line 56
    .line 57
    xor-int/lit8 p2, p2, 0x1

    .line 58
    .line 59
    .line 60
    invoke-static {p2}, Lcom/kubi/payment/util/l;->h(Z)I

    .line 61
    move-result p2

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 65
    return-void
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
.end method

.method public r3(II)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BasePageEntity<",
            "Lcom/kubi/otc/entity/OtcOrder;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->V3()Let/c;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->a0:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/otc/otc/order/OtcOrderListFragment;->b0:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1, v2, p1, p2}, Let/c;->f(Ljava/lang/String;Ljava/lang/String;II)Lio/reactivex/Observable;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    const-string p2, "compose(...)"

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    return-object p1
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
    sget v0, Lcom/kubi/otc/R$layout;->botc_item_otc_order:I

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
