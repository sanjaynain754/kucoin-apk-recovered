.class public final Ljumio/core/L0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/commons/camera/CameraCapabilities;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:[Ljava/lang/String;

.field public final i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>()V
    .locals 11

    const/4 v0, 0x0

    .line 11
    new-array v9, v0, [Ljava/lang/String;

    .line 12
    const-string v10, ""

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    .line 13
    invoke-direct/range {v1 .. v10}, Ljumio/core/L0;-><init>(ZZZZZZZ[Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ZZZZZZZ[Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "availableWhiteBalanceModes"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Ljumio/core/L0;->a:Z

    .line 3
    iput-boolean p2, p0, Ljumio/core/L0;->b:Z

    .line 4
    iput-boolean p3, p0, Ljumio/core/L0;->c:Z

    .line 5
    iput-boolean p4, p0, Ljumio/core/L0;->d:Z

    .line 6
    iput-boolean p5, p0, Ljumio/core/L0;->e:Z

    .line 7
    iput-boolean p6, p0, Ljumio/core/L0;->f:Z

    .line 8
    iput-boolean p7, p0, Ljumio/core/L0;->g:Z

    .line 9
    iput-object p8, p0, Ljumio/core/L0;->h:[Ljava/lang/String;

    .line 10
    iput-object p9, p0, Ljumio/core/L0;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    move-result-object v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v1, 0x0

    .line 13
    .line 14
    :goto_0
    const-class v2, Ljumio/core/L0;

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    return v2

    .line 23
    .line 24
    :cond_2
    const-string v1, "null cannot be cast to non-null type com.jumio.commons.camera.DefaultCameraCapabilities"

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    check-cast p1, Ljumio/core/L0;

    .line 30
    .line 31
    iget-boolean v1, p0, Ljumio/core/L0;->a:Z

    .line 32
    .line 33
    iget-boolean v3, p1, Ljumio/core/L0;->a:Z

    .line 34
    .line 35
    if-eq v1, v3, :cond_3

    .line 36
    return v2

    .line 37
    .line 38
    :cond_3
    iget-boolean v1, p0, Ljumio/core/L0;->b:Z

    .line 39
    .line 40
    iget-boolean v3, p1, Ljumio/core/L0;->b:Z

    .line 41
    .line 42
    if-eq v1, v3, :cond_4

    .line 43
    return v2

    .line 44
    .line 45
    :cond_4
    iget-boolean v1, p0, Ljumio/core/L0;->c:Z

    .line 46
    .line 47
    iget-boolean v3, p1, Ljumio/core/L0;->c:Z

    .line 48
    .line 49
    if-eq v1, v3, :cond_5

    .line 50
    return v2

    .line 51
    .line 52
    :cond_5
    iget-boolean v1, p0, Ljumio/core/L0;->d:Z

    .line 53
    .line 54
    iget-boolean v3, p1, Ljumio/core/L0;->d:Z

    .line 55
    .line 56
    if-eq v1, v3, :cond_6

    .line 57
    return v2

    .line 58
    .line 59
    :cond_6
    iget-boolean v1, p0, Ljumio/core/L0;->e:Z

    .line 60
    .line 61
    iget-boolean v3, p1, Ljumio/core/L0;->e:Z

    .line 62
    .line 63
    if-eq v1, v3, :cond_7

    .line 64
    return v2

    .line 65
    .line 66
    :cond_7
    iget-boolean v1, p0, Ljumio/core/L0;->f:Z

    .line 67
    .line 68
    iget-boolean v3, p1, Ljumio/core/L0;->f:Z

    .line 69
    .line 70
    if-eq v1, v3, :cond_8

    .line 71
    return v2

    .line 72
    .line 73
    :cond_8
    iget-boolean v1, p0, Ljumio/core/L0;->g:Z

    .line 74
    .line 75
    iget-boolean v3, p1, Ljumio/core/L0;->g:Z

    .line 76
    .line 77
    if-eq v1, v3, :cond_9

    .line 78
    return v2

    .line 79
    .line 80
    :cond_9
    iget-object v1, p0, Ljumio/core/L0;->h:[Ljava/lang/String;

    .line 81
    .line 82
    iget-object v3, p1, Ljumio/core/L0;->h:[Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 86
    move-result v1

    .line 87
    .line 88
    if-nez v1, :cond_a

    .line 89
    return v2

    .line 90
    .line 91
    :cond_a
    iget-object v1, p0, Ljumio/core/L0;->i:Ljava/lang/String;

    .line 92
    .line 93
    iget-object p1, p1, Ljumio/core/L0;->i:Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    move-result p1

    .line 98
    .line 99
    if-nez p1, :cond_b

    .line 100
    return v2

    .line 101
    :cond_b
    return v0
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
.end method

.method public final getAvailableWhiteBalanceModes()[Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/L0;->h:[Ljava/lang/String;

    .line 3
    return-object v0
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
    .line 19
    .line 20
    .line 21
.end method

.method public final getCanAdjustExposure()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ljumio/core/L0;->f:Z

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
    .line 19
    .line 20
    .line 21
.end method

.method public final getCanAdjustFocus()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ljumio/core/L0;->e:Z

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
    .line 19
    .line 20
    .line 21
.end method

.method public final getCanAdjustWhiteBalance()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ljumio/core/L0;->g:Z

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
    .line 19
    .line 20
    .line 21
.end method

.method public final getHasExposureAndWhiteBalanceLock()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ljumio/core/L0;->d:Z

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
    .line 19
    .line 20
    .line 21
.end method

.method public final getHasFlash()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ljumio/core/L0;->a:Z

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
    .line 19
    .line 20
    .line 21
.end method

.method public final getHasHighResolutionSupport()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ljumio/core/L0;->c:Z

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
    .line 19
    .line 20
    .line 21
.end method

.method public final getHasMultipleCameras()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ljumio/core/L0;->b:Z

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
    .line 19
    .line 20
    .line 21
.end method

.method public final getInfo()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/L0;->i:Ljava/lang/String;

    .line 3
    return-object v0
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
    .line 19
    .line 20
    .line 21
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Ljumio/core/L0;->a:Z

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    mul-int/2addr v0, v1

    .line 10
    .line 11
    iget-boolean v2, p0, Ljumio/core/L0;->b:Z

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 15
    move-result v0

    .line 16
    .line 17
    iget-boolean v2, p0, Ljumio/core/L0;->c:Z

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 21
    move-result v0

    .line 22
    .line 23
    iget-boolean v2, p0, Ljumio/core/L0;->d:Z

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 27
    move-result v0

    .line 28
    .line 29
    iget-boolean v2, p0, Ljumio/core/L0;->e:Z

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 33
    move-result v0

    .line 34
    .line 35
    iget-boolean v2, p0, Ljumio/core/L0;->f:Z

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 39
    move-result v0

    .line 40
    .line 41
    iget-boolean v2, p0, Ljumio/core/L0;->g:Z

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v0, v1}, Ljumio/core/b0;->a(ZII)I

    .line 45
    move-result v0

    .line 46
    .line 47
    iget-object v2, p0, Ljumio/core/L0;->h:[Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 51
    move-result v2

    .line 52
    add-int/2addr v0, v2

    .line 53
    mul-int/2addr v0, v1

    .line 54
    .line 55
    iget-object v1, p0, Ljumio/core/L0;->i:Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 59
    move-result v1

    .line 60
    add-int/2addr v1, v0

    .line 61
    return v1
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/commons/camera/CameraCapabilities;->defaultToString()Ljava/lang/String;

    .line 4
    move-result-object v0

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
