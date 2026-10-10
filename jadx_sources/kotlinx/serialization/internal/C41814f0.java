package kotlinx.serialization.internal;

import com.tencent.bugly.proguard.C33612dh;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vg0.AbstractC45541n;
import vg0.AbstractC45542o;
import vg0.C45537j;
import vg0.C45540m;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.f0 */
/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m90084d2 = {"Lkotlinx/serialization/internal/f0;", "Lkotlinx/serialization/internal/h2;", "", "name", "", "elementsCount", "<init>", "(Ljava/lang/String;I)V", "index", "Lvg0/f;", "d", "(I)Lvg0/f;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "Lvg0/n;", "m", "Lvg0/n;", "getKind", "()Lvg0/n;", C33612dh.f69618m, "", "n", "Lkotlin/Lazy;", "B", "()[Lvg0/f;", "elementDescriptors", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n16#2:149\n160#3:150\n1797#4,3:151\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n*L\n28#1:149\n46#1:150\n46#1:151,3\n*E\n"})
public final class C41814f0 extends C41826h2 {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final AbstractC45541n kind;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Lazy elementDescriptors;

    @Override // kotlinx.serialization.internal.C41826h2
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof InterfaceC45533f)) {
            return false;
        }
        InterfaceC45533f interfaceC45533f = (InterfaceC45533f) other;
        return interfaceC45533f.getKind() == AbstractC45541n.b.f102629a && Intrinsics.areEqual(getSerialName(), interfaceC45533f.getSerialName()) && Intrinsics.areEqual(C41796b2.m91496a(this), C41796b2.m91496a(interfaceC45533f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41814f0(@NotNull final String name, final int i11) {
        super(name, null, i11, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
        this.kind = AbstractC45541n.b.f102629a;
        this.elementDescriptors = LazyKt.lazy(new Function0() { // from class: kotlinx.serialization.internal.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C41814f0.m91541A(i11, name, this);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static final InterfaceC45533f[] m91541A(int i11, String str, C41814f0 c41814f0) {
        InterfaceC45533f[] interfaceC45533fArr = new InterfaceC45533f[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC45533fArr[i12] = C45540m.m100548i(str + '.' + c41814f0.mo91527f(i12), AbstractC45542o.d.f102633a, new InterfaceC45533f[0], null, 8, null);
        }
        return interfaceC45533fArr;
    }

    /* JADX INFO: renamed from: B */
    public final InterfaceC45533f[] m91543B() {
        return (InterfaceC45533f[]) this.elementDescriptors.getValue();
    }

    @Override // kotlinx.serialization.internal.C41826h2, vg0.InterfaceC45533f
    @NotNull
    public AbstractC45541n getKind() {
        return this.kind;
    }

    @Override // kotlinx.serialization.internal.C41826h2, vg0.InterfaceC45533f
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC45533f mo91525d(int index) {
        return m91543B()[index];
    }

    @Override // kotlinx.serialization.internal.C41826h2
    public int hashCode() {
        int iHashCode;
        int iHashCode2 = getSerialName().hashCode();
        int i11 = 1;
        for (String str : C45537j.m100537b(this)) {
            int i12 = i11 * 31;
            if (str != null) {
                iHashCode = str.hashCode();
            } else {
                iHashCode = 0;
            }
            i11 = i12 + iHashCode;
        }
        return (iHashCode2 * 31) + i11;
    }

    @Override // kotlinx.serialization.internal.C41826h2
    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(C45537j.m100537b(this), ", ", getSerialName() + '(', ")", 0, null, null, 56, null);
    }
}
