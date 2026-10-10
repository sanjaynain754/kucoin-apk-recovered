package io.trtc.tuikit.atomicxcore.hybridapi.json;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a&\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\u0006\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\b\u001a$\u0010\t\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0005\u0018\u0001*\u0002H\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\n\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, m90084d2 = {"sharedGson", "Lcom/google/gson/Gson;", "getSharedGson", "()Lcom/google/gson/Gson;", "fromJson", ExifInterface.GPS_DIRECTION_TRUE, "", "gson", "(Ljava/lang/String;Lcom/google/gson/Gson;)Ljava/lang/Object;", "toJson", "(Ljava/lang/Object;Lcom/google/gson/Gson;)Ljava/lang/String;", "atomicxcore_release"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class JsonParserKt {

    @NotNull
    private static final Gson sharedGson;

    static {
        Gson gsonCreate = new GsonBuilder().serializeNulls().registerTypeHierarchyAdapter(byte[].class, new ByteArrayTypeAdapter()).registerTypeAdapterFactory(new EnumTypeAdapterFactory()).create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        sharedGson = gsonCreate;
    }

    public static final /* synthetic */ <T> T fromJson(String str, Gson gson) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        try {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) gson.fromJson(str, (Class) Object.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ Object fromJson$default(String str, Gson gson, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gson = getSharedGson();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        try {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return gson.fromJson(str, Object.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public static final Gson getSharedGson() {
        return sharedGson;
    }

    public static final /* synthetic */ <T> String toJson(T t11, Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        String json = gson.toJson(t11);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    public static /* synthetic */ String toJson$default(Object obj, Gson gson, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            gson = getSharedGson();
        }
        Intrinsics.checkNotNullParameter(gson, "gson");
        String json = gson.toJson(obj);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
