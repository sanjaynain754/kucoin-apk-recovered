.class final Lcom/tencent/ugc/preprocessor/GPUPreprocessor$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/ugc/videobase/videobase/FrameConverter$FrameConvertListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/ugc/preprocessor/GPUPreprocessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public a:I

.field public b:Lcom/tencent/ugc/videobase/videobase/ConvertParams;

.field public c:Lcom/tencent/liteav/videobase/base/GLConstants$a;

.field public d:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

.field public e:Lcom/tencent/ugc/preprocessor/VideoPreprocessorListener;

.field final synthetic f:Lcom/tencent/ugc/preprocessor/GPUPreprocessor;


# direct methods
.method public constructor <init>(Lcom/tencent/ugc/preprocessor/GPUPreprocessor;ILcom/tencent/ugc/videobase/videobase/ConvertParams;Lcom/tencent/liteav/videobase/base/GLConstants$a;Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;Lcom/tencent/ugc/preprocessor/VideoPreprocessorListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/ugc/preprocessor/GPUPreprocessor$c;->f:Lcom/tencent/ugc/preprocessor/GPUPreprocessor;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iput p2, p0, Lcom/tencent/ugc/preprocessor/GPUPreprocessor$c;->a:I

    .line 8
    .line 9
    iput-object p3, p0, Lcom/tencent/ugc/preprocessor/GPUPreprocessor$c;->b:Lcom/tencent/ugc/videobase/videobase/ConvertParams;

    .line 10
    .line 11
    iput-object p5, p0, Lcom/tencent/ugc/preprocessor/GPUPreprocessor$c;->d:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    .line 12
    .line 13
    iput-object p4, p0, Lcom/tencent/ugc/preprocessor/GPUPreprocessor$c;->c:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/tencent/ugc/preprocessor/GPUPreprocessor$c;->e:Lcom/tencent/ugc/preprocessor/VideoPreprocessorListener;

    .line 16
    return-void
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
.end method


# virtual methods
.method public final onFrameConverted(ILcom/tencent/ugc/videobase/frame/PixelFrame;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/ugc/preprocessor/GPUPreprocessor$c;->e:Lcom/tencent/ugc/preprocessor/VideoPreprocessorListener;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/ugc/preprocessor/GPUPreprocessor$c;->f:Lcom/tencent/ugc/preprocessor/GPUPreprocessor;

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/tencent/ugc/preprocessor/GPUPreprocessor;->access$000(Lcom/tencent/ugc/preprocessor/GPUPreprocessor;)Lcom/tencent/ugc/videobase/egl/EGLCore;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/tencent/ugc/preprocessor/GPUPreprocessor$c;->e:Lcom/tencent/ugc/preprocessor/VideoPreprocessorListener;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p1, p2}, Lcom/tencent/ugc/preprocessor/VideoPreprocessorListener;->didProcessFrame(ILcom/tencent/ugc/videobase/frame/PixelFrame;)V

    .line 19
    .line 20
    iget-object p1, p0, Lcom/tencent/ugc/preprocessor/GPUPreprocessor$c;->f:Lcom/tencent/ugc/preprocessor/GPUPreprocessor;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/tencent/ugc/preprocessor/GPUPreprocessor;->access$100(Lcom/tencent/ugc/preprocessor/GPUPreprocessor;)Z

    .line 24
    :cond_1
    :goto_0
    return-void
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
.end method
