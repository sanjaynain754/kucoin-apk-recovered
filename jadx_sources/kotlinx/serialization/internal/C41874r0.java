package kotlinx.serialization.internal;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.r0 */
/* JADX INFO: compiled from: InlineClassDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lkotlinx/serialization/internal/r0;", "Lkotlinx/serialization/internal/h2;", "", "name", "Lkotlinx/serialization/internal/m0;", "generatedSerializer", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/m0;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "m", "Z", "isInline", "()Z", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nInlineClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n+ 2 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,44:1\n111#2,10:45\n*S KotlinDebug\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n*L\n22#1:45,10\n*E\n"})
public final class C41874r0 extends C41826h2 {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final boolean isInline;

    @Override // kotlinx.serialization.internal.C41826h2
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41874r0)) {
            return false;
        }
        InterfaceC45533f interfaceC45533f = (InterfaceC45533f) other;
        if (!Intrinsics.areEqual(getSerialName(), interfaceC45533f.getSerialName())) {
            return false;
        }
        C41874r0 c41874r0 = (C41874r0) other;
        if (!c41874r0.getIsInline() || !Arrays.equals(m91584t(), c41874r0.m91584t()) || getElementsCount() != interfaceC45533f.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i11 = 0; i11 < elementsCount; i11++) {
            if (!Intrinsics.areEqual(mo91525d(i11).getSerialName(), interfaceC45533f.mo91525d(i11).getSerialName()) || !Intrinsics.areEqual(mo91525d(i11).getKind(), interfaceC45533f.mo91525d(i11).getKind())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41874r0(@NotNull String name, @NotNull InterfaceC41849m0<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.isInline = true;
    }

    @Override // kotlinx.serialization.internal.C41826h2, vg0.InterfaceC45533f
    /* JADX INFO: renamed from: isInline, reason: from getter */
    public boolean getIsInline() {
        return this.isInline;
    }

    @Override // kotlinx.serialization.internal.C41826h2
    public int hashCode() {
        return super.hashCode() * 31;
    }
}
