.class Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput$1;
.super Landroidx/media3/extractor/ForwardingSeekMap;
.source "StartOffsetExtractorOutput.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput;->seekMap(Landroidx/media3/extractor/SeekMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput;

.field final synthetic val$seekMap:Landroidx/media3/extractor/SeekMap;


# direct methods
.method public constructor <init>(Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput;Landroidx/media3/extractor/SeekMap;Landroidx/media3/extractor/SeekMap;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput$1;->this$0:Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput;

    .line 3
    .line 4
    iput-object p3, p0, Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput$1;->val$seekMap:Landroidx/media3/extractor/SeekMap;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Landroidx/media3/extractor/ForwardingSeekMap;-><init>(Landroidx/media3/extractor/SeekMap;)V

    .line 8
    return-void
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
.end method


# virtual methods
.method public getSeekPoints(J)Landroidx/media3/extractor/SeekMap$SeekPoints;
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput$1;->val$seekMap:Landroidx/media3/extractor/SeekMap;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Landroidx/media3/extractor/SeekMap;->getSeekPoints(J)Landroidx/media3/extractor/SeekMap$SeekPoints;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    new-instance p2, Landroidx/media3/extractor/SeekMap$SeekPoints;

    .line 9
    .line 10
    new-instance v0, Landroidx/media3/extractor/SeekPoint;

    .line 11
    .line 12
    iget-object v1, p1, Landroidx/media3/extractor/SeekMap$SeekPoints;->first:Landroidx/media3/extractor/SeekPoint;

    .line 13
    .line 14
    iget-wide v2, v1, Landroidx/media3/extractor/SeekPoint;->timeUs:J

    .line 15
    .line 16
    iget-wide v4, v1, Landroidx/media3/extractor/SeekPoint;->position:J

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput$1;->this$0:Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput;

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput;->access$000(Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput;)J

    .line 22
    move-result-wide v6

    .line 23
    add-long/2addr v4, v6

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v2, v3, v4, v5}, Landroidx/media3/extractor/SeekPoint;-><init>(JJ)V

    .line 27
    .line 28
    new-instance v1, Landroidx/media3/extractor/SeekPoint;

    .line 29
    .line 30
    iget-object p1, p1, Landroidx/media3/extractor/SeekMap$SeekPoints;->second:Landroidx/media3/extractor/SeekPoint;

    .line 31
    .line 32
    iget-wide v2, p1, Landroidx/media3/extractor/SeekPoint;->timeUs:J

    .line 33
    .line 34
    iget-wide v4, p1, Landroidx/media3/extractor/SeekPoint;->position:J

    .line 35
    .line 36
    iget-object p1, p0, Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput$1;->this$0:Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput;

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput;->access$000(Landroidx/media3/extractor/jpeg/StartOffsetExtractorOutput;)J

    .line 40
    move-result-wide v6

    .line 41
    add-long/2addr v4, v6

    .line 42
    .line 43
    .line 44
    invoke-direct {v1, v2, v3, v4, v5}, Landroidx/media3/extractor/SeekPoint;-><init>(JJ)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p2, v0, v1}, Landroidx/media3/extractor/SeekMap$SeekPoints;-><init>(Landroidx/media3/extractor/SeekPoint;Landroidx/media3/extractor/SeekPoint;)V

    .line 48
    return-object p2
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
