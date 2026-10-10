.class public final enum Lcom/kubi/sdk/site/SiteBizConfigKey;
.super Ljava/lang/Enum;
.source "SiteConfigKey.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/sdk/site/SiteBizConfigKey$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kubi/sdk/site/SiteBizConfigKey;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u0000 \u00112\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/kubi/sdk/site/SiteBizConfigKey;",
        "",
        "configKey",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getConfigKey",
        "()Ljava/lang/String;",
        "None",
        "SpotLiquidity",
        "ContractLiquidity",
        "RebateRange",
        "IsAllowedMultilevelRebate",
        "QuoteCurrency",
        "ShieldCurrency",
        "CustomParam",
        "DefaultLanguage",
        "Companion",
        "LSiteConfig_googleRelease"
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
.field public static final Companion:Lcom/kubi/sdk/site/SiteBizConfigKey$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum ContractLiquidity:Lcom/kubi/sdk/site/SiteBizConfigKey;

.field public static final enum CustomParam:Lcom/kubi/sdk/site/SiteBizConfigKey;

.field public static final enum DefaultLanguage:Lcom/kubi/sdk/site/SiteBizConfigKey;

.field public static final enum IsAllowedMultilevelRebate:Lcom/kubi/sdk/site/SiteBizConfigKey;

.field public static final enum None:Lcom/kubi/sdk/site/SiteBizConfigKey;

.field public static final enum QuoteCurrency:Lcom/kubi/sdk/site/SiteBizConfigKey;

.field public static final enum RebateRange:Lcom/kubi/sdk/site/SiteBizConfigKey;

.field public static final enum ShieldCurrency:Lcom/kubi/sdk/site/SiteBizConfigKey;

.field public static final enum SpotLiquidity:Lcom/kubi/sdk/site/SiteBizConfigKey;

.field public static final synthetic b:[Lcom/kubi/sdk/site/SiteBizConfigKey;

.field public static final synthetic c:Lkotlin/enums/EnumEntries;


# instance fields
.field private final configKey:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-string v2, "none"

    .line 6
    .line 7
    const-string v3, "None"

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/sdk/site/SiteBizConfigKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    sput-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->None:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 13
    .line 14
    new-instance v0, Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    const-string v2, "spot_liquidity"

    .line 18
    .line 19
    const-string v3, "SpotLiquidity"

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/sdk/site/SiteBizConfigKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 23
    .line 24
    sput-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->SpotLiquidity:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 25
    .line 26
    new-instance v0, Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 27
    const/4 v1, 0x2

    .line 28
    .line 29
    const-string v2, "contract_liquidity"

    .line 30
    .line 31
    const-string v3, "ContractLiquidity"

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/sdk/site/SiteBizConfigKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 35
    .line 36
    sput-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->ContractLiquidity:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 37
    .line 38
    new-instance v0, Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 39
    const/4 v1, 0x3

    .line 40
    .line 41
    const-string v2, "rebate_range"

    .line 42
    .line 43
    const-string v3, "RebateRange"

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/sdk/site/SiteBizConfigKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 47
    .line 48
    sput-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->RebateRange:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 49
    .line 50
    new-instance v0, Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 51
    const/4 v1, 0x4

    .line 52
    .line 53
    const-string v2, "is_allowed_multilevel_rebate"

    .line 54
    .line 55
    const-string v3, "IsAllowedMultilevelRebate"

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/sdk/site/SiteBizConfigKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 59
    .line 60
    sput-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->IsAllowedMultilevelRebate:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 61
    .line 62
    new-instance v0, Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 63
    const/4 v1, 0x5

    .line 64
    .line 65
    const-string v2, "quote_currency"

    .line 66
    .line 67
    const-string v3, "QuoteCurrency"

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/sdk/site/SiteBizConfigKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 71
    .line 72
    sput-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->QuoteCurrency:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 73
    .line 74
    new-instance v0, Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 75
    const/4 v1, 0x6

    .line 76
    .line 77
    const-string v2, "shield_currency"

    .line 78
    .line 79
    const-string v3, "ShieldCurrency"

    .line 80
    .line 81
    .line 82
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/sdk/site/SiteBizConfigKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 83
    .line 84
    sput-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->ShieldCurrency:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 85
    .line 86
    new-instance v0, Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 87
    const/4 v1, 0x7

    .line 88
    .line 89
    const-string v2, "custom_param"

    .line 90
    .line 91
    const-string v3, "CustomParam"

    .line 92
    .line 93
    .line 94
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/sdk/site/SiteBizConfigKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 95
    .line 96
    sput-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->CustomParam:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 97
    .line 98
    new-instance v0, Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 99
    .line 100
    const/16 v1, 0x8

    .line 101
    .line 102
    const-string v2, "default_language"

    .line 103
    .line 104
    const-string v3, "DefaultLanguage"

    .line 105
    .line 106
    .line 107
    invoke-direct {v0, v3, v1, v2}, Lcom/kubi/sdk/site/SiteBizConfigKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 108
    .line 109
    sput-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->DefaultLanguage:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 110
    .line 111
    .line 112
    invoke-static {}, Lcom/kubi/sdk/site/SiteBizConfigKey;->a()[Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 113
    move-result-object v0

    .line 114
    .line 115
    sput-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->b:[Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 119
    move-result-object v0

    .line 120
    .line 121
    sput-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->c:Lkotlin/enums/EnumEntries;

    .line 122
    .line 123
    new-instance v0, Lcom/kubi/sdk/site/SiteBizConfigKey$Companion;

    .line 124
    const/4 v1, 0x0

    .line 125
    .line 126
    .line 127
    invoke-direct {v0, v1}, Lcom/kubi/sdk/site/SiteBizConfigKey$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 128
    .line 129
    sput-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->Companion:Lcom/kubi/sdk/site/SiteBizConfigKey$Companion;

    .line 130
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput-object p3, p0, Lcom/kubi/sdk/site/SiteBizConfigKey;->configKey:Ljava/lang/String;

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
.end method

.method public static final synthetic a()[Lcom/kubi/sdk/site/SiteBizConfigKey;
    .locals 9

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->None:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/sdk/site/SiteBizConfigKey;->SpotLiquidity:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 5
    .line 6
    sget-object v2, Lcom/kubi/sdk/site/SiteBizConfigKey;->ContractLiquidity:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 7
    .line 8
    sget-object v3, Lcom/kubi/sdk/site/SiteBizConfigKey;->RebateRange:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 9
    .line 10
    sget-object v4, Lcom/kubi/sdk/site/SiteBizConfigKey;->IsAllowedMultilevelRebate:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 11
    .line 12
    sget-object v5, Lcom/kubi/sdk/site/SiteBizConfigKey;->QuoteCurrency:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 13
    .line 14
    sget-object v6, Lcom/kubi/sdk/site/SiteBizConfigKey;->ShieldCurrency:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 15
    .line 16
    sget-object v7, Lcom/kubi/sdk/site/SiteBizConfigKey;->CustomParam:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 17
    .line 18
    sget-object v8, Lcom/kubi/sdk/site/SiteBizConfigKey;->DefaultLanguage:Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 19
    .line 20
    .line 21
    filled-new-array/range {v0 .. v8}, [Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 22
    move-result-object v0

    .line 23
    return-object v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/kubi/sdk/site/SiteBizConfigKey;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->c:Lkotlin/enums/EnumEntries;

    .line 3
    return-object v0
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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kubi/sdk/site/SiteBizConfigKey;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 9
    return-object p0
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
.end method

.method public static values()[Lcom/kubi/sdk/site/SiteBizConfigKey;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/SiteBizConfigKey;->b:[Lcom/kubi/sdk/site/SiteBizConfigKey;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/kubi/sdk/site/SiteBizConfigKey;

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
.end method


# virtual methods
.method public final getConfigKey()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/sdk/site/SiteBizConfigKey;->configKey:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method
