package kotlinx.serialization.json;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;
import xg0.C46181p;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lkotlinx/serialization/json/JsonElement;", "", "<init>", "()V", "Companion", "Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/json/JsonPrimitive;", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@InterfaceC44962o(with = C46181p.class)
public abstract class JsonElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: JsonElement.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lkotlinx/serialization/json/JsonElement$Companion;", "", "<init>", "()V", "Ltg0/d;", "Lkotlinx/serialization/json/JsonElement;", "serializer", "()Ltg0/d;", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC44951d<JsonElement> serializer() {
            return C46181p.f103715a;
        }
    }

    public /* synthetic */ JsonElement(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public JsonElement() {
    }
}
