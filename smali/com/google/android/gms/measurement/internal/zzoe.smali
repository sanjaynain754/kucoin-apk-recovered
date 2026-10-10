.class public final Lcom/google/android/gms/measurement/internal/zzoe;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@22.5.0"


# static fields
.field static final zza:Lcom/google/common/collect/ImmutableList;

.field public static final synthetic zzb:I


# direct methods
.method static constructor <clinit>()V
    .locals 25

    .line 1
    .line 2
    const-string v10, "AuthorizePurpose7"

    .line 3
    .line 4
    const-string v11, "PurposeDiagnostics"

    .line 5
    .line 6
    const-string v0, "Purpose7"

    .line 7
    .line 8
    const-string v1, "CmpSdkID"

    .line 9
    .line 10
    const-string v2, "PublisherCC"

    .line 11
    .line 12
    const-string v3, "PublisherRestrictions1"

    .line 13
    .line 14
    const-string v4, "PublisherRestrictions3"

    .line 15
    .line 16
    const-string v5, "PublisherRestrictions4"

    .line 17
    .line 18
    const-string v6, "PublisherRestrictions7"

    .line 19
    .line 20
    const-string v7, "AuthorizePurpose1"

    .line 21
    .line 22
    const-string v8, "AuthorizePurpose3"

    .line 23
    .line 24
    const-string v9, "AuthorizePurpose4"

    .line 25
    .line 26
    .line 27
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 28
    move-result-object v24

    .line 29
    .line 30
    const-string v22, "Purpose3"

    .line 31
    .line 32
    const-string v23, "Purpose4"

    .line 33
    .line 34
    const-string v12, "Version"

    .line 35
    .line 36
    const-string v13, "GoogleConsent"

    .line 37
    .line 38
    const-string v14, "VendorConsent"

    .line 39
    .line 40
    const-string v15, "VendorLegitimateInterest"

    .line 41
    .line 42
    const-string v16, "gdprApplies"

    .line 43
    .line 44
    const-string v17, "EnableAdvertiserConsentMode"

    .line 45
    .line 46
    const-string v18, "PolicyVersion"

    .line 47
    .line 48
    const-string v19, "PurposeConsents"

    .line 49
    .line 50
    const-string v20, "PurposeOneTreatment"

    .line 51
    .line 52
    const-string v21, "Purpose1"

    .line 53
    .line 54
    .line 55
    invoke-static/range {v12 .. v24}, Lcom/google/common/collect/ImmutableList;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    sput-object v0, Lcom/google/android/gms/measurement/internal/zzoe;->zza:Lcom/google/common/collect/ImmutableList;

    .line 59
    return-void
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
.end method

.method public static zza(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    return-object v0
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
.end method

.method public static zzb(Landroid/content/SharedPreferences;Ljava/lang/String;)I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 5
    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    return p0

    .line 7
    :catch_0
    return v0
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
.end method

.method public static final zzc(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Z
    .locals 19
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    invoke-static/range {p0 .. p15}, Lcom/google/android/gms/measurement/internal/zzoe;->zze(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)I

    move-result v0

    const/16 v1, 0x32

    const/4 v2, 0x1

    if-lez v0, :cond_2

    move/from16 v3, p7

    if-ne v3, v2, :cond_1

    move/from16 v4, p6

    if-eq v4, v2, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, v0

    move v7, v2

    move v8, v7

    move-object/from16 v2, p1

    goto :goto_2

    :cond_1
    move/from16 v4, p6

    .line 1
    :goto_0
    aput-char v1, p4, v0

    :goto_1
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, v0

    move v8, v3

    move v7, v4

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    goto :goto_2

    :cond_2
    move/from16 v4, p6

    move/from16 v3, p7

    goto :goto_1

    .line 2
    :goto_2
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzi(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/google/android/gms/internal/measurement/zzkp;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/internal/measurement/zzkp;->zza:Lcom/google/android/gms/internal/measurement/zzkp;

    if-ne v0, v3, :cond_3

    const/16 v0, 0x33

    goto/16 :goto_6

    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzko;->zzb:Lcom/google/android/gms/internal/measurement/zzko;

    move/from16 v10, p9

    if-ne v1, v0, :cond_6

    const/4 v0, 0x1

    move-object/from16 v4, p3

    move-object/from16 v11, p10

    if-ne v10, v0, :cond_7

    .line 3
    invoke-virtual {v4, v11}, Lcom/google/common/collect/ImmutableCollection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    if-lez v17, :cond_4

    aget-char v1, p4, v17

    const/16 v2, 0x32

    if-eq v1, v2, :cond_4

    const/16 v1, 0x31

    aput-char v1, p4, v17

    :cond_4
    return v0

    :cond_5
    const/4 v10, 0x1

    goto :goto_3

    :cond_6
    move-object/from16 v4, p3

    move-object/from16 v11, p10

    .line 4
    :cond_7
    :goto_3
    invoke-virtual {v2, v1}, Lcom/google/common/collect/ImmutableMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/16 v3, 0x30

    if-nez v0, :cond_8

    :goto_4
    move v0, v3

    goto/16 :goto_6

    .line 5
    :cond_8
    invoke-virtual {v2, v1}, Lcom/google/common/collect/ImmutableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/zzod;

    if-nez v0, :cond_9

    goto :goto_4

    .line 6
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/16 v18, 0x38

    if-eqz v0, :cond_10

    const/4 v5, 0x1

    if-eq v0, v5, :cond_e

    const/4 v5, 0x2

    if-eq v0, v5, :cond_c

    const/4 v5, 0x3

    if-eq v0, v5, :cond_a

    goto :goto_4

    :cond_a
    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    .line 7
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzi(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/google/android/gms/internal/measurement/zzkp;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzkp;->zzb:Lcom/google/android/gms/internal/measurement/zzkp;

    if-ne v0, v1, :cond_b

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    .line 8
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzg(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Z

    move-result v0

    return v0

    :cond_b
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    .line 9
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzh(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Z

    move-result v0

    return v0

    :cond_c
    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    .line 10
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzi(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/google/android/gms/internal/measurement/zzkp;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzkp;->zzc:Lcom/google/android/gms/internal/measurement/zzkp;

    if-ne v0, v1, :cond_d

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    .line 11
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzh(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Z

    move-result v0

    return v0

    :cond_d
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    .line 12
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzg(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Z

    move-result v0

    return v0

    :cond_e
    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    .line 13
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzi(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/google/android/gms/internal/measurement/zzkp;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzkp;->zzb:Lcom/google/android/gms/internal/measurement/zzkp;

    if-ne v0, v1, :cond_f

    :goto_5
    move/from16 v0, v18

    goto :goto_6

    :cond_f
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    .line 14
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzh(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Z

    move-result v0

    return v0

    :cond_10
    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    .line 15
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzi(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/google/android/gms/internal/measurement/zzkp;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzkp;->zzc:Lcom/google/android/gms/internal/measurement/zzkp;

    if-ne v0, v1, :cond_12

    goto :goto_5

    :goto_6
    if-lez v17, :cond_11

    .line 16
    aget-char v1, p4, v17

    const/16 v2, 0x32

    if-eq v1, v2, :cond_11

    aput-char v0, p4, v17

    :cond_11
    const/4 v0, 0x0

    return v0

    :cond_12
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    .line 17
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzg(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Z

    move-result v0

    return v0
.end method

.method public static final zzd(Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/util/Map;
    .locals 29

    move-object/from16 v3, p1

    .line 1
    sget-object v0, Lcom/google/android/gms/measurement/internal/zzfx;->zzba:Lcom/google/android/gms/measurement/internal/zzfw;

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfw;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 3
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p14, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lcom/google/common/collect/ImmutableMap;->of()Lcom/google/common/collect/ImmutableMap;

    move-result-object v0

    return-object v0

    .line 5
    :cond_1
    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzko;->zzb:Lcom/google/android/gms/internal/measurement/zzko;

    .line 6
    invoke-virtual {v3, v1}, Lcom/google/common/collect/ImmutableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzkp;

    sget-object v2, Lcom/google/android/gms/internal/measurement/zzko;->zzd:Lcom/google/android/gms/internal/measurement/zzko;

    .line 7
    invoke-virtual {v3, v2}, Lcom/google/common/collect/ImmutableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/zzkp;

    sget-object v5, Lcom/google/android/gms/internal/measurement/zzko;->zze:Lcom/google/android/gms/internal/measurement/zzko;

    .line 8
    invoke-virtual {v3, v5}, Lcom/google/common/collect/ImmutableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/zzkp;

    sget-object v7, Lcom/google/android/gms/internal/measurement/zzko;->zzh:Lcom/google/android/gms/internal/measurement/zzko;

    .line 9
    invoke-virtual {v3, v7}, Lcom/google/common/collect/ImmutableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/zzkp;

    .line 10
    invoke-static {}, Lcom/google/common/collect/ImmutableMap;->builder()Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v9

    const-string v10, "Version"

    const-string v11, "2"

    .line 11
    invoke-virtual {v9, v10, v11}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v9

    const-string v17, "1"

    const-string v18, "0"

    const/4 v10, 0x1

    move/from16 v14, p12

    if-eq v10, v14, :cond_2

    move-object/from16 v11, v18

    goto :goto_1

    :cond_2
    move-object/from16 v11, v17

    :goto_1
    const-string v12, "VendorConsent"

    .line 12
    invoke-virtual {v9, v12, v11}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v9

    move/from16 v15, p13

    if-eq v10, v15, :cond_3

    move-object/from16 v11, v18

    goto :goto_2

    :cond_3
    move-object/from16 v11, v17

    :goto_2
    const-string v12, "VendorLegitimateInterest"

    .line 13
    invoke-virtual {v9, v12, v11}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v9

    move/from16 v11, p6

    if-eq v11, v10, :cond_4

    move-object/from16 v12, v18

    goto :goto_3

    :cond_4
    move-object/from16 v12, v17

    :goto_3
    const-string v13, "gdprApplies"

    .line 14
    invoke-virtual {v9, v13, v12}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v9

    move/from16 v12, p5

    if-eq v12, v10, :cond_5

    move-object/from16 v13, v18

    goto :goto_4

    :cond_5
    move-object/from16 v13, v17

    :goto_4
    const-string v10, "EnableAdvertiserConsentMode"

    .line 15
    invoke-virtual {v9, v10, v13}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v9

    .line 16
    invoke-static/range {p7 .. p7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    const-string v13, "PolicyVersion"

    invoke-virtual {v9, v13, v10}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v9

    .line 17
    invoke-static/range {p4 .. p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    const-string v13, "CmpSdkID"

    invoke-virtual {v9, v13, v10}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v9

    move/from16 v10, p8

    const/4 v13, 0x1

    if-eq v10, v13, :cond_6

    move-object/from16 v13, v18

    :goto_5
    move-object/from16 v19, v0

    goto :goto_6

    :cond_6
    move-object/from16 v13, v17

    goto :goto_5

    :goto_6
    const-string v0, "PurposeOneTreatment"

    .line 18
    invoke-virtual {v9, v0, v13}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v0

    const-string v9, "PublisherCC"

    move-object/from16 v13, p9

    .line 19
    invoke-virtual {v0, v9, v13}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v0

    if-eqz v19, :cond_7

    .line 20
    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    move-result v9

    :goto_7
    move-object/from16 v19, v1

    goto :goto_8

    .line 21
    :cond_7
    sget-object v9, Lcom/google/android/gms/internal/measurement/zzkp;->zzd:Lcom/google/android/gms/internal/measurement/zzkp;

    .line 22
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    move-result v9

    goto :goto_7

    .line 23
    :goto_8
    const-string v1, "PublisherRestrictions1"

    .line 24
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    .line 25
    invoke-virtual {v0, v1, v9}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v0

    if-eqz v4, :cond_8

    .line 26
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    move-result v1

    goto :goto_9

    .line 27
    :cond_8
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzkp;->zzd:Lcom/google/android/gms/internal/measurement/zzkp;

    .line 28
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    move-result v1

    .line 29
    :goto_9
    const-string v4, "PublisherRestrictions3"

    .line 30
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-virtual {v0, v4, v1}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v0

    if-eqz v6, :cond_9

    .line 32
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    move-result v1

    goto :goto_a

    .line 33
    :cond_9
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzkp;->zzd:Lcom/google/android/gms/internal/measurement/zzkp;

    .line 34
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    move-result v1

    .line 35
    :goto_a
    const-string v4, "PublisherRestrictions4"

    .line 36
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 37
    invoke-virtual {v0, v4, v1}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v0

    if-eqz v8, :cond_a

    .line 38
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    move-result v1

    goto :goto_b

    .line 39
    :cond_a
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzkp;->zzd:Lcom/google/android/gms/internal/measurement/zzkp;

    .line 40
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzkp;->zza()I

    move-result v1

    .line 41
    :goto_b
    const-string v4, "PublisherRestrictions7"

    .line 42
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-virtual {v0, v4, v1}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v0

    move-object/from16 v4, p2

    move/from16 v6, p4

    move/from16 v9, p7

    move/from16 v16, p14

    move-object/from16 v20, v5

    move-object/from16 v21, v7

    move v8, v11

    move v7, v12

    move-object v11, v13

    move-object/from16 v1, v19

    move-object/from16 v5, p3

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v19, v2

    move-object/from16 v2, p0

    .line 44
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzf(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/lang/String;

    move-result-object v23

    move-object/from16 v28, v19

    move-object/from16 v19, v1

    move-object/from16 v1, v28

    .line 45
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzf(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v28, v20

    move-object/from16 v20, v1

    move-object/from16 v1, v28

    .line 46
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzf(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/lang/String;

    move-result-object v25

    move-object/from16 v28, v21

    move-object/from16 v21, v1

    move-object/from16 v1, v28

    .line 47
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzf(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/lang/String;

    move-result-object v26

    move-object/from16 v27, v1

    const-string v4, "Purpose3"

    const-string v2, "Purpose1"

    .line 48
    const-string v6, "Purpose4"

    const-string v8, "Purpose7"

    move-object/from16 v3, v23

    move-object/from16 v5, v24

    move-object/from16 v7, v25

    move-object/from16 v9, v26

    invoke-static/range {v2 .. v9}, Lcom/google/common/collect/ImmutableMap;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap;

    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Lcom/google/common/collect/ImmutableMap$Builder;->putAll(Ljava/util/Map;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v0

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    move/from16 v14, p12

    move/from16 v15, p13

    move-object/from16 v1, v19

    .line 50
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzc(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Z

    move-result v1

    const/4 v2, 0x1

    if-eq v2, v1, :cond_b

    move-object/from16 v1, v20

    move-object/from16 v20, v18

    :goto_c
    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move/from16 v14, p12

    move/from16 v15, p13

    move/from16 v16, p14

    move-object/from16 v19, v0

    move v0, v2

    move-object/from16 v2, p0

    goto :goto_d

    :cond_b
    move-object/from16 v1, v20

    move-object/from16 v20, v17

    goto :goto_c

    .line 51
    :goto_d
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzc(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Z

    move-result v1

    if-eq v0, v1, :cond_c

    move-object/from16 v1, v21

    move-object/from16 v21, v18

    :goto_e
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move/from16 v14, p12

    move/from16 v15, p13

    move/from16 v16, p14

    goto :goto_f

    :cond_c
    move-object/from16 v1, v21

    move-object/from16 v21, v17

    goto :goto_e

    .line 52
    :goto_f
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzc(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Z

    move-result v1

    if-eq v0, v1, :cond_d

    move-object/from16 v22, v18

    :goto_10
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move/from16 v14, p12

    move/from16 v15, p13

    move/from16 v16, p14

    move-object/from16 v1, v27

    goto :goto_11

    :cond_d
    move-object/from16 v22, v17

    goto :goto_10

    .line 53
    :goto_11
    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/measurement/internal/zzoe;->zzc(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Z

    move-result v1

    if-eq v0, v1, :cond_e

    move-object/from16 v17, v18

    :cond_e
    new-instance v0, Ljava/lang/String;

    move-object/from16 v5, p3

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    const-string v1, "AuthorizePurpose3"

    const-string v2, "AuthorizePurpose1"

    .line 54
    const-string v3, "AuthorizePurpose4"

    const-string v4, "AuthorizePurpose7"

    const-string v5, "PurposeDiagnostics"

    move-object/from16 p9, v0

    move-object/from16 p2, v1

    move-object/from16 p0, v2

    move-object/from16 p4, v3

    move-object/from16 p6, v4

    move-object/from16 p8, v5

    move-object/from16 p7, v17

    move-object/from16 p1, v20

    move-object/from16 p3, v21

    move-object/from16 p5, v22

    invoke-static/range {p0 .. p9}, Lcom/google/common/collect/ImmutableMap;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap;

    move-result-object v0

    move-object/from16 v1, v19

    .line 55
    invoke-virtual {v1, v0}, Lcom/google/common/collect/ImmutableMap$Builder;->putAll(Ljava/util/Map;)Lcom/google/common/collect/ImmutableMap$Builder;

    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lcom/google/common/collect/ImmutableMap$Builder;->buildOrThrow()Lcom/google/common/collect/ImmutableMap;

    move-result-object v0

    return-object v0
.end method

.method private static final zze(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)I
    .locals 0

    .line 1
    .line 2
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzko;->zzb:Lcom/google/android/gms/internal/measurement/zzko;

    .line 3
    .line 4
    if-ne p0, p1, :cond_0

    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    .line 8
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzko;->zzd:Lcom/google/android/gms/internal/measurement/zzko;

    .line 9
    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    const/4 p0, 0x2

    .line 12
    return p0

    .line 13
    .line 14
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzko;->zze:Lcom/google/android/gms/internal/measurement/zzko;

    .line 15
    .line 16
    if-ne p0, p1, :cond_2

    .line 17
    const/4 p0, 0x3

    .line 18
    return p0

    .line 19
    .line 20
    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzko;->zzh:Lcom/google/android/gms/internal/measurement/zzko;

    .line 21
    .line 22
    if-ne p0, p1, :cond_3

    .line 23
    const/4 p0, 0x4

    .line 24
    return p0

    .line 25
    :cond_3
    const/4 p0, -0x1

    .line 26
    return p0
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
.end method

.method private static final zzf(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result p1

    .line 5
    .line 6
    const-string p2, "0"

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p11}, Ljava/lang/String;->length()I

    .line 12
    move-result p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzko;->zza()I

    .line 16
    move-result p3

    .line 17
    .line 18
    if-lt p1, p3, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzko;->zza()I

    .line 22
    move-result p1

    .line 23
    .line 24
    add-int/lit8 p1, p1, -0x1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p11, p1}, Ljava/lang/String;->charAt(I)C

    .line 28
    move-result p1

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object p1, p2

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-static {p12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    move-result p3

    .line 39
    .line 40
    if-nez p3, :cond_1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p12}, Ljava/lang/String;->length()I

    .line 44
    move-result p3

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzko;->zza()I

    .line 48
    move-result p4

    .line 49
    .line 50
    if-lt p3, p4, :cond_1

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzko;->zza()I

    .line 54
    move-result p0

    .line 55
    .line 56
    add-int/lit8 p0, p0, -0x1

    .line 57
    .line 58
    .line 59
    invoke-virtual {p12, p0}, Ljava/lang/String;->charAt(I)C

    .line 60
    move-result p0

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 64
    move-result-object p2

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    move-result-object p0

    .line 69
    .line 70
    .line 71
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    move-result-object p0

    .line 77
    return-object p0
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
.end method

.method private static final zzg(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static/range {p0 .. p15}, Lcom/google/android/gms/measurement/internal/zzoe;->zze(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)I

    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x0

    .line 6
    .line 7
    const/16 p3, 0x32

    .line 8
    .line 9
    if-nez p13, :cond_0

    .line 10
    .line 11
    const/16 p0, 0x34

    .line 12
    goto :goto_0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p11}, Ljava/lang/String;->length()I

    .line 16
    move-result p5

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzko;->zza()I

    .line 20
    move-result p6

    .line 21
    .line 22
    if-ge p5, p6, :cond_2

    .line 23
    .line 24
    const/16 p0, 0x30

    .line 25
    .line 26
    :goto_0
    if-lez p1, :cond_1

    .line 27
    .line 28
    aget-char p5, p4, p1

    .line 29
    .line 30
    if-eq p5, p3, :cond_1

    .line 31
    .line 32
    aput-char p0, p4, p1

    .line 33
    :cond_1
    return p2

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzko;->zza()I

    .line 37
    move-result p0

    .line 38
    .line 39
    add-int/lit8 p0, p0, -0x1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p11, p0}, Ljava/lang/String;->charAt(I)C

    .line 43
    move-result p0

    .line 44
    .line 45
    const/16 p5, 0x31

    .line 46
    .line 47
    if-ne p0, p5, :cond_3

    .line 48
    const/4 p2, 0x1

    .line 49
    .line 50
    :cond_3
    if-lez p1, :cond_5

    .line 51
    .line 52
    aget-char p6, p4, p1

    .line 53
    .line 54
    if-eq p6, p3, :cond_5

    .line 55
    .line 56
    if-ne p0, p5, :cond_4

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :cond_4
    const/16 p5, 0x36

    .line 60
    .line 61
    :goto_1
    aput-char p5, p4, p1

    .line 62
    :cond_5
    return p2
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
.end method

.method private static final zzh(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static/range {p0 .. p15}, Lcom/google/android/gms/measurement/internal/zzoe;->zze(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)I

    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x0

    .line 6
    .line 7
    const/16 p3, 0x32

    .line 8
    .line 9
    if-nez p14, :cond_0

    .line 10
    .line 11
    const/16 p0, 0x35

    .line 12
    goto :goto_0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p12}, Ljava/lang/String;->length()I

    .line 16
    move-result p5

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzko;->zza()I

    .line 20
    move-result p6

    .line 21
    .line 22
    if-ge p5, p6, :cond_2

    .line 23
    .line 24
    const/16 p0, 0x30

    .line 25
    .line 26
    :goto_0
    if-lez p1, :cond_1

    .line 27
    .line 28
    aget-char p5, p4, p1

    .line 29
    .line 30
    if-eq p5, p3, :cond_1

    .line 31
    .line 32
    aput-char p0, p4, p1

    .line 33
    :cond_1
    return p2

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzko;->zza()I

    .line 37
    move-result p0

    .line 38
    .line 39
    add-int/lit8 p0, p0, -0x1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p12, p0}, Ljava/lang/String;->charAt(I)C

    .line 43
    move-result p0

    .line 44
    .line 45
    const/16 p5, 0x31

    .line 46
    .line 47
    if-ne p0, p5, :cond_3

    .line 48
    const/4 p2, 0x1

    .line 49
    .line 50
    :cond_3
    if-lez p1, :cond_5

    .line 51
    .line 52
    aget-char p6, p4, p1

    .line 53
    .line 54
    if-eq p6, p3, :cond_5

    .line 55
    .line 56
    if-ne p0, p5, :cond_4

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :cond_4
    const/16 p5, 0x37

    .line 60
    .line 61
    :goto_1
    aput-char p5, p4, p1

    .line 62
    :cond_5
    return p2
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
.end method

.method private static final zzi(Lcom/google/android/gms/internal/measurement/zzko;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableMap;Lcom/google/common/collect/ImmutableSet;[CIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/google/android/gms/internal/measurement/zzkp;
    .locals 0

    .line 1
    .line 2
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzkp;->zzd:Lcom/google/android/gms/internal/measurement/zzkp;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2, p0, p1}, Lcom/google/common/collect/ImmutableMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/google/android/gms/internal/measurement/zzkp;

    .line 9
    return-object p0
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
.end method
