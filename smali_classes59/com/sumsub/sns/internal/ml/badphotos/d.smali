.class public abstract Lcom/sumsub/sns/internal/ml/badphotos/d;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static a()Lcom/sumsub/sns/internal/ml/badphotos/e;
    .locals 11

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->q:Lcom/sumsub/sns/internal/ff/core/a;

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
    new-instance v0, Lcom/sumsub/sns/internal/ml/badphotos/e;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/sumsub/sns/internal/ml/badphotos/e;-><init>()V

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
    const-string v1, "allowed_steps"

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    new-instance v9, Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x0

    .line 44
    .line 45
    :goto_0
    if-ge v3, v2, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 49
    move-result-object v4

    .line 50
    .line 51
    .line 52
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    add-int/lit8 v3, v3, 0x1

    .line 55
    goto :goto_0

    .line 56
    .line 57
    .line 58
    :cond_1
    const-string/jumbo v1, "model"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    const-string v1, "high_quality_threshold"

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 72
    move-result v4

    .line 73
    .line 74
    const-string v1, "low_quality_threshold"

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    .line 81
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 82
    move-result v5

    .line 83
    .line 84
    const-string v1, "allow_cache"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 88
    move-result v8

    .line 89
    .line 90
    const-string v1, "execution_timeout_ms"

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 94
    move-result-wide v6

    .line 95
    .line 96
    const-string v1, "max_blocked_attempts"

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 100
    move-result v10

    .line 101
    .line 102
    new-instance v2, Lcom/sumsub/sns/internal/ml/badphotos/e;

    .line 103
    .line 104
    .line 105
    invoke-direct/range {v2 .. v10}, Lcom/sumsub/sns/internal/ml/badphotos/e;-><init>(Ljava/lang/String;FFJZLjava/util/List;I)V

    .line 106
    .line 107
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 108
    .line 109
    const-string v4, "BadPhotosDetectorFeature"

    .line 110
    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    const-string v1, "Parsed FF: "

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    move-result-object v5

    .line 127
    const/4 v7, 0x4

    .line 128
    const/4 v8, 0x0

    .line 129
    const/4 v6, 0x0

    .line 130
    .line 131
    .line 132
    invoke-static/range {v3 .. v8}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    return-object v2

    .line 134
    :catchall_0
    move-exception v0

    .line 135
    .line 136
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 137
    .line 138
    const-string v1, "BadPhotosDetectorFeature"

    .line 139
    .line 140
    const-string v2, "Failed to parse badPhotoDetectorConfig FF"

    .line 141
    .line 142
    .line 143
    invoke-static {v1, v2, v0}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 144
    .line 145
    new-instance v0, Lcom/sumsub/sns/internal/ml/badphotos/e;

    .line 146
    .line 147
    .line 148
    invoke-direct {v0}, Lcom/sumsub/sns/internal/ml/badphotos/e;-><init>()V

    .line 149
    return-object v0
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
