.class Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel$1;
.super Ljava/lang/Object;
.source "DeferredComponentChannel.java"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel$1;->this$0:Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;

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
.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 4
    .param p1    # Lio/flutter/plugin/common/MethodCall;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/flutter/plugin/common/MethodChannel$Result;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel$1;->this$0:Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;->access$000(Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;)Lio/flutter/embedding/engine/deferredcomponents/DeferredComponentManager;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lio/flutter/plugin/common/MethodCall;->arguments()Ljava/lang/Object;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    check-cast p1, Ljava/util/Map;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    const-string v2, "Received \'"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v2, "\' message."

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    const-string v2, "DeferredComponentChannel"

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v1}, Lio/flutter/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string/jumbo v1, "loadingUnitId"

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    check-cast v1, Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 57
    move-result v1

    .line 58
    .line 59
    const-string v2, "componentName"

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    check-cast p1, Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    const/4 v2, -0x1

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 73
    move-result v3

    .line 74
    .line 75
    .line 76
    sparse-switch v3, :sswitch_data_0

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :sswitch_0
    const-string v3, "installDeferredComponent"

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    move-result v0

    .line 84
    .line 85
    if-nez v0, :cond_1

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    const/4 v2, 0x2

    .line 88
    goto :goto_0

    .line 89
    .line 90
    :sswitch_1
    const-string v3, "getDeferredComponentInstallState"

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    move-result v0

    .line 95
    .line 96
    if-nez v0, :cond_2

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const/4 v2, 0x1

    .line 99
    goto :goto_0

    .line 100
    .line 101
    .line 102
    :sswitch_2
    const-string/jumbo v3, "uninstallDeferredComponent"

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    move-result v0

    .line 107
    .line 108
    if-nez v0, :cond_3

    .line 109
    goto :goto_0

    .line 110
    :cond_3
    const/4 v2, 0x0

    .line 111
    .line 112
    .line 113
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 114
    .line 115
    .line 116
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    .line 117
    return-void

    .line 118
    .line 119
    :pswitch_0
    iget-object v0, p0, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel$1;->this$0:Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;

    .line 120
    .line 121
    .line 122
    invoke-static {v0}, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;->access$000(Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;)Lio/flutter/embedding/engine/deferredcomponents/DeferredComponentManager;

    .line 123
    move-result-object v0

    .line 124
    .line 125
    .line 126
    invoke-interface {v0, v1, p1}, Lio/flutter/embedding/engine/deferredcomponents/DeferredComponentManager;->installDeferredComponent(ILjava/lang/String;)V

    .line 127
    .line 128
    iget-object v0, p0, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel$1;->this$0:Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;

    .line 129
    .line 130
    .line 131
    invoke-static {v0}, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;->access$100(Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;)Ljava/util/Map;

    .line 132
    move-result-object v0

    .line 133
    .line 134
    .line 135
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 136
    move-result v0

    .line 137
    .line 138
    if-nez v0, :cond_4

    .line 139
    .line 140
    iget-object v0, p0, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel$1;->this$0:Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;

    .line 141
    .line 142
    .line 143
    invoke-static {v0}, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;->access$100(Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;)Ljava/util/Map;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    new-instance v1, Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    :cond_4
    iget-object v0, p0, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel$1;->this$0:Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;

    .line 155
    .line 156
    .line 157
    invoke-static {v0}, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;->access$100(Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;)Ljava/util/Map;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    .line 161
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    move-result-object p1

    .line 163
    .line 164
    check-cast p1, Ljava/util/List;

    .line 165
    .line 166
    .line 167
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    return-void

    .line 169
    .line 170
    :pswitch_1
    iget-object v0, p0, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel$1;->this$0:Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;

    .line 171
    .line 172
    .line 173
    invoke-static {v0}, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;->access$000(Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;)Lio/flutter/embedding/engine/deferredcomponents/DeferredComponentManager;

    .line 174
    move-result-object v0

    .line 175
    .line 176
    .line 177
    invoke-interface {v0, v1, p1}, Lio/flutter/embedding/engine/deferredcomponents/DeferredComponentManager;->getDeferredComponentInstallState(ILjava/lang/String;)Ljava/lang/String;

    .line 178
    move-result-object p1

    .line 179
    .line 180
    .line 181
    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 182
    return-void

    .line 183
    .line 184
    :pswitch_2
    iget-object v0, p0, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel$1;->this$0:Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;

    .line 185
    .line 186
    .line 187
    invoke-static {v0}, Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;->access$000(Lio/flutter/embedding/engine/systemchannels/DeferredComponentChannel;)Lio/flutter/embedding/engine/deferredcomponents/DeferredComponentManager;

    .line 188
    move-result-object v0

    .line 189
    .line 190
    .line 191
    invoke-interface {v0, v1, p1}, Lio/flutter/embedding/engine/deferredcomponents/DeferredComponentManager;->uninstallDeferredComponent(ILjava/lang/String;)Z

    .line 192
    const/4 p1, 0x0

    .line 193
    .line 194
    .line 195
    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 196
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x3bdea8e4 -> :sswitch_2
        0x17d2f6fe -> :sswitch_1
        0x1f0d4383 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
