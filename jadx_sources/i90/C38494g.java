package i90;

import android.graphics.Matrix;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.opensource.svgaplayer.entities.SVGAVideoShapeEntity;
import com.opensource.svgaplayer.proto.FrameEntity;
import com.opensource.svgaplayer.proto.Layout;
import com.opensource.svgaplayer.proto.ShapeEntity;
import com.opensource.svgaplayer.proto.Transform;
import com.tencent.rmonitor.base.p144db.table.TrafficInfoTable;
import j90.C40355d;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i90.g */
/* JADX INFO: compiled from: SVGAVideoSpriteFrameEntity.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010!\"\u0004\b\"\u0010#R(\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010'\u001a\u0004\b\u001f\u0010(\"\u0004\b)\u0010*¨\u0006,"}, m90084d2 = {"Li90/g;", "", "Lorg/json/JSONObject;", "obj", "<init>", "(Lorg/json/JSONObject;)V", "Lcom/opensource/svgaplayer/proto/FrameEntity;", "(Lcom/opensource/svgaplayer/proto/FrameEntity;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "D", "()D", "setAlpha", "(D)V", "alpha", "Lj90/d;", "b", "Lj90/d;", "()Lj90/d;", "setLayout", "(Lj90/d;)V", TtmlNode.TAG_LAYOUT, "Landroid/graphics/Matrix;", "c", "Landroid/graphics/Matrix;", "e", "()Landroid/graphics/Matrix;", "setTransform", "(Landroid/graphics/Matrix;)V", ViewProps.TRANSFORM, "Li90/b;", "d", "Li90/b;", "()Li90/b;", "setMaskPath", "(Li90/b;)V", "maskPath", "", "Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity;", "Ljava/util/List;", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "shapes", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class C38494g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public double alpha;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public C40355d layout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public Matrix transform;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public C38489b maskPath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<SVGAVideoShapeEntity> shapes;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [i90.g, java.lang.Object] */
    public C38494g(@NotNull JSONObject jSONObject) {
        int i11;
        C38494g c38494g;
        ?? obj = new Object();
        obj.layout = new C40355d(0.0d, 0.0d, 0.0d, 0.0d);
        obj.transform = new Matrix();
        obj.shapes = CollectionsKt.emptyList();
        obj.alpha = jSONObject.optDouble("alpha", 0.0d);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(TtmlNode.TAG_LAYOUT);
        if (jSONObjectOptJSONObject != null) {
            obj.layout = new C40355d(jSONObjectOptJSONObject.optDouble("x", 0.0d), jSONObjectOptJSONObject.optDouble("y", 0.0d), jSONObjectOptJSONObject.optDouble("width", 0.0d), jSONObjectOptJSONObject.optDouble("height", 0.0d));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(ViewProps.TRANSFORM);
        if (jSONObjectOptJSONObject2 != null) {
            double dOptDouble = jSONObjectOptJSONObject2.optDouble(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, 1.0d);
            double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("b", 0.0d);
            i11 = 0;
            float f11 = (float) 0.0d;
            C38494g c38494g2 = this;
            c38494g2.transform.setValues(new float[]{(float) dOptDouble, (float) jSONObjectOptJSONObject2.optDouble("c", 0.0d), (float) jSONObjectOptJSONObject2.optDouble(TrafficInfoTable.COLUMN_TX, 0.0d), (float) dOptDouble2, (float) jSONObjectOptJSONObject2.optDouble("d", 1.0d), (float) jSONObjectOptJSONObject2.optDouble("ty", 0.0d), f11, f11, (float) 1.0d});
            c38494g = c38494g2;
        } else {
            i11 = 0;
            c38494g = obj;
        }
        String strOptString = jSONObject.optString("clipPath");
        if (strOptString != null && strOptString.length() > 0) {
            c38494g.maskPath = new C38489b(strOptString);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("shapes");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i12 = i11; i12 < length; i12++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i12);
                if (jSONObjectOptJSONObject3 != null) {
                    arrayList.add(new SVGAVideoShapeEntity(jSONObjectOptJSONObject3));
                }
            }
            c38494g.shapes = CollectionsKt.toList(arrayList);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAlpha() {
        return this.alpha;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C40355d getLayout() {
        return this.layout;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final C38489b getMaskPath() {
        return this.maskPath;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<SVGAVideoShapeEntity> m87097d() {
        return this.shapes;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Matrix getTransform() {
        return this.transform;
    }

    /* JADX INFO: renamed from: f */
    public final void m87099f(@NotNull List<SVGAVideoShapeEntity> list) {
        this.shapes = list;
    }

    public C38494g(@NotNull FrameEntity frameEntity) {
        this.layout = new C40355d(0.0d, 0.0d, 0.0d, 0.0d);
        this.transform = new Matrix();
        this.shapes = CollectionsKt.emptyList();
        Float f11 = frameEntity.alpha;
        this.alpha = f11 != null ? f11.floatValue() : 0.0f;
        Layout layout = frameEntity.layout;
        if (layout != null) {
            Float f12 = layout.f55531x;
            double dFloatValue = f12 != null ? f12.floatValue() : 0.0f;
            Float f13 = layout.f55532y;
            double dFloatValue2 = f13 != null ? f13.floatValue() : 0.0f;
            Float f14 = layout.width;
            double dFloatValue3 = f14 != null ? f14.floatValue() : 0.0f;
            Float f15 = layout.height;
            this.layout = new C40355d(dFloatValue, dFloatValue2, dFloatValue3, f15 != null ? f15.floatValue() : 0.0f);
        }
        Transform transform = frameEntity.transform;
        if (transform != null) {
            Float f16 = transform.f55553a;
            float fFloatValue = f16 != null ? f16.floatValue() : 1.0f;
            Float f17 = transform.f55554b;
            float fFloatValue2 = f17 != null ? f17.floatValue() : 0.0f;
            Float f18 = transform.f55555c;
            float fFloatValue3 = f18 != null ? f18.floatValue() : 0.0f;
            Float f19 = transform.f55556d;
            float fFloatValue4 = f19 != null ? f19.floatValue() : 1.0f;
            Float f21 = transform.f55557tx;
            float fFloatValue5 = f21 != null ? f21.floatValue() : 0.0f;
            Float f22 = transform.f55558ty;
            this.transform.setValues(new float[]{fFloatValue, fFloatValue3, fFloatValue5, fFloatValue2, fFloatValue4, f22 != null ? f22.floatValue() : 0.0f, 0.0f, 0.0f, 1.0f});
        }
        String str = frameEntity.clipPath;
        if (str != null) {
            str = str.length() <= 0 ? null : str;
            if (str != null) {
                this.maskPath = new C38489b(str);
            }
        }
        List<ShapeEntity> list = frameEntity.shapes;
        Intrinsics.checkExpressionValueIsNotNull(list, "obj.shapes");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ShapeEntity it : list) {
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            arrayList.add(new SVGAVideoShapeEntity(it));
        }
        this.shapes = arrayList;
    }
}
