package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: KotlinMetadataFinder.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface KotlinMetadataFinder {
    @Nullable
    InputStream findBuiltInsData(@NotNull FqName fqName);
}
