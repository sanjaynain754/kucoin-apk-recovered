package coil.memory;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import coil.size.Size;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MemoryCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m90084d2 = {"coil/memory/MemoryCache$Key", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "Complex", "Simple", "Lcoil/memory/MemoryCache$Key$Simple;", "Lcoil/memory/MemoryCache$Key$Complex;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public abstract class MemoryCache$Key implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: MemoryCache.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcoil/memory/MemoryCache$Key$Companion;", "", "()V", "invoke", "Lcoil/memory/MemoryCache$Key;", "value", "", "create", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final MemoryCache$Key create(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Simple(value);
        }
    }

    /* JADX INFO: compiled from: MemoryCache.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m90084d2 = {"Lcoil/memory/MemoryCache$Key$Complex;", "Lcoil/memory/MemoryCache$Key;", TtmlNode.RUBY_BASE, "", "transformations", "", "size", "Lcoil/size/Size;", "parameters", "", "(Ljava/lang/String;Ljava/util/List;Lcoil/size/Size;Ljava/util/Map;)V", "getBase", "()Ljava/lang/String;", "getParameters", "()Ljava/util/Map;", "getSize", "()Lcoil/size/Size;", "getTransformations", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final /* data */ class Complex extends MemoryCache$Key {

        @NotNull
        public static final Parcelable.Creator<Complex> CREATOR = new C5042a();

        @NotNull
        private final String base;

        @NotNull
        private final Map<String, String> parameters;

        @Nullable
        private final Size size;

        @NotNull
        private final List<String> transformations;

        /* JADX INFO: renamed from: coil.memory.MemoryCache$Key$Complex$a */
        /* JADX INFO: compiled from: MemoryCache.kt */
        @Metadata(m90085k = 3, m90086mv = {1, 5, 1}, m90088xi = 48)
        public static final class C5042a implements Parcelable.Creator<Complex> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Complex[] newArray(int i11) {
                return new Complex[i11];
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Complex createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                Size size = (Size) parcel.readParcelable(Complex.class.getClassLoader());
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new Complex(string, arrayListCreateStringArrayList, size, linkedHashMap);
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complex)) {
                return false;
            }
            Complex complex = (Complex) other;
            return Intrinsics.areEqual(this.base, complex.base) && Intrinsics.areEqual(this.transformations, complex.transformations) && Intrinsics.areEqual(this.size, complex.size) && Intrinsics.areEqual(this.parameters, complex.parameters);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complex(@NotNull String base, @NotNull List<String> transformations, @Nullable Size size, @NotNull Map<String, String> parameters) {
            super(null);
            Intrinsics.checkNotNullParameter(base, "base");
            Intrinsics.checkNotNullParameter(transformations, "transformations");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.base = base;
            this.transformations = transformations;
            this.size = size;
            this.parameters = parameters;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Complex copy$default(Complex complex, String str, List list, Size size, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = complex.base;
            }
            if ((i11 & 2) != 0) {
                list = complex.transformations;
            }
            if ((i11 & 4) != 0) {
                size = complex.size;
            }
            if ((i11 & 8) != 0) {
                map = complex.parameters;
            }
            return complex.copy(str, list, size, map);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBase() {
            return this.base;
        }

        @NotNull
        public final List<String> component2() {
            return this.transformations;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        @NotNull
        public final Map<String, String> component4() {
            return this.parameters;
        }

        @NotNull
        public final Complex copy(@NotNull String base, @NotNull List<String> transformations, @Nullable Size size, @NotNull Map<String, String> parameters) {
            Intrinsics.checkNotNullParameter(base, "base");
            Intrinsics.checkNotNullParameter(transformations, "transformations");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            return new Complex(base, transformations, size, parameters);
        }

        @NotNull
        public final String getBase() {
            return this.base;
        }

        @NotNull
        public final Map<String, String> getParameters() {
            return this.parameters;
        }

        @Nullable
        public final Size getSize() {
            return this.size;
        }

        @NotNull
        public final List<String> getTransformations() {
            return this.transformations;
        }

        public int hashCode() {
            int iHashCode = ((this.base.hashCode() * 31) + this.transformations.hashCode()) * 31;
            Size size = this.size;
            return ((iHashCode + (size == null ? 0 : size.hashCode())) * 31) + this.parameters.hashCode();
        }

        @NotNull
        public String toString() {
            return "Complex(base=" + this.base + ", transformations=" + this.transformations + ", size=" + this.size + ", parameters=" + this.parameters + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.base);
            parcel.writeStringList(this.transformations);
            parcel.writeParcelable(this.size, flags);
            Map<String, String> map = this.parameters;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    /* JADX INFO: compiled from: MemoryCache.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m90084d2 = {"Lcoil/memory/MemoryCache$Key$Simple;", "Lcoil/memory/MemoryCache$Key;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final /* data */ class Simple extends MemoryCache$Key {

        @NotNull
        public static final Parcelable.Creator<Simple> CREATOR = new C5043a();

        @NotNull
        private final String value;

        /* JADX INFO: renamed from: coil.memory.MemoryCache$Key$Simple$a */
        /* JADX INFO: compiled from: MemoryCache.kt */
        @Metadata(m90085k = 3, m90086mv = {1, 5, 1}, m90088xi = 48)
        public static final class C5043a implements Parcelable.Creator<Simple> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Simple[] newArray(int i11) {
                return new Simple[i11];
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Simple createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Simple(parcel.readString());
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Simple) && Intrinsics.areEqual(this.value, ((Simple) other).value);
        }

        public static /* synthetic */ Simple copy$default(Simple simple, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = simple.value;
            }
            return simple.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "Simple(value=" + this.value + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Simple(@NotNull String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @NotNull
        public final Simple copy(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Simple(value);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.value);
        }
    }

    public /* synthetic */ MemoryCache$Key(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MemoryCache$Key() {
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final MemoryCache$Key create(@NotNull String str) {
        return INSTANCE.create(str);
    }
}
