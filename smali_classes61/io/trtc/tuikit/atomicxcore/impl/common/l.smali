.class public abstract Lio/trtc/tuikit/atomicxcore/impl/common/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/tencent/imsdk/v2/V2TIMMessage;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;
    .locals 62

    move-object/from16 v0, p0

    const-string v1, "imMessage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getSender()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, v1

    .line 6
    :goto_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getNickName()Ljava/lang/String;

    move-result-object v6

    .line 7
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getFaceUrl()Ljava/lang/String;

    move-result-object v5

    .line 8
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getFriendRemark()Ljava/lang/String;

    move-result-object v7

    .line 9
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getNameCard()Ljava/lang/String;

    move-result-object v8

    .line 10
    new-instance v3, Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;

    invoke-direct/range {v3 .. v8}, Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getMsgID()Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->hasRiskContent()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 13
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;->VIOLATION:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    :goto_1
    move-object v7, v4

    goto :goto_2

    .line 14
    :cond_1
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getStatus()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    .line 15
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;->INIT:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    goto :goto_1

    .line 16
    :pswitch_0
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;->RECALLED:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    goto :goto_1

    .line 17
    :pswitch_1
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;->LOCAL_IMPORTED:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    goto :goto_1

    .line 18
    :pswitch_2
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;->DELETED:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    goto :goto_1

    .line 19
    :pswitch_3
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;->SEND_FAIL:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    goto :goto_1

    .line 20
    :pswitch_4
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;->SEND_SUCCESS:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    goto :goto_1

    .line 21
    :pswitch_5
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;->SENDING:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    goto :goto_1

    .line 22
    :goto_2
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getSender()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    move-result-object v5

    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    move-result-object v5

    invoke-interface {v5}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_2
    const/4 v5, 0x0

    :goto_3
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    move-object v5, v3

    move v3, v4

    .line 23
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getUserID()Ljava/lang/String;

    move-result-object v4

    move-object v8, v5

    .line 24
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getGroupID()Ljava/lang/String;

    move-result-object v5

    .line 25
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getTimestamp()J

    move-result-wide v9

    .line 26
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->isNeedReadReceipt()Z

    move-result v13

    .line 27
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->isSupportMessageExtension()Z

    move-result v15

    move-wide v10, v9

    .line 28
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getGroupAtUserList()Ljava/util/List;

    move-result-object v9

    .line 29
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getStatus()I

    move-result v12

    const/4 v14, 0x6

    if-ne v12, v14, :cond_3

    .line 30
    sget-object v12, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->SYSTEM:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    goto :goto_4

    .line 31
    :cond_3
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    move-result v12

    packed-switch v12, :pswitch_data_1

    .line 32
    :pswitch_6
    sget-object v12, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->UNKNOWN:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    goto :goto_4

    .line 33
    :pswitch_7
    sget-object v12, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->MERGED:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    goto :goto_4

    .line 34
    :pswitch_8
    sget-object v12, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->SYSTEM:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    goto :goto_4

    .line 35
    :pswitch_9
    sget-object v12, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->FACE:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    goto :goto_4

    .line 36
    :pswitch_a
    sget-object v12, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->FILE:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    goto :goto_4

    .line 37
    :pswitch_b
    sget-object v12, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->VIDEO:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    goto :goto_4

    .line 38
    :pswitch_c
    sget-object v12, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->SOUND:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    goto :goto_4

    .line 39
    :pswitch_d
    sget-object v12, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->IMAGE:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    goto :goto_4

    .line 40
    :pswitch_e
    sget-object v12, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->CUSTOM:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    goto :goto_4

    .line 41
    :pswitch_f
    sget-object v12, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->TEXT:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 42
    :goto_4
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getStatus()I

    move-result v6

    if-ne v6, v14, :cond_4

    .line 43
    new-instance v17, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    const/4 v2, 0x0

    .line 44
    invoke-static {v0, v2, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lcom/tencent/imsdk/v2/V2TIMMessage;Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$RecallMessage;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v46

    const v49, 0x6fffffff

    const/16 v50, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    .line 45
    invoke-direct/range {v17 .. v50}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_5
    move-object/from16 v60, v1

    move/from16 v61, v3

    move-object/from16 v23, v5

    move-object/from16 v6, v17

    move-object/from16 v17, v4

    goto/16 :goto_25

    .line 46
    :cond_4
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    move-result v6

    packed-switch v6, :pswitch_data_2

    :cond_5
    :goto_6
    :pswitch_10
    move-object/from16 v60, v1

    move/from16 v61, v3

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    :goto_7
    const/4 v14, 0x0

    goto/16 :goto_22

    .line 47
    :pswitch_11
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getMergerElem()Lcom/tencent/imsdk/v2/V2TIMMergerElem;

    move-result-object v6

    if-nez v6, :cond_6

    goto :goto_6

    .line 48
    :cond_6
    new-instance v17, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 49
    new-instance v14, Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;

    .line 50
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMMergerElem;->getTitle()Ljava/lang/String;

    move-result-object v16

    if-nez v16, :cond_7

    goto :goto_8

    :cond_7
    move-object/from16 v2, v16

    .line 51
    :goto_8
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMMergerElem;->getAbstractList()Ljava/util/List;

    move-result-object v6

    .line 52
    invoke-direct {v14, v2, v6}, Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;-><init>(Ljava/lang/String;Ljava/util/List;)V

    const v49, 0x3fffffff    # 1.9999999f

    const/16 v50, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    move-object/from16 v48, v14

    .line 53
    invoke-direct/range {v17 .. v50}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    .line 54
    :pswitch_12
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getGroupTipsElem()Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;

    move-result-object v6

    if-nez v6, :cond_8

    goto :goto_6

    .line 55
    :cond_8
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getType()I

    move-result v14

    const/4 v0, 0x1

    if-eq v14, v0, :cond_9

    .line 56
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getType()I

    move-result v0

    const/4 v14, 0x2

    if-eq v0, v14, :cond_9

    .line 57
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getType()I

    move-result v0

    const/4 v14, 0x4

    if-eq v0, v14, :cond_9

    .line 58
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getType()I

    move-result v0

    const/4 v14, 0x7

    if-eq v0, v14, :cond_9

    .line 59
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getType()I

    move-result v0

    const/4 v14, 0x3

    if-eq v0, v14, :cond_9

    .line 60
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getType()I

    move-result v0

    const/16 v14, 0xa

    if-eq v0, v14, :cond_9

    .line 61
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getType()I

    move-result v0

    const/16 v14, 0xb

    if-eq v0, v14, :cond_9

    .line 62
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getType()I

    move-result v0

    const/16 v14, 0x8

    if-eq v0, v14, :cond_9

    .line 63
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getType()I

    move-result v0

    const/4 v14, 0x5

    if-eq v0, v14, :cond_9

    .line 64
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getType()I

    move-result v0

    const/4 v14, 0x6

    if-ne v0, v14, :cond_5

    .line 65
    :cond_9
    new-instance v26, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 66
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getGroupID()Ljava/lang/String;

    move-result-object v0

    .line 67
    const-string/jumbo v14, "tipsElem"

    invoke-static {v6, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getOpMember()Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;

    move-result-object v14

    invoke-static {v14}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v17, v0

    .line 69
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getMemberList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_a

    .line 70
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object/from16 v60, v1

    move/from16 v61, v3

    goto :goto_a

    :cond_a
    move-object/from16 v60, v1

    .line 71
    new-instance v1, Ljava/util/ArrayList;

    move/from16 v61, v3

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 73
    check-cast v3, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;

    .line 74
    invoke-static {v3}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;)Ljava/lang/String;

    move-result-object v3

    .line 75
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_b
    move-object v0, v1

    :goto_a
    if-nez v17, :cond_c

    move-object v1, v2

    goto :goto_b

    :cond_c
    move-object/from16 v1, v17

    .line 76
    :goto_b
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getType()I

    move-result v3

    packed-switch v3, :pswitch_data_3

    .line 77
    :pswitch_13
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_c
    move-object/from16 v55, v0

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    goto/16 :goto_1a

    .line 78
    :pswitch_14
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$UnpinGroupMessage;

    invoke-direct {v0, v1, v14}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$UnpinGroupMessage;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_c

    .line 80
    :pswitch_15
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$PinGroupMessage;

    invoke-direct {v0, v1, v14}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$PinGroupMessage;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_c

    .line 82
    :pswitch_16
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getMemberChangeInfoList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 83
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_d

    goto/16 :goto_11

    .line 84
    :cond_d
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/imsdk/v2/V2TIMGroupMemberChangeInfo;

    .line 85
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberChangeInfo;->getUserID()Ljava/lang/String;

    move-result-object v3

    .line 86
    sget-object v17, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    invoke-virtual/range {v17 .. v17}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    move-result-object v17

    invoke-interface/range {v17 .. v17}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    if-eqz v17, :cond_e

    invoke-virtual/range {v17 .. v17}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v17, v0

    move-object/from16 v0, v16

    goto :goto_d

    :cond_e
    move-object/from16 v17, v0

    const/4 v0, 0x0

    .line 87
    :goto_d
    new-instance v27, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$MuteGroupMember;

    .line 88
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v30

    if-nez v3, :cond_10

    :cond_f
    :goto_e
    move-object/from16 v31, v2

    goto :goto_10

    .line 89
    :cond_10
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getMemberList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 90
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;

    move-object/from16 v16, v0

    .line 91
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 92
    invoke-static {v6}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;)Ljava/lang/String;

    move-result-object v2

    goto :goto_e

    :cond_11
    move-object/from16 v0, v16

    goto :goto_f

    .line 93
    :goto_10
    invoke-virtual/range {v17 .. v17}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberChangeInfo;->getMuteTime()J

    move-result-wide v32

    move-object/from16 v28, v1

    move-object/from16 v29, v14

    .line 94
    invoke-direct/range {v27 .. v33}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$MuteGroupMember;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V

    .line 95
    invoke-static/range {v27 .. v27}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_c

    .line 96
    :cond_12
    :goto_11
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    goto/16 :goto_c

    .line 97
    :pswitch_17
    const-string v3, "groupID"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "opUser"

    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "userList"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "tips"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 99
    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMGroupTipsElem;->getGroupChangeInfoList()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_28

    .line 100
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_28

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;

    move-object/from16 v27, v0

    .line 101
    invoke-virtual/range {v16 .. v16}, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->getType()I

    move-result v0

    move-object/from16 v17, v4

    const-string v4, "getValue(...)"

    move-object/from16 v23, v5

    const/4 v5, 0x1

    if-eq v0, v5, :cond_26

    const/4 v5, 0x2

    if-eq v0, v5, :cond_24

    const/4 v5, 0x3

    if-eq v0, v5, :cond_22

    const/4 v4, 0x4

    if-eq v0, v4, :cond_20

    const/4 v5, 0x5

    if-eq v0, v5, :cond_1d

    const/16 v5, 0x8

    if-eq v0, v5, :cond_1c

    const/16 v5, 0xb

    if-eq v0, v5, :cond_18

    const/16 v4, 0xc

    if-eq v0, v4, :cond_14

    :cond_13
    :goto_13
    move-object/from16 v4, v17

    move-object/from16 v5, v23

    move-object/from16 v0, v27

    goto :goto_12

    .line 102
    :cond_14
    invoke-virtual/range {v16 .. v16}, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->getIntValue()I

    move-result v0

    if-eqz v0, :cond_17

    const/4 v4, 0x1

    if-eq v0, v4, :cond_16

    const/4 v4, 0x2

    if-eq v0, v4, :cond_15

    .line 103
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;->ANY:Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;

    goto :goto_14

    .line 104
    :cond_15
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;->ANY:Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;

    goto :goto_14

    .line 105
    :cond_16
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;->AUTH:Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;

    goto :goto_14

    .line 106
    :cond_17
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;->FORBID:Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;

    .line 107
    :goto_14
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeInviteToGroupApproval;

    invoke-direct {v4, v1, v14, v0}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeInviteToGroupApproval;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;)V

    .line 108
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    .line 109
    :cond_18
    invoke-virtual/range {v16 .. v16}, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->getIntValue()I

    move-result v0

    if-eqz v0, :cond_1b

    const/4 v4, 0x1

    if-eq v0, v4, :cond_1a

    const/4 v4, 0x2

    if-eq v0, v4, :cond_19

    .line 110
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;->ANY:Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;

    goto :goto_15

    .line 111
    :cond_19
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;->ANY:Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;

    goto :goto_15

    .line 112
    :cond_1a
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;->AUTH:Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;

    goto :goto_15

    .line 113
    :cond_1b
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;->FORBID:Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;

    .line 114
    :goto_15
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeJoinGroupApproval;

    invoke-direct {v4, v1, v14, v0}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeJoinGroupApproval;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;)V

    .line 115
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_1c
    const/16 v5, 0xb

    .line 116
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupMuteAll;

    .line 117
    invoke-virtual/range {v16 .. v16}, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->getBoolValue()Z

    move-result v4

    .line 118
    invoke-direct {v0, v1, v14, v4}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupMuteAll;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 119
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_1d
    const/16 v5, 0xb

    .line 120
    invoke-interface/range {v27 .. v27}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1e

    invoke-static/range {v27 .. v27}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_16

    :cond_1e
    invoke-virtual/range {v16 .. v16}, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->getValue()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1f

    move-object v0, v2

    goto :goto_16

    :cond_1f
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 121
    :goto_16
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupOwner;

    invoke-direct {v4, v1, v14, v0}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupOwner;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_20
    const/16 v5, 0xb

    .line 123
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupAvatar;

    .line 124
    invoke-virtual/range {v16 .. v16}, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->getValue()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_21

    move-object v4, v2

    goto :goto_17

    :cond_21
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 125
    :goto_17
    invoke-direct {v0, v1, v14, v4}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupAvatar;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_13

    :cond_22
    const/16 v5, 0xb

    .line 127
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupNotification;

    .line 128
    invoke-virtual/range {v16 .. v16}, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->getValue()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_23

    move-object v4, v2

    goto :goto_18

    :cond_23
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 129
    :goto_18
    invoke-direct {v0, v1, v14, v4}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupNotification;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_13

    :cond_24
    const/16 v5, 0xb

    const/16 v25, 0x4

    .line 131
    invoke-virtual/range {v16 .. v16}, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->getValue()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_25

    goto/16 :goto_13

    .line 132
    :cond_25
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupIntroduction;

    .line 133
    invoke-virtual/range {v16 .. v16}, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    invoke-direct {v0, v1, v14, v5}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupIntroduction;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_13

    :cond_26
    const/16 v25, 0x4

    .line 136
    invoke-virtual/range {v16 .. v16}, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->getValue()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_27

    goto/16 :goto_13

    .line 137
    :cond_27
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupName;

    .line 138
    invoke-virtual/range {v16 .. v16}, Lcom/tencent/imsdk/v2/V2TIMGroupChangeInfo;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    invoke-direct {v0, v1, v14, v5}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$ChangeGroupName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_13

    :cond_28
    move-object/from16 v17, v4

    move-object/from16 v23, v5

    move-object/from16 v55, v3

    goto/16 :goto_1a

    :pswitch_18
    move-object/from16 v27, v0

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    const/16 v34, 0x3e

    const/16 v35, 0x0

    .line 141
    const-string/jumbo v28, "\u3001"

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-static/range {v27 .. v35}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 142
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$CancelGroupAdmin;

    invoke-direct {v2, v1, v14, v0}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$CancelGroupAdmin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_19
    move-object/from16 v55, v0

    goto/16 :goto_1a

    :pswitch_19
    move-object/from16 v27, v0

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    const/16 v34, 0x3e

    const/16 v35, 0x0

    .line 144
    const-string/jumbo v28, "\u3001"

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-static/range {v27 .. v35}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 145
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$SetGroupAdmin;

    invoke-direct {v2, v1, v14, v0}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$SetGroupAdmin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_19

    :pswitch_1a
    move-object/from16 v27, v0

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    const/16 v34, 0x3e

    const/16 v35, 0x0

    .line 147
    const-string/jumbo v28, "\u3001"

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-static/range {v27 .. v35}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 148
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$KickedFromGroup;

    invoke-direct {v2, v1, v14, v0}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$KickedFromGroup;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_19

    :pswitch_1b
    move-object/from16 v17, v4

    move-object/from16 v23, v5

    .line 150
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$QuitGroup;

    invoke-direct {v0, v1, v14}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$QuitGroup;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_19

    :pswitch_1c
    move-object/from16 v27, v0

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    const/16 v34, 0x3e

    const/16 v35, 0x0

    .line 151
    const-string/jumbo v28, "\u3001"

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-static/range {v27 .. v35}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 152
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$InviteToGroup;

    invoke-direct {v2, v1, v14, v0}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$InviteToGroup;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_19

    :pswitch_1d
    move-object/from16 v27, v0

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    .line 154
    invoke-interface/range {v27 .. v27}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_29

    const/16 v34, 0x3e

    const/16 v35, 0x0

    const-string v28, ", "

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-static/range {v27 .. v35}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 155
    :cond_29
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$JoinGroup;

    invoke-direct {v0, v1, v14}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$JoinGroup;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_19

    :goto_1a
    const v58, 0x6fffffff

    const/16 v59, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    .line 156
    invoke-direct/range {v26 .. v59}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v26

    goto/16 :goto_25

    :pswitch_1e
    move-object/from16 v60, v1

    move/from16 v61, v3

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    .line 157
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getFaceElem()Lcom/tencent/imsdk/v2/V2TIMFaceElem;

    move-result-object v0

    if-nez v0, :cond_2a

    :goto_1b
    goto/16 :goto_7

    .line 158
    :cond_2a
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMFaceElem;->getIndex()I

    move-result v51

    .line 159
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMFaceElem;->getData()[B

    move-result-object v0

    if-eqz v0, :cond_2b

    .line 160
    new-instance v6, Ljava/lang/String;

    .line 161
    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v6, v0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object/from16 v52, v6

    goto :goto_1c

    :cond_2b
    const/16 v52, 0x0

    .line 162
    :goto_1c
    new-instance v24, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    const v56, 0x73ffffff

    const/16 v57, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    invoke-direct/range {v24 .. v57}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1d
    move-object/from16 v6, v24

    goto/16 :goto_25

    :pswitch_1f
    move-object/from16 v60, v1

    move/from16 v61, v3

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    .line 163
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getFileElem()Lcom/tencent/imsdk/v2/V2TIMFileElem;

    move-result-object v0

    if-nez v0, :cond_2c

    :goto_1e
    goto :goto_1b

    .line 164
    :cond_2c
    new-instance v24, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 165
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMFileElem;->getFileName()Ljava/lang/String;

    move-result-object v49

    .line 166
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMFileElem;->getFileSize()I

    move-result v50

    const v56, 0x7cffffff

    const/16 v57, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    .line 167
    invoke-direct/range {v24 .. v57}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v24

    .line 168
    new-instance v2, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 169
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->FILE:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 170
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMFileElem;->getPath()Ljava/lang/String;

    move-result-object v4

    .line 171
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMFileElem;->getUUID()Ljava/lang/String;

    move-result-object v5

    .line 172
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMFileElem;->getFileName()Ljava/lang/String;

    move-result-object v0

    .line 173
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/common/h;

    invoke-direct {v6, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/h;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    invoke-static {v3, v4, v5, v0, v6}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v0

    .line 174
    iget-boolean v2, v2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v2, :cond_2f

    .line 175
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->setFilePath(Ljava/lang/String;)V

    goto/16 :goto_1f

    :pswitch_20
    move-object/from16 v60, v1

    move/from16 v61, v3

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    .line 176
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getVideoElem()Lcom/tencent/imsdk/v2/V2TIMVideoElem;

    move-result-object v0

    if-nez v0, :cond_2d

    goto/16 :goto_1e

    .line 177
    :cond_2d
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;->getVideoSize()I

    move-result v36

    .line 178
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;->getDuration()I

    move-result v37

    .line 179
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;->getSnapshotSize()I

    move-result v41

    .line 180
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;->getSnapshotWidth()I

    move-result v39

    .line 181
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;->getSnapshotHeight()I

    move-result v40

    .line 182
    new-instance v24, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    const v56, 0x7ffe27ff

    const/16 v57, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    invoke-direct/range {v24 .. v57}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v24

    .line 183
    new-instance v2, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 184
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->VIDEO:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 185
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;->getSnapshotPath()Ljava/lang/String;

    move-result-object v4

    .line 186
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;->getSnapshotUUID()Ljava/lang/String;

    move-result-object v5

    .line 187
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/common/i;

    invoke-direct {v6, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/i;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    const/4 v14, 0x0

    invoke-static {v3, v4, v5, v14, v6}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v4

    .line 188
    iget-boolean v2, v2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v2, :cond_2e

    .line 189
    invoke-virtual {v1, v4}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->setVideoSnapshotPath(Ljava/lang/String;)V

    .line 190
    :cond_2e
    new-instance v2, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 191
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;->getVideoPath()Ljava/lang/String;

    move-result-object v4

    .line 192
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;->getVideoUUID()Ljava/lang/String;

    move-result-object v0

    .line 193
    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/common/j;

    invoke-direct {v5, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/j;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    const/4 v14, 0x0

    invoke-static {v3, v4, v0, v14, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v0

    .line 194
    iget-boolean v2, v2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v2, :cond_2f

    .line 195
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->setVideoPath(Ljava/lang/String;)V

    :cond_2f
    :goto_1f
    move-object v6, v1

    goto/16 :goto_25

    :pswitch_21
    move-object/from16 v60, v1

    move/from16 v61, v3

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    const/4 v14, 0x0

    .line 196
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getSoundElem()Lcom/tencent/imsdk/v2/V2TIMSoundElem;

    move-result-object v0

    if-nez v0, :cond_30

    goto/16 :goto_22

    .line 197
    :cond_30
    new-instance v24, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 198
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMSoundElem;->getDataSize()I

    move-result v43

    .line 199
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMSoundElem;->getDuration()I

    move-result v44

    const v56, 0x7ff3ffff

    const/16 v57, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    .line 200
    invoke-direct/range {v24 .. v57}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v24

    .line 201
    new-instance v3, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 202
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->SOUND:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 203
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMSoundElem;->getPath()Ljava/lang/String;

    move-result-object v5

    .line 204
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMSoundElem;->getUUID()Ljava/lang/String;

    move-result-object v0

    .line 205
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/common/g;

    invoke-direct {v6, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/g;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    const-string v14, "amr"

    invoke-static {v4, v5, v0, v14, v6}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v0

    .line 206
    iget-boolean v3, v3, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v3, :cond_31

    .line 207
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->setSoundPath(Ljava/lang/String;)V

    .line 208
    :cond_31
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getLocalCustomData()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2f

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 209
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 210
    const-string/jumbo v0, "voice_to_text"

    invoke-virtual {v3, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 211
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_32

    .line 212
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->setAsrText(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    :catch_0
    :cond_32
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_1f

    :pswitch_22
    move-object/from16 v60, v1

    move/from16 v61, v3

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    const/4 v14, 0x0

    .line 214
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getImageElem()Lcom/tencent/imsdk/v2/V2TIMImageElem;

    move-result-object v0

    if-nez v0, :cond_33

    goto/16 :goto_22

    .line 215
    :cond_33
    new-instance v24, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    const v56, 0x7fffffff

    const/16 v57, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    invoke-direct/range {v24 .. v57}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v24

    .line 216
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMImageElem;->getImageList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_20
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;

    .line 217
    new-instance v4, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 218
    sget-object v5, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->IMAGE:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 219
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMImageElem;->getPath()Ljava/lang/String;

    move-result-object v6

    .line 220
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getUUID()Ljava/lang/String;

    move-result-object v14

    .line 221
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getType()I

    move-result v16

    move-object/from16 v20, v0

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v16, v2

    .line 222
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/k;

    invoke-direct {v2, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/k;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    invoke-static {v5, v6, v14, v0, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v0

    .line 223
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getType()I

    move-result v2

    if-nez v2, :cond_36

    .line 224
    iget-boolean v2, v4, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v2, :cond_34

    .line 225
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->setOriginalImagePath(Ljava/lang/String;)V

    .line 226
    :cond_34
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getSize()I

    move-result v0

    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->setOriginalImageSize(I)V

    .line 227
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getWidth()I

    move-result v0

    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->setOriginalImageWidth(I)V

    .line 228
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getHeight()I

    move-result v0

    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->setOriginalImageHeight(I)V

    :cond_35
    :goto_21
    move-object/from16 v2, v16

    move-object/from16 v0, v20

    goto :goto_20

    .line 229
    :cond_36
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getType()I

    move-result v2

    const/4 v5, 0x1

    if-ne v2, v5, :cond_37

    .line 230
    iget-boolean v2, v4, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v2, :cond_35

    .line 231
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->setThumbImagePath(Ljava/lang/String;)V

    goto :goto_21

    .line 232
    :cond_37
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getType()I

    move-result v2

    const/4 v14, 0x2

    if-ne v2, v14, :cond_35

    .line 233
    iget-boolean v2, v4, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v2, :cond_35

    .line 234
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->setLargeImagePath(Ljava/lang/String;)V

    goto :goto_21

    :pswitch_23
    move-object/from16 v60, v1

    move/from16 v61, v3

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    const/4 v14, 0x0

    .line 235
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getCustomElem()Lcom/tencent/imsdk/v2/V2TIMCustomElem;

    move-result-object v0

    if-nez v0, :cond_38

    :goto_22
    move-object v6, v14

    goto/16 :goto_25

    .line 236
    :cond_38
    new-instance v24, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 237
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;

    .line 238
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMCustomElem;->getData()[B

    move-result-object v2

    .line 239
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMCustomElem;->getDescription()Ljava/lang/String;

    move-result-object v3

    .line 240
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMCustomElem;->getExtension()[B

    move-result-object v0

    .line 241
    invoke-direct {v1, v2, v3, v0}, Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;-><init>([BLjava/lang/String;[B)V

    const v56, 0x5fffffff

    const/16 v57, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    move-object/from16 v54, v1

    .line 242
    invoke-direct/range {v24 .. v57}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1d

    :pswitch_24
    move-object/from16 v60, v1

    move/from16 v61, v3

    move-object/from16 v17, v4

    move-object/from16 v23, v5

    const/4 v14, 0x0

    .line 243
    new-instance v25, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 244
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getTextElem()Lcom/tencent/imsdk/v2/V2TIMTextElem;

    move-result-object v0

    if-eqz v0, :cond_39

    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMTextElem;->getText()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v26, v6

    goto :goto_23

    :cond_39
    move-object/from16 v26, v14

    :goto_23
    const v57, 0x7ffffffe

    const/16 v58, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    .line 245
    invoke-direct/range {v25 .. v58}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v25

    .line 246
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getLocalCustomData()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3d

    .line 247
    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 248
    const-string/jumbo v0, "text_translation"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_3b

    .line 249
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v3

    if-lez v3, :cond_3b

    .line 250
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 251
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v4

    .line 252
    :goto_24
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3a

    .line 253
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 254
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v5, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v16, v0

    const-string v0, "optString(...)"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v5, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v16

    goto :goto_24

    .line 255
    :cond_3a
    invoke-virtual {v6, v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->setTranslatedText(Ljava/util/Map;)V

    .line 256
    :cond_3b
    const-string/jumbo v0, "text_translation_language"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 257
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3c

    .line 258
    invoke-virtual {v6, v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->setTranslateLanguage(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 259
    :catch_1
    :cond_3c
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 260
    :cond_3d
    :goto_25
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 261
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 262
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v5, v23

    const v23, 0x1fa280

    const/16 v24, 0x0

    move-object v3, v8

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v4, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v22, p0

    move-object v2, v3

    move-object v11, v12

    move/from16 v3, v61

    move-object v12, v6

    move-object v6, v1

    move-object/from16 v1, v60

    .line 263
    invoke-direct/range {v0 .. v24}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_6
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_10
        :pswitch_1e
        :pswitch_12
        :pswitch_11
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_13
        :pswitch_15
        :pswitch_14
    .end packed-switch
.end method

.method public static a(Lcom/tencent/imsdk/v2/V2TIMMessage;Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$RecallMessage;
    .locals 10

    const-string v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getRevokerInfo()Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getRevokerInfo()Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    move-result-object p1

    .line 284
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getSender()Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    if-nez v0, :cond_3

    move-object v0, v2

    :cond_3
    if-eqz p1, :cond_4

    .line 285
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getNickName()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_4
    move-object v3, v1

    :goto_2
    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_5

    goto :goto_3

    :cond_5
    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getNickName()Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_6
    :goto_3
    if-eqz p1, :cond_7

    .line 286
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_7
    move-object v3, v1

    :goto_4
    if-eqz v3, :cond_a

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_8

    goto :goto_5

    :cond_8
    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_9
    move-object v3, v1

    goto :goto_7

    .line 287
    :cond_a
    :goto_5
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getNickName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getNickName()Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    .line 288
    :cond_c
    :goto_6
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getSender()Ljava/lang/String;

    move-result-object v3

    :goto_7
    if-nez v3, :cond_d

    move-object v6, v2

    goto :goto_8

    :cond_d
    move-object v6, v3

    .line 289
    :goto_8
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getGroupID()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_e

    goto :goto_9

    :cond_e
    move v3, v4

    goto :goto_a

    :cond_f
    :goto_9
    move v3, v5

    :goto_a
    xor-int/lit8 v8, v3, 0x1

    if-eqz p1, :cond_10

    .line 290
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v3

    goto :goto_b

    :cond_10
    move-object v3, v1

    :goto_b
    if-eqz v3, :cond_14

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_11

    goto :goto_d

    :cond_11
    if-eqz p1, :cond_12

    .line 291
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getUserID()Ljava/lang/String;

    move-result-object v1

    :cond_12
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->isSelf()Z

    move-result p1

    if-eqz p1, :cond_13

    move v7, v5

    goto :goto_e

    :cond_13
    :goto_c
    move v7, v4

    goto :goto_e

    .line 292
    :cond_14
    :goto_d
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->isSelf()Z

    move-result v4

    goto :goto_c

    .line 293
    :goto_e
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$RecallMessage;

    .line 294
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getGroupID()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_15

    move-object v5, v2

    goto :goto_f

    :cond_15
    move-object v5, p0

    :goto_f
    if-nez p2, :cond_16

    move-object v9, v2

    goto :goto_10

    :cond_16
    move-object v9, p2

    .line 295
    :goto_10
    invoke-direct/range {v4 .. v9}, Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$RecallMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V

    return-object v4
.end method

.method public static a(Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    .line 1
    const-string p0, ""

    return-object p0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->getNameCard()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->getNameCard()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p0

    .line 3
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->getNickName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->getNickName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p0

    .line 4
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->getUserID()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getUserID(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static a(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;
    .locals 10

    const-string v0, "messageType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "isLocalExistRef"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/tencent/imsdk/common/IMContext;->getInstance()Lcom/tencent/imsdk/common/IMContext;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/imsdk/common/IMContext;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/atomicx_core_data"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 266
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/common/f;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v1, v2

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    const-string v7, "/file/"

    if-eq v2, v3, :cond_1

    .line 267
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 268
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 269
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/voice/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 270
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/video/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 271
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/image/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    const-string v2, ""

    const/4 v7, 0x0

    if-eqz p1, :cond_6

    .line 272
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_5

    goto :goto_2

    .line 273
    :cond_5
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 274
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    move-result v8

    if-eqz v8, :cond_7

    move v7, v6

    goto :goto_3

    :cond_6
    :goto_2
    move-object p1, v2

    :cond_7
    :goto_3
    if-nez v7, :cond_12

    .line 275
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    if-eq p0, v6, :cond_d

    if-eq p0, v5, :cond_b

    if-eq p0, v4, :cond_b

    if-eq p0, v3, :cond_8

    goto :goto_4

    .line 276
    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p2, :cond_9

    move-object p2, v2

    :cond_9
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p3, :cond_a

    move-object p3, v2

    :cond_a
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    .line 277
    :cond_b
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p2, :cond_c

    move-object p2, v2

    :cond_c
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz p3, :cond_10

    .line 278
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    .line 279
    :cond_d
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p2, :cond_e

    move-object p2, v2

    :cond_e
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x5f

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-nez p3, :cond_f

    move-object p3, v2

    :cond_f
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 280
    :cond_10
    :goto_4
    new-instance p0, Ljava/io/File;

    invoke-direct {p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 281
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result p0

    if-eqz p0, :cond_11

    move-object p1, v2

    goto :goto_5

    :cond_11
    move-object p1, v2

    :cond_12
    move v6, v7

    .line 282
    :goto_5
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p4, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method
