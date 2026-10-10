.class Lcom/facebook/react/packagerconnection/FileIoHandler$TtlFileInputStream;
.super Ljava/lang/Object;
.source "FileIoHandler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/packagerconnection/FileIoHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TtlFileInputStream"
.end annotation


# instance fields
.field private final mStream:Ljava/io/FileInputStream;

.field private mTtl:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/io/FileInputStream;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/react/packagerconnection/FileIoHandler$TtlFileInputStream;->mStream:Ljava/io/FileInputStream;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    move-result-wide v0

    .line 15
    .line 16
    const-wide/16 v2, 0x7530

    .line 17
    add-long/2addr v0, v2

    .line 18
    .line 19
    iput-wide v0, p0, Lcom/facebook/react/packagerconnection/FileIoHandler$TtlFileInputStream;->mTtl:J

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method private extendTtl()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    const-wide/16 v2, 0x7530

    .line 7
    add-long/2addr v0, v2

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/facebook/react/packagerconnection/FileIoHandler$TtlFileInputStream;->mTtl:J

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/packagerconnection/FileIoHandler$TtlFileInputStream;->mStream:Ljava/io/FileInputStream;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

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
.end method

.method public expiredTtl()Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/facebook/react/packagerconnection/FileIoHandler$TtlFileInputStream;->mTtl:J

    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-ltz v0, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public read(I)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/packagerconnection/FileIoHandler$TtlFileInputStream;->extendTtl()V

    .line 4
    .line 5
    new-array p1, p1, [B

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/packagerconnection/FileIoHandler$TtlFileInputStream;->mStream:Ljava/io/FileInputStream;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/io/FileInputStream;->read([B)I

    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v1, v0, v1}, Landroid/util/Base64;->encodeToString([BIII)Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
