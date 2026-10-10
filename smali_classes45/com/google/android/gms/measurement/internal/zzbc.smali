.class final Lcom/google/android/gms/measurement/internal/zzbc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@22.5.0"


# instance fields
.field final zza:Ljava/lang/String;

.field final zzb:Ljava/lang/String;

.field final zzc:J

.field final zzd:J

.field final zze:J

.field final zzf:J

.field final zzg:J

.field final zzh:Ljava/lang/Long;

.field final zzi:Ljava/lang/Long;

.field final zzj:Ljava/lang/Long;

.field final zzk:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
    .locals 13

    .line 1
    .line 2
    move-wide/from16 v0, p3

    .line 3
    .line 4
    move-wide/from16 v2, p5

    .line 5
    .line 6
    move-wide/from16 v4, p7

    .line 7
    .line 8
    move-wide/from16 v6, p11

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    const-wide/16 v8, 0x0

    .line 20
    .line 21
    cmp-long v10, v0, v8

    .line 22
    const/4 v11, 0x0

    .line 23
    const/4 v12, 0x1

    .line 24
    .line 25
    if-ltz v10, :cond_0

    .line 26
    move v10, v12

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v10, v11

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    .line 32
    .line 33
    cmp-long v10, v2, v8

    .line 34
    .line 35
    if-ltz v10, :cond_1

    .line 36
    move v10, v12

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v10, v11

    .line 39
    .line 40
    .line 41
    :goto_1
    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    .line 42
    .line 43
    cmp-long v10, v4, v8

    .line 44
    .line 45
    if-ltz v10, :cond_2

    .line 46
    move v10, v12

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move v10, v11

    .line 49
    .line 50
    .line 51
    :goto_2
    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    .line 52
    .line 53
    cmp-long v8, v6, v8

    .line 54
    .line 55
    if-ltz v8, :cond_3

    .line 56
    move v11, v12

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-static {v11}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    .line 60
    .line 61
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzbc;->zza:Ljava/lang/String;

    .line 62
    .line 63
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzbc;->zzb:Ljava/lang/String;

    .line 64
    .line 65
    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzbc;->zzc:J

    .line 66
    .line 67
    iput-wide v2, p0, Lcom/google/android/gms/measurement/internal/zzbc;->zzd:J

    .line 68
    .line 69
    iput-wide v4, p0, Lcom/google/android/gms/measurement/internal/zzbc;->zze:J

    .line 70
    .line 71
    move-wide/from16 p1, p9

    .line 72
    .line 73
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/zzbc;->zzf:J

    .line 74
    .line 75
    iput-wide v6, p0, Lcom/google/android/gms/measurement/internal/zzbc;->zzg:J

    .line 76
    .line 77
    move-object/from16 p1, p13

    .line 78
    .line 79
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzbc;->zzh:Ljava/lang/Long;

    .line 80
    .line 81
    move-object/from16 p1, p14

    .line 82
    .line 83
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzbc;->zzi:Ljava/lang/Long;

    .line 84
    .line 85
    move-object/from16 p1, p15

    .line 86
    .line 87
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzbc;->zzj:Ljava/lang/Long;

    .line 88
    .line 89
    move-object/from16 p1, p16

    .line 90
    .line 91
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzbc;->zzk:Ljava/lang/Boolean;

    .line 92
    return-void
.end method


# virtual methods
.method public final zza(J)Lcom/google/android/gms/measurement/internal/zzbc;
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-wide v12, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzg:J

    .line 5
    .line 6
    iget-object v14, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzh:Ljava/lang/Long;

    .line 7
    .line 8
    iget-object v15, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzi:Ljava/lang/Long;

    .line 9
    .line 10
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzj:Ljava/lang/Long;

    .line 11
    .line 12
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzk:Ljava/lang/Boolean;

    .line 13
    .line 14
    move-object/from16 v16, v1

    .line 15
    .line 16
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzbc;

    .line 17
    .line 18
    move-object/from16 v17, v2

    .line 19
    .line 20
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zza:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzb:Ljava/lang/String;

    .line 23
    .line 24
    iget-wide v4, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzc:J

    .line 25
    .line 26
    iget-wide v6, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzd:J

    .line 27
    .line 28
    iget-wide v8, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zze:J

    .line 29
    .line 30
    move-wide/from16 v10, p1

    .line 31
    .line 32
    .line 33
    invoke-direct/range {v1 .. v17}, Lcom/google/android/gms/measurement/internal/zzbc;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 34
    return-object v1
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
.end method

.method public final zzb(JJ)Lcom/google/android/gms/measurement/internal/zzbc;
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzbc;

    .line 5
    .line 6
    .line 7
    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    move-result-object v14

    .line 9
    .line 10
    iget-object v15, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzi:Ljava/lang/Long;

    .line 11
    .line 12
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzj:Ljava/lang/Long;

    .line 13
    .line 14
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzk:Ljava/lang/Boolean;

    .line 15
    .line 16
    move-object/from16 v16, v2

    .line 17
    .line 18
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zza:Ljava/lang/String;

    .line 19
    .line 20
    move-object/from16 v17, v3

    .line 21
    .line 22
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzb:Ljava/lang/String;

    .line 23
    .line 24
    iget-wide v4, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzc:J

    .line 25
    .line 26
    iget-wide v6, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzd:J

    .line 27
    .line 28
    iget-wide v8, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zze:J

    .line 29
    .line 30
    iget-wide v10, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzf:J

    .line 31
    .line 32
    move-wide/from16 v12, p1

    .line 33
    .line 34
    .line 35
    invoke-direct/range {v1 .. v17}, Lcom/google/android/gms/measurement/internal/zzbc;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 36
    return-object v1
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

.method public final zzc(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/measurement/internal/zzbc;
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zza:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzb:Ljava/lang/String;

    .line 7
    .line 8
    iget-wide v4, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzc:J

    .line 9
    .line 10
    iget-wide v6, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzd:J

    .line 11
    .line 12
    iget-wide v8, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zze:J

    .line 13
    .line 14
    iget-wide v10, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzf:J

    .line 15
    .line 16
    iget-wide v12, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzg:J

    .line 17
    .line 18
    iget-object v14, v0, Lcom/google/android/gms/measurement/internal/zzbc;->zzh:Ljava/lang/Long;

    .line 19
    .line 20
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzbc;

    .line 21
    .line 22
    move-object/from16 v15, p1

    .line 23
    .line 24
    move-object/from16 v16, p2

    .line 25
    .line 26
    move-object/from16 v17, p3

    .line 27
    .line 28
    .line 29
    invoke-direct/range {v1 .. v17}, Lcom/google/android/gms/measurement/internal/zzbc;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 30
    return-object v1
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
