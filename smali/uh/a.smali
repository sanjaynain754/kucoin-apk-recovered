.class public interface abstract Luh/a;
.super Ljava/lang/Object;
.source "ISettingApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u0005H\'J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0001\u0010\n\u001a\u00020\u000bH\'J8\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\u0008\u0012\u0004\u0012\u00020\u000e`\u000f2\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0003\u0010\u0012\u001a\u00020\u00052\n\u0008\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\'JP\u0010\u0014\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00150\rj\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0015`\u000f2\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u00052\n\u0008\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0003\u0010\u0012\u001a\u00020\u00052\n\u0008\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\'J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u0005H\'J\u001e\u0010\u001a\u001a\u00020\u00012\u0014\u0008\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001cH\'J\u0008\u0010\u001d\u001a\u00020\u001eH\'J\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00012\n\u0008\u0003\u0010 \u001a\u0004\u0018\u00010\u0005H\'J\u0014\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0008\u0001\u0010#\u001a\u00020$H\'J\"\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001c2\n\u0008\u0003\u0010&\u001a\u0004\u0018\u00010\u0005H\'J\n\u0010\'\u001a\u0004\u0018\u00010(H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006)\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/futures/data/setting/ISettingApi;",
        "",
        "openContract",
        "Lcom/kubi/kumex/data/platform/model/OpenEntity;",
        "deviceId",
        "",
        "fetchTradingNoticeSettings",
        "Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;",
        "time",
        "submitTradingNoticeSettings",
        "param",
        "Lcom/kubi/kumex/data/platform/model/TradingNoticeParamsEntity;",
        "checkValidationCode",
        "Ljava/util/ArrayList;",
        "Lcom/kubi/data/entity/CheckCodeResultEntity;",
        "Lkotlin/collections/ArrayList;",
        "checkCodeParamsEntity",
        "Lcom/kubi/data/entity/CheckCodeParamsEntity;",
        "header",
        "fingerId",
        "checkRequiredValidation",
        "",
        "bizType",
        "loginToken",
        "fetchPreferencesSettings",
        "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;",
        "submitPreferencesSettings",
        "request",
        "",
        "fetchUserConfig",
        "Lcom/kubi/kumex/data/platform/model/UserConfig;",
        "submitUserConfig",
        "symbol",
        "fetchTaxRate",
        "Lcom/kubi/kumex/data/trade/model/UserTaxEntity;",
        "isTrial",
        "",
        "getBizType",
        "fundsType",
        "fetchAuUserCategory",
        "Lcom/kubi/kumex/data/trade/model/AuUserCategoryVO;",
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


# direct methods
.method public static synthetic y(Luh/a;Ljava/lang/String;ILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/OpenEntity;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    if-nez p3, :cond_1

    .line 3
    .line 4
    and-int/lit8 p2, p2, 0x1

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/blankj/utilcode/util/j;->f()Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    const-string p2, "getUniqueDeviceId(...)"

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {p0, p1}, Luh/a;->h(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/OpenEntity;

    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    .line 22
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string p1, "Super calls with default arguments not supported in this target, function: openContract"

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 28
    throw p0
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
.end method


# virtual methods
.method public abstract a(Z)Lcom/kubi/kumex/data/trade/model/UserTaxEntity;
    .param p1    # Z
        .annotation runtime Lretrofit2/http/Query;
            value = "isTrial"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v2/km/trade/configs/getUserTaxFee"
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;)Ljava/util/Map;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "fundsType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/kumex-account/funds-tx-type"
    .end annotation
.end method

.method public abstract d()Lcom/kubi/kumex/data/platform/model/UserConfig;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/kumex/basic-config"
    .end annotation
.end method

.method public abstract h(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/OpenEntity;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "X-DEVICE-FRONT-ID"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/kumex/user/open-contract"
    .end annotation
.end method

.method public abstract j(Ljava/lang/String;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "defaultSymbol"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/kumex/basic-config"
    .end annotation
.end method

.method public abstract l(Lcom/kubi/kumex/data/platform/model/TradingNoticeParamsEntity;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/kumex/data/platform/model/TradingNoticeParamsEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/user/user-config"
    .end annotation
.end method

.method public abstract n(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/PreferencesEntity;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "Cache-Time"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/contracts/user-preferences"
    .end annotation
.end method

.method public abstract u(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "Cache-Time"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/user/user-configs"
    .end annotation
.end method

.method public abstract v()Lcom/kubi/kumex/data/trade/model/AuUserCategoryVO;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v2/km/configs/getAuUserCategory"
    .end annotation
.end method

.method public abstract x(Ljava/util/Map;)Ljava/lang/Object;
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/FieldMap;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/contracts/user-preferences"
    .end annotation
.end method
