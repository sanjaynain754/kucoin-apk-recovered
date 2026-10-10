.class final Lcom/google/android/gms/internal/fido/zzgd;
.super Lcom/google/android/gms/internal/fido/zzge;
.source "com.google.android.gms:play-services-fido@@21.0.0"


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/fido/zzgb;Ljava/lang/Character;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/fido/zzge;-><init>(Lcom/google/android/gms/internal/fido/zzgb;Ljava/lang/Character;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/fido/zzgb;->zzd(Lcom/google/android/gms/internal/fido/zzgb;)[C

    move-result-object p1

    array-length p1, p1

    const/16 p2, 0x40

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/fido/zzbm;->zzc(Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V
    .locals 1

    .line 3
    new-instance v0, Lcom/google/android/gms/internal/fido/zzgb;

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/fido/zzgb;-><init>(Ljava/lang/String;[C)V

    invoke-direct {p0, v0, p3}, Lcom/google/android/gms/internal/fido/zzgd;-><init>(Lcom/google/android/gms/internal/fido/zzgb;Ljava/lang/Character;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/fido/zzgb;Ljava/lang/Character;)Lcom/google/android/gms/internal/fido/zzgf;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/fido/zzgd;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/fido/zzgd;-><init>(Lcom/google/android/gms/internal/fido/zzgb;Ljava/lang/Character;)V

    .line 6
    return-object v0
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
.end method

.method public final zzb(Ljava/lang/Appendable;[BII)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    array-length p3, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p4, p3}, Lcom/google/android/gms/internal/fido/zzbm;->zze(III)V

    .line 6
    move p3, p4

    .line 7
    :goto_0
    const/4 v1, 0x3

    .line 8
    .line 9
    if-lt p3, v1, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v0, 0x1

    .line 12
    .line 13
    aget-byte v2, p2, v0

    .line 14
    .line 15
    and-int/lit16 v2, v2, 0xff

    .line 16
    .line 17
    aget-byte v1, p2, v1

    .line 18
    .line 19
    and-int/lit16 v1, v1, 0xff

    .line 20
    .line 21
    add-int/lit8 v3, v0, 0x2

    .line 22
    .line 23
    aget-byte v3, p2, v3

    .line 24
    .line 25
    and-int/lit16 v3, v3, 0xff

    .line 26
    .line 27
    iget-object v4, p0, Lcom/google/android/gms/internal/fido/zzge;->zzb:Lcom/google/android/gms/internal/fido/zzgb;

    .line 28
    .line 29
    shl-int/lit8 v2, v2, 0x10

    .line 30
    .line 31
    shl-int/lit8 v1, v1, 0x8

    .line 32
    or-int/2addr v1, v2

    .line 33
    or-int/2addr v1, v3

    .line 34
    .line 35
    ushr-int/lit8 v2, v1, 0x12

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/fido/zzgb;->zza(I)C

    .line 39
    move-result v2

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 43
    .line 44
    iget-object v2, p0, Lcom/google/android/gms/internal/fido/zzge;->zzb:Lcom/google/android/gms/internal/fido/zzgb;

    .line 45
    .line 46
    ushr-int/lit8 v3, v1, 0xc

    .line 47
    .line 48
    and-int/lit8 v3, v3, 0x3f

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/fido/zzgb;->zza(I)C

    .line 52
    move-result v2

    .line 53
    .line 54
    .line 55
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 56
    .line 57
    iget-object v2, p0, Lcom/google/android/gms/internal/fido/zzge;->zzb:Lcom/google/android/gms/internal/fido/zzgb;

    .line 58
    .line 59
    ushr-int/lit8 v3, v1, 0x6

    .line 60
    .line 61
    and-int/lit8 v3, v3, 0x3f

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/fido/zzgb;->zza(I)C

    .line 65
    move-result v2

    .line 66
    .line 67
    .line 68
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 69
    .line 70
    iget-object v2, p0, Lcom/google/android/gms/internal/fido/zzge;->zzb:Lcom/google/android/gms/internal/fido/zzgb;

    .line 71
    .line 72
    and-int/lit8 v1, v1, 0x3f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/fido/zzgb;->zza(I)C

    .line 76
    move-result v1

    .line 77
    .line 78
    .line 79
    invoke-interface {p1, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 80
    .line 81
    add-int/lit8 v0, v0, 0x3

    .line 82
    .line 83
    add-int/lit8 p3, p3, -0x3

    .line 84
    goto :goto_0

    .line 85
    .line 86
    :cond_0
    if-ge v0, p4, :cond_1

    .line 87
    sub-int/2addr p4, v0

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1, p2, v0, p4}, Lcom/google/android/gms/internal/fido/zzge;->zze(Ljava/lang/Appendable;[BII)V

    .line 91
    :cond_1
    return-void
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
    .line 212
    .line 213
    .line 214
.end method
