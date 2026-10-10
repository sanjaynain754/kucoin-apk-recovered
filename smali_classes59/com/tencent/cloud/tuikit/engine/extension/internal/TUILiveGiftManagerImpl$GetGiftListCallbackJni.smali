.class final Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveGiftManagerImpl$GetGiftListCallbackJni;
.super Ljava/lang/Object;
.source "TUILiveGiftManagerImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveGiftManagerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "GetGiftListCallbackJni"
.end annotation


# instance fields
.field private final mCallback:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetGiftListCallback;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetGiftListCallback;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveGiftManagerImpl$GetGiftListCallbackJni;->mCallback:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetGiftListCallback;

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
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "GetGiftListCallbackJni"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveGiftManagerImpl$GetGiftListCallbackJni;->mCallback:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetGiftListCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetGiftListCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 12
    :cond_0
    return-void
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
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 3
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "GetGiftListCallbackJni"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveGiftManagerImpl$GetGiftListCallbackJni;->mCallback:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetGiftListCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 15
    const/4 p1, 0x0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 19
    move-result v2

    .line 20
    .line 21
    if-ge p1, v2, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveGiftManagerImpl;->access$000(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GiftCategory;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :catch_0
    move-exception p1

    .line 41
    .line 42
    const-string v1, "TUILiveGiftManagerImpl"

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-static {v1, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    :cond_0
    iget-object p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveGiftManagerImpl$GetGiftListCallbackJni;->mCallback:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetGiftListCallback;

    .line 52
    .line 53
    .line 54
    invoke-interface {p1, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveGiftManager$GetGiftListCallback;->onSuccess(Ljava/util/List;)V

    .line 55
    :cond_1
    return-void
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
.end method
