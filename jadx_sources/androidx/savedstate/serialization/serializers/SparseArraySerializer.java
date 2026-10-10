package androidx.savedstate.serialization.serializers;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.C41801c2;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41826h2;
import kotlinx.serialization.internal.C41876r2;
import kotlinx.serialization.internal.C41891v0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: compiled from: BuiltInSerializer.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002:\u0001\u0019B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer;", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/d;", "Landroid/util/SparseArray;", "elementSerializer", "<init>", "(Ltg0/d;)V", "Lwg0/c;", "encoder", "value", "", "serialize", "(Lwg0/c;Landroid/util/SparseArray;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/b;)Landroid/util/SparseArray;", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "surrogateSerializer", "Ltg0/d;", "Lvg0/f;", "descriptor", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "SparseArraySurrogate", "savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuiltInSerializer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/SparseArraySerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1#2:422\n*E\n"})
public final class SparseArraySerializer<T> implements InterfaceC44951d<SparseArray<T>> {

    @NotNull
    private final InterfaceC45533f descriptor;

    @NotNull
    private final InterfaceC44951d<SparseArraySurrogate<T>> surrogateSerializer;

    /* JADX INFO: compiled from: BuiltInSerializer.android.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0003\u0018\u0000 \u001c*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u001d\u001cB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJG\u0010\u0017\u001a\u00020\u0014\"\n\b\u0002\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001e"}, m90084d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "", "keys", "values", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/r2;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/r2;)V", "self", "Lwg0/b;", "output", "Lvg0/f;", "serialDesc", "Ltg0/d;", "typeSerial0", "", "write$Self$savedstate_release", "(Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;Lwg0/b;Lvg0/f;Ltg0/d;)V", "write$Self", "Ljava/util/List;", "getKeys", "()Ljava/util/List;", "getValues", "Companion", "$serializer", "savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SuppressLint({"UnsafeOptInUsageError"})
    @InterfaceC44962o
    public static final class SparseArraySurrogate<T> {

        @JvmField
        @NotNull
        private static final InterfaceC45533f $cachedDescriptor;

        @NotNull
        private final List<Integer> keys;

        @NotNull
        private final List<T> values;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        @NotNull
        private static final Lazy<InterfaceC44951d<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: androidx.savedstate.serialization.serializers.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SparseArraySerializer.SparseArraySurrogate._childSerializers$_anonymous_();
            }
        }), null};

        /* JADX INFO: compiled from: BuiltInSerializer.android.kt */
        @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00070\u0005\"\u0004\b\u0002\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate$Companion;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/d;", "typeSerial0", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "serializer", "(Ltg0/d;)Ltg0/d;", "savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final <T> InterfaceC44951d<SparseArraySurrogate<T>> serializer(@NotNull InterfaceC44951d<T> typeSerial0) {
                Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
                return new SparseArraySerializer$SparseArraySurrogate$$serializer(typeSerial0);
            }
        }

        public /* synthetic */ SparseArraySurrogate(int i11, List list, List list2, C41876r2 c41876r2) {
            if (3 != (i11 & 3)) {
                C41801c2.m91514a(i11, 3, $cachedDescriptor);
            }
            this.keys = list;
            this.values = list2;
        }

        static {
            C41826h2 c41826h2 = new C41826h2("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            c41826h2.m91581o("keys", false);
            c41826h2.m91581o("values", false);
            $cachedDescriptor = c41826h2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SparseArraySurrogate(@NotNull List<Integer> keys, @NotNull List<? extends T> values) {
            Intrinsics.checkNotNullParameter(keys, "keys");
            Intrinsics.checkNotNullParameter(values, "values");
            this.keys = keys;
            this.values = values;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC44951d _childSerializers$_anonymous_() {
            return new C41813f(C41891v0.f92041a);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$savedstate_release(SparseArraySurrogate self, InterfaceC45829b output, InterfaceC45533f serialDesc, InterfaceC44951d typeSerial0) {
            output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.keys);
            output.encodeSerializableElement(serialDesc, 1, new C41813f(typeSerial0), self.values);
        }

        @NotNull
        public final List<Integer> getKeys() {
            return this.keys;
        }

        @NotNull
        public final List<T> getValues() {
            return this.values;
        }
    }

    public SparseArraySerializer(@NotNull InterfaceC44951d<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        InterfaceC44951d<SparseArraySurrogate<T>> interfaceC44951dSerializer = SparseArraySurrogate.INSTANCE.serializer(elementSerializer);
        this.surrogateSerializer = interfaceC44951dSerializer;
        this.descriptor = interfaceC44951dSerializer.getDescriptor();
    }

    @Override // tg0.InterfaceC44949c
    @NotNull
    public SparseArray<T> deserialize(@NotNull InterfaceC41787b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SparseArraySurrogate sparseArraySurrogate = (SparseArraySurrogate) decoder.decodeSerializableValue(this.surrogateSerializer);
        if (sparseArraySurrogate.getKeys().size() != sparseArraySurrogate.getValues().size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SparseArray<T> sparseArray = new SparseArray<>(sparseArraySurrogate.getKeys().size());
        int size = sparseArraySurrogate.getKeys().size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.append(sparseArraySurrogate.getKeys().get(i11).intValue(), sparseArraySurrogate.getValues().get(i11));
        }
        return sparseArray;
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return this.descriptor;
    }

    @Override // tg0.InterfaceC44963p
    public void serialize(@NotNull InterfaceC45830c encoder, @NotNull SparseArray<T> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(Integer.valueOf(value.keyAt(i11)));
        }
        int size2 = value.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList2.add(value.valueAt(i12));
        }
        encoder.encodeSerializableValue(this.surrogateSerializer, new SparseArraySurrogate(arrayList, arrayList2));
    }
}
