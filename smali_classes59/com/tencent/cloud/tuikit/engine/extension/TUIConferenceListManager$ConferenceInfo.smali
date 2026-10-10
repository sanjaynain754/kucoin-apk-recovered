.class public Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;
.super Ljava/lang/Object;
.source "TUIConferenceListManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ConferenceInfo"
.end annotation


# instance fields
.field public basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

.field public reminderSecondsBeforeStart:I

.field public scheduleAttendees:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public scheduleEndTime:J

.field public scheduleStartTime:J

.field public status:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->scheduleAttendees:Ljava/util/List;

    .line 11
    .line 12
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;->NONE:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->status:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;

    .line 15
    return-void
    .line 16
    .line 17
.end method
