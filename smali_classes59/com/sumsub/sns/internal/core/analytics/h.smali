.class public abstract synthetic Lcom/sumsub/sns/internal/core/analytics/h;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/internal/core/analytics/Domain;->values()[Lcom/sumsub/sns/internal/core/analytics/Domain;

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
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Domain;->Ui:Lcom/sumsub/sns/internal/core/analytics/Domain;

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
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Domain;->Step:Lcom/sumsub/sns/internal/core/analytics/Domain;

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
    sget-object v4, Lcom/sumsub/sns/internal/core/analytics/Domain;->PrimaryAction:Lcom/sumsub/sns/internal/core/analytics/Domain;

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
    :catch_2
    const/4 v4, 0x4

    .line 36
    .line 37
    :try_start_3
    sget-object v5, Lcom/sumsub/sns/internal/core/analytics/Domain;->Sdk:Lcom/sumsub/sns/internal/core/analytics/Domain;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 41
    move-result v5

    .line 42
    .line 43
    aput v4, v0, v5
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 44
    .line 45
    :catch_3
    sput-object v0, Lcom/sumsub/sns/internal/core/analytics/h;->a:[I

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcom/sumsub/sns/internal/core/analytics/ControlAction;->values()[Lcom/sumsub/sns/internal/core/analytics/ControlAction;

    .line 49
    move-result-object v0

    .line 50
    array-length v0, v0

    .line 51
    .line 52
    new-array v0, v0, [I

    .line 53
    .line 54
    :try_start_4
    sget-object v5, Lcom/sumsub/sns/internal/core/analytics/ControlAction;->Seen:Lcom/sumsub/sns/internal/core/analytics/ControlAction;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 58
    move-result v5

    .line 59
    .line 60
    aput v1, v0, v5
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 61
    .line 62
    :catch_4
    :try_start_5
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/ControlAction;->Checked:Lcom/sumsub/sns/internal/core/analytics/ControlAction;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 66
    move-result v1

    .line 67
    .line 68
    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 69
    .line 70
    :catch_5
    :try_start_6
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/ControlAction;->Unchecked:Lcom/sumsub/sns/internal/core/analytics/ControlAction;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 74
    move-result v1

    .line 75
    .line 76
    aput v3, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 77
    .line 78
    :catch_6
    :try_start_7
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/ControlAction;->Clicked:Lcom/sumsub/sns/internal/core/analytics/ControlAction;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 82
    move-result v1

    .line 83
    .line 84
    aput v4, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    .line 85
    .line 86
    :catch_7
    :try_start_8
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/ControlAction;->Changed:Lcom/sumsub/sns/internal/core/analytics/ControlAction;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 90
    move-result v1

    .line 91
    const/4 v2, 0x5

    .line 92
    .line 93
    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    .line 94
    .line 95
    :catch_8
    :try_start_9
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/ControlAction;->PermissionsChanged:Lcom/sumsub/sns/internal/core/analytics/ControlAction;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 99
    move-result v1

    .line 100
    const/4 v2, 0x6

    .line 101
    .line 102
    aput v2, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    .line 103
    .line 104
    :catch_9
    sput-object v0, Lcom/sumsub/sns/internal/core/analytics/h;->b:[I

    .line 105
    return-void
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
.end method
