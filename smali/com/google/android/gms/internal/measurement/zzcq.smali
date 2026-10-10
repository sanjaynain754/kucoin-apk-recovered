.class public abstract Lcom/google/android/gms/internal/measurement/zzcq;
.super Lcom/google/android/gms/internal/measurement/zzbm;
.source "com.google.android.gms:play-services-measurement-base@@22.5.0"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzcr;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService"

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzbm;-><init>(Ljava/lang/String;)V

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
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/internal/measurement/zzcr;
    .locals 2

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    .line 6
    :cond_0
    const-string v0, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService"

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/zzcr;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzcr;

    .line 17
    return-object v0

    .line 18
    .line 19
    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcp;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzcp;-><init>(Landroid/os/IBinder;)V

    .line 23
    return-object v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method


# virtual methods
.method public final zza(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v2, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"

    .line 3
    .line 4
    const-string v3, "com.google.android.gms.measurement.api.internal.IBundleReceiver"

    .line 5
    const/4 v4, 0x0

    .line 6
    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    :pswitch_0
    const/4 v1, 0x0

    .line 10
    return v1

    .line 11
    .line 12
    .line 13
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    const-string v3, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback"

    .line 20
    .line 21
    .line 22
    invoke-interface {v2, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/zzcx;

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    move-object v4, v3

    .line 29
    .line 30
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcx;

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_1
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcv;

    .line 34
    .line 35
    .line 36
    invoke-direct {v4, v2}, Lcom/google/android/gms/internal/measurement/zzcv;-><init>(Landroid/os/IBinder;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p0, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->retrieveAndUploadBatches(Lcom/google/android/gms/internal/measurement/zzcx;)V

    .line 43
    .line 44
    goto/16 :goto_15

    .line 45
    .line 46
    :pswitch_2
    sget-object v2, Lcom/google/android/gms/internal/measurement/zzdf;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 47
    .line 48
    .line 49
    invoke-static {p2, v2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzdf;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 56
    move-result-object v5

    .line 57
    .line 58
    if-nez v5, :cond_2

    .line 59
    goto :goto_1

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-interface {v5, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 63
    move-result-object v3

    .line 64
    .line 65
    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 66
    .line 67
    if-eqz v4, :cond_3

    .line 68
    move-object v4, v3

    .line 69
    .line 70
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 71
    goto :goto_1

    .line 72
    .line 73
    :cond_3
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 74
    .line 75
    .line 76
    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 80
    move-result-wide v5

    .line 81
    .line 82
    .line 83
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p0, v2, v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzcr;->onActivitySaveInstanceStateByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzcu;J)V

    .line 87
    .line 88
    goto/16 :goto_15

    .line 89
    .line 90
    :pswitch_3
    sget-object v2, Lcom/google/android/gms/internal/measurement/zzdf;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 91
    .line 92
    .line 93
    invoke-static {p2, v2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 94
    move-result-object v2

    .line 95
    .line 96
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzdf;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 100
    move-result-wide v3

    .line 101
    .line 102
    .line 103
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {p0, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->onActivityResumedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V

    .line 107
    .line 108
    goto/16 :goto_15

    .line 109
    .line 110
    :pswitch_4
    sget-object v2, Lcom/google/android/gms/internal/measurement/zzdf;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 111
    .line 112
    .line 113
    invoke-static {p2, v2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 114
    move-result-object v2

    .line 115
    .line 116
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzdf;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 120
    move-result-wide v3

    .line 121
    .line 122
    .line 123
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p0, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->onActivityPausedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V

    .line 127
    .line 128
    goto/16 :goto_15

    .line 129
    .line 130
    :pswitch_5
    sget-object v2, Lcom/google/android/gms/internal/measurement/zzdf;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 131
    .line 132
    .line 133
    invoke-static {p2, v2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 134
    move-result-object v2

    .line 135
    .line 136
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzdf;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 140
    move-result-wide v3

    .line 141
    .line 142
    .line 143
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {p0, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->onActivityDestroyedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V

    .line 147
    .line 148
    goto/16 :goto_15

    .line 149
    .line 150
    :pswitch_6
    sget-object v2, Lcom/google/android/gms/internal/measurement/zzdf;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 151
    .line 152
    .line 153
    invoke-static {p2, v2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 154
    move-result-object v2

    .line 155
    .line 156
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzdf;

    .line 157
    .line 158
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 159
    .line 160
    .line 161
    invoke-static {p2, v3}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 162
    move-result-object v3

    .line 163
    .line 164
    check-cast v3, Landroid/os/Bundle;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 168
    move-result-wide v4

    .line 169
    .line 170
    .line 171
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 172
    .line 173
    .line 174
    invoke-interface {p0, v2, v3, v4, v5}, Lcom/google/android/gms/internal/measurement/zzcr;->onActivityCreatedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;J)V

    .line 175
    .line 176
    goto/16 :goto_15

    .line 177
    .line 178
    :pswitch_7
    sget-object v2, Lcom/google/android/gms/internal/measurement/zzdf;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 179
    .line 180
    .line 181
    invoke-static {p2, v2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 182
    move-result-object v2

    .line 183
    .line 184
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzdf;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 188
    move-result-wide v3

    .line 189
    .line 190
    .line 191
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 192
    .line 193
    .line 194
    invoke-interface {p0, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->onActivityStoppedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V

    .line 195
    .line 196
    goto/16 :goto_15

    .line 197
    .line 198
    :pswitch_8
    sget-object v2, Lcom/google/android/gms/internal/measurement/zzdf;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 199
    .line 200
    .line 201
    invoke-static {p2, v2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 202
    move-result-object v2

    .line 203
    .line 204
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzdf;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 208
    move-result-wide v3

    .line 209
    .line 210
    .line 211
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 212
    .line 213
    .line 214
    invoke-interface {p0, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->onActivityStartedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V

    .line 215
    .line 216
    goto/16 :goto_15

    .line 217
    .line 218
    :pswitch_9
    sget-object v2, Lcom/google/android/gms/internal/measurement/zzdf;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 219
    .line 220
    .line 221
    invoke-static {p2, v2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 222
    move-result-object v2

    .line 223
    .line 224
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzdf;

    .line 225
    move-object v1, v2

    .line 226
    .line 227
    .line 228
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 229
    move-result-object v2

    .line 230
    .line 231
    .line 232
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 233
    move-result-object v3

    .line 234
    .line 235
    .line 236
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 237
    move-result-wide v4

    .line 238
    .line 239
    .line 240
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 241
    move-object v0, p0

    .line 242
    .line 243
    .line 244
    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzcr;->setCurrentScreenByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;Ljava/lang/String;J)V

    .line 245
    .line 246
    goto/16 :goto_15

    .line 247
    .line 248
    :pswitch_a
    sget-object v1, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 249
    .line 250
    .line 251
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 252
    move-result-object v1

    .line 253
    .line 254
    check-cast v1, Landroid/content/Intent;

    .line 255
    .line 256
    .line 257
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 258
    .line 259
    .line 260
    invoke-interface {p0, v1}, Lcom/google/android/gms/internal/measurement/zzcr;->setSgtmDebugInfo(Landroid/content/Intent;)V

    .line 261
    .line 262
    goto/16 :goto_15

    .line 263
    .line 264
    .line 265
    :pswitch_b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 266
    move-result-object v1

    .line 267
    .line 268
    if-nez v1, :cond_4

    .line 269
    goto :goto_2

    .line 270
    .line 271
    .line 272
    :cond_4
    invoke-interface {v1, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 273
    move-result-object v2

    .line 274
    .line 275
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 276
    .line 277
    if-eqz v3, :cond_5

    .line 278
    move-object v4, v2

    .line 279
    .line 280
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 281
    goto :goto_2

    .line 282
    .line 283
    :cond_5
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 284
    .line 285
    .line 286
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 287
    .line 288
    .line 289
    :goto_2
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 290
    .line 291
    .line 292
    invoke-interface {p0, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->getSessionId(Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 293
    .line 294
    goto/16 :goto_15

    .line 295
    .line 296
    :pswitch_c
    sget-object v1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 297
    .line 298
    .line 299
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 300
    move-result-object v1

    .line 301
    .line 302
    check-cast v1, Landroid/os/Bundle;

    .line 303
    .line 304
    .line 305
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 306
    move-result-wide v2

    .line 307
    .line 308
    .line 309
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 310
    .line 311
    .line 312
    invoke-interface {p0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->setConsentThirdParty(Landroid/os/Bundle;J)V

    .line 313
    .line 314
    goto/16 :goto_15

    .line 315
    .line 316
    :pswitch_d
    sget-object v1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 317
    .line 318
    .line 319
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 320
    move-result-object v1

    .line 321
    .line 322
    check-cast v1, Landroid/os/Bundle;

    .line 323
    .line 324
    .line 325
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 326
    move-result-wide v2

    .line 327
    .line 328
    .line 329
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 330
    .line 331
    .line 332
    invoke-interface {p0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->setConsent(Landroid/os/Bundle;J)V

    .line 333
    .line 334
    goto/16 :goto_15

    .line 335
    .line 336
    .line 337
    :pswitch_e
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 338
    move-result-wide v1

    .line 339
    .line 340
    .line 341
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 342
    .line 343
    .line 344
    invoke-interface {p0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzcr;->clearMeasurementEnabled(J)V

    .line 345
    .line 346
    goto/16 :goto_15

    .line 347
    .line 348
    :pswitch_f
    sget-object v1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 349
    .line 350
    .line 351
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 352
    move-result-object v1

    .line 353
    .line 354
    check-cast v1, Landroid/os/Bundle;

    .line 355
    .line 356
    .line 357
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 358
    .line 359
    .line 360
    invoke-interface {p0, v1}, Lcom/google/android/gms/internal/measurement/zzcr;->setDefaultEventParameters(Landroid/os/Bundle;)V

    .line 361
    .line 362
    goto/16 :goto_15

    .line 363
    .line 364
    .line 365
    :pswitch_10
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 366
    move-result-object v1

    .line 367
    .line 368
    if-nez v1, :cond_6

    .line 369
    goto :goto_3

    .line 370
    .line 371
    .line 372
    :cond_6
    invoke-interface {v1, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 373
    move-result-object v2

    .line 374
    .line 375
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 376
    .line 377
    if-eqz v3, :cond_7

    .line 378
    move-object v4, v2

    .line 379
    .line 380
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 381
    goto :goto_3

    .line 382
    .line 383
    :cond_7
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 384
    .line 385
    .line 386
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 387
    .line 388
    .line 389
    :goto_3
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 390
    .line 391
    .line 392
    invoke-interface {p0, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->isDataCollectionEnabled(Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 393
    .line 394
    goto/16 :goto_15

    .line 395
    .line 396
    .line 397
    :pswitch_11
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zza(Landroid/os/Parcel;)Z

    .line 398
    move-result v1

    .line 399
    .line 400
    .line 401
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 402
    .line 403
    .line 404
    invoke-interface {p0, v1}, Lcom/google/android/gms/internal/measurement/zzcr;->setDataCollectionEnabled(Z)V

    .line 405
    .line 406
    goto/16 :goto_15

    .line 407
    .line 408
    .line 409
    :pswitch_12
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 410
    move-result-object v1

    .line 411
    .line 412
    if-nez v1, :cond_8

    .line 413
    goto :goto_4

    .line 414
    .line 415
    .line 416
    :cond_8
    invoke-interface {v1, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 417
    move-result-object v2

    .line 418
    .line 419
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 420
    .line 421
    if-eqz v3, :cond_9

    .line 422
    move-object v4, v2

    .line 423
    .line 424
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 425
    goto :goto_4

    .line 426
    .line 427
    :cond_9
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 428
    .line 429
    .line 430
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 431
    .line 432
    .line 433
    :goto_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 434
    move-result v1

    .line 435
    .line 436
    .line 437
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 438
    .line 439
    .line 440
    invoke-interface {p0, v4, v1}, Lcom/google/android/gms/internal/measurement/zzcr;->getTestFlag(Lcom/google/android/gms/internal/measurement/zzcu;I)V

    .line 441
    .line 442
    goto/16 :goto_15

    .line 443
    .line 444
    .line 445
    :pswitch_13
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zze(Landroid/os/Parcel;)Ljava/util/HashMap;

    .line 446
    move-result-object v1

    .line 447
    .line 448
    .line 449
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 450
    .line 451
    .line 452
    invoke-interface {p0, v1}, Lcom/google/android/gms/internal/measurement/zzcr;->initForTests(Ljava/util/Map;)V

    .line 453
    .line 454
    goto/16 :goto_15

    .line 455
    .line 456
    .line 457
    :pswitch_14
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 458
    move-result-object v1

    .line 459
    .line 460
    if-nez v1, :cond_a

    .line 461
    goto :goto_5

    .line 462
    .line 463
    .line 464
    :cond_a
    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 465
    move-result-object v2

    .line 466
    .line 467
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/zzda;

    .line 468
    .line 469
    if-eqz v3, :cond_b

    .line 470
    move-object v4, v2

    .line 471
    .line 472
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzda;

    .line 473
    goto :goto_5

    .line 474
    .line 475
    :cond_b
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcy;

    .line 476
    .line 477
    .line 478
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/zzcy;-><init>(Landroid/os/IBinder;)V

    .line 479
    .line 480
    .line 481
    :goto_5
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 482
    .line 483
    .line 484
    invoke-interface {p0, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->unregisterOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/zzda;)V

    .line 485
    .line 486
    goto/16 :goto_15

    .line 487
    .line 488
    .line 489
    :pswitch_15
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 490
    move-result-object v1

    .line 491
    .line 492
    if-nez v1, :cond_c

    .line 493
    goto :goto_6

    .line 494
    .line 495
    .line 496
    :cond_c
    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 497
    move-result-object v2

    .line 498
    .line 499
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/zzda;

    .line 500
    .line 501
    if-eqz v3, :cond_d

    .line 502
    move-object v4, v2

    .line 503
    .line 504
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzda;

    .line 505
    goto :goto_6

    .line 506
    .line 507
    :cond_d
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcy;

    .line 508
    .line 509
    .line 510
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/zzcy;-><init>(Landroid/os/IBinder;)V

    .line 511
    .line 512
    .line 513
    :goto_6
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 514
    .line 515
    .line 516
    invoke-interface {p0, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->registerOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/zzda;)V

    .line 517
    .line 518
    goto/16 :goto_15

    .line 519
    .line 520
    .line 521
    :pswitch_16
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 522
    move-result-object v1

    .line 523
    .line 524
    if-nez v1, :cond_e

    .line 525
    goto :goto_7

    .line 526
    .line 527
    .line 528
    :cond_e
    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 529
    move-result-object v2

    .line 530
    .line 531
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/zzda;

    .line 532
    .line 533
    if-eqz v3, :cond_f

    .line 534
    move-object v4, v2

    .line 535
    .line 536
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzda;

    .line 537
    goto :goto_7

    .line 538
    .line 539
    :cond_f
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcy;

    .line 540
    .line 541
    .line 542
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/zzcy;-><init>(Landroid/os/IBinder;)V

    .line 543
    .line 544
    .line 545
    :goto_7
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 546
    .line 547
    .line 548
    invoke-interface {p0, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->setEventInterceptor(Lcom/google/android/gms/internal/measurement/zzda;)V

    .line 549
    .line 550
    goto/16 :goto_15

    .line 551
    .line 552
    .line 553
    :pswitch_17
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 554
    move-result v1

    .line 555
    .line 556
    .line 557
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 558
    move-result-object v2

    .line 559
    .line 560
    .line 561
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 562
    move-result-object v3

    .line 563
    .line 564
    .line 565
    invoke-static {v3}, Lcom/google/android/gms/dynamic/IObjectWrapper$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 566
    move-result-object v3

    .line 567
    .line 568
    .line 569
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 570
    move-result-object v4

    .line 571
    .line 572
    .line 573
    invoke-static {v4}, Lcom/google/android/gms/dynamic/IObjectWrapper$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 574
    move-result-object v4

    .line 575
    .line 576
    .line 577
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 578
    move-result-object v5

    .line 579
    .line 580
    .line 581
    invoke-static {v5}, Lcom/google/android/gms/dynamic/IObjectWrapper$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 582
    move-result-object v5

    .line 583
    .line 584
    .line 585
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 586
    move-object v0, p0

    .line 587
    .line 588
    .line 589
    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzcr;->logHealthData(ILjava/lang/String;Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/dynamic/IObjectWrapper;)V

    .line 590
    .line 591
    goto/16 :goto_15

    .line 592
    .line 593
    :pswitch_18
    sget-object v1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 594
    .line 595
    .line 596
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 597
    move-result-object v1

    .line 598
    .line 599
    check-cast v1, Landroid/os/Bundle;

    .line 600
    .line 601
    .line 602
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 603
    move-result-object v2

    .line 604
    .line 605
    if-nez v2, :cond_10

    .line 606
    goto :goto_8

    .line 607
    .line 608
    .line 609
    :cond_10
    invoke-interface {v2, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 610
    move-result-object v3

    .line 611
    .line 612
    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 613
    .line 614
    if-eqz v4, :cond_11

    .line 615
    move-object v4, v3

    .line 616
    .line 617
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 618
    goto :goto_8

    .line 619
    .line 620
    :cond_11
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 621
    .line 622
    .line 623
    invoke-direct {v4, v2}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 624
    .line 625
    .line 626
    :goto_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 627
    move-result-wide v2

    .line 628
    .line 629
    .line 630
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 631
    .line 632
    .line 633
    invoke-interface {p0, v1, v4, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->performAction(Landroid/os/Bundle;Lcom/google/android/gms/internal/measurement/zzcu;J)V

    .line 634
    .line 635
    goto/16 :goto_15

    .line 636
    .line 637
    .line 638
    :pswitch_19
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 639
    move-result-object v1

    .line 640
    .line 641
    .line 642
    invoke-static {v1}, Lcom/google/android/gms/dynamic/IObjectWrapper$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 643
    move-result-object v1

    .line 644
    .line 645
    .line 646
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 647
    move-result-object v2

    .line 648
    .line 649
    if-nez v2, :cond_12

    .line 650
    goto :goto_9

    .line 651
    .line 652
    .line 653
    :cond_12
    invoke-interface {v2, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 654
    move-result-object v3

    .line 655
    .line 656
    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 657
    .line 658
    if-eqz v4, :cond_13

    .line 659
    move-object v4, v3

    .line 660
    .line 661
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 662
    goto :goto_9

    .line 663
    .line 664
    :cond_13
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 665
    .line 666
    .line 667
    invoke-direct {v4, v2}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 668
    .line 669
    .line 670
    :goto_9
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 671
    move-result-wide v2

    .line 672
    .line 673
    .line 674
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 675
    .line 676
    .line 677
    invoke-interface {p0, v1, v4, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->onActivitySaveInstanceState(Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/internal/measurement/zzcu;J)V

    .line 678
    .line 679
    goto/16 :goto_15

    .line 680
    .line 681
    .line 682
    :pswitch_1a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 683
    move-result-object v1

    .line 684
    .line 685
    .line 686
    invoke-static {v1}, Lcom/google/android/gms/dynamic/IObjectWrapper$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 687
    move-result-object v1

    .line 688
    .line 689
    .line 690
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 691
    move-result-wide v2

    .line 692
    .line 693
    .line 694
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 695
    .line 696
    .line 697
    invoke-interface {p0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->onActivityResumed(Lcom/google/android/gms/dynamic/IObjectWrapper;J)V

    .line 698
    .line 699
    goto/16 :goto_15

    .line 700
    .line 701
    .line 702
    :pswitch_1b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 703
    move-result-object v1

    .line 704
    .line 705
    .line 706
    invoke-static {v1}, Lcom/google/android/gms/dynamic/IObjectWrapper$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 707
    move-result-object v1

    .line 708
    .line 709
    .line 710
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 711
    move-result-wide v2

    .line 712
    .line 713
    .line 714
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 715
    .line 716
    .line 717
    invoke-interface {p0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->onActivityPaused(Lcom/google/android/gms/dynamic/IObjectWrapper;J)V

    .line 718
    .line 719
    goto/16 :goto_15

    .line 720
    .line 721
    .line 722
    :pswitch_1c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 723
    move-result-object v1

    .line 724
    .line 725
    .line 726
    invoke-static {v1}, Lcom/google/android/gms/dynamic/IObjectWrapper$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 727
    move-result-object v1

    .line 728
    .line 729
    .line 730
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 731
    move-result-wide v2

    .line 732
    .line 733
    .line 734
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 735
    .line 736
    .line 737
    invoke-interface {p0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->onActivityDestroyed(Lcom/google/android/gms/dynamic/IObjectWrapper;J)V

    .line 738
    .line 739
    goto/16 :goto_15

    .line 740
    .line 741
    .line 742
    :pswitch_1d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 743
    move-result-object v1

    .line 744
    .line 745
    .line 746
    invoke-static {v1}, Lcom/google/android/gms/dynamic/IObjectWrapper$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 747
    move-result-object v1

    .line 748
    .line 749
    sget-object v2, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 750
    .line 751
    .line 752
    invoke-static {p2, v2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 753
    move-result-object v2

    .line 754
    .line 755
    check-cast v2, Landroid/os/Bundle;

    .line 756
    .line 757
    .line 758
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 759
    move-result-wide v3

    .line 760
    .line 761
    .line 762
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 763
    .line 764
    .line 765
    invoke-interface {p0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->onActivityCreated(Lcom/google/android/gms/dynamic/IObjectWrapper;Landroid/os/Bundle;J)V

    .line 766
    .line 767
    goto/16 :goto_15

    .line 768
    .line 769
    .line 770
    :pswitch_1e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 771
    move-result-object v1

    .line 772
    .line 773
    .line 774
    invoke-static {v1}, Lcom/google/android/gms/dynamic/IObjectWrapper$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 775
    move-result-object v1

    .line 776
    .line 777
    .line 778
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 779
    move-result-wide v2

    .line 780
    .line 781
    .line 782
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 783
    .line 784
    .line 785
    invoke-interface {p0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->onActivityStopped(Lcom/google/android/gms/dynamic/IObjectWrapper;J)V

    .line 786
    .line 787
    goto/16 :goto_15

    .line 788
    .line 789
    .line 790
    :pswitch_1f
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 791
    move-result-object v1

    .line 792
    .line 793
    .line 794
    invoke-static {v1}, Lcom/google/android/gms/dynamic/IObjectWrapper$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 795
    move-result-object v1

    .line 796
    .line 797
    .line 798
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 799
    move-result-wide v2

    .line 800
    .line 801
    .line 802
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 803
    .line 804
    .line 805
    invoke-interface {p0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->onActivityStarted(Lcom/google/android/gms/dynamic/IObjectWrapper;J)V

    .line 806
    .line 807
    goto/16 :goto_15

    .line 808
    .line 809
    .line 810
    :pswitch_20
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 811
    move-result-object v1

    .line 812
    .line 813
    .line 814
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 815
    move-result-wide v2

    .line 816
    .line 817
    .line 818
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 819
    .line 820
    .line 821
    invoke-interface {p0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->endAdUnitExposure(Ljava/lang/String;J)V

    .line 822
    .line 823
    goto/16 :goto_15

    .line 824
    .line 825
    .line 826
    :pswitch_21
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 827
    move-result-object v1

    .line 828
    .line 829
    .line 830
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 831
    move-result-wide v2

    .line 832
    .line 833
    .line 834
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 835
    .line 836
    .line 837
    invoke-interface {p0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->beginAdUnitExposure(Ljava/lang/String;J)V

    .line 838
    .line 839
    goto/16 :goto_15

    .line 840
    .line 841
    .line 842
    :pswitch_22
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 843
    move-result-object v1

    .line 844
    .line 845
    if-nez v1, :cond_14

    .line 846
    goto :goto_a

    .line 847
    .line 848
    .line 849
    :cond_14
    invoke-interface {v1, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 850
    move-result-object v2

    .line 851
    .line 852
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 853
    .line 854
    if-eqz v3, :cond_15

    .line 855
    move-object v4, v2

    .line 856
    .line 857
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 858
    goto :goto_a

    .line 859
    .line 860
    :cond_15
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 861
    .line 862
    .line 863
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 864
    .line 865
    .line 866
    :goto_a
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 867
    .line 868
    .line 869
    invoke-interface {p0, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->generateEventId(Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 870
    .line 871
    goto/16 :goto_15

    .line 872
    .line 873
    .line 874
    :pswitch_23
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 875
    move-result-object v1

    .line 876
    .line 877
    if-nez v1, :cond_16

    .line 878
    goto :goto_b

    .line 879
    .line 880
    .line 881
    :cond_16
    invoke-interface {v1, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 882
    move-result-object v2

    .line 883
    .line 884
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 885
    .line 886
    if-eqz v3, :cond_17

    .line 887
    move-object v4, v2

    .line 888
    .line 889
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 890
    goto :goto_b

    .line 891
    .line 892
    :cond_17
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 893
    .line 894
    .line 895
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 896
    .line 897
    .line 898
    :goto_b
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 899
    .line 900
    .line 901
    invoke-interface {p0, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->getGmpAppId(Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 902
    .line 903
    goto/16 :goto_15

    .line 904
    .line 905
    .line 906
    :pswitch_24
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 907
    move-result-object v1

    .line 908
    .line 909
    if-nez v1, :cond_18

    .line 910
    goto :goto_c

    .line 911
    .line 912
    .line 913
    :cond_18
    invoke-interface {v1, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 914
    move-result-object v2

    .line 915
    .line 916
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 917
    .line 918
    if-eqz v3, :cond_19

    .line 919
    move-object v4, v2

    .line 920
    .line 921
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 922
    goto :goto_c

    .line 923
    .line 924
    :cond_19
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 925
    .line 926
    .line 927
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 928
    .line 929
    .line 930
    :goto_c
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 931
    .line 932
    .line 933
    invoke-interface {p0, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->getAppInstanceId(Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 934
    .line 935
    goto/16 :goto_15

    .line 936
    .line 937
    .line 938
    :pswitch_25
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 939
    move-result-object v1

    .line 940
    .line 941
    if-nez v1, :cond_1a

    .line 942
    goto :goto_d

    .line 943
    .line 944
    .line 945
    :cond_1a
    invoke-interface {v1, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 946
    move-result-object v2

    .line 947
    .line 948
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 949
    .line 950
    if-eqz v3, :cond_1b

    .line 951
    move-object v4, v2

    .line 952
    .line 953
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 954
    goto :goto_d

    .line 955
    .line 956
    :cond_1b
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 957
    .line 958
    .line 959
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 960
    .line 961
    .line 962
    :goto_d
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 963
    .line 964
    .line 965
    invoke-interface {p0, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->getCachedAppInstanceId(Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 966
    .line 967
    goto/16 :goto_15

    .line 968
    .line 969
    .line 970
    :pswitch_26
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 971
    move-result-object v1

    .line 972
    .line 973
    if-nez v1, :cond_1c

    .line 974
    goto :goto_e

    .line 975
    .line 976
    :cond_1c
    const-string v2, "com.google.android.gms.measurement.api.internal.IStringProvider"

    .line 977
    .line 978
    .line 979
    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 980
    move-result-object v2

    .line 981
    .line 982
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/zzdc;

    .line 983
    .line 984
    if-eqz v3, :cond_1d

    .line 985
    move-object v4, v2

    .line 986
    .line 987
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzdc;

    .line 988
    goto :goto_e

    .line 989
    .line 990
    :cond_1d
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzdb;

    .line 991
    .line 992
    .line 993
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/zzdb;-><init>(Landroid/os/IBinder;)V

    .line 994
    .line 995
    .line 996
    :goto_e
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 997
    .line 998
    .line 999
    invoke-interface {p0, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->setInstanceIdProvider(Lcom/google/android/gms/internal/measurement/zzdc;)V

    .line 1000
    .line 1001
    goto/16 :goto_15

    .line 1002
    .line 1003
    .line 1004
    :pswitch_27
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1005
    move-result-object v1

    .line 1006
    .line 1007
    if-nez v1, :cond_1e

    .line 1008
    goto :goto_f

    .line 1009
    .line 1010
    .line 1011
    :cond_1e
    invoke-interface {v1, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 1012
    move-result-object v2

    .line 1013
    .line 1014
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 1015
    .line 1016
    if-eqz v3, :cond_1f

    .line 1017
    move-object v4, v2

    .line 1018
    .line 1019
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 1020
    goto :goto_f

    .line 1021
    .line 1022
    :cond_1f
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 1023
    .line 1024
    .line 1025
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 1026
    .line 1027
    .line 1028
    :goto_f
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1029
    .line 1030
    .line 1031
    invoke-interface {p0, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->getCurrentScreenClass(Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 1032
    .line 1033
    goto/16 :goto_15

    .line 1034
    .line 1035
    .line 1036
    :pswitch_28
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1037
    move-result-object v1

    .line 1038
    .line 1039
    if-nez v1, :cond_20

    .line 1040
    goto :goto_10

    .line 1041
    .line 1042
    .line 1043
    :cond_20
    invoke-interface {v1, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 1044
    move-result-object v2

    .line 1045
    .line 1046
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 1047
    .line 1048
    if-eqz v3, :cond_21

    .line 1049
    move-object v4, v2

    .line 1050
    .line 1051
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 1052
    goto :goto_10

    .line 1053
    .line 1054
    :cond_21
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 1055
    .line 1056
    .line 1057
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 1058
    .line 1059
    .line 1060
    :goto_10
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1061
    .line 1062
    .line 1063
    invoke-interface {p0, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->getCurrentScreenName(Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 1064
    .line 1065
    goto/16 :goto_15

    .line 1066
    .line 1067
    .line 1068
    :pswitch_29
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1069
    move-result-object v1

    .line 1070
    .line 1071
    .line 1072
    invoke-static {v1}, Lcom/google/android/gms/dynamic/IObjectWrapper$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 1073
    move-result-object v1

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1077
    move-result-object v2

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1081
    move-result-object v3

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1085
    move-result-wide v4

    .line 1086
    .line 1087
    .line 1088
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1089
    move-object v0, p0

    .line 1090
    .line 1091
    .line 1092
    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzcr;->setCurrentScreen(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;Ljava/lang/String;J)V

    .line 1093
    .line 1094
    goto/16 :goto_15

    .line 1095
    .line 1096
    .line 1097
    :pswitch_2a
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1098
    move-result-wide v1

    .line 1099
    .line 1100
    .line 1101
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1102
    .line 1103
    .line 1104
    invoke-interface {p0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzcr;->setSessionTimeoutDuration(J)V

    .line 1105
    .line 1106
    goto/16 :goto_15

    .line 1107
    .line 1108
    .line 1109
    :pswitch_2b
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1110
    move-result-wide v1

    .line 1111
    .line 1112
    .line 1113
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1114
    .line 1115
    .line 1116
    invoke-interface {p0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzcr;->setMinimumSessionDuration(J)V

    .line 1117
    .line 1118
    goto/16 :goto_15

    .line 1119
    .line 1120
    .line 1121
    :pswitch_2c
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1122
    move-result-wide v1

    .line 1123
    .line 1124
    .line 1125
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1126
    .line 1127
    .line 1128
    invoke-interface {p0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzcr;->resetAnalyticsData(J)V

    .line 1129
    .line 1130
    goto/16 :goto_15

    .line 1131
    .line 1132
    .line 1133
    :pswitch_2d
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zza(Landroid/os/Parcel;)Z

    .line 1134
    move-result v1

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1138
    move-result-wide v2

    .line 1139
    .line 1140
    .line 1141
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1142
    .line 1143
    .line 1144
    invoke-interface {p0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->setMeasurementEnabled(ZJ)V

    .line 1145
    .line 1146
    goto/16 :goto_15

    .line 1147
    .line 1148
    .line 1149
    :pswitch_2e
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1150
    move-result-object v1

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1154
    move-result-object v2

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1158
    move-result-object v5

    .line 1159
    .line 1160
    if-nez v5, :cond_22

    .line 1161
    goto :goto_11

    .line 1162
    .line 1163
    .line 1164
    :cond_22
    invoke-interface {v5, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 1165
    move-result-object v3

    .line 1166
    .line 1167
    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 1168
    .line 1169
    if-eqz v4, :cond_23

    .line 1170
    move-object v4, v3

    .line 1171
    .line 1172
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 1173
    goto :goto_11

    .line 1174
    .line 1175
    :cond_23
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 1176
    .line 1177
    .line 1178
    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 1179
    .line 1180
    .line 1181
    :goto_11
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1182
    .line 1183
    .line 1184
    invoke-interface {p0, v1, v2, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 1185
    .line 1186
    goto/16 :goto_15

    .line 1187
    .line 1188
    .line 1189
    :pswitch_2f
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1190
    move-result-object v1

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1194
    move-result-object v2

    .line 1195
    .line 1196
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1197
    .line 1198
    .line 1199
    invoke-static {p2, v3}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1200
    move-result-object v3

    .line 1201
    .line 1202
    check-cast v3, Landroid/os/Bundle;

    .line 1203
    .line 1204
    .line 1205
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1206
    .line 1207
    .line 1208
    invoke-interface {p0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1209
    .line 1210
    goto/16 :goto_15

    .line 1211
    .line 1212
    :pswitch_30
    sget-object v1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1213
    .line 1214
    .line 1215
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1216
    move-result-object v1

    .line 1217
    .line 1218
    check-cast v1, Landroid/os/Bundle;

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1222
    move-result-wide v2

    .line 1223
    .line 1224
    .line 1225
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1226
    .line 1227
    .line 1228
    invoke-interface {p0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->setConditionalUserProperty(Landroid/os/Bundle;J)V

    .line 1229
    .line 1230
    goto/16 :goto_15

    .line 1231
    .line 1232
    .line 1233
    :pswitch_31
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1234
    move-result-object v1

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1238
    move-result-wide v2

    .line 1239
    .line 1240
    .line 1241
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1242
    .line 1243
    .line 1244
    invoke-interface {p0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcr;->setUserId(Ljava/lang/String;J)V

    .line 1245
    .line 1246
    goto/16 :goto_15

    .line 1247
    .line 1248
    .line 1249
    :pswitch_32
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1250
    move-result-object v1

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1254
    move-result-object v2

    .line 1255
    .line 1256
    if-nez v2, :cond_24

    .line 1257
    goto :goto_12

    .line 1258
    .line 1259
    .line 1260
    :cond_24
    invoke-interface {v2, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 1261
    move-result-object v3

    .line 1262
    .line 1263
    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 1264
    .line 1265
    if-eqz v4, :cond_25

    .line 1266
    move-object v4, v3

    .line 1267
    .line 1268
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 1269
    goto :goto_12

    .line 1270
    .line 1271
    :cond_25
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 1272
    .line 1273
    .line 1274
    invoke-direct {v4, v2}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 1275
    .line 1276
    .line 1277
    :goto_12
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1278
    .line 1279
    .line 1280
    invoke-interface {p0, v1, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->getMaxUserProperties(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 1281
    .line 1282
    goto/16 :goto_15

    .line 1283
    .line 1284
    .line 1285
    :pswitch_33
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1286
    move-result-object v1

    .line 1287
    .line 1288
    .line 1289
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1290
    move-result-object v2

    .line 1291
    .line 1292
    .line 1293
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zza(Landroid/os/Parcel;)Z

    .line 1294
    move-result v5

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1298
    move-result-object v7

    .line 1299
    .line 1300
    if-nez v7, :cond_26

    .line 1301
    goto :goto_13

    .line 1302
    .line 1303
    .line 1304
    :cond_26
    invoke-interface {v7, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 1305
    move-result-object v3

    .line 1306
    .line 1307
    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 1308
    .line 1309
    if-eqz v4, :cond_27

    .line 1310
    move-object v4, v3

    .line 1311
    .line 1312
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 1313
    goto :goto_13

    .line 1314
    .line 1315
    :cond_27
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 1316
    .line 1317
    .line 1318
    invoke-direct {v4, v7}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 1319
    .line 1320
    .line 1321
    :goto_13
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1322
    .line 1323
    .line 1324
    invoke-interface {p0, v1, v2, v5, v4}, Lcom/google/android/gms/internal/measurement/zzcr;->getUserProperties(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/measurement/zzcu;)V

    .line 1325
    .line 1326
    goto/16 :goto_15

    .line 1327
    .line 1328
    .line 1329
    :pswitch_34
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1330
    move-result-object v1

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1334
    move-result-object v2

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1338
    move-result-object v3

    .line 1339
    .line 1340
    .line 1341
    invoke-static {v3}, Lcom/google/android/gms/dynamic/IObjectWrapper$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 1342
    move-result-object v3

    .line 1343
    .line 1344
    .line 1345
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zza(Landroid/os/Parcel;)Z

    .line 1346
    move-result v4

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1350
    move-result-wide v5

    .line 1351
    .line 1352
    .line 1353
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1354
    move-object v0, p0

    .line 1355
    .line 1356
    .line 1357
    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/zzcr;->setUserProperty(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/dynamic/IObjectWrapper;ZJ)V

    .line 1358
    .line 1359
    goto/16 :goto_15

    .line 1360
    .line 1361
    .line 1362
    :pswitch_35
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1363
    move-result-object v1

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1367
    move-result-object v2

    .line 1368
    .line 1369
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1370
    .line 1371
    .line 1372
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1373
    move-result-object v0

    .line 1374
    .line 1375
    check-cast v0, Landroid/os/Bundle;

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1379
    move-result-object v5

    .line 1380
    .line 1381
    if-nez v5, :cond_28

    .line 1382
    goto :goto_14

    .line 1383
    .line 1384
    .line 1385
    :cond_28
    invoke-interface {v5, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 1386
    move-result-object v3

    .line 1387
    .line 1388
    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 1389
    .line 1390
    if-eqz v4, :cond_29

    .line 1391
    move-object v4, v3

    .line 1392
    .line 1393
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 1394
    goto :goto_14

    .line 1395
    .line 1396
    :cond_29
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzcs;

    .line 1397
    .line 1398
    .line 1399
    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>(Landroid/os/IBinder;)V

    .line 1400
    .line 1401
    .line 1402
    :goto_14
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1403
    move-result-wide v5

    .line 1404
    .line 1405
    .line 1406
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1407
    move-object v3, v0

    .line 1408
    move-object v0, p0

    .line 1409
    .line 1410
    .line 1411
    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/zzcr;->logEventAndBundle(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/google/android/gms/internal/measurement/zzcu;J)V

    .line 1412
    goto :goto_15

    .line 1413
    .line 1414
    .line 1415
    :pswitch_36
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1416
    move-result-object v1

    .line 1417
    .line 1418
    .line 1419
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1420
    move-result-object v2

    .line 1421
    .line 1422
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1423
    .line 1424
    .line 1425
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1426
    move-result-object v0

    .line 1427
    move-object v3, v0

    .line 1428
    .line 1429
    check-cast v3, Landroid/os/Bundle;

    .line 1430
    .line 1431
    .line 1432
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zza(Landroid/os/Parcel;)Z

    .line 1433
    move-result v4

    .line 1434
    .line 1435
    .line 1436
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zza(Landroid/os/Parcel;)Z

    .line 1437
    move-result v5

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1441
    move-result-wide v6

    .line 1442
    .line 1443
    .line 1444
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1445
    move-object v0, p0

    .line 1446
    .line 1447
    .line 1448
    invoke-interface/range {v0 .. v7}, Lcom/google/android/gms/internal/measurement/zzcr;->logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    .line 1449
    goto :goto_15

    .line 1450
    .line 1451
    .line 1452
    :pswitch_37
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1453
    move-result-object v2

    .line 1454
    .line 1455
    .line 1456
    invoke-static {v2}, Lcom/google/android/gms/dynamic/IObjectWrapper$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 1457
    move-result-object v2

    .line 1458
    .line 1459
    sget-object v3, Lcom/google/android/gms/internal/measurement/zzdd;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1460
    .line 1461
    .line 1462
    invoke-static {p2, v3}, Lcom/google/android/gms/internal/measurement/zzbn;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1463
    move-result-object v3

    .line 1464
    .line 1465
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzdd;

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 1469
    move-result-wide v4

    .line 1470
    .line 1471
    .line 1472
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzbn;->zzf(Landroid/os/Parcel;)V

    .line 1473
    .line 1474
    .line 1475
    invoke-interface {p0, v2, v3, v4, v5}, Lcom/google/android/gms/internal/measurement/zzcr;->initialize(Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/internal/measurement/zzdd;J)V

    .line 1476
    .line 1477
    .line 1478
    :goto_15
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1479
    const/4 v0, 0x1

    .line 1480
    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
