package kotlinx.serialization.json;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;
import xg0.C46190y;

/* JADX INFO: renamed from: kotlinx.serialization.json.a */
/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lkotlinx/serialization/json/a;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "Ltg0/d;", "serializer", "()Ltg0/d;", "", "b", "Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "content", "", "()Z", "isString", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@InterfaceC44962o(with = C46190y.class)
public final class C41910a extends JsonPrimitive {

    @NotNull
    public static final C41910a INSTANCE = new C41910a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String content = "null";

    public C41910a() {
        super(null);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* JADX INFO: renamed from: b */
    public boolean getIsString() {
        return false;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    /* JADX INFO: renamed from: a */
    public String getContent() {
        return content;
    }

    @NotNull
    public final InterfaceC44951d<C41910a> serializer() {
        return C46190y.f103723a;
    }
}
