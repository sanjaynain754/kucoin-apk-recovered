package tg0;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Type;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MagicApiIntrinsics;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KClassifier;
import p852kotlin.reflect.KType;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: tg0.x */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"tg0/y", "tg0/b0"}, m90084d2 = {}, m90085k = 4, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C44971x {
    public static final /* synthetic */ <T> InterfaceC44951d<T> serializer() {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return (InterfaceC44951d<T>) serializer((KType) null);
    }

    @NotNull
    public static final InterfaceC44951d<Object> serializer(@NotNull Type type) {
        return C44972y.serializer(type);
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC44951d<?> m99436a(@NotNull AbstractC46494a abstractC46494a, @NotNull KClass<?> kClass) {
        return C44948b0.m99398e(abstractC46494a, kClass);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final InterfaceC44951d<? extends Object> m99437b(@NotNull KClass<Object> kClass, @NotNull List<? extends InterfaceC44951d<Object>> list, @NotNull Function0<? extends KClassifier> function0) {
        return C44948b0.m99400g(kClass, list, function0);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC44951d<T> m99438c(@NotNull KClass<T> kClass) {
        return C44948b0.m99405l(kClass);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final InterfaceC44951d<Object> m99439d(@NotNull AbstractC46494a abstractC46494a, @NotNull Type type) {
        return C44972y.m99447f(abstractC46494a, type);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final InterfaceC44951d<Object> m99440e(@NotNull AbstractC46494a abstractC46494a, @NotNull KType kType) {
        return C44948b0.m99406m(abstractC46494a, kType);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final List<InterfaceC44951d<Object>> m99441f(@NotNull AbstractC46494a abstractC46494a, @NotNull List<? extends KType> list, boolean z11) {
        return C44948b0.m99407n(abstractC46494a, list, z11);
    }

    @NotNull
    public static final <T> InterfaceC44951d<T> serializer(@NotNull KClass<T> kClass) {
        return C44948b0.serializer(kClass);
    }

    @NotNull
    public static final InterfaceC44951d<Object> serializer(@NotNull KClass<?> kClass, @NotNull List<? extends InterfaceC44951d<?>> list, boolean z11) {
        return C44948b0.serializer(kClass, list, z11);
    }

    @NotNull
    public static final InterfaceC44951d<Object> serializer(@NotNull KType kType) {
        return C44948b0.serializer(kType);
    }

    public static final /* synthetic */ <T> InterfaceC44951d<T> serializer(AbstractC46494a abstractC46494a) {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (InterfaceC44951d<T>) serializer(abstractC46494a, (KType) null);
    }

    @NotNull
    public static final InterfaceC44951d<Object> serializer(@NotNull AbstractC46494a abstractC46494a, @NotNull Type type) {
        return C44972y.serializer(abstractC46494a, type);
    }

    @NotNull
    public static final InterfaceC44951d<Object> serializer(@NotNull AbstractC46494a abstractC46494a, @NotNull KClass<?> kClass, @NotNull List<? extends InterfaceC44951d<?>> list, boolean z11) {
        return C44948b0.serializer(abstractC46494a, kClass, list, z11);
    }

    @NotNull
    public static final InterfaceC44951d<Object> serializer(@NotNull AbstractC46494a abstractC46494a, @NotNull KType kType) {
        return C44948b0.serializer(abstractC46494a, kType);
    }
}
