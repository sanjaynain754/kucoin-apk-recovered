.class final Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl$ConnectionRequestCallbackJni;
.super Ljava/lang/Object;
.source "TUILiveConnectionManagerImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ConnectionRequestCallbackJni"
.end annotation


# instance fields
.field private final mCallback:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl$ConnectionRequestCallbackJni;->mCallback:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;

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
        value = "ConnectionRequestCallbackJni"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl$ConnectionRequestCallbackJni;->mCallback:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;

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
    invoke-interface {v0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

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
    .locals 5
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
        value = "ConnectionRequestCallbackJni"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl$ConnectionRequestCallbackJni;->mCallback:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    new-instance v0, Ljava/util/HashMap;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

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
    const-string/jumbo v3, "userId"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    const-string v4, "errorCode"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 38
    move-result v2

    .line 39
    .line 40
    .line 41
    invoke-static {v2}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionCode;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionCode;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    add-int/lit8 p1, p1, 0x1

    .line 48
    goto :goto_0

    .line 49
    :catch_0
    move-exception p1

    .line 50
    .line 51
    const-string v1, "TUILiveConnectionManagerImpl"

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-static {v1, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    :cond_0
    iget-object p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUILiveConnectionManagerImpl$ConnectionRequestCallbackJni;->mCallback:Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUILiveConnectionManager$ConnectionRequestCallback;->onSuccess(Ljava/util/Map;)V

    .line 64
    :cond_1
    return-void
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
