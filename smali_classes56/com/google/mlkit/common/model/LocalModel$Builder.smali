.class public Lcom/google/mlkit/common/model/LocalModel$Builder;
.super Ljava/lang/Object;
.source "com.google.mlkit:common@@18.11.0"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/common/model/LocalModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private zza:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private zzb:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private zzc:Landroid/net/Uri;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private zzd:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    .line 14
    return-void
    .line 15
    .line 16
.end method


# virtual methods
.method public build()Lcom/google/mlkit/common/model/LocalModel;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    .line 12
    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    :cond_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    .line 22
    .line 23
    if-eqz v2, :cond_3

    .line 24
    :cond_1
    const/4 v2, 0x0

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move v1, v2

    .line 37
    .line 38
    :cond_3
    :goto_0
    const-string v0, "Set one of filePath, assetFilePath and URI."

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 42
    .line 43
    new-instance v2, Lcom/google/mlkit/common/model/LocalModel;

    .line 44
    .line 45
    iget-object v3, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v4, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v5, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    .line 50
    .line 51
    iget-boolean v6, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    .line 52
    const/4 v7, 0x0

    .line 53
    .line 54
    .line 55
    invoke-direct/range {v2 .. v7}, Lcom/google/mlkit/common/model/LocalModel;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;ZLcom/google/mlkit/common/model/zzc;)V

    .line 56
    return-object v2
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

.method public setAbsoluteFilePath(Ljava/lang/String;)Lcom/google/mlkit/common/model/LocalModel$Builder;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "Model Source file path can not be empty"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-boolean v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    const/4 v1, 0x1

    .line 20
    .line 21
    :cond_0
    const-string v0, "A local model source is from absolute file path, asset file path or URI, you can only set one of them."

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 25
    .line 26
    iput-object p1, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    .line 27
    return-object p0
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

.method public setAbsoluteManifestFilePath(Ljava/lang/String;)Lcom/google/mlkit/common/model/LocalModel$Builder;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "Manifest file path can not be empty"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    :cond_0
    move v1, v2

    .line 25
    .line 26
    :cond_1
    const-string v0, "A local model source is from absolute file path, asset file path or URI, you can only set one of them."

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 30
    .line 31
    iput-object p1, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    .line 32
    .line 33
    iput-boolean v2, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    .line 34
    return-object p0
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

.method public setAssetFilePath(Ljava/lang/String;)Lcom/google/mlkit/common/model/LocalModel$Builder;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "Model Source file path can not be empty"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-boolean v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    const/4 v1, 0x1

    .line 20
    .line 21
    :cond_0
    const-string v0, "A local model source is from absolute file path, asset file path or URI, you can only set one of them."

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 25
    .line 26
    iput-object p1, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    .line 27
    return-object p0
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

.method public setAssetManifestFilePath(Ljava/lang/String;)Lcom/google/mlkit/common/model/LocalModel$Builder;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "Manifest file path can not be empty"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    :cond_0
    move v1, v2

    .line 25
    .line 26
    :cond_1
    const-string v0, "A local model source is from absolute file path, asset file path or URI, you can only set one of them."

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 30
    .line 31
    iput-object p1, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    .line 32
    .line 33
    iput-boolean v2, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    .line 34
    return-object p0
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

.method public setUri(Landroid/net/Uri;)Lcom/google/mlkit/common/model/LocalModel$Builder;
    .locals 2
    .param p1    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    :cond_0
    const-string v0, "A local model source is from absolute file path, asset file path or URI, you can only set one of them."

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
