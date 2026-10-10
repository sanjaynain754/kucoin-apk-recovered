.class public final Lcom/google/mlkit/vision/barcode/internal/zzp;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1"

# interfaces
.implements Lcom/google/mlkit/vision/barcode/common/internal/BarcodeSource;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

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
.end method

.method private static zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;)Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;
    .locals 9
    .param p0    # Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

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
    new-instance v0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;

    .line 7
    .line 8
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;->zza:I

    .line 9
    .line 10
    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;->zzb:I

    .line 11
    .line 12
    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;->zzc:I

    .line 13
    .line 14
    iget v4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;->zzd:I

    .line 15
    .line 16
    iget v5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;->zze:I

    .line 17
    .line 18
    iget v6, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;->zzf:I

    .line 19
    .line 20
    iget-boolean v7, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;->zzg:Z

    .line 21
    .line 22
    iget-object v8, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;->zzh:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-direct/range {v0 .. v8}, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;-><init>(IIIIIIZLjava/lang/String;)V

    .line 26
    return-object v0
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method


# virtual methods
.method public final getBoundingBox()Landroid/graphics/Rect;
    .locals 8
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zze:[Landroid/graphics/Point;

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    const/high16 v2, -0x80000000

    .line 10
    .line 11
    .line 12
    const v3, 0x7fffffff

    .line 13
    move v4, v3

    .line 14
    move v5, v4

    .line 15
    move v3, v2

    .line 16
    .line 17
    :goto_0
    iget-object v6, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zze:[Landroid/graphics/Point;

    .line 18
    array-length v7, v6

    .line 19
    .line 20
    if-ge v1, v7, :cond_0

    .line 21
    .line 22
    aget-object v6, v6, v1

    .line 23
    .line 24
    iget v7, v6, Landroid/graphics/Point;->x:I

    .line 25
    .line 26
    .line 27
    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    .line 28
    move-result v4

    .line 29
    .line 30
    iget v7, v6, Landroid/graphics/Point;->x:I

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    .line 34
    move-result v2

    .line 35
    .line 36
    iget v7, v6, Landroid/graphics/Point;->y:I

    .line 37
    .line 38
    .line 39
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 40
    move-result v5

    .line 41
    .line 42
    iget v6, v6, Landroid/graphics/Point;->y:I

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    .line 46
    move-result v3

    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v4, v5, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 55
    return-object v0

    .line 56
    :cond_1
    const/4 v0, 0x0

    .line 57
    return-object v0
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
.end method

.method public final getCalendarEvent()Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;
    .locals 9
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    .line 10
    :cond_0
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;

    .line 11
    .line 12
    iget-object v2, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;->zza:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v3, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;->zzb:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v4, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;->zzc:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v5, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;->zzd:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v6, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;->zze:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v7, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;

    .line 23
    .line 24
    .line 25
    invoke-static {v7}, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;)Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;

    .line 26
    move-result-object v7

    .line 27
    .line 28
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzk;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzj;)Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;

    .line 32
    move-result-object v8

    .line 33
    .line 34
    .line 35
    invoke-direct/range {v1 .. v8}, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;)V

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
.end method

.method public final getContactInfo()Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;
    .locals 15
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    :cond_0
    new-instance v2, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;

    .line 11
    .line 12
    iget-object v3, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzp;

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    move-object v3, v1

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_1
    new-instance v4, Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;

    .line 19
    .line 20
    iget-object v5, v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzp;->zza:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v6, v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzp;->zzb:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v7, v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzp;->zzc:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v8, v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzp;->zzd:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v9, v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzp;->zze:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v10, v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzp;->zzf:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v11, v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzp;->zzg:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-direct/range {v4 .. v11}, Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    move-object v3, v4

    .line 37
    .line 38
    :goto_0
    iget-object v4, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;->zzb:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v5, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;->zzc:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;->zzd:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    .line 43
    .line 44
    new-instance v6, Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 48
    const/4 v7, 0x0

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    move v8, v7

    .line 52
    :goto_1
    array-length v9, v1

    .line 53
    .line 54
    if-ge v8, v9, :cond_3

    .line 55
    .line 56
    aget-object v9, v1, v8

    .line 57
    .line 58
    if-eqz v9, :cond_2

    .line 59
    .line 60
    new-instance v10, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;

    .line 61
    .line 62
    iget-object v11, v9, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->zzb:Ljava/lang/String;

    .line 63
    .line 64
    iget v9, v9, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->zza:I

    .line 65
    .line 66
    .line 67
    invoke-direct {v10, v11, v9}, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;-><init>(Ljava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;->zze:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;

    .line 76
    move v8, v7

    .line 77
    .line 78
    new-instance v7, Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    if-eqz v1, :cond_5

    .line 84
    move v9, v8

    .line 85
    :goto_2
    array-length v10, v1

    .line 86
    .line 87
    if-ge v9, v10, :cond_5

    .line 88
    .line 89
    aget-object v10, v1, v9

    .line 90
    .line 91
    if-eqz v10, :cond_4

    .line 92
    .line 93
    new-instance v11, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;

    .line 94
    .line 95
    iget v12, v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;->zza:I

    .line 96
    .line 97
    iget-object v13, v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;->zzb:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v14, v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;->zzc:Ljava/lang/String;

    .line 100
    .line 101
    iget-object v10, v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;->zzd:Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    invoke-direct {v11, v12, v13, v14, v10}, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 110
    goto :goto_2

    .line 111
    .line 112
    :cond_5
    iget-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;->zzf:[Ljava/lang/String;

    .line 113
    .line 114
    if-eqz v1, :cond_6

    .line 115
    .line 116
    .line 117
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 118
    move-result-object v1

    .line 119
    goto :goto_3

    .line 120
    .line 121
    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    .line 122
    .line 123
    .line 124
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    :goto_3
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzl;->zzg:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;

    .line 127
    .line 128
    new-instance v9, Ljava/util/ArrayList;

    .line 129
    .line 130
    .line 131
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    if-eqz v0, :cond_8

    .line 134
    :goto_4
    array-length v10, v0

    .line 135
    .line 136
    if-ge v8, v10, :cond_8

    .line 137
    .line 138
    aget-object v10, v0, v8

    .line 139
    .line 140
    if-eqz v10, :cond_7

    .line 141
    .line 142
    new-instance v11, Lcom/google/mlkit/vision/barcode/common/Barcode$Address;

    .line 143
    .line 144
    iget v12, v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->zza:I

    .line 145
    .line 146
    iget-object v10, v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->zzb:[Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    invoke-direct {v11, v12, v10}, Lcom/google/mlkit/vision/barcode/common/Barcode$Address;-><init>(I[Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    :cond_7
    add-int/lit8 v8, v8, 0x1

    .line 155
    goto :goto_4

    .line 156
    :cond_8
    move-object v8, v1

    .line 157
    .line 158
    .line 159
    invoke-direct/range {v2 .. v9}, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;-><init>(Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 160
    return-object v2
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
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method

.method public final getCornerPoints()[Landroid/graphics/Point;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zze:[Landroid/graphics/Point;

    .line 5
    return-object v0
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
.end method

.method public final getDisplayValue()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzc:Ljava/lang/String;

    .line 5
    return-object v0
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
.end method

.method public final getDriverLicense()Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;
    .locals 17
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 5
    .line 6
    iget-object v1, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    const/4 v1, 0x0

    .line 10
    return-object v1

    .line 11
    .line 12
    :cond_0
    new-instance v2, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;

    .line 13
    .line 14
    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;->zza:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v4, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;->zzb:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;->zzc:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v6, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;->zzd:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v7, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;->zze:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v8, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;->zzf:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v9, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;->zzg:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v10, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;->zzh:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v11, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;->zzi:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v12, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;->zzj:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v13, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;->zzk:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v14, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;->zzl:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v15, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;->zzm:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v1, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzm;->zzn:Ljava/lang/String;

    .line 41
    .line 42
    move-object/from16 v16, v1

    .line 43
    .line 44
    .line 45
    invoke-direct/range {v2 .. v16}, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    return-object v2
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
.end method

.method public final getEmail()Lcom/google/mlkit/vision/barcode/common/Barcode$Email;
    .locals 5
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;

    .line 9
    .line 10
    iget v2, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;->zza:I

    .line 11
    .line 12
    iget-object v3, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;->zzb:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v4, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;->zzc:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzn;->zzd:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    return-object v1

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return-object v0
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
.end method

.method public final getFormat()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zza:I

    .line 5
    return v0
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
.end method

.method public final getGeoPoint()Lcom/google/mlkit/vision/barcode/common/Barcode$GeoPoint;
    .locals 6
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$GeoPoint;

    .line 9
    .line 10
    iget-wide v2, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;->zza:D

    .line 11
    .line 12
    iget-wide v4, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;->zzb:D

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/mlkit/vision/barcode/common/Barcode$GeoPoint;-><init>(DD)V

    .line 16
    return-object v1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return-object v0
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
.end method

.method public final getPhone()Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;
    .locals 3
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;

    .line 9
    .line 10
    iget-object v2, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->zzb:Ljava/lang/String;

    .line 11
    .line 12
    iget v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->zza:I

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;-><init>(Ljava/lang/String;I)V

    .line 16
    return-object v1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return-object v0
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
.end method

.method public final getRawBytes()[B
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzo:[B

    .line 5
    return-object v0
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
.end method

.method public final getRawValue()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzb:Ljava/lang/String;

    .line 5
    return-object v0
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
.end method

.method public final getSms()Lcom/google/mlkit/vision/barcode/common/Barcode$Sms;
    .locals 3
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzr;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$Sms;

    .line 9
    .line 10
    iget-object v2, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzr;->zza:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzr;->zzb:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$Sms;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    return-object v1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return-object v0
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
.end method

.method public final getUrl()Lcom/google/mlkit/vision/barcode/common/Barcode$UrlBookmark;
    .locals 3
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzs;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$UrlBookmark;

    .line 9
    .line 10
    iget-object v2, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzs;->zza:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzs;->zzb:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$UrlBookmark;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    return-object v1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return-object v0
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
.end method

.method public final getValueType()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzd:I

    .line 5
    return v0
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
.end method

.method public final getWifi()Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;
    .locals 4
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzp;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzt;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;

    .line 9
    .line 10
    iget-object v2, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzt;->zza:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v3, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzt;->zzb:Ljava/lang/String;

    .line 13
    .line 14
    iget v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzt;->zzc:I

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v2, v3, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 18
    return-object v1

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return-object v0
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
.end method
