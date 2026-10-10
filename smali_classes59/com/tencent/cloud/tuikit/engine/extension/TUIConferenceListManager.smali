.class public abstract Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;
.super Ljava/lang/Object;
.source "TUIConferenceListManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchConferenceInfoCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledConferenceListCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledAttendeesCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledConferenceListResult;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledAttendeesResult;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceCancelReason;,
        Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public abstract addAttendeesByAdmin(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;)V
.end method

.method public abstract cancelConference(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract fetchAttendeeList(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledAttendeesCallback;)V
.end method

.method public abstract fetchConferenceInfo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchConferenceInfoCallback;)V
.end method

.method public abstract fetchScheduledConferenceList(Ljava/util/List;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledConferenceListCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;",
            ">;",
            "Ljava/lang/String;",
            "I",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledConferenceListCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract removeAttendeesByAdmin(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;)V
.end method

.method public abstract scheduleConference(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract transferConferenceOwner(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
.end method

.method public abstract updateConferenceInfo(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation
.end method
