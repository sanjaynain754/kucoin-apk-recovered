.class public Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUDarkFilter;
.super Lcom/tencent/ugc/videoprocessor/videoeffect/TXCGPUEffectFilterBase;
.source "SourceFile"


# static fields
.field private static final FRAGMENT_SHADER:Ljava/lang/String; = "precision mediump float;  \nvarying vec2 textureCoordinate;  \nuniform sampler2D inputImageTexture;  \nuniform vec2 textureSize;  \nconst mat3 xKernal = mat3(-1.0, 0.0, 1.0,  \n                          -2.0, 0.0, 2.0,  \n                          -1.0, 0.0, 1.0);  \nconst mat3 yKernal = mat3(1.0, 2.0, 1.0,  \n                          0.0, 0.0, 0.0,  \n                          -1.0, -2.0, -1.0);  \nconst vec3 LW = vec3(0.2125, 0.7154, 0.0721);  \nfloat convolution3x3(float invalue[9], mat3 kernal)  \n{  \n   float v = 0.0;  \n   v += invalue[0] * kernal[0][0];  \n   v += invalue[1] * kernal[0][1];  \n   v += invalue[2] * kernal[0][2];  \n   v += invalue[3] * kernal[1][0];  \n   v += invalue[4] * kernal[1][1];  \n   v += invalue[5] * kernal[1][2];  \n   v += invalue[6] * kernal[2][0];  \n   v += invalue[7] * kernal[2][1];  \n   v += invalue[8] * kernal[2][2];  \n   return v;  \n}  \nvoid main()  \n{  \n   float gray[9];  \n   vec2 offsets[9];  \n   offsets[0] = vec2(-1.0, 1.0);  \n   offsets[1] = vec2(0.0, 1.0);  \n   offsets[2] = vec2(1.0, 1.0);  \n   offsets[3] = vec2(-1.0, 0.0);  \n   offsets[4] = vec2(0.0, 0.0);  \n   offsets[5] = vec2(0.0, 1.0);  \n   offsets[6] = vec2(-1.0, -1.0);  \n   offsets[7] = vec2(0.0, -1.0);  \n   offsets[8] = vec2(1.0, -1.0);  \n   vec2 _step = vec2(1.0 / textureSize.x, 1.0 / textureSize.y);  \n   for (int i = 0; i < 9; ++i)  \n   {  \n       gray[i] = dot(texture2D(inputImageTexture, textureCoordinate + _step * offsets[i]).xyz, LW);  \n   }  \n   vec2 G = vec2(convolution3x3(gray, xKernal), convolution3x3(gray, yKernal));  \n   gl_FragColor = vec4(vec3(length(G)), 1.0);  \n}  \n"


# instance fields
.field private mSizeLocation:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}"

    .line 3
    .line 4
    const-string v1, "precision mediump float;  \nvarying vec2 textureCoordinate;  \nuniform sampler2D inputImageTexture;  \nuniform vec2 textureSize;  \nconst mat3 xKernal = mat3(-1.0, 0.0, 1.0,  \n                          -2.0, 0.0, 2.0,  \n                          -1.0, 0.0, 1.0);  \nconst mat3 yKernal = mat3(1.0, 2.0, 1.0,  \n                          0.0, 0.0, 0.0,  \n                          -1.0, -2.0, -1.0);  \nconst vec3 LW = vec3(0.2125, 0.7154, 0.0721);  \nfloat convolution3x3(float invalue[9], mat3 kernal)  \n{  \n   float v = 0.0;  \n   v += invalue[0] * kernal[0][0];  \n   v += invalue[1] * kernal[0][1];  \n   v += invalue[2] * kernal[0][2];  \n   v += invalue[3] * kernal[1][0];  \n   v += invalue[4] * kernal[1][1];  \n   v += invalue[5] * kernal[1][2];  \n   v += invalue[6] * kernal[2][0];  \n   v += invalue[7] * kernal[2][1];  \n   v += invalue[8] * kernal[2][2];  \n   return v;  \n}  \nvoid main()  \n{  \n   float gray[9];  \n   vec2 offsets[9];  \n   offsets[0] = vec2(-1.0, 1.0);  \n   offsets[1] = vec2(0.0, 1.0);  \n   offsets[2] = vec2(1.0, 1.0);  \n   offsets[3] = vec2(-1.0, 0.0);  \n   offsets[4] = vec2(0.0, 0.0);  \n   offsets[5] = vec2(0.0, 1.0);  \n   offsets[6] = vec2(-1.0, -1.0);  \n   offsets[7] = vec2(0.0, -1.0);  \n   offsets[8] = vec2(1.0, -1.0);  \n   vec2 _step = vec2(1.0 / textureSize.x, 1.0 / textureSize.y);  \n   for (int i = 0; i < 9; ++i)  \n   {  \n       gray[i] = dot(texture2D(inputImageTexture, textureCoordinate + _step * offsets[i]).xyz, LW);  \n   }  \n   vec2 G = vec2(convolution3x3(gray, xKernal), convolution3x3(gray, yKernal));  \n   gl_FragColor = vec4(vec3(length(G)), 1.0);  \n}  \n"

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Lcom/tencent/ugc/videoprocessor/videoeffect/TXCGPUEffectFilterBase;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    const/4 v0, -0x1

    .line 9
    .line 10
    iput v0, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUDarkFilter;->mSizeLocation:I

    .line 11
    return-void
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
.end method


# virtual methods
.method public onInit(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/tencent/ugc/videoprocessor/videoeffect/TXCGPUEffectFilterBase;->onInit(Lcom/tencent/ugc/videobase/frame/GLTexturePool;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->getProgramId()I

    .line 7
    move-result p1

    .line 8
    .line 9
    const-string v0, "textureSize"

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 13
    move-result p1

    .line 14
    .line 15
    iput p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUDarkFilter;->mSizeLocation:I

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
.end method

.method public onOutputSizeChanged(II)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->onOutputSizeChanged(II)V

    .line 4
    int-to-float p1, p1

    .line 5
    int-to-float p2, p2

    .line 6
    const/4 v0, 0x2

    .line 7
    .line 8
    new-array v0, v0, [F

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    aput p1, v0, v1

    .line 12
    const/4 p1, 0x1

    .line 13
    .line 14
    aput p2, v0, p1

    .line 15
    .line 16
    iget p1, p0, Lcom/tencent/ugc/videoprocessor/videoeffect/filter/TXCGPUDarkFilter;->mSizeLocation:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, Lcom/tencent/ugc/videobase/chain/TXCGPUImageFilter;->setFloatVec2OnDraw(I[F)V

    .line 20
    return-void
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
