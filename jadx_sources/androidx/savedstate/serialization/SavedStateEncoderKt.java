package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MagicApiIntrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KType;
import tg0.C44971x;
import tg0.InterfaceC44963p;
import yg0.AbstractC46494a;

/* JADX INFO: compiled from: SavedStateEncoder.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, m90084d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "value", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "configuration", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "encodeToSavedState", "(Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;)Landroid/os/Bundle;", "Ltg0/p;", "serializer", "(Ltg0/p;Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;)Landroid/os/Bundle;", "savedstate_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateEncoder.kt\nandroidx/savedstate/serialization/SavedStateEncoderKt\n+ 2 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,281:1\n27#2:282\n46#2:283\n32#2,4:284\n31#2,7:294\n126#3:288\n153#3,3:289\n37#4,2:292\n1#5:301\n106#6:302\n46#7:303\n*S KotlinDebug\n*F\n+ 1 SavedStateEncoder.kt\nandroidx/savedstate/serialization/SavedStateEncoderKt\n*L\n67#1:282\n67#1:283\n67#1:284,4\n67#1:294,7\n67#1:288\n67#1:289,3\n67#1:292,2\n67#1:301\n67#1:302\n67#1:303\n*E\n"})
public final class SavedStateEncoderKt {
    @JvmOverloads
    @NotNull
    public static final <T> Bundle encodeToSavedState(@NotNull InterfaceC44963p<? super T> serializer, @NotNull T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(value, "value");
        return encodeToSavedState$default(serializer, value, null, 4, null);
    }

    public static /* synthetic */ Bundle encodeToSavedState$default(Object value, SavedStateConfiguration configuration, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            configuration = SavedStateConfiguration.DEFAULT;
        }
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        AbstractC46494a serializersModule = configuration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToSavedState(C44971x.serializer(serializersModule, (KType) null), value, configuration);
    }

    public static final /* synthetic */ <T> Bundle encodeToSavedState(T value, SavedStateConfiguration configuration) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        AbstractC46494a serializersModule = configuration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToSavedState(C44971x.serializer(serializersModule, (KType) null), value, configuration);
    }

    @JvmOverloads
    @NotNull
    public static final <T> Bundle encodeToSavedState(@NotNull InterfaceC44963p<? super T> serializer, @NotNull T value, @NotNull SavedStateConfiguration configuration) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.m90091to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m103675constructorimpl(bundleBundleOf);
        new SavedStateEncoder(bundleBundleOf, configuration).encodeSerializableValue(serializer, value);
        return bundleBundleOf;
    }

    public static /* synthetic */ Bundle encodeToSavedState$default(InterfaceC44963p interfaceC44963p, Object obj, SavedStateConfiguration savedStateConfiguration, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return encodeToSavedState(interfaceC44963p, obj, savedStateConfiguration);
    }
}
