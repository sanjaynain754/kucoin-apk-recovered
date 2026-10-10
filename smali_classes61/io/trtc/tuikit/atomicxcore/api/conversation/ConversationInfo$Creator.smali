.class public final Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
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
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;
    .locals 21
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p1

    .line 1
    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;->valueOf(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;

    move-result-object v1

    move-object v4, v1

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_1

    move-object v5, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;->valueOf(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;

    move-result-object v1

    move-object v5, v1

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_2

    move-object v1, v2

    goto :goto_2

    :cond_2
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_2
    move-object v8, v1

    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v10

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v12

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v14

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;->valueOf(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    move-result-object v16

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v17

    if-nez v17, :cond_4

    move v13, v1

    goto :goto_5

    :cond_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v2}, Ljava/util/ArrayList;-><init>(I)V

    move/from16 v18, v1

    const/4 v1, 0x0

    :goto_4
    if-eq v1, v2, :cond_5

    move/from16 v19, v1

    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/conversation/GroupAtInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v19, 0x1

    goto :goto_4

    :cond_5
    move-object v2, v13

    move/from16 v13, v18

    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v18

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v19, v2

    const/4 v2, 0x0

    :goto_6
    if-eq v2, v1, :cond_6

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v17

    move/from16 v20, v1

    invoke-static/range {v17 .. v17}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->valueOf(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    move/from16 v1, v20

    goto :goto_6

    :cond_6
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v1

    move-object/from16 v20, v1

    check-cast v20, Lcom/tencent/imsdk/v2/V2TIMConversation;

    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    move-object/from16 v17, v19

    move-object/from16 v19, v0

    invoke-direct/range {v2 .. v20}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;JIZJLio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMConversation;)V

    return-object v2
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo$Creator;->createFromParcel(Landroid/os/Parcel;)Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-array p1, p1, [Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo$Creator;->newArray(I)[Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    move-result-object p1

    return-object p1
.end method
