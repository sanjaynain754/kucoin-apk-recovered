.class public Lcom/tencent/ugc/videobase/yuv/TXCGPUImageRGBAToI420Filter;
.super Lcom/tencent/ugc/videobase/yuv/TXCGPUImageYUVOutputFilter;
.source "SourceFile"


# static fields
.field private static final RGBA_TO_I420_FRAG_SHADER:Ljava/lang/String; = "precision highp float;\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform float width;\nuniform float height;\nuniform vec3 offset;\nuniform mat3 convertMatrix;\n\nvoid main() {\n    vec2 yScale = vec2(4.0, 4.0);\n    vec2 uvScale = vec2(8.0, 8.0);\n\n    highp vec2 nowTxtPos = textureCoordinate;\n    vec2 size = vec2(width, height);\n    float imageRatio = width / height;\n\n    if (nowTxtPos.y < 0.25) { // 0.25 = 1 / 4, y\u5e73\u9762\u5360\u6574\u4e2atexture\u76841/4\n        // y1 postion\n        vec2 now_pos = nowTxtPos * size - vec2(0.375, 0.375);\n        vec2 basePos = now_pos * yScale;\n\n        float addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY;\n\n        float y1 = 0.0;\n        float y2 = 0.0;\n        float y3 = 0.0;\n        float y4 = 0.0;\n        vec2 samplingPos = basePos / size;\n        vec4 texel = texture2D(inputImageTexture, samplingPos);\n\n        y1 = dot(texel.rgb, convertMatrix[0]);\n        y1 += offset[0];\n\n        basePos.x += 1.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY;\n        samplingPos = basePos/ size;\n        texel = texture2D(inputImageTexture, samplingPos);\n\n        y2 = dot(texel.rgb, convertMatrix[0]);\n        y2 += offset[0];\n\n        basePos.x += 1.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY;\n        samplingPos = basePos/ size;\n        texel = texture2D(inputImageTexture, samplingPos);\n\n        y3 = dot(texel.rgb, convertMatrix[0]);\n        y3 += offset[0];\n\n        basePos.x += 1.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY;\n        samplingPos = basePos/ size;\n        texel = texture2D(inputImageTexture, samplingPos);\n\n        y4 = dot(texel.rgb, convertMatrix[0]);\n        y4 += offset[0];\n\n        gl_FragColor = vec4(y1, y2, y3, y4);\n    } else if (nowTxtPos.y < 0.3125) { // 0.3125 = 1/4 + 1/16\uff0cu\u5e73\u9762\u5360\u6574\u4e2atexture\u76840.25 ~ 0.3125\u8303\u56f4\n        nowTxtPos.y -= 0.25;\n        highp vec2 basePos = nowTxtPos * uvScale * size + vec2(1.0, -0.5);\n        highp float addY = float(int(basePos.x / width));\n        basePos.x -= addY * width;\n\n        basePos.y += addY;\n        basePos.y *= 2.0;\n        basePos -= clamp(uvScale * 0.5, vec2(0.0), uvScale);\n        basePos.y -= 2.0;\n\n        highp vec4 sample = texture2D(inputImageTexture, basePos/ size).rgba;\n        highp float u1 = dot(sample.rgb, convertMatrix[1]);\n        u1 += offset.y;\n\n        basePos.x+=2.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY * 2.0;\n        sample = texture2D(inputImageTexture, basePos/ size).rgba;\n        float u2 = dot(sample.rgb, convertMatrix[1]);\n        u2 += offset.y;\n\n        basePos.x+=2.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY * 2.0;\n        sample = texture2D(inputImageTexture, basePos / size).rgba;\n        float u3 = dot(sample.rgb, convertMatrix[1]);\n        u3 += offset.y;\n\n        basePos.x+=2.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY * 2.0;\n        sample = texture2D(inputImageTexture, basePos / size).rgba;\n        float u4 = dot(sample.rgb, convertMatrix[1]);\n        u4 += offset.y;\n\n        gl_FragColor = vec4(u1, u2, u3, u4);\n    } else if (nowTxtPos.y < 0.375) { // 0.375 = 1/4 + 1/16 + 1/16\uff0cv\u5e73\u9762\u5360\u6574\u4e2atexture\u76840.3125 ~ 0.375\u8303\u56f4\n        nowTxtPos -= vec2(0,0.3125);\n        highp vec2 basePos = nowTxtPos * uvScale * size + vec2(0.5, -0.5);\n        highp float addY = float(int(basePos.x / width));\n        basePos.x -= addY * width;\n\n        basePos.y += addY;\n        basePos.y *= 2.0;\n        basePos -= clamp(uvScale * 0.5, vec2(0.0), uvScale);\n        basePos.y -= 2.0;\n\n        highp vec4 sample = texture2D(inputImageTexture, basePos / size).rgba;\n        highp float v1 = dot(sample.rgb, convertMatrix[2]);\n        v1 += offset.z;\n\n        basePos.x += 2.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY * 2.0;\n        sample = texture2D(inputImageTexture, basePos / size).rgba;\n        float v2 = dot(sample.rgb, convertMatrix[2]);\n        v2 += offset.z;\n\n        basePos.x += 2.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY * 2.0;\n        sample = texture2D(inputImageTexture, basePos / size).rgba;\n        float v3 = dot(sample.rgb, convertMatrix[2]);\n        v3 += offset.z;\n\n        basePos.x += 2.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY * 2.0;\n        sample = texture2D(inputImageTexture, basePos / size).rgba;\n        float v4 = dot(sample.rgb, convertMatrix[2]);\n        v4 += offset.z;\n\n        gl_FragColor = vec4(v1, v2, v3, v4);\n        // gl_FragColor = vec4(0.5, 0.5, 0.5, 0.5);\\\\\\\\\\\\\\\\n +\n    } else {\n    }\n}"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}"

    .line 3
    .line 4
    const-string v1, "precision highp float;\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform float width;\nuniform float height;\nuniform vec3 offset;\nuniform mat3 convertMatrix;\n\nvoid main() {\n    vec2 yScale = vec2(4.0, 4.0);\n    vec2 uvScale = vec2(8.0, 8.0);\n\n    highp vec2 nowTxtPos = textureCoordinate;\n    vec2 size = vec2(width, height);\n    float imageRatio = width / height;\n\n    if (nowTxtPos.y < 0.25) { // 0.25 = 1 / 4, y\u5e73\u9762\u5360\u6574\u4e2atexture\u76841/4\n        // y1 postion\n        vec2 now_pos = nowTxtPos * size - vec2(0.375, 0.375);\n        vec2 basePos = now_pos * yScale;\n\n        float addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY;\n\n        float y1 = 0.0;\n        float y2 = 0.0;\n        float y3 = 0.0;\n        float y4 = 0.0;\n        vec2 samplingPos = basePos / size;\n        vec4 texel = texture2D(inputImageTexture, samplingPos);\n\n        y1 = dot(texel.rgb, convertMatrix[0]);\n        y1 += offset[0];\n\n        basePos.x += 1.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY;\n        samplingPos = basePos/ size;\n        texel = texture2D(inputImageTexture, samplingPos);\n\n        y2 = dot(texel.rgb, convertMatrix[0]);\n        y2 += offset[0];\n\n        basePos.x += 1.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY;\n        samplingPos = basePos/ size;\n        texel = texture2D(inputImageTexture, samplingPos);\n\n        y3 = dot(texel.rgb, convertMatrix[0]);\n        y3 += offset[0];\n\n        basePos.x += 1.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY;\n        samplingPos = basePos/ size;\n        texel = texture2D(inputImageTexture, samplingPos);\n\n        y4 = dot(texel.rgb, convertMatrix[0]);\n        y4 += offset[0];\n\n        gl_FragColor = vec4(y1, y2, y3, y4);\n    } else if (nowTxtPos.y < 0.3125) { // 0.3125 = 1/4 + 1/16\uff0cu\u5e73\u9762\u5360\u6574\u4e2atexture\u76840.25 ~ 0.3125\u8303\u56f4\n        nowTxtPos.y -= 0.25;\n        highp vec2 basePos = nowTxtPos * uvScale * size + vec2(1.0, -0.5);\n        highp float addY = float(int(basePos.x / width));\n        basePos.x -= addY * width;\n\n        basePos.y += addY;\n        basePos.y *= 2.0;\n        basePos -= clamp(uvScale * 0.5, vec2(0.0), uvScale);\n        basePos.y -= 2.0;\n\n        highp vec4 sample = texture2D(inputImageTexture, basePos/ size).rgba;\n        highp float u1 = dot(sample.rgb, convertMatrix[1]);\n        u1 += offset.y;\n\n        basePos.x+=2.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY * 2.0;\n        sample = texture2D(inputImageTexture, basePos/ size).rgba;\n        float u2 = dot(sample.rgb, convertMatrix[1]);\n        u2 += offset.y;\n\n        basePos.x+=2.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY * 2.0;\n        sample = texture2D(inputImageTexture, basePos / size).rgba;\n        float u3 = dot(sample.rgb, convertMatrix[1]);\n        u3 += offset.y;\n\n        basePos.x+=2.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY * 2.0;\n        sample = texture2D(inputImageTexture, basePos / size).rgba;\n        float u4 = dot(sample.rgb, convertMatrix[1]);\n        u4 += offset.y;\n\n        gl_FragColor = vec4(u1, u2, u3, u4);\n    } else if (nowTxtPos.y < 0.375) { // 0.375 = 1/4 + 1/16 + 1/16\uff0cv\u5e73\u9762\u5360\u6574\u4e2atexture\u76840.3125 ~ 0.375\u8303\u56f4\n        nowTxtPos -= vec2(0,0.3125);\n        highp vec2 basePos = nowTxtPos * uvScale * size + vec2(0.5, -0.5);\n        highp float addY = float(int(basePos.x / width));\n        basePos.x -= addY * width;\n\n        basePos.y += addY;\n        basePos.y *= 2.0;\n        basePos -= clamp(uvScale * 0.5, vec2(0.0), uvScale);\n        basePos.y -= 2.0;\n\n        highp vec4 sample = texture2D(inputImageTexture, basePos / size).rgba;\n        highp float v1 = dot(sample.rgb, convertMatrix[2]);\n        v1 += offset.z;\n\n        basePos.x += 2.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY * 2.0;\n        sample = texture2D(inputImageTexture, basePos / size).rgba;\n        float v2 = dot(sample.rgb, convertMatrix[2]);\n        v2 += offset.z;\n\n        basePos.x += 2.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY * 2.0;\n        sample = texture2D(inputImageTexture, basePos / size).rgba;\n        float v3 = dot(sample.rgb, convertMatrix[2]);\n        v3 += offset.z;\n\n        basePos.x += 2.0;\n        addY = float(int((basePos.x / width)));\n        basePos.x -= addY * width;\n        basePos.y += addY * 2.0;\n        sample = texture2D(inputImageTexture, basePos / size).rgba;\n        float v4 = dot(sample.rgb, convertMatrix[2]);\n        v4 += offset.z;\n\n        gl_FragColor = vec4(v1, v2, v3, v4);\n        // gl_FragColor = vec4(0.5, 0.5, 0.5, 0.5);\\\\\\\\\\\\\\\\n +\n    } else {\n    }\n}"

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
