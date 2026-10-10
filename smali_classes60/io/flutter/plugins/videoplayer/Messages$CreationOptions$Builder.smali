.class public final Lio/flutter/plugins/videoplayer/Messages$CreationOptions$Builder;
.super Ljava/lang/Object;
.source "Messages.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/videoplayer/Messages$CreationOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private formatHint:Lio/flutter/plugins/videoplayer/Messages$PlatformVideoFormat;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private httpHeaders:Ljava/util/Map;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private uri:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private userAgent:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method


# virtual methods
.method public build()Lio/flutter/plugins/videoplayer/Messages$CreationOptions;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lio/flutter/plugins/videoplayer/Messages$CreationOptions;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lio/flutter/plugins/videoplayer/Messages$CreationOptions;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lio/flutter/plugins/videoplayer/Messages$CreationOptions$Builder;->uri:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lio/flutter/plugins/videoplayer/Messages$CreationOptions;->setUri(Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v1, p0, Lio/flutter/plugins/videoplayer/Messages$CreationOptions$Builder;->formatHint:Lio/flutter/plugins/videoplayer/Messages$PlatformVideoFormat;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lio/flutter/plugins/videoplayer/Messages$CreationOptions;->setFormatHint(Lio/flutter/plugins/videoplayer/Messages$PlatformVideoFormat;)V

    .line 16
    .line 17
    iget-object v1, p0, Lio/flutter/plugins/videoplayer/Messages$CreationOptions$Builder;->httpHeaders:Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lio/flutter/plugins/videoplayer/Messages$CreationOptions;->setHttpHeaders(Ljava/util/Map;)V

    .line 21
    .line 22
    iget-object v1, p0, Lio/flutter/plugins/videoplayer/Messages$CreationOptions$Builder;->userAgent:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lio/flutter/plugins/videoplayer/Messages$CreationOptions;->setUserAgent(Ljava/lang/String;)V

    .line 26
    return-object v0
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public setFormatHint(Lio/flutter/plugins/videoplayer/Messages$PlatformVideoFormat;)Lio/flutter/plugins/videoplayer/Messages$CreationOptions$Builder;
    .locals 0
    .param p1    # Lio/flutter/plugins/videoplayer/Messages$PlatformVideoFormat;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Lio/flutter/plugins/videoplayer/Messages$CanIgnoreReturnValue;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/plugins/videoplayer/Messages$CreationOptions$Builder;->formatHint:Lio/flutter/plugins/videoplayer/Messages$PlatformVideoFormat;

    .line 3
    return-object p0
    .line 4
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
    .line 38
    .line 39
.end method

.method public setHttpHeaders(Ljava/util/Map;)Lio/flutter/plugins/videoplayer/Messages$CreationOptions$Builder;
    .locals 0
    .param p1    # Ljava/util/Map;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/flutter/plugins/videoplayer/Messages$CreationOptions$Builder;"
        }
    .end annotation

    .annotation build Lio/flutter/plugins/videoplayer/Messages$CanIgnoreReturnValue;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/plugins/videoplayer/Messages$CreationOptions$Builder;->httpHeaders:Ljava/util/Map;

    .line 3
    return-object p0
    .line 4
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
    .line 38
    .line 39
.end method

.method public setUri(Ljava/lang/String;)Lio/flutter/plugins/videoplayer/Messages$CreationOptions$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Lio/flutter/plugins/videoplayer/Messages$CanIgnoreReturnValue;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/plugins/videoplayer/Messages$CreationOptions$Builder;->uri:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
    .line 38
    .line 39
.end method

.method public setUserAgent(Ljava/lang/String;)Lio/flutter/plugins/videoplayer/Messages$CreationOptions$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Lio/flutter/plugins/videoplayer/Messages$CanIgnoreReturnValue;
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/plugins/videoplayer/Messages$CreationOptions$Builder;->userAgent:Ljava/lang/String;

    .line 3
    return-object p0
    .line 4
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
    .line 38
    .line 39
.end method
