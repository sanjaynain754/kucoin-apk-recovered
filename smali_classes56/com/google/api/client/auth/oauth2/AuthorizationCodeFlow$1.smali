.class Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow$1;
.super Ljava/lang/Object;
.source "AuthorizationCodeFlow.java"

# interfaces
.implements Lcom/google/api/client/http/HttpExecuteInterceptor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow;->newTokenRequest(Ljava/lang/String;)Lcom/google/api/client/auth/oauth2/AuthorizationCodeTokenRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow;


# direct methods
.method public constructor <init>(Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow$1;->this$0:Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow;

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
.end method


# virtual methods
.method public intercept(Lcom/google/api/client/http/HttpRequest;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow$1;->this$0:Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow;->access$000(Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow;)Lcom/google/api/client/http/HttpExecuteInterceptor;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Lcom/google/api/client/http/HttpExecuteInterceptor;->intercept(Lcom/google/api/client/http/HttpRequest;)V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow$1;->this$0:Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow;

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow;->access$100(Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow;)Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow$PKCE;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lcom/google/api/client/http/UrlEncodedContent;->getContent(Lcom/google/api/client/http/HttpRequest;)Lcom/google/api/client/http/UrlEncodedContent;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/google/api/client/http/UrlEncodedContent;->getData()Ljava/lang/Object;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/google/api/client/util/Data;->mapOf(Ljava/lang/Object;)Ljava/util/Map;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow$1;->this$0:Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow;

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow;->access$100(Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow;)Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow$PKCE;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/google/api/client/auth/oauth2/AuthorizationCodeFlow$PKCE;->getVerifier()Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    const-string v1, "code_verifier"

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    :cond_0
    return-void
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
.end method
