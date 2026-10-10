.class public Landroidx/camera/view/video/AudioConfig;
.super Ljava/lang/Object;
.source "AudioConfig.java"


# static fields
.field public static final AUDIO_DISABLED:Landroidx/camera/view/video/AudioConfig;


# instance fields
.field private final mIsAudioEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/view/video/AudioConfig;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Landroidx/camera/view/video/AudioConfig;-><init>(Z)V

    .line 7
    .line 8
    sput-object v0, Landroidx/camera/view/video/AudioConfig;->AUDIO_DISABLED:Landroidx/camera/view/video/AudioConfig;

    .line 9
    return-void
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

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-boolean p1, p0, Landroidx/camera/view/video/AudioConfig;->mIsAudioEnabled:Z

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

.method public static create(Z)Landroidx/camera/view/video/AudioConfig;
    .locals 1
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.RECORD_AUDIO"
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/view/video/AudioConfig;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Landroidx/camera/view/video/AudioConfig;-><init>(Z)V

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
.end method


# virtual methods
.method public getAudioEnabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/camera/view/video/AudioConfig;->mIsAudioEnabled:Z

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
.end method
