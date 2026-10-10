package kotlinx.serialization.modules;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import kotlinx.serialization.modules.InterfaceC41968d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;

/* JADX INFO: renamed from: kotlinx.serialization.modules.d */
/* JADX INFO: compiled from: SerializersModuleCollector.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJX\u0010\u0010\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032/\u0010\u000f\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\nH&¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0017\u001a\u00020\u0007\"\b\b\u0000\u0010\u0012*\u00020\u0001\"\b\b\u0001\u0010\u0013*\u00028\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&¢\u0006\u0004\b\u0017\u0010\u0018JR\u0010\u001c\u001a\u00020\u0007\"\b\b\u0000\u0010\u0012*\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032)\u0010\u001b\u001a%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0019\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a0\nH&¢\u0006\u0004\b\u001c\u0010\u0011JT\u0010!\u001a\u00020\u0007\"\b\b\u0000\u0010\u0012*\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032+\u0010 \u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f0\nH&¢\u0006\u0004\b!\u0010\u0011¨\u0006\""}, m90084d2 = {"Lkotlinx/serialization/modules/d;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "kClass", "Ltg0/d;", "serializer", "", "b", "(Lkotlin/reflect/KClass;Ltg0/d;)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "e", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "c", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Ltg0/d;)V", "value", "Ltg0/p;", "defaultSerializerProvider", "d", "", "className", "Ltg0/c;", "defaultDeserializerProvider", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC41968d {

    /* JADX INFO: renamed from: kotlinx.serialization.modules.d$a */
    /* JADX INFO: compiled from: SerializersModuleCollector.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: b */
        public static <T> void m92042b(@NotNull InterfaceC41968d interfaceC41968d, @NotNull KClass<T> kClass, @NotNull final InterfaceC44951d<T> serializer) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            interfaceC41968d.mo91992e(kClass, new Function1() { // from class: yg0.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InterfaceC41968d.a.m92043c(serializer, (List) obj);
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public static InterfaceC44951d m92043c(InterfaceC44951d interfaceC44951d, List it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return interfaceC44951d;
        }
    }

    /* JADX INFO: renamed from: a */
    <Base> void mo91988a(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends InterfaceC44949c<? extends Base>> defaultDeserializerProvider);

    /* JADX INFO: renamed from: b */
    <T> void mo91989b(@NotNull KClass<T> kClass, @NotNull InterfaceC44951d<T> serializer);

    /* JADX INFO: renamed from: c */
    <Base, Sub extends Base> void mo91990c(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> actualClass, @NotNull InterfaceC44951d<Sub> actualSerializer);

    /* JADX INFO: renamed from: d */
    <Base> void mo91991d(@NotNull KClass<Base> baseClass, @NotNull Function1<? super Base, ? extends InterfaceC44963p<? super Base>> defaultSerializerProvider);

    /* JADX INFO: renamed from: e */
    <T> void mo91992e(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends InterfaceC44951d<?>>, ? extends InterfaceC44951d<?>> provider);
}
