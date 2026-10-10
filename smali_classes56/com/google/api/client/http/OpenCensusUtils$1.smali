.class final Lcom/google/api/client/http/OpenCensusUtils$1;
.super Lxf0/a$c;
.source "OpenCensusUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/api/client/http/OpenCensusUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lxf0/a$c<",
        "Lcom/google/api/client/http/HttpHeaders;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lxf0/a$c;-><init>()V

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
.end method


# virtual methods
.method public put(Lcom/google/api/client/http/HttpHeaders;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-virtual {p1, p2, p3}, Lcom/google/api/client/http/HttpHeaders;->set(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/api/client/http/HttpHeaders;

    return-void
.end method

.method public bridge synthetic put(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/api/client/http/HttpHeaders;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/api/client/http/OpenCensusUtils$1;->put(Lcom/google/api/client/http/HttpHeaders;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
