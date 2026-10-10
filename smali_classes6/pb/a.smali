.class public interface abstract Lpb/a;
.super Ljava/lang/Object;
.source "ChatApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0008H\'\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00042\u0008\u0008\u0001\u0010\r\u001a\u00020\u000cH\'\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0004H\'\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpb/a;",
        "",
        "Lcom/kubi/chat/entity/ChatHistoryRequest;",
        "params",
        "Lretrofit2/Call;",
        "Lcom/kubi/chat/entity/ChatHistory;",
        "b",
        "(Lcom/kubi/chat/entity/ChatHistoryRequest;)Lretrofit2/Call;",
        "Lcom/kubi/chat/entity/ChatHasUnreadRequest;",
        "",
        "a",
        "(Lcom/kubi/chat/entity/ChatHasUnreadRequest;)Lretrofit2/Call;",
        "Lokhttp3/MultipartBody$Part;",
        "part",
        "Lcom/kubi/chat/entity/UploadImage;",
        "d",
        "(Lokhttp3/MultipartBody$Part;)Lretrofit2/Call;",
        "Lcom/kubi/chat/entity/ChatToken;",
        "c",
        "()Lretrofit2/Call;",
        "ImSDK_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Lcom/kubi/chat/entity/ChatHasUnreadRequest;)Lretrofit2/Call;
    .param p1    # Lcom/kubi/chat/entity/ChatHasUnreadRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/chat/entity/ChatHasUnreadRequest;",
            ")",
            "Lretrofit2/Call<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "payment_mobile_gateway/v1/message/unread"
    .end annotation
.end method

.method public abstract b(Lcom/kubi/chat/entity/ChatHistoryRequest;)Lretrofit2/Call;
    .param p1    # Lcom/kubi/chat/entity/ChatHistoryRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/chat/entity/ChatHistoryRequest;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/kubi/chat/entity/ChatHistory;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "payment_mobile_gateway/v1/message/history"
    .end annotation
.end method

.method public abstract c()Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/kubi/chat/entity/ChatToken;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "payment_mobile_gateway/v1/im/inner/login"
    .end annotation
.end method

.method public abstract d(Lokhttp3/MultipartBody$Part;)Lretrofit2/Call;
    .param p1    # Lokhttp3/MultipartBody$Part;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Part;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/MultipartBody$Part;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/kubi/chat/entity/UploadImage;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/Multipart;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "payment_mobile_gateway/v1/im/upload"
    .end annotation
.end method
