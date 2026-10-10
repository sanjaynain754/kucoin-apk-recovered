package di0;

import android.content.res.TypedArray;
import android.util.JsonReader;
import android.util.JsonToken;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;
import support.ada.embed.common.MetaFieldsJsonException;

/* JADX INFO: renamed from: di0.b */
/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Landroid/content/res/TypedArray;", "", "idRes", "", "b", "(Landroid/content/res/TypedArray;I)Ljava/lang/String;", "Ljava/io/InputStream;", "inputStream", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/io/InputStream;)Ljava/util/Map;", "map", "Lorg/json/JSONObject;", "c", "(Ljava/util/Map;)Lorg/json/JSONObject;", "ada-embed_release"}, m90085k = 2, m90086mv = {1, 4, 0})
public final class C36715b {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Map<String, Object> m82235a(@NotNull InputStream inputStream) {
        Object objValueOf;
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                throw new MetaFieldsJsonException();
            }
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String key = jsonReader.nextName();
                JsonToken jsonTokenPeek = jsonReader.peek();
                if (jsonTokenPeek != null) {
                    int i11 = C36714a.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
                    if (i11 == 1) {
                        objValueOf = Double.valueOf(jsonReader.nextDouble());
                    } else if (i11 == 2) {
                        objValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                    } else if (i11 == 3) {
                        objValueOf = jsonReader.nextString();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(objValueOf, "when (it.peek()) {\n     …Exception()\n            }");
                    Intrinsics.checkExpressionValueIsNotNull(key, "key");
                    linkedHashMap.put(key, objValueOf);
                }
                throw new MetaFieldsJsonException();
            }
            jsonReader.endObject();
            if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new MetaFieldsJsonException();
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(jsonReader, null);
            return linkedHashMap;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(jsonReader, th2);
                throw th3;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ String m82236b(@NotNull TypedArray typedArray, int i11) {
        String string = typedArray.getString(i11);
        if (string == null) {
            string = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(idRes) ?: EMPTY");
        return string;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ JSONObject m82237c(@NotNull Map<String, ? extends Object> map) {
        if (!map.isEmpty()) {
            return new JSONObject(map);
        }
        return null;
    }
}
