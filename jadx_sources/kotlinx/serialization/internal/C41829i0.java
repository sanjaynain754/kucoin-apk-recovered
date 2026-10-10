package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.annotation.Annotation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: kotlinx.serialization.internal.i0 */
/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0005\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aq\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00040\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "serialName", "", "values", "Ltg0/d;", "b", "(Ljava/lang/String;[Ljava/lang/Enum;)Ltg0/d;", "names", "", "entryAnnotations", "classAnnotations", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ltg0/d;", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,148:1\n13474#2,2:149\n13409#2,2:151\n13476#2:153\n13409#2,2:154\n13474#2,2:156\n13409#2,2:158\n13476#2:160\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumsKt\n*L\n68#1:149,2\n71#1:151,2\n68#1:153\n88#1:154,2\n91#1:156,2\n94#1:158,2\n91#1:160\n*E\n"})
public final class C41829i0 {
    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T extends Enum<T>> InterfaceC44951d<T> m91591a(@NotNull String serialName, @NotNull T[] values, @NotNull String[] names, @NotNull Annotation[][] entryAnnotations, @Nullable Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        C41814f0 c41814f0 = new C41814f0(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                c41814f0.m91586w(annotation);
            }
        }
        int length = values.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            T t11 = values[i11];
            int i13 = i12 + 1;
            String strName = (String) ArraysKt.getOrNull(names, i12);
            if (strName == null) {
                strName = t11.name();
            }
            C41826h2.m91575p(c41814f0, strName, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) ArraysKt.getOrNull(entryAnnotations, i12);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    c41814f0.m91585v(annotation2);
                }
            }
            i11++;
            i12 = i13;
        }
        return new C41824h0(serialName, values, c41814f0);
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T extends Enum<T>> InterfaceC44951d<T> m91592b(@NotNull String serialName, @NotNull T[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        return new C41824h0(serialName, values);
    }
}
