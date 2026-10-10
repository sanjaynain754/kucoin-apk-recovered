.class public final Lio/trtc/tuikit/atomicxcore/impl/message/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/impl/common/u;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/message/r0;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/message/r0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/n0;->a:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 70

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "name"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "data"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of v3, v2, Ljava/util/Map;

    if-eqz v3, :cond_0

    check-cast v2, Ljava/util/Map;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 2
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const-string v5, "conversationID"

    const/16 v6, 0xa

    const-string v7, "messageID"

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_32

    :sswitch_0
    const-string v3, "onMessageSendBegin"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6a

    .line 3
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/message/n0;->a:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    .line 4
    iget-object v3, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->b:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    .line 5
    sget-object v6, Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;->HISTORY:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    if-ne v3, v6, :cond_6a

    if-nez v2, :cond_1

    goto/16 :goto_32

    .line 6
    :cond_1
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_2

    check-cast v3, Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_3

    goto/16 :goto_32

    .line 7
    :cond_3
    const-string v5, "message"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    if-eqz v5, :cond_4

    move-object v4, v2

    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_5

    goto/16 :goto_32

    .line 8
    :cond_5
    iget-object v2, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a:Ljava/lang/String;

    .line 9
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_32

    .line 10
    :cond_6
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    move-result-object v2

    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;->INIT:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    if-eq v2, v3, :cond_a

    .line 11
    iget-object v2, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 12
    :cond_7
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 13
    move-object v5, v3

    check-cast v5, Ljava/util/List;

    .line 14
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 15
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 16
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    .line 17
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 18
    :cond_9
    invoke-interface {v2, v3, v6}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 19
    :cond_a
    iget-object v2, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 20
    :cond_b
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 21
    move-object v5, v3

    check-cast v5, Ljava/util/List;

    .line 22
    invoke-static {v5, v4}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 23
    invoke-interface {v2, v3, v5}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 24
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$SendMessage;

    invoke-direct {v2, v4}, Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$SendMessage;-><init>(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;)V

    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent;)V

    return-void

    .line 25
    :sswitch_1
    const-string v3, "onConversationHistoryMessageCleared"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto/16 :goto_32

    .line 26
    :cond_c
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/message/n0;->a:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    invoke-static {v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Ljava/util/Map;)V

    return-void

    .line 27
    :sswitch_2
    const-string v3, "onMessageSendFailed"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_32

    .line 28
    :cond_d
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/message/n0;->a:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    .line 29
    iget-object v3, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->b:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    .line 30
    sget-object v8, Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;->HISTORY:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    if-ne v3, v8, :cond_6a

    if-nez v2, :cond_e

    goto/16 :goto_32

    .line 31
    :cond_e
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_f

    check-cast v3, Ljava/lang/String;

    goto :goto_4

    :cond_f
    const/4 v3, 0x0

    :goto_4
    if-nez v3, :cond_10

    goto/16 :goto_32

    .line 32
    :cond_10
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Ljava/lang/String;

    if-eqz v5, :cond_11

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    goto :goto_5

    :cond_11
    const/4 v4, 0x0

    :goto_5
    if-nez v4, :cond_12

    goto/16 :goto_32

    .line 33
    :cond_12
    iget-object v2, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a:Ljava/lang/String;

    .line 34
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto/16 :goto_32

    .line 35
    :cond_13
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 36
    :cond_14
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 37
    move-object v3, v2

    check-cast v3, Ljava/util/List;

    .line 38
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 40
    move-object v8, v7

    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 41
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_15

    .line 42
    sget-object v15, Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;->SEND_FAIL:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    const v31, 0x3fffbf

    const/16 v32, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

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

    invoke-static/range {v8 .. v32}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object v8

    .line 43
    :cond_15
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 44
    :cond_16
    invoke-interface {v1, v2, v5}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    goto/16 :goto_32

    .line 45
    :sswitch_3
    const-string v3, "onMessageTranslated"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    goto/16 :goto_32

    .line 46
    :cond_17
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/message/n0;->a:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    .line 47
    iget-object v3, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->b:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    .line 48
    sget-object v5, Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;->HISTORY:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    if-ne v3, v5, :cond_6a

    if-nez v2, :cond_18

    goto/16 :goto_32

    .line 49
    :cond_18
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_19

    check-cast v3, Ljava/lang/String;

    goto :goto_7

    :cond_19
    const/4 v3, 0x0

    :goto_7
    if-nez v3, :cond_1a

    goto/16 :goto_32

    .line 50
    :cond_1a
    const-string/jumbo v5, "targetLanguage"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/String;

    if-eqz v7, :cond_1b

    check-cast v5, Ljava/lang/String;

    move-object v9, v5

    goto :goto_8

    :cond_1b
    const/4 v9, 0x0

    :goto_8
    if-nez v9, :cond_1c

    goto/16 :goto_32

    .line 51
    :cond_1c
    const-string/jumbo v5, "translatedTextMap"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Ljava/util/Map;

    if-eqz v5, :cond_1d

    check-cast v2, Ljava/util/Map;

    goto :goto_9

    :cond_1d
    const/4 v2, 0x0

    :goto_9
    if-nez v2, :cond_1e

    goto/16 :goto_32

    .line 52
    :cond_1e
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 53
    :cond_1f
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 54
    move-object v7, v5

    check-cast v7, Ljava/util/List;

    .line 55
    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v41

    :goto_a
    invoke-interface/range {v41 .. v41}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_28

    invoke-interface/range {v41 .. v41}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 57
    move-object/from16 v42, v7

    check-cast v42, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 58
    invoke-virtual/range {v42 .. v42}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_27

    .line 59
    invoke-virtual/range {v42 .. v42}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageBody()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    move-result-object v7

    if-eqz v7, :cond_21

    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->getTranslatedText()Ljava/util/Map;

    move-result-object v7

    if-eqz v7, :cond_21

    invoke-static {v7}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    if-nez v7, :cond_20

    goto :goto_c

    :cond_20
    :goto_b
    move-object v10, v7

    goto :goto_d

    :cond_21
    :goto_c
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    goto :goto_b

    .line 60
    :goto_d
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_22

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 61
    invoke-interface {v10, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    .line 62
    :cond_22
    invoke-virtual/range {v42 .. v42}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageBody()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    move-result-object v7

    if-eqz v7, :cond_23

    const v39, 0x7ffffff9

    const/16 v40, 0x0

    move-object v11, v8

    const/4 v8, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v26, v25

    const/16 v25, 0x0

    move-object/from16 v27, v26

    const/16 v26, 0x0

    move-object/from16 v28, v27

    const/16 v27, 0x0

    move-object/from16 v29, v28

    const/16 v28, 0x0

    move-object/from16 v30, v29

    const/16 v29, 0x0

    move-object/from16 v31, v30

    const/16 v30, 0x0

    move-object/from16 v32, v31

    const/16 v31, 0x0

    move-object/from16 v33, v32

    const/16 v32, 0x0

    move-object/from16 v34, v33

    const/16 v33, 0x0

    move-object/from16 v35, v34

    const/16 v34, 0x0

    move-object/from16 v36, v35

    const/16 v35, 0x0

    move-object/from16 v37, v36

    const/16 v36, 0x0

    move-object/from16 v38, v37

    const/16 v37, 0x0

    move-object/from16 v43, v38

    const/16 v38, 0x0

    move-object/from16 v4, v43

    invoke-static/range {v7 .. v40}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    move-result-object v7

    move-object/from16 v22, v7

    goto :goto_f

    :cond_23
    move-object v4, v8

    const/16 v22, 0x0

    :goto_f
    const v33, 0x3ff7ff

    const/16 v34, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

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

    move-object/from16 v10, v42

    .line 63
    invoke-static/range {v10 .. v34}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object v42

    .line 64
    invoke-virtual/range {v42 .. v42}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    move-result-object v7

    if-eqz v7, :cond_26

    .line 65
    :try_start_0
    invoke-virtual {v7}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getLocalCustomData()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_24

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 66
    :try_start_1
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_10

    .line 67
    :catch_0
    :try_start_2
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    goto :goto_10

    .line 68
    :cond_24
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 69
    :goto_10
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 70
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_11
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_25

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    .line 71
    invoke-virtual {v8, v13, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_11

    .line 72
    :cond_25
    const-string/jumbo v11, "text_translation"

    invoke-virtual {v10, v11, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    const-string/jumbo v8, "text_translation_language"

    invoke-virtual {v10, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/tencent/imsdk/v2/V2TIMMessage;->setLocalCustomData(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_26
    :goto_12
    move-object/from16 v10, v42

    goto :goto_13

    :cond_27
    move-object v4, v8

    goto :goto_12

    .line 75
    :goto_13
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v8, v4

    goto/16 :goto_a

    :cond_28
    move-object v4, v8

    .line 76
    invoke-interface {v1, v5, v4}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1f

    goto/16 :goto_32

    .line 77
    :sswitch_4
    const-string v3, "onVoiceConvertedToText"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    goto/16 :goto_32

    .line 78
    :cond_29
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/message/n0;->a:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    .line 79
    iget-object v3, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->b:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    .line 80
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;->HISTORY:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    if-ne v3, v4, :cond_6a

    if-nez v2, :cond_2a

    goto/16 :goto_32

    .line 81
    :cond_2a
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_2b

    check-cast v3, Ljava/lang/String;

    goto :goto_14

    :cond_2b
    const/4 v3, 0x0

    :goto_14
    if-nez v3, :cond_2c

    goto/16 :goto_32

    .line 82
    :cond_2c
    const-string v4, "language"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_2d

    check-cast v4, Ljava/lang/String;

    move-object/from16 v29, v4

    goto :goto_15

    :cond_2d
    const/16 v29, 0x0

    :goto_15
    if-nez v29, :cond_2e

    goto/16 :goto_32

    .line 83
    :cond_2e
    const-string v4, "asrText"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/String;

    if-eqz v4, :cond_2f

    check-cast v2, Ljava/lang/String;

    move-object/from16 v30, v2

    goto :goto_16

    :cond_2f
    const/16 v30, 0x0

    :goto_16
    if-nez v30, :cond_30

    goto/16 :goto_32

    .line 84
    :cond_30
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 85
    :goto_17
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 86
    move-object v4, v2

    check-cast v4, Ljava/util/List;

    .line 87
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_18
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_35

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 89
    move-object/from16 v45, v7

    check-cast v45, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 90
    invoke-virtual/range {v45 .. v45}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_34

    .line 91
    invoke-virtual/range {v45 .. v45}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageBody()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    move-result-object v7

    if-eqz v7, :cond_31

    const v39, 0x7f9fffff

    const/16 v40, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

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

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-static/range {v7 .. v40}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    move-result-object v7

    move-object/from16 v57, v7

    :goto_19
    move-object/from16 v8, v30

    goto :goto_1a

    :cond_31
    const/16 v57, 0x0

    goto :goto_19

    :goto_1a
    const v68, 0x3ff7ff

    const/16 v69, 0x0

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

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    .line 92
    invoke-static/range {v45 .. v69}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object v45

    .line 93
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_33

    .line 94
    invoke-virtual/range {v45 .. v45}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    move-result-object v7

    if-eqz v7, :cond_33

    .line 95
    :try_start_3
    invoke-virtual {v7}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getLocalCustomData()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_32

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 96
    :try_start_4
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_1b

    .line 97
    :catch_2
    :try_start_5
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    goto :goto_1b

    .line 98
    :cond_32
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 99
    :goto_1b
    const-string/jumbo v9, "voice_to_text"

    invoke-virtual {v10, v9, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 100
    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Lcom/tencent/imsdk/v2/V2TIMMessage;->setLocalCustomData(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    :cond_33
    :goto_1c
    move-object/from16 v7, v45

    goto :goto_1d

    :cond_34
    move-object/from16 v8, v30

    goto :goto_1c

    .line 101
    :goto_1d
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v30, v8

    goto/16 :goto_18

    :cond_35
    move-object/from16 v8, v30

    .line 102
    invoke-interface {v1, v2, v5}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_36

    goto/16 :goto_32

    :cond_36
    move-object/from16 v30, v8

    goto/16 :goto_17

    .line 103
    :sswitch_5
    const-string v3, "onMessageSendSuccess"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_37

    goto/16 :goto_32

    .line 104
    :cond_37
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/message/n0;->a:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    .line 105
    iget-object v3, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->b:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    .line 106
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;->HISTORY:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    if-ne v3, v4, :cond_6a

    if-nez v2, :cond_38

    goto/16 :goto_32

    .line 107
    :cond_38
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_39

    check-cast v3, Ljava/lang/String;

    goto :goto_1e

    :cond_39
    const/4 v3, 0x0

    :goto_1e
    if-nez v3, :cond_3a

    goto/16 :goto_32

    .line 108
    :cond_3a
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/String;

    if-eqz v4, :cond_3b

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    goto :goto_1f

    :cond_3b
    const/4 v4, 0x0

    :goto_1f
    if-nez v4, :cond_3c

    goto/16 :goto_32

    .line 109
    :cond_3c
    iget-object v2, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a:Ljava/lang/String;

    .line 110
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    goto/16 :goto_32

    .line 111
    :cond_3d
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 112
    :cond_3e
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 113
    move-object v3, v2

    check-cast v3, Ljava/util/List;

    .line 114
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 115
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_20
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_41

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 116
    check-cast v7, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 117
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_40

    .line 118
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    move-result-object v8

    if-eqz v8, :cond_40

    .line 119
    invoke-static {v8}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lcom/tencent/imsdk/v2/V2TIMMessage;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object v9

    .line 120
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getExtensionList()Ljava/util/List;

    move-result-object v25

    .line 121
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getReactionList()Ljava/util/List;

    move-result-object v26

    .line 122
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getReceipt()Lio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;

    move-result-object v23

    const v32, 0x3e5fff

    const/16 v33, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    .line 123
    invoke-static/range {v9 .. v33}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object v8

    if-nez v8, :cond_3f

    goto :goto_21

    :cond_3f
    move-object v7, v8

    .line 124
    :cond_40
    :goto_21
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_20

    .line 125
    :cond_41
    invoke-interface {v1, v2, v5}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3e

    goto/16 :goto_32

    .line 126
    :sswitch_6
    const-string v3, "onMessageSendProgress"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_42

    goto/16 :goto_32

    .line 127
    :cond_42
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/message/n0;->a:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    .line 128
    iget-object v3, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->b:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    .line 129
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;->HISTORY:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    if-ne v3, v4, :cond_6a

    if-nez v2, :cond_43

    goto/16 :goto_32

    .line 130
    :cond_43
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_44

    check-cast v3, Ljava/lang/String;

    goto :goto_22

    :cond_44
    const/4 v3, 0x0

    :goto_22
    if-nez v3, :cond_45

    goto/16 :goto_32

    .line 131
    :cond_45
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_46

    check-cast v4, Ljava/lang/String;

    goto :goto_23

    :cond_46
    const/4 v4, 0x0

    :goto_23
    if-nez v4, :cond_47

    goto/16 :goto_32

    .line 132
    :cond_47
    const-string v5, "progress"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Ljava/lang/Integer;

    if-eqz v5, :cond_48

    check-cast v2, Ljava/lang/Integer;

    goto :goto_24

    :cond_48
    const/4 v2, 0x0

    :goto_24
    if-eqz v2, :cond_6a

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v15

    .line 133
    iget-object v2, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a:Ljava/lang/String;

    .line 134
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_49

    goto/16 :goto_32

    .line 135
    :cond_49
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 136
    :cond_4a
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 137
    move-object v3, v2

    check-cast v3, Ljava/util/List;

    .line 138
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_25
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 140
    check-cast v7, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 141
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4b

    const v30, 0x3fff7f

    const/16 v31, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

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

    .line 142
    invoke-static/range {v7 .. v31}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object v7

    .line 143
    :cond_4b
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_25

    .line 144
    :cond_4c
    invoke-interface {v1, v2, v5}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4a

    goto/16 :goto_32

    .line 145
    :sswitch_7
    const-string v3, "onMessagePinned"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4d

    goto/16 :goto_32

    .line 146
    :cond_4d
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/message/n0;->a:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    .line 147
    iget-object v3, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->b:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    .line 148
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;->HISTORY:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    if-ne v3, v4, :cond_6a

    if-nez v2, :cond_4e

    goto/16 :goto_32

    .line 149
    :cond_4e
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_4f

    check-cast v3, Ljava/lang/String;

    goto :goto_26

    :cond_4f
    const/4 v3, 0x0

    :goto_26
    if-nez v3, :cond_50

    goto/16 :goto_32

    .line 150
    :cond_50
    const-string v4, "isPinned"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/Boolean;

    if-eqz v4, :cond_51

    move-object v4, v2

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_27

    :cond_51
    const/4 v4, 0x0

    :goto_27
    if-eqz v4, :cond_6a

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v17

    .line 151
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 152
    :cond_52
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 153
    move-object v4, v2

    check-cast v4, Ljava/util/List;

    .line 154
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 155
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_28
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_54

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 156
    check-cast v7, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 157
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_53

    const v30, 0x3ffdff

    const/16 v31, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

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

    .line 158
    invoke-static/range {v7 .. v31}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object v7

    .line 159
    :cond_53
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_28

    .line 160
    :cond_54
    invoke-interface {v1, v2, v5}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_52

    goto/16 :goto_32

    .line 161
    :sswitch_8
    const-string v3, "onChatHistoryMessageCleared"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_55

    goto/16 :goto_32

    .line 162
    :cond_55
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/message/n0;->a:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    invoke-static {v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Ljava/util/Map;)V

    return-void

    .line 163
    :sswitch_9
    const-string v3, "onMessageDeleted"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_56

    goto/16 :goto_32

    .line 164
    :cond_56
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/message/n0;->a:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    .line 165
    iget-object v3, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->b:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    .line 166
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;->HISTORY:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    if-ne v3, v4, :cond_6a

    if-nez v2, :cond_57

    goto/16 :goto_32

    .line 167
    :cond_57
    const-string v3, "messageIDList"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/util/List;

    if-eqz v3, :cond_58

    move-object v4, v2

    check-cast v4, Ljava/util/List;

    goto :goto_29

    :cond_58
    const/4 v4, 0x0

    :goto_29
    if-nez v4, :cond_59

    goto/16 :goto_32

    .line 168
    :cond_59
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5a

    goto/16 :goto_32

    .line 169
    :cond_5a
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    .line 170
    iget-object v3, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 171
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 172
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5b
    :goto_2a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_5d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 173
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_5c

    goto :goto_2b

    .line 174
    :cond_5c
    invoke-interface {v2, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    :goto_2b
    if-eqz v6, :cond_5b

    .line 175
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2a

    .line 176
    :cond_5d
    iget-object v3, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 177
    :cond_5e
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 178
    move-object v7, v5

    check-cast v7, Ljava/util/List;

    .line 179
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 180
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5f
    :goto_2c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_61

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 181
    invoke-virtual {v10}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_60

    move v10, v6

    goto :goto_2d

    .line 182
    :cond_60
    invoke-interface {v2, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    :goto_2d
    if-nez v10, :cond_5f

    .line 183
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2c

    .line 184
    :cond_61
    invoke-interface {v3, v5, v8}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5e

    .line 185
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6a

    .line 186
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$DeleteMessages;

    invoke-direct {v2, v4}, Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$DeleteMessages;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent;)V

    return-void

    .line 187
    :sswitch_a
    const-string v3, "onMessageRecalled"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_62

    goto/16 :goto_32

    .line 188
    :cond_62
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/message/n0;->a:Lio/trtc/tuikit/atomicxcore/impl/message/r0;

    .line 189
    iget-object v3, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->b:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    .line 190
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;->HISTORY:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    if-ne v3, v4, :cond_6a

    if-nez v2, :cond_63

    goto/16 :goto_32

    .line 191
    :cond_63
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_64

    check-cast v2, Ljava/lang/String;

    goto :goto_2e

    :cond_64
    const/4 v2, 0x0

    :goto_2e
    if-nez v2, :cond_65

    goto/16 :goto_32

    .line 192
    :cond_65
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 193
    :cond_66
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 194
    move-object v4, v3

    check-cast v4, Ljava/util/List;

    .line 195
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 196
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_69

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 197
    move-object v8, v7

    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 198
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_68

    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    move-result-object v7

    sget-object v15, Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;->RECALLED:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    if-eq v7, v15, :cond_68

    .line 199
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    move-result-object v7

    if-eqz v7, :cond_67

    const/4 v9, 0x0

    .line 200
    invoke-static {v7, v9, v9}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lcom/tencent/imsdk/v2/V2TIMMessage;Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/message/SystemMessageInfo$RecallMessage;

    move-result-object v7

    .line 201
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    move-object/from16 v45, v7

    goto :goto_30

    :cond_67
    const/4 v9, 0x0

    move-object/from16 v45, v9

    .line 202
    :goto_30
    sget-object v7, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->SYSTEM:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 203
    new-instance v16, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    const v48, 0x4fffffff    # 8.589934E9f

    const/16 v49, 0x0

    const/16 v17, 0x0

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

    const/16 v46, 0x0

    const/16 v47, 0x0

    invoke-direct/range {v16 .. v49}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v31, 0x3ff3bf

    const/16 v32, 0x0

    move-object/from16 v44, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v20, v16

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v22, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v19, v7

    .line 204
    invoke-static/range {v8 .. v32}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object v8

    goto :goto_31

    :cond_68
    const/16 v44, 0x0

    .line 205
    :goto_31
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2f

    :cond_69
    const/16 v44, 0x0

    .line 206
    invoke-interface {v1, v3, v5}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_66

    :cond_6a
    :goto_32
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x55df7f48 -> :sswitch_a
        -0x41b2562f -> :sswitch_9
        -0x3e048e3e -> :sswitch_8
        -0x2f7b7ce0 -> :sswitch_7
        -0x1a2338e3 -> :sswitch_6
        -0x135f22ed -> :sswitch_5
        -0x7e0c499 -> :sswitch_4
        -0x113be2 -> :sswitch_3
        0x6c3b152d -> :sswitch_2
        0x6d45b077 -> :sswitch_1
        0x76e419b9 -> :sswitch_0
    .end sparse-switch
.end method
