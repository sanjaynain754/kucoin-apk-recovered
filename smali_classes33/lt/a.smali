.class public final Llt/a;
.super Ljava/lang/Object;
.source "PayTrackEvent.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003Jv\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00052\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/kubi/otc/utils/PayTrackEvent;",
        "",
        "<init>",
        "()V",
        "PAY_FAST_BUY",
        "",
        "PAY_FAST_SELL",
        "PAY_THIRD",
        "PAY_FIAT_RECHARGE",
        "PAY_FIAT_WITHDRAW",
        "PAY_FAST_C2C",
        "PAY_FAST_BALANCE",
        "PAY_FAST_BANKCARD",
        "PAY_FAST_POPULAR_PAY",
        "PAY_C2C_FAST",
        "PAY_C2C_DEAL",
        "trackResult",
        "",
        "success",
        "",
        "errorMsg",
        "crypto",
        "fiat",
        "businessType",
        "fastType",
        "c2cType",
        "thirdChannel",
        "fiatChannel",
        "paymentMethodCode",
        "channelId",
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
.field public static final a:Llt/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Llt/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Llt/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Llt/a;->a:Llt/a;

    .line 8
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static synthetic b(Llt/a;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    and-int/lit8 p13, p12, 0x2

    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-eqz p13, :cond_0

    .line 7
    move-object p2, v0

    .line 8
    .line 9
    :cond_0
    and-int/lit8 p13, p12, 0x4

    .line 10
    .line 11
    if-eqz p13, :cond_1

    .line 12
    move-object p3, v0

    .line 13
    .line 14
    :cond_1
    and-int/lit8 p13, p12, 0x8

    .line 15
    .line 16
    if-eqz p13, :cond_2

    .line 17
    move-object p4, v0

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p13, p12, 0x10

    .line 20
    .line 21
    if-eqz p13, :cond_3

    .line 22
    move-object p5, v0

    .line 23
    .line 24
    :cond_3
    and-int/lit8 p13, p12, 0x20

    .line 25
    .line 26
    if-eqz p13, :cond_4

    .line 27
    move-object p6, v0

    .line 28
    .line 29
    :cond_4
    and-int/lit8 p13, p12, 0x40

    .line 30
    .line 31
    if-eqz p13, :cond_5

    .line 32
    move-object p7, v0

    .line 33
    .line 34
    :cond_5
    and-int/lit16 p13, p12, 0x80

    .line 35
    .line 36
    if-eqz p13, :cond_6

    .line 37
    move-object p8, v0

    .line 38
    .line 39
    :cond_6
    and-int/lit16 p13, p12, 0x100

    .line 40
    .line 41
    if-eqz p13, :cond_7

    .line 42
    move-object p9, v0

    .line 43
    .line 44
    :cond_7
    and-int/lit16 p13, p12, 0x200

    .line 45
    const/4 v0, 0x0

    .line 46
    .line 47
    if-eqz p13, :cond_8

    .line 48
    move-object p10, v0

    .line 49
    .line 50
    :cond_8
    and-int/lit16 p12, p12, 0x400

    .line 51
    .line 52
    if-eqz p12, :cond_9

    .line 53
    move-object p11, v0

    .line 54
    .line 55
    .line 56
    :cond_9
    invoke-virtual/range {p0 .. p11}, Llt/a;->a(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    return-void
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
.end method


# virtual methods
.method public final a(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "errorMsg"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "crypto"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "fiat"

    .line 13
    .line 14
    .line 15
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "businessType"

    .line 18
    .line 19
    .line 20
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    const-string v0, "fastType"

    .line 23
    .line 24
    .line 25
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    const-string v0, "c2cType"

    .line 28
    .line 29
    .line 30
    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    const-string v0, "thirdChannel"

    .line 33
    .line 34
    .line 35
    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    const-string v0, "fiatChannel"

    .line 38
    .line 39
    .line 40
    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    new-instance v0, Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 46
    .line 47
    const-string v1, "is_success"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 54
    move-result p1

    .line 55
    .line 56
    if-lez p1, :cond_0

    .line 57
    .line 58
    const-string p1, "fail_reason"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    :cond_0
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    .line 65
    move-result p1

    .line 66
    .line 67
    if-lez p1, :cond_1

    .line 68
    .line 69
    const-string p1, "pay_crypto_currency"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    .line 76
    move-result p1

    .line 77
    .line 78
    if-lez p1, :cond_2

    .line 79
    .line 80
    const-string p1, "pay_fiat_currency"

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 84
    .line 85
    .line 86
    :cond_2
    invoke-interface {p5}, Ljava/lang/CharSequence;->length()I

    .line 87
    move-result p1

    .line 88
    .line 89
    if-lez p1, :cond_3

    .line 90
    .line 91
    const-string p1, "pay_business_type"

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p1, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    :cond_3
    invoke-interface {p6}, Ljava/lang/CharSequence;->length()I

    .line 98
    move-result p1

    .line 99
    .line 100
    if-lez p1, :cond_4

    .line 101
    .line 102
    const-string p1, "pay_fast_type"

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1, p6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    :cond_4
    invoke-interface {p7}, Ljava/lang/CharSequence;->length()I

    .line 109
    move-result p1

    .line 110
    .line 111
    if-lez p1, :cond_5

    .line 112
    .line 113
    const-string p1, "pay_c2c_type"

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, p1, p7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 117
    .line 118
    .line 119
    :cond_5
    invoke-interface {p8}, Ljava/lang/CharSequence;->length()I

    .line 120
    move-result p1

    .line 121
    .line 122
    if-lez p1, :cond_6

    .line 123
    .line 124
    const-string p1, "pay_third_channel"

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p1, p8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 128
    .line 129
    .line 130
    :cond_6
    invoke-interface {p9}, Ljava/lang/CharSequence;->length()I

    .line 131
    move-result p1

    .line 132
    .line 133
    if-lez p1, :cond_7

    .line 134
    .line 135
    const-string p1, "pay_fiat_channel"

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, p1, p9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    .line 140
    :cond_7
    if-eqz p10, :cond_9

    .line 141
    .line 142
    .line 143
    invoke-interface {p10}, Ljava/lang/CharSequence;->length()I

    .line 144
    move-result p1

    .line 145
    .line 146
    if-nez p1, :cond_8

    .line 147
    goto :goto_0

    .line 148
    .line 149
    :cond_8
    const-string p1, "paymentMethodCode"

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, p1, p10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 153
    .line 154
    :cond_9
    :goto_0
    if-eqz p11, :cond_b

    .line 155
    .line 156
    .line 157
    invoke-interface {p11}, Ljava/lang/CharSequence;->length()I

    .line 158
    move-result p1

    .line 159
    .line 160
    if-nez p1, :cond_a

    .line 161
    goto :goto_1

    .line 162
    .line 163
    :cond_a
    const-string p1, "channelId"

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, p1, p11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 167
    .line 168
    :cond_b
    :goto_1
    const-string p1, "pay_results"

    .line 169
    .line 170
    .line 171
    invoke-static {p1, v0}, Lqq/m;->q(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 172
    return-void
.end method
