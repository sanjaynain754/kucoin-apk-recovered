.class Landroidx/media3/common/ForwardingSimpleBasePlayer$1;
.super Ljava/lang/Object;
.source "ForwardingSimpleBasePlayer.java"

# interfaces
.implements Landroidx/media3/common/Player$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/common/ForwardingSimpleBasePlayer;-><init>(Landroidx/media3/common/Player;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/media3/common/ForwardingSimpleBasePlayer;

.field final synthetic val$player:Landroidx/media3/common/Player;


# direct methods
.method public constructor <init>(Landroidx/media3/common/ForwardingSimpleBasePlayer;Landroidx/media3/common/Player;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$1;->this$0:Landroidx/media3/common/ForwardingSimpleBasePlayer;

    .line 3
    .line 4
    iput-object p2, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$1;->val$player:Landroidx/media3/common/Player;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public onEvents(Landroidx/media3/common/Player;Landroidx/media3/common/Player$Events;)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$1;->this$0:Landroidx/media3/common/ForwardingSimpleBasePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/media3/common/SimpleBasePlayer;->invalidateState()V

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

.method public onMetadata(Landroidx/media3/common/Metadata;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$1;->this$0:Landroidx/media3/common/ForwardingSimpleBasePlayer;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Landroidx/media3/common/ForwardingSimpleBasePlayer;->access$002(Landroidx/media3/common/ForwardingSimpleBasePlayer;Landroidx/media3/common/Metadata;)Landroidx/media3/common/Metadata;

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

.method public onPlayWhenReadyChanged(ZI)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$1;->this$0:Landroidx/media3/common/ForwardingSimpleBasePlayer;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Landroidx/media3/common/ForwardingSimpleBasePlayer;->access$102(Landroidx/media3/common/ForwardingSimpleBasePlayer;I)I

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

.method public onPositionDiscontinuity(Landroidx/media3/common/Player$PositionInfo;Landroidx/media3/common/Player$PositionInfo;I)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$1;->this$0:Landroidx/media3/common/ForwardingSimpleBasePlayer;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p3}, Landroidx/media3/common/ForwardingSimpleBasePlayer;->access$202(Landroidx/media3/common/ForwardingSimpleBasePlayer;I)I

    .line 6
    .line 7
    iget-object p3, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$1;->this$0:Landroidx/media3/common/ForwardingSimpleBasePlayer;

    .line 8
    .line 9
    iget-wide v0, p2, Landroidx/media3/common/Player$PositionInfo;->positionMs:J

    .line 10
    .line 11
    .line 12
    invoke-static {p3, v0, v1}, Landroidx/media3/common/ForwardingSimpleBasePlayer;->access$302(Landroidx/media3/common/ForwardingSimpleBasePlayer;J)J

    .line 13
    .line 14
    iget-object p2, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$1;->this$0:Landroidx/media3/common/ForwardingSimpleBasePlayer;

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Landroidx/media3/common/ForwardingSimpleBasePlayer;->access$400(Landroidx/media3/common/ForwardingSimpleBasePlayer;)Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    iget-wide v0, p1, Landroidx/media3/common/Player$PositionInfo;->positionMs:J

    .line 21
    .line 22
    iget-wide v2, p1, Landroidx/media3/common/Player$PositionInfo;->contentPositionMs:J

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, v0, v1, v2, v3}, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;->setConstant(JJ)V

    .line 26
    .line 27
    iget-object p1, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$1;->this$0:Landroidx/media3/common/ForwardingSimpleBasePlayer;

    .line 28
    .line 29
    new-instance p2, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;

    .line 30
    .line 31
    iget-object p3, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$1;->val$player:Landroidx/media3/common/Player;

    .line 32
    .line 33
    .line 34
    invoke-direct {p2, p3}, Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;-><init>(Landroidx/media3/common/Player;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2}, Landroidx/media3/common/ForwardingSimpleBasePlayer;->access$402(Landroidx/media3/common/ForwardingSimpleBasePlayer;Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;)Landroidx/media3/common/ForwardingSimpleBasePlayer$ForwardingPositionSupplier;

    .line 38
    return-void
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

.method public onRenderedFirstFrame()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/common/ForwardingSimpleBasePlayer$1;->this$0:Landroidx/media3/common/ForwardingSimpleBasePlayer;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroidx/media3/common/ForwardingSimpleBasePlayer;->access$502(Landroidx/media3/common/ForwardingSimpleBasePlayer;Z)Z

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
