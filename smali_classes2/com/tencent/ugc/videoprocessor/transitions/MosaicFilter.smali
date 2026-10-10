.class public Lcom/tencent/ugc/videoprocessor/transitions/MosaicFilter;
.super Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;
.source "SourceFile"


# static fields
.field private static final FRAGMENT:Ljava/lang/String; = "precision mediump float;\nvarying mediump vec2 _uv;\nuniform sampler2D inputImageTexture;\nuniform float progress;\nuniform float ratio;\n#define PI 3.14159265358979323\n#define POW2(X) X*X\n#define POW3(X) X*X*X\nconst int endx = 2; // = 2\nconst int endy = -1; // = -1\nvec4 getFromColor(in vec2 uv){\n    vec2 fromTexture = vec2(uv.x,1.0 - uv.y);\n    vec4 fromColor = texture2D(inputImageTexture,fromTexture);\n    return fromColor;\n}\nvec4 getToColor(in vec2 uv){\n    vec2 toTexture = vec2(uv.x,1.0-uv.y);\n    vec4 toColor = texture2D(inputImageTexture,toTexture);\n    return toColor;\n}\nfloat Rand(vec2 v) {\n  return fract(sin(dot(v.xy ,vec2(12.9898,78.233))) * 43758.5453);\n}\nvec2 Rotate(vec2 v, float a) {\n  mat2 rm = mat2(cos(a), -sin(a),\n                 sin(a), cos(a));\n  return rm*v;\n}\nfloat CosInterpolation(float x) {\n  return -cos(x*PI)/2.+.5;\n}\nvec4 transition(vec2 uv) {\n  vec2 p = uv.xy / vec2(1.0).xy - .5;\n  vec2 rp = p;\n  float rpr = (progress*2.-1.);\n  float z = -(rpr*rpr*2.) + 3.;\n  float az = abs(z);\n  rp *= az;\n  rp += mix(vec2(.5, .5), vec2(float(endx) + .5, float(endy) + .5), POW2(CosInterpolation(progress)));\n  vec2 mrp = mod(rp, 1.);\n  vec2 crp = rp;\n  bool onEnd = int(floor(crp.x))==endx&&int(floor(crp.y))==endy;\n  if(!onEnd) {\n    float ang = float(int(Rand(floor(crp))*4.))*.5*PI;\n    mrp = vec2(.5) + Rotate(mrp-vec2(.5), ang);\n  }\n  if(onEnd || Rand(floor(crp))>.5) {\n    return getToColor(mrp);\n  } else {\n    return getFromColor(mrp);\n  }\n}\nvoid main() {\n    gl_FragColor = transition(_uv);\n}"


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "attribute vec2 position; \nvarying mediump vec2 _uv;\n  \nvoid main() \n{ \n    gl_Position = vec4(position,0,1); \n    vec2 uv = position * 0.5 + 0.5;\n    _uv = vec2(uv.x,1.0 - uv.y);\n}"

    .line 3
    .line 4
    const-string v1, "precision mediump float;\nvarying mediump vec2 _uv;\nuniform sampler2D inputImageTexture;\nuniform float progress;\nuniform float ratio;\n#define PI 3.14159265358979323\n#define POW2(X) X*X\n#define POW3(X) X*X*X\nconst int endx = 2; // = 2\nconst int endy = -1; // = -1\nvec4 getFromColor(in vec2 uv){\n    vec2 fromTexture = vec2(uv.x,1.0 - uv.y);\n    vec4 fromColor = texture2D(inputImageTexture,fromTexture);\n    return fromColor;\n}\nvec4 getToColor(in vec2 uv){\n    vec2 toTexture = vec2(uv.x,1.0-uv.y);\n    vec4 toColor = texture2D(inputImageTexture,toTexture);\n    return toColor;\n}\nfloat Rand(vec2 v) {\n  return fract(sin(dot(v.xy ,vec2(12.9898,78.233))) * 43758.5453);\n}\nvec2 Rotate(vec2 v, float a) {\n  mat2 rm = mat2(cos(a), -sin(a),\n                 sin(a), cos(a));\n  return rm*v;\n}\nfloat CosInterpolation(float x) {\n  return -cos(x*PI)/2.+.5;\n}\nvec4 transition(vec2 uv) {\n  vec2 p = uv.xy / vec2(1.0).xy - .5;\n  vec2 rp = p;\n  float rpr = (progress*2.-1.);\n  float z = -(rpr*rpr*2.) + 3.;\n  float az = abs(z);\n  rp *= az;\n  rp += mix(vec2(.5, .5), vec2(float(endx) + .5, float(endy) + .5), POW2(CosInterpolation(progress)));\n  vec2 mrp = mod(rp, 1.);\n  vec2 crp = rp;\n  bool onEnd = int(floor(crp.x))==endx&&int(floor(crp.y))==endy;\n  if(!onEnd) {\n    float ang = float(int(Rand(floor(crp))*4.))*.5*PI;\n    mrp = vec2(.5) + Rotate(mrp-vec2(.5), ang);\n  }\n  if(onEnd || Rand(floor(crp))>.5) {\n    return getToColor(mrp);\n  } else {\n    return getFromColor(mrp);\n  }\n}\nvoid main() {\n    gl_FragColor = transition(_uv);\n}"

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0, v1, p1}, Lcom/tencent/ugc/videoprocessor/transitions/TXCGPUTransitionFilterBase;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

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
