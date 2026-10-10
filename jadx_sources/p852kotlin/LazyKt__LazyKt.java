package p852kotlin;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0087\n¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"lazyOf", "Lkotlin/Lazy;", ExifInterface.GPS_DIRECTION_TRUE, "value", "(Ljava/lang/Object;)Lkotlin/Lazy;", "getValue", "thisRef", "", "property", "Lkotlin/reflect/KProperty;", "(Lkotlin/Lazy;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/LazyKt")
public class LazyKt__LazyKt extends LazyKt__LazyJVMKt {
    @InlineOnly
    private static final <T> T getValue(Lazy<? extends T> lazy, Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(lazy, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return lazy.getValue();
    }

    @NotNull
    public static <T> Lazy<T> lazyOf(T t11) {
        return new InitializedLazyImpl(t11);
    }
}
