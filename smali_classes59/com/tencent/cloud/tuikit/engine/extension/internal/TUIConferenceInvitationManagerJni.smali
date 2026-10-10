.class public Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;
.super Ljava/lang/Object;
.source "TUIConferenceInvitationManagerJni.java"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "tuikit::extension"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$InviteUsersCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$GetInvitationListCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$ActionCallback;
    }
.end annotation


# static fields
.field private static final INVITEE:Ljava/lang/String; = "invitee"

.field private static final INVITER:Ljava/lang/String; = "inviter"

.field private static final TAG:Ljava/lang/String; = "TUIConferenceInvitationManagerJni"


# instance fields
.field private mNativeTUIConferenceInvitationManagerJni:J

.field private final mObserverList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->mObserverList:Ljava/util/List;

    .line 11
    .line 12
    iput-wide p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->mNativeTUIConferenceInvitationManagerJni:J

    .line 13
    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    cmp-long v0, p1, v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2, p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->nativeSetObserver(JLjava/lang/Object;)V

    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method private static convertStringToInvitation(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;-><init>()V

    .line 6
    .line 7
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string/jumbo p0, "status"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 17
    move-result p0

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;->status:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;

    .line 24
    .line 25
    const-string p0, "invitee"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    move-result-object p0

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/common/internal/TUIDefineConvert;->convertStringToUserInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;->invitee:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 36
    .line 37
    const-string p0, "inviter"

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    move-result-object p0

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/common/internal/TUIDefineConvert;->convertStringToUserInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;->inviter:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    return-object v0

    .line 49
    :catch_0
    move-exception p0

    .line 50
    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    const-string v2, "convertStringToInvitation error:"

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    move-result-object p0

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    move-result-object p0

    .line 71
    .line 72
    const-string v1, "TUIConferenceInvitationManagerJni"

    .line 73
    .line 74
    .line 75
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    return-object v0
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method private static convertStringToInvitationList(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 11
    const/4 p0, 0x0

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 15
    move-result v2

    .line 16
    .line 17
    if-ge p0, v2, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->convertStringToInvitation(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    add-int/lit8 p0, p0, 0x1

    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception p0

    .line 33
    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    const-string v2, "convertStringToInvitationList error:"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    move-result-object p0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    move-result-object p0

    .line 54
    .line 55
    const-string v1, "TUIConferenceInvitationManagerJni"

    .line 56
    .line 57
    .line 58
    invoke-static {v1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    :cond_0
    return-object v0
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
.end method

.method private copyOnReadListeners()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->mObserverList:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    return-object v0
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

.method public static createInvitationListResult(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationListResult;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationListResult;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationListResult;-><init>()V

    .line 6
    .line 7
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationListResult;->cursor:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->convertStringToInvitationList(Ljava/lang/String;)Ljava/util/List;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationListResult;->invitationList:Ljava/util/List;

    .line 14
    return-object v0
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
.end method

.method private isInvitationManagerJniNull(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->mNativeTUIConferenceInvitationManagerJni:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 13
    .line 14
    const-string v1, "conferenceListManager is null"

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 18
    :cond_0
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method private static native nativeAccept(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$ActionCallback;)V
.end method

.method private static native nativeCancelInvitation(JLjava/lang/String;[Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$ActionCallback;)V
.end method

.method private static native nativeGetInvitationList(JLjava/lang/String;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$GetInvitationListCallback;)V
.end method

.method private static native nativeInviteUsers(JLjava/lang/String;[Ljava/lang/String;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$InviteUsersCallback;)V
.end method

.method private static native nativeReject(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$ActionCallback;)V
.end method

.method private static native nativeSetObserver(JLjava/lang/Object;)V
.end method


# virtual methods
.method public accept(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->isInvitationManagerJniNull(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->mNativeTUIConferenceInvitationManagerJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->nativeAccept(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$ActionCallback;)V

    .line 18
    return-void
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
.end method

.method public addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->mObserverList:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->mObserverList:Ljava/util/List;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    :cond_1
    :goto_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public cancelInvitation(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3
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

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->isInvitationManagerJniNull(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->mNativeTUIConferenceInvitationManagerJni:J

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    new-array v2, v2, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    check-cast p2, [Ljava/lang/String;

    .line 19
    .line 20
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$ActionCallback;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->nativeCancelInvitation(JLjava/lang/String;[Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$ActionCallback;)V

    .line 27
    return-void
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
.end method

.method public getInvitationList(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$GetInvitationListCallback;)V
    .locals 6

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->mNativeTUIConferenceInvitationManagerJni:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-nez v2, :cond_1

    .line 9
    .line 10
    if-eqz p4, :cond_0

    .line 11
    .line 12
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 13
    .line 14
    const-string p2, "conferenceListManager is null"

    .line 15
    .line 16
    .line 17
    invoke-interface {p4, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$GetInvitationListCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 18
    :cond_0
    return-void

    .line 19
    .line 20
    :cond_1
    new-instance v5, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$GetInvitationListCallback;

    .line 21
    .line 22
    .line 23
    invoke-direct {v5, p4}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$GetInvitationListCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$GetInvitationListCallback;)V

    .line 24
    move-object v2, p1

    .line 25
    move-object v3, p2

    .line 26
    move v4, p3

    .line 27
    .line 28
    .line 29
    invoke-static/range {v0 .. v5}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->nativeGetInvitationList(JLjava/lang/String;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$GetInvitationListCallback;)V

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
.end method

.method public inviteUsers(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InviteUsersCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InviteUsersCallback;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->mNativeTUIConferenceInvitationManagerJni:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-nez v2, :cond_1

    .line 9
    .line 10
    if-eqz p5, :cond_0

    .line 11
    .line 12
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 13
    .line 14
    const-string p2, "conferenceListManager is null"

    .line 15
    .line 16
    .line 17
    invoke-interface {p5, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InviteUsersCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    const/4 v2, 0x0

    .line 20
    .line 21
    new-array v2, v2, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-interface {p2, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 25
    move-result-object p2

    .line 26
    move-object v3, p2

    .line 27
    .line 28
    check-cast v3, [Ljava/lang/String;

    .line 29
    .line 30
    new-instance v6, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$InviteUsersCallback;

    .line 31
    .line 32
    .line 33
    invoke-direct {v6, p5}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$InviteUsersCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InviteUsersCallback;)V

    .line 34
    move-object v2, p1

    .line 35
    move v4, p3

    .line 36
    move-object v5, p4

    .line 37
    .line 38
    .line 39
    invoke-static/range {v0 .. v6}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->nativeInviteUsers(JLjava/lang/String;[Ljava/lang/String;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$InviteUsersCallback;)V

    .line 40
    return-void
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
.end method

.method public onInvitationAccepted(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/common/internal/TUIDefineConvert;->convertStringToRoomInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->convertStringToInvitation(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;->onInvitationAccepted(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onInvitationAdded(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->convertStringToInvitation(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;->onInvitationAdded(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onInvitationCancelled(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/common/internal/TUIDefineConvert;->convertStringToRoomInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->convertStringToInvitation(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;->onInvitationCancelled(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onInvitationHandledByOtherDevice(Ljava/lang/String;Z)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/common/internal/TUIDefineConvert;->convertStringToRoomInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;->onInvitationHandledByOtherDevice(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Z)V

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onInvitationRejected(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/common/internal/TUIDefineConvert;->convertStringToRoomInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->convertStringToInvitation(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;

    .line 29
    .line 30
    .line 31
    invoke-static {p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$RejectedReason;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$RejectedReason;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;->onInvitationRejected(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$RejectedReason;)V

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
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
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public onInvitationRemoved(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->convertStringToInvitation(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;->onInvitationRemoved(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onInvitationRevokedByAdmin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/common/internal/TUIDefineConvert;->convertStringToRoomInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->convertStringToInvitation(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-static {p3}, Lcom/tencent/cloud/tuikit/engine/common/internal/TUIDefineConvert;->convertStringToUserInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 12
    move-result-object p3

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    move-result v1

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;->onInvitationRevokedByAdmin(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
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
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public onInvitationStatusChanged(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->convertStringToInvitation(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;->onInvitationStatusChanged(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onInvitationTimeout(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/common/internal/TUIDefineConvert;->convertStringToRoomInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->convertStringToInvitation(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;->onInvitationTimeout(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;)V

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onReceiveInvitation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/common/internal/TUIDefineConvert;->convertStringToRoomInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->convertStringToInvitation(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;->onReceiveInvitation(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;Ljava/lang/String;)V

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
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
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public reject(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$RejectedReason;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->isInvitationManagerJniNull(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->mNativeTUIConferenceInvitationManagerJni:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$RejectedReason;->getValue()I

    .line 13
    move-result p2

    .line 14
    .line 15
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$ActionCallback;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->nativeReject(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni$ActionCallback;)V

    .line 22
    return-void
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
.end method

.method public removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;)V
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceInvitationManagerJni;->mObserverList:Ljava/util/List;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
