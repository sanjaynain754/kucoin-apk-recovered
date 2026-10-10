.class public final Ljumio/core/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;


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
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final createFragmentShader(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    const-string v0, "samplerVarName"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "fragCoordsVarName"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "\n\t#extension GL_OES_EGL_image_external : require\n\tprecision mediump float;\n\t\n\tuniform samplerExternalOES "

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, ";\n\tuniform float uAlphaScale;\n\tuniform float uScaleFactor;\n\tuniform float uIntensity;\n\tuniform int uRadius;\n\tuniform vec2 uResolution; \n\t\n\tvarying vec2 "

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, ";\n\t\n\tconst vec3 LUMA = vec3(0.333, 0.333, 0.333);\n\tconst float INV_60 = 1.0 / 60.0;\n\t\n\tvoid main() {\n\t\t// downscale coordinates for blur\n\t\tvec2 invResolution = 1.0 / uResolution;\n\t\tvec2 scaledCoord = floor("

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v1, " * uResolution / uScaleFactor) * uScaleFactor * invResolution;\n\t\t\n\t\t// kernel size for Kuwahara Filter\n\t\tfloat invKernelSize = 1.0 / float((uRadius + 1) * (uRadius + 1));\n\t\t\n\t\t// --- Kuwahara Filter ---\n\t\tvec3 means[4];\n\t\tvec3 variances[4];\n\t\tmeans[0] = means[1] = means[2] = means[3] = vec3(0.0);\n\t\tvariances[0] = variances[1] = variances[2] = variances[3] = vec3(0.0);\n\t\n\t\tfor (int y = -uRadius; y <= uRadius; ++y) {\n\t\t\tfor (int x = -uRadius; x <= uRadius; ++x) {\n\t\t\t\tvec2 uv = scaledCoord + vec2(float(x), float(y)) * invResolution;\n\t\t\t\tvec3 color = texture2D("

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v1, ", uv).rgb;\n\t\t\t\tvec3 colorSq = color * color;\n\t\n\t\t\t\t// Use step functions instead of branches\n\t\t\t\tfloat xPos = step(0.0, float(x)); // x >= 0\n\t\t\t\tfloat xPosInv = step(float(x), 0.0); // x <= 0\n\t\t\t\tfloat yPos = step(0.0, float(y)); // y >= 0\n\t\t\t\tfloat yPosInv = step(float(y), 0.0); // y <= 0\n\t\t\t\t\n\t\t\t\tmeans[0] += color * xPos * yPos;\n\t\t\t\tvariances[0] += colorSq * xPos * yPos;\n\t\t\t\t\n\t\t\t\tmeans[1] += color * xPos * yPosInv;\n\t\t\t\tvariances[1] += colorSq * xPos * yPosInv;\n\t\t\t\t\n\t\t\t\tmeans[2] += color * xPosInv * yPos;\n\t\t\t\tvariances[2] += colorSq * xPosInv * yPos;\n\t\t\t\t\n\t\t\t\tmeans[3] += color * xPosInv * yPosInv;\n\t\t\t\tvariances[3] += colorSq * xPosInv * yPosInv;\n\t\t\t}\n\t\t}\n\t\n\t\tfloat minVariance = 1e20;\n\t\tvec3 selectedMean = vec3(0.0);\n\t\n\t\tfor (int i = 0; i < 4; ++i) {\n\t\t\tvec3 mean = means[i] * invKernelSize;\n\t\t\tvec3 var = variances[i] * invKernelSize - mean * mean;\n\t\t\tfloat varianceSum = dot(var, vec3(1.0));\n\t\t\tif (varianceSum < minVariance) {\n\t\t\t\tminVariance = varianceSum;\n\t\t\t\tselectedMean = mean;\n\t\t\t}\n\t\t}\n\t\n\t\t// --- Grayscale and Stylize ---\n\t\tfloat gray = dot(selectedMean, LUMA);\n\t\tfloat whiteShift = pow(gray, 0.7);\n\t\tfloat discrete = floor(whiteShift * 60.0) * INV_60;\n\t\n\t\tvec3 filteredColor = vec3(discrete * uIntensity);\n\t\n\t\t// --- Simplified Laplacian Edge Detection ---\n\t\tvec3 up = texture2D("

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, ", "

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v2, " + vec2(0.0, invResolution.y)).rgb;\n\t\tvec3 down = texture2D("

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v2, " - vec2(0.0, invResolution.y)).rgb;\n\t\tvec3 right = texture2D("

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v2, " + vec2(invResolution.x, 0.0)).rgb;\n\t\tvec3 left = texture2D("

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string p1, " - vec2(invResolution.x, 0.0)).rgb;\n\t\n\t\tvec3 laplacian = up + down + right + left - 4.0 * selectedMean;\n\t\tfloat edgeStrength = dot(laplacian, vec3(1.0));\n\t\n\t\tgl_FragColor = vec4(mix(filteredColor, vec3(0.0), step(0.96, edgeStrength)), 1.0);\n\t}\n\t"

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    move-result-object p1

    .line 112
    return-object p1
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
.end method
