.class public Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private colorMode:I

.field private duplex:Ljava/lang/Integer;

.field private margins:Lcom/pichillilorenzo/flutter_inappwebview_android/types/MarginsExt;

.field private mediaSize:Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;

.field private orientation:Ljava/lang/Integer;

.field private resolution:Lcom/pichillilorenzo/flutter_inappwebview_android/types/ResolutionExt;


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
.end method

.method public static fromPrintAttributes(Landroid/print/PrintAttributes;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;
    .locals 3

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    .line 6
    :cond_0
    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/print/PrintAttributes;->getColorMode()I

    .line 13
    move-result v1

    .line 14
    .line 15
    iput v1, v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->colorMode:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/print/PrintAttributes;->getDuplexMode()I

    .line 19
    move-result v1

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    iput-object v1, v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->duplex:Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/print/PrintAttributes;->getMediaSize()Landroid/print/PrintAttributes$MediaSize;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->fromMediaSize(Landroid/print/PrintAttributes$MediaSize;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    iput-object v2, v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->mediaSize:Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/print/PrintAttributes$MediaSize;->isPortrait()Z

    .line 41
    move-result v1

    .line 42
    .line 43
    xor-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    iput-object v1, v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->orientation:Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {p0}, Landroid/print/PrintAttributes;->getResolution()Landroid/print/PrintAttributes$Resolution;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/ResolutionExt;->fromResolution(Landroid/print/PrintAttributes$Resolution;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/ResolutionExt;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    iput-object v1, v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->resolution:Lcom/pichillilorenzo/flutter_inappwebview_android/types/ResolutionExt;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/print/PrintAttributes;->getMinMargins()Landroid/print/PrintAttributes$Margins;

    .line 63
    move-result-object p0

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MarginsExt;->fromMargins(Landroid/print/PrintAttributes$Margins;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/MarginsExt;

    .line 67
    move-result-object p0

    .line 68
    .line 69
    iput-object p0, v0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->margins:Lcom/pichillilorenzo/flutter_inappwebview_android/types/MarginsExt;

    .line 70
    return-object v0
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
.end method


# virtual methods
.method public toMap()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    iget v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->colorMode:I

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "colorMode"

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->duplex:Ljava/lang/Integer;

    .line 19
    .line 20
    const-string v2, "duplex"

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->orientation:Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    const-string/jumbo v2, "orientation"

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->mediaSize:Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;

    .line 34
    const/4 v2, 0x0

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MediaSizeExt;->toMap()Ljava/util/Map;

    .line 40
    move-result-object v1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v1, v2

    .line 43
    .line 44
    :goto_0
    const-string v3, "mediaSize"

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->resolution:Lcom/pichillilorenzo/flutter_inappwebview_android/types/ResolutionExt;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/ResolutionExt;->toMap()Ljava/util/Map;

    .line 55
    move-result-object v1

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move-object v1, v2

    .line 58
    .line 59
    .line 60
    :goto_1
    const-string/jumbo v3, "resolution"

    .line 61
    .line 62
    .line 63
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->margins:Lcom/pichillilorenzo/flutter_inappwebview_android/types/MarginsExt;

    .line 66
    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/MarginsExt;->toMap()Ljava/util/Map;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    :cond_2
    const-string v1, "margins"

    .line 74
    .line 75
    .line 76
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    return-object v0
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
.end method
