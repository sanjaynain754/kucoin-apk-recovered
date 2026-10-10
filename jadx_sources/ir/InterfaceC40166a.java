package ir;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.properties.ReadOnlyProperty;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: ir.a */
/* JADX INFO: compiled from: LinkUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002J&\u0010\u0007\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, m90084d2 = {"Lir/a;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/properties/ReadOnlyProperty;", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "network-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC40166a<T> extends ReadOnlyProperty<Object, T> {

    /* JADX INFO: renamed from: ir.a$a */
    /* JADX INFO: compiled from: LinkUtils.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static <T> T m88524a(@NotNull InterfaceC40166a<? extends T> interfaceC40166a, @Nullable Object obj, @NotNull KProperty<?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return interfaceC40166a.getValue();
        }
    }

    T getValue();

    @Override // p852kotlin.properties.ReadOnlyProperty
    T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property);
}
