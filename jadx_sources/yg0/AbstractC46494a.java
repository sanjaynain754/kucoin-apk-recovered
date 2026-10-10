package yg0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import kotlinx.serialization.modules.InterfaceC41968d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.reflect.KClass;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;

/* JADX INFO: renamed from: yg0.a */
/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\b\u0002\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00052\u0006\u0010\r\u001a\u00028\u0000H'¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8 X¡\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001d\u0082\u0001\u0001 ¨\u0006!"}, m90084d2 = {"Lyg0/a;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "kClass", "", "Ltg0/d;", "typeArgumentsSerializers", "b", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ltg0/d;", "baseClass", "value", "Ltg0/p;", "f", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ltg0/p;", "", "serializedClassName", "Ltg0/c;", "e", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Ltg0/c;", "Lkotlinx/serialization/modules/d;", "collector", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/serialization/modules/d;)V", "", "d", "()Z", "getHasInterfaceContextualSerializers$kotlinx_serialization_core$annotations", "hasInterfaceContextualSerializers", "Lkotlinx/serialization/modules/b;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class AbstractC46494a {
    public /* synthetic */ AbstractC46494a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo92028a(@NotNull InterfaceC41968d collector);

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract <T> InterfaceC44951d<T> mo92029b(@NotNull KClass<T> kClass, @NotNull List<? extends InterfaceC44951d<?>> typeArgumentsSerializers);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo92030d();

    @Nullable
    /* JADX INFO: renamed from: e */
    public abstract <T> InterfaceC44949c<T> mo92031e(@NotNull KClass<? super T> baseClass, @Nullable String serializedClassName);

    @Nullable
    /* JADX INFO: renamed from: f */
    public abstract <T> InterfaceC44963p<T> mo92032f(@NotNull KClass<? super T> baseClass, @NotNull T value);

    public AbstractC46494a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC44951d m102576c(AbstractC46494a abstractC46494a, KClass kClass, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i11 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return abstractC46494a.mo92029b(kClass, list);
    }
}
