package androidx.savedstate.serialization;

import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.SizeFSerializer;
import androidx.savedstate.serialization.serializers.SizeSerializer;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.util.List;
import kotlinx.serialization.modules.C41967c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44951d;
import yg0.AbstractC46494a;

/* JADX INFO: compiled from: SavedStateConfig.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"Lyg0/a;", "getDefaultSerializersModuleOnPlatform", "()Lyg0/a;", "savedstate_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateConfig.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateConfig.android.kt\nandroidx/savedstate/serialization/SavedStateConfig_androidKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,33:1\n31#2,2:34\n243#2:36\n243#2:37\n33#2:38\n*S KotlinDebug\n*F\n+ 1 SavedStateConfig.android.kt\nandroidx/savedstate/serialization/SavedStateConfig_androidKt\n*L\n26#1:34,2\n27#1:36\n28#1:37\n26#1:38\n*E\n"})
public final class SavedStateConfig_androidKt {
    @NotNull
    public static final AbstractC46494a getDefaultSerializersModuleOnPlatform() {
        C41967c c41967c = new C41967c();
        c41967c.mo91989b(Reflection.getOrCreateKotlinClass(Size.class), SizeSerializer.INSTANCE);
        c41967c.mo91989b(Reflection.getOrCreateKotlinClass(SizeF.class), SizeFSerializer.INSTANCE);
        c41967c.mo91992e(Reflection.getOrCreateKotlinClass(SparseArray.class), new Function1() { // from class: androidx.savedstate.serialization.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SavedStateConfig_androidKt.getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0((List) obj);
            }
        });
        return c41967c.m92035f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC44951d getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0(List argSerializers) {
        Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        return new SparseArraySerializer((InterfaceC44951d) CollectionsKt.first(argSerializers));
    }
}
