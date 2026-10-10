.class final Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;
.super Ljava/lang/Object;
.source "RtspMessageChannel.java"

# interfaces
.implements Landroidx/media3/exoplayer/upstream/Loader$Loadable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Receiver"
.end annotation


# static fields
.field private static final INTERLEAVED_MESSAGE_MARKER:B = 0x24t


# instance fields
.field private final dataInputStream:Ljava/io/DataInputStream;

.field private volatile loadCanceled:Z

.field private final messageParser:Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$MessageParser;

.field final synthetic this$0:Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;Ljava/io/InputStream;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->this$0:Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    new-instance p1, Ljava/io/DataInputStream;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1, p2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 11
    .line 12
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->dataInputStream:Ljava/io/DataInputStream;

    .line 13
    .line 14
    new-instance p1, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$MessageParser;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1}, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$MessageParser;-><init>()V

    .line 18
    .line 19
    iput-object p1, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->messageParser:Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$MessageParser;

    .line 20
    return-void
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
.end method

.method private handleInterleavedBinaryData()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->dataInputStream:Ljava/io/DataInputStream;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->dataInputStream:Ljava/io/DataInputStream;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    .line 12
    move-result v1

    .line 13
    .line 14
    new-array v2, v1, [B

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->dataInputStream:Ljava/io/DataInputStream;

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v2, v4, v1}, Ljava/io/DataInputStream;->readFully([BII)V

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->this$0:Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;->access$300(Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;)Ljava/util/Map;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    check-cast v0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$InterleavedBinaryDataListener;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->this$0:Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;->access$100(Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;)Z

    .line 44
    move-result v1

    .line 45
    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, v2}, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$InterleavedBinaryDataListener;->onInterleavedBinaryDataReceived([B)V

    .line 50
    :cond_0
    return-void
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

.method private handleRtspMessage(B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->this$0:Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;->access$100(Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->this$0:Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;->access$200(Landroidx/media3/exoplayer/rtsp/RtspMessageChannel;)Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$MessageListener;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->messageParser:Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$MessageParser;

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->dataInputStream:Ljava/io/DataInputStream;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1, v2}, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$MessageParser;->parseNext(BLjava/io/DataInputStream;)Lcom/google/common/collect/ImmutableList;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$MessageListener;->onRtspMessageReceived(Ljava/util/List;)V

    .line 26
    :cond_0
    return-void
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
.end method


# virtual methods
.method public cancelLoad()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->loadCanceled:Z

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
.end method

.method public load()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :goto_0
    iget-boolean v0, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->loadCanceled:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->dataInputStream:Ljava/io/DataInputStream;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readByte()B

    .line 10
    move-result v0

    .line 11
    .line 12
    const/16 v1, 0x24

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->handleInterleavedBinaryData()V

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/rtsp/RtspMessageChannel$Receiver;->handleRtspMessage(B)V

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
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
.end method
