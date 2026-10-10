.class public final Lcom/jumio/core/util/DefaultDeviceUtil;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/interfaces/DeviceUtilInterface;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0016\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0008\u0010\u001b\u001a\u00020\u0011H\u0016J\u0008\u0010\u001c\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\r\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/jumio/core/util/DefaultDeviceUtil;",
        "Lcom/jumio/core/interfaces/DeviceUtilInterface;",
        "installationIdProvider",
        "Lcom/jumio/core/provider/InstallationIdProvider;",
        "<init>",
        "(Lcom/jumio/core/provider/InstallationIdProvider;)V",
        "EMULATOR_PROPS",
        "",
        "",
        "getEMULATOR_PROPS$annotations",
        "()V",
        "cpuFamily",
        "getCpuFamily",
        "()Ljava/lang/String;",
        "cpuFeatures",
        "getCpuFeatures",
        "isSupportedPlatform",
        "",
        "context",
        "Landroid/content/Context;",
        "useIntel",
        "isDebug",
        "areAnimationsEnabled",
        "isDarkModeActive",
        "isTalkbackEnabled",
        "installationId",
        "userAgent",
        "isEmulatorPropertiesPresent",
        "hasEmulatorRelatedFiles",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeviceUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceUtil.kt\ncom/jumio/core/util/DefaultDeviceUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1755#2,3:154\n*S KotlinDebug\n*F\n+ 1 DeviceUtil.kt\ncom/jumio/core/util/DefaultDeviceUtil\n*L\n145#1:154,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Ljumio/core/U1;

.field public final b:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lcom/jumio/core/util/DefaultDeviceUtil;-><init>(Ljumio/core/U1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljumio/core/U1;)V
    .locals 4
    .param p1    # Ljumio/core/U1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "installationIdProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/jumio/core/util/DefaultDeviceUtil;->a:Ljumio/core/U1;

    const/16 p1, 0xe

    .line 4
    new-array p1, p1, [B

    fill-array-data p1, :array_0

    const-wide v0, -0x57b1d3a5782c23a3L

    invoke-static {p1, v0, v1}, Lcom/jumio/commons/obfuscate/StringDeobfuscator;->deobfuscate([BJ)Ljava/lang/String;

    move-result-object p1

    const-string v0, "1"

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/16 v1, 0xc

    .line 5
    new-array v1, v1, [B

    fill-array-data v1, :array_1

    const-wide v2, -0x31534a9dd46a26a2L    # -9.906949329572288E70

    invoke-static {v1, v2, v3}, Lcom/jumio/commons/obfuscate/StringDeobfuscator;->deobfuscate([BJ)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    filled-new-array {p1, v0}, [Lkotlin/Pair;

    move-result-object p1

    .line 6
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/jumio/core/util/DefaultDeviceUtil;->b:Ljava/util/Map;

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x7dt
        0x59t
        -0x59t
        0x7t
        0x4bt
        0x16t
        0x4at
        0x3t
        -0x5et
        0x25t
        -0x7ct
        -0x5et
        0x52t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x19t
        -0x61t
        0x4ft
        0x32t
        -0x11t
        -0x1ft
        -0x4at
        -0x3et
        0x18t
        -0x4dt
        -0x55t
        -0x4ct
    .end array-data
.end method

.method public synthetic constructor <init>(Ljumio/core/U1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 7
    new-instance p1, Ljumio/core/N3;

    invoke-direct {p1}, Ljumio/core/N3;-><init>()V

    .line 8
    :cond_0
    invoke-direct {p0, p1}, Lcom/jumio/core/util/DefaultDeviceUtil;-><init>(Ljumio/core/U1;)V

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/core/environment/CpuInfo;->INSTANCE:Lcom/jumio/core/environment/CpuInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/core/environment/CpuInfo;->getCpuFamily()I

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "UNKNOWN ("

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const/16 v0, 0x29

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    .line 31
    :pswitch_0
    const-string v0, "MIPS64"

    .line 32
    return-object v0

    .line 33
    .line 34
    :pswitch_1
    const-string v0, "X86_64"

    .line 35
    return-object v0

    .line 36
    .line 37
    :pswitch_2
    const-string v0, "ARM64"

    .line 38
    return-object v0

    .line 39
    .line 40
    :pswitch_3
    const-string v0, "MIPS"

    .line 41
    return-object v0

    .line 42
    .line 43
    :pswitch_4
    const-string v0, "X86"

    .line 44
    return-object v0

    .line 45
    .line 46
    :pswitch_5
    const-string v0, "ARM"

    .line 47
    return-object v0

    .line 48
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public static b()Ljava/lang/String;
    .locals 15

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/core/environment/CpuInfo;->INSTANCE:Lcom/jumio/core/environment/CpuInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/core/environment/CpuInfo;->getCpuFeatures()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/environment/CpuInfo;->getCpuFamily()I

    .line 10
    move-result v0

    .line 11
    .line 12
    const-string v2, "CRC32 "

    .line 13
    .line 14
    const-string v3, "SHA2 "

    .line 15
    .line 16
    const-string v4, "SHA1 "

    .line 17
    .line 18
    const-string v5, "PMULL "

    .line 19
    .line 20
    const-string v6, "AES "

    .line 21
    .line 22
    const/16 v7, 0x40

    .line 23
    .line 24
    const/16 v8, 0x20

    .line 25
    .line 26
    const/16 v9, 0x10

    .line 27
    .line 28
    const/16 v10, 0x8

    .line 29
    const/4 v11, 0x4

    .line 30
    const/4 v12, 0x2

    .line 31
    .line 32
    const-string v13, ""

    .line 33
    const/4 v14, 0x1

    .line 34
    .line 35
    if-eq v0, v14, :cond_c

    .line 36
    .line 37
    if-eq v0, v12, :cond_8

    .line 38
    .line 39
    if-eq v0, v11, :cond_0

    .line 40
    return-object v13

    .line 41
    .line 42
    :cond_0
    and-int/lit8 v0, v1, 0x1

    .line 43
    .line 44
    if-ne v0, v14, :cond_1

    .line 45
    .line 46
    const-string v13, "FP "

    .line 47
    .line 48
    :cond_1
    and-int/lit8 v0, v1, 0x2

    .line 49
    .line 50
    if-ne v0, v12, :cond_2

    .line 51
    .line 52
    const-string v0, "ASIMD "

    .line 53
    .line 54
    .line 55
    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    move-result-object v13

    .line 57
    .line 58
    :cond_2
    and-int/lit8 v0, v1, 0x4

    .line 59
    .line 60
    if-ne v0, v11, :cond_3

    .line 61
    .line 62
    .line 63
    invoke-static {v13, v6}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    move-result-object v13

    .line 65
    .line 66
    :cond_3
    and-int/lit8 v0, v1, 0x8

    .line 67
    .line 68
    if-ne v0, v10, :cond_4

    .line 69
    .line 70
    .line 71
    invoke-static {v13, v5}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    move-result-object v13

    .line 73
    .line 74
    :cond_4
    and-int/lit8 v0, v1, 0x10

    .line 75
    .line 76
    if-ne v0, v9, :cond_5

    .line 77
    .line 78
    .line 79
    invoke-static {v13, v4}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    move-result-object v13

    .line 81
    .line 82
    :cond_5
    and-int/lit8 v0, v1, 0x20

    .line 83
    .line 84
    if-ne v0, v8, :cond_6

    .line 85
    .line 86
    .line 87
    invoke-static {v13, v3}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    move-result-object v13

    .line 89
    .line 90
    :cond_6
    and-int/lit8 v0, v1, 0x40

    .line 91
    .line 92
    if-ne v0, v7, :cond_7

    .line 93
    .line 94
    .line 95
    invoke-static {v13, v2}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    move-result-object v0

    .line 97
    return-object v0

    .line 98
    :cond_7
    return-object v13

    .line 99
    .line 100
    :cond_8
    and-int/lit8 v0, v1, 0x1

    .line 101
    .line 102
    if-ne v0, v14, :cond_9

    .line 103
    .line 104
    const-string v13, "SSSE3 "

    .line 105
    .line 106
    :cond_9
    and-int/lit8 v0, v1, 0x2

    .line 107
    .line 108
    if-ne v0, v12, :cond_a

    .line 109
    .line 110
    const-string v0, "POPCNT "

    .line 111
    .line 112
    .line 113
    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    move-result-object v13

    .line 115
    .line 116
    :cond_a
    and-int/lit8 v0, v1, 0x4

    .line 117
    .line 118
    if-ne v0, v11, :cond_b

    .line 119
    .line 120
    const-string v0, "MOVBE "

    .line 121
    .line 122
    .line 123
    invoke-static {v13, v0}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    move-result-object v0

    .line 125
    return-object v0

    .line 126
    :cond_b
    return-object v13

    .line 127
    .line 128
    :cond_c
    and-int/lit8 v0, v1, 0x1

    .line 129
    .line 130
    if-ne v0, v14, :cond_d

    .line 131
    .line 132
    const-string v13, "ARMv7 "

    .line 133
    .line 134
    :cond_d
    and-int/lit8 v0, v1, 0x2

    .line 135
    .line 136
    if-ne v0, v12, :cond_e

    .line 137
    .line 138
    const-string v0, "VFPv3 "

    .line 139
    .line 140
    .line 141
    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    move-result-object v13

    .line 143
    .line 144
    :cond_e
    and-int/lit8 v0, v1, 0x4

    .line 145
    .line 146
    if-ne v0, v11, :cond_f

    .line 147
    .line 148
    const-string v0, "NEON "

    .line 149
    .line 150
    .line 151
    invoke-static {v13, v0}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    move-result-object v13

    .line 153
    .line 154
    :cond_f
    and-int/lit8 v0, v1, 0x8

    .line 155
    .line 156
    if-ne v0, v10, :cond_10

    .line 157
    .line 158
    const-string v0, "LDREX_STREX "

    .line 159
    .line 160
    .line 161
    invoke-static {v13, v0}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    move-result-object v13

    .line 163
    .line 164
    :cond_10
    and-int/lit8 v0, v1, 0x10

    .line 165
    .line 166
    if-ne v0, v9, :cond_11

    .line 167
    .line 168
    const-string v0, "VFPv2 "

    .line 169
    .line 170
    .line 171
    invoke-static {v13, v0}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    move-result-object v13

    .line 173
    .line 174
    :cond_11
    and-int/lit8 v0, v1, 0x20

    .line 175
    .line 176
    if-ne v0, v8, :cond_12

    .line 177
    .line 178
    const-string v0, "VFP_D32 "

    .line 179
    .line 180
    .line 181
    invoke-static {v13, v0}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 182
    move-result-object v13

    .line 183
    .line 184
    :cond_12
    and-int/lit8 v0, v1, 0x40

    .line 185
    .line 186
    if-ne v0, v7, :cond_13

    .line 187
    .line 188
    const-string v0, "VFP_FP16 "

    .line 189
    .line 190
    .line 191
    invoke-static {v13, v0}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 192
    move-result-object v13

    .line 193
    .line 194
    :cond_13
    and-int/lit16 v0, v1, 0x80

    .line 195
    .line 196
    const/16 v7, 0x80

    .line 197
    .line 198
    if-ne v0, v7, :cond_14

    .line 199
    .line 200
    const-string v0, "VFP_FMA "

    .line 201
    .line 202
    .line 203
    invoke-static {v13, v0}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 204
    move-result-object v13

    .line 205
    .line 206
    :cond_14
    and-int/lit16 v0, v1, 0x100

    .line 207
    .line 208
    const/16 v7, 0x100

    .line 209
    .line 210
    if-ne v0, v7, :cond_15

    .line 211
    .line 212
    const-string v0, "NEON_FMA "

    .line 213
    .line 214
    .line 215
    invoke-static {v13, v0}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 216
    move-result-object v13

    .line 217
    .line 218
    :cond_15
    and-int/lit16 v0, v1, 0x200

    .line 219
    .line 220
    const/16 v7, 0x200

    .line 221
    .line 222
    if-ne v0, v7, :cond_16

    .line 223
    .line 224
    const-string v0, "IDIV_ARM "

    .line 225
    .line 226
    .line 227
    invoke-static {v13, v0}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    move-result-object v13

    .line 229
    .line 230
    :cond_16
    and-int/lit16 v0, v1, 0x400

    .line 231
    .line 232
    const/16 v7, 0x400

    .line 233
    .line 234
    if-ne v0, v7, :cond_17

    .line 235
    .line 236
    const-string v0, "IDIV_THUMB2 "

    .line 237
    .line 238
    .line 239
    invoke-static {v13, v0}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 240
    move-result-object v13

    .line 241
    .line 242
    :cond_17
    and-int/lit16 v0, v1, 0x800

    .line 243
    .line 244
    const/16 v7, 0x800

    .line 245
    .line 246
    if-ne v0, v7, :cond_18

    .line 247
    .line 248
    const-string v0, "iWMMXt "

    .line 249
    .line 250
    .line 251
    invoke-static {v13, v0}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 252
    move-result-object v13

    .line 253
    .line 254
    :cond_18
    and-int/lit16 v0, v1, 0x1000

    .line 255
    .line 256
    const/16 v7, 0x1000

    .line 257
    .line 258
    if-ne v0, v7, :cond_19

    .line 259
    .line 260
    .line 261
    invoke-static {v13, v6}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    move-result-object v13

    .line 263
    .line 264
    :cond_19
    and-int/lit16 v0, v1, 0x2000

    .line 265
    .line 266
    const/16 v6, 0x2000

    .line 267
    .line 268
    if-ne v0, v6, :cond_1a

    .line 269
    .line 270
    .line 271
    invoke-static {v13, v5}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 272
    move-result-object v13

    .line 273
    .line 274
    :cond_1a
    and-int/lit16 v0, v1, 0x4000

    .line 275
    .line 276
    const/16 v5, 0x4000

    .line 277
    .line 278
    if-ne v0, v5, :cond_1b

    .line 279
    .line 280
    .line 281
    invoke-static {v13, v4}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 282
    move-result-object v13

    .line 283
    .line 284
    .line 285
    :cond_1b
    const v0, 0x8000

    .line 286
    .line 287
    and-int v4, v1, v0

    .line 288
    .line 289
    if-ne v4, v0, :cond_1c

    .line 290
    .line 291
    .line 292
    invoke-static {v13, v3}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 293
    move-result-object v13

    .line 294
    .line 295
    :cond_1c
    const/high16 v0, 0x10000

    .line 296
    and-int/2addr v0, v1

    .line 297
    .line 298
    const/high16 v1, 0x10000

    .line 299
    .line 300
    if-ne v0, v1, :cond_1d

    .line 301
    .line 302
    .line 303
    invoke-static {v13, v2}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 304
    move-result-object v0

    .line 305
    return-object v0

    .line 306
    :cond_1d
    return-object v13
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method


# virtual methods
.method public areAnimationsEnabled(Landroid/content/Context;)Z
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_3

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    const-string v2, "animator_duration_scale"

    .line 10
    .line 11
    const/high16 v3, 0x3f800000    # 1.0f

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2, v3}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    cmpg-float v1, v1, v2

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    const-string v4, "transition_animation_scale"

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v4, v3}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 31
    move-result v1

    .line 32
    .line 33
    cmpg-float v1, v1, v2

    .line 34
    .line 35
    if-nez v1, :cond_1

    .line 36
    goto :goto_0

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    const-string v1, "window_animation_scale"

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v1, v3}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 46
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    cmpg-float p1, p1, v2

    .line 49
    .line 50
    if-nez p1, :cond_2

    .line 51
    goto :goto_0

    .line 52
    :catch_0
    :cond_2
    return v0

    .line 53
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 54
    return p1
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public hasEmulatorRelatedFiles()Z
    .locals 6

    .line 1
    .line 2
    const-string v4, "/system/bin/and64"

    .line 3
    .line 4
    const-string v5, "/init.goldfish.rc"

    .line 5
    .line 6
    const-string v0, "/dev/qemu_pipe"

    .line 7
    .line 8
    const-string v1, "/dev/qemu_pipe_virtio"

    .line 9
    .line 10
    const-string v2, "/system/bin/qemu-props"

    .line 11
    .line 12
    const-string v3, "/system/bin/vboxservice"

    .line 13
    .line 14
    .line 15
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    move-result v2

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    return v1

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    move-result v2

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    check-cast v2, Ljava/lang/String;

    .line 47
    .line 48
    new-instance v3, Ljava/io/File;

    .line 49
    .line 50
    .line 51
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 55
    move-result v2

    .line 56
    .line 57
    if-eqz v2, :cond_1

    .line 58
    const/4 v0, 0x1

    .line 59
    return v0

    .line 60
    :cond_2
    return v1
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public installationId(Landroid/content/Context;)Ljava/lang/String;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/jumio/core/util/DefaultDeviceUtil;->a:Ljumio/core/U1;

    .line 8
    .line 9
    check-cast v1, Ljumio/core/N3;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Ljumio/core/J0;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public isDarkModeActive(Landroid/content/Context;)Z
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 16
    .line 17
    and-int/lit8 p1, p1, 0x30

    .line 18
    .line 19
    const/16 v0, 0x20

    .line 20
    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public isDebug(Landroid/content/Context;)Z
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move p1, v0

    .line 14
    .line 15
    :goto_0
    and-int/lit8 p1, p1, 0x2

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_1
    return v0
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public isEmulatorPropertiesPresent()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/util/DefaultDeviceUtil;->b:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljumio/core/q3;->a(Ljava/util/Map;)Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public isSupportedPlatform(Landroid/content/Context;Z)Z
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/jumio/core/environment/Environment;->INSTANCE:Lcom/jumio/core/environment/Environment;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/jumio/core/environment/Environment;->loadCpuInfoLib(Landroid/content/Context;)Z

    .line 11
    move-result p1

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    return v0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {}, Lcom/jumio/core/util/DefaultDeviceUtil;->a()Ljava/lang/String;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    const-string v1, "ARM"

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    move-result p1

    .line 26
    const/4 v1, 0x1

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lcom/jumio/core/util/DefaultDeviceUtil;->b()Ljava/lang/String;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    const-string v2, "ARMv7"

    .line 35
    const/4 v3, 0x2

    .line 36
    const/4 v4, 0x0

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v2, v0, v3, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 40
    move-result p1

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/jumio/core/util/DefaultDeviceUtil;->b()Ljava/lang/String;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    const-string v2, "NEON"

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v2, v0, v3, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 52
    move-result p1

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    move p1, v1

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move p1, v0

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-static {}, Lcom/jumio/core/util/DefaultDeviceUtil;->a()Ljava/lang/String;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    const-string v3, "ARM64"

    .line 64
    .line 65
    .line 66
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v2

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lcom/jumio/core/util/DefaultDeviceUtil;->a()Ljava/lang/String;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    const-string v4, "X86"

    .line 74
    .line 75
    .line 76
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    move-result v3

    .line 78
    .line 79
    if-eqz v3, :cond_2

    .line 80
    .line 81
    if-eqz p2, :cond_2

    .line 82
    move v3, v1

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move v3, v0

    .line 85
    .line 86
    .line 87
    :goto_1
    invoke-static {}, Lcom/jumio/core/util/DefaultDeviceUtil;->a()Ljava/lang/String;

    .line 88
    move-result-object v4

    .line 89
    .line 90
    const-string v5, "X86_64"

    .line 91
    .line 92
    .line 93
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    move-result v4

    .line 95
    .line 96
    if-eqz v4, :cond_3

    .line 97
    .line 98
    if-eqz p2, :cond_3

    .line 99
    move p2, v1

    .line 100
    goto :goto_2

    .line 101
    :cond_3
    move p2, v0

    .line 102
    .line 103
    :goto_2
    if-nez p1, :cond_5

    .line 104
    .line 105
    if-nez v2, :cond_5

    .line 106
    .line 107
    if-nez v3, :cond_5

    .line 108
    .line 109
    if-eqz p2, :cond_4

    .line 110
    goto :goto_3

    .line 111
    :cond_4
    return v0

    .line 112
    :cond_5
    :goto_3
    return v1
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
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
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method public isTalkbackEnabled(Landroid/content/Context;)Z
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "accessibility"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x1

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 26
    move-result p1

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    return v1

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    return p1
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public userAgent(Landroid/content/Context;)Ljava/lang/String;
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "Android; "

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "; "

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const/16 v1, 0x20

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v1, "; SDK 4.17.0 (1)"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    const-string v1, "getPackageName(...)"

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    const/4 v1, 0x2

    .line 61
    const/4 v2, 0x0

    .line 62
    .line 63
    const-string v3, "com.jumio.instantverify"

    .line 64
    const/4 v4, 0x0

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v3, v4, v1, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 68
    move-result p1

    .line 69
    .line 70
    if-eqz p1, :cond_0

    .line 71
    .line 72
    const-string p1, "; instantverify"

    .line 73
    .line 74
    .line 75
    invoke-static {v0, p1}, Ljumio/core/D2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :cond_0
    return-object v0
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method
