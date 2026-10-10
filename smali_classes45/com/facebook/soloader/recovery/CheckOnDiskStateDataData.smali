.class public Lcom/facebook/soloader/recovery/CheckOnDiskStateDataData;
.super Ljava/lang/Object;
.source "CheckOnDiskStateDataData.java"

# interfaces
.implements Lcom/facebook/soloader/recovery/RecoveryStrategy;


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
    .line 18
.end method


# virtual methods
.method public recover(Ljava/lang/UnsatisfiedLinkError;[Lcom/facebook/soloader/SoSource;)Z
    .locals 11

    .line 1
    .line 2
    instance-of p1, p1, Lcom/facebook/soloader/SoLoaderULError;

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    return v0

    .line 7
    .line 8
    :cond_0
    const-string p1, "Checking /data/data missing libraries."

    .line 9
    .line 10
    const-string v1, "SoLoader"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, p1}, Lcom/facebook/soloader/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    array-length p1, p2

    .line 15
    move v2, v0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    const/4 v4, 0x1

    .line 18
    .line 19
    if-ge v2, p1, :cond_5

    .line 20
    .line 21
    aget-object v5, p2, v2

    .line 22
    .line 23
    instance-of v6, v5, Lcom/facebook/soloader/UnpackingSoSource;

    .line 24
    .line 25
    if-nez v6, :cond_1

    .line 26
    goto :goto_2

    .line 27
    .line 28
    :cond_1
    instance-of v6, v5, Lcom/facebook/soloader/BackupSoSource;

    .line 29
    .line 30
    if-eqz v6, :cond_2

    .line 31
    goto :goto_2

    .line 32
    .line 33
    :cond_2
    check-cast v5, Lcom/facebook/soloader/UnpackingSoSource;

    .line 34
    .line 35
    .line 36
    :try_start_0
    invoke-virtual {v5}, Lcom/facebook/soloader/UnpackingSoSource;->getDsosBaseApk()[Lcom/facebook/soloader/UnpackingSoSource$Dso;

    .line 37
    move-result-object v6

    .line 38
    array-length v7, v6

    .line 39
    move v8, v0

    .line 40
    .line 41
    :goto_1
    if-ge v8, v7, :cond_4

    .line 42
    .line 43
    aget-object v9, v6, v8

    .line 44
    .line 45
    iget-object v10, v9, Lcom/facebook/soloader/UnpackingSoSource$Dso;->name:Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v10}, Lcom/facebook/soloader/DirectorySoSource;->getSoFileByName(Ljava/lang/String;)Ljava/io/File;

    .line 49
    move-result-object v10

    .line 50
    .line 51
    if-nez v10, :cond_3

    .line 52
    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    const-string v6, "Missing "

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    iget-object v6, v9, Lcom/facebook/soloader/UnpackingSoSource$Dso;->name:Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v6, " from "

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Lcom/facebook/soloader/DirectorySoSource;->getName()Ljava/lang/String;

    .line 75
    move-result-object v6

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v6, ", will force prepare."

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    move-result-object v3

    .line 88
    .line 89
    .line 90
    invoke-static {v1, v3}, Lcom/facebook/soloader/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    const/4 v3, 0x2

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5, v3}, Lcom/facebook/soloader/UnpackingSoSource;->prepare(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    move v3, v4

    .line 96
    goto :goto_2

    .line 97
    :catch_0
    move-exception p1

    .line 98
    goto :goto_3

    .line 99
    .line 100
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 101
    goto :goto_1

    .line 102
    .line 103
    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 104
    goto :goto_0

    .line 105
    .line 106
    :goto_3
    const-string p2, "Encountered an exception while recovering from /data/data failure "

    .line 107
    .line 108
    .line 109
    invoke-static {v1, p2, p1}, Lcom/facebook/soloader/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 110
    return v0

    .line 111
    .line 112
    :cond_5
    if-eqz v3, :cond_6

    .line 113
    .line 114
    const-string p1, "Successfully recovered from /data/data disk failure."

    .line 115
    .line 116
    .line 117
    invoke-static {v1, p1}, Lcom/facebook/soloader/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    return v4

    .line 119
    .line 120
    :cond_6
    const-string p1, "No libraries missing from unpacking so paths while recovering /data/data failure"

    .line 121
    .line 122
    .line 123
    invoke-static {v1, p1}, Lcom/facebook/soloader/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    return v0
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
.end method
