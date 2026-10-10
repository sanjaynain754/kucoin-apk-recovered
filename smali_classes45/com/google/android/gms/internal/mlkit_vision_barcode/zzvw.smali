.class public final enum Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;
.super Ljava/lang/Enum;
.source "com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzo:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field public static final enum zzp:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

.field private static final synthetic zzq:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;


# instance fields
.field private final zzr:I


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    .line 2
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 3
    .line 4
    const-string v0, "UNRECOGNIZED"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v1, v0, v2, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 11
    .line 12
    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 13
    .line 14
    const-string v0, "CODE_128"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v0, v3, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 21
    .line 22
    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 23
    .line 24
    const-string v0, "CODE_39"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, v0, v4, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 31
    .line 32
    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 33
    .line 34
    const-string v0, "CODE_93"

    .line 35
    const/4 v5, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v4, v0, v5, v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    sput-object v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 41
    .line 42
    new-instance v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 43
    .line 44
    const-string v0, "CODABAR"

    .line 45
    const/4 v6, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v5, v0, v6, v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    sput-object v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 51
    .line 52
    new-instance v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 53
    .line 54
    const-string v0, "DATA_MATRIX"

    .line 55
    const/4 v7, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v6, v0, v7, v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    sput-object v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 61
    .line 62
    new-instance v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 63
    .line 64
    const-string v0, "EAN_13"

    .line 65
    const/4 v8, 0x6

    .line 66
    .line 67
    .line 68
    invoke-direct {v7, v0, v8, v8}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 69
    .line 70
    sput-object v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 71
    .line 72
    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 73
    .line 74
    const-string v0, "EAN_8"

    .line 75
    const/4 v9, 0x7

    .line 76
    .line 77
    .line 78
    invoke-direct {v8, v0, v9, v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 79
    .line 80
    sput-object v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 81
    .line 82
    new-instance v9, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 83
    .line 84
    const-string v0, "ITF"

    .line 85
    .line 86
    const/16 v10, 0x8

    .line 87
    .line 88
    .line 89
    invoke-direct {v9, v0, v10, v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 90
    .line 91
    sput-object v9, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 92
    .line 93
    new-instance v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 94
    .line 95
    const-string v0, "QR_CODE"

    .line 96
    .line 97
    const/16 v11, 0x9

    .line 98
    .line 99
    .line 100
    invoke-direct {v10, v0, v11, v11}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 101
    .line 102
    sput-object v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 103
    .line 104
    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 105
    .line 106
    const-string v0, "UPC_A"

    .line 107
    .line 108
    const/16 v12, 0xa

    .line 109
    .line 110
    .line 111
    invoke-direct {v11, v0, v12, v12}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 112
    .line 113
    sput-object v11, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 114
    .line 115
    new-instance v12, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 116
    .line 117
    const-string v0, "UPC_E"

    .line 118
    .line 119
    const/16 v13, 0xb

    .line 120
    .line 121
    .line 122
    invoke-direct {v12, v0, v13, v13}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 123
    .line 124
    sput-object v12, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 125
    .line 126
    new-instance v13, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 127
    .line 128
    const-string v0, "PDF417"

    .line 129
    .line 130
    const/16 v14, 0xc

    .line 131
    .line 132
    .line 133
    invoke-direct {v13, v0, v14, v14}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 134
    .line 135
    sput-object v13, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 136
    .line 137
    new-instance v14, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 138
    .line 139
    const-string v0, "AZTEC"

    .line 140
    .line 141
    const/16 v15, 0xd

    .line 142
    .line 143
    .line 144
    invoke-direct {v14, v0, v15, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 145
    .line 146
    sput-object v14, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 147
    .line 148
    new-instance v15, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 149
    .line 150
    const-string v0, "DATABAR"

    .line 151
    .line 152
    move-object/from16 v16, v1

    .line 153
    .line 154
    const/16 v1, 0xe

    .line 155
    .line 156
    .line 157
    invoke-direct {v15, v0, v1, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 158
    .line 159
    sput-object v15, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzo:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 160
    .line 161
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 162
    .line 163
    const/16 v1, 0xf

    .line 164
    .line 165
    move-object/from16 v17, v2

    .line 166
    .line 167
    const/16 v2, 0x10

    .line 168
    .line 169
    move-object/from16 v18, v3

    .line 170
    .line 171
    const-string v3, "TEZ_CODE"

    .line 172
    .line 173
    .line 174
    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;-><init>(Ljava/lang/String;II)V

    .line 175
    .line 176
    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzp:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 177
    .line 178
    move-object/from16 v1, v16

    .line 179
    .line 180
    move-object/from16 v2, v17

    .line 181
    .line 182
    move-object/from16 v3, v18

    .line 183
    .line 184
    move-object/from16 v16, v0

    .line 185
    .line 186
    .line 187
    filled-new-array/range {v1 .. v16}, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 188
    move-result-object v0

    .line 189
    .line 190
    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzq:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 191
    return-void
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
    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzr:I

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

.method public static values()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzq:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;

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
.method public final zza()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvw;->zzr:I

    .line 3
    return v0
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
.end method
