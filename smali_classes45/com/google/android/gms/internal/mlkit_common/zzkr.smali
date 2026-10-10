.class public final Lcom/google/android/gms/internal/mlkit_common/zzkr;
.super Ljava/lang/Object;
.source "com.google.mlkit:common@@18.11.0"

# interfaces
.implements Lcom/google/firebase/encoders/config/Configurator;


# static fields
.field public static final zza:Lcom/google/firebase/encoders/config/Configurator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzkr;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_common/zzkr;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzkr;->zza:Lcom/google/firebase/encoders/config/Configurator;

    .line 8
    return-void
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

.method private constructor <init>()V
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
.method public final configure(Lcom/google/firebase/encoders/config/EncoderConfig;)V
    .locals 2

    .line 1
    .line 2
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzmy;

    .line 3
    .line 4
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgp;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgp;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 8
    .line 9
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqv;

    .line 10
    .line 11
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzkh;->zza:Lcom/google/android/gms/internal/mlkit_common/zzkh;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 15
    .line 16
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznc;

    .line 17
    .line 18
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgq;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgq;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 22
    .line 23
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznl;

    .line 24
    .line 25
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgs;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgs;

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 29
    .line 30
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznh;

    .line 31
    .line 32
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgr;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgr;

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 36
    .line 37
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznj;

    .line 38
    .line 39
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgt;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgt;

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 43
    .line 44
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzll;

    .line 45
    .line 46
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfj;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfj;

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 50
    .line 51
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlk;

    .line 52
    .line 53
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfi;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfi;

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 57
    .line 58
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzmf;

    .line 59
    .line 60
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzge;->zza:Lcom/google/android/gms/internal/mlkit_common/zzge;

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 64
    .line 65
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqh;

    .line 66
    .line 67
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjr;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjr;

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 71
    .line 72
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlj;

    .line 73
    .line 74
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfh;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfh;

    .line 75
    .line 76
    .line 77
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 78
    .line 79
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzli;

    .line 80
    .line 81
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfg;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfg;

    .line 82
    .line 83
    .line 84
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 85
    .line 86
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzor;

    .line 87
    .line 88
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzib;->zza:Lcom/google/android/gms/internal/mlkit_common/zzib;

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 92
    .line 93
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzrp;

    .line 94
    .line 95
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfx;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfx;

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 99
    .line 100
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzmb;

    .line 101
    .line 102
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzga;->zza:Lcom/google/android/gms/internal/mlkit_common/zzga;

    .line 103
    .line 104
    .line 105
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 106
    .line 107
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlz;

    .line 108
    .line 109
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfw;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfw;

    .line 110
    .line 111
    .line 112
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 113
    .line 114
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzos;

    .line 115
    .line 116
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzic;->zza:Lcom/google/android/gms/internal/mlkit_common/zzic;

    .line 117
    .line 118
    .line 119
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 120
    .line 121
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqe;

    .line 122
    .line 123
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjo;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjo;

    .line 124
    .line 125
    .line 126
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 127
    .line 128
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqf;

    .line 129
    .line 130
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjp;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjp;

    .line 131
    .line 132
    .line 133
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 134
    .line 135
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqd;

    .line 136
    .line 137
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjn;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjn;

    .line 138
    .line 139
    .line 140
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 141
    .line 142
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznp;

    .line 143
    .line 144
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgz;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgz;

    .line 145
    .line 146
    .line 147
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 148
    .line 149
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzro;

    .line 150
    .line 151
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzeq;->zza:Lcom/google/android/gms/internal/mlkit_common/zzeq;

    .line 152
    .line 153
    .line 154
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 155
    .line 156
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznq;

    .line 157
    .line 158
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzha;->zza:Lcom/google/android/gms/internal/mlkit_common/zzha;

    .line 159
    .line 160
    .line 161
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 162
    .line 163
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpa;

    .line 164
    .line 165
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzik;->zza:Lcom/google/android/gms/internal/mlkit_common/zzik;

    .line 166
    .line 167
    .line 168
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 169
    .line 170
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpd;

    .line 171
    .line 172
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzin;->zza:Lcom/google/android/gms/internal/mlkit_common/zzin;

    .line 173
    .line 174
    .line 175
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 176
    .line 177
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpc;

    .line 178
    .line 179
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzim;->zza:Lcom/google/android/gms/internal/mlkit_common/zzim;

    .line 180
    .line 181
    .line 182
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 183
    .line 184
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpb;

    .line 185
    .line 186
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzil;->zza:Lcom/google/android/gms/internal/mlkit_common/zzil;

    .line 187
    .line 188
    .line 189
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 190
    .line 191
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpm;

    .line 192
    .line 193
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zziw;->zza:Lcom/google/android/gms/internal/mlkit_common/zziw;

    .line 194
    .line 195
    .line 196
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 197
    .line 198
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpn;

    .line 199
    .line 200
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzix;->zza:Lcom/google/android/gms/internal/mlkit_common/zzix;

    .line 201
    .line 202
    .line 203
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 204
    .line 205
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpp;

    .line 206
    .line 207
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zziz;->zza:Lcom/google/android/gms/internal/mlkit_common/zziz;

    .line 208
    .line 209
    .line 210
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 211
    .line 212
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpo;

    .line 213
    .line 214
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zziy;->zza:Lcom/google/android/gms/internal/mlkit_common/zziy;

    .line 215
    .line 216
    .line 217
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 218
    .line 219
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzno;

    .line 220
    .line 221
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgy;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgy;

    .line 222
    .line 223
    .line 224
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 225
    .line 226
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpq;

    .line 227
    .line 228
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzja;->zza:Lcom/google/android/gms/internal/mlkit_common/zzja;

    .line 229
    .line 230
    .line 231
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 232
    .line 233
    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzjb;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjb;

    .line 234
    .line 235
    const-class v1, Lcom/google/android/gms/internal/mlkit_common/zzpr;

    .line 236
    .line 237
    .line 238
    invoke-interface {p1, v1, v0}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 239
    .line 240
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzps;

    .line 241
    .line 242
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjc;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjc;

    .line 243
    .line 244
    .line 245
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 246
    .line 247
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpt;

    .line 248
    .line 249
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjd;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjd;

    .line 250
    .line 251
    .line 252
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 253
    .line 254
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpx;

    .line 255
    .line 256
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjg;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjg;

    .line 257
    .line 258
    .line 259
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 260
    .line 261
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpw;

    .line 262
    .line 263
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjh;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjh;

    .line 264
    .line 265
    .line 266
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 267
    .line 268
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpl;

    .line 269
    .line 270
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzis;->zza:Lcom/google/android/gms/internal/mlkit_common/zzis;

    .line 271
    .line 272
    .line 273
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 274
    .line 275
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzml;

    .line 276
    .line 277
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgj;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgj;

    .line 278
    .line 279
    .line 280
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 281
    .line 282
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpj;

    .line 283
    .line 284
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zziu;->zza:Lcom/google/android/gms/internal/mlkit_common/zziu;

    .line 285
    .line 286
    .line 287
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 288
    .line 289
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpi;

    .line 290
    .line 291
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzit;->zza:Lcom/google/android/gms/internal/mlkit_common/zzit;

    .line 292
    .line 293
    .line 294
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 295
    .line 296
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpk;

    .line 297
    .line 298
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zziv;->zza:Lcom/google/android/gms/internal/mlkit_common/zziv;

    .line 299
    .line 300
    .line 301
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 302
    .line 303
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqg;

    .line 304
    .line 305
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjq;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjq;

    .line 306
    .line 307
    .line 308
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 309
    .line 310
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzrb;

    .line 311
    .line 312
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzkn;->zza:Lcom/google/android/gms/internal/mlkit_common/zzkn;

    .line 313
    .line 314
    .line 315
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 316
    .line 317
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzkx;

    .line 318
    .line 319
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzev;->zza:Lcom/google/android/gms/internal/mlkit_common/zzev;

    .line 320
    .line 321
    .line 322
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 323
    .line 324
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzkv;

    .line 325
    .line 326
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzet;->zza:Lcom/google/android/gms/internal/mlkit_common/zzet;

    .line 327
    .line 328
    .line 329
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 330
    .line 331
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzku;

    .line 332
    .line 333
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzes;->zza:Lcom/google/android/gms/internal/mlkit_common/zzes;

    .line 334
    .line 335
    .line 336
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 337
    .line 338
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzkw;

    .line 339
    .line 340
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzeu;->zza:Lcom/google/android/gms/internal/mlkit_common/zzeu;

    .line 341
    .line 342
    .line 343
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 344
    .line 345
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzkz;

    .line 346
    .line 347
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzex;->zza:Lcom/google/android/gms/internal/mlkit_common/zzex;

    .line 348
    .line 349
    .line 350
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 351
    .line 352
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzky;

    .line 353
    .line 354
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzew;->zza:Lcom/google/android/gms/internal/mlkit_common/zzew;

    .line 355
    .line 356
    .line 357
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 358
    .line 359
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzla;

    .line 360
    .line 361
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzey;->zza:Lcom/google/android/gms/internal/mlkit_common/zzey;

    .line 362
    .line 363
    .line 364
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 365
    .line 366
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlb;

    .line 367
    .line 368
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzez;->zza:Lcom/google/android/gms/internal/mlkit_common/zzez;

    .line 369
    .line 370
    .line 371
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 372
    .line 373
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlc;

    .line 374
    .line 375
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfa;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfa;

    .line 376
    .line 377
    .line 378
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 379
    .line 380
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzld;

    .line 381
    .line 382
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfb;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfb;

    .line 383
    .line 384
    .line 385
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 386
    .line 387
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzle;

    .line 388
    .line 389
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfc;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfc;

    .line 390
    .line 391
    .line 392
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 393
    .line 394
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcw;

    .line 395
    .line 396
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzem;->zza:Lcom/google/android/gms/internal/mlkit_common/zzem;

    .line 397
    .line 398
    .line 399
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 400
    .line 401
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcy;

    .line 402
    .line 403
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzeo;->zza:Lcom/google/android/gms/internal/mlkit_common/zzeo;

    .line 404
    .line 405
    .line 406
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 407
    .line 408
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcx;

    .line 409
    .line 410
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzen;->zza:Lcom/google/android/gms/internal/mlkit_common/zzen;

    .line 411
    .line 412
    .line 413
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 414
    .line 415
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzmj;

    .line 416
    .line 417
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgh;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgh;

    .line 418
    .line 419
    .line 420
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 421
    .line 422
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlo;

    .line 423
    .line 424
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfk;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfk;

    .line 425
    .line 426
    .line 427
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 428
    .line 429
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbl;

    .line 430
    .line 431
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzda;->zza:Lcom/google/android/gms/internal/mlkit_common/zzda;

    .line 432
    .line 433
    .line 434
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 435
    .line 436
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbk;

    .line 437
    .line 438
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdb;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdb;

    .line 439
    .line 440
    .line 441
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 442
    .line 443
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlx;

    .line 444
    .line 445
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfu;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfu;

    .line 446
    .line 447
    .line 448
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 449
    .line 450
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbn;

    .line 451
    .line 452
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdc;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdc;

    .line 453
    .line 454
    .line 455
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 456
    .line 457
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbm;

    .line 458
    .line 459
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdd;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdd;

    .line 460
    .line 461
    .line 462
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 463
    .line 464
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbz;

    .line 465
    .line 466
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdo;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdo;

    .line 467
    .line 468
    .line 469
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 470
    .line 471
    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzdp;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdp;

    .line 472
    .line 473
    const-class v1, Lcom/google/android/gms/internal/mlkit_common/zzby;

    .line 474
    .line 475
    .line 476
    invoke-interface {p1, v1, v0}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 477
    .line 478
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbp;

    .line 479
    .line 480
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzde;->zza:Lcom/google/android/gms/internal/mlkit_common/zzde;

    .line 481
    .line 482
    .line 483
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 484
    .line 485
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbo;

    .line 486
    .line 487
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdf;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdf;

    .line 488
    .line 489
    .line 490
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 491
    .line 492
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcf;

    .line 493
    .line 494
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdu;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdu;

    .line 495
    .line 496
    .line 497
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 498
    .line 499
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzce;

    .line 500
    .line 501
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdv;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdv;

    .line 502
    .line 503
    .line 504
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 505
    .line 506
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcj;

    .line 507
    .line 508
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdy;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdy;

    .line 509
    .line 510
    .line 511
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 512
    .line 513
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzci;

    .line 514
    .line 515
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdz;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdz;

    .line 516
    .line 517
    .line 518
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 519
    .line 520
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcv;

    .line 521
    .line 522
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzek;->zza:Lcom/google/android/gms/internal/mlkit_common/zzek;

    .line 523
    .line 524
    .line 525
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 526
    .line 527
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcu;

    .line 528
    .line 529
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzel;->zza:Lcom/google/android/gms/internal/mlkit_common/zzel;

    .line 530
    .line 531
    .line 532
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 533
    .line 534
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcl;

    .line 535
    .line 536
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzea;->zza:Lcom/google/android/gms/internal/mlkit_common/zzea;

    .line 537
    .line 538
    .line 539
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 540
    .line 541
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzck;

    .line 542
    .line 543
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzeb;->zza:Lcom/google/android/gms/internal/mlkit_common/zzeb;

    .line 544
    .line 545
    .line 546
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 547
    .line 548
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcn;

    .line 549
    .line 550
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzec;->zza:Lcom/google/android/gms/internal/mlkit_common/zzec;

    .line 551
    .line 552
    .line 553
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 554
    .line 555
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcm;

    .line 556
    .line 557
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzed;->zza:Lcom/google/android/gms/internal/mlkit_common/zzed;

    .line 558
    .line 559
    .line 560
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 561
    .line 562
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzrj;

    .line 563
    .line 564
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzju;->zza:Lcom/google/android/gms/internal/mlkit_common/zzju;

    .line 565
    .line 566
    .line 567
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 568
    .line 569
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzrc;

    .line 570
    .line 571
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfl;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfl;

    .line 572
    .line 573
    .line 574
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 575
    .line 576
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzrg;

    .line 577
    .line 578
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgx;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgx;

    .line 579
    .line 580
    .line 581
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 582
    .line 583
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzrf;

    .line 584
    .line 585
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgw;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgw;

    .line 586
    .line 587
    .line 588
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 589
    .line 590
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzrd;

    .line 591
    .line 592
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfy;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfy;

    .line 593
    .line 594
    .line 595
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 596
    .line 597
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzri;

    .line 598
    .line 599
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjt;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjt;

    .line 600
    .line 601
    .line 602
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 603
    .line 604
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzrh;

    .line 605
    .line 606
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjs;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjs;

    .line 607
    .line 608
    .line 609
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 610
    .line 611
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzrk;

    .line 612
    .line 613
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjv;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjv;

    .line 614
    .line 615
    .line 616
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 617
    .line 618
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzre;

    .line 619
    .line 620
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgf;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgf;

    .line 621
    .line 622
    .line 623
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 624
    .line 625
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzrn;

    .line 626
    .line 627
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzkp;->zza:Lcom/google/android/gms/internal/mlkit_common/zzkp;

    .line 628
    .line 629
    .line 630
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 631
    .line 632
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzrm;

    .line 633
    .line 634
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzkq;->zza:Lcom/google/android/gms/internal/mlkit_common/zzkq;

    .line 635
    .line 636
    .line 637
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 638
    .line 639
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzrl;

    .line 640
    .line 641
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzko;->zza:Lcom/google/android/gms/internal/mlkit_common/zzko;

    .line 642
    .line 643
    .line 644
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 645
    .line 646
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqj;

    .line 647
    .line 648
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjx;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjx;

    .line 649
    .line 650
    .line 651
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 652
    .line 653
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzmg;

    .line 654
    .line 655
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgg;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgg;

    .line 656
    .line 657
    .line 658
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 659
    .line 660
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzmp;

    .line 661
    .line 662
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgk;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgk;

    .line 663
    .line 664
    .line 665
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 666
    .line 667
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzkt;

    .line 668
    .line 669
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzer;->zza:Lcom/google/android/gms/internal/mlkit_common/zzer;

    .line 670
    .line 671
    .line 672
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 673
    .line 674
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzmc;

    .line 675
    .line 676
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgb;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgb;

    .line 677
    .line 678
    .line 679
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 680
    .line 681
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzmk;

    .line 682
    .line 683
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgi;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgi;

    .line 684
    .line 685
    .line 686
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 687
    .line 688
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzly;

    .line 689
    .line 690
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfv;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfv;

    .line 691
    .line 692
    .line 693
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 694
    .line 695
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlq;

    .line 696
    .line 697
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfn;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfn;

    .line 698
    .line 699
    .line 700
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 701
    .line 702
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlr;

    .line 703
    .line 704
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfo;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfo;

    .line 705
    .line 706
    .line 707
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 708
    .line 709
    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzfm;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfm;

    .line 710
    .line 711
    const-class v1, Lcom/google/android/gms/internal/mlkit_common/zzlp;

    .line 712
    .line 713
    .line 714
    invoke-interface {p1, v1, v0}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 715
    .line 716
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzls;

    .line 717
    .line 718
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfp;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfp;

    .line 719
    .line 720
    .line 721
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 722
    .line 723
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznn;

    .line 724
    .line 725
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgv;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgv;

    .line 726
    .line 727
    .line 728
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 729
    .line 730
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznm;

    .line 731
    .line 732
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgu;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgu;

    .line 733
    .line 734
    .line 735
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 736
    .line 737
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbj;

    .line 738
    .line 739
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzcz;->zza:Lcom/google/android/gms/internal/mlkit_common/zzcz;

    .line 740
    .line 741
    .line 742
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 743
    .line 744
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqy;

    .line 745
    .line 746
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzkk;->zza:Lcom/google/android/gms/internal/mlkit_common/zzkk;

    .line 747
    .line 748
    .line 749
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 750
    .line 751
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzra;

    .line 752
    .line 753
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzkm;->zza:Lcom/google/android/gms/internal/mlkit_common/zzkm;

    .line 754
    .line 755
    .line 756
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 757
    .line 758
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqz;

    .line 759
    .line 760
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzkl;->zza:Lcom/google/android/gms/internal/mlkit_common/zzkl;

    .line 761
    .line 762
    .line 763
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 764
    .line 765
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzks;

    .line 766
    .line 767
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzep;->zza:Lcom/google/android/gms/internal/mlkit_common/zzep;

    .line 768
    .line 769
    .line 770
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 771
    .line 772
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlh;

    .line 773
    .line 774
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzff;->zza:Lcom/google/android/gms/internal/mlkit_common/zzff;

    .line 775
    .line 776
    .line 777
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 778
    .line 779
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlg;

    .line 780
    .line 781
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfe;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfe;

    .line 782
    .line 783
    .line 784
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 785
    .line 786
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlf;

    .line 787
    .line 788
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfd;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfd;

    .line 789
    .line 790
    .line 791
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 792
    .line 793
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzoo;

    .line 794
    .line 795
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhy;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhy;

    .line 796
    .line 797
    .line 798
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 799
    .line 800
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzoq;

    .line 801
    .line 802
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzia;->zza:Lcom/google/android/gms/internal/mlkit_common/zzia;

    .line 803
    .line 804
    .line 805
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 806
    .line 807
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzop;

    .line 808
    .line 809
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhz;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhz;

    .line 810
    .line 811
    .line 812
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 813
    .line 814
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbx;

    .line 815
    .line 816
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdm;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdm;

    .line 817
    .line 818
    .line 819
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 820
    .line 821
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbw;

    .line 822
    .line 823
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdn;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdn;

    .line 824
    .line 825
    .line 826
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 827
    .line 828
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzot;

    .line 829
    .line 830
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzid;->zza:Lcom/google/android/gms/internal/mlkit_common/zzid;

    .line 831
    .line 832
    .line 833
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 834
    .line 835
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzow;

    .line 836
    .line 837
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzig;->zza:Lcom/google/android/gms/internal/mlkit_common/zzig;

    .line 838
    .line 839
    .line 840
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 841
    .line 842
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzou;

    .line 843
    .line 844
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzie;->zza:Lcom/google/android/gms/internal/mlkit_common/zzie;

    .line 845
    .line 846
    .line 847
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 848
    .line 849
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzov;

    .line 850
    .line 851
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzif;->zza:Lcom/google/android/gms/internal/mlkit_common/zzif;

    .line 852
    .line 853
    .line 854
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 855
    .line 856
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcb;

    .line 857
    .line 858
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdq;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdq;

    .line 859
    .line 860
    .line 861
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 862
    .line 863
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzca;

    .line 864
    .line 865
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdr;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdr;

    .line 866
    .line 867
    .line 868
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 869
    .line 870
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqo;

    .line 871
    .line 872
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzkc;->zza:Lcom/google/android/gms/internal/mlkit_common/zzkc;

    .line 873
    .line 874
    .line 875
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 876
    .line 877
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqn;

    .line 878
    .line 879
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzkb;->zza:Lcom/google/android/gms/internal/mlkit_common/zzkb;

    .line 880
    .line 881
    .line 882
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 883
    .line 884
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqw;

    .line 885
    .line 886
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzki;->zza:Lcom/google/android/gms/internal/mlkit_common/zzki;

    .line 887
    .line 888
    .line 889
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 890
    .line 891
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqx;

    .line 892
    .line 893
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzkj;->zza:Lcom/google/android/gms/internal/mlkit_common/zzkj;

    .line 894
    .line 895
    .line 896
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 897
    .line 898
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpe;

    .line 899
    .line 900
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzio;->zza:Lcom/google/android/gms/internal/mlkit_common/zzio;

    .line 901
    .line 902
    .line 903
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 904
    .line 905
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzph;

    .line 906
    .line 907
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzir;->zza:Lcom/google/android/gms/internal/mlkit_common/zzir;

    .line 908
    .line 909
    .line 910
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 911
    .line 912
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpf;

    .line 913
    .line 914
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzip;->zza:Lcom/google/android/gms/internal/mlkit_common/zzip;

    .line 915
    .line 916
    .line 917
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 918
    .line 919
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpg;

    .line 920
    .line 921
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zziq;->zza:Lcom/google/android/gms/internal/mlkit_common/zziq;

    .line 922
    .line 923
    .line 924
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 925
    .line 926
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzme;

    .line 927
    .line 928
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgd;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgd;

    .line 929
    .line 930
    .line 931
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 932
    .line 933
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzch;

    .line 934
    .line 935
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdw;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdw;

    .line 936
    .line 937
    .line 938
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 939
    .line 940
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcg;

    .line 941
    .line 942
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdx;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdx;

    .line 943
    .line 944
    .line 945
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 946
    .line 947
    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzgc;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgc;

    .line 948
    .line 949
    const-class v1, Lcom/google/android/gms/internal/mlkit_common/zzmd;

    .line 950
    .line 951
    .line 952
    invoke-interface {p1, v1, v0}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 953
    .line 954
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzma;

    .line 955
    .line 956
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfz;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfz;

    .line 957
    .line 958
    .line 959
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 960
    .line 961
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzox;

    .line 962
    .line 963
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzih;->zza:Lcom/google/android/gms/internal/mlkit_common/zzih;

    .line 964
    .line 965
    .line 966
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 967
    .line 968
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzoz;

    .line 969
    .line 970
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzij;->zza:Lcom/google/android/gms/internal/mlkit_common/zzij;

    .line 971
    .line 972
    .line 973
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 974
    .line 975
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzoy;

    .line 976
    .line 977
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzii;->zza:Lcom/google/android/gms/internal/mlkit_common/zzii;

    .line 978
    .line 979
    .line 980
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 981
    .line 982
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcd;

    .line 983
    .line 984
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzds;->zza:Lcom/google/android/gms/internal/mlkit_common/zzds;

    .line 985
    .line 986
    .line 987
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 988
    .line 989
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcc;

    .line 990
    .line 991
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdt;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdt;

    .line 992
    .line 993
    .line 994
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 995
    .line 996
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzoe;

    .line 997
    .line 998
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzho;->zza:Lcom/google/android/gms/internal/mlkit_common/zzho;

    .line 999
    .line 1000
    .line 1001
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1002
    .line 1003
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzof;

    .line 1004
    .line 1005
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhp;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhp;

    .line 1006
    .line 1007
    .line 1008
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1009
    .line 1010
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzog;

    .line 1011
    .line 1012
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhq;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhq;

    .line 1013
    .line 1014
    .line 1015
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1016
    .line 1017
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbt;

    .line 1018
    .line 1019
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdi;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdi;

    .line 1020
    .line 1021
    .line 1022
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1023
    .line 1024
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbs;

    .line 1025
    .line 1026
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdj;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdj;

    .line 1027
    .line 1028
    .line 1029
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1030
    .line 1031
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzob;

    .line 1032
    .line 1033
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhl;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhl;

    .line 1034
    .line 1035
    .line 1036
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1037
    .line 1038
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzoc;

    .line 1039
    .line 1040
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhm;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhm;

    .line 1041
    .line 1042
    .line 1043
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1044
    .line 1045
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzod;

    .line 1046
    .line 1047
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhn;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhn;

    .line 1048
    .line 1049
    .line 1050
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1051
    .line 1052
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbr;

    .line 1053
    .line 1054
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdg;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdg;

    .line 1055
    .line 1056
    .line 1057
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1058
    .line 1059
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbq;

    .line 1060
    .line 1061
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdh;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdh;

    .line 1062
    .line 1063
    .line 1064
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1065
    .line 1066
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzoh;

    .line 1067
    .line 1068
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhr;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhr;

    .line 1069
    .line 1070
    .line 1071
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1072
    .line 1073
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzoi;

    .line 1074
    .line 1075
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhs;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhs;

    .line 1076
    .line 1077
    .line 1078
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1079
    .line 1080
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzoj;

    .line 1081
    .line 1082
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzht;->zza:Lcom/google/android/gms/internal/mlkit_common/zzht;

    .line 1083
    .line 1084
    .line 1085
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1086
    .line 1087
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzok;

    .line 1088
    .line 1089
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhu;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhu;

    .line 1090
    .line 1091
    .line 1092
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1093
    .line 1094
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbv;

    .line 1095
    .line 1096
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdk;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdk;

    .line 1097
    .line 1098
    .line 1099
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1100
    .line 1101
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzbu;

    .line 1102
    .line 1103
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzdl;->zza:Lcom/google/android/gms/internal/mlkit_common/zzdl;

    .line 1104
    .line 1105
    .line 1106
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1107
    .line 1108
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzql;

    .line 1109
    .line 1110
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjy;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjy;

    .line 1111
    .line 1112
    .line 1113
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1114
    .line 1115
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqk;

    .line 1116
    .line 1117
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjz;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjz;

    .line 1118
    .line 1119
    .line 1120
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1121
    .line 1122
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzmq;

    .line 1123
    .line 1124
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgl;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgl;

    .line 1125
    .line 1126
    .line 1127
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1128
    .line 1129
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzms;

    .line 1130
    .line 1131
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgn;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgn;

    .line 1132
    .line 1133
    .line 1134
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1135
    .line 1136
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzmr;

    .line 1137
    .line 1138
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgm;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgm;

    .line 1139
    .line 1140
    .line 1141
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1142
    .line 1143
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzmt;

    .line 1144
    .line 1145
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzgo;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgo;

    .line 1146
    .line 1147
    .line 1148
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1149
    .line 1150
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpy;

    .line 1151
    .line 1152
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzji;->zza:Lcom/google/android/gms/internal/mlkit_common/zzji;

    .line 1153
    .line 1154
    .line 1155
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1156
    .line 1157
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpz;

    .line 1158
    .line 1159
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjj;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjj;

    .line 1160
    .line 1161
    .line 1162
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1163
    .line 1164
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcr;

    .line 1165
    .line 1166
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzeg;->zza:Lcom/google/android/gms/internal/mlkit_common/zzeg;

    .line 1167
    .line 1168
    .line 1169
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1170
    .line 1171
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcq;

    .line 1172
    .line 1173
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzeh;->zza:Lcom/google/android/gms/internal/mlkit_common/zzeh;

    .line 1174
    .line 1175
    .line 1176
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1177
    .line 1178
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqp;

    .line 1179
    .line 1180
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzkd;->zza:Lcom/google/android/gms/internal/mlkit_common/zzkd;

    .line 1181
    .line 1182
    .line 1183
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1184
    .line 1185
    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzje;->zza:Lcom/google/android/gms/internal/mlkit_common/zzje;

    .line 1186
    .line 1187
    const-class v1, Lcom/google/android/gms/internal/mlkit_common/zzpu;

    .line 1188
    .line 1189
    .line 1190
    invoke-interface {p1, v1, v0}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1191
    .line 1192
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzpv;

    .line 1193
    .line 1194
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjf;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjf;

    .line 1195
    .line 1196
    .line 1197
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1198
    .line 1199
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcp;

    .line 1200
    .line 1201
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzee;->zza:Lcom/google/android/gms/internal/mlkit_common/zzee;

    .line 1202
    .line 1203
    .line 1204
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1205
    .line 1206
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzco;

    .line 1207
    .line 1208
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzef;->zza:Lcom/google/android/gms/internal/mlkit_common/zzef;

    .line 1209
    .line 1210
    .line 1211
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1212
    .line 1213
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqm;

    .line 1214
    .line 1215
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzka;->zza:Lcom/google/android/gms/internal/mlkit_common/zzka;

    .line 1216
    .line 1217
    .line 1218
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1219
    .line 1220
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzoa;

    .line 1221
    .line 1222
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhc;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhc;

    .line 1223
    .line 1224
    .line 1225
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1226
    .line 1227
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznz;

    .line 1228
    .line 1229
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhk;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhk;

    .line 1230
    .line 1231
    .line 1232
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1233
    .line 1234
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznw;

    .line 1235
    .line 1236
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhh;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhh;

    .line 1237
    .line 1238
    .line 1239
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1240
    .line 1241
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznv;

    .line 1242
    .line 1243
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhg;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhg;

    .line 1244
    .line 1245
    .line 1246
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1247
    .line 1248
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznx;

    .line 1249
    .line 1250
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhi;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhi;

    .line 1251
    .line 1252
    .line 1253
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1254
    .line 1255
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzny;

    .line 1256
    .line 1257
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhj;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhj;

    .line 1258
    .line 1259
    .line 1260
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1261
    .line 1262
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznu;

    .line 1263
    .line 1264
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhf;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhf;

    .line 1265
    .line 1266
    .line 1267
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1268
    .line 1269
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznr;

    .line 1270
    .line 1271
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhb;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhb;

    .line 1272
    .line 1273
    .line 1274
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1275
    .line 1276
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zznt;

    .line 1277
    .line 1278
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhe;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhe;

    .line 1279
    .line 1280
    .line 1281
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1282
    .line 1283
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzns;

    .line 1284
    .line 1285
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhd;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhd;

    .line 1286
    .line 1287
    .line 1288
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1289
    .line 1290
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzom;

    .line 1291
    .line 1292
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhw;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhw;

    .line 1293
    .line 1294
    .line 1295
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1296
    .line 1297
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlv;

    .line 1298
    .line 1299
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfs;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfs;

    .line 1300
    .line 1301
    .line 1302
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1303
    .line 1304
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzol;

    .line 1305
    .line 1306
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhv;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhv;

    .line 1307
    .line 1308
    .line 1309
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1310
    .line 1311
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzon;

    .line 1312
    .line 1313
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzhx;->zza:Lcom/google/android/gms/internal/mlkit_common/zzhx;

    .line 1314
    .line 1315
    .line 1316
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1317
    .line 1318
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlu;

    .line 1319
    .line 1320
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfr;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfr;

    .line 1321
    .line 1322
    .line 1323
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1324
    .line 1325
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlw;

    .line 1326
    .line 1327
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzft;->zza:Lcom/google/android/gms/internal/mlkit_common/zzft;

    .line 1328
    .line 1329
    .line 1330
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1331
    .line 1332
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqi;

    .line 1333
    .line 1334
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjw;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjw;

    .line 1335
    .line 1336
    .line 1337
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1338
    .line 1339
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqa;

    .line 1340
    .line 1341
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjk;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjk;

    .line 1342
    .line 1343
    .line 1344
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1345
    .line 1346
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqs;

    .line 1347
    .line 1348
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzkg;->zza:Lcom/google/android/gms/internal/mlkit_common/zzkg;

    .line 1349
    .line 1350
    .line 1351
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1352
    .line 1353
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqc;

    .line 1354
    .line 1355
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjm;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjm;

    .line 1356
    .line 1357
    .line 1358
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1359
    .line 1360
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqb;

    .line 1361
    .line 1362
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzjl;->zza:Lcom/google/android/gms/internal/mlkit_common/zzjl;

    .line 1363
    .line 1364
    .line 1365
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1366
    .line 1367
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqq;

    .line 1368
    .line 1369
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzke;->zza:Lcom/google/android/gms/internal/mlkit_common/zzke;

    .line 1370
    .line 1371
    .line 1372
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1373
    .line 1374
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzct;

    .line 1375
    .line 1376
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzei;->zza:Lcom/google/android/gms/internal/mlkit_common/zzei;

    .line 1377
    .line 1378
    .line 1379
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1380
    .line 1381
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzcs;

    .line 1382
    .line 1383
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzej;->zza:Lcom/google/android/gms/internal/mlkit_common/zzej;

    .line 1384
    .line 1385
    .line 1386
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1387
    .line 1388
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqr;

    .line 1389
    .line 1390
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzkf;->zza:Lcom/google/android/gms/internal/mlkit_common/zzkf;

    .line 1391
    .line 1392
    .line 1393
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1394
    .line 1395
    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzlt;

    .line 1396
    .line 1397
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzfq;->zza:Lcom/google/android/gms/internal/mlkit_common/zzfq;

    .line 1398
    .line 1399
    .line 1400
    invoke-interface {p1, v0, v1}, Lcom/google/firebase/encoders/config/EncoderConfig;->registerEncoder(Ljava/lang/Class;Lcom/google/firebase/encoders/ObjectEncoder;)Lcom/google/firebase/encoders/config/EncoderConfig;

    .line 1401
    return-void
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
.end method
