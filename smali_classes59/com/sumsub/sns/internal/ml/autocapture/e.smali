.class public abstract Lcom/sumsub/sns/internal/ml/autocapture/e;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static a()Lcom/sumsub/sns/internal/ml/autocapture/g;
    .locals 12

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->s:Lcom/sumsub/sns/internal/ff/core/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/ff/core/a;->b()Lcom/sumsub/sns/internal/ff/core/c;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v0, v0, Lcom/sumsub/sns/internal/ff/core/c;->b:Ljava/lang/String;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/sumsub/sns/internal/ml/autocapture/g;-><init>()V

    .line 16
    return-object v0

    .line 17
    .line 18
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    const-string v0, "android"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    new-instance v1, Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 30
    .line 31
    .line 32
    const-string/jumbo v2, "videoBitrate"

    .line 33
    .line 34
    sget v3, Lcom/sumsub/sns/internal/ml/autocapture/g;->f:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 38
    move-result v2

    .line 39
    .line 40
    const-string v3, "maxRecordedDurationSec"

    .line 41
    .line 42
    sget v4, Lcom/sumsub/sns/internal/ml/autocapture/g;->g:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 46
    move-result v3

    .line 47
    .line 48
    .line 49
    const-string/jumbo v4, "videoQuality"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    move-result-object v4

    .line 54
    .line 55
    sget-object v5, Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;->Companion:Lcom/sumsub/sns/internal/ml/autocapture/f;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;->values()[Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;

    .line 62
    move-result-object v5

    .line 63
    array-length v6, v5

    .line 64
    const/4 v7, 0x0

    .line 65
    move v8, v7

    .line 66
    :goto_0
    const/4 v9, 0x0

    .line 67
    .line 68
    if-ge v8, v6, :cond_2

    .line 69
    .line 70
    aget-object v10, v5, v8

    .line 71
    .line 72
    .line 73
    invoke-virtual {v10}, Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;->getValue()Ljava/lang/String;

    .line 74
    move-result-object v11

    .line 75
    .line 76
    .line 77
    invoke-static {v11, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    move-result v11

    .line 79
    .line 80
    if-eqz v11, :cond_1

    .line 81
    goto :goto_1

    .line 82
    .line 83
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 84
    goto :goto_0

    .line 85
    :cond_2
    move-object v10, v9

    .line 86
    .line 87
    :goto_1
    if-nez v10, :cond_3

    .line 88
    .line 89
    sget-object v10, Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;->HD:Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;

    .line 90
    :cond_3
    move-object v4, v10

    .line 91
    .line 92
    .line 93
    const-string/jumbo v5, "videoFallbackQuality"

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    move-result-object v5

    .line 98
    .line 99
    sget-object v6, Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;->Companion:Lcom/sumsub/sns/internal/ml/autocapture/f;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {}, Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;->values()[Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;

    .line 106
    move-result-object v6

    .line 107
    array-length v8, v6

    .line 108
    .line 109
    :goto_2
    if-ge v7, v8, :cond_5

    .line 110
    .line 111
    aget-object v10, v6, v7

    .line 112
    .line 113
    .line 114
    invoke-virtual {v10}, Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;->getValue()Ljava/lang/String;

    .line 115
    move-result-object v11

    .line 116
    .line 117
    .line 118
    invoke-static {v11, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    move-result v11

    .line 120
    .line 121
    if-eqz v11, :cond_4

    .line 122
    move-object v9, v10

    .line 123
    goto :goto_3

    .line 124
    .line 125
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 126
    goto :goto_2

    .line 127
    .line 128
    :cond_5
    :goto_3
    if-nez v9, :cond_6

    .line 129
    .line 130
    sget-object v9, Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;->SD:Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;

    .line 131
    :cond_6
    move-object v5, v9

    .line 132
    .line 133
    const-string v6, "maxRecordedFileSizeMB"

    .line 134
    .line 135
    const/16 v7, 0x1e

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 139
    move-result v6

    .line 140
    .line 141
    .line 142
    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/internal/ml/autocapture/g;-><init>(IILcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    return-object v1

    .line 144
    :catch_0
    move-exception v0

    .line 145
    .line 146
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 147
    .line 148
    sget-object v1, Lcom/sumsub/sns/internal/ml/autocapture/d;->m:Lcom/sumsub/sns/internal/ml/autocapture/b;

    .line 149
    .line 150
    .line 151
    invoke-static {v1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 152
    move-result-object v1

    .line 153
    .line 154
    const-string v2, "Failed to parse seamlessDocaptureMobileConfig FF"

    .line 155
    .line 156
    .line 157
    invoke-static {v1, v2, v0}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    new-instance v0, Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 160
    .line 161
    .line 162
    invoke-direct {v0}, Lcom/sumsub/sns/internal/ml/autocapture/g;-><init>()V

    .line 163
    return-object v0
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
