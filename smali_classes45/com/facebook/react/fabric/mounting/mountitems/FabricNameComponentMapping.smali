.class public final Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;
.super Ljava/lang/Object;
.source "FabricNameComponentMapping.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;",
        "",
        "<init>",
        "()V",
        "componentNames",
        "",
        "",
        "getFabricComponentName",
        "componentName",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final componentNames:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;->INSTANCE:Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;

    .line 8
    .line 9
    const-string v0, "View"

    .line 10
    .line 11
    const-string v1, "RCTView"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    const-string v0, "Image"

    .line 18
    .line 19
    const-string v1, "RCTImageView"

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    const-string v0, "ScrollView"

    .line 26
    .line 27
    const-string v1, "RCTScrollView"

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    const-string v0, "Slider"

    .line 34
    .line 35
    const-string v1, "RCTSlider"

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 39
    move-result-object v5

    .line 40
    .line 41
    const-string v0, "ModalHostView"

    .line 42
    .line 43
    const-string v1, "RCTModalHostView"

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 47
    move-result-object v6

    .line 48
    .line 49
    const-string v0, "Paragraph"

    .line 50
    .line 51
    const-string v1, "RCTText"

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 55
    move-result-object v7

    .line 56
    .line 57
    const-string v0, "Text"

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 61
    move-result-object v8

    .line 62
    .line 63
    const-string v0, "RawText"

    .line 64
    .line 65
    const-string v1, "RCTRawText"

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 69
    move-result-object v9

    .line 70
    .line 71
    const-string v0, "ActivityIndicatorView"

    .line 72
    .line 73
    const-string v1, "AndroidProgressBar"

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 77
    move-result-object v10

    .line 78
    .line 79
    const-string v0, "ShimmeringView"

    .line 80
    .line 81
    const-string v1, "RKShimmeringView"

    .line 82
    .line 83
    .line 84
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 85
    move-result-object v11

    .line 86
    .line 87
    const-string v0, "TemplateView"

    .line 88
    .line 89
    const-string v1, "RCTTemplateView"

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 93
    move-result-object v12

    .line 94
    .line 95
    const-string v0, "AxialGradientView"

    .line 96
    .line 97
    const-string v1, "RCTAxialGradientView"

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 101
    move-result-object v13

    .line 102
    .line 103
    const-string v0, "Video"

    .line 104
    .line 105
    const-string v1, "RCTVideo"

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 109
    move-result-object v14

    .line 110
    .line 111
    const-string v0, "Map"

    .line 112
    .line 113
    const-string v1, "RCTMap"

    .line 114
    .line 115
    .line 116
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 117
    move-result-object v15

    .line 118
    .line 119
    const-string v0, "WebView"

    .line 120
    .line 121
    const-string v1, "RCTWebView"

    .line 122
    .line 123
    .line 124
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 125
    move-result-object v16

    .line 126
    .line 127
    const-string v0, "Keyframes"

    .line 128
    .line 129
    const-string v1, "RCTKeyframes"

    .line 130
    .line 131
    .line 132
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 133
    move-result-object v17

    .line 134
    .line 135
    const-string v0, "ImpressionTrackingView"

    .line 136
    .line 137
    const-string v1, "RCTImpressionTrackingView"

    .line 138
    .line 139
    .line 140
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 141
    move-result-object v18

    .line 142
    .line 143
    .line 144
    filled-new-array/range {v2 .. v18}, [Lkotlin/Pair;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    .line 148
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 149
    move-result-object v0

    .line 150
    .line 151
    sput-object v0, Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;->componentNames:Ljava/util/Map;

    .line 152
    return-void
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
.end method

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
    .line 17
    .line 18
.end method

.method public static final getFabricComponentName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "componentName"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;->componentNames:Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    return-object p0

    .line 17
    :cond_0
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
