package androidx.savedstate;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavedStateWriter.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0000\u001a*\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005H\u0001¨\u0006\u0006"}, m90084d2 = {"toArrayListUnsafe", "Ljava/util/ArrayList;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/collections/ArrayList;", "", "", "savedstate_release"}, m90085k = 5, m90086mv = {2, 0, 0}, m90088xi = 48, m90089xs = "androidx/savedstate/SavedStateWriterKt")
final /* synthetic */ class SavedStateWriterKt__SavedStateWriter_androidKt {
    @PublishedApi
    @NotNull
    public static final <T> ArrayList<T> toArrayListUnsafe(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList<>(collection);
    }
}
