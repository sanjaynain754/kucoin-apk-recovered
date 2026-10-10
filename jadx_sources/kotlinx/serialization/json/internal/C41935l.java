package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArrayDeque;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.l */
/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lkotlinx/serialization/json/internal/l;", "", "<init>", "()V", "", "size", "", "b", "(I)[C", "array", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([C)V", "Lkotlin/collections/ArrayDeque;", "Lkotlin/collections/ArrayDeque;", "arrays", "I", "charsTotal", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/CharArrayPoolBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public class C41935l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ArrayDeque<char[]> arrays = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int charsTotal;

    @NotNull
    /* JADX INFO: renamed from: b */
    public final char[] m91956b(int size) {
        char[] cArrRemoveLastOrNull;
        synchronized (this) {
            cArrRemoveLastOrNull = this.arrays.removeLastOrNull();
            if (cArrRemoveLastOrNull != null) {
                this.charsTotal -= cArrRemoveLastOrNull.length;
            } else {
                cArrRemoveLastOrNull = null;
            }
        }
        return cArrRemoveLastOrNull == null ? new char[size] : cArrRemoveLastOrNull;
    }

    /* JADX INFO: renamed from: a */
    public final void m91955a(@NotNull char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                if (this.charsTotal + array.length < C41931j.f92118a) {
                    this.charsTotal += array.length;
                    this.arrays.addLast(array);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
