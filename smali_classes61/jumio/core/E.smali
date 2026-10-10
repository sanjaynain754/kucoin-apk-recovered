.class public final Ljumio/core/E;
.super Lcom/jumio/core/network/b;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ljumio/core/I;


# direct methods
.method public constructor <init>(Ljumio/core/I;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ljumio/core/E;->a:Ljumio/core/I;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/jumio/core/network/b;-><init>()V

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
.method public final isRateLimitExceeded()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/E;->a:Ljumio/core/I;

    .line 3
    .line 4
    iget-object v0, v0, Ljumio/core/I;->a:Lcom/jumio/core/cdn/CDNCache;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/jumio/core/cdn/CDNCache;->getCdnDownloadListener()Lcom/jumio/core/cdn/CDNDownloadListener;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/jumio/core/cdn/CDNDownloadListener;->isRateLimitExceeded()Z

    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method
