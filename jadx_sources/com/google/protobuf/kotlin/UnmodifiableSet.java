package com.google.protobuf.kotlin;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: UnmodifiableCollections.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableSet;", ExifInterface.LONGITUDE_EAST, "Lcom/google/protobuf/kotlin/UnmodifiableCollection;", "", "delegate", "", "(Ljava/util/Collection;)V", "protobuf-kotlin-lite"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class UnmodifiableSet<E> extends UnmodifiableCollection<E> implements Set<E>, KMappedMarker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmodifiableSet(@NotNull Collection<? extends E> delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
