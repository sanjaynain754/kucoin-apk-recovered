package xg0;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.C41913a1;
import kotlinx.serialization.json.internal.C41928h0;
import kotlinx.serialization.json.internal.C41930i0;
import kotlinx.serialization.json.internal.C41948r0;
import kotlinx.serialization.json.internal.C41954u0;
import kotlinx.serialization.json.internal.C41956v0;
import kotlinx.serialization.json.internal.C41962y0;
import kotlinx.serialization.json.internal.C41963z;
import kotlinx.serialization.json.internal.WriteMode;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44950c0;
import tg0.InterfaceC44963p;
import yg0.AbstractC46494a;
import yg0.C46495b;

/* JADX INFO: renamed from: xg0.a */
/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00152\u00020\u0001:\u0001\u0012B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00142\b\b\u0001\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R \u0010(\u001a\u00020\"8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%\u0082\u0001\u0002)*¨\u0006+"}, m90084d2 = {"Lxg0/a;", "Ltg0/c0;", "Lxg0/f;", "configuration", "Lyg0/a;", "serializersModule", "<init>", "(Lxg0/f;Lyg0/a;)V", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/p;", "serializer", "value", "", "b", "(Ltg0/p;Ljava/lang/Object;)Ljava/lang/String;", "Ltg0/c;", "deserializer", TypedValues.Custom.S_STRING, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ltg0/c;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "d", "(Ltg0/p;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "element", "c", "(Ltg0/c;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "g", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "Lxg0/f;", "e", "()Lxg0/f;", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "Lkotlinx/serialization/json/internal/z;", "Lkotlinx/serialization/json/internal/z;", "f", "()Lkotlinx/serialization/json/internal/z;", "get_schemaCache$kotlinx_serialization_json$annotations", "()V", "_schemaCache", "Lxg0/a$a;", "Lxg0/s;", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class AbstractC46162a implements InterfaceC44950c0 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final JsonConfiguration configuration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC46494a serializersModule;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C41963z _schemaCache;

    /* JADX INFO: renamed from: xg0.a$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Json.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lxg0/a$a;", "Lxg0/a;", "<init>", "()V", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion extends AbstractC46162a {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
            super(new JsonConfiguration(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), C46495b.m102577a(), null);
        }
    }

    public /* synthetic */ AbstractC46162a(JsonConfiguration jsonConfiguration, AbstractC46494a abstractC46494a, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonConfiguration, abstractC46494a);
    }

    public AbstractC46162a(JsonConfiguration jsonConfiguration, AbstractC46494a abstractC46494a) {
        this.configuration = jsonConfiguration;
        this.serializersModule = abstractC46494a;
        this._schemaCache = new C41963z();
    }

    @Override // tg0.InterfaceC44950c0
    /* JADX INFO: renamed from: a */
    public final <T> T mo99408a(@NotNull InterfaceC44949c<? extends T> deserializer, @NotNull String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        C41954u0 c41954u0M92012a = C41956v0.m92012a(this, string);
        T t11 = (T) new C41948r0(this, WriteMode.OBJ, c41954u0M92012a, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
        c41954u0M92012a.m91850v();
        return t11;
    }

    @Override // tg0.InterfaceC44950c0
    @NotNull
    /* JADX INFO: renamed from: b */
    public final <T> String mo99409b(@NotNull InterfaceC44963p<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        C41930i0 c41930i0 = new C41930i0();
        try {
            C41928h0.m91942a(this, c41930i0, serializer, value);
            return c41930i0.toString();
        } finally {
            c41930i0.m91947g();
        }
    }

    /* JADX INFO: renamed from: c */
    public final <T> T m101763c(@NotNull InterfaceC44949c<? extends T> deserializer, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(element, "element");
        return (T) C41962y0.m92020a(this, element, deserializer);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final <T> JsonElement m101764d(@NotNull InterfaceC44963p<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return C41913a1.m91856d(this, value, serializer);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final JsonConfiguration getConfiguration() {
        return this.configuration;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final C41963z get_schemaCache() {
        return this._schemaCache;
    }

    @Override // tg0.InterfaceC44961n
    @NotNull
    public AbstractC46494a getSerializersModule() {
        return this.serializersModule;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final JsonElement m101767g(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return (JsonElement) mo99408a(C46181p.f103715a, string);
    }
}
