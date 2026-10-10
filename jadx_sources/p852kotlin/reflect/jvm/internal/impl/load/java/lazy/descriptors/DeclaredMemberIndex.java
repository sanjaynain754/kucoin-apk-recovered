package p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: DeclaredMemberIndex.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface DeclaredMemberIndex {

    /* JADX INFO: compiled from: DeclaredMemberIndex.kt */
    public static final class Empty implements DeclaredMemberIndex {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @Nullable
        public JavaField findFieldByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public List<JavaMethod> findMethodsByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return CollectionsKt.emptyList();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @Nullable
        public JavaRecordComponent findRecordComponentByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        private Empty() {
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public Set<Name> getFieldNames() {
            return SetsKt.emptySet();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public Set<Name> getMethodNames() {
            return SetsKt.emptySet();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public Set<Name> getRecordComponentNames() {
            return SetsKt.emptySet();
        }
    }

    @Nullable
    JavaField findFieldByName(@NotNull Name name);

    @NotNull
    Collection<JavaMethod> findMethodsByName(@NotNull Name name);

    @Nullable
    JavaRecordComponent findRecordComponentByName(@NotNull Name name);

    @NotNull
    Set<Name> getFieldNames();

    @NotNull
    Set<Name> getMethodNames();

    @NotNull
    Set<Name> getRecordComponentNames();
}
