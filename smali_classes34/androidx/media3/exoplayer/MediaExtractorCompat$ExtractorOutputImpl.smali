.class final Landroidx/media3/exoplayer/MediaExtractorCompat$ExtractorOutputImpl;
.super Ljava/lang/Object;
.source "MediaExtractorCompat.java"

# interfaces
.implements Landroidx/media3/extractor/ExtractorOutput;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/MediaExtractorCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ExtractorOutputImpl"
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media3/exoplayer/MediaExtractorCompat;


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/MediaExtractorCompat;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$ExtractorOutputImpl;->this$0:Landroidx/media3/exoplayer/MediaExtractorCompat;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/exoplayer/MediaExtractorCompat;Landroidx/media3/exoplayer/MediaExtractorCompat$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/MediaExtractorCompat$ExtractorOutputImpl;-><init>(Landroidx/media3/exoplayer/MediaExtractorCompat;)V

    return-void
.end method


# virtual methods
.method public endTracks()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$ExtractorOutputImpl;->this$0:Landroidx/media3/exoplayer/MediaExtractorCompat;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->access$302(Landroidx/media3/exoplayer/MediaExtractorCompat;Z)Z

    .line 7
    return-void
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
.end method

.method public seekMap(Landroidx/media3/extractor/SeekMap;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$ExtractorOutputImpl;->this$0:Landroidx/media3/exoplayer/MediaExtractorCompat;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/MediaExtractorCompat;->access$502(Landroidx/media3/exoplayer/MediaExtractorCompat;Landroidx/media3/extractor/SeekMap;)Landroidx/media3/extractor/SeekMap;

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
.end method

.method public track(II)Landroidx/media3/extractor/TrackOutput;
    .locals 2

    .line 1
    .line 2
    iget-object p2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$ExtractorOutputImpl;->this$0:Landroidx/media3/exoplayer/MediaExtractorCompat;

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Landroidx/media3/exoplayer/MediaExtractorCompat;->access$200(Landroidx/media3/exoplayer/MediaExtractorCompat;)Landroid/util/SparseArray;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    check-cast p2, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    return-object p2

    .line 16
    .line 17
    :cond_0
    iget-object p2, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$ExtractorOutputImpl;->this$0:Landroidx/media3/exoplayer/MediaExtractorCompat;

    .line 18
    .line 19
    .line 20
    invoke-static {p2}, Landroidx/media3/exoplayer/MediaExtractorCompat;->access$300(Landroidx/media3/exoplayer/MediaExtractorCompat;)Z

    .line 21
    move-result p2

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    new-instance p1, Landroidx/media3/extractor/DiscardingTrackOutput;

    .line 26
    .line 27
    .line 28
    invoke-direct {p1}, Landroidx/media3/extractor/DiscardingTrackOutput;-><init>()V

    .line 29
    return-object p1

    .line 30
    .line 31
    :cond_1
    new-instance p2, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;

    .line 32
    .line 33
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$ExtractorOutputImpl;->this$0:Landroidx/media3/exoplayer/MediaExtractorCompat;

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->access$400(Landroidx/media3/exoplayer/MediaExtractorCompat;)Landroidx/media3/exoplayer/upstream/Allocator;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-direct {p2, v0, v1, p1}, Landroidx/media3/exoplayer/MediaExtractorCompat$MediaExtractorSampleQueue;-><init>(Landroidx/media3/exoplayer/MediaExtractorCompat;Landroidx/media3/exoplayer/upstream/Allocator;I)V

    .line 41
    .line 42
    iget-object v0, p0, Landroidx/media3/exoplayer/MediaExtractorCompat$ExtractorOutputImpl;->this$0:Landroidx/media3/exoplayer/MediaExtractorCompat;

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Landroidx/media3/exoplayer/MediaExtractorCompat;->access$200(Landroidx/media3/exoplayer/MediaExtractorCompat;)Landroid/util/SparseArray;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 50
    return-object p2
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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
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
.end method
