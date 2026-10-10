package androidx.datastore.preferences;

import androidx.annotation.RestrictTo;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreferencesMapCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Landroidx/datastore/preferences/PreferencesMapCompat;", "", "()V", "Companion", "datastore-preferences-proto"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class PreferencesMapCompat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: PreferencesMapCompat.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m90084d2 = {"Landroidx/datastore/preferences/PreferencesMapCompat$Companion;", "", "()V", "readFrom", "Landroidx/datastore/preferences/PreferencesProto$PreferenceMap;", "input", "Ljava/io/InputStream;", "datastore-preferences-proto"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final PreferencesProto.PreferenceMap readFrom(@NotNull InputStream input) throws IOException {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                PreferencesProto.PreferenceMap from = PreferencesProto.PreferenceMap.parseFrom(input);
                Intrinsics.checkNotNullExpressionValue(from, "{\n                Prefer…From(input)\n            }");
                return from;
            } catch (InvalidProtocolBufferException e11) {
                throw new CorruptionException("Unable to parse preferences proto.", e11);
            }
        }
    }
}
