package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import tg0.InterfaceC44963p;
import vg0.AbstractC45532e;
import vg0.AbstractC45541n;
import vg0.InterfaceC45533f;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.a1 */
/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u0018\u0010\r\u001a\u00020\n*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "value", "Ltg0/p;", "serializer", "Lkotlinx/serialization/json/JsonElement;", "d", "(Lxg0/a;Ljava/lang/Object;Ltg0/p;)Lkotlinx/serialization/json/JsonElement;", "Lvg0/f;", "", "c", "(Lvg0/f;)Z", "requiresTopLevelTag", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41913a1 {
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> JsonElement m91856d(@NotNull AbstractC46162a json, T t11, @NotNull InterfaceC44963p<? super T> serializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new C41934k0(json, new Function1() { // from class: kotlinx.serialization.json.internal.z0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41913a1.m91857e(objectRef, (JsonElement) obj);
            }
        }).encodeSerializableValue(serializer, t11);
        T t12 = objectRef.element;
        if (t12 != null) {
            return (JsonElement) t12;
        }
        Intrinsics.throwUninitializedPropertyAccessException(DbParams.KEY_CHANNEL_RESULT);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final Unit m91857e(Ref.ObjectRef objectRef, JsonElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        objectRef.element = it;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m91855c(InterfaceC45533f interfaceC45533f) {
        if (!(interfaceC45533f.getKind() instanceof AbstractC45532e) && interfaceC45533f.getKind() != AbstractC45541n.b.f102629a) {
            return false;
        }
        return true;
    }
}
