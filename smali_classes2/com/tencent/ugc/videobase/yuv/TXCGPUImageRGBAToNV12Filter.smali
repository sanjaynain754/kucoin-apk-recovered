.class public Lcom/tencent/ugc/videobase/yuv/TXCGPUImageRGBAToNV12Filter;
.super Lcom/tencent/ugc/videobase/yuv/TXCGPUImageYUVOutputFilter;
.source "SourceFile"


# static fields
.field private static final RGBA_TO_NV12_FRAGMENT_SAHDER:Ljava/lang/String; = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform float width;\nuniform float height;\nvoid main(void) {\n vec3 offset = vec3(0.0625, 0.5, 0.5);\n vec3 ycoeff = vec3(0.256816, 0.504154, 0.0979137);\n vec3 ucoeff = vec3(-0.148246, -0.29102, 0.439266);\n vec3 vcoeff = vec3(0.439271, -0.367833, -0.071438);\n\n vec2 nowTxtPos = textureCoordinate;\n vec2 size = vec2(width, height);\n //stride\u4e00\u4e0b\uff0c\u5426\u5219\u6700\u540e\u6709\u900f\u660e\u7eff\u8fb9\uff08y\u901a\u9053\u6e32\u67d3\uff0cuv\u901a\u9053\u6ca1\u6e32\u67d3\uff09\n float stride = (8.0 - mod(height,8.0)) / height;\n //y\n if(nowTxtPos.y<0.25){\n     // y1 postion\n     vec2 now_pos = nowTxtPos * size;\n     vec2 basePos = now_pos * vec2(4.0,4.0) - vec2(1.5,1.5);\n     float addY = float(int(basePos.x / width));\n     basePos.x = basePos.x - addY * width;\n     basePos.y += addY;\n\n     float y1 = 0.0;\n     float y2 = 0.0;\n     float y3 = 0.0;\n     float y4 = 0.0;\n\n     vec2 samplingPos = basePos / size;\n     vec4 texel = texture2D(inputImageTexture, samplingPos);\n     y1 = dot(texel.rgb, ycoeff);\n     y1 += offset[0];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     y2 = dot(texel.rgb, ycoeff);\n     y2 += offset[0];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     y3 = dot(texel.rgb, ycoeff);\n     y3 += offset[0];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     y4 = dot(texel.rgb, ycoeff);\n     y4 += offset[0];\n\n     gl_FragColor = vec4(y1, y2, y3, y4);\n }\n//        uv\n else if(nowTxtPos.y < 0.375 + stride){\n     //           u1 postion\n     vec2 nowTxtPos = nowTxtPos - vec2(0,0.25);\n     vec2 now_pos = nowTxtPos * size;\n     vec2 basePos = now_pos * vec2(4.0,8.0) - vec2(1.5,1.5);\n     float addY = float(int(basePos.x / width));\n     basePos.x = basePos.x - addY * width;\n     basePos.y += (2.0 * addY);\n\n     float u1 = 0.0;\n     float v1 = 0.0;\n     float u2 = 0.0;\n     float v2 = 0.0;\n\n\n     vec2 samplingPos = basePos / size;\n     vec4 texel = texture2D(inputImageTexture, samplingPos);\n     u1 = dot(texel.rgb, ucoeff);\n     u1 += offset[1];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     v1 = dot(texel.rgb, vcoeff);\n     v1 += offset[2];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     u2 = dot(texel.rgb, ucoeff);\n     u2 += offset[1];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     v2 = dot(texel.rgb, vcoeff);\n     v2 += offset[2];\n\n     gl_FragColor = vec4(u1, v1, u2, v2);\n }\n else{\n     gl_FragColor = vec4(0, 0, 0, 0);\n }\n}"

.field public static final RGBA_TO_NV_PART:Ljava/lang/String; = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform float width;\nuniform float height;\nvoid main(void) {\n vec3 offset = vec3(0.0625, 0.5, 0.5);\n vec3 ycoeff = vec3(0.256816, 0.504154, 0.0979137);\n vec3 ucoeff = vec3(-0.148246, -0.29102, 0.439266);\n vec3 vcoeff = vec3(0.439271, -0.367833, -0.071438);\n\n vec2 nowTxtPos = textureCoordinate;\n vec2 size = vec2(width, height);\n //stride\u4e00\u4e0b\uff0c\u5426\u5219\u6700\u540e\u6709\u900f\u660e\u7eff\u8fb9\uff08y\u901a\u9053\u6e32\u67d3\uff0cuv\u901a\u9053\u6ca1\u6e32\u67d3\uff09\n float stride = (8.0 - mod(height,8.0)) / height;\n //y\n if(nowTxtPos.y<0.25){\n     // y1 postion\n     vec2 now_pos = nowTxtPos * size;\n     vec2 basePos = now_pos * vec2(4.0,4.0) - vec2(1.5,1.5);\n     float addY = float(int(basePos.x / width));\n     basePos.x = basePos.x - addY * width;\n     basePos.y += addY;\n\n     float y1 = 0.0;\n     float y2 = 0.0;\n     float y3 = 0.0;\n     float y4 = 0.0;\n\n     vec2 samplingPos = basePos / size;\n     vec4 texel = texture2D(inputImageTexture, samplingPos);\n     y1 = dot(texel.rgb, ycoeff);\n     y1 += offset[0];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     y2 = dot(texel.rgb, ycoeff);\n     y2 += offset[0];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     y3 = dot(texel.rgb, ycoeff);\n     y3 += offset[0];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     y4 = dot(texel.rgb, ycoeff);\n     y4 += offset[0];\n\n     gl_FragColor = vec4(y1, y2, y3, y4);\n }\n//        uv\n else if(nowTxtPos.y < 0.375 + stride){\n     //           u1 postion\n     vec2 nowTxtPos = nowTxtPos - vec2(0,0.25);\n     vec2 now_pos = nowTxtPos * size;\n     vec2 basePos = now_pos * vec2(4.0,8.0) - vec2(1.5,1.5);\n     float addY = float(int(basePos.x / width));\n     basePos.x = basePos.x - addY * width;\n     basePos.y += (2.0 * addY);\n\n     float u1 = 0.0;\n     float v1 = 0.0;\n     float u2 = 0.0;\n     float v2 = 0.0;\n\n\n     vec2 samplingPos = basePos / size;\n     vec4 texel = texture2D(inputImageTexture, samplingPos);\n     u1 = dot(texel.rgb, ucoeff);\n     u1 += offset[1];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     v1 = dot(texel.rgb, vcoeff);\n     v1 += offset[2];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     u2 = dot(texel.rgb, ucoeff);\n     u2 += offset[1];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     v2 = dot(texel.rgb, vcoeff);\n     v2 += offset[2];\n\n"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}"

    .line 3
    .line 4
    const-string v1, "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform float width;\nuniform float height;\nvoid main(void) {\n vec3 offset = vec3(0.0625, 0.5, 0.5);\n vec3 ycoeff = vec3(0.256816, 0.504154, 0.0979137);\n vec3 ucoeff = vec3(-0.148246, -0.29102, 0.439266);\n vec3 vcoeff = vec3(0.439271, -0.367833, -0.071438);\n\n vec2 nowTxtPos = textureCoordinate;\n vec2 size = vec2(width, height);\n //stride\u4e00\u4e0b\uff0c\u5426\u5219\u6700\u540e\u6709\u900f\u660e\u7eff\u8fb9\uff08y\u901a\u9053\u6e32\u67d3\uff0cuv\u901a\u9053\u6ca1\u6e32\u67d3\uff09\n float stride = (8.0 - mod(height,8.0)) / height;\n //y\n if(nowTxtPos.y<0.25){\n     // y1 postion\n     vec2 now_pos = nowTxtPos * size;\n     vec2 basePos = now_pos * vec2(4.0,4.0) - vec2(1.5,1.5);\n     float addY = float(int(basePos.x / width));\n     basePos.x = basePos.x - addY * width;\n     basePos.y += addY;\n\n     float y1 = 0.0;\n     float y2 = 0.0;\n     float y3 = 0.0;\n     float y4 = 0.0;\n\n     vec2 samplingPos = basePos / size;\n     vec4 texel = texture2D(inputImageTexture, samplingPos);\n     y1 = dot(texel.rgb, ycoeff);\n     y1 += offset[0];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     y2 = dot(texel.rgb, ycoeff);\n     y2 += offset[0];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     y3 = dot(texel.rgb, ycoeff);\n     y3 += offset[0];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     y4 = dot(texel.rgb, ycoeff);\n     y4 += offset[0];\n\n     gl_FragColor = vec4(y1, y2, y3, y4);\n }\n//        uv\n else if(nowTxtPos.y < 0.375 + stride){\n     //           u1 postion\n     vec2 nowTxtPos = nowTxtPos - vec2(0,0.25);\n     vec2 now_pos = nowTxtPos * size;\n     vec2 basePos = now_pos * vec2(4.0,8.0) - vec2(1.5,1.5);\n     float addY = float(int(basePos.x / width));\n     basePos.x = basePos.x - addY * width;\n     basePos.y += (2.0 * addY);\n\n     float u1 = 0.0;\n     float v1 = 0.0;\n     float u2 = 0.0;\n     float v2 = 0.0;\n\n\n     vec2 samplingPos = basePos / size;\n     vec4 texel = texture2D(inputImageTexture, samplingPos);\n     u1 = dot(texel.rgb, ucoeff);\n     u1 += offset[1];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     v1 = dot(texel.rgb, vcoeff);\n     v1 += offset[2];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     u2 = dot(texel.rgb, ucoeff);\n     u2 += offset[1];\n\n     basePos.x+=1.0;\n     samplingPos = basePos/size;\n     texel = texture2D(inputImageTexture, samplingPos);\n     v2 = dot(texel.rgb, vcoeff);\n     v2 += offset[2];\n\n     gl_FragColor = vec4(u1, v1, u2, v2);\n }\n else{\n     gl_FragColor = vec4(0, 0, 0, 0);\n }\n}"

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Lcom/tencent/ugc/videobase/yuv/TXCGPUImageYUVOutputFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    return-void
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
