.class public final Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;
    .locals 25
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

    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v5, 0x1

    if-eqz v1, :cond_0

    move v1, v5

    goto :goto_0

    :cond_0
    move v1, v5

    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    const/4 v9, 0x0

    if-nez v8, :cond_1

    move-object v8, v9

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;->valueOf(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    move-result-object v10

    move-object v11, v9

    move-object v9, v10

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v10

    move-object v12, v11

    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v11

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-eqz v13, :cond_2

    move-object v13, v12

    move v12, v1

    goto :goto_2

    :cond_2
    move-object v13, v12

    const/4 v12, 0x0

    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->valueOf(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    move-result-object v14

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v15

    if-nez v15, :cond_3

    move-object v15, v13

    goto :goto_3

    :cond_3
    sget-object v15, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v15, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v15

    :goto_3
    check-cast v15, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v16

    if-eqz v16, :cond_4

    move-object/from16 v16, v13

    move-object v13, v14

    move-object v14, v15

    move v15, v1

    goto :goto_4

    :cond_4
    move-object/from16 v16, v13

    move-object v13, v14

    move-object v14, v15

    const/4 v15, 0x0

    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v17

    if-nez v17, :cond_5

    move-object/from16 v1, v16

    goto :goto_5

    :cond_5
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_5
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v18

    if-eqz v18, :cond_6

    const/16 v17, 0x1

    goto :goto_6

    :cond_6
    const/16 v17, 0x0

    :goto_6
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    move-object/from16 v19, v1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v20, v3

    const/4 v3, 0x0

    :goto_7
    if-eq v3, v2, :cond_7

    move/from16 v21, v2

    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageExtension;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    move/from16 v2, v21

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v21, v1

    const/4 v1, 0x0

    :goto_8
    if-eq v1, v2, :cond_8

    move/from16 v18, v1

    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/message/MessageReaction;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v18, 0x1

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_9

    move-object/from16 v1, v16

    goto :goto_9

    :cond_9
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_9
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    move-object/from16 v18, v21

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v21

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_a

    move-object/from16 v2, v16

    goto :goto_a

    :cond_a
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_a
    move-object/from16 v22, v2

    check-cast v22, Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_b

    goto :goto_b

    :cond_b
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    :goto_b
    move-object/from16 v23, v16

    check-cast v23, Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;

    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Lcom/tencent/imsdk/v2/V2TIMMessage;

    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-object/from16 v16, v19

    move-object/from16 v19, v3

    move-object/from16 v3, v20

    move-object/from16 v20, v1

    invoke-direct/range {v2 .. v24}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;)V

    return-object v2
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo$Creator;->createFromParcel(Landroid/os/Parcel;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-array p1, p1, [Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo$Creator;->newArray(I)[Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object p1

    return-object p1
.end method
