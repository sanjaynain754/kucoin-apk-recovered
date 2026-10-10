package androidx.savedstate.serialization.serializers;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BuiltInSerializer.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Landroidx/savedstate/serialization/serializers/DefaultJavaSerializableSerializer;", "Landroidx/savedstate/serialization/serializers/JavaSerializableSerializer;", "Ljava/io/Serializable;", "<init>", "()V", "savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class DefaultJavaSerializableSerializer extends JavaSerializableSerializer<Serializable> {

    @NotNull
    public static final DefaultJavaSerializableSerializer INSTANCE = new DefaultJavaSerializableSerializer();

    private DefaultJavaSerializableSerializer() {
    }
}
