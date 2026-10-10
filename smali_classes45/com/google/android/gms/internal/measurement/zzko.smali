.class public final enum Lcom/google/android/gms/internal/measurement/zzko;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-measurement-impl@@22.5.0"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzmi;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/measurement/zzko;

.field public static final enum zzb:Lcom/google/android/gms/internal/measurement/zzko;

.field public static final enum zzc:Lcom/google/android/gms/internal/measurement/zzko;

.field public static final enum zzd:Lcom/google/android/gms/internal/measurement/zzko;

.field public static final enum zze:Lcom/google/android/gms/internal/measurement/zzko;

.field public static final enum zzf:Lcom/google/android/gms/internal/measurement/zzko;

.field public static final enum zzg:Lcom/google/android/gms/internal/measurement/zzko;

.field public static final enum zzh:Lcom/google/android/gms/internal/measurement/zzko;

.field public static final enum zzi:Lcom/google/android/gms/internal/measurement/zzko;

.field public static final enum zzj:Lcom/google/android/gms/internal/measurement/zzko;

.field public static final enum zzk:Lcom/google/android/gms/internal/measurement/zzko;

.field public static final enum zzl:Lcom/google/android/gms/internal/measurement/zzko;

.field public static final enum zzm:Lcom/google/android/gms/internal/measurement/zzko;

.field private static final synthetic zzo:[Lcom/google/android/gms/internal/measurement/zzko;


# instance fields
.field private final zzn:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzko;

    .line 3
    .line 4
    const-string v1, "IAB_TCF_PURPOSE_UNKNOWN"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/measurement/zzko;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzko;->zza:Lcom/google/android/gms/internal/measurement/zzko;

    .line 11
    .line 12
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzko;

    .line 13
    .line 14
    const-string v2, "IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/measurement/zzko;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v1, Lcom/google/android/gms/internal/measurement/zzko;->zzb:Lcom/google/android/gms/internal/measurement/zzko;

    .line 21
    .line 22
    new-instance v2, Lcom/google/android/gms/internal/measurement/zzko;

    .line 23
    .line 24
    const-string v3, "IAB_TCF_PURPOSE_SELECT_BASIC_ADS"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/measurement/zzko;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v2, Lcom/google/android/gms/internal/measurement/zzko;->zzc:Lcom/google/android/gms/internal/measurement/zzko;

    .line 31
    .line 32
    new-instance v3, Lcom/google/android/gms/internal/measurement/zzko;

    .line 33
    .line 34
    const-string v4, "IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE"

    .line 35
    const/4 v5, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v4, v5, v5}, Lcom/google/android/gms/internal/measurement/zzko;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    sput-object v3, Lcom/google/android/gms/internal/measurement/zzko;->zzd:Lcom/google/android/gms/internal/measurement/zzko;

    .line 41
    .line 42
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzko;

    .line 43
    .line 44
    const-string v5, "IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS"

    .line 45
    const/4 v6, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v4, v5, v6, v6}, Lcom/google/android/gms/internal/measurement/zzko;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    sput-object v4, Lcom/google/android/gms/internal/measurement/zzko;->zze:Lcom/google/android/gms/internal/measurement/zzko;

    .line 51
    .line 52
    new-instance v5, Lcom/google/android/gms/internal/measurement/zzko;

    .line 53
    .line 54
    const-string v6, "IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_CONTENT_PROFILE"

    .line 55
    const/4 v7, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v5, v6, v7, v7}, Lcom/google/android/gms/internal/measurement/zzko;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    sput-object v5, Lcom/google/android/gms/internal/measurement/zzko;->zzf:Lcom/google/android/gms/internal/measurement/zzko;

    .line 61
    .line 62
    new-instance v6, Lcom/google/android/gms/internal/measurement/zzko;

    .line 63
    .line 64
    const-string v7, "IAB_TCF_PURPOSE_SELECT_PERSONALISED_CONTENT"

    .line 65
    const/4 v8, 0x6

    .line 66
    .line 67
    .line 68
    invoke-direct {v6, v7, v8, v8}, Lcom/google/android/gms/internal/measurement/zzko;-><init>(Ljava/lang/String;II)V

    .line 69
    .line 70
    sput-object v6, Lcom/google/android/gms/internal/measurement/zzko;->zzg:Lcom/google/android/gms/internal/measurement/zzko;

    .line 71
    .line 72
    new-instance v7, Lcom/google/android/gms/internal/measurement/zzko;

    .line 73
    .line 74
    const-string v8, "IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE"

    .line 75
    const/4 v9, 0x7

    .line 76
    .line 77
    .line 78
    invoke-direct {v7, v8, v9, v9}, Lcom/google/android/gms/internal/measurement/zzko;-><init>(Ljava/lang/String;II)V

    .line 79
    .line 80
    sput-object v7, Lcom/google/android/gms/internal/measurement/zzko;->zzh:Lcom/google/android/gms/internal/measurement/zzko;

    .line 81
    .line 82
    new-instance v8, Lcom/google/android/gms/internal/measurement/zzko;

    .line 83
    .line 84
    const-string v9, "IAB_TCF_PURPOSE_MEASURE_CONTENT_PERFORMANCE"

    .line 85
    .line 86
    const/16 v10, 0x8

    .line 87
    .line 88
    .line 89
    invoke-direct {v8, v9, v10, v10}, Lcom/google/android/gms/internal/measurement/zzko;-><init>(Ljava/lang/String;II)V

    .line 90
    .line 91
    sput-object v8, Lcom/google/android/gms/internal/measurement/zzko;->zzi:Lcom/google/android/gms/internal/measurement/zzko;

    .line 92
    .line 93
    new-instance v9, Lcom/google/android/gms/internal/measurement/zzko;

    .line 94
    .line 95
    const-string v10, "IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS"

    .line 96
    .line 97
    const/16 v11, 0x9

    .line 98
    .line 99
    .line 100
    invoke-direct {v9, v10, v11, v11}, Lcom/google/android/gms/internal/measurement/zzko;-><init>(Ljava/lang/String;II)V

    .line 101
    .line 102
    sput-object v9, Lcom/google/android/gms/internal/measurement/zzko;->zzj:Lcom/google/android/gms/internal/measurement/zzko;

    .line 103
    .line 104
    new-instance v10, Lcom/google/android/gms/internal/measurement/zzko;

    .line 105
    .line 106
    const-string v11, "IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS"

    .line 107
    .line 108
    const/16 v12, 0xa

    .line 109
    .line 110
    .line 111
    invoke-direct {v10, v11, v12, v12}, Lcom/google/android/gms/internal/measurement/zzko;-><init>(Ljava/lang/String;II)V

    .line 112
    .line 113
    sput-object v10, Lcom/google/android/gms/internal/measurement/zzko;->zzk:Lcom/google/android/gms/internal/measurement/zzko;

    .line 114
    .line 115
    new-instance v11, Lcom/google/android/gms/internal/measurement/zzko;

    .line 116
    .line 117
    const-string v12, "IAB_TCF_PURPOSE_USE_LIMITED_DATA_TO_SELECT_CONTENT"

    .line 118
    .line 119
    const/16 v13, 0xb

    .line 120
    .line 121
    .line 122
    invoke-direct {v11, v12, v13, v13}, Lcom/google/android/gms/internal/measurement/zzko;-><init>(Ljava/lang/String;II)V

    .line 123
    .line 124
    sput-object v11, Lcom/google/android/gms/internal/measurement/zzko;->zzl:Lcom/google/android/gms/internal/measurement/zzko;

    .line 125
    .line 126
    new-instance v12, Lcom/google/android/gms/internal/measurement/zzko;

    .line 127
    .line 128
    const/16 v13, 0xc

    .line 129
    const/4 v14, -0x1

    .line 130
    .line 131
    const-string v15, "UNRECOGNIZED"

    .line 132
    .line 133
    .line 134
    invoke-direct {v12, v15, v13, v14}, Lcom/google/android/gms/internal/measurement/zzko;-><init>(Ljava/lang/String;II)V

    .line 135
    .line 136
    sput-object v12, Lcom/google/android/gms/internal/measurement/zzko;->zzm:Lcom/google/android/gms/internal/measurement/zzko;

    .line 137
    .line 138
    .line 139
    filled-new-array/range {v0 .. v12}, [Lcom/google/android/gms/internal/measurement/zzko;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzko;->zzo:[Lcom/google/android/gms/internal/measurement/zzko;

    .line 143
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Lcom/google/android/gms/internal/measurement/zzko;->zzn:I

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
.end method

.method public static values()[Lcom/google/android/gms/internal/measurement/zzko;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzko;->zzo:[Lcom/google/android/gms/internal/measurement/zzko;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/zzko;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/google/android/gms/internal/measurement/zzko;

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
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzko;->zzn:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final zza()I
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzko;->zzm:Lcom/google/android/gms/internal/measurement/zzko;

    .line 3
    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzko;->zzn:I

    .line 7
    return v0

    .line 8
    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v1, "Can\'t get the number of an unknown enum value."

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    throw v0
    .line 16
    .line 17
    .line 18
.end method
