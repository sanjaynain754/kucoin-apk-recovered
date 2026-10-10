.class final Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;
.super Ljava/lang/Object;
.source "ForwardingSimpleBasePlayer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/common/ForwardingSimpleBasePlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ForwardingPositionSupplier"
.end annotation


# instance fields
.field private contentPositionMs:J

.field private final player:Landroidx/media3/common/Player;

.field private positionsMs:J


# direct methods
.method public constructor <init>(Landroidx/media3/common/Player;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->player:Landroidx/media3/common/Player;

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    iput-wide v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->positionsMs:J

    .line 13
    .line 14
    iput-wide v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->contentPositionMs:J

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public getBufferedPositionMs()J
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->positionsMs:J

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->player:Landroidx/media3/common/Player;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Landroidx/media3/common/Player;->getBufferedPosition()J

    .line 17
    move-result-wide v0

    .line 18
    :cond_0
    return-wide v0
.end method

.method public getContentBufferedPositionMs()J
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->contentPositionMs:J

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->player:Landroidx/media3/common/Player;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Landroidx/media3/common/Player;->getContentBufferedPosition()J

    .line 17
    move-result-wide v0

    .line 18
    :cond_0
    return-wide v0
.end method

.method public getContentPositionMs()J
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->contentPositionMs:J

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->player:Landroidx/media3/common/Player;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Landroidx/media3/common/Player;->getContentPosition()J

    .line 17
    move-result-wide v0

    .line 18
    :cond_0
    return-wide v0
.end method

.method public getCurrentPositionMs()J
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->positionsMs:J

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->player:Landroidx/media3/common/Player;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Landroidx/media3/common/Player;->getCurrentPosition()J

    .line 17
    move-result-wide v0

    .line 18
    :cond_0
    return-wide v0
.end method

.method public getTotalBufferedDurationMs()J
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->positionsMs:J

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->player:Landroidx/media3/common/Player;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Landroidx/media3/common/Player;->getTotalBufferedDuration()J

    .line 17
    move-result-wide v0

    .line 18
    return-wide v0

    .line 19
    .line 20
    :cond_0
    const-wide/16 v0, 0x0

    .line 21
    return-wide v0
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
.end method

.method public setConstant(JJ)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->positionsMs:J

    .line 3
    .line 4
    iput-wide p3, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->contentPositionMs:J

    .line 5
    return-void
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
