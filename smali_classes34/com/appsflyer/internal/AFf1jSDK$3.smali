.class final Lcom/appsflyer/internal/AFf1jSDK$3;
.super Ljava/util/HashMap;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFf1jSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private synthetic getRevenue:Lcom/appsflyer/internal/AFf1jSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFf1jSDK;)V
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1jSDK$3;->getRevenue:Lcom/appsflyer/internal/AFf1jSDK;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    const-string p1, "aa"

    .line 8
    .line 9
    .line 10
    const-string/jumbo v0, "ro.arch"

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    const-string p1, "ab"

    .line 16
    .line 17
    .line 18
    const-string/jumbo v0, "ro.chipname"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    const-string p1, "ac"

    .line 24
    .line 25
    .line 26
    const-string/jumbo v0, "ro.dalvik.vm.native.bridge"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    const-string p1, "ad"

    .line 32
    .line 33
    .line 34
    const-string/jumbo v0, "persist.sys.nativebridge"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    const-string p1, "ae"

    .line 40
    .line 41
    .line 42
    const-string/jumbo v0, "ro.enable.native.bridge.exec"

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    const-string p1, "af"

    .line 48
    .line 49
    const-string v0, "dalvik.vm.isa.x86.features"

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    const-string p1, "ag"

    .line 55
    .line 56
    const-string v0, "dalvik.vm.isa.x86.variant"

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    const-string p1, "ah"

    .line 62
    .line 63
    .line 64
    const-string/jumbo v0, "ro.zygote"

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    const-string p1, "ai"

    .line 70
    .line 71
    .line 72
    const-string/jumbo v0, "ro.allow.mock.location"

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    const-string p1, "aj"

    .line 78
    .line 79
    .line 80
    const-string/jumbo v0, "ro.dalvik.vm.isa.arm"

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    const-string p1, "ak"

    .line 86
    .line 87
    const-string v0, "dalvik.vm.isa.arm.features"

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    const-string p1, "al"

    .line 93
    .line 94
    const-string v0, "dalvik.vm.isa.arm.variant"

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    const-string p1, "am"

    .line 100
    .line 101
    const-string v0, "dalvik.vm.isa.arm64.features"

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    const-string p1, "an"

    .line 107
    .line 108
    const-string v0, "dalvik.vm.isa.arm64.variant"

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    const-string p1, "ao"

    .line 114
    .line 115
    .line 116
    const-string/jumbo v0, "vzw.os.rooted"

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    const-string p1, "ap"

    .line 122
    .line 123
    .line 124
    const-string/jumbo v0, "ro.build.user"

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    const-string p1, "aq"

    .line 130
    .line 131
    .line 132
    const-string/jumbo v0, "ro.kernel.qemu"

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    const-string p1, "ar"

    .line 138
    .line 139
    .line 140
    const-string/jumbo v0, "ro.hardware"

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    const-string p1, "as"

    .line 146
    .line 147
    .line 148
    const-string/jumbo v0, "ro.product.cpu.abi"

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    const-string p1, "at"

    .line 154
    .line 155
    .line 156
    const-string/jumbo v0, "ro.product.cpu.abilist"

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    const-string p1, "au"

    .line 162
    .line 163
    .line 164
    const-string/jumbo v0, "ro.product.cpu.abilist32"

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    const-string p1, "av"

    .line 170
    .line 171
    .line 172
    const-string/jumbo v0, "ro.product.cpu.abilist64"

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    return-void
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
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
.end method
