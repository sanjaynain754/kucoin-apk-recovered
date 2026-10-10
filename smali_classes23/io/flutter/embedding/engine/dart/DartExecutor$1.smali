.class Lio/flutter/embedding/engine/dart/DartExecutor$1;
.super Ljava/lang/Object;
.source "DartExecutor.java"

# interfaces
.implements Lio/flutter/plugin/common/BinaryMessenger$BinaryMessageHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/dart/DartExecutor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/embedding/engine/dart/DartExecutor;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/dart/DartExecutor;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/embedding/engine/dart/DartExecutor$1;->this$0:Lio/flutter/embedding/engine/dart/DartExecutor;

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
.method public onMessage(Ljava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V
    .locals 1

    .line 1
    .line 2
    iget-object p2, p0, Lio/flutter/embedding/engine/dart/DartExecutor$1;->this$0:Lio/flutter/embedding/engine/dart/DartExecutor;

    .line 3
    .line 4
    sget-object v0, Lio/flutter/plugin/common/StringCodec;->INSTANCE:Lio/flutter/plugin/common/StringCodec;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lio/flutter/plugin/common/StringCodec;->decodeMessage(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-static {p2, p1}, Lio/flutter/embedding/engine/dart/DartExecutor;->access$002(Lio/flutter/embedding/engine/dart/DartExecutor;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    iget-object p1, p0, Lio/flutter/embedding/engine/dart/DartExecutor$1;->this$0:Lio/flutter/embedding/engine/dart/DartExecutor;

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lio/flutter/embedding/engine/dart/DartExecutor;->access$100(Lio/flutter/embedding/engine/dart/DartExecutor;)Lio/flutter/embedding/engine/dart/DartExecutor$IsolateServiceIdListener;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lio/flutter/embedding/engine/dart/DartExecutor$1;->this$0:Lio/flutter/embedding/engine/dart/DartExecutor;

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lio/flutter/embedding/engine/dart/DartExecutor;->access$100(Lio/flutter/embedding/engine/dart/DartExecutor;)Lio/flutter/embedding/engine/dart/DartExecutor$IsolateServiceIdListener;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    iget-object p2, p0, Lio/flutter/embedding/engine/dart/DartExecutor$1;->this$0:Lio/flutter/embedding/engine/dart/DartExecutor;

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Lio/flutter/embedding/engine/dart/DartExecutor;->access$000(Lio/flutter/embedding/engine/dart/DartExecutor;)Ljava/lang/String;

    .line 31
    move-result-object p2

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, p2}, Lio/flutter/embedding/engine/dart/DartExecutor$IsolateServiceIdListener;->onIsolateServiceIdAvailable(Ljava/lang/String;)V

    .line 35
    :cond_0
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method
