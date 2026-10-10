.class final Lcom/google/api/client/http/GzipSupport;
.super Ljava/lang/Object;
.source "GzipSupport.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/api/client/http/GzipSupport$OptimisticAvailabilityInputStream;
    }
.end annotation


# direct methods
.method private constructor <init>()V
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
.end method

.method public static newGzipInputStream(Ljava/io/InputStream;)Ljava/util/zip/GZIPInputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    .line 3
    .line 4
    new-instance v1, Lcom/google/api/client/http/GzipSupport$OptimisticAvailabilityInputStream;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/google/api/client/http/GzipSupport$OptimisticAvailabilityInputStream;-><init>(Ljava/io/InputStream;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 11
    return-object v0
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
