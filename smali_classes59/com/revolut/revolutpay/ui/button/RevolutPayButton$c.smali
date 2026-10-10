.class public final synthetic Lcom/revolut/revolutpay/ui/button/RevolutPayButton$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revolut/revolutpay/ui/button/RevolutPayButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I

.field public static final synthetic $EnumSwitchMapping$2:[I

.field public static final synthetic $EnumSwitchMapping$3:[I

.field public static final synthetic $EnumSwitchMapping$4:[I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->values()[Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    :try_start_0
    sget-object v2, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->GBP:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    move-result v2

    .line 15
    .line 16
    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    :catch_0
    const/4 v2, 0x2

    .line 18
    .line 19
    :try_start_1
    sget-object v3, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->EUR:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 23
    move-result v3

    .line 24
    .line 25
    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 26
    :catch_1
    const/4 v3, 0x3

    .line 27
    .line 28
    :try_start_2
    sget-object v4, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->USD:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 32
    move-result v4

    .line 33
    .line 34
    aput v3, v0, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 35
    .line 36
    :catch_2
    sput-object v0, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$c;->$EnumSwitchMapping$0:[I

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/revolut/revolutpay/api/params/BoxTextValue;->values()[Lcom/revolut/revolutpay/api/params/BoxTextValue;

    .line 40
    move-result-object v0

    .line 41
    array-length v0, v0

    .line 42
    .line 43
    new-array v0, v0, [I

    .line 44
    .line 45
    :try_start_3
    sget-object v4, Lcom/revolut/revolutpay/api/params/BoxTextValue;->HIGH:Lcom/revolut/revolutpay/api/params/BoxTextValue;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 49
    move-result v4

    .line 50
    .line 51
    aput v1, v0, v4
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 52
    .line 53
    :catch_3
    :try_start_4
    sget-object v4, Lcom/revolut/revolutpay/api/params/BoxTextValue;->MEDIUM:Lcom/revolut/revolutpay/api/params/BoxTextValue;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 57
    move-result v4

    .line 58
    .line 59
    aput v2, v0, v4
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 60
    .line 61
    :catch_4
    sput-object v0, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$c;->$EnumSwitchMapping$1:[I

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lcom/revolut/revolutpay/api/params/BoxText;->values()[Lcom/revolut/revolutpay/api/params/BoxText;

    .line 65
    move-result-object v0

    .line 66
    array-length v0, v0

    .line 67
    .line 68
    new-array v0, v0, [I

    .line 69
    .line 70
    :try_start_5
    sget-object v4, Lcom/revolut/revolutpay/api/params/BoxText;->NONE:Lcom/revolut/revolutpay/api/params/BoxText;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 74
    move-result v4

    .line 75
    .line 76
    aput v1, v0, v4
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 77
    .line 78
    :catch_5
    :try_start_6
    sget-object v4, Lcom/revolut/revolutpay/api/params/BoxText;->GET_CASHBACK_VALUE:Lcom/revolut/revolutpay/api/params/BoxText;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 82
    move-result v4

    .line 83
    .line 84
    aput v2, v0, v4
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 85
    .line 86
    :catch_6
    sput-object v0, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$c;->$EnumSwitchMapping$2:[I

    .line 87
    .line 88
    .line 89
    invoke-static {}, Lcom/revolut/revolutpay/api/params/Radius;->values()[Lcom/revolut/revolutpay/api/params/Radius;

    .line 90
    move-result-object v0

    .line 91
    array-length v0, v0

    .line 92
    .line 93
    new-array v0, v0, [I

    .line 94
    .line 95
    :try_start_7
    sget-object v4, Lcom/revolut/revolutpay/api/params/Radius;->NONE:Lcom/revolut/revolutpay/api/params/Radius;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 99
    move-result v4

    .line 100
    .line 101
    aput v1, v0, v4
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    .line 102
    .line 103
    :catch_7
    :try_start_8
    sget-object v4, Lcom/revolut/revolutpay/api/params/Radius;->SMALL:Lcom/revolut/revolutpay/api/params/Radius;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 107
    move-result v4

    .line 108
    .line 109
    aput v2, v0, v4
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    .line 110
    .line 111
    :catch_8
    :try_start_9
    sget-object v4, Lcom/revolut/revolutpay/api/params/Radius;->MEDIUM:Lcom/revolut/revolutpay/api/params/Radius;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 115
    move-result v4

    .line 116
    .line 117
    aput v3, v0, v4
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    .line 118
    :catch_9
    const/4 v4, 0x4

    .line 119
    .line 120
    :try_start_a
    sget-object v5, Lcom/revolut/revolutpay/api/params/Radius;->LARGE:Lcom/revolut/revolutpay/api/params/Radius;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 124
    move-result v5

    .line 125
    .line 126
    aput v4, v0, v5
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    .line 127
    .line 128
    :catch_a
    sput-object v0, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$c;->$EnumSwitchMapping$3:[I

    .line 129
    .line 130
    .line 131
    invoke-static {}, Lcom/revolut/revolutpay/api/params/Size;->values()[Lcom/revolut/revolutpay/api/params/Size;

    .line 132
    move-result-object v0

    .line 133
    array-length v0, v0

    .line 134
    .line 135
    new-array v0, v0, [I

    .line 136
    .line 137
    :try_start_b
    sget-object v5, Lcom/revolut/revolutpay/api/params/Size;->EXTRA_SMALL:Lcom/revolut/revolutpay/api/params/Size;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 141
    move-result v5

    .line 142
    .line 143
    aput v1, v0, v5
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    .line 144
    .line 145
    :catch_b
    :try_start_c
    sget-object v1, Lcom/revolut/revolutpay/api/params/Size;->SMALL:Lcom/revolut/revolutpay/api/params/Size;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 149
    move-result v1

    .line 150
    .line 151
    aput v2, v0, v1
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    .line 152
    .line 153
    :catch_c
    :try_start_d
    sget-object v1, Lcom/revolut/revolutpay/api/params/Size;->MEDIUM:Lcom/revolut/revolutpay/api/params/Size;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 157
    move-result v1

    .line 158
    .line 159
    aput v3, v0, v1
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    .line 160
    .line 161
    :catch_d
    :try_start_e
    sget-object v1, Lcom/revolut/revolutpay/api/params/Size;->LARGE:Lcom/revolut/revolutpay/api/params/Size;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 165
    move-result v1

    .line 166
    .line 167
    aput v4, v0, v1
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    .line 168
    .line 169
    :catch_e
    sput-object v0, Lcom/revolut/revolutpay/ui/button/RevolutPayButton$c;->$EnumSwitchMapping$4:[I

    .line 170
    return-void
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
