package io.flutter.plugins.sharedpreferences;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StringListObjectInputStream.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"}, m90084d2 = {"Lio/flutter/plugins/sharedpreferences/StringListObjectInputStream;", "Ljava/io/ObjectInputStream;", "input", "Ljava/io/InputStream;", "<init>", "(Ljava/io/InputStream;)V", "resolveClass", "Ljava/lang/Class;", "desc", "Ljava/io/ObjectStreamClass;", "shared_preferences_android_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class StringListObjectInputStream extends ObjectInputStream {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringListObjectInputStream(@NotNull InputStream input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
    }

    @Override // java.io.ObjectInputStream
    @Nullable
    public Class<?> resolveClass(@Nullable ObjectStreamClass desc) throws ClassNotFoundException, IOException {
        Set of2 = SetsKt.setOf((Object[]) new String[]{"java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;"});
        String name = desc != null ? desc.getName() : null;
        if (name == null || of2.contains(name)) {
            return super.resolveClass(desc);
        }
        throw new ClassNotFoundException(desc.getName());
    }
}
