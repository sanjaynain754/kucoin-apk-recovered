.class public final Lcom/sumsub/sns/internal/features/data/repository/dynamic/a;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
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
.end method


# virtual methods
.method public final a()Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;
    .locals 13

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->d0:Lcom/sumsub/sns/internal/ff/core/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/ff/core/a;->b()Lcom/sumsub/sns/internal/ff/core/c;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object v0, v0, Lcom/sumsub/sns/internal/ff/core/c;->b:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    new-instance v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;

    .line 28
    .line 29
    .line 30
    const-string/jumbo v0, "periodSec"

    .line 31
    .line 32
    const-wide/16 v3, 0x78

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 36
    move-result-wide v3

    .line 37
    .line 38
    const-string v0, "armedRefresh"

    .line 39
    const/4 v5, 0x0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 43
    move-result v5

    .line 44
    .line 45
    .line 46
    const-string/jumbo v0, "waitForConnection"

    .line 47
    const/4 v6, 0x1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v0, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 51
    move-result v6

    .line 52
    .line 53
    .line 54
    const-string/jumbo v0, "waitTimeoutMs"

    .line 55
    .line 56
    const-wide/16 v7, 0xbb8

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v0, v7, v8}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 60
    move-result-wide v7

    .line 61
    .line 62
    const-wide/16 v9, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static {v7, v8, v9, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    .line 66
    move-result-wide v7

    .line 67
    .line 68
    .line 69
    const-string/jumbo v0, "stopTimeoutMs"

    .line 70
    .line 71
    const-wide/16 v11, 0x1388

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v0, v11, v12}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 75
    move-result-wide v0

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1, v9, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    .line 79
    move-result-wide v9

    .line 80
    .line 81
    .line 82
    invoke-direct/range {v2 .. v10}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;-><init>(JZZJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    return-object v2

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    .line 86
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 87
    .line 88
    .line 89
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    const-string v2, "Failed to parse androidApplicantPollingConfig FF"

    .line 93
    .line 94
    .line 95
    invoke-static {v1, v2, v0}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;

    .line 98
    .line 99
    .line 100
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;-><init>()V

    .line 101
    return-object v0

    .line 102
    .line 103
    :cond_1
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;

    .line 104
    .line 105
    .line 106
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;-><init>()V

    .line 107
    return-object v0
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
