.class Landroidx/camera/core/impl/compat/EncoderProfilesProxyCompatBaseImpl;
.super Ljava/lang/Object;
.source "EncoderProfilesProxyCompatBaseImpl.java"


# direct methods
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
    .line 19
    .line 20
.end method

.method public static from(Landroid/media/CamcorderProfile;)Landroidx/camera/core/impl/EncoderProfilesProxy;
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Landroid/media/CamcorderProfile;->duration:I

    .line 3
    .line 4
    iget v1, p0, Landroid/media/CamcorderProfile;->fileFormat:I

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Landroidx/camera/core/impl/compat/EncoderProfilesProxyCompatBaseImpl;->toAudioProfiles(Landroid/media/CamcorderProfile;)Ljava/util/List;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/camera/core/impl/compat/EncoderProfilesProxyCompatBaseImpl;->toVideoProfiles(Landroid/media/CamcorderProfile;)Ljava/util/List;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2, p0}, Landroidx/camera/core/impl/EncoderProfilesProxy$ImmutableEncoderProfilesProxy;->create(IILjava/util/List;Ljava/util/List;)Landroidx/camera/core/impl/EncoderProfilesProxy$ImmutableEncoderProfilesProxy;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private static toAudioProfiles(Landroid/media/CamcorderProfile;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/CamcorderProfile;",
            ")",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    iget v1, p0, Landroid/media/CamcorderProfile;->audioCodec:I

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Landroidx/camera/core/impl/EncoderProfilesProxy;->getAudioCodecMimeType(I)Ljava/lang/String;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    iget v3, p0, Landroid/media/CamcorderProfile;->audioBitRate:I

    .line 14
    .line 15
    iget v4, p0, Landroid/media/CamcorderProfile;->audioSampleRate:I

    .line 16
    .line 17
    iget v5, p0, Landroid/media/CamcorderProfile;->audioChannels:I

    .line 18
    .line 19
    iget p0, p0, Landroid/media/CamcorderProfile;->audioCodec:I

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Landroidx/camera/core/impl/EncoderProfilesProxy;->getRequiredAudioProfile(I)I

    .line 23
    move-result v6

    .line 24
    .line 25
    .line 26
    invoke-static/range {v1 .. v6}, Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;->create(ILjava/lang/String;IIII)Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;

    .line 27
    move-result-object p0

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    return-object v0
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
.end method

.method private static toVideoProfiles(Landroid/media/CamcorderProfile;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/CamcorderProfile;",
            ")",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    iget v1, p0, Landroid/media/CamcorderProfile;->videoCodec:I

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Landroidx/camera/core/impl/EncoderProfilesProxy;->getVideoCodecMimeType(I)Ljava/lang/String;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    iget v3, p0, Landroid/media/CamcorderProfile;->videoBitRate:I

    .line 14
    .line 15
    iget v4, p0, Landroid/media/CamcorderProfile;->videoFrameRate:I

    .line 16
    .line 17
    iget v5, p0, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    .line 18
    .line 19
    iget v6, p0, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v10, 0x0

    .line 22
    const/4 v7, -0x1

    .line 23
    .line 24
    const/16 v8, 0x8

    .line 25
    .line 26
    .line 27
    invoke-static/range {v1 .. v10}, Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;->create(ILjava/lang/String;IIIIIIII)Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;

    .line 28
    move-result-object p0

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    return-object v0
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
.end method
