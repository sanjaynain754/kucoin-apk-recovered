.class public Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;
.super Ljava/lang/Object;
.source "KeyboardChannel.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;
    }
.end annotation


# instance fields
.field public final channel:Lio/flutter/plugin/common/MethodChannel;

.field private keyboardMethodHandler:Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;

.field public final parsingMethodHandler:Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 4
    .param p1    # Lio/flutter/plugin/common/BinaryMessenger;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$1;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$1;-><init>(Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;)V

    .line 9
    .line 10
    iput-object v0, p0, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;->parsingMethodHandler:Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;

    .line 11
    .line 12
    new-instance v1, Lio/flutter/plugin/common/MethodChannel;

    .line 13
    .line 14
    const-string v2, "flutter/keyboard"

    .line 15
    .line 16
    sget-object v3, Lio/flutter/plugin/common/StandardMethodCodec;->INSTANCE:Lio/flutter/plugin/common/StandardMethodCodec;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, p1, v2, v3}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MethodCodec;)V

    .line 20
    .line 21
    iput-object v1, p0, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;->channel:Lio/flutter/plugin/common/MethodChannel;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 25
    return-void
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
    .line 43
    .line 44
    .line 45
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
.end method

.method public static synthetic access$000(Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;)Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;->keyboardMethodHandler:Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;

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
.end method


# virtual methods
.method public setKeyboardMethodHandler(Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;)V
    .locals 0
    .param p1    # Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;->keyboardMethodHandler:Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;

    .line 3
    return-void
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
.end method
