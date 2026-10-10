.class public final Landroidx/media3/extractor/mp4/Track;
.super Ljava/lang/Object;
.source "Track.java"


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/extractor/mp4/Track$Transformation;
    }
.end annotation


# static fields
.field public static final TRANSFORMATION_CEA608_CDAT:I = 0x1

.field public static final TRANSFORMATION_NONE:I


# instance fields
.field public final durationUs:J

.field public final editListDurations:[J
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final editListMediaTimes:[J
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final format:Landroidx/media3/common/Format;

.field public final id:I

.field public final mediaDurationUs:J

.field public final movieTimescale:J

.field public final nalUnitLengthFieldLength:I

.field private final sampleDescriptionEncryptionBoxes:[Landroidx/media3/extractor/mp4/TrackEncryptionBox;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final sampleTransformation:I

.field public final timescale:J

.field public final type:I


# direct methods
.method public constructor <init>(IIJJJJLandroidx/media3/common/Format;I[Landroidx/media3/extractor/mp4/TrackEncryptionBox;I[J[J)V
    .locals 0
    .param p13    # [Landroidx/media3/extractor/mp4/TrackEncryptionBox;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p15    # [J
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p16    # [J
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Landroidx/media3/extractor/mp4/Track;->id:I

    .line 6
    .line 7
    iput p2, p0, Landroidx/media3/extractor/mp4/Track;->type:I

    .line 8
    .line 9
    iput-wide p3, p0, Landroidx/media3/extractor/mp4/Track;->timescale:J

    .line 10
    .line 11
    iput-wide p5, p0, Landroidx/media3/extractor/mp4/Track;->movieTimescale:J

    .line 12
    .line 13
    iput-wide p7, p0, Landroidx/media3/extractor/mp4/Track;->durationUs:J

    .line 14
    .line 15
    iput-wide p9, p0, Landroidx/media3/extractor/mp4/Track;->mediaDurationUs:J

    .line 16
    .line 17
    iput-object p11, p0, Landroidx/media3/extractor/mp4/Track;->format:Landroidx/media3/common/Format;

    .line 18
    .line 19
    iput p12, p0, Landroidx/media3/extractor/mp4/Track;->sampleTransformation:I

    .line 20
    .line 21
    iput-object p13, p0, Landroidx/media3/extractor/mp4/Track;->sampleDescriptionEncryptionBoxes:[Landroidx/media3/extractor/mp4/TrackEncryptionBox;

    .line 22
    .line 23
    iput p14, p0, Landroidx/media3/extractor/mp4/Track;->nalUnitLengthFieldLength:I

    .line 24
    .line 25
    iput-object p15, p0, Landroidx/media3/extractor/mp4/Track;->editListDurations:[J

    .line 26
    .line 27
    move-object/from16 p1, p16

    .line 28
    .line 29
    iput-object p1, p0, Landroidx/media3/extractor/mp4/Track;->editListMediaTimes:[J

    .line 30
    return-void
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
.end method


# virtual methods
.method public copyWithFormat(Landroidx/media3/common/Format;)Landroidx/media3/extractor/mp4/Track;
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Landroidx/media3/extractor/mp4/Track;

    .line 5
    .line 6
    iget v2, v0, Landroidx/media3/extractor/mp4/Track;->id:I

    .line 7
    .line 8
    iget v3, v0, Landroidx/media3/extractor/mp4/Track;->type:I

    .line 9
    .line 10
    iget-wide v4, v0, Landroidx/media3/extractor/mp4/Track;->timescale:J

    .line 11
    .line 12
    iget-wide v6, v0, Landroidx/media3/extractor/mp4/Track;->movieTimescale:J

    .line 13
    .line 14
    iget-wide v8, v0, Landroidx/media3/extractor/mp4/Track;->durationUs:J

    .line 15
    .line 16
    iget-wide v10, v0, Landroidx/media3/extractor/mp4/Track;->mediaDurationUs:J

    .line 17
    .line 18
    iget v13, v0, Landroidx/media3/extractor/mp4/Track;->sampleTransformation:I

    .line 19
    .line 20
    iget-object v14, v0, Landroidx/media3/extractor/mp4/Track;->sampleDescriptionEncryptionBoxes:[Landroidx/media3/extractor/mp4/TrackEncryptionBox;

    .line 21
    .line 22
    iget v15, v0, Landroidx/media3/extractor/mp4/Track;->nalUnitLengthFieldLength:I

    .line 23
    .line 24
    iget-object v12, v0, Landroidx/media3/extractor/mp4/Track;->editListDurations:[J

    .line 25
    .line 26
    move-object/from16 v16, v1

    .line 27
    .line 28
    iget-object v1, v0, Landroidx/media3/extractor/mp4/Track;->editListMediaTimes:[J

    .line 29
    .line 30
    move-object/from16 v17, v1

    .line 31
    .line 32
    move-object/from16 v1, v16

    .line 33
    .line 34
    move-object/from16 v16, v12

    .line 35
    .line 36
    move-object/from16 v12, p1

    .line 37
    .line 38
    .line 39
    invoke-direct/range {v1 .. v17}, Landroidx/media3/extractor/mp4/Track;-><init>(IIJJJJLandroidx/media3/common/Format;I[Landroidx/media3/extractor/mp4/TrackEncryptionBox;I[J[J)V

    .line 40
    .line 41
    move-object/from16 v16, v1

    .line 42
    return-object v16
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
.end method

.method public copyWithoutEditLists()Landroidx/media3/extractor/mp4/Track;
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Landroidx/media3/extractor/mp4/Track;

    .line 5
    .line 6
    iget v2, v0, Landroidx/media3/extractor/mp4/Track;->id:I

    .line 7
    .line 8
    iget v3, v0, Landroidx/media3/extractor/mp4/Track;->type:I

    .line 9
    .line 10
    iget-wide v4, v0, Landroidx/media3/extractor/mp4/Track;->timescale:J

    .line 11
    .line 12
    iget-wide v6, v0, Landroidx/media3/extractor/mp4/Track;->movieTimescale:J

    .line 13
    .line 14
    iget-wide v8, v0, Landroidx/media3/extractor/mp4/Track;->durationUs:J

    .line 15
    .line 16
    iget-wide v10, v0, Landroidx/media3/extractor/mp4/Track;->mediaDurationUs:J

    .line 17
    .line 18
    iget-object v12, v0, Landroidx/media3/extractor/mp4/Track;->format:Landroidx/media3/common/Format;

    .line 19
    .line 20
    iget v13, v0, Landroidx/media3/extractor/mp4/Track;->sampleTransformation:I

    .line 21
    .line 22
    iget-object v14, v0, Landroidx/media3/extractor/mp4/Track;->sampleDescriptionEncryptionBoxes:[Landroidx/media3/extractor/mp4/TrackEncryptionBox;

    .line 23
    .line 24
    iget v15, v0, Landroidx/media3/extractor/mp4/Track;->nalUnitLengthFieldLength:I

    .line 25
    .line 26
    const/16 v16, 0x0

    .line 27
    .line 28
    const/16 v17, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct/range {v1 .. v17}, Landroidx/media3/extractor/mp4/Track;-><init>(IIJJJJLandroidx/media3/common/Format;I[Landroidx/media3/extractor/mp4/TrackEncryptionBox;I[J[J)V

    .line 32
    return-object v1
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
.end method

.method public getSampleDescriptionEncryptionBox(I)Landroidx/media3/extractor/mp4/TrackEncryptionBox;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/extractor/mp4/Track;->sampleDescriptionEncryptionBoxes:[Landroidx/media3/extractor/mp4/TrackEncryptionBox;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    .line 8
    :cond_0
    aget-object p1, v0, p1

    .line 9
    return-object p1
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
.end method
