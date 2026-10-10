package com.opensource.svgaplayer.entities;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.opensource.svgaplayer.proto.ShapeEntity;
import com.opensource.svgaplayer.proto.Transform;
import com.tencent.rmonitor.base.p144db.table.TrafficInfoTable;
import i90.C38489b;
import i90.C38491d;
import i90.C38492e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SVGAVideoShapeEntity.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\t>B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0007J\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0007J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0007R$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R@\u0010(\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010#2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b&\u0010'R(\u0010-\u001a\u0004\u0018\u00010)2\b\u0010\u001e\u001a\u0004\u0018\u00010)8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,R(\u00102\u001a\u0004\u0018\u00010.2\b\u0010\u001e\u001a\u0004\u0018\u00010.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010/\u001a\u0004\b0\u00101R$\u00109\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0011\u0010=\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006?"}, m90084d2 = {"Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity;", "", "Lorg/json/JSONObject;", "obj", "<init>", "(Lorg/json/JSONObject;)V", "Lcom/opensource/svgaplayer/proto/ShapeEntity;", "(Lcom/opensource/svgaplayer/proto/ShapeEntity;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "q", "p", "k", "j", "Lorg/json/JSONArray;", "", "e", "(Lorg/json/JSONArray;)F", "c", "m", "Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;", "color", "d", "(Lcom/opensource/svgaplayer/proto/ShapeEntity$ShapeStyle$RGBAColor;)F", "b", CmcdData.Factory.STREAM_TYPE_LIVE, "o", "n", "Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;", "<set-?>", "Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;", "getType", "()Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;", "type", "", "", "Ljava/util/Map;", "getArgs", "()Ljava/util/Map;", "args", "Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$a;", "Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$a;", "g", "()Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$a;", "styles", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Landroid/graphics/Matrix;", ViewProps.TRANSFORM, "Landroid/graphics/Path;", "Landroid/graphics/Path;", "f", "()Landroid/graphics/Path;", "setShapePath", "(Landroid/graphics/Path;)V", "shapePath", "", "i", "()Z", "isKeep", "Type", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class SVGAVideoShapeEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Type type = Type.shape;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Map<String, ? extends Object> args;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public C27323a styles;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Matrix transform;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Path shapePath;

    /* JADX INFO: compiled from: SVGAVideoShapeEntity.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$Type;", "", "(Ljava/lang/String;I)V", "shape", "rect", "ellipse", "keep", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 1, 15})
    public enum Type {
        shape,
        rect,
        ellipse,
        keep
    }

    /* JADX INFO: renamed from: com.opensource.svgaplayer.entities.SVGAVideoShapeEntity$a */
    /* JADX INFO: compiled from: SVGAVideoShapeEntity.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00108\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\f\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010!\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b \u0010\u001dR*\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u001f\u0010\b\"\u0004\b\"\u0010\nR*\u0010)\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010%\u001a\u0004\b\u0011\u0010&\"\u0004\b'\u0010(¨\u0006*"}, m90084d2 = {"Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity$a;", "", "<init>", "()V", "", "<set-?>", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "()I", CmcdData.Factory.STREAMING_FORMAT_HLS, "(I)V", "fill", "b", "f", "m", "stroke", "", "c", "F", "g", "()F", "n", "(F)V", "strokeWidth", "", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "i", "(Ljava/lang/String;)V", "lineCap", "e", "k", "lineJoin", CmcdData.Factory.STREAM_TYPE_LIVE, "miterLimit", "", "[F", "()[F", "j", "([F)V", "lineDash", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
    public static final class C27323a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int fill;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int stroke;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public float strokeWidth;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public int miterLimit;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public String lineCap = "butt";

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public String lineJoin = "miter";

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public float[] lineDash = new float[0];

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getFill() {
            return this.fill;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLineCap() {
            return this.lineCap;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final float[] getLineDash() {
            return this.lineDash;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLineJoin() {
            return this.lineJoin;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getMiterLimit() {
            return this.miterLimit;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getStroke() {
            return this.stroke;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getStrokeWidth() {
            return this.strokeWidth;
        }

        /* JADX INFO: renamed from: h */
        public final void m67786h(int i11) {
            this.fill = i11;
        }

        /* JADX INFO: renamed from: i */
        public final void m67787i(@NotNull String str) {
            this.lineCap = str;
        }

        /* JADX INFO: renamed from: j */
        public final void m67788j(@NotNull float[] fArr) {
            this.lineDash = fArr;
        }

        /* JADX INFO: renamed from: k */
        public final void m67789k(@NotNull String str) {
            this.lineJoin = str;
        }

        /* JADX INFO: renamed from: l */
        public final void m67790l(int i11) {
            this.miterLimit = i11;
        }

        /* JADX INFO: renamed from: m */
        public final void m67791m(int i11) {
            this.stroke = i11;
        }

        /* JADX INFO: renamed from: n */
        public final void m67792n(float f11) {
            this.strokeWidth = f11;
        }
    }

    public SVGAVideoShapeEntity(@NotNull JSONObject jSONObject) throws JSONException {
        m67778q(jSONObject);
        m67772k(jSONObject);
        m67774m(jSONObject);
        m67776o(jSONObject);
    }

    /* JADX INFO: renamed from: c */
    public final float m67764c(JSONArray obj) {
        return obj.optDouble(3) <= ((double) 1) ? 255.0f : 1.0f;
    }

    /* JADX INFO: renamed from: e */
    public final float m67766e(JSONArray obj) {
        double d11 = 1;
        return (obj.optDouble(0) > d11 || obj.optDouble(1) > d11 || obj.optDouble(2) > d11) ? 1.0f : 255.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m67762a() {
        if (this.shapePath != null) {
            return;
        }
        C38492e.m87090a().reset();
        Type type = this.type;
        if (type == Type.shape) {
            Map<String, ? extends Object> map = this.args;
            Object obj = map != null ? map.get("d") : null;
            String str = (String) (obj instanceof String ? obj : null);
            if (str != null) {
                new C38489b(str).m87087a(C38492e.m87090a());
            }
        } else if (type == Type.ellipse) {
            Map<String, ? extends Object> map2 = this.args;
            Object obj2 = map2 != null ? map2.get("x") : null;
            if (!(obj2 instanceof Number)) {
                obj2 = null;
            }
            Number number = (Number) obj2;
            if (number == null) {
                return;
            }
            Map<String, ? extends Object> map3 = this.args;
            Object obj3 = map3 != null ? map3.get("y") : null;
            if (!(obj3 instanceof Number)) {
                obj3 = null;
            }
            Number number2 = (Number) obj3;
            if (number2 == null) {
                return;
            }
            Map<String, ? extends Object> map4 = this.args;
            Object obj4 = map4 != null ? map4.get("radiusX") : null;
            if (!(obj4 instanceof Number)) {
                obj4 = null;
            }
            Number number3 = (Number) obj4;
            if (number3 == null) {
                return;
            }
            Map<String, ? extends Object> map5 = this.args;
            Object obj5 = map5 != null ? map5.get("radiusY") : null;
            Number number4 = (Number) (obj5 instanceof Number ? obj5 : null);
            if (number4 == null) {
                return;
            }
            float fFloatValue = number.floatValue();
            float fFloatValue2 = number2.floatValue();
            float fFloatValue3 = number3.floatValue();
            float fFloatValue4 = number4.floatValue();
            C38492e.m87090a().addOval(new RectF(fFloatValue - fFloatValue3, fFloatValue2 - fFloatValue4, fFloatValue + fFloatValue3, fFloatValue2 + fFloatValue4), Path.Direction.CW);
        } else if (type == Type.rect) {
            Map<String, ? extends Object> map6 = this.args;
            Object obj6 = map6 != null ? map6.get("x") : null;
            if (!(obj6 instanceof Number)) {
                obj6 = null;
            }
            Number number5 = (Number) obj6;
            if (number5 == null) {
                return;
            }
            Map<String, ? extends Object> map7 = this.args;
            Object obj7 = map7 != null ? map7.get("y") : null;
            if (!(obj7 instanceof Number)) {
                obj7 = null;
            }
            Number number6 = (Number) obj7;
            if (number6 == null) {
                return;
            }
            Map<String, ? extends Object> map8 = this.args;
            Object obj8 = map8 != null ? map8.get("width") : null;
            if (!(obj8 instanceof Number)) {
                obj8 = null;
            }
            Number number7 = (Number) obj8;
            if (number7 == null) {
                return;
            }
            Map<String, ? extends Object> map9 = this.args;
            Object obj9 = map9 != null ? map9.get("height") : null;
            if (!(obj9 instanceof Number)) {
                obj9 = null;
            }
            Number number8 = (Number) obj9;
            if (number8 == null) {
                return;
            }
            Map<String, ? extends Object> map10 = this.args;
            Object obj10 = map10 != null ? map10.get("cornerRadius") : null;
            Number number9 = (Number) (obj10 instanceof Number ? obj10 : null);
            if (number9 == null) {
                return;
            }
            float fFloatValue5 = number5.floatValue();
            float fFloatValue6 = number6.floatValue();
            float fFloatValue7 = number7.floatValue();
            float fFloatValue8 = number8.floatValue();
            float fFloatValue9 = number9.floatValue();
            C38492e.m87090a().addRoundRect(new RectF(fFloatValue5, fFloatValue6, fFloatValue7 + fFloatValue5, fFloatValue8 + fFloatValue6), fFloatValue9, fFloatValue9, Path.Direction.CW);
        }
        Path path = new Path();
        this.shapePath = path;
        path.set(C38492e.m87090a());
    }

    /* JADX INFO: renamed from: b */
    public final float m67763b(ShapeEntity.ShapeStyle.RGBAColor color) {
        return color.f55545a.floatValue() <= 1.0f ? 255.0f : 1.0f;
    }

    /* JADX INFO: renamed from: d */
    public final float m67765d(ShapeEntity.ShapeStyle.RGBAColor color) {
        Float f11 = color.f55548r;
        float f12 = 1;
        if ((f11 != null ? f11.floatValue() : 0.0f) > f12) {
            return 1.0f;
        }
        Float f13 = color.f55547g;
        if ((f13 != null ? f13.floatValue() : 0.0f) > f12) {
            return 1.0f;
        }
        Float f14 = color.f55546b;
        return (f14 != null ? f14.floatValue() : 0.0f) <= f12 ? 255.0f : 1.0f;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Path getShapePath() {
        return this.shapePath;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final C27323a getStyles() {
        return this.styles;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Matrix getTransform() {
        return this.transform;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m67770i() {
        return this.type == Type.keep;
    }

    /* JADX INFO: renamed from: j */
    public final void m67771j(ShapeEntity obj) {
        String str;
        HashMap map = new HashMap();
        ShapeEntity.ShapeArgs shapeArgs = obj.shape;
        if (shapeArgs != null && (str = shapeArgs.f55543d) != null) {
            map.put("d", str);
        }
        ShapeEntity.EllipseArgs ellipseArgs = obj.ellipse;
        if (ellipseArgs != null) {
            Float fValueOf = ellipseArgs.f55535x;
            if (fValueOf == null) {
                fValueOf = Float.valueOf(0.0f);
            }
            map.put("x", fValueOf);
            Float fValueOf2 = ellipseArgs.f55536y;
            if (fValueOf2 == null) {
                fValueOf2 = Float.valueOf(0.0f);
            }
            map.put("y", fValueOf2);
            Float fValueOf3 = ellipseArgs.radiusX;
            if (fValueOf3 == null) {
                fValueOf3 = Float.valueOf(0.0f);
            }
            map.put("radiusX", fValueOf3);
            Float fValueOf4 = ellipseArgs.radiusY;
            if (fValueOf4 == null) {
                fValueOf4 = Float.valueOf(0.0f);
            }
            map.put("radiusY", fValueOf4);
        }
        ShapeEntity.RectArgs rectArgs = obj.rect;
        if (rectArgs != null) {
            Float fValueOf5 = rectArgs.f55539x;
            if (fValueOf5 == null) {
                fValueOf5 = Float.valueOf(0.0f);
            }
            map.put("x", fValueOf5);
            Float fValueOf6 = rectArgs.f55540y;
            if (fValueOf6 == null) {
                fValueOf6 = Float.valueOf(0.0f);
            }
            map.put("y", fValueOf6);
            Float fValueOf7 = rectArgs.width;
            if (fValueOf7 == null) {
                fValueOf7 = Float.valueOf(0.0f);
            }
            map.put("width", fValueOf7);
            Float fValueOf8 = rectArgs.height;
            if (fValueOf8 == null) {
                fValueOf8 = Float.valueOf(0.0f);
            }
            map.put("height", fValueOf8);
            Float fValueOf9 = rectArgs.cornerRadius;
            if (fValueOf9 == null) {
                fValueOf9 = Float.valueOf(0.0f);
            }
            map.put("cornerRadius", fValueOf9);
        }
        this.args = map;
    }

    /* JADX INFO: renamed from: k */
    public final void m67772k(JSONObject obj) throws JSONException {
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = obj.optJSONObject("args");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            Intrinsics.checkExpressionValueIsNotNull(itKeys, "values.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj2 = jSONObjectOptJSONObject.get(next);
                if (obj2 != null) {
                    map.put(next, obj2);
                }
            }
            this.args = map;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m67773l(ShapeEntity obj) {
        ShapeEntity.ShapeStyle shapeStyle = obj.styles;
        if (shapeStyle != null) {
            C27323a c27323a = new C27323a();
            ShapeEntity.ShapeStyle.RGBAColor rGBAColor = shapeStyle.fill;
            if (rGBAColor != null) {
                float fM67765d = m67765d(rGBAColor);
                float fM67763b = m67763b(rGBAColor);
                Float f11 = rGBAColor.f55545a;
                int iFloatValue = (int) ((f11 != null ? f11.floatValue() : 0.0f) * fM67763b);
                Float f12 = rGBAColor.f55548r;
                int iFloatValue2 = (int) ((f12 != null ? f12.floatValue() : 0.0f) * fM67765d);
                Float f13 = rGBAColor.f55547g;
                int iFloatValue3 = (int) ((f13 != null ? f13.floatValue() : 0.0f) * fM67765d);
                Float f14 = rGBAColor.f55546b;
                c27323a.m67786h(Color.argb(iFloatValue, iFloatValue2, iFloatValue3, (int) ((f14 != null ? f14.floatValue() : 0.0f) * fM67765d)));
            }
            ShapeEntity.ShapeStyle.RGBAColor rGBAColor2 = shapeStyle.stroke;
            if (rGBAColor2 != null) {
                float fM67765d2 = m67765d(rGBAColor2);
                float fM67763b2 = m67763b(rGBAColor2);
                Float f15 = rGBAColor2.f55545a;
                int iFloatValue4 = (int) ((f15 != null ? f15.floatValue() : 0.0f) * fM67763b2);
                Float f16 = rGBAColor2.f55548r;
                int iFloatValue5 = (int) ((f16 != null ? f16.floatValue() : 0.0f) * fM67765d2);
                Float f17 = rGBAColor2.f55547g;
                int iFloatValue6 = (int) ((f17 != null ? f17.floatValue() : 0.0f) * fM67765d2);
                Float f18 = rGBAColor2.f55546b;
                c27323a.m67791m(Color.argb(iFloatValue4, iFloatValue5, iFloatValue6, (int) ((f18 != null ? f18.floatValue() : 0.0f) * fM67765d2)));
            }
            Float f19 = shapeStyle.strokeWidth;
            c27323a.m67792n(f19 != null ? f19.floatValue() : 0.0f);
            ShapeEntity.ShapeStyle.LineCap lineCap = shapeStyle.lineCap;
            if (lineCap != null) {
                int i11 = C38491d.$EnumSwitchMapping$1[lineCap.ordinal()];
                if (i11 == 1) {
                    c27323a.m67787i("butt");
                } else if (i11 == 2) {
                    c27323a.m67787i("round");
                } else if (i11 == 3) {
                    c27323a.m67787i("square");
                }
            }
            ShapeEntity.ShapeStyle.LineJoin lineJoin = shapeStyle.lineJoin;
            if (lineJoin != null) {
                int i12 = C38491d.$EnumSwitchMapping$2[lineJoin.ordinal()];
                if (i12 == 1) {
                    c27323a.m67789k("bevel");
                } else if (i12 == 2) {
                    c27323a.m67789k("miter");
                } else if (i12 == 3) {
                    c27323a.m67789k("round");
                }
            }
            Float f21 = shapeStyle.miterLimit;
            c27323a.m67790l((int) (f21 != null ? f21.floatValue() : 0.0f));
            c27323a.m67788j(new float[3]);
            Float f22 = shapeStyle.lineDashI;
            if (f22 != null) {
                c27323a.getLineDash()[0] = f22.floatValue();
            }
            Float f23 = shapeStyle.lineDashII;
            if (f23 != null) {
                c27323a.getLineDash()[1] = f23.floatValue();
            }
            Float f24 = shapeStyle.lineDashIII;
            if (f24 != null) {
                c27323a.getLineDash()[2] = f24.floatValue();
            }
            this.styles = c27323a;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m67774m(JSONObject obj) {
        JSONObject jSONObjectOptJSONObject = obj.optJSONObject("styles");
        if (jSONObjectOptJSONObject != null) {
            C27323a c27323a = new C27323a();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("fill");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() == 4) {
                double dM67766e = m67766e(jSONArrayOptJSONArray);
                c27323a.m67786h(Color.argb((int) (jSONArrayOptJSONArray.optDouble(3) * ((double) m67764c(jSONArrayOptJSONArray))), (int) (jSONArrayOptJSONArray.optDouble(0) * dM67766e), (int) (jSONArrayOptJSONArray.optDouble(1) * dM67766e), (int) (jSONArrayOptJSONArray.optDouble(2) * dM67766e)));
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("stroke");
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() == 4) {
                double dM67766e2 = m67766e(jSONArrayOptJSONArray2);
                c27323a.m67791m(Color.argb((int) (jSONArrayOptJSONArray2.optDouble(3) * ((double) m67764c(jSONArrayOptJSONArray2))), (int) (jSONArrayOptJSONArray2.optDouble(0) * dM67766e2), (int) (jSONArrayOptJSONArray2.optDouble(1) * dM67766e2), (int) (jSONArrayOptJSONArray2.optDouble(2) * dM67766e2)));
            }
            c27323a.m67792n((float) jSONObjectOptJSONObject.optDouble("strokeWidth", 0.0d));
            String strOptString = jSONObjectOptJSONObject.optString("lineCap", "butt");
            Intrinsics.checkExpressionValueIsNotNull(strOptString, "it.optString(\"lineCap\", \"butt\")");
            c27323a.m67787i(strOptString);
            String strOptString2 = jSONObjectOptJSONObject.optString("lineJoin", "miter");
            Intrinsics.checkExpressionValueIsNotNull(strOptString2, "it.optString(\"lineJoin\", \"miter\")");
            c27323a.m67789k(strOptString2);
            c27323a.m67790l(jSONObjectOptJSONObject.optInt("miterLimit", 0));
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("lineDash");
            if (jSONArrayOptJSONArray3 != null) {
                c27323a.m67788j(new float[jSONArrayOptJSONArray3.length()]);
                int length = jSONArrayOptJSONArray3.length();
                for (int i11 = 0; i11 < length; i11++) {
                    c27323a.getLineDash()[i11] = (float) jSONArrayOptJSONArray3.optDouble(i11, 0.0d);
                }
            }
            this.styles = c27323a;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m67775n(ShapeEntity obj) {
        Transform transform = obj.transform;
        if (transform != null) {
            Matrix matrix = new Matrix();
            Float f11 = transform.f55553a;
            float fFloatValue = f11 != null ? f11.floatValue() : 1.0f;
            Float f12 = transform.f55554b;
            float fFloatValue2 = f12 != null ? f12.floatValue() : 0.0f;
            Float f13 = transform.f55555c;
            float fFloatValue3 = f13 != null ? f13.floatValue() : 0.0f;
            Float f14 = transform.f55556d;
            float fFloatValue4 = f14 != null ? f14.floatValue() : 1.0f;
            Float f15 = transform.f55557tx;
            float fFloatValue5 = f15 != null ? f15.floatValue() : 0.0f;
            Float f16 = transform.f55558ty;
            matrix.setValues(new float[]{fFloatValue, fFloatValue3, fFloatValue5, fFloatValue2, fFloatValue4, f16 != null ? f16.floatValue() : 0.0f, 0.0f, 0.0f, 1.0f});
            this.transform = matrix;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m67777p(ShapeEntity obj) {
        Type type;
        ShapeEntity.ShapeType shapeType = obj.type;
        if (shapeType != null) {
            int i11 = C38491d.$EnumSwitchMapping$0[shapeType.ordinal()];
            if (i11 == 1) {
                type = Type.shape;
            } else if (i11 == 2) {
                type = Type.rect;
            } else if (i11 == 3) {
                type = Type.ellipse;
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                type = Type.keep;
            }
            this.type = type;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m67776o(JSONObject obj) {
        JSONObject jSONObjectOptJSONObject = obj.optJSONObject(ViewProps.TRANSFORM);
        if (jSONObjectOptJSONObject != null) {
            Matrix matrix = new Matrix();
            double dOptDouble = jSONObjectOptJSONObject.optDouble(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 1.0d);
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("b", 0.0d);
            double dOptDouble3 = jSONObjectOptJSONObject.optDouble("c", 0.0d);
            double dOptDouble4 = jSONObjectOptJSONObject.optDouble("d", 1.0d);
            float f11 = (float) 0.0d;
            matrix.setValues(new float[]{(float) dOptDouble, (float) dOptDouble3, (float) jSONObjectOptJSONObject.optDouble(TrafficInfoTable.COLUMN_TX, 0.0d), (float) dOptDouble2, (float) dOptDouble4, (float) jSONObjectOptJSONObject.optDouble("ty", 0.0d), f11, f11, (float) 1.0d});
            this.transform = matrix;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m67778q(JSONObject obj) {
        String strOptString = obj.optString("type");
        if (strOptString != null) {
            if (StringsKt.equals(strOptString, "shape", true)) {
                this.type = Type.shape;
                return;
            }
            if (StringsKt.equals(strOptString, "rect", true)) {
                this.type = Type.rect;
            } else if (StringsKt.equals(strOptString, "ellipse", true)) {
                this.type = Type.ellipse;
            } else if (StringsKt.equals(strOptString, "keep", true)) {
                this.type = Type.keep;
            }
        }
    }

    public SVGAVideoShapeEntity(@NotNull ShapeEntity shapeEntity) {
        m67777p(shapeEntity);
        m67771j(shapeEntity);
        m67773l(shapeEntity);
        m67775n(shapeEntity);
    }
}
