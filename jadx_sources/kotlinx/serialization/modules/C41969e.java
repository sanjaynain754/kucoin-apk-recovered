package kotlinx.serialization.modules;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: kotlinx.serialization.modules.e */
/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\u0004\u0010\u0003\" \u0010\n\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\u0007*\\\b\u0000\u0010\u0012\u001a\u0004\b\u0000\u0010\u000b\"'\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\f2'\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\f*X\b\u0000\u0010\u0015\u001a\u0004\b\u0000\u0010\u000b\"%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00140\f2%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00140\f¨\u0006\u0016"}, m90084d2 = {"Lyg0/a;", "other", "c", "(Lyg0/a;Lyg0/a;)Lyg0/a;", "b", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lyg0/a;", "()Lyg0/a;", "getEmptySerializersModule$annotations", "()V", "EmptySerializersModule", "Base", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "className", "Ltg0/c;", "PolymorphicDeserializerProvider", "value", "Ltg0/p;", "PolymorphicSerializerProvider", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerializersModuleKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,245:1\n31#2,3:246\n31#2,3:249\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerializersModuleKt\n*L\n97#1:246,3\n109#1:249,3\n*E\n"})
public final class C41969e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AbstractC46494a f92186a = new C41966b(MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), false);

    /* JADX INFO: renamed from: kotlinx.serialization.modules.e$a */
    /* JADX INFO: compiled from: SerializersModule.kt */
    @Metadata(m90083d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJX\u0010\u0011\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042/\u0010\u0010\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0018\u001a\u00020\b\"\b\b\u0000\u0010\u0013*\u00020\u0002\"\b\b\u0001\u0010\u0014*\u00028\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JR\u0010\u001d\u001a\u00020\b\"\b\b\u0000\u0010\u0013*\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042)\u0010\u001c\u001a%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b0\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0012JT\u0010\"\u001a\u00020\b\"\b\b\u0000\u0010\u0013*\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042+\u0010!\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001f\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 0\u000bH\u0016¢\u0006\u0004\b\"\u0010\u0012¨\u0006#"}, m90084d2 = {"kotlinx/serialization/modules/e$a", "Lkotlinx/serialization/modules/d;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "kClass", "Ltg0/d;", "serializer", "", "b", "(Lkotlin/reflect/KClass;Ltg0/d;)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "serializers", "provider", "e", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "c", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Ltg0/d;)V", "value", "Ltg0/p;", "defaultSerializerProvider", "d", "", "className", "Ltg0/c;", "defaultDeserializerProvider", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a implements InterfaceC41968d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C41967c f92187a;

        public a(C41967c c41967c) {
            this.f92187a = c41967c;
        }

        @Override // kotlinx.serialization.modules.InterfaceC41968d
        /* JADX INFO: renamed from: a */
        public <Base> void mo91988a(KClass<Base> baseClass, Function1<? super String, ? extends InterfaceC44949c<? extends Base>> defaultDeserializerProvider) {
            Intrinsics.checkNotNullParameter(baseClass, "baseClass");
            Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
            this.f92187a.m92037h(baseClass, defaultDeserializerProvider, true);
        }

        @Override // kotlinx.serialization.modules.InterfaceC41968d
        /* JADX INFO: renamed from: b */
        public <T> void mo91989b(KClass<T> kClass, InterfaceC44951d<T> serializer) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            this.f92187a.m92040l(kClass, new AbstractC41965a.a(serializer), true);
        }

        @Override // kotlinx.serialization.modules.InterfaceC41968d
        /* JADX INFO: renamed from: c */
        public <Base, Sub extends Base> void mo91990c(KClass<Base> baseClass, KClass<Sub> actualClass, InterfaceC44951d<Sub> actualSerializer) {
            Intrinsics.checkNotNullParameter(baseClass, "baseClass");
            Intrinsics.checkNotNullParameter(actualClass, "actualClass");
            Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
            this.f92187a.m92039j(baseClass, actualClass, actualSerializer, true);
        }

        @Override // kotlinx.serialization.modules.InterfaceC41968d
        /* JADX INFO: renamed from: d */
        public <Base> void mo91991d(KClass<Base> baseClass, Function1<? super Base, ? extends InterfaceC44963p<? super Base>> defaultSerializerProvider) {
            Intrinsics.checkNotNullParameter(baseClass, "baseClass");
            Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
            this.f92187a.m92038i(baseClass, defaultSerializerProvider, true);
        }

        @Override // kotlinx.serialization.modules.InterfaceC41968d
        /* JADX INFO: renamed from: e */
        public <T> void mo91992e(KClass<T> kClass, Function1<? super List<? extends InterfaceC44951d<?>>, ? extends InterfaceC44951d<?>> provider) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f92187a.m92040l(kClass, new AbstractC41965a.b(provider), true);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AbstractC46494a m92044a() {
        return f92186a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AbstractC46494a m92045b(@NotNull AbstractC46494a abstractC46494a, @NotNull AbstractC46494a other) {
        Intrinsics.checkNotNullParameter(abstractC46494a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        C41967c c41967c = new C41967c();
        c41967c.m92036g(abstractC46494a);
        other.mo92028a(new a(c41967c));
        return c41967c.m92035f();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final AbstractC46494a m92046c(@NotNull AbstractC46494a abstractC46494a, @NotNull AbstractC46494a other) {
        Intrinsics.checkNotNullParameter(abstractC46494a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        C41967c c41967c = new C41967c();
        c41967c.m92036g(abstractC46494a);
        c41967c.m92036g(other);
        return c41967c.m92035f();
    }
}
