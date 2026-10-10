package i90;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.jumio.core.extraction.ProcessingTimesRecorderKt;
import com.opensource.svgaplayer.entities.SVGAVideoShapeEntity;
import com.opensource.svgaplayer.proto.FrameEntity;
import com.opensource.svgaplayer.proto.SpriteEntity;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i90.f */
/* JADX INFO: compiled from: SVGAVideoSpriteEntity.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\t\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Li90/f;", "", "Lorg/json/JSONObject;", "obj", "<init>", "(Lorg/json/JSONObject;)V", "Lcom/opensource/svgaplayer/proto/SpriteEntity;", "(Lcom/opensource/svgaplayer/proto/SpriteEntity;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "imageKey", "c", "matteKey", "", "Li90/g;", "Ljava/util/List;", "()Ljava/util/List;", ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL, "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class C38493f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String imageKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String matteKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<C38494g> frames;

    public C38493f(@NotNull JSONObject jSONObject) {
        this.imageKey = jSONObject.optString("imageKey");
        this.matteKey = jSONObject.optString("matteKey");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject != null) {
                    C38494g c38494g = new C38494g(jSONObjectOptJSONObject);
                    if (!c38494g.m87097d().isEmpty() && ((SVGAVideoShapeEntity) CollectionsKt.first((List) c38494g.m87097d())).m67770i() && arrayList.size() > 0) {
                        c38494g.m87099f(((C38494g) CollectionsKt.last((List) arrayList)).m87097d());
                    }
                    arrayList.add(c38494g);
                }
            }
        }
        this.frames = CollectionsKt.toList(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<C38494g> m87091a() {
        return this.frames;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImageKey() {
        return this.imageKey;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMatteKey() {
        return this.matteKey;
    }

    public C38493f(@NotNull SpriteEntity spriteEntity) {
        List<C38494g> listEmptyList;
        this.imageKey = spriteEntity.imageKey;
        this.matteKey = spriteEntity.matteKey;
        List<FrameEntity> list = spriteEntity.frames;
        if (list != null) {
            listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
            C38494g c38494g = null;
            for (FrameEntity it : list) {
                Intrinsics.checkExpressionValueIsNotNull(it, "it");
                C38494g c38494g2 = new C38494g(it);
                if (!c38494g2.m87097d().isEmpty() && ((SVGAVideoShapeEntity) CollectionsKt.first((List) c38494g2.m87097d())).m67770i() && c38494g != null) {
                    c38494g2.m87099f(c38494g.m87097d());
                }
                listEmptyList.add(c38494g2);
                c38494g = c38494g2;
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.frames = listEmptyList;
    }
}
