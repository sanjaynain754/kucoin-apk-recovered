.class final Landroidx/media3/exoplayer/rtsp/SessionDescription;
.super Ljava/lang/Object;
.source "SessionDescription.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;
    }
.end annotation


# static fields
.field public static final ATTR_CONTROL:Ljava/lang/String; = "control"

.field public static final ATTR_FMTP:Ljava/lang/String; = "fmtp"

.field public static final ATTR_LENGTH:Ljava/lang/String; = "length"

.field public static final ATTR_RANGE:Ljava/lang/String; = "range"

.field public static final ATTR_RTPMAP:Ljava/lang/String; = "rtpmap"

.field public static final ATTR_TOOL:Ljava/lang/String; = "tool"

.field public static final ATTR_TYPE:Ljava/lang/String; = "type"

.field public static final SUPPORTED_SDP_VERSION:Ljava/lang/String; = "0"


# instance fields
.field public final attributes:Lcom/google/common/collect/ImmutableMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/ImmutableMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final bitrate:I

.field public final connection:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final emailAddress:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final key:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final mediaDescriptionList:Lcom/google/common/collect/ImmutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/ImmutableList<",
            "Landroidx/media3/exoplayer/rtsp/MediaDescription;",
            ">;"
        }
    .end annotation
.end field

.field public final origin:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final phoneNumber:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final sessionInfo:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final sessionName:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final timing:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final uri:Landroid/net/Uri;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->access$100(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/collect/ImmutableMap;->copyOf(Ljava/util/Map;)Lcom/google/common/collect/ImmutableMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->attributes:Lcom/google/common/collect/ImmutableMap;

    .line 4
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->access$200(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;)Lcom/google/common/collect/ImmutableList$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/ImmutableList$Builder;->build()Lcom/google/common/collect/ImmutableList;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->mediaDescriptionList:Lcom/google/common/collect/ImmutableList;

    .line 5
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->access$300(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/media3/common/util/Util;->castNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->sessionName:Ljava/lang/String;

    .line 6
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->access$400(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/media3/common/util/Util;->castNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->origin:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->access$500(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/media3/common/util/Util;->castNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->timing:Ljava/lang/String;

    .line 8
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->access$600(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->uri:Landroid/net/Uri;

    .line 9
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->access$700(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->connection:Ljava/lang/String;

    .line 10
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->access$800(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;)I

    move-result v0

    iput v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->bitrate:I

    .line 11
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->access$900(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->key:Ljava/lang/String;

    .line 12
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->access$1000(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->emailAddress:Ljava/lang/String;

    .line 13
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->access$1100(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->phoneNumber:Ljava/lang/String;

    .line 14
    invoke-static {p1}, Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;->access$1200(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->sessionInfo:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;Landroidx/media3/exoplayer/rtsp/SessionDescription$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/rtsp/SessionDescription;-><init>(Landroidx/media3/exoplayer/rtsp/SessionDescription$Builder;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    const-class v3, Landroidx/media3/exoplayer/rtsp/SessionDescription;

    .line 14
    .line 15
    if-eq v3, v2, :cond_1

    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_1
    check-cast p1, Landroidx/media3/exoplayer/rtsp/SessionDescription;

    .line 20
    .line 21
    iget v2, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->bitrate:I

    .line 22
    .line 23
    iget v3, p1, Landroidx/media3/exoplayer/rtsp/SessionDescription;->bitrate:I

    .line 24
    .line 25
    if-ne v2, v3, :cond_2

    .line 26
    .line 27
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->attributes:Lcom/google/common/collect/ImmutableMap;

    .line 28
    .line 29
    iget-object v3, p1, Landroidx/media3/exoplayer/rtsp/SessionDescription;->attributes:Lcom/google/common/collect/ImmutableMap;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Lcom/google/common/collect/ImmutableMap;->equals(Ljava/lang/Object;)Z

    .line 33
    move-result v2

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->mediaDescriptionList:Lcom/google/common/collect/ImmutableList;

    .line 38
    .line 39
    iget-object v3, p1, Landroidx/media3/exoplayer/rtsp/SessionDescription;->mediaDescriptionList:Lcom/google/common/collect/ImmutableList;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lcom/google/common/collect/ImmutableList;->equals(Ljava/lang/Object;)Z

    .line 43
    move-result v2

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->origin:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v3, p1, Landroidx/media3/exoplayer/rtsp/SessionDescription;->origin:Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3}, Landroidx/media3/common/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    move-result v2

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->sessionName:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Landroidx/media3/exoplayer/rtsp/SessionDescription;->sessionName:Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v3}, Landroidx/media3/common/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    move-result v2

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->timing:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v3, p1, Landroidx/media3/exoplayer/rtsp/SessionDescription;->timing:Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    invoke-static {v2, v3}, Landroidx/media3/common/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    move-result v2

    .line 74
    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->sessionInfo:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v3, p1, Landroidx/media3/exoplayer/rtsp/SessionDescription;->sessionInfo:Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    invoke-static {v2, v3}, Landroidx/media3/common/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    move-result v2

    .line 84
    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->uri:Landroid/net/Uri;

    .line 88
    .line 89
    iget-object v3, p1, Landroidx/media3/exoplayer/rtsp/SessionDescription;->uri:Landroid/net/Uri;

    .line 90
    .line 91
    .line 92
    invoke-static {v2, v3}, Landroidx/media3/common/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    move-result v2

    .line 94
    .line 95
    if-eqz v2, :cond_2

    .line 96
    .line 97
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->emailAddress:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v3, p1, Landroidx/media3/exoplayer/rtsp/SessionDescription;->emailAddress:Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    invoke-static {v2, v3}, Landroidx/media3/common/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    move-result v2

    .line 104
    .line 105
    if-eqz v2, :cond_2

    .line 106
    .line 107
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->phoneNumber:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v3, p1, Landroidx/media3/exoplayer/rtsp/SessionDescription;->phoneNumber:Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    invoke-static {v2, v3}, Landroidx/media3/common/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    move-result v2

    .line 114
    .line 115
    if-eqz v2, :cond_2

    .line 116
    .line 117
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->connection:Ljava/lang/String;

    .line 118
    .line 119
    iget-object v3, p1, Landroidx/media3/exoplayer/rtsp/SessionDescription;->connection:Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    invoke-static {v2, v3}, Landroidx/media3/common/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    move-result v2

    .line 124
    .line 125
    if-eqz v2, :cond_2

    .line 126
    .line 127
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->key:Ljava/lang/String;

    .line 128
    .line 129
    iget-object p1, p1, Landroidx/media3/exoplayer/rtsp/SessionDescription;->key:Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    invoke-static {v2, p1}, Landroidx/media3/common/util/Util;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    move-result p1

    .line 134
    .line 135
    if-eqz p1, :cond_2

    .line 136
    return v0

    .line 137
    :cond_2
    :goto_0
    return v1
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
.end method

.method public hashCode()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->attributes:Lcom/google/common/collect/ImmutableMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/common/collect/ImmutableMap;->hashCode()I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0xd9

    .line 9
    add-int/2addr v1, v0

    .line 10
    .line 11
    mul-int/lit8 v1, v1, 0x1f

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->mediaDescriptionList:Lcom/google/common/collect/ImmutableList;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/common/collect/ImmutableList;->hashCode()I

    .line 17
    move-result v0

    .line 18
    add-int/2addr v1, v0

    .line 19
    .line 20
    mul-int/lit8 v1, v1, 0x1f

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->origin:Ljava/lang/String;

    .line 23
    const/4 v2, 0x0

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    move v0, v2

    .line 27
    goto :goto_0

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 31
    move-result v0

    .line 32
    :goto_0
    add-int/2addr v1, v0

    .line 33
    .line 34
    mul-int/lit8 v1, v1, 0x1f

    .line 35
    .line 36
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->sessionName:Ljava/lang/String;

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    move v0, v2

    .line 40
    goto :goto_1

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 44
    move-result v0

    .line 45
    :goto_1
    add-int/2addr v1, v0

    .line 46
    .line 47
    mul-int/lit8 v1, v1, 0x1f

    .line 48
    .line 49
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->timing:Ljava/lang/String;

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    move v0, v2

    .line 53
    goto :goto_2

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 57
    move-result v0

    .line 58
    :goto_2
    add-int/2addr v1, v0

    .line 59
    .line 60
    mul-int/lit8 v1, v1, 0x1f

    .line 61
    .line 62
    iget v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->bitrate:I

    .line 63
    add-int/2addr v1, v0

    .line 64
    .line 65
    mul-int/lit8 v1, v1, 0x1f

    .line 66
    .line 67
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->sessionInfo:Ljava/lang/String;

    .line 68
    .line 69
    if-nez v0, :cond_3

    .line 70
    move v0, v2

    .line 71
    goto :goto_3

    .line 72
    .line 73
    .line 74
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 75
    move-result v0

    .line 76
    :goto_3
    add-int/2addr v1, v0

    .line 77
    .line 78
    mul-int/lit8 v1, v1, 0x1f

    .line 79
    .line 80
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->uri:Landroid/net/Uri;

    .line 81
    .line 82
    if-nez v0, :cond_4

    .line 83
    move v0, v2

    .line 84
    goto :goto_4

    .line 85
    .line 86
    .line 87
    :cond_4
    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    .line 88
    move-result v0

    .line 89
    :goto_4
    add-int/2addr v1, v0

    .line 90
    .line 91
    mul-int/lit8 v1, v1, 0x1f

    .line 92
    .line 93
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->emailAddress:Ljava/lang/String;

    .line 94
    .line 95
    if-nez v0, :cond_5

    .line 96
    move v0, v2

    .line 97
    goto :goto_5

    .line 98
    .line 99
    .line 100
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 101
    move-result v0

    .line 102
    :goto_5
    add-int/2addr v1, v0

    .line 103
    .line 104
    mul-int/lit8 v1, v1, 0x1f

    .line 105
    .line 106
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->phoneNumber:Ljava/lang/String;

    .line 107
    .line 108
    if-nez v0, :cond_6

    .line 109
    move v0, v2

    .line 110
    goto :goto_6

    .line 111
    .line 112
    .line 113
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 114
    move-result v0

    .line 115
    :goto_6
    add-int/2addr v1, v0

    .line 116
    .line 117
    mul-int/lit8 v1, v1, 0x1f

    .line 118
    .line 119
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->connection:Ljava/lang/String;

    .line 120
    .line 121
    if-nez v0, :cond_7

    .line 122
    move v0, v2

    .line 123
    goto :goto_7

    .line 124
    .line 125
    .line 126
    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 127
    move-result v0

    .line 128
    :goto_7
    add-int/2addr v1, v0

    .line 129
    .line 130
    mul-int/lit8 v1, v1, 0x1f

    .line 131
    .line 132
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/SessionDescription;->key:Ljava/lang/String;

    .line 133
    .line 134
    if-nez v0, :cond_8

    .line 135
    goto :goto_8

    .line 136
    .line 137
    .line 138
    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 139
    move-result v2

    .line 140
    :goto_8
    add-int/2addr v1, v2

    .line 141
    return v1
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
.end method
