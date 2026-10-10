package kotlinx.serialization.modules;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: kotlinx.serialization.modules.a */
/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00052\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H¦\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m90084d2 = {"Lkotlinx/serialization/modules/a;", "", "<init>", "()V", "", "Ltg0/d;", "typeArgumentsSerializers", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/List;)Ltg0/d;", "b", "Lkotlinx/serialization/modules/a$a;", "Lkotlinx/serialization/modules/a$b;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class AbstractC41965a {

    /* JADX INFO: renamed from: kotlinx.serialization.modules.a$a */
    /* JADX INFO: compiled from: SerializersModule.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lkotlinx/serialization/modules/a$a;", "Lkotlinx/serialization/modules/a;", "Ltg0/d;", "serializer", "<init>", "(Ltg0/d;)V", "", "typeArgumentsSerializers", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/List;)Ltg0/d;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ltg0/d;", "b", "()Ltg0/d;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a extends AbstractC41965a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC44951d<?> serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InterfaceC44951d<?> serializer) {
            super(null);
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            this.serializer = serializer;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final InterfaceC44951d<?> m92026b() {
            return this.serializer;
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof a) && Intrinsics.areEqual(((a) other).serializer, this.serializer);
        }

        public int hashCode() {
            return this.serializer.hashCode();
        }

        @Override // kotlinx.serialization.modules.AbstractC41965a
        @NotNull
        /* JADX INFO: renamed from: a */
        public InterfaceC44951d<?> mo92025a(@NotNull List<? extends InterfaceC44951d<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.serializer;
        }
    }

    /* JADX INFO: renamed from: kotlinx.serialization.modules.a$b */
    /* JADX INFO: compiled from: SerializersModule.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B8\u0012/\u0010\b\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00042\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR@\u0010\b\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lkotlinx/serialization/modules/a$b;", "Lkotlinx/serialization/modules/a;", "Lkotlin/Function1;", "", "Ltg0/d;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "<init>", "(Lkotlin/jvm/functions/Function1;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/List;)Ltg0/d;", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class b extends AbstractC41965a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Function1<List<? extends InterfaceC44951d<?>>, InterfaceC44951d<?>> provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Function1<? super List<? extends InterfaceC44951d<?>>, ? extends InterfaceC44951d<?>> provider) {
            super(null);
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.provider = provider;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Function1<List<? extends InterfaceC44951d<?>>, InterfaceC44951d<?>> m92027b() {
            return this.provider;
        }

        @Override // kotlinx.serialization.modules.AbstractC41965a
        @NotNull
        /* JADX INFO: renamed from: a */
        public InterfaceC44951d<?> mo92025a(@NotNull List<? extends InterfaceC44951d<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.provider.invoke(typeArgumentsSerializers);
        }
    }

    public /* synthetic */ AbstractC41965a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract InterfaceC44951d<?> mo92025a(@NotNull List<? extends InterfaceC44951d<?>> typeArgumentsSerializers);

    public AbstractC41965a() {
    }
}
