.class public final Lcom/kubi/payment/third/order/ThirdOrderListFragment;
.super Lcom/kubi/sdk/base/ui/BasePagingFragment;
.source "ThirdOrderListFragment.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/sdk/base/ui/BasePagingFragment<",
        "Lcom/kubi/payment/third/data/entities/ThirdOrderItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u0010\u001a\u00020\u0011H\u0014J\u0008\u0010\u0012\u001a\u00020\u0011H\u0014J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u00142\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u001d\u001a\u00020\u0014H\u0002J&\u0010\u001e\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020 \u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0014J\u0008\u0010#\u001a\u00020\u0014H\u0014J\"\u0010$\u001a\u00020\u00142\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\rJ\u0012\u0010%\u001a\u00020\u00142\u0008\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*H\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\tR\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Lcom/kubi/payment/third/order/ThirdOrderListFragment;",
        "Lcom/kubi/sdk/base/ui/BasePagingFragment;",
        "Lcom/kubi/payment/third/data/entities/ThirdOrderItem;",
        "<init>",
        "()V",
        "mApi",
        "Lcom/kubi/payment/third/data/source/remote/ThirdWebService;",
        "kotlin.jvm.PlatformType",
        "getMApi",
        "()Lcom/kubi/payment/third/data/source/remote/ThirdWebService;",
        "mApi$delegate",
        "Lkotlin/Lazy;",
        "channel",
        "",
        "side",
        "status",
        "getLayout",
        "",
        "getItemLayout",
        "onViewCreated",
        "",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "bindDataToView",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "item",
        "showProcessingDialog",
        "getDataLoader",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/sdk/base/entity/BasePageEntity;",
        "pageIndex",
        "pageSize",
        "onReBack",
        "onFilter",
        "onErrorCallBack",
        "throwable",
        "",
        "trackCheckOrderRecord",
        "exception",
        "Lcom/kubi/network/retrofit/exception/ApiException;",
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

.field public c0:Ljava/lang/String;
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
    new-instance v0, Lmu/a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lmu/a;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->Z:Lkotlin/Lazy;

    .line 15
    .line 16
    const-string v0, ""

    .line 17
    .line 18
    iput-object v0, p0, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->a0:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->b0:Ljava/lang/String;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->c0:Ljava/lang/String;

    .line 23
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

.method public static synthetic H3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->U3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;

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

.method public static synthetic I3(Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->V3(Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;

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

.method public static synthetic J3(Lcom/kubi/payment/third/data/entities/ThirdOrderItem;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->O3(Lcom/kubi/payment/third/data/entities/ThirdOrderItem;)Lkotlin/Unit;

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

.method public static synthetic K3(ZZLcom/kubi/payment/third/order/ThirdOrderListFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->N3(ZZLcom/kubi/payment/third/order/ThirdOrderListFragment;)Lkotlin/Unit;

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

.method public static synthetic L3()Lcom/kubi/payment/third/data/source/remote/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->Q3()Lcom/kubi/payment/third/data/source/remote/a;

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

.method public static final N3(ZZLcom/kubi/payment/third/order/ThirdOrderListFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->T3()V

    .line 8
    .line 9
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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

.method public static final O3(Lcom/kubi/payment/third/data/entities/ThirdOrderItem;)Lkotlin/Unit;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;->getMetaData()Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    .line 11
    :goto_0
    if-eqz v1, :cond_3

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 15
    move-result v1

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :cond_1
    sget-object v1, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 21
    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;->getMetaData()Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    :cond_2
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    move-result-object p0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p0}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 34
    move-result-object p0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lay/a;->k()Z

    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 40
    return-object p0

    .line 41
    .line 42
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 43
    return-object p0
    .line 44
    .line 45
    .line 46
.end method

.method public static final Q3()Lcom/kubi/payment/third/data/source/remote/a;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lcom/kubi/payment/third/data/source/remote/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/kubi/payment/third/data/source/remote/a;

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

.method public static synthetic S3(Lcom/kubi/payment/third/order/ThirdOrderListFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    and-int/lit8 p5, p4, 0x2

    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-eqz p5, :cond_0

    .line 7
    move-object p2, v0

    .line 8
    .line 9
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 10
    .line 11
    if-eqz p4, :cond_1

    .line 12
    move-object p3, v0

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->R3(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    return-void
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
.end method

.method public static final U3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    const-string v0, "viewHolder"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "helper"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget v0, Lcom/kubi/otc/R$id;->tv_confirm:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    const-string p0, "getView(...)"

    .line 19
    .line 20
    .line 21
    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    new-instance v4, Lmu/e;

    .line 24
    .line 25
    .line 26
    invoke-direct {v4, p1}, Lmu/e;-><init>(Lcom/kubi/resources/dialog/DialogFragmentHelper;)V

    .line 27
    const/4 v5, 0x1

    .line 28
    const/4 v6, 0x0

    .line 29
    .line 30
    const-wide/16 v2, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 36
    return-object p0
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

.method public static final V3(Lcom/kubi/resources/dialog/DialogFragmentHelper;)Lkotlin/Unit;
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


# virtual methods
.method public D3(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->D3(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    instance-of v0, p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->W3(Lcom/kubi/network/retrofit/exception/ApiException;)V

    .line 13
    :cond_0
    return-void
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

.method public M3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/payment/third/data/entities/ThirdOrderItem;)V
    .locals 17
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/third/data/entities/ThirdOrderItem;
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
    if-eqz v1, :cond_17

    .line 9
    .line 10
    iget-object v3, v0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    invoke-static {v3}, Lxy/a;->a(Landroid/content/Context;)Lxy/d;

    .line 14
    move-result-object v3

    .line 15
    const/4 v4, 0x0

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;->getChannelIconUrl()Ljava/lang/String;

    .line 21
    move-result-object v5

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v5, v4

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    move-result-object v5

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v5}, Lxy/d;->N(Ljava/lang/String;)Lxy/c;

    .line 31
    move-result-object v3

    .line 32
    .line 33
    sget v5, Lcom/kubi/otc/R$mipmap;->kucoin_icon_default_icon:I

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v5}, Lxy/c;->q1(I)Lxy/c;

    .line 37
    move-result-object v3

    .line 38
    .line 39
    sget v5, Lcom/kubi/otc/R$id;->iv_type:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 43
    move-result-object v5

    .line 44
    .line 45
    check-cast v5, Landroid/widget/ImageView;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v5}, Lcom/bumptech/glide/g;->E0(Landroid/widget/ImageView;)Lm2/k;

    .line 49
    .line 50
    sget v3, Lcom/kubi/otc/R$id;->tv_side:I

    .line 51
    .line 52
    sget v5, Lcom/kubi/otc/R$string;->buy:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v3, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 56
    .line 57
    sget v5, Lcom/kubi/otc/R$id;->tv_currency:I

    .line 58
    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;->getCurrency()Ljava/lang/String;

    .line 63
    move-result-object v6

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move-object v6, v4

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    move-result-object v6

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 73
    .line 74
    sget v5, Lcom/kubi/otc/R$id;->iv_fast:I

    .line 75
    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;->isFast()Z

    .line 80
    move-result v6

    .line 81
    .line 82
    .line 83
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    move-result-object v6

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    move-object v6, v4

    .line 87
    .line 88
    .line 89
    :goto_2
    invoke-static {v6}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 90
    move-result v6

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 94
    .line 95
    sget v5, Lcom/kubi/otc/R$id;->tv_amount_title:I

    .line 96
    .line 97
    new-instance v6, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    sget v7, Lcom/kubi/otc/R$string;->amount:I

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 106
    move-result-object v7

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const/16 v7, 0x28

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    if-eqz v2, :cond_3

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;->getCurrency()Ljava/lang/String;

    .line 120
    move-result-object v8

    .line 121
    goto :goto_3

    .line 122
    :cond_3
    move-object v8, v4

    .line 123
    .line 124
    .line 125
    :goto_3
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const/16 v8, 0x29

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    move-result-object v6

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 138
    .line 139
    sget v5, Lcom/kubi/otc/R$id;->tv_price_title:I

    .line 140
    .line 141
    new-instance v6, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    sget v9, Lcom/kubi/otc/R$string;->market_amount:I

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v9}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 150
    move-result-object v9

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    if-eqz v2, :cond_4

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;->getFiatCurrency()Ljava/lang/String;

    .line 162
    move-result-object v7

    .line 163
    goto :goto_4

    .line 164
    :cond_4
    move-object v7, v4

    .line 165
    .line 166
    .line 167
    :goto_4
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    move-result-object v6

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 178
    .line 179
    sget v5, Lcom/kubi/otc/R$id;->tv_amount_value:I

    .line 180
    .line 181
    if-eqz v2, :cond_5

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;->getAmount()Ljava/lang/String;

    .line 185
    move-result-object v6

    .line 186
    goto :goto_5

    .line 187
    :cond_5
    move-object v6, v4

    .line 188
    .line 189
    .line 190
    :goto_5
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 191
    move-result-object v6

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 195
    .line 196
    sget v5, Lcom/kubi/otc/R$id;->tv_price_value:I

    .line 197
    .line 198
    if-eqz v2, :cond_6

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;->getFiatAmount()Ljava/lang/String;

    .line 202
    move-result-object v6

    .line 203
    .line 204
    if-eqz v6, :cond_6

    .line 205
    .line 206
    const/16 v15, 0xfd

    .line 207
    .line 208
    const/16 v16, 0x0

    .line 209
    const/4 v7, 0x0

    .line 210
    const/4 v8, 0x2

    .line 211
    const/4 v9, 0x0

    .line 212
    const/4 v10, 0x0

    .line 213
    const/4 v11, 0x0

    .line 214
    const/4 v12, 0x0

    .line 215
    const/4 v13, 0x0

    .line 216
    const/4 v14, 0x0

    .line 217
    .line 218
    .line 219
    invoke-static/range {v6 .. v16}, Lkf/a;->s(Ljava/lang/String;Ljava/math/RoundingMode;IZZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 220
    move-result-object v6

    .line 221
    goto :goto_6

    .line 222
    :cond_6
    move-object v6, v4

    .line 223
    .line 224
    :goto_6
    if-nez v6, :cond_7

    .line 225
    .line 226
    const-string v6, ""

    .line 227
    .line 228
    .line 229
    :cond_7
    invoke-virtual {v1, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 230
    .line 231
    sget v5, Lcom/kubi/otc/R$id;->tv_time_value:I

    .line 232
    .line 233
    if-eqz v2, :cond_8

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;->getCreatedAt()Ljava/lang/Long;

    .line 237
    move-result-object v6

    .line 238
    goto :goto_7

    .line 239
    :cond_8
    move-object v6, v4

    .line 240
    .line 241
    .line 242
    :goto_7
    invoke-static {v6}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 243
    move-result-wide v6

    .line 244
    .line 245
    .line 246
    invoke-static {v6, v7}, Lcom/kubi/utils/TimeUtils;->i(J)Ljava/lang/String;

    .line 247
    move-result-object v6

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 254
    move-result-object v3

    .line 255
    .line 256
    check-cast v3, Landroid/widget/TextView;

    .line 257
    .line 258
    if-eqz v3, :cond_9

    .line 259
    .line 260
    iget-object v5, v0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 261
    .line 262
    const-string v6, "mContext"

    .line 263
    .line 264
    .line 265
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v5}, Lcom/kubi/resources/g;->p(Landroid/content/Context;)I

    .line 269
    move-result v5

    .line 270
    .line 271
    .line 272
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 273
    .line 274
    :cond_9
    sget v3, Lcom/kubi/otc/R$id;->tv_status:I

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 278
    move-result-object v3

    .line 279
    move-object v5, v3

    .line 280
    .line 281
    check-cast v5, Landroid/widget/TextView;

    .line 282
    .line 283
    if-eqz v2, :cond_a

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2}, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;->getChannelId()Ljava/lang/String;

    .line 287
    move-result-object v3

    .line 288
    goto :goto_8

    .line 289
    :cond_a
    move-object v3, v4

    .line 290
    .line 291
    :goto_8
    const-string v6, "treasura"

    .line 292
    .line 293
    .line 294
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    move-result v3

    .line 296
    .line 297
    if-eqz v2, :cond_b

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;->getStatus()Ljava/lang/String;

    .line 301
    move-result-object v6

    .line 302
    goto :goto_9

    .line 303
    :cond_b
    move-object v6, v4

    .line 304
    .line 305
    :goto_9
    const-string v7, "PROCESSING"

    .line 306
    .line 307
    .line 308
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    move-result v6

    .line 310
    .line 311
    sget v8, Lcom/kubi/otc/R$id;->iv_status:I

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 315
    move-result-object v8

    .line 316
    .line 317
    .line 318
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 322
    const/4 v9, 0x2

    .line 323
    .line 324
    new-array v9, v9, [Landroid/view/View;

    .line 325
    const/4 v10, 0x0

    .line 326
    .line 327
    aput-object v8, v9, v10

    .line 328
    const/4 v10, 0x1

    .line 329
    .line 330
    aput-object v5, v9, v10

    .line 331
    .line 332
    new-instance v10, Lmu/b;

    .line 333
    .line 334
    .line 335
    invoke-direct {v10, v3, v6, v0}, Lmu/b;-><init>(ZZLcom/kubi/payment/third/order/ThirdOrderListFragment;)V

    .line 336
    .line 337
    .line 338
    invoke-static {v9, v10}, Lcom/kubi/utils/extensions/k;->D([Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 339
    .line 340
    if-eqz v2, :cond_c

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2}, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;->getStatus()Ljava/lang/String;

    .line 344
    move-result-object v6

    .line 345
    goto :goto_a

    .line 346
    :cond_c
    move-object v6, v4

    .line 347
    .line 348
    :goto_a
    if-eqz v6, :cond_13

    .line 349
    .line 350
    .line 351
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 352
    move-result v9

    .line 353
    .line 354
    .line 355
    sparse-switch v9, :sswitch_data_0

    .line 356
    .line 357
    goto/16 :goto_b

    .line 358
    .line 359
    :sswitch_0
    const-string v7, "FAILED"

    .line 360
    .line 361
    .line 362
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 363
    move-result v6

    .line 364
    .line 365
    if-nez v6, :cond_d

    .line 366
    .line 367
    goto/16 :goto_b

    .line 368
    .line 369
    :cond_d
    sget v6, Lcom/kubi/otc/R$color;->c_text40:I

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v6}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 373
    move-result v6

    .line 374
    .line 375
    .line 376
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 377
    .line 378
    sget v6, Lcom/kubi/otc/R$string;->failed:I

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 382
    move-result-object v6

    .line 383
    .line 384
    .line 385
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 386
    .line 387
    .line 388
    invoke-static {v8}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 389
    .line 390
    goto/16 :goto_c

    .line 391
    .line 392
    .line 393
    :sswitch_1
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 394
    move-result v6

    .line 395
    .line 396
    if-nez v6, :cond_e

    .line 397
    .line 398
    goto/16 :goto_b

    .line 399
    .line 400
    :cond_e
    sget v6, Lcom/kubi/otc/R$color;->primary:I

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0, v6}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 404
    move-result v6

    .line 405
    .line 406
    .line 407
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 408
    .line 409
    sget v6, Lcom/kubi/otc/R$string;->payment_status_processing:I

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 413
    move-result-object v6

    .line 414
    .line 415
    .line 416
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 417
    .line 418
    if-eqz v3, :cond_f

    .line 419
    .line 420
    .line 421
    invoke-static {v8}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 422
    .line 423
    goto/16 :goto_c

    .line 424
    .line 425
    .line 426
    :cond_f
    invoke-static {v8}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 427
    goto :goto_c

    .line 428
    .line 429
    :sswitch_2
    const-string v7, "CANCELED"

    .line 430
    .line 431
    .line 432
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 433
    move-result v6

    .line 434
    .line 435
    if-nez v6, :cond_10

    .line 436
    goto :goto_b

    .line 437
    .line 438
    :cond_10
    sget v6, Lcom/kubi/otc/R$color;->c_text40:I

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0, v6}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 442
    move-result v6

    .line 443
    .line 444
    .line 445
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 446
    .line 447
    sget v6, Lcom/kubi/otc/R$string;->canceled:I

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 451
    move-result-object v6

    .line 452
    .line 453
    .line 454
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 455
    .line 456
    .line 457
    invoke-static {v8}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 458
    goto :goto_c

    .line 459
    .line 460
    :sswitch_3
    const-string v7, "REFUNDED"

    .line 461
    .line 462
    .line 463
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 464
    move-result v6

    .line 465
    .line 466
    if-nez v6, :cond_11

    .line 467
    goto :goto_b

    .line 468
    .line 469
    :cond_11
    sget v6, Lcom/kubi/otc/R$color;->c_text40:I

    .line 470
    .line 471
    .line 472
    invoke-virtual {v0, v6}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 473
    move-result v6

    .line 474
    .line 475
    .line 476
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 477
    .line 478
    sget v6, Lcom/kubi/otc/R$string;->payment_order_refunded:I

    .line 479
    .line 480
    .line 481
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 482
    move-result-object v6

    .line 483
    .line 484
    .line 485
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 486
    .line 487
    .line 488
    invoke-static {v8}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 489
    goto :goto_c

    .line 490
    .line 491
    :sswitch_4
    const-string v7, "DONE"

    .line 492
    .line 493
    .line 494
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 495
    move-result v6

    .line 496
    .line 497
    if-nez v6, :cond_12

    .line 498
    goto :goto_b

    .line 499
    .line 500
    :cond_12
    sget v6, Lcom/kubi/otc/R$color;->c_text40:I

    .line 501
    .line 502
    .line 503
    invoke-virtual {v0, v6}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 504
    move-result v6

    .line 505
    .line 506
    .line 507
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 508
    .line 509
    sget v6, Lcom/kubi/otc/R$string;->completed:I

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 513
    move-result-object v6

    .line 514
    .line 515
    .line 516
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 517
    .line 518
    .line 519
    invoke-static {v8}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 520
    goto :goto_c

    .line 521
    .line 522
    :cond_13
    :goto_b
    sget v6, Lcom/kubi/otc/R$color;->c_text40:I

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0, v6}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 526
    move-result v6

    .line 527
    .line 528
    .line 529
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 530
    .line 531
    .line 532
    invoke-static {v8}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 533
    .line 534
    :goto_c
    if-eqz v2, :cond_14

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2}, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;->getMetaData()Ljava/lang/String;

    .line 538
    move-result-object v4

    .line 539
    .line 540
    :cond_14
    if-eqz v4, :cond_16

    .line 541
    .line 542
    .line 543
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 544
    move-result v4

    .line 545
    .line 546
    if-nez v4, :cond_15

    .line 547
    goto :goto_d

    .line 548
    .line 549
    :cond_15
    if-nez v3, :cond_16

    .line 550
    .line 551
    sget v6, Lcom/kubi/otc/R$drawable;->icon_arrow_right_mirrored:I

    .line 552
    const/4 v9, 0x6

    .line 553
    const/4 v10, 0x0

    .line 554
    const/4 v7, 0x0

    .line 555
    const/4 v8, 0x0

    .line 556
    .line 557
    .line 558
    invoke-static/range {v5 .. v10}, Lcom/kubi/utils/extensions/k;->i(Landroid/widget/TextView;IIIILjava/lang/Object;)V

    .line 559
    .line 560
    :cond_16
    :goto_d
    iget-object v11, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 561
    .line 562
    const-string v1, "itemView"

    .line 563
    .line 564
    .line 565
    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 566
    .line 567
    new-instance v14, Lmu/c;

    .line 568
    .line 569
    .line 570
    invoke-direct {v14, v2}, Lmu/c;-><init>(Lcom/kubi/payment/third/data/entities/ThirdOrderItem;)V

    .line 571
    const/4 v15, 0x1

    .line 572
    .line 573
    const/16 v16, 0x0

    .line 574
    .line 575
    const-wide/16 v12, 0x0

    .line 576
    .line 577
    .line 578
    invoke-static/range {v11 .. v16}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 579
    :cond_17
    return-void

    .line 580
    nop

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
    :sswitch_data_0
    .sparse-switch
        0x201b82 -> :sswitch_4
        0x473de17 -> :sswitch_3
        0x274e7499 -> :sswitch_2
        0x36141b13 -> :sswitch_1
        0x7b29883d -> :sswitch_0
    .end sparse-switch
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

.method public final P3()Lcom/kubi/payment/third/data/source/remote/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->Z:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/payment/third/data/source/remote/a;

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

.method public final R3(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "channel"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "side"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "status"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->a0:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p2, p0, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->b0:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p3, p0, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->c0:Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->F3()V

    .line 25
    return-void
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

.method public final T3()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/dialog/DialogFragmentHelper;->p0:Lcom/kubi/resources/dialog/DialogFragmentHelper$Companion;

    .line 3
    .line 4
    sget v1, Lcom/kubi/otc/R$layout;->payment_dialog_third_processing_status:I

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/DialogFragmentHelper$Companion;->newInstance(IZ)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Lmu/d;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lmu/d;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->f4(Lkotlin/jvm/functions/Function2;)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    const-string v2, "getChildFragmentManager(...)"

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    const-string v2, "payment_processing_status"

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

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

.method public final W3(Lcom/kubi/network/retrofit/exception/ApiException;)V
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
    const/16 v6, 0xa

    .line 35
    const/4 v7, 0x0

    .line 36
    .line 37
    const-string v2, "CHECK_ORDER_RECORD"

    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static/range {v1 .. v7}, Lcom/kubi/payment/track/IPaymentTrack;->i(Lcom/kubi/payment/track/IPaymentTrack;Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/payment/track/ThirdBuyTrackData;ILjava/lang/Object;)V

    .line 43
    return-void
    .line 44
    .line 45
    .line 46
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
    check-cast p2, Lcom/kubi/payment/third/data/entities/ThirdOrderItem;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->M3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/payment/third/data/entities/ThirdOrderItem;)V

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
    invoke-super {p0, p1, p2}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    sget p2, Lcom/kubi/otc/R$id;->history_data_warn:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    check-cast p1, Lcom/kubi/resources/widget/BaseTextView;

    .line 17
    .line 18
    sget-object p2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->ThirdParty:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 19
    .line 20
    .line 21
    invoke-static {p2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 22
    move-result p2

    .line 23
    .line 24
    xor-int/lit8 p2, p2, 0x1

    .line 25
    .line 26
    .line 27
    invoke-static {p2}, Lcom/kubi/payment/util/l;->h(Z)I

    .line 28
    move-result p2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

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
.end method

.method public r3(II)Lio/reactivex/Observable;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BasePageEntity<",
            "Lcom/kubi/payment/third/data/entities/ThirdOrderItem;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->a0:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->P3()Lcom/kubi/payment/third/data/source/remote/a;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iget-object v2, p0, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->a0:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->b0:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v4, p0, Lcom/kubi/payment/third/order/ThirdOrderListFragment;->c0:Ljava/lang/String;

    .line 19
    .line 20
    const/16 v8, 0x20

    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v7, 0x0

    .line 23
    move v5, p1

    .line 24
    move v6, p2

    .line 25
    .line 26
    .line 27
    invoke-static/range {v1 .. v9}, Lcom/kubi/payment/third/data/source/remote/a;->f(Lcom/kubi/payment/third/data/source/remote/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    return-object p1
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
    sget v0, Lcom/kubi/otc/R$layout;->botc_item_third_order:I

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
