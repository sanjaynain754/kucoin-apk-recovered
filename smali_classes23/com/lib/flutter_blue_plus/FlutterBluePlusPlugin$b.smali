.class public Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin$b;
.super Landroid/content/BroadcastReceiver;
.source "FlutterBluePlusPlugin.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;


# direct methods
.method public constructor <init>(Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin$b;->a:Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

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
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    const-string v0, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    move-result p1

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v0, 0x21

    .line 21
    .line 22
    const-string v1, "android.bluetooth.device.extra.DEVICE"

    .line 23
    .line 24
    if-lt p1, v0, :cond_1

    .line 25
    .line 26
    const-class p1, Landroid/bluetooth/BluetoothDevice;

    .line 27
    .line 28
    .line 29
    invoke-static {p2, v1, p1}, Landroidx/credentials/provider/o;->a(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    .line 33
    goto :goto_0

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    .line 40
    .line 41
    :goto_0
    const-string v0, "android.bluetooth.device.extra.BOND_STATE"

    .line 42
    .line 43
    const/high16 v1, -0x80000000

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 47
    move-result v0

    .line 48
    .line 49
    const-string v1, "android.bluetooth.device.extra.PREVIOUS_BOND_STATE"

    .line 50
    const/4 v2, -0x1

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 54
    move-result p2

    .line 55
    .line 56
    iget-object v1, p0, Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin$b;->a:Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;

    .line 57
    .line 58
    sget-object v2, Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin$LogLevel;->DEBUG:Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin$LogLevel;

    .line 59
    .line 60
    new-instance v3, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    const-string v4, "OnBondStateChanged: "

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;->F(I)Ljava/lang/String;

    .line 72
    move-result-object v4

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v4, " prev: "

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-static {p2}, Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;->F(I)Ljava/lang/String;

    .line 84
    move-result-object v4

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v2, v3}, Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;->i(Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin$LogLevel;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    .line 98
    move-result-object v1

    .line 99
    .line 100
    const/16 v2, 0xb

    .line 101
    .line 102
    if-ne v0, v2, :cond_2

    .line 103
    .line 104
    iget-object v2, p0, Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin$b;->a:Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;

    .line 105
    .line 106
    .line 107
    invoke-static {v2}, Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;->G(Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;)Ljava/util/Map;

    .line 108
    move-result-object v2

    .line 109
    .line 110
    .line 111
    invoke-interface {v2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    goto :goto_1

    .line 113
    .line 114
    :cond_2
    iget-object p1, p0, Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin$b;->a:Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;

    .line 115
    .line 116
    .line 117
    invoke-static {p1}, Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;->G(Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;)Ljava/util/Map;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    .line 121
    invoke-interface {p1, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    :goto_1
    new-instance p1, Ljava/util/HashMap;

    .line 124
    .line 125
    .line 126
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string/jumbo v2, "remote_id"

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;->R(I)I

    .line 136
    move-result v0

    .line 137
    .line 138
    .line 139
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    const-string v1, "bond_state"

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    invoke-static {p2}, Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;->R(I)I

    .line 149
    move-result p2

    .line 150
    .line 151
    .line 152
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    move-result-object p2

    .line 154
    .line 155
    .line 156
    const-string/jumbo v0, "prev_state"

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    iget-object p2, p0, Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin$b;->a:Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;

    .line 162
    .line 163
    const-string v0, "OnBondStateChanged"

    .line 164
    .line 165
    .line 166
    invoke-static {p2, v0, p1}, Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;->D(Lcom/lib/flutter_blue_plus/FlutterBluePlusPlugin;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 167
    :cond_3
    :goto_2
    return-void
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
.end method
