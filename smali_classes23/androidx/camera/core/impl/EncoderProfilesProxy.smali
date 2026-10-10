.class public interface abstract Landroidx/camera/core/impl/EncoderProfilesProxy;
.super Ljava/lang/Object;
.source "EncoderProfilesProxy.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;,
        Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;,
        Landroidx/camera/core/impl/EncoderProfilesProxy$ImmutableEncoderProfilesProxy;
    }
.end annotation


# static fields
.field public static final CODEC_PROFILE_NONE:I = -0x1


# direct methods
.method public static getAudioCodecMimeType(I)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    const-string p0, "audio/none"

    .line 6
    return-object p0

    .line 7
    .line 8
    :pswitch_0
    const-string p0, "audio/opus"

    .line 9
    return-object p0

    .line 10
    .line 11
    :pswitch_1
    const-string p0, "audio/vorbis"

    .line 12
    return-object p0

    .line 13
    .line 14
    :pswitch_2
    const-string p0, "audio/mp4a-latm"

    .line 15
    return-object p0

    .line 16
    .line 17
    :pswitch_3
    const-string p0, "audio/amr-wb"

    .line 18
    return-object p0

    .line 19
    .line 20
    :pswitch_4
    const-string p0, "audio/3gpp"

    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    .line 24
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static getRequiredAudioProfile(I)I
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    .line 3
    if-eq p0, v0, :cond_2

    .line 4
    const/4 v0, 0x4

    .line 5
    const/4 v1, 0x5

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    if-eq p0, v1, :cond_0

    .line 10
    const/4 p0, -0x1

    .line 11
    return p0

    .line 12
    .line 13
    :cond_0
    const/16 p0, 0x27

    .line 14
    return p0

    .line 15
    :cond_1
    return v1

    .line 16
    :cond_2
    const/4 p0, 0x2

    .line 17
    return p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static getVideoCodecMimeType(I)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string/jumbo p0, "video/none"

    .line 7
    return-object p0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    const-string/jumbo p0, "video/av01"

    .line 11
    return-object p0

    .line 12
    .line 13
    .line 14
    :pswitch_1
    const-string/jumbo p0, "video/dolby-vision"

    .line 15
    return-object p0

    .line 16
    .line 17
    .line 18
    :pswitch_2
    const-string/jumbo p0, "video/x-vnd.on2.vp9"

    .line 19
    return-object p0

    .line 20
    .line 21
    .line 22
    :pswitch_3
    const-string/jumbo p0, "video/hevc"

    .line 23
    return-object p0

    .line 24
    .line 25
    .line 26
    :pswitch_4
    const-string/jumbo p0, "video/x-vnd.on2.vp8"

    .line 27
    return-object p0

    .line 28
    .line 29
    .line 30
    :pswitch_5
    const-string/jumbo p0, "video/mp4v-es"

    .line 31
    return-object p0

    .line 32
    .line 33
    .line 34
    :pswitch_6
    const-string/jumbo p0, "video/avc"

    .line 35
    return-object p0

    .line 36
    .line 37
    .line 38
    :pswitch_7
    const-string/jumbo p0, "video/3gpp"

    .line 39
    return-object p0

    .line 40
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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


# virtual methods
.method public abstract getAudioProfiles()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getDefaultDurationSeconds()I
.end method

.method public abstract getRecommendedFileFormat()I
.end method

.method public abstract getVideoProfiles()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;",
            ">;"
        }
    .end annotation
.end method
